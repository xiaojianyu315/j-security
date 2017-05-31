<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div id="<%=request.getParameter("pageDomId")%>" style="text-align: right"></div>
<script>
    laypage({
        cont: $('#<%=request.getParameter("pageDomId")%>'), //容器。值支持id名、原生dom对象，jquery对象,
        pages: ${pageObj.totalPage}, //总页数
        curr : ${pageObj.pageNumber},
        skip: true, //是否开启跳页
        //skin: '#AF0000',
        groups: 5, //连续显示分页数
        jump: function(e, first){ //触发分页后的回调
            if(!first){ //一定要加此判断，否则初始时会无限刷新
                var callback = "<%=request.getParameter("jumpFunc")%>("+e.curr+")";
                eval(callback);
            }
        }
    });
</script>
