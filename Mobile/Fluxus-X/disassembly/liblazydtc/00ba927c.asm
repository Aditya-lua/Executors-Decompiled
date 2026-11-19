; mbedtls_oid_get_x509_ext_type @ 00ba927c
00ba927c	str x21,[sp, #-0x30]!
00ba9280	stp x20,x19,[sp, #0x10]
00ba9284	stp x29,x30,[sp, #0x20]
00ba9288	add x29,sp,#0x20
00ba928c	mov x19,x1
00ba9290	cbz x0,0x00ba937c
00ba9294	ldr x8,[x0, #0x8]
00ba9298	cmp x8,#0x9
00ba929c	b.eq 0x00ba9364
00ba92a0	cmp x8,#0x3
00ba92a4	b.ne 0x00ba937c
00ba92a8	ldr x20,[x0, #0x10]
00ba92ac	adrp x0,0x2c0000
00ba92b0	add x0,x0,#0xbd0
00ba92b4	orr w2,wzr,#0x3
00ba92b8	mov x1,x20
00ba92bc	bl 0x00c300b0
00ba92c0	adrp x21,0xcab000
00ba92c4	add x21,x21,#0xeb0
00ba92c8	cbz w0,0x00ba93b8
00ba92cc	adrp x0,0x2c0000
00ba92d0	add x0,x0,#0xbd4
00ba92d4	orr w2,wzr,#0x3
00ba92d8	mov x1,x20
00ba92dc	bl 0x00c300b0
00ba92e0	cbz w0,0x00ba9394
00ba92e4	adrp x0,0x2d0000
00ba92e8	add x0,x0,#0x9c3
00ba92ec	orr w2,wzr,#0x3
00ba92f0	mov x1,x20
00ba92f4	bl 0x00c300b0
00ba92f8	cbz w0,0x00ba939c
00ba92fc	adrp x0,0x2c8000
00ba9300	add x0,x0,#0x8d6
00ba9304	orr w2,wzr,#0x3
00ba9308	mov x1,x20
00ba930c	bl 0x00c300b0
00ba9310	cbz w0,0x00ba93a4
00ba9314	adrp x0,0x2b4000
00ba9318	add x0,x0,#0xffa
00ba931c	orr w2,wzr,#0x3
00ba9320	mov x1,x20
00ba9324	bl 0x00c300b0
00ba9328	cbz w0,0x00ba93ac
00ba932c	adrp x0,0x2c2000
00ba9330	add x0,x0,#0xc17
00ba9334	orr w2,wzr,#0x3
00ba9338	mov x1,x20
00ba933c	bl 0x00c300b0
00ba9340	cbz w0,0x00ba93b4
00ba9344	adrp x0,0x2c2000
00ba9348	add x0,x0,#0xc1b
00ba934c	orr w2,wzr,#0x3
00ba9350	mov x1,x20
00ba9354	bl 0x00c300b0
00ba9358	cbnz w0,0x00ba937c
00ba935c	add x21,x21,#0x118
00ba9360	b 0x00ba93b8
00ba9364	ldr x1,[x0, #0x10]
00ba9368	adrp x0,0x2c2000
00ba936c	add x0,x0,#0xc0d
00ba9370	mov w2,#0x9
00ba9374	bl 0x00c300b0
00ba9378	cbz w0,0x00ba9384
00ba937c	mov w0,#0xffffffd2
00ba9380	b 0x00ba93c4
00ba9384	adrp x8,0xcab000
00ba9388	add x8,x8,#0xeb0
00ba938c	add x21,x8,#0xa0
00ba9390	b 0x00ba93b8
00ba9394	add x21,x21,#0x28
00ba9398	b 0x00ba93b8
00ba939c	add x21,x21,#0x50
00ba93a0	b 0x00ba93b8
00ba93a4	add x21,x21,#0x78
00ba93a8	b 0x00ba93b8
00ba93ac	add x21,x21,#0xc8
00ba93b0	b 0x00ba93b8
00ba93b4	add x21,x21,#0xf0
00ba93b8	ldr w8,[x21, #0x20]
00ba93bc	mov w0,wzr
00ba93c0	str w8,[x19]
00ba93c4	ldp x29,x30,[sp, #0x20]
00ba93c8	ldp x20,x19,[sp, #0x10]
00ba93cc	ldr x21,[sp], #0x30
00ba93d0	ret
