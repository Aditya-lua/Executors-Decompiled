; FUN_008b92ec @ 008b92ec
008b92ec	ldr w8,[x0, #0xc]
008b92f0	ldr w9,[x1, #0xc]
008b92f4	and w8,w8,#0xf
008b92f8	cmp w8,w9
008b92fc	b.ne 0x008b93a4
008b9300	cmp w8,#0x1
008b9304	b.le 0x008b9334
008b9308	cmp w8,#0x2
008b930c	b.eq 0x008b934c
008b9310	cmp w8,#0x4
008b9314	b.eq 0x008b9370
008b9318	cmp w8,#0x3
008b931c	b.ne 0x008b93b4
008b9320	ldr d0,[x0]
008b9324	ldr d1,[x1]
008b9328	fcmp d0,d1
008b932c	cset w0,eq
008b9330	ret
008b9334	cbz w8,0x008b93ac
008b9338	cmp w8,#0x1
008b933c	b.ne 0x008b93b4
008b9340	ldr w8,[x0]
008b9344	ldr w9,[x1]
008b9348	b 0x008b9364
008b934c	ldr x8,[x0]
008b9350	ldr x9,[x1]
008b9354	cmp x8,x9
008b9358	b.ne 0x008b93a4
008b935c	ldr w8,[x0, #0x8]
008b9360	ldr w9,[x1, #0x8]
008b9364	cmp w8,w9
008b9368	cset w0,eq
008b936c	ret
008b9370	ldr s0,[x0]
008b9374	ldr s1,[x1]
008b9378	fcmp s0,s1
008b937c	b.ne 0x008b93a4
008b9380	ldr s0,[x0, #0x4]
008b9384	ldr s1,[x1, #0x4]
008b9388	fcmp s0,s1
008b938c	b.ne 0x008b93a4
008b9390	ldr s0,[x0, #0x8]
008b9394	ldr s1,[x1, #0x8]
008b9398	fcmp s0,s1
008b939c	cset w0,eq
008b93a0	ret
008b93a4	mov w0,wzr
008b93a8	ret
008b93ac	mov w0,#0x1
008b93b0	ret
008b93b4	ldr x8,[x0]
008b93b8	ldr x9,[x1]
008b93bc	cmp x8,x9
008b93c0	cset w0,eq
008b93c4	ret
