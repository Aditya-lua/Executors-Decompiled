; std::__ndk1::stoi @ 00bc8090
00bc8090	paciasp
00bc8094	sub sp,sp,#0x70
00bc8098	stp x29,x30,[sp, #0x30]
00bc809c	str x23,[sp, #0x40]
00bc80a0	stp x22,x21,[sp, #0x50]
00bc80a4	stp x20,x19,[sp, #0x60]
00bc80a8	add x29,sp,#0x30
00bc80ac	mov w8,#0x8
00bc80b0	ldrb w9,[x0]
00bc80b4	add x10,x0,#0x4
00bc80b8	strb w8,[sp]
00bc80bc	mov w8,#0x7473
00bc80c0	mov w20,w2
00bc80c4	movk w8,#0x696f, LSL #16
00bc80c8	tst w9,#0x1
00bc80cc	mov x19,x1
00bc80d0	stur w8,[sp, #0x1]
00bc80d4	ldr x8,[x0, #0x10]
00bc80d8	strb wzr,[sp, #0x5]
00bc80dc	str xzr,[x29, #0x18]
00bc80e0	csel x21,x10,x8,eq
00bc80e4	bl 0x00c30710
00bc80e8	ldr w23,[x0]
00bc80ec	mov x22,x0
00bc80f0	str wzr,[x0]
00bc80f4	add x1,x29,#0x18
00bc80f8	mov x0,x21
00bc80fc	mov w2,w20
00bc8100	bl 0x00c43830
00bc8104	ldr w8,[x22]
00bc8108	str w23,[x22]
00bc810c	cmp w8,#0x22
00bc8110	b.eq 0x00bc8160
00bc8114	ldr x8,[x29, #0x18]
00bc8118	subs x8,x8,x21
00bc811c	b.eq 0x00bc818c
00bc8120	mov x20,x0
00bc8124	cbz x19,0x00bc8130
00bc8128	asr x8,x8,#0x2
00bc812c	str x8,[x19]
00bc8130	cmp x20,w20, SXTW 
00bc8134	b.ne 0x00bc8194
00bc8138	mov x0,sp
00bc813c	bl 0x00c43db0
00bc8140	mov w0,w20
00bc8144	ldp x20,x19,[sp, #0x60]
00bc8148	ldr x23,[sp, #0x40]
00bc814c	ldp x22,x21,[sp, #0x50]
00bc8150	ldp x29,x30,[sp, #0x30]
00bc8154	add sp,sp,#0x70
00bc8158	autiasp
00bc815c	ret
00bc8160	adrp x1,0x2ce000
00bc8164	add x1,x1,#0xb11
00bc8168	add x8,sp,#0x18
00bc816c	mov x0,sp
00bc8170	add x19,sp,#0x18
00bc8174	bl 0x00bcab58
00bc8178	ldrb w8,[sp, #0x18]
00bc817c	ldr x9,[sp, #0x28]
00bc8180	tst w8,#0x1
00bc8184	csinc x0,x9,x19,ne
00bc8188	bl 0x0080c8d0
00bc818c	mov x0,sp
00bc8190	bl 0x00bcaab4
00bc8194	mov w8,#0x24
00bc8198	adrp x10,0x2ce000
00bc819c	add x10,x10,#0xb11
00bc81a0	ldur w9,[sp, #0x1]
00bc81a4	strb w8,[sp, #0x18]
00bc81a8	ldr x8,[x10]
00bc81ac	ldur x10,[x10, #0x6]
00bc81b0	str xzr,[sp, #0x28]
00bc81b4	stur w9,[sp, #0x19]
00bc81b8	stur x8,[sp, #0x1d]
00bc81bc	add x8,sp,#0x18
00bc81c0	stur x10,[sp, #0x23]
00bc81c4	orr x0,x8,#0x1
00bc81c8	bl 0x0080c8d0
