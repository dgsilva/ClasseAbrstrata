package principal;

public class ControleRemoto implements Controlador {
	private Integer volume;
	private boolean ligado;
	private boolean tocando;
	public ControleRemoto() {
		// TODO Auto-generated constructor stub
	}
	public ControleRemoto(Integer volume, boolean ligado, boolean tocando) {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	private Integer getVolume() {
		return volume;
	}
	private void setVolume(Integer volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void Ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void Desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void AbrirMenu() {
		System.out.println("----Menu----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está Tocando? " + this.getTocando());
		System.out.print("Volume:" + this.getVolume());
		for(int i = 0; i<=this.getVolume(); i+=10){
			System.out.println("|");
		}
		System.out.println("");
		
	}
	@Override
	public void FecharMenu() {
		System.out.println("Fechando Menu... ");
		
	}
	@Override
	public void maisVolume() {
		if(this.getLigado()){
			this.setVolume(this.getVolume() + 5);
		}
	}
	@Override
	public void menosVolume() {
	if(this.getLigado()){
		this.setVolume(this.getVolume() - 5);
	}
		
	}
	@Override
	public void ligarMudo() {
	if(this.getLigado() && this.getVolume() > 0){
		this.setVolume(0);
	}
		
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0){
			this.setVolume(50);
		}
		
	}
	@Override
	public void Play() {
		if(this.getLigado()&&!(this.getTocando())){
			this.setTocando(true);
		}
		
	}
	@Override
	public void Pause() {
		if(this.getLigado()&& !(this.getTocando())){
			this.setTocando(false);
		}
		
	}
	

}
