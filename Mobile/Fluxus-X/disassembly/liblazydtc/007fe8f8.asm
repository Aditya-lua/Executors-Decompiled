; FUN_007fe8f8 @ 007fe8f8
007fe8f8	stp x29,x30,[sp, #-0x50]!
007fe8fc	str x25,[sp, #0x10]
007fe900	stp x24,x23,[sp, #0x20]
007fe904	stp x22,x21,[sp, #0x30]
007fe908	stp x20,x19,[sp, #0x40]
007fe90c	mov x29,sp
007fe910	ldp x20,x21,[x0, #0x8]
007fe914	mov x19,x0
007fe918	cmp x21,x20
007fe91c	b.eq 0x007fe9cc
007fe920	mov x22,x19
007fe924	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
007fe928	mov w12,#0xaa
007fe92c	ldr x8,[x22, #0x28]!
007fe930	ldur x9,[x22, #-0x8]
007fe934	movk x10,#0xc0c1
007fe938	add x8,x8,x9
007fe93c	umulh x11,x9,x10
007fe940	umulh x10,x8,x10
007fe944	lsr x11,x11,#0x7
007fe948	lsr x10,x10,#0x7
007fe94c	msub x9,x11,x12,x9
007fe950	add x23,x20,x11, LSL #0x3
007fe954	mov w11,#0x18
007fe958	msub x12,x10,x12,x8
007fe95c	ldr x8,[x23]
007fe960	nop
007fe964	madd x25,x9,x11,x8
007fe968	ldr x9,[x20, x10, LSL #0x3]
007fe96c	nop
007fe970	madd x24,x12,x11,x9
007fe974	cmp x25,x24
007fe978	b.ne 0x007fe988
007fe97c	b 0x007fe9c4
007fe980	cmp x25,x24
007fe984	b.eq 0x007fe9c0
007fe988	ldrb w9,[x25]
007fe98c	tbz w9,#0x0,0x007fe9a4
007fe990	ldr x8,[x25]
007fe994	ldr x0,[x25, #0x10]
007fe998	and x1,x8,#-0x2
007fe99c	bl 0x00c2fe80
007fe9a0	ldr x8,[x23]
007fe9a4	add x25,x25,#0x18
007fe9a8	sub x9,x25,x8
007fe9ac	cmp x9,#0xff0
007fe9b0	b.ne 0x007fe980
007fe9b4	ldr x8,[x23, #0x8]!
007fe9b8	mov x25,x8
007fe9bc	b 0x007fe980
007fe9c0	ldp x20,x21,[x19, #0x8]
007fe9c4	mov x8,x21
007fe9c8	b 0x007fe9d4
007fe9cc	add x22,x19,#0x28
007fe9d0	mov x8,x20
007fe9d4	sub x8,x8,x20
007fe9d8	str xzr,[x22]
007fe9dc	asr x8,x8,#0x3
007fe9e0	cmp x8,#0x3
007fe9e4	b.cc 0x007fea10
007fe9e8	ldr x0,[x20]
007fe9ec	mov w1,#0xff0
007fe9f0	bl 0x00c2fe80
007fe9f4	ldp x8,x21,[x19, #0x8]
007fe9f8	add x20,x8,#0x8
007fe9fc	sub x8,x21,x20
007fea00	str x20,[x19, #0x8]
007fea04	asr x8,x8,#0x3
007fea08	cmp x8,#0x2
007fea0c	b.hi 0x007fe9e8
007fea10	cmp x8,#0x1
007fea14	b.eq 0x007fea28
007fea18	cmp x8,#0x2
007fea1c	b.ne 0x007fea30
007fea20	mov w8,#0xaa
007fea24	b 0x007fea2c
007fea28	mov w8,#0x55
007fea2c	str x8,[x19, #0x20]
007fea30	cmp x20,x21
007fea34	b.eq 0x007fea68
007fea38	ldr x0,[x20], #0x8
007fea3c	mov w1,#0xff0
007fea40	bl 0x00c2fe80
007fea44	cmp x20,x21
007fea48	b.ne 0x007fea38
007fea4c	ldp x9,x8,[x19, #0x8]
007fea50	subs x9,x9,x8
007fea54	b.eq 0x007fea68
007fea58	add x9,x9,#0x7
007fea5c	and x9,x9,#-0x8
007fea60	add x8,x8,x9
007fea64	str x8,[x19, #0x10]
007fea68	ldr x0,[x19]
007fea6c	cbz x0,0x007fea90
007fea70	ldr x8,[x19, #0x18]
007fea74	sub x1,x8,x0
007fea78	ldp x20,x19,[sp, #0x40]
007fea7c	ldr x25,[sp, #0x10]
007fea80	ldp x22,x21,[sp, #0x30]
007fea84	ldp x24,x23,[sp, #0x20]
007fea88	ldp x29,x30,[sp], #0x50
007fea8c	b 0x00c2fe80
007fea90	ldp x20,x19,[sp, #0x40]
007fea94	ldr x25,[sp, #0x10]
007fea98	ldp x22,x21,[sp, #0x30]
007fea9c	ldp x24,x23,[sp, #0x20]
007feaa0	ldp x29,x30,[sp], #0x50
007feaa4	ret
