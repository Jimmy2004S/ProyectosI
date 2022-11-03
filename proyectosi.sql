-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2022 a las 07:25:51
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectosi`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `codigo` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `identificacion` varchar(20) NOT NULL,
  `cargo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`codigo`, `Nombre`, `identificacion`, `cargo`) VALUES
(1, 'Carlos Alvarez', '104312945', 'Investigador principal'),
(2, 'Pedro Rosales', '12343343', 'Investigador principal'),
(3, 'ji', '123', 'Autor'),
(4, 'Francisco Luna', '213442323', 'Autor'),
(7, 'sdfs', 'dsfsdf', 'Autor'),
(8, 'aqsdasdsa', '123', 'Autor'),
(9, 'dasdas', '123', 'Autor'),
(10, 'dasdas', '123', 'Investigador principal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

CREATE TABLE `proyectos` (
  `Codigo` int(11) NOT NULL,
  `Acronimo` varchar(30) NOT NULL,
  `LiderProyecto` varchar(40) NOT NULL,
  `Objetivo` varchar(200) NOT NULL,
  `Fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`Codigo`, `Acronimo`, `LiderProyecto`, `Objetivo`, `Fecha`) VALUES
(1, 'Procesos Administrativo', 'Carlos Alvarez', 'Llevar el control y optimizar el manejo de la informacion', '2022-11-01 01:11:56'),
(3, 'Sistema solar', 'Carlos Alvarez', 'Estudiar el universo', '2022-11-01 02:25:29'),
(5, 'Partido', '123', 'dfdsfds', '2022-11-01 21:29:50'),
(6, 'czxcz', 'zczxc', 'xzczcxz', '2022-11-01 21:42:30'),
(8, 'dsfsd', 'fdssdfdsf', 'dsfds', '2022-11-03 05:08:56'),
(9, 'asdasd', '123', 'dsdfdsfdsfdsfsd', '2022-11-03 06:11:44'),
(10, 'asdasddfdsfdsfds', '123', 'ddfdsfdsdfdsfdsfdsfsd', '2022-11-03 06:11:53'),
(11, 'asdasddfdsfdsfdsdfdsfds', '123', 'ddfdsfdsdfdsfdsfdsdsfdsfsd', '2022-11-03 06:11:59'),
(12, 'asdasddfdsfdsfdsdfdsfdsfdssdfs', '123', 'ddfdsfdsdfdsfdsfdsdsfdsfsd', '2022-11-03 06:12:07');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`Codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
