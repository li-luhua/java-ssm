<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>车队添加页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
		<link href="${path}/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path}/motorcade/save.do" method="post" class="form-horizontal" role="form">
                            <fieldset>
                                <legend>车队基本信息</legend>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="mot_name">车队名称</label>
                                    <div class="col-sm-4">
                                        <input id="mot_name" class="form-control" type="text" name="mot_name"/>
                                    </div>
                                    <label class="col-sm-2 control-label" for="ds_name">所属公司</label>
                                    <div class="col-sm-4">
                                        <select id="" name="mot_company" class="valid" style="height: 28px">
                                            <option value="1">湖南省
                                            <option value="2" selected>武汉
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="ds_host">传真</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" name="mot_fax"/>
                                    </div>
                                    <label class="col-sm-2 control-label" for="ds_name">电话</label>
                                    <div class="col-sm-4">
                                    <input class="form-control" type="text" name="mot_phone"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="ds_host">地址</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" name="mot_site"/>
                                    </div>
                                    <label class="col-sm-2 control-label" for="ds_name">备注</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" name="mot_remark"/>
                                    </div>
                                </div>
                        </fieldset>
                    <fieldset>
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="submit" value="提交" class="btn btn-primary"/>
                           	</div>
                           	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                           	</div>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/motorcade.js"></script>
</html>