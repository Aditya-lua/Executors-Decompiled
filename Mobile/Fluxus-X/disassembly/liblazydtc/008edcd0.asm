; cpr::Resolve::Resolve @ 008edcd0
008edcd0	sub sp,sp,#0x80
008edcd4	str x27,[sp, #0x20]
008edcd8	stp x26,x25,[sp, #0x30]
008edcdc	stp x24,x23,[sp, #0x40]
008edce0	stp x22,x21,[sp, #0x50]
008edce4	stp x20,x19,[sp, #0x60]
008edce8	stp x29,x30,[sp, #0x70]
008edcec	add x29,sp,#0x70
008edcf0	mrs x26,tpidr_el0
008edcf4	ldr x8,[x26, #0x28]
008edcf8	mov x21,x1
008edcfc	mov x19,x0
008edd00	str x8,[sp, #0x18]
008edd04	stp xzr,xzr,[x0, #0x8]
008edd08	str xzr,[x0]
008edd0c	ldrb w8,[x1]
008edd10	tbnz w8,#0x0,0x008edd28
008edd14	ldr x8,[x21, #0x10]
008edd18	str x8,[x19, #0x10]
008edd1c	ldr q0,[x21]
008edd20	str q0,[x19]
008edd24	b 0x008edd88
008edd28	ldr x20,[x21, #0x8]
008edd2c	cmn x20,#0x10
008edd30	b.cs 0x008edf48
008edd34	ldr x22,[x21, #0x10]
008edd38	cmp x20,#0x17
008edd3c	b.cs 0x008edd54
008edd40	lsl w8,w20,#0x1
008edd44	mov x23,x19
008edd48	strb w8,[x23], #0x1
008edd4c	cbnz x20,0x008edd74
008edd50	b 0x008edd84
008edd54	add x8,x20,#0x10
008edd58	and x24,x8,#-0x10
008edd5c	mov x0,x24
008edd60	bl 0x00c2fed0
008edd64	orr x8,x24,#0x1
008edd68	mov x23,x0
008edd6c	stp x20,x0,[x19, #0x8]
008edd70	str x8,[x19]
008edd74	mov x0,x23
008edd78	mov x1,x22
008edd7c	mov x2,x20
008edd80	bl 0x00c2ffd0
008edd84	strb wzr,[x23, x20]
008edd88	mov x20,x19
008edd8c	str xzr,[x20, #0x18]!
008edd90	stp xzr,xzr,[x20, #0x8]
008edd94	mov x8,x21
008edd98	ldrb w9,[x8, #0x18]!
008edd9c	tbnz w9,#0x0,0x008eddb4
008edda0	ldr x9,[x8, #0x10]
008edda4	str x9,[x20, #0x10]
008edda8	ldr q0,[x8]
008eddac	str q0,[x20]
008eddb0	b 0x008ede14
008eddb4	ldr x22,[x21, #0x20]
008eddb8	cmn x22,#0x10
008eddbc	b.cs 0x008edf50
008eddc0	ldr x23,[x21, #0x28]
008eddc4	cmp x22,#0x17
008eddc8	b.cs 0x008edde0
008eddcc	lsl w8,w22,#0x1
008eddd0	mov x24,x20
008eddd4	strb w8,[x24], #0x1
008eddd8	cbnz x22,0x008ede00
008edddc	b 0x008ede10
008edde0	add x8,x22,#0x10
008edde4	and x25,x8,#-0x10
008edde8	mov x0,x25
008eddec	bl 0x00c2fed0
008eddf0	orr x8,x25,#0x1
008eddf4	mov x24,x0
008eddf8	stp x22,x0,[x19, #0x20]
008eddfc	str x8,[x19, #0x18]
008ede00	mov x0,x24
008ede04	mov x1,x23
008ede08	mov x2,x22
008ede0c	bl 0x00c2ffd0
008ede10	strb wzr,[x24, x22]
008ede14	mov x22,x19
008ede18	str xzr,[x22, #0x38]!
008ede1c	str xzr,[x22, #0x8]
008ede20	stur x22,[x22, #-0x8]
008ede24	ldr x27,[x21, #0x30]
008ede28	add x25,x21,#0x38
008ede2c	cmp x27,x25
008ede30	b.eq 0x008edf14
008ede34	sub x21,x22,#0x8
008ede38	add x24,x27,#0x1a
008ede3c	add x2,sp,#0x10
008ede40	add x3,sp,#0x8
008ede44	mov x0,x21
008ede48	mov x1,x22
008ede4c	mov x4,x24
008ede50	bl 0x00c316c0
008ede54	ldr x8,[x0]
008ede58	mov x23,x0
008ede5c	cbz x8,0x008ede6c
008ede60	ldr x8,[x27, #0x8]
008ede64	cbnz x8,0x008edec0
008ede68	b 0x008eded0
008ede6c	mov w0,#0x20
008ede70	bl 0x00c2fed0
008ede74	mov x1,x0
008ede78	ldrh w8,[x24]
008ede7c	ldr x9,[sp, #0x10]
008ede80	stp xzr,xzr,[x1]
008ede84	strh w8,[x1, #0x1a]
008ede88	str x9,[x1, #0x10]
008ede8c	str x1,[x23]
008ede90	ldr x8,[x21]
008ede94	ldr x8,[x8]
008ede98	cbz x8,0x008edea4
008ede9c	str x8,[x21]
008edea0	ldr x1,[x23]
008edea4	ldr x0,[x19, #0x38]
008edea8	bl 0x00c30c90
008edeac	ldr x8,[x19, #0x40]
008edeb0	add x8,x8,#0x1
008edeb4	str x8,[x19, #0x40]
008edeb8	ldr x8,[x27, #0x8]
008edebc	cbz x8,0x008eded0
008edec0	mov x27,x8
008edec4	ldr x8,[x8]
008edec8	cbnz x8,0x008edec0
008edecc	b 0x008edefc
008eded0	mov x8,x27
008eded4	ldr x9,[x8, #0x10]!
008eded8	ldr x10,[x9]
008ededc	cmp x10,x27
008edee0	b.eq 0x008edf08
008edee4	ldr x9,[x8]
008edee8	mov x8,x9
008edeec	ldr x27,[x8, #0x10]!
008edef0	ldr x10,[x27]
008edef4	cmp x10,x9
008edef8	b.ne 0x008edee4
008edefc	cmp x27,x25
008edf00	b.ne 0x008ede38
008edf04	b 0x008edf14
008edf08	mov x27,x9
008edf0c	cmp x27,x25
008edf10	b.ne 0x008ede38
008edf14	ldr x8,[x26, #0x28]
008edf18	ldr x9,[sp, #0x18]
008edf1c	cmp x8,x9
008edf20	b.ne 0x008edf44
008edf24	ldp x29,x30,[sp, #0x70]
008edf28	ldp x20,x19,[sp, #0x60]
008edf2c	ldp x22,x21,[sp, #0x50]
008edf30	ldp x24,x23,[sp, #0x40]
008edf34	ldp x26,x25,[sp, #0x30]
008edf38	ldr x27,[sp, #0x20]
008edf3c	add sp,sp,#0x80
008edf40	ret
008edf44	bl 0x00c2fec0
008edf48	mov x0,x19
008edf4c	bl 0x00c30ce0
008edf50	mov x0,x20
008edf54	bl 0x00c30ce0
