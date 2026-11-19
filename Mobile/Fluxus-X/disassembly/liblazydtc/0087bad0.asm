; FUN_0087bad0 @ 0087bad0
0087bad0	sub sp,sp,#0xa0
0087bad4	stp x29,x30,[sp, #0x40]
0087bad8	stp x28,x27,[sp, #0x50]
0087badc	stp x26,x25,[sp, #0x60]
0087bae0	stp x24,x23,[sp, #0x70]
0087bae4	stp x22,x21,[sp, #0x80]
0087bae8	stp x20,x19,[sp, #0x90]
0087baec	add x29,sp,#0x40
0087baf0	ldr x9,[x0, #0x20]
0087baf4	mov w8,#0x10
0087baf8	mov x22,x0
0087bafc	lsl x10,x9,#0x1
0087bb00	cmp x9,#0x0
0087bb04	csel x23,x8,x10,eq
0087bb08	cbz x23,0x0087bb60
0087bb0c	cmp x23,#0x40
0087bb10	mov w19,#0x40
0087bb14	csel x8,x23,x19,hi
0087bb18	lsr x24,x8,#0x6
0087bb1c	lsl x21,x24,#0x3
0087bb20	mov x0,x21
0087bb24	bl 0x00c2fed0
0087bb28	mov w1,wzr
0087bb2c	mov x2,x21
0087bb30	mov x20,x0
0087bb34	bl 0x00c301c0
0087bb38	add x8,x23,x23, LSL #0x1
0087bb3c	lsl x0,x8,#0x4
0087bb40	bl 0x00c2fed0
0087bb44	rbit x8,x23
0087bb48	mov x21,x0
0087bb4c	clz x8,x8
0087bb50	sub w19,w19,w8
0087bb54	ldp x28,x25,[x22, #0x10]
0087bb58	cbnz x28,0x0087bb78
0087bb5c	b 0x0087bd40
0087bb60	mov x24,xzr
0087bb64	mov x21,xzr
0087bb68	mov x20,xzr
0087bb6c	mov w19,#0x40
0087bb70	ldp x28,x25,[x22, #0x10]
0087bb74	cbz x28,0x0087bd40
0087bb78	ldr x27,[x25]
0087bb7c	cbz x27,0x0087bb88
0087bb80	mov x26,xzr
0087bb84	b 0x0087bba8
0087bb88	mov x26,xzr
0087bb8c	add x8,x25,#0x8
0087bb90	sub x9,x28,#0x1
0087bb94	cmp x9,x26
0087bb98	b.eq 0x0087bd40
0087bb9c	ldr x27,[x8, x26, LSL #0x3]
0087bba0	add x26,x26,#0x1
0087bba4	cbz x27,0x0087bb94
0087bba8	str x24,[sp, #0x10]
0087bbac	rbit x8,x27
0087bbb0	ldr x9,[x22]
0087bbb4	str x22,[sp, #0x20]
0087bbb8	sub x22,x23,#0x1
0087bbbc	clz x8,x8
0087bbc0	stur x9,[x29, #-0x10]
0087bbc4	orr x9,x8,x26, LSL #0x6
0087bbc8	and x8,x19,#0xff
0087bbcc	str x23,[sp, #0x18]
0087bbd0	str x19,[sp, #0x8]
0087bbd4	add x19,x25,#0x8
0087bbd8	mov w23,#0x30
0087bbdc	stur x8,[x29, #-0x18]
0087bbe0	str x25,[sp]
0087bbe4	mov w25,#0x1
0087bbe8	b 0x0087bc04
0087bbec	ldur x9,[x29, #-0x8]
0087bbf0	mov x27,xzr
0087bbf4	mov x26,x8
0087bbf8	cbnz x27,0x0087bc04
0087bbfc	cmp x26,x28
0087bc00	b.eq 0x0087bd2c
0087bc04	ldur x8,[x29, #-0x10]
0087bc08	nop
0087bc0c	madd x24,x9,x23,x8
0087bc10	stur x9,[x29, #-0x8]
0087bc14	mov x1,x24
0087bc18	bl 0x0087337c
0087bc1c	mov x8,#0x7c15
0087bc20	ldur x9,[x29, #-0x18]
0087bc24	movk x8,#0x7f4a, LSL #16
0087bc28	movk x8,#0x79b9, LSL #32
0087bc2c	movk x8,#0x9e37, LSL #48
0087bc30	mul x8,x0,x8
0087bc34	lsr x8,x8,x9
0087bc38	lsr x9,x8,#0x6
0087bc3c	lsl x10,x25,x8
0087bc40	ldr x11,[x20, x9, LSL #0x3]
0087bc44	tst x10,x11
0087bc48	b.eq 0x0087bcc4
0087bc4c	ldp x12,x13,[x24, #0x8]
0087bc50	ldr w11,[x24]
0087bc54	ldp x14,x15,[x24, #0x18]
0087bc58	b 0x0087bc78
0087bc5c	add x8,x8,#0x1
0087bc60	and x8,x8,x22
0087bc64	lsr x9,x8,#0x6
0087bc68	lsl x10,x25,x8
0087bc6c	ldr x16,[x20, x9, LSL #0x3]
0087bc70	tst x16,x10
0087bc74	b.eq 0x0087bcc0
0087bc78	madd x9,x8,x23,x21
0087bc7c	ldr w10,[x9]
0087bc80	cmp w10,w11
0087bc84	b.ne 0x0087bc5c
0087bc88	ldr x10,[x9, #0x8]
0087bc8c	cmp x10,x12
0087bc90	b.ne 0x0087bc5c
0087bc94	ldr x10,[x9, #0x10]
0087bc98	cmp x10,x13
0087bc9c	b.ne 0x0087bc5c
0087bca0	ldr x10,[x9, #0x18]
0087bca4	cmp x10,x14
0087bca8	b.ne 0x0087bc5c
0087bcac	ldr x9,[x9, #0x20]
0087bcb0	cmp x9,x15
0087bcb4	b.ne 0x0087bc5c
0087bcb8	lsr x9,x8,#0x6
0087bcbc	lsl x10,x25,x8
0087bcc0	ldr x11,[x20, x9, LSL #0x3]
0087bcc4	nop
0087bcc8	madd x8,x8,x23,x21
0087bccc	orr x10,x11,x10
0087bcd0	str x10,[x20, x9, LSL #0x3]
0087bcd4	ldp q1,q0,[x24, #0x10]
0087bcd8	ldr q2,[x24]
0087bcdc	sub x9,x27,#0x1
0087bce0	ands x27,x9,x27
0087bce4	stp q1,q0,[x8, #0x10]
0087bce8	str q2,[x8]
0087bcec	b.ne 0x0087bd18
0087bcf0	add x8,x26,#0x1
0087bcf4	cmp x28,x8
0087bcf8	csinc x8,x28,x26,hi
0087bcfc	add x9,x26,#0x1
0087bd00	cmp x9,x28
0087bd04	b.cs 0x0087bbec
0087bd08	ldr x27,[x19, x26, LSL #0x3]
0087bd0c	mov x26,x9
0087bd10	cbz x27,0x0087bcfc
0087bd14	mov x26,x9
0087bd18	rbit x8,x27
0087bd1c	clz x8,x8
0087bd20	orr x9,x8,x26, LSL #0x6
0087bd24	cbz x27,0x0087bbfc
0087bd28	b 0x0087bc04
0087bd2c	ldp x23,x22,[sp, #0x18]
0087bd30	ldr x25,[sp]
0087bd34	ldp x19,x24,[sp, #0x8]
0087bd38	ldur x26,[x29, #-0x10]
0087bd3c	b 0x0087bd44
0087bd40	ldr x26,[x22]
0087bd44	mov x0,xzr
0087bd48	stp x21,xzr,[x22]
0087bd4c	stp xzr,xzr,[x22, #0x10]
0087bd50	bl 0x00c301d0
0087bd54	mov x0,xzr
0087bd58	stp x24,x20,[x22, #0x10]
0087bd5c	str x23,[x22, #0x8]
0087bd60	bl 0x00c301d0
0087bd64	mov x0,xzr
0087bd68	bl 0x00c301d0
0087bd6c	str x23,[x22, #0x20]
0087bd70	strb w19,[x22, #0x30]
0087bd74	cbz x26,0x0087bd94
0087bd78	mov x0,x26
0087bd7c	bl 0x00c301d0
0087bd80	mov x0,x25
0087bd84	bl 0x00c301d0
0087bd88	mov x0,xzr
0087bd8c	bl 0x00c301d0
0087bd90	mov x25,xzr
0087bd94	mov x0,x25
0087bd98	ldp x20,x19,[sp, #0x90]
0087bd9c	ldp x22,x21,[sp, #0x80]
0087bda0	ldp x24,x23,[sp, #0x70]
0087bda4	ldp x26,x25,[sp, #0x60]
0087bda8	ldp x28,x27,[sp, #0x50]
0087bdac	ldp x29,x30,[sp, #0x40]
0087bdb0	add sp,sp,#0xa0
0087bdb4	b 0x00c301d0
