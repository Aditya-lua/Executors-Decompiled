; FUN_008be474 @ 008be474
008be474	sub sp,sp,#0x1c0
008be478	stp x29,x30,[sp, #0x160]
008be47c	stp x28,x27,[sp, #0x170]
008be480	stp x26,x25,[sp, #0x180]
008be484	stp x24,x23,[sp, #0x190]
008be488	stp x22,x21,[sp, #0x1a0]
008be48c	stp x20,x19,[sp, #0x1b0]
008be490	add x29,sp,#0x160
008be494	mrs x22,tpidr_el0
008be498	mov x20,x2
008be49c	mov x19,x0
008be4a0	ldr x8,[x22, #0x28]
008be4a4	mov x21,x1
008be4a8	stur x8,[x29, #-0x10]
008be4ac	ldr x8,[x0, #0x50]
008be4b0	ldrb w23,[x0, #0x3]
008be4b4	ldp x27,x9,[x0, #0x68]
008be4b8	ldr x28,[x8, #0x18]
008be4bc	cmp w23,#0x6
008be4c0	str x9,[sp, #0x8]
008be4c4	b.eq 0x008be4d0
008be4c8	cmp w23,#0x1
008be4cc	b.ne 0x008be4dc
008be4d0	ldr x9,[x8, #0x10]
008be4d4	strb wzr,[x19, #0x3]
008be4d8	str x9,[x19, #0x70]
008be4dc	ldr x9,[x8, #0x8]
008be4e0	ldr x26,[x8, #0x20]
008be4e4	ldr x25,[x19, #0x58]
008be4e8	ldr x24,[x9]
008be4ec	cbz x26,0x008be518
008be4f0	ldr x9,[x8]
008be4f4	ldr x10,[x9, #0x30]
008be4f8	ldrsw x9,[x9, #0xb8]
008be4fc	add x9,x10,x9, LSL #0x2
008be500	cmp x26,x9
008be504	b.eq 0x008be518
008be508	add x9,x26,#0x4
008be50c	str x9,[x8, #0x20]
008be510	ldr x8,[x19, #0x68]
008be514	b 0x008be51c
008be518	mov x8,x27
008be51c	ldr x9,[x19, #0x48]
008be520	sub x9,x9,x8
008be524	cmp x9,#0x140
008be528	b.gt 0x008be53c
008be52c	mov x0,x19
008be530	mov w1,#0x14
008be534	bl 0x008b41e4
008be538	ldr x8,[x19, #0x68]
008be53c	ldr x9,[x19, #0x50]
008be540	ldrb w10,[x24, #0x6]
008be544	add x8,x8,#0x140
008be548	sub x27,x27,x25
008be54c	sub x28,x28,x25
008be550	str x8,[x9, #0x18]
008be554	cbz w10,0x008be560
008be558	mov w0,#0xffffffff
008be55c	b 0x008be58c
008be560	ldr x8,[x9, #0x20]
008be564	ldr x0,[x9]
008be568	cbz x8,0x008be584
008be56c	ldr x9,[x0, #0x30]
008be570	subs x8,x8,x9
008be574	b.eq 0x008be584
008be578	lsr x8,x8,#0x2
008be57c	sub w1,w8,#0x1
008be580	b 0x008be588
008be584	mov w1,wzr
008be588	bl 0x008b3e4c
008be58c	str w0,[sp, #0x20]
008be590	add x1,sp,#0x10
008be594	mov x0,x19
008be598	str x20,[sp, #0x10]
008be59c	blr x21
008be5a0	ldr x8,[x19, #0x50]
008be5a4	cmp w23,#0x6
008be5a8	str x26,[x8, #0x20]
008be5ac	ldp x9,x8,[x19, #0x50]
008be5b0	add x10,x8,x28
008be5b4	add x11,x8,x27
008be5b8	str x10,[x9, #0x18]
008be5bc	str x11,[x19, #0x68]
008be5c0	b.eq 0x008be5d8
008be5c4	cmp w23,#0x1
008be5c8	b.ne 0x008be5ec
008be5cc	ldrb w9,[x19, #0x3]
008be5d0	cmp w9,#0x1
008be5d4	b.eq 0x008be5ec
008be5d8	ldr x9,[sp, #0x8]
008be5dc	strb w23,[x19, #0x3]
008be5e0	sub x9,x9,x25
008be5e4	add x8,x8,x9
008be5e8	str x8,[x19, #0x70]
008be5ec	ldr x8,[x22, #0x28]
008be5f0	ldur x9,[x29, #-0x10]
008be5f4	cmp x8,x9
008be5f8	b.ne 0x008be61c
008be5fc	ldp x20,x19,[sp, #0x1b0]
008be600	ldp x22,x21,[sp, #0x1a0]
008be604	ldp x24,x23,[sp, #0x190]
008be608	ldp x26,x25,[sp, #0x180]
008be60c	ldp x28,x27,[sp, #0x170]
008be610	ldp x29,x30,[sp, #0x160]
008be614	add sp,sp,#0x1c0
008be618	ret
008be61c	bl 0x00c2fec0
