package com.gmail.jr08102000.KnightCraft.configuration;


public class configMain extends configLoader {

	private static configMain instance;

	private configMain() {
		super("主設定檔案.yml");
		validateKeys();
	}

	public static configMain getInstance() {
		if (instance == null) {
			instance = new configMain();
		}

		return instance;
	}

	protected boolean validateKeys() {
		return true;
	}

	protected void loadKeys() {
	}

}
