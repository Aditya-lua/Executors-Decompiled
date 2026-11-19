; FUN_008ae508 @ 008ae508
008ae508	sub sp,sp,#0x40
008ae50c	stp x29,x30,[sp, #0x10]
008ae510	stp x22,x21,[sp, #0x20]
008ae514	stp x20,x19,[sp, #0x30]
008ae518	add x29,sp,#0x10
008ae51c	mrs x22,tpidr_el0
008ae520	mov w20,w2
008ae524	mov x19,x0
008ae528	ldr x8,[x22, #0x28]
008ae52c	mov x21,x1
008ae530	str x8,[sp, #0x8]
008ae534	ldr x8,[x0, #0x60]
008ae538	ldp x8,x9,[x8, #0x8]
008ae53c	cmp x9,x8
008ae540	b.cc 0x008ae550
008ae544	mov x0,x19
008ae548	mov w1,#0x1
008ae54c	bl 0x008b52c4
008ae550	ldrb w8,[x19, #0x2]
008ae554	tbz w8,#0x2,0x008ae568
008ae558	add x2,x19,#0x38
008ae55c	mov x0,x19
008ae560	mov x1,x19
008ae564	bl 0x008b63a4
008ae568	ldr x8,[x19, #0x50]
008ae56c	ldr x9,[x19, #0x68]
008ae570	ldr x10,[x8, #0x18]
008ae574	add x11,x9,#0x10
008ae578	cmp x11,x10
008ae57c	b.ls 0x008ae5e4
008ae580	ldr x11,[x19, #0x70]
008ae584	mov w12,#0xf3f0
008ae588	movk w12,#0x1, LSL #16
008ae58c	sub x11,x9,x11
008ae590	cmp x11,x12
008ae594	b.gt 0x008ae638
008ae598	ldr x11,[x19, #0x48]
008ae59c	sub x11,x11,x9
008ae5a0	cmp x11,#0x10
008ae5a4	b.gt 0x008ae5d4
008ae5a8	mov w8,#0x1
008ae5ac	nop
008ae5b0	adr x1,0x8aa604
008ae5b4	add x2,sp,#0x4
008ae5b8	mov x0,x19
008ae5bc	str w8,[sp, #0x4]
008ae5c0	bl 0x008b3edc
008ae5c4	cbnz w0,0x008ae638
008ae5c8	ldr x8,[x19, #0x50]
008ae5cc	ldr x9,[x19, #0x68]
008ae5d0	ldr x10,[x8, #0x18]
008ae5d4	add x9,x9,#0x10
008ae5d8	cmp x10,x9
008ae5dc	b.cs 0x008ae5e4
008ae5e0	str x9,[x8, #0x18]
008ae5e4	mov x0,x19
008ae5e8	mov x1,x21
008ae5ec	mov w2,w20
008ae5f0	bl 0x008be288
008ae5f4	ldr x8,[x19, #0x68]
008ae5f8	mov w10,#0x8
008ae5fc	str x0,[x8]
008ae600	ldr x9,[x19, #0x68]
008ae604	str w10,[x8, #0xc]
008ae608	add x8,x9,#0x10
008ae60c	str x8,[x19, #0x68]
008ae610	ldr x8,[x22, #0x28]
008ae614	ldr x9,[sp, #0x8]
008ae618	cmp x8,x9
008ae61c	b.ne 0x008ae660
008ae620	add x0,x0,#0x10
008ae624	ldp x20,x19,[sp, #0x30]
008ae628	ldp x22,x21,[sp, #0x20]
008ae62c	ldp x29,x30,[sp, #0x10]
008ae630	add sp,sp,#0x40
008ae634	ret
008ae638	adrp x1,0x2b6000
008ae63c	add x1,x1,#0xc71
008ae640	mov x0,x19
008ae644	bl 0x008b9568
008ae648	ldr x8,[x22, #0x28]
008ae64c	ldr x9,[sp, #0x8]
008ae650	cmp x8,x9
008ae654	b.ne 0x008ae660
008ae658	mov x0,x19
008ae65c	bl 0x008aa5f4
008ae660	bl 0x00c2fec0
