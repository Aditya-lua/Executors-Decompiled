; cpr::util::parseCookies @ 008febd4
008febd4	sub sp,sp,#0x110
008febd8	stp x28,x27,[sp, #0xb0]
008febdc	stp x26,x25,[sp, #0xc0]
008febe0	stp x24,x23,[sp, #0xd0]
008febe4	stp x22,x21,[sp, #0xe0]
008febe8	stp x20,x19,[sp, #0xf0]
008febec	stp x29,x30,[sp, #0x100]
008febf0	add x29,sp,#0x100
008febf4	mov x26,x8
008febf8	mrs x8,tpidr_el0
008febfc	str x8,[sp]
008fec00	ldr x8,[x8, #0x28]
008fec04	mov x20,x0
008fec08	mov w9,#0x1
008fec0c	stur x8,[x29, #-0x60]
008fec10	strb w9,[x26]
008fec14	stp xzr,xzr,[x26, #0x10]
008fec18	str xzr,[x26, #0x8]
008fec1c	cbz x0,0x008feeb4
008fec20	add x8,sp,#0x10
008fec24	orr x19,xzr,#-0x5555555555555556
008fec28	adrp x21,0x2ab000
008fec2c	movk x19,#0xaaab
008fec30	orr x8,x8,#0x1
008fec34	add x21,x21,#0x32c
008fec38	str x8,[sp, #0x8]
008fec3c	ldr x22,[x20]
008fec40	stp xzr,xzr,[sp, #0x10]
008fec44	str xzr,[sp, #0x20]
008fec48	mov x0,x22
008fec4c	bl 0x00c2ff50
008fec50	mov x23,x0
008fec54	cmn x0,#0x10
008fec58	b.cs 0x008feee8
008fec5c	cmp x23,#0x17
008fec60	b.cs 0x008fec78
008fec64	ldr x24,[sp, #0x8]
008fec68	lsl w8,w23,#0x1
008fec6c	strb w8,[sp, #0x10]
008fec70	cbnz x23,0x008fec98
008fec74	b 0x008feca8
008fec78	add x8,x23,#0x10
008fec7c	and x25,x8,#-0x10
008fec80	mov x0,x25
008fec84	bl 0x00c2fed0
008fec88	orr x8,x25,#0x1
008fec8c	mov x24,x0
008fec90	stp x23,x0,[sp, #0x18]
008fec94	str x8,[sp, #0x10]
008fec98	mov x0,x24
008fec9c	mov x1,x22
008feca0	mov x2,x23
008feca4	bl 0x00c2ffd0
008feca8	strb wzr,[x24, x23]
008fecac	sub x8,x29,#0x78
008fecb0	add x0,sp,#0x10
008fecb4	mov w1,#0x9
008fecb8	bl 0x00c31970
008fecbc	ldrb w8,[sp, #0x10]
008fecc0	tbz w8,#0x0,0x008feccc
008fecc4	ldr x0,[sp, #0x20]
008fecc8	bl 0x00c301d0
008feccc	ldp x9,x8,[x29, #-0x78]
008fecd0	sub x10,x8,x9
008fecd4	asr x10,x10,#0x3
008fecd8	mul x10,x10,x19
008fecdc	cmp x10,#0x6
008fece0	b.hi 0x008fed30
008fece4	ldur x9,[x29, #-0x68]
008fece8	cmp x9,x8
008fecec	b.ls 0x008fed08
008fecf0	stp xzr,xzr,[x8, #0x8]
008fecf4	str xzr,[x8]
008fecf8	ldur x8,[x29, #-0x70]
008fecfc	add x8,x8,#0x18
008fed00	stur x8,[x29, #-0x70]
008fed04	b 0x008fed18
008fed08	sub x0,x29,#0x78
008fed0c	mov x1,x21
008fed10	bl 0x00c31a10
008fed14	ldur x8,[x29, #-0x70]
008fed18	ldur x9,[x29, #-0x78]
008fed1c	sub x10,x8,x9
008fed20	asr x10,x10,#0x3
008fed24	mul x10,x10,x19
008fed28	cmp x10,#0x7
008fed2c	b.cc 0x008fece4
008fed30	add x0,x9,#0x60
008fed34	mov w2,#0xa
008fed38	mov x1,xzr
008fed3c	bl 0x00c319f0
008fed40	ldp x22,x8,[x29, #-0x78]
008fed44	sub x8,x8,x22
008fed48	asr x9,x8,#0x3
008fed4c	mul x9,x9,x19
008fed50	cmp x9,#0x5
008fed54	b.ls 0x008feef0
008fed58	cmp x8,#0x90
008fed5c	b.eq 0x008feef8
008fed60	mov x23,x0
008fed64	add x0,x22,#0x18
008fed68	bl 0x00c31980
008fed6c	ldp x28,x8,[x29, #-0x78]
008fed70	sub x8,x8,x28
008fed74	asr x9,x8,#0x3
008fed78	mul x9,x9,x19
008fed7c	cmp x9,#0x2
008fed80	b.ls 0x008fef08
008fed84	cmp x8,#0x48
008fed88	b.eq 0x008fef00
008fed8c	mov w24,w0
008fed90	add x0,x28,#0x48
008fed94	bl 0x00c31980
008fed98	mov w25,w0
008fed9c	mov x0,x23
008feda0	mov x19,x21
008feda4	mov x21,x26
008feda8	add x26,x22,#0x78
008fedac	add x27,x22,#0x90
008fedb0	add x28,x28,#0x30
008fedb4	bl 0x00c31a00
008fedb8	mov x7,x0
008fedbc	and w4,w24,#0x1
008fedc0	and w6,w25,#0x1
008fedc4	add x0,sp,#0x10
008fedc8	mov x1,x26
008fedcc	mov x26,x21
008fedd0	mov x21,x19
008fedd4	orr x19,xzr,#-0x5555555555555556
008fedd8	mov x2,x27
008feddc	mov x3,x22
008fede0	mov x5,x28
008fede4	movk x19,#0xaaab
008fede8	bl 0x00c31990
008fedec	add x1,sp,#0x10
008fedf0	mov x0,x26
008fedf4	bl 0x00c30e00
008fedf8	ldrb w8,[sp, #0x60]
008fedfc	tbnz w8,#0x0,0x008fee54
008fee00	ldrb w8,[sp, #0x40]
008fee04	tbnz w8,#0x0,0x008fee64
008fee08	ldrb w8,[sp, #0x28]
008fee0c	tbnz w8,#0x0,0x008fee74
008fee10	ldrb w8,[sp, #0x10]
008fee14	tbnz w8,#0x0,0x008fee84
008fee18	ldur x22,[x29, #-0x78]
008fee1c	cbz x22,0x008fee94
008fee20	ldur x8,[x29, #-0x70]
008fee24	cmp x8,x22
008fee28	b.eq 0x008feea0
008fee2c	mov x23,x8
008fee30	ldrb w9,[x23, #-0x18]!
008fee34	tbz w9,#0x0,0x008fee40
008fee38	ldur x0,[x8, #-0x8]
008fee3c	bl 0x00c301d0
008fee40	cmp x22,x23
008fee44	mov x8,x23
008fee48	b.ne 0x008fee30
008fee4c	ldur x0,[x29, #-0x78]
008fee50	b 0x008feea4
008fee54	ldr x0,[sp, #0x70]
008fee58	bl 0x00c301d0
008fee5c	ldrb w8,[sp, #0x40]
008fee60	tbz w8,#0x0,0x008fee08
008fee64	ldr x0,[sp, #0x50]
008fee68	bl 0x00c301d0
008fee6c	ldrb w8,[sp, #0x28]
008fee70	tbz w8,#0x0,0x008fee10
008fee74	ldr x0,[sp, #0x38]
008fee78	bl 0x00c301d0
008fee7c	ldrb w8,[sp, #0x10]
008fee80	tbz w8,#0x0,0x008fee18
008fee84	ldr x0,[sp, #0x20]
008fee88	bl 0x00c301d0
008fee8c	ldur x22,[x29, #-0x78]
008fee90	cbnz x22,0x008fee20
008fee94	ldr x20,[x20, #0x8]
008fee98	cbnz x20,0x008fec3c
008fee9c	b 0x008feeb4
008feea0	mov x0,x22
008feea4	stur x22,[x29, #-0x70]
008feea8	bl 0x00c301d0
008feeac	ldr x20,[x20, #0x8]
008feeb0	cbnz x20,0x008fec3c
008feeb4	ldr x8,[sp]
008feeb8	ldr x8,[x8, #0x28]
008feebc	ldur x9,[x29, #-0x60]
008feec0	cmp x8,x9
008feec4	b.ne 0x008fef10
008feec8	ldp x29,x30,[sp, #0x100]
008feecc	ldp x20,x19,[sp, #0xf0]
008feed0	ldp x22,x21,[sp, #0xe0]
008feed4	ldp x24,x23,[sp, #0xd0]
008feed8	ldp x26,x25,[sp, #0xc0]
008feedc	ldp x28,x27,[sp, #0xb0]
008feee0	add sp,sp,#0x110
008feee4	ret
008feee8	add x0,sp,#0x10
008feeec	bl 0x00c30ce0
008feef0	sub x0,x29,#0x78
008feef4	bl 0x00c319d0
008feef8	sub x0,x29,#0x78
008feefc	bl 0x00c319d0
008fef00	sub x0,x29,#0x78
008fef04	bl 0x00c319d0
008fef08	sub x0,x29,#0x78
008fef0c	bl 0x00c319d0
008fef10	bl 0x00c2fec0
