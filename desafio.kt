enum class Nivel{ BASICO, INTERMEDIARIO, AVANCADO}

data class Usuario(var nomeUsuario: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(var nome: String, var nivel: Nivel){
    val inscritos = mutableListOf("Gabriel", "Matheus", "Oscar", "Batista")
    val mutableListIterator = inscritos.listIterator()
    val conteudo= ConteudoEducacional("Orgaos")
    fun matricular() {
        /*TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")*/
        mutableListIterator.next()

        nome = "Tecnico de Enfermagem"
        print("")
        nivel = Nivel.BASICO
        print("")

        println("Nome do aluno: " + inscritos)
        println("Formação do aluno: " + nome)
        println("Nivel do aluno: " + nivel)
        println("Conteudo e sua duração: " + conteudo)
    }
}
fun main() {

/*    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    */
    var usuario = Usuario("Lucas")
    val formacao = Formacao("Enfermagem11", Nivel.AVANCADO)
    println(usuario)
    println("")


    println(formacao.matricular())
}