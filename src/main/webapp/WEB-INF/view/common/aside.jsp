<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<aside class="nav">
    <img src="<%=request.getContextPath()%>/resources/Img/melon_icon.png">
    <ul>
        <li><a href="/">멜론홈</a></li>
        <li><a href="/song/popular">인기차트</a></li>
        <li>
            <a href="/song/recente/song">최신음악</a>
            <ul>
                <li><a href="/song/recente/song">최신곡</a></li>
                <li><a href="/song/recente/album">최신앨범</a></li>
            </ul>
        </li>
        <li><a href="/genre/home">장르음악</a></li>
        <li><a href="/qna">Q&A</a></li>
        <li>
            <a href="/playlist/recente">마이뮤직</a>
            <ul>
                <li><a href="/playlist/recente">재생목록</a></li>
                <li><a href="/like/artist">팬맺음</a></li>
            </ul>
        </li>
        <li><a href="">구매목록</a></li>
    </ul>
</aside>