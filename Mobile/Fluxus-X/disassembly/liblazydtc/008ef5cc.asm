; cpr::MultiRange::str @ 008ef5cc
008ef5cc	sub sp,sp,#0xb0
008ef5d0	str x27,[sp, #0x50]
008ef5d4	stp x26,x25,[sp, #0x60]
008ef5d8	stp x24,x23,[sp, #0x70]
008ef5dc	stp x22,x21,[sp, #0x80]
008ef5e0	stp x20,x19,[sp, #0x90]
008ef5e4	stp x29,x30,[sp, #0xa0]
008ef5e8	add x29,sp,#0xa0
008ef5ec	mrs x20,tpidr_el0
008ef5f0	mov x19,x8
008ef5f4	ldr x8,[x20, #0x28]
008ef5f8	str x8,[sp, #0x48]
008ef5fc	stp xzr,xzr,[x19, #0x8]
008ef600	str xzr,[x19]
008ef604	ldp x8,x21,[x0]
008ef608	cmp x8,x21
008ef60c	b.eq 0x008ef6d4
008ef610	add x9,sp,#0x18
008ef614	adrp x23,0x2a7000
008ef618	adrp x25,0x2ab000
008ef61c	mov x27,xzr
008ef620	mov w26,wzr
008ef624	add x22,x8,#0x10
008ef628	add x23,x23,#0x15d
008ef62c	orr x24,x9,#0x1
008ef630	add x25,x25,#0x32c
008ef634	b 0x008ef644
008ef638	ldrb w26,[x19]
008ef63c	ldr x27,[x19, #0x8]
008ef640	add x22,x22,#0x10
008ef644	ldur q0,[x22, #-0x10]
008ef648	str q0,[sp, #0x30]
008ef64c	mov x8,sp
008ef650	add x0,sp,#0x30
008ef654	bl 0x00c31400
008ef658	ubfx w8,w26,#0x1,#0x7
008ef65c	tst w26,#0x1
008ef660	csel x8,x8,x27,eq
008ef664	cmp x8,#0x0
008ef668	csel x0,x25,x23,eq
008ef66c	add x8,sp,#0x18
008ef670	mov x1,sp
008ef674	bl 0x00c304a0
008ef678	ldrb w8,[sp, #0x18]
008ef67c	ldp x10,x9,[sp, #0x20]
008ef680	tst w8,#0x1
008ef684	lsr w11,w8,#0x1
008ef688	csel x1,x24,x9,eq
008ef68c	csel x2,x11,x10,eq
008ef690	mov x0,x19
008ef694	bl 0x00c308c0
008ef698	ldrb w8,[sp, #0x18]
008ef69c	tbnz w8,#0x0,0x008ef6b4
008ef6a0	ldrb w8,[sp]
008ef6a4	tbnz w8,#0x0,0x008ef6c4
008ef6a8	cmp x21,x22
008ef6ac	b.ne 0x008ef638
008ef6b0	b 0x008ef6d4
008ef6b4	ldr x0,[sp, #0x28]
008ef6b8	bl 0x00c301d0
008ef6bc	ldrb w8,[sp]
008ef6c0	tbz w8,#0x0,0x008ef6a8
008ef6c4	ldr x0,[sp, #0x10]
008ef6c8	bl 0x00c301d0
008ef6cc	cmp x21,x22
008ef6d0	b.ne 0x008ef638
008ef6d4	ldr x8,[x20, #0x28]
008ef6d8	ldr x9,[sp, #0x48]
008ef6dc	cmp x8,x9
008ef6e0	b.ne 0x008ef704
008ef6e4	ldp x29,x30,[sp, #0xa0]
008ef6e8	ldp x20,x19,[sp, #0x90]
008ef6ec	ldp x22,x21,[sp, #0x80]
008ef6f0	ldp x24,x23,[sp, #0x70]
008ef6f4	ldp x26,x25,[sp, #0x60]
008ef6f8	ldr x27,[sp, #0x50]
008ef6fc	add sp,sp,#0xb0
008ef700	ret
008ef704	bl 0x00c2fec0
