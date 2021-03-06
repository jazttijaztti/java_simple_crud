package bms;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 書籍管理システムにおける書籍一覧機能に関する処理をおこなうサーブレットクラス
 */
public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// JSPファイルに遷移する
		request.getRequestDispatcher("/view/list.jsp").forward(request, response);

	}
}
