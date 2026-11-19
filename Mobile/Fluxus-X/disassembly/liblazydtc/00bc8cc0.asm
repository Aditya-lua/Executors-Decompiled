; std::__ndk1::to_string @ 00bc8cc0
00bc8cc0	paciasp
00bc8cc4	sub sp,sp,#0x50
00bc8cc8	stp x29,x30,[sp, #0x20]
00bc8ccc	stp x22,x21,[sp, #0x30]
00bc8cd0	stp x20,x19,[sp, #0x40]
00bc8cd4	add x29,sp,#0x20
00bc8cd8	mov x20,x0
00bc8cdc	add x0,sp,#0xc
00bc8ce0	mov x19,x8
00bc8ce4	add x21,x0,#0x14
00bc8ce8	tbz x20,#0x3f,0x00bc8cfc
00bc8cec	mov w8,#0x2d
00bc8cf0	orr x0,x0,#0x1
00bc8cf4	neg x20,x20
00bc8cf8	strb w8,[sp, #0xc]
00bc8cfc	sub x8,x21,x0
00bc8d00	cmp x8,#0x13
00bc8d04	b.gt 0x00bc8d48
00bc8d08	orr x9,x20,#0x1
00bc8d0c	mov w10,#0x40
00bc8d10	clz x9,x9
00bc8d14	sub w9,w10,w9
00bc8d18	mov w10,#0x4d1
00bc8d1c	mul w9,w9,w10
00bc8d20	adrp x10,0x78a000
00bc8d24	add x10,x10,#0x248
00bc8d28	lsr w9,w9,#0xc
00bc8d2c	ldr x10,[x10, w9, UXTW #0x3]
00bc8d30	cmp x20,x10
00bc8d34	cset w10,cc
00bc8d38	sub w9,w9,w10
00bc8d3c	add w9,w9,#0x1
00bc8d40	cmp x8,x9
00bc8d44	b.lt 0x00bc8e44
00bc8d48	lsr x8,x20,#0x20
00bc8d4c	cbnz x8,0x00bc8d60
00bc8d50	mov w1,w20
00bc8d54	bl 0x00bcac54
00bc8d58	mov x21,x0
00bc8d5c	b 0x00bc8e44
00bc8d60	mov x22,#0xe3ff
00bc8d64	movk x22,#0x540b, LSL #16
00bc8d68	movk x22,#0x2, LSL #32
00bc8d6c	cmp x20,x22
00bc8d70	b.ls 0x00bc8d9c
00bc8d74	mov x8,#0xd5bf
00bc8d78	movk x8,#0xbded, LSL #16
00bc8d7c	movk x8,#0xfece, LSL #32
00bc8d80	movk x8,#0xdbe6, LSL #48
00bc8d84	umulh x8,x20,x8
00bc8d88	lsr x21,x8,#0x21
00bc8d8c	mov w1,w21
00bc8d90	bl 0x00bcac54
00bc8d94	madd x8,x21,x22,x21
00bc8d98	sub x20,x20,x8
00bc8d9c	mov x8,#0xcefd
00bc8da0	mov w9,#0xe100
00bc8da4	mov w10,#0xde83
00bc8da8	movk x8,#0x8461, LSL #16
00bc8dac	movk w9,#0x5f5, LSL #16
00bc8db0	movk w10,#0x431b, LSL #16
00bc8db4	movk x8,#0x7711, LSL #32
00bc8db8	mov w11,#0x4240
00bc8dbc	mov w12,#0x2710
00bc8dc0	movk x8,#0xabcc, LSL #48
00bc8dc4	movk w11,#0xf, LSL #16
00bc8dc8	add x21,x0,#0xa
00bc8dcc	umulh x8,x20,x8
00bc8dd0	lsr x8,x8,#0x1a
00bc8dd4	msub w9,w8,w9,w20
00bc8dd8	umull x10,w9,w10
00bc8ddc	lsr x10,x10,#0x32
00bc8de0	msub w9,w10,w11,w9
00bc8de4	mov w11,#0x1759
00bc8de8	movk w11,#0xd1b7, LSL #16
00bc8dec	umull x11,w9,w11
00bc8df0	lsr x11,x11,#0x2d
00bc8df4	msub w9,w11,w12,w9
00bc8df8	adrp x12,0x78a000
00bc8dfc	add x12,x12,#0x180
00bc8e00	ldrh w8,[x12, x8, LSL #0x1]
00bc8e04	ubfx w13,w9,#0x2,#0xe
00bc8e08	strh w8,[x0]
00bc8e0c	mov w8,#0x147b
00bc8e10	ldrh w10,[x12, x10, LSL #0x1]
00bc8e14	mul w8,w13,w8
00bc8e18	strh w10,[x0, #0x2]
00bc8e1c	ldrh w10,[x12, x11, LSL #0x1]
00bc8e20	mov w11,#0x64
00bc8e24	lsr w8,w8,#0x11
00bc8e28	strh w10,[x0, #0x4]
00bc8e2c	msub w9,w8,w11,w9
00bc8e30	ldrh w8,[x12, w8, UXTW #0x1]
00bc8e34	strh w8,[x0, #0x6]
00bc8e38	and x8,x9,#0xffff
00bc8e3c	ldrh w8,[x12, x8, LSL #0x1]
00bc8e40	strh w8,[x0, #0x8]
00bc8e44	add x8,sp,#0xc
00bc8e48	sub x20,x21,x8
00bc8e4c	cmn x20,#0x8
00bc8e50	b.cs 0x00bc8ec8
00bc8e54	cmp x20,#0x16
00bc8e58	b.hi 0x00bc8e68
00bc8e5c	lsl w8,w20,#0x1
00bc8e60	strb w8,[x19], #0x1
00bc8e64	b 0x00bc8e90
00bc8e68	orr x8,x20,#0x7
00bc8e6c	mov w9,#0x1a
00bc8e70	cmp x8,#0x17
00bc8e74	csinc x22,x9,x8,eq
00bc8e78	mov x0,x22
00bc8e7c	bl 0x00c2fed0
00bc8e80	orr x8,x22,#0x1
00bc8e84	stp x20,x0,[x19, #0x8]
00bc8e88	str x8,[x19]
00bc8e8c	mov x19,x0
00bc8e90	add x8,sp,#0xc
00bc8e94	cmp x21,x8
00bc8e98	b.eq 0x00bc8eac
00bc8e9c	add x1,sp,#0xc
00bc8ea0	mov x0,x19
00bc8ea4	mov x2,x20
00bc8ea8	bl 0x00c2ffd0
00bc8eac	strb wzr,[x19, x20]
00bc8eb0	ldp x20,x19,[sp, #0x40]
00bc8eb4	ldp x22,x21,[sp, #0x30]
00bc8eb8	ldp x29,x30,[sp, #0x20]
00bc8ebc	add sp,sp,#0x50
00bc8ec0	autiasp
00bc8ec4	ret
00bc8ec8	bl 0x007fe124
