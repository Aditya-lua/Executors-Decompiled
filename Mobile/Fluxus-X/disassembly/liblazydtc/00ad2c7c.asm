; EVP_PKEY_CTX_set_rsa_pss_keygen_saltlen @ 00ad2c7c
00ad2c7c	sub sp,sp,#0xa0
00ad2c80	stp x29,x30,[sp, #0x90]
00ad2c84	add x29,sp,#0x90
00ad2c88	str x19,[sp, #0x80]
00ad2c8c	stur w1,[x29, #-0x4]
00ad2c90	cbz x0,0x00ad2d18
00ad2c94	ldr w8,[x0]
00ad2c98	mov x19,x0
00ad2c9c	cmp w8,#0x2
00ad2ca0	b.eq 0x00ad2cac
00ad2ca4	cmp w8,#0x4
00ad2ca8	b.ne 0x00ad2d18
00ad2cac	adrp x1,0x2b9000
00ad2cb0	add x1,x1,#0x9cf
00ad2cb4	mov x0,x19
00ad2cb8	bl 0x00c3dc40
00ad2cbc	cbz w0,0x00ad2d4c
00ad2cc0	adrp x0,0x2a2000
00ad2cc4	add x0,x0,#0x40c
00ad2cc8	add x8,sp,#0x8
00ad2ccc	sub x1,x29,#0x4
00ad2cd0	bl 0x00c36260
00ad2cd4	ldr x8,[sp, #0x28]
00ad2cd8	ldur q0,[sp, #0x18]
00ad2cdc	ldur q1,[sp, #0x8]
00ad2ce0	str x8,[sp, #0x50]
00ad2ce4	add x8,sp,#0x8
00ad2ce8	stp q1,q0,[sp, #0x30]
00ad2cec	bl 0x00c34c40
00ad2cf0	ldr x8,[sp, #0x28]
00ad2cf4	ldur q0,[sp, #0x18]
00ad2cf8	ldur q1,[sp, #0x8]
00ad2cfc	add x1,sp,#0x30
00ad2d00	mov x0,x19
00ad2d04	str x8,[sp, #0x78]
00ad2d08	stur q0,[sp, #0x68]
00ad2d0c	stur q1,[sp, #0x58]
00ad2d10	bl 0x00c3c120
00ad2d14	b 0x00ad2d50
00ad2d18	bl 0x00c342a0
00ad2d1c	adrp x0,0x2b0000
00ad2d20	adrp x2,0x2d0000
00ad2d24	add x0,x0,#0x862
00ad2d28	add x2,x2,#0x34e
00ad2d2c	mov w1,#0x4b8
00ad2d30	bl 0x00c342b0
00ad2d34	orr w0,wzr,#0x6
00ad2d38	mov w1,#0x93
00ad2d3c	mov x2,xzr
00ad2d40	bl 0x00c342c0
00ad2d44	orr w0,wzr,#0xfffffffe
00ad2d48	b 0x00ad2d50
00ad2d4c	mov w0,#0xffffffff
00ad2d50	ldp x29,x30,[sp, #0x90]
00ad2d54	ldr x19,[sp, #0x80]
00ad2d58	add sp,sp,#0xa0
00ad2d5c	ret
