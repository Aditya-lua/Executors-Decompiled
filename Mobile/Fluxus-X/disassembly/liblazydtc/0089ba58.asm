; FUN_0089ba58 @ 0089ba58
0089ba58	sub sp,sp,#0xc0
0089ba5c	stp x29,x30,[sp, #0x60]
0089ba60	stp x28,x27,[sp, #0x70]
0089ba64	stp x26,x25,[sp, #0x80]
0089ba68	stp x24,x23,[sp, #0x90]
0089ba6c	stp x22,x21,[sp, #0xa0]
0089ba70	stp x20,x19,[sp, #0xb0]
0089ba74	add x29,sp,#0x60
0089ba78	mrs x8,tpidr_el0
0089ba7c	movi v0.2D,#0x0
0089ba80	mov x19,x1
0089ba84	str x8,[sp, #0x8]
0089ba88	mov x20,x0
0089ba8c	ldr x8,[x8, #0x28]
0089ba90	stur x8,[x29, #-0x8]
0089ba94	adrp x8,0xc4b000
0089ba98	add x8,x8,#0xbd8
0089ba9c	stp x8,x1,[sp, #0x10]
0089baa0	mov w8,#0x40
0089baa4	strb w8,[sp, #0x50]
0089baa8	ldr x8,[x2]
0089baac	stp q0,q0,[sp, #0x20]
0089bab0	str q0,[sp, #0x40]
0089bab4	ldr x8,[x8]
0089bab8	add x1,sp,#0x10
0089babc	mov x0,x2
0089bac0	blr x8
0089bac4	ldr x23,[x19, #0x10]
0089bac8	cbz x23,0x0089bc88
0089bacc	ldr x8,[x19, #0x18]
0089bad0	ldr x25,[x8]
0089bad4	cbz x25,0x0089bae0
0089bad8	mov x24,xzr
0089badc	b 0x0089bb00
0089bae0	mov x24,xzr
0089bae4	add x9,x8,#0x8
0089bae8	sub x10,x23,#0x1
0089baec	cmp x10,x24
0089baf0	b.eq 0x0089bc88
0089baf4	ldr x25,[x9, x24, LSL #0x3]
0089baf8	add x24,x24,#0x1
0089bafc	cbz x25,0x0089baec
0089bb00	rbit x9,x25
0089bb04	mov x26,#0x2d69
0089bb08	add x27,x8,#0x8
0089bb0c	movk x26,#0xeb38, LSL #16
0089bb10	mov w28,#0x28
0089bb14	adrp x22,0xd1b000
0089bb18	clz x9,x9
0089bb1c	movk x26,#0xea08, LSL #32
0089bb20	orr x21,x9,x24, LSL #0x6
0089bb24	movk x26,#0x9ddf, LSL #48
0089bb28	ldr x8,[x19]
0089bb2c	nop
0089bb30	madd x1,x21,x28,x8
0089bb34	ldrb w8,[x1, #0x20]
0089bb38	tbnz w8,#0x0,0x0089bc24
0089bb3c	ldr x8,[x1, #0x8]
0089bb40	cbz x8,0x0089bc24
0089bb44	ldr w9,[x22, #0x80]
0089bb48	ldr w11,[x8, #0x8]
0089bb4c	cmp w11,w9
0089bb50	b.eq 0x0089bb88
0089bb54	adrp x10,0xd1a000
0089bb58	adrp x12,0xd1b000
0089bb5c	ldr w10,[x10, #0xfc0]
0089bb60	ldr w12,[x12, #0xb0]
0089bb64	cmp w11,w10
0089bb68	b.eq 0x0089bb74
0089bb6c	cmp w11,w12
0089bb70	b.ne 0x0089bc24
0089bb74	ldr x8,[x8, #0x20]
0089bb78	ldr w11,[x8, #0x8]
0089bb7c	cbz x8,0x0089bb64
0089bb80	cmp w11,w9
0089bb84	b.ne 0x0089bb64
0089bb88	ldr x8,[sp, #0x48]
0089bb8c	cbz x8,0x0089bc18
0089bb90	ldr x8,[x1]
0089bb94	lsl w9,w8,#0x3
0089bb98	lsr x10,x8,#0x20
0089bb9c	add x9,x9,#0x8
0089bba0	eor x9,x9,x10
0089bba4	mul x9,x9,x26
0089bba8	eor x10,x10,x9, LSR #0x2f
0089bbac	eor x9,x10,x9
0089bbb0	mov x10,#0x959d
0089bbb4	mul x9,x9,x26
0089bbb8	movk x10,#0xb8f4, LSL #16
0089bbbc	movk x10,#0xd34f, LSL #32
0089bbc0	movk x10,#0x949d, LSL #48
0089bbc4	eor x9,x9,x9, LSR #0x2f
0089bbc8	mul x9,x9,x10
0089bbcc	ldrb w10,[sp, #0x50]
0089bbd0	lsr x10,x9,x10
0089bbd4	ldr x9,[sp, #0x38]
0089bbd8	lsr x11,x10,#0x6
0089bbdc	ldr x11,[x9, x11, LSL #0x3]
0089bbe0	lsr x11,x11,x10
0089bbe4	tbz w11,#0x0,0x0089bc18
0089bbe8	ldr x12,[sp, #0x40]
0089bbec	ldr x11,[sp, #0x20]
0089bbf0	sub x12,x12,#0x1
0089bbf4	ldr x13,[x11, x10, LSL #0x3]
0089bbf8	cmp x13,x8
0089bbfc	b.eq 0x0089bc24
0089bc00	add x10,x10,#0x1
0089bc04	and x10,x10,x12
0089bc08	lsr x13,x10,#0x6
0089bc0c	ldr x13,[x9, x13, LSL #0x3]
0089bc10	lsr x13,x13,x10
0089bc14	tbnz w13,#0x0,0x0089bbf4
0089bc18	mov x0,x20
0089bc1c	bl 0x0089bd34
0089bc20	str wzr,[x0]
0089bc24	sub x8,x25,#0x1
0089bc28	ands x25,x8,x25
0089bc2c	b.ne 0x0089bc58
0089bc30	add x8,x24,#0x1
0089bc34	cmp x23,x8
0089bc38	csinc x8,x23,x24,hi
0089bc3c	add x9,x24,#0x1
0089bc40	cmp x9,x23
0089bc44	b.cs 0x0089bc74
0089bc48	ldr x25,[x27, x24, LSL #0x3]
0089bc4c	mov x24,x9
0089bc50	cbz x25,0x0089bc3c
0089bc54	mov x24,x9
0089bc58	rbit x8,x25
0089bc5c	clz x8,x8
0089bc60	orr x21,x8,x24, LSL #0x6
0089bc64	cmp x24,x23
0089bc68	b.ne 0x0089bb28
0089bc6c	cbnz x25,0x0089bb28
0089bc70	b 0x0089bc88
0089bc74	mov x25,xzr
0089bc78	mov x24,x8
0089bc7c	cmp x24,x23
0089bc80	b.eq 0x0089bc6c
0089bc84	b 0x0089bb28
0089bc88	ldr x0,[sp, #0x20]
0089bc8c	adrp x8,0xc4b000
0089bc90	add x8,x8,#0xbd8
0089bc94	str x8,[sp, #0x10]
0089bc98	cbz x0,0x0089bcc8
0089bc9c	bl 0x00c301d0
0089bca0	ldr x0,[sp, #0x38]
0089bca4	str xzr,[sp, #0x20]
0089bca8	bl 0x00c301d0
0089bcac	mov x0,xzr
0089bcb0	stp xzr,xzr,[sp, #0x28]
0089bcb4	str xzr,[sp, #0x38]
0089bcb8	bl 0x00c301d0
0089bcbc	mov w8,#0x40
0089bcc0	str xzr,[sp, #0x40]
0089bcc4	strb w8,[sp, #0x50]
0089bcc8	ldr x0,[sp, #0x38]
0089bccc	bl 0x00c301d0
0089bcd0	ldr x8,[sp, #0x8]
0089bcd4	ldr x8,[x8, #0x28]
0089bcd8	ldur x9,[x29, #-0x8]
0089bcdc	cmp x8,x9
0089bce0	b.ne 0x0089bd30
0089bce4	ldp x20,x19,[sp, #0xb0]
0089bce8	ldp x22,x21,[sp, #0xa0]
0089bcec	ldp x24,x23,[sp, #0x90]
0089bcf0	ldp x26,x25,[sp, #0x80]
0089bcf4	ldp x28,x27,[sp, #0x70]
0089bcf8	ldp x29,x30,[sp, #0x60]
0089bcfc	add sp,sp,#0xc0
0089bd00	ret
0089bd30	bl 0x00c2fec0
