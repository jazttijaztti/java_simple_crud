<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.ArrayList,bms.Book"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>���Јꗗ�y�[�W | ���ЊǗ��V�X�e��</title>
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
				<li class="active"><a href="/bmsweb/list">���Јꗗ</a></li>
				<li><a href="/bmsweb/view/insert.jsp">���Гo�^</a></li>
			</ul>
		</nav>

		<h2>���Јꗗ</h2>
		<table>
			<tr>
				<th>ISBN�ԍ�</th>
				<th>���Ѓ^�C�g��</th>
				<th>���i</th>
				<th>�X�V/�폜</th>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0001">0001</a>
				</td>
				<td>java</td>
				<td>1001�~</td>
				<td>
					<a href="/bmsweb/update?isbn=0001">�X�V</a>�@
					<a href="/bmsweb/delete?isbn=0001">�폜</a>
				</td>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0002">0002</a>
				</td>
				<td>c++</td>
				<td>1002�~</td>
				<td>
					<a href="/bmsweb/update?isbn=0002">�X�V</a>�@
					<a href="/bmsweb/delete?isbn=0002">�폜</a>
				</td>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0003">0003</a>
				</td>
				<td>ruby</td>
				<td>1003�~</td>
				<td>
					<a href="/bmsweb/update?isbn=0003">�X�V</a>�@
					<a href="/bmsweb/delete?isbn=0003">�폜</a>
				</td>
			</tr>

		</table>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>