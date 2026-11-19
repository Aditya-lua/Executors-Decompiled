; OSSL_ENCODER_to_fp @ 00a61f38
00a61f38	str x21,[sp, #-0x30]!
00a61f3c	stp x20,x19,[sp, #0x10]
00a61f40	stp x29,x30,[sp, #0x20]
00a61f44	add x29,sp,#0x20
00a61f48	mov x21,x1
00a61f4c	mov x20,x0
00a61f50	bl 0x00c32270
00a61f54	bl 0x00c32240
00a61f58	mov x19,x0
00a61f5c	cbz x0,0x00a61f88
00a61f60	mov w1,#0x6a
00a61f64	mov x0,x19
00a61f68	mov x2,xzr
00a61f6c	mov x3,x21
00a61f70	bl 0x00c321a0
00a61f74	mov x0,x20
00a61f78	mov x1,x19
00a61f7c	bl 0x00a61a4c
00a61f80	mov w20,w0
00a61f84	b 0x00a61fbc
00a61f88	bl 0x00c342a0
00a61f8c	adrp x0,0x2a0000
00a61f90	adrp x2,0x2c7000
00a61f94	add x0,x0,#0x26d
00a61f98	add x2,x2,#0x8d6
00a61f9c	mov w1,#0x4c
00a61fa0	bl 0x00c342b0
00a61fa4	mov w1,#0x7
00a61fa8	mov w0,#0x3b
00a61fac	movk w1,#0x8, LSL #16
00a61fb0	mov x2,xzr
00a61fb4	bl 0x00c342c0
00a61fb8	mov w20,wzr
00a61fbc	mov x0,x19
00a61fc0	bl 0x00c31a40
00a61fc4	mov w0,w20
00a61fc8	ldp x29,x30,[sp, #0x20]
00a61fcc	ldp x20,x19,[sp, #0x10]
00a61fd0	ldr x21,[sp], #0x30
00a61fd4	ret
