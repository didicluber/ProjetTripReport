-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 17 Mai 2016 à 03:44
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `bdaeroport`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ndc` varchar(20) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id`, `ndc`, `mdp`) VALUES
(1, 'Moussa', 'iskounene'),
(2, 'Cazaubon', 'JC'),
(3, 'Burint', 'Saray');

-- --------------------------------------------------------

--
-- Structure de la table `avion`
--

CREATE TABLE IF NOT EXISTS `avion` (
  `modele` varchar(40) NOT NULL,
  `idPilote` int(11) NOT NULL,
  `idCoPilote` int(11) NOT NULL,
  PRIMARY KEY (`idPilote`,`idCoPilote`),
  KEY `contrainteCoPilote` (`idCoPilote`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `avion`
--

INSERT INTO `avion` (`modele`, `idPilote`, `idCoPilote`) VALUES
('Avion qui vole pas', 1, 1),
('Boeing 747', 1, 7),
('Boeing 747', 7, 1),
('Airbus A380', 7, 8),
('Boeing 747', 8, 8),
('Airbus A380', 9, 7),
('Faucon Millenium', 11, 8),
('Avion qui vole pas', 11, 13),
('Faucon Millenium', 14, 10),
('Avion qui vole pas', 14, 14);

-- --------------------------------------------------------

--
-- Structure de la table `copilote`
--

CREATE TABLE IF NOT EXISTS `copilote` (
  `idCoPilote` int(11) NOT NULL AUTO_INCREMENT,
  `nomCoPilote` varchar(40) NOT NULL,
  `prenomCoPilote` varchar(40) NOT NULL,
  `numeroLicence` varchar(40) NOT NULL,
  PRIMARY KEY (`idCoPilote`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Contenu de la table `copilote`
--

INSERT INTO `copilote` (`idCoPilote`, `nomCoPilote`, `prenomCoPilote`, `numeroLicence`) VALUES
(1, 'Lau', 'Vincent', '1451816839'),
(7, 'Prosper', 'Pierrick', '3251561564'),
(8, 'Gauthier', 'Michel', '4515151515'),
(9, 'Karl', 'Marcx', '4514515641'),
(10, 'Morette', 'Thomas', '5641561564'),
(11, 'KOLM', 'Salima', '5115615612'),
(12, 'Iskounene', 'Moumouss', '8515615615'),
(13, 'Iskounene', 'Yanis', '1654985615'),
(14, 'Aurevoir', 'Aurevoir', 'BONJOUR');

-- --------------------------------------------------------

--
-- Structure de la table `mouvement`
--

CREATE TABLE IF NOT EXISTS `mouvement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modele` varchar(40) NOT NULL,
  `pilote` varchar(40) NOT NULL,
  `coPilote` varchar(40) NOT NULL,
  `numeroVol` varchar(40) NOT NULL,
  `dateHeureDepart` varchar(40) NOT NULL,
  `dateHeureArrivee` varchar(40) NOT NULL,
  `aeroportDepart` varchar(40) NOT NULL,
  `aeroportArriver` varchar(40) NOT NULL,
  `retard` varchar(40) NOT NULL,
  `raisonRetard` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idAvion` (`modele`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `mouvement`
--

INSERT INTO `mouvement` (`id`, `modele`, `pilote`, `coPilote`, `numeroVol`, `dateHeureDepart`, `dateHeureArrivee`, `aeroportDepart`, `aeroportArriver`, `retard`, `raisonRetard`) VALUES
(4, 'Avion qui vole pas', 'Bonjour Bonjour', 'Aurevoir Aurevoir', '51', '23:55 16/05', '23:55 19/05', 'CDG', 'POL', '15 minutes', 'Problème de sécurité'),
(5, 'Faucon Millenium', 'Bonjour Bonjour', 'Gauthier Michel', '652', '02:10 17/05', '12:10 17/05', 'GHJ', 'LOP', '45 minutes', 'Tour de contrôle injoignable'),
(6, 'Avion qui vole pas', 'Bonjour Bonjour', 'Iskounene Yanis', '515', '00:12 17/05', '03:12 17/05', 'CDG', 'LOM', '45 minutes', 'Grève du personnel'),
(7, 'Faucon Millenium', 'Bonjour Bonjour', 'Morette Thomas', '512', '00:20 17/05', '03:20 17/05', 'CDG', 'CHARLIE', '45 minutes', 'Mauvaise météo');

-- --------------------------------------------------------

--
-- Structure de la table `pilote`
--

CREATE TABLE IF NOT EXISTS `pilote` (
  `idPilote` int(11) NOT NULL AUTO_INCREMENT,
  `nomPilote` varchar(40) NOT NULL,
  `prenomPilote` varchar(40) NOT NULL,
  `numeroPermis` varchar(40) NOT NULL,
  `retard` varchar(40) NOT NULL,
  `avertissement` varchar(40) NOT NULL,
  PRIMARY KEY (`idPilote`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Contenu de la table `pilote`
--

INSERT INTO `pilote` (`idPilote`, `nomPilote`, `prenomPilote`, `numeroPermis`, `retard`, `avertissement`) VALUES
(1, 'Ouanounou', 'Dylan', 'AD156', '0', '0'),
(7, 'Bousaada', 'Ferdaws', 'AD654', '0', '0'),
(8, 'Delucien', 'Stephane', 'AD578', '0', '0'),
(9, 'Papounaud', 'Robin', 'GH555', '0', '0'),
(10, 'Meng', 'Pratna', 'AD157', '0', '0'),
(11, 'Iskounene', 'Bianca', 'AD159', '0', '0'),
(12, 'Descotaux', 'Jordan', 'KL697', '0', '0'),
(13, 'Glomot', 'Jean-Baptiste', 'MP986', '0', '0'),
(14, 'Bonjour', 'Bonjour', 'AUREV', '3', 'Pilote en inspection');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `avion`
--
ALTER TABLE `avion`
  ADD CONSTRAINT `contrainteCoPilote` FOREIGN KEY (`idCoPilote`) REFERENCES `copilote` (`idCoPilote`),
  ADD CONSTRAINT `contraintePilote` FOREIGN KEY (`idPilote`) REFERENCES `pilote` (`idPilote`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
