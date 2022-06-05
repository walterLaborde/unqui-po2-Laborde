package ar.edu.unq.po2.tp3;


public class Multiplos {
	
	int cotaSup = 1000;
	
	public int getCotaSup() {
		return cotaSup;
	}

	public void setCotaSup(int cotaSup) {
		this.cotaSup = cotaSup;
	}

	public int multiploMasAlto(int x, int y) {
		int elMasAlto;
		
		if(this.esMultiploDe(x, y)) { 
			elMasAlto = this.elMultiploMasAltoEntre(x,y);
		} else {
			elMasAlto = -1;
		}
		return elMasAlto;
	}

	public boolean esMultiploDe(int x, int y) {
		// TODO Auto-generated method stub
		//int k = x / y;
		return (x % y ) == 0 ; //& (x / y == k * y)
	}
	
	private int elMultiploMasAltoEntre(int x, int y) {
		// TODO Auto-generated method stub
		int multElegido;
		if (this.elMultMasAltoDe(x) >= this.elMultMasAltoDe(y)) 
			{
				multElegido = this.elMultMasAltoDe(x);
			} else {
				multElegido = this.elMultMasAltoDe(y);
			}
		return multElegido;
	}

	public int elMultMasAltoDe(int x) {
		// TODO Auto-generated method stub
		while(this.getCotaSup() >=0 & !this.esMultiploDe(x, this.getCotaSup())) {
			cotaSup --;
		}
		return this.getCotaSup();
	}

}
