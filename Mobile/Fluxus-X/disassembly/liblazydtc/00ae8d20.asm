; OPENSSL_sk_reserve @ 00ae8d20
00ae8d20	cbz x0,0x00ae8d30
00ae8d24	tbnz w1,#0x1f,0x00ae8d74
00ae8d28	mov w2,#0x1
00ae8d2c	b 0x00ae8ba0
00ae8d30	stp x29,x30,[sp, #-0x10]!
00ae8d34	mov x29,sp
00ae8d38	bl 0x00c342a0
00ae8d3c	adrp x0,0x2c6000
00ae8d40	adrp x2,0x2a2000
00ae8d44	add x0,x0,#0x275
00ae8d48	add x2,x2,#0xca2
00ae8d4c	mov w1,#0xfb
00ae8d50	bl 0x00c342b0
00ae8d54	mov w1,#0x102
00ae8d58	orr w0,wzr,#0xf
00ae8d5c	movk w1,#0xc, LSL #16
00ae8d60	mov x2,xzr
00ae8d64	bl 0x00c342c0
00ae8d68	mov w0,wzr
00ae8d6c	ldp x29,x30,[sp], #0x10
00ae8d70	ret
00ae8d74	mov w0,#0x1
00ae8d78	ret
