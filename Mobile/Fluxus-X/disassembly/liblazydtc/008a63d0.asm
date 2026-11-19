; FUN_008a63d0 @ 008a63d0
008a63d0	sub sp,sp,#0x90
008a63d4	stp x29,x30,[sp, #0x60]
008a63d8	stp x22,x21,[sp, #0x70]
008a63dc	stp x20,x19,[sp, #0x80]
008a63e0	add x29,sp,#0x60
008a63e4	mrs x21,tpidr_el0
008a63e8	mov x20,x2
008a63ec	mov x19,x0
008a63f0	ldr x8,[x21, #0x28]
008a63f4	stur x8,[x29, #-0x8]
008a63f8	str x1,[sp, #0x18]
008a63fc	cbz x2,0x008a64a8
008a6400	adrp x8,0xd1b000
008a6404	ldr w9,[x20, #0x8]
008a6408	ldr w8,[x8, #0x240]
008a640c	cmp w9,w8
008a6410	b.ne 0x008a64a8
008a6414	ldrb w8,[x20, #0x28]
008a6418	tbnz w8,#0x0,0x008a64a8
008a641c	ldr x8,[x19, #0x80]
008a6420	cbz x8,0x008a64a8
008a6424	ldr x8,[x20, #0x50]
008a6428	mov x10,#0x7c15
008a642c	movk x10,#0x7f4a, LSL #16
008a6430	lsr x9,x8,#0x4
008a6434	movk x10,#0x79b9, LSL #32
008a6438	movk x10,#0x9e37, LSL #48
008a643c	eor x9,x9,x8, LSR #0x9
008a6440	mul x9,x9,x10
008a6444	ldrb w10,[x19, #0x88]
008a6448	lsr x9,x9,x10
008a644c	ldr x10,[x19, #0x70]
008a6450	lsr x11,x9,#0x6
008a6454	ldr x11,[x10, x11, LSL #0x3]
008a6458	lsr x11,x11,x9
008a645c	tbz w11,#0x0,0x008a64a8
008a6460	ldr x12,[x19, #0x78]
008a6464	ldr x11,[x19, #0x58]
008a6468	sub x12,x12,#0x1
008a646c	lsl x13,x9,#0x4
008a6470	ldr x13,[x11, x13#0x0]
008a6474	cmp x13,x8
008a6478	b.eq 0x008a6498
008a647c	add x9,x9,#0x1
008a6480	and x9,x9,x12
008a6484	lsr x13,x9,#0x6
008a6488	ldr x13,[x10, x13, LSL #0x3]
008a648c	lsr x13,x13,x9
008a6490	tbnz w13,#0x0,0x008a646c
008a6494	b 0x008a64a8
008a6498	add x8,x11,x9, LSL #0x4
008a649c	ldr x8,[x8, #0x8]
008a64a0	cbz x8,0x008a64a8
008a64a4	ldr x20,[x8, #0x58]
008a64a8	add x0,x19,#0xe0
008a64ac	add x1,sp,#0x18
008a64b0	bl 0x008a659c
008a64b4	movi v0.2D,#0x0
008a64b8	ldp x3,x4,[x19, #0x20]
008a64bc	mov w8,#0x40
008a64c0	ldr x5,[x19, #0x50]
008a64c4	add x22,sp,#0x20
008a64c8	str x20,[x0]
008a64cc	strb w8,[sp, #0x50]
008a64d0	stp q0,q0,[sp, #0x30]
008a64d4	str q0,[sp, #0x20]
008a64d8	stp xzr,xzr,[sp, #0x8]
008a64dc	add x1,sp,#0x8
008a64e0	add x2,x19,#0x58
008a64e4	add x6,sp,#0x20
008a64e8	mov x0,x20
008a64ec	bl 0x008a6690
008a64f0	mov w20,w0
008a64f4	ldr x0,[x19, #0x18]
008a64f8	add x1,sp,#0x18
008a64fc	bl 0x008a6bb8
008a6500	ldr x8,[sp, #0x20]
008a6504	str w20,[x0]
008a6508	cbz x8,0x008a6540
008a650c	mov x0,x8
008a6510	orr x19,x22,#0x8
008a6514	bl 0x00c301d0
008a6518	ldr x0,[sp, #0x38]
008a651c	str xzr,[sp, #0x20]
008a6520	bl 0x00c301d0
008a6524	mov x0,xzr
008a6528	stp xzr,xzr,[x19]
008a652c	str xzr,[x19, #0x10]
008a6530	bl 0x00c301d0
008a6534	mov w8,#0x40
008a6538	str xzr,[sp, #0x40]
008a653c	strb w8,[sp, #0x50]
008a6540	ldr x0,[sp, #0x38]
008a6544	bl 0x00c301d0
008a6548	ldr x8,[x21, #0x28]
008a654c	ldur x9,[x29, #-0x8]
008a6550	cmp x8,x9
008a6554	b.ne 0x008a6598
008a6558	mov w0,w20
008a655c	ldp x20,x19,[sp, #0x80]
008a6560	ldp x22,x21,[sp, #0x70]
008a6564	ldp x29,x30,[sp, #0x60]
008a6568	add sp,sp,#0x90
008a656c	ret
008a6598	bl 0x00c2fec0
