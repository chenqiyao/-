/**
 * Created by 陈齐尧 on 2019/1/20.
 */
$(function () {
    showALL();
});
//展示数据
function showALL() {
    $.ajax({
        url:"/selectAll.do",
        type:"post",
        dataType:"json",
        data:{},
        async:true,
        success:function (obj) {
            //控制台打印
            console.log(obj);
            //拼接数据
            $("#show").html("");
            $.each(obj,function (i) {
            var str="<tr>";
                str+="<td>"+obj[i].houseId+"</td>";
                str+="<td>"+obj[i].houseDesc+"</td>";
                str+="<td><a href='index.html?type="+obj[i].typeId+"'>"+obj[i].typeName+"</a></td>";
                str+="<td>"+obj[i].monthlyRent+"</td>";
                str+="<td>"+obj[i].publishDate+"</td>";
                str+="<tr>";
            $("#show").append(str)
            });
        },
        error:function () {
            alert("error")
        }
    })
}

