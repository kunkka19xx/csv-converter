CREATE TABLE CITY_TARGET(
	ID SERIAL NOT NULL, 
	LON_S VARCHAR(200),
	EW VARCHAR(200),
	CITY VARCHAR(200),
	STATE VARCHAR(200),
	PRIMARY KEY(ID)
);

CREATE TABLE IF NOT EXISTS public.city
(
    id integer NOT NULL,
    lad_d character varying(100) COLLATE pg_catalog."default",
    lat_m character varying(100) COLLATE pg_catalog."default",
    n_s character varying COLLATE pg_catalog."default",
    lon_d character varying COLLATE pg_catalog."default",
    lon_m character varying COLLATE pg_catalog."default",
    lon_s character varying COLLATE pg_catalog."default",
    e_w character varying COLLATE pg_catalog."default",
    city character varying COLLATE pg_catalog."default",
    state character varying COLLATE pg_catalog."default",
    CONSTRAINT city_pkey PRIMARY KEY (id)
);

-- schema : csv-converter
