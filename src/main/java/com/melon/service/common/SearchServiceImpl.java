package com.melon.service.common;

import com.melon.dto.common.SearchDto;
import com.melon.repository.common.SearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final SearchRepository searchRepository;
    @Override
    public List<SearchDto> findSongByName(String songName){
        return searchRepository.searchSong(songName);
    }
}
