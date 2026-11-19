; FUN_00c09a68 @ 00c09a68
00c09a68	paciasp
00c09a6c	stp x29,x30,[sp, #-0x50]!
00c09a70	str x25,[sp, #0x10]
00c09a74	stp x24,x23,[sp, #0x20]
00c09a78	stp x22,x21,[sp, #0x30]
00c09a7c	stp x20,x19,[sp, #0x40]
00c09a80	mov x29,sp
00c09a84	tbz w2,#0x0,0x00c09aa8
00c09a88	ldrb w8,[x1]
00c09a8c	ldr x9,[x1, #0x8]
00c09a90	lsr x10,x8,#0x1
00c09a94	tst w8,#0x1
00c09a98	csel x8,x10,x9,eq
00c09a9c	cmp x8,#0x4
00c09aa0	cset w20,eq
00c09aa4	b 0x00c09aac
00c09aa8	mov w20,wzr
00c09aac	and w8,w3,#0xff
00c09ab0	cmp w8,#0x1
00c09ab4	b.eq 0x00c09b40
00c09ab8	cbnz w8,0x00c09e34
00c09abc	cbz w20,0x00c09d10
00c09ac0	ldrb w8,[x1]
00c09ac4	ldp x11,x9,[x1, #0x8]
00c09ac8	lsr x10,x8,#0x1
00c09acc	tst w8,#0x1
00c09ad0	csel x8,x10,x11,eq
00c09ad4	add x10,x1,#0x4
00c09ad8	lsl x8,x8,#0x2
00c09adc	csel x19,x10,x9,eq
00c09ae0	cmp x8,#0xc
00c09ae4	b.eq 0x00c09d10
00c09ae8	add x8,x19,x8
00c09aec	add x9,x19,#0x10
00c09af0	cmp x9,x8
00c09af4	b.ne 0x00c09c60
00c09af8	mov x9,x8
00c09afc	ldr w21,[x9, #-0x4]!
00c09b00	subs x2,x9,x19
00c09b04	b.eq 0x00c09b38
00c09b08	sub x8,x8,x2
00c09b0c	mov x22,x0
00c09b10	mov x23,x1
00c09b14	mov x0,x8
00c09b18	mov x1,x19
00c09b1c	mov w24,w4
00c09b20	mov w25,w5
00c09b24	bl 0x00c2ff60
00c09b28	mov w5,w25
00c09b2c	mov w4,w24
00c09b30	mov x0,x22
00c09b34	mov x1,x23
00c09b38	str w21,[x19]
00c09b3c	b 0x00c09d10
00c09b40	and w8,w5,#0xff
00c09b44	cmp w8,#0x1
00c09b48	b.le 0x00c09b98
00c09b4c	cmp w8,#0x2
00c09b50	b.eq 0x00c09bd0
00c09b54	cmp w8,#0x3
00c09b58	b.eq 0x00c09c04
00c09b5c	cmp w8,#0x4
00c09b60	b.ne 0x00c09e34
00c09b64	mov w9,#0x2
00c09b68	and w8,w4,#0xff
00c09b6c	strb w9,[x0]
00c09b70	mov w9,#0x4
00c09b74	cmp w8,#0x2
00c09b78	strb w9,[x0, #0x3]
00c09b7c	b.eq 0x00c09f28
00c09b80	cmp w8,#0x1
00c09b84	b.eq 0x00c09ea0
00c09b88	cbnz w8,0x00c09e34
00c09b8c	mov w8,#0x3
00c09b90	sturh w8,[x0, #0x1]
00c09b94	b 0x00c09e40
00c09b98	cbz w8,0x00c09c38
00c09b9c	cmp w8,#0x1
00c09ba0	b.ne 0x00c09e34
00c09ba4	mov w9,#0x3
00c09ba8	and w8,w4,#0xff
00c09bac	strb w9,[x0]
00c09bb0	mov w9,#0x4
00c09bb4	cmp w8,#0x2
00c09bb8	strb w9,[x0, #0x3]
00c09bbc	b.eq 0x00c09ca4
00c09bc0	cmp w8,#0x1
00c09bc4	b.ne 0x00c09c28
00c09bc8	mov w8,#0x2
00c09bcc	b 0x00c09f2c
00c09bd0	mov w9,#0x2
00c09bd4	and w8,w4,#0xff
00c09bd8	strb w9,[x0]
00c09bdc	mov w9,#0x3
00c09be0	cmp w8,#0x2
00c09be4	strb w9,[x0, #0x3]
00c09be8	b.eq 0x00c09ea8
00c09bec	cmp w8,#0x1
00c09bf0	b.eq 0x00c09e90
00c09bf4	cbnz w8,0x00c09e34
00c09bf8	mov w8,#0x400
00c09bfc	sturh w8,[x0, #0x1]
00c09c00	b 0x00c09e40
00c09c04	mov w9,#0x3
00c09c08	and w8,w4,#0xff
00c09c0c	strb w9,[x0]
00c09c10	mov w9,#0x4
00c09c14	cmp w8,#0x2
00c09c18	strb w9,[x0, #0x3]
00c09c1c	b.eq 0x00c09ca4
00c09c20	cmp w8,#0x1
00c09c24	b.eq 0x00c09bc8
00c09c28	cbnz w8,0x00c09e34
00c09c2c	mov w8,#0x2
00c09c30	sturh w8,[x0, #0x1]
00c09c34	b 0x00c09e40
00c09c38	adrp x8,0x29a000
00c09c3c	ldr d0,[x8, #0x798]
00c09c40	ands w8,w4,#0xff
00c09c44	str s0,[x0]
00c09c48	b.eq 0x00c09e40
00c09c4c	cmp w8,#0x2
00c09c50	b.eq 0x00c09e40
00c09c54	cmp w8,#0x1
00c09c58	b.eq 0x00c09e2c
00c09c5c	b 0x00c09e34
00c09c60	add x9,x19,#0xc
00c09c64	sub x10,x8,x9
00c09c68	cmp x10,#0xc
00c09c6c	b.ne 0x00c09cac
00c09c70	add x10,x19,#0x4
00c09c74	add x11,x9,#0x4
00c09c78	ldur w12,[x11, #-0x4]
00c09c7c	ldur w13,[x10, #-0x4]
00c09c80	cmp x10,x9
00c09c84	stur w12,[x10, #-0x4]
00c09c88	stur w13,[x11, #-0x4]
00c09c8c	b.eq 0x00c09d10
00c09c90	cmp x11,x8
00c09c94	add x11,x11,#0x4
00c09c98	add x10,x10,#0x4
00c09c9c	b.ne 0x00c09c78
00c09ca0	b 0x00c09d10
00c09ca4	mov w8,#0x201
00c09ca8	b 0x00c09eac
00c09cac	asr x11,x10,#0x2
00c09cb0	mov w10,#0x3
00c09cb4	mov x12,x10
00c09cb8	mov x10,x11
00c09cbc	sdiv x11,x12,x11
00c09cc0	msub x11,x11,x10,x12
00c09cc4	cbnz x11,0x00c09cb4
00c09cc8	add x10,x19,x10, LSL #0x2
00c09ccc	ldr w11,[x10, #-0x4]!
00c09cd0	add x14,x10,#0xc
00c09cd4	mov x13,x10
00c09cd8	mov x12,x14
00c09cdc	sub x14,x8,x14
00c09ce0	mov x15,x12
00c09ce4	sub x16,x9,x14
00c09ce8	cmp x14,#0xc
00c09cec	ldr w17,[x15], #0xc
00c09cf0	csel x14,x15,x16,gt
00c09cf4	cmp x14,x10
00c09cf8	str w17,[x13]
00c09cfc	mov x13,x12
00c09d00	b.ne 0x00c09cd8
00c09d04	cmp x10,x19
00c09d08	str w11,[x12]
00c09d0c	b.ne 0x00c09ccc
00c09d10	and w8,w5,#0xff
00c09d14	cmp w8,#0x1
00c09d18	b.le 0x00c09d60
00c09d1c	cmp w8,#0x2
00c09d20	b.eq 0x00c09da0
00c09d24	cmp w8,#0x3
00c09d28	b.eq 0x00c09dd4
00c09d2c	cmp w8,#0x4
00c09d30	b.ne 0x00c09e34
00c09d34	mov w9,#0x4
00c09d38	and w8,w4,#0xff
00c09d3c	strb w9,[x0]
00c09d40	mov w9,#0x3
00c09d44	cmp w8,#0x2
00c09d48	strb w9,[x0, #0x3]
00c09d4c	b.eq 0x00c09e5c
00c09d50	cmp w8,#0x1
00c09d54	b.ne 0x00c09dc4
00c09d58	mov w8,#0x200
00c09d5c	b 0x00c09ee4
00c09d60	cbz w8,0x00c09e08
00c09d64	cmp w8,#0x1
00c09d68	b.ne 0x00c09e34
00c09d6c	mov w9,#0x3
00c09d70	and w8,w4,#0xff
00c09d74	strb w9,[x0]
00c09d78	mov w9,#0x2
00c09d7c	cmp w8,#0x2
00c09d80	strb w9,[x0, #0x3]
00c09d84	b.eq 0x00c09f58
00c09d88	cmp w8,#0x1
00c09d8c	b.eq 0x00c09ee0
00c09d90	cbnz w8,0x00c09e34
00c09d94	mov w8,#0x4
00c09d98	sturh w8,[x0, #0x1]
00c09d9c	b 0x00c09e40
00c09da0	mov w9,#0x4
00c09da4	and w8,w4,#0xff
00c09da8	strb w9,[x0]
00c09dac	mov w9,#0x3
00c09db0	cmp w8,#0x2
00c09db4	strb w9,[x0, #0x3]
00c09db8	b.eq 0x00c09e5c
00c09dbc	cmp w8,#0x1
00c09dc0	b.eq 0x00c09e64
00c09dc4	cbnz w8,0x00c09e34
00c09dc8	mov w8,#0x200
00c09dcc	sturh w8,[x0, #0x1]
00c09dd0	b 0x00c09e40
00c09dd4	mov w9,#0x4
00c09dd8	and w8,w4,#0xff
00c09ddc	strb w9,[x0]
00c09de0	mov w9,#0x2
00c09de4	cmp w8,#0x2
00c09de8	strb w9,[x0, #0x3]
00c09dec	b.eq 0x00c09e98
00c09df0	cmp w8,#0x1
00c09df4	b.eq 0x00c09e88
00c09df8	cbnz w8,0x00c09e34
00c09dfc	mov w8,#0x300
00c09e00	sturh w8,[x0, #0x1]
00c09e04	b 0x00c09e40
00c09e08	adrp x8,0x29b000
00c09e0c	ldr d0,[x8, #0xb98]
00c09e10	ands w8,w4,#0xff
00c09e14	str s0,[x0]
00c09e18	b.eq 0x00c09e40
00c09e1c	cmp w8,#0x2
00c09e20	b.eq 0x00c09e40
00c09e24	cmp w8,#0x1
00c09e28	b.ne 0x00c09e34
00c09e2c	tbz w20,#0x0,0x00c09eec
00c09e30	b 0x00c09e40
00c09e34	adrp x8,0x29a000
00c09e38	ldr d0,[x8, #0xb80]
00c09e3c	str s0,[x0]
00c09e40	ldp x20,x19,[sp, #0x40]
00c09e44	ldr x25,[sp, #0x10]
00c09e48	ldp x22,x21,[sp, #0x30]
00c09e4c	ldp x24,x23,[sp, #0x20]
00c09e50	ldp x29,x30,[sp], #0x50
00c09e54	autiasp
00c09e58	ret
00c09e5c	mov w8,#0x102
00c09e60	b 0x00c09f5c
00c09e64	tbnz w20,#0x0,0x00c09dc8
00c09e68	mov x19,x0
00c09e6c	mov x0,x1
00c09e70	mov x1,xzr
00c09e74	mov w2,#0x1
00c09e78	mov w3,#0x20
00c09e7c	bl 0x00c43d60
00c09e80	mov x0,x19
00c09e84	b 0x00c09dc8
00c09e88	mov w8,#0x301
00c09e8c	b 0x00c09f5c
00c09e90	mov w8,#0x400
00c09e94	b 0x00c09f2c
00c09e98	mov w8,#0x3
00c09e9c	b 0x00c09ee4
00c09ea0	mov w8,#0x103
00c09ea4	b 0x00c09eac
00c09ea8	mov w8,#0x104
00c09eac	sturh w8,[x0, #0x1]
00c09eb0	cbz w20,0x00c09e40
00c09eb4	ldrb w9,[x1]
00c09eb8	ldr x8,[x1, #0x8]
00c09ebc	lsr x10,x9,#0x1
00c09ec0	tst w9,#0x1
00c09ec4	csel x8,x10,x8,eq
00c09ec8	sub x8,x8,#0x1
00c09ecc	tbnz w9,#0x0,0x00c09f18
00c09ed0	lsl w9,w8,#0x1
00c09ed4	strb w9,[x1], #0x4
00c09ed8	mov x9,x1
00c09edc	b 0x00c09f20
00c09ee0	mov w8,#0x4
00c09ee4	sturh w8,[x0, #0x1]
00c09ee8	tbnz w20,#0x0,0x00c09e40
00c09eec	mov x0,x1
00c09ef0	mov x1,xzr
00c09ef4	mov w2,#0x1
00c09ef8	mov w3,#0x20
00c09efc	ldp x20,x19,[sp, #0x40]
00c09f00	ldr x25,[sp, #0x10]
00c09f04	ldp x22,x21,[sp, #0x30]
00c09f08	ldp x24,x23,[sp, #0x20]
00c09f0c	ldp x29,x30,[sp], #0x50
00c09f10	autiasp
00c09f14	b 0x00c43d60
00c09f18	ldr x9,[x1, #0x10]
00c09f1c	str x8,[x1, #0x8]
00c09f20	str wzr,[x9, x8, LSL #0x2]
00c09f24	b 0x00c09e40
00c09f28	mov w8,#0x300
00c09f2c	sturh w8,[x0, #0x1]
00c09f30	tbnz w20,#0x0,0x00c09e40
00c09f34	mov x0,x1
00c09f38	mov w1,#0x20
00c09f3c	ldp x20,x19,[sp, #0x40]
00c09f40	ldr x25,[sp, #0x10]
00c09f44	ldp x22,x21,[sp, #0x30]
00c09f48	ldp x24,x23,[sp, #0x20]
00c09f4c	ldp x29,x30,[sp], #0x50
00c09f50	autiasp
00c09f54	b 0x00c43d90
00c09f58	mov w8,#0x401
00c09f5c	sturh w8,[x0, #0x1]
00c09f60	cbz w20,0x00c09e40
00c09f64	ldrb w8,[x1]
00c09f68	ldr x9,[x1, #0x10]
00c09f6c	add x10,x1,#0x4
00c09f70	mov x0,x1
00c09f74	tst w8,#0x1
00c09f78	csel x8,x10,x9,eq
00c09f7c	mov x1,x8
00c09f80	ldp x20,x19,[sp, #0x40]
00c09f84	ldr x25,[sp, #0x10]
00c09f88	ldp x22,x21,[sp, #0x30]
00c09f8c	ldp x24,x23,[sp, #0x20]
00c09f90	ldp x29,x30,[sp], #0x50
00c09f94	autiasp
00c09f98	b 0x00c0be60
