; OPENSSL_sk_set @ 00ae92bc
00ae92bc	str x19,[sp, #-0x20]!
00ae92c0	mov w19,w1
00ae92c4	stp x29,x30,[sp, #0x10]
00ae92c8	add x29,sp,#0x10
00ae92cc	cbz x0,0x00ae9338
00ae92d0	tbnz w19,#0x1f,0x00ae92fc
00ae92d4	ldr w8,[x0]
00ae92d8	cmp w8,w19
00ae92dc	b.le 0x00ae92fc
00ae92e0	ldr x8,[x0, #0x8]
00ae92e4	sbfiz x9,x19,#0x3,#0x20
00ae92e8	str x2,[x8, x9#0x0]
00ae92ec	ldr x8,[x0, #0x8]
00ae92f0	str wzr,[x0, #0x10]
00ae92f4	ldr x0,[x8, x9#0x0]
00ae92f8	b 0x00ae936c
00ae92fc	bl 0x00c342a0
00ae9300	adrp x0,0x2c6000
00ae9304	adrp x2,0x2ce000
00ae9308	add x0,x0,#0x275
00ae930c	add x2,x2,#0x37a
00ae9310	mov w1,#0x1c9
00ae9314	bl 0x00c342b0
00ae9318	adrp x2,0x2da000
00ae931c	mov w1,#0x106
00ae9320	add x2,x2,#0x603
00ae9324	orr w0,wzr,#0xf
00ae9328	movk w1,#0x8, LSL #16
00ae932c	mov w3,w19
00ae9330	bl 0x00c342c0
00ae9334	b 0x00ae9368
00ae9338	bl 0x00c342a0
00ae933c	adrp x0,0x2c6000
00ae9340	adrp x2,0x2ce000
00ae9344	add x0,x0,#0x275
00ae9348	add x2,x2,#0x37a
00ae934c	mov w1,#0x1c5
00ae9350	bl 0x00c342b0
00ae9354	mov w1,#0x102
00ae9358	orr w0,wzr,#0xf
00ae935c	movk w1,#0xc, LSL #16
00ae9360	mov x2,xzr
00ae9364	bl 0x00c342c0
00ae9368	mov x0,xzr
00ae936c	ldp x29,x30,[sp, #0x10]
00ae9370	ldr x19,[sp], #0x20
00ae9374	ret
