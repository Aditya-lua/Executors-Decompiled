; FUN_008a302c @ 008a302c
008a302c	stp x29,x30,[sp, #-0x20]!
008a3030	stp x20,x19,[sp, #0x10]
008a3034	mov x29,sp
008a3038	mov x20,x1
008a303c	mov x19,x0
008a3040	bl 0x008a3120
008a3044	ldr x8,[x20]
008a3048	mov x11,#0x2d69
008a304c	movk x11,#0xeb38, LSL #16
008a3050	lsl w9,w8,#0x3
008a3054	lsr x10,x8,#0x20
008a3058	movk x11,#0xea08, LSL #32
008a305c	movk x11,#0x9ddf, LSL #48
008a3060	add x9,x9,#0x8
008a3064	eor x9,x9,x10
008a3068	mul x9,x9,x11
008a306c	eor x10,x10,x9, LSR #0x2f
008a3070	eor x9,x10,x9
008a3074	mov x10,#0x959d
008a3078	mul x9,x9,x11
008a307c	movk x10,#0xb8f4, LSL #16
008a3080	ldr x11,[x19, #0x18]
008a3084	movk x10,#0xd34f, LSL #32
008a3088	movk x10,#0x949d, LSL #48
008a308c	eor x9,x9,x9, LSR #0x2f
008a3090	mul x9,x9,x10
008a3094	ldrb w10,[x19, #0x30]
008a3098	lsr x9,x9,x10
008a309c	mov w10,#0x1
008a30a0	lsr x12,x9,#0x6
008a30a4	lsl x14,x10,x9
008a30a8	ldr x10,[x19]
008a30ac	ldr x13,[x11, x12, LSL #0x3]
008a30b0	tst x14,x13
008a30b4	b.eq 0x008a30f0
008a30b8	ldr x12,[x19, #0x20]
008a30bc	mov w16,#0x1
008a30c0	sub x15,x12,#0x1
008a30c4	lsl x12,x9,#0x4
008a30c8	ldr x12,[x10, x12#0x0]
008a30cc	cmp x12,x8
008a30d0	b.eq 0x008a310c
008a30d4	add x9,x9,#0x1
008a30d8	and x9,x9,x15
008a30dc	lsr x12,x9,#0x6
008a30e0	lsl x14,x16,x9
008a30e4	ldr x13,[x11, x12, LSL #0x3]
008a30e8	tst x13,x14
008a30ec	b.ne 0x008a30c4
008a30f0	orr x13,x13,x14
008a30f4	str x13,[x11, x12, LSL #0x3]
008a30f8	add x11,x10,x9, LSL #0x4
008a30fc	ldr x12,[x19, #0x28]
008a3100	stp x8,xzr,[x11]
008a3104	add x8,x12,#0x1
008a3108	str x8,[x19, #0x28]
008a310c	add x8,x10,x9, LSL #0x4
008a3110	add x0,x8,#0x8
008a3114	ldp x20,x19,[sp, #0x10]
008a3118	ldp x29,x30,[sp], #0x20
008a311c	ret
