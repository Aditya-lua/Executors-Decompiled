; OSSL_PARAM_locate @ 00a9df2c
00a9df2c	stp x20,x19,[sp, #-0x20]!
00a9df30	mov x19,x0
00a9df34	mov x0,xzr
00a9df38	stp x29,x30,[sp, #0x10]
00a9df3c	add x29,sp,#0x10
00a9df40	cbz x19,0x00a9df74
00a9df44	mov x20,x1
00a9df48	cbz x1,0x00a9df74
00a9df4c	ldr x1,[x19]
00a9df50	cbz x1,0x00a9df68
00a9df54	mov x0,x20
00a9df58	bl 0x00c301f0
00a9df5c	cbz w0,0x00a9df70
00a9df60	ldr x1,[x19, #0x28]!
00a9df64	cbnz x1,0x00a9df54
00a9df68	mov x0,xzr
00a9df6c	b 0x00a9df74
00a9df70	mov x0,x19
00a9df74	ldp x29,x30,[sp, #0x10]
00a9df78	ldp x20,x19,[sp], #0x20
00a9df7c	ret
