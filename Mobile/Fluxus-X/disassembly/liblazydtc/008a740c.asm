; FUN_008a740c @ 008a740c
008a740c	stp x29,x30,[sp, #-0x20]!
008a7410	stp x20,x19,[sp, #0x10]
008a7414	mov x29,sp
008a7418	mov x20,x1
008a741c	mov x19,x0
008a7420	bl 0x008a7504
008a7424	ldr x8,[x20]
008a7428	mov x11,#0x2d69
008a742c	movk x11,#0xeb38, LSL #16
008a7430	lsl w9,w8,#0x3
008a7434	lsr x10,x8,#0x20
008a7438	movk x11,#0xea08, LSL #32
008a743c	movk x11,#0x9ddf, LSL #48
008a7440	add x9,x9,#0x8
008a7444	eor x9,x9,x10
008a7448	mul x9,x9,x11
008a744c	eor x10,x10,x9, LSR #0x2f
008a7450	eor x9,x10,x9
008a7454	mov x10,#0x959d
008a7458	mul x9,x9,x11
008a745c	movk x10,#0xb8f4, LSL #16
008a7460	ldr x11,[x19, #0x18]
008a7464	movk x10,#0xd34f, LSL #32
008a7468	movk x10,#0x949d, LSL #48
008a746c	eor x9,x9,x9, LSR #0x2f
008a7470	mul x9,x9,x10
008a7474	ldrb w10,[x19, #0x30]
008a7478	lsr x9,x9,x10
008a747c	mov w10,#0x1
008a7480	lsr x12,x9,#0x6
008a7484	lsl x14,x10,x9
008a7488	ldr x10,[x19]
008a748c	ldr x13,[x11, x12, LSL #0x3]
008a7490	tst x14,x13
008a7494	b.eq 0x008a74d0
008a7498	ldr x12,[x19, #0x20]
008a749c	mov w16,#0x1
008a74a0	sub x15,x12,#0x1
008a74a4	lsl x12,x9,#0x4
008a74a8	ldr x12,[x10, x12#0x0]
008a74ac	cmp x12,x8
008a74b0	b.eq 0x008a74f0
008a74b4	add x9,x9,#0x1
008a74b8	and x9,x9,x15
008a74bc	lsr x12,x9,#0x6
008a74c0	lsl x14,x16,x9
008a74c4	ldr x13,[x11, x12, LSL #0x3]
008a74c8	tst x13,x14
008a74cc	b.ne 0x008a74a4
008a74d0	orr x13,x13,x14
008a74d4	str x13,[x11, x12, LSL #0x3]
008a74d8	add x11,x10,x9, LSL #0x4
008a74dc	ldr x12,[x19, #0x28]
008a74e0	str x8,[x11]
008a74e4	add x8,x12,#0x1
008a74e8	str wzr,[x11, #0x8]
008a74ec	str x8,[x19, #0x28]
008a74f0	add x8,x10,x9, LSL #0x4
008a74f4	add x0,x8,#0x8
008a74f8	ldp x20,x19,[sp, #0x10]
008a74fc	ldp x29,x30,[sp], #0x20
008a7500	ret
