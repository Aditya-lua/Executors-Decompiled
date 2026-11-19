; EVP_PKEY_CTX_set_kem_op @ 00a76e78
00a76e78	sub sp,sp,#0xa0
00a76e7c	str x19,[sp, #0x80]
00a76e80	stp x29,x30,[sp, #0x90]
00a76e84	add x29,sp,#0x90
00a76e88	cbz x0,0x00a76f00
00a76e8c	cbz x1,0x00a76f00
00a76e90	ldr w8,[x0]
00a76e94	mov x19,x0
00a76e98	cmp w8,#0x1, LSL #12
00a76e9c	b.eq 0x00a76ea8
00a76ea0	cmp w8,#0x2, LSL #12
00a76ea4	b.ne 0x00a76f34
00a76ea8	adrp x0,0x2d5000
00a76eac	add x0,x0,#0xd85
00a76eb0	add x8,sp,#0x8
00a76eb4	mov x2,xzr
00a76eb8	bl 0x00c36280
00a76ebc	ldr x8,[sp, #0x28]
00a76ec0	ldur q0,[sp, #0x18]
00a76ec4	ldur q1,[sp, #0x8]
00a76ec8	str x8,[sp, #0x50]
00a76ecc	add x8,sp,#0x8
00a76ed0	stp q1,q0,[sp, #0x30]
00a76ed4	bl 0x00c34c40
00a76ed8	ldr x8,[sp, #0x28]
00a76edc	ldur q0,[sp, #0x18]
00a76ee0	ldur q1,[sp, #0x8]
00a76ee4	add x1,sp,#0x30
00a76ee8	mov x0,x19
00a76eec	str x8,[sp, #0x78]
00a76ef0	stur q0,[sp, #0x68]
00a76ef4	stur q1,[sp, #0x58]
00a76ef8	bl 0x00a75c0c
00a76efc	b 0x00a76f64
00a76f00	bl 0x00c342a0
00a76f04	adrp x0,0x2c3000
00a76f08	adrp x2,0x2b9000
00a76f0c	add x0,x0,#0xa9f
00a76f10	add x2,x2,#0xf35
00a76f14	mov w1,#0x4f3
00a76f18	bl 0x00c342b0
00a76f1c	orr w0,wzr,#0x6
00a76f20	mov w1,#0xde
00a76f24	mov x2,xzr
00a76f28	bl 0x00c342c0
00a76f2c	mov w0,wzr
00a76f30	b 0x00a76f64
00a76f34	bl 0x00c342a0
00a76f38	adrp x0,0x2c3000
00a76f3c	adrp x2,0x2b9000
00a76f40	add x0,x0,#0xa9f
00a76f44	add x2,x2,#0xf35
00a76f48	mov w1,#0x4f7
00a76f4c	bl 0x00c342b0
00a76f50	orr w0,wzr,#0x6
00a76f54	mov w1,#0x93
00a76f58	mov x2,xzr
00a76f5c	bl 0x00c342c0
00a76f60	orr w0,wzr,#0xfffffffe
00a76f64	ldp x29,x30,[sp, #0x90]
00a76f68	ldr x19,[sp, #0x80]
00a76f6c	add sp,sp,#0xa0
00a76f70	ret
