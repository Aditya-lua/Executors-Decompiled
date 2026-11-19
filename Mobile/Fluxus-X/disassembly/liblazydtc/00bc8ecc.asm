; std::__ndk1::to_string @ 00bc8ecc
00bc8ecc	paciasp
00bc8ed0	sub sp,sp,#0x50
00bc8ed4	stp x29,x30,[sp, #0x20]
00bc8ed8	stp x22,x21,[sp, #0x30]
00bc8edc	stp x20,x19,[sp, #0x40]
00bc8ee0	add x29,sp,#0x20
00bc8ee4	mov x20,x0
00bc8ee8	add x0,sp,#0xc
00bc8eec	mov x19,x8
00bc8ef0	add x21,x0,#0x14
00bc8ef4	tbz x20,#0x3f,0x00bc8f08
00bc8ef8	mov w8,#0x2d
00bc8efc	orr x0,x0,#0x1
00bc8f00	neg x20,x20
00bc8f04	strb w8,[sp, #0xc]
00bc8f08	sub x8,x21,x0
00bc8f0c	cmp x8,#0x13
00bc8f10	b.gt 0x00bc8f54
00bc8f14	orr x9,x20,#0x1
00bc8f18	mov w10,#0x40
00bc8f1c	clz x9,x9
00bc8f20	sub w9,w10,w9
00bc8f24	mov w10,#0x4d1
00bc8f28	mul w9,w9,w10
00bc8f2c	adrp x10,0x78a000
00bc8f30	add x10,x10,#0x248
00bc8f34	lsr w9,w9,#0xc
00bc8f38	ldr x10,[x10, w9, UXTW #0x3]
00bc8f3c	cmp x20,x10
00bc8f40	cset w10,cc
00bc8f44	sub w9,w9,w10
00bc8f48	add w9,w9,#0x1
00bc8f4c	cmp x8,x9
00bc8f50	b.lt 0x00bc9050
00bc8f54	lsr x8,x20,#0x20
00bc8f58	cbnz x8,0x00bc8f6c
00bc8f5c	mov w1,w20
00bc8f60	bl 0x00bcac54
00bc8f64	mov x21,x0
00bc8f68	b 0x00bc9050
00bc8f6c	mov x22,#0xe3ff
00bc8f70	movk x22,#0x540b, LSL #16
00bc8f74	movk x22,#0x2, LSL #32
00bc8f78	cmp x20,x22
00bc8f7c	b.ls 0x00bc8fa8
00bc8f80	mov x8,#0xd5bf
00bc8f84	movk x8,#0xbded, LSL #16
00bc8f88	movk x8,#0xfece, LSL #32
00bc8f8c	movk x8,#0xdbe6, LSL #48
00bc8f90	umulh x8,x20,x8
00bc8f94	lsr x21,x8,#0x21
00bc8f98	mov w1,w21
00bc8f9c	bl 0x00bcac54
00bc8fa0	madd x8,x21,x22,x21
00bc8fa4	sub x20,x20,x8
00bc8fa8	mov x8,#0xcefd
00bc8fac	mov w9,#0xe100
00bc8fb0	mov w10,#0xde83
00bc8fb4	movk x8,#0x8461, LSL #16
00bc8fb8	movk w9,#0x5f5, LSL #16
00bc8fbc	movk w10,#0x431b, LSL #16
00bc8fc0	movk x8,#0x7711, LSL #32
00bc8fc4	mov w11,#0x4240
00bc8fc8	mov w12,#0x2710
00bc8fcc	movk x8,#0xabcc, LSL #48
00bc8fd0	movk w11,#0xf, LSL #16
00bc8fd4	add x21,x0,#0xa
00bc8fd8	umulh x8,x20,x8
00bc8fdc	lsr x8,x8,#0x1a
00bc8fe0	msub w9,w8,w9,w20
00bc8fe4	umull x10,w9,w10
00bc8fe8	lsr x10,x10,#0x32
00bc8fec	msub w9,w10,w11,w9
00bc8ff0	mov w11,#0x1759
00bc8ff4	movk w11,#0xd1b7, LSL #16
00bc8ff8	umull x11,w9,w11
00bc8ffc	lsr x11,x11,#0x2d
00bc9000	msub w9,w11,w12,w9
00bc9004	adrp x12,0x78a000
00bc9008	add x12,x12,#0x180
00bc900c	ldrh w8,[x12, x8, LSL #0x1]
00bc9010	ubfx w13,w9,#0x2,#0xe
00bc9014	strh w8,[x0]
00bc9018	mov w8,#0x147b
00bc901c	ldrh w10,[x12, x10, LSL #0x1]
00bc9020	mul w8,w13,w8
00bc9024	strh w10,[x0, #0x2]
00bc9028	ldrh w10,[x12, x11, LSL #0x1]
00bc902c	mov w11,#0x64
00bc9030	lsr w8,w8,#0x11
00bc9034	strh w10,[x0, #0x4]
00bc9038	msub w9,w8,w11,w9
00bc903c	ldrh w8,[x12, w8, UXTW #0x1]
00bc9040	strh w8,[x0, #0x6]
00bc9044	and x8,x9,#0xffff
00bc9048	ldrh w8,[x12, x8, LSL #0x1]
00bc904c	strh w8,[x0, #0x8]
00bc9050	add x8,sp,#0xc
00bc9054	sub x20,x21,x8
00bc9058	cmn x20,#0x8
00bc905c	b.cs 0x00bc90d4
00bc9060	cmp x20,#0x16
00bc9064	b.hi 0x00bc9074
00bc9068	lsl w8,w20,#0x1
00bc906c	strb w8,[x19], #0x1
00bc9070	b 0x00bc909c
00bc9074	orr x8,x20,#0x7
00bc9078	mov w9,#0x1a
00bc907c	cmp x8,#0x17
00bc9080	csinc x22,x9,x8,eq
00bc9084	mov x0,x22
00bc9088	bl 0x00c2fed0
00bc908c	orr x8,x22,#0x1
00bc9090	stp x20,x0,[x19, #0x8]
00bc9094	str x8,[x19]
00bc9098	mov x19,x0
00bc909c	add x8,sp,#0xc
00bc90a0	cmp x21,x8
00bc90a4	b.eq 0x00bc90b8
00bc90a8	add x1,sp,#0xc
00bc90ac	mov x0,x19
00bc90b0	mov x2,x20
00bc90b4	bl 0x00c2ffd0
00bc90b8	strb wzr,[x19, x20]
00bc90bc	ldp x20,x19,[sp, #0x40]
00bc90c0	ldp x22,x21,[sp, #0x30]
00bc90c4	ldp x29,x30,[sp, #0x20]
00bc90c8	add sp,sp,#0x50
00bc90cc	autiasp
00bc90d0	ret
00bc90d4	bl 0x007fe124
