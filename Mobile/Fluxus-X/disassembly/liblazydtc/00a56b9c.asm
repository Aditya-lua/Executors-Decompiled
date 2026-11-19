; EVP_PKEY_CTX_set_dh_paramgen_subprime_len @ 00a56b9c
00a56b9c	sub sp,sp,#0xa0
00a56ba0	stp x29,x30,[sp, #0x90]
00a56ba4	add x29,sp,#0x90
00a56ba8	sxtw x8,w1
00a56bac	str x19,[sp, #0x80]
00a56bb0	stur x8,[x29, #-0x8]
00a56bb4	cbz x0,0x00a56c30
00a56bb8	ldr w8,[x0]
00a56bbc	mov x19,x0
00a56bc0	cmp w8,#0x2
00a56bc4	b.eq 0x00a56bd0
00a56bc8	cmp w8,#0x4
00a56bcc	b.ne 0x00a56c30
00a56bd0	ldr x8,[x19, #0x20]
00a56bd4	cbz x8,0x00a56c70
00a56bd8	adrp x0,0x2db000
00a56bdc	add x0,x0,#0xfc2
00a56be0	add x8,sp,#0x8
00a56be4	sub x1,x29,#0x8
00a56be8	bl 0x00c36270
00a56bec	ldr x8,[sp, #0x28]
00a56bf0	ldur q0,[sp, #0x18]
00a56bf4	ldur q1,[sp, #0x8]
00a56bf8	str x8,[sp, #0x50]
00a56bfc	add x8,sp,#0x8
00a56c00	stp q1,q0,[sp, #0x30]
00a56c04	bl 0x00c34c40
00a56c08	ldr x8,[sp, #0x28]
00a56c0c	ldur q0,[sp, #0x18]
00a56c10	ldur q1,[sp, #0x8]
00a56c14	add x1,sp,#0x30
00a56c18	mov x0,x19
00a56c1c	str x8,[sp, #0x78]
00a56c20	stur q0,[sp, #0x68]
00a56c24	stur q1,[sp, #0x58]
00a56c28	bl 0x00c3c120
00a56c2c	b 0x00a56c60
00a56c30	bl 0x00c342a0
00a56c34	adrp x0,0x2cf000
00a56c38	adrp x2,0x2c5000
00a56c3c	add x0,x0,#0xb4f
00a56c40	add x2,x2,#0xa48
00a56c44	mov w1,#0x16
00a56c48	bl 0x00c342b0
00a56c4c	orr w0,wzr,#0x6
00a56c50	mov w1,#0x93
00a56c54	mov x2,xzr
00a56c58	bl 0x00c342c0
00a56c5c	orr w0,wzr,#0xfffffffe
00a56c60	ldp x29,x30,[sp, #0x90]
00a56c64	ldr x19,[sp, #0x80]
00a56c68	add sp,sp,#0xa0
00a56c6c	ret
00a56c70	ldr x8,[x19, #0x78]
00a56c74	ldr w8,[x8]
00a56c78	cmp w8,#0x398
00a56c7c	b.eq 0x00a56bd8
00a56c80	cmp w8,#0x1c
00a56c84	b.eq 0x00a56bd8
00a56c88	mov w0,#0xffffffff
00a56c8c	b 0x00a56c60
