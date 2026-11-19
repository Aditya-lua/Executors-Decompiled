; OSSL_DECODER_from_data @ 00a4d264
00a4d264	stp x22,x21,[sp, #-0x30]!
00a4d268	stp x20,x19,[sp, #0x10]
00a4d26c	stp x29,x30,[sp, #0x20]
00a4d270	add x29,sp,#0x20
00a4d274	cbz x1,0x00a4d2cc
00a4d278	mov x19,x2
00a4d27c	cbz x2,0x00a4d2cc
00a4d280	mov x22,x0
00a4d284	ldr x0,[x1]
00a4d288	mov x20,x1
00a4d28c	cbz x0,0x00a4d2cc
00a4d290	ldr w1,[x19]
00a4d294	bl 0x00c31a50
00a4d298	mov x21,x0
00a4d29c	mov x0,x22
00a4d2a0	mov x1,x21
00a4d2a4	bl 0x00a4cba0
00a4d2a8	cbz w0,0x00a4d304
00a4d2ac	orr w1,wzr,#0x3
00a4d2b0	mov x0,x21
00a4d2b4	mov x2,xzr
00a4d2b8	mov x3,x20
00a4d2bc	bl 0x00c321a0
00a4d2c0	str x0,[x19]
00a4d2c4	mov w19,#0x1
00a4d2c8	b 0x00a4d308
00a4d2cc	bl 0x00c342a0
00a4d2d0	adrp x0,0x2bd000
00a4d2d4	adrp x2,0x2c9000
00a4d2d8	add x0,x0,#0x9db
00a4d2dc	add x2,x2,#0x7d8
00a4d2e0	mov w1,#0x97
00a4d2e4	bl 0x00c342b0
00a4d2e8	mov w1,#0x102
00a4d2ec	orr w0,wzr,#0x3c
00a4d2f0	movk w1,#0xc, LSL #16
00a4d2f4	mov x2,xzr
00a4d2f8	bl 0x00c342c0
00a4d2fc	mov w19,wzr
00a4d300	b 0x00a4d310
00a4d304	mov w19,wzr
00a4d308	mov x0,x21
00a4d30c	bl 0x00c31a40
00a4d310	mov w0,w19
00a4d314	ldp x29,x30,[sp, #0x20]
00a4d318	ldp x20,x19,[sp, #0x10]
00a4d31c	ldp x22,x21,[sp], #0x30
00a4d320	ret
