import java.io.Serializable;

public class Nivel implements Serializable{

	private int longCasillas, altCasillas;
	private String nombreNivel;
	private String imgURL;

	private Equipo equipo;

	private Item[] items = new Item[10];
	private Enemigo[] enemigos = new Enemigo[4];
	private FinalBoss finalBoss;

	public Nivel(String nombreNivel, int longCasillas, int altCasillas, Equipo equipo, String imgURL){
		this.longCasillas = longCasillas;
		this.altCasillas = altCasillas;
		this.equipo = equipo;
		this.nombreNivel = nombreNivel;
		this.imgURL = imgURL;
		initElementos();
	}

	public Nivel(String nombreNivel, int longCasillas, int altCasillas,
		Equipo equipo, Item[] items, Enemigo[] enemigos, FinalBoss finalBoss){
		this.nombreNivel = nombreNivel;
		this.longCasillas = longCasillas;
		this.altCasillas = altCasillas;
		this.equipo = equipo;
		this.items = items;
		this.enemigos = enemigos;
		this.finalBoss = finalBoss;
	}

	//Aqui colocamos el array entero de objetos a null
	public void initElementos(){
		for (int i=0; i<items.length; i++) { items[i]=null;
		}
		for (int i=0; i<enemigos.length; i++) { enemigos[i]=null;
		}
	}

	public int getLongCasillas(){ return longCasillas;
	}

	public int getAltCasillas(){ return altCasillas;
	}

	public String getNombreNivel(){ return nombreNivel;
	}

	public Equipo getEquipo(){ return equipo;
	}

	public void setEquipo(Equipo e){ this.equipo = e;
	}

	public Item[] getItems(){ return items;
	}

	public Enemigo[] getEnemigos(){ return enemigos;
	}

	public FinalBoss getFinalBoss(){ return finalBoss;
	}

	public String getImgURL(){ return imgURL;
	}

	public void setImgURL(String s){ this.imgURL = s;
	}

	public void setEquipoCoords(int coordX, int coordY){ equipo.setCoords(coordX, coordY);
	}

	public void addEnemigo(Enemigo enemigo, int coordX, int coordY){
		for (int i=0; i<enemigos.length; i++) {
			if (enemigos[i]==null) {
				enemigos[i] = enemigo;
				enemigos[i].setCoords(coordX, coordY);
				break;
			}
		}
	}

	public void addItem(Item item, int coordX, int coordY){
		for (int i=0; i<items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				items[i].setCoords(coordX,coordY);
				break;
			}
		}
	}

	public void addFinalBoss(FinalBoss finalBoss){
		this.finalBoss = finalBoss;
	}
}