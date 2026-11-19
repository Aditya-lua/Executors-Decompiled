; EVP_PKEY_CTX_set_dh_pad @ 00a56dc8
00a56dc8	sub sp,sp,#0xa0
00a56dcc	stp x29,x30,[sp, #0x90]
00a56dd0	add x29,sp,#0x90
00a56dd4	str x19,[sp, #0x80]
00a56dd8	stur w1,[x29, #-0x4]
00a56ddc	cbz x0,0x00a56e48
00a56de0	ldr w8,[x0]
00a56de4	mov x19,x0
00a56de8	cmp w8,#0x800
00a56dec	b.ne 0x00a56e48
00a56df0	adrp x0,0x2d7000
00a56df4	add x0,x0,#0xe5c
00a56df8	add x8,sp,#0x8
00a56dfc	sub x1,x29,#0x4
00a56e00	bl 0x00c37340
00a56e04	ldr x8,[sp, #0x28]
00a56e08	ldur q0,[sp, #0x18]
00a56e0c	ldur q1,[sp, #0x8]
00a56e10	str x8,[sp, #0x50]
00a56e14	add x8,sp,#0x8
00a56e18	stp q1,q0,[sp, #0x30]
00a56e1c	bl 0x00c34c40
00a56e20	ldr x8,[sp, #0x28]
00a56e24	ldur q0,[sp, #0x18]
00a56e28	ldur q1,[sp, #0x8]
00a56e2c	add x1,sp,#0x30
00a56e30	mov x0,x19
00a56e34	str x8,[sp, #0x78]
00a56e38	stur q0,[sp, #0x68]
00a56e3c	stur q1,[sp, #0x58]
00a56e40	bl 0x00c3c120
00a56e44	b 0x00a56e78
00a56e48	bl 0x00c342a0
00a56e4c	adrp x0,0x2cf000
00a56e50	adrp x2,0x2c3000
00a56e54	add x0,x0,#0xb4f
00a56e58	add x2,x2,#0x97c
00a56e5c	mov w1,#0xa6
00a56e60	bl 0x00c342b0
00a56e64	orr w0,wzr,#0x6
00a56e68	mov w1,#0x93
00a56e6c	mov x2,xzr
00a56e70	bl 0x00c342c0
00a56e74	orr w0,wzr,#0xfffffffe
00a56e78	ldp x29,x30,[sp, #0x90]
00a56e7c	ldr x19,[sp, #0x80]
00a56e80	add sp,sp,#0xa0
00a56e84	ret
