package com.melon.service.common;

import com.melon.dto.common.SearchDto;
import java.util.List;

public interface SearchService {
    List<SearchDto> findSongByName(String songName);
}
