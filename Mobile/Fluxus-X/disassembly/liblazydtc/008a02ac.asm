; FUN_008a02ac @ 008a02ac
008a02ac	sub sp,sp,#0x30
008a02b0	stp x29,x30,[sp, #0x10]
008a02b4	stp x20,x19,[sp, #0x20]
008a02b8	add x29,sp,#0x10
008a02bc	mrs x20,tpidr_el0
008a02c0	mov x19,x2
008a02c4	mov x2,x1
008a02c8	ldr x8,[x20, #0x28]
008a02cc	str x8,[sp, #0x8]
008a02d0	ldr x8,[x0, #0x10]
008a02d4	str x1,[sp]
008a02d8	ldr x9,[x8, #0x28]
008a02dc	cbz x9,0x008a037c
008a02e0	lsl w9,w2,#0x3
008a02e4	mov x11,#0x2d69
008a02e8	lsr x10,x2,#0x20
008a02ec	movk x11,#0xeb38, LSL #16
008a02f0	add x9,x9,#0x8
008a02f4	movk x11,#0xea08, LSL #32
008a02f8	eor x9,x9,x10
008a02fc	movk x11,#0x9ddf, LSL #48
008a0300	mul x9,x9,x11
008a0304	eor x10,x10,x9, LSR #0x2f
008a0308	eor x9,x10,x9
008a030c	mov x10,#0x959d
008a0310	mul x9,x9,x11
008a0314	movk x10,#0xb8f4, LSL #16
008a0318	movk x10,#0xd34f, LSL #32
008a031c	movk x10,#0x949d, LSL #48
008a0320	eor x9,x9,x9, LSR #0x2f
008a0324	mul x9,x9,x10
008a0328	ldrb w10,[x8, #0x30]
008a032c	lsr x10,x9,x10
008a0330	ldr x9,[x8, #0x18]
008a0334	lsr x11,x10,#0x6
008a0338	ldr x11,[x9, x11, LSL #0x3]
008a033c	lsr x11,x11,x10
008a0340	tbz w11,#0x0,0x008a037c
008a0344	ldr x11,[x8, #0x20]
008a0348	ldr x8,[x8]
008a034c	mov w12,#0x28
008a0350	sub x11,x11,#0x1
008a0354	madd x13,x10,x12,x8
008a0358	ldr x14,[x13]
008a035c	cmp x14,x2
008a0360	b.eq 0x008a0380
008a0364	add x10,x10,#0x1
008a0368	and x10,x10,x11
008a036c	lsr x13,x10,#0x6
008a0370	ldr x13,[x9, x13, LSL #0x3]
008a0374	lsr x13,x13,x10
008a0378	tbnz w13,#0x0,0x008a0354
008a037c	mov x13,xzr
008a0380	add x8,x13,#0x8
008a0384	cmp x13,#0x0
008a0388	csel x8,xzr,x8,eq
008a038c	ldrb w9,[x8, #0x18]
008a0390	tbnz w9,#0x0,0x008a03c0
008a0394	ldr w9,[x19]
008a0398	cmp w9,#0x7
008a039c	b.ne 0x008a03e0
008a03a0	add x0,x0,#0x80
008a03a4	mov x1,sp
008a03a8	strb wzr,[x8, #0x19]
008a03ac	bl 0x008984e0
008a03b0	ldp q0,q1,[x19]
008a03b4	ldr x8,[x19, #0x20]
008a03b8	str x8,[x0, #0x20]
008a03bc	stp q0,q1,[x0]
008a03c0	ldr x8,[x20, #0x28]
008a03c4	ldr x9,[sp, #0x8]
008a03c8	cmp x8,x9
008a03cc	b.ne 0x008a0414
008a03d0	ldp x20,x19,[sp, #0x20]
008a03d4	ldp x29,x30,[sp, #0x10]
008a03d8	add sp,sp,#0x30
008a03dc	ret
008a03e0	cmp w9,#0x0
008a03e4	ldr x1,[x0, #0x18]
008a03e8	cset w9,ne
008a03ec	strb w9,[x8, #0x19]
008a03f0	ldr x8,[x20, #0x28]
008a03f4	ldr x9,[sp, #0x8]
008a03f8	cmp x8,x9
008a03fc	b.ne 0x008a0414
008a0400	mov x3,x19
008a0404	ldp x20,x19,[sp, #0x20]
008a0408	ldp x29,x30,[sp, #0x10]
008a040c	add sp,sp,#0x30
008a0410	b 0x008a0418
008a0414	bl 0x00c2fec0
008a0418	sub sp,sp,#0x80
008a041c	stp x29,x30,[sp, #0x50]
008a0420	str x21,[sp, #0x60]
008a0424	stp x20,x19,[sp, #0x70]
008a0428	add x29,sp,#0x50
008a042c	mrs x20,tpidr_el0
008a0430	ldr x8,[x20, #0x28]
008a0434	stur x8,[x29, #-0x8]
008a0438	ldr w8,[x3]
008a043c	str x2,[sp, #0x8]
008a0440	cbz w8,0x008a047c
008a0444	cmp w8,#0x7
008a0448	b.eq 0x008a0560
008a044c	mov x21,x3
008a0450	mov x3,xzr
008a0454	mov x19,x1
008a0458	bl 0x008a0588
008a045c	add x1,sp,#0x8
008a0460	mov x0,x19
008a0464	bl 0x008984e0
008a0468	ldp q0,q1,[x21]
008a046c	ldr x8,[x21, #0x20]
008a0470	str x8,[x0, #0x20]
008a0474	stp q0,q1,[x0]
008a0478	b 0x008a0560
008a047c	ldrb w8,[x0, #0x58]
008a0480	tbnz w8,#0x0,0x008a0560
008a0484	ldr x8,[x1, #0x28]
008a0488	cbz x8,0x008a0560
008a048c	lsl w8,w2,#0x3
008a0490	mov x10,#0x2d69
008a0494	lsr x9,x2,#0x20
008a0498	movk x10,#0xeb38, LSL #16
008a049c	add x8,x8,#0x8
008a04a0	movk x10,#0xea08, LSL #32
008a04a4	eor x8,x8,x9
008a04a8	movk x10,#0x9ddf, LSL #48
008a04ac	mul x8,x8,x10
008a04b0	eor x9,x9,x8, LSR #0x2f
008a04b4	eor x8,x9,x8
008a04b8	mov x9,#0x959d
008a04bc	mul x8,x8,x10
008a04c0	movk x9,#0xb8f4, LSL #16
008a04c4	movk x9,#0xd34f, LSL #32
008a04c8	movk x9,#0x949d, LSL #48
008a04cc	eor x8,x8,x8, LSR #0x2f
008a04d0	mul x8,x8,x9
008a04d4	ldrb w9,[x1, #0x30]
008a04d8	lsr x9,x8,x9
008a04dc	ldr x8,[x1, #0x18]
008a04e0	lsr x10,x9,#0x6
008a04e4	ldr x10,[x8, x10, LSL #0x3]
008a04e8	lsr x10,x10,x9
008a04ec	tbz w10,#0x0,0x008a0560
008a04f0	ldr x11,[x1, #0x20]
008a04f4	ldr x10,[x1]
008a04f8	mov w12,#0x30
008a04fc	sub x11,x11,#0x1
008a0500	madd x19,x9,x12,x10
008a0504	ldr x13,[x19]
008a0508	cmp x13,x2
008a050c	b.eq 0x008a052c
008a0510	add x9,x9,#0x1
008a0514	and x9,x9,x11
008a0518	lsr x13,x9,#0x6
008a051c	ldr x13,[x8, x13, LSL #0x3]
008a0520	lsr x13,x13,x9
008a0524	tbnz w13,#0x0,0x008a0500
008a0528	b 0x008a0560
008a052c	ldr x0,[x0, #0xc0]
008a0530	cbz x0,0x008a055c
008a0534	str x2,[sp, #0x10]
008a0538	add x1,sp,#0x10
008a053c	ldur x8,[x19, #0x28]
008a0540	ldur q0,[x19, #0x18]
008a0544	ldur q1,[x19, #0x8]
008a0548	strb wzr,[sp, #0x40]
008a054c	str x8,[sp, #0x38]
008a0550	stur q0,[sp, #0x28]
008a0554	stur q1,[sp, #0x18]
008a0558	bl 0x008a06c4
008a055c	stur wzr,[x19, #0x8]
008a0560	ldr x8,[x20, #0x28]
008a0564	ldur x9,[x29, #-0x8]
008a0568	cmp x8,x9
008a056c	b.ne 0x008a0584
008a0570	ldp x20,x19,[sp, #0x70]
008a0574	ldr x21,[sp, #0x60]
008a0578	ldp x29,x30,[sp, #0x50]
008a057c	add sp,sp,#0x80
008a0580	ret
008a0584	bl 0x00c2fec0
