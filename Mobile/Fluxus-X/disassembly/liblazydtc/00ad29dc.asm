; EVP_PKEY_CTX_set0_rsa_oaep_label @ 00ad29dc
00ad29dc	sub sp,sp,#0xb0
00ad29e0	str x21,[sp, #0x80]
00ad29e4	mov w21,w2
00ad29e8	stp x20,x19,[sp, #0x90]
00ad29ec	stp x29,x30,[sp, #0xa0]
00ad29f0	add x29,sp,#0xa0
00ad29f4	cbz x0,0x00ad2ab4
00ad29f8	ldr w8,[x0]
00ad29fc	mov x19,x1
00ad2a00	mov x20,x0
00ad2a04	cmp w8,#0x200
00ad2a08	b.eq 0x00ad2a14
00ad2a0c	cmp w8,#0x400
00ad2a10	b.ne 0x00ad2ab4
00ad2a14	adrp x1,0x2db000
00ad2a18	add x1,x1,#0x996
00ad2a1c	mov x0,x20
00ad2a20	bl 0x00c3dc40
00ad2a24	cbz w0,0x00ad2ae8
00ad2a28	cmp w21,#0x0
00ad2a2c	adrp x8,0x2ab000
00ad2a30	add x8,x8,#0x32c
00ad2a34	ccmp x19,#0x0,#0x0,eq
00ad2a38	adrp x0,0x2bf000
00ad2a3c	csel x1,x8,x19,eq
00ad2a40	sxtw x2,w21
00ad2a44	add x0,x0,#0xd88
00ad2a48	add x8,sp,#0x8
00ad2a4c	bl 0x00c34c50
00ad2a50	ldr x8,[sp, #0x28]
00ad2a54	ldur q0,[sp, #0x18]
00ad2a58	ldur q1,[sp, #0x8]
00ad2a5c	str x8,[sp, #0x50]
00ad2a60	add x8,sp,#0x8
00ad2a64	stp q1,q0,[sp, #0x30]
00ad2a68	bl 0x00c34c40
00ad2a6c	ldr x8,[sp, #0x28]
00ad2a70	ldur q0,[sp, #0x18]
00ad2a74	ldur q1,[sp, #0x8]
00ad2a78	add x1,sp,#0x30
00ad2a7c	mov x0,x20
00ad2a80	str x8,[sp, #0x78]
00ad2a84	stur q0,[sp, #0x68]
00ad2a88	stur q1,[sp, #0x58]
00ad2a8c	bl 0x00c3c120
00ad2a90	cmp w0,#0x1
00ad2a94	b.lt 0x00ad2aec
00ad2a98	adrp x1,0x2b0000
00ad2a9c	add x1,x1,#0x862
00ad2aa0	mov w2,#0x46b
00ad2aa4	mov x0,x19
00ad2aa8	bl 0x00c32310
00ad2aac	mov w0,#0x1
00ad2ab0	b 0x00ad2aec
00ad2ab4	bl 0x00c342a0
00ad2ab8	adrp x0,0x2b0000
00ad2abc	adrp x2,0x2a0000
00ad2ac0	add x0,x0,#0x862
00ad2ac4	add x2,x2,#0xbc2
00ad2ac8	mov w1,#0x454
00ad2acc	bl 0x00c342b0
00ad2ad0	orr w0,wzr,#0x6
00ad2ad4	mov w1,#0x93
00ad2ad8	mov x2,xzr
00ad2adc	bl 0x00c342c0
00ad2ae0	orr w0,wzr,#0xfffffffe
00ad2ae4	b 0x00ad2aec
00ad2ae8	mov w0,#0xffffffff
00ad2aec	ldp x29,x30,[sp, #0xa0]
00ad2af0	ldp x20,x19,[sp, #0x90]
00ad2af4	ldr x21,[sp, #0x80]
00ad2af8	add sp,sp,#0xb0
00ad2afc	ret
