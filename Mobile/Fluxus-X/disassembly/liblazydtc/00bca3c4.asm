; std::__ndk1::to_string @ 00bca3c4
00bca3c4	paciasp
00bca3c8	sub sp,sp,#0x60
00bca3cc	str d8,[sp, #0x20]
00bca3d0	stp x29,x30,[sp, #0x28]
00bca3d4	str x23,[sp, #0x38]
00bca3d8	stp x22,x21,[sp, #0x40]
00bca3dc	stp x20,x19,[sp, #0x50]
00bca3e0	add x29,sp,#0x28
00bca3e4	fmov d8,d0
00bca3e8	mov x19,x8
00bca3ec	stp xzr,xzr,[sp, #0x8]
00bca3f0	str xzr,[sp, #0x18]
00bca3f4	add x0,sp,#0x8
00bca3f8	mov w1,#0x16
00bca3fc	mov w2,wzr
00bca400	add x20,sp,#0x8
00bca404	bl 0x00c30250
00bca408	ldrb w8,[sp, #0x8]
00bca40c	ldr x9,[sp, #0x10]
00bca410	orr x21,x20,#0x1
00bca414	adrp x20,0x2a1000
00bca418	add x20,x20,#0x3e2
00bca41c	mov w22,#0x1
00bca420	lsr x10,x8,#0x1
00bca424	tst w8,#0x1
00bca428	csel x23,x10,x9,eq
00bca42c	b 0x00bca440
00bca430	add x0,sp,#0x8
00bca434	mov w2,wzr
00bca438	bl 0x00c30250
00bca43c	ldrb w8,[sp, #0x8]
00bca440	fmov d0,d8
00bca444	ldr x9,[sp, #0x18]
00bca448	tst w8,#0x1
00bca44c	add x1,x23,#0x1
00bca450	mov x2,x20
00bca454	csel x0,x21,x9,eq
00bca458	bl 0x00c31ed0
00bca45c	tbnz w0,#0x1f,0x00bca474
00bca460	mov w8,w0
00bca464	cmp x23,x8
00bca468	b.cs 0x00bca4b8
00bca46c	mov x23,x8
00bca470	b 0x00bca478
00bca474	orr x23,x22,x23, LSL #0x1
00bca478	ldrb w8,[sp, #0x8]
00bca47c	ldr x9,[sp, #0x10]
00bca480	lsr x10,x8,#0x1
00bca484	tst w8,#0x1
00bca488	csel x9,x10,x9,eq
00bca48c	subs x1,x23,x9
00bca490	b.hi 0x00bca430
00bca494	tbnz w8,#0x0,0x00bca4a8
00bca498	lsl w8,w23,#0x1
00bca49c	strb w8,[sp, #0x8]
00bca4a0	mov x8,x21
00bca4a4	b 0x00bca4b0
00bca4a8	ldr x8,[sp, #0x18]
00bca4ac	str x23,[sp, #0x10]
00bca4b0	strb wzr,[x8, x23]
00bca4b4	b 0x00bca43c
00bca4b8	ldrb w9,[sp, #0x8]
00bca4bc	ldr x10,[sp, #0x10]
00bca4c0	lsr x11,x9,#0x1
00bca4c4	tst w9,#0x1
00bca4c8	csel x10,x11,x10,eq
00bca4cc	subs x1,x8,x10
00bca4d0	b.ls 0x00bca4e4
00bca4d4	add x0,sp,#0x8
00bca4d8	mov w2,wzr
00bca4dc	bl 0x00c30250
00bca4e0	b 0x00bca500
00bca4e4	tbnz w9,#0x0,0x00bca4f4
00bca4e8	lsl w9,w0,#0x1
00bca4ec	strb w9,[sp, #0x8]
00bca4f0	b 0x00bca4fc
00bca4f4	ldr x21,[sp, #0x18]
00bca4f8	str x8,[sp, #0x10]
00bca4fc	strb wzr,[x21, x8]
00bca500	ldur q0,[sp, #0x8]
00bca504	ldr x8,[sp, #0x18]
00bca508	add x0,sp,#0x8
00bca50c	stp xzr,xzr,[sp, #0x10]
00bca510	str q0,[x19]
00bca514	str x8,[x19, #0x10]
00bca518	str xzr,[sp, #0x8]
00bca51c	bl 0x00c43db0
00bca520	ldp x20,x19,[sp, #0x50]
00bca524	ldr x23,[sp, #0x38]
00bca528	ldp x22,x21,[sp, #0x40]
00bca52c	ldr d8,[sp, #0x20]
00bca530	ldp x29,x30,[sp, #0x28]
00bca534	add sp,sp,#0x60
00bca538	autiasp
00bca53c	ret
