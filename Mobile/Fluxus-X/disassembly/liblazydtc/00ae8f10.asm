; OPENSSL_sk_delete @ 00ae8f10
00ae8f10	stp x20,x19,[sp, #-0x20]!
00ae8f14	mov x20,xzr
00ae8f18	stp x29,x30,[sp, #0x10]
00ae8f1c	add x29,sp,#0x10
00ae8f20	cbz x0,0x00ae8f7c
00ae8f24	tbnz w1,#0x1f,0x00ae8f7c
00ae8f28	ldr w8,[x0]
00ae8f2c	mov x19,x0
00ae8f30	mov x20,xzr
00ae8f34	cmp w8,w1
00ae8f38	b.le 0x00ae8f7c
00ae8f3c	ldr x9,[x19, #0x8]
00ae8f40	sub w10,w8,#0x1
00ae8f44	cmp w10,w1
00ae8f48	add x0,x9,w1, SXTW  #0x3
00ae8f4c	ldr x20,[x0]
00ae8f50	b.eq 0x00ae8f78
00ae8f54	sxtw x10,w1
00ae8f58	mvn w11,w1
00ae8f5c	add x9,x9,x10, LSL #0x3
00ae8f60	add w8,w8,w11
00ae8f64	add x1,x9,#0x8
00ae8f68	sbfiz x2,x8,#0x3,#0x20
00ae8f6c	bl 0x00c2ff60
00ae8f70	ldr w8,[x19]
00ae8f74	sub w1,w8,#0x1
00ae8f78	str w1,[x19]
00ae8f7c	ldp x29,x30,[sp, #0x10]
00ae8f80	mov x0,x20
00ae8f84	ldp x20,x19,[sp], #0x20
00ae8f88	ret
