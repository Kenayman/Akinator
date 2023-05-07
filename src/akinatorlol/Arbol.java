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

    public void insertar(int valor) {
        if (raiz == null) {
            raiz = insertar(raiz, valor);
        } else {
            insertar(raiz, valor);
            //valida();
        }

    }

    public No insertar(No no, int valor) {

        if (no == null) {
            no = new No(valor);
        } else {
            //aqui vem as comparacoes da arvore
            if (no.getvalor < valor) {
                if (no.getDir() == null) {
                    no.Dir = insertar(no.Dir, valor);
                } else {
                    insertar(no.getDir(), valor);
                }

            }

            if (no.getvalor > valor) {
                if (no.getEsq() == null) {
                    no.Esq = insertar(no.Esq, valor);
                } else {
                    insertar(no.getEsq(), valor);
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

    public void CrearArbol() {
        Arbol.this.insertar(79);
        Arbol.this.insertar(13);
        Arbol.this.insertar(7);
        Arbol.this.insertar(3);
        Arbol.this.insertar(1);
        Arbol.this.insertar(0);
        Arbol.this.insertar(2);
        Arbol.this.insertar(5);
        Arbol.this.insertar(4);
        Arbol.this.insertar(6);
        Arbol.this.insertar(9);
        Arbol.this.insertar(8);
        Arbol.this.insertar(11);
        Arbol.this.insertar(10);
        Arbol.this.insertar(12);
        Arbol.this.insertar(23);
        Arbol.this.insertar(21);
        Arbol.this.insertar(15);
        Arbol.this.insertar(14);
        Arbol.this.insertar(17);
        Arbol.this.insertar(16);
        Arbol.this.insertar(19);
        Arbol.this.insertar(18);
        Arbol.this.insertar(20);
        Arbol.this.insertar(22);
        Arbol.this.insertar(33);
        Arbol.this.insertar(27);
        Arbol.this.insertar(25);
        Arbol.this.insertar(24);
        Arbol.this.insertar(26);
        Arbol.this.insertar(29);
        Arbol.this.insertar(28);
        Arbol.this.insertar(31);
        Arbol.this.insertar(30);
        Arbol.this.insertar(32);
        Arbol.this.insertar(41);
        Arbol.this.insertar(39);
        Arbol.this.insertar(35);
        Arbol.this.insertar(34);
        Arbol.this.insertar(37);
        Arbol.this.insertar(36);
        Arbol.this.insertar(38);
        Arbol.this.insertar(40);
        Arbol.this.insertar(47);
        Arbol.this.insertar(43);
        Arbol.this.insertar(42);
        Arbol.this.insertar(45);
        Arbol.this.insertar(44);
        Arbol.this.insertar(46);
        Arbol.this.insertar(53);
        Arbol.this.insertar(51);
        Arbol.this.insertar(49);
        Arbol.this.insertar(48);
        Arbol.this.insertar(50);
        Arbol.this.insertar(52);
        Arbol.this.insertar(59);
        Arbol.this.insertar(55);
        Arbol.this.insertar(54);
        Arbol.this.insertar(57);
        Arbol.this.insertar(56);
        Arbol.this.insertar(58);
        Arbol.this.insertar(63);
        Arbol.this.insertar(61);
        Arbol.this.insertar(60);
        Arbol.this.insertar(62);
        Arbol.this.insertar(67);
        Arbol.this.insertar(65);
        Arbol.this.insertar(64);
        Arbol.this.insertar(66);
        Arbol.this.insertar(71);
        Arbol.this.insertar(69);
        Arbol.this.insertar(68);
        Arbol.this.insertar(70);
        Arbol.this.insertar(75);
        Arbol.this.insertar(73);
        Arbol.this.insertar(72);
        Arbol.this.insertar(74);
        Arbol.this.insertar(77);
        Arbol.this.insertar(76);
        Arbol.this.insertar(78);
        Arbol.this.insertar(147);
        Arbol.this.insertar(89);
        Arbol.this.insertar(87);
        Arbol.this.insertar(81);
        Arbol.this.insertar(80);
        Arbol.this.insertar(83);
        Arbol.this.insertar(82);
        Arbol.this.insertar(85);
        Arbol.this.insertar(84);
        Arbol.this.insertar(86);
        Arbol.this.insertar(88);
        Arbol.this.insertar(97);
        Arbol.this.insertar(91);
        Arbol.this.insertar(90);
        Arbol.this.insertar(93);
        Arbol.this.insertar(92);
        Arbol.this.insertar(95);
        Arbol.this.insertar(94);
        Arbol.this.insertar(96);
        Arbol.this.insertar(105);
        Arbol.this.insertar(99);
        Arbol.this.insertar(98);
        Arbol.this.insertar(103);
        Arbol.this.insertar(102);
        Arbol.this.insertar(104);
        Arbol.this.insertar(111);
        Arbol.this.insertar(109);
        Arbol.this.insertar(107);
        Arbol.this.insertar(106);
        Arbol.this.insertar(108);
        Arbol.this.insertar(110);
        Arbol.this.insertar(117);
        Arbol.this.insertar(115);
        Arbol.this.insertar(113);
        Arbol.this.insertar(112);
        Arbol.this.insertar(114);
        Arbol.this.insertar(116);
        Arbol.this.insertar(121);
        Arbol.this.insertar(119);
        Arbol.this.insertar(118);
        Arbol.this.insertar(120);
        Arbol.this.insertar(125);
        Arbol.this.insertar(123);
        Arbol.this.insertar(122);
        Arbol.this.insertar(124);
        Arbol.this.insertar(129);
        Arbol.this.insertar(127);
        Arbol.this.insertar(126);
        Arbol.this.insertar(128);
        Arbol.this.insertar(133);
        Arbol.this.insertar(131);
        Arbol.this.insertar(130);
        Arbol.this.insertar(132);
        Arbol.this.insertar(137);
        Arbol.this.insertar(135);
        Arbol.this.insertar(134);
        Arbol.this.insertar(136);
        Arbol.this.insertar(141);
        Arbol.this.insertar(139);
        Arbol.this.insertar(138);
        Arbol.this.insertar(140);
        Arbol.this.insertar(143);
        Arbol.this.insertar(142);
        Arbol.this.insertar(145);
        Arbol.this.insertar(144);
        Arbol.this.insertar(146);
        Arbol.this.insertar(193);
        Arbol.this.insertar(153);
        Arbol.this.insertar(151);
        Arbol.this.insertar(149);
        Arbol.this.insertar(148);
        Arbol.this.insertar(150);
        Arbol.this.insertar(152);
        Arbol.this.insertar(159);
        Arbol.this.insertar(157);
        Arbol.this.insertar(155);
        Arbol.this.insertar(154);
        Arbol.this.insertar(156);
        Arbol.this.insertar(158);
        Arbol.this.insertar(163);
        Arbol.this.insertar(161);
        Arbol.this.insertar(160);
        Arbol.this.insertar(162);
        Arbol.this.insertar(167);
        Arbol.this.insertar(165);
        Arbol.this.insertar(164);
        Arbol.this.insertar(166);
        Arbol.this.insertar(171);
        Arbol.this.insertar(169);
        Arbol.this.insertar(168);
        Arbol.this.insertar(170);
        Arbol.this.insertar(175);
        Arbol.this.insertar(173);
        Arbol.this.insertar(172);
        Arbol.this.insertar(174);
        Arbol.this.insertar(179);
        Arbol.this.insertar(177);
        Arbol.this.insertar(176);
        Arbol.this.insertar(178);
        Arbol.this.insertar(183);
        Arbol.this.insertar(181);
        Arbol.this.insertar(180);
        Arbol.this.insertar(182);
        Arbol.this.insertar(185);
        Arbol.this.insertar(184);
        Arbol.this.insertar(187);
        Arbol.this.insertar(186);
        Arbol.this.insertar(189);
        Arbol.this.insertar(188);
        Arbol.this.insertar(191);
        Arbol.this.insertar(190);
        Arbol.this.insertar(192);
        Arbol.this.insertar(231);
        Arbol.this.insertar(199);
        Arbol.this.insertar(197);
        Arbol.this.insertar(195);
        Arbol.this.insertar(194);
        Arbol.this.insertar(196);
        Arbol.this.insertar(198);
        Arbol.this.insertar(205);
        Arbol.this.insertar(201);
        Arbol.this.insertar(200);
        Arbol.this.insertar(203);
        Arbol.this.insertar(202);
        Arbol.this.insertar(204);
        Arbol.this.insertar(211);
        Arbol.this.insertar(209);
        Arbol.this.insertar(207);
        Arbol.this.insertar(206);
        Arbol.this.insertar(208);
        Arbol.this.insertar(210);
        Arbol.this.insertar(215);
        Arbol.this.insertar(213);
        Arbol.this.insertar(212);
        Arbol.this.insertar(214);
        Arbol.this.insertar(217);
        Arbol.this.insertar(216);
        Arbol.this.insertar(219);
        Arbol.this.insertar(218);
        Arbol.this.insertar(221);
        Arbol.this.insertar(220);
        Arbol.this.insertar(223);
        Arbol.this.insertar(222);
        Arbol.this.insertar(225);
        Arbol.this.insertar(224);
        Arbol.this.insertar(227);
        Arbol.this.insertar(226);
        Arbol.this.insertar(229);
        Arbol.this.insertar(228);
        Arbol.this.insertar(230);
        Arbol.this.insertar(265);
        Arbol.this.insertar(239);
        Arbol.this.insertar(237);
        Arbol.this.insertar(233);
        Arbol.this.insertar(232);
        Arbol.this.insertar(235);
        Arbol.this.insertar(234);
        Arbol.this.insertar(236);
        Arbol.this.insertar(238);
        Arbol.this.insertar(247);
        Arbol.this.insertar(245);
        Arbol.this.insertar(241);
        Arbol.this.insertar(240);
        Arbol.this.insertar(243);
        Arbol.this.insertar(242);
        Arbol.this.insertar(244);
        Arbol.this.insertar(246);
        Arbol.this.insertar(253);
        Arbol.this.insertar(249);
        Arbol.this.insertar(248);
        Arbol.this.insertar(251);
        Arbol.this.insertar(250);
        Arbol.this.insertar(252);
        Arbol.this.insertar(259);
        Arbol.this.insertar(255);
        Arbol.this.insertar(254);
        Arbol.this.insertar(257);
        Arbol.this.insertar(256);
        Arbol.this.insertar(258);
        Arbol.this.insertar(263);
        Arbol.this.insertar(261);
        Arbol.this.insertar(260);
        Arbol.this.insertar(262);
        Arbol.this.insertar(264);
        Arbol.this.insertar(275);
        Arbol.this.insertar(271);
        Arbol.this.insertar(267);
        Arbol.this.insertar(266);
        Arbol.this.insertar(269);
        Arbol.this.insertar(268);
        Arbol.this.insertar(270);
        Arbol.this.insertar(273);
        Arbol.this.insertar(272);
        Arbol.this.insertar(274);
        Arbol.this.insertar(279);
        Arbol.this.insertar(277);
        Arbol.this.insertar(276);
        Arbol.this.insertar(278);
        Arbol.this.insertar(283);
        Arbol.this.insertar(281);
        Arbol.this.insertar(280);
        Arbol.this.insertar(282);
        Arbol.this.insertar(287);
        Arbol.this.insertar(285);
        Arbol.this.insertar(284);
        Arbol.this.insertar(286);
        Arbol.this.insertar(289);
        Arbol.this.insertar(288);
        Arbol.this.insertar(291);
        Arbol.this.insertar(290);
        Arbol.this.insertar(293);
        Arbol.this.insertar(292);
        Arbol.this.insertar(295);
        Arbol.this.insertar(294);
        Arbol.this.insertar(296);
    }
}
