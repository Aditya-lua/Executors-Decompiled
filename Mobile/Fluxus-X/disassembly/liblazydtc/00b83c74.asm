; mbedtls_mpi_core_shift_l @ 00b83c74
00b83c74	stp x22,x21,[sp, #-0x30]!
00b83c78	stp x20,x19,[sp, #0x10]
00b83c7c	stp x29,x30,[sp, #0x20]
00b83c80	add x29,sp,#0x20
00b83c84	mov x19,x1
00b83c88	mov x20,x0
00b83c8c	lsr x22,x2,#0x6
00b83c90	and x21,x2,#0x3f
00b83c94	cbz x22,0x00b83cf4
00b83c98	cmp x22,x19
00b83c9c	mov x8,x19
00b83ca0	b.cs 0x00b83ce0
00b83ca4	sub x8,x19,x22
00b83ca8	cmp x8,#0x3
00b83cac	mov x9,x19
00b83cb0	b.hi 0x00b83db4
00b83cb4	mvn x8,x22
00b83cb8	add x8,x20,x8, LSL #0x3
00b83cbc	add x8,x8,#0x8
00b83cc0	sub x9,x9,#0x1
00b83cc4	lsl x10,x9,#0x3
00b83cc8	ldr x11,[x8, x10#0x0]
00b83ccc	cmp x9,x22
00b83cd0	sub x9,x9,#0x1
00b83cd4	str x11,[x20, x10#0x0]
00b83cd8	b.hi 0x00b83cc4
00b83cdc	mov x8,x22
00b83ce0	cbz x8,0x00b83cf4
00b83ce4	lsl x2,x8,#0x3
00b83ce8	mov x0,x20
00b83cec	mov w1,wzr
00b83cf0	bl 0x00c301c0
00b83cf4	cbz x21,0x00b83da4
00b83cf8	cmp x22,x19
00b83cfc	b.cs 0x00b83da4
00b83d00	mov w8,#0x40
00b83d04	sub x9,x19,x22
00b83d08	mov x10,xzr
00b83d0c	cmp x9,#0x4
00b83d10	sub x8,x8,x21
00b83d14	b.cc 0x00b83d7c
00b83d18	and x10,x9,#-0x4
00b83d1c	dup v1.2D,x8
00b83d20	add x11,x20,x22, LSL #0x3
00b83d24	dup v0.2D,x21
00b83d28	movi v2.2D,#0x0
00b83d2c	add x22,x22,x10
00b83d30	add x11,x11,#0x10
00b83d34	neg v1.2D,v1.2D
00b83d38	mov x12,x10
00b83d3c	ldp q3,q4,[x11, #-0x10]
00b83d40	subs x12,x12,#0x4
00b83d44	ushl v5.2D,v3.2D,v1.2D
00b83d48	ext v7.16B,v2.16B,v5.16B,0x8
00b83d4c	ushl v2.2D,v4.2D,v1.2D
00b83d50	ushl v3.2D,v3.2D,v0.2D
00b83d54	ushl v6.2D,v4.2D,v0.2D
00b83d58	ext v4.16B,v5.16B,v2.16B,0x8
00b83d5c	orr v3.16B,v3.16B,v7.16B
00b83d60	orr v4.16B,v6.16B,v4.16B
00b83d64	stp q3,q4,[x11, #-0x10]
00b83d68	add x11,x11,#0x20
00b83d6c	b.ne 0x00b83d3c
00b83d70	cmp x9,x10
00b83d74	b.eq 0x00b83da4
00b83d78	mov x10,v2.D[0x1]
00b83d7c	add x9,x20,x22, LSL #0x3
00b83d80	sub x11,x19,x22
00b83d84	ldr x12,[x9]
00b83d88	subs x11,x11,#0x1
00b83d8c	lsl x13,x12,x21
00b83d90	orr x10,x13,x10
00b83d94	lsr x12,x12,x8
00b83d98	str x10,[x9], #0x8
00b83d9c	mov x10,x12
00b83da0	b.ne 0x00b83d84
00b83da4	ldp x29,x30,[sp, #0x20]
00b83da8	ldp x20,x19,[sp, #0x10]
00b83dac	ldp x22,x21,[sp], #0x30
00b83db0	ret
00b83db4	sub x9,x19,#0x1
00b83db8	mov w10,#0x8
00b83dbc	sub x11,x9,x22
00b83dc0	add x9,x20,x9, LSL #0x3
00b83dc4	umulh x10,x11,x10
00b83dc8	lsl x11,x11,#0x3
00b83dcc	negs xzr,x10
00b83dd0	sub x12,x9,x11
00b83dd4	cset w10,ne
00b83dd8	cmp x12,x9
00b83ddc	mov x9,x19
00b83de0	b.hi 0x00b83cb4
00b83de4	mov x9,x19
00b83de8	tbnz w10,#0x0,0x00b83cb4
00b83dec	add x9,x20,x11
00b83df0	cmp x20,x9
00b83df4	mov x9,x19
00b83df8	b.hi 0x00b83cb4
00b83dfc	mov x9,x19
00b83e00	tbnz w10,#0x0,0x00b83cb4
00b83e04	add x9,x20,x22, LSL #0x3
00b83e08	add x10,x20,x8, LSL #0x3
00b83e0c	cmp x9,x10
00b83e10	add x12,x20,x19, LSL #0x3
00b83e14	b.cs 0x00b83e24
00b83e18	cmp x12,x20
00b83e1c	mov x9,x19
00b83e20	b.hi 0x00b83cb4
00b83e24	and x10,x8,#-0x4
00b83e28	neg x11,x22, LSL #0x3
00b83e2c	sub x9,x19,x10
00b83e30	sub x12,x12,#0x20
00b83e34	mov x13,x10
00b83e38	add x14,x12,x11
00b83e3c	ldp q0,q1,[x14]
00b83e40	sub x13,x13,#0x4
00b83e44	stp q0,q1,[x12], #-0x20
00b83e48	cbnz x13,0x00b83e38
00b83e4c	cmp x8,x10
00b83e50	mov x8,x22
00b83e54	b.ne 0x00b83cb4
00b83e58	b 0x00b83ce0
