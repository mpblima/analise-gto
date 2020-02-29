package br.com.sulamerica.odonto.gto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public final class QueryRol {

	private static Map<String, String> rol;
	
	static {
		loadRol();
	}

	public static boolean contains(String codProcedimento) {
		return getProcedimento(codProcedimento) != null ? true : false;
	}

	public static String getProcedimento(String key) {
		if (rol.containsKey(key)) {
			return rol.get(key);
		} else {
			return null;
		}
	}
	
	private static void loadRol() {
		rol = new HashMap<>();
		File listaRol = new File(Thread.currentThread().getContextClassLoader().getResource("ROL.csv").getFile());
		try {
			FileReader reader = new FileReader(listaRol);
			BufferedReader bfr = new BufferedReader(reader);
			String line;
			while ((line = bfr.readLine()) != null) {
				String[] procs = line.split(",");
				rol.put(procs[0], procs[1]);
			}
		} catch (Exception ex) {
			return;
		}
	}

}
