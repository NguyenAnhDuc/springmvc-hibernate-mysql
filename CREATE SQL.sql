CREATE TABLE Genre
(
  id INT NOT NULL,
  name VARCHAR(250),
  PRIMARY KEY (id) USING BTREE
)



CREATE TABLE Production_Company
(
  id INT NOT NULL,
  name VARCHAR(250),
  PRIMARY KEY (id) USING BTREE
)

CREATE TABLE Production_Country
(
  iso_3166_1 INT NOT NULL,
  name VARCHAR(250),
  PRIMARY KEY (iso_3166_1) USING BTREE
)

CREATE TABLE Spoken_Language
(
  iso_639_1 INT NOT NULL,
  name VARCHAR(250),
  PRIMARY KEY (iso_639_1) USING BTREE
)

CREATE TABLE  `movie_genre` (
  `MOVIE_ID` INT NOT NULL,
  `GENRE_ID` INT NOT NULL,
  PRIMARY KEY (`MOVIE_ID`,`GENRE_ID`),
  CONSTRAINT `FK_MOVIE_ID` FOREIGN KEY (`MOVIE_ID`) REFERENCES `MOVIE` (`ID`),
  CONSTRAINT `FK_GENRE_ID` FOREIGN KEY (`GENRE_ID`) REFERENCES `GENRE` (`ID`)
)

CREATE TABLE MOVIE
(
  id INT NOT NULL AUTO_INCREMENT,
  original_title VARCHAR(250),
  title VARCHAR(100),
  adult BIT,
  budget DOUBLE,
  homepage VARCHAR(100),
  imdb_id VARCHAR(20),
  themoviedb_id INT,
  popularity DOUBLE,
  release_date DATE,
  revenue DOUBLE,
  runtime INT,
  status VARCHAR(20),
  overview VARCHAR(1000),
  tagline VARCHAR(250),
  PRIMARY KEY (id)

)

CREATE TABLE Movie_Genre
(
	movie_id INT NOT NULL,
	genre_id INT NOT NULL,
	
)

CREATE TABLE  `movie_productioncompany` (
  `MOVIE_ID` INT NOT NULL,
  `productioncompany_ID` INT NOT NULL,
  PRIMARY KEY (`MOVIE_ID`,`productioncompany_ID`),
  FOREIGN KEY (`MOVIE_ID`) REFERENCES `MOVIE` (`ID`),
  FOREIGN KEY (`productioncompany_ID`) REFERENCES `production_company` (`ID`)
)
