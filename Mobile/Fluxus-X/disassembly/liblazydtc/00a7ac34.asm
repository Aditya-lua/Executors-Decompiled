; EVP_PKEY_CTX_set_ecdh_kdf_outlen @ 00a7ac34
00a7ac34	sub sp,sp,#0xa0
00a7ac38	stp x29,x30,[sp, #0x90]
00a7ac3c	add x29,sp,#0x90
00a7ac40	sxtw x8,w1
00a7ac44	str x19,[sp, #0x80]
00a7ac48	stur x8,[x29, #-0x8]
00a7ac4c	cbz x0,0x00a7ace8
00a7ac50	ldr w8,[x0]
00a7ac54	mov x19,x0
00a7ac58	cmp w8,#0x800
00a7ac5c	b.ne 0x00a7ace8
00a7ac60	ldr x8,[x19, #0x20]
00a7ac64	cbz x8,0x00a7ad28
00a7ac68	cmp w1,#0x1
00a7ac6c	b.lt 0x00a7ad14
00a7ac70	adrp x0,0x2c9000
00a7ac74	add x0,x0,#0x866
00a7ac78	add x8,sp,#0x8
00a7ac7c	sub x1,x29,#0x8
00a7ac80	bl 0x00c36270
00a7ac84	ldr x8,[sp, #0x28]
00a7ac88	ldur q0,[sp, #0x18]
00a7ac8c	ldur q1,[sp, #0x8]
00a7ac90	str x8,[sp, #0x50]
00a7ac94	add x8,sp,#0x8
00a7ac98	stp q1,q0,[sp, #0x30]
00a7ac9c	bl 0x00c34c40
00a7aca0	ldr x8,[sp, #0x28]
00a7aca4	ldur q0,[sp, #0x18]
00a7aca8	ldur q1,[sp, #0x8]
00a7acac	add x1,sp,#0x30
00a7acb0	mov x0,x19
00a7acb4	str x8,[sp, #0x78]
00a7acb8	stur q0,[sp, #0x68]
00a7acbc	stur q1,[sp, #0x58]
00a7acc0	bl 0x00c3c120
00a7acc4	cmn w0,#0x2
00a7acc8	b.ne 0x00a7ad18
00a7accc	bl 0x00c342a0
00a7acd0	adrp x0,0x2d9000
00a7acd4	adrp x2,0x2d7000
00a7acd8	add x0,x0,#0xd63
00a7acdc	add x2,x2,#0xfa3
00a7ace0	mov w1,#0xac
00a7ace4	b 0x00a7ad00
00a7ace8	bl 0x00c342a0
00a7acec	adrp x0,0x2d9000
00a7acf0	adrp x2,0x2bd000
00a7acf4	add x0,x0,#0xd63
00a7acf8	add x2,x2,#0xbcb
00a7acfc	mov w1,#0x1b
00a7ad00	bl 0x00c342b0
00a7ad04	orr w0,wzr,#0x6
00a7ad08	mov w1,#0x93
00a7ad0c	mov x2,xzr
00a7ad10	bl 0x00c342c0
00a7ad14	orr w0,wzr,#0xfffffffe
00a7ad18	ldp x29,x30,[sp, #0x90]
00a7ad1c	ldr x19,[sp, #0x80]
00a7ad20	add sp,sp,#0xa0
00a7ad24	ret
00a7ad28	ldr x8,[x19, #0x78]
00a7ad2c	cbz x8,0x00a7ac68
00a7ad30	ldr w8,[x8]
00a7ad34	cmp w8,#0x198
00a7ad38	b.eq 0x00a7ac68
00a7ad3c	mov w0,#0xffffffff
00a7ad40	b 0x00a7ad18
