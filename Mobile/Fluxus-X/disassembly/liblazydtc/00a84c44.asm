; OPENSSL_atexit @ 00a84c44
00a84c44	str x19,[sp, #-0x20]!
00a84c48	adrp x1,0x2dc000
00a84c4c	mov x19,x0
00a84c50	add x1,x1,#0x103
00a84c54	mov w0,#0x10
00a84c58	mov w2,#0x2c7
00a84c5c	stp x29,x30,[sp, #0x10]
00a84c60	add x29,sp,#0x10
00a84c64	bl 0x00c32320
00a84c68	cbz x0,0x00a84c88
00a84c6c	str x19,[x0]
00a84c70	adrp x8,0xd22000
00a84c74	ldr x9,[x8]
00a84c78	str x9,[x0, #0x8]
00a84c7c	str x0,[x8]
00a84c80	mov w0,#0x1
00a84c84	b 0x00a84cbc
00a84c88	bl 0x00c342a0
00a84c8c	adrp x0,0x2dc000
00a84c90	adrp x2,0x2b0000
00a84c94	add x0,x0,#0x103
00a84c98	add x2,x2,#0x117
00a84c9c	mov w1,#0x2c8
00a84ca0	bl 0x00c342b0
00a84ca4	mov w1,#0x100
00a84ca8	orr w0,wzr,#0xf
00a84cac	movk w1,#0xc, LSL #16
00a84cb0	mov x2,xzr
00a84cb4	bl 0x00c342c0
00a84cb8	mov w0,wzr
00a84cbc	ldp x29,x30,[sp, #0x10]
00a84cc0	ldr x19,[sp], #0x20
00a84cc4	ret
