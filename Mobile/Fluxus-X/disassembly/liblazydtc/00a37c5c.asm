; ossl_ec_GFp_mont_field_decode @ 00a37c5c
00a37c5c	ldr x8,[x0, #0x78]
00a37c60	cbz x8,0x00a37c74
00a37c64	mov x0,x1
00a37c68	mov x1,x2
00a37c6c	mov x2,x8
00a37c70	b 0x00c38fb0
00a37c74	stp x29,x30,[sp, #-0x10]!
00a37c78	mov x29,sp
00a37c7c	bl 0x00c342a0
00a37c80	adrp x0,0x2bf000
00a37c84	adrp x2,0x2d1000
00a37c88	add x0,x0,#0xbb4
00a37c8c	add x2,x2,#0x8cb
00a37c90	mov w1,#0x11a
00a37c94	bl 0x00c342b0
00a37c98	mov w0,#0x10
00a37c9c	mov w1,#0x6f
00a37ca0	mov x2,xzr
00a37ca4	bl 0x00c342c0
00a37ca8	mov w0,wzr
00a37cac	ldp x29,x30,[sp], #0x10
00a37cb0	ret
