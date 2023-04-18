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
public class Arbol {

    private No raiz;
    public No temp;

    public Arbol() {
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
pergunta = "¿Tu personaje usa hacha o espada?";
}
if (valor.getvalor == 1) {
pergunta = "¿Tu personaje se vuelve inmortal?";
}
if (valor.getvalor == 0) {
pergunta = "Tryndamere el Rey Bárbaro";
}
if (valor.getvalor == 2) {
pergunta = "Olaf el Berserker";
}
if (valor.getvalor == 5) {
pergunta = "¿Tu personaje tiene un barril?";
}
if (valor.getvalor == 4) {
pergunta = "Gragas el Tromba";
}
if (valor.getvalor == 6) {
pergunta = "Udyr el Caminante Espiritual";
}
if (valor.getvalor == 9) {
pergunta = "¿Tu personaje es conocido como el rey de los trolls?";
}
if (valor.getvalor == 8) {
pergunta = "Trundle el Rey Troll";
}
if (valor.getvalor == 11) {
pergunta = "¿Tu personaje es un Yordle?";
}
if (valor.getvalor == 10) {
pergunta = "Gnar el Yordle Prehistórico";
}
if (valor.getvalor == 12) {
pergunta = "Volibear el Rugido del Trueno";
}
if (valor.getvalor == 23) {
pergunta = "¿Tu personaje es de Ionia?";
}
if (valor.getvalor == 21) {
pergunta = "¿Tu personaje es un hombre?";
}
if (valor.getvalor == 15) {
pergunta = "¿Tu personaje es ciego?";
}
if (valor.getvalor == 14) {
pergunta = "Lee Sin el Monje Ciego";
}
if (valor.getvalor == 17) {
pergunta = "¿Tu personaje tiene el título de 'jefe'?";
}
if (valor.getvalor == 16) {
pergunta = "Sett el Jefe";
}
if (valor.getvalor == 19) {
pergunta = "¿Tu personaje crea una pared de viento en alguna habilidad?";
}
if (valor.getvalor == 18) {
pergunta = "Yasuo el Imperdonable";
}
if (valor.getvalor == 20) {
pergunta = "Wukong el Rey Mono";
}
if (valor.getvalor == 22) {
pergunta = "Irelia la Bailarina de las Cuchillas";
}
if (valor.getvalor == 33) {
pergunta = "¿Tu personaje es de Demacia?";
}
if (valor.getvalor == 27) {
pergunta = "¿Tu personaje es un hombre?";
}
if (valor.getvalor == 25) {
pergunta = "¿Tu personaje tiene el título 'el Poder de Demacia'?";
}
if (valor.getvalor == 24) {
pergunta = "Garen el Poder de Demacia";
}
if (valor.getvalor == 26) {
pergunta = "Xin Zhao el Mayordomo de Demacia";
}
       if (valor.getvalor == 29) {
pergunta = "¿Es tu personaje medio dragón?";
}
if (valor.getvalor == 28) {
pergunta = "Shyvana la Dragóna";
}
if (valor.getvalor == 31) {
pergunta = "¿Es tu personaje el duelista más temido de todo Valoran?";
}
if (valor.getvalor == 30) {
pergunta = "Fiora la Gran Duelista";
}
if (valor.getvalor == 32) {
pergunta = "Kayle la Justa";
}
if (valor.getvalor == 41) {
pergunta = "¿Es tu personaje de Noxus?";
}
if (valor.getvalor == 39) {
pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 35) {
pergunta = "¿Tiene tu personaje el título 'la Mano de Noxus'?";
}
if (valor.getvalor == 34) {
pergunta = "Darius la Mano de Noxus";
}
if (valor.getvalor == 37) {
pergunta = "¿Tiene tu personaje una montura?";
}
if (valor.getvalor == 36) {
pergunta = "Kled el Jinete Desenfrenado";
}
if (valor.getvalor == 38) {
pergunta = "Mordekaiser el Revenant de Hierro";
}
if (valor.getvalor == 40) {
pergunta = "Riven la Desterrada";
}
if (valor.getvalor == 47) {
pergunta = "¿Es tu personaje de Zaun?";
}
if (valor.getvalor == 43) {
pergunta = "¿Tu personaje huele la sangre?";
}
if (valor.getvalor == 42) {
pergunta = "Warwick la Furia Desatada de Zaun";
}
if (valor.getvalor == 45) {
pergunta = "¿Tiene tu personaje el título 'el Loco de Zaun'?";
}
if (valor.getvalor == 44) {
pergunta = "Dr. Mundo el Loco de Zaun";
}
if (valor.getvalor == 46) {
pergunta = "Urgot el Acorazado";
}
if (valor.getvalor == 53) {
pergunta = "¿Es tu personaje de Shurima?";
}
if (valor.getvalor == 51) {
pergunta = "¿Tu personaje tiene una rivalidad con su hermano?";
}
if (valor.getvalor == 49) {
pergunta = "¿Tu personaje acumula furia en su pasiva?";
}
if (valor.getvalor == 48) {
pergunta = "Renekton el Carnicero de las Arenas";
}
        if (valor.getvalor == 50) {
    pergunta = "Nasus el Curador de las Arenas";
}
if (valor.getvalor == 52) {
    pergunta = "Skarner el Vanguardia de Cristal";
}
if (valor.getvalor == 59) {
    pergunta = "¿Es tu personaje de Piltover?";
}
if (valor.getvalor == 55) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 54) {
    pergunta = "Jayce el Defensor del Mañana";
}
if (valor.getvalor == 57) {
    pergunta = "¿Es tu personaje una antigua criminal de las calles despiadadas de Zaun?";
}
if (valor.getvalor == 56) {
    pergunta = "Vi la Defensora de Piltover";
}
if (valor.getvalor == 58) {
    pergunta = "Camille la Sombra de Acero";
}
if (valor.getvalor == 63) {
    pergunta = "¿Es tu personaje de Runeterra?";
}
if (valor.getvalor == 61) {
    pergunta = "¿Usa tu personaje un poste como arma?";
}
if (valor.getvalor == 60) {
    pergunta = "Jax el Gran Maestro de las Armas";
}
if (valor.getvalor == 62) {
    pergunta = "Aatrox la Espada Darkin";
}
if (valor.getvalor == 67) {
    pergunta = "¿Es tu personaje de Aguas Estancadas?";
}
if (valor.getvalor == 65) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 64) {
    pergunta = "Gangplank el Terror de los Doce Mares";
}
if (valor.getvalor == 66) {
    pergunta = "Illaoi la Sacerdotisa Kraken";
}
if (valor.getvalor == 71) {
    pergunta = "¿Es tu personaje de las Islas de las Sombras?";
}
if (valor.getvalor == 69) {
    pergunta = "¿Invoca tu personaje a la doncella de la niebla?";
}
if (valor.getvalor == 68) {
    pergunta = "Yorick el Pastor de Almas";
}
if (valor.getvalor == 70) {
    pergunta = "Hecarim la Sombra de la Guerra";
}
if (valor.getvalor == 75) {
    pergunta = "¿Es tu personaje de Targon?";
}
if (valor.getvalor == 73) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 72) {
    pergunta = "Pantheon la Lanza Indestructible";
}
if (valor.getvalor == 74) {
    pergunta = "Diana el Desdén de la Luna";
}
if (valor.getvalor == 77) {
    pergunta = "¿Es tu personaje del Vacío?";
}
if (valor.getvalor == 76) {
    pergunta = "Rek'Sai la Excavadora del Vacío";
}
if (valor.getvalor == 78) {
    pergunta = "Rumble la Amenaza Mecánica";
}
if (valor.getvalor == 147) {
    pergunta = "¿Es tu personaje un mago?";
}
if (valor.getvalor == 89) {
    pergunta = "¿Es tu personaje de Runeterra?";
}
if (valor.getvalor == 87) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 81) {
    pergunta = "¿Es tu personaje un dragón?";
}
if (valor.getvalor == 80) {
    pergunta = "Aurelion Sol el Forjador de Estrellas";
}
if (valor.getvalor == 83) {
    pergunta = "¿Tiene tu personaje el cuerpo en llamas?";
}
if (valor.getvalor == 82) {
    pergunta = "Brand la Venganza Flameante";
}
if (valor.getvalor == 85) {
    pergunta = "¿Tiene tu personaje el título de 'el Mago Rúnico'?";
}
if (valor.getvalor == 84) {
    pergunta = "Ryze el Mago Rúnico";
}
if (valor.getvalor == 86) {
    pergunta = "Fiddlesticks el Mensajero de la Muerte";
}
if (valor.getvalor == 88) {
    pergunta = "Annie la Niña Oscura";
}
if (valor.getvalor == 97) {
    pergunta = "¿Es tu personaje de Ionia?";
}
if (valor.getvalor == 91) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 90) {
    pergunta = "Kennen el Corazón de la Tormenta";
}
if (valor.getvalor == 93) {
    pergunta = "¿Es tu personaje una zorra?";
}
if (valor.getvalor == 92) {
    pergunta = "Ahri la Zorra de Nueve Colas";
}
if (valor.getvalor == 95) {
    pergunta = "¿Tiene tu personaje el título de 'Sombra Soberana'?";
}
if (valor.getvalor == 94) {
    pergunta = "Syndra la Sombra Soberana";
}
if (valor.getvalor == 96) {
    pergunta = "Karma la Iluminada";
}
if (valor.getvalor == 105) {
    pergunta = "¿Es tu personaje de Demacia?";
}
if (valor.getvalor == 99) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 98) {
    pergunta = "Sylas el Abjugado";
}
if (valor.getvalor == 103) {
    pergunta = "¿Tiene tu personaje una parte celestial?";
}
if (valor.getvalor == 102) {
    pergunta = "Morgana la Caída";
}
if (valor.getvalor == 104) {
     pergunta = "Lux la Dama de Luz";
}
if (valor.getvalor == 111) {
    pergunta = "¿Tu personaje es de Noxus?";
}
if (valor.getvalor == 109) {
    pergunta = "¿Tu personaje es hombre?";
}
if (valor.getvalor == 107) {
    pergunta = "¿Tu personaje tiene el título 'el Sanguinario Escarlata'?";
}
if (valor.getvalor == 106) {
    pergunta = "Vladimir el Sanguinario Escarlata";
}
if (valor.getvalor == 108) {
    pergunta = "Swain el Maestro de la Estrategia";
}
if (valor.getvalor == 110) {
    pergunta = "Cassiopeia el Abrazo de la Serpiente";
}
if (valor.getvalor == 117) {
    pergunta = "¿Tu personaje es de Shurima?";
}
if (valor.getvalor == 115) {
    pergunta = "¿Tu personaje es hombre?";
}
if (valor.getvalor == 113) {
    pergunta = "¿Tu personaje tiene el título 'el Emperador de las Arenas'?";
}
if (valor.getvalor == 112) {
    pergunta = "Azir el Emperador de las Arenas";
}
if (valor.getvalor == 114) {
    pergunta = "Xerath el Mago Ascendente";
}
if (valor.getvalor == 116) {
    pergunta = "Taliyah la Tejedora de Piedras";
}
if (valor.getvalor == 121) {
    pergunta = "¿Tu personaje es de Freljord?";
}
if (valor.getvalor == 119) {
    pergunta = "¿Tu personaje tiene el título 'la Criofénix'?";
}
if (valor.getvalor == 118) {
    pergunta = "Anivia la Criofénix";
}
if (valor.getvalor == 120) {
    pergunta = "Lissandra la Bruja Gélida";
}
if (valor.getvalor == 125) {
    pergunta = "¿Tu personaje es de Zaun?";
}
if (valor.getvalor == 123) {
    pergunta = "¿Tu personaje es especialista en Hexplosivos?";
}
if (valor.getvalor == 122) {
    pergunta = "Ziggs el Especialista en Hexplosivos";
}
if (valor.getvalor == 124) {
    pergunta = "Viktor el Heraldo de las Máquinas";
}
if (valor.getvalor == 129) {
    pergunta = "¿Tu personaje es de Piltover?";
}
if (valor.getvalor == 127) {
    pergunta = "¿Tu personaje es hombre?";
}
if (valor.getvalor == 126) {
    pergunta = "Heimerdinger el Inventor Idolatrado";
}
if (valor.getvalor == 128) {
    pergunta = "Orianna la Doncella Mecánica";
}
if (valor.getvalor == 133) {
    pergunta = "¿Tu personaje es de las Islas de las Sombras?";
}
        if (valor.getvalor == 131) {
pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 130) {
pergunta = "Karthus la Voz Mortal";
}
if (valor.getvalor == 132) {
pergunta = "Elise la Reina Araña";
}
if (valor.getvalor == 137) {
pergunta = "¿Es tu personaje del Vacío?";
}
if (valor.getvalor == 135) {
pergunta = "¿Tiene tu personaje el título 'El Ojo del Vacío'?";
}
if (valor.getvalor == 134) {
pergunta = "Vel'Koz el Ojo del Vacío";
}
if (valor.getvalor == 136) {
pergunta = "Malzahar el Profeta del Vacío";
}
if (valor.getvalor == 141) {
pergunta = "¿Es tu personaje de Ixtal?";
}
if (valor.getvalor == 139) {
pergunta = "¿Es tu personaje un Camaleón?";
}
if (valor.getvalor == 138) {
pergunta = "Neeko la Curiosa Camaleona";
}
if (valor.getvalor == 140) {
pergunta = "Zyra la Ascensión de las Espinas";
}
if (valor.getvalor == 143) {
pergunta = "¿Es tu personaje de Aguas Estancadas?";
}
if (valor.getvalor == 142) {
pergunta = "Twisted Fate el Maestro de las Cartas";
}
if (valor.getvalor == 145) {
pergunta = "¿Es tu personaje de Targon?";
}
if (valor.getvalor == 144) {
pergunta = "Zoe el Aspecto del Crepúsculo";
}
if (valor.getvalor == 146) {
pergunta = "Veigar el Pequeño Maestro del Mal";
}
if (valor.getvalor == 193) {
pergunta = "¿Es tu personaje un Tirador?";
}
if (valor.getvalor == 153) {
pergunta = "¿Es tu personaje de Ionia?";
}
if (valor.getvalor == 151) {
pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 149) {
pergunta = "¿Es tu personaje conocido por el 4 hit?";
}
if (valor.getvalor == 148) {
pergunta = "Jhin el Virtuoso";
}
if (valor.getvalor == 150) {
pergunta = "Varus la Flecha de la Venganza";
}
if (valor.getvalor == 152) {
pergunta = "Xayah la Rebelde";
}
if (valor.getvalor == 159) {
pergunta = "¿Es tu personaje de Bandle City?";
}
if (valor.getvalor == 157) {
pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 155) {
pergunta = "¿Tiene tu personaje un avión?";
}
if (valor.getvalor == 154) {
pergunta = "Corki el Bombardero Osado";
}
if (valor.getvalor == 156) {
pergunta = "Teemo el Explorador Veloz";
}
if (valor.getvalor == 158) {
pergunta = "Tristana la Artillera Yordle";
}
if (valor.getvalor == 163) {
pergunta = "¿Tu personaje es de Runeterra?";
}
if (valor.getvalor == 161) {
pergunta = "¿Tu personaje tuvo a su esposa asesinada por Thresh?";
}
if (valor.getvalor == 160) {
pergunta = "Lucian el Purificador";
}
if (valor.getvalor == 162) {
pergunta = "Kindred los Cazadores Eternos";
}
if (valor.getvalor == 167) {
pergunta = "¿Tu personaje es de Demacia?";
}
if (valor.getvalor == 165) {
pergunta = "¿Tu personaje tiene un águila llamada Valor?";
}
if (valor.getvalor == 164) {
pergunta = "Quinn las Alas de Demacia";
}
if (valor.getvalor == 166) {
pergunta = "Vayne la Cazadora Nocturna";
}
if (valor.getvalor == 171) {
pergunta = "¿Tu personaje es de Zaun?";
}
if (valor.getvalor == 169) {
pergunta = "¿Tu personaje es un hombre?";
}
if (valor.getvalor == 168) {
pergunta = "Twitch el Sembrador de la Peste";
}
if (valor.getvalor == 170) {
pergunta = "Jinx el Gatillo Desenfrenado";
}
if (valor.getvalor == 175) {
pergunta = "¿Tu personaje es de Piltover?";
}
if (valor.getvalor == 173) {
pergunta = "¿Tu personaje es un hombre?";
}
if (valor.getvalor == 172) {
pergunta = "Ezreal el Explorador Pródigo";
}
if (valor.getvalor == 174) {
pergunta = "Caitlyn la Sheriff de Piltover";
}
if (valor.getvalor == 179) {
pergunta = "¿Tu personaje es del Vacío?";
}
if (valor.getvalor == 177) {
pergunta = "¿Tu personaje es un hombre?";
}
if (valor.getvalor == 176) {
pergunta = "Kog'Maw la Boca del Abismo";
}
if (valor.getvalor == 178) {
pergunta = "Kai'Sa la Hija del Vacío";
}
if (valor.getvalor == 183) {
pergunta = "¿Tu personaje es de Aguas Estancadas?";
}
        if (valor.getvalor == 181) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 180) {
    pergunta = "Graves, el fugitivo";
}
if (valor.getvalor == 182) {
    pergunta = "Miss Fortune, la cazadora de recompensas";
}
if (valor.getvalor == 185) {
    pergunta = "¿Es tu personaje de Noxus?";
}
if (valor.getvalor == 184) {
    pergunta = "Draven, el verdugo de Noxus";
}
if (valor.getvalor == 187) {
    pergunta = "¿Es tu personaje de Shurima?";
}
if (valor.getvalor == 186) {
    pergunta = "Sivir, la señora de la guerra";
}
if (valor.getvalor == 189) {
    pergunta = "¿Es tu personaje de Freljord?";
}
if (valor.getvalor == 188) {
    pergunta = "Ashe, la arquera del hielo";
}
if (valor.getvalor == 191) {
    pergunta = "¿Es tu personaje de las Islas de la Sombra?";
}
if (valor.getvalor == 190) {
    pergunta = "Kalista, la lanza de la venganza";
}
if (valor.getvalor == 192) {
    pergunta = "Aphelios, el arma de los devotos";
}
if (valor.getvalor == 231) {
    pergunta = "¿Es tu personaje un tanque?";
}
if (valor.getvalor == 199) {
    pergunta = "¿Es tu personaje de Demacia?";
}
if (valor.getvalor == 197) {
    pergunta = "¿Es tu personaje un hombre?";
}
if (valor.getvalor == 195) {
    pergunta = "¿Tiene tu personaje una apariencia humana?";
}
if (valor.getvalor == 194) {
    pergunta = "Jarvan IV, el ejemplo de Demacia";
}
if (valor.getvalor == 196) {
    pergunta = "Galio, el coloso";
}
if (valor.getvalor == 198) {
    pergunta = "Poppy, la guardiana del martillo";
}
if (valor.getvalor == 205) {
    pergunta = "¿Es tu personaje de Zaun?";
}
if (valor.getvalor == 201) {
    pergunta = "¿Tiene tu personaje el título 'el gran golem de vapor'?";
}
if (valor.getvalor == 200) {
    pergunta = "Blitzcrank, el gran golem de vapor";
}
if (valor.getvalor == 203) {
    pergunta = "¿Es tu personaje un alquimista?";
}
if (valor.getvalor == 202) {
    pergunta = "Singed, el químico loco";
}
if (valor.getvalor == 204) {
    pergunta = "Zac, el arma secreta";
}
if (valor.getvalor == 211) {
    pergunta = "¿Es tu personaje de Freljord?";
}
if (valor.getvalor == 209) {
    pergunta = "¿Es tu personaje un hombre?";
}
        if (valor.getvalor == 207) {
pergunta = "¿Tu personaje tiene un yeti?";
}
if (valor.getvalor == 206) {
pergunta = "Nunu y Willump, el niño y su yeti";
}
if (valor.getvalor == 208) {
pergunta = "Ornn, el Fuego bajo la Montaña";
}
if (valor.getvalor == 210) {
pergunta = "Sejuani, la Ira del Invierno";
}
if (valor.getvalor == 215) {
pergunta = "¿Tu personaje es de Shurima?";
}
if (valor.getvalor == 213) {
pergunta = "¿Tu personaje tiene como única frase 'OK'?";
}
if (valor.getvalor == 212) {
pergunta = "Rammus, el Armadillo Blindado";
}
if (valor.getvalor == 214) {
pergunta = "Amumu, la Momia Triste";
}
if (valor.getvalor == 217) {
pergunta = "¿Tu personaje es de Ionia?";
}
if (valor.getvalor == 216) {
pergunta = "Shen, el Ojo del Crepúsculo";
}
if (valor.getvalor == 219) {
pergunta = "¿Tu personaje es de Runeterra?";
}
if (valor.getvalor == 218) {
pergunta = "Alistar, el Minotauro";
}
if (valor.getvalor == 221) {
pergunta = "¿Tu personaje es del Vacío?";
}
if (valor.getvalor == 220) {
pergunta = "Cho'Gath, el Terror del Vacío";
}
if (valor.getvalor == 223) {
pergunta = "¿Tu personaje es de Aguas Estancadas?";
}
if (valor.getvalor == 222) {
pergunta = "Nautilus, el Titán de las Profundidades";
}
if (valor.getvalor == 225) {
pergunta = "¿Tu personaje es de Noxus?";
}
if (valor.getvalor == 224) {
pergunta = "Sion, el Coloso Mortal";
}
if (valor.getvalor == 227) {
pergunta = "¿Tu personaje es de las Islas de las Sombras?";
}
if (valor.getvalor == 226) {
pergunta = "Maokai, el Ente Siniestro";
}
if (valor.getvalor == 229) {
pergunta = "¿Tu personaje es de Targon?";
}
if (valor.getvalor == 228) {
pergunta = "Leona, el Amanecer Radiante";
}
if (valor.getvalor == 230) {
pergunta = "Malphite, el Fragmento del Monolito";
}
if (valor.getvalor == 265) {
pergunta = "¿Tu personaje es un asesino?";
}
if (valor.getvalor == 239) {
pergunta = "¿Tu personaje es de Ionia?";
}
if (valor.getvalor == 237) {
pergunta = "¿Tu personaje es un hombre?";
}
        if (valor.getvalor == 233) {
pergunta = "¿Tiene tu personaje el título 'el Maestro de las Sombras'?";
}
if (valor.getvalor == 232) {
pergunta = "Zed el Maestro de las Sombras";
}
if (valor.getvalor == 235) {
pergunta = "¿Usa tu personaje una espada?";
}
if (valor.getvalor == 234) {
pergunta = "Master Yi el Esgrimista Wuju";
}
if (valor.getvalor == 236) {
pergunta = "Kayn el Segador de las Sombras";
}
if (valor.getvalor == 238) {
pergunta = "Akali la Asesina Renegada";
}
if (valor.getvalor == 247) {
pergunta = "¿Es tu personaje de Runaterra?";
}
if (valor.getvalor == 245) {
pergunta = "¿Es tu personaje hombre?";
}
if (valor.getvalor == 241) {
pergunta = "¿Tiene tu personaje el título 'la Pesadilla Eterna'?";
}
if (valor.getvalor == 240) {
pergunta = "Nocturne la Pesadilla Eterna";
}
if (valor.getvalor == 243) {
pergunta = "¿Es tu personaje un payaso?";
}
if (valor.getvalor == 242) {
pergunta = "Shaco el Bufón Demoníaco";
}
if (valor.getvalor == 244) {
pergunta = "Fizz el Engañador de las Mareas";
}
if (valor.getvalor == 246) {
pergunta = "Evelynn el Abrazo de la Agonía";
}
if (valor.getvalor == 253) {
pergunta = "¿Es tu personaje de Noxus?";
}
if (valor.getvalor == 249) {
pergunta = "¿Es tu personaje hombre?";
}
if (valor.getvalor == 248) {
pergunta = "Talon la Sombra de la Hoja";
}
if (valor.getvalor == 251) {
pergunta = "¿Usa tu personaje una daga?";
}
if (valor.getvalor == 250) {
pergunta = "Katarina la Cuchilla Siniestra";
}
if (valor.getvalor == 252) {
pergunta = "LeBlanc la Farsante";
}
if (valor.getvalor == 259) {
pergunta = "¿Es tu personaje de Ixtal?";
}
if (valor.getvalor == 255) {
pergunta = "¿Es tu personaje hombre?";
}
if (valor.getvalor == 254) {
pergunta = "Rengar el Acechador de la Manada";
}
if (valor.getvalor == 257) {
pergunta = "¿Puede tu personaje transformarse en un animal?";
}
if (valor.getvalor == 256) {
pergunta = "Nidalee la Cazadora Bestial";
}
if (valor.getvalor == 258) {
pergunta = "Qiyana la Emperatriz de los Elementos";
}
       if (valor.getvalor == 263) {
    pergunta = "¿Es tu personaje del Vacío?";
}
if (valor.getvalor == 261) {
    pergunta = "¿Tu personaje ha luchado contra Rengar?";
}
if (valor.getvalor == 260) {
    pergunta = "Kha'Zix, el Cazador del Vacío";
}
if (valor.getvalor == 262) {
    pergunta = "Kassadin, el Caminante del Vacío";
}
if (valor.getvalor == 264) {
    pergunta = "Ekko, el Chico que Rompió el Tiempo";
}
if (valor.getvalor == 275) {
    pergunta = "¿Es tu personaje de Runeterra?";
}
if (valor.getvalor == 271) {
    pergunta = "¿Es tu personaje hombre?";
}
if (valor.getvalor == 267) {
    pergunta = "¿Tiene tu personaje el título de 'rey del río'?";
}
if (valor.getvalor == 266) {
    pergunta = "Tahm Kench, el Rey del Río";
}
if (valor.getvalor == 269) {
    pergunta = "¿Tiene tu personaje el título de 'Guardián del Tiempo'?";
}
if (valor.getvalor == 268) {
    pergunta = "Zilean, el Guardián del Tiempo";
}
if (valor.getvalor == 270) {
    pergunta = "Bardo, el Caminante Protector";
}
if (valor.getvalor == 273) {
    pergunta = "¿Es tu personaje la esposa de Lucian?";
}
if (valor.getvalor == 272) {
    pergunta = "Senna, la Redentora";
}
if (valor.getvalor == 274) {
    pergunta = "Nami, la Invocadora de las Mareas";
}
if (valor.getvalor == 279) {
    pergunta = "¿Es tu personaje de Ionia?";
}
if (valor.getvalor == 277) {
    pergunta = "¿Es tu personaje conocido como el protector del verde?";
}
if (valor.getvalor == 276) {
    pergunta = "Ivern, el Padre del Verde";
}
if (valor.getvalor == 278) {
    pergunta = "Rakan, el Encantador";
}
if (valor.getvalor == 283) {
    pergunta = "¿Es tu personaje de Targon?";
}
if (valor.getvalor == 281) {
    pergunta = "¿Es tu personaje hombre?";
}
if (valor.getvalor == 280) {
    pergunta = "Taric, el Escudo de Valoran";
}
if (valor.getvalor == 282) {
    pergunta = "Soraka, la Hija de las Estrellas";
}
if (valor.getvalor == 287) {
    pergunta = "¿Es tu personaje de Bandle City?";
}
if (valor.getvalor == 285) {
    pergunta = "¿Tiene tu personaje el título de 'el Gato Mágico'?";
}
if (valor.getvalor == 284) {
pergunta = "Yuumi la Gata Mágica";
}
if (valor.getvalor == 286) {
pergunta = "Lulu la Hada Hechicera";
}
if (valor.getvalor == 289) {
pergunta = "¿Tu personaje es de Zaun?";
}
if (valor.getvalor == 288) {
pergunta = "Janna la Furia de la Tormenta";
}
if (valor.getvalor == 291) {
pergunta = "¿Tu personaje es de Demacia?";
}
if (valor.getvalor == 290) {
pergunta = "Sona la Maestra de las Cuerdas";
}
if (valor.getvalor == 293) {
pergunta = "¿Tu personaje es de Freljord?";
}
if (valor.getvalor == 292) {
pergunta = "Braum el Corazón de Freljord";
}
if (valor.getvalor == 295) {
pergunta = "¿Tu personaje es de Aguas Estancadas?";
}
if (valor.getvalor == 294) {
pergunta = "Pyke el Desollador de Aguas Sangrientas";
}
if (valor.getvalor == 296) {
pergunta = "Thresh el Guardián de las Cadenas";
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
