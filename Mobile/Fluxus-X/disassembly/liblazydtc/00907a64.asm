; FUN_00907a64 @ 00907a64
00907a64	sub sp,sp,#0x80
00907a68	stp x22,x21,[sp, #0x50]
00907a6c	stp x20,x19,[sp, #0x60]
00907a70	stp x29,x30,[sp, #0x70]
00907a74	add x29,sp,#0x70
00907a78	mrs x22,tpidr_el0
00907a7c	ldr x8,[x22, #0x28]
00907a80	mov x19,x2
00907a84	mov x20,x1
00907a88	movi v0.2D,#0x0
00907a8c	stur x8,[x29, #-0x28]
00907a90	stur q0,[sp, #0x38]
00907a94	stur q0,[sp, #0x28]
00907a98	stp xzr,xzr,[sp, #0x18]
00907a9c	stp xzr,xzr,[sp, #0x8]
00907aa0	str xzr,[sp]
00907aa4	mov x21,x0
00907aa8	cbz x0,0x00907b54
00907aac	ldrb w8,[x21, #0x24]
00907ab0	tbnz w8,#0x0,0x00907ac4
00907ab4	ldr x0,[x21, #0x8]
00907ab8	cbz x0,0x00907ac4
00907abc	ldrb w9,[x0, #0x24]
00907ac0	tbz w9,#0x0,0x00907aa4
00907ac4	tbz w8,#0x1,0x00907ad8
00907ac8	ldr x21,[x21, #0x8]
00907acc	cbz x21,0x00907b54
00907ad0	ldrb w8,[x21, #0x24]
00907ad4	tbnz w8,#0x1,0x00907ac8
00907ad8	ldr x8,[x21]
00907adc	add x2,sp,#0x28
00907ae0	mov x0,x21
00907ae4	mov x1,x20
00907ae8	ldr x8,[x8, #0x38]
00907aec	blr x8
00907af0	ldr x21,[x21, #0x8]
00907af4	cbnz x21,0x00907ad8
00907af8	ldr w8,[sp, #0x3c]
00907afc	cbz w8,0x00907b54
00907b00	ldr w9,[sp, #0x3c]
00907b04	mov x8,xzr
00907b08	mov w1,wzr
00907b0c	add x10,sp,#0x28
00907b10	mov x11,sp
00907b14	add x12,x10,x8
00907b18	ldrb w12,[x12, #0x18]
00907b1c	lsr w13,w12,#0x1
00907b20	and w12,w12,#0x1
00907b24	bfm w12,w13,#0x1e,#0x0
00907b28	cbz w12,0x00907b44
00907b2c	ldr w13,[x10, x8, LSL #0x2]
00907b30	and w12,w12,#0xff
00907b34	add x14,x11,w1, UXTW  #0x3
00907b38	add w1,w1,#0x1
00907b3c	strh w12,[x14, #0x4]
00907b40	str w13,[x14]
00907b44	add x8,x8,#0x1
00907b48	cmp x8,x9
00907b4c	b.cc 0x00907b14
00907b50	b 0x00907b58
00907b54	mov w1,wzr
00907b58	mov x0,sp
00907b5c	mov x2,x19
00907b60	bl 0x0093475c
00907b64	ldr x8,[x22, #0x28]
00907b68	ldur x9,[x29, #-0x28]
00907b6c	cmp x8,x9
00907b70	b.ne 0x00907b88
00907b74	ldp x29,x30,[sp, #0x70]
00907b78	ldp x20,x19,[sp, #0x60]
00907b7c	ldp x22,x21,[sp, #0x50]
00907b80	add sp,sp,#0x80
00907b84	ret
00907b88	bl 0x00c2fec0
