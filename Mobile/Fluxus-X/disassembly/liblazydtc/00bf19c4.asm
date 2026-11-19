; std::__ndk1::__money_put<char>::__format @ 00bf19c4
00bf19c4	paciasp
00bf19c8	sub sp,sp,#0xc0
00bf19cc	stp x29,x30,[sp, #0x60]
00bf19d0	stp x28,x27,[sp, #0x70]
00bf19d4	stp x26,x25,[sp, #0x80]
00bf19d8	stp x24,x23,[sp, #0x90]
00bf19dc	stp x22,x21,[sp, #0xa0]
00bf19e0	stp x20,x19,[sp, #0xb0]
00bf19e4	add x29,sp,#0x60
00bf19e8	ldr w8,[x29, #0x90]
00bf19ec	ldr x19,[x29, #0x78]
00bf19f0	mov x24,x5
00bf19f4	ldrb w9,[x29, #0x68]
00bf19f8	ldrb w22,[x29, #0x70]
00bf19fc	mov x25,x4
00bf1a00	stur w8,[x29, #-0x14]
00bf1a04	ldp x8,x27,[x29, #0x80]
00bf1a08	ldr x28,[x29, #0x60]
00bf1a0c	mov x21,x2
00bf1a10	mov x23,x1
00bf1a14	mov x20,xzr
00bf1a18	str w9,[sp, #0x14]
00bf1a1c	and x9,x7,#0x1
00bf1a20	stur x8,[x29, #-0x28]
00bf1a24	add x8,x8,#0x1
00bf1a28	add x16,x19,#0x1
00bf1a2c	str x8,[sp, #0x8]
00bf1a30	add x8,x27,#0x1
00bf1a34	stur x6,[x29, #-0x8]
00bf1a38	stur w3,[x29, #-0x2c]
00bf1a3c	str x0,[sp]
00bf1a40	str x0,[x2]
00bf1a44	str x9,[sp, #0x28]
00bf1a48	stp x8,x1,[sp, #0x18]
00bf1a4c	stur x27,[x29, #-0x20]
00bf1a50	stur x16,[x29, #-0x10]
00bf1a54	b 0x00bf1a6c
00bf1a58	ldr x8,[x21]
00bf1a5c	str x8,[x23]
00bf1a60	add x20,x20,#0x1
00bf1a64	cmp x20,#0x4
00bf1a68	b.eq 0x00bf1ed8
00bf1a6c	ldrb w8,[x28, x20]
00bf1a70	cmp w8,#0x1
00bf1a74	b.le 0x00bf1b3c
00bf1a78	cmp w8,#0x2
00bf1a7c	b.eq 0x00bf1b7c
00bf1a80	cmp w8,#0x3
00bf1a84	b.eq 0x00bf1bd8
00bf1a88	cmp w8,#0x4
00bf1a8c	b.ne 0x00bf1a60
00bf1a90	ldr x8,[sp, #0x28]
00bf1a94	add x25,x25,x8
00bf1a98	cmp x25,x24
00bf1a9c	mov x27,x25
00bf1aa0	b.cs 0x00bf1ad0
00bf1aa4	ldur x8,[x29, #-0x8]
00bf1aa8	mov x27,x25
00bf1aac	ldr x8,[x8, #0x10]
00bf1ab0	ldrsb x9,[x27]
00bf1ab4	tbnz x9,#0x3f,0x00bf1ad0
00bf1ab8	ldr x9,[x8, x9, LSL #0x3]
00bf1abc	tbz w9,#0x6,0x00bf1ad0
00bf1ac0	add x27,x27,#0x1
00bf1ac4	cmp x27,x24
00bf1ac8	b.cc 0x00bf1ab0
00bf1acc	mov x27,x24
00bf1ad0	ldur w8,[x29, #-0x14]
00bf1ad4	ldr x26,[x21]
00bf1ad8	cmp w8,#0x1
00bf1adc	b.lt 0x00bf1c70
00bf1ae0	cmp x27,x25
00bf1ae4	b.ls 0x00bf1c14
00bf1ae8	ldur w23,[x29, #-0x14]
00bf1aec	sub x8,x27,#0x1
00bf1af0	ldr x10,[x21]
00bf1af4	cmp x8,x25
00bf1af8	mov w9,w23
00bf1afc	ldrb w11,[x8], #-0x1
00bf1b00	sub w23,w23,#0x1
00bf1b04	add x12,x10,#0x1
00bf1b08	str x12,[x21]
00bf1b0c	strb w11,[x10]
00bf1b10	b.ls 0x00bf1b1c
00bf1b14	cmp w9,#0x1
00bf1b18	b.ne 0x00bf1af0
00bf1b1c	cmp w9,#0x1
00bf1b20	add x27,x8,#0x1
00bf1b24	b.ne 0x00bf1c18
00bf1b28	mov w23,wzr
00bf1b2c	mov w0,wzr
00bf1b30	cmp w23,#0x1
00bf1b34	b.ge 0x00bf1c38
00bf1b38	b 0x00bf1c58
00bf1b3c	cbz w8,0x00bf1a58
00bf1b40	cmp w8,#0x1
00bf1b44	b.ne 0x00bf1a60
00bf1b48	ldur x0,[x29, #-0x8]
00bf1b4c	ldr x8,[x21]
00bf1b50	mov w1,#0x20
00bf1b54	ldr x9,[x0]
00bf1b58	str x8,[x23]
00bf1b5c	ldr x8,[x9, #0x38]
00bf1b60	blr x8
00bf1b64	ldr x8,[x21]
00bf1b68	ldur x16,[x29, #-0x10]
00bf1b6c	add x9,x8,#0x1
00bf1b70	str x9,[x21]
00bf1b74	strb w0,[x8]
00bf1b78	b 0x00bf1a60
00bf1b7c	ldur x9,[x29, #-0x28]
00bf1b80	ldrb w8,[x9]
00bf1b84	ldr x9,[x9, #0x8]
00bf1b88	lsr x10,x8,#0x1
00bf1b8c	tst w8,#0x1
00bf1b90	csel x26,x10,x9,eq
00bf1b94	ldur w9,[x29, #-0x2c]
00bf1b98	tbz w9,#0x9,0x00bf1a60
00bf1b9c	cbz x26,0x00bf1a60
00bf1ba0	ldur x9,[x29, #-0x28]
00bf1ba4	ldr x27,[x21]
00bf1ba8	tst w8,#0x1
00bf1bac	ldr x8,[sp, #0x8]
00bf1bb0	mov x2,x26
00bf1bb4	ldr x9,[x9, #0x10]
00bf1bb8	mov x0,x27
00bf1bbc	csel x1,x8,x9,eq
00bf1bc0	bl 0x00c2ff60
00bf1bc4	ldur x16,[x29, #-0x10]
00bf1bc8	add x8,x27,x26
00bf1bcc	ldur x27,[x29, #-0x20]
00bf1bd0	str x8,[x21]
00bf1bd4	b 0x00bf1a60
00bf1bd8	ldrb w8,[x27]
00bf1bdc	ldr x9,[x27, #0x8]
00bf1be0	lsr x10,x8,#0x1
00bf1be4	tst w8,#0x1
00bf1be8	csel x8,x10,x9,eq
00bf1bec	cbz x8,0x00bf1a60
00bf1bf0	ldr x8,[x27, #0x10]
00bf1bf4	ldr x10,[sp, #0x18]
00bf1bf8	ldr x9,[x21]
00bf1bfc	csel x8,x10,x8,eq
00bf1c00	add x10,x9,#0x1
00bf1c04	ldrb w8,[x8]
00bf1c08	str x10,[x21]
00bf1c0c	strb w8,[x9]
00bf1c10	b 0x00bf1a60
00bf1c14	ldur w23,[x29, #-0x14]
00bf1c18	ldur x0,[x29, #-0x8]
00bf1c1c	mov w1,#0x30
00bf1c20	ldr x8,[x0]
00bf1c24	ldr x8,[x8, #0x38]
00bf1c28	blr x8
00bf1c2c	ldur x16,[x29, #-0x10]
00bf1c30	cmp w23,#0x1
00bf1c34	b.lt 0x00bf1c58
00bf1c38	add w8,w23,#0x1
00bf1c3c	ldr x9,[x21]
00bf1c40	sub w8,w8,#0x1
00bf1c44	cmp w8,#0x1
00bf1c48	add x10,x9,#0x1
00bf1c4c	str x10,[x21]
00bf1c50	strb w0,[x9]
00bf1c54	b.hi 0x00bf1c3c
00bf1c58	ldr x8,[x21]
00bf1c5c	ldr x23,[sp, #0x20]
00bf1c60	add x9,x8,#0x1
00bf1c64	str x9,[x21]
00bf1c68	ldr w9,[sp, #0x14]
00bf1c6c	strb w9,[x8]
00bf1c70	cmp x27,x25
00bf1c74	b.eq 0x00bf1ca4
00bf1c78	ldrb w8,[x19]
00bf1c7c	ldr x9,[x19, #0x8]
00bf1c80	lsr x10,x8,#0x1
00bf1c84	tst w8,#0x1
00bf1c88	csel x9,x10,x9,eq
00bf1c8c	cbz x9,0x00bf1d6c
00bf1c90	ldr x9,[x19, #0x10]
00bf1c94	tst w8,#0x1
00bf1c98	csel x8,x16,x9,eq
00bf1c9c	ldrb w8,[x8]
00bf1ca0	b 0x00bf1d70
00bf1ca4	ldur x0,[x29, #-0x8]
00bf1ca8	mov w1,#0x30
00bf1cac	ldr x8,[x0]
00bf1cb0	ldr x8,[x8, #0x38]
00bf1cb4	blr x8
00bf1cb8	ldr x8,[x21]
00bf1cbc	ldur x16,[x29, #-0x10]
00bf1cc0	add x9,x8,#0x1
00bf1cc4	str x9,[x21]
00bf1cc8	strb w0,[x8]
00bf1ccc	ldr x10,[x21]
00bf1cd0	cmp x26,x10
00bf1cd4	b.eq 0x00bf1d64
00bf1cd8	sub x8,x10,#0x1
00bf1cdc	ldur x27,[x29, #-0x20]
00bf1ce0	cmp x26,x8
00bf1ce4	b.cs 0x00bf1a60
00bf1ce8	sub x12,x10,#0x2
00bf1cec	add x11,x26,#0x1
00bf1cf0	mvn x13,x26
00bf1cf4	cmp x12,x11
00bf1cf8	mov w15,#0x1
00bf1cfc	csinc x9,x12,x26,hi
00bf1d00	adds x9,x9,x13
00bf1d04	cset w14,ne
00bf1d08	cinc x15,x15,ne
00bf1d0c	sub x9,x9,x14
00bf1d10	add x9,x15,x9, LSR #0x1
00bf1d14	cmp x9,#0x8
00bf1d18	b.cc 0x00bf1eb4
00bf1d1c	cmp x12,x11
00bf1d20	csinc x12,x12,x26,hi
00bf1d24	adds x12,x12,x13
00bf1d28	cset w13,ne
00bf1d2c	sub x12,x12,x13
00bf1d30	lsr x12,x12,#0x1
00bf1d34	cinc x12,x12,ne
00bf1d38	cmp x26,x10
00bf1d3c	b.cs 0x00bf1d54
00bf1d40	mvn x13,x12
00bf1d44	add x11,x11,x12
00bf1d48	add x12,x13,x10
00bf1d4c	cmp x12,x11
00bf1d50	b.cc 0x00bf1eb4
00bf1d54	cmp x9,#0x20
00bf1d58	b.cs 0x00bf1e00
00bf1d5c	mov x11,xzr
00bf1d60	b 0x00bf1e60
00bf1d64	ldur x27,[x29, #-0x20]
00bf1d68	b 0x00bf1a60
00bf1d6c	mov w8,#0xffffffff
00bf1d70	mov w9,wzr
00bf1d74	mov w10,wzr
00bf1d78	b 0x00bf1da4
00bf1d7c	ldrb w8,[x8, x9]
00bf1d80	mov w10,wzr
00bf1d84	ldr x11,[x21]
00bf1d88	ldrb w12,[x27, #-0x1]!
00bf1d8c	cmp x27,x25
00bf1d90	add w10,w10,#0x1
00bf1d94	add x13,x11,#0x1
00bf1d98	str x13,[x21]
00bf1d9c	strb w12,[x11]
00bf1da0	b.eq 0x00bf1ccc
00bf1da4	cmp w10,w8
00bf1da8	b.ne 0x00bf1d84
00bf1dac	ldr x10,[x21]
00bf1db0	add w9,w9,#0x1
00bf1db4	add x11,x10,#0x1
00bf1db8	str x11,[x21]
00bf1dbc	strb w22,[x10]
00bf1dc0	ldrb w10,[x19]
00bf1dc4	ldr x11,[x19, #0x8]
00bf1dc8	lsr x12,x10,#0x1
00bf1dcc	tst w10,#0x1
00bf1dd0	csel x11,x12,x11,eq
00bf1dd4	cmp x11,x9
00bf1dd8	b.ls 0x00bf1d80
00bf1ddc	ldr x8,[x19, #0x10]
00bf1de0	tst w10,#0x1
00bf1de4	csel x8,x16,x8,eq
00bf1de8	ldrb w10,[x8, x9]
00bf1dec	cmp w10,#0xff
00bf1df0	b.ne 0x00bf1d7c
00bf1df4	mov w10,wzr
00bf1df8	mov w8,#0xffffffff
00bf1dfc	b 0x00bf1d84
00bf1e00	and x11,x9,#-0x20
00bf1e04	add x12,x26,#0x10
00bf1e08	sub x13,x10,#0x10
00bf1e0c	mov x14,x11
00bf1e10	ldp q1,q0,[x13, #-0x10]
00bf1e14	sub x14,x14,#0x20
00bf1e18	ldp q2,q3,[x12, #-0x10]
00bf1e1c	rev64 v0.16B,v0.16B
00bf1e20	rev64 v1.16B,v1.16B
00bf1e24	rev64 v2.16B,v2.16B
00bf1e28	rev64 v3.16B,v3.16B
00bf1e2c	ext v0.16B,v0.16B,v0.16B,0x8
00bf1e30	ext v1.16B,v1.16B,v1.16B,0x8
00bf1e34	ext v2.16B,v2.16B,v2.16B,0x8
00bf1e38	ext v3.16B,v3.16B,v3.16B,0x8
00bf1e3c	stp q0,q1,[x12, #-0x10]
00bf1e40	add x12,x12,#0x20
00bf1e44	stp q3,q2,[x13, #-0x10]
00bf1e48	sub x13,x13,#0x20
00bf1e4c	cbnz x14,0x00bf1e10
00bf1e50	cmp x9,x11
00bf1e54	b.eq 0x00bf1a60
00bf1e58	tst x9,#0x18
00bf1e5c	b.eq 0x00bf1eac
00bf1e60	and x12,x9,#-0x8
00bf1e64	sub x14,x10,x11
00bf1e68	add x13,x26,x11
00bf1e6c	sub x8,x8,x12
00bf1e70	add x10,x26,x12
00bf1e74	sub x11,x11,x12
00bf1e78	sub x14,x14,#0x8
00bf1e7c	ldr d0,[x14]
00bf1e80	ldr d1,[x13]
00bf1e84	adds x11,x11,#0x8
00bf1e88	rev64 v0.8B,v0.8B
00bf1e8c	rev64 v1.8B,v1.8B
00bf1e90	str d0,[x13], #0x8
00bf1e94	str d1,[x14], #-0x8
00bf1e98	b.ne 0x00bf1e7c
00bf1e9c	cmp x9,x12
00bf1ea0	mov x26,x10
00bf1ea4	b.eq 0x00bf1a60
00bf1ea8	b 0x00bf1eb4
00bf1eac	sub x8,x8,x11
00bf1eb0	add x26,x26,x11
00bf1eb4	add x9,x26,#0x1
00bf1eb8	ldrb w10,[x8]
00bf1ebc	ldurb w11,[x9, #-0x1]
00bf1ec0	sturb w10,[x9, #-0x1]
00bf1ec4	strb w11,[x8], #-0x1
00bf1ec8	cmp x9,x8
00bf1ecc	add x9,x9,#0x1
00bf1ed0	b.cc 0x00bf1eb8
00bf1ed4	b 0x00bf1a60
00bf1ed8	ldrb w9,[x27]
00bf1edc	ldr x8,[x27, #0x8]
00bf1ee0	lsr x10,x9,#0x1
00bf1ee4	tst w9,#0x1
00bf1ee8	csel x8,x10,x8,eq
00bf1eec	cmp x8,#0x1
00bf1ef0	b.ls 0x00bf1f34
00bf1ef4	ldr x10,[x27, #0x10]
00bf1ef8	tst w9,#0x1
00bf1efc	ldr x9,[sp, #0x18]
00bf1f00	ldr x23,[x21]
00bf1f04	csel x9,x9,x10,eq
00bf1f08	cmp x8,#0x1
00bf1f0c	add x1,x9,#0x1
00bf1f10	add x9,x9,x8
00bf1f14	sub x24,x9,x1
00bf1f18	b.eq 0x00bf1f28
00bf1f1c	mov x0,x23
00bf1f20	mov x2,x24
00bf1f24	bl 0x00c2ff60
00bf1f28	add x8,x23,x24
00bf1f2c	ldr x23,[sp, #0x20]
00bf1f30	str x8,[x21]
00bf1f34	ldur w9,[x29, #-0x2c]
00bf1f38	mov w8,#0xb0
00bf1f3c	and w8,w9,w8
00bf1f40	cmp w8,#0x10
00bf1f44	b.eq 0x00bf1f5c
00bf1f48	cmp w8,#0x20
00bf1f4c	ldr x8,[sp]
00bf1f50	b.ne 0x00bf1f58
00bf1f54	ldr x8,[x21]
00bf1f58	str x8,[x23]
00bf1f5c	ldp x20,x19,[sp, #0xb0]
00bf1f60	ldp x22,x21,[sp, #0xa0]
00bf1f64	ldp x24,x23,[sp, #0x90]
00bf1f68	ldp x26,x25,[sp, #0x80]
00bf1f6c	ldp x28,x27,[sp, #0x70]
00bf1f70	ldp x29,x30,[sp, #0x60]
00bf1f74	add sp,sp,#0xc0
00bf1f78	autiasp
00bf1f7c	ret
