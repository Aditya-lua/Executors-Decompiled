; FUN_00893e8c @ 00893e8c
00893e8c	stp x29,x30,[sp, #-0x20]!
00893e90	stp x20,x19,[sp, #0x10]
00893e94	mov x29,sp
00893e98	ldr x8,[x0, #0x170]
00893e9c	cbz x8,0x00893f50
00893ea0	lsl w8,w1,#0x3
00893ea4	mov x10,#0x2d69
00893ea8	lsr x9,x1,#0x20
00893eac	movk x10,#0xeb38, LSL #16
00893eb0	add x8,x8,#0x8
00893eb4	movk x10,#0xea08, LSL #32
00893eb8	eor x8,x8,x9
00893ebc	movk x10,#0x9ddf, LSL #48
00893ec0	mul x8,x8,x10
00893ec4	eor x9,x9,x8, LSR #0x2f
00893ec8	eor x8,x9,x8
00893ecc	mov x9,#0x959d
00893ed0	mul x8,x8,x10
00893ed4	movk x9,#0xb8f4, LSL #16
00893ed8	movk x9,#0xd34f, LSL #32
00893edc	movk x9,#0x949d, LSL #48
00893ee0	eor x8,x8,x8, LSR #0x2f
00893ee4	mul x8,x8,x9
00893ee8	ldrb w9,[x0, #0x178]
00893eec	lsr x9,x8,x9
00893ef0	ldr x8,[x0, #0x160]
00893ef4	lsr x10,x9,#0x6
00893ef8	ldr x10,[x8, x10, LSL #0x3]
00893efc	lsr x10,x10,x9
00893f00	tbz w10,#0x0,0x00893f50
00893f04	ldr x11,[x0, #0x168]
00893f08	ldr x10,[x0, #0x148]
00893f0c	mov w12,#0x30
00893f10	sub x11,x11,#0x1
00893f14	madd x13,x9,x12,x10
00893f18	ldr x14,[x13]
00893f1c	cmp x14,x1
00893f20	b.eq 0x00893f40
00893f24	add x9,x9,#0x1
00893f28	and x9,x9,x11
00893f2c	lsr x13,x9,#0x6
00893f30	ldr x13,[x8, x13, LSL #0x3]
00893f34	lsr x13,x13,x9
00893f38	tbnz w13,#0x0,0x00893f14
00893f3c	b 0x00893f50
00893f40	ldr w8,[x13, #0x8]
00893f44	cbz w8,0x00893f50
00893f48	mov w0,#0x1
00893f4c	b 0x00893fa4
00893f50	ldr w19,[x1, #0x8]
00893f54	cbz x1,0x00893f7c
00893f58	adrp x8,0xd1b000
00893f5c	ldr w8,[x8, #0xa0]
00893f60	cmp w19,w8
00893f64	b.ne 0x00893f7c
00893f68	ldr w8,[x1, #0x1c]
00893f6c	and w8,w8,#0xfffffff8
00893f70	cmp w8,#0x8
00893f74	cset w0,eq
00893f78	b 0x00893fa4
00893f7c	adrp x8,0xd1a000
00893f80	ldr w20,[x8, #0xfc0]
00893f84	cmp w19,w20
00893f88	b.ne 0x00893f98
00893f8c	ldr x1,[x1, #0x20]
00893f90	bl 0x00893e8c
00893f94	mov w8,w0
00893f98	cmp w19,w20
00893f9c	cset w9,eq
00893fa0	and w0,w9,w8
00893fa4	ldp x20,x19,[sp, #0x10]
00893fa8	ldp x29,x30,[sp], #0x20
00893fac	ret
