package io.opensemantics.semiotics.search.spi;

import java.util.List;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;

public interface SearchService {
  /**
   * 
   * @param search
   *          The item to be searched
   * @param previous
   *          Previous search results or null
   * @return A list of search results or an empty list if no results
   */
  List<SearchResult> search(Search search, List<SearchResult> previous);
}