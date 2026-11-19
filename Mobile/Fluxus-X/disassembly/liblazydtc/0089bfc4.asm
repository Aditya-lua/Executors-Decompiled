; FUN_0089bfc4 @ 0089bfc4
0089bfc4	stp x29,x30,[sp, #-0x20]!
0089bfc8	stp x20,x19,[sp, #0x10]
0089bfcc	mov x29,sp
0089bfd0	mov x20,x1
0089bfd4	mov x19,x0
0089bfd8	bl 0x008a0b4c
0089bfdc	ldr x8,[x20]
0089bfe0	mov x11,#0x2d69
0089bfe4	movk x11,#0xeb38, LSL #16
0089bfe8	lsl w9,w8,#0x3
0089bfec	lsr x10,x8,#0x20
0089bff0	movk x11,#0xea08, LSL #32
0089bff4	movk x11,#0x9ddf, LSL #48
0089bff8	add x9,x9,#0x8
0089bffc	eor x9,x9,x10
0089c000	mul x9,x9,x11
0089c004	eor x10,x10,x9, LSR #0x2f
0089c008	eor x9,x10,x9
0089c00c	mov x10,#0x959d
0089c010	mul x9,x9,x11
0089c014	movk x10,#0xb8f4, LSL #16
0089c018	ldr x11,[x19, #0x18]
0089c01c	movk x10,#0xd34f, LSL #32
0089c020	movk x10,#0x949d, LSL #48
0089c024	eor x9,x9,x9, LSR #0x2f
0089c028	mul x9,x9,x10
0089c02c	ldrb w10,[x19, #0x30]
0089c030	lsr x9,x9,x10
0089c034	mov w10,#0x1
0089c038	lsr x12,x9,#0x6
0089c03c	lsl x14,x10,x9
0089c040	ldr x10,[x19]
0089c044	ldr x13,[x11, x12, LSL #0x3]
0089c048	tst x14,x13
0089c04c	b.eq 0x0089c08c
0089c050	ldr x12,[x19, #0x20]
0089c054	mov w16,#0x30
0089c058	mov w17,#0x1
0089c05c	sub x15,x12,#0x1
0089c060	mul x12,x9,x16
0089c064	ldr x12,[x10, x12#0x0]
0089c068	cmp x12,x8
0089c06c	b.eq 0x0089c0c0
0089c070	add x9,x9,#0x1
0089c074	and x9,x9,x15
0089c078	lsr x12,x9,#0x6
0089c07c	lsl x14,x17,x9
0089c080	ldr x13,[x11, x12, LSL #0x3]
0089c084	tst x13,x14
0089c088	b.ne 0x0089c060
0089c08c	mov w15,#0x30
0089c090	movi v0.2D,#0x0
0089c094	orr x13,x13,x14
0089c098	madd x10,x9,x15,x10
0089c09c	str x13,[x11, x12, LSL #0x3]
0089c0a0	stur q0,[x10, #0x8]
0089c0a4	stur q0,[x10, #0x18]
0089c0a8	str xzr,[x10, #0x28]
0089c0ac	ldr x11,[x19, #0x28]
0089c0b0	str x8,[x10]
0089c0b4	ldr x10,[x19]
0089c0b8	add x8,x11,#0x1
0089c0bc	str x8,[x19, #0x28]
0089c0c0	mov w8,#0x30
0089c0c4	madd x8,x9,x8,x10
0089c0c8	add x0,x8,#0x8
0089c0cc	ldp x20,x19,[sp, #0x10]
0089c0d0	ldp x29,x30,[sp], #0x20
0089c0d4	ret
