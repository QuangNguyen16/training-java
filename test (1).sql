-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 15, 2021 lúc 04:30 PM
-- Phiên bản máy phục vụ: 10.4.16-MariaDB
-- Phiên bản PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `test`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dangky`
--

CREATE TABLE `dangky` (
  `User` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Pass` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diem`
--

CREATE TABLE `diem` (
  `STT` int(11) NOT NULL,
  `MaSV` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `MaHP` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `TenHP` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiemThi` float DEFAULT NULL,
  `DiemTB` float DEFAULT NULL,
  `KetQua` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `diem`
--

INSERT INTO `diem` (`STT`, `MaSV`, `MaHP`, `TenHP`, `DiemThi`, `DiemTB`, `KetQua`) VALUES
(1, 'SV011', 'AAA00', 'Lập Trình Javaa', 6, 6.6, 'DD'),
(2, 'SV02', 'AAA002', 'Lập Trình Ung Dụng', 7, 7, 'D'),
(3, 'SV0', 'AAA004', 'Pháp Luật', 8, 7.8, 'F'),
(4, 'SV0', 'AAA005', 'Thể Dục', 3, 3.8, 'R'),
(5, 'SV04', 'AAA003', 'Anh V?n 1', 7, 6.3, 'D');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocphan`
--

CREATE TABLE `hocphan` (
  `MaHP` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `TenHP` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `SoTiet` int(11) NOT NULL,
  `SoTinChi` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hocphan`
--

INSERT INTO `hocphan` (`MaHP`, `TenHP`, `SoTiet`, `SoTinChi`) VALUES
('AAA001', 'Lập Trình Java', 45, 3),
('AAA005', 'Giáo Dục Thể Chất', 30, 1),
('AAA006', 'Tin Học', 45, 2),
('BBB01', 'Java', 45, 3),
('BBB02', 'Ứng Dụng', 75, 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `MaKhoa` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `TenKhoa` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`) VALUES
('CNTT', 'Công Nghệ Thông Tin'),
('DL', 'Du Lịchh'),
('QTKD', 'Quản Trị Kinh Doanh'),
('CNTD', 'Công Nghệ Tự Động '),
('KT', 'Kế Toán'),
('OT', 'Ô Tô'),
('TA', 'Tiếng Anh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lopcodinh`
--

CREATE TABLE `lopcodinh` (
  `MaLopCD` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `NamHoc` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MaKhoa` char(6) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lopcodinh`
--

INSERT INTO `lopcodinh` (`MaLopCD`, `NamHoc`, `MaKhoa`) VALUES
('K18TT1', '20188', 'CNTT'),
('K18TT2', '2018', 'CNTT'),
('K18DL1', '2018', 'DL'),
('K17DL1', '2017', 'DL'),
('K19KD1', '2019', 'QTKD'),
('K19KD2', '2019', 'QTKD'),
('K19DL1', '2019', 'QTKD'),
('K19DL2', '2019', 'DL');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `MaSV` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `HoTenSV` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GioiTinh` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgaySinh` datetime DEFAULT NULL,
  `NoiSinh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaLopCD` char(6) COLLATE utf8_unicode_ci NOT NULL,
  `MaKhoa` char(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HocBong` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `HoTenSV`, `GioiTinh`, `NgaySinh`, `NoiSinh`, `DiaChi`, `MaLopCD`, `MaKhoa`, `HocBong`) VALUES
('001', 'quang', 'Nam', '2021-01-14 00:00:00', 'Ninh Thuan', 'Ninh Thuan', 'K18TT1', 'CNTT', 'K'),
('SV03', 'Trương Đình Thọ', 'Nam', '1899-10-22 00:00:00', 'Bình Thuận', 'Bình Thuận', 'K17DL1', 'QTKD', 'C'),
('SV05', 'Nguyễn Văn Em', 'Nữ', '1995-12-12 00:00:00', 'Tây Nguyên', 'Ninh Thuận', 'K19KD1', 'CNTT', 'K'),
('SV06', 'Nguyễn Văn Phat', 'Nam', '2001-10-12 00:00:00', 'Vũng Tàu', 'TPHCM', 'K19KD2', 'DL', 'K'),
('SV07', 'Nguyễn Văn Phat', 'Nam', '1995-12-12 00:00:00', 'Tây Nguyên', 'Ninh Thuan', 'K18DL1', 'CNTT', 'K'),
('SV08', 'Nguyễn Văn Quang', 'Nam', '1998-05-28 00:00:00', 'Ninh Thuan', 'Ninh Thuan', 'K19DL1', 'CNTD', 'K'),
('SV09', 'Đặng Nguyễn Duy Huy', 'nam', '2019-12-10 00:00:00', 'Bình Thuận', 'Bình Thuận', 'K18TT3', 'CNTT', 'C'),
('123', 'quang', 'Nam', '2021-01-10 00:00:00', 'dưa', 'thu duc', 'K18TT1', 'CNTT', 'K');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `User` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Pass` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`User`, `Pass`) VALUES
('admin', 'admin');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `diem`
--
ALTER TABLE `diem`
  ADD PRIMARY KEY (`STT`);

--
-- Chỉ mục cho bảng `hocphan`
--
ALTER TABLE `hocphan`
  ADD PRIMARY KEY (`MaHP`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`MaKhoa`);

--
-- Chỉ mục cho bảng `lopcodinh`
--
ALTER TABLE `lopcodinh`
  ADD PRIMARY KEY (`MaLopCD`);

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`MaSV`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`User`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `diem`
--
ALTER TABLE `diem`
  MODIFY `STT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
