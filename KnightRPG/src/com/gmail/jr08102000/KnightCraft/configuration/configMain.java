package com.gmail.jr08102000.KnightCraft.configuration;

public class configMain extends configLoader
{
  private static configMain instance;

  private configMain()
  {
    super("�D�]�w�ɮ�.yml");
    loadKeys();
  }

  public static configMain getInstance()
  {
    if (instance == null)
    {
      instance = new configMain();
    }

    return instance;
  }

  protected void loadKeys()
  {
  }
}