INSERT INTO category (id, status, name) VALUES (1,1, 'Ev Dekorasyonu');
INSERT INTO category (id, status, name) VALUES (2,1, 'Beyaz Eşya');

INSERT INTO campaign (id, status, name ) VALUES (1,1, 'İkinci üründe %50 indirim!');

INSERT INTO product (id, status, name, amount, category_id, campaign_id) VALUES (1,1, 'Saksı', '10', 1,1);
INSERT INTO product (id, status, name, amount, category_id, campaign_id) VALUES (2,1, 'Tablo', '10', 1,null);
INSERT INTO product (id, status, name, amount, category_id, campaign_id) VALUES (3,1, 'Çamaşır Makinesi', '10', 2,null);
INSERT INTO product (id, status, name, amount, category_id, campaign_id) VALUES (4,1, 'Saç Kurutma Makinesi', '10', 2,1);

INSERT INTO member (id, status, username ) VALUES (1, 1, 'earmagan');

INSERT INTO basket (id, status, member_id ) VALUES (1, 1, 1);

INSERT INTO product_basket (basket_id, product_id ) VALUES (1, 1);
INSERT INTO product_basket (basket_id, product_id ) VALUES (1, 4);
