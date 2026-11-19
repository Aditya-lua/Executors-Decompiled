; FUN_008a8334 @ 008a8334
008a8334	stp x29,x30,[sp, #-0x30]!
008a8338	str x21,[sp, #0x10]
008a833c	stp x20,x19,[sp, #0x20]
008a8340	mov x29,sp
008a8344	ldp x8,x9,[x0, #0x20]
008a8348	mov x21,#0x7c15
008a834c	movk x21,#0x7f4a, LSL #16
008a8350	mov x20,x1
008a8354	mov x19,x0
008a8358	movk x21,#0x79b9, LSL #32
008a835c	add x10,x8,x8, LSL #0x1
008a8360	movk x21,#0x9e37, LSL #48
008a8364	cmp x9,x10, LSR #0x2
008a8368	b.cc 0x008a83d8
008a836c	cbz x9,0x008a83cc
008a8370	ldr x9,[x20]
008a8374	ldrb w11,[x19, #0x30]
008a8378	lsr x10,x9,#0x4
008a837c	eor x10,x10,x9, LSR #0x9
008a8380	mul x10,x10,x21
008a8384	lsr x11,x10,x11
008a8388	ldr x10,[x19, #0x18]
008a838c	lsr x12,x11,#0x6
008a8390	ldr x12,[x10, x12, LSL #0x3]
008a8394	lsr x12,x12,x11
008a8398	tbz w12,#0x0,0x008a83cc
008a839c	ldr x12,[x19]
008a83a0	sub x13,x8,#0x1
008a83a4	lsl x14,x11,#0x4
008a83a8	ldr x14,[x12, x14#0x0]
008a83ac	cmp x14,x9
008a83b0	b.eq 0x008a83d8
008a83b4	add x11,x11,#0x1
008a83b8	and x11,x11,x13
008a83bc	lsr x14,x11,#0x6
008a83c0	ldr x14,[x10, x14, LSL #0x3]
008a83c4	lsr x14,x14,x11
008a83c8	tbnz w14,#0x0,0x008a83a4
008a83cc	mov x0,x19
008a83d0	bl 0x008a8564
008a83d4	ldr x8,[x19, #0x20]
008a83d8	ldr x10,[x20]
008a83dc	ldrb w11,[x19, #0x30]
008a83e0	ldr x12,[x19, #0x18]
008a83e4	lsr x9,x10,#0x4
008a83e8	eor x9,x9,x10, LSR #0x9
008a83ec	mul x9,x9,x21
008a83f0	lsr x9,x9,x11
008a83f4	mov w11,#0x1
008a83f8	lsr x13,x9,#0x6
008a83fc	lsl x15,x11,x9
008a8400	ldr x11,[x19]
008a8404	ldr x14,[x12, x13, LSL #0x3]
008a8408	tst x15,x14
008a840c	b.eq 0x008a8444
008a8410	sub x8,x8,#0x1
008a8414	mov w16,#0x1
008a8418	lsl x13,x9,#0x4
008a841c	ldr x13,[x11, x13#0x0]
008a8420	cmp x13,x10
008a8424	b.eq 0x008a8460
008a8428	add x9,x9,#0x1
008a842c	and x9,x9,x8
008a8430	lsr x13,x9,#0x6
008a8434	lsl x15,x16,x9
008a8438	ldr x14,[x12, x13, LSL #0x3]
008a843c	tst x14,x15
008a8440	b.ne 0x008a8418
008a8444	orr x8,x14,x15
008a8448	str x8,[x12, x13, LSL #0x3]
008a844c	add x8,x11,x9, LSL #0x4
008a8450	ldr x12,[x19, #0x28]
008a8454	stp x10,xzr,[x8]
008a8458	add x8,x12,#0x1
008a845c	str x8,[x19, #0x28]
008a8460	add x8,x11,x9, LSL #0x4
008a8464	add x0,x8,#0x8
008a8468	ldp x20,x19,[sp, #0x20]
008a846c	ldr x21,[sp, #0x10]
008a8470	ldp x29,x30,[sp], #0x30
008a8474	ret
