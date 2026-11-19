; mbedtls_entropy_self_test @ 00b7691c
00b7691c	str x28,[sp, #-0x40]!
00b76920	stp x22,x21,[sp, #0x10]
00b76924	stp x20,x19,[sp, #0x20]
00b76928	stp x29,x30,[sp, #0x30]
00b7692c	add x29,sp,#0x30
00b76930	sub sp,sp,#0x3d0
00b76934	mrs x21,tpidr_el0
00b76938	ldr x8,[x21, #0x28]
00b7693c	mov w19,w0
00b76940	movi v0.2D,#0x0
00b76944	stur x8,[x29, #-0x38]
00b76948	stp q0,q0,[sp, #0x60]
00b7694c	stp q0,q0,[sp, #0x40]
00b76950	stp q0,q0,[sp, #0x20]
00b76954	stp q0,q0,[sp]
00b76958	cbz w0,0x00b76968
00b7695c	adrp x0,0x2a8000
00b76960	add x0,x0,#0xef4
00b76964	bl 0x00c41af0
00b76968	add x20,sp,#0x88
00b7696c	add x0,x20,#0x18
00b76970	mov w2,#0x328
00b76974	mov w1,wzr
00b76978	bl 0x00c301c0
00b7697c	add x0,sp,#0x88
00b76980	bl 0x00c42840
00b76984	ldrsw x8,[sp, #0xa4]
00b76988	cmp w8,#0x13
00b7698c	b.gt 0x00b769bc
00b76990	adrp x10,0xcb5000
00b76994	ldr x10,[x10, #0xaa0]
00b76998	mov w9,#0x28
00b7699c	mov w11,#0x20
00b769a0	mov w12,#0x1
00b769a4	add w13,w8,#0x1
00b769a8	madd x8,x8,x9,x20
00b769ac	stp x10,xzr,[x8, #0x20]
00b769b0	str x11,[x8, #0x38]
00b769b4	str w12,[x8, #0x40]
00b769b8	str w13,[sp, #0xa4]
00b769bc	add x0,sp,#0x88
00b769c0	bl 0x00b76400
00b769c4	mov w20,w0
00b769c8	cbnz w0,0x00b76df8
00b769cc	ldrsw x8,[sp, #0xa4]
00b769d0	cmp w8,#0x13
00b769d4	b.le 0x00b769e0
00b769d8	mov w20,#0xffffffc2
00b769dc	b 0x00b76df8
00b769e0	mov w9,#0x28
00b769e4	add x10,sp,#0x88
00b769e8	nop
00b769ec	adr x11,0xb76e84
00b769f0	mov w12,#0x10
00b769f4	add w13,w8,#0x1
00b769f8	madd x8,x8,x9,x10
00b769fc	add x0,sp,#0x88
00b76a00	mov w1,#0x14
00b76a04	add x2,sp,#0x40
00b76a08	mov w3,#0x40
00b76a0c	stp x11,xzr,[x8, #0x20]
00b76a10	str x12,[x8, #0x38]
00b76a14	str wzr,[x8, #0x40]
00b76a18	str w13,[sp, #0xa4]
00b76a1c	bl 0x00b762e0
00b76a20	mov w20,w0
00b76a24	cbnz w0,0x00b76df8
00b76a28	add x0,sp,#0x88
00b76a2c	add x1,sp,#0x40
00b76a30	mov w2,#0x40
00b76a34	bl 0x00c30380
00b76a38	mov w20,w0
00b76a3c	cbnz w0,0x00b76df8
00b76a40	ldrb w8,[sp, #0x40]
00b76a44	ldrb w9,[sp, #0x31]
00b76a48	ldur q0,[sp, #0x41]
00b76a4c	ldur q1,[sp, #0x1]
00b76a50	strb w8,[sp]
00b76a54	ldrb w8,[sp, #0x71]
00b76a58	add x0,sp,#0x88
00b76a5c	orr v0.16B,v1.16B,v0.16B
00b76a60	ldur q1,[sp, #0x51]
00b76a64	orr w8,w9,w8
00b76a68	ldrb w9,[sp, #0x72]
00b76a6c	strb w8,[sp, #0x31]
00b76a70	ldrb w8,[sp, #0x32]
00b76a74	stur q0,[sp, #0x1]
00b76a78	ldur q0,[sp, #0x11]
00b76a7c	add x1,sp,#0x40
00b76a80	orr w8,w8,w9
00b76a84	ldrb w9,[sp, #0x73]
00b76a88	strb w8,[sp, #0x32]
00b76a8c	ldrb w8,[sp, #0x33]
00b76a90	orr v0.16B,v0.16B,v1.16B
00b76a94	ldur q1,[sp, #0x61]
00b76a98	stur q0,[sp, #0x11]
00b76a9c	orr w8,w8,w9
00b76aa0	ldrb w9,[sp, #0x74]
00b76aa4	strb w8,[sp, #0x33]
00b76aa8	ldrb w8,[sp, #0x34]
00b76aac	ldur q0,[sp, #0x21]
00b76ab0	mov w2,#0x40
00b76ab4	orr w8,w8,w9
00b76ab8	ldrb w9,[sp, #0x75]
00b76abc	strb w8,[sp, #0x34]
00b76ac0	ldrb w8,[sp, #0x35]
00b76ac4	orr v0.16B,v0.16B,v1.16B
00b76ac8	stur q0,[sp, #0x21]
00b76acc	orr w8,w8,w9
00b76ad0	ldrb w9,[sp, #0x76]
00b76ad4	strb w8,[sp, #0x35]
00b76ad8	ldrb w8,[sp, #0x36]
00b76adc	orr w8,w8,w9
00b76ae0	ldrb w9,[sp, #0x77]
00b76ae4	strb w8,[sp, #0x36]
00b76ae8	ldrb w8,[sp, #0x37]
00b76aec	orr w8,w8,w9
00b76af0	ldrb w9,[sp, #0x78]
00b76af4	strb w8,[sp, #0x37]
00b76af8	ldrb w8,[sp, #0x38]
00b76afc	orr w8,w8,w9
00b76b00	ldrb w9,[sp, #0x79]
00b76b04	strb w8,[sp, #0x38]
00b76b08	ldrb w8,[sp, #0x39]
00b76b0c	orr w8,w8,w9
00b76b10	ldrb w9,[sp, #0x7a]
00b76b14	strb w8,[sp, #0x39]
00b76b18	ldrb w8,[sp, #0x3a]
00b76b1c	orr w8,w8,w9
00b76b20	ldrb w9,[sp, #0x7b]
00b76b24	strb w8,[sp, #0x3a]
00b76b28	ldrb w8,[sp, #0x3b]
00b76b2c	orr w8,w8,w9
00b76b30	ldrb w9,[sp, #0x7c]
00b76b34	strb w8,[sp, #0x3b]
00b76b38	ldrb w8,[sp, #0x3c]
00b76b3c	orr w8,w8,w9
00b76b40	ldrb w9,[sp, #0x7d]
00b76b44	strb w8,[sp, #0x3c]
00b76b48	ldrb w8,[sp, #0x3d]
00b76b4c	orr w8,w8,w9
00b76b50	ldrb w9,[sp, #0x7e]
00b76b54	strb w8,[sp, #0x3d]
00b76b58	ldrb w8,[sp, #0x3e]
00b76b5c	orr w8,w8,w9
00b76b60	strb w8,[sp, #0x3e]
00b76b64	ldrb w8,[sp, #0x3f]
00b76b68	ldrb w9,[sp, #0x7f]
00b76b6c	orr w8,w8,w9
00b76b70	strb w8,[sp, #0x3f]
00b76b74	bl 0x00c30380
00b76b78	mov w20,w0
00b76b7c	cbnz w0,0x00b76df8
00b76b80	ldr q0,[sp, #0x40]
00b76b84	ldr q1,[sp]
00b76b88	add x0,sp,#0x88
00b76b8c	add x1,sp,#0x40
00b76b90	mov w2,#0x40
00b76b94	orr v0.16B,v1.16B,v0.16B
00b76b98	ldr q1,[sp, #0x50]
00b76b9c	str q0,[sp]
00b76ba0	ldr q0,[sp, #0x10]
00b76ba4	orr v0.16B,v0.16B,v1.16B
00b76ba8	ldr q1,[sp, #0x60]
00b76bac	str q0,[sp, #0x10]
00b76bb0	ldr q0,[sp, #0x20]
00b76bb4	orr v0.16B,v0.16B,v1.16B
00b76bb8	str q0,[sp, #0x20]
00b76bbc	ldr q0,[sp, #0x70]
00b76bc0	ldr q1,[sp, #0x30]
00b76bc4	orr v0.16B,v1.16B,v0.16B
00b76bc8	str q0,[sp, #0x30]
00b76bcc	bl 0x00c30380
00b76bd0	mov w20,w0
00b76bd4	cbnz w0,0x00b76df8
00b76bd8	ldr q0,[sp, #0x40]
00b76bdc	ldr q1,[sp]
00b76be0	add x0,sp,#0x88
00b76be4	add x1,sp,#0x40
00b76be8	mov w2,#0x40
00b76bec	orr v0.16B,v1.16B,v0.16B
00b76bf0	ldr q1,[sp, #0x50]
00b76bf4	str q0,[sp]
00b76bf8	ldr q0,[sp, #0x10]
00b76bfc	orr v0.16B,v0.16B,v1.16B
00b76c00	ldr q1,[sp, #0x60]
00b76c04	str q0,[sp, #0x10]
00b76c08	ldr q0,[sp, #0x20]
00b76c0c	orr v0.16B,v0.16B,v1.16B
00b76c10	str q0,[sp, #0x20]
00b76c14	ldr q0,[sp, #0x70]
00b76c18	ldr q1,[sp, #0x30]
00b76c1c	orr v0.16B,v1.16B,v0.16B
00b76c20	str q0,[sp, #0x30]
00b76c24	bl 0x00c30380
00b76c28	mov w20,w0
00b76c2c	cbnz w0,0x00b76df8
00b76c30	ldr q0,[sp, #0x40]
00b76c34	ldr q1,[sp]
00b76c38	add x0,sp,#0x88
00b76c3c	add x1,sp,#0x40
00b76c40	mov w2,#0x40
00b76c44	orr v0.16B,v1.16B,v0.16B
00b76c48	ldr q1,[sp, #0x50]
00b76c4c	str q0,[sp]
00b76c50	ldr q0,[sp, #0x10]
00b76c54	orr v0.16B,v0.16B,v1.16B
00b76c58	ldr q1,[sp, #0x60]
00b76c5c	str q0,[sp, #0x10]
00b76c60	ldr q0,[sp, #0x20]
00b76c64	orr v0.16B,v0.16B,v1.16B
00b76c68	str q0,[sp, #0x20]
00b76c6c	ldr q0,[sp, #0x70]
00b76c70	ldr q1,[sp, #0x30]
00b76c74	orr v0.16B,v1.16B,v0.16B
00b76c78	str q0,[sp, #0x30]
00b76c7c	bl 0x00c30380
00b76c80	mov w20,w0
00b76c84	cbnz w0,0x00b76df8
00b76c88	ldr q0,[sp, #0x40]
00b76c8c	ldr q1,[sp]
00b76c90	add x0,sp,#0x88
00b76c94	add x1,sp,#0x40
00b76c98	mov w2,#0x40
00b76c9c	orr v0.16B,v1.16B,v0.16B
00b76ca0	ldr q1,[sp, #0x50]
00b76ca4	str q0,[sp]
00b76ca8	ldr q0,[sp, #0x10]
00b76cac	orr v0.16B,v0.16B,v1.16B
00b76cb0	ldr q1,[sp, #0x60]
00b76cb4	str q0,[sp, #0x10]
00b76cb8	ldr q0,[sp, #0x20]
00b76cbc	orr v0.16B,v0.16B,v1.16B
00b76cc0	str q0,[sp, #0x20]
00b76cc4	ldr q0,[sp, #0x70]
00b76cc8	ldr q1,[sp, #0x30]
00b76ccc	orr v0.16B,v1.16B,v0.16B
00b76cd0	str q0,[sp, #0x30]
00b76cd4	bl 0x00c30380
00b76cd8	mov w20,w0
00b76cdc	cbnz w0,0x00b76df8
00b76ce0	ldr q0,[sp, #0x40]
00b76ce4	ldr q1,[sp]
00b76ce8	add x0,sp,#0x88
00b76cec	add x1,sp,#0x40
00b76cf0	mov w2,#0x40
00b76cf4	orr v0.16B,v1.16B,v0.16B
00b76cf8	ldr q1,[sp, #0x50]
00b76cfc	str q0,[sp]
00b76d00	ldr q0,[sp, #0x10]
00b76d04	orr v0.16B,v0.16B,v1.16B
00b76d08	ldr q1,[sp, #0x60]
00b76d0c	str q0,[sp, #0x10]
00b76d10	ldr q0,[sp, #0x20]
00b76d14	orr v0.16B,v0.16B,v1.16B
00b76d18	str q0,[sp, #0x20]
00b76d1c	ldr q0,[sp, #0x70]
00b76d20	ldr q1,[sp, #0x30]
00b76d24	orr v0.16B,v1.16B,v0.16B
00b76d28	str q0,[sp, #0x30]
00b76d2c	bl 0x00c30380
00b76d30	mov w20,w0
00b76d34	cbnz w0,0x00b76df8
00b76d38	ldr q0,[sp, #0x40]
00b76d3c	ldr q1,[sp]
00b76d40	add x0,sp,#0x88
00b76d44	add x1,sp,#0x40
00b76d48	mov w2,#0x40
00b76d4c	orr v0.16B,v1.16B,v0.16B
00b76d50	ldr q1,[sp, #0x50]
00b76d54	str q0,[sp]
00b76d58	ldr q0,[sp, #0x10]
00b76d5c	orr v0.16B,v0.16B,v1.16B
00b76d60	ldr q1,[sp, #0x60]
00b76d64	str q0,[sp, #0x10]
00b76d68	ldr q0,[sp, #0x20]
00b76d6c	orr v0.16B,v0.16B,v1.16B
00b76d70	str q0,[sp, #0x20]
00b76d74	ldr q0,[sp, #0x70]
00b76d78	ldr q1,[sp, #0x30]
00b76d7c	orr v0.16B,v1.16B,v0.16B
00b76d80	str q0,[sp, #0x30]
00b76d84	bl 0x00c30380
00b76d88	mov w20,w0
00b76d8c	cbnz w0,0x00b76df8
00b76d90	ldr q0,[sp, #0x40]
00b76d94	ldr q1,[sp]
00b76d98	mov x8,xzr
00b76d9c	mov x9,sp
00b76da0	orr v0.16B,v1.16B,v0.16B
00b76da4	ldr q1,[sp, #0x50]
00b76da8	str q0,[sp]
00b76dac	ldr q0,[sp, #0x10]
00b76db0	orr v0.16B,v0.16B,v1.16B
00b76db4	ldr q1,[sp, #0x60]
00b76db8	str q0,[sp, #0x10]
00b76dbc	ldr q0,[sp, #0x20]
00b76dc0	orr v0.16B,v0.16B,v1.16B
00b76dc4	ldr q1,[sp, #0x70]
00b76dc8	str q0,[sp, #0x20]
00b76dcc	ldr q0,[sp, #0x30]
00b76dd0	orr v0.16B,v0.16B,v1.16B
00b76dd4	str q0,[sp, #0x30]
00b76dd8	ldrb w10,[x9, x8]
00b76ddc	cbz w10,0x00b76df4
00b76de0	add x8,x8,#0x1
00b76de4	cmp x8,#0x3f
00b76de8	mov w20,wzr
00b76dec	b.ls 0x00b76dd8
00b76df0	b 0x00b76df8
00b76df4	mov w20,#0x1
00b76df8	ldr w8,[sp, #0xa0]
00b76dfc	cmn w8,#0x1
00b76e00	b.eq 0x00b76e28
00b76e04	add x0,sp,#0x88
00b76e08	add x22,sp,#0x88
00b76e0c	bl 0x00c42830
00b76e10	add x0,x22,#0x20
00b76e14	mov w1,#0x320
00b76e18	str wzr,[sp, #0xa4]
00b76e1c	bl 0x00c42220
00b76e20	mov w8,#0xffffffff
00b76e24	str w8,[sp, #0xa0]
00b76e28	cbz w19,0x00b76e50
00b76e2c	cbz w20,0x00b76e3c
00b76e30	adrp x0,0x77c000
00b76e34	add x0,x0,#0x854
00b76e38	b 0x00b76e44
00b76e3c	adrp x0,0x77c000
00b76e40	add x0,x0,#0x87c
00b76e44	bl 0x00c30760
00b76e48	mov w0,#0xa
00b76e4c	bl 0x00c42240
00b76e50	ldr x8,[x21, #0x28]
00b76e54	ldur x9,[x29, #-0x38]
00b76e58	cmp w20,#0x0
00b76e5c	cset w0,ne
00b76e60	cmp x8,x9
00b76e64	b.ne 0x00b76e80
00b76e68	add sp,sp,#0x3d0
00b76e6c	ldp x29,x30,[sp, #0x30]
00b76e70	ldp x20,x19,[sp, #0x20]
00b76e74	ldp x22,x21,[sp, #0x10]
00b76e78	ldr x28,[sp], #0x40
00b76e7c	ret
00b76e80	bl 0x00c2fec0
