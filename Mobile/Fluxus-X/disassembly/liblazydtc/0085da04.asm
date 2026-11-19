; FUN_0085da04 @ 0085da04
0085da04	stp x29,x30,[sp, #-0x60]!
0085da08	stp x28,x27,[sp, #0x10]
0085da0c	stp x26,x25,[sp, #0x20]
0085da10	stp x24,x23,[sp, #0x30]
0085da14	stp x22,x21,[sp, #0x40]
0085da18	stp x20,x19,[sp, #0x50]
0085da1c	mov x29,sp
0085da20	sub sp,sp,#0x1e0
0085da24	str w3,[sp, #0x50]
0085da28	mov x19,x0
0085da2c	mov w21,w2
0085da30	str x1,[sp, #0x58]
0085da34	mrs x24,tpidr_el0
0085da38	mov x22,x0
0085da3c	ldr x8,[x24, #0x28]
0085da40	sub x25,x29,#0xc8
0085da44	stur x8,[x29, #-0x18]
0085da48	ldr w8,[x19, #0x90]!
0085da4c	cmp w8,#0x119
0085da50	b.ne 0x0085da6c
0085da54	ldur q0,[x19, #0x4]
0085da58	ldr x20,[x22, #0xa8]
0085da5c	mov x0,x22
0085da60	stur q0,[x25, #0x8]
0085da64	bl 0x00858f2c
0085da68	b 0x0085da88
0085da6c	adrp x1,0x29f000
0085da70	add x1,x1,#0x209
0085da74	mov x0,x22
0085da78	bl 0x0086e040
0085da7c	ldur q0,[x19, #0x4]
0085da80	ldr x20,[x22, #0x138]
0085da84	stur q0,[x25, #0x8]
0085da88	ldr w8,[x19]
0085da8c	mov w9,#0x1
0085da90	stur x20,[x29, #-0xc8]
0085da94	sturb w9,[x29, #-0xb0]
0085da98	cmp w8,#0x119
0085da9c	b.ne 0x0085dab8
0085daa0	ldr x0,[x22, #0xa8]
0085daa4	cbz x0,0x0085dabc
0085daa8	adrp x1,0x2d0000
0085daac	add x1,x1,#0xbb1
0085dab0	bl 0x00c301f0
0085dab4	cbz w0,0x0085e748
0085dab8	mov x0,xzr
0085dabc	str x24,[sp, #0x60]
0085dac0	str w21,[sp, #0x54]
0085dac4	str x0,[sp, #0x48]
0085dac8	cbz w21,0x0085e56c
0085dacc	ldur x8,[x29, #-0xb8]
0085dad0	and w9,w21,#0xfffffffe
0085dad4	ldr q0,[x25]
0085dad8	cmp w9,#0x2
0085dadc	add x0,x22,#0x180
0085dae0	sub x1,x29,#0x90
0085dae4	stur x8,[x29, #-0x80]
0085dae8	cset w8,eq
0085daec	stp xzr,xzr,[x29, #-0x78]
0085daf0	stur q0,[x29, #-0x90]
0085daf4	sturb w8,[x29, #-0x68]
0085daf8	bl 0x0086e18c
0085dafc	ldp x8,x21,[x22, #0x158]
0085db00	mov x20,x0
0085db04	ldr x0,[x22, #0xe8]
0085db08	mov w1,#0x40
0085db0c	sub x8,x21,x8
0085db10	asr x8,x8,#0x3
0085db14	sub x23,x8,#0x1
0085db18	bl 0x0084e938
0085db1c	ldur x8,[x29, #-0x90]
0085db20	ldur x9,[x29, #-0x78]
0085db24	mov x1,x20
0085db28	ldr x10,[x20]
0085db2c	ldur w11,[x21, #-0x4]
0085db30	ldurb w12,[x29, #-0x68]
0085db34	str x8,[x0]
0085db38	ldur q0,[x25, #0x40]
0085db3c	stp x10,x23,[x0, #0x18]
0085db40	str x11,[x0, #0x28]
0085db44	strb w12,[x0, #0x30]
0085db48	stur q0,[x0, #0x8]
0085db4c	strb wzr,[x0, #0x31]
0085db50	str x9,[x0, #0x38]
0085db54	str x0,[x20]
0085db58	add x0,x22,#0x1b8
0085db5c	bl 0x0086e2d0
0085db60	ldr x8,[x20]
0085db64	stp xzr,x8,[sp, #0x70]
0085db68	ldr x9,[x22, #0x3b0]
0085db6c	ldr x10,[x22, #0x3a8]
0085db70	mov x11,#0x8ba3
0085db74	movk x11,#0xba2e, LSL #16
0085db78	add x8,x22,#0x3a8
0085db7c	movi v0.2D,#0x0
0085db80	sub x9,x9,x10
0085db84	movk x11,#0xa2e8, LSL #32
0085db88	mov w10,#0x40
0085db8c	asr x9,x9,#0x3
0085db90	movk x11,#0x2e8b, LSL #48
0085db94	strb w10,[sp, #0x110]
0085db98	add x12,sp,#0xe0
0085db9c	adrp x26,0x2ab000
0085dba0	add x26,x26,#0x34f
0085dba4	mul x9,x9,x11
0085dba8	orr x12,x12,#0x8
0085dbac	adrp x27,0x29f000
0085dbb0	add x27,x27,#0x214
0085dbb4	adrp x25,0x2d4000
0085dbb8	add x25,x25,#0xdce
0085dbbc	adrp x24,0xc4a000
0085dbc0	add x24,x24,#0x6d8
0085dbc4	adrp x28,0x2d4000
0085dbc8	add x28,x28,#0xd1f
0085dbcc	str xzr,[sp, #0x88]
0085dbd0	str xzr,[sp, #0x68]
0085dbd4	stp x8,x9,[sp, #0xa8]
0085dbd8	add x9,sp,#0xc0
0085dbdc	sub x8,x29,#0x90
0085dbe0	orr x10,x8,#0x1
0085dbe4	orr x8,x9,#0x4
0085dbe8	str xzr,[sp, #0xb8]
0085dbec	str x8,[sp, #0x30]
0085dbf0	sub x8,x29,#0xa4
0085dbf4	orr x8,x8,#0x3
0085dbf8	str x12,[sp, #0x40]
0085dbfc	stp q0,q0,[sp, #0xf0]
0085dc00	str q0,[sp, #0xe0]
0085dc04	stp x10,x8,[sp, #0x20]
0085dc08	mov w23,#0x1
0085dc0c	ldr w8,[x19]
0085dc10	cmp w8,#0x127
0085dc14	b.gt 0x0085dc78
0085dc18	cmp w8,#0x119
0085dc1c	b.ne 0x0085dcd4
0085dc20	ldr x21,[x22, #0xa8]
0085dc24	cbz x21,0x0085dcd8
0085dc28	mov x0,x21
0085dc2c	mov x1,x26
0085dc30	bl 0x00c301f0
0085dc34	mov w20,w0
0085dc38	cbz w0,0x0085dcf4
0085dc3c	mov x0,x21
0085dc40	mov x1,x27
0085dc44	bl 0x00c301f0
0085dc48	cbnz w0,0x0085dcd8
0085dc4c	ldur x8,[x22, #0x95]
0085dc50	ldur x9,[x22, #0x9c]
0085dc54	ldrb w21,[x22, #0x94]
0085dc58	stur x8,[x29, #-0x28]
0085dc5c	sub x8,x29,#0xc8
0085dc60	stur x9,[x8, #0xa7]
0085dc64	mov x0,x22
0085dc68	bl 0x00858f2c
0085dc6c	mov w8,#0x1
0085dc70	str w8,[sp, #0x84]
0085dc74	b 0x0085dd18
0085dc78	cmp w8,#0x128
0085dc7c	b.eq 0x0085e470
0085dc80	cmp w8,#0x12b
0085dc84	b.ne 0x0085dcd8
0085dc88	mov w20,wzr
0085dc8c	mov w21,wzr
0085dc90	str wzr,[sp, #0x84]
0085dc94	ldp q0,q1,[x19]
0085dc98	stp q0,q1,[sp, #0xc0]
0085dc9c	mov x0,x22
0085dca0	bl 0x00858f2c
0085dca4	ldr w8,[x19]
0085dca8	str w20,[sp, #0x1c]
0085dcac	str w21,[sp, #0x3c]
0085dcb0	cmp w8,#0x119
0085dcb4	b.ne 0x0085dd2c
0085dcb8	ldur q0,[x22, #0x94]
0085dcbc	ldr x20,[x22, #0xa8]
0085dcc0	add x8,sp,#0x90
0085dcc4	stur q0,[x8, #0x8]
0085dcc8	mov x0,x22
0085dccc	bl 0x00858f2c
0085dcd0	b 0x0085dd48
0085dcd4	cbz w8,0x0085e470
0085dcd8	add x1,x22,#0x94
0085dcdc	mov x0,x22
0085dce0	mov x2,x28
0085dce4	bl 0x00860ecc
0085dce8	mov x0,x22
0085dcec	bl 0x00858f2c
0085dcf0	b 0x0085dc0c
0085dcf4	ldur x8,[x22, #0x95]
0085dcf8	ldur x9,[x22, #0x9c]
0085dcfc	ldrb w21,[x22, #0x94]
0085dd00	stur x8,[x29, #-0x28]
0085dd04	sub x8,x29,#0xc8
0085dd08	stur x9,[x8, #0xa7]
0085dd0c	mov x0,x22
0085dd10	bl 0x00858f2c
0085dd14	str wzr,[sp, #0x84]
0085dd18	ldr w8,[x19]
0085dd1c	cmp w8,#0x12b
0085dd20	b.ne 0x0085e174
0085dd24	mov w20,#0x1
0085dd28	b 0x0085dc94
0085dd2c	mov x0,x22
0085dd30	adrp x1,0x2b8000
0085dd34	add x1,x1,#0xe31
0085dd38	bl 0x0086e040
0085dd3c	ldur x8,[x22, #0x94]
0085dd40	ldr x20,[x22, #0x138]
0085dd44	stp x8,x8,[sp, #0x98]
0085dd48	ldr x8,[x22, #0x1e8]
0085dd4c	str x20,[sp, #0x90]
0085dd50	stp xzr,xzr,[x29, #-0x90]
0085dd54	ldr w9,[x8, #0x4a0]
0085dd58	add w9,w9,#0x1
0085dd5c	str w9,[x8, #0x4a0]
0085dd60	ldrb w21,[x22, #0x178]
0085dd64	strb w23,[x22, #0x178]
0085dd68	add x2,sp,#0xc0
0085dd6c	add x3,sp,#0x90
0085dd70	sub x5,x29,#0x90
0085dd74	mov x0,x22
0085dd78	mov w1,wzr
0085dd7c	mov x4,xzr
0085dd80	mov w6,wzr
0085dd84	mov x7,xzr
0085dd88	bl 0x00863248
0085dd8c	ldr x8,[x22, #0x1e8]
0085dd90	strb w21,[x22, #0x178]
0085dd94	mov x20,x0
0085dd98	ldr w9,[x8, #0x4a0]
0085dd9c	sub w9,w9,#0x1
0085dda0	str w9,[x8, #0x4a0]
0085dda4	ldr x8,[x0, #0x60]
0085dda8	cbz x8,0x0085dde8
0085ddac	ldr x8,[x20, #0x58]
0085ddb0	ldr x21,[x8]
0085ddb4	ldr x0,[x21]
0085ddb8	cbz x0,0x0085dde8
0085ddbc	adrp x1,0x29d000
0085ddc0	add x1,x1,#0x412
0085ddc4	bl 0x00c301f0
0085ddc8	cbnz w0,0x0085dde8
0085ddcc	ldr x8,[x21, #0x38]
0085ddd0	cbz x8,0x0085dde8
0085ddd4	add x1,x8,#0xc
0085ddd8	mov x0,x22
0085dddc	adrp x2,0x2c2000
0085dde0	add x2,x2,#0xd8f
0085dde4	bl 0x00860ecc
0085dde8	ldr x21,[sp, #0x90]
0085ddec	ldr w9,[sp, #0x84]
0085ddf0	ldrb w8,[x21]
0085ddf4	cbz w9,0x0085de20
0085ddf8	cmp w8,#0x5f
0085ddfc	b.ne 0x0085de64
0085de00	ldrb w8,[x21, #0x1]
0085de04	cmp w8,#0x5f
0085de08	b.ne 0x0085df20
0085de0c	adrp x2,0x2b6000
0085de10	add x2,x2,#0xc62
0085de14	adrp x3,0x2d2000
0085de18	add x3,x3,#0xc89
0085de1c	b 0x0085df10
0085de20	cmp w8,#0x5f
0085de24	b.ne 0x0085df20
0085de28	ldrb w8,[x21, #0x1]
0085de2c	cmp w8,#0x5f
0085de30	b.ne 0x0085de74
0085de34	mov x0,x21
0085de38	bl 0x00c2ff50
0085de3c	cmn x0,#0x8
0085de40	b.cs 0x0085e894
0085de44	mov x23,x0
0085de48	cmp x0,#0x17
0085de4c	b.cs 0x0085de88
0085de50	lsl w8,w23,#0x1
0085de54	ldr x25,[sp, #0x20]
0085de58	sturb w8,[x29, #-0x90]
0085de5c	cbnz x23,0x0085deb4
0085de60	b 0x0085dec4
0085de64	adrp x2,0x2b6000
0085de68	add x2,x2,#0xc62
0085de6c	mov x3,x25
0085de70	b 0x0085df10
0085de74	adrp x2,0x2b6000
0085de78	add x2,x2,#0xc62
0085de7c	adrp x3,0x2d8000
0085de80	add x3,x3,#0xf06
0085de84	b 0x0085df10
0085de88	orr x8,x23,#0x7
0085de8c	mov w9,#0x1a
0085de90	cmp x8,#0x17
0085de94	csinc x0,x9,x8,eq
0085de98	str x0,[sp, #0x10]
0085de9c	bl 0x00c2fed0
0085dea0	ldr x8,[sp, #0x10]
0085dea4	mov x25,x0
0085dea8	stp x23,x0,[x29, #-0x88]
0085deac	orr x8,x8,#0x1
0085deb0	stur x8,[x29, #-0x90]
0085deb4	mov x0,x25
0085deb8	mov x1,x21
0085debc	mov x2,x23
0085dec0	bl 0x00c2ff60
0085dec4	sub x1,x29,#0x90
0085dec8	adrp x0,0xd1e000
0085decc	add x0,x0,#0xe98
0085ded0	strb wzr,[x25, x23]
0085ded4	bl 0x00871a60
0085ded8	ldurb w8,[x29, #-0x90]
0085dedc	mov x21,x0
0085dee0	tbz w8,#0x0,0x0085def4
0085dee4	ldur x8,[x29, #-0x90]
0085dee8	ldur x0,[x29, #-0x80]
0085deec	and x1,x8,#-0x2
0085def0	bl 0x00c2fe80
0085def4	adrp x25,0x2d4000
0085def8	add x25,x25,#0xdce
0085defc	mov w23,#0x1
0085df00	cbz x21,0x0085e0b4
0085df04	ldr x3,[sp, #0x90]
0085df08	adrp x2,0x2c8000
0085df0c	add x2,x2,#0xb0e
0085df10	add x8,sp,#0x90
0085df14	mov x0,x22
0085df18	add x1,x8,#0x8
0085df1c	bl 0x00860ecc
0085df20	ldr x8,[sp, #0x108]
0085df24	cbz x8,0x0085df94
0085df28	ldr x3,[sp, #0x90]
0085df2c	mov x9,#0x7c15
0085df30	movk x9,#0x7f4a, LSL #16
0085df34	lsr x8,x3,#0x4
0085df38	movk x9,#0x79b9, LSL #32
0085df3c	movk x9,#0x9e37, LSL #48
0085df40	eor x8,x8,x3, LSR #0x9
0085df44	mul x8,x8,x9
0085df48	ldrb w9,[sp, #0x110]
0085df4c	lsr x9,x8,x9
0085df50	ldr x8,[sp, #0xf8]
0085df54	lsr x10,x9,#0x6
0085df58	ldr x10,[x8, x10, LSL #0x3]
0085df5c	lsr x10,x10,x9
0085df60	tbz w10,#0x0,0x0085df94
0085df64	ldr x11,[sp, #0x100]
0085df68	ldr x10,[sp, #0xe0]
0085df6c	sub x11,x11,#0x1
0085df70	ldr x12,[x10, x9, LSL #0x3]
0085df74	cmp x12,x3
0085df78	b.eq 0x0085e098
0085df7c	add x9,x9,#0x1
0085df80	and x9,x9,x11
0085df84	lsr x12,x9,#0x6
0085df88	ldr x12,[x8, x12, LSL #0x3]
0085df8c	lsr x12,x12,x9
0085df90	tbnz w12,#0x0,0x0085df70
0085df94	add x0,sp,#0xe0
0085df98	add x1,sp,#0x90
0085df9c	bl 0x00864920
0085dfa0	ldp x8,x9,[sp, #0x28]
0085dfa4	sub x11,x29,#0x90
0085dfa8	sub x10,x29,#0xc8
0085dfac	ldr x21,[sp, #0xa8]
0085dfb0	stur x20,[x29, #-0x48]
0085dfb4	stur w23,[x29, #-0x90]
0085dfb8	ldr q0,[x9]
0085dfbc	ldur x9,[x10, #0xa7]
0085dfc0	str q0,[x8]
0085dfc4	add x8,sp,#0x90
0085dfc8	ldur q0,[x8, #0x8]
0085dfcc	ldr w8,[sp, #0x3c]
0085dfd0	sturb w8,[x29, #-0x88]
0085dfd4	ldur x8,[x29, #-0x28]
0085dfd8	stur q0,[x11, #0x38]
0085dfdc	ldur q0,[x10, #0x24]
0085dfe0	stur x8,[x11, #0x9]
0085dfe4	ldr w8,[sp, #0x1c]
0085dfe8	stur x9,[x11, #0x10]
0085dfec	ldr x9,[sp, #0x90]
0085dff0	sturb w8,[x29, #-0x78]
0085dff4	ldur w8,[x10, #0x33]
0085dff8	stur q0,[x11, #0x19]
0085dffc	stur w8,[x11, #0x28]
0085e000	ldr w8,[sp, #0x84]
0085e004	stur x9,[x29, #-0x60]
0085e008	stur w8,[x29, #-0x40]
0085e00c	ldp x8,x9,[x21, #0x8]
0085e010	cmp x8,x9
0085e014	b.cs 0x0085e050
0085e018	str w23,[x8]
0085e01c	add x0,x8,#0x58
0085e020	ldur q0,[x11, #0x8]
0085e024	stur q0,[x8, #0x8]
0085e028	ldur q0,[x11, #0x48]
0085e02c	ldur q1,[x11, #0x38]
0085e030	ldur q2,[x11, #0x18]
0085e034	ldur q3,[x11, #0x28]
0085e038	stur q0,[x8, #0x48]
0085e03c	stur q1,[x8, #0x38]
0085e040	stur q3,[x8, #0x28]
0085e044	stur q2,[x8, #0x18]
0085e048	str x0,[x21, #0x8]
0085e04c	b 0x0085e060
0085e050	sub x1,x29,#0x90
0085e054	mov x0,x21
0085e058	sub x20,x29,#0x90
0085e05c	bl 0x00871764
0085e060	str x0,[x21, #0x8]
0085e064	ldursw x9,[x29, #-0x90]
0085e068	sub x10,x29,#0x90
0085e06c	ldr x8,[sp, #0xb8]
0085e070	ldr x9,[x24, x9, LSL #0x3]
0085e074	add x8,x8,#0x1
0085e078	str x8,[sp, #0xb8]
0085e07c	add x0,x10,#0x8
0085e080	blr x9
0085e084	ldr x8,[sp, #0x88]
0085e088	ldr w9,[sp, #0x84]
0085e08c	add x8,x8,w9, UXTW 
0085e090	str x8,[sp, #0x88]
0085e094	b 0x0085dc0c
0085e098	add x8,sp,#0x90
0085e09c	mov x0,x22
0085e0a0	adrp x2,0x29d000
0085e0a4	add x2,x2,#0x475
0085e0a8	add x1,x8,#0x8
0085e0ac	bl 0x00860ecc
0085e0b0	b 0x0085dc0c
0085e0b4	ldr x23,[sp, #0x90]
0085e0b8	mov x0,x23
0085e0bc	bl 0x00c2ff50
0085e0c0	cmn x0,#0x8
0085e0c4	b.cs 0x0085e8ac
0085e0c8	mov x21,x0
0085e0cc	cmp x0,#0x17
0085e0d0	str x23,[sp, #0x10]
0085e0d4	b.cs 0x0085e0ec
0085e0d8	lsl w8,w21,#0x1
0085e0dc	ldr x23,[sp, #0x20]
0085e0e0	sturb w8,[x29, #-0x90]
0085e0e4	cbnz x21,0x0085e11c
0085e0e8	b 0x0085e12c
0085e0ec	orr x8,x21,#0x7
0085e0f0	mov w9,#0x1a
0085e0f4	cmp x8,#0x17
0085e0f8	csinc x25,x9,x8,eq
0085e0fc	mov x0,x25
0085e100	bl 0x00c2fed0
0085e104	orr x8,x25,#0x1
0085e108	mov x23,x0
0085e10c	stp x21,x0,[x29, #-0x88]
0085e110	stur x8,[x29, #-0x90]
0085e114	adrp x25,0x2d4000
0085e118	add x25,x25,#0xdce
0085e11c	ldr x1,[sp, #0x10]
0085e120	mov x0,x23
0085e124	mov x2,x21
0085e128	bl 0x00c2ff60
0085e12c	sub x1,x29,#0x90
0085e130	adrp x0,0xd1e000
0085e134	add x0,x0,#0xe70
0085e138	strb wzr,[x23, x21]
0085e13c	bl 0x00871a60
0085e140	ldurb w8,[x29, #-0x90]
0085e144	mov x21,x0
0085e148	tbz w8,#0x0,0x0085e15c
0085e14c	ldur x8,[x29, #-0x90]
0085e150	ldur x0,[x29, #-0x80]
0085e154	and x1,x8,#-0x2
0085e158	bl 0x00c2fe80
0085e15c	mov w23,#0x1
0085e160	cbnz x21,0x0085df20
0085e164	ldr x3,[sp, #0x90]
0085e168	adrp x2,0x2da000
0085e16c	add x2,x2,#0xef4
0085e170	b 0x0085df10
0085e174	str w21,[sp, #0x3c]
0085e178	mov w21,#0x1
0085e17c	cmp w8,#0x119
0085e180	b.ne 0x0085e240
0085e184	ldur q0,[x22, #0x94]
0085e188	ldr x23,[x22, #0xa8]
0085e18c	add x8,sp,#0xc0
0085e190	stur q0,[x8, #0x8]
0085e194	mov x0,x22
0085e198	bl 0x00858f2c
0085e19c	ldr w8,[x19]
0085e1a0	str x23,[sp, #0xc0]
0085e1a4	strb w21,[sp, #0xd8]
0085e1a8	cmp w8,#0x3a
0085e1ac	b.ne 0x0085e254
0085e1b0	ldur x8,[x22, #0x95]
0085e1b4	ldur x9,[x22, #0x9c]
0085e1b8	ldrb w23,[x22, #0x94]
0085e1bc	stur x8,[x29, #-0x38]
0085e1c0	sub x8,x29,#0xc8
0085e1c4	stur x9,[x8, #0x97]
0085e1c8	mov x0,x22
0085e1cc	bl 0x00858f2c
0085e1d0	ldr w8,[x22, #0x90]
0085e1d4	ldur q0,[x22, #0x94]
0085e1d8	mov x1,xzr
0085e1dc	ldr w9,[x22, #0x124]
0085e1e0	cmp w8,#0x26
0085e1e4	stur q0,[x29, #-0x90]
0085e1e8	str w9,[sp, #0x10]
0085e1ec	b.eq 0x0085e214
0085e1f0	cmp w8,#0x7c
0085e1f4	b.eq 0x0085e214
0085e1f8	mov x0,x22
0085e1fc	mov w1,wzr
0085e200	mov w2,wzr
0085e204	bl 0x008695d4
0085e208	mov x1,x0
0085e20c	ldr w8,[sp, #0x10]
0085e210	str w8,[x22, #0x124]
0085e214	sub x2,x29,#0x90
0085e218	mov x0,x22
0085e21c	bl 0x00867310
0085e220	ldr w8,[sp, #0x10]
0085e224	str w23,[sp, #0x1c]
0085e228	mov x21,x0
0085e22c	ldr x23,[sp, #0xc0]
0085e230	str w8,[x22, #0x124]
0085e234	mov w8,#0x1
0085e238	str w8,[sp, #0x10]
0085e23c	b 0x0085e260
0085e240	mov x0,x22
0085e244	adrp x1,0x2c0000
0085e248	add x1,x1,#0xe49
0085e24c	bl 0x0086e040
0085e250	b 0x0085dc08
0085e254	str wzr,[sp, #0x1c]
0085e258	mov x21,xzr
0085e25c	str wzr,[sp, #0x10]
0085e260	ldrb w8,[x23]
0085e264	cmp w8,#0x5f
0085e268	cbz w20,0x0085e290
0085e26c	b.ne 0x0085e3f0
0085e270	ldrb w8,[x23, #0x1]
0085e274	cmp w8,#0x5f
0085e278	b.ne 0x0085e2bc
0085e27c	adrp x2,0x2b6000
0085e280	add x2,x2,#0xc62
0085e284	adrp x23,0x2d2000
0085e288	add x23,x23,#0xc89
0085e28c	b 0x0085e458
0085e290	b.ne 0x0085e2bc
0085e294	ldrb w8,[x23, #0x1]
0085e298	cmp w8,#0x5f
0085e29c	b.ne 0x0085e43c
0085e2a0	add x8,sp,#0xc0
0085e2a4	mov x0,x22
0085e2a8	adrp x2,0x2c2000
0085e2ac	add x2,x2,#0xd67
0085e2b0	add x1,x8,#0x8
0085e2b4	bl 0x00860ecc
0085e2b8	b 0x0085dc08
0085e2bc	ldr x8,[sp, #0x108]
0085e2c0	cbz x8,0x0085e32c
0085e2c4	lsr x8,x23,#0x4
0085e2c8	mov x9,#0x7c15
0085e2cc	movk x9,#0x7f4a, LSL #16
0085e2d0	eor x8,x8,x23, LSR #0x9
0085e2d4	movk x9,#0x79b9, LSL #32
0085e2d8	movk x9,#0x9e37, LSL #48
0085e2dc	mul x8,x8,x9
0085e2e0	ldrb w9,[sp, #0x110]
0085e2e4	lsr x9,x8,x9
0085e2e8	ldr x8,[sp, #0xf8]
0085e2ec	lsr x10,x9,#0x6
0085e2f0	ldr x10,[x8, x10, LSL #0x3]
0085e2f4	lsr x10,x10,x9
0085e2f8	tbz w10,#0x0,0x0085e32c
0085e2fc	ldr x11,[sp, #0x100]
0085e300	ldr x10,[sp, #0xe0]
0085e304	sub x11,x11,#0x1
0085e308	ldr x12,[x10, x9, LSL #0x3]
0085e30c	cmp x12,x23
0085e310	b.eq 0x0085e450
0085e314	add x9,x9,#0x1
0085e318	and x9,x9,x11
0085e31c	lsr x12,x9,#0x6
0085e320	ldr x12,[x8, x12, LSL #0x3]
0085e324	lsr x12,x12,x9
0085e328	tbnz w12,#0x0,0x0085e308
0085e32c	add x0,sp,#0xe0
0085e330	add x1,sp,#0xc0
0085e334	bl 0x00864920
0085e338	ldur x8,[x29, #-0x28]
0085e33c	sub x11,x29,#0x90
0085e340	ldr w9,[sp, #0x3c]
0085e344	sub x10,x29,#0xc8
0085e348	ldr x23,[sp, #0xa8]
0085e34c	stur x21,[x29, #-0x48]
0085e350	stur x8,[x11, #0x9]
0085e354	add x8,sp,#0xc0
0085e358	cmp w20,#0x0
0085e35c	ldur q0,[x8, #0x8]
0085e360	ldr x8,[sp, #0xc0]
0085e364	sturb w9,[x29, #-0x88]
0085e368	ldur x9,[x10, #0xa7]
0085e36c	ldr x20,[sp, #0x68]
0085e370	stur wzr,[x29, #-0x90]
0085e374	stur x8,[x29, #-0x78]
0085e378	ldur x8,[x29, #-0x38]
0085e37c	stur x9,[x11, #0x10]
0085e380	cinc x20,x20,ne
0085e384	ldr w9,[sp, #0x1c]
0085e388	stur x8,[x11, #0x31]
0085e38c	ldr w8,[sp, #0x10]
0085e390	sturb w9,[x29, #-0x60]
0085e394	ldur x9,[x10, #0x97]
0085e398	sturb w8,[x29, #-0x50]
0085e39c	ldr w8,[sp, #0x84]
0085e3a0	stur q0,[x11, #0x20]
0085e3a4	stur x9,[x11, #0x38]
0085e3a8	stur w8,[x29, #-0x40]
0085e3ac	ldp x8,x9,[x23, #0x8]
0085e3b0	cmp x8,x9
0085e3b4	b.cs 0x0085e400
0085e3b8	str wzr,[x8]
0085e3bc	add x0,x8,#0x58
0085e3c0	ldur q0,[x11, #0x8]
0085e3c4	stur q0,[x8, #0x8]
0085e3c8	ldur q0,[x11, #0x48]
0085e3cc	ldur q1,[x11, #0x38]
0085e3d0	ldur q2,[x11, #0x18]
0085e3d4	ldur q3,[x11, #0x28]
0085e3d8	stur q0,[x8, #0x48]
0085e3dc	stur q1,[x8, #0x38]
0085e3e0	stur q3,[x8, #0x28]
0085e3e4	stur q2,[x8, #0x18]
0085e3e8	str x0,[x23, #0x8]
0085e3ec	b 0x0085e414
0085e3f0	adrp x2,0x2b6000
0085e3f4	add x2,x2,#0xc62
0085e3f8	mov x23,x25
0085e3fc	b 0x0085e458
0085e400	sub x1,x29,#0x90
0085e404	mov x0,x23
0085e408	sub x21,x29,#0x90
0085e40c	bl 0x00871764
0085e410	sub x11,x29,#0x90
0085e414	str x0,[x23, #0x8]
0085e418	ldursw x9,[x29, #-0x90]
0085e41c	ldr x8,[sp, #0xb8]
0085e420	str x20,[sp, #0x68]
0085e424	ldr x9,[x24, x9, LSL #0x3]
0085e428	add x8,x8,#0x1
0085e42c	str x8,[sp, #0xb8]
0085e430	add x0,x11,#0x8
0085e434	blr x9
0085e438	b 0x0085dc08
0085e43c	adrp x2,0x2b6000
0085e440	add x2,x2,#0xc62
0085e444	adrp x23,0x2d8000
0085e448	add x23,x23,#0xf06
0085e44c	b 0x0085e458
0085e450	adrp x2,0x29d000
0085e454	add x2,x2,#0x475
0085e458	add x8,sp,#0xc0
0085e45c	mov x0,x22
0085e460	mov x3,x23
0085e464	add x1,x8,#0x8
0085e468	bl 0x00860ecc
0085e46c	b 0x0085dc08
0085e470	ldr x8,[sp, #0x68]
0085e474	cmp x8,#0x100
0085e478	b.cc 0x0085e498
0085e47c	sub x8,x29,#0xc8
0085e480	adrp x2,0x2da000
0085e484	add x2,x2,#0xf3c
0085e488	add x1,x8,#0x8
0085e48c	mov x0,x22
0085e490	mov w3,#0xff
0085e494	bl 0x00860ecc
0085e498	ldr x8,[sp, #0x88]
0085e49c	cmp x8,#0x100
0085e4a0	b.cc 0x0085e4c0
0085e4a4	sub x8,x29,#0xc8
0085e4a8	adrp x2,0x2d0000
0085e4ac	add x2,x2,#0xbb9
0085e4b0	add x1,x8,#0x8
0085e4b4	mov x0,x22
0085e4b8	mov w3,#0xff
0085e4bc	bl 0x00860ecc
0085e4c0	ldr w8,[x22, #0x90]
0085e4c4	ldur x19,[x22, #0x9c]
0085e4c8	cmp w8,#0x128
0085e4cc	b.ne 0x0085e4dc
0085e4d0	mov x0,x22
0085e4d4	bl 0x00858f2c
0085e4d8	b 0x0085e4f0
0085e4dc	adrp x2,0x2c4000
0085e4e0	add x2,x2,#0xb1f
0085e4e4	mov x0,x22
0085e4e8	mov w1,#0x128
0085e4ec	bl 0x0086e3b4
0085e4f0	ldr x8,[sp, #0x58]
0085e4f4	ldr x21,[sp, #0xb8]
0085e4f8	ldr x20,[x22, #0xe8]
0085e4fc	ldr x8,[x8]
0085e500	stp x8,x19,[x29, #-0x90]
0085e504	cbz x21,0x0085e5e4
0085e508	mov w8,#0x58
0085e50c	mul x1,x21,x8
0085e510	ldp x8,x19,[sp, #0xa8]
0085e514	ldr x23,[x8]
0085e518	mov x0,x20
0085e51c	bl 0x0084e938
0085e520	mov w8,#0x58
0085e524	mov x22,x0
0085e528	mov x25,x21
0085e52c	madd x8,x19,x8,x23
0085e530	add x23,x0,#0x8
0085e534	adrp x19,0xc4a000
0085e538	add x19,x19,#0x6f8
0085e53c	add x26,x8,#0x8
0085e540	ldursw x8,[x26, #-0x8]
0085e544	stur w8,[x23, #-0x8]
0085e548	ldr x8,[x19, x8, LSL #0x3]
0085e54c	mov x0,x23
0085e550	mov x1,x26
0085e554	blr x8
0085e558	subs x25,x25,#0x1
0085e55c	add x26,x26,#0x58
0085e560	add x23,x23,#0x58
0085e564	b.ne 0x0085e540
0085e568	b 0x0085e5e8
0085e56c	ldr x8,[x22, #0x1a8]
0085e570	cbz x8,0x0085e7a8
0085e574	lsr x8,x20,#0x4
0085e578	mov x9,#0x7c15
0085e57c	movk x9,#0x7f4a, LSL #16
0085e580	eor x8,x8,x20, LSR #0x9
0085e584	movk x9,#0x79b9, LSL #32
0085e588	movk x9,#0x9e37, LSL #48
0085e58c	mul x8,x8,x9
0085e590	ldrb w9,[x22, #0x1b0]
0085e594	lsr x8,x8,x9
0085e598	ldr x9,[x22, #0x198]
0085e59c	lsr x10,x8,#0x6
0085e5a0	ldr x10,[x9, x10, LSL #0x3]
0085e5a4	lsr x10,x10,x8
0085e5a8	tbz w10,#0x0,0x0085e7a8
0085e5ac	ldr x11,[x22, #0x1a0]
0085e5b0	ldr x10,[x22, #0x180]
0085e5b4	sub x11,x11,#0x1
0085e5b8	lsl x12,x8,#0x4
0085e5bc	ldr x12,[x10, x12#0x0]
0085e5c0	cmp x12,x20
0085e5c4	b.eq 0x0085e75c
0085e5c8	add x8,x8,#0x1
0085e5cc	and x8,x8,x11
0085e5d0	lsr x12,x8,#0x6
0085e5d4	ldr x12,[x9, x12, LSL #0x3]
0085e5d8	lsr x12,x12,x8
0085e5dc	tbnz w12,#0x0,0x0085e5b8
0085e5e0	b 0x0085e7a8
0085e5e4	mov x22,xzr
0085e5e8	mov x0,x20
0085e5ec	mov w1,#0x48
0085e5f0	bl 0x0084e938
0085e5f4	ldp w8,w7,[sp, #0x50]
0085e5f8	ldp x2,x3,[sp, #0x70]
0085e5fc	sub x1,x29,#0x90
0085e600	ldr x4,[sp, #0x48]
0085e604	mov x5,x22
0085e608	mov x6,x21
0085e60c	and w8,w8,#0x1
0085e610	mov x20,x0
0085e614	strb w8,[sp]
0085e618	bl 0x0085068c
0085e61c	ldr x0,[sp, #0xe0]
0085e620	cbz x0,0x0085e654
0085e624	bl 0x00c301d0
0085e628	ldr x0,[sp, #0xf8]
0085e62c	str xzr,[sp, #0xe0]
0085e630	bl 0x00c301d0
0085e634	ldr x8,[sp, #0x40]
0085e638	mov x0,xzr
0085e63c	stp xzr,xzr,[x8]
0085e640	str xzr,[x8, #0x10]
0085e644	bl 0x00c301d0
0085e648	mov w8,#0x40
0085e64c	str xzr,[sp, #0x100]
0085e650	strb w8,[sp, #0x110]
0085e654	ldr x0,[sp, #0xf8]
0085e658	bl 0x00c301d0
0085e65c	ldp x21,x8,[sp, #0xa8]
0085e660	mov w9,#0x58
0085e664	mul x23,x8,x9
0085e668	ldp x25,x22,[x21]
0085e66c	add x8,x23,x25
0085e670	cmp x8,x22
0085e674	b.eq 0x0085e710
0085e678	add x19,x25,x23
0085e67c	sub x8,x22,x8
0085e680	add x8,x19,x8
0085e684	cmp x8,x22
0085e688	b.eq 0x0085e6f0
0085e68c	sub x26,x22,x25
0085e690	adrp x27,0xc4a000
0085e694	add x27,x27,#0x6e8
0085e698	b 0x0085e6ac
0085e69c	add x25,x25,#0x58
0085e6a0	add x8,x25,x26
0085e6a4	cmp x8,x22
0085e6a8	b.eq 0x0085e6e8
0085e6ac	cmp x26,x23
0085e6b0	b.eq 0x0085e69c
0085e6b4	add x28,x25,x23
0085e6b8	mov x19,x28
0085e6bc	ldrsw x8,[x19], #0x8
0085e6c0	ldr x8,[x24, x8, LSL #0x3]
0085e6c4	mov x0,x19
0085e6c8	blr x8
0085e6cc	add x1,x25,x26
0085e6d0	mov x0,x19
0085e6d4	ldrsw x8,[x1], #0x8
0085e6d8	str w8,[x28]
0085e6dc	ldr x8,[x27, x8, LSL #0x3]
0085e6e0	blr x8
0085e6e4	b 0x0085e69c
0085e6e8	ldr x22,[x21, #0x8]
0085e6ec	add x19,x25,x23
0085e6f0	cmp x22,x19
0085e6f4	b.eq 0x0085e70c
0085e6f8	ldrsw x8,[x22, #-0x58]!
0085e6fc	ldr x8,[x24, x8, LSL #0x3]
0085e700	add x0,x22,#0x8
0085e704	blr x8
0085e708	b 0x0085e6f0
0085e70c	str x19,[x21, #0x8]
0085e710	ldr x24,[sp, #0x60]
0085e714	ldr x8,[x24, #0x28]
0085e718	ldur x9,[x29, #-0x18]
0085e71c	cmp x8,x9
0085e720	b.ne 0x0085e980
0085e724	mov x0,x20
0085e728	add sp,sp,#0x1e0
0085e72c	ldp x20,x19,[sp, #0x50]
0085e730	ldp x22,x21,[sp, #0x40]
0085e734	ldp x24,x23,[sp, #0x30]
0085e738	ldp x26,x25,[sp, #0x20]
0085e73c	ldp x28,x27,[sp, #0x10]
0085e740	ldp x29,x30,[sp], #0x60
0085e744	ret
0085e748	mov x0,x22
0085e74c	bl 0x00858f2c
0085e750	mov x0,x22
0085e754	bl 0x00864650
0085e758	b 0x0085dabc
0085e75c	add x8,x10,x8, LSL #0x4
0085e760	ldr x20,[x8, #0x8]
0085e764	cbz x20,0x0085e7a8
0085e768	ldr x8,[x20, #0x20]
0085e76c	ldr x9,[x22, #0x170]
0085e770	cmp x8,x9
0085e774	b.cs 0x0085e854
0085e778	stp xzr,xzr,[x29, #-0x90]
0085e77c	adrp x4,0x2c8000
0085e780	add x4,x4,#0xade
0085e784	stp xzr,xzr,[sp, #0xe0]
0085e788	add x1,x22,#0x94
0085e78c	sub x2,x29,#0x90
0085e790	ldr x5,[x20]
0085e794	add x3,sp,#0xe0
0085e798	mov x0,x22
0085e79c	bl 0x0085e984
0085e7a0	mov x20,x0
0085e7a4	b 0x0085e714
0085e7a8	ldr x0,[x22, #0xe8]
0085e7ac	mov w1,#0x28
0085e7b0	sub x20,x29,#0xc8
0085e7b4	bl 0x0084e938
0085e7b8	add x1,x20,#0x8
0085e7bc	sub x2,x29,#0xc8
0085e7c0	mov x26,x0
0085e7c4	bl 0x0084ed38
0085e7c8	adrp x9,0xd1b000
0085e7cc	ldr w8,[x26, #0x8]
0085e7d0	str x26,[sp, #0x70]
0085e7d4	ldr w9,[x9, #0x10]
0085e7d8	cmp w8,w9
0085e7dc	adrp x9,0xd1b000
0085e7e0	b.ne 0x0085e808
0085e7e4	ldr x10,[x26, #0x20]
0085e7e8	str xzr,[sp, #0x78]
0085e7ec	ldrb w10,[x10, #0x30]
0085e7f0	cmp w10,#0x1
0085e7f4	b.ne 0x0085db68
0085e7f8	ldr w9,[x9, #0x20]
0085e7fc	cmp w8,w9
0085e800	b.ne 0x0085e81c
0085e804	b 0x0085db68
0085e808	ldr w9,[x9, #0x20]
0085e80c	cmp w8,w9
0085e810	b.ne 0x0085e81c
0085e814	str xzr,[sp, #0x78]
0085e818	b 0x0085db68
0085e81c	adrp x9,0xd1b000
0085e820	str xzr,[sp, #0x78]
0085e824	ldr w9,[x9, #0x60]
0085e828	cmp w8,w9
0085e82c	b.eq 0x0085db68
0085e830	adrp x9,0xd1b000
0085e834	ldr w9,[x9, #0x50]
0085e838	cmp w8,w9
0085e83c	b.eq 0x0085db68
0085e840	ldr x1,[sp, #0x70]
0085e844	mov x0,x22
0085e848	bl 0x00864840
0085e84c	stp x0,xzr,[sp, #0x70]
0085e850	b 0x0085db68
0085e854	ldp x10,x9,[x22, #0x158]
0085e858	mov w1,#0x30
0085e85c	ldr x0,[x22, #0xe8]
0085e860	sub x23,x29,#0xc8
0085e864	sub x9,x9,x10
0085e868	asr x9,x9,#0x3
0085e86c	sub x9,x9,#0x1
0085e870	cmp x8,x9
0085e874	cset w21,ne
0085e878	bl 0x0084e938
0085e87c	add x1,x23,#0x8
0085e880	mov x2,x20
0085e884	mov w3,w21
0085e888	mov x26,x0
0085e88c	bl 0x0084ece8
0085e890	b 0x0085e7c8
0085e894	ldr x8,[sp, #0x60]
0085e898	ldr x8,[x8, #0x28]
0085e89c	ldur x9,[x29, #-0x18]
0085e8a0	cmp x8,x9
0085e8a4	b.ne 0x0085e980
0085e8a8	bl 0x007fe124
0085e8ac	ldr x8,[sp, #0x60]
0085e8b0	ldr x8,[x8, #0x28]
0085e8b4	ldur x9,[x29, #-0x18]
0085e8b8	cmp x8,x9
0085e8bc	b.ne 0x0085e980
0085e8c0	bl 0x007fe124
0085e980	bl 0x00c2fec0
