; whirlpool_block @ 00af0898
00af0898	stp x28,x27,[sp, #-0x60]!
00af089c	stp x26,x25,[sp, #0x10]
00af08a0	stp x24,x23,[sp, #0x20]
00af08a4	stp x22,x21,[sp, #0x30]
00af08a8	stp x20,x19,[sp, #0x40]
00af08ac	stp x29,x30,[sp, #0x50]
00af08b0	sub sp,sp,#0x220
00af08b4	add x9,sp,#0x1e0
00af08b8	add x10,x0,#0x40
00af08bc	add x8,x9,#0x38
00af08c0	stp x8,x10,[sp, #0x18]
00af08c4	add x8,x9,#0x40
00af08c8	cmp x8,x0
00af08cc	cset w8,hi
00af08d0	cmp x10,x9
00af08d4	adrp x11,0x777000
00af08d8	cset w9,hi
00af08dc	mov x13,xzr
00af08e0	add x11,x11,#0x288
00af08e4	and w8,w8,w9
00af08e8	mov x18,x1
00af08ec	str w8,[sp, #0x14]
00af08f0	stp x0,x1,[sp, #0x28]
00af08f4	ldr x8,[sp, #0x30]
00af08f8	ands x10,x18,#0x7
00af08fc	stp x13,x2,[sp, #0x50]
00af0900	str x18,[sp, #0x48]
00af0904	add x9,x8,x13, LSL #0x6
00af0908	str x10,[sp, #0x60]
00af090c	b.eq 0x00af0978
00af0910	ldr q0,[x18, #0x30]
00af0914	str q0,[sp, #0x210]
00af0918	ldr q0,[x18, #0x20]
00af091c	ldr x8,[sp, #0x210]
00af0920	str q0,[sp, #0x200]
00af0924	ldr q0,[x18, #0x10]
00af0928	ldr q3,[sp, #0x200]
00af092c	str q0,[sp, #0x1f0]
00af0930	ldr q0,[x18]
00af0934	str q0,[sp, #0x1e0]
00af0938	ldr q0,[x0]
00af093c	ldp q1,q2,[sp, #0x1e0]
00af0940	eor v1.16B,v1.16B,v0.16B
00af0944	str q1,[sp, #0x1e0]
00af0948	ldr q1,[x0, #0x10]
00af094c	eor v2.16B,v2.16B,v1.16B
00af0950	str q2,[sp, #0x1f0]
00af0954	ldr q2,[x0, #0x20]
00af0958	eor v3.16B,v3.16B,v2.16B
00af095c	str q3,[sp, #0x200]
00af0960	ldr x12,[x0, #0x30]
00af0964	eor x8,x8,x12
00af0968	str x8,[sp, #0x210]
00af096c	ldr x8,[sp, #0x18]
00af0970	mov x10,x12
00af0974	b 0x00af09bc
00af0978	ldr q0,[x0]
00af097c	ldp q1,q2,[x18]
00af0980	eor v1.16B,v1.16B,v0.16B
00af0984	str q1,[sp, #0x1e0]
00af0988	ldr q1,[x0, #0x10]
00af098c	eor v2.16B,v2.16B,v1.16B
00af0990	str q2,[sp, #0x1f0]
00af0994	ldr q2,[x0, #0x20]
00af0998	ldr q3,[x18, #0x20]
00af099c	eor v3.16B,v3.16B,v2.16B
00af09a0	str q3,[sp, #0x200]
00af09a4	ldr x12,[x0, #0x30]
00af09a8	ldr x8,[x18, #0x30]
00af09ac	mov x10,x12
00af09b0	eor x8,x8,x12
00af09b4	str x8,[sp, #0x210]
00af09b8	add x8,x18,#0x38
00af09bc	ldr x23,[x0, #0x38]
00af09c0	ldr x8,[x8]
00af09c4	str x9,[sp, #0x40]
00af09c8	add x9,x9,#0x40
00af09cc	mov x5,xzr
00af09d0	str x9,[sp, #0x38]
00af09d4	fmov x21,d0
00af09d8	mov x24,v0.D[0x1]
00af09dc	fmov x20,d1
00af09e0	mov x7,v1.D[0x1]
00af09e4	fmov x6,d2
00af09e8	mov x9,v2.D[0x1]
00af09ec	eor x8,x8,x23
00af09f0	stp x9,x10,[sp, #0x1d0]
00af09f4	str x8,[sp, #0x218]
00af09f8	ldrb w8,[sp, #0x1e1]
00af09fc	ldrb w9,[sp, #0x1e2]
00af0a00	ldrb w10,[sp, #0x1e3]
00af0a04	mov w14,#0x8
00af0a08	bfm x14,x8,#0x3a,#0x7
00af0a0c	ldrb w8,[sp, #0x1ee]
00af0a10	mov w15,#0x10
00af0a14	orr w4,wzr,#0x18
00af0a18	ldrb w12,[sp, #0x1e4]
00af0a1c	ldrb w13,[sp, #0x1e5]
00af0a20	ldrb w17,[sp, #0x1e7]
00af0a24	ldrb w3,[sp, #0x1ed]
00af0a28	bfm x15,x9,#0x3a,#0x7
00af0a2c	bfm x4,x10,#0x3a,#0x7
00af0a30	ldrb w9,[sp, #0x1ef]
00af0a34	stp x4,x15,[sp, #0x1b8]
00af0a38	orr w15,wzr,#0x30
00af0a3c	ldrb w10,[sp, #0x1f1]
00af0a40	mov w19,#0x20
00af0a44	ldrb w18,[sp, #0x1e9]
00af0a48	bfm x15,x8,#0x3a,#0x7
00af0a4c	ldrb w8,[sp, #0x1f5]
00af0a50	mov w22,#0x28
00af0a54	orr w26,wzr,#0x38
00af0a58	ldrb w0,[sp, #0x1ea]
00af0a5c	str x14,[sp, #0x1c8]
00af0a60	mov w14,#0x28
00af0a64	bfm x19,x12,#0x3a,#0x7
00af0a68	orr w4,wzr,#0x38
00af0a6c	ldrb w12,[sp, #0x1f2]
00af0a70	bfm x22,x13,#0x3a,#0x7
00af0a74	bfm x26,x17,#0x3a,#0x7
00af0a78	mov w17,#0x8
00af0a7c	ldrb w13,[sp, #0x1f3]
00af0a80	bfm x14,x3,#0x3a,#0x7
00af0a84	bfm x4,x9,#0x3a,#0x7
00af0a88	ldrb w9,[sp, #0x1f6]
00af0a8c	mov w27,#0x8
00af0a90	stp x15,x14,[sp, #0x160]
00af0a94	bfm x17,x10,#0x3a,#0x7
00af0a98	mov w15,#0x28
00af0a9c	ldrb w10,[sp, #0x1f7]
00af0aa0	mov w28,#0x10
00af0aa4	bfm x27,x18,#0x3a,#0x7
00af0aa8	mov w18,#0x10
00af0aac	bfm x15,x8,#0x3a,#0x7
00af0ab0	ldrb w8,[sp, #0x1f9]
00af0ab4	bfm x28,x0,#0x3a,#0x7
00af0ab8	orr w0,wzr,#0x18
00af0abc	bfm x18,x12,#0x3a,#0x7
00af0ac0	orr w12,wzr,#0x30
00af0ac4	bfm x0,x13,#0x3a,#0x7
00af0ac8	orr w13,wzr,#0x38
00af0acc	bfm x12,x9,#0x3a,#0x7
00af0ad0	ldrb w9,[sp, #0x1fa]
00af0ad4	bfm x13,x10,#0x3a,#0x7
00af0ad8	mov w10,#0x8
00af0adc	bfm x10,x8,#0x3a,#0x7
00af0ae0	ldrb w8,[sp, #0x1fb]
00af0ae4	stp x10,x13,[sp, #0x120]
00af0ae8	mov w10,#0x10
00af0aec	bfm x10,x9,#0x3a,#0x7
00af0af0	ldrb w9,[sp, #0x1fc]
00af0af4	str x10,[sp, #0x118]
00af0af8	orr w10,wzr,#0x18
00af0afc	bfm x10,x8,#0x3a,#0x7
00af0b00	ldrb w8,[sp, #0x1fd]
00af0b04	str x10,[sp, #0x110]
00af0b08	mov w10,#0x20
00af0b0c	bfm x10,x9,#0x3a,#0x7
00af0b10	ldrb w9,[sp, #0x1fe]
00af0b14	str x10,[sp, #0x108]
00af0b18	mov w10,#0x28
00af0b1c	bfm x10,x8,#0x3a,#0x7
00af0b20	ldrb w8,[sp, #0x1ff]
00af0b24	str x10,[sp, #0x100]
00af0b28	orr w10,wzr,#0x30
00af0b2c	bfm x10,x9,#0x3a,#0x7
00af0b30	ldrb w9,[sp, #0x201]
00af0b34	str x10,[sp, #0xf8]
00af0b38	orr w10,wzr,#0x38
00af0b3c	bfm x10,x8,#0x3a,#0x7
00af0b40	ldrb w8,[sp, #0x202]
00af0b44	str x10,[sp, #0xf0]
00af0b48	mov w10,#0x8
00af0b4c	bfm x10,x9,#0x3a,#0x7
00af0b50	ldrb w9,[sp, #0x203]
00af0b54	str x10,[sp, #0xe8]
00af0b58	mov w10,#0x10
00af0b5c	bfm x10,x8,#0x3a,#0x7
00af0b60	ldrb w8,[sp, #0x204]
00af0b64	str x10,[sp, #0xe0]
00af0b68	orr w10,wzr,#0x18
00af0b6c	bfm x10,x9,#0x3a,#0x7
00af0b70	ldrb w9,[sp, #0x205]
00af0b74	str x10,[sp, #0xd8]
00af0b78	mov w10,#0x20
00af0b7c	bfm x10,x8,#0x3a,#0x7
00af0b80	ldrb w8,[sp, #0x206]
00af0b84	ldrb w16,[sp, #0x1e6]
00af0b88	str x10,[sp, #0xd0]
00af0b8c	mov w10,#0x28
00af0b90	bfm x10,x9,#0x3a,#0x7
00af0b94	ldrb w9,[sp, #0x207]
00af0b98	str x10,[sp, #0xc8]
00af0b9c	orr w10,wzr,#0x30
00af0ba0	orr w25,wzr,#0x30
00af0ba4	bfm x10,x8,#0x3a,#0x7
00af0ba8	ldrb w8,[sp, #0x209]
00af0bac	bfm x25,x16,#0x3a,#0x7
00af0bb0	ldrb w16,[sp, #0x1f4]
00af0bb4	str x10,[sp, #0xc0]
00af0bb8	orr w10,wzr,#0x38
00af0bbc	bfm x10,x9,#0x3a,#0x7
00af0bc0	str x10,[sp, #0xb8]
00af0bc4	mov w10,#0x8
00af0bc8	ldrb w9,[sp, #0x20a]
00af0bcc	mov w14,#0x20
00af0bd0	bfm x10,x8,#0x3a,#0x7
00af0bd4	ldrb w8,[sp, #0x20b]
00af0bd8	bfm x14,x16,#0x3a,#0x7
00af0bdc	ldrb w16,[sp, #0x20c]
00af0be0	str x10,[sp, #0xb0]
00af0be4	mov w10,#0x10
00af0be8	stp x17,x18,[sp, #0x150]
00af0bec	bfm x10,x9,#0x3a,#0x7
00af0bf0	orr w9,wzr,#0x18
00af0bf4	ldrb w17,[sp, #0x20d]
00af0bf8	bfm x9,x8,#0x3a,#0x7
00af0bfc	mov w8,#0x20
00af0c00	bfm x8,x16,#0x3a,#0x7
00af0c04	ldrb w16,[sp, #0x20e]
00af0c08	str x8,[sp, #0x98]
00af0c0c	mov w8,#0x28
00af0c10	bfm x8,x17,#0x3a,#0x7
00af0c14	ldrb w17,[sp, #0x20f]
00af0c18	str x8,[sp, #0x90]
00af0c1c	orr w8,wzr,#0x30
00af0c20	bfm x8,x16,#0x3a,#0x7
00af0c24	ldrb w16,[sp, #0x211]
00af0c28	ldrb w2,[sp, #0x1ec]
00af0c2c	str x8,[sp, #0x88]
00af0c30	orr w8,wzr,#0x38
00af0c34	bfm x8,x17,#0x3a,#0x7
00af0c38	ldrb w17,[sp, #0x212]
00af0c3c	ldrb w1,[sp, #0x1eb]
00af0c40	str x8,[sp, #0x80]
00af0c44	mov w8,#0x8
00af0c48	mov w30,#0x20
00af0c4c	bfm x8,x16,#0x3a,#0x7
00af0c50	ldrb w16,[sp, #0x213]
00af0c54	bfm x30,x2,#0x3a,#0x7
00af0c58	mov w2,#0x10
00af0c5c	orr w29,wzr,#0x18
00af0c60	bfm x2,x17,#0x3a,#0x7
00af0c64	ldrb w17,[sp, #0x214]
00af0c68	bfm x29,x1,#0x3a,#0x7
00af0c6c	orr w1,wzr,#0x18
00af0c70	bfm x1,x16,#0x3a,#0x7
00af0c74	ldrb w16,[sp, #0x215]
00af0c78	str x8,[sp, #0x78]
00af0c7c	mov w8,#0x20
00af0c80	bfm x8,x17,#0x3a,#0x7
00af0c84	str x8,[sp, #0x70]
00af0c88	mov w8,#0x28
00af0c8c	bfm x8,x16,#0x3a,#0x7
00af0c90	ldrb w16,[sp, #0x217]
00af0c94	ldrb w17,[sp, #0x216]
00af0c98	stp x26,x25,[sp, #0x198]
00af0c9c	orr w26,wzr,#0x38
00af0ca0	bfm x26,x16,#0x3a,#0x7
00af0ca4	ldrb w16,[sp, #0x21a]
00af0ca8	orr w25,wzr,#0x30
00af0cac	bfm x25,x17,#0x3a,#0x7
00af0cb0	ldrb w17,[sp, #0x219]
00af0cb4	stp x28,x27,[sp, #0x188]
00af0cb8	mov w28,#0x10
00af0cbc	bfm x28,x16,#0x3a,#0x7
00af0cc0	ldrb w16,[sp, #0x21c]
00af0cc4	mov w27,#0x8
00af0cc8	bfm x27,x17,#0x3a,#0x7
00af0ccc	ldrb w17,[sp, #0x21b]
00af0cd0	stp x14,x0,[sp, #0x140]
00af0cd4	mov w0,#0x20
00af0cd8	ldrb w18,[sp, #0x21d]
00af0cdc	bfm x0,x16,#0x3a,#0x7
00af0ce0	ldrb w16,[sp, #0x21e]
00af0ce4	stp x30,x29,[sp, #0x178]
00af0ce8	orr w29,wzr,#0x18
00af0cec	bfm x29,x17,#0x3a,#0x7
00af0cf0	mov w17,#0x28
00af0cf4	bfm x17,x18,#0x3a,#0x7
00af0cf8	orr w18,wzr,#0x30
00af0cfc	bfm x18,x16,#0x3a,#0x7
00af0d00	ubfiz x16,x21,#0x6,#0x8
00af0d04	stp x22,x19,[sp, #0x1a8]
00af0d08	ldr x19,[x11, x16#0x0]
00af0d0c	lsr x16,x21,#0x2
00af0d10	and x16,x16,#0x3fc0
00af0d14	stp x12,x15,[sp, #0x130]
00af0d18	add x13,x11,x5
00af0d1c	ubfiz x12,x24,#0x6,#0x8
00af0d20	orr x16,x16,#0x8
00af0d24	str x8,[sp, #0x68]
00af0d28	ldr x13,[x13, #0x4000]
00af0d2c	ldr x12,[x11, x12#0x0]
00af0d30	ldrb w15,[sp, #0x21f]
00af0d34	ldr x8,[x11, x16#0x0]
00af0d38	orr w16,wzr,#0x38
00af0d3c	stp x9,x10,[sp, #0xa0]
00af0d40	bfm x16,x15,#0x3a,#0x7
00af0d44	eor x13,x13,x19
00af0d48	eor x8,x12,x8
00af0d4c	lsr x12,x21,#0xa
00af0d50	lsr x15,x21,#0x12
00af0d54	lsr x19,x21,#0x1a
00af0d58	lsr x10,x21,#0x22
00af0d5c	lsr x9,x24,#0x2
00af0d60	lsr x3,x24,#0xa
00af0d64	lsr x30,x24,#0x12
00af0d68	lsr x14,x24,#0x1a
00af0d6c	str x4,[sp, #0x170]
00af0d70	and x12,x12,#0x3fc0
00af0d74	and x15,x15,#0x3fc0
00af0d78	and x19,x19,#0x3fc0
00af0d7c	and x10,x10,#0x3fc0
00af0d80	and x9,x9,#0x3fc0
00af0d84	and x3,x3,#0x3fc0
00af0d88	and x30,x30,#0x3fc0
00af0d8c	and x14,x14,#0x3fc0
00af0d90	mov w4,#0x28
00af0d94	orr x12,x12,#0x10
00af0d98	orr x15,x15,#0x18
00af0d9c	orr x19,x19,#0x20
00af0da0	orr x10,x10,x4
00af0da4	orr x9,x9,#0x8
00af0da8	orr x3,x3,#0x10
00af0dac	orr x30,x30,#0x18
00af0db0	orr x14,x14,#0x20
00af0db4	ldr x12,[x11, x12#0x0]
00af0db8	ldr x15,[x11, x15#0x0]
00af0dbc	ldr x19,[x11, x19#0x0]
00af0dc0	ldr x10,[x11, x10#0x0]
00af0dc4	ldr x9,[x11, x9#0x0]
00af0dc8	ldr x3,[x11, x3#0x0]
00af0dcc	ldr x30,[x11, x30#0x0]
00af0dd0	ldr x14,[x11, x14#0x0]
00af0dd4	eor x9,x9,x12
00af0dd8	eor x12,x3,x15
00af0ddc	eor x15,x30,x19
00af0de0	eor x10,x14,x10
00af0de4	lsr x14,x21,#0x2a
00af0de8	lsr x3,x21,#0x32
00af0dec	lsr x19,x24,#0x22
00af0df0	lsr x21,x24,#0x2a
00af0df4	and x14,x14,#0x3fc0
00af0df8	orr w3,w3,#0x38
00af0dfc	and x19,x19,#0x3fc0
00af0e00	and x21,x21,#0x3fc0
00af0e04	orr x14,x14,#0x30
00af0e08	and x3,x3,#0x3ff8
00af0e0c	orr x19,x19,x4
00af0e10	orr x21,x21,#0x30
00af0e14	ldr x14,[x11, x14#0x0]
00af0e18	ldr x3,[x11, x3#0x0]
00af0e1c	ldr x19,[x11, x19#0x0]
00af0e20	ldr x21,[x11, x21#0x0]
00af0e24	lsr x22,x24,#0x32
00af0e28	orr w22,w22,#0x38
00af0e2c	eor x14,x19,x14
00af0e30	eor x3,x21,x3
00af0e34	lsr x19,x20,#0x2
00af0e38	lsr x21,x20,#0xa
00af0e3c	and x19,x19,#0x3fc0
00af0e40	and x21,x21,#0x3fc0
00af0e44	and x22,x22,#0x3ff8
00af0e48	ubfiz x30,x20,#0x6,#0x8
00af0e4c	orr x19,x19,#0x8
00af0e50	orr x21,x21,#0x10
00af0e54	ldr x22,[x11, x22#0x0]
00af0e58	ldr x30,[x11, x30#0x0]
00af0e5c	ldr x19,[x11, x19#0x0]
00af0e60	ldr x21,[x11, x21#0x0]
00af0e64	eor x13,x13,x22
00af0e68	eor x9,x9,x30
00af0e6c	lsr x22,x20,#0x12
00af0e70	lsr x30,x20,#0x1a
00af0e74	eor x12,x12,x19
00af0e78	eor x15,x15,x21
00af0e7c	lsr x19,x20,#0x22
00af0e80	lsr x21,x20,#0x2a
00af0e84	lsr x20,x20,#0x32
00af0e88	and x19,x19,#0x3fc0
00af0e8c	orr w20,w20,#0x38
00af0e90	orr x19,x19,x4
00af0e94	and x20,x20,#0x3ff8
00af0e98	and x22,x22,#0x3fc0
00af0e9c	ldr x19,[x11, x19#0x0]
00af0ea0	ldr x20,[x11, x20#0x0]
00af0ea4	orr x22,x22,#0x18
00af0ea8	ldr x22,[x11, x22#0x0]
00af0eac	and x21,x21,#0x3fc0
00af0eb0	orr x21,x21,#0x30
00af0eb4	eor x3,x3,x19
00af0eb8	eor x8,x8,x20
00af0ebc	lsr x19,x7,#0x2
00af0ec0	lsr x20,x7,#0xa
00af0ec4	ldr x21,[x11, x21#0x0]
00af0ec8	and x19,x19,#0x3fc0
00af0ecc	and x20,x20,#0x3fc0
00af0ed0	eor x10,x10,x22
00af0ed4	ubfiz x22,x7,#0x6,#0x8
00af0ed8	orr x19,x19,#0x8
00af0edc	orr x20,x20,#0x10
00af0ee0	ldr x22,[x11, x22#0x0]
00af0ee4	ldr x19,[x11, x19#0x0]
00af0ee8	ldr x20,[x11, x20#0x0]
00af0eec	and x30,x30,#0x3fc0
00af0ef0	eor x13,x13,x21
00af0ef4	lsr x21,x7,#0x12
00af0ef8	orr x30,x30,#0x20
00af0efc	and x21,x21,#0x3fc0
00af0f00	ldr x30,[x11, x30#0x0]
00af0f04	eor x12,x12,x22
00af0f08	lsr x22,x7,#0x1a
00af0f0c	orr x21,x21,#0x18
00af0f10	eor x15,x15,x19
00af0f14	eor x10,x10,x20
00af0f18	lsr x19,x7,#0x22
00af0f1c	lsr x20,x7,#0x2a
00af0f20	lsr x7,x7,#0x32
00af0f24	ldr x21,[x11, x21#0x0]
00af0f28	and x19,x19,#0x3fc0
00af0f2c	orr w7,w7,#0x38
00af0f30	orr x19,x19,x4
00af0f34	and x7,x7,#0x3ff8
00af0f38	ldr x19,[x11, x19#0x0]
00af0f3c	ldr x7,[x11, x7#0x0]
00af0f40	eor x14,x14,x30
00af0f44	eor x14,x14,x21
00af0f48	ubfiz x21,x6,#0x6,#0x8
00af0f4c	ldr x21,[x11, x21#0x0]
00af0f50	eor x13,x13,x19
00af0f54	eor x9,x9,x7
00af0f58	lsr x7,x6,#0x2
00af0f5c	lsr x19,x6,#0xa
00af0f60	and x20,x20,#0x3fc0
00af0f64	and x7,x7,#0x3fc0
00af0f68	and x19,x19,#0x3fc0
00af0f6c	orr x20,x20,#0x30
00af0f70	orr x7,x7,#0x8
00af0f74	orr x19,x19,#0x10
00af0f78	ldr x20,[x11, x20#0x0]
00af0f7c	eor x15,x15,x21
00af0f80	lsr x21,x6,#0x1a
00af0f84	ldr x7,[x11, x7#0x0]
00af0f88	ldr x19,[x11, x19#0x0]
00af0f8c	and x21,x21,#0x3fc0
00af0f90	orr x21,x21,#0x20
00af0f94	ldr x21,[x11, x21#0x0]
00af0f98	eor x8,x8,x20
00af0f9c	lsr x20,x6,#0x12
00af0fa0	eor x10,x10,x7
00af0fa4	eor x14,x14,x19
00af0fa8	lsr x7,x6,#0x22
00af0fac	lsr x19,x6,#0x2a
00af0fb0	lsr x6,x6,#0x32
00af0fb4	and x7,x7,#0x3fc0
00af0fb8	orr w6,w6,#0x38
00af0fbc	and x22,x22,#0x3fc0
00af0fc0	orr x7,x7,x4
00af0fc4	and x6,x6,#0x3ff8
00af0fc8	orr x22,x22,#0x20
00af0fcc	and x20,x20,#0x3fc0
00af0fd0	eor x13,x13,x21
00af0fd4	ldr x7,[x11, x7#0x0]
00af0fd8	ldr x6,[x11, x6#0x0]
00af0fdc	ldr x21,[sp, #0x1d0]
00af0fe0	ldr x22,[x11, x22#0x0]
00af0fe4	orr x20,x20,#0x18
00af0fe8	ldr x20,[x11, x20#0x0]
00af0fec	and x19,x19,#0x3fc0
00af0ff0	orr x19,x19,#0x30
00af0ff4	ldr x19,[x11, x19#0x0]
00af0ff8	eor x8,x8,x7
00af0ffc	eor x12,x12,x6
00af1000	lsr x6,x21,#0x2
00af1004	lsr x7,x21,#0xa
00af1008	eor x3,x3,x22
00af100c	and x6,x6,#0x3fc0
00af1010	and x7,x7,#0x3fc0
00af1014	eor x3,x3,x20
00af1018	ubfiz x20,x21,#0x6,#0x8
00af101c	orr x6,x6,#0x8
00af1020	orr x7,x7,#0x10
00af1024	ldr x20,[x11, x20#0x0]
00af1028	ldr x6,[x11, x6#0x0]
00af102c	ldr x7,[x11, x7#0x0]
00af1030	eor x9,x9,x19
00af1034	lsr x19,x21,#0x12
00af1038	and x19,x19,#0x3fc0
00af103c	orr x19,x19,#0x18
00af1040	eor x10,x10,x20
00af1044	lsr x20,x21,#0x1a
00af1048	ldr x19,[x11, x19#0x0]
00af104c	eor x14,x14,x6
00af1050	eor x3,x3,x7
00af1054	lsr x6,x21,#0x22
00af1058	lsr x7,x21,#0x2a
00af105c	mov x22,x5
00af1060	lsr x5,x21,#0x32
00af1064	ldr x21,[sp, #0x1d8]
00af1068	and x6,x6,#0x3fc0
00af106c	orr x6,x6,x4
00af1070	eor x13,x13,x19
00af1074	and x7,x7,#0x3fc0
00af1078	ldr x6,[x11, x6#0x0]
00af107c	ubfiz x19,x21,#0x6,#0x8
00af1080	orr x7,x7,#0x30
00af1084	ldr x19,[x11, x19#0x0]
00af1088	orr w5,w5,#0x38
00af108c	ldr x7,[x11, x7#0x0]
00af1090	and x5,x5,#0x3ff8
00af1094	ldr x5,[x11, x5#0x0]
00af1098	eor x9,x9,x6
00af109c	lsr x6,x21,#0xa
00af10a0	eor x14,x14,x19
00af10a4	and x6,x6,#0x3fc0
00af10a8	lsr x19,x21,#0x1a
00af10ac	and x20,x20,#0x3fc0
00af10b0	eor x12,x12,x7
00af10b4	lsr x7,x21,#0x12
00af10b8	and x19,x19,#0x3fc0
00af10bc	orr x6,x6,#0x10
00af10c0	orr x20,x20,#0x20
00af10c4	and x7,x7,#0x3fc0
00af10c8	orr x19,x19,#0x20
00af10cc	ldr x6,[x11, x6#0x0]
00af10d0	ldr x20,[x11, x20#0x0]
00af10d4	eor x15,x15,x5
00af10d8	lsr x5,x21,#0x2
00af10dc	orr x7,x7,#0x18
00af10e0	ldr x19,[x11, x19#0x0]
00af10e4	and x5,x5,#0x3fc0
00af10e8	ldr x7,[x11, x7#0x0]
00af10ec	orr x5,x5,#0x8
00af10f0	ldr x5,[x11, x5#0x0]
00af10f4	eor x13,x13,x6
00af10f8	lsr x6,x21,#0x2a
00af10fc	eor x8,x8,x20
00af1100	eor x9,x9,x19
00af1104	and x6,x6,#0x3fc0
00af1108	ubfiz x19,x23,#0x6,#0x8
00af110c	eor x8,x8,x7
00af1110	lsr x7,x21,#0x32
00af1114	orr x6,x6,#0x30
00af1118	ldr x19,[x11, x19#0x0]
00af111c	orr w7,w7,#0x38
00af1120	ldr x6,[x11, x6#0x0]
00af1124	eor x3,x3,x5
00af1128	lsr x5,x21,#0x22
00af112c	and x7,x7,#0x3ff8
00af1130	and x5,x5,#0x3fc0
00af1134	ldr x7,[x11, x7#0x0]
00af1138	orr x5,x5,x4
00af113c	eor x19,x3,x19
00af1140	lsr x3,x23,#0x2
00af1144	ldr x5,[x11, x5#0x0]
00af1148	eor x15,x15,x6
00af114c	and x3,x3,#0x3fc0
00af1150	lsr x6,x23,#0x12
00af1154	and x6,x6,#0x3fc0
00af1158	orr x3,x3,#0x8
00af115c	eor x10,x10,x7
00af1160	lsr x7,x23,#0x1a
00af1164	orr x6,x6,#0x18
00af1168	ldr x3,[x11, x3#0x0]
00af116c	and x7,x7,#0x3fc0
00af1170	ldr x6,[x11, x6#0x0]
00af1174	eor x12,x12,x5
00af1178	lsr x5,x23,#0xa
00af117c	orr x7,x7,#0x20
00af1180	and x5,x5,#0x3fc0
00af1184	ldr x7,[x11, x7#0x0]
00af1188	orr x5,x5,#0x10
00af118c	eor x21,x13,x3
00af1190	mov x13,x23
00af1194	ldr x5,[x11, x5#0x0]
00af1198	eor x20,x9,x6
00af119c	lsr x9,x13,#0x2a
00af11a0	and x9,x9,#0x3fc0
00af11a4	eor x23,x12,x7
00af11a8	lsr x12,x13,#0x32
00af11ac	orr x9,x9,#0x30
00af11b0	orr w12,w12,#0x38
00af11b4	ldr x9,[x11, x9#0x0]
00af11b8	eor x24,x8,x5
00af11bc	lsr x8,x13,#0x22
00af11c0	and x12,x12,#0x3ff8
00af11c4	and x8,x8,#0x3fc0
00af11c8	ldr x12,[x11, x12#0x0]
00af11cc	orr x8,x8,x4
00af11d0	ldr x8,[x11, x8#0x0]
00af11d4	ldrb w13,[sp, #0x1e8]
00af11d8	eor x5,x10,x9
00af11dc	ldp x10,x9,[sp, #0x1c0]
00af11e0	eor x4,x14,x12
00af11e4	ldr x12,[sp, #0x190]
00af11e8	eor x7,x15,x8
00af11ec	lsl x8,x13,#0x6
00af11f0	ldr x9,[x11, x9#0x0]
00af11f4	ldr x8,[x11, x8#0x0]
00af11f8	ldr x10,[x11, x10#0x0]
00af11fc	ldr x12,[x11, x12#0x0]
00af1200	eor x9,x9,x24
00af1204	eor x8,x9,x8
00af1208	eor x9,x10,x20
00af120c	ldp x13,x10,[sp, #0x1b0]
00af1210	eor x9,x9,x12
00af1214	ldp x14,x12,[sp, #0x180]
00af1218	ldr x3,[sp, #0x168]
00af121c	ldr x10,[x11, x10#0x0]
00af1220	ldr x13,[x11, x13#0x0]
00af1224	ldr x12,[x11, x12#0x0]
00af1228	ldr x14,[x11, x14#0x0]
00af122c	eor x10,x10,x23
00af1230	ldr x3,[x11, x3#0x0]
00af1234	eor x10,x10,x12
00af1238	eor x12,x13,x7
00af123c	ldp x15,x13,[sp, #0x1a0]
00af1240	eor x12,x12,x14
00af1244	ldr x14,[sp, #0x178]
00af1248	stp x5,x4,[sp, #0x1d0]
00af124c	ldr x13,[x11, x13#0x0]
00af1250	ldr x15,[x11, x15#0x0]
00af1254	ldr x14,[x11, x14#0x0]
00af1258	ldrb w30,[sp, #0x1e0]
00af125c	eor x13,x13,x5
00af1260	ldrb w5,[sp, #0x1f0]
00af1264	eor x13,x13,x14
00af1268	eor x14,x15,x4
00af126c	ldr x15,[sp, #0x198]
00af1270	eor x14,x14,x3
00af1274	ldr x3,[sp, #0x160]
00af1278	ldr x4,[sp, #0x170]
00af127c	ldr x15,[x11, x15#0x0]
00af1280	lsl x5,x5,#0x6
00af1284	ldr x3,[x11, x3#0x0]
00af1288	ldr x5,[x11, x5#0x0]
00af128c	eor x15,x15,x19
00af1290	ldr x2,[x11, x2#0x0]
00af1294	eor x15,x15,x3
00af1298	lsl x3,x30,#0x6
00af129c	ldr x30,[x11, x4#0x0]
00af12a0	ldr x4,[sp, #0x150]
00af12a4	ldr x3,[x11, x3#0x0]
00af12a8	eor x9,x9,x5
00af12ac	ldp x6,x5,[sp, #0x140]
00af12b0	ldr x4,[x11, x4#0x0]
00af12b4	eor x3,x3,x21
00af12b8	eor x3,x3,x30
00af12bc	ldr x5,[x11, x5#0x0]
00af12c0	eor x10,x10,x4
00af12c4	ldr x4,[sp, #0x158]
00af12c8	ldr x30,[x11, x6#0x0]
00af12cc	ldrb w6,[sp, #0x1f8]
00af12d0	eor x13,x13,x5
00af12d4	ldr x4,[x11, x4#0x0]
00af12d8	eor x14,x14,x30
00af12dc	ldr x30,[sp, #0x128]
00af12e0	ldr x1,[x11, x1#0x0]
00af12e4	eor x12,x12,x4
00af12e8	lsl x4,x6,#0x6
00af12ec	ldp x6,x5,[sp, #0x130]
00af12f0	ldr x30,[x11, x30#0x0]
00af12f4	ldr x4,[x11, x4#0x0]
00af12f8	ldr x5,[x11, x5#0x0]
00af12fc	ldr x6,[x11, x6#0x0]
00af1300	eor x8,x8,x30
00af1304	eor x10,x10,x4
00af1308	eor x15,x15,x5
00af130c	eor x3,x3,x6
00af1310	ldp x5,x4,[sp, #0x118]
00af1314	ldp x30,x6,[sp, #0x108]
00af1318	ldr x4,[x11, x4#0x0]
00af131c	ldr x5,[x11, x5#0x0]
00af1320	ldr x6,[x11, x6#0x0]
00af1324	ldr x30,[x11, x30#0x0]
00af1328	eor x12,x12,x4
00af132c	eor x13,x13,x5
00af1330	eor x14,x14,x6
00af1334	ldp x5,x4,[sp, #0xf8]
00af1338	ldr x6,[sp, #0xf0]
00af133c	eor x15,x15,x30
00af1340	ldrb w30,[sp, #0x200]
00af1344	ldr x5,[x11, x5#0x0]
00af1348	ldr x6,[x11, x6#0x0]
00af134c	ldr x4,[x11, x4#0x0]
00af1350	eor x8,x8,x5
00af1354	eor x9,x9,x6
00af1358	ldp x6,x5,[sp, #0xe0]
00af135c	eor x3,x3,x4
00af1360	lsl x4,x30,#0x6
00af1364	ldr x4,[x11, x4#0x0]
00af1368	ldr x5,[x11, x5#0x0]
00af136c	ldr x6,[x11, x6#0x0]
00af1370	ldr x30,[sp, #0xd8]
00af1374	eor x12,x12,x4
00af1378	eor x13,x13,x5
00af137c	eor x14,x14,x6
00af1380	ldp x5,x4,[sp, #0xc8]
00af1384	ldr x6,[sp, #0xc0]
00af1388	ldr x30,[x11, x30#0x0]
00af138c	ldr x5,[x11, x5#0x0]
00af1390	ldr x6,[x11, x6#0x0]
00af1394	eor x15,x15,x30
00af1398	ldr x4,[x11, x4#0x0]
00af139c	ldrb w30,[sp, #0x208]
00af13a0	eor x8,x8,x5
00af13a4	eor x9,x9,x6
00af13a8	ldp x6,x5,[sp, #0xb0]
00af13ac	eor x3,x3,x4
00af13b0	lsl x4,x30,#0x6
00af13b4	ldr x4,[x11, x4#0x0]
00af13b8	ldr x5,[x11, x5#0x0]
00af13bc	ldr x6,[x11, x6#0x0]
00af13c0	ldr x30,[sp, #0xa8]
00af13c4	eor x13,x13,x4
00af13c8	eor x10,x10,x5
00af13cc	eor x14,x14,x6
00af13d0	ldp x5,x4,[sp, #0x98]
00af13d4	ldr x6,[sp, #0x90]
00af13d8	ldr x30,[x11, x30#0x0]
00af13dc	ldr x5,[x11, x5#0x0]
00af13e0	ldr x6,[x11, x6#0x0]
00af13e4	eor x15,x15,x30
00af13e8	ldr x4,[x11, x4#0x0]
00af13ec	ldrb w30,[sp, #0x210]
00af13f0	eor x8,x8,x5
00af13f4	eor x9,x9,x6
00af13f8	ldp x6,x5,[sp, #0x80]
00af13fc	eor x3,x3,x4
00af1400	lsl x4,x30,#0x6
00af1404	ldr x4,[x11, x4#0x0]
00af1408	ldr x5,[x11, x5#0x0]
00af140c	ldr x6,[x11, x6#0x0]
00af1410	ldr x30,[sp, #0x78]
00af1414	eor x14,x14,x4
00af1418	eor x10,x10,x5
00af141c	ldp x5,x4,[sp, #0x68]
00af1420	eor x2,x3,x2
00af1424	ldrb w3,[sp, #0x218]
00af1428	ldr x30,[x11, x30#0x0]
00af142c	ldr x4,[x11, x4#0x0]
00af1430	eor x12,x12,x6
00af1434	eor x6,x8,x1
00af1438	lsl x8,x3,#0x6
00af143c	ldr x5,[x11, x5#0x0]
00af1440	eor x9,x9,x4
00af1444	ldr x1,[x11, x25#0x0]
00af1448	ldr x8,[x11, x8#0x0]
00af144c	ldr x4,[x11, x27#0x0]
00af1450	ldr x3,[x11, x26#0x0]
00af1454	eor x15,x15,x30
00af1458	eor x10,x10,x5
00af145c	eor x5,x12,x1
00af1460	eor x8,x15,x8
00af1464	eor x1,x2,x4
00af1468	ldr x12,[x11, x28#0x0]
00af146c	ldr x15,[x11, x29#0x0]
00af1470	ldr x2,[x11, x0#0x0]
00af1474	eor x13,x13,x3
00af1478	ldr x3,[x11, x17#0x0]
00af147c	eor x4,x6,x12
00af1480	eor x17,x9,x15
00af1484	eor x12,x10,x2
00af1488	ldr x10,[x11, x18#0x0]
00af148c	ldr x15,[x11, x16#0x0]
00af1490	eor x9,x5,x3
00af1494	mov x5,x22
00af1498	add x5,x22,#0x8
00af149c	mov x6,x7
00af14a0	mov x7,x23
00af14a4	cmp x5,#0x50
00af14a8	eor x13,x13,x10
00af14ac	eor x10,x14,x15
00af14b0	mov x23,x19
00af14b4	stp x1,x4,[sp, #0x1e0]
00af14b8	stp x17,x12,[sp, #0x1f0]
00af14bc	str x9,[sp, #0x200]
00af14c0	str x13,[sp, #0x208]
00af14c4	str x10,[sp, #0x210]
00af14c8	str x8,[sp, #0x218]
00af14cc	b.ne 0x00af09f8
00af14d0	ldr x14,[sp, #0x60]
00af14d4	cbz x14,0x00af153c
00af14d8	ldp x9,x0,[sp, #0x20]
00af14dc	ldp x8,x10,[sp, #0x38]
00af14e0	cmp x8,x0
00af14e4	cset w8,hi
00af14e8	cmp x10,x9
00af14ec	cset w9,cc
00af14f0	and w8,w8,w9
00af14f4	ldr w9,[sp, #0x14]
00af14f8	orr w8,w9,w8
00af14fc	cmp w8,#0x1
00af1500	b.ne 0x00af15d8
00af1504	ldp x13,x2,[sp, #0x50]
00af1508	ldr x18,[sp, #0x48]
00af150c	mov x8,xzr
00af1510	add x14,sp,#0x1e0
00af1514	ldrb w9,[x14, x8]
00af1518	ldrb w10,[x18, x8]
00af151c	ldrb w12,[x0, x8]
00af1520	eor w9,w10,w9
00af1524	eor w9,w9,w12
00af1528	strb w9,[x0, x8]
00af152c	add x8,x8,#0x1
00af1530	cmp x8,#0x40
00af1534	b.ne 0x00af1514
00af1538	b 0x00af1638
00af153c	ldr x18,[sp, #0x48]
00af1540	ldr x0,[sp, #0x28]
00af1544	ldr x14,[x18]
00af1548	ldp x15,x16,[x0]
00af154c	eor x14,x14,x1
00af1550	eor x14,x14,x15
00af1554	str x14,[x0]
00af1558	ldr x14,[x18, #0x8]
00af155c	eor x14,x14,x4
00af1560	eor x14,x14,x16
00af1564	str x14,[x0, #0x8]
00af1568	ldr x14,[x18, #0x10]
00af156c	ldp x15,x16,[x0, #0x10]
00af1570	eor x14,x14,x17
00af1574	eor x14,x14,x15
00af1578	str x14,[x0, #0x10]
00af157c	ldr x14,[x18, #0x18]
00af1580	eor x12,x14,x12
00af1584	eor x12,x12,x16
00af1588	str x12,[x0, #0x18]
00af158c	ldr x12,[x18, #0x20]
00af1590	ldp x14,x15,[x0, #0x20]
00af1594	eor x9,x12,x9
00af1598	eor x9,x9,x14
00af159c	str x9,[x0, #0x20]
00af15a0	ldr x9,[x18, #0x28]
00af15a4	eor x9,x9,x13
00af15a8	eor x9,x9,x15
00af15ac	str x9,[x0, #0x28]
00af15b0	ldr x9,[x18, #0x30]
00af15b4	eor x9,x9,x10
00af15b8	ldp x12,x10,[x0, #0x30]
00af15bc	eor x9,x9,x12
00af15c0	str x9,[x0, #0x30]
00af15c4	ldr x9,[x18, #0x38]
00af15c8	eor x8,x9,x8
00af15cc	eor x8,x8,x10
00af15d0	str x8,[x0, #0x38]
00af15d4	b 0x00af1634
00af15d8	ldr x18,[sp, #0x48]
00af15dc	ldr q0,[sp, #0x1e0]
00af15e0	ldr q1,[x18]
00af15e4	eor v0.16B,v1.16B,v0.16B
00af15e8	ldp q2,q1,[x0]
00af15ec	eor v0.16B,v0.16B,v2.16B
00af15f0	str q0,[x0]
00af15f4	ldr q0,[sp, #0x1f0]
00af15f8	ldr q2,[x18, #0x10]
00af15fc	eor v0.16B,v2.16B,v0.16B
00af1600	eor v0.16B,v0.16B,v1.16B
00af1604	str q0,[x0, #0x10]
00af1608	ldr q0,[sp, #0x200]
00af160c	ldr q1,[x18, #0x20]
00af1610	eor v0.16B,v1.16B,v0.16B
00af1614	ldp q2,q1,[x0, #0x20]
00af1618	eor v0.16B,v0.16B,v2.16B
00af161c	str q0,[x0, #0x20]
00af1620	ldr q0,[sp, #0x210]
00af1624	ldr q2,[x18, #0x30]
00af1628	eor v0.16B,v2.16B,v0.16B
00af162c	eor v0.16B,v0.16B,v1.16B
00af1630	str q0,[x0, #0x30]
00af1634	ldp x13,x2,[sp, #0x50]
00af1638	add x18,x18,#0x40
00af163c	subs x2,x2,#0x1
00af1640	add x13,x13,#0x1
00af1644	b.ne 0x00af08f4
00af1648	add sp,sp,#0x220
00af164c	ldp x29,x30,[sp, #0x50]
00af1650	ldp x20,x19,[sp, #0x40]
00af1654	ldp x22,x21,[sp, #0x30]
00af1658	ldp x24,x23,[sp, #0x20]
00af165c	ldp x26,x25,[sp, #0x10]
00af1660	ldp x28,x27,[sp], #0x60
00af1664	ret
