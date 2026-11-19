; FUN_008a986c @ 008a986c
008a986c	stp x29,x30,[sp, #-0x20]!
008a9870	stp x20,x19,[sp, #0x10]
008a9874	mov x29,sp
008a9878	mov x20,x1
008a987c	mov x19,x0
008a9880	bl 0x008a997c
008a9884	ldr x8,[x20]
008a9888	mov x11,#0x2d69
008a988c	movk x11,#0xeb38, LSL #16
008a9890	lsl w9,w8,#0x3
008a9894	lsr x10,x8,#0x20
008a9898	movk x11,#0xea08, LSL #32
008a989c	movk x11,#0x9ddf, LSL #48
008a98a0	add x9,x9,#0x8
008a98a4	eor x9,x9,x10
008a98a8	mul x9,x9,x11
008a98ac	eor x10,x10,x9, LSR #0x2f
008a98b0	eor x9,x10,x9
008a98b4	mov x10,#0x959d
008a98b8	mul x9,x9,x11
008a98bc	movk x10,#0xb8f4, LSL #16
008a98c0	ldr x11,[x19, #0x18]
008a98c4	movk x10,#0xd34f, LSL #32
008a98c8	movk x10,#0x949d, LSL #48
008a98cc	eor x9,x9,x9, LSR #0x2f
008a98d0	mul x9,x9,x10
008a98d4	ldrb w10,[x19, #0x30]
008a98d8	lsr x9,x9,x10
008a98dc	mov w10,#0x1
008a98e0	lsr x12,x9,#0x6
008a98e4	lsl x14,x10,x9
008a98e8	ldr x10,[x19]
008a98ec	ldr x13,[x11, x12, LSL #0x3]
008a98f0	tst x14,x13
008a98f4	b.eq 0x008a9934
008a98f8	ldr x12,[x19, #0x20]
008a98fc	mov w16,#0x28
008a9900	mov w17,#0x1
008a9904	sub x15,x12,#0x1
008a9908	mul x12,x9,x16
008a990c	ldr x12,[x10, x12#0x0]
008a9910	cmp x12,x8
008a9914	b.eq 0x008a9964
008a9918	add x9,x9,#0x1
008a991c	and x9,x9,x15
008a9920	lsr x12,x9,#0x6
008a9924	lsl x14,x17,x9
008a9928	ldr x13,[x11, x12, LSL #0x3]
008a992c	tst x13,x14
008a9930	b.ne 0x008a9908
008a9934	mov w15,#0x28
008a9938	movi v0.2D,#0x0
008a993c	orr x13,x13,x14
008a9940	madd x10,x9,x15,x10
008a9944	str x13,[x11, x12, LSL #0x3]
008a9948	stur q0,[x10, #0x8]
008a994c	stur q0,[x10, #0x18]
008a9950	ldr x11,[x19, #0x28]
008a9954	str x8,[x10]
008a9958	ldr x10,[x19]
008a995c	add x8,x11,#0x1
008a9960	str x8,[x19, #0x28]
008a9964	mov w8,#0x28
008a9968	madd x8,x9,x8,x10
008a996c	add x0,x8,#0x8
008a9970	ldp x20,x19,[sp, #0x10]
008a9974	ldp x29,x30,[sp], #0x20
008a9978	ret
