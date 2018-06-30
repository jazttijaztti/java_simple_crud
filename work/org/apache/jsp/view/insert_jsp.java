package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/bmsweb/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/bmsweb/css/main.css\">\r\n");
      out.write("\t<title>èëê–ìoò^ÉyÅ[ÉW | èëê–ä«óùÉVÉXÉeÉÄ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header class=\"clearfix\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h1>èëê–ä«óùÉVÉXÉeÉÄ</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<form action=\"/bmsweb/search\">\r\n");
      out.write("\t\t\t\t\t<p class=\"keyword\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"title\" placeholder=\"åüçıÇµÇΩÇ¢èëê–É^ÉCÉgÉãÇì¸óÕ\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"åüçı\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<nav id=\"menu\">\r\n");
      out.write("\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/bmsweb/list\">èëê–àÍóó</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/bmsweb/view/insert.jsp\">èëê–ìoò^</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>èëê–ìoò^</h2>\r\n");
      out.write("\t\t<div id=\"insert\">\r\n");
      out.write("\t\t\t<form action=\"/bmsweb/insert\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>ISBN</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"isbn\" value=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>TITLE</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"title\" value=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>âøäi</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"price\" value=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"ìoò^\" class=\"button\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
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
