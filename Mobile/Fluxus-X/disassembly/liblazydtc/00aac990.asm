; CRYPTO_128_wrap_pad @ 00aac990
00aac990	sub sp,sp,#0x70
00aac994	sub x8,x4,#0x1
00aac998	orr w9,wzr,#0x7ffffffe
00aac99c	stp x22,x21,[sp, #0x40]
00aac9a0	mov x21,x0
00aac9a4	cmp x8,x9
00aac9a8	mov x0,xzr
00aac9ac	stp x28,x27,[sp, #0x10]
00aac9b0	stp x26,x25,[sp, #0x20]
00aac9b4	stp x24,x23,[sp, #0x30]
00aac9b8	stp x20,x19,[sp, #0x50]
00aac9bc	stp x29,x30,[sp, #0x60]
00aac9c0	add x29,sp,#0x60
00aac9c4	b.hi 0x00aacb68
00aac9c8	add x8,x4,#0x7
00aac9cc	and x22,x8,#-0x8
00aac9d0	mov x19,x5
00aac9d4	mov x23,x4
00aac9d8	mov x20,x2
00aac9dc	sub x24,x22,x4
00aac9e0	cbz x1,0x00aac9ec
00aac9e4	ldr w26,[x1]
00aac9e8	b 0x00aac9f4
00aac9ec	mov w26,#0x59a6
00aac9f0	movk w26,#0xa659, LSL #16
00aac9f4	lsr x27,x23,#0x18
00aac9f8	lsr x28,x23,#0x10
00aac9fc	cmp x22,#0x8
00aaca00	lsr x25,x23,#0x8
00aaca04	b.ne 0x00aaca5c
00aaca08	add x22,x20,#0x8
00aaca0c	mov x0,x22
00aaca10	mov x1,x3
00aaca14	mov x2,x23
00aaca18	bl 0x00c2ff60
00aaca1c	lsl x8,x23,#0x38
00aaca20	bfm x8,x25,#0x10,#0x7
00aaca24	bfm x8,x28,#0x18,#0x7
00aaca28	bfm x8,x27,#0x20,#0x7
00aaca2c	orr x8,x8,x26
00aaca30	add x0,x22,x23
00aaca34	mov w1,wzr
00aaca38	mov x2,x24
00aaca3c	str x8,[x20]
00aaca40	bl 0x00c301c0
00aaca44	mov x0,x20
00aaca48	mov x1,x20
00aaca4c	mov x2,x21
00aaca50	blr x19
00aaca54	mov w0,#0x10
00aaca58	b 0x00aacb68
00aaca5c	mov x0,x20
00aaca60	mov x1,x3
00aaca64	mov x2,x23
00aaca68	bl 0x00c2ff60
00aaca6c	add x0,x20,x23
00aaca70	mov w1,wzr
00aaca74	mov x2,x24
00aaca78	bl 0x00c301c0
00aaca7c	sub x8,x22,#0x10
00aaca80	orr w9,wzr,#0x7ffffff0
00aaca84	cmp x8,x9
00aaca88	mov x0,xzr
00aaca8c	b.hi 0x00aacb68
00aaca90	add x24,x20,#0x8
00aaca94	mov x0,x24
00aaca98	mov x1,x20
00aaca9c	mov x2,x22
00aacaa0	bl 0x00c2ff60
00aacaa4	lsl x8,x23,#0x38
00aacaa8	bfm x8,x25,#0x10,#0x7
00aacaac	sub x9,x22,#0x1
00aacab0	bfm x8,x28,#0x18,#0x7
00aacab4	mov x10,x26
00aacab8	lsr x9,x9,#0x3
00aacabc	bfm x8,x27,#0x20,#0x7
00aacac0	mov x26,xzr
00aacac4	add x23,x9,#0x1
00aacac8	orr x8,x8,x10
00aacacc	mov w25,#0x1
00aacad0	str x8,[sp]
00aacad4	mov x27,xzr
00aacad8	mov x28,x25
00aacadc	ldr x8,[x24, x27#0x0]
00aacae0	mov x0,sp
00aacae4	mov x1,sp
00aacae8	mov x2,x21
00aacaec	str x8,[sp, #0x8]
00aacaf0	blr x19
00aacaf4	ldrb w8,[sp, #0x7]
00aacaf8	cmp x28,#0x100
00aacafc	eor w8,w8,w28
00aacb00	strb w8,[sp, #0x7]
00aacb04	b.cc 0x00aacb2c
00aacb08	ldrb w8,[sp, #0x6]
00aacb0c	eor w8,w8,w28, LSR #0x8
00aacb10	strb w8,[sp, #0x6]
00aacb14	ldrb w8,[sp, #0x5]
00aacb18	eor w8,w8,w28, LSR #0x10
00aacb1c	strb w8,[sp, #0x5]
00aacb20	ldrb w8,[sp, #0x4]
00aacb24	eor w8,w8,w28, LSR #0x18
00aacb28	strb w8,[sp, #0x4]
00aacb2c	ldr x8,[sp, #0x8]
00aacb30	add x28,x28,#0x1
00aacb34	str x8,[x24, x27#0x0]
00aacb38	add x27,x27,#0x8
00aacb3c	cmp x27,x22
00aacb40	b.cc 0x00aacadc
00aacb44	add x26,x26,#0x1
00aacb48	cmp x26,#0x6
00aacb4c	add x25,x23,x25
00aacb50	b.ne 0x00aacad4
00aacb54	ldr x8,[sp]
00aacb58	orr x9,xzr,#0x800000000
00aacb5c	add x9,x9,x22, LSL #0x20
00aacb60	asr x0,x9,#0x20
00aacb64	str x8,[x20]
00aacb68	ldp x29,x30,[sp, #0x60]
00aacb6c	ldp x20,x19,[sp, #0x50]
00aacb70	ldp x22,x21,[sp, #0x40]
00aacb74	ldp x24,x23,[sp, #0x30]
00aacb78	ldp x26,x25,[sp, #0x20]
00aacb7c	ldp x28,x27,[sp, #0x10]
00aacb80	add sp,sp,#0x70
00aacb84	ret
