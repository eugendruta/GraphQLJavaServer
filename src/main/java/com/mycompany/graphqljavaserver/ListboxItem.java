package com.mycompany.graphqljavaserver;

import java.util.List;

public class ListboxItem {

  private final int id;
  private final String wert;
  private final String description;

  public ListboxItem(int id, String wert, String description) {
    this.id = id;
    this.wert = wert;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public String getWert() {
    return wert;
  }

  public String getDescription() {
    return description;
  }
  
  
}
