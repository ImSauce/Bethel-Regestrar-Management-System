-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 19, 2025 at 01:14 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bethel_registrar`
--

-- --------------------------------------------------------

--
-- Table structure for table `archive_students`
--

CREATE TABLE `archive_students` (
  `lrn` varchar(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `placeofbirth` varchar(200) NOT NULL,
  `birthday` varchar(200) NOT NULL,
  `father` varchar(200) NOT NULL,
  `fathernumber` varchar(200) NOT NULL,
  `fatheroccupation` varchar(200) NOT NULL,
  `mother` varchar(200) NOT NULL,
  `mothernumber` varchar(200) NOT NULL,
  `motheroccupation` varchar(200) NOT NULL,
  `familyreligion` varchar(200) NOT NULL,
  `grade` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `track` varchar(200) NOT NULL,
  `strand` varchar(200) NOT NULL,
  `callname` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `imageNameform` text NOT NULL,
  `imageNamebirth` text NOT NULL,
  `imageNamek1` text NOT NULL,
  `imageNamek2` text NOT NULL,
  `imageName1` text NOT NULL,
  `imageName2` text NOT NULL,
  `imageName3` text NOT NULL,
  `imageName4` text NOT NULL,
  `imageName5` text NOT NULL,
  `imageName6` text NOT NULL,
  `imageName7` text NOT NULL,
  `imageName8` text NOT NULL,
  `imageName9` text NOT NULL,
  `imageName10` text NOT NULL,
  `imageName11` text NOT NULL,
  `imageName12` text NOT NULL,
  `imagePathform` text NOT NULL,
  `imagePathbirth` text NOT NULL,
  `imagePathk1` text NOT NULL,
  `imagePathk2` text NOT NULL,
  `imagePath1` text NOT NULL,
  `imagePath2` text NOT NULL,
  `imagePath3` text NOT NULL,
  `imagePath4` text NOT NULL,
  `imagePath5` text NOT NULL,
  `imagePath6` text NOT NULL,
  `imagePath7` text NOT NULL,
  `imagePath8` text NOT NULL,
  `imagePath9` text NOT NULL,
  `imagePath10` text NOT NULL,
  `imagePath11` text NOT NULL,
  `imagePath12` text NOT NULL,
  `imageFileform` longblob NOT NULL,
  `imageFilebirth` longblob NOT NULL,
  `imageFilek1` longblob NOT NULL,
  `imageFilek2` longblob NOT NULL,
  `imageFile1` longblob NOT NULL,
  `imageFile2` longblob NOT NULL,
  `imageFile3` longblob NOT NULL,
  `imageFile4` longblob NOT NULL,
  `imageFile5` longblob NOT NULL,
  `imageFile6` longblob NOT NULL,
  `imageFile7` longblob NOT NULL,
  `imageFile8` longblob NOT NULL,
  `imageFile9` longblob NOT NULL,
  `imageFile10` longblob NOT NULL,
  `imageFile11` longblob NOT NULL,
  `imageFile12` longblob NOT NULL,
  `number` varchar(200) NOT NULL,
  `guardian` varchar(200) NOT NULL,
  `guardiannum` varchar(200) NOT NULL,
  `imageNameEnroll` text NOT NULL,
  `imagePathEnroll` text NOT NULL,
  `imageFileEnroll` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `excel_backup`
--

CREATE TABLE `excel_backup` (
  `lrn` varchar(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `placeofbirth` varchar(200) NOT NULL,
  `birthday` varchar(200) NOT NULL,
  `father` varchar(200) NOT NULL,
  `fathernumber` varchar(200) NOT NULL,
  `fatheroccupation` varchar(200) NOT NULL,
  `mother` varchar(200) NOT NULL,
  `mothernumber` varchar(200) NOT NULL,
  `motheroccupation` varchar(200) NOT NULL,
  `familyreligion` varchar(200) NOT NULL,
  `grade` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `track` varchar(200) NOT NULL,
  `strand` varchar(200) NOT NULL,
  `callname` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `excel_student_table`
--

CREATE TABLE `excel_student_table` (
  `lrn` varchar(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `placeofbirth` varchar(200) NOT NULL,
  `birthday` varchar(200) NOT NULL,
  `father` varchar(200) NOT NULL,
  `fathernumber` varchar(200) NOT NULL,
  `fatheroccupation` varchar(200) NOT NULL,
  `mother` varchar(200) NOT NULL,
  `mothernumber` varchar(200) NOT NULL,
  `motheroccupation` varchar(200) NOT NULL,
  `familyreligion` varchar(200) NOT NULL,
  `grade` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `track` varchar(200) NOT NULL,
  `strand` varchar(200) NOT NULL,
  `callname` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `imageNameform` text NOT NULL,
  `imageNamebirth` text NOT NULL,
  `imageNamek1` text NOT NULL,
  `imageNamek2` text NOT NULL,
  `imageName1` text NOT NULL,
  `imageName2` text NOT NULL,
  `imageName3` text NOT NULL,
  `imageName4` text NOT NULL,
  `imageName5` text NOT NULL,
  `imageName6` text NOT NULL,
  `imageName7` text NOT NULL,
  `imageName8` text NOT NULL,
  `imageName9` text NOT NULL,
  `imageName10` text NOT NULL,
  `imageName11` text NOT NULL,
  `imageName12` text NOT NULL,
  `imagePathform` text NOT NULL,
  `imagePathbirth` text NOT NULL,
  `imagePathk1` text NOT NULL,
  `imagePathk2` text NOT NULL,
  `imagePath1` text NOT NULL,
  `imagePath2` text NOT NULL,
  `imagePath3` text NOT NULL,
  `imagePath4` text NOT NULL,
  `imagePath5` text NOT NULL,
  `imagePath6` text NOT NULL,
  `imagePath7` text NOT NULL,
  `imagePath8` text NOT NULL,
  `imagePath9` text NOT NULL,
  `imagePath10` text NOT NULL,
  `imagePath11` text NOT NULL,
  `imagePath12` text NOT NULL,
  `imageFileform` longblob NOT NULL,
  `imageFilebirth` longblob NOT NULL,
  `imageFilek1` longblob NOT NULL,
  `imageFilek2` longblob NOT NULL,
  `imageFile1` longblob NOT NULL,
  `imageFile2` longblob NOT NULL,
  `imageFile3` longblob NOT NULL,
  `imageFile4` longblob NOT NULL,
  `imageFile5` longblob NOT NULL,
  `imageFile6` longblob NOT NULL,
  `imageFile7` longblob NOT NULL,
  `imageFile8` longblob NOT NULL,
  `imageFile9` longblob NOT NULL,
  `imageFile10` longblob NOT NULL,
  `imageFile11` longblob NOT NULL,
  `imageFile12` longblob NOT NULL,
  `number` varchar(200) NOT NULL,
  `guardian` varchar(200) NOT NULL,
  `guardiannum` varchar(200) NOT NULL,
  `imageNameEnroll` text NOT NULL,
  `imagePathEnroll` text NOT NULL,
  `imageFileEnroll` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

CREATE TABLE `grades` (
  `grade` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sections`
--

CREATE TABLE `sections` (
  `section` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `strands`
--

CREATE TABLE `strands` (
  `strand` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `lrn` varchar(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `placeofbirth` varchar(200) NOT NULL,
  `birthday` varchar(200) NOT NULL,
  `father` varchar(200) NOT NULL,
  `fathernumber` varchar(200) NOT NULL,
  `fatheroccupation` varchar(200) NOT NULL,
  `mother` varchar(200) NOT NULL,
  `mothernumber` varchar(200) NOT NULL,
  `motheroccupation` varchar(200) NOT NULL,
  `familyreligion` varchar(200) NOT NULL,
  `grade` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `track` varchar(200) NOT NULL,
  `strand` varchar(200) NOT NULL,
  `callname` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `imageNameform` text NOT NULL,
  `imageNamebirth` text NOT NULL,
  `imageNamek1` text NOT NULL,
  `imageNamek2` text NOT NULL,
  `imageName1` text NOT NULL,
  `imageName2` text NOT NULL,
  `imageName3` text NOT NULL,
  `imageName4` text NOT NULL,
  `imageName5` text NOT NULL,
  `imageName6` text NOT NULL,
  `imageName7` text NOT NULL,
  `imageName8` text NOT NULL,
  `imageName9` text NOT NULL,
  `imageName10` text NOT NULL,
  `imageName11` text NOT NULL,
  `imageName12` text NOT NULL,
  `imagePathform` text NOT NULL,
  `imagePathbirth` text NOT NULL,
  `imagePathk1` text NOT NULL,
  `imagePathk2` text NOT NULL,
  `imagePath1` text NOT NULL,
  `imagePath2` text NOT NULL,
  `imagePath3` text NOT NULL,
  `imagePath4` text NOT NULL,
  `imagePath5` text NOT NULL,
  `imagePath6` text NOT NULL,
  `imagePath7` text NOT NULL,
  `imagePath8` text NOT NULL,
  `imagePath9` text NOT NULL,
  `imagePath10` text NOT NULL,
  `imagePath11` text NOT NULL,
  `imagePath12` text NOT NULL,
  `imageFileform` longblob NOT NULL,
  `imageFilebirth` longblob NOT NULL,
  `imageFilek1` longblob NOT NULL,
  `imageFilek2` longblob NOT NULL,
  `imageFile1` longblob NOT NULL,
  `imageFile2` longblob NOT NULL,
  `imageFile3` longblob NOT NULL,
  `imageFile4` longblob NOT NULL,
  `imageFile5` longblob NOT NULL,
  `imageFile6` longblob NOT NULL,
  `imageFile7` longblob NOT NULL,
  `imageFile8` longblob NOT NULL,
  `imageFile9` longblob NOT NULL,
  `imageFile10` longblob NOT NULL,
  `imageFile11` longblob NOT NULL,
  `imageFile12` longblob NOT NULL,
  `number` varchar(200) NOT NULL,
  `guardian` varchar(200) NOT NULL,
  `guardiannum` varchar(200) NOT NULL,
  `imageNameEnroll` text NOT NULL,
  `imagePathEnroll` text NOT NULL,
  `imageFileEnroll` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `lrn` varchar(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `lname` varchar(200) NOT NULL,
  `placeofbirth` varchar(200) NOT NULL,
  `birthday` varchar(200) NOT NULL,
  `father` varchar(200) NOT NULL,
  `fathernumber` varchar(200) NOT NULL,
  `fatheroccupation` varchar(200) NOT NULL,
  `mother` varchar(200) NOT NULL,
  `mothernumber` varchar(200) NOT NULL,
  `motheroccupation` varchar(200) NOT NULL,
  `familyreligion` varchar(200) NOT NULL,
  `grade` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `track` varchar(200) NOT NULL,
  `strand` varchar(200) NOT NULL,
  `callname` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `imageNameform` text NOT NULL,
  `imageNamebirth` text NOT NULL,
  `imageNamek1` text NOT NULL,
  `imageNamek2` text NOT NULL,
  `imageName1` text NOT NULL,
  `imageName2` text NOT NULL,
  `imageName3` text NOT NULL,
  `imageName4` text NOT NULL,
  `imageName5` text NOT NULL,
  `imageName6` text NOT NULL,
  `imageName7` text NOT NULL,
  `imageName8` text NOT NULL,
  `imageName9` text NOT NULL,
  `imageName10` text NOT NULL,
  `imageName11` text NOT NULL,
  `imageName12` text NOT NULL,
  `imagePathform` text NOT NULL,
  `imagePathbirth` text NOT NULL,
  `imagePathk1` text NOT NULL,
  `imagePathk2` text NOT NULL,
  `imagePath1` text NOT NULL,
  `imagePath2` text NOT NULL,
  `imagePath3` text NOT NULL,
  `imagePath4` text NOT NULL,
  `imagePath5` text NOT NULL,
  `imagePath6` text NOT NULL,
  `imagePath7` text NOT NULL,
  `imagePath8` text NOT NULL,
  `imagePath9` text NOT NULL,
  `imagePath10` text NOT NULL,
  `imagePath11` text NOT NULL,
  `imagePath12` text NOT NULL,
  `imageFileform` longblob NOT NULL,
  `imageFilebirth` longblob NOT NULL,
  `imageFilek1` longblob NOT NULL,
  `imageFilek2` longblob NOT NULL,
  `imageFile1` longblob NOT NULL,
  `imageFile2` longblob NOT NULL,
  `imageFile3` longblob NOT NULL,
  `imageFile4` longblob NOT NULL,
  `imageFile5` longblob NOT NULL,
  `imageFile6` longblob NOT NULL,
  `imageFile7` longblob NOT NULL,
  `imageFile8` longblob NOT NULL,
  `imageFile9` longblob NOT NULL,
  `imageFile10` longblob NOT NULL,
  `imageFile11` longblob NOT NULL,
  `imageFile12` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tracks`
--

CREATE TABLE `tracks` (
  `track` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `archive_students`
--
ALTER TABLE `archive_students`
  ADD PRIMARY KEY (`lrn`);

--
-- Indexes for table `excel_backup`
--
ALTER TABLE `excel_backup`
  ADD PRIMARY KEY (`lrn`);

--
-- Indexes for table `excel_student_table`
--
ALTER TABLE `excel_student_table`
  ADD PRIMARY KEY (`lrn`);

--
-- Indexes for table `grades`
--
ALTER TABLE `grades`
  ADD PRIMARY KEY (`grade`);

--
-- Indexes for table `sections`
--
ALTER TABLE `sections`
  ADD PRIMARY KEY (`section`);

--
-- Indexes for table `strands`
--
ALTER TABLE `strands`
  ADD PRIMARY KEY (`strand`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`lrn`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`lrn`);

--
-- Indexes for table `tracks`
--
ALTER TABLE `tracks`
  ADD PRIMARY KEY (`track`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
