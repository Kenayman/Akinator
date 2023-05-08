-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 07, 2023 at 11:53 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `akilol`
--

-- --------------------------------------------------------

--
-- Table structure for table `arbol`
--

CREATE TABLE `arbol` (
  `nodo` int(11) NOT NULL,
  `texto` varchar(500) NOT NULL,
  `pregunta` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `arbol`
--

INSERT INTO `arbol` (`nodo`, `texto`, `pregunta`) VALUES
(1, 'humano', 1),
(2, 'luchador', 1),
(3, 'mago', 1),
(4, 'femenino', 1),
(5, 'asesino', 1),
(6, 'un semi-dios', 1),
(7, 'luchador', 1),
(17, 'Fiora', 0),
(19, 'Yasuo', 0),
(10, 'de Noxus', 1),
(11, 'tirador', 1),
(12, 'Neeko', 0),
(13, 'Anivia', 0),
(14, 'un cocodrilo', 1),
(15, 'asesino', 1),
(20, 'Talon', 0),
(21, 'Maestro Yi', 0),
(22, 'usuario de armas de fuego', 1),
(23, 'mago', 1),
(28, 'Renekton', 0),
(29, 'Nasus', 0),
(30, 'conocido como \"El Abrazo de la Agonia\"', 1),
(31, 'tirador', 1),
(44, 'Jynx', 0),
(45, 'Lucian', 0),
(46, 'usa magia de piedras', 1),
(47, 'soporte', 1),
(60, 'Evelynn', 0),
(61, 'Nocturne', 0),
(62, 'un Yordle', 1),
(63, 'soporte', 1),
(92, 'Taliyah', 0),
(93, 'Ryze', 0),
(94, 'un aspecto del Monte Targon', 1),
(95, 'una Hermana del Hielo', 1),
(249, 'Tristana', 0),
(125, 'Twitch', 0),
(126, 'un gato', 1),
(127, 'alguien que dice mucho \"OK\"', 1),
(188, 'Taric', 0),
(189, 'Braum', 0),
(190, 'Sejuani', 0),
(191, 'Shen', 0),
(252, 'Yuumi', 0),
(253, 'Janna', 0),
(254, 'Rammus', 0),
(255, 'Cho gath', 0),
(18, 'Darius', 0),
(9, 'usuario de hacha', 1),
(8, 'de Zaun', 1),
(16, 'Vi', 0),
(124, 'consume hongos', 1),
(248, 'Teemo', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
