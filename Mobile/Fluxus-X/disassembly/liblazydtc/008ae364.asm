; FUN_008ae364 @ 008ae364
008ae364	sub sp,sp,#0x40
008ae368	stp x29,x30,[sp, #0x10]
008ae36c	str x21,[sp, #0x20]
008ae370	stp x20,x19,[sp, #0x30]
008ae374	add x29,sp,#0x10
008ae378	mrs x21,tpidr_el0
008ae37c	mov w20,w1
008ae380	mov x19,x0
008ae384	ldr x8,[x21, #0x28]
008ae388	cmp w1,#0x2
008ae38c	str x8,[sp, #0x8]
008ae390	b.lt 0x008ae3f4
008ae394	ldr x8,[x19, #0x60]
008ae398	ldp x8,x9,[x8, #0x8]
008ae39c	cmp x9,x8
008ae3a0	b.cc 0x008ae3b0
008ae3a4	mov x0,x19
008ae3a8	mov w1,#0x1
008ae3ac	bl 0x008b52c4
008ae3b0	ldrb w8,[x19, #0x2]
008ae3b4	tbz w8,#0x2,0x008ae3c8
008ae3b8	add x2,x19,#0x38
008ae3bc	mov x0,x19
008ae3c0	mov x1,x19
008ae3c4	bl 0x008b63a4
008ae3c8	ldp x8,x9,[x19, #0x68]
008ae3cc	mov x0,x19
008ae3d0	mov w1,w20
008ae3d4	sub x8,x8,x9
008ae3d8	lsr x8,x8,#0x4
008ae3dc	sub w2,w8,#0x1
008ae3e0	bl 0x008cc074
008ae3e4	ldr x8,[x19, #0x68]
008ae3e8	sub w9,w20,#0x1
008ae3ec	sub x8,x8,w9, UXTW  #0x4
008ae3f0	b 0x008ae4b4
008ae3f4	cbnz w20,0x008ae4b8
008ae3f8	ldrb w8,[x19, #0x2]
008ae3fc	tbz w8,#0x2,0x008ae410
008ae400	add x2,x19,#0x38
008ae404	mov x0,x19
008ae408	mov x1,x19
008ae40c	bl 0x008b63a4
008ae410	ldr x8,[x19, #0x50]
008ae414	ldr x20,[x19, #0x68]
008ae418	ldr x9,[x8, #0x18]
008ae41c	add x10,x20,#0x10
008ae420	cmp x10,x9
008ae424	b.ls 0x008ae48c
008ae428	ldr x10,[x19, #0x70]
008ae42c	mov w11,#0xf3f0
008ae430	movk w11,#0x1, LSL #16
008ae434	sub x10,x20,x10
008ae438	cmp x10,x11
008ae43c	b.gt 0x008ae4dc
008ae440	ldr x10,[x19, #0x48]
008ae444	sub x10,x10,x20
008ae448	cmp x10,#0x10
008ae44c	b.gt 0x008ae47c
008ae450	mov w8,#0x1
008ae454	nop
008ae458	adr x1,0x8aa604
008ae45c	add x2,sp,#0x4
008ae460	mov x0,x19
008ae464	str w8,[sp, #0x4]
008ae468	bl 0x008b3edc
008ae46c	cbnz w0,0x008ae4dc
008ae470	ldr x8,[x19, #0x50]
008ae474	ldr x20,[x19, #0x68]
008ae478	ldr x9,[x8, #0x18]
008ae47c	add x10,x20,#0x10
008ae480	cmp x9,x10
008ae484	b.cs 0x008ae48c
008ae488	str x10,[x8, #0x18]
008ae48c	adrp x1,0x2ab000
008ae490	add x1,x1,#0x32c
008ae494	mov x0,x19
008ae498	mov x2,xzr
008ae49c	bl 0x008b9ff8
008ae4a0	str x0,[x20]
008ae4a4	mov w8,#0x5
008ae4a8	ldr x9,[x19, #0x68]
008ae4ac	str w8,[x20, #0xc]
008ae4b0	add x8,x9,#0x10
008ae4b4	str x8,[x19, #0x68]
008ae4b8	ldr x8,[x21, #0x28]
008ae4bc	ldr x9,[sp, #0x8]
008ae4c0	cmp x8,x9
008ae4c4	b.ne 0x008ae504
008ae4c8	ldp x20,x19,[sp, #0x30]
008ae4cc	ldr x21,[sp, #0x20]
008ae4d0	ldp x29,x30,[sp, #0x10]
008ae4d4	add sp,sp,#0x40
008ae4d8	ret
008ae4dc	adrp x1,0x2b6000
008ae4e0	add x1,x1,#0xc71
008ae4e4	mov x0,x19
008ae4e8	bl 0x008b9568
008ae4ec	ldr x8,[x21, #0x28]
008ae4f0	ldr x9,[sp, #0x8]
008ae4f4	cmp x8,x9
008ae4f8	b.ne 0x008ae504
008ae4fc	mov x0,x19
008ae500	bl 0x008aa5f4
008ae504	bl 0x00c2fec0
