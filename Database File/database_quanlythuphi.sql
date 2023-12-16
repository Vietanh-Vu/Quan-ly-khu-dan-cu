
-- Database: `quan_ly_khu_dan_cu`

-- cập nhật module thu phí - đóng góp

CREATE TABLE `khoan_thu_phi` (
  `id_khoan_thu_phi` varchar(5) NOT NULL,
  `ten_khoan_thu_phi` varchar(50) NOT NULL, 
  `tien_phi` int(11) DEFAULT 0,
  `ngay_bat_dau` date NOT NULL,
  `ngay_ket_thuc` date NOT NULL,
  `chi_tiet` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `dong_phi` (
  `id_dong_phi` varchar(5) NOT NULL,
  `id_khoan_thu_phi` varchar(5) DEFAULT NULL,
  `so_ho_khau` varchar(20) NOT NULL,
  `so_tien` int(11) DEFAULT 0,
  `da_dong` boolean DEFAULT 0,
  `ngay_dong` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `khoan_dong_gop` (  
  `id_khoan_dong_gop` varchar(5) NOT NULL,
  `ten_khoan_dong_gop` varchar(50) NOT NULL NULL, 
  `ngay_bat_dau` date NOT NULL,
  `ngay_ket_thuc` date NOT NULL,
  `chi_tiet` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `dong_gop` (
  `so_ho_khau` varchar(20) NOT NULL,
  `id_khoan_dong_gop` varchar(5) NOT NULL,
  `so_tien` int(11) DEFAULT 0,
  `ngay_dong` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `khoan_thu_phi`
  ADD PRIMARY KEY (`id_khoan_thu_phi`);

ALTER TABLE `khoan_dong_gop`
  ADD PRIMARY KEY (`id_khoan_dong_gop`);

ALTER TABLE `dong_phi`
  ADD PRIMARY KEY (`id_dong_phi`),
  ADD KEY `so_ho_khau` (`so_ho_khau`),
  ADD KEY `id_khoan_thu_phi` (`id_khoan_thu_phi`);


ALTER TABLE `dong_phi` 
  ADD CONSTRAINT `dong_phi_ibfk_1` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau`(`so_ho_khau`) 
  ON DELETE RESTRICT ON UPDATE RESTRICT; 
  
ALTER TABLE `dong_phi` 
  ADD CONSTRAINT `dong_phi_ibfk_2` FOREIGN KEY (`id_khoan_thu_phi`) REFERENCES `khoan_thu_phi`(`id_khoan_thu_phi`) 
  ON DELETE RESTRICT ON UPDATE RESTRICT;


ALTER TABLE `dong_gop` 
ADD CONSTRAINT `dong_gop_ibfk_1` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau`(`so_ho_khau`) 
ON DELETE RESTRICT ON UPDATE RESTRICT; 

ALTER TABLE `dong_gop` 
ADD CONSTRAINT `dong_gop_ibfk_2` FOREIGN KEY (`id_khoan_dong_gop`) REFERENCES `khoan_dong_gop`(`id_khoan_dong_gop`) 
ON DELETE RESTRICT ON UPDATE RESTRICT;
