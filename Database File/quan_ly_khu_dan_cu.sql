-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Dec 27, 2023 at 01:10 AM
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
-- Database: `quan_ly_khu_dan_cu`
--

-- --------------------------------------------------------

--
-- Table structure for table `chung_cu`
--

CREATE TABLE `chung_cu` (
  `so_ho_khau` varchar(20) NOT NULL,
  `loai_chung_cu` enum('cao_cap','thuong','gia_re','chua_ro') DEFAULT 'chua_ro',
  `dien_tich` decimal(10,1) DEFAULT 0.0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chung_cu`
--

INSERT INTO `chung_cu` (`so_ho_khau`, `loai_chung_cu`, `dien_tich`) VALUES
('SHK001', 'thuong', 100.0),
('SHK004', 'gia_re', 50.0),
('SHK003', 'cao_cap', 160.0);

-- --------------------------------------------------------

--
-- Table structure for table `dip_tang_thuong`
--

CREATE TABLE `dip_tang_thuong` (
  `id_dip_tang_thuong` int(11) NOT NULL,
  `thanh_tich` varchar(1024) NOT NULL,
  `hoc_ky` varchar(1024) NOT NULL,
  `ngay_tang_thuong` date NOT NULL,
  `chi_tiet` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`chi_tiet`)),
  `tong_so_tien` int(11) NOT NULL DEFAULT 0,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dip_tang_thuong`
--

INSERT INTO `dip_tang_thuong` (`id_dip_tang_thuong`, `thanh_tich`, `hoc_ky`, `ngay_tang_thuong`, `chi_tiet`, `tong_so_tien`, `isDeleted`) VALUES
(30, 'Trung bình', '20101', '2023-12-26', '{\"5 cuon vo\":50000}', 50000, 0),
(31, 'Tết thiếu nhi 2010', 'Tết thiếu nhi 2010', '2023-12-26', '{\"1 gói bim bim\":5000,\"1 cái kẹo\":3000}', 0, 0),
(32, 'Tết thiếu nhi 2009', 'Tết thiếu nhi 2009', '2023-12-26', '{\"1 gói bim bim\":6000,\"1 cái kẹo\":3000}', 63000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `dong_gop`
--

CREATE TABLE `dong_gop` (
  `so_ho_khau` varchar(255) NOT NULL,
  `id_khoan_dong_gop` int(11) NOT NULL,
  `so_tien` varchar(11) DEFAULT '0',
  `ngay_dong` date DEFAULT NULL,
  `id_dong_gop` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dong_gop`
--

INSERT INTO `dong_gop` (`so_ho_khau`, `id_khoan_dong_gop`, `so_tien`, `ngay_dong`, `id_dong_gop`) VALUES
('SHK001', 1, '100000', '2023-12-22', 1),
('SHK002', 2, '20000', '2023-12-23', 2),
('SHK003', 4, '2000000', '2023-08-01', 5);

-- --------------------------------------------------------

--
-- Table structure for table `dong_phi`
--

CREATE TABLE `dong_phi` (
  `id_dong_phi` int(11) NOT NULL,
  `id_khoan_thu_phi` int(11) DEFAULT NULL,
  `so_ho_khau` varchar(255) DEFAULT NULL,
  `so_tien` varchar(255) DEFAULT NULL,
  `da_dong` tinyint(1) DEFAULT 0,
  `ngay_dong` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dong_phi`
--

INSERT INTO `dong_phi` (`id_dong_phi`, `id_khoan_thu_phi`, `so_ho_khau`, `so_tien`, `da_dong`, `ngay_dong`) VALUES
(24, 1, 'SHK001', '30000', 0, NULL),
(26, 1, 'SHK003', '30000', 0, NULL),
(27, 1, 'SHK004', '24000', 0, NULL),
(29, 2, 'SHK001', '20000', 0, NULL),
(30, 2, 'SHK003', '20000', 0, NULL),
(31, 2, 'SHK004', '20000', 0, NULL),
(32, 3, 'SHK001', '8000000', 0, NULL),
(33, 3, 'SHK003', '12800000', 0, NULL),
(34, 3, 'SHK004', '4000000', 0, NULL),
(38, 16, 'SHK001', '100000', 1, '2023-11-02'),
(41, 16, 'SHK003', '100000', 1, '2023-11-11'),
(42, 16, 'SHK004', '100000', 0, NULL);

--
-- Triggers `dong_phi`
--
DELIMITER $$
CREATE TRIGGER `tr_calculate_so_tien_dong_phi` BEFORE INSERT ON `dong_phi` FOR EACH ROW BEGIN
    DECLARE tien INT;
    DECLARE total_people INT;

    -- Retrieve so_ho_khau and id_khoan_thu_phi for the new row
    DECLARE ho_khau_id VARCHAR(255);
    DECLARE khoan_thu_id INT;
    DECLARE loai_phi_thu VARCHAR(255);
    
    SELECT NEW.so_ho_khau, NEW.id_khoan_thu_phi INTO ho_khau_id, khoan_thu_id;
    
    SELECT loai_phi INTO loai_phi_thu
    FROM khoan_thu_phi
    WHERE id_khoan_thu_phi = khoan_thu_id;
    
    -- Count the number of people with the same so_ho_khau in nhan_khau
    SELECT COUNT(*) INTO total_people
    FROM nhan_khau
    WHERE so_ho_khau = ho_khau_id;

    -- Get the tien_phi corresponding to the id_khoan_thu_phi and convert to INT
    SELECT CAST(tien_phi AS UNSIGNED) INTO tien
    FROM khoan_thu_phi
    WHERE id_khoan_thu_phi = khoan_thu_id;

    -- Check the phi_chung_cu flag and calculate so_tien accordingly

    SET NEW.so_tien = '0';
    IF EXISTS (SELECT 1 FROM chung_cu WHERE so_ho_khau = ho_khau_id) AND loai_phi_thu = 'phí theo diện tích' THEN
            SET NEW.so_tien = CAST(tien * (SELECT dien_tich FROM chung_cu WHERE so_ho_khau = ho_khau_id) AS CHAR);
     END IF;
 IF loai_phi_thu = 'phí theo đầu người' THEN
            SET NEW.so_tien = CAST(tien * total_people  AS CHAR);
     END IF;
 IF loai_phi_thu = 'phí theo hộ' THEN
            SET NEW.so_tien = CAST(tien  AS CHAR);
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `hoc_sinh`
--

CREATE TABLE `hoc_sinh` (
  `nhan_khau_id` int(11) NOT NULL,
  `truong` varchar(1024) DEFAULT NULL,
  `lop` varchar(1024) DEFAULT NULL,
  `thanh_tich` varchar(1024) DEFAULT NULL,
  `hoc_ky` varchar(255) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  `ho_ten` varchar(100) NOT NULL,
  `so_ho_khau` varchar(1024) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoc_sinh`
--

INSERT INTO `hoc_sinh` (`nhan_khau_id`, `truong`, `lop`, `thanh_tich`, `hoc_ky`, `isDeleted`, `ho_ten`, `so_ho_khau`) VALUES
(1, ' ', ' ', ' ', '20001', 0, 'Nguyen Van A', 'SHK001'),
(1, ' ', ' ', ' ', '20051', 0, 'Nguyen Van A', 'SHK001'),
(1, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Nguyen Van A', 'SHK001'),
(1, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Nguyen Van A', 'SHK001'),
(1, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Nguyen Van A', 'SHK001'),
(2, 'Nguyen Trai', '10A2', 'Giỏi', '20051', 0, 'Tran Thi B', 'SHK001'),
(2, 'Ham Rong', '10A1', 'Trung bình', '20101', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', '20102', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Tran Thi B', 'SHK001'),
(2, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Tran Thi B', 'SHK001'),
(3, ' ', ' ', ' ', '20001', 0, 'Le Van C', 'SHK001'),
(3, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Le Van C', 'SHK001'),
(4, ' ', ' ', ' ', '20001', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', '20051', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Pham Thi D', 'SHK001'),
(4, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Pham Thi D', 'SHK001'),
(5, ' ', ' ', ' ', '20001', 0, 'Vo Van E', 'SHK002'),
(6, ' ', ' ', ' ', '20001', 0, 'Do Thi F', 'SHK002'),
(6, ' ', ' ', ' ', '20051', 0, 'Do Thi F', 'SHK002'),
(6, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Do Thi F', 'SHK002'),
(6, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Do Thi F', 'SHK002'),
(6, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Do Thi F', 'SHK002'),
(7, ' ', ' ', ' ', '20001', 0, 'Nguyen Van G', 'SHK002'),
(8, ' ', ' ', ' ', '20001', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', '20051', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Tran Van H', 'SHK002'),
(8, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Tran Van H', 'SHK002'),
(9, ' ', ' ', ' ', '20051', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', '20101', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', '20102', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Le Thi I', 'SHK003'),
(9, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Le Thi I', 'SHK003'),
(10, ' ', ' ', ' ', '20001', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', '20051', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Pham Van K', 'SHK003'),
(10, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Pham Van K', 'SHK003'),
(11, ' ', ' ', ' ', '20001', 0, 'Hoang Van L', 'SHK003'),
(11, ' ', ' ', ' ', '20051', 0, 'Hoang Van L', 'SHK003'),
(11, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Hoang Van L', 'SHK003'),
(11, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Hoang Van L', 'SHK003'),
(12, ' ', ' ', ' ', '20051', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', '20101', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', '20102', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Nguyen Thi M', 'SHK003'),
(12, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Nguyen Thi M', 'SHK003'),
(13, ' ', ' ', ' ', '20001', 0, 'Do Van N', 'SHK004'),
(14, ' ', ' ', ' ', '20001', 0, 'Le Thi O', 'SHK004'),
(16, ' ', ' ', ' ', '20001', 0, 'Tran Thi Q', 'SHK004'),
(16, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Tran Thi Q', 'SHK004'),
(17, ' ', ' ', ' ', '20001', 0, 'Nguyen Van X', 'SHK001'),
(17, ' ', ' ', ' ', '20051', 0, 'Nguyen Van X', 'SHK001'),
(17, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Nguyen Van X', 'SHK001'),
(17, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Nguyen Van X', 'SHK001'),
(17, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Nguyen Van X', 'SHK001'),
(18, ' ', ' ', ' ', '20051', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', '20101', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', '20102', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Tết thiếu nhi 2009', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Trung thu 2009', 0, 'Nguyen Thi Y', 'SHK002'),
(18, ' ', ' ', ' ', 'Trung thu 2010', 0, 'Nguyen Thi Y', 'SHK002'),
(19, ' ', ' ', ' ', '20001', 0, 'Nguyen Van rA', 'SHK005'),
(19, ' ', ' ', ' ', '20051', 0, 'Nguyen Van rA', 'SHK005'),
(19, ' ', ' ', ' ', 'Trung thu 2006', 0, 'Nguyen Van rA', 'SHK005'),
(19, ' ', ' ', ' ', 'Trung thu 2007', 0, 'Nguyen Van rA', 'SHK005'),
(19, ' ', ' ', ' ', 'Trung thu 2008', 0, 'Nguyen Van rA', 'SHK005');

-- --------------------------------------------------------

--
-- Table structure for table `ho_khau`
--

CREATE TABLE `ho_khau` (
  `ho_khau_id` int(11) NOT NULL,
  `so_ho_khau` varchar(255) NOT NULL,
  `chu_ho_id` int(11) DEFAULT NULL,
  `chu_ho_CMND` varchar(15) NOT NULL,
  `dia_chi` varchar(255) NOT NULL,
  `la_chung_cu` enum('Có','Không') NOT NULL,
  `ngay_lap` date NOT NULL,
  `deleted` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ho_khau`
--

INSERT INTO `ho_khau` (`ho_khau_id`, `so_ho_khau`, `chu_ho_id`, `chu_ho_CMND`, `dia_chi`, `la_chung_cu`, `ngay_lap`, `deleted`) VALUES
(1, 'SHK001', 1, '123456789', '123 Đường ABC, Quận XYZ', 'Có', '2023-01-01', 0),
(2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0),
(3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0),
(4, 'SHK004', 13, '123012345', '987 Đường KLM, Quận OPQ', 'Có', '2023-04-01', 0),
(5, 'SHK005', 19, '123456729', '1234 Đường ABC, Quận XYZ', 'Không', '2022-01-01', 0),
(22, 'bfrwij', 58, 'eas', 'kjndsj', 'Có', '2023-01-01', 1),
(23, 'v c', 60, '4523', 'cf', 'Không', '2023-01-01', 0);

--
-- Triggers `ho_khau`
--
DELIMITER $$
CREATE TRIGGER `after_insert_ho_khau` AFTER INSERT ON `ho_khau` FOR EACH ROW BEGIN
    INSERT INTO ho_khau_log (ho_khau_id, so_ho_khau, chu_ho_id, chu_ho_CMND, dia_chi, la_chung_cu, ngay_lap, deleted)
    VALUES (NEW.ho_khau_id, NEW.so_ho_khau, NEW.chu_ho_id, NEW.chu_ho_CMND, NEW.dia_chi, NEW.la_chung_cu, NEW.ngay_lap, NEW.deleted);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_update_ho_khau` AFTER UPDATE ON `ho_khau` FOR EACH ROW BEGIN
    INSERT INTO ho_khau_log (ho_khau_id, so_ho_khau, chu_ho_id, chu_ho_CMND, dia_chi, la_chung_cu, ngay_lap, deleted)
    VALUES (NEW.ho_khau_id, NEW.so_ho_khau, NEW.chu_ho_id, NEW.chu_ho_CMND, NEW.dia_chi, NEW.la_chung_cu, NEW.ngay_lap, NEW.deleted);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_delete_chung_cu` BEFORE UPDATE ON `ho_khau` FOR EACH ROW BEGIN
  IF NEW.deleted = 1 AND OLD.deleted = 0 AND OLD.la_chung_cu = 'Có' THEN
    DELETE FROM chung_cu WHERE so_ho_khau = OLD.so_ho_khau;
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_insert_chung_cu` BEFORE INSERT ON `ho_khau` FOR EACH ROW BEGIN
  IF NEW.la_chung_cu = 'Có' THEN
    INSERT INTO chung_cu (so_ho_khau)
    VALUES (NEW.so_ho_khau);
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_update_chung_cu` BEFORE UPDATE ON `ho_khau` FOR EACH ROW BEGIN
  IF NEW.la_chung_cu = 'Có' AND OLD.la_chung_cu = 'Không' THEN
    INSERT INTO chung_cu (so_ho_khau)
    VALUES (NEW.so_ho_khau);
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `tr_update_chung_cu_on_delete` BEFORE UPDATE ON `ho_khau` FOR EACH ROW BEGIN
  IF NEW.la_chung_cu = 'Không' AND OLD.la_chung_cu = 'Có' THEN
    DELETE FROM chung_cu WHERE so_ho_khau = OLD.so_ho_khau;
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `ho_khau_log`
--

CREATE TABLE `ho_khau_log` (
  `log_ho_khau_id` int(11) NOT NULL,
  `ho_khau_id` int(11) DEFAULT NULL,
  `so_ho_khau` varchar(255) DEFAULT NULL,
  `chu_ho_id` int(11) DEFAULT NULL,
  `chu_ho_CMND` varchar(15) DEFAULT NULL,
  `dia_chi` varchar(255) DEFAULT NULL,
  `la_chung_cu` enum('Có','Không') DEFAULT NULL,
  `ngay_lap` date DEFAULT NULL,
  `deleted` int(11) DEFAULT 0,
  `log_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ho_khau_log`
--

INSERT INTO `ho_khau_log` (`log_ho_khau_id`, `ho_khau_id`, `so_ho_khau`, `chu_ho_id`, `chu_ho_CMND`, `dia_chi`, `la_chung_cu`, `ngay_lap`, `deleted`, `log_time`) VALUES
(6, 2, 'SHK002', 6, '321654789', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-12 14:54:03'),
(7, 2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-12 14:54:51'),
(8, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-12 15:58:28'),
(9, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-12 16:03:19'),
(10, 22, 'bfrwij', 58, 'eas', 'kjndsj', 'Không', '2023-01-01', 0, '2023-12-25 04:48:31'),
(11, 23, 'v c', 60, '4523', 'cf', 'Không', '2023-01-01', 0, '2023-12-25 04:51:11'),
(12, 23, 'v c', 60, '4523', 'cf', 'Có', '2023-01-01', 0, '2023-12-25 11:41:31'),
(13, 23, 'v c', 60, '4523', 'cf', 'Không', '2023-01-01', 0, '2023-12-25 11:42:26'),
(14, 22, 'bfrwij', 58, 'eas', 'kjndsj', 'Có', '2023-01-01', 0, '2023-12-25 11:43:22'),
(15, 22, 'bfrwij', 58, 'eas', 'kjndsj', 'Có', '2023-01-01', 1, '2023-12-25 11:43:45'),
(16, 22, 'bfrwij', 58, 'eas', 'kjndsj', 'Có', '2023-01-01', 0, '2023-12-25 11:50:19'),
(17, 22, 'bfrwij', 58, 'eas', 'kjndsj', 'Có', '2023-01-01', 1, '2023-12-25 11:50:36'),
(18, 4, 'SHK004', 13, '123012345', '987 Đường KLM, Quận OPQ', 'Không', '2023-04-01', 0, '2023-12-25 16:00:28'),
(19, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Không', '2023-03-01', 0, '2023-12-25 16:38:02'),
(20, 4, 'SHK004', 13, '123012345', '987 Đường KLM, Quận OPQ', 'Có', '2023-04-01', 0, '2023-12-25 16:38:25'),
(21, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-25 16:38:31'),
(22, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 1, '2023-12-25 16:38:52'),
(23, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-25 16:47:15'),
(24, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-25 16:48:23'),
(25, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Không', '2023-03-01', 0, '2023-12-25 16:49:57'),
(26, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Không', '2023-03-01', 0, '2023-12-25 16:50:04'),
(27, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-25 16:50:09');

-- --------------------------------------------------------

--
-- Table structure for table `khai_tu`
--

CREATE TABLE `khai_tu` (
  `khai_tu_id` int(11) NOT NULL,
  `nhan_khau_id` int(11) DEFAULT NULL,
  `thoi_gian` date DEFAULT NULL,
  `ly_do` varchar(255) DEFAULT NULL,
  `deleted` int(11) DEFAULT 0,
  `so_giay_khai_tu` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khai_tu`
--

INSERT INTO `khai_tu` (`khai_tu_id`, `nhan_khau_id`, `thoi_gian`, `ly_do`, `deleted`, `so_giay_khai_tu`) VALUES
(1, 18, '2023-12-25', 'Tai nạn', 0, '324242424');

-- --------------------------------------------------------

--
-- Table structure for table `khoan_dong_gop`
--

CREATE TABLE `khoan_dong_gop` (
  `id_khoan_dong_gop` int(11) NOT NULL,
  `ten_khoan_dong_gop` varchar(50) DEFAULT NULL,
  `ngay_bat_dau` date DEFAULT NULL,
  `ngay_ket_thuc` date DEFAULT NULL,
  `chi_tiet` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khoan_dong_gop`
--

INSERT INTO `khoan_dong_gop` (`id_khoan_dong_gop`, `ten_khoan_dong_gop`, `ngay_bat_dau`, `ngay_ket_thuc`, `chi_tiet`) VALUES
(1, 'Ủng hộ ngày thương binh-liệt sỹ 27/07', '2023-07-01', '2023-07-31', NULL),
(2, 'Ủng hộ ngày tết thiếu nhi', '2023-05-01', '2023-05-31', NULL),
(4, 'Trợ giúp đồng bào bị ảnh hưởng bão lụt', '2023-08-01', '2023-08-31', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `khoan_thu_phi`
--

CREATE TABLE `khoan_thu_phi` (
  `id_khoan_thu_phi` int(11) NOT NULL,
  `ten_khoan_thu_phi` varchar(50) NOT NULL,
  `tien_phi` varchar(11) DEFAULT '0',
  `ngay_bat_dau` date DEFAULT NULL,
  `ngay_ket_thuc` date DEFAULT NULL,
  `chi_tiet` varchar(50) DEFAULT NULL,
  `loai_phi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khoan_thu_phi`
--

INSERT INTO `khoan_thu_phi` (`id_khoan_thu_phi`, `ten_khoan_thu_phi`, `tien_phi`, `ngay_bat_dau`, `ngay_ket_thuc`, `chi_tiet`, `loai_phi`) VALUES
(1, 'Phí dịch vụ chung cư tháng 11', '6000', '2023-11-01', '2023-11-30', NULL, 'phí theo đầu người'),
(2, 'Phí vệ sinh chung cư tháng 11', '20000', '2023-08-01', '2023-08-31', NULL, 'phí theo hộ'),
(3, 'Phí phòng tháng 11', '80000', '2023-11-01', '2023-11-30', '', 'phí theo diện tích'),
(16, 'Phí trông xe máy tháng 11', '100000', '2023-11-01', '2023-11-30', '', 'phí theo hộ');

--
-- Triggers `khoan_thu_phi`
--
DELIMITER $$
CREATE TRIGGER `tr_update_dong_phi_after_khoan_thu_phi_update` AFTER UPDATE ON `khoan_thu_phi` FOR EACH ROW BEGIN
  -- Kiểm tra xem có sự thay đổi trong tien_phi hoặc loai_phi hay không
  IF NEW.tien_phi <> OLD.tien_phi OR NEW.loai_phi <> OLD.loai_phi THEN
    -- Cập nhật các bản ghi trong dong_phi có id_khoan_thu_phi trùng với bản ghi vừa được cập nhật
    UPDATE dong_phi
    SET so_tien = CASE
                    WHEN NEW.loai_phi = 'phí theo diện tích' THEN (SELECT dien_tich FROM chung_cu WHERE so_ho_khau = dong_phi.so_ho_khau) * NEW.tien_phi
                    WHEN NEW.loai_phi = 'phí theo đầu người' THEN (SELECT COUNT(*) FROM nhan_khau WHERE so_ho_khau = dong_phi.so_ho_khau) * NEW.tien_phi
                    WHEN NEW.loai_phi = 'phí theo hộ' THEN NEW.tien_phi
                    ELSE dong_phi.so_tien
                  END
    WHERE id_khoan_thu_phi = NEW.id_khoan_thu_phi;
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `ngan_quy_tang_thuong`
--

CREATE TABLE `ngan_quy_tang_thuong` (
  `id_ngan_quy_tang_thuong` int(11) NOT NULL,
  `so_tien_thay_doi` int(11) NOT NULL DEFAULT 0,
  `ngay_thay_doi` date NOT NULL,
  `tong_so_tien` int(11) NOT NULL DEFAULT 0,
  `chi_tiet` varchar(1024) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0,
  `so_tien_ban_dau` int(11) NOT NULL DEFAULT 10000000
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ngan_quy_tang_thuong`
--

INSERT INTO `ngan_quy_tang_thuong` (`id_ngan_quy_tang_thuong`, `so_tien_thay_doi`, `ngay_thay_doi`, `tong_so_tien`, `chi_tiet`, `isDeleted`, `so_tien_ban_dau`) VALUES
(30, 50000, '2023-12-26', 887000, 'Thuong hoc sinh Trung bình hoc ky 20101', 0, 1000000),
(31, 0, '2023-12-26', 887000, 'Thuong hoc sinh Tết thiếu nhi 2010 hoc ky Tết thiếu nhi 2010', 0, 1000000),
(32, 63000, '2023-12-26', 887000, 'Thuong hoc sinh Tết thiếu nhi 2009 hoc ky Tết thiếu nhi 2009', 0, 1000000);

-- --------------------------------------------------------

--
-- Table structure for table `nhan_khau`
--

CREATE TABLE `nhan_khau` (
  `nhan_khau_id` int(11) NOT NULL,
  `ho_ten` varchar(255) NOT NULL,
  `biet_danh` varchar(50) DEFAULT NULL,
  `gioi_tinh` enum('Nam','Nữ','Khác') NOT NULL,
  `ngay_sinh` date NOT NULL,
  `so_CMND` varchar(15) DEFAULT NULL,
  `ngay_cap_CMND` date DEFAULT NULL,
  `noi_cap_CMND` varchar(255) DEFAULT NULL,
  `noi_sinh` varchar(255) NOT NULL,
  `nguyen_quan` varchar(255) NOT NULL,
  `dan_toc` varchar(50) NOT NULL,
  `nghe_nghiep` varchar(255) DEFAULT NULL,
  `noi_lam_viec` varchar(255) DEFAULT NULL,
  `quan_he_voi_chu_ho` varchar(255) DEFAULT NULL,
  `ngay_dang_ky_thuong_tru` date NOT NULL,
  `dia_chi_truoc_khi_chuyen` varchar(255) DEFAULT NULL,
  `chuyen_di` enum('Có','Không') NOT NULL DEFAULT 'Không',
  `deleted` int(11) DEFAULT 0,
  `so_ho_khau` varchar(255) NOT NULL,
  `qua_doi` enum('Có','Không') DEFAULT 'Không'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nhan_khau`
--

INSERT INTO `nhan_khau` (`nhan_khau_id`, `ho_ten`, `biet_danh`, `gioi_tinh`, `ngay_sinh`, `so_CMND`, `ngay_cap_CMND`, `noi_cap_CMND`, `noi_sinh`, `nguyen_quan`, `dan_toc`, `nghe_nghiep`, `noi_lam_viec`, `quan_he_voi_chu_ho`, `ngay_dang_ky_thuong_tru`, `dia_chi_truoc_khi_chuyen`, `chuyen_di`, `deleted`, `so_ho_khau`, `qua_doi`) VALUES
(1, 'Nguyen Van A', NULL, 'Nam', '1990-01-01', '123456789', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Sinh vien', '', 'Chủ hộ', '2023-01-01', NULL, 'Không', 0, 'SHK001', 'Không'),
(2, 'Tran Thi B', NULL, 'Nữ', '1995-02-15', '987654321', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Vợ', '2023-01-02', NULL, 'Không', 0, 'SHK001', 'Không'),
(3, 'Le Van C', NULL, 'Nam', '1988-03-20', '456789123', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kỹ sư', '', 'Con', '2023-01-03', NULL, 'Không', 0, 'SHK001', 'Không'),
(4, 'Pham Thi D', NULL, 'Nữ', '1992-04-10', '789456123', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Y sĩ', '', 'Con', '2023-01-04', NULL, 'Không', 0, 'SHK001', 'Không'),
(5, 'Vo Van E', NULL, 'Nam', '1985-05-05', '654321987', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kinh doanh', '', 'Chủ hộ', '2023-02-01', NULL, 'Không', 0, 'SHK002', 'Không'),
(6, 'Do Thi F', NULL, 'Nữ', '1990-06-12', '321654789', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nghệ sĩ', '', 'Vợ', '2023-02-02', NULL, 'Không', 0, 'SHK002', 'Không'),
(7, 'Nguyen Van G', NULL, 'Nam', '1987-07-25', '987123654', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Lập trình viên', '', 'Con', '2023-02-03', NULL, 'Không', 0, 'SHK002', 'Không'),
(8, 'Tran Van H', NULL, 'Nam', '1993-08-30', '456789012', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Con', '2023-02-04', NULL, 'Không', 0, 'SHK002', 'Không'),
(9, 'Le Thi I', NULL, 'Nữ', '1996-09-15', '789012345', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Sinh viên', '', 'Chủ hộ', '2023-03-01', NULL, 'Không', 0, 'SHK003', 'Không'),
(10, 'Pham Van K', NULL, 'Nam', '1991-10-18', '012345678', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Bác sĩ', '', 'Vợ', '2023-03-02', NULL, 'Không', 0, 'SHK003', 'Không'),
(11, 'Hoang Van L', NULL, 'Nam', '1989-11-22', '345678901', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kỹ thuật viên', '', 'Con', '2023-03-03', NULL, 'Không', 0, 'SHK003', 'Không'),
(12, 'Nguyen Thi M', NULL, 'Nữ', '1994-12-25', '678901234', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên văn phòng', '', 'Con', '2023-03-04', NULL, 'Không', 0, 'SHK003', 'Không'),
(13, 'Do Van N', NULL, 'Nam', '1984-01-30', '123012345', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên', '', 'Chủ hộ', '2023-04-01', NULL, 'Không', 0, 'SHK004', 'Không'),
(14, 'Le Thi O', NULL, 'Nữ', '1986-02-14', '567890123', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nghệ sĩ', '', 'Vợ', '2023-04-02', NULL, 'Không', 0, 'SHK004', 'Không'),
(15, 'Phan Van P', NULL, 'Nam', '1983-03-18', '901234567', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Con', '2023-04-03', NULL, 'Không', 0, 'SHK004', 'Không'),
(16, 'Tran Thi Q', NULL, 'Nữ', '1988-04-23', '234567890', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên kế toán', '', 'Con', '2023-04-04', NULL, 'Không', 0, 'SHK004', 'Không'),
(17, 'Nguyen Van X', 'X', 'Nam', '1990-01-01', '123456781', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường ABC', 'Con', '2022-01-01', '123 Đường ABC, Quận XYZ', 'Không', 0, 'SHK001', 'Không'),
(18, 'Nguyen Thi Y', '', 'Nữ', '1995-02-15', '987054321', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường XYZ', 'Con', '2022-01-01', '456 Đường XYZ, Quận UVW', 'Không', 0, 'SHK002', 'Có'),
(19, 'Nguyen Van rA', 'A', 'Nam', '1990-01-01', '123456729', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường ABC', 'Chủ hộ', '2022-01-01', '1233 Đường ABC, Quận XYZ', 'Không', 0, 'SHK005', 'Không'),
(46, 'Trần A A', 'A A', 'Nam', '2020-02-02', '', NULL, '', 'Hanoi', 'Hanoi', 'Hanoi', '', '', 'Con', '2020-02-02', '', 'Không', 0, 'SHK003', 'Không'),
(47, 'Trần POPO', 'POPO', 'Nữ', '2020-02-02', '342422434', '2020-02-02', 'Hải Phòng', 'Hải Phòng', 'Hải Phòng', 'Kinh', 'Sinh viên', 'Trường T', 'Vợ', '2020-02-02', '', 'Không', 0, 'SHK005', 'Không'),
(58, 'sd', '', 'Nam', '2023-01-01', 'eas', '2023-01-01', 'dvd', 'á', 'dv', 'ac', 'a', 'ac', 'Chủ hộ', '2023-01-01', 's', 'Không', 1, 'bfrwij', 'Không'),
(59, 'easce', 'x cx xc x', 'Nam', '2023-01-01', NULL, NULL, '', 'y', '6', 'y', 'y', 'y', 'a', '2023-01-01', '', 'Không', 1, 'bfrwij', 'Không'),
(60, 'evd', '', 'Nam', '2023-01-01', '4523', '2023-01-01', 'scs', 'ssc ', 'sc', ' ss', 's', 'cssc', 'Chủ hộ', '2023-01-01', 'sa', 'Không', 0, 'v c', 'Không');

--
-- Triggers `nhan_khau`
--
DELIMITER $$
CREATE TRIGGER `trg_them_moi_khai_tu` AFTER UPDATE ON `nhan_khau` FOR EACH ROW BEGIN
    IF NEW.qua_doi = 'Có' AND OLD.qua_doi = 'Không' THEN
        INSERT INTO khai_tu (nhan_khau_id, thoi_gian, ly_do, deleted)
        VALUES (NEW.nhan_khau_id, NOW(), '', 0);
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trg_xoa_khai_tu` AFTER UPDATE ON `nhan_khau` FOR EACH ROW BEGIN
    IF NEW.qua_doi = 'Không' AND OLD.qua_doi = 'Có' THEN
        UPDATE khai_tu SET deleted = 1 WHERE nhan_khau_id = NEW.nhan_khau_id;
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tam_tru`
--

CREATE TABLE `tam_tru` (
  `tam_tru_id` int(11) NOT NULL,
  `ho_ten` varchar(255) NOT NULL,
  `ngay_sinh` date NOT NULL,
  `so_CMND` varchar(15) NOT NULL,
  `ngay_cap` date DEFAULT NULL,
  `noi_cap` varchar(255) DEFAULT NULL,
  `gioi_tinh` varchar(255) NOT NULL,
  `dia_chi_thuong_tru` varchar(255) NOT NULL,
  `cho_o_hien_tai` varchar(255) NOT NULL,
  `ly_do` varchar(255) NOT NULL,
  `deleted` int(11) DEFAULT 0,
  `ngay_tam_tru` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tam_tru`
--

INSERT INTO `tam_tru` (`tam_tru_id`, `ho_ten`, `ngay_sinh`, `so_CMND`, `ngay_cap`, `noi_cap`, `gioi_tinh`, `dia_chi_thuong_tru`, `cho_o_hien_tai`, `ly_do`, `deleted`, `ngay_tam_tru`) VALUES
(1, 'Nguyễn Văn A', '1990-01-15', '123456789', '2010-05-20', 'TP.HCM', 'Nam', 'Quận 1, TP.HCM', 'Phòng trọ ABCRFGRFR', 'Lý do A', 0, '2023-01-05'),
(2, 'Trần Thị B', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 0, '2023-01-01'),
(3, 'Lê Minh C', '1995-04-05', '456789123', '2015-09-12', 'Đà Nẵng', 'Nam', 'Hải Châu, Đà Nẵng', 'Chung cư XYZ', 'Lý do C', 0, '2023-01-01'),
(5, 'Trần Thị A', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 1, '2023-01-01'),
(6, 'Trần Thị A', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 1, '2023-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `tam_vang`
--

CREATE TABLE `tam_vang` (
  `tam_vang_id` int(11) NOT NULL,
  `nhan_khau_id` int(11) DEFAULT NULL,
  `ngay_bat_dau` date DEFAULT NULL,
  `ngay_ket_thuc` date DEFAULT NULL,
  `ly_do` varchar(255) DEFAULT NULL,
  `so_CMND` varchar(15) DEFAULT NULL,
  `dia_chi_noi_den` varchar(255) DEFAULT NULL,
  `deleted` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tam_vang`
--

INSERT INTO `tam_vang` (`tam_vang_id`, `nhan_khau_id`, `ngay_bat_dau`, `ngay_ket_thuc`, `ly_do`, `so_CMND`, `dia_chi_noi_den`, `deleted`) VALUES
(1, 1, '2023-01-01', '2023-02-01', 'Công tác', '123456789', 'Địa chỉ 1', 0),
(2, 2, '2023-03-01', '2023-04-01', 'Du lịch', '987654321', 'Địa chỉ 2', 0),
(4, 3, '2023-05-01', '2023-06-01', 'Học tập', '456789123', 'Địa chỉ 3', 0),
(5, 16, '2023-03-03', '2023-09-03', 'Đi học', '234567890', '234 phố ABC', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tang_thuong`
--

CREATE TABLE `tang_thuong` (
  `id_dip_tang_thuong` int(11) DEFAULT NULL,
  `so_ho_khau` varchar(255) NOT NULL,
  `hoc_ky` varchar(256) NOT NULL,
  `chi_tiet_phan_qua` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`chi_tiet_phan_qua`)),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tang_thuong`
--

INSERT INTO `tang_thuong` (`id_dip_tang_thuong`, `so_ho_khau`, `hoc_ky`, `chi_tiet_phan_qua`, `isDeleted`) VALUES
(30, 'SHK001', '20101', '{\"Trung bình\":1}', 0),
(32, 'SHK001', 'Tết thiếu nhi 2009', '{\"Tết thiếu nhi 2009\":2}', 0),
(32, 'SHK002', 'Tết thiếu nhi 2009', '{\"Tết thiếu nhi 2009\":2}', 0),
(32, 'SHK003', 'Tết thiếu nhi 2009', '{\"Tết thiếu nhi 2009\":3}', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `email`, `is_admin`, `password`) VALUES
(1, 'admin', 'admin@example.com', 1, '12345'),
(2, 'user1', 'user1@example.com', 0, 'password123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chung_cu`
--
ALTER TABLE `chung_cu`
  ADD KEY `chung_cu_ibfk_1` (`so_ho_khau`);

--
-- Indexes for table `dip_tang_thuong`
--
ALTER TABLE `dip_tang_thuong`
  ADD PRIMARY KEY (`id_dip_tang_thuong`),
  ADD UNIQUE KEY `thanh_tich` (`thanh_tich`,`hoc_ky`,`isDeleted`) USING HASH;

--
-- Indexes for table `dong_gop`
--
ALTER TABLE `dong_gop`
  ADD PRIMARY KEY (`id_dong_gop`),
  ADD KEY `fk_dong_gop_1` (`so_ho_khau`),
  ADD KEY `fk_dong_gop_2` (`id_khoan_dong_gop`);

--
-- Indexes for table `dong_phi`
--
ALTER TABLE `dong_phi`
  ADD PRIMARY KEY (`id_dong_phi`),
  ADD KEY `dong_phi_ibfk_1` (`id_khoan_thu_phi`),
  ADD KEY `dong_phi_ibfk_2` (`so_ho_khau`);

--
-- Indexes for table `hoc_sinh`
--
ALTER TABLE `hoc_sinh`
  ADD PRIMARY KEY (`nhan_khau_id`,`hoc_ky`),
  ADD KEY `nhan_khau_id` (`nhan_khau_id`);

--
-- Indexes for table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD PRIMARY KEY (`ho_khau_id`),
  ADD UNIQUE KEY `so_ho_khau` (`so_ho_khau`),
  ADD KEY `fk_chu_ho_nhan_khau` (`chu_ho_id`);

--
-- Indexes for table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  ADD PRIMARY KEY (`log_ho_khau_id`),
  ADD KEY `fk_log_ho_khau_ho_khau` (`ho_khau_id`);

--
-- Indexes for table `khai_tu`
--
ALTER TABLE `khai_tu`
  ADD PRIMARY KEY (`khai_tu_id`);

--
-- Indexes for table `khoan_dong_gop`
--
ALTER TABLE `khoan_dong_gop`
  ADD PRIMARY KEY (`id_khoan_dong_gop`);

--
-- Indexes for table `khoan_thu_phi`
--
ALTER TABLE `khoan_thu_phi`
  ADD PRIMARY KEY (`id_khoan_thu_phi`);

--
-- Indexes for table `ngan_quy_tang_thuong`
--
ALTER TABLE `ngan_quy_tang_thuong`
  ADD PRIMARY KEY (`id_ngan_quy_tang_thuong`);

--
-- Indexes for table `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD PRIMARY KEY (`nhan_khau_id`),
  ADD UNIQUE KEY `so_CMND` (`so_CMND`);

--
-- Indexes for table `tam_tru`
--
ALTER TABLE `tam_tru`
  ADD PRIMARY KEY (`tam_tru_id`);

--
-- Indexes for table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD PRIMARY KEY (`tam_vang_id`),
  ADD KEY `nhan_khau_id` (`nhan_khau_id`),
  ADD KEY `so_CMND` (`so_CMND`);

--
-- Indexes for table `tang_thuong`
--
ALTER TABLE `tang_thuong`
  ADD PRIMARY KEY (`so_ho_khau`,`hoc_ky`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dip_tang_thuong`
--
ALTER TABLE `dip_tang_thuong`
  MODIFY `id_dip_tang_thuong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `dong_gop`
--
ALTER TABLE `dong_gop`
  MODIFY `id_dong_gop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `dong_phi`
--
ALTER TABLE `dong_phi`
  MODIFY `id_dong_phi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `ho_khau`
--
ALTER TABLE `ho_khau`
  MODIFY `ho_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  MODIFY `log_ho_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `khai_tu`
--
ALTER TABLE `khai_tu`
  MODIFY `khai_tu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `khoan_dong_gop`
--
ALTER TABLE `khoan_dong_gop`
  MODIFY `id_khoan_dong_gop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `khoan_thu_phi`
--
ALTER TABLE `khoan_thu_phi`
  MODIFY `id_khoan_thu_phi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `nhan_khau`
--
ALTER TABLE `nhan_khau`
  MODIFY `nhan_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT for table `tam_vang`
--
ALTER TABLE `tam_vang`
  MODIFY `tam_vang_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chung_cu`
--
ALTER TABLE `chung_cu`
  ADD CONSTRAINT `chung_cu_ibfk_1` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau` (`so_ho_khau`);

--
-- Constraints for table `dong_gop`
--
ALTER TABLE `dong_gop`
  ADD CONSTRAINT `fk_dong_gop_1` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau` (`so_ho_khau`),
  ADD CONSTRAINT `fk_dong_gop_2` FOREIGN KEY (`id_khoan_dong_gop`) REFERENCES `khoan_dong_gop` (`id_khoan_dong_gop`) ON DELETE CASCADE;

--
-- Constraints for table `dong_phi`
--
ALTER TABLE `dong_phi`
  ADD CONSTRAINT `dong_phi_ibfk_1` FOREIGN KEY (`id_khoan_thu_phi`) REFERENCES `khoan_thu_phi` (`id_khoan_thu_phi`) ON DELETE CASCADE,
  ADD CONSTRAINT `dong_phi_ibfk_2` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau` (`so_ho_khau`);

--
-- Constraints for table `hoc_sinh`
--
ALTER TABLE `hoc_sinh`
  ADD CONSTRAINT `hoc_sinh_ibfk_1` FOREIGN KEY (`nhan_khau_id`) REFERENCES `nhan_khau` (`nhan_khau_id`);

--
-- Constraints for table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD CONSTRAINT `fk_chu_ho_nhan_khau` FOREIGN KEY (`chu_ho_id`) REFERENCES `nhan_khau` (`nhan_khau_id`) ON DELETE CASCADE;

--
-- Constraints for table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  ADD CONSTRAINT `fk_log_ho_khau_ho_khau` FOREIGN KEY (`ho_khau_id`) REFERENCES `ho_khau` (`ho_khau_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `ho_khau_log_ibfk_1` FOREIGN KEY (`ho_khau_id`) REFERENCES `ho_khau` (`ho_khau_id`);

--
-- Constraints for table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD CONSTRAINT `tam_vang_ibfk_1` FOREIGN KEY (`nhan_khau_id`) REFERENCES `nhan_khau` (`nhan_khau_id`),
  ADD CONSTRAINT `tam_vang_ibfk_2` FOREIGN KEY (`so_CMND`) REFERENCES `nhan_khau` (`so_CMND`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
