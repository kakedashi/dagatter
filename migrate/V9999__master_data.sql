insert into users(id, name, image_url)VALUES
  ('deltama37', 'delta', 'https://pbs.twimg.com/profile_images/1025324048132190208/RgImJmgx_400x400.jpg'),
--  ('osanpozuki', 'tama', 'https://pbs.twimg.com/profile_images/1082717517993336832/ZRguAkK1_400x400.jpg'),
  ('MATSUURA_SHT', 'とっぽい', 'https://pbs.twimg.com/profile_images/1054897108031959040/YzbbvKM5_400x400.jpg'),
  ('m_nishiba', 'nishiba', 'https://pbs.twimg.com/profile_images/919474580531453954/fxzPxEfd_400x400.jpg'),
  ('vaaaaanquish', 'ばんくし', 'https://pbs.twimg.com/profile_images/1073871248826916864/BZErHq66_400x400.jpg');

insert into tweets(tweet, like_count, retweet_count, image_url1, image_url2, image_url3, image_url4, user_id) VALUES
  ('クソワロタ', 0, 0, '', '', '', '', 'vaaaaanquish'),
  ('「それ大体の技術でそうじゃん」様々な会話を終了に導ける力がある', 12, 2, '', '', '', '', 'vaaaaanquish'),
  ('誰か滝行行こうや精神叩き直さな', 3, 0, '', '', '', '', 'MATSUURA_SHT'),
  ('バチャコン一応参加したからあとでブログ書くか(なんで山梨大と横国なのにry)', 1, 0, '', '', '', '', 'm_nishiba'),
  ('今日はお姉様方とお会いしてバレンタインのお返しをします', 2, 0, '', '', '', '', 'MATSUURA_SHT'),
  ('興味深いツイート多いのでいいね連打した', 4, 1, '', '', '', '', 'deltama37'),
  ('大学からの理工系人材の供給が追いついていないという話あるけど，日経古典企業だと大学院でCUDAプログラミングめちゃくちゃやってた人をなぜかコンサルに配置する事例があったりして，人材供給増やさくてもいいのではという気持ちになる', 2, 0, '', '', '', '', 'm_nishiba')  ;

insert into dagashis(name, price, image_url)VALUES
  ('うまい棒', 10, ''),
  ('ポテチ', 0, ''),
  ('ブタメン', 0, ''),
  ('シガレット', 0, ''),
  ('ボンタン', 0, ''),
  ('きなこ棒', 0, ''),
  ('モロッコ', 0, ''),
  ('チロル', 0, '');
