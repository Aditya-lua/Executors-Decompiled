; FUN_008a3880 @ 008a3880
008a3880	sub sp,sp,#0x50
008a3884	stp x29,x30,[sp, #0x20]
008a3888	str x21,[sp, #0x30]
008a388c	stp x20,x19,[sp, #0x40]
008a3890	add x29,sp,#0x20
008a3894	mrs x20,tpidr_el0
008a3898	ldr x8,[x20, #0x28]
008a389c	stur x8,[x29, #-0x8]
008a38a0	cbz x1,0x008a3a28
008a38a4	adrp x8,0xd1b000
008a38a8	ldr w9,[x1, #0x8]
008a38ac	ldr w8,[x8, #0x10]
008a38b0	cmp w9,w8
008a38b4	b.ne 0x008a3a28
008a38b8	ldr x8,[x0, #0x38]
008a38bc	cbz x8,0x008a3a28
008a38c0	ldr x8,[x1, #0x20]
008a38c4	mov x11,#0x2d69
008a38c8	movk x11,#0xeb38, LSL #16
008a38cc	lsl w9,w8,#0x3
008a38d0	lsr x10,x8,#0x20
008a38d4	movk x11,#0xea08, LSL #32
008a38d8	movk x11,#0x9ddf, LSL #48
008a38dc	add x9,x9,#0x8
008a38e0	eor x9,x9,x10
008a38e4	mul x9,x9,x11
008a38e8	eor x10,x10,x9, LSR #0x2f
008a38ec	eor x9,x10,x9
008a38f0	mov x10,#0x959d
008a38f4	mul x9,x9,x11
008a38f8	movk x10,#0xb8f4, LSL #16
008a38fc	movk x10,#0xd34f, LSL #32
008a3900	movk x10,#0x949d, LSL #48
008a3904	eor x9,x9,x9, LSR #0x2f
008a3908	mul x9,x9,x10
008a390c	ldrb w10,[x0, #0x40]
008a3910	lsr x9,x9,x10
008a3914	ldr x10,[x0, #0x28]
008a3918	lsr x11,x9,#0x6
008a391c	ldr x11,[x10, x11, LSL #0x3]
008a3920	lsr x11,x11,x9
008a3924	tbz w11,#0x0,0x008a3a28
008a3928	ldr x12,[x0, #0x30]
008a392c	ldr x11,[x0, #0x10]
008a3930	sub x12,x12,#0x1
008a3934	lsl x13,x9,#0x4
008a3938	ldr x13,[x11, x13#0x0]
008a393c	cmp x13,x8
008a3940	b.eq 0x008a3960
008a3944	add x9,x9,#0x1
008a3948	and x9,x9,x12
008a394c	lsr x13,x9,#0x6
008a3950	ldr x13,[x10, x13, LSL #0x3]
008a3954	lsr x13,x13,x9
008a3958	tbnz w13,#0x0,0x008a3934
008a395c	b 0x008a3a28
008a3960	add x19,x11,x9, LSL #0x4
008a3964	ldr x9,[x0, #0x70]
008a3968	ldr x8,[x19, #0x8]!
008a396c	stp x8,x2,[sp, #0x8]
008a3970	cbz x9,0x008a3a00
008a3974	mov x9,#0xe5b9
008a3978	movk x9,#0x1ce4, LSL #16
008a397c	movk x9,#0x476d, LSL #32
008a3980	movk x9,#0xbf58, LSL #48
008a3984	mul x9,x8,x9
008a3988	lsr x10,x9,#0x1f
008a398c	eor x10,x10,x2, LSR #0x4
008a3990	eor x10,x10,x2, LSR #0x9
008a3994	eor x9,x10,x9
008a3998	mov x10,#0x7c15
008a399c	movk x10,#0x7f4a, LSL #16
008a39a0	movk x10,#0x79b9, LSL #32
008a39a4	movk x10,#0x9e37, LSL #48
008a39a8	mul x9,x9,x10
008a39ac	ldrb w10,[x0, #0x78]
008a39b0	lsr x10,x9,x10
008a39b4	ldr x9,[x0, #0x60]
008a39b8	lsr x11,x10,#0x6
008a39bc	ldr x11,[x9, x11, LSL #0x3]
008a39c0	lsr x11,x11,x10
008a39c4	tbz w11,#0x0,0x008a3a00
008a39c8	ldr x12,[x0, #0x68]
008a39cc	ldr x11,[x0, #0x48]
008a39d0	sub x12,x12,#0x1
008a39d4	add x13,x11,x10, LSL #0x4
008a39d8	ldp x14,x13,[x13]
008a39dc	cmp x14,x8
008a39e0	ccmp x13,x2,#0x0,eq
008a39e4	b.eq 0x008a3a28
008a39e8	add x10,x10,#0x1
008a39ec	and x10,x10,x12
008a39f0	lsr x13,x10,#0x6
008a39f4	ldr x13,[x9, x13, LSL #0x3]
008a39f8	lsr x13,x13,x10
008a39fc	tbnz w13,#0x0,0x008a39d4
008a3a00	mov x21,x0
008a3a04	add x0,x0,#0x48
008a3a08	add x1,sp,#0x8
008a3a0c	bl 0x008a3c28
008a3a10	ldr x0,[x21, #0x8]
008a3a14	mov x1,x19
008a3a18	bl 0x00891928
008a3a1c	ldr w8,[x0, #0x4]
008a3a20	add w8,w8,#0x1
008a3a24	str w8,[x0, #0x4]
008a3a28	ldr x8,[x20, #0x28]
008a3a2c	ldur x9,[x29, #-0x8]
008a3a30	cmp x8,x9
008a3a34	b.ne 0x008a3a4c
008a3a38	ldp x20,x19,[sp, #0x40]
008a3a3c	ldr x21,[sp, #0x30]
008a3a40	ldp x29,x30,[sp, #0x20]
008a3a44	add sp,sp,#0x50
008a3a48	ret
008a3a4c	bl 0x00c2fec0
