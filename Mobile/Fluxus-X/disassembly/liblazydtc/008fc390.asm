; cpr::CurlContainer<cpr::Pair>::GetContent @ 008fc390
008fc390	sub sp,sp,#0xd0
008fc394	stp x28,x27,[sp, #0x70]
008fc398	stp x26,x25,[sp, #0x80]
008fc39c	stp x24,x23,[sp, #0x90]
008fc3a0	stp x22,x21,[sp, #0xa0]
008fc3a4	stp x20,x19,[sp, #0xb0]
008fc3a8	stp x29,x30,[sp, #0xc0]
008fc3ac	add x29,sp,#0xc0
008fc3b0	mov x19,x8
008fc3b4	mrs x8,tpidr_el0
008fc3b8	str x8,[sp, #0x8]
008fc3bc	ldr x8,[x8, #0x28]
008fc3c0	mov x20,x0
008fc3c4	stur x8,[x29, #-0x58]
008fc3c8	stp xzr,xzr,[x19, #0x8]
008fc3cc	str xzr,[x19]
008fc3d0	ldp x10,x23,[x0, #0x8]
008fc3d4	str x1,[sp, #0x10]
008fc3d8	cmp x10,x23
008fc3dc	b.eq 0x008fc594
008fc3e0	add x11,sp,#0x50
008fc3e4	add x12,sp,#0x30
008fc3e8	mov x9,xzr
008fc3ec	mov w8,wzr
008fc3f0	add x22,x10,#0x30
008fc3f4	orr x28,x11,#0x1
008fc3f8	orr x21,x12,#0x1
008fc3fc	b 0x008fc40c
008fc400	ldrb w8,[x19]
008fc404	ldr x9,[x19, #0x8]
008fc408	add x22,x22,#0x30
008fc40c	ubfx w10,w8,#0x1,#0x7
008fc410	tst w8,#0x1
008fc414	csel x8,x10,x9,eq
008fc418	cbz x8,0x008fc430
008fc41c	adrp x1,0x2af000
008fc420	mov w2,#0x1
008fc424	mov x0,x19
008fc428	add x1,x1,#0xff
008fc42c	bl 0x00c308c0
008fc430	ldrb w8,[x20]
008fc434	cbz w8,0x008fc44c
008fc438	sub x1,x22,#0x18
008fc43c	ldr x0,[sp, #0x10]
008fc440	add x8,sp,#0x50
008fc444	bl 0x00c30e30
008fc448	b 0x008fc4d4
008fc44c	stp xzr,xzr,[sp, #0x58]
008fc450	str xzr,[sp, #0x50]
008fc454	mov x8,x22
008fc458	ldrb w9,[x8, #-0x18]!
008fc45c	tbnz w9,#0x0,0x008fc474
008fc460	ldr x9,[x8, #0x10]
008fc464	str x9,[sp, #0x60]
008fc468	ldr q0,[x8]
008fc46c	str q0,[sp, #0x50]
008fc470	b 0x008fc4d4
008fc474	ldur x24,[x22, #-0x10]
008fc478	cmn x24,#0x10
008fc47c	b.cs 0x008fc5c8
008fc480	ldur x25,[x22, #-0x8]
008fc484	cmp x24,#0x17
008fc488	b.cs 0x008fc4a0
008fc48c	lsl w8,w24,#0x1
008fc490	mov x26,x28
008fc494	strb w8,[sp, #0x50]
008fc498	cbnz x24,0x008fc4c0
008fc49c	b 0x008fc4d0
008fc4a0	add x8,x24,#0x10
008fc4a4	and x27,x8,#-0x10
008fc4a8	mov x0,x27
008fc4ac	bl 0x00c2fed0
008fc4b0	orr x8,x27,#0x1
008fc4b4	mov x26,x0
008fc4b8	stp x24,x0,[sp, #0x58]
008fc4bc	str x8,[sp, #0x50]
008fc4c0	mov x0,x26
008fc4c4	mov x1,x25
008fc4c8	mov x2,x24
008fc4cc	bl 0x00c2ffd0
008fc4d0	strb wzr,[x26, x24]
008fc4d4	sub x0,x22,#0x30
008fc4d8	adrp x1,0x2c4000
008fc4dc	add x8,sp,#0x18
008fc4e0	add x1,x1,#0xdac
008fc4e4	bl 0x00c30fa0
008fc4e8	ldrb w8,[sp, #0x50]
008fc4ec	ldp x10,x9,[sp, #0x58]
008fc4f0	tst w8,#0x1
008fc4f4	lsr w11,w8,#0x1
008fc4f8	csel x1,x28,x9,eq
008fc4fc	csel x2,x11,x10,eq
008fc500	add x0,sp,#0x18
008fc504	bl 0x00c308c0
008fc508	ldr x8,[x0, #0x10]
008fc50c	str x8,[sp, #0x40]
008fc510	ldr q0,[x0]
008fc514	str q0,[sp, #0x30]
008fc518	stp xzr,xzr,[x0, #0x8]
008fc51c	str xzr,[x0]
008fc520	ldrb w8,[sp, #0x30]
008fc524	ldp x10,x9,[sp, #0x38]
008fc528	tst w8,#0x1
008fc52c	lsr w11,w8,#0x1
008fc530	csel x1,x21,x9,eq
008fc534	csel x2,x11,x10,eq
008fc538	mov x0,x19
008fc53c	bl 0x00c308c0
008fc540	ldrb w8,[sp, #0x30]
008fc544	tbnz w8,#0x0,0x008fc564
008fc548	ldrb w8,[sp, #0x18]
008fc54c	tbnz w8,#0x0,0x008fc574
008fc550	ldrb w8,[sp, #0x50]
008fc554	tbnz w8,#0x0,0x008fc584
008fc558	cmp x23,x22
008fc55c	b.ne 0x008fc400
008fc560	b 0x008fc594
008fc564	ldr x0,[sp, #0x40]
008fc568	bl 0x00c301d0
008fc56c	ldrb w8,[sp, #0x18]
008fc570	tbz w8,#0x0,0x008fc550
008fc574	ldr x0,[sp, #0x28]
008fc578	bl 0x00c301d0
008fc57c	ldrb w8,[sp, #0x50]
008fc580	tbz w8,#0x0,0x008fc558
008fc584	ldr x0,[sp, #0x60]
008fc588	bl 0x00c301d0
008fc58c	cmp x23,x22
008fc590	b.ne 0x008fc400
008fc594	ldr x8,[sp, #0x8]
008fc598	ldr x8,[x8, #0x28]
008fc59c	ldur x9,[x29, #-0x58]
008fc5a0	cmp x8,x9
008fc5a4	b.ne 0x008fc5d0
008fc5a8	ldp x29,x30,[sp, #0xc0]
008fc5ac	ldp x20,x19,[sp, #0xb0]
008fc5b0	ldp x22,x21,[sp, #0xa0]
008fc5b4	ldp x24,x23,[sp, #0x90]
008fc5b8	ldp x26,x25,[sp, #0x80]
008fc5bc	ldp x28,x27,[sp, #0x70]
008fc5c0	add sp,sp,#0xd0
008fc5c4	ret
008fc5c8	add x0,sp,#0x50
008fc5cc	bl 0x00c30ce0
008fc5d0	bl 0x00c2fec0
