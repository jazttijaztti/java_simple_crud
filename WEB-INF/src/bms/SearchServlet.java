package bms;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * ���ЊǗ��V�X�e���ɂ����鏑�Ќ����@�\�Ɋւ��鏈���������Ȃ��T�[�u���b�g�N���X
 */
public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// JSP�t�@�C���ɑJ�ڂ���
		request.getRequestDispatcher("/view/list.jsp").forward(request, response);

	}
}
