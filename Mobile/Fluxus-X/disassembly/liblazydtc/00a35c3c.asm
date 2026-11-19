; ossl_ecdsa_verify_sig @ 00a35c3c
00a35c3c	ldr x8,[x3, #0x18]
00a35c40	ldr x8,[x8]
00a35c44	ldr x4,[x8, #0x188]
00a35c48	cbz x4,0x00a35c50
00a35c4c	br x4
00a35c50	stp x29,x30,[sp, #-0x10]!
00a35c54	mov x29,sp
00a35c58	bl 0x00c342a0
00a35c5c	adrp x0,0x2c9000
00a35c60	adrp x2,0x2af000
00a35c64	add x0,x0,#0x7a8
00a35c68	add x2,x2,#0xe61
00a35c6c	orr w1,wzr,#0x3c
00a35c70	bl 0x00c342b0
00a35c74	mov w0,#0x10
00a35c78	mov w1,#0xaa
00a35c7c	mov x2,xzr
00a35c80	bl 0x00c342c0
00a35c84	mov w0,wzr
00a35c88	ldp x29,x30,[sp], #0x10
00a35c8c	ret
