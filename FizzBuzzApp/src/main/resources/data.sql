INSERT INTO input_num (id, created_at, input_num)
VALUES
(1, '2026-03-12 22:49:01', 5),
(2, '2026-03-12 22:49:01', 29),
(3, '2026-03-12 22:49:01', 81);

--テーブル定義の変更、idカラムの変更、自動採番4から
ALTER TABLE input_num ALTER COLUMN id RESTART WITH 4;