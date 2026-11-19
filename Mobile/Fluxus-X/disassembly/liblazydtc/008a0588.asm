; FUN_008a0588 @ 008a0588
008a0588	sub sp,sp,#0x60
008a058c	stp x29,x30,[sp, #0x40]
008a0590	str x19,[sp, #0x50]
008a0594	add x29,sp,#0x40
008a0598	mrs x19,tpidr_el0
008a059c	ldr x8,[x19, #0x28]
008a05a0	stur x8,[x29, #-0x8]
008a05a4	ldr x0,[x0, #0xc0]
008a05a8	cbz x0,0x008a0698
008a05ac	cbz x3,0x008a05d0
008a05b0	str x2,[sp]
008a05b4	mov w8,wzr
008a05b8	ldp q1,q0,[x3]
008a05bc	ldr x9,[x3, #0x20]
008a05c0	str x9,[sp, #0x28]
008a05c4	stur q0,[sp, #0x18]
008a05c8	stur q1,[sp, #0x8]
008a05cc	b 0x008a068c
008a05d0	ldr x8,[x1, #0x28]
008a05d4	cbz x8,0x008a0674
008a05d8	lsl w8,w2,#0x3
008a05dc	mov x10,#0x2d69
008a05e0	lsr x9,x2,#0x20
008a05e4	movk x10,#0xeb38, LSL #16
008a05e8	add x8,x8,#0x8
008a05ec	movk x10,#0xea08, LSL #32
008a05f0	eor x8,x8,x9
008a05f4	movk x10,#0x9ddf, LSL #48
008a05f8	mul x8,x8,x10
008a05fc	eor x9,x9,x8, LSR #0x2f
008a0600	eor x8,x9,x8
008a0604	mov x9,#0x959d
008a0608	mul x8,x8,x10
008a060c	movk x9,#0xb8f4, LSL #16
008a0610	movk x9,#0xd34f, LSL #32
008a0614	movk x9,#0x949d, LSL #48
008a0618	eor x8,x8,x8, LSR #0x2f
008a061c	mul x8,x8,x9
008a0620	ldrb w9,[x1, #0x30]
008a0624	lsr x9,x8,x9
008a0628	ldr x8,[x1, #0x18]
008a062c	lsr x10,x9,#0x6
008a0630	ldr x10,[x8, x10, LSL #0x3]
008a0634	lsr x10,x10,x9
008a0638	tbz w10,#0x0,0x008a0674
008a063c	ldr x11,[x1, #0x20]
008a0640	ldr x10,[x1]
008a0644	mov w12,#0x30
008a0648	sub x11,x11,#0x1
008a064c	madd x13,x9,x12,x10
008a0650	ldr x14,[x13]
008a0654	cmp x14,x2
008a0658	b.eq 0x008a06b8
008a065c	add x9,x9,#0x1
008a0660	and x9,x9,x11
008a0664	lsr x13,x9,#0x6
008a0668	ldr x13,[x8, x13, LSL #0x3]
008a066c	lsr x13,x13,x9
008a0670	tbnz w13,#0x0,0x008a064c
008a0674	movi v0.2D,#0x0
008a0678	str x2,[sp]
008a067c	mov w8,#0x1
008a0680	str xzr,[sp, #0x28]
008a0684	stur q0,[sp, #0x8]
008a0688	stur q0,[sp, #0x18]
008a068c	mov x1,sp
008a0690	strb w8,[sp, #0x30]
008a0694	bl 0x008a06c4
008a0698	ldr x8,[x19, #0x28]
008a069c	ldur x9,[x29, #-0x8]
008a06a0	cmp x8,x9
008a06a4	b.ne 0x008a06c0
008a06a8	ldp x29,x30,[sp, #0x40]
008a06ac	ldr x19,[sp, #0x50]
008a06b0	add sp,sp,#0x60
008a06b4	ret
008a06b8	add x3,x13,#0x8
008a06bc	b 0x008a05b0
008a06c0	bl 0x00c2fec0
