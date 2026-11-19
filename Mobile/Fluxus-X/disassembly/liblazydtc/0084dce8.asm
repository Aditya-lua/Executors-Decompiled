; FUN_0084dce8 @ 0084dce8
0084dce8	stp x29,x30,[sp, #-0x20]!
0084dcec	stp x20,x19,[sp, #0x10]
0084dcf0	mov x29,sp
0084dcf4	mov x20,x0
0084dcf8	adrp x0,0xd1e000
0084dcfc	add x0,x0,#0x650
0084dd00	mov x19,x8
0084dd04	bl 0x00c2ff10
0084dd08	adrp x8,0xd1e000
0084dd0c	ldr x8,[x8, #0x680]
0084dd10	cbz x8,0x0084ddec
0084dd14	lsl w9,w20,#0x3
0084dd18	mov x11,#0x2d69
0084dd1c	lsr x10,x20,#0x20
0084dd20	movk x11,#0xeb38, LSL #16
0084dd24	fmov d0,x8
0084dd28	add x9,x9,#0x8
0084dd2c	movk x11,#0xea08, LSL #32
0084dd30	eor x9,x9,x10
0084dd34	movk x11,#0x9ddf, LSL #48
0084dd38	mul x9,x9,x11
0084dd3c	cnt v0.8B,v0.8B
0084dd40	addv b0,v0.8B
0084dd44	eor x10,x10,x9, LSR #0x2f
0084dd48	eor x9,x10,x9
0084dd4c	fmov x10,d0
0084dd50	mul x9,x9,x11
0084dd54	cmp x10,#0x1
0084dd58	eor x9,x9,x9, LSR #0x2f
0084dd5c	mul x9,x9,x11
0084dd60	b.hi 0x0084dd70
0084dd64	sub x11,x8,#0x1
0084dd68	and x11,x11,x9
0084dd6c	b 0x0084dd84
0084dd70	cmp x9,x8
0084dd74	mov x11,x9
0084dd78	b.cc 0x0084dd84
0084dd7c	udiv x11,x9,x8
0084dd80	msub x11,x11,x8,x9
0084dd84	adrp x12,0xd1e000
0084dd88	ldr x12,[x12, #0x678]
0084dd8c	ldr x12,[x12, x11, LSL #0x3]
0084dd90	cbz x12,0x0084ddec
0084dd94	ldr x12,[x12]
0084dd98	cbz x12,0x0084ddec
0084dd9c	sub x13,x8,#0x1
0084dda0	b 0x0084ddb8
0084dda4	ldr x14,[x12, #0x10]
0084dda8	cmp x14,x20
0084ddac	b.eq 0x0084de04
0084ddb0	ldr x12,[x12]
0084ddb4	cbz x12,0x0084ddec
0084ddb8	ldr x14,[x12, #0x8]
0084ddbc	cmp x14,x9
0084ddc0	b.eq 0x0084dda4
0084ddc4	cmp x10,#0x1
0084ddc8	b.hi 0x0084ddd4
0084ddcc	and x14,x14,x13
0084ddd0	b 0x0084dde4
0084ddd4	cmp x14,x8
0084ddd8	b.cc 0x0084dde4
0084dddc	udiv x15,x14,x8
0084dde0	msub x14,x15,x8,x14
0084dde4	cmp x14,x11
0084dde8	b.eq 0x0084ddb0
0084ddec	stp xzr,xzr,[x19]
0084ddf0	adrp x0,0xd1e000
0084ddf4	add x0,x0,#0x650
0084ddf8	ldp x20,x19,[sp, #0x10]
0084ddfc	ldp x29,x30,[sp], #0x20
0084de00	b 0x00c2ff20
0084de04	ldr x8,[x12, #0x20]
0084de08	ldur q0,[x12, #0x18]
0084de0c	str q0,[x19]
0084de10	cbz x8,0x0084ddf0
0084de14	add x1,x8,#0x8
0084de18	mov w0,#0x1
0084de1c	bl 0x00c2bce0
0084de20	b 0x0084ddf0
