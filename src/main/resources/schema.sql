CREATE TABLE IF NOT EXISTS bike (
    id UUID PRIMARY KEY,
    brand TEXT,
    type TEXT,
    image Text,
    price INTEGER,
    name TEXT,
    description TEXT,
    date TEXT,
    year Text,
    city TEXT,
    state TEXT,
    color TEXT,
    mileage INTEGER,
    condition TEXT
);


CREATE TABLE IF NOT EXISTS review (
    id UUID PRIMARY KEY,
    name TEXT,
    rating FLOAT,
    date TEXT,
    review TEXT
);