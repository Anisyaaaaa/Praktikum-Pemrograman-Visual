-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2023 at 12:09 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemvis5`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `nama_barang` varchar(30) NOT NULL,
  `kode_barang` int(30) NOT NULL,
  `harga_barang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`nama_barang`, `kode_barang`, `harga_barang`) VALUES
('fygfh', 3, '4000');

-- --------------------------------------------------------

--
-- Table structure for table `datapembeli`
--

CREATE TABLE `datapembeli` (
  `nama_pembeli` varchar(30) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `kode_barang` int(30) NOT NULL,
  `harga_barang` int(30) NOT NULL,
  `jumlah_beli` int(30) NOT NULL,
  `harga_total` int(30) NOT NULL,
  `uang_pembeli` int(30) NOT NULL,
  `kembalian` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datapembeli`
--

INSERT INTO `datapembeli` (`nama_pembeli`, `nama_barang`, `kode_barang`, `harga_barang`, `jumlah_beli`, `harga_total`, `uang_pembeli`, `kembalian`) VALUES
('Anisa', 'Buku Tulis', 1, 5000, 2, 10000, 20000, 10000),
('Tasya', 'Buku Tulis', 1, 5000, 2, 10000, 20000, 10000),
('Nadhif', 'Kotak Pensil', 4, 15000, 1, 15000, 20000, 5000),
('Anisa', 'Pulpen', 2, 4000, 2, 8000, 10000, 2000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
