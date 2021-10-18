-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 17, 2021 at 05:37 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `englishlibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `newword`
--

CREATE TABLE `newword` (
  `id` int(11) NOT NULL,
  `word` varchar(50) NOT NULL,
  `mean` varchar(100) NOT NULL,
  `pronunciation` varchar(50) CHARACTER SET utf8 NOT NULL,
  `audiolink` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newword`
--

INSERT INTO `newword` (`id`, `word`, `mean`, `pronunciation`, `audiolink`) VALUES
(4, 'eat', 'ăn', '', 'D:\\M.E\\eat--_gb_1.mp3'),
(5, 'drink', 'uống', '', 'D:\\M.E\\drink--_gb_1.mp3'),
(6, 'door', 'cái cửa', '', 'D:\\M.E\\door--_gb_1.mp3'),
(7, 'book', 'Sách,  đặt chỗ', '', 'D:\\M.E\\book--_gb_1.mp3'),
(9, 'glass', 'kính', '', 'D:\\M.E\\glass--_gb_1.mp3'),
(10, 'do', 'làm', '', 'D:\\M.E\\do--_gb_1.mp3'),
(15, 'cat', 'mèo', '', 'D:\\M.E\\cat--_gb_1.mp3'),
(17, 'study', 'học', '', 'D:\\M.E\\study--_gb_1.mp3'),
(20, 'school', 'trường học', 'sko͞ol', 'D:\\M.E\\school--_gb_1.mp3'),
(21, 'television', 'vô tuyến', 'ˈteləˌviZHən ', 'D:\\M.E\\television--_gb_1.mp3'),
(22, 'dog', 'chó', 'dôɡ', 'D:\\M.E\\dog--_gb_1.mp3'),
(24, 'house', 'nhà', 'haʊs', 'D:\\M.E\\house--_gb_1.mp3'),
(25, 'dictionary', 'từ điển', 'dɪkʃəneri', 'D:\\M.E\\dicitonary--_gb_1.mp3'),
(26, 'computer', 'máy tính', 'kəmˈpjuːtə(r)', 'D:\\M.E\\computer--_gb_1.mp3'),
(27, 'value', 'giá trị', 'ˈvæljuː', 'D:\\M.E\\value--_gb_1.mp3'),
(28, 'mouse', 'chuột', 'maʊs', 'D:\\M.E\\mouse--_gb_1.mp3'),
(29, 'phone', 'điện thoại', 'fəʊn', 'D:\\M.E\\phone--_gb_1.mp3'),
(30, 'accurate', 'chính xác', 'ˈækjərət', 'D:\\M.E\\accurate--_gb_1.mp3'),
(31, 'wine', 'rượu', 'waɪn', 'D:\\M.E\\wine--_gb_1.mp3'),
(32, 'forest', 'rừng', 'ˈfɒrɪst', 'D:\\M.E\\forest--_gb_1.mp3'),
(33, 'profit', 'lợi nhuận', 'ˈprɒfɪt', 'D:\\M.E\\profit--_gb_1.mp3'),
(34, 'attitude', 'thái độ', 'ˈætɪtjuːd', 'D:\\M.E\\attitude--_gb_1.mp3'),
(35, 'criminal', 'tội phạm', 'ˈkrɪmɪnl', 'D:\\M.E\\criminal--_gb_1.mp3'),
(36, 'psychology', 'tâm lí học', 'saɪˈkɒlədʒi', 'D:\\M.E\\psychology--_gb_1.mp3'),
(37, 'mental', 'thuộc về tâm thần', 'ˈmentl', 'D:\\M.E\\mental--_gb_1.mp3'),
(38, 'evolution', 'sự phát triển', 'ˌiːvəˈluːʃn', 'D:\\M.E\\evolution--_gb_1.mp3'),
(39, 'revolution', 'cuộc cách mạng', 'ˌrevəˈluːʃn', 'D:\\M.E\\revolution--_gb_1.mp3'),
(40, 'kitchen', 'phòng bếp', 'ˈkɪtʃɪn', 'D:\\M.E\\kitchen--_gb_1.mp3'),
(41, 'drama', 'kịch', 'ˈdrɑːmə', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `newword`
--
ALTER TABLE `newword`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `newword`
--
ALTER TABLE `newword`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
