; OPENSSL_sk_new @ 00ae8b30
00ae8b30	str x19,[sp, #-0x20]!
00ae8b34	adrp x1,0x2c6000
00ae8b38	mov x19,x0
00ae8b3c	add x1,x1,#0x275
00ae8b40	mov w0,#0x20
00ae8b44	mov w2,#0xe4
00ae8b48	stp x29,x30,[sp, #0x10]
00ae8b4c	add x29,sp,#0x10
00ae8b50	bl 0x00c34250
00ae8b54	cbz x0,0x00ae8b60
00ae8b58	str x19,[x0, #0x18]
00ae8b5c	b 0x00ae8b94
00ae8b60	bl 0x00c342a0
00ae8b64	adrp x0,0x2c6000
00ae8b68	adrp x2,0x2b8000
00ae8b6c	add x0,x0,#0x275
00ae8b70	add x2,x2,#0x62a
00ae8b74	mov w1,#0xe7
00ae8b78	bl 0x00c342b0
00ae8b7c	mov w1,#0x100
00ae8b80	orr w0,wzr,#0xf
00ae8b84	movk w1,#0xc, LSL #16
00ae8b88	mov x2,xzr
00ae8b8c	bl 0x00c342c0
00ae8b90	mov x0,xzr
00ae8b94	ldp x29,x30,[sp, #0x10]
00ae8b98	ldr x19,[sp], #0x20
00ae8b9c	ret
