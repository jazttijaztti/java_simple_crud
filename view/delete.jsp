<%@page contentType="text/html; charset=Windows-31J"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>���Ѝ폜���y�[�W | ���ЊǗ��V�X�e��</title>
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

		<h2>���Ѝ폜</h2>
		<div id="delete">
			<p>ISBN�ԍ�0001�̏��Џ����폜���܂����B</p>
		</div>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>