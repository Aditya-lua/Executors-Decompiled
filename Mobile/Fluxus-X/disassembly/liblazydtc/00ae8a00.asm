; OPENSSL_sk_new_null @ 00ae8a00
00ae8a00	stp x29,x30,[sp, #-0x10]!
00ae8a04	adrp x1,0x2c6000
00ae8a08	add x1,x1,#0x275
00ae8a0c	mov w0,#0x20
00ae8a10	mov w2,#0xe4
00ae8a14	mov x29,sp
00ae8a18	bl 0x00c34250
00ae8a1c	cbz x0,0x00ae8a2c
00ae8a20	str xzr,[x0, #0x18]
00ae8a24	ldp x29,x30,[sp], #0x10
00ae8a28	ret
00ae8a2c	bl 0x00c342a0
00ae8a30	adrp x0,0x2c6000
00ae8a34	adrp x2,0x2b8000
00ae8a38	add x0,x0,#0x275
00ae8a3c	add x2,x2,#0x62a
00ae8a40	mov w1,#0xe7
00ae8a44	bl 0x00c342b0
00ae8a48	mov w1,#0x100
00ae8a4c	orr w0,wzr,#0xf
00ae8a50	movk w1,#0xc, LSL #16
00ae8a54	mov x2,xzr
00ae8a58	bl 0x00c342c0
00ae8a5c	mov x0,xzr
00ae8a60	ldp x29,x30,[sp], #0x10
00ae8a64	ret
