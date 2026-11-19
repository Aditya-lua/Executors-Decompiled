; CRYPTO_gcm128_setiv @ 00aa9a6c
00aa9a6c	str x27,[sp, #-0x60]!
00aa9a70	stp x22,x21,[sp, #0x30]
00aa9a74	stp x20,x19,[sp, #0x40]
00aa9a78	mov x22,x1
00aa9a7c	mov x19,x0
00aa9a80	cmp x2,#0xc
00aa9a84	stp x26,x25,[sp, #0x10]
00aa9a88	stp x24,x23,[sp, #0x20]
00aa9a8c	stp x29,x30,[sp, #0x50]
00aa9a90	add x29,sp,#0x50
00aa9a94	str xzr,[x0, #0x170]
00aa9a98	stp xzr,xzr,[x0, #0x30]
00aa9a9c	b.ne 0x00aa9ac0
00aa9aa0	ldr w8,[x22, #0x8]
00aa9aa4	mov w9,#0x1000000
00aa9aa8	mov w20,#0x2
00aa9aac	str w8,[x19, #0x8]
00aa9ab0	ldr x8,[x22]
00aa9ab4	str w9,[x19, #0xc]
00aa9ab8	str x8,[x19]
00aa9abc	b 0x00aa9d94
00aa9ac0	mov x21,x19
00aa9ac4	mov x20,x2
00aa9ac8	str xzr,[x21, #0x40]!
00aa9acc	subs x25,x2,#0x10
00aa9ad0	str xzr,[x21, #0x8]
00aa9ad4	b.cc 0x00aa9cf4
00aa9ad8	and x26,x25,#-0x10
00aa9adc	add x5,x22,x26
00aa9ae0	mov w8,wzr
00aa9ae4	mov w9,wzr
00aa9ae8	mov w10,wzr
00aa9aec	mov w11,wzr
00aa9af0	mov w12,wzr
00aa9af4	mov w13,wzr
00aa9af8	mov w14,wzr
00aa9afc	mov w15,wzr
00aa9b00	mov w16,wzr
00aa9b04	mov w17,wzr
00aa9b08	mov w18,wzr
00aa9b0c	mov w0,wzr
00aa9b10	mov w1,wzr
00aa9b14	mov w2,wzr
00aa9b18	mov w3,wzr
00aa9b1c	mov w4,wzr
00aa9b20	add x23,x19,#0x60
00aa9b24	add x24,x5,#0x10
00aa9b28	mov x27,x25
00aa9b2c	b 0x00aa9b74
00aa9b30	ldrb w4,[x19, #0x40]
00aa9b34	ldrb w3,[x19, #0x41]
00aa9b38	ldrb w2,[x19, #0x42]
00aa9b3c	ldrb w1,[x19, #0x43]
00aa9b40	ldrb w0,[x19, #0x44]
00aa9b44	ldrb w18,[x19, #0x45]
00aa9b48	ldrb w17,[x19, #0x46]
00aa9b4c	ldrb w16,[x19, #0x47]
00aa9b50	ldrb w15,[x19, #0x48]
00aa9b54	ldrb w14,[x19, #0x49]
00aa9b58	ldrb w13,[x19, #0x4a]
00aa9b5c	ldrb w12,[x19, #0x4b]
00aa9b60	ldrb w11,[x19, #0x4c]
00aa9b64	ldrb w10,[x19, #0x4d]
00aa9b68	ldrb w9,[x19, #0x4e]
00aa9b6c	ldrb w8,[x19, #0x4f]
00aa9b70	add x22,x22,#0x10
00aa9b74	ldrb w5,[x22]
00aa9b78	eor w4,w4,w5
00aa9b7c	strb w4,[x19, #0x40]
00aa9b80	ldrb w4,[x22, #0x1]
00aa9b84	eor w3,w3,w4
00aa9b88	strb w3,[x19, #0x41]
00aa9b8c	ldrb w3,[x22, #0x2]
00aa9b90	eor w2,w2,w3
00aa9b94	strb w2,[x19, #0x42]
00aa9b98	ldrb w2,[x22, #0x3]
00aa9b9c	eor w1,w1,w2
00aa9ba0	strb w1,[x19, #0x43]
00aa9ba4	ldrb w1,[x22, #0x4]
00aa9ba8	eor w0,w0,w1
00aa9bac	strb w0,[x19, #0x44]
00aa9bb0	ldrb w0,[x22, #0x5]
00aa9bb4	mov x1,x23
00aa9bb8	eor w18,w18,w0
00aa9bbc	strb w18,[x19, #0x45]
00aa9bc0	ldrb w18,[x22, #0x6]
00aa9bc4	mov x0,x21
00aa9bc8	eor w17,w17,w18
00aa9bcc	strb w17,[x19, #0x46]
00aa9bd0	ldrb w17,[x22, #0x7]
00aa9bd4	eor w16,w16,w17
00aa9bd8	strb w16,[x19, #0x47]
00aa9bdc	ldrb w16,[x22, #0x8]
00aa9be0	eor w15,w15,w16
00aa9be4	strb w15,[x19, #0x48]
00aa9be8	ldrb w15,[x22, #0x9]
00aa9bec	eor w14,w14,w15
00aa9bf0	strb w14,[x19, #0x49]
00aa9bf4	ldrb w14,[x22, #0xa]
00aa9bf8	eor w13,w13,w14
00aa9bfc	strb w13,[x19, #0x4a]
00aa9c00	ldrb w13,[x22, #0xb]
00aa9c04	eor w12,w12,w13
00aa9c08	strb w12,[x19, #0x4b]
00aa9c0c	ldrb w12,[x22, #0xc]
00aa9c10	eor w11,w11,w12
00aa9c14	strb w11,[x19, #0x4c]
00aa9c18	ldrb w11,[x22, #0xd]
00aa9c1c	eor w10,w10,w11
00aa9c20	strb w10,[x19, #0x4d]
00aa9c24	ldrb w10,[x22, #0xe]
00aa9c28	eor w9,w9,w10
00aa9c2c	strb w9,[x19, #0x4e]
00aa9c30	ldrb w9,[x22, #0xf]
00aa9c34	eor w8,w8,w9
00aa9c38	strb w8,[x19, #0x4f]
00aa9c3c	bl 0x00aa9de0
00aa9c40	subs x27,x27,#0x10
00aa9c44	b.cs 0x00aa9b30
00aa9c48	sub x8,x25,x26
00aa9c4c	cbz x8,0x00aa9d00
00aa9c50	cmp x8,#0x20
00aa9c54	mov x9,xzr
00aa9c58	b.cc 0x00aa9cb8
00aa9c5c	add x9,x19,#0x40
00aa9c60	add x10,x24,x8
00aa9c64	cmp x10,x9
00aa9c68	b.ls 0x00aa9c7c
00aa9c6c	add x9,x9,x8
00aa9c70	cmp x24,x9
00aa9c74	mov x9,xzr
00aa9c78	b.cc 0x00aa9cb8
00aa9c7c	and x9,x8,#-0x20
00aa9c80	add x10,x24,#0x10
00aa9c84	add x11,x19,#0x50
00aa9c88	mov x12,x9
00aa9c8c	ldp q0,q1,[x10, #-0x10]
00aa9c90	ldp q2,q3,[x11, #-0x10]
00aa9c94	add x10,x10,#0x20
00aa9c98	subs x12,x12,#0x20
00aa9c9c	eor v0.16B,v2.16B,v0.16B
00aa9ca0	eor v1.16B,v3.16B,v1.16B
00aa9ca4	stp q0,q1,[x11, #-0x10]
00aa9ca8	add x11,x11,#0x20
00aa9cac	b.ne 0x00aa9c8c
00aa9cb0	cmp x8,x9
00aa9cb4	b.eq 0x00aa9ce0
00aa9cb8	add x11,x19,x9
00aa9cbc	add x10,x24,x9
00aa9cc0	add x11,x11,#0x40
00aa9cc4	sub x8,x8,x9
00aa9cc8	ldrb w9,[x10], #0x1
00aa9ccc	ldrb w12,[x11]
00aa9cd0	subs x8,x8,#0x1
00aa9cd4	eor w9,w12,w9
00aa9cd8	strb w9,[x11], #0x1
00aa9cdc	b.ne 0x00aa9cc8
00aa9ce0	add x22,x19,#0x60
00aa9ce4	mov x0,x21
00aa9ce8	mov x1,x22
00aa9cec	bl 0x00aa9de0
00aa9cf0	b 0x00aa9d04
00aa9cf4	mov x8,x20
00aa9cf8	mov x24,x22
00aa9cfc	cbnz x8,0x00aa9c50
00aa9d00	add x22,x19,#0x60
00aa9d04	ldrb w9,[x19, #0x48]
00aa9d08	ldrb w11,[x19, #0x49]
00aa9d0c	ldrb w13,[x19, #0x4a]
00aa9d10	ldrb w15,[x19, #0x4b]
00aa9d14	lsr x8,x20,#0x35
00aa9d18	lsr x10,x20,#0x2d
00aa9d1c	lsr x12,x20,#0x25
00aa9d20	lsr x14,x20,#0x1d
00aa9d24	eor w8,w9,w8
00aa9d28	ldrb w9,[x19, #0x4c]
00aa9d2c	eor w10,w11,w10
00aa9d30	ldrb w11,[x19, #0x4d]
00aa9d34	eor w12,w13,w12
00aa9d38	ldrb w13,[x19, #0x4e]
00aa9d3c	eor w14,w15,w14
00aa9d40	ldrb w15,[x19, #0x4f]
00aa9d44	eor w9,w9,w20, LSR #0x15
00aa9d48	eor w11,w11,w20, LSR #0xd
00aa9d4c	eor w13,w13,w20, LSR #0x5
00aa9d50	eor w15,w15,w20, LSL #0x3
00aa9d54	mov x0,x21
00aa9d58	mov x1,x22
00aa9d5c	strb w8,[x19, #0x48]
00aa9d60	strb w10,[x19, #0x49]
00aa9d64	strb w12,[x19, #0x4a]
00aa9d68	strb w14,[x19, #0x4b]
00aa9d6c	strb w9,[x19, #0x4c]
00aa9d70	strb w11,[x19, #0x4d]
00aa9d74	strb w13,[x19, #0x4e]
00aa9d78	strb w15,[x19, #0x4f]
00aa9d7c	bl 0x00aa9de0
00aa9d80	ldr w8,[x19, #0x4c]
00aa9d84	ldr q0,[x19, #0x40]
00aa9d88	rev w8,w8
00aa9d8c	add w20,w8,#0x1
00aa9d90	str q0,[x19]
00aa9d94	ldp x8,x2,[x19, #0x178]
00aa9d98	add x1,x19,#0x20
00aa9d9c	mov x0,x19
00aa9da0	stp xzr,xzr,[x19, #0x40]
00aa9da4	blr x8
00aa9da8	lsr w8,w20,#0x18
00aa9dac	lsr w9,w20,#0x10
00aa9db0	lsr w10,w20,#0x8
00aa9db4	strb w8,[x19, #0xc]
00aa9db8	strb w9,[x19, #0xd]
00aa9dbc	strb w10,[x19, #0xe]
00aa9dc0	strb w20,[x19, #0xf]
00aa9dc4	ldp x29,x30,[sp, #0x50]
00aa9dc8	ldp x20,x19,[sp, #0x40]
00aa9dcc	ldp x22,x21,[sp, #0x30]
00aa9dd0	ldp x24,x23,[sp, #0x20]
00aa9dd4	ldp x26,x25,[sp, #0x10]
00aa9dd8	ldr x27,[sp], #0x60
00aa9ddc	ret
