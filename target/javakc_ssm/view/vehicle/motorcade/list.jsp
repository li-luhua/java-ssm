<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>车队展示列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12" id="person">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">车队详细信息</div>
	                <div class="col-sm-8">
	                	<div class="btn-group hidden-xs" role="group">
                			<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="vehicle/motorcade/create.jsp">
	                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
	                        </button>
	                        <button type="button" class="btn btn-success" data-toggle="modal" id="update" name="motorcade/load.do">
	                            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
	                        </button>
	                        <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="motorcade/delete.do">
	                            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
	                        </button>

		                 </div>
	                </div>
	                <div class="col-sm-4">
	                	<input class="form-control" id="search" name="dataName" value="${entity.dataName }" type="text" placeholder="查询内容 回车搜索"/>
	                </div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>车队名称</th>
					                <th>车队公司</th>
					                <th>传真</th>
					                <th>电话</th>
					                <th>地址</th>
					                <th>查看车队人员</th>
                                    <th>添加车队人员</th>
                                    <th>车队信息</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.id }"/></td>
						                <td>${e.mot_name}</td>
						                <td>${e.mot_company}</td>
						                <td>${e.mot_fax}</td>
						                <td>${e.mot_phone}</td>
						                <td>${e.mot_site}</td>
                                        <td>
                                            <button type="button" class="btn btn-info" data-toggle="modal"  name="motorcade/queryPerson.do" value="${e.id}">
                                                <i class="glyphicon glyphicon-file" aria-hidden="true"></i>查看车队人员
                                            </button>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-primary" data-toggle="modal" value="${e.id}" name="vehicle/person/create.jsp" >
                                                <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加车队人员
                                            </button>
                                        </td>
                                        <td>
                                        <button type="button" class="btn btn-info" data-toggle="modal" id="queryAll" name="motorcade/delete.do">
                                            <i class="glyphicon glyphicon-file" aria-hidden="true"></i>车队信息
                                        </button>
                                        </td>
						            </tr>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </div>
			     </form>
			</div>
		</div>
	</body>
    <script type="text/javascript" src="<%=path%>view/vehicle/motorcade/js/motorcade.js"></script>
</html>