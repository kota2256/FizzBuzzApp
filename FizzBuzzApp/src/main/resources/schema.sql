CREATE TABLE IF NOT EXISTS input_num(
id 					INT AUTO_INCREMENT PRIMARY KEY,
created_at 		TIMESTAMP(0) DEFAULT CURRENT_TIMESTAMP,	--年月日時分秒（小数部なし）、値を指定しなければ現在時刻が自動挿入
input_num		 INT NOT NULL
);