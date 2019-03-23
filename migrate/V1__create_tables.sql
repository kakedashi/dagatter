CREATE TABLE IF NOT EXISTS users
  (id TEXT NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    image_url TEXT);

CREATE TABLE IF NOT EXISTS tweets(
    id SERIAL PRIMARY KEY,
    tweet TEXT NOT NULL,
    like_count INTEGER NOT NULL,
    retweet_count INTEGER NOT NULL,
    user_id TEXT REFERENCES users(id));

CREATE TABLE IF NOT EXISTS dagashis(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    price INTEGER NOT NULL);

CREATE TABLE IF NOT EXISTS dagashi_association(
    user_id TEXT REFERENCES users(id),
    tweet_id INTEGER REFERENCES tweets(id),
    dagashi_id INTEGER REFERENCES dagashis(id));

-- for ROLLBACK
-- DROP SEQUENCE IF EXISTS users_id_seq;
-- DROP TABLE IF EXISTS users;
-- DROP SEQUENCE IF EXISTS tweets_id_seq;
-- DROP TABLE IF EXISTS tweets;
-- DROP SEQUENCE IF EXISTS dagashis_id_seq;
-- DROP TABLE IF EXISTS dagashis;
-- DROP TABLE IF EXISTS dagashi_association;
