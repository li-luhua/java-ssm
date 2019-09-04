$(function()
{
    //重置当前表单
    $('#resetForm').click(function()
	{
    	$("form:eq(0)").data('bootstrapValidator').resetForm();
	});

    //点击展示页面添加按钮触发事件
    $('[name="vehicle/person/create.jsp"]').click(function()
    {
        var Mid=this.value;
        var url = $(this).attr('name');
        document.location.href=root+'view/'+url+'?Mid='+Mid;
    });

    //查看人员信息
    $('[name="motorcade/queryPerson.do"]').click(function()
    {
        var id=this.value;
        var html='<input type="hidden2" name="id" value="'+id+'"/>';
        $('#person').html(html);
        var url = root+$(this).attr('name');
        $("#searchForm").attr('action', url).submit();
    });
});