; FUN_008a87cc @ 008a87cc
008a87cc	sub sp,sp,#0x90
008a87d0	stp x29,x30,[sp, #0x60]
008a87d4	stp x22,x21,[sp, #0x70]
008a87d8	stp x20,x19,[sp, #0x80]
008a87dc	add x29,sp,#0x60
008a87e0	mrs x21,tpidr_el0
008a87e4	mov x20,x2
008a87e8	mov x19,x0
008a87ec	ldr x8,[x21, #0x28]
008a87f0	stur x8,[x29, #-0x8]
008a87f4	str x1,[sp, #0x18]
008a87f8	cbz x2,0x008a88a4
008a87fc	adrp x8,0xd1b000
008a8800	ldr w9,[x20, #0x8]
008a8804	ldr w8,[x8, #0x240]
008a8808	cmp w9,w8
008a880c	b.ne 0x008a88a4
008a8810	ldrb w8,[x20, #0x28]
008a8814	tbnz w8,#0x0,0x008a88a4
008a8818	ldr x8,[x19, #0x80]
008a881c	cbz x8,0x008a88a4
008a8820	ldr x8,[x20, #0x50]
008a8824	mov x10,#0x7c15
008a8828	movk x10,#0x7f4a, LSL #16
008a882c	lsr x9,x8,#0x4
008a8830	movk x10,#0x79b9, LSL #32
008a8834	movk x10,#0x9e37, LSL #48
008a8838	eor x9,x9,x8, LSR #0x9
008a883c	mul x9,x9,x10
008a8840	ldrb w10,[x19, #0x88]
008a8844	lsr x9,x9,x10
008a8848	ldr x10,[x19, #0x70]
008a884c	lsr x11,x9,#0x6
008a8850	ldr x11,[x10, x11, LSL #0x3]
008a8854	lsr x11,x11,x9
008a8858	tbz w11,#0x0,0x008a88a4
008a885c	ldr x12,[x19, #0x78]
008a8860	ldr x11,[x19, #0x58]
008a8864	sub x12,x12,#0x1
008a8868	lsl x13,x9,#0x4
008a886c	ldr x13,[x11, x13#0x0]
008a8870	cmp x13,x8
008a8874	b.eq 0x008a8894
008a8878	add x9,x9,#0x1
008a887c	and x9,x9,x12
008a8880	lsr x13,x9,#0x6
008a8884	ldr x13,[x10, x13, LSL #0x3]
008a8888	lsr x13,x13,x9
008a888c	tbnz w13,#0x0,0x008a8868
008a8890	b 0x008a88a4
008a8894	add x8,x11,x9, LSL #0x4
008a8898	ldr x8,[x8, #0x8]
008a889c	cbz x8,0x008a88a4
008a88a0	ldr x20,[x8, #0x58]
008a88a4	add x0,x19,#0xa8
008a88a8	add x1,sp,#0x18
008a88ac	bl 0x008a7f0c
008a88b0	movi v0.2D,#0x0
008a88b4	ldp x3,x4,[x19, #0x20]
008a88b8	mov w8,#0x40
008a88bc	ldr x5,[x19, #0x50]
008a88c0	add x22,sp,#0x20
008a88c4	str x20,[x0]
008a88c8	strb w8,[sp, #0x50]
008a88cc	stp q0,q0,[sp, #0x30]
008a88d0	str q0,[sp, #0x20]
008a88d4	stp xzr,xzr,[sp, #0x8]
008a88d8	add x1,sp,#0x8
008a88dc	add x2,x19,#0x58
008a88e0	add x6,sp,#0x20
008a88e4	mov x0,x20
008a88e8	bl 0x008a6690
008a88ec	mov w20,w0
008a88f0	cmp w0,#0xf
008a88f4	b.eq 0x008a8908
008a88f8	ldr x0,[x19, #0x10]
008a88fc	add x1,sp,#0x18
008a8900	bl 0x008a740c
008a8904	str w20,[x0]
008a8908	ldr x0,[sp, #0x20]
008a890c	cbz x0,0x008a8940
008a8910	orr x19,x22,#0x8
008a8914	bl 0x00c301d0
008a8918	ldr x0,[sp, #0x38]
008a891c	str xzr,[sp, #0x20]
008a8920	bl 0x00c301d0
008a8924	mov x0,xzr
008a8928	stp xzr,xzr,[x19]
008a892c	str xzr,[x19, #0x10]
008a8930	bl 0x00c301d0
008a8934	mov w8,#0x40
008a8938	str xzr,[sp, #0x40]
008a893c	strb w8,[sp, #0x50]
008a8940	ldr x0,[sp, #0x38]
008a8944	bl 0x00c301d0
008a8948	ldr x8,[x21, #0x28]
008a894c	ldur x9,[x29, #-0x8]
008a8950	cmp x8,x9
008a8954	b.ne 0x008a8998
008a8958	mov w0,w20
008a895c	ldp x20,x19,[sp, #0x80]
008a8960	ldp x22,x21,[sp, #0x70]
008a8964	ldp x29,x30,[sp, #0x60]
008a8968	add sp,sp,#0x90
008a896c	ret
008a8998	bl 0x00c2fec0
