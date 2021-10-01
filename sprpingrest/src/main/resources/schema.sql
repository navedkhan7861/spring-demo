DROP TABLE IF EXISTS Courses

CREATE TABLE Courses(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name title(250) NOT NULL,
  last_name description(250) NOT NULL
);

INSERT INTO billionaires (title,description) VALUES
  ('1.book','1.bookDesc'),
  ('2.book','2.bookDesc'),
  ('3.book','3.bookDesc');