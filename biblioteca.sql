-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-05-2018 a las 04:21:25
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

DROP TABLE IF EXISTS `administradores`;
CREATE TABLE IF NOT EXISTS `administradores` (
  `id_u` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) DEFAULT NULL,
  `cargo` varchar(70) DEFAULT NULL,
  `nombre_u` varchar(70) DEFAULT NULL,
  `contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`id_u`),
  KEY `id_u` (`id_u`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id_c` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) DEFAULT NULL,
  `rut` int(11) DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `libro_p` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_c`),
  KEY `id_c` (`id_c`,`libro_p`),
  KEY `libro_p` (`libro_p`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_c`, `nombre`, `rut`, `direccion`, `libro_p`) VALUES
(1, 'Dilan Cardenas', 197503246, 'melipilla', 1),
(2, 'Marcelo Cisterna', 1234567, 'no se men', 6),
(3, 'dilan', 7654356, 'pasaje las palomas s/n', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

DROP TABLE IF EXISTS `libros`;
CREATE TABLE IF NOT EXISTS `libros` (
  `id_l` int(11) NOT NULL AUTO_INCREMENT,
  `libro` varchar(70) DEFAULT NULL,
  `autor` varchar(70) DEFAULT NULL,
  `genero` varchar(70) DEFAULT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`id_l`),
  KEY `id_l` (`id_l`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_l`, `libro`, `autor`, `genero`, `stock`) VALUES
(1, 'It', 'Stephen King', 'Terror', 8),
(2, 'Harry Potter y la piedra filosofal', 'J. K. Rowling', 'Literatura fantástica', 3),
(3, 'Papelucho y el marciano', 'Marcela Paz', 'infantil', 7),
(4, 'El señor de los anillos', 'J. R. R. Tolkien', 'Literatura fantastica, Ficcion de aventuras', 2),
(5, 'Las aventuras de Sherlock Holmes', 'Arthur Conan Doyle', 'ficcion, policial, misterio', 6),
(6, 'Asylum', 'Madeleine Roux', 'Ficcion, Misterio, paranormal', 5);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`libro_p`) REFERENCES `libros` (`id_l`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
