CREATE TABLE flight_info (
    flight_info_id BIGINT PRIMARY KEY,
    flight_id VARCHAR(10) NOT NULL UNIQUE,
    airline VARCHAR(50),
    status VARCHAR(20),
    departure_gate VARCHAR(10),
    arrival_gate VARCHAR(10),
    scheduled_departure TIMESTAMP,
    scheduled_arrival TIMESTAMP,
    actual_departure TIMESTAMP,
    actual_arrival TIMESTAMP
);

create sequence if not exists flight_info_seq increment by 50;