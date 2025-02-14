CREATE TABLE  users(
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL ,
    email VARCHAR(50) UNIQUE  NOT NULL ,
    role VARCHAR(50) NOT NULL ,
    department VARCHAR(100),
);

CREATE  TABLE  leave_types(
      id SERIAL PRIMARY KEY ,
      name VARCHAR(100) NOT NULL ,
      description TEXT,
      max_days INT NOT NULL
);

CREATE TABLE leave_requests (
     id SERIAL PRIMARY KEY,
     user_id BIGINT REFERENCES users(id),
     leave_type_id INT REFERENCES leave_types(id),
     start_date DATE NOT NULL,
     end_date DATE NOT NULL,
     status VARCHAR(50) DEFAULT 'PENDING',
     reason TEXT
);


CREATE TABLE leave_balances (
    id SERIAL PRIMARY KEY ,
    user_id INT,
    leave_type_id INT,
    year INT NOT NULL ,
    remaining_days INT NOT NULL
);