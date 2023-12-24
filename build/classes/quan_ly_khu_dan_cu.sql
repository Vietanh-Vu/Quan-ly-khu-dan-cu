-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 23 déc. 2023 à 10:52
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `quan_ly_khu_dan_cu`
--

-- --------------------------------------------------------

--
-- Structure de la table `ho_khau`
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
-- Déchargement des données de la table `ho_khau`
--

INSERT INTO `ho_khau` (`ho_khau_id`, `so_ho_khau`, `chu_ho_id`, `chu_ho_CMND`, `dia_chi`, `la_chung_cu`, `ngay_lap`, `deleted`) VALUES
(1, 'SHK001', 1, '123456789', '123 Đường ABC, Quận XYZ', 'Có', '2023-01-01', 0),
(2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0),
(3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0),
(4, 'SHK004', 13, '123012345', '987 Đường KLM, Quận OPQ', 'Có', '2023-04-01', 0),
(5, 'SHK005', 19, '123456729', '1234 Đường ABC, Quận XYZ', 'Không', '2022-01-01', 0),
(22, 'fbfbfb', 59, '21434243124', '54543 ggrg', 'Không', '2020-02-02', 1),
(23, 'đvfddđ', 60, 'đvddd', 'd', 'Không', '2020-02-02', 1),
(24, 'd', 61, 'd', 'd', 'Không', '2020-02-02', 1),
(25, 's', 62, 's', 's', 'Không', '2020-02-02', 1),
(26, 'SHK009', 3, '456789123', '234 AAAA', 'Không', '2023-02-02', 1),
(27, 'SHK008', 2, '987654321', '323 Lotty', 'Không', '2023-04-03', 1),
(28, '23434234r234', 2, '987654321', '43243 aaaaaa', 'Không', '2023-02-02', 1),
(29, 'SHK006', 2, '987654321', '10 AA', 'Không', '2020-02-03', 0),
(30, 'SHK007', 14, '567890123', '345 OIII', 'Không', '2023-02-09', 0);

--
-- Déclencheurs `ho_khau`
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

-- --------------------------------------------------------

--
-- Structure de la table `ho_khau_log`
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
-- Déchargement des données de la table `ho_khau_log`
--

INSERT INTO `ho_khau_log` (`log_ho_khau_id`, `ho_khau_id`, `so_ho_khau`, `chu_ho_id`, `chu_ho_CMND`, `dia_chi`, `la_chung_cu`, `ngay_lap`, `deleted`, `log_time`) VALUES
(6, 2, 'SHK002', 6, '321654789', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-12 14:54:03'),
(7, 2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-12 14:54:51'),
(8, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-12 15:58:28'),
(9, 3, 'SHK003', 9, '789012345', '789 Đường GHI, Quận LMN', 'Có', '2023-03-01', 0, '2023-12-12 16:03:19'),
(10, 2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-22 14:26:14'),
(11, 2, 'SHK002', 5, '654321987', '456 Đường DEF, Quận UVW', 'Không', '2023-02-01', 0, '2023-12-22 14:49:37'),
(12, 22, 'fbfbfb', 59, '21434243124', 'dvvv', 'Không', '2020-02-02', 0, '2023-12-23 08:46:41'),
(13, 22, 'fbfbfb', 59, '21434243124', 'dvvv', 'Không', '2020-02-02', 0, '2023-12-23 08:46:41'),
(14, 22, 'fbfbfb', 59, '21434243124', 'dvvvdqswws', 'Không', '2020-02-02', 0, '2023-12-23 08:47:31'),
(15, 22, 'fbfbfb', 59, '21434243124', 'dvvvdqswws', 'Không', '2020-02-02', 0, '2023-12-23 08:47:31'),
(16, 22, 'fbfbfb', 59, '21434243124', '54543 ggrg', 'Không', '2020-02-02', 0, '2023-12-23 08:48:58'),
(17, 23, 'đvfddđ', 60, 'đvddd', 'd', 'Không', '2020-02-02', 0, '2023-12-23 08:49:47'),
(18, 22, 'fbfbfb', 59, '21434243124', '54543 ggrg', 'Không', '2020-02-02', 0, '2023-12-23 08:50:02'),
(19, 22, 'fbfbfb', 59, '21434243124', '54543 ggrg', 'Không', '2020-02-02', 0, '2023-12-23 08:50:02'),
(20, 23, 'đvfddđ', 60, 'đvddd', 'd', 'Không', '2020-02-02', 0, '2023-12-23 08:50:08'),
(21, 23, 'đvfddđ', 60, 'đvddd', 'd', 'Không', '2020-02-02', 0, '2023-12-23 08:50:08'),
(22, 24, 'd', 61, 'd', 'd', 'Không', '2020-02-02', 0, '2023-12-23 08:55:25'),
(23, 24, 'd', 61, 'd', 'd', 'Không', '2020-02-02', 1, '2023-12-23 08:55:31'),
(24, 24, 'd', 61, 'd', 'd', 'Không', '2020-02-02', 0, '2023-12-23 08:55:31'),
(25, 25, 's', 62, 's', 's', 'Không', '2020-02-02', 0, '2023-12-23 08:57:16'),
(26, 25, 's', 62, 's', 's', 'Không', '2020-02-02', 1, '2023-12-23 08:57:24'),
(27, 26, 'SHK009', 3, '456789123', '234 AAAA', 'Không', '2023-02-02', 0, '2023-12-23 09:05:51'),
(28, 26, 'SHK009', 3, '456789123', '234 AAAA', 'Không', '2023-02-02', 1, '2023-12-23 09:08:08'),
(29, 27, 'SHK008', 2, '987654321', '323 Lotty', 'Không', '2023-04-03', 0, '2023-12-23 09:08:46'),
(30, 27, 'SHK008', 2, '987654321', '323 Lotty', 'Không', '2023-04-03', 1, '2023-12-23 09:11:04'),
(31, 28, '23434234r234', 2, '987654321', '43243 aaaaaa', 'Không', '2023-02-02', 0, '2023-12-23 09:11:28'),
(32, 28, '23434234r234', 2, '987654321', '43243 aaaaaa', 'Không', '2023-02-02', 1, '2023-12-23 09:14:43'),
(33, 29, 'SHK006', 2, '987654321', '10 AA', 'Không', '2020-02-03', 0, '2023-12-23 09:15:22'),
(34, 30, 'SHK007', 14, '567890123', '345 OIII', 'Không', '2023-02-09', 0, '2023-12-23 09:17:27');

-- --------------------------------------------------------

--
-- Structure de la table `khai_tu`
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
-- Déchargement des données de la table `khai_tu`
--

INSERT INTO `khai_tu` (`khai_tu_id`, `nhan_khau_id`, `thoi_gian`, `ly_do`, `deleted`, `so_giay_khai_tu`) VALUES
(1, 18, '2023-12-22', 'tuổi cao', 0, '409535345');

-- --------------------------------------------------------

--
-- Structure de la table `nhan_khau`
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
-- Déchargement des données de la table `nhan_khau`
--

INSERT INTO `nhan_khau` (`nhan_khau_id`, `ho_ten`, `biet_danh`, `gioi_tinh`, `ngay_sinh`, `so_CMND`, `ngay_cap_CMND`, `noi_cap_CMND`, `noi_sinh`, `nguyen_quan`, `dan_toc`, `nghe_nghiep`, `noi_lam_viec`, `quan_he_voi_chu_ho`, `ngay_dang_ky_thuong_tru`, `dia_chi_truoc_khi_chuyen`, `chuyen_di`, `deleted`, `so_ho_khau`, `qua_doi`) VALUES
(1, 'Nguyen Van A', NULL, 'Nam', '1990-01-01', '123456789', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Sinh vien', '', 'Chủ hộ', '2023-01-01', NULL, 'Không', 0, 'SHK001', 'Không'),
(2, 'Tran Thi B', NULL, 'Nữ', '1995-02-15', '987654321', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Chủ hộ', '2023-01-02', NULL, 'Không', 0, 'SHK006', 'Không'),
(3, 'Le Van C', NULL, 'Nam', '1988-03-20', '456789123', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kỹ sư', '', 'Con', '2023-01-03', NULL, 'Không', 0, 'SHK001', 'Không'),
(4, 'Pham Thi D', 'bà D', 'Nữ', '1992-04-10', '789456123', NULL, '', 'Hanoi', 'Hanoi', 'Kinh', 'Y sĩ', '', NULL, '2023-01-04', '', 'Không', 0, 'SHK006', 'Không'),
(5, 'Vo Van E', NULL, 'Nam', '1985-05-05', '654321987', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kinh doanh', '', 'Chủ hộ', '2023-02-01', NULL, 'Không', 0, 'SHK002', 'Không'),
(6, 'Do Thi F', NULL, 'Nữ', '1990-06-12', '321654789', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nghệ sĩ', '', 'Vợ', '2023-02-02', NULL, 'Không', 0, 'SHK002', 'Không'),
(7, 'Nguyen Van G', NULL, 'Nam', '1987-07-25', '987123654', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Lập trình viên', '', 'Con', '2023-02-03', NULL, 'Không', 0, 'SHK002', 'Không'),
(8, 'Tran Van H', NULL, 'Nam', '1993-08-30', '456789012', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Con', '2023-02-04', NULL, 'Không', 0, 'SHK002', 'Không'),
(9, 'Le Thi I', NULL, 'Nữ', '1996-09-15', '789012345', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Sinh viên', '', 'Chủ hộ', '2023-03-01', NULL, 'Không', 0, 'SHK003', 'Không'),
(10, 'Pham Van K', NULL, 'Nam', '1991-10-18', '012345678', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Bác sĩ', '', 'Vợ', '2023-03-02', NULL, 'Không', 0, 'SHK003', 'Không'),
(11, 'Hoang Van L', NULL, 'Nam', '1989-11-22', '345678901', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Kỹ thuật viên', '', 'Con', '2023-03-03', NULL, 'Không', 0, 'SHK003', 'Không'),
(12, 'Nguyen Thi M', NULL, 'Nữ', '1994-12-25', '678901234', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên văn phòng', '', 'Con', '2023-03-04', NULL, 'Không', 0, 'SHK003', 'Không'),
(13, 'Do Van N', NULL, 'Nam', '1984-01-30', '123012345', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên', '', 'Chủ hộ', '2023-04-01', NULL, 'Không', 0, 'SHK004', 'Không'),
(14, 'Le Thi O', NULL, 'Nữ', '1986-02-14', '567890123', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nghệ sĩ', '', 'Chủ hộ', '2023-04-02', NULL, 'Không', 0, 'SHK007', 'Không'),
(15, 'Phan Van P', NULL, 'Nam', '1983-03-18', '901234567', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Giáo viên', '', 'Con', '2023-04-03', NULL, 'Không', 0, 'SHK004', 'Không'),
(16, 'Tran Thi Q', NULL, 'Nữ', '1988-04-23', '234567890', NULL, NULL, 'Hanoi', 'Hanoi', 'Kinh', 'Nhân viên kế toán', '', 'Con', '2023-04-04', NULL, 'Không', 0, 'SHK004', 'Không'),
(17, 'Nguyen Van X', 'X', 'Nam', '1990-01-01', '123456781', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường ABC', 'Con', '2022-01-01', '123 Đường ABC, Quận XYZ', 'Không', 0, 'SHK001', 'Không'),
(18, 'Nguyen Thi Y', '', 'Nữ', '1995-02-15', '987054321', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường XYZ', 'Con', '2022-01-01', '456 Đường XYZ, Quận UVW', 'Không', 0, 'SHK002', 'Có'),
(19, 'Nguyen Van rA', 'A', 'Nam', '1990-01-01', '123456729', '2022-01-01', 'TP Hanoi', 'TP Hanoi', 'TP Hanoi', 'Kinh', 'Sinh viên', 'Trường ABC', 'Chủ hộ', '2022-01-01', '1233 Đường ABC, Quận XYZ', 'Không', 0, 'SHK005', 'Không'),
(46, 'Trần A A', 'A A', 'Nam', '2020-02-02', '', NULL, '', 'Hanoi', 'Hanoi', 'Hanoi', '', '', 'Con', '2020-02-02', '', 'Không', 0, 'SHK003', 'Không'),
(47, 'Trần POPO', 'POPO', 'Nữ', '2020-02-02', '342422434', '2020-02-02', 'Hải Phòng', 'Hải Phòng', 'Hải Phòng', 'Kinh', 'Sinh viên', 'Trường T', 'Vợ', '2020-02-02', '', 'Không', 0, 'SHK005', 'Không'),
(58, 'f', '', 'Nam', '2020-02-02', NULL, NULL, '', 'r', 'r', 'r', '', '', 'rrr', '2020-02-02', '', 'Không', 1, 'rrrr', 'Không'),
(59, 'dddd', 'd', 'Nam', '2020-02-02', '21434243124', '2020-02-02', 'fdvgf', 'fvffvf', 'fbvf', 'ffff', 'fv', 'f', 'Chủ hộ', '2020-02-02', 'ddd', 'Không', 1, 'fbfbfb', 'Không'),
(60, 'f', 'f', 'Nam', '2020-02-02', 'đvddd', '2020-02-02', 'd', 'd', 'd', 'd', 'd', 'd', 'Chủ hộ', '2020-02-02', 'd', 'Không', 1, 'đvfddđ', 'Không'),
(61, 'd', 'd', 'Nam', '2020-02-02', 'd', '2020-02-02', 'q', 'd', 'f', 'd', 'd', 'd', 'Chủ hộ', '2020-02-02', 's', 'Không', 1, 'd', 'Không'),
(62, 's', 's', 'Nam', '2020-02-02', 's', '2020-02-02', 's', 's', 's', 's', 's', 's', 'Chủ hộ', '2020-02-02', 'd', 'Không', 1, 's', 'Không');

--
-- Déclencheurs `nhan_khau`
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
-- Structure de la table `tam_tru`
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
-- Déchargement des données de la table `tam_tru`
--

INSERT INTO `tam_tru` (`tam_tru_id`, `ho_ten`, `ngay_sinh`, `so_CMND`, `ngay_cap`, `noi_cap`, `gioi_tinh`, `dia_chi_thuong_tru`, `cho_o_hien_tai`, `ly_do`, `deleted`, `ngay_tam_tru`) VALUES
(1, 'Nguyễn Văn A', '1990-01-15', '123456789', '2010-05-20', 'TP.HCM', 'Nam', 'Quận 1, TP.HCM', 'Phòng trọ ABCRFGRFR', 'Lý do A', 0, '2023-01-05'),
(2, 'Trần Thị B', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 0, '2023-01-01'),
(3, 'Lê Minh C', '1995-04-05', '456789123', '2015-09-12', 'Đà Nẵng', 'Nam', 'Hải Châu, Đà Nẵng', 'Chung cư XYZ', 'Lý do C', 0, '2023-01-01'),
(5, 'Trần Thị A', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 1, '2023-01-01'),
(6, 'Trần Thị A', '1985-08-22', '987654321', '2008-03-10', 'Hà Nội', 'Nữ', 'Ba Đình, Hà Nội', 'Nhà riêng', 'Lý do B', 1, '2023-01-01');

-- --------------------------------------------------------

--
-- Structure de la table `tam_vang`
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
-- Déchargement des données de la table `tam_vang`
--

INSERT INTO `tam_vang` (`tam_vang_id`, `nhan_khau_id`, `ngay_bat_dau`, `ngay_ket_thuc`, `ly_do`, `so_CMND`, `dia_chi_noi_den`, `deleted`) VALUES
(1, 1, '2023-01-01', '2023-02-01', 'Công tác', '123456789', 'Địa chỉ 1', 0),
(2, 2, '2023-03-01', '2023-04-01', 'Du lịch', '987654321', 'Địa chỉ 2', 0),
(4, 3, '2023-05-01', '2023-06-01', 'Học tập', '456789123', 'Địa chỉ 3', 0),
(5, 16, '2023-03-03', '2023-09-03', 'Đi học', '234567890', '234 phố ABC', 0),
(6, 1, '2020-02-02', '2020-02-02', '2020-02-02', '123456789', '2020-02-02', 1);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`user_id`, `username`, `email`, `is_admin`, `password`) VALUES
(1, 'admin', 'admin@example.com', 1, '12345'),
(2, 'user1', 'user1@example.com', 0, 'password123');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD PRIMARY KEY (`ho_khau_id`),
  ADD UNIQUE KEY `so_ho_khau` (`so_ho_khau`),
  ADD KEY `fk_chu_ho_nhan_khau` (`chu_ho_id`);

--
-- Index pour la table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  ADD PRIMARY KEY (`log_ho_khau_id`),
  ADD KEY `fk_log_ho_khau_ho_khau` (`ho_khau_id`);

--
-- Index pour la table `khai_tu`
--
ALTER TABLE `khai_tu`
  ADD PRIMARY KEY (`khai_tu_id`);

--
-- Index pour la table `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD PRIMARY KEY (`nhan_khau_id`),
  ADD UNIQUE KEY `so_CMND` (`so_CMND`);

--
-- Index pour la table `tam_tru`
--
ALTER TABLE `tam_tru`
  ADD PRIMARY KEY (`tam_tru_id`);

--
-- Index pour la table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD PRIMARY KEY (`tam_vang_id`),
  ADD KEY `nhan_khau_id` (`nhan_khau_id`),
  ADD KEY `so_CMND` (`so_CMND`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `ho_khau`
--
ALTER TABLE `ho_khau`
  MODIFY `ho_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT pour la table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  MODIFY `log_ho_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT pour la table `khai_tu`
--
ALTER TABLE `khai_tu`
  MODIFY `khai_tu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `nhan_khau`
--
ALTER TABLE `nhan_khau`
  MODIFY `nhan_khau_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT pour la table `tam_tru`
--
ALTER TABLE `tam_tru`
  MODIFY `tam_tru_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `tam_vang`
--
ALTER TABLE `tam_vang`
  MODIFY `tam_vang_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD CONSTRAINT `fk_chu_ho_nhan_khau` FOREIGN KEY (`chu_ho_id`) REFERENCES `nhan_khau` (`nhan_khau_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `ho_khau_log`
--
ALTER TABLE `ho_khau_log`
  ADD CONSTRAINT `fk_log_ho_khau_ho_khau` FOREIGN KEY (`ho_khau_id`) REFERENCES `ho_khau` (`ho_khau_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `ho_khau_log_ibfk_1` FOREIGN KEY (`ho_khau_id`) REFERENCES `ho_khau` (`ho_khau_id`);

--
-- Contraintes pour la table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD CONSTRAINT `tam_vang_ibfk_1` FOREIGN KEY (`nhan_khau_id`) REFERENCES `nhan_khau` (`nhan_khau_id`),
  ADD CONSTRAINT `tam_vang_ibfk_2` FOREIGN KEY (`so_CMND`) REFERENCES `nhan_khau` (`so_CMND`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
