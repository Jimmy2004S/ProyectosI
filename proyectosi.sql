-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2022 a las 04:33:03
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
(33, 'Jimmy Jimenez', '1043635986', 'Administrador'),
(34, 'ji', '134', 'Profesor'),
(36, 'Esteban Martinez', '3308199', 'Profesor'),
(41, 'Marcos', '123', 'Autor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

CREATE TABLE `proyectos` (
  `Codigo` int(200) NOT NULL,
  `Acronimo` varchar(30) NOT NULL,
  `LiderProyecto` varchar(40) NOT NULL,
  `id_profesor` varchar(20) NOT NULL,
  `Objetivo` varchar(200) NOT NULL,
  `Fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`Codigo`, `Acronimo`, `LiderProyecto`, `id_profesor`, `Objetivo`, `Fecha`) VALUES
(25, 'Sistema Solar', 'Esteban Martinez', '3308199', 'Observar el universo', '2022-11-04 01:00:08'),
(26, 'adasdasd', 'ji', '134', 'dfsdfs', '2022-11-04 02:06:32'),
(27, 'adasdasddddddd', 'ji', '134', 'dfsdfs', '2022-11-04 02:06:37'),
(28, 'adasdasdddddddsd', 'ji', '134', 'sdsddfsdfs', '2022-11-04 02:06:44'),
(29, 'adasdasdddddddsddd', 'Esteban Martinez', '3308199', 'sdsddfsdfs', '2022-11-04 02:06:56'),
(30, 'adasdas', 'Esteban Martinez', '3308199', 'sdsddfsdfs', '2022-11-04 02:07:03'),
(31, 'adasdasdadasda', 'Marcos', '123', 'sdsddfsdfs', '2022-11-04 02:07:45'),
(32, 'adasdasdadasdaadas', 'Marcos', '123', 'sdsddfsdfs', '2022-11-04 02:07:49'),
(33, 'adasdasdadasdaadasad', 'Marcos', '123', 'sdsddfsdfssada', '2022-11-04 02:07:52');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `identificacion` (`identificacion`),
  ADD KEY `identificacion_2` (`identificacion`);

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
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  MODIFY `Codigo` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
