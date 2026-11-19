; mbedtls_rsa_rsaes_oaep_decrypt @ 00ba7b4c
00ba7b4c	stp x28,x27,[sp, #-0x60]!
00ba7b50	stp x26,x25,[sp, #0x10]
00ba7b54	stp x24,x23,[sp, #0x20]
00ba7b58	stp x22,x21,[sp, #0x30]
00ba7b5c	stp x20,x19,[sp, #0x40]
00ba7b60	stp x29,x30,[sp, #0x50]
00ba7b64	add x29,sp,#0x50
00ba7b68	sub sp,sp,#0x470
00ba7b6c	mrs x28,tpidr_el0
00ba7b70	ldr x8,[x28, #0x28]
00ba7b74	mov x23,x6
00ba7b78	mov x20,x5
00ba7b7c	mov x21,x4
00ba7b80	stur x8,[x29, #-0x60]
00ba7b84	ldr w8,[x0, #0xe0]
00ba7b88	mov x22,x3
00ba7b8c	mov x25,x2
00ba7b90	mov x24,x0
00ba7b94	cmp w8,#0x1
00ba7b98	mov x26,x1
00ba7b9c	b.ne 0x00ba7bdc
00ba7ba0	ldr x19,[x24, #0x8]
00ba7ba4	sub x8,x19,#0x10
00ba7ba8	cmp x8,#0x3f0
00ba7bac	b.hi 0x00ba7bdc
00ba7bb0	ldr w0,[x24, #0xe4]
00ba7bb4	str x7,[sp, #0x18]
00ba7bb8	bl 0x00c30210
00ba7bbc	bl 0x00c302d0
00ba7bc0	mov w27,w0
00ba7bc4	tst w0,#0xff
00ba7bc8	b.eq 0x00ba7bdc
00ba7bcc	ubfiz w9,w27,#0x1,#0x8
00ba7bd0	add w8,w9,#0x2
00ba7bd4	cmp x19,x8
00ba7bd8	b.cs 0x00ba7c14
00ba7bdc	mov w25,#0xffffbf80
00ba7be0	ldr x8,[x28, #0x28]
00ba7be4	ldur x9,[x29, #-0x60]
00ba7be8	cmp x8,x9
00ba7bec	b.ne 0x00ba7de0
00ba7bf0	mov w0,w25
00ba7bf4	add sp,sp,#0x470
00ba7bf8	ldp x29,x30,[sp, #0x50]
00ba7bfc	ldp x20,x19,[sp, #0x40]
00ba7c00	ldp x22,x21,[sp, #0x30]
00ba7c04	ldp x24,x23,[sp, #0x20]
00ba7c08	ldp x26,x25,[sp, #0x10]
00ba7c0c	ldp x28,x27,[sp], #0x60
00ba7c10	ret
00ba7c14	add x4,sp,#0x60
00ba7c18	mov x0,x24
00ba7c1c	mov x1,x26
00ba7c20	mov x2,x25
00ba7c24	mov x3,x23
00ba7c28	str x9,[sp, #0x10]
00ba7c2c	bl 0x00c43460
00ba7c30	mov w25,w0
00ba7c34	cbnz w0,0x00ba7c94
00ba7c38	add x8,sp,#0x60
00ba7c3c	and x23,x27,#0xff
00ba7c40	orr x0,x8,#0x1
00ba7c44	ldr w4,[x24, #0xe4]
00ba7c48	add x8,x8,x23
00ba7c4c	add x27,x8,#0x1
00ba7c50	sub x8,x19,x23
00ba7c54	sub x26,x8,#0x1
00ba7c58	mov x1,x23
00ba7c5c	mov x2,x27
00ba7c60	mov x3,x26
00ba7c64	str x0,[sp, #0x8]
00ba7c68	bl 0x00ba76c0
00ba7c6c	mov w25,w0
00ba7c70	cbnz w0,0x00ba7c94
00ba7c74	ldr w4,[x24, #0xe4]
00ba7c78	ldr x2,[sp, #0x8]
00ba7c7c	mov x0,x27
00ba7c80	mov x1,x26
00ba7c84	mov x3,x23
00ba7c88	bl 0x00ba76c0
00ba7c8c	mov w25,w0
00ba7c90	cbz w0,0x00ba7cb0
00ba7c94	add x0,sp,#0x60
00ba7c98	mov w1,#0x400
00ba7c9c	bl 0x00c42220
00ba7ca0	add x0,sp,#0x20
00ba7ca4	mov w1,#0x40
00ba7ca8	bl 0x00c42220
00ba7cac	b 0x00ba7be0
00ba7cb0	ldr w0,[x24, #0xe4]
00ba7cb4	mov x26,x23
00ba7cb8	ldr x23,[sp, #0x8]
00ba7cbc	bl 0x00c30210
00ba7cc0	cbz x0,0x00ba7db8
00ba7cc4	add x3,sp,#0x20
00ba7cc8	mov x1,x22
00ba7ccc	mov x2,x21
00ba7cd0	bl 0x00c30220
00ba7cd4	mov w25,w0
00ba7cd8	cbnz w0,0x00ba7c94
00ba7cdc	ldrb w22,[sp, #0x60]
00ba7ce0	add x21,x23,x26
00ba7ce4	add x0,sp,#0x20
00ba7ce8	mov x1,x21
00ba7cec	mov x2,x26
00ba7cf0	mov x24,x26
00ba7cf4	neg x8,x22
00ba7cf8	orr x22,x8,x22
00ba7cfc	asr x22,x22,#0x3f
00ba7d00	bl 0x00c42190
00ba7d04	sxtw x8,w0
00ba7d08	neg x12,x8
00ba7d0c	orr x8,x12,x8
00ba7d10	asr x8,x8,#0x3f
00ba7d14	ldr x12,[sp, #0x10]
00ba7d18	mov x10,#-0x1
00ba7d1c	sub x11,x19,#0x2
00ba7d20	add x9,x21,x26
00ba7d24	subs x12,x11,x12
00ba7d28	orr x8,x8,x22
00ba7d2c	mov x11,xzr
00ba7d30	b.eq 0x00ba7d6c
00ba7d34	add x13,sp,#0x60
00ba7d38	add x13,x13,x24, LSL #0x1
00ba7d3c	orr x13,x13,#0x1
00ba7d40	ldrb w15,[x13], #0x1
00ba7d44	mov x14,xzr
00ba7d48	subs x12,x12,#0x1
00ba7d4c	eor x14,x14,x15
00ba7d50	neg x15,x14
00ba7d54	orr x14,x15,x14
00ba7d58	asr x14,x14,#0x3f
00ba7d5c	bic x10,x10,x14
00ba7d60	and x14,x10,#0x1
00ba7d64	add x11,x14,x11
00ba7d68	b.ne 0x00ba7d40
00ba7d6c	add x1,x9,x11
00ba7d70	ldrb w9,[x1], #0x1
00ba7d74	mov w11,#0x1
00ba7d78	mov x10,xzr
00ba7d7c	eor x9,x11,x9
00ba7d80	neg x11,x9
00ba7d84	orr x9,x11,x9
00ba7d88	asr x9,x9,#0x3f
00ba7d8c	orr x8,x8,x9
00ba7d90	cmp x8,x10
00ba7d94	b.ne 0x00ba7dc0
00ba7d98	ldr x8,[x29, #0x10]
00ba7d9c	add x9,sp,#0x60
00ba7da0	sub x9,x9,x1
00ba7da4	add x2,x9,x19
00ba7da8	cmp x2,x8
00ba7dac	b.ls 0x00ba7dc8
00ba7db0	mov w25,#0xffffbc00
00ba7db4	b 0x00ba7c94
00ba7db8	mov w25,#0xffffbf80
00ba7dbc	b 0x00ba7c94
00ba7dc0	mov w25,#0xffffbf00
00ba7dc4	b 0x00ba7c94
00ba7dc8	str x2,[x20]
00ba7dcc	cbz x2,0x00ba7dd8
00ba7dd0	ldr x0,[sp, #0x18]
00ba7dd4	bl 0x00c2ffd0
00ba7dd8	mov w25,wzr
00ba7ddc	b 0x00ba7c94
00ba7de0	bl 0x00c2fec0
