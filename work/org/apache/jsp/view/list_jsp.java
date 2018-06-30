package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import bms.Book;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=Windows-31J");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

    // リクエストスコープから書籍リストを取得
    ArrayList<Book> bookList = (ArrayList<Book>)request.getAttribute("keyBookList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/bmsweb/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/bmsweb/css/main.css\">\r\n");
      out.write("\t<title>書籍一覧ページ | 書籍管理システム</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header class=\"clearfix\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h1>書籍管理システム</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<form action=\"/bmsweb/search\">\r\n");
      out.write("\t\t\t\t\t<p class=\"keyword\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"title\" placeholder=\"検索したい書籍タイトルを入力\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"検索\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<nav id=\"menu\">\r\n");
      out.write("\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/bmsweb/list\">書籍一覧</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/bmsweb/view/insert.jsp\">書籍登録</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>書籍一覧</h2>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>ISBN番号</th>\r\n");
      out.write("\t\t\t\t<th>書籍タイトル</th>\r\n");
      out.write("\t\t\t\t<th>価格</th>\r\n");
      out.write("\t\t\t\t<th>更新/削除</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

// 書籍リストから1行ずつデータを取得し表示
for (Book book: bookList) {

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>\r\n");
      out.write("        <a href=\"/bmsweb/detail?isbn=");
      out.print(book.getIsbn());
      out.write('"');
      out.write('>');
      out.print(book.getIsbn());
      out.write("</a>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>");
      out.print(book.getTitle());
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(book.getPrice());
      out.write("円</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <a href=\"/bmsweb/update?isbn=");
      out.print(book.getIsbn());
      out.write("\">更新</a>　\r\n");
      out.write("        <a href=\"/bmsweb/delete?isbn=");
      out.print(book.getIsbn());
      out.write("\">削除</a>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p class=\"copyright\">Copyright &copy all rights reserved.</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
