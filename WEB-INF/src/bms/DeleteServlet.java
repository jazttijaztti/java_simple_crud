package bms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 書籍管理システムにおける書籍削除機能に関する処理をおこなうサーブレットクラス
 */
public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// JSPファイルに遷移する
		request.getRequestDispatcher("/view/delete.jsp").forward(request, response);

	}
}
