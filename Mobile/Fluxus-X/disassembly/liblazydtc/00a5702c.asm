; EVP_PKEY_CTX_get_dh_kdf_outlen @ 00a5702c
00a5702c	sub sp,sp,#0xb0
00a57030	stp x29,x30,[sp, #0xa0]
00a57034	add x29,sp,#0xa0
00a57038	mov w8,#0xffffffff
00a5703c	stp x20,x19,[sp, #0x90]
00a57040	stur x8,[x29, #-0x18]
00a57044	cbz x0,0x00a570f4
00a57048	ldr w8,[x0]
00a5704c	mov x20,x0
00a57050	cmp w8,#0x800
00a57054	b.ne 0x00a570f4
00a57058	ldr x8,[x20, #0x20]
00a5705c	mov x19,x1
00a57060	cbz x8,0x00a57158
00a57064	adrp x0,0x2c9000
00a57068	add x0,x0,#0x866
00a5706c	add x8,sp,#0x8
00a57070	sub x1,x29,#0x18
00a57074	bl 0x00c36270
00a57078	ldr x8,[sp, #0x28]
00a5707c	ldur q0,[sp, #0x18]
00a57080	ldur q1,[sp, #0x8]
00a57084	str x8,[sp, #0x50]
00a57088	add x8,sp,#0x8
00a5708c	stp q1,q0,[sp, #0x30]
00a57090	bl 0x00c34c40
00a57094	ldr x8,[sp, #0x28]
00a57098	ldur q0,[sp, #0x18]
00a5709c	ldur q1,[sp, #0x8]
00a570a0	add x1,sp,#0x30
00a570a4	mov x0,x20
00a570a8	str x8,[sp, #0x78]
00a570ac	stur q0,[sp, #0x68]
00a570b0	stur q1,[sp, #0x58]
00a570b4	bl 0x00c3c110
00a570b8	cmn w0,#0x2
00a570bc	b.ne 0x00a57134
00a570c0	bl 0x00c342a0
00a570c4	adrp x0,0x2cf000
00a570c8	adrp x2,0x2a2000
00a570cc	add x0,x0,#0xb4f
00a570d0	add x2,x2,#0x35c
00a570d4	mov w1,#0x119
00a570d8	bl 0x00c342b0
00a570dc	orr w0,wzr,#0x6
00a570e0	mov w1,#0x93
00a570e4	mov x2,xzr
00a570e8	bl 0x00c342c0
00a570ec	mov w0,#0xffffffff
00a570f0	b 0x00a57124
00a570f4	bl 0x00c342a0
00a570f8	adrp x0,0x2cf000
00a570fc	adrp x2,0x2b7000
00a57100	add x0,x0,#0xb4f
00a57104	add x2,x2,#0xc4b
00a57108	mov w1,#0x25
00a5710c	bl 0x00c342b0
00a57110	orr w0,wzr,#0x6
00a57114	mov w1,#0x93
00a57118	mov x2,xzr
00a5711c	bl 0x00c342c0
00a57120	orr w0,wzr,#0xfffffffe
00a57124	ldp x29,x30,[sp, #0xa0]
00a57128	ldp x20,x19,[sp, #0x90]
00a5712c	add sp,sp,#0xb0
00a57130	ret
00a57134	cmp w0,#0x1
00a57138	mov w0,#0xffffffff
00a5713c	b.ne 0x00a57124
00a57140	ldur x8,[x29, #-0x18]
00a57144	lsr x9,x8,#0x1f
00a57148	cbnz x9,0x00a57124
00a5714c	mov w0,#0x1
00a57150	str w8,[x19]
00a57154	b 0x00a57124
00a57158	ldr x8,[x20, #0x78]
00a5715c	ldr w8,[x8]
00a57160	cmp w8,#0x398
00a57164	b.eq 0x00a57064
00a57168	cmp w8,#0x1c
00a5716c	b.eq 0x00a57064
00a57170	mov w0,#0xffffffff
00a57174	b 0x00a57124
