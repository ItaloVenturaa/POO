//Nome: Italo Pereira Ventura -  RA: 2467259

public class TstAtleta {

	public static void main(String arg[]) {

		try {

			int opcao = 0;

			Corredor c = new Corredor();
			Saltador s = new Saltador();
			Nadador n = new Nadador();
			LeituraAtleta l = new LeituraAtleta();

			// não tratei nenhuma exceção (ainda)!!!

			do {
				System.out.println("\n");
				System.out.println("\t\tEscolha uma opção:");
				System.out.println("\t1 - Corredor");
				System.out.println("\t2 - Saltador");
				System.out.println("\t3 - Nadador");
				System.out.println("\t4 - Sair");

				System.out.println("Qual opcao voce deseja escolher?");
				opcao = Integer.parseInt(l.entDados(""));

				switch (opcao) {
					case 1:
						System.out.println("\n\tVocê escolheu a opção Corredor");
						// código para corredor

						c.setNome(l.entDados("Qual é o primeiro nome?")); // her
						c.setSobrenome(l.entDados("Qual é o sobrenome?")); // her
						c.setIdade(Integer.parseInt(l.entDados("Qual é a idade?"))); // her
						c.setRg(Integer.parseInt(l.entDados("Qual é o rg do atleta?"))); // her

						c.d1.setRua(l.entDados("Qual é o nome da rua que resida?")); // her
						c.d1.setNumcasa(Integer.parseInt(l.entDados("Qual é o numero da casa?"))); // her
						c.d1.setIdatleta(Integer.parseInt(l.entDados("Qual é ID do atleta?"))); // her
						c.d1.setTelresponsavel(Integer.parseInt(l.entDados("Qual é telefone do responsavel?"))); // her

						c.setDistancia(Integer.parseInt(l.entDados("Qual é o distancia?")));
						c.setModalidade(l.entDados("Qual é a modalidade do corrredor?"));

						System.out.println("\n");
						System.out.println("Nome: " + c.getNome());
						System.out.println("Sobrenome: " + c.getSobrenome());
						System.out.println("Idade: " + c.getIdade());
						System.out.println("RG: " + c.getRg());

						System.out.println("Nome da rua onde mora: " + c.d1.getRua());
						System.out.println("Numero da casa: " + c.d1.getNumcasa());
						System.out.println("ID do atleta: " + c.d1.getIdatleta());
						System.out.println("Telefone do responsavel: " + c.d1.getTelresponsavel());

						System.out.println("Distancia que corre: " + c.getDistancia());
						System.out.println("Modalidade que disputa: " + c.getModalidade());

						break;

					case 2:
						System.out.println("\n\tVocê escolheu a opção Saltador");
						// código para saltador

						s.setNome(l.entDados("Qual é o primeiro nome?")); // her
						s.setSobrenome(l.entDados("Qual é o sobrenome?")); // her
						s.setIdade(Integer.parseInt(l.entDados("Qual é a idade?"))); // her
						s.setRg(Integer.parseInt(l.entDados("Qual é o rg do atleta?"))); // her

						s.d1.setRua(l.entDados("Qual é o nome da rua que resida?")); // her
						s.d1.setNumcasa(Integer.parseInt(l.entDados("Qual é o numero da casa?"))); // her
						s.d1.setIdatleta(Integer.parseInt(l.entDados("Qual é ID do atleta?"))); // her
						s.d1.setTelresponsavel(Integer.parseInt(l.entDados("Qual é telefone do responsavel?"))); // her

						s.setAltura(Integer.parseInt(l.entDados("Qual é a altura?")));
						s.setCategoria(l.entDados("Qual é a categoria do saltador?"));

						System.out.println("\n");
						System.out.println("Nome: " + s.getNome());
						System.out.println("Sobrenome: " + s.getSobrenome());
						System.out.println("Idade: " + s.getIdade());
						System.out.println("RG: " + s.getRg());

						System.out.println("Nome da rua onde mora: " + s.d1.getRua());
						System.out.println("Numero da casa: " + s.d1.getNumcasa());
						System.out.println("ID do atleta: " + s.d1.getIdatleta());
						System.out.println("Telefone do responsavel: " + s.d1.getTelresponsavel());

						System.out.println("Altura que pula: " + s.getAltura());
						System.out.println("Categoria: " + s.getCategoria());

						break;

					case 3:
						System.out.println("\n\tVocê escolheu a opção Nadador");
						// código para nadador

						n.setNome(l.entDados("Qual é o primeiro nome?")); // her
						n.setSobrenome(l.entDados("Qual é o sobrenome?")); // her
						n.setIdade(Integer.parseInt(l.entDados("Qual é a idade?"))); // her
						n.setRg(Integer.parseInt(l.entDados("Qual é o rg do atleta?"))); // her

						n.d1.setRua(l.entDados("Qual é o nome da rua que resida?")); // her
						n.d1.setNumcasa(Integer.parseInt(l.entDados("Qual é o numero da casa?"))); // her
						n.d1.setIdatleta(Integer.parseInt(l.entDados("Qual é ID do atleta?"))); // her
						n.d1.setTelresponsavel(Integer.parseInt(l.entDados("Qual é telefone do responsavel?"))); // her

						n.setMetros(Integer.parseInt(l.entDados("Quantos metros é a disputa?")));
						n.setEstilo(l.entDados("Qual é o estilo do nado?"));

						System.out.println("\n");
						System.out.println("Nome: " + n.getNome());
						System.out.println("Sobrenome: " + n.getSobrenome());
						System.out.println("Idade: " + n.getIdade());
						System.out.println("RG: " + n.getRg());

						System.out.println("Nome da rua onde mora: " + n.d1.getRua());
						System.out.println("Numero da casa: " + n.d1.getNumcasa());
						System.out.println("ID do atleta: " + n.d1.getIdatleta());
						System.out.println("Telefone do responsavel: " + n.d1.getTelresponsavel());

						System.out.println("Metros da piscina: " + n.getMetros());
						System.out.println("Estilo que nada: " + n.getEstilo());

						break;

					case 4:
						System.out.println("\n\tVocê escolheu sair");
						break;
					default:
						System.out.println("\n\t\tOpção inválida, tente outra!");
				}
			} while (opcao != 4);
		} finally {
			System.out.println("\n\tEncerrando programa...");
		}
		System.gc(); // invoca o Garbage Collector
	}
}
