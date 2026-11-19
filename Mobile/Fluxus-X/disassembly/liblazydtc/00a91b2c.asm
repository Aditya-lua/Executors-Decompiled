; FUN_00a91b2c @ 00a91b2c
00a91b2c	str x27,[sp, #-0x60]!
00a91b30	stp x26,x25,[sp, #0x10]
00a91b34	stp x24,x23,[sp, #0x20]
00a91b38	stp x22,x21,[sp, #0x30]
00a91b3c	stp x20,x19,[sp, #0x40]
00a91b40	stp x29,x30,[sp, #0x50]
00a91b44	ldr x19,[x0, #0x78]
00a91b48	add x29,sp,#0x50
00a91b4c	ldr w8,[x19, #0x70]
00a91b50	cbz w8,0x00a91be8
00a91b54	cbz x3,0x00a91bf4
00a91b58	cmp w8,#0x3f
00a91b5c	b.hi 0x00a91bf4
00a91b60	orr w9,wzr,#0x3f
00a91b64	sub w9,w9,w8
00a91b68	neg x10,x3
00a91b6c	mvn x11,x9
00a91b70	cmp x10,x11
00a91b74	csinv x10,x10,x9,hi
00a91b78	neg x10,x10
00a91b7c	cmp x10,#0x20
00a91b80	b.cs 0x00a91d88
00a91b84	mov w9,w8
00a91b88	mov x20,x1
00a91b8c	mov x21,x2
00a91b90	mov x10,xzr
00a91b94	mov w8,w9
00a91b98	sub x9,x3,#0x1
00a91b9c	add x11,x8,x10
00a91ba0	add x13,x19,w11, UXTW 
00a91ba4	ldrb w12,[x21, x10]
00a91ba8	ldrb w13,[x13, #0x30]
00a91bac	cmp x9,x10
00a91bb0	eor w12,w13,w12
00a91bb4	strb w12,[x20, x10]
00a91bb8	add x10,x10,#0x1
00a91bbc	b.eq 0x00a91bcc
00a91bc0	add w11,w11,#0x1
00a91bc4	cmp w11,#0x40
00a91bc8	b.cc 0x00a91b9c
00a91bcc	add w9,w8,w10
00a91bd0	add x20,x20,x10
00a91bd4	sub x3,x3,x10
00a91bd8	add x21,x21,x10
00a91bdc	str w9,[x19, #0x70]
00a91be0	cbnz x3,0x00a91c08
00a91be4	b 0x00a91e6c
00a91be8	mov x21,x2
00a91bec	mov x20,x1
00a91bf0	b 0x00a91c30
00a91bf4	mov x21,x2
00a91bf8	mov x20,x1
00a91bfc	mov w9,w8
00a91c00	str w9,[x19, #0x70]
00a91c04	cbz x3,0x00a91e6c
00a91c08	cmp w9,#0x40
00a91c0c	b.ne 0x00a91c30
00a91c10	ldr w8,[x19, #0x20]
00a91c14	str wzr,[x19, #0x70]
00a91c18	adds w8,w8,#0x1
00a91c1c	str w8,[x19, #0x20]
00a91c20	b.ne 0x00a91c30
00a91c24	ldr w8,[x19, #0x24]
00a91c28	add w8,w8,#0x1
00a91c2c	str w8,[x19, #0x24]
00a91c30	and w24,w3,#0x3f
00a91c34	sub x25,x3,x24
00a91c38	cmp x25,#0x40
00a91c3c	add x22,x19,#0x20
00a91c40	b.cc 0x00a91cc0
00a91c44	ldr w27,[x19, #0x20]
00a91c48	mov w26,#0x10000000
00a91c4c	lsr x9,x25,#0x22
00a91c50	lsr x8,x25,#0x6
00a91c54	cmp x9,#0x0
00a91c58	csel x8,x8,x26,eq
00a91c5c	add w9,w27,w8
00a91c60	cmp x8,x9
00a91c64	csel w27,wzr,w9,hi
00a91c68	csel x9,x9,xzr,hi
00a91c6c	sub x8,x8,x9
00a91c70	lsl x23,x8,#0x6
00a91c74	mov x0,x20
00a91c78	mov x1,x21
00a91c7c	mov x2,x23
00a91c80	mov x3,x19
00a91c84	mov x4,x22
00a91c88	bl 0x00c392e0
00a91c8c	sub x25,x25,x23
00a91c90	add x21,x21,x23
00a91c94	add x20,x20,x23
00a91c98	str w27,[x19, #0x20]
00a91c9c	cbz w27,0x00a91cac
00a91ca0	cmp x25,#0x3f
00a91ca4	b.hi 0x00a91c4c
00a91ca8	b 0x00a91cc0
00a91cac	ldr w8,[x19, #0x24]
00a91cb0	add w8,w8,#0x1
00a91cb4	str w8,[x19, #0x24]
00a91cb8	cmp x25,#0x3f
00a91cbc	b.hi 0x00a91c4c
00a91cc0	cbz w24,0x00a91e6c
00a91cc4	movi v0.2D,#0x0
00a91cc8	mov x0,x19
00a91ccc	stp q0,q0,[x19, #0x50]
00a91cd0	str q0,[x0, #0x30]!
00a91cd4	mov w2,#0x40
00a91cd8	mov x1,x0
00a91cdc	mov x3,x19
00a91ce0	mov x4,x22
00a91ce4	str q0,[x19, #0x40]
00a91ce8	bl 0x00c392e0
00a91cec	cmp w24,#0x20
00a91cf0	mov x8,xzr
00a91cf4	b.cc 0x00a91e3c
00a91cf8	add x10,x21,x24
00a91cfc	add x8,x19,x24
00a91d00	add x9,x20,x24
00a91d04	cmp x20,x10
00a91d08	add x8,x8,#0x30
00a91d0c	cset w10,cc
00a91d10	cmp x21,x9
00a91d14	add x11,x19,#0x30
00a91d18	cset w12,cc
00a91d1c	cmp x20,x8
00a91d20	cset w8,cc
00a91d24	cmp x11,x9
00a91d28	and w10,w10,w12
00a91d2c	cset w9,cc
00a91d30	tbnz w10,#0x0,0x00a91e38
00a91d34	and w9,w8,w9
00a91d38	mov x8,xzr
00a91d3c	tbnz w9,#0x0,0x00a91e3c
00a91d40	and x8,x24,#0x20
00a91d44	add x9,x21,#0x10
00a91d48	add x10,x20,#0x10
00a91d4c	add x11,x19,#0x40
00a91d50	mov x12,x8
00a91d54	ldp q0,q1,[x9, #-0x10]
00a91d58	ldp q2,q3,[x11, #-0x10]
00a91d5c	subs x12,x12,#0x20
00a91d60	add x9,x9,#0x20
00a91d64	add x11,x11,#0x20
00a91d68	eor v0.16B,v2.16B,v0.16B
00a91d6c	eor v1.16B,v3.16B,v1.16B
00a91d70	stp q0,q1,[x10, #-0x10]
00a91d74	add x10,x10,#0x20
00a91d78	b.ne 0x00a91d54
00a91d7c	cmp x8,x24
00a91d80	b.ne 0x00a91e3c
00a91d84	b 0x00a91e68
00a91d88	neg x11,x3
00a91d8c	mvn x12,x9
00a91d90	cmp x11,x12
00a91d94	csinv x9,x11,x9,hi
00a91d98	add x13,x8,#0x30
00a91d9c	sub x14,x2,x9
00a91da0	sub x11,x1,x9
00a91da4	sub x9,x13,x9
00a91da8	cmp x14,x1
00a91dac	add x12,x19,x13
00a91db0	add x9,x19,x9
00a91db4	cset w13,hi
00a91db8	cmp x11,x2
00a91dbc	cset w14,hi
00a91dc0	cmp x9,x1
00a91dc4	cset w9,hi
00a91dc8	cmp x12,x11
00a91dcc	and w13,w13,w14
00a91dd0	cset w11,cc
00a91dd4	tbnz w13,#0x0,0x00a91b84
00a91dd8	and w9,w9,w11
00a91ddc	tbnz w9,#0x0,0x00a91b84
00a91de0	and x11,x10,#0x1ffffffe0
00a91de4	add x12,x2,#0x10
00a91de8	add w9,w8,w11
00a91dec	add x20,x1,x11
00a91df0	sub x3,x3,x11
00a91df4	add x21,x2,x11
00a91df8	add x13,x1,#0x10
00a91dfc	mov x14,x11
00a91e00	add x15,x19,w8, UXTW 
00a91e04	ldp q0,q1,[x12, #-0x10]
00a91e08	ldp q2,q3,[x15, #0x30]
00a91e0c	add x12,x12,#0x20
00a91e10	subs x14,x14,#0x20
00a91e14	add w8,w8,#0x20
00a91e18	eor v0.16B,v2.16B,v0.16B
00a91e1c	eor v1.16B,v3.16B,v1.16B
00a91e20	stp q0,q1,[x13, #-0x10]
00a91e24	add x13,x13,#0x20
00a91e28	b.ne 0x00a91e00
00a91e2c	cmp x11,x10
00a91e30	b.ne 0x00a91b90
00a91e34	b 0x00a91c00
00a91e38	mov x8,xzr
00a91e3c	add x11,x19,x8
00a91e40	add x9,x21,x8
00a91e44	add x10,x20,x8
00a91e48	add x11,x11,#0x30
00a91e4c	sub x8,x24,x8
00a91e50	ldrb w12,[x9], #0x1
00a91e54	ldrb w13,[x11], #0x1
00a91e58	subs x8,x8,#0x1
00a91e5c	eor w12,w13,w12
00a91e60	strb w12,[x10], #0x1
00a91e64	b.ne 0x00a91e50
00a91e68	str w24,[x19, #0x70]
00a91e6c	ldp x29,x30,[sp, #0x50]
00a91e70	ldp x20,x19,[sp, #0x40]
00a91e74	ldp x22,x21,[sp, #0x30]
00a91e78	ldp x24,x23,[sp, #0x20]
00a91e7c	ldp x26,x25,[sp, #0x10]
00a91e80	mov w0,#0x1
00a91e84	ldr x27,[sp], #0x60
00a91e88	ret
