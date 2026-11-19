; std::__ndk1::to_wstring @ 00bc9d70
00bc9d70	paciasp
00bc9d74	sub sp,sp,#0x50
00bc9d78	stp x29,x30,[sp, #0x20]
00bc9d7c	stp x22,x21,[sp, #0x30]
00bc9d80	stp x20,x19,[sp, #0x40]
00bc9d84	add x29,sp,#0x20
00bc9d88	lsr x9,x0,#0x20
00bc9d8c	mov x20,x0
00bc9d90	mov x19,x8
00bc9d94	cbnz x9,0x00bc9dac
00bc9d98	add x0,sp,#0xb
00bc9d9c	mov w1,w20
00bc9da0	bl 0x00bcac54
00bc9da4	mov x20,x0
00bc9da8	b 0x00bc9ea0
00bc9dac	mov x22,#0xe3ff
00bc9db0	movk x22,#0x540b, LSL #16
00bc9db4	movk x22,#0x2, LSL #32
00bc9db8	cmp x20,x22
00bc9dbc	b.ls 0x00bc9df0
00bc9dc0	mov x8,#0xd5bf
00bc9dc4	add x0,sp,#0xb
00bc9dc8	movk x8,#0xbded, LSL #16
00bc9dcc	movk x8,#0xfece, LSL #32
00bc9dd0	movk x8,#0xdbe6, LSL #48
00bc9dd4	umulh x8,x20,x8
00bc9dd8	lsr x21,x8,#0x21
00bc9ddc	mov w1,w21
00bc9de0	bl 0x00bcac54
00bc9de4	madd x8,x21,x22,x21
00bc9de8	sub x20,x20,x8
00bc9dec	b 0x00bc9df4
00bc9df0	add x0,sp,#0xb
00bc9df4	mov x8,#0xcefd
00bc9df8	mov w9,#0xe100
00bc9dfc	mov w11,#0xde83
00bc9e00	movk x8,#0x8461, LSL #16
00bc9e04	movk w9,#0x5f5, LSL #16
00bc9e08	movk w11,#0x431b, LSL #16
00bc9e0c	movk x8,#0x7711, LSL #32
00bc9e10	mov w12,#0x2710
00bc9e14	movk x8,#0xabcc, LSL #48
00bc9e18	umulh x8,x20,x8
00bc9e1c	lsr x8,x8,#0x1a
00bc9e20	msub x9,x8,x9,x20
00bc9e24	add x20,x0,#0xa
00bc9e28	mov w10,w9
00bc9e2c	umull x10,w10,w11
00bc9e30	mov w11,#0x4240
00bc9e34	movk w11,#0xf, LSL #16
00bc9e38	lsr x10,x10,#0x32
00bc9e3c	msub w9,w10,w11,w9
00bc9e40	mov w11,#0x1759
00bc9e44	movk w11,#0xd1b7, LSL #16
00bc9e48	umull x11,w9,w11
00bc9e4c	lsr x11,x11,#0x2d
00bc9e50	msub w9,w11,w12,w9
00bc9e54	adrp x12,0x78a000
00bc9e58	add x12,x12,#0x180
00bc9e5c	ldrh w8,[x12, x8, LSL #0x1]
00bc9e60	ubfx w13,w9,#0x2,#0xe
00bc9e64	strh w8,[x0]
00bc9e68	mov w8,#0x147b
00bc9e6c	ldrh w10,[x12, x10, LSL #0x1]
00bc9e70	mul w8,w13,w8
00bc9e74	strh w10,[x0, #0x2]
00bc9e78	ldrh w10,[x12, x11, LSL #0x1]
00bc9e7c	mov w11,#0x64
00bc9e80	lsr w8,w8,#0x11
00bc9e84	strh w10,[x0, #0x4]
00bc9e88	msub w9,w8,w11,w9
00bc9e8c	ldrh w8,[x12, w8, UXTW #0x1]
00bc9e90	strh w8,[x0, #0x6]
00bc9e94	and x8,x9,#0xffff
00bc9e98	ldrh w8,[x12, x8, LSL #0x1]
00bc9e9c	strh w8,[x0, #0x8]
00bc9ea0	add x8,sp,#0xb
00bc9ea4	sub x21,x20,x8
00bc9ea8	orr x8,xzr,#0x3ffffffffffffff8
00bc9eac	cmp x21,x8
00bc9eb0	b.cs 0x00bc9fc8
00bc9eb4	cmp x21,#0x4
00bc9eb8	b.hi 0x00bc9ec8
00bc9ebc	lsl w8,w21,#0x1
00bc9ec0	strb w8,[x19], #0x4
00bc9ec4	b 0x00bc9ef0
00bc9ec8	orr x8,x21,#0x1
00bc9ecc	mov w9,#0x8
00bc9ed0	cmp x8,#0x5
00bc9ed4	csinc x22,x9,x8,eq
00bc9ed8	lsl x0,x22,#0x2
00bc9edc	bl 0x00c2fed0
00bc9ee0	orr x8,x22,#0x1
00bc9ee4	stp x21,x0,[x19, #0x8]
00bc9ee8	str x8,[x19]
00bc9eec	mov x19,x0
00bc9ef0	add x8,sp,#0xb
00bc9ef4	cmp x8,x20
00bc9ef8	b.eq 0x00bc9f14
00bc9efc	cmp x21,#0x20
00bc9f00	add x11,sp,#0xb
00bc9f04	b.cs 0x00bc9f1c
00bc9f08	mov x8,x19
00bc9f0c	add x9,sp,#0xb
00bc9f10	b 0x00bc9f9c
00bc9f14	mov x8,x19
00bc9f18	b 0x00bc9fac
00bc9f1c	adrp x12,0x29c000
00bc9f20	and x10,x21,#0x3fffffffffffffe0
00bc9f24	adrp x13,0x29d000
00bc9f28	ldr q0,[x12, #0x890]
00bc9f2c	adrp x12,0x29c000
00bc9f30	adrp x14,0x29c000
00bc9f34	add x8,x19,x10, LSL #0x2
00bc9f38	ldr q1,[x13, #0xa0]
00bc9f3c	ldr q2,[x12, #0xcc0]
00bc9f40	ldr q3,[x14, #0x20]
00bc9f44	add x9,x11,x10
00bc9f48	add x11,x11,#0x10
00bc9f4c	add x12,x19,#0x40
00bc9f50	mov x13,x10
00bc9f54	ldp q4,q5,[x11, #-0x10]
00bc9f58	subs x13,x13,#0x20
00bc9f5c	add x11,x11,#0x20
00bc9f60	tbl v6.16B,{v4.16B},v3.16B
00bc9f64	tbl v7.16B,{v4.16B},v2.16B
00bc9f68	tbl v16.16B,{v4.16B},v1.16B
00bc9f6c	tbl v4.16B,{v4.16B},v0.16B
00bc9f70	tbl v17.16B,{v5.16B},v3.16B
00bc9f74	stp q7,q6,[x12, #-0x20]
00bc9f78	tbl v6.16B,{v5.16B},v2.16B
00bc9f7c	tbl v7.16B,{v5.16B},v1.16B
00bc9f80	tbl v5.16B,{v5.16B},v0.16B
00bc9f84	stp q4,q16,[x12, #-0x40]
00bc9f88	stp q6,q17,[x12, #0x20]
00bc9f8c	stp q5,q7,[x12], #0x80
00bc9f90	b.ne 0x00bc9f54
00bc9f94	cmp x21,x10
00bc9f98	b.eq 0x00bc9fac
00bc9f9c	ldrb w10,[x9], #0x1
00bc9fa0	cmp x9,x20
00bc9fa4	str w10,[x8], #0x4
00bc9fa8	b.ne 0x00bc9f9c
00bc9fac	str wzr,[x8]
00bc9fb0	ldp x20,x19,[sp, #0x40]
00bc9fb4	ldp x22,x21,[sp, #0x30]
00bc9fb8	ldp x29,x30,[sp, #0x20]
00bc9fbc	add sp,sp,#0x50
00bc9fc0	autiasp
00bc9fc4	ret
00bc9fc8	bl 0x00bc5610
