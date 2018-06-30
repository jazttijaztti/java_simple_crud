package bms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 書籍管理システムにおける書籍登録機能に関する処理をおこなうサーブレットクラス
 */
public class InsertServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		// ListServletに遷移する
		request.getRequestDispatcher("/list").forward(request, response);

	}
}
