; FUN_008dda14 @ 008dda14
008dda14	sub sp,sp,#0x60
008dda18	stp x29,x30,[sp, #0x20]
008dda1c	stp x24,x23,[sp, #0x30]
008dda20	stp x22,x21,[sp, #0x40]
008dda24	stp x20,x19,[sp, #0x50]
008dda28	add x29,sp,#0x20
008dda2c	mrs x21,tpidr_el0
008dda30	mov x19,x8
008dda34	mov x20,x0
008dda38	ldr x8,[x21, #0x28]
008dda3c	mov x22,xzr
008dda40	mov w23,#0x1
008dda44	mov x24,sp
008dda48	stur x8,[x29, #-0x8]
008dda4c	stp xzr,xzr,[x19]
008dda50	str xzr,[x19, #0x10]
008dda54	b 0x008dda70
008dda58	mov x1,sp
008dda5c	mov x0,x19
008dda60	bl 0x008ddb70
008dda64	add x22,x22,#0x1
008dda68	cmp x22,#0x80
008dda6c	b.eq 0x008ddb0c
008dda70	add x8,x20,x22, LSL #0x4
008dda74	ldp x9,x8,[x8]
008dda78	orr x8,x8,x9
008dda7c	cbnz x8,0x008dda64
008dda80	cmp x22,#0x3f
008dda84	stp xzr,xzr,[sp]
008dda88	lsl x10,x23,x22
008dda8c	cset w9,hi
008dda90	orr x9,x24,x9, LSL #0x3
008dda94	ldr x11,[x9]
008dda98	orr x10,x11,x10
008dda9c	str x10,[x9]
008ddaa0	b 0x008ddab0
008ddaa4	add x8,x8,#0x1
008ddaa8	cmp x8,#0x80
008ddaac	b.eq 0x008dda58
008ddab0	ldr q1,[x20,x8, lsl #4]
008ddab4	ldr q0,[sp]
008ddab8	and v1.16B,v0.16B,v1.16B
008ddabc	cnt v1.16B,v1.16B
008ddac0	uaddlp v1.8H,v1.16B
008ddac4	uaddlp v1.4S,v1.8H
008ddac8	uaddlp v1.2D,v1.4S
008ddacc	xtn v1.2S,v1.2D
008ddad0	dup v2.2S,v1.S[0x1]
008ddad4	add v1.2S,v2.2S,v1.2S
008ddad8	fmov w9,s1
008ddadc	tbz w9,#0x0,0x008ddaa4
008ddae0	mov x9,v0.D[0x1]
008ddae4	fmov x12,d0
008ddae8	cmp x8,#0x3f
008ddaec	cset w10,hi
008ddaf0	lsl x11,x23,x8
008ddaf4	cmp x8,#0x40
008ddaf8	orr x10,x24,x10, LSL #0x3
008ddafc	csel x9,x12,x9,cc
008ddb00	orr x9,x9,x11
008ddb04	str x9,[x10]
008ddb08	b 0x008ddaa4
008ddb0c	ldr x8,[x21, #0x28]
008ddb10	ldur x9,[x29, #-0x8]
008ddb14	cmp x8,x9
008ddb18	b.ne 0x008ddb6c
008ddb1c	ldp x20,x19,[sp, #0x50]
008ddb20	ldp x22,x21,[sp, #0x40]
008ddb24	ldp x24,x23,[sp, #0x30]
008ddb28	ldp x29,x30,[sp, #0x20]
008ddb2c	add sp,sp,#0x60
008ddb30	ret
008ddb6c	bl 0x00c2fec0
