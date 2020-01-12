package ma.itab.reddit.web;

import ma.itab.reddit.core.Post;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.getOutputStream().println("welcome to my blog");*/
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("jack","it's my first post",300));
        posts.add(new Post("omar","what a wonderful world",150));
        req.setAttribute("posts",posts);
        req.getRequestDispatcher("jsp/homePage.jsp").forward(req,resp);
    }
}
