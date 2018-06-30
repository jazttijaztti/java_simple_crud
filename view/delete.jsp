<%@page contentType="text/html; charset=Windows-31J"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>書籍削除情報ページ | 書籍管理システム</title>
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
				<li><a href="/bmsweb/view/insert.jsp">書籍登録</a></li>
			</ul>
		</nav>

		<h2>書籍削除</h2>
		<div id="delete">
			<p>ISBN番号0001の書籍情報を削除しました。</p>
		</div>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>