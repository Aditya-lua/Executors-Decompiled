; EVP_PKEY_CTX_set_ecdh_cofactor_mode @ 00a7a9ac
00a7a9ac	sub sp,sp,#0xa0
00a7a9b0	stp x29,x30,[sp, #0x90]
00a7a9b4	add x29,sp,#0x90
00a7a9b8	str x19,[sp, #0x80]
00a7a9bc	stur w1,[x29, #-0x4]
00a7a9c0	cbz x0,0x00a7aa60
00a7a9c4	ldr w8,[x0]
00a7a9c8	mov x19,x0
00a7a9cc	cmp w8,#0x800
00a7a9d0	b.ne 0x00a7aa60
00a7a9d4	ldr x8,[x19, #0x20]
00a7a9d8	cbz x8,0x00a7aaa0
00a7a9dc	add w8,w1,#0x1
00a7a9e0	cmp w8,#0x2
00a7a9e4	b.hi 0x00a7aa8c
00a7a9e8	adrp x0,0x2b7000
00a7a9ec	add x0,x0,#0xd2b
00a7a9f0	add x8,sp,#0x8
00a7a9f4	sub x1,x29,#0x4
00a7a9f8	bl 0x00c36260
00a7a9fc	ldr x8,[sp, #0x28]
00a7aa00	ldur q0,[sp, #0x18]
00a7aa04	ldur q1,[sp, #0x8]
00a7aa08	str x8,[sp, #0x50]
00a7aa0c	add x8,sp,#0x8
00a7aa10	stp q1,q0,[sp, #0x30]
00a7aa14	bl 0x00c34c40
00a7aa18	ldr x8,[sp, #0x28]
00a7aa1c	ldur q0,[sp, #0x18]
00a7aa20	ldur q1,[sp, #0x8]
00a7aa24	add x1,sp,#0x30
00a7aa28	mov x0,x19
00a7aa2c	str x8,[sp, #0x78]
00a7aa30	stur q0,[sp, #0x68]
00a7aa34	stur q1,[sp, #0x58]
00a7aa38	bl 0x00c3c120
00a7aa3c	cmn w0,#0x2
00a7aa40	b.ne 0x00a7aa90
00a7aa44	bl 0x00c342a0
00a7aa48	adrp x0,0x2d9000
00a7aa4c	adrp x2,0x2d7000
00a7aa50	add x0,x0,#0xd63
00a7aa54	add x2,x2,#0xf7f
00a7aa58	mov w1,#0x42
00a7aa5c	b 0x00a7aa78
00a7aa60	bl 0x00c342a0
00a7aa64	adrp x0,0x2d9000
00a7aa68	adrp x2,0x2bd000
00a7aa6c	add x0,x0,#0xd63
00a7aa70	add x2,x2,#0xbcb
00a7aa74	mov w1,#0x1b
00a7aa78	bl 0x00c342b0
00a7aa7c	orr w0,wzr,#0x6
00a7aa80	mov w1,#0x93
00a7aa84	mov x2,xzr
00a7aa88	bl 0x00c342c0
00a7aa8c	orr w0,wzr,#0xfffffffe
00a7aa90	ldp x29,x30,[sp, #0x90]
00a7aa94	ldr x19,[sp, #0x80]
00a7aa98	add sp,sp,#0xa0
00a7aa9c	ret
00a7aaa0	ldr x8,[x19, #0x78]
00a7aaa4	cbz x8,0x00a7a9dc
00a7aaa8	ldr w8,[x8]
00a7aaac	cmp w8,#0x198
00a7aab0	b.eq 0x00a7a9dc
00a7aab4	mov w0,#0xffffffff
00a7aab8	b 0x00a7aa90
