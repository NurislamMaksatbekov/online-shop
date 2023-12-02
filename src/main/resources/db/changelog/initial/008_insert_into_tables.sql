insert into users(email, name, password, enabled)
values ('admin@gmail.com', 'Admin', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true ),
       ('client@gmail.com', 'Client', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true),
       ('seller@gmail.com', 'Seller', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true);

insert into roles(role)
values ('ADMIN' ),
       ('SELLER'),
       ('BUYER' );

insert into USERS_ROLES(user_id, role_id)
values( (select EMAIL from USERS where EMAIL = 'admin@gmail.com'), (select id from ROLES where ROLE = 'ADMIN')),
      ( (select EMAIL from USERS where EMAIL = 'client@gmail.com'), (select id from ROLES where ROLE = 'BUYER')),
      ( (select EMAIL from USERS where EMAIL = 'seller@gmail.com'), (select id from ROLES where ROLE = 'SELLER'));

insert into CATEGORIES(CATEGORY)
values ('Mobile phones' ),
       ('Laptops' ),
       ('Smart watches'),
       ('Tablets'),
       ('Headphones');

insert into CARTS(USER_ID)
values ( (select EMAIL from USERS where email = 'client@gmail.com'));

insert into PRODUCTS(title, quantity, description, price, cart_id, category_id, seller_id)
values ( 'iphone 15 pro max', 20, 'iphone 15 pro max 1tb, white', 2000, null, (select id from CATEGORIES where CATEGORY = 'Mobile phones'), (select EMAIL from USERS where EMAIL = 'seller@gmail.com')),
       ( 'Apple watch 7', 30, 'Apple watch 7, black', 800, null, (select id from CATEGORIES where CATEGORY = 'Smart watches'), (select EMAIL from USERS where EMAIL = 'seller@gmail.com')),
       ( 'Air pods Pro', 25, 'Air Pods Pro, white', 400, null, (select id from CATEGORIES where CATEGORY = 'Headphones'), (select EMAIL from USERS where EMAIL = 'seller@gmail.com'));


