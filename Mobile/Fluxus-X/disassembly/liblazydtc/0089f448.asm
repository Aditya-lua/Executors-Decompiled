; FUN_0089f448 @ 0089f448
0089f448	sub sp,sp,#0x80
0089f44c	stp x29,x30,[sp, #0x50]
0089f450	str x21,[sp, #0x60]
0089f454	stp x20,x19,[sp, #0x70]
0089f458	add x29,sp,#0x50
0089f45c	mrs x20,tpidr_el0
0089f460	ldr x8,[x20, #0x28]
0089f464	stur x8,[x29, #-0x8]
0089f468	ldr w8,[x3]
0089f46c	str x2,[sp, #0x8]
0089f470	cbz w8,0x0089f4ac
0089f474	cmp w8,#0x7
0089f478	b.eq 0x0089f590
0089f47c	mov x21,x3
0089f480	mov x3,xzr
0089f484	mov x19,x1
0089f488	bl 0x0089fedc
0089f48c	add x1,sp,#0x8
0089f490	mov x0,x19
0089f494	bl 0x0089bfc4
0089f498	ldp q0,q1,[x21]
0089f49c	ldr x8,[x21, #0x20]
0089f4a0	str x8,[x0, #0x20]
0089f4a4	stp q0,q1,[x0]
0089f4a8	b 0x0089f590
0089f4ac	ldrb w8,[x0, #0x58]
0089f4b0	tbnz w8,#0x0,0x0089f590
0089f4b4	ldr x8,[x1, #0x28]
0089f4b8	cbz x8,0x0089f590
0089f4bc	lsl w8,w2,#0x3
0089f4c0	mov x10,#0x2d69
0089f4c4	lsr x9,x2,#0x20
0089f4c8	movk x10,#0xeb38, LSL #16
0089f4cc	add x8,x8,#0x8
0089f4d0	movk x10,#0xea08, LSL #32
0089f4d4	eor x8,x8,x9
0089f4d8	movk x10,#0x9ddf, LSL #48
0089f4dc	mul x8,x8,x10
0089f4e0	eor x9,x9,x8, LSR #0x2f
0089f4e4	eor x8,x9,x8
0089f4e8	mov x9,#0x959d
0089f4ec	mul x8,x8,x10
0089f4f0	movk x9,#0xb8f4, LSL #16
0089f4f4	movk x9,#0xd34f, LSL #32
0089f4f8	movk x9,#0x949d, LSL #48
0089f4fc	eor x8,x8,x8, LSR #0x2f
0089f500	mul x8,x8,x9
0089f504	ldrb w9,[x1, #0x30]
0089f508	lsr x9,x8,x9
0089f50c	ldr x8,[x1, #0x18]
0089f510	lsr x10,x9,#0x6
0089f514	ldr x10,[x8, x10, LSL #0x3]
0089f518	lsr x10,x10,x9
0089f51c	tbz w10,#0x0,0x0089f590
0089f520	ldr x11,[x1, #0x20]
0089f524	ldr x10,[x1]
0089f528	mov w12,#0x30
0089f52c	sub x11,x11,#0x1
0089f530	madd x19,x9,x12,x10
0089f534	ldr x13,[x19]
0089f538	cmp x13,x2
0089f53c	b.eq 0x0089f55c
0089f540	add x9,x9,#0x1
0089f544	and x9,x9,x11
0089f548	lsr x13,x9,#0x6
0089f54c	ldr x13,[x8, x13, LSL #0x3]
0089f550	lsr x13,x13,x9
0089f554	tbnz w13,#0x0,0x0089f530
0089f558	b 0x0089f590
0089f55c	ldr x0,[x0, #0xb8]
0089f560	cbz x0,0x0089f58c
0089f564	str x2,[sp, #0x10]
0089f568	add x1,sp,#0x10
0089f56c	ldur x8,[x19, #0x28]
0089f570	ldur q0,[x19, #0x18]
0089f574	ldur q1,[x19, #0x8]
0089f578	strb wzr,[sp, #0x40]
0089f57c	str x8,[sp, #0x38]
0089f580	stur q0,[sp, #0x28]
0089f584	stur q1,[sp, #0x18]
0089f588	bl 0x008a0018
0089f58c	stur wzr,[x19, #0x8]
0089f590	ldr x8,[x20, #0x28]
0089f594	ldur x9,[x29, #-0x8]
0089f598	cmp x8,x9
0089f59c	b.ne 0x0089f5b4
0089f5a0	ldp x20,x19,[sp, #0x70]
0089f5a4	ldr x21,[sp, #0x60]
0089f5a8	ldp x29,x30,[sp, #0x50]
0089f5ac	add sp,sp,#0x80
0089f5b0	ret
0089f5b4	bl 0x00c2fec0
