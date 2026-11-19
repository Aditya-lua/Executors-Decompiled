; ossl_x509_add_cert_new @ 00b092dc
00b092dc	str x21,[sp, #-0x30]!
00b092e0	stp x20,x19,[sp, #0x10]
00b092e4	stp x29,x30,[sp, #0x20]
00b092e8	mov x21,x0
00b092ec	ldr x0,[x0]
00b092f0	mov w19,w2
00b092f4	mov x20,x1
00b092f8	add x29,sp,#0x20
00b092fc	cbnz x0,0x00b0930c
00b09300	bl 0x00c34780
00b09304	str x0,[x21]
00b09308	cbz x0,0x00b09324
00b0930c	mov x1,x20
00b09310	mov w2,w19
00b09314	ldp x29,x30,[sp, #0x20]
00b09318	ldp x20,x19,[sp, #0x10]
00b0931c	ldr x21,[sp], #0x30
00b09320	b 0x00b09368
00b09324	bl 0x00c342a0
00b09328	adrp x0,0x2d4000
00b0932c	adrp x2,0x2ba000
00b09330	add x0,x0,#0x58a
00b09334	add x2,x2,#0x8d1
00b09338	mov w1,#0xbb
00b0933c	bl 0x00c342b0
00b09340	mov w1,#0x100
00b09344	mov w0,#0xb
00b09348	movk w1,#0xc, LSL #16
00b0934c	mov x2,xzr
00b09350	bl 0x00c342c0
00b09354	ldp x29,x30,[sp, #0x20]
00b09358	ldp x20,x19,[sp, #0x10]
00b0935c	mov w0,wzr
00b09360	ldr x21,[sp], #0x30
00b09364	ret
