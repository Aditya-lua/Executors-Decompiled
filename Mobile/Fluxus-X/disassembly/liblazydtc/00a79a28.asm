; EVP_PKEY_CTX_set_dsa_paramgen_bits @ 00a79a28
00a79a28	sub sp,sp,#0xa0
00a79a2c	stp x29,x30,[sp, #0x90]
00a79a30	add x29,sp,#0x90
00a79a34	sxtw x8,w1
00a79a38	str x19,[sp, #0x80]
00a79a3c	stur x8,[x29, #-0x8]
00a79a40	cbz x0,0x00a79ac8
00a79a44	ldr w8,[x0]
00a79a48	mov x19,x0
00a79a4c	cmp w8,#0x2
00a79a50	b.eq 0x00a79a5c
00a79a54	cmp w8,#0x4
00a79a58	b.ne 0x00a79ac8
00a79a5c	ldr x8,[x19, #0x78]
00a79a60	cbz x8,0x00a79a70
00a79a64	ldr w8,[x8]
00a79a68	cmp w8,#0x74
00a79a6c	b.ne 0x00a79b08
00a79a70	adrp x0,0x2aa000
00a79a74	add x0,x0,#0x16b
00a79a78	add x8,sp,#0x8
00a79a7c	sub x1,x29,#0x8
00a79a80	bl 0x00c36270
00a79a84	ldr x8,[sp, #0x28]
00a79a88	ldur q0,[sp, #0x18]
00a79a8c	ldur q1,[sp, #0x8]
00a79a90	str x8,[sp, #0x50]
00a79a94	add x8,sp,#0x8
00a79a98	stp q1,q0,[sp, #0x30]
00a79a9c	bl 0x00c34c40
00a79aa0	ldr x8,[sp, #0x28]
00a79aa4	ldur q0,[sp, #0x18]
00a79aa8	ldur q1,[sp, #0x8]
00a79aac	add x1,sp,#0x30
00a79ab0	mov x0,x19
00a79ab4	str x8,[sp, #0x78]
00a79ab8	stur q0,[sp, #0x68]
00a79abc	stur q1,[sp, #0x58]
00a79ac0	bl 0x00c36dd0
00a79ac4	b 0x00a79af8
00a79ac8	bl 0x00c342a0
00a79acc	adrp x0,0x2bb000
00a79ad0	adrp x2,0x2aa000
00a79ad4	add x0,x0,#0xce6
00a79ad8	add x2,x2,#0x26c
00a79adc	mov w1,#0x14
00a79ae0	bl 0x00c342b0
00a79ae4	orr w0,wzr,#0x6
00a79ae8	mov w1,#0x93
00a79aec	mov x2,xzr
00a79af0	bl 0x00c342c0
00a79af4	orr w0,wzr,#0xfffffffe
00a79af8	ldp x29,x30,[sp, #0x90]
00a79afc	ldr x19,[sp, #0x80]
00a79b00	add sp,sp,#0xa0
00a79b04	ret
00a79b08	mov w0,#0xffffffff
00a79b0c	b 0x00a79af8
