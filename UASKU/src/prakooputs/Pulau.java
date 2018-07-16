package prakooputs;

public class Pulau {
	public void Pulau (PulauMain mh) {
		mh.Sumatera();
		mh.Jawa();
		mh.Kalimantan();
		mh.Sulawesi();
		mh.Papua();
	}
		public static void main(String[] args) {
			Pulau mh_index=new Pulau();
			mh_index.Pulau (new Sumatera (" Island"));
			mh_index.Pulau (new Kalimantan (" Island"));
			//mh_index.Pulau (new Jawa ("Island"));
			//mh_index.Pulau (new Sulawesi ("Island"));
			mh_index.Pulau (new Papua (" Island"));
		}
}
