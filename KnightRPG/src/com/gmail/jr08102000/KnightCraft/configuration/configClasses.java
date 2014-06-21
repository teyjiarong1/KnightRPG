package com.gmail.jr08102000.KnightCraft.configuration;

public class configClasses extends configLoader
{
  private static configClasses instance;

  private configClasses()
  {
    super("職業.yml");
    loadKeys();
  }

  public static configClasses getInstance()
  {
    if (instance == null)
    {
      instance = new configClasses();
    }

    return instance;
  }

  protected void loadKeys()
  {
  }
}