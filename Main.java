//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    File arquivo = new File("src/formulario.txt");

    try{
        Scanner leitorArquivo = new Scanner(arquivo);
        Scanner teclado = new Scanner(System.in);

        while (leitorArquivo.hasNextLine()){
            String pergunta = leitorArquivo.nextLine();
            System.out.println(pergunta);

            String resposta = teclado.nextLine();
            System.out.println("Você respondeu: "+resposta);
            System.out.println();
        }

        leitorArquivo.close();
        teclado.close();
    } catch (FileNotFoundException e) {
        System.out.println(e);
    }
}
