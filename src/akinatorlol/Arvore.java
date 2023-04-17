/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinatorlol;

/**
 *
 * @author Eduardo
 */
public class Arvore {

    private No raiz;
    public No temp;

    public Arvore() {
        raiz = null;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = inserir(raiz, valor);
        } else {
            inserir(raiz, valor);
            //valida();
        }

    }

    public No inserir(No no, int valor) {

        if (no == null) {
            no = new No(valor);
        } else {
            //aqui vem as comparacoes da arvore
            if (no.getvalor < valor) {
                if (no.getDir() == null) {
                    no.Dir = inserir(no.Dir, valor);
                } else {
                    inserir(no.getDir(), valor);
                }

            }

            if (no.getvalor > valor) {
                if (no.getEsq() == null) {
                    no.Esq = inserir(no.Esq, valor);
                } else {
                    inserir(no.getEsq(), valor);
                }
            }
        }
        return no;

    }

    public int altura(No n) {
        if (n == null) {
            return 0;
        }
        int esq = altura(n.Esq);
        int dir = altura(n.Dir);
        if (dir > esq) {
            return (dir + 1);
        } else {
            return (esq + 1);
        }
    }

    public int altura() {
        return altura(raiz);

    }

    public void inicio() {
        temp = raiz;
    }

    public String peguntas(No valor) {
        String pergunta = "";
        temp = valor;
        if (valor.getvalor == 79) {
            pergunta = " Su personaje es luchador?";
        }
        if (valor.getvalor == 13) {
            pergunta = "Su personaje proviene del freljord?";
        }
        if (valor.getvalor == 7) {
            pergunta = "Su personaje es de apariencia humana?";
        }
        if (valor.getvalor == 3) {
            pergunta = "O seu personagem usa machado ou espada?";
        }
        if (valor.getvalor == 1) {
            pergunta = "O seu personagem fica imortal?";
        }
        if (valor.getvalor == 0) {
            pergunta = "Tryndamere o Rei Bárbaro";
        }
        if (valor.getvalor == 2) {
            pergunta = "Olaf o Berserker ";
        }
        if (valor.getvalor == 5) {
            pergunta = "O seu personagem tem um barril?";
        }
        if (valor.getvalor == 4) {
            pergunta = "Gragas o Badernista ";
        }
        if (valor.getvalor == 6) {
            pergunta = "Udyr o Andarilho Espiritual";
        }
        if (valor.getvalor == 9) {
            pergunta = "O seu personagem é conhecido como rei dos trolls?";
        }
        if (valor.getvalor == 8) {
            pergunta = "Trundle o Rei dos Trolls";
        }
        if (valor.getvalor == 11) {
            pergunta = "O seu personagem é um Yordle?";
        }
        if (valor.getvalor == 10) {
            pergunta = "Gnar o Yordle Pré-Histórico";
        }
        if (valor.getvalor == 12) {
            pergunta = "Volibear o Rugido do Trovão";
        }
        if (valor.getvalor == 23) {
            pergunta = "O seu personagem é Ionia?";
        }
        if (valor.getvalor == 21) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 15) {
            pergunta = "O seu personagem é cego?";
        }
        if (valor.getvalor == 14) {
            pergunta = "Lee Sin o Monge Cego ";
        }
        if (valor.getvalor == 17) {
            pergunta = "O seu personagem tem título de 'chefe'?";
        }
        if (valor.getvalor == 16) {
            pergunta = "Sett o Chefe";
        }
        if (valor.getvalor == 19) {
            pergunta = "O seu personagem faz uma parede de vento em alguma habilidade?";
        }
        if (valor.getvalor == 18) {
            pergunta = "Yasuo o Imperdoável";
        }
        if (valor.getvalor == 20) {
            pergunta = "Wukong o Macaco Rei";
        }
        if (valor.getvalor == 22) {
            pergunta = "Irelia a Dançarina das Lâminas";
        }
        if (valor.getvalor == 33) {
            pergunta = "O seu personagem é de Demacia?";
        }
        if (valor.getvalor == 27) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 25) {
            pergunta = "O seu personagem tem título 'o Poder de Demacia'?";
        }
        if (valor.getvalor == 24) {
            pergunta = "Garen o Poder de Demacia";
        }
        if (valor.getvalor == 26) {
            pergunta = "Xin Zhao o Senescal de Demacia";
        }
        if (valor.getvalor == 29) {
            pergunta = "O seu personagem é meio-dragão? ";
        }
        if (valor.getvalor == 28) {
            pergunta = "Shyvana a Meio-Dragão";
        }
        if (valor.getvalor == 31) {
            pergunta = "O seu personagem é a duelista mais temida de toda Valoran?";
        }
        if (valor.getvalor == 30) {
            pergunta = "Fiora a Grande Duelista";
        }
        if (valor.getvalor == 32) {
            pergunta = "Kayle a Justa";
        }
        if (valor.getvalor == 41) {
            pergunta = "O seu personagem é de Noxus?";
        }
        if (valor.getvalor == 39) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 35) {
            pergunta = "O seu personagem tem título 'a Mão de Noxus'?";
        }
        if (valor.getvalor == 34) {
            pergunta = "Darius a Mão de Noxus ";
        }
        if (valor.getvalor == 37) {
            pergunta = "O seu personagem tem uma montaria?";
        }
        if (valor.getvalor == 36) {
            pergunta = "Kled o Cavaleiro Intratável";
        }
        if (valor.getvalor == 38) {
            pergunta = "Mordekaiser o Revenã de Ferro";
        }
        if (valor.getvalor == 40) {
            pergunta = "Riven a Exilada";
        }
        if (valor.getvalor == 47) {
            pergunta = "O seu personagem é de Zuan?";
        }
        if (valor.getvalor == 43) {
            pergunta = "O seu personagem sente o cheiro de sangue";
        }
        if (valor.getvalor == 42) {
            pergunta = "Warwick a Ira Descontrolada de Zaun ";
        }
        if (valor.getvalor == 45) {
            pergunta = "O seu personagem tem título 'o Louco de Zaun'?";
        }
        if (valor.getvalor == 44) {
            pergunta = "Dr. Mundo o Louco de Zaun";
        }
        if (valor.getvalor == 46) {
            pergunta = "Urgot o Encouraçado";
        }
        if (valor.getvalor == 53) {
            pergunta = "O seu personagem é de Shurima?";
        }
        if (valor.getvalor == 51) {
            pergunta = "O seu personagem tem uma rixa com o irmão?";
        }
        if (valor.getvalor == 49) {
            pergunta = "O seu personagem tem acumula fúria na passiva?";
        }
        if (valor.getvalor == 48) {
            pergunta = "Renekton o Carniceiro das Areias ";
        }
        if (valor.getvalor == 50) {
            pergunta = "Nasus o Curador das Areias ";
        }
        if (valor.getvalor == 52) {
            pergunta = "Skarner a Vanguarda de Cristal ";
        }
        if (valor.getvalor == 59) {
            pergunta = "O seu personagem é de Piltover?";
        }
        if (valor.getvalor == 55) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 54) {
            pergunta = "Jayce o Defensor do Amanhã";
        }
        if (valor.getvalor == 57) {
            pergunta = "O seu personagem é era uma antiga criminosa das ruas impiedosas de Zaun?";
        }
        if (valor.getvalor == 56) {
            pergunta = "Vi a Defensora de Piltover";
        }
        if (valor.getvalor == 58) {
            pergunta = "Camille a Sombra de Aço";
        }
        if (valor.getvalor == 63) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 61) {
            pergunta = "O seu personagem usar um poste como armar?";
        }
        if (valor.getvalor == 60) {
            pergunta = "Jax o Grão-Mestre das Armas";
        }
        if (valor.getvalor == 62) {
            pergunta = "Aatrox a Espada Darkin";
        }
        if (valor.getvalor == 67) {
            pergunta = "O seu personagem é da Aguas de sentina?";
        }
        if (valor.getvalor == 65) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 64) {
            pergunta = "Gangplank o Terror dos Doze Mares";
        }
        if (valor.getvalor == 66) {
            pergunta = "Illaoi a Sacerdotisa Cráquem";
        }
        if (valor.getvalor == 71) {
            pergunta = "O seu personagem é da Ilhas das Sombras?";
        }
        if (valor.getvalor == 69) {
            pergunta = "O seu personagem invocar a donzela da névoa?";
        }
        if (valor.getvalor == 68) {
            pergunta = "Yorick o Pastor de Almas";
        }
        if (valor.getvalor == 70) {
            pergunta = "Hecarim a Sombra da Guerra";
        }
        if (valor.getvalor == 75) {
            pergunta = "O seu personagem é de Targon?";
        }
        if (valor.getvalor == 73) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 72) {
            pergunta = "Pantheon a Lança Indestrutível";
        }
        if (valor.getvalor == 74) {
            pergunta = "Diana o Escárnio da Lua";
        }
        if (valor.getvalor == 77) {
            pergunta = "O seu personagem é do O Vazio?";
        }
        if (valor.getvalor == 76) {
            pergunta = "Rek'Sai a Escavadora do Vazio";
        }
        if (valor.getvalor == 78) {
            pergunta = "Rumble a Ameaça Mecânica";
        }
        if (valor.getvalor == 147) {
            pergunta = "O seu personagem é Mago?";
        }
        if (valor.getvalor == 89) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 87) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 81) {
            pergunta = "O seu personagem é um dragão?";
        }
        if (valor.getvalor == 80) {
            pergunta = "Aurelion Sol o Forjador de Estrelas";
        }
        if (valor.getvalor == 83) {
            pergunta = "O seu personagem tem o corpo em chama?";
        }
        if (valor.getvalor == 82) {
            pergunta = "Brand a Vingança Flamejante";
        }
        if (valor.getvalor == 85) {
            pergunta = "O seu personagem tem título 'o Mago Rúnico'?";
        }
        if (valor.getvalor == 84) {
            pergunta = "Ryze o Mago Rúnico";
        }
        if (valor.getvalor == 86) {
            pergunta = "Fiddlesticks o Mensageiro da Morte";
        }
        if (valor.getvalor == 88) {
            pergunta = "Annie a Criança Sombria";
        }
        if (valor.getvalor == 97) {
            pergunta = "O seu personagem é de Ionia?";
        }
        if (valor.getvalor == 91) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 90) {
            pergunta = "Kennen o Coração da Tempestade";
        }
        if (valor.getvalor == 93) {
            pergunta = "O seu personagem é uma raposa?";
        }
        if (valor.getvalor == 92) {
            pergunta = "Ahri a Raposa de Nove Caudas";
        }
        if (valor.getvalor == 95) {
            pergunta = "O seu personagem tem título 'Soberana Sombria'?";
        }
        if (valor.getvalor == 94) {
            pergunta = "Syndra a Soberana Sombria";
        }
        if (valor.getvalor == 96) {
            pergunta = "Karma a Iluminada";
        }
        if (valor.getvalor == 105) {
            pergunta = "O seu personagem é de Demacia?";
        }
        if (valor.getvalor == 99) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 98) {
            pergunta = "Sylas o Abjugado";
        }
        if (valor.getvalor == 103) {
            pergunta = "O seu personagem tem uma parte celestial?";
        }
        if (valor.getvalor == 102) {
            pergunta = "Morgana a Caída";
        }
        if (valor.getvalor == 104) {
            pergunta = "Lux a Dama da Luz";
        }
        if (valor.getvalor == 111) {
            pergunta = "O seu personagem é de Noxus?";
        }
        if (valor.getvalor == 109) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 107) {
            pergunta = "O seu personagem tem título 'o Sanguinário Escarlate'?";
        }
        if (valor.getvalor == 106) {
            pergunta = "Vladimir o Sanguinário Escarlate";
        }
        if (valor.getvalor == 108) {
            pergunta = "Swain o Mestre da Estratégia";
        }
        if (valor.getvalor == 110) {
            pergunta = "Cassiopeia o Abraço da Serpente";
        }
        if (valor.getvalor == 117) {
            pergunta = "O seu personagem é de Shurima?";
        }
        if (valor.getvalor == 115) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 113) {
            pergunta = "O seu personagem tem título 'o Imperador das Areias'?";
        }
        if (valor.getvalor == 112) {
            pergunta = "Azir o Imperador das Areias";
        }
        if (valor.getvalor == 114) {
            pergunta = "Xerath o Mago Ascendente";
        }
        if (valor.getvalor == 116) {
            pergunta = "Taliyah a Tecelã de Pedras";
        }
        if (valor.getvalor == 121) {
            pergunta = "O seu personagem é de Freljord?";
        }
        if (valor.getvalor == 119) {
            pergunta = "O seu personagem tem título 'a Criofênix'?";
        }
        if (valor.getvalor == 118) {
            pergunta = "Anivia a Criofênix";
        }
        if (valor.getvalor == 120) {
            pergunta = "Lissandra a Bruxa Gélida";
        }
        if (valor.getvalor == 125) {
            pergunta = "O seu personagem é de Zuan?";
        }
        if (valor.getvalor == 123) {
            pergunta = "O seu personagem é Especialista em Hexplosivos?";
        }
        if (valor.getvalor == 122) {
            pergunta = "Ziggs o Especialista em Hexplosivos";
        }
        if (valor.getvalor == 124) {
            pergunta = "Viktor o Arauto das Máquinas";
        }
        if (valor.getvalor == 129) {
            pergunta = "O seu personagem é de Piltover?";
        }
        if (valor.getvalor == 127) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 126) {
            pergunta = "Heimerdinger o Inventor Idolatrado";
        }
        if (valor.getvalor == 128) {
            pergunta = "Orianna a Donzela Mecânica";
        }
        if (valor.getvalor == 133) {
            pergunta = "O seu personagem é da Ilhas das Sombras?";
        }
        if (valor.getvalor == 131) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 130) {
            pergunta = "Karthus a Voz Mortal";
        }
        if (valor.getvalor == 132) {
            pergunta = "Elise a Aranha Rainha";
        }
        if (valor.getvalor == 137) {
            pergunta = "O seu personagem é do  Vazios?";
        }
        if (valor.getvalor == 135) {
            pergunta = "O seu personagem tem título 'o Olho do Vazio'?";
        }
        if (valor.getvalor == 134) {
            pergunta = "Vel'Koz o Olho do Vazio";
        }
        if (valor.getvalor == 136) {
            pergunta = "Malzahar o Profeta do Vazio";
        }
        if (valor.getvalor == 141) {
            pergunta = "O seu personagem é de Ixtal?";
        }
        if (valor.getvalor == 139) {
            pergunta = "O seu personagem é uma Camaleoa?";
        }
        if (valor.getvalor == 138) {
            pergunta = "Neeko a Camaleoa Curiosa";
        }
        if (valor.getvalor == 140) {
            pergunta = "Zyra a Ascensão dos Espinho";
        }
        if (valor.getvalor == 143) {
            pergunta = "O seu personagem é de Aguas de sentina?";
        }
        if (valor.getvalor == 142) {
            pergunta = "Twisted Fate o Mestre das Cartas";
        }
        if (valor.getvalor == 145) {
            pergunta = "O seu personagem é de Targon?";
        }
        if (valor.getvalor == 144) {
            pergunta = "Zoe o Aspecto do Crepúsculo";
        }
        if (valor.getvalor == 146) {
            pergunta = "Veigar o Pequeno Mestre do Mal";
        }
        if (valor.getvalor == 193) {
            pergunta = "O seu personagem é Atirador?";
        }
        if (valor.getvalor == 153) {
            pergunta = "O seu personagem é de Ionia?";
        }
        if (valor.getvalor == 151) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 149) {
            pergunta = "O seu personagem é conhecido pelo 4 hit?";
        }
        if (valor.getvalor == 148) {
            pergunta = "Jhin o Virtuoso";
        }
        if (valor.getvalor == 150) {
            pergunta = "Varus a Flecha da Vingança";
        }
        if (valor.getvalor == 152) {
            pergunta = "Xayah a Rebelde";
        }
        if (valor.getvalor == 159) {
            pergunta = "O seu personagem é de Bandópolis?";
        }
        if (valor.getvalor == 157) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 155) {
            pergunta = "O seu personagem tem um avião?";
        }
        if (valor.getvalor == 154) {
            pergunta = "Corki o Bombardeiro Ousado";
        }
        if (valor.getvalor == 156) {
            pergunta = "Teemo o Explorador Veloz";
        }
        if (valor.getvalor == 158) {
            pergunta = "Tristana a Artilheira Yordle";
        }
        if (valor.getvalor == 163) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 161) {
            pergunta = "O seu personagem teve a esposa assassinada pelo Thresh?";
        }
        if (valor.getvalor == 160) {
            pergunta = "Lucian o Purificador";
        }
        if (valor.getvalor == 162) {
            pergunta = "Kindred os Caçadores Eternos";
        }
        if (valor.getvalor == 167) {
            pergunta = "O seu personagem é de Demacia?";
        }
        if (valor.getvalor == 165) {
            pergunta = "O seu personagem tem um aguia com o nome de Valor?";
        }
        if (valor.getvalor == 164) {
            pergunta = "Quinn as Asas de Demacia";
        }
        if (valor.getvalor == 166) {
            pergunta = "Vayne a Caçadora Noturna";
        }
        if (valor.getvalor == 171) {
            pergunta = "O seu personagem é de Zuan?";
        }
        if (valor.getvalor == 169) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 168) {
            pergunta = "Twitch o Semeador da Peste";
        }
        if (valor.getvalor == 170) {
            pergunta = "Jinx o Gatilho Desenfreado";
        }
        if (valor.getvalor == 175) {
            pergunta = "O seu personagem é de Piltover?";
        }
        if (valor.getvalor == 173) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 172) {
            pergunta = "Ezreal o Explorador Pródigo";
        }
        if (valor.getvalor == 174) {
            pergunta = "Caitlyn a Xerife de Piltover";
        }
        if (valor.getvalor == 179) {
            pergunta = "O seu personagem é do Vazio?";
        }
        if (valor.getvalor == 177) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 176) {
            pergunta = "Kog'Maw a Boca do Abismo";
        }
        if (valor.getvalor == 178) {
            pergunta = "Kai'Sa a Filha do Vazio";
        }
        if (valor.getvalor == 183) {
            pergunta = "O seu personagem é de Aguas de sentina?";
        }
        if (valor.getvalor == 181) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 180) {
            pergunta = "Graves o Foragido";
        }
        if (valor.getvalor == 182) {
            pergunta = "Miss Fortune a Caçadora de Recompensas";
        }
        if (valor.getvalor == 185) {
            pergunta = "O seu personagem é de Noxus?";
        }
        if (valor.getvalor == 184) {
            pergunta = "Draven o Carrasco de Noxus";
        }
        if (valor.getvalor == 187) {
            pergunta = "O seu personagem é de Shurima?";
        }
        if (valor.getvalor == 186) {
            pergunta = "Sivir a Mestra da Batalha";
        }
        if (valor.getvalor == 189) {
            pergunta = "O seu personagem é de Freljord?";
        }
        if (valor.getvalor == 188) {
            pergunta = "Ashe a Arqueira do Gelo";
        }
        if (valor.getvalor == 191) {
            pergunta = "O seu personagem é da Ilhas das Sombras?";
        }
        if (valor.getvalor == 190) {
            pergunta = "Kalista a Lança da Vingança";
        }
        if (valor.getvalor == 192) {
            pergunta = "Aphelios a Arma dos Devotos";
        }
        if (valor.getvalor == 231) {
            pergunta = "O seu personagem é Tanque?";
        }
        if (valor.getvalor == 199) {
            pergunta = "O seu personagem é de Demacia?";
        }
        if (valor.getvalor == 197) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 195) {
            pergunta = "O seu personagem tem uma aparência Humana?";
        }
        if (valor.getvalor == 194) {
            pergunta = "Jarvan IV o Exemplo de Demacia";
        }
        if (valor.getvalor == 196) {
            pergunta = "Galio o Colosso";
        }
        if (valor.getvalor == 198) {
            pergunta = "Poppy a Guardiã do Martelo";
        }
        if (valor.getvalor == 205) {
            pergunta = "O seu personagem é de Zuan?";
        }
        if (valor.getvalor == 201) {
            pergunta = "O seu personagem tem título 'o Grande Golem a Vapor'?";
        }
        if (valor.getvalor == 200) {
            pergunta = "Blitzcrank o Grande Golem a Vapor";
        }
        if (valor.getvalor == 203) {
            pergunta = "O seu personagem é um alquimista?";
        }
        if (valor.getvalor == 202) {
            pergunta = "Singed o Químico Louco";
        }
        if (valor.getvalor == 204) {
            pergunta = "Zac a Arma Secreta";
        }
        if (valor.getvalor == 211) {
            pergunta = "O seu personagem é de Freljord?";
        }
        if (valor.getvalor == 209) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 207) {
            pergunta = "O seu personagem tem um yeti?";
        }
        if (valor.getvalor == 206) {
            pergunta = "Nunu e Willump o Garoto e seu Yeti";
        }
        if (valor.getvalor == 208) {
            pergunta = "Ornn o Fogo sob a Montanha";
        }
        if (valor.getvalor == 210) {
            pergunta = "Sejuani a Ira do Inverno";
        }
        if (valor.getvalor == 215) {
            pergunta = "O seu personagem é de Shurima?";
        }
        if (valor.getvalor == 213) {
            pergunta = "O seu personagem tem como sua unica fala 'OK'?";
        }
        if (valor.getvalor == 212) {
            pergunta = "Rammus o Tatu Blindado";
        }
        if (valor.getvalor == 214) {
            pergunta = "Amumu a Múmia Triste";
        }
        if (valor.getvalor == 217) {
            pergunta = "O seu personagem é de Ionia?";
        }
        if (valor.getvalor == 216) {
            pergunta = "Shen o Olho do Crepúsculo";
        }
        if (valor.getvalor == 219) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 218) {
            pergunta = "Alistar o Minotauro";
        }
        if (valor.getvalor == 221) {
            pergunta = "O seu personagem é do Vazio?";
        }
        if (valor.getvalor == 220) {
            pergunta = "Cho'Gath o Terror do Vazio";
        }
        if (valor.getvalor == 223) {
            pergunta = "O seu personagem é da Aguas de sentina?";
        }
        if (valor.getvalor == 222) {
            pergunta = "Nautilus o Titã das Profundezas";
        }
        if (valor.getvalor == 225) {
            pergunta = "O seu personagem é de Noxus?";
        }
        if (valor.getvalor == 224) {
            pergunta = "Sion o Colosso Morto-Vivo";
        }
        if (valor.getvalor == 227) {
            pergunta = "O seu personagem é da Ilhas das Sombras?";
        }
        if (valor.getvalor == 226) {
            pergunta = "Maokai o Ente Sinistro";
        }
        if (valor.getvalor == 229) {
            pergunta = "O seu personagem é de Targon?";
        }
        if (valor.getvalor == 228) {
            pergunta = "Leona a Alvorada Radiante";
        }
        if (valor.getvalor == 230) {
            pergunta = "Malphite o Fragmento do Monolito";
        }
        if (valor.getvalor == 265) {
            pergunta = "O seu personagem é Assassino?";
        }
        if (valor.getvalor == 239) {
            pergunta = "O seu personagem é de Ionia?";
        }
        if (valor.getvalor == 237) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 233) {
            pergunta = "O seu personagem tem título 'o Mestre das Sombras'?";
        }
        if (valor.getvalor == 232) {
            pergunta = "Zed o Mestre das Sombras";
        }
        if (valor.getvalor == 235) {
            pergunta = "O seu personagem usa uma espada ?";
        }
        if (valor.getvalor == 234) {
            pergunta = "Master Yi o Espadachim Wuju";
        }
        if (valor.getvalor == 236) {
            pergunta = "Kayn o Ceifador das Sombras";
        }
        if (valor.getvalor == 238) {
            pergunta = "Akali a Assassina Renegada ";
        }
        if (valor.getvalor == 247) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 245) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 241) {
            pergunta = "O seu personagem tem título 'o Eterno Pesadelo'?";
        }
        if (valor.getvalor == 240) {
            pergunta = "Nocturne o Eterno Pesadelo";
        }
        if (valor.getvalor == 243) {
            pergunta = "O seu personagem é um palhaço?";
        }
        if (valor.getvalor == 242) {
            pergunta = "Shaco o Bufão Demoníaco";
        }
        if (valor.getvalor == 244) {
            pergunta = "Fizz o Trapaceiro das Marés";
        }
        if (valor.getvalor == 246) {
            pergunta = "Evelynn o Abraço da Agonia";
        }
        if (valor.getvalor == 253) {
            pergunta = "O seu personagem é de Noxus?";
        }
        if (valor.getvalor == 249) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 248) {
            pergunta = "Talon a Sombra da Lâmina";
        }
        if (valor.getvalor == 251) {
            pergunta = "O seu personagem é usa adaga?";
        }
        if (valor.getvalor == 250) {
            pergunta = "Katarina a Lâmina Sinistra";
        }
        if (valor.getvalor == 252) {
            pergunta = "LeBlanc a Farsante";
        }
        if (valor.getvalor == 259) {
            pergunta = "O seu personagem é de Ixtal?";
        }
        if (valor.getvalor == 255) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 254) {
            pergunta = "Rengar o Acossador da Alcateia";
        }
        if (valor.getvalor == 257) {
            pergunta = "O seu personagem pode se transformar em um animal?";
        }
        if (valor.getvalor == 256) {
            pergunta = "Nidalee a Caçadora Bestial";
        }
        if (valor.getvalor == 258) {
            pergunta = "Qiyana a Imperatriz dos Elementos";
        }
        if (valor.getvalor == 263) {
            pergunta = "O seu personagem é do Vazio?";
        }
        if (valor.getvalor == 261) {
            pergunta = "O seu personagem já lutou contra o Rengar?";
        }
        if (valor.getvalor == 260) {
            pergunta = "Kha'Zix o Ceifador do Vazio";
        }
        if (valor.getvalor == 262) {
            pergunta = "Kassadin o Andarilho do Vazio";
        }
        if (valor.getvalor == 264) {
            pergunta = "Ekko o Rapaz que Estilhaçou o Tempo";
        }
        if (valor.getvalor == 275) {
            pergunta = "O seu personagem é de Runeterra?";
        }
        if (valor.getvalor == 271) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 267) {
            pergunta = "O seu personagem tem título 'rei do rio'?";
        }
        if (valor.getvalor == 266) {
            pergunta = "Tahm Kench o Rei do Rio";
        }
        if (valor.getvalor == 269) {
            pergunta = "O seu personagem tem título 'o Guardião do Tempo'?";
        }
        if (valor.getvalor == 268) {
            pergunta = "Zilean o Guardião do Tempo";
        }
        if (valor.getvalor == 270) {
            pergunta = "Bardo o Protetor Andarilho";
        }
        if (valor.getvalor == 273) {
            pergunta = "O seu personagem é a esposa do Lucian?";
        }
        if (valor.getvalor == 272) {
            pergunta = "Senna a Redentora";
        }
        if (valor.getvalor == 274) {
            pergunta = "Nami a Conjuradora das Marés";
        }
        if (valor.getvalor == 279) {
            pergunta = "O seu personagem é de Ionia?";
        }
        if (valor.getvalor == 277) {
            pergunta = "O seu personagem é conhecido como o protetor do verde?";
        }
        if (valor.getvalor == 276) {
            pergunta = "Ivern o Pai do Verde";
        }
        if (valor.getvalor == 278) {
            pergunta = "Rakan o Encantador";
        }
        if (valor.getvalor == 283) {
            pergunta = "O seu personagem é de Targon?";
        }
        if (valor.getvalor == 281) {
            pergunta = "O seu personagem é Homem?";
        }
        if (valor.getvalor == 280) {
            pergunta = "Taric o Escudo de Valoran";
        }
        if (valor.getvalor == 282) {
            pergunta = "Soraka a Filha das Estrelas";
        }
        if (valor.getvalor == 287) {
            pergunta = "O seu personagem é de Bandópolis?";
        }
        if (valor.getvalor == 285) {
            pergunta = "O seu personagem tem título 'a Gata Mágica'?";
        }
        if (valor.getvalor == 284) {
            pergunta = "Yuumi a Gata Mágica";
        }
        if (valor.getvalor == 286) {
            pergunta = "Lulu a Fada Feiticeir";
        }
        if (valor.getvalor == 289) {
            pergunta = "O seu personagem é de Zuan?";
        }
        if (valor.getvalor == 288) {
            pergunta = "Janna a Fúria da Tormenta";
        }
        if (valor.getvalor == 291) {
            pergunta = "O seu personagem é de Demacia?";
        }
        if (valor.getvalor == 290) {
            pergunta = "Sona a Mestra das Cordas";
        }
        if (valor.getvalor == 293) {
            pergunta = "O seu personagem é de Freljord?";
        }
        if (valor.getvalor == 292) {
            pergunta = "Braum o Coração de Freljord";
        }
        if (valor.getvalor == 295) {
            pergunta = "O seu personagem é da Águas de sentina?";
        }
        if (valor.getvalor == 294) {
            pergunta = "Pyke o Estripador das Águas Sangrentas";
        }
        if (valor.getvalor == 296) {
            pergunta = "Thresh o Guardião das Correntes";
        }

        return pergunta;
    }

    public void CriarArvore() {
        inserir(79);
        inserir(13);
        inserir(7);
        inserir(3);
        inserir(1);
        inserir(0);
        inserir(2);
        inserir(5);
        inserir(4);
        inserir(6);
        inserir(9);
        inserir(8);
        inserir(11);
        inserir(10);
        inserir(12);
        inserir(23);
        inserir(21);
        inserir(15);
        inserir(14);
        inserir(17);
        inserir(16);
        inserir(19);
        inserir(18);
        inserir(20);
        inserir(22);
        inserir(33);
        inserir(27);
        inserir(25);
        inserir(24);
        inserir(26);
        inserir(29);
        inserir(28);
        inserir(31);
        inserir(30);
        inserir(32);
        inserir(41);
        inserir(39);
        inserir(35);
        inserir(34);
        inserir(37);
        inserir(36);
        inserir(38);
        inserir(40);
        inserir(47);
        inserir(43);
        inserir(42);
        inserir(45);
        inserir(44);
        inserir(46);
        inserir(53);
        inserir(51);
        inserir(49);
        inserir(48);
        inserir(50);
        inserir(52);
        inserir(59);
        inserir(55);
        inserir(54);
        inserir(57);
        inserir(56);
        inserir(58);
        inserir(63);
        inserir(61);
        inserir(60);
        inserir(62);
        inserir(67);
        inserir(65);
        inserir(64);
        inserir(66);
        inserir(71);
        inserir(69);
        inserir(68);
        inserir(70);
        inserir(75);
        inserir(73);
        inserir(72);
        inserir(74);
        inserir(77);
        inserir(76);
        inserir(78);
        inserir(147);
        inserir(89);
        inserir(87);
        inserir(81);
        inserir(80);
        inserir(83);
        inserir(82);
        inserir(85);
        inserir(84);
        inserir(86);
        inserir(88);
        inserir(97);
        inserir(91);
        inserir(90);
        inserir(93);
        inserir(92);
        inserir(95);
        inserir(94);
        inserir(96);
        inserir(105);
        inserir(99);
        inserir(98);
        inserir(103);
        inserir(102);
        inserir(104);
        inserir(111);
        inserir(109);
        inserir(107);
        inserir(106);
        inserir(108);
        inserir(110);
        inserir(117);
        inserir(115);
        inserir(113);
        inserir(112);
        inserir(114);
        inserir(116);
        inserir(121);
        inserir(119);
        inserir(118);
        inserir(120);
        inserir(125);
        inserir(123);
        inserir(122);
        inserir(124);
        inserir(129);
        inserir(127);
        inserir(126);
        inserir(128);
        inserir(133);
        inserir(131);
        inserir(130);
        inserir(132);
        inserir(137);
        inserir(135);
        inserir(134);
        inserir(136);
        inserir(141);
        inserir(139);
        inserir(138);
        inserir(140);
        inserir(143);
        inserir(142);
        inserir(145);
        inserir(144);
        inserir(146);
        inserir(193);
        inserir(153);
        inserir(151);
        inserir(149);
        inserir(148);
        inserir(150);
        inserir(152);
        inserir(159);
        inserir(157);
        inserir(155);
        inserir(154);
        inserir(156);
        inserir(158);
        inserir(163);
        inserir(161);
        inserir(160);
        inserir(162);
        inserir(167);
        inserir(165);
        inserir(164);
        inserir(166);
        inserir(171);
        inserir(169);
        inserir(168);
        inserir(170);
        inserir(175);
        inserir(173);
        inserir(172);
        inserir(174);
        inserir(179);
        inserir(177);
        inserir(176);
        inserir(178);
        inserir(183);
        inserir(181);
        inserir(180);
        inserir(182);
        inserir(185);
        inserir(184);
        inserir(187);
        inserir(186);
        inserir(189);
        inserir(188);
        inserir(191);
        inserir(190);
        inserir(192);
        inserir(231);
        inserir(199);
        inserir(197);
        inserir(195);
        inserir(194);
        inserir(196);
        inserir(198);
        inserir(205);
        inserir(201);
        inserir(200);
        inserir(203);
        inserir(202);
        inserir(204);
        inserir(211);
        inserir(209);
        inserir(207);
        inserir(206);
        inserir(208);
        inserir(210);
        inserir(215);
        inserir(213);
        inserir(212);
        inserir(214);
        inserir(217);
        inserir(216);
        inserir(219);
        inserir(218);
        inserir(221);
        inserir(220);
        inserir(223);
        inserir(222);
        inserir(225);
        inserir(224);
        inserir(227);
        inserir(226);
        inserir(229);
        inserir(228);
        inserir(230);
        inserir(265);
        inserir(239);
        inserir(237);
        inserir(233);
        inserir(232);
        inserir(235);
        inserir(234);
        inserir(236);
        inserir(238);
        inserir(247);
        inserir(245);
        inserir(241);
        inserir(240);
        inserir(243);
        inserir(242);
        inserir(244);
        inserir(246);
        inserir(253);
        inserir(249);
        inserir(248);
        inserir(251);
        inserir(250);
        inserir(252);
        inserir(259);
        inserir(255);
        inserir(254);
        inserir(257);
        inserir(256);
        inserir(258);
        inserir(263);
        inserir(261);
        inserir(260);
        inserir(262);
        inserir(264);
        inserir(275);
        inserir(271);
        inserir(267);
        inserir(266);
        inserir(269);
        inserir(268);
        inserir(270);
        inserir(273);
        inserir(272);
        inserir(274);
        inserir(279);
        inserir(277);
        inserir(276);
        inserir(278);
        inserir(283);
        inserir(281);
        inserir(280);
        inserir(282);
        inserir(287);
        inserir(285);
        inserir(284);
        inserir(286);
        inserir(289);
        inserir(288);
        inserir(291);
        inserir(290);
        inserir(293);
        inserir(292);
        inserir(295);
        inserir(294);
        inserir(296);
    }
}
