-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Gazdă: 127.0.0.1
-- Timp de generare: ian. 16, 2020 la 03:45 PM
-- Versiune server: 10.1.36-MariaDB
-- Versiune PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Bază de date: `medical`
--

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `analiza`
--

CREATE TABLE `analiza` (
  `cod_analiza` int(11) NOT NULL,
  `categorie` varchar(50) DEFAULT NULL,
  `serviciu` varchar(50) DEFAULT NULL,
  `termen` date NOT NULL,
  `pacient` varchar(55) NOT NULL,
  `pret` int(11) NOT NULL,
  `data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `analiza`
--

INSERT INTO `analiza` (`cod_analiza`, `categorie`, `serviciu`, `termen`, `pacient`, `pret`, `data`) VALUES
(1, 'urocultura', 'gratuit', '2019-11-29', '22', 123, '2019-11-27 21:42:59'),
(2, 'radiografie', 'gratuit', '2019-11-29', 'MAria', 123, '2019-11-27 21:42:59'),
(3, 'radiografie', 'gratuit', '2019-11-29', 'MAria', 123, '2019-11-27 21:42:59'),
(4, 'Radiografie', 'gratuit', '2019-10-15', 'Maria ', 0, '2019-11-28 10:02:26'),
(5, 'Urocultura', 'Taxa', '2019-10-24', 'Olimpia', 125, '2019-11-28 10:02:31');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `bebe`
--

CREATE TABLE `bebe` (
  `cod_bebe` int(4) NOT NULL,
  `nume` varchar(48) NOT NULL,
  `notificare` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `bebe`
--

INSERT INTO `bebe` (`cod_bebe`, `nume`, `notificare`, `data`) VALUES
(1, 'Bariz Fabian', 10, '2019-10-15'),
(2, 'Leopa Filip', 11, '2019-07-30');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `categorieanaliza`
--

CREATE TABLE `categorieanaliza` (
  `cod_categ_analiza` int(11) NOT NULL,
  `denumire` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `consultatie`
--

CREATE TABLE `consultatie` (
  `cod_consultatie` int(11) NOT NULL,
  `medic_cod` int(50) DEFAULT NULL,
  `pacient_cod` int(50) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `observatii` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `consultatie`
--

INSERT INTO `consultatie` (`cod_consultatie`, `medic_cod`, `pacient_cod`, `data`, `observatii`) VALUES
(3, 2, 1, '2019-11-08', 'Hipertiroida');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `cont`
--

CREATE TABLE `cont` (
  `cod_cont` int(11) NOT NULL,
  `cnp` int(13) DEFAULT NULL,
  `rol` varchar(10) DEFAULT NULL,
  `alias` varchar(10) DEFAULT NULL,
  `parola` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `factura`
--

CREATE TABLE `factura` (
  `cod_factura` int(11) NOT NULL,
  `descriere` varchar(50) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `moneda` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `login`
--

CREATE TABLE `login` (
  `id` int(3) NOT NULL,
  `user` varchar(44) NOT NULL,
  `pass` varchar(44) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `login`
--

INSERT INTO `login` (`id`, `user`, `pass`) VALUES
(1, 'medic', 'medic');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `medic`
--

CREATE TABLE `medic` (
  `cod_medic` int(3) NOT NULL,
  `specializare` varchar(50) DEFAULT NULL,
  `nume` varchar(50) DEFAULT NULL,
  `titulatura` varchar(50) DEFAULT NULL,
  `durataconsultatie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `medic`
--

INSERT INTO `medic` (`cod_medic`, `specializare`, `nume`, `titulatura`, `durataconsultatie`) VALUES
(1, 'Chirurgie', 'Dublea Ioan', 'Medic Generalist', 40),
(2, 'Endocrinologie', 'Bariz Luminita', 'Medic Specialist', 30),
(3, 'Cardiologie', 'Fanaca Ionut', 'Medic Specialist', 30),
(4, 'Ginecologie', 'Concita Sorin', 'Medic Rezident', 20);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `notificare`
--

CREATE TABLE `notificare` (
  `cod_vaccin` int(4) NOT NULL,
  `bebe_cod` int(11) NOT NULL,
  `vaccin_cod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `pacient`
--

CREATE TABLE `pacient` (
  `cod_pacient` int(3) NOT NULL,
  `nume` varchar(50) DEFAULT NULL,
  `varsta` char(2) DEFAULT NULL,
  `sex` char(10) DEFAULT NULL,
  `inaltime` int(3) DEFAULT NULL,
  `greutate` int(3) DEFAULT NULL,
  `telefon` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `pacient`
--

INSERT INTO `pacient` (`cod_pacient`, `nume`, `varsta`, `sex`, `inaltime`, `greutate`, `telefon`) VALUES
(1, 'Manole Maria', '21', 'Feminin', 166, 53, 740812966),
(3, 'Jec Valentin', '34', 'M', 162, 60, 774637463),
(4, 'Lefterache Andreea', '22', 'Feminin', 164, 59, 798585645),
(5, 'Calin Doina', '19', 'F', 158, 47, 793562374),
(7, 'Olimpia', '22', 'Feminin', 170, 55, 740987982),
(8, 'Maar', '22', 'Feminin', 123, 22, 740812966),
(9, 'Lumi', '32', 'Feminin', 123, 33, 3445555),
(10, 'miir', '22', 'Feminin', 33, 23, 34234),
(11, 'Msd', '4', 'jhb', 454, 33, 3545),
(12, 'LL', '23', 'bb', 44, 33, 44365),
(13, 'Bordea Catalin', '32', 'Masculin', 176, 69, 740987323),
(14, 'Manole Madalina', '33', 'F', 163, 49, 754678798),
(15, 'Manole Ioan', '26', 'Masculin', 176, 78, 78987655),
(16, 'Chiriac Cristina', '30', 'Feminin', 166, 57, 748483889),
(17, 'Popescu Florin ', '24', 'Masculin', 180, 78, 789654321);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `programare`
--

CREATE TABLE `programare` (
  `cod_programare` int(11) NOT NULL,
  `medic` varchar(50) DEFAULT NULL,
  `pacient` varchar(50) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `achitata` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `programare`
--

INSERT INTO `programare` (`cod_programare`, `medic`, `pacient`, `data`, `achitata`) VALUES
(1, 'Concita Sorin', 'Munteanu Andreea', '2019-01-01', ''),
(2, 'Bariz Luminita', 'Manole Maria', '2019-01-13', NULL),
(3, 'Fanaca Ionut', 'Lefterache Andreea', '2019-01-10', NULL),
(4, 'Dublea Ioan', 'Jec Valentin', '2019-01-15', NULL),
(5, 'Dublea Ioan', 'Calin Doina', '2019-01-16', NULL);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `randfactura`
--

CREATE TABLE `randfactura` (
  `cod_rand_factura` int(11) NOT NULL,
  `pozitie` int(11) DEFAULT NULL,
  `sectia` varchar(50) DEFAULT NULL,
  `serviciu` int(11) DEFAULT NULL,
  `cantitate` int(11) DEFAULT NULL,
  `pret` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `serviciu`
--

CREATE TABLE `serviciu` (
  `cod_serviciu` int(11) NOT NULL,
  `denumire` varchar(255) DEFAULT NULL,
  `moneda` varchar(10) DEFAULT NULL,
  `pret` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `serviciu`
--

INSERT INTO `serviciu` (`cod_serviciu`, `denumire`, `moneda`, `pret`) VALUES
(1, 'Consultatie', 'Lei', 100),
(2, 'Operatie', 'Lei', 500);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `serviciuspecializare`
--

CREATE TABLE `serviciuspecializare` (
  `cod_serviciu_specializare` int(11) NOT NULL,
  `specializare` varchar(50) DEFAULT NULL,
  `serviciu` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `serviciuspecializare`
--

INSERT INTO `serviciuspecializare` (`cod_serviciu_specializare`, `specializare`, `serviciu`) VALUES
(1, 'Chirurgie', 'Operatie'),
(2, 'Endocrinologie', 'Consultatie'),
(3, 'Cardiologie', 'Consultatie'),
(4, 'Ginecologie', 'Consultatie');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `specializare`
--

CREATE TABLE `specializare` (
  `cod_specializare` int(11) NOT NULL,
  `denumire` varchar(50) DEFAULT NULL,
  `descriere` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `specializare`
--

INSERT INTO `specializare` (`cod_specializare`, `denumire`, `descriere`) VALUES
(1, 'Chirurgie', NULL),
(2, 'Ginecologie', NULL),
(3, 'Endocrinologie', NULL),
(4, 'Cardiologie', NULL);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `vaccin`
--

CREATE TABLE `vaccin` (
  `cod_vaccin` int(11) NOT NULL,
  `tip` varchar(33) NOT NULL,
  `timp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Eliminarea datelor din tabel `vaccin`
--

INSERT INTO `vaccin` (`cod_vaccin`, `tip`, `timp`) VALUES
(10, 'Pneumococic', 2),
(11, 'ROR', 4);

--
-- Indexuri pentru tabele eliminate
--

--
-- Indexuri pentru tabele `analiza`
--
ALTER TABLE `analiza`
  ADD PRIMARY KEY (`cod_analiza`),
  ADD KEY `categorie` (`categorie`),
  ADD KEY `serviciu` (`serviciu`);

--
-- Indexuri pentru tabele `bebe`
--
ALTER TABLE `bebe`
  ADD PRIMARY KEY (`cod_bebe`);

--
-- Indexuri pentru tabele `categorieanaliza`
--
ALTER TABLE `categorieanaliza`
  ADD PRIMARY KEY (`cod_categ_analiza`);

--
-- Indexuri pentru tabele `consultatie`
--
ALTER TABLE `consultatie`
  ADD PRIMARY KEY (`cod_consultatie`),
  ADD KEY `medic_cod` (`medic_cod`),
  ADD KEY `pacient_cod` (`pacient_cod`);

--
-- Indexuri pentru tabele `cont`
--
ALTER TABLE `cont`
  ADD PRIMARY KEY (`cod_cont`);

--
-- Indexuri pentru tabele `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`cod_factura`);

--
-- Indexuri pentru tabele `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexuri pentru tabele `medic`
--
ALTER TABLE `medic`
  ADD PRIMARY KEY (`cod_medic`),
  ADD KEY `specializare` (`specializare`);

--
-- Indexuri pentru tabele `notificare`
--
ALTER TABLE `notificare`
  ADD PRIMARY KEY (`cod_vaccin`);

--
-- Indexuri pentru tabele `pacient`
--
ALTER TABLE `pacient`
  ADD PRIMARY KEY (`cod_pacient`);

--
-- Indexuri pentru tabele `programare`
--
ALTER TABLE `programare`
  ADD PRIMARY KEY (`cod_programare`),
  ADD KEY `medic` (`medic`),
  ADD KEY `pacient` (`pacient`);

--
-- Indexuri pentru tabele `randfactura`
--
ALTER TABLE `randfactura`
  ADD PRIMARY KEY (`cod_rand_factura`),
  ADD KEY `serviciu` (`serviciu`);

--
-- Indexuri pentru tabele `serviciu`
--
ALTER TABLE `serviciu`
  ADD PRIMARY KEY (`cod_serviciu`);

--
-- Indexuri pentru tabele `serviciuspecializare`
--
ALTER TABLE `serviciuspecializare`
  ADD PRIMARY KEY (`cod_serviciu_specializare`),
  ADD KEY `specializare` (`specializare`),
  ADD KEY `serviciu` (`serviciu`);

--
-- Indexuri pentru tabele `specializare`
--
ALTER TABLE `specializare`
  ADD PRIMARY KEY (`cod_specializare`);

--
-- AUTO_INCREMENT pentru tabele eliminate
--

--
-- AUTO_INCREMENT pentru tabele `analiza`
--
ALTER TABLE `analiza`
  MODIFY `cod_analiza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pentru tabele `bebe`
--
ALTER TABLE `bebe`
  MODIFY `cod_bebe` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pentru tabele `consultatie`
--
ALTER TABLE `consultatie`
  MODIFY `cod_consultatie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pentru tabele `cont`
--
ALTER TABLE `cont`
  MODIFY `cod_cont` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pentru tabele `factura`
--
ALTER TABLE `factura`
  MODIFY `cod_factura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pentru tabele `login`
--
ALTER TABLE `login`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pentru tabele `medic`
--
ALTER TABLE `medic`
  MODIFY `cod_medic` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pentru tabele `notificare`
--
ALTER TABLE `notificare`
  MODIFY `cod_vaccin` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pentru tabele `pacient`
--
ALTER TABLE `pacient`
  MODIFY `cod_pacient` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT pentru tabele `programare`
--
ALTER TABLE `programare`
  MODIFY `cod_programare` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pentru tabele `randfactura`
--
ALTER TABLE `randfactura`
  MODIFY `cod_rand_factura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pentru tabele `serviciu`
--
ALTER TABLE `serviciu`
  MODIFY `cod_serviciu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pentru tabele `serviciuspecializare`
--
ALTER TABLE `serviciuspecializare`
  MODIFY `cod_serviciu_specializare` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pentru tabele `specializare`
--
ALTER TABLE `specializare`
  MODIFY `cod_specializare` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constrângeri pentru tabele eliminate
--

--
-- Constrângeri pentru tabele `consultatie`
--
ALTER TABLE `consultatie`
  ADD CONSTRAINT `consultatie_ibfk_1` FOREIGN KEY (`medic_cod`) REFERENCES `medic` (`cod_medic`),
  ADD CONSTRAINT `consultatie_ibfk_2` FOREIGN KEY (`pacient_cod`) REFERENCES `pacient` (`cod_pacient`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
