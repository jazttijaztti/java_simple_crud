<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.ArrayList,bms.Book"%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/reset.css">
	<link rel="stylesheet" type="text/css" href="/bmsweb/css/main.css">
	<title>書籍一覧ページ | 書籍管理システム</title>
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
				<li class="active"><a href="/bmsweb/list">書籍一覧</a></li>
				<li><a href="/bmsweb/view/insert.jsp">書籍登録</a></li>
			</ul>
		</nav>

		<h2>書籍一覧</h2>
		<table>
			<tr>
				<th>ISBN番号</th>
				<th>書籍タイトル</th>
				<th>価格</th>
				<th>更新/削除</th>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0001">0001</a>
				</td>
				<td>java</td>
				<td>1001円</td>
				<td>
					<a href="/bmsweb/update?isbn=0001">更新</a>　
					<a href="/bmsweb/delete?isbn=0001">削除</a>
				</td>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0002">0002</a>
				</td>
				<td>c++</td>
				<td>1002円</td>
				<td>
					<a href="/bmsweb/update?isbn=0002">更新</a>　
					<a href="/bmsweb/delete?isbn=0002">削除</a>
				</td>
			</tr>

			<tr>
				<td>
					<a href="/bmsweb/detail?isbn=0003">0003</a>
				</td>
				<td>ruby</td>
				<td>1003円</td>
				<td>
					<a href="/bmsweb/update?isbn=0003">更新</a>　
					<a href="/bmsweb/delete?isbn=0003">削除</a>
				</td>
			</tr>

		</table>

		<footer>
			<p class="copyright">Copyright &copy all rights reserved.</p>
		</footer>
	</div>
</body>
</html>