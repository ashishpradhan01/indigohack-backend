INSERT INTO flight_info (flight_info_id, flight_id, airline, status, departure_gate, arrival_gate, scheduled_departure, scheduled_arrival, actual_departure, actual_arrival) VALUES
(nextval('flight_info_seq'), '6E 2341', 'Indigo', 'ON_TIME', 'A12', 'B7', '2024-07-26T14:00:00Z', '2024-07-26T18:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), '6E 2342', 'Indigo', 'DELAYED', 'C3', 'D4', '2024-07-26T16:00:00Z', '2024-07-26T20:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), '6E 2343', 'Indigo', 'CANCELLED', 'E2', 'F1', '2024-07-26T12:00:00Z', '2024-07-26T16:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'LH 6789', 'Lufthansa', 'ON_TIME', 'L12', 'M7', '2024-07-28T07:00:00Z', '2024-07-28T11:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'AF 3456', 'Air France', 'DELAYED', 'N3', 'O4', '2024-07-28T09:00:00Z', '2024-07-28T13:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'QF 7890', 'Qantas', 'CANCELLED', 'P2', 'Q1', '2024-07-28T11:00:00Z', '2024-07-28T15:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'EK 1234', 'Emirates', 'ON_TIME', 'R9', 'S3', '2024-07-28T15:30:00Z', '2024-07-28T19:30:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'SQ 5678', 'Singapore Airlines', 'DELAYED', 'T4', 'U6', '2024-07-28T17:45:00Z', '2024-07-28T21:45:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'JL 9012', 'Japan Airlines', 'ON_TIME', 'V10', 'W5', '2024-07-28T13:00:00Z', '2024-07-28T17:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'CA 3457', 'Air China', 'DELAYED', 'X3', 'Y4', '2024-07-28T12:00:00Z', '2024-07-28T16:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'AI 7891', 'Air India', 'CANCELLED', 'Z2', 'A1', '2024-07-28T10:00:00Z', '2024-07-28T14:00:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'QR 1235', 'Qatar Airways', 'ON_TIME', 'B8', 'C4', '2024-07-28T14:30:00Z', '2024-07-28T18:30:00Z', NULL, NULL),
(nextval('flight_info_seq'), 'BA 4567', 'British Airways', 'DELAYED', 'D9', 'E7', '2024-07-28T18:45:00Z', '2024-07-28T22:45:00Z', NULL, NULL);