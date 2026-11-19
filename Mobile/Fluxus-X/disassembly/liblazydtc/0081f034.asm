; FUN_0081f034 @ 0081f034
0081f034	stp x29,x30,[sp, #-0x30]!
0081f038	str x21,[sp, #0x10]
0081f03c	stp x20,x19,[sp, #0x20]
0081f040	mov x29,sp
0081f044	mov x8,x0
0081f048	ldrb w11,[x8, #0x40]!
0081f04c	ldr w12,[x8, #0x20]
0081f050	ldp x10,x9,[x8, #0x8]
0081f054	str xzr,[x8, #0x18]
0081f058	ubfx x13,x11,#0x1,#0x7
0081f05c	tst w11,#0x1
0081f060	csinc x19,x9,x8,ne
0081f064	csel x20,x13,x10,eq
0081f068	tbz w12,#0x3,0x0081f07c
0081f06c	add x13,x19,x20
0081f070	stp x19,x19,[x0, #0x10]
0081f074	str x13,[x0, #0x58]
0081f078	str x13,[x0, #0x20]
0081f07c	tbz w12,#0x4,0x0081f170
0081f080	ldr x12,[x0, #0x40]
0081f084	and w11,w11,#0xff
0081f088	tst w11,#0x1
0081f08c	mov w11,#0x16
0081f090	and x13,x12,#-0x2
0081f094	ubfx x14,x12,#0x1,#0x7
0081f098	sub x13,x13,#0x1
0081f09c	csel x11,x11,x13,eq
0081f0a0	tst x12,#0x1
0081f0a4	add x13,x19,x20
0081f0a8	csel x10,x14,x10,eq
0081f0ac	str x13,[x0, #0x58]
0081f0b0	subs x1,x11,x10
0081f0b4	b.ls 0x0081f0d0
0081f0b8	mov x21,x0
0081f0bc	mov x0,x8
0081f0c0	mov w2,wzr
0081f0c4	bl 0x00c30250
0081f0c8	mov x0,x21
0081f0cc	b 0x0081f0ec
0081f0d0	tbnz w12,#0x0,0x0081f0e4
0081f0d4	lsl w10,w11,#0x1
0081f0d8	add x9,x8,#0x1
0081f0dc	strb w10,[x8]
0081f0e0	b 0x0081f0e8
0081f0e4	str x11,[x0, #0x48]
0081f0e8	strb wzr,[x9, x11]
0081f0ec	ldrb w8,[x0, #0x40]
0081f0f0	ldr x9,[x0, #0x48]
0081f0f4	stp x19,x19,[x0, #0x28]
0081f0f8	lsr x10,x8,#0x1
0081f0fc	tst w8,#0x1
0081f100	ldrb w8,[x0, #0x60]
0081f104	csel x9,x10,x9,eq
0081f108	tst w8,#0x3
0081f10c	add x9,x19,x9
0081f110	str x9,[x0, #0x38]
0081f114	b.eq 0x0081f170
0081f118	lsr x8,x20,#0x1f
0081f11c	cbz x8,0x0081f164
0081f120	orr x8,xzr,#-0x80000000
0081f124	mov x9,#0x5
0081f128	mov w10,#0x7fffffff
0081f12c	add x8,x20,x8
0081f130	movk x9,#0x2, LSL #32
0081f134	umulh x9,x8,x9
0081f138	sub x8,x8,x9
0081f13c	add x8,x9,x8, LSR #0x1
0081f140	lsr x8,x8,#0x1e
0081f144	lsl x9,x8,#0x1f
0081f148	sub x8,x9,x8
0081f14c	add x9,x19,x10
0081f150	add x19,x9,x8
0081f154	sub x8,x20,x8
0081f158	orr x9,xzr,#-0x7fffffff
0081f15c	add x20,x8,x9
0081f160	str x19,[x0, #0x30]
0081f164	cbz x20,0x0081f170
0081f168	add x8,x19,x20
0081f16c	str x8,[x0, #0x30]
0081f170	ldp x20,x19,[sp, #0x20]
0081f174	ldr x21,[sp, #0x10]
0081f178	ldp x29,x30,[sp], #0x30
0081f17c	ret
