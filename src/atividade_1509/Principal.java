package atividade_1509;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
		String menu = 
				  "1 - Cadastrar Paciente\n"
				+ "2 - Cadastrar Medicamento\n"
				+ "3 - Fazer uma prescrição\n"
				+ "4 - Listar Pacientes\n"
				+ "5 - Sair!";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1 ) {			
				Paciente p = new Paciente ();
				p.cadastra();
				pacientes.add(p);
			}
			else if (op == 2){
				Medicamento m = new Medicamento();
				m.cadastra();
				medicamentos.add(m);
			}
			
			else if (op == 3) {
				Paciente a = Ultil.selecionaPaciente(pacientes);
				Medicamento d =  Ultil.selecionaMedicamento(medicamentos);
				a.getMedicamentos().add(d);
				
			
			}
			else if (op == 4) {
				String resultPac = "Pacientes cadastrados\n\n";
				for(Paciente p: pacientes) {
					resultPac += p.exibirDadosPac();
				}
			JOptionPane.showMessageDialog(null, resultPac);
			}
		}while (op !=5);
	}
}