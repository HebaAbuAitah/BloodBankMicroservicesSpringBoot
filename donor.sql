-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2021 at 09:45 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `donor`
--

-- --------------------------------------------------------

--
-- Table structure for table `donor data`
--

CREATE TABLE `donor data` (
  `DonorID` int(11) NOT NULL,
  `DonorName` varchar(32) NOT NULL,
  `gender` char(1) NOT NULL,
  `DirtheDay` date NOT NULL,
  `PhoneNumber` int(11) NOT NULL,
  `MobileNumber` int(11) NOT NULL,
  `QuestionID` int(11) NOT NULL,
  `BoundID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `prequestion`
--

CREATE TABLE `prequestion` (
  `QuestionID` int(11) NOT NULL,
  `Question` varchar(70) NOT NULL,
  `answer` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prequestion`
--

INSERT INTO `prequestion` (`QuestionID`, `Question`, `answer`) VALUES
(1, 'هل سبق لك التبرع بالدم', 0),
(2, 'هل أخذت تطعيمات خلال 6 أشهر السابقة', 0),
(3, 'هل تعاطيت الكحول أو المخدرات خلال 6 أشهر السابقة', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor data`
--
ALTER TABLE `donor data`
  ADD PRIMARY KEY (`DonorID`),
  ADD UNIQUE KEY `BoundID` (`BoundID`),
  ADD KEY `QuestionID` (`QuestionID`);

--
-- Indexes for table `prequestion`
--
ALTER TABLE `prequestion`
  ADD PRIMARY KEY (`QuestionID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `prequestion`
--
ALTER TABLE `prequestion`
  MODIFY `QuestionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `donor data`
--
ALTER TABLE `donor data`
  ADD CONSTRAINT `donor data_ibfk_1` FOREIGN KEY (`QuestionID`) REFERENCES `prequestion` (`QuestionID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
