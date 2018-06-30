<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="bms.Book;"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>���ЕύX�y�[�W | ���ЊǗ��V�X�e��</title>
</head>
<body>
	<div id="container">
		<header class="clearfix">
			<div class="title">
				<h1>���ЊǗ��V�X�e��</h1>
			</div>
			<div class="search">
				<form action="/bmsweb/search">
					<p class="keyword">
						<input type="text" name="title" placeholder="�������������Ѓ^�C�g�������" value="">
					</p>
					<p class="submit">
						<input type="submit" value="����">
					</p>
				</form>
			</div>
		</header>

		<nav id="menu">
			<ul class="clearfix">
				<li><a href="/bmsweb/list">���Јꗗ</a></li>
				<li><a href="/bmsweb/view/insert.jsp">���Гo�^</a></li>
			</ul>
		</nav>

		<h2>���ЕύX</h2>
		<div id="update">
			<form action="/bmsweb/update" method="post">
				<input type="hidden" name="isbn" value="0001">
				<table>
					<tr>
						<th width="150"></th>
						<th width="200">�ύX�O���</th>
						<th width="200">�ύX����</th>
					</tr>
					<tr>
						<th>ISBN</th>
						<td>0001</td>
						<td>0001</td>
					</tr>
					<tr>
						<th>TITLE</th>
						<td>java</td>
						<td><input type="text" name="title" value=""></td>
					</tr>
					<tr>
						<th width="150">���i</th>
						<td>1001�~</td>
						<td><input type="text" name="price" value=""></td>
					</tr>
				</table>
				<input type="submit" value="�ύX����" class="button">
			</form>
		</div>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>