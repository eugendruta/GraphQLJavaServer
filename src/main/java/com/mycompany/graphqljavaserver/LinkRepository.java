package com.mycompany.graphqljavaserver;

import java.util.ArrayList;
import java.util.List;

public class LinkRepository {

  private final List<Link> links;
  private final List<ListboxItem> listbox = new ArrayList<>();

  public LinkRepository() {
    links = new ArrayList<>();
    //add some links to start off with
    links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
    links.add(new Link("http://graphql.org/learn/", "The official docks"));

    //Listbox
    listbox.add(new ListboxItem(0, "wert 1", "description 1"));
    listbox.add(new ListboxItem(1, "wert 2", "description 2"));    
  }

  public List<Link> getAllLinks() {
    return links;
  }

  public void saveLink(Link link) {
    links.add(link);
  }

  public ListboxItem getListboxItem() {
    return listbox.get(0);
  }

  public List<ListboxItem> getListbox() {
    return listbox;
  }

  public void saveListbox(ListboxItem listboxitem) {
    listbox.add(listboxitem);
  }

}
