$(function()
{
    var url = location.search; //获取url中"?"符后的字串
    var Mid = url.substring(5);
    var html='<input name="Mid" type="hidden2" value="'+Mid+'">';
    $('#create').html(html);

    //重置当前表单
    $('#resetForm').click(function()
	{
    	$("form:eq(0)").data('bootstrapValidator').resetForm();
	});

    //加载
    $('[name="person/load.do"]').click(function()
    {
        var id=this.value;
        var html='<input type="hidden2" name="id" value="'+id+'"/>';
        $('#person_id').html(html);
        var url = root+$(this).attr('name');
        $("#searchForm").attr('action', url).submit();
    });

});