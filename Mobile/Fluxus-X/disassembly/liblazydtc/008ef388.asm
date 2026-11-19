; cpr::Range::str @ 008ef388
008ef388	sub sp,sp,#0x80
008ef38c	str x21,[sp, #0x50]
008ef390	stp x20,x19,[sp, #0x60]
008ef394	stp x29,x30,[sp, #0x70]
008ef398	add x29,sp,#0x70
008ef39c	mrs x21,tpidr_el0
008ef3a0	ldr x9,[x21, #0x28]
008ef3a4	mov x20,x0
008ef3a8	mov x19,x8
008ef3ac	stur x9,[x29, #-0x28]
008ef3b0	ldr x0,[x0]
008ef3b4	tbnz x0,#0x3f,0x008ef3d4
008ef3b8	add x8,sp,#0x30
008ef3bc	bl 0x00c31760
008ef3c0	ldr x0,[x20, #0x8]
008ef3c4	tbnz x0,#0x3f,0x008ef3e4
008ef3c8	add x8,sp,#0x18
008ef3cc	bl 0x00c31760
008ef3d0	b 0x008ef3ec
008ef3d4	stp xzr,xzr,[sp, #0x30]
008ef3d8	str xzr,[sp, #0x40]
008ef3dc	ldr x0,[x20, #0x8]
008ef3e0	tbz x0,#0x3f,0x008ef3c8
008ef3e4	stp xzr,xzr,[sp, #0x18]
008ef3e8	str xzr,[sp, #0x28]
008ef3ec	adrp x1,0x2cc000
008ef3f0	add x1,x1,#0xc8b
008ef3f4	mov x8,sp
008ef3f8	add x0,sp,#0x30
008ef3fc	bl 0x00c30fa0
008ef400	ldrb w8,[sp, #0x18]
008ef404	ldp x10,x9,[sp, #0x20]
008ef408	add x11,sp,#0x18
008ef40c	orr x11,x11,#0x1
008ef410	tst w8,#0x1
008ef414	lsr w12,w8,#0x1
008ef418	csel x1,x11,x9,eq
008ef41c	csel x2,x12,x10,eq
008ef420	mov x0,sp
008ef424	bl 0x00c308c0
008ef428	ldr x8,[x0, #0x10]
008ef42c	str x8,[x19, #0x10]
008ef430	ldr q0,[x0]
008ef434	str q0,[x19]
008ef438	stp xzr,xzr,[x0, #0x8]
008ef43c	str xzr,[x0]
008ef440	ldrb w8,[sp]
008ef444	tbnz w8,#0x0,0x008ef484
008ef448	ldrb w8,[sp, #0x18]
008ef44c	tbnz w8,#0x0,0x008ef494
008ef450	ldrb w8,[sp, #0x30]
008ef454	tbz w8,#0x0,0x008ef460
008ef458	ldr x0,[sp, #0x40]
008ef45c	bl 0x00c301d0
008ef460	ldr x8,[x21, #0x28]
008ef464	ldur x9,[x29, #-0x28]
008ef468	cmp x8,x9
008ef46c	b.ne 0x008ef4a8
008ef470	ldp x29,x30,[sp, #0x70]
008ef474	ldp x20,x19,[sp, #0x60]
008ef478	ldr x21,[sp, #0x50]
008ef47c	add sp,sp,#0x80
008ef480	ret
008ef484	ldr x0,[sp, #0x10]
008ef488	bl 0x00c301d0
008ef48c	ldrb w8,[sp, #0x18]
008ef490	tbz w8,#0x0,0x008ef450
008ef494	ldr x0,[sp, #0x28]
008ef498	bl 0x00c301d0
008ef49c	ldrb w8,[sp, #0x30]
008ef4a0	tbnz w8,#0x0,0x008ef458
008ef4a4	b 0x008ef460
008ef4a8	bl 0x00c2fec0
