<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>车队人员展示列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12" id="person_id">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">车队人员详细信息</div>
						<div>
							<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
						</div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>姓名</th>
					                <th>车队</th>
					                <th>职位</th>
									<th>家庭地址</th>
									<th>电话</th>
					                <th>修改</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
									<c:forEach var="i" items="${e.staffList}" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${i.id }"/></td>
						                <td>${i.name}</td>
						                <td>${e.mot_name}</td>
						                <td>${i.position}</td>
						                <td>${i.site}</td>
						                <td>${i.phone}</td>
										<td>
											<button type="button" class="btn btn-success" data-toggle="modal" value="${i.id}" name="person/load.do">
											<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
											</button>
										</td>
						            </tr>
									</c:forEach>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </div>
			     </form>
			</div>
		</div>
	</body>
    <script type="text/javascript" src="<%=path%>view/vehicle/person/js/person.js"></script>
</html>