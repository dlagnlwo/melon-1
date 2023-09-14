package com.melon.controller.common;

import com.melon.dto.common.SearchDto;
import com.melon.service.common.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Log4j2
@Controller
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @GetMapping("/search")
    public String searchSongByName(@RequestParam String songName, Model model) {
        List<SearchDto> songs = searchService.findSongByName(songName);

        // 이미지 데이터를 각 곡에 추가
        for (SearchDto song : songs) {
            int albumId = song.getAlbumId(); // 앨범 ID를 얻어와서
            byte[] imageData = song.getAlbumImg(); // 이미지 데이터를 가져옵니다.
            song.setAlbumImg(imageData); // SearchDto에 이미지 데이터를 설정합니다.
        }

        model.addAttribute("songs", songs);
        log.info(songs);
        return "common/search";
    }

}
