-- Insertar datos de prueba en la tabla veterinario
INSERT INTO Veterinarian (firstname, lastname, email, password, phone, license_number, speciality)
VALUES
       ('John', 'Doe', 'john.doe@example.com', 'john123', '991456852', '45678', 'Dogs'),
       ('Jane', 'Smith', 'jane.smith@example.com', 'jane456', '992456159', '78945', 'Cats'),
       ('Alex', 'Lebron', 'alex.lebron@example.com', 'alex789', '949749651', '12348', 'Parrots')
    ON CONFLICT (email) DO NOTHING;

-- Insertar datos de prueba en la tabla dueño
INSERT INTO Owner (firstname, lastname, email, password, phone, direction)
VALUES
    ('Alice', 'Johnson', 'alice.johnson@example.com', 'alice123', '991234567', '123 Main St, Trujillo'),
    ('Bob', 'Smith', 'bob.smith@example.com', 'bob456', '992345678', '456 Elm St, Trujillo'),
    ('Charlie', 'Brown', 'charlie.brown@example.com', 'charlie789', '993456789', '789 Oak St, Trujillo')
    ON CONFLICT (email) DO NOTHING;

-- Insertar datos de prueba en la tabla de disponibilidad
