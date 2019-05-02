CREATE TABLE IF NOT EXISTS bike (
    id UUID PRIMARY KEY,
    brand TEXT,
    type TEXT,
    image Text,
    price INTEGER,
    name TEXT,
    email TEXT,
    phone TEXT,
    description TEXT,
    date VARCHAR,
    year Text,
    city TEXT,
    state TEXT,
    color TEXT,
    mileage INTEGER,
    condition TEXT
);

ALTER TABLE bike
ADD COLUMN IF NOT EXISTS engine TEXT NOT NULL
DEFAULT 'not specified';

ALTER TABLE bike
ADD COLUMN IF NOT EXISTS model TEXT;




CREATE TABLE IF NOT EXISTS review (
    id UUID PRIMARY KEY,
    name TEXT,
    rating FLOAT,
    date VARCHAR,
    review TEXT
);