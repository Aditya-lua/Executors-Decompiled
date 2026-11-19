; EVP_PKEY_CTX_set_dsa_paramgen_q_bits @ 00a79b10
00a79b10	sub sp,sp,#0xa0
00a79b14	stp x29,x30,[sp, #0x90]
00a79b18	add x29,sp,#0x90
00a79b1c	sxtw x8,w1
00a79b20	str x19,[sp, #0x80]
00a79b24	stur x8,[x29, #-0x8]
00a79b28	cbz x0,0x00a79bb0
00a79b2c	ldr w8,[x0]
00a79b30	mov x19,x0
00a79b34	cmp w8,#0x2
00a79b38	b.eq 0x00a79b44
00a79b3c	cmp w8,#0x4
00a79b40	b.ne 0x00a79bb0
00a79b44	ldr x8,[x19, #0x78]
00a79b48	cbz x8,0x00a79b58
00a79b4c	ldr w8,[x8]
00a79b50	cmp w8,#0x74
00a79b54	b.ne 0x00a79bf0
00a79b58	adrp x0,0x2db000
00a79b5c	add x0,x0,#0xfc2
00a79b60	add x8,sp,#0x8
00a79b64	sub x1,x29,#0x8
00a79b68	bl 0x00c36270
00a79b6c	ldr x8,[sp, #0x28]
00a79b70	ldur q0,[sp, #0x18]
00a79b74	ldur q1,[sp, #0x8]
00a79b78	str x8,[sp, #0x50]
00a79b7c	add x8,sp,#0x8
00a79b80	stp q1,q0,[sp, #0x30]
00a79b84	bl 0x00c34c40
00a79b88	ldr x8,[sp, #0x28]
00a79b8c	ldur q0,[sp, #0x18]
00a79b90	ldur q1,[sp, #0x8]
00a79b94	add x1,sp,#0x30
00a79b98	mov x0,x19
00a79b9c	str x8,[sp, #0x78]
00a79ba0	stur q0,[sp, #0x68]
00a79ba4	stur q1,[sp, #0x58]
00a79ba8	bl 0x00c36dd0
00a79bac	b 0x00a79be0
00a79bb0	bl 0x00c342a0
00a79bb4	adrp x0,0x2bb000
00a79bb8	adrp x2,0x2aa000
00a79bbc	add x0,x0,#0xce6
00a79bc0	add x2,x2,#0x26c
00a79bc4	mov w1,#0x14
00a79bc8	bl 0x00c342b0
00a79bcc	orr w0,wzr,#0x6
00a79bd0	mov w1,#0x93
00a79bd4	mov x2,xzr
00a79bd8	bl 0x00c342c0
00a79bdc	orr w0,wzr,#0xfffffffe
00a79be0	ldp x29,x30,[sp, #0x90]
00a79be4	ldr x19,[sp, #0x80]
00a79be8	add sp,sp,#0xa0
00a79bec	ret
00a79bf0	mov w0,#0xffffffff
00a79bf4	b 0x00a79be0
