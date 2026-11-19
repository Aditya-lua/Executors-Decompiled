; EVP_PKEY_CTX_set_rsa_keygen_bits @ 00ad2d60
00ad2d60	sub sp,sp,#0xa0
00ad2d64	stp x29,x30,[sp, #0x90]
00ad2d68	add x29,sp,#0x90
00ad2d6c	sxtw x8,w1
00ad2d70	str x19,[sp, #0x80]
00ad2d74	stur x8,[x29, #-0x8]
00ad2d78	cbz x0,0x00ad2e14
00ad2d7c	ldr w8,[x0]
00ad2d80	mov x19,x0
00ad2d84	cmp w8,#0x2
00ad2d88	b.eq 0x00ad2d94
00ad2d8c	cmp w8,#0x4
00ad2d90	b.ne 0x00ad2e14
00ad2d94	adrp x1,0x2db000
00ad2d98	add x1,x1,#0x996
00ad2d9c	mov x0,x19
00ad2da0	bl 0x00c3dc40
00ad2da4	cbnz w0,0x00ad2dbc
00ad2da8	adrp x1,0x2b9000
00ad2dac	add x1,x1,#0x9cf
00ad2db0	mov x0,x19
00ad2db4	bl 0x00c3dc40
00ad2db8	cbz w0,0x00ad2e54
00ad2dbc	adrp x0,0x2ad000
00ad2dc0	add x0,x0,#0xc98
00ad2dc4	add x8,sp,#0x8
00ad2dc8	sub x1,x29,#0x8
00ad2dcc	bl 0x00c36270
00ad2dd0	ldr x8,[sp, #0x28]
00ad2dd4	ldur q0,[sp, #0x18]
00ad2dd8	ldur q1,[sp, #0x8]
00ad2ddc	str x8,[sp, #0x50]
00ad2de0	add x8,sp,#0x8
00ad2de4	stp q1,q0,[sp, #0x30]
00ad2de8	bl 0x00c34c40
00ad2dec	ldr x8,[sp, #0x28]
00ad2df0	ldur q0,[sp, #0x18]
00ad2df4	ldur q1,[sp, #0x8]
00ad2df8	add x1,sp,#0x30
00ad2dfc	mov x0,x19
00ad2e00	str x8,[sp, #0x78]
00ad2e04	stur q0,[sp, #0x68]
00ad2e08	stur q1,[sp, #0x58]
00ad2e0c	bl 0x00c3c120
00ad2e10	b 0x00ad2e44
00ad2e14	bl 0x00c342a0
00ad2e18	adrp x0,0x2b0000
00ad2e1c	adrp x2,0x2a8000
00ad2e20	add x0,x0,#0x862
00ad2e24	add x2,x2,#0x812
00ad2e28	mov w1,#0x4cd
00ad2e2c	bl 0x00c342b0
00ad2e30	orr w0,wzr,#0x6
00ad2e34	mov w1,#0x93
00ad2e38	mov x2,xzr
00ad2e3c	bl 0x00c342c0
00ad2e40	orr w0,wzr,#0xfffffffe
00ad2e44	ldp x29,x30,[sp, #0x90]
00ad2e48	ldr x19,[sp, #0x80]
00ad2e4c	add sp,sp,#0xa0
00ad2e50	ret
00ad2e54	mov w0,#0xffffffff
00ad2e58	b 0x00ad2e44
