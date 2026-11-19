; OSSL_ENCODER_is_a @ 00a60f10
00a60f10	stp x20,x19,[sp, #-0x20]!
00a60f14	stp x29,x30,[sp, #0x10]
00a60f18	mov x19,x0
00a60f1c	ldr x0,[x0]
00a60f20	add x29,sp,#0x10
00a60f24	cbz x0,0x00a60f48
00a60f28	mov x20,x1
00a60f2c	bl 0x00c3b2f0
00a60f30	bl 0x00c3b650
00a60f34	mov x1,x20
00a60f38	bl 0x00c3b620
00a60f3c	ldr w8,[x19, #0x8]
00a60f40	cmp w0,w8
00a60f44	cset w0,eq
00a60f48	ldp x29,x30,[sp, #0x10]
00a60f4c	ldp x20,x19,[sp], #0x20
00a60f50	ret
