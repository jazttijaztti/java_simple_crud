<%@page contentType="text/html; charset=Windows-31J"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>書籍登録ページ | 書籍管理システム</title>
</head>
<body>
	<div id="container">
		<header class="clearfix">
			<div class="title">
				<h1>書籍管理システム</h1>
			</div>
			<div class="search">
				<form action="/bmsweb/search">
					<p class="keyword">
						<input type="text" name="title" placeholder="検索したい書籍タイトルを入力" value="">
					</p>
					<p class="submit">
						<input type="submit" value="検索">
					</p>
				</form>
			</div>
		</header>

		<nav id="menu">
			<ul class="clearfix">
				<li><a href="/bmsweb/list">書籍一覧</a></li>
				<li class="active"><a href="/bmsweb/view/insert.jsp">書籍登録</a></li>
			</ul>
		</nav>

		<h2>書籍登録</h2>
		<div id="insert">
			<form action="/bmsweb/insert" method="post">
				<table>
					<tr>
						<th>ISBN</th>
						<td><input type="text" name="isbn" value=""></td>
					</tr>
					<tr>
						<th>TITLE</th>
						<td><input type="text" name="title" value=""></td>
					</tr>
					<tr>
						<th>価格</th>
						<td><input type="text" name="price" value=""></td>
					</tr>
				</table>
				<input type="submit" value="登録" class="button">
			</form>
		</div>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>