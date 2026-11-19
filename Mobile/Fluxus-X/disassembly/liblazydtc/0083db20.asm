; FUN_0083db20 @ 0083db20
0083db20	sub sp,sp,#0xc0
0083db24	stp x29,x30,[sp, #0x70]
0083db28	stp x26,x25,[sp, #0x80]
0083db2c	stp x24,x23,[sp, #0x90]
0083db30	stp x22,x21,[sp, #0xa0]
0083db34	stp x20,x19,[sp, #0xb0]
0083db38	add x29,sp,#0x70
0083db3c	mrs x25,tpidr_el0
0083db40	mov x20,x8
0083db44	mov w1,#0x1
0083db48	ldr x8,[x25, #0x28]
0083db4c	mov w2,#0x8
0083db50	mov x19,x0
0083db54	stur x8,[x29, #-0x8]
0083db58	bl 0x008af088
0083db5c	mov x0,x19
0083db60	mov w1,#0x1
0083db64	bl 0x008abc64
0083db68	cmp w0,#0x7
0083db6c	b.ls 0x0083dfe8
0083db70	adrp x8,0xd1e000
0083db74	add x8,x8,#0x3d0
0083db78	adrp x21,0xd1e000
0083db7c	add x21,x21,#0x3c0
0083db80	ldarb w8,[x8]
0083db84	tbz w8,#0x0,0x0083e03c
0083db88	adrp x8,0xd1e000
0083db8c	ldrb w8,[x8, #0x3ca]
0083db90	cmp w8,#0x1
0083db94	b.ne 0x0083dbd0
0083db98	adrp x8,0x29a000
0083db9c	ldr d0,[x21]
0083dba0	ldrb w9,[x21, #0x8]
0083dba4	ldr d1,[x8, #0x658]
0083dba8	ldrb w10,[x21, #0x9]
0083dbac	mov w8,#0x9d
0083dbb0	mov w11,#0xa5
0083dbb4	eor w8,w9,w8
0083dbb8	strb wzr,[x21, #0xa]
0083dbbc	eor v0.8B,v0.8B,v1.8B
0083dbc0	eor w9,w10,w11
0083dbc4	strb w8,[x21, #0x8]
0083dbc8	strb w9,[x21, #0x9]
0083dbcc	str d0,[x21]
0083dbd0	adrp x2,0xd1e000
0083dbd4	add x2,x2,#0x3c0
0083dbd8	mov x0,x19
0083dbdc	mov w1,#0x1
0083dbe0	bl 0x008acba4
0083dbe4	mov x0,x19
0083dbe8	mov w1,#0xffffffff
0083dbec	mov x2,xzr
0083dbf0	bl 0x008ab8a4
0083dbf4	mov x21,x0
0083dbf8	mov x0,x19
0083dbfc	mov w1,#0xfffffffe
0083dc00	bl 0x008aa994
0083dc04	cbz x21,0x0083dd04
0083dc08	adrp x8,0xd1e000
0083dc0c	add x8,x8,#0x3e8
0083dc10	adrp x22,0xd1e000
0083dc14	add x22,x22,#0x3d8
0083dc18	ldarb w8,[x8]
0083dc1c	tbz w8,#0x0,0x0083e510
0083dc20	adrp x8,0xd1e000
0083dc24	ldrb w8,[x8, #0x3e4]
0083dc28	cmp w8,#0x1
0083dc2c	b.ne 0x0083dc64
0083dc30	ldr s0,[x22, #0x8]
0083dc34	adrp x8,0x29b000
0083dc38	strb wzr,[x22, #0xc]
0083dc3c	ldr d1,[x8, #0x958]
0083dc40	adrp x8,0x29b000
0083dc44	uxtl v0.8H,v0.8B
0083dc48	ldr d2,[x8, #0xd38]
0083dc4c	eor v0.8B,v0.8B,v1.8B
0083dc50	ldr d1,[x22]
0083dc54	eor v1.8B,v1.8B,v2.8B
0083dc58	uzp1 v0.8B,v0.8B,v0.8B
0083dc5c	str d1,[x22]
0083dc60	str s0,[x22, #0x8]
0083dc64	adrp x1,0xd1e000
0083dc68	add x1,x1,#0x3d8
0083dc6c	mov x0,x21
0083dc70	bl 0x00c301f0
0083dc74	adrp x8,0xd1e000
0083dc78	add x8,x8,#0x400
0083dc7c	cmp w0,#0x0
0083dc80	ldarb w8,[x8]
0083dc84	cset w23,eq
0083dc88	adrp x22,0xd1e000
0083dc8c	add x22,x22,#0x3f0
0083dc90	tbz w8,#0x0,0x0083e568
0083dc94	adrp x8,0xd1e000
0083dc98	ldrb w8,[x8, #0x3fd]
0083dc9c	cmp w8,#0x1
0083dca0	b.ne 0x0083dce4
0083dca4	ldr s0,[x22, #0x8]
0083dca8	adrp x8,0x29b000
0083dcac	strb wzr,[x22, #0xd]
0083dcb0	ldr d1,[x8, #0xa28]
0083dcb4	adrp x8,0x29a000
0083dcb8	uxtl v0.8H,v0.8B
0083dcbc	ldr d2,[x8, #0xc30]
0083dcc0	ldrb w8,[x22, #0xc]
0083dcc4	eor w8,w8,#0x33333333
0083dcc8	eor v0.8B,v0.8B,v1.8B
0083dccc	ldr d1,[x22]
0083dcd0	strb w8,[x22, #0xc]
0083dcd4	eor v1.8B,v1.8B,v2.8B
0083dcd8	uzp1 v0.8B,v0.8B,v0.8B
0083dcdc	str d1,[x22]
0083dce0	str s0,[x22, #0x8]
0083dce4	adrp x1,0xd1e000
0083dce8	add x1,x1,#0x3f0
0083dcec	mov x0,x21
0083dcf0	bl 0x00c301f0
0083dcf4	cmp w0,#0x0
0083dcf8	cset w8,eq
0083dcfc	tbz w23,#0x0,0x0083dd10
0083dd00	b 0x0083dd14
0083dd04	mov w23,wzr
0083dd08	mov w8,wzr
0083dd0c	tbnz w23,#0x0,0x0083dd14
0083dd10	tbz w8,#0x0,0x0083e00c
0083dd14	mov x0,x19
0083dd18	mov w1,#0x1
0083dd1c	bl 0x008abd78
0083dd20	cmp w23,#0x0
0083dd24	ldr x8,[x0]
0083dd28	mov w9,#0x110
0083dd2c	mov w10,#0x168
0083dd30	csel x9,x10,x9,ne
0083dd34	ldr x8,[x8, x9#0x0]
0083dd38	cbz x8,0x0083e090
0083dd3c	ldr x22,[x8, #0x28]
0083dd40	cbz x22,0x0083e160
0083dd44	ldr x21,[x8, #0x20]
0083dd48	cbz x21,0x0083e160
0083dd4c	cmn x21,#0x8
0083dd50	b.cs 0x0083e23c
0083dd54	cmp x21,#0x17
0083dd58	b.cs 0x0083dd70
0083dd5c	lsl w8,w21,#0x1
0083dd60	add x9,sp,#0x8
0083dd64	orr x23,x9,#0x1
0083dd68	strb w8,[sp, #0x8]
0083dd6c	b 0x0083dd98
0083dd70	orr x8,x21,#0x7
0083dd74	mov w9,#0x1a
0083dd78	cmp x8,#0x17
0083dd7c	csinc x24,x9,x8,eq
0083dd80	mov x0,x24
0083dd84	bl 0x00c2fed0
0083dd88	orr x8,x24,#0x1
0083dd8c	mov x23,x0
0083dd90	stp x21,x0,[sp, #0x10]
0083dd94	str x8,[sp, #0x8]
0083dd98	mov x0,x23
0083dd9c	mov x1,x22
0083dda0	mov x2,x21
0083dda4	bl 0x00c2ff60
0083dda8	strb wzr,[x23, x21]
0083ddac	ldrb w8,[sp, #0x8]
0083ddb0	ldr x2,[sp, #0x10]
0083ddb4	lsr x9,x8,#0x1
0083ddb8	tst w8,#0x1
0083ddbc	csel x9,x9,x2,eq
0083ddc0	cmp x9,#0x7
0083ddc4	b.ls 0x0083e250
0083ddc8	tbnz w8,#0x0,0x0083dde0
0083ddcc	ldur q0,[sp, #0x8]
0083ddd0	ldr x8,[sp, #0x18]
0083ddd4	str q0,[sp, #0x20]
0083ddd8	str x8,[sp, #0x30]
0083dddc	b 0x0083ddec
0083dde0	ldr x1,[sp, #0x18]
0083dde4	add x0,sp,#0x20
0083dde8	bl 0x007ff40c
0083ddec	ldrb w9,[sp, #0x20]
0083ddf0	ldp x10,x24,[sp, #0x28]
0083ddf4	add x8,sp,#0x20
0083ddf8	mov w12,#0x52
0083ddfc	mov w13,#0x53
0083de00	tst w9,#0x1
0083de04	mov w14,#0x42
0083de08	mov w15,#0x31
0083de0c	csinc x11,x24,x8,ne
0083de10	lsr x9,x9,#0x1
0083de14	cset w26,eq
0083de18	ldr w11,[x11]
0083de1c	csel x9,x9,x10,eq
0083de20	eor w13,w13,w11, LSR #0x8
0083de24	eor w12,w11,w12
0083de28	eor w14,w14,w11, LSR #0x10
0083de2c	eor w11,w15,w11, LSR #0x18
0083de30	sturb w12,[x29, #-0x34]
0083de34	sub w12,w13,#0x29
0083de38	sub w13,w14,#0x52
0083de3c	sub w10,w11,#0x7b
0083de40	sturb w12,[x29, #-0x33]
0083de44	sturb w13,[x29, #-0x32]
0083de48	sturb w10,[x29, #-0x31]
0083de4c	cbz x9,0x0083deb4
0083de50	mov x9,xzr
0083de54	orr x10,x8,#0x1
0083de58	mov w11,#0x29
0083de5c	sub x12,x29,#0x34
0083de60	ldr x13,[sp, #0x30]
0083de64	tst w26,#0x1
0083de68	bfxil x12,x9,#0x0,#0x2
0083de6c	csel x13,x10,x13,ne
0083de70	ldrb w12,[x12]
0083de74	ldrb w14,[x13, x9]
0083de78	madd w12,w9,w11,w12
0083de7c	eor w12,w14,w12
0083de80	strb w12,[x13, x9]
0083de84	add x9,x9,#0x1
0083de88	ldrb w12,[sp, #0x20]
0083de8c	ldr x13,[sp, #0x28]
0083de90	lsr x14,x12,#0x1
0083de94	tst w12,#0x1
0083de98	cset w26,eq
0083de9c	csel x12,x14,x13,eq
0083dea0	cmp x9,x12
0083dea4	b.cc 0x0083de5c
0083dea8	ldr x24,[sp, #0x30]
0083deac	sub x23,x12,#0x8
0083deb0	b 0x0083deb8
0083deb4	mov x23,#-0x8
0083deb8	mov w9,#0x5
0083debc	cmp w26,#0x0
0083dec0	orr x8,x8,x9
0083dec4	add x9,x24,#0x4
0083dec8	csel x8,x8,x9,ne
0083decc	ldr w21,[x8]
0083ded0	mov w8,#0xfbffffff
0083ded4	add w8,w21,w8
0083ded8	lsr w8,w8,#0x1a
0083dedc	cmp w8,#0x3f
0083dee0	b.cc 0x0083e32c
0083dee4	mov x0,x21
0083dee8	bl 0x00c2fed0
0083deec	mov w1,wzr
0083def0	mov x2,x21
0083def4	mov x22,x0
0083def8	bl 0x00c301c0
0083defc	mov w8,#0x9
0083df00	add x9,sp,#0x20
0083df04	cmp w26,#0x0
0083df08	orr x8,x9,x8
0083df0c	add x9,x24,#0x8
0083df10	csel x2,x8,x9,ne
0083df14	mov x0,x22
0083df18	mov x1,x21
0083df1c	mov x3,x23
0083df20	bl 0x00c305b0
0083df24	bl 0x00c305c0
0083df28	cbnz w0,0x0083e404
0083df2c	cmp w21,#0x17
0083df30	b.cs 0x0083df44
0083df34	lsl w8,w21,#0x1
0083df38	strb w8,[x20], #0x1
0083df3c	mov x19,x20
0083df40	b 0x0083df6c
0083df44	orr x8,x21,#0x7
0083df48	mov w9,#0x1a
0083df4c	cmp x8,#0x17
0083df50	csinc x23,x9,x8,eq
0083df54	mov x0,x23
0083df58	bl 0x00c2fed0
0083df5c	orr x8,x23,#0x1
0083df60	mov x19,x0
0083df64	stp x21,x0,[x20, #0x8]
0083df68	str x8,[x20]
0083df6c	mov x0,x19
0083df70	mov x1,x22
0083df74	mov x2,x21
0083df78	bl 0x00c2ffd0
0083df7c	mov x0,x22
0083df80	mov x1,x21
0083df84	strb wzr,[x19, x21]
0083df88	bl 0x00c2fe80
0083df8c	ldrb w8,[sp, #0x20]
0083df90	tbz w8,#0x0,0x0083dfa4
0083df94	ldr x8,[sp, #0x20]
0083df98	ldr x0,[sp, #0x30]
0083df9c	and x1,x8,#-0x2
0083dfa0	bl 0x00c2fe80
0083dfa4	ldrb w8,[sp, #0x8]
0083dfa8	tbz w8,#0x0,0x0083dfbc
0083dfac	ldr x8,[sp, #0x8]
0083dfb0	ldr x0,[sp, #0x18]
0083dfb4	and x1,x8,#-0x2
0083dfb8	bl 0x00c2fe80
0083dfbc	ldr x8,[x25, #0x28]
0083dfc0	ldur x9,[x29, #-0x8]
0083dfc4	cmp x8,x9
0083dfc8	b.ne 0x0083e818
0083dfcc	ldp x20,x19,[sp, #0xb0]
0083dfd0	ldp x22,x21,[sp, #0xa0]
0083dfd4	ldp x24,x23,[sp, #0x90]
0083dfd8	ldp x26,x25,[sp, #0x80]
0083dfdc	ldp x29,x30,[sp, #0x70]
0083dfe0	add sp,sp,#0xc0
0083dfe4	ret
0083dfe8	bl 0x0083e81c
0083dfec	ldr x8,[x25, #0x28]
0083dff0	ldur x9,[x29, #-0x8]
0083dff4	cmp x8,x9
0083dff8	b.ne 0x0083e818
0083dffc	adrp x0,0xd1e000
0083e000	add x0,x0,#0x398
0083e004	bl 0x0083e8f8
0083e008	b 0x0083e02c
0083e00c	bl 0x0083e96c
0083e010	ldr x8,[x25, #0x28]
0083e014	ldur x9,[x29, #-0x8]
0083e018	cmp x8,x9
0083e01c	b.ne 0x0083e818
0083e020	adrp x0,0xd1e000
0083e024	add x0,x0,#0x408
0083e028	bl 0x0083ea48
0083e02c	mov x2,x0
0083e030	mov x0,x19
0083e034	mov w1,#0x1
0083e038	bl 0x008aed6c
0083e03c	adrp x0,0xd1e000
0083e040	add x0,x0,#0x3d0
0083e044	bl 0x00c2fe90
0083e048	cbz w0,0x0083db88
0083e04c	adrp x8,0x29a000
0083e050	mov w9,#0x1
0083e054	nop
0083e058	adr x0,0x83ebbc
0083e05c	ldr d0,[x8, #0xe70]
0083e060	mov w8,#0xa5f8
0083e064	adrp x2,0xc48000
0083e068	add x2,x2,#0x880
0083e06c	mov x1,x21
0083e070	strb w9,[x21, #0xa]
0083e074	str d0,[x21]
0083e078	strh w8,[x21, #0x8]
0083e07c	bl 0x00c2fe70
0083e080	adrp x0,0xd1e000
0083e084	add x0,x0,#0x3d0
0083e088	bl 0x00c2fea0
0083e08c	b 0x0083db88
0083e090	adrp x8,0xd1e000
0083e094	add x8,x8,#0x468
0083e098	adrp x20,0xd1e000
0083e09c	add x20,x20,#0x430
0083e0a0	ldarb w8,[x8]
0083e0a4	tbz w8,#0x0,0x0083e5c0
0083e0a8	adrp x8,0xd1e000
0083e0ac	ldrb w8,[x8, #0x463]
0083e0b0	cmp w8,#0x1
0083e0b4	b.ne 0x0083e118
0083e0b8	add x8,x20,#0x30
0083e0bc	adrp x9,0x29a000
0083e0c0	ldr q4,[x20, #0x20]
0083e0c4	ld1 {v0.B}[0],[x8]
0083e0c8	add x8,x20,#0x31
0083e0cc	ldr d1,[x9, #0x778]
0083e0d0	ldrb w9,[x20, #0x32]
0083e0d4	strb wzr,[x20, #0x33]
0083e0d8	ld1 {v0.B}[4],[x8]
0083e0dc	adrp x8,0x29c000
0083e0e0	ldr q2,[x8, #0xc50]
0083e0e4	eor w8,w9,#0xfffffff7
0083e0e8	strb w8,[x20, #0x32]
0083e0ec	eor v0.8B,v0.8B,v1.8B
0083e0f0	ldp q1,q3,[x20]
0083e0f4	mov w9,v0.S[0x1]
0083e0f8	eor v1.16B,v1.16B,v2.16B
0083e0fc	eor v3.16B,v3.16B,v2.16B
0083e100	fmov w8,s0
0083e104	eor v0.16B,v4.16B,v2.16B
0083e108	stp q1,q3,[x20]
0083e10c	strb w8,[x20, #0x30]
0083e110	str q0,[x20, #0x20]
0083e114	strb w9,[x20, #0x31]
0083e118	mov x0,x19
0083e11c	mov w1,#0x1
0083e120	bl 0x008aee78
0083e124	adrp x1,0x2b6000
0083e128	add x1,x1,#0xc62
0083e12c	adrp x2,0xd1e000
0083e130	add x2,x2,#0x430
0083e134	mov x0,x19
0083e138	bl 0x008ac684
0083e13c	ldr x8,[x25, #0x28]
0083e140	ldur x9,[x29, #-0x8]
0083e144	cmp x8,x9
0083e148	b.ne 0x0083e818
0083e14c	mov x0,x19
0083e150	mov w1,#0x2
0083e154	bl 0x008ae364
0083e158	mov x0,x19
0083e15c	bl 0x008aa5f4
0083e160	adrp x8,0x35e000
0083e164	add x8,x8,#0x997
0083e168	ldr q0,[x8]
0083e16c	ldur q1,[x8, #0xb]
0083e170	adrp x8,0xd1e000
0083e174	add x8,x8,#0x490
0083e178	stur q0,[x29, #-0x30]
0083e17c	stur q1,[x29, #-0x25]
0083e180	ldarb w8,[x8]
0083e184	tbz w8,#0x0,0x0083e624
0083e188	adrp x8,0xd1e000
0083e18c	ldrb w8,[x8, #0x48b]
0083e190	cmp w8,#0x1
0083e194	b.ne 0x0083e1f4
0083e198	adrp x8,0xd1e000
0083e19c	add x8,x8,#0x470
0083e1a0	adrp x9,0x29a000
0083e1a4	ldrb w10,[x8, #0x18]
0083e1a8	ldp d1,d2,[x8]
0083e1ac	ldr d0,[x9, #0x660]
0083e1b0	mov w9,#0xeb
0083e1b4	ldrb w11,[x8, #0x19]
0083e1b8	ldr d3,[x8, #0x10]
0083e1bc	eor w9,w10,w9
0083e1c0	strb wzr,[x8, #0x1b]
0083e1c4	eor v1.8B,v1.8B,v0.8B
0083e1c8	eor w10,w11,#0xfffffffd
0083e1cc	eor v2.8B,v2.8B,v0.8B
0083e1d0	strb w9,[x8, #0x18]
0083e1d4	eor v0.8B,v3.8B,v0.8B
0083e1d8	ldrb w9,[x8, #0x1a]
0083e1dc	strb w10,[x8, #0x19]
0083e1e0	mov w10,#0x49
0083e1e4	eor w9,w9,w10
0083e1e8	stp d1,d2,[x8]
0083e1ec	str d0,[x8, #0x10]
0083e1f0	strb w9,[x8, #0x1a]
0083e1f4	mov x0,x19
0083e1f8	mov w1,#0x1
0083e1fc	bl 0x008aee78
0083e200	adrp x1,0x2b6000
0083e204	add x1,x1,#0xc62
0083e208	adrp x2,0xd1e000
0083e20c	add x2,x2,#0x470
0083e210	mov x0,x19
0083e214	bl 0x008ac684
0083e218	mov x0,x19
0083e21c	mov w1,#0x2
0083e220	bl 0x008ae364
0083e224	ldr x8,[x25, #0x28]
0083e228	ldur x9,[x29, #-0x8]
0083e22c	cmp x8,x9
0083e230	b.ne 0x0083e818
0083e234	mov x0,x19
0083e238	bl 0x008aa5f4
0083e23c	ldr x8,[x25, #0x28]
0083e240	ldur x9,[x29, #-0x8]
0083e244	cmp x8,x9
0083e248	b.ne 0x0083e818
0083e24c	bl 0x007fe124
0083e250	adrp x8,0x35e000
0083e254	add x8,x8,#0x9b2
0083e258	ldr q0,[x8]
0083e25c	ldur x8,[x8, #0xe]
0083e260	stur q0,[x29, #-0x30]
0083e264	stur x8,[x29, #-0x22]
0083e268	adrp x8,0xd1e000
0083e26c	add x8,x8,#0x4b8
0083e270	ldarb w8,[x8]
0083e274	tbz w8,#0x0,0x0083e670
0083e278	adrp x8,0xd1e000
0083e27c	ldrb w8,[x8, #0x4b6]
0083e280	cmp w8,#0x1
0083e284	b.ne 0x0083e2e4
0083e288	adrp x8,0xd1e000
0083e28c	add x8,x8,#0x4a0
0083e290	adrp x9,0x29b000
0083e294	ldr s0,[x8, #0x10]
0083e298	ldr d1,[x9, #0x450]
0083e29c	adrp x9,0x29c000
0083e2a0	ldr q2,[x8]
0083e2a4	mov w10,#0x4f
0083e2a8	ldrb w11,[x8, #0x15]
0083e2ac	uxtl v0.8H,v0.8B
0083e2b0	strb wzr,[x8, #0x16]
0083e2b4	eor v0.8B,v0.8B,v1.8B
0083e2b8	ldr q1,[x9, #0xe0]
0083e2bc	ldrb w9,[x8, #0x14]
0083e2c0	eor v1.16B,v2.16B,v1.16B
0083e2c4	eor w9,w9,w10
0083e2c8	mov w10,#0xa7
0083e2cc	uzp1 v0.8B,v0.8B,v0.8B
0083e2d0	eor w10,w11,w10
0083e2d4	strb w9,[x8, #0x14]
0083e2d8	strb w10,[x8, #0x15]
0083e2dc	str q1,[x8]
0083e2e0	str s0,[x8, #0x10]
0083e2e4	mov x0,x19
0083e2e8	mov w1,#0x1
0083e2ec	bl 0x008aee78
0083e2f0	adrp x1,0x2b6000
0083e2f4	add x1,x1,#0xc62
0083e2f8	adrp x2,0xd1e000
0083e2fc	add x2,x2,#0x4a0
0083e300	mov x0,x19
0083e304	bl 0x008ac684
0083e308	mov x0,x19
0083e30c	mov w1,#0x2
0083e310	bl 0x008ae364
0083e314	ldr x8,[x25, #0x28]
0083e318	ldur x9,[x29, #-0x8]
0083e31c	cmp x8,x9
0083e320	b.ne 0x0083e818
0083e324	mov x0,x19
0083e328	bl 0x008aa5f4
0083e32c	adrp x8,0x35e000
0083e330	add x8,x8,#0x9c8
0083e334	ldr q0,[x8]
0083e338	ldur x8,[x8, #0xe]
0083e33c	stur q0,[x29, #-0x30]
0083e340	stur x8,[x29, #-0x22]
0083e344	adrp x8,0xd1e000
0083e348	add x8,x8,#0x4d8
0083e34c	ldarb w8,[x8]
0083e350	tbz w8,#0x0,0x0083e6bc
0083e354	adrp x8,0xd1e000
0083e358	ldrb w8,[x8, #0x4d6]
0083e35c	cmp w8,#0x1
0083e360	b.ne 0x0083e3bc
0083e364	adrp x8,0xd1e000
0083e368	add x8,x8,#0x4c0
0083e36c	adrp x9,0x29a000
0083e370	ldr s0,[x8, #0x10]
0083e374	ldr d1,[x9, #0x2d8]
0083e378	adrp x9,0x29c000
0083e37c	ldr q2,[x9, #0x260]
0083e380	ldrb w10,[x8, #0x14]
0083e384	ldrb w11,[x8, #0x15]
0083e388	uxtl v0.8H,v0.8B
0083e38c	mov w9,#0xd1
0083e390	strb wzr,[x8, #0x16]
0083e394	eor w9,w10,w9
0083e398	eor w10,w11,#0xfffffffb
0083e39c	strb w9,[x8, #0x14]
0083e3a0	eor v0.8B,v0.8B,v1.8B
0083e3a4	ldr q1,[x8]
0083e3a8	strb w10,[x8, #0x15]
0083e3ac	eor v1.16B,v1.16B,v2.16B
0083e3b0	uzp1 v0.8B,v0.8B,v0.8B
0083e3b4	str q1,[x8]
0083e3b8	str s0,[x8, #0x10]
0083e3bc	mov x0,x19
0083e3c0	mov w1,#0x1
0083e3c4	bl 0x008aee78
0083e3c8	adrp x1,0x2b6000
0083e3cc	add x1,x1,#0xc62
0083e3d0	adrp x2,0xd1e000
0083e3d4	add x2,x2,#0x4c0
0083e3d8	mov x0,x19
0083e3dc	bl 0x008ac684
0083e3e0	mov x0,x19
0083e3e4	mov w1,#0x2
0083e3e8	bl 0x008ae364
0083e3ec	ldr x8,[x25, #0x28]
0083e3f0	ldur x9,[x29, #-0x8]
0083e3f4	cmp x8,x9
0083e3f8	b.ne 0x0083e818
0083e3fc	mov x0,x19
0083e400	bl 0x008aa5f4
0083e404	adrp x8,0x35e000
0083e408	add x8,x8,#0x9de
0083e40c	ldr q0,[x8]
0083e410	ldur q1,[x8, #0xe]
0083e414	adrp x8,0xd1e000
0083e418	add x8,x8,#0x500
0083e41c	stur q0,[x29, #-0x30]
0083e420	stur q1,[x29, #-0x22]
0083e424	ldarb w8,[x8]
0083e428	tbz w8,#0x0,0x0083e708
0083e42c	adrp x8,0xd1e000
0083e430	ldrb w8,[x8, #0x4fe]
0083e434	cmp w8,#0x1
0083e438	b.ne 0x0083e4c8
0083e43c	adrp x8,0xd1e000
0083e440	add x8,x8,#0x4e0
0083e444	adrp x9,0x29b000
0083e448	ldp d1,d2,[x8]
0083e44c	ldr d0,[x9, #0x88]
0083e450	ldrb w9,[x8, #0x18]
0083e454	ldrb w10,[x8, #0x19]
0083e458	mov w11,#0x91
0083e45c	mov w12,#0xd3
0083e460	strb wzr,[x8, #0x1e]
0083e464	eor v1.8B,v1.8B,v0.8B
0083e468	eor v2.8B,v2.8B,v0.8B
0083e46c	eor w9,w9,w11
0083e470	eor w10,w10,w12
0083e474	strb w9,[x8, #0x18]
0083e478	ldrb w9,[x8, #0x1a]
0083e47c	strb w10,[x8, #0x19]
0083e480	ldrb w10,[x8, #0x1b]
0083e484	stp d1,d2,[x8]
0083e488	ldr d1,[x8, #0x10]
0083e48c	eor w9,w9,w11
0083e490	mov w11,#0x4d
0083e494	strb w9,[x8, #0x1a]
0083e498	eor w9,w10,w11
0083e49c	ldrb w10,[x8, #0x1c]
0083e4a0	eor v0.8B,v1.8B,v0.8B
0083e4a4	strb w9,[x8, #0x1b]
0083e4a8	mov w9,#0x7d
0083e4ac	ldrb w11,[x8, #0x1d]
0083e4b0	eor w9,w10,w9
0083e4b4	mov w10,#0xe5
0083e4b8	strb w9,[x8, #0x1c]
0083e4bc	eor w9,w11,w10
0083e4c0	str d0,[x8, #0x10]
0083e4c4	strb w9,[x8, #0x1d]
0083e4c8	mov x0,x19
0083e4cc	mov w1,#0x1
0083e4d0	bl 0x008aee78
0083e4d4	adrp x1,0x2b6000
0083e4d8	add x1,x1,#0xc62
0083e4dc	adrp x2,0xd1e000
0083e4e0	add x2,x2,#0x4e0
0083e4e4	mov x0,x19
0083e4e8	bl 0x008ac684
0083e4ec	mov x0,x19
0083e4f0	mov w1,#0x2
0083e4f4	bl 0x008ae364
0083e4f8	ldr x8,[x25, #0x28]
0083e4fc	ldur x9,[x29, #-0x8]
0083e500	cmp x8,x9
0083e504	b.ne 0x0083e818
0083e508	mov x0,x19
0083e50c	bl 0x008aa5f4
0083e510	adrp x0,0xd1e000
0083e514	add x0,x0,#0x3e8
0083e518	bl 0x00c2fe90
0083e51c	cbz w0,0x0083dc20
0083e520	adrp x8,0x29a000
0083e524	adrp x10,0x29b000
0083e528	mov w9,#0x1
0083e52c	ldr d0,[x8, #0x528]
0083e530	ldr d1,[x10, #0xd30]
0083e534	nop
0083e538	adr x0,0x83ebc8
0083e53c	adrp x2,0xc48000
0083e540	add x2,x2,#0x880
0083e544	mov x1,x22
0083e548	strb w9,[x22, #0xc]
0083e54c	str d0,[x22]
0083e550	str s1,[x22, #0x8]
0083e554	bl 0x00c2fe70
0083e558	adrp x0,0xd1e000
0083e55c	add x0,x0,#0x3e8
0083e560	bl 0x00c2fea0
0083e564	b 0x0083dc20
0083e568	adrp x0,0xd1e000
0083e56c	add x0,x0,#0x400
0083e570	bl 0x00c2fe90
0083e574	cbz w0,0x0083dc94
0083e578	adrp x8,0x29b000
0083e57c	adrp x9,0x29b000
0083e580	nop
0083e584	adr x0,0x83ebd4
0083e588	ldr d0,[x8, #0x158]
0083e58c	ldr d1,[x9, #0x898]
0083e590	mov w8,#0x133
0083e594	adrp x2,0xc48000
0083e598	add x2,x2,#0x880
0083e59c	mov x1,x22
0083e5a0	str d0,[x22]
0083e5a4	str s1,[x22, #0x8]
0083e5a8	strh w8,[x22, #0xc]
0083e5ac	bl 0x00c2fe70
0083e5b0	adrp x0,0xd1e000
0083e5b4	add x0,x0,#0x400
0083e5b8	bl 0x00c2fea0
0083e5bc	b 0x0083dc94
0083e5c0	adrp x0,0xd1e000
0083e5c4	add x0,x0,#0x468
0083e5c8	bl 0x00c2fe90
0083e5cc	cbz w0,0x0083e0a8
0083e5d0	adrp x9,0x35e000
0083e5d4	add x9,x9,#0x964
0083e5d8	mov w10,#0xe382
0083e5dc	ldp q0,q1,[x9]
0083e5e0	ldr q2,[x9, #0x20]
0083e5e4	mov w8,#0x1
0083e5e8	movk w10,#0xf76e, LSL #16
0083e5ec	nop
0083e5f0	adr x0,0x83ecdc
0083e5f4	adrp x2,0xc48000
0083e5f8	add x2,x2,#0x880
0083e5fc	mov x1,x20
0083e600	strb w8,[x20, #0x33]
0083e604	stur w10,[x20, #0x2f]
0083e608	stp q0,q1,[x20]
0083e60c	str q2,[x20, #0x20]
0083e610	bl 0x00c2fe70
0083e614	adrp x0,0xd1e000
0083e618	add x0,x0,#0x468
0083e61c	bl 0x00c2fea0
0083e620	b 0x0083e0a8
0083e624	adrp x0,0xd1e000
0083e628	add x0,x0,#0x490
0083e62c	bl 0x00c2fe90
0083e630	cbz w0,0x0083e188
0083e634	adrp x0,0xd1e000
0083e638	add x0,x0,#0x470
0083e63c	sub x1,x29,#0x30
0083e640	bl 0x0083ecf0
0083e644	nop
0083e648	adr x0,0x83edd4
0083e64c	adrp x1,0xd1e000
0083e650	add x1,x1,#0x470
0083e654	adrp x2,0xc48000
0083e658	add x2,x2,#0x880
0083e65c	bl 0x00c2fe70
0083e660	adrp x0,0xd1e000
0083e664	add x0,x0,#0x490
0083e668	bl 0x00c2fea0
0083e66c	b 0x0083e188
0083e670	adrp x0,0xd1e000
0083e674	add x0,x0,#0x4b8
0083e678	bl 0x00c2fe90
0083e67c	cbz w0,0x0083e278
0083e680	adrp x0,0xd1e000
0083e684	add x0,x0,#0x4a0
0083e688	sub x1,x29,#0x30
0083e68c	bl 0x0083ede4
0083e690	nop
0083e694	adr x0,0x83eea0
0083e698	adrp x1,0xd1e000
0083e69c	add x1,x1,#0x4a0
0083e6a0	adrp x2,0xc48000
0083e6a4	add x2,x2,#0x880
0083e6a8	bl 0x00c2fe70
0083e6ac	adrp x0,0xd1e000
0083e6b0	add x0,x0,#0x4b8
0083e6b4	bl 0x00c2fea0
0083e6b8	b 0x0083e278
0083e6bc	adrp x0,0xd1e000
0083e6c0	add x0,x0,#0x4d8
0083e6c4	bl 0x00c2fe90
0083e6c8	cbz w0,0x0083e354
0083e6cc	adrp x0,0xd1e000
0083e6d0	add x0,x0,#0x4c0
0083e6d4	sub x1,x29,#0x30
0083e6d8	bl 0x0083eeac
0083e6dc	nop
0083e6e0	adr x0,0x83ef68
0083e6e4	adrp x1,0xd1e000
0083e6e8	add x1,x1,#0x4c0
0083e6ec	adrp x2,0xc48000
0083e6f0	add x2,x2,#0x880
0083e6f4	bl 0x00c2fe70
0083e6f8	adrp x0,0xd1e000
0083e6fc	add x0,x0,#0x4d8
0083e700	bl 0x00c2fea0
0083e704	b 0x0083e354
0083e708	adrp x0,0xd1e000
0083e70c	add x0,x0,#0x500
0083e710	bl 0x00c2fe90
0083e714	cbz w0,0x0083e42c
0083e718	adrp x0,0xd1e000
0083e71c	add x0,x0,#0x4e0
0083e720	sub x1,x29,#0x30
0083e724	bl 0x0083ef74
0083e728	nop
0083e72c	adr x0,0x83f070
0083e730	adrp x1,0xd1e000
0083e734	add x1,x1,#0x4e0
0083e738	adrp x2,0xc48000
0083e73c	add x2,x2,#0x880
0083e740	bl 0x00c2fe70
0083e744	adrp x0,0xd1e000
0083e748	add x0,x0,#0x500
0083e74c	bl 0x00c2fea0
0083e750	b 0x0083e42c
0083e818	bl 0x00c2fec0
