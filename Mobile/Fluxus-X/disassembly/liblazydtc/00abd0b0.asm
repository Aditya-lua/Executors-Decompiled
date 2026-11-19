; OPENSSL_uni2asc @ 00abd0b0
00abd0b0	str x21,[sp, #-0x30]!
00abd0b4	stp x20,x19,[sp, #0x10]
00abd0b8	mov w20,w1
00abd0bc	mov x19,x0
00abd0c0	tst w1,#0x80000001
00abd0c4	mov x0,xzr
00abd0c8	stp x29,x30,[sp, #0x20]
00abd0cc	add x29,sp,#0x20
00abd0d0	b.ne 0x00abd1f8
00abd0d4	lsr w21,w20,#0x1
00abd0d8	cbz w20,0x00abd0e8
00abd0dc	add x8,x19,w20, SXTW 
00abd0e0	ldurb w8,[x8, #-0x1]
00abd0e4	cbz w8,0x00abd0ec
00abd0e8	add w21,w21,#0x1
00abd0ec	adrp x1,0x2b4000
00abd0f0	sxtw x0,w21
00abd0f4	add x1,x1,#0x83a
00abd0f8	orr w2,wzr,#0x3c
00abd0fc	bl 0x00c32320
00abd100	cbz x0,0x00abd1c4
00abd104	cmp w20,#0x1
00abd108	b.lt 0x00abd1b8
00abd10c	sxtw x8,w20
00abd110	sub x10,x8,#0x1
00abd114	lsr x9,x10,#0x1
00abd118	add x11,x9,#0x1
00abd11c	cmp x11,#0x20
00abd120	mov x9,xzr
00abd124	b.ls 0x00abd19c
00abd128	add x9,x8,#0x1
00abd12c	and x9,x9,#-0x2
00abd130	add x9,x19,x9
00abd134	cmp x0,x9
00abd138	b.cs 0x00abd154
00abd13c	add x10,x0,x10, LSR #0x1
00abd140	add x9,x19,#0x1
00abd144	add x10,x10,#0x1
00abd148	cmp x9,x10
00abd14c	mov x9,xzr
00abd150	b.cc 0x00abd19c
00abd154	and x9,x11,#0x1f
00abd158	tst x11,#0x1f
00abd15c	mov w12,#0x20
00abd160	csel x9,x12,x9,eq
00abd164	sub x11,x11,x9
00abd168	mov x10,xzr
00abd16c	lsl x9,x11,#0x1
00abd170	add x12,x19,#0x21
00abd174	sub x13,x12,#0x20
00abd178	ld2 {v0.16B,v1.16B},[x12]
00abd17c	ld2 {v2.16B,v3.16B},[x13]
00abd180	and x14,x10,#0x7fffffffffffffe0
00abd184	add x10,x10,#0x20
00abd188	add x13,x0,x14
00abd18c	cmp x11,x10
00abd190	add x12,x12,#0x40
00abd194	stp q2,q0,[x13]
00abd198	b.ne 0x00abd174
00abd19c	add x10,x0,x9, LSR #0x1
00abd1a0	add x11,x19,x9
00abd1a4	ldrb w11,[x11, #0x1]
00abd1a8	add x9,x9,#0x2
00abd1ac	cmp x9,x8
00abd1b0	strb w11,[x10], #0x1
00abd1b4	b.lt 0x00abd1a0
00abd1b8	add x8,x0,w21, SXTW 
00abd1bc	sturb wzr,[x8, #-0x1]
00abd1c0	b 0x00abd1f8
00abd1c4	bl 0x00c342a0
00abd1c8	adrp x0,0x2b4000
00abd1cc	adrp x2,0x2c6000
00abd1d0	add x0,x0,#0x83a
00abd1d4	add x2,x2,#0x18e
00abd1d8	mov w1,#0x3d
00abd1dc	bl 0x00c342b0
00abd1e0	mov w1,#0x100
00abd1e4	mov w0,#0x23
00abd1e8	movk w1,#0xc, LSL #16
00abd1ec	mov x2,xzr
00abd1f0	bl 0x00c342c0
00abd1f4	mov x0,xzr
00abd1f8	ldp x29,x30,[sp, #0x20]
00abd1fc	ldp x20,x19,[sp, #0x10]
00abd200	ldr x21,[sp], #0x30
00abd204	ret
