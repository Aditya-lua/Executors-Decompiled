; CRYPTO_ccm128_encrypt @ 00aa7b28
00aa7b28	sub sp,sp,#0x90
00aa7b2c	stp x28,x27,[sp, #0x30]
00aa7b30	stp x26,x25,[sp, #0x40]
00aa7b34	stp x24,x23,[sp, #0x50]
00aa7b38	stp x22,x21,[sp, #0x60]
00aa7b3c	stp x20,x19,[sp, #0x70]
00aa7b40	stp x29,x30,[sp, #0x80]
00aa7b44	ldrb w25,[x0]
00aa7b48	ldp x26,x20,[x0, #0x28]
00aa7b4c	mov x21,x3
00aa7b50	mov x23,x2
00aa7b54	mov x19,x0
00aa7b58	mov x27,x1
00aa7b5c	add x29,sp,#0x80
00aa7b60	tbnz w25,#0x6,0x00aa7b80
00aa7b64	add x1,x19,#0x10
00aa7b68	mov x0,x19
00aa7b6c	mov x2,x20
00aa7b70	blr x26
00aa7b74	ldr x8,[x19, #0x20]
00aa7b78	add x8,x8,#0x1
00aa7b7c	str x8,[x19, #0x20]
00aa7b80	ands w8,w25,#0x7
00aa7b84	strb w8,[x19]
00aa7b88	eor w22,w8,#0xf
00aa7b8c	mov x8,xzr
00aa7b90	b.eq 0x00aa7bb4
00aa7b94	mov x9,x22
00aa7b98	ldrb w10,[x19, x9]
00aa7b9c	strb wzr,[x19, x9]
00aa7ba0	add x9,x9,#0x1
00aa7ba4	cmp x9,#0xf
00aa7ba8	orr x8,x8,x10
00aa7bac	lsl x8,x8,#0x8
00aa7bb0	b.cc 0x00aa7b98
00aa7bb4	ldrb w9,[x19, #0xf]
00aa7bb8	orr x8,x8,x9
00aa7bbc	mov w9,#0x1
00aa7bc0	cmp x8,x21
00aa7bc4	strb w9,[x19, #0xf]
00aa7bc8	b.ne 0x00aa7bf8
00aa7bcc	ldr x8,[x19, #0x20]
00aa7bd0	add x9,x21,#0xf
00aa7bd4	lsr x9,x9,#0x3
00aa7bd8	orr x9,x9,#0x1
00aa7bdc	add x8,x8,x9
00aa7be0	orr x9,xzr,#0x2000000000000000
00aa7be4	cmp x8,x9
00aa7be8	str x8,[x19, #0x20]
00aa7bec	b.ls 0x00aa7c00
00aa7bf0	orr w0,wzr,#0xfffffffe
00aa7bf4	b 0x00aa7e28
00aa7bf8	mov w0,#0xffffffff
00aa7bfc	b 0x00aa7e28
00aa7c00	subs x8,x21,#0x10
00aa7c04	b.cc 0x00aa7cd4
00aa7c08	stp x8,x22,[sp, #0x10]
00aa7c0c	and x8,x8,#-0x10
00aa7c10	str x8,[sp, #0x8]
00aa7c14	add x8,x8,#0x10
00aa7c18	add x24,x19,#0x10
00aa7c1c	add x28,x23,x8
00aa7c20	mov x22,x27
00aa7c24	str x8,[sp]
00aa7c28	ldr x8,[x22]
00aa7c2c	ldp x9,x10,[x19, #0x10]
00aa7c30	mov x0,x24
00aa7c34	mov x1,x24
00aa7c38	mov x2,x20
00aa7c3c	eor x8,x9,x8
00aa7c40	str x8,[x19, #0x10]
00aa7c44	ldr x8,[x22, #0x8]
00aa7c48	eor x8,x10,x8
00aa7c4c	str x8,[x19, #0x18]
00aa7c50	blr x26
00aa7c54	add x1,sp,#0x20
00aa7c58	mov x0,x19
00aa7c5c	mov x2,x20
00aa7c60	blr x26
00aa7c64	orr w8,wzr,#0xf
00aa7c68	ldrb w9,[x19, x8]
00aa7c6c	cmp x8,#0x8
00aa7c70	add w9,w9,#0x1
00aa7c74	strb w9,[x19, x8]
00aa7c78	b.eq 0x00aa7c88
00aa7c7c	tst w9,#0xff
00aa7c80	sub x8,x8,#0x1
00aa7c84	b.eq 0x00aa7c68
00aa7c88	ldr x8,[sp, #0x20]
00aa7c8c	ldr x9,[x22]
00aa7c90	sub x21,x21,#0x10
00aa7c94	cmp x21,#0xf
00aa7c98	eor x8,x9,x8
00aa7c9c	str x8,[x23]
00aa7ca0	ldr x8,[sp, #0x28]
00aa7ca4	ldr x9,[x22, #0x8]
00aa7ca8	add x22,x22,#0x10
00aa7cac	eor x8,x9,x8
00aa7cb0	str x8,[x23, #0x8]
00aa7cb4	add x23,x23,#0x10
00aa7cb8	b.hi 0x00aa7c28
00aa7cbc	ldp x8,x9,[sp]
00aa7cc0	add x27,x27,x8
00aa7cc4	ldp x8,x22,[sp, #0x10]
00aa7cc8	sub x21,x8,x9
00aa7ccc	cbnz x21,0x00aa7cdc
00aa7cd0	b 0x00aa7dec
00aa7cd4	mov x28,x23
00aa7cd8	cbz x21,0x00aa7dec
00aa7cdc	cmp x21,#0x20
00aa7ce0	add x0,x19,#0x10
00aa7ce4	b.cc 0x00aa7d20
00aa7ce8	sub x9,x21,#0x1
00aa7cec	cmn w9,#0x1
00aa7cf0	b.eq 0x00aa7d20
00aa7cf4	mov x8,xzr
00aa7cf8	lsr x10,x9,#0x20
00aa7cfc	mov w9,wzr
00aa7d00	cbnz x10,0x00aa7d28
00aa7d04	add x8,x19,#0x10
00aa7d08	add x9,x27,x21
00aa7d0c	cmp x9,x8
00aa7d10	b.ls 0x00aa7e48
00aa7d14	add x8,x8,x21
00aa7d18	cmp x27,x8
00aa7d1c	b.cs 0x00aa7e48
00aa7d20	mov x8,xzr
00aa7d24	mov w9,wzr
00aa7d28	add w9,w9,#0x1
00aa7d2c	ldrb w10,[x27, x8]
00aa7d30	ldrb w11,[x0, x8]
00aa7d34	eor w10,w11,w10
00aa7d38	strb w10,[x0, x8]
00aa7d3c	mov w8,w9
00aa7d40	cmp x21,x8
00aa7d44	add w9,w9,#0x1
00aa7d48	b.hi 0x00aa7d2c
00aa7d4c	mov x1,x0
00aa7d50	mov x2,x20
00aa7d54	blr x26
00aa7d58	add x1,sp,#0x20
00aa7d5c	mov x0,x19
00aa7d60	mov x2,x20
00aa7d64	add x23,sp,#0x20
00aa7d68	blr x26
00aa7d6c	cmp x21,#0x1
00aa7d70	csinc x9,x21,xzr,hi
00aa7d74	cmp x9,#0x20
00aa7d78	b.cc 0x00aa7dc0
00aa7d7c	cmp x21,#0x1
00aa7d80	csinc x8,x21,xzr,hi
00aa7d84	sub x10,x8,#0x1
00aa7d88	cmn w10,#0x1
00aa7d8c	b.eq 0x00aa7dc0
00aa7d90	mov x8,xzr
00aa7d94	lsr x11,x10,#0x20
00aa7d98	mov w10,wzr
00aa7d9c	cbnz x11,0x00aa7dc8
00aa7da0	cmp x21,#0x1
00aa7da4	csinc x8,x21,xzr,hi
00aa7da8	add x10,x27,x8
00aa7dac	cmp x28,x10
00aa7db0	b.cs 0x00aa7e8c
00aa7db4	add x8,x28,x8
00aa7db8	cmp x27,x8
00aa7dbc	b.cs 0x00aa7e8c
00aa7dc0	mov x8,xzr
00aa7dc4	mov w10,wzr
00aa7dc8	add w9,w10,#0x1
00aa7dcc	ldrb w10,[x23, x8]
00aa7dd0	ldrb w11,[x27, x8]
00aa7dd4	eor w10,w11,w10
00aa7dd8	strb w10,[x28, x8]
00aa7ddc	mov w8,w9
00aa7de0	cmp x21,x8
00aa7de4	add w9,w9,#0x1
00aa7de8	b.hi 0x00aa7dcc
00aa7dec	mov w8,#0x10
00aa7df0	add x0,x19,x22
00aa7df4	sub w2,w8,w22
00aa7df8	mov w1,wzr
00aa7dfc	bl 0x00c301c0
00aa7e00	add x1,sp,#0x20
00aa7e04	mov x0,x19
00aa7e08	mov x2,x20
00aa7e0c	blr x26
00aa7e10	ldr q0,[sp, #0x20]
00aa7e14	ldr q1,[x19, #0x10]
00aa7e18	mov w0,wzr
00aa7e1c	strb w25,[x19]
00aa7e20	eor v0.16B,v1.16B,v0.16B
00aa7e24	str q0,[x19, #0x10]
00aa7e28	ldp x29,x30,[sp, #0x80]
00aa7e2c	ldp x20,x19,[sp, #0x70]
00aa7e30	ldp x22,x21,[sp, #0x60]
00aa7e34	ldp x24,x23,[sp, #0x50]
00aa7e38	ldp x26,x25,[sp, #0x40]
00aa7e3c	ldp x28,x27,[sp, #0x30]
00aa7e40	add sp,sp,#0x90
00aa7e44	ret
00aa7e48	and x8,x21,#-0x20
00aa7e4c	add x9,x27,#0x10
00aa7e50	add x10,x19,#0x20
00aa7e54	mov x11,x8
00aa7e58	ldp q0,q1,[x9, #-0x10]
00aa7e5c	ldp q2,q3,[x10, #-0x10]
00aa7e60	add x9,x9,#0x20
00aa7e64	subs x11,x11,#0x20
00aa7e68	eor v0.16B,v2.16B,v0.16B
00aa7e6c	eor v1.16B,v3.16B,v1.16B
00aa7e70	stp q0,q1,[x10, #-0x10]
00aa7e74	add x10,x10,#0x20
00aa7e78	b.ne 0x00aa7e58
00aa7e7c	cmp x21,x8
00aa7e80	mov w9,w8
00aa7e84	b.ne 0x00aa7d28
00aa7e88	b 0x00aa7d4c
00aa7e8c	and x8,x9,#-0x20
00aa7e90	add x11,sp,#0x20
00aa7e94	add x10,x27,#0x10
00aa7e98	add x11,x11,#0x10
00aa7e9c	add x12,x28,#0x10
00aa7ea0	mov x13,x8
00aa7ea4	ldp q0,q1,[x11, #-0x10]
00aa7ea8	ldp q2,q3,[x10, #-0x10]
00aa7eac	add x11,x11,#0x20
00aa7eb0	add x10,x10,#0x20
00aa7eb4	subs x13,x13,#0x20
00aa7eb8	eor v0.16B,v2.16B,v0.16B
00aa7ebc	eor v1.16B,v3.16B,v1.16B
00aa7ec0	stp q0,q1,[x12, #-0x10]
00aa7ec4	add x12,x12,#0x20
00aa7ec8	b.ne 0x00aa7ea4
00aa7ecc	cmp x9,x8
00aa7ed0	mov w10,w8
00aa7ed4	b.ne 0x00aa7dc8
00aa7ed8	b 0x00aa7dec
