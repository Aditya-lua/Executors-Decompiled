; FUN_008a016c @ 008a016c
008a016c	sub sp,sp,#0x90
008a0170	stp x29,x30,[sp, #0x60]
008a0174	str x21,[sp, #0x70]
008a0178	stp x20,x19,[sp, #0x80]
008a017c	add x29,sp,#0x60
008a0180	mrs x21,tpidr_el0
008a0184	mov x19,x1
008a0188	mov x1,x2
008a018c	ldr x8,[x21, #0x28]
008a0190	mov x20,x0
008a0194	stur x8,[x29, #-0x8]
008a0198	add x8,sp,#0x30
008a019c	bl 0x0089d05c
008a01a0	ldr w8,[sp, #0x30]
008a01a4	cmp w8,#0x7
008a01a8	b.ne 0x008a0274
008a01ac	ldr x8,[x20, #0x78]
008a01b0	ldr x9,[x8, #0x28]
008a01b4	cbz x9,0x008a0260
008a01b8	lsl w9,w19,#0x3
008a01bc	mov x11,#0x2d69
008a01c0	lsr x10,x19,#0x20
008a01c4	movk x11,#0xeb38, LSL #16
008a01c8	add x9,x9,#0x8
008a01cc	movk x11,#0xea08, LSL #32
008a01d0	eor x9,x9,x10
008a01d4	movk x11,#0x9ddf, LSL #48
008a01d8	mul x9,x9,x11
008a01dc	eor x10,x10,x9, LSR #0x2f
008a01e0	eor x9,x10,x9
008a01e4	mov x10,#0x959d
008a01e8	mul x9,x9,x11
008a01ec	movk x10,#0xb8f4, LSL #16
008a01f0	movk x10,#0xd34f, LSL #32
008a01f4	movk x10,#0x949d, LSL #48
008a01f8	eor x9,x9,x9, LSR #0x2f
008a01fc	mul x9,x9,x10
008a0200	ldrb w10,[x8, #0x30]
008a0204	lsr x9,x9,x10
008a0208	ldr x10,[x8, #0x18]
008a020c	lsr x11,x9,#0x6
008a0210	ldr x11,[x10, x11, LSL #0x3]
008a0214	lsr x11,x11,x9
008a0218	tbz w11,#0x0,0x008a0260
008a021c	ldr x11,[x8, #0x20]
008a0220	ldr x8,[x8]
008a0224	sub x11,x11,#0x1
008a0228	lsl x12,x9,#0x4
008a022c	ldr x12,[x8, x12#0x0]
008a0230	cmp x12,x19
008a0234	b.eq 0x008a0254
008a0238	add x9,x9,#0x1
008a023c	and x9,x9,x11
008a0240	lsr x12,x9,#0x6
008a0244	ldr x12,[x10, x12, LSL #0x3]
008a0248	lsr x12,x12,x9
008a024c	tbnz w12,#0x0,0x008a0228
008a0250	b 0x008a0260
008a0254	add x8,x8,x9, LSL #0x4
008a0258	ldr w8,[x8, #0x8]
008a025c	cbz w8,0x008a0274
008a0260	movi v0.2D,#0x0
008a0264	str xzr,[sp, #0x20]
008a0268	mov x2,sp
008a026c	stp q0,q0,[sp]
008a0270	b 0x008a0278
008a0274	add x2,sp,#0x30
008a0278	mov x0,x20
008a027c	mov x1,x19
008a0280	bl 0x008a02ac
008a0284	ldr x8,[x21, #0x28]
008a0288	ldur x9,[x29, #-0x8]
008a028c	cmp x8,x9
008a0290	b.ne 0x008a02a8
008a0294	ldp x20,x19,[sp, #0x80]
008a0298	ldr x21,[sp, #0x70]
008a029c	ldp x29,x30,[sp, #0x60]
008a02a0	add sp,sp,#0x90
008a02a4	ret
008a02a8	bl 0x00c2fec0
