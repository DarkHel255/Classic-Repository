package Mediathèque;

public class main {
	
	public static void main(String[] Bibli) {
		
		Document aze = new Document() ;
		aze.getCreationDate();
		aze.setTitre("Vie en Nature.");
		System.out.println(aze.toString());
		
		Cassette L2D = new Cassette () ;
		L2D.setDurée(52);
		L2D.setAuteur("Helkizen");
		System.out.println(L2D.toString());
		
		Livre L3D = new Livre () ;
		L3D.setPage(752);
		L3D.setAuteur("Helkizen");
		L3D.setEditeur("Seagull3");
		System.out.println(L3D.toString());
		
		Periodique L4D = new Periodique () ;
		L4D.setFrequence("Mensuel");
		L4D.setPage(200);
		System.out.println(L4D.toString());
		
	}

}
