; FUN_00b9dd04 @ 00b9dd04
00b9dd04	sub sp,sp,#0xf0
00b9dd08	stp x26,x25,[sp, #0xa0]
00b9dd0c	stp x24,x23,[sp, #0xb0]
00b9dd10	stp x22,x21,[sp, #0xc0]
00b9dd14	stp x20,x19,[sp, #0xd0]
00b9dd18	stp x29,x30,[sp, #0xe0]
00b9dd1c	add x29,sp,#0xe0
00b9dd20	mrs x24,tpidr_el0
00b9dd24	ldr x8,[x24, #0x28]
00b9dd28	mov x21,x3
00b9dd2c	mov x23,x2
00b9dd30	mov x19,x0
00b9dd34	stur x8,[x29, #-0x48]
00b9dd38	ldr w8,[x0]
00b9dd3c	mov x20,x1
00b9dd40	cbz w8,0x00b9dd78
00b9dd44	mov w21,#0xffffff77
00b9dd48	ldr x8,[x24, #0x28]
00b9dd4c	ldur x9,[x29, #-0x48]
00b9dd50	cmp x8,x9
00b9dd54	b.ne 0x00b9e144
00b9dd58	mov w0,w21
00b9dd5c	ldp x29,x30,[sp, #0xe0]
00b9dd60	ldp x20,x19,[sp, #0xd0]
00b9dd64	ldp x22,x21,[sp, #0xc0]
00b9dd68	ldp x24,x23,[sp, #0xb0]
00b9dd6c	ldp x26,x25,[sp, #0xa0]
00b9dd70	add sp,sp,#0xf0
00b9dd74	ret
00b9dd78	mov w25,#0x200
00b9dd7c	movk w25,#0x3c0, LSL #16
00b9dd80	and w8,w4,#0xffc07fff
00b9dd84	cmp w8,w25
00b9dd88	str w4,[x19]
00b9dd8c	b.ne 0x00b9de08
00b9dd90	add x22,x19,#0x8
00b9dd94	mov x0,x22
00b9dd98	bl 0x00c30260
00b9dd9c	ldrh w1,[x20]
00b9dda0	ldrh w2,[x20, #0x2]
00b9dda4	mov w8,#0x2301
00b9dda8	cmp w1,w8
00b9ddac	b.ne 0x00b9ddc4
00b9ddb0	cmp w2,#0x40
00b9ddb4	mov w21,#0xffffff7a
00b9ddb8	b.eq 0x00b9e0e0
00b9ddbc	cmp w2,#0x80
00b9ddc0	b.eq 0x00b9e0e0
00b9ddc4	mov w0,#0x200
00b9ddc8	movk w0,#0x3c0, LSL #16
00b9ddcc	mov x3,xzr
00b9ddd0	bl 0x00c42e50
00b9ddd4	mov x1,x0
00b9ddd8	cbz x0,0x00b9de78
00b9dddc	mov x0,x22
00b9dde0	bl 0x00c30280
00b9dde4	cbnz w0,0x00b9ddf8
00b9dde8	ldrh w2,[x20, #0x2]
00b9ddec	mov x0,x22
00b9ddf0	mov x1,x23
00b9ddf4	bl 0x00c42440
00b9ddf8	bl 0x00c42bf0
00b9ddfc	mov w21,w0
00b9de00	cbnz w21,0x00b9e0e0
00b9de04	b 0x00b9dd48
00b9de08	and w8,w4,#0x7fc00000
00b9de0c	orr w9,wzr,#0x3800000
00b9de10	cmp w8,w9
00b9de14	b.ne 0x00b9de60
00b9de18	and w8,w4,#0xff
00b9de1c	mov w20,#0x2000000
00b9de20	sub w8,w8,#0x3
00b9de24	bfxil w20,w4,#0x0,#0x8
00b9de28	cmp w8,#0xf
00b9de2c	str wzr,[x19, #0x8]
00b9de30	str x21,[sp]
00b9de34	b.hi 0x00b9de98
00b9de38	adrp x10,0x787000
00b9de3c	add x10,x10,#0x700
00b9de40	ldrsw x11,[x10, x8, LSL #0x2]
00b9de44	orr w8,wzr,#0x30
00b9de48	mov w9,#0x14
00b9de4c	mov w22,#0x40
00b9de50	add x10,x11,x10
00b9de54	br x10
00b9de58	mov w22,#0x80
00b9de5c	b 0x00b9df38
00b9de60	mov w2,#0x188
00b9de64	mov x0,x19
00b9de68	mov w1,wzr
00b9de6c	bl 0x00c301c0
00b9de70	mov w21,#0xffffff7a
00b9de74	b 0x00b9dd48
00b9de78	mov w21,#0xffffff7a
00b9de7c	ldr w8,[x19]
00b9de80	cbnz w8,0x00b9e0e8
00b9de84	b 0x00b9dd48
00b9de88	mov w22,#0x90
00b9de8c	b 0x00b9df38
00b9de90	mov w22,#0x88
00b9de94	b 0x00b9df38
00b9de98	mov w8,#0x13
00b9de9c	movk w8,#0x200, LSL #16
00b9dea0	cmp w20,w8
00b9dea4	cset w8,eq
00b9dea8	lsl x9,x8,#0x6
00b9deac	sub w8,w4,#0x4
00b9deb0	and w10,w8,#0xff
00b9deb4	cmp w10,#0x6
00b9deb8	b.cs 0x00b9ded8
00b9debc	and x8,x8,#0xff
00b9dec0	mov w10,#0x33
00b9dec4	lsr w10,w10,w8
00b9dec8	mov x8,x9
00b9decc	tbz w10,#0x0,0x00b9dedc
00b9ded0	mov w22,#0x40
00b9ded4	b 0x00b9df38
00b9ded8	mov x8,x9
00b9dedc	sub w9,w4,#0xa
00b9dee0	and w10,w9,#0xff
00b9dee4	cmp w10,#0x9
00b9dee8	b.cs 0x00b9defc
00b9deec	and x10,x9,#0xff
00b9def0	mov w11,#0x1cf
00b9def4	lsr w10,w11,w10
00b9def8	tbnz w10,#0x0,0x00b9df28
00b9defc	mov w9,#0x13
00b9df00	movk w9,#0x200, LSL #16
00b9df04	cmp w20,w9
00b9df08	mov w9,#0x48
00b9df0c	csel x22,x9,xzr,eq
00b9df10	cmp x22,x8
00b9df14	str w20,[x19, #0x8]
00b9df18	b.cs 0x00b9df3c
00b9df1c	mov w21,#0xffffff7a
00b9df20	cbnz w21,0x00b9e0e0
00b9df24	b 0x00b9dd48
00b9df28	sxtb x8,w9
00b9df2c	adrp x9,0x787000
00b9df30	add x9,x9,#0x740
00b9df34	ldr x22,[x9, x8, LSL #0x3]
00b9df38	str w20,[x19, #0x8]
00b9df3c	cmp x22,x21
00b9df40	b.cs 0x00b9df74
00b9df44	add x3,sp,#0x8
00b9df48	mov w4,#0x90
00b9df4c	mov x5,sp
00b9df50	mov w0,w20
00b9df54	mov x1,x23
00b9df58	mov x2,x21
00b9df5c	bl 0x00c42cd0
00b9df60	mov w21,w0
00b9df64	cbnz w0,0x00b9e0d0
00b9df68	ldr x21,[sp]
00b9df6c	cbnz x21,0x00b9df88
00b9df70	b 0x00b9e078
00b9df74	cbz x21,0x00b9e078
00b9df78	add x0,sp,#0x8
00b9df7c	mov x1,x23
00b9df80	mov x2,x21
00b9df84	bl 0x00c2ffd0
00b9df88	cmp x21,#0x1
00b9df8c	csinc x9,x21,xzr,hi
00b9df90	cmp x9,#0x20
00b9df94	mov x8,xzr
00b9df98	b.cc 0x00b9dfd4
00b9df9c	and x8,x9,#-0x20
00b9dfa0	add x10,sp,#0x8
00b9dfa4	add x10,x10,#0x10
00b9dfa8	movi v0.16B,#0x36
00b9dfac	mov x11,x8
00b9dfb0	ldp q1,q2,[x10, #-0x10]
00b9dfb4	subs x11,x11,#0x20
00b9dfb8	eor v1.16B,v1.16B,v0.16B
00b9dfbc	eor v2.16B,v2.16B,v0.16B
00b9dfc0	stp q1,q2,[x10, #-0x10]
00b9dfc4	add x10,x10,#0x20
00b9dfc8	b.ne 0x00b9dfb0
00b9dfcc	cmp x9,x8
00b9dfd0	b.eq 0x00b9dff4
00b9dfd4	add x9,sp,#0x8
00b9dfd8	mov w10,#0x36
00b9dfdc	ldrb w11,[x9, x8]
00b9dfe0	eor w11,w11,w10
00b9dfe4	strb w11,[x9, x8]
00b9dfe8	add x8,x8,#0x1
00b9dfec	cmp x8,x21
00b9dff0	b.cc 0x00b9dfdc
00b9dff4	add x26,sp,#0x8
00b9dff8	sub x23,x22,x21
00b9dffc	add x0,x26,x21
00b9e000	mov w1,#0x36
00b9e004	mov x2,x23
00b9e008	bl 0x00c301c0
00b9e00c	cmp x21,#0x20
00b9e010	mov x8,xzr
00b9e014	b.cc 0x00b9e054
00b9e018	and x8,x21,#-0x20
00b9e01c	add x9,x26,#0x10
00b9e020	add x10,x19,#0x108
00b9e024	movi v0.16B,#0x6a
00b9e028	mov x11,x8
00b9e02c	ldp q1,q2,[x9, #-0x10]
00b9e030	add x9,x9,#0x20
00b9e034	subs x11,x11,#0x20
00b9e038	eor v1.16B,v1.16B,v0.16B
00b9e03c	eor v2.16B,v2.16B,v0.16B
00b9e040	stp q1,q2,[x10, #-0x10]
00b9e044	add x10,x10,#0x20
00b9e048	b.ne 0x00b9e02c
00b9e04c	cmp x21,x8
00b9e050	b.eq 0x00b9e090
00b9e054	mov w9,#0x6a
00b9e058	ldrb w10,[x26, x8]
00b9e05c	add x11,x19,x8
00b9e060	add x8,x8,#0x1
00b9e064	cmp x21,x8
00b9e068	eor w10,w10,w9
00b9e06c	strb w10,[x11, #0xf8]
00b9e070	b.ne 0x00b9e058
00b9e074	b 0x00b9e090
00b9e078	add x0,sp,#0x8
00b9e07c	mov w1,#0x36
00b9e080	mov x2,x22
00b9e084	bl 0x00c301c0
00b9e088	mov x21,xzr
00b9e08c	mov x23,x22
00b9e090	add x8,x19,x21
00b9e094	add x0,x8,#0xf8
00b9e098	mov w1,#0x5c
00b9e09c	mov x2,x23
00b9e0a0	bl 0x00c301c0
00b9e0a4	add x23,x19,#0x10
00b9e0a8	mov x0,x23
00b9e0ac	mov w1,w20
00b9e0b0	bl 0x00c42cf0
00b9e0b4	mov w21,w0
00b9e0b8	cbnz w0,0x00b9e0d0
00b9e0bc	add x1,sp,#0x8
00b9e0c0	mov x0,x23
00b9e0c4	mov x2,x22
00b9e0c8	bl 0x00c42d00
00b9e0cc	mov w21,w0
00b9e0d0	add x0,sp,#0x8
00b9e0d4	mov w1,#0x90
00b9e0d8	bl 0x00c42220
00b9e0dc	cbz w21,0x00b9dd48
00b9e0e0	ldr w8,[x19]
00b9e0e4	cbz w8,0x00b9dd48
00b9e0e8	and w9,w8,#0xffc07fff
00b9e0ec	cmp w9,w25
00b9e0f0	b.ne 0x00b9e104
00b9e0f4	add x0,x19,#0x8
00b9e0f8	bl 0x00c30290
00b9e0fc	str wzr,[x19]
00b9e100	b 0x00b9dd48
00b9e104	and w8,w8,#0x7fc00000
00b9e108	orr w9,wzr,#0x3800000
00b9e10c	cmp w8,w9
00b9e110	b.ne 0x00b9e130
00b9e114	add x0,x19,#0xf8
00b9e118	mov w1,#0x90
00b9e11c	bl 0x00c42220
00b9e120	add x0,x19,#0x10
00b9e124	bl 0x00c42cc0
00b9e128	str wzr,[x19]
00b9e12c	b 0x00b9dd48
00b9e130	mov w2,#0x188
00b9e134	mov x0,x19
00b9e138	mov w1,wzr
00b9e13c	bl 0x00c301c0
00b9e140	b 0x00b9dd48
00b9e144	bl 0x00c2fec0
