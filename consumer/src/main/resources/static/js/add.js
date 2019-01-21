/**
 * Created by 陈齐尧 on 2019/1/20.
 */
$(function () {
    loadOption();
});
function loadData() {
    var typeId=getLocationParam("typeId");
    //添加点击事件
    $("#submit").click(function () {
        //获取表单得值
        var houseDesc=$("#houseDesc").val();
        if(houseDesc==null){
            alert("房屋描述必填！")
        }
        var monthlyRent=$("#monthlyRent").val();
        if(monthlyRent==null){
            alert("租金格式错误！")
        }
        addData(typeId,houseDesc,monthlyRent)
    })
    //截取地址栏上的参数
    function getLocationParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        // alert(window.location.search);
        if (r != null) return unescape(r[2]); return null;
    }
}
//下拉框
function loadOption() {
    $.ajax({
        url:"/show.do",
        type:"POST",
        data:{},
        dateType:"json",
        async:true,
        success:function (obj) {
            console.log(obj);
            //拼接下拉列表
            $("#typeId").html("");
            var str="<option value='-1'>请选择</option>"
            $.each(obj,function (i) {
                str+="<option value='"+obj[i].id+"'>"+obj[i].typeName+"</option>"
            })
            $("#typeId").append(str);
        },
        error:function () {
            alert("option error");
        }
    })
}
//添加方法
function addData(typeId,houseDesc,monthlyRent) {
    $.ajax({
        url:"/insertAll.do",
        type:"post",
        dataType:"json",
        data:{"typeId":typeId,"houseDesc":houseDesc,"monthlyRent":monthlyRent},
        async:true,
        success:function (obj) {
            console.log(obj)
            if(obj>0){
                alert("保存成功！")
                location.href="index.html";
            }else {
                alert("保存失败！")
            }
        },
        error:function () {
            alert("error")
        }
    })
}