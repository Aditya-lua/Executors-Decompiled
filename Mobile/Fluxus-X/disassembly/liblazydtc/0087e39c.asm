; FUN_0087e39c @ 0087e39c
0087e39c	sub sp,sp,#0x80
0087e3a0	stp x29,x30,[sp, #0x20]
0087e3a4	stp x28,x27,[sp, #0x30]
0087e3a8	stp x26,x25,[sp, #0x40]
0087e3ac	stp x24,x23,[sp, #0x50]
0087e3b0	stp x22,x21,[sp, #0x60]
0087e3b4	stp x20,x19,[sp, #0x70]
0087e3b8	add x29,sp,#0x20
0087e3bc	mrs x23,tpidr_el0
0087e3c0	movi v0.2D,#0x0
0087e3c4	mov x24,x0
0087e3c8	ldr x8,[x23, #0x28]
0087e3cc	stur x8,[x29, #-0x8]
0087e3d0	adrp x8,0xc4a000
0087e3d4	add x8,x8,#0x770
0087e3d8	stp x8,x1,[x0]
0087e3dc	stp x2,x3,[x0, #0x110]
0087e3e0	stp x4,x5,[x0, #0x120]
0087e3e4	stp q0,q0,[x0, #0x20]
0087e3e8	stp q0,q0,[x0, #0x40]
0087e3ec	stp q0,q0,[x0, #0x60]
0087e3f0	stp q0,q0,[x0, #0x80]
0087e3f4	stp q0,q0,[x0, #0xa0]
0087e3f8	stp q0,q0,[x0, #0xc0]
0087e3fc	stp q0,q0,[x0, #0xe0]
0087e400	str q0,[x0, #0x100]
0087e404	str q0,[x24, #0x10]!
0087e408	ldr x25,[x4, #0x58]
0087e40c	cbz x25,0x0087e594
0087e410	ldr x0,[x25]
0087e414	cbz x0,0x0087e594
0087e418	mov x26,#0x7c15
0087e41c	mov x19,x5
0087e420	mov x20,x4
0087e424	movk x26,#0x7f4a, LSL #16
0087e428	mov x21,x2
0087e42c	mov w27,#0x1
0087e430	movk x26,#0x79b9, LSL #32
0087e434	movk x26,#0x9e37, LSL #48
0087e438	b 0x0087e450
0087e43c	add x8,x10,x8, LSL #0x4
0087e440	ldr w8,[x8, #0x8]
0087e444	cbz w8,0x0087e4ec
0087e448	ldr x0,[x25, #0x8]!
0087e44c	cbz x0,0x0087e594
0087e450	mov w1,#0x2e
0087e454	bl 0x00c30890
0087e458	ldr x1,[x25]
0087e45c	cbz x0,0x0087e4f4
0087e460	sub x2,x0,x1
0087e464	mov x28,x0
0087e468	mov x0,x19
0087e46c	bl 0x00852f98
0087e470	mov x22,x0
0087e474	add x1,x28,#0x1
0087e478	mov x0,x19
0087e47c	bl 0x00853270
0087e480	cbz x22,0x0087e448
0087e484	cbz x0,0x0087e448
0087e488	ldr x8,[x21, #0x28]
0087e48c	cbz x8,0x0087e4ec
0087e490	lsr x8,x0,#0x4
0087e494	ldrb w9,[x21, #0x30]
0087e498	eor x8,x8,x0, LSR #0x9
0087e49c	mul x8,x8,x26
0087e4a0	lsr x8,x8,x9
0087e4a4	ldr x9,[x21, #0x18]
0087e4a8	lsr x10,x8,#0x6
0087e4ac	ldr x10,[x9, x10, LSL #0x3]
0087e4b0	lsr x10,x10,x8
0087e4b4	tbz w10,#0x0,0x0087e4ec
0087e4b8	ldr x11,[x21, #0x20]
0087e4bc	ldr x10,[x21]
0087e4c0	sub x11,x11,#0x1
0087e4c4	lsl x12,x8,#0x4
0087e4c8	ldr x12,[x10, x12#0x0]
0087e4cc	cmp x12,x0
0087e4d0	b.eq 0x0087e43c
0087e4d4	add x8,x8,#0x1
0087e4d8	and x8,x8,x11
0087e4dc	lsr x12,x8,#0x6
0087e4e0	ldr x12,[x9, x12, LSL #0x3]
0087e4e4	lsr x12,x12,x8
0087e4e8	tbnz w12,#0x0,0x0087e4c4
0087e4ec	str x22,[sp, #0x8]
0087e4f0	b 0x0087e578
0087e4f4	mov x0,x19
0087e4f8	bl 0x00853270
0087e4fc	cbz x0,0x0087e448
0087e500	ldr x8,[x21, #0x28]
0087e504	cbz x8,0x0087e574
0087e508	lsr x8,x0,#0x4
0087e50c	ldrb w9,[x21, #0x30]
0087e510	eor x8,x8,x0, LSR #0x9
0087e514	mul x8,x8,x26
0087e518	lsr x8,x8,x9
0087e51c	ldr x9,[x21, #0x18]
0087e520	lsr x10,x8,#0x6
0087e524	ldr x10,[x9, x10, LSL #0x3]
0087e528	lsr x10,x10,x8
0087e52c	tbz w10,#0x0,0x0087e574
0087e530	ldr x11,[x21, #0x20]
0087e534	ldr x10,[x21]
0087e538	sub x11,x11,#0x1
0087e53c	lsl x12,x8,#0x4
0087e540	ldr x12,[x10, x12#0x0]
0087e544	cmp x12,x0
0087e548	b.eq 0x0087e568
0087e54c	add x8,x8,#0x1
0087e550	and x8,x8,x11
0087e554	lsr x12,x8,#0x6
0087e558	ldr x12,[x9, x12, LSL #0x3]
0087e55c	lsr x12,x12,x8
0087e560	tbnz w12,#0x0,0x0087e53c
0087e564	b 0x0087e574
0087e568	add x8,x10,x8, LSL #0x4
0087e56c	ldr w8,[x8, #0x8]
0087e570	cbnz w8,0x0087e448
0087e574	str xzr,[sp, #0x8]
0087e578	str x0,[sp, #0x10]
0087e57c	add x0,sp,#0x8
0087e580	mov x1,x20
0087e584	bl 0x0087e5f8
0087e588	tbnz w0,#0x1f,0x0087e448
0087e58c	strb w27,[x24, w0, UXTW ]
0087e590	b 0x0087e448
0087e594	ldr x8,[x23, #0x28]
0087e598	ldur x9,[x29, #-0x8]
0087e59c	cmp x8,x9
0087e5a0	b.ne 0x0087e5c4
0087e5a4	ldp x20,x19,[sp, #0x70]
0087e5a8	ldp x22,x21,[sp, #0x60]
0087e5ac	ldp x24,x23,[sp, #0x50]
0087e5b0	ldp x26,x25,[sp, #0x40]
0087e5b4	ldp x28,x27,[sp, #0x30]
0087e5b8	ldp x29,x30,[sp, #0x20]
0087e5bc	add sp,sp,#0x80
0087e5c0	ret
0087e5c4	bl 0x00c2fec0
