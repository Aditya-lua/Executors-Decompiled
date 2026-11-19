; SSL_CTX_add_session @ 009bddb8
009bddb8	stp x22,x21,[sp, #-0x30]!
009bddbc	stp x20,x19,[sp, #0x10]
009bddc0	mov x20,x1
009bddc4	mov x19,x0
009bddc8	add x8,x1,#0x2d0
009bddcc	stp x29,x30,[sp, #0x20]
009bddd0	add x29,sp,#0x20
009bddd4	ldxr w9,[x8]
009bddd8	add w9,w9,#0x1
009bdddc	stxr w10,w9,[x8]
009bdde0	cbnz w10,0x009bddd4
009bdde4	ldr x0,[x19, #0x3c8]
009bdde8	bl 0x00c356a0
009bddec	cbz w0,0x009bde48
009bddf0	ldr x0,[x19, #0x30]
009bddf4	mov x1,x20
009bddf8	bl 0x00c34dc0
009bddfc	mov x21,x0
009bde00	cbz x0,0x009bde58
009bde04	cmp x21,x20
009bde08	b.eq 0x009bde58
009bde0c	ldr x9,[x21, #0x328]
009bde10	cbz x9,0x009bded0
009bde14	ldr x10,[x21, #0x320]
009bde18	cbz x10,0x009bded0
009bde1c	add x12,x19,#0x48
009bde20	add x8,x21,#0x320
009bde24	cmp x9,x12
009bde28	add x11,x19,#0x40
009bde2c	b.eq 0x009bdea4
009bde30	cmp x10,x11
009bde34	b.eq 0x009bdeb8
009bde38	str x10,[x9, #0x320]
009bde3c	ldr x10,[x8]
009bde40	str x9,[x10, #0x328]
009bde44	b 0x009bdec8
009bde48	mov x0,x20
009bde4c	bl 0x009bdb1c
009bde50	mov w20,wzr
009bde54	b 0x009bdfe0
009bde58	cbz x21,0x009bde84
009bde5c	ldrb w8,[x19, #0x51]
009bde60	tbnz w8,#0x2,0x009bdee4
009bde64	cbz x21,0x009bdf1c
009bde68	mov x0,x19
009bde6c	mov x1,x20
009bde70	bl 0x009be424
009bde74	mov x0,x21
009bde78	bl 0x009bdb1c
009bde7c	mov w20,wzr
009bde80	b 0x009bdfd8
009bde84	ldr x0,[x19, #0x30]
009bde88	mov x1,x20
009bde8c	bl 0x00c34de0
009bde90	cmp x0,#0x0
009bde94	csel x21,x20,x21,eq
009bde98	ldrb w8,[x19, #0x51]
009bde9c	tbz w8,#0x2,0x009bde64
009bdea0	b 0x009bdee4
009bdea4	cmp x10,x11
009bdea8	b.eq 0x009bdec4
009bdeac	str x10,[x12]
009bdeb0	str x12,[x10, #0x328]
009bdeb4	b 0x009bdec8
009bdeb8	str x9,[x11]
009bdebc	str x11,[x9, #0x320]
009bdec0	b 0x009bdec8
009bdec4	stp xzr,xzr,[x11]
009bdec8	str xzr,[x21, #0x390]
009bdecc	stp xzr,xzr,[x8]
009bded0	mov x0,x21
009bded4	bl 0x009bdb1c
009bded8	mov x21,xzr
009bdedc	ldrb w8,[x19, #0x51]
009bdee0	tbz w8,#0x2,0x009bde64
009bdee4	mov x0,xzr
009bdee8	bl 0x00c30970
009bdeec	ldr x8,[x20, #0x2d8]
009bdef0	str x0,[x20, #0x2e0]
009bdef4	tbz x8,#0x3f,0x009bdf00
009bdef8	mov x8,xzr
009bdefc	str xzr,[x20, #0x2d8]
009bdf00	add x9,x8,x0
009bdf04	lsr x8,x8,#0x3f
009bdf08	cmp x0,#0x0
009bdf0c	csel w8,w8,wzr,gt
009bdf10	str x9,[x20, #0x2e8]
009bdf14	str w8,[x20, #0x2f0]
009bdf18	cbnz x21,0x009bde68
009bdf1c	mov w1,#0x2b
009bdf20	mov x0,x19
009bdf24	mov x2,xzr
009bdf28	mov x3,xzr
009bdf2c	bl 0x00c32710
009bdf30	cmp x0,#0x1
009bdf34	b.lt 0x009bdfc8
009bdf38	mov w1,#0x14
009bdf3c	mov x0,x19
009bdf40	mov x2,xzr
009bdf44	mov x3,xzr
009bdf48	bl 0x00c32710
009bdf4c	mov x21,x0
009bdf50	mov w1,#0x2b
009bdf54	mov x0,x19
009bdf58	mov x2,xzr
009bdf5c	mov x3,xzr
009bdf60	bl 0x00c32710
009bdf64	cmp x21,x0
009bdf68	b.lt 0x009bdfc8
009bdf6c	add x22,x19,#0x98
009bdf70	ldr x1,[x19, #0x48]
009bdf74	mov x0,x19
009bdf78	mov w2,wzr
009bdf7c	bl 0x009be2fc
009bdf80	cbz w0,0x009bdfc8
009bdf84	ldxr w8,[x22]
009bdf88	add w8,w8,#0x1
009bdf8c	stxr w9,w8,[x22]
009bdf90	cbnz w9,0x009bdf84
009bdf94	mov w1,#0x14
009bdf98	mov x0,x19
009bdf9c	mov x2,xzr
009bdfa0	mov x3,xzr
009bdfa4	bl 0x00c32710
009bdfa8	mov x21,x0
009bdfac	mov w1,#0x2b
009bdfb0	mov x0,x19
009bdfb4	mov x2,xzr
009bdfb8	mov x3,xzr
009bdfbc	bl 0x00c32710
009bdfc0	cmp x21,x0
009bdfc4	b.ge 0x009bdf70
009bdfc8	mov x0,x19
009bdfcc	mov x1,x20
009bdfd0	bl 0x009be424
009bdfd4	mov w20,#0x1
009bdfd8	ldr x0,[x19, #0x3c8]
009bdfdc	bl 0x00c35690
009bdfe0	mov w0,w20
009bdfe4	ldp x29,x30,[sp, #0x20]
009bdfe8	ldp x20,x19,[sp, #0x10]
009bdfec	ldp x22,x21,[sp], #0x30
009bdff0	ret
