; cpr::util::isTrue @ 008ff378
008ff378	sub sp,sp,#0x60
008ff37c	str x23,[sp, #0x20]
008ff380	stp x22,x21,[sp, #0x30]
008ff384	stp x20,x19,[sp, #0x40]
008ff388	stp x29,x30,[sp, #0x50]
008ff38c	add x29,sp,#0x50
008ff390	mrs x23,tpidr_el0
008ff394	ldr x8,[x23, #0x28]
008ff398	str x8,[sp, #0x18]
008ff39c	stp xzr,xzr,[sp, #0x8]
008ff3a0	str xzr,[sp]
008ff3a4	ldrb w8,[x0]
008ff3a8	tbnz w8,#0x0,0x008ff3d4
008ff3ac	ldr x8,[x0, #0x10]
008ff3b0	str x8,[sp, #0x10]
008ff3b4	ldr q0,[x0]
008ff3b8	str q0,[sp]
008ff3bc	ldrb w8,[sp]
008ff3c0	tbnz w8,#0x0,0x008ff440
008ff3c4	mov x9,sp
008ff3c8	orr x19,x9,#0x1
008ff3cc	lsr w9,w8,#0x1
008ff3d0	b 0x008ff444
008ff3d4	ldr x19,[x0, #0x8]
008ff3d8	cmn x19,#0x10
008ff3dc	b.cs 0x008ff4ec
008ff3e0	ldr x20,[x0, #0x10]
008ff3e4	cmp x19,#0x17
008ff3e8	b.cs 0x008ff404
008ff3ec	mov x9,sp
008ff3f0	lsl w8,w19,#0x1
008ff3f4	orr x21,x9,#0x1
008ff3f8	strb w8,[sp]
008ff3fc	cbnz x19,0x008ff424
008ff400	b 0x008ff434
008ff404	add x8,x19,#0x10
008ff408	and x22,x8,#-0x10
008ff40c	mov x0,x22
008ff410	bl 0x00c2fed0
008ff414	orr x8,x22,#0x1
008ff418	mov x21,x0
008ff41c	stp x19,x0,[sp, #0x8]
008ff420	str x8,[sp]
008ff424	mov x0,x21
008ff428	mov x1,x20
008ff42c	mov x2,x19
008ff430	bl 0x00c2ffd0
008ff434	strb wzr,[x21, x19]
008ff438	ldrb w8,[sp]
008ff43c	tbz w8,#0x0,0x008ff3c4
008ff440	ldp x9,x19,[sp, #0x8]
008ff444	add x20,x19,x9
008ff448	cmp x19,x20
008ff44c	b.eq 0x008ff468
008ff450	ldrb w0,[x19]
008ff454	bl 0x00c30f10
008ff458	strb w0,[x19], #0x1
008ff45c	cmp x20,x19
008ff460	b.ne 0x008ff450
008ff464	ldrb w8,[sp]
008ff468	ldr x10,[sp, #0x8]
008ff46c	and w9,w8,#0x1
008ff470	lsr w8,w8,#0x1
008ff474	cmp w9,#0x0
008ff478	csel x8,x8,x10,eq
008ff47c	cmp x8,#0x4
008ff480	mov w19,wzr
008ff484	b.ne 0x008ff4b0
008ff488	ldr x8,[sp, #0x10]
008ff48c	mov x10,sp
008ff490	orr x10,x10,#0x1
008ff494	cmp w9,#0x0
008ff498	csel x8,x10,x8,eq
008ff49c	ldr w8,[x8]
008ff4a0	mov w10,#0x7274
008ff4a4	movk w10,#0x6575, LSL #16
008ff4a8	cmp w8,w10
008ff4ac	cset w19,eq
008ff4b0	cbz w9,0x008ff4bc
008ff4b4	ldr x0,[sp, #0x10]
008ff4b8	bl 0x00c301d0
008ff4bc	ldr x8,[x23, #0x28]
008ff4c0	ldr x9,[sp, #0x18]
008ff4c4	cmp x8,x9
008ff4c8	b.ne 0x008ff4e8
008ff4cc	mov w0,w19
008ff4d0	ldp x29,x30,[sp, #0x50]
008ff4d4	ldp x20,x19,[sp, #0x40]
008ff4d8	ldp x22,x21,[sp, #0x30]
008ff4dc	ldr x23,[sp, #0x20]
008ff4e0	add sp,sp,#0x60
008ff4e4	ret
008ff4e8	bl 0x00c2fec0
008ff4ec	mov x0,sp
008ff4f0	bl 0x00c30ce0
