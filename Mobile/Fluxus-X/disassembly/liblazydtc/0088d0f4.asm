; FUN_0088d0f4 @ 0088d0f4
0088d0f4	ldr x8,[x0, #0x28]
0088d0f8	cbz x8,0x0088d1c0
0088d0fc	lsl w8,w1,#0x3
0088d100	mov x10,#0x2d69
0088d104	lsr x9,x1,#0x20
0088d108	movk x10,#0xeb38, LSL #16
0088d10c	add x8,x8,#0x8
0088d110	movk x10,#0xea08, LSL #32
0088d114	eor x8,x8,x9
0088d118	movk x10,#0x9ddf, LSL #48
0088d11c	mul x8,x8,x10
0088d120	eor x9,x9,x8, LSR #0x2f
0088d124	eor x8,x9,x8
0088d128	mov x9,#0x959d
0088d12c	mul x8,x8,x10
0088d130	movk x9,#0xb8f4, LSL #16
0088d134	movk x9,#0xd34f, LSL #32
0088d138	movk x9,#0x949d, LSL #48
0088d13c	eor x8,x8,x8, LSR #0x2f
0088d140	mul x8,x8,x9
0088d144	ldrb w9,[x0, #0x30]
0088d148	lsr x9,x8,x9
0088d14c	ldr x8,[x0, #0x18]
0088d150	lsr x10,x9,#0x6
0088d154	ldr x10,[x8, x10, LSL #0x3]
0088d158	lsr x10,x10,x9
0088d15c	tbz w10,#0x0,0x0088d1c0
0088d160	ldr x11,[x0, #0x20]
0088d164	ldr x10,[x0]
0088d168	mov w12,#0x30
0088d16c	sub x11,x11,#0x1
0088d170	madd x13,x9,x12,x10
0088d174	ldr x14,[x13]
0088d178	cmp x14,x1
0088d17c	b.eq 0x0088d19c
0088d180	add x9,x9,#0x1
0088d184	and x9,x9,x11
0088d188	lsr x13,x9,#0x6
0088d18c	ldr x13,[x8, x13, LSL #0x3]
0088d190	lsr x13,x13,x9
0088d194	tbnz w13,#0x0,0x0088d170
0088d198	b 0x0088d1c0
0088d19c	ldr w8,[x13, #0x8]
0088d1a0	cmp w8,#0x1
0088d1a4	b.eq 0x0088d1c8
0088d1a8	cmp w8,#0x2
0088d1ac	b.ne 0x0088d1c0
0088d1b0	ldrb w8,[x13, #0x10]
0088d1b4	cmp w8,#0x0
0088d1b8	cset w0,eq
0088d1bc	ret
0088d1c0	mov w0,wzr
0088d1c4	ret
0088d1c8	mov w0,#0x1
0088d1cc	ret
