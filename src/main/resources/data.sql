insert into account(id, account_name, password, enabled1, enabled2, enabled3, enabled4)
    values(1, 'springboot', 'password', true, true, true, true);

insert into account(id, account_name, password, enabled1, enabled2, enabled3, enabled4)
    values(2, 'user1', 'test1234', true, true, true, true);

insert into user values(10001, sysdate(), 'AB');
insert into user values(10002, sysdate(), 'Jill');
insert into user values(10003, sysdate(), 'Jam');

insert into post values(11001, 'My First Post', 10001);
insert into post values(11002, 'My Second Post', 10001);
