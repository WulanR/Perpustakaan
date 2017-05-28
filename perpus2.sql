-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2017 at 09:59 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `perpus2`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` text NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('wulan', '123'),
('wulan', '123'),
('wulan', '123'),
('wulanr', '1234'),
('wulanr', '12345'),
('wulan', '123'),
('wulan', '1234'),
('rohmadani', '123wr'),
('ui', '90');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kembali`
--

CREATE TABLE IF NOT EXISTS `tb_kembali` (
  `no_anggota` int(20) NOT NULL AUTO_INCREMENT,
  `nama` text NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_buku` enum('Pelajaran','Komik','Novel') NOT NULL,
  `judul` varchar(20) NOT NULL,
  `tgl_pinjam` varchar(20) NOT NULL,
  `tgl_kembali` varchar(20) NOT NULL,
  `denda` varchar(10) NOT NULL,
  `status` enum('Kembali','Pinjam') NOT NULL,
  PRIMARY KEY (`no_anggota`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1235988 ;

--
-- Dumping data for table `tb_kembali`
--

INSERT INTO `tb_kembali` (`no_anggota`, `nama`, `alamat`, `jenis_buku`, `judul`, `tgl_pinjam`, `tgl_kembali`, `denda`, `status`) VALUES
(123598, 'ui', 'd', 'Pelajaran', 'd', '2017-05-11', '2017-05-20', '40', 'Kembali'),
(123599, 'ui', 'd', 'Pelajaran', 'd', '2017-05-11', '2017-05-20', '40', 'Kembali');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
