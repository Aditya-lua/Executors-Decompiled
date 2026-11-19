; EVP_PKEY_CTX_set_dh_paramgen_generator @ 00a56c90
00a56c90	sub sp,sp,#0xa0
00a56c94	stp x29,x30,[sp, #0x90]
00a56c98	add x29,sp,#0x90
00a56c9c	str x19,[sp, #0x80]
00a56ca0	stur w1,[x29, #-0x4]
00a56ca4	cbz x0,0x00a56d20
00a56ca8	ldr w8,[x0]
00a56cac	mov x19,x0
00a56cb0	cmp w8,#0x2
00a56cb4	b.eq 0x00a56cc0
00a56cb8	cmp w8,#0x4
00a56cbc	b.ne 0x00a56d20
00a56cc0	ldr x8,[x19, #0x20]
00a56cc4	cbz x8,0x00a56d60
00a56cc8	adrp x0,0x2a4000
00a56ccc	add x0,x0,#0x2a
00a56cd0	add x8,sp,#0x8
00a56cd4	sub x1,x29,#0x4
00a56cd8	bl 0x00c36260
00a56cdc	ldr x8,[sp, #0x28]
00a56ce0	ldur q0,[sp, #0x18]
00a56ce4	ldur q1,[sp, #0x8]
00a56ce8	str x8,[sp, #0x50]
00a56cec	add x8,sp,#0x8
00a56cf0	stp q1,q0,[sp, #0x30]
00a56cf4	bl 0x00c34c40
00a56cf8	ldr x8,[sp, #0x28]
00a56cfc	ldur q0,[sp, #0x18]
00a56d00	ldur q1,[sp, #0x8]
00a56d04	add x1,sp,#0x30
00a56d08	mov x0,x19
00a56d0c	str x8,[sp, #0x78]
00a56d10	stur q0,[sp, #0x68]
00a56d14	stur q1,[sp, #0x58]
00a56d18	bl 0x00c3c120
00a56d1c	b 0x00a56d50
00a56d20	bl 0x00c342a0
00a56d24	adrp x0,0x2cf000
00a56d28	adrp x2,0x2c5000
00a56d2c	add x0,x0,#0xb4f
00a56d30	add x2,x2,#0xa48
00a56d34	mov w1,#0x16
00a56d38	bl 0x00c342b0
00a56d3c	orr w0,wzr,#0x6
00a56d40	mov w1,#0x93
00a56d44	mov x2,xzr
00a56d48	bl 0x00c342c0
00a56d4c	orr w0,wzr,#0xfffffffe
00a56d50	ldp x29,x30,[sp, #0x90]
00a56d54	ldr x19,[sp, #0x80]
00a56d58	add sp,sp,#0xa0
00a56d5c	ret
00a56d60	ldr x8,[x19, #0x78]
00a56d64	ldr w8,[x8]
00a56d68	cmp w8,#0x398
00a56d6c	b.eq 0x00a56cc8
00a56d70	cmp w8,#0x1c
00a56d74	b.eq 0x00a56cc8
00a56d78	mov w0,#0xffffffff
00a56d7c	b 0x00a56d50
