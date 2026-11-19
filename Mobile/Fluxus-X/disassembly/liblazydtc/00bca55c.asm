; std::__ndk1::to_string @ 00bca55c
00bca55c	paciasp
00bca560	sub sp,sp,#0x70
00bca564	stp x29,x30,[sp, #0x30]
00bca568	str x23,[sp, #0x40]
00bca56c	stp x22,x21,[sp, #0x50]
00bca570	stp x20,x19,[sp, #0x60]
00bca574	add x29,sp,#0x30
00bca578	mov x19,x8
00bca57c	str q0,[sp]
00bca580	stp xzr,xzr,[sp, #0x18]
00bca584	str xzr,[sp, #0x28]
00bca588	add x0,sp,#0x18
00bca58c	mov w1,#0x16
00bca590	mov w2,wzr
00bca594	add x20,sp,#0x18
00bca598	bl 0x00c30250
00bca59c	ldrb w8,[sp, #0x18]
00bca5a0	ldr x9,[sp, #0x20]
00bca5a4	orr x21,x20,#0x1
00bca5a8	adrp x20,0x2ba000
00bca5ac	add x20,x20,#0xc50
00bca5b0	mov w22,#0x1
00bca5b4	lsr x10,x8,#0x1
00bca5b8	tst w8,#0x1
00bca5bc	csel x23,x10,x9,eq
00bca5c0	b 0x00bca5d4
00bca5c4	add x0,sp,#0x18
00bca5c8	mov w2,wzr
00bca5cc	bl 0x00c30250
00bca5d0	ldrb w8,[sp, #0x18]
00bca5d4	ldr x9,[sp, #0x28]
00bca5d8	tst w8,#0x1
00bca5dc	ldr q0,[sp]
00bca5e0	add x1,x23,#0x1
00bca5e4	mov x2,x20
00bca5e8	csel x0,x21,x9,eq
00bca5ec	bl 0x00c31ed0
00bca5f0	tbnz w0,#0x1f,0x00bca608
00bca5f4	mov w8,w0
00bca5f8	cmp x23,x8
00bca5fc	b.cs 0x00bca64c
00bca600	mov x23,x8
00bca604	b 0x00bca60c
00bca608	orr x23,x22,x23, LSL #0x1
00bca60c	ldrb w8,[sp, #0x18]
00bca610	ldr x9,[sp, #0x20]
00bca614	lsr x10,x8,#0x1
00bca618	tst w8,#0x1
00bca61c	csel x9,x10,x9,eq
00bca620	subs x1,x23,x9
00bca624	b.hi 0x00bca5c4
00bca628	tbnz w8,#0x0,0x00bca63c
00bca62c	lsl w8,w23,#0x1
00bca630	strb w8,[sp, #0x18]
00bca634	mov x8,x21
00bca638	b 0x00bca644
00bca63c	ldr x8,[sp, #0x28]
00bca640	str x23,[sp, #0x20]
00bca644	strb wzr,[x8, x23]
00bca648	b 0x00bca5d0
00bca64c	ldrb w9,[sp, #0x18]
00bca650	ldr x10,[sp, #0x20]
00bca654	lsr x11,x9,#0x1
00bca658	tst w9,#0x1
00bca65c	csel x10,x11,x10,eq
00bca660	subs x1,x8,x10
00bca664	b.ls 0x00bca678
00bca668	add x0,sp,#0x18
00bca66c	mov w2,wzr
00bca670	bl 0x00c30250
00bca674	b 0x00bca694
00bca678	tbnz w9,#0x0,0x00bca688
00bca67c	lsl w9,w0,#0x1
00bca680	strb w9,[sp, #0x18]
00bca684	b 0x00bca690
00bca688	ldr x21,[sp, #0x28]
00bca68c	str x8,[sp, #0x20]
00bca690	strb wzr,[x21, x8]
00bca694	ldur q0,[sp, #0x18]
00bca698	ldr x8,[sp, #0x28]
00bca69c	add x0,sp,#0x18
00bca6a0	stp xzr,xzr,[sp, #0x20]
00bca6a4	str q0,[x19]
00bca6a8	str x8,[x19, #0x10]
00bca6ac	str xzr,[sp, #0x18]
00bca6b0	bl 0x00c43db0
00bca6b4	ldp x20,x19,[sp, #0x60]
00bca6b8	ldr x23,[sp, #0x40]
00bca6bc	ldp x22,x21,[sp, #0x50]
00bca6c0	ldp x29,x30,[sp, #0x30]
00bca6c4	add sp,sp,#0x70
00bca6c8	autiasp
00bca6cc	ret
