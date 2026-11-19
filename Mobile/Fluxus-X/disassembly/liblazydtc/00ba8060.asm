; FUN_00ba8060 @ 00ba8060
00ba8060	sub sp,sp,#0x80
00ba8064	stp x28,x27,[sp, #0x20]
00ba8068	stp x26,x25,[sp, #0x30]
00ba806c	stp x24,x23,[sp, #0x40]
00ba8070	stp x22,x21,[sp, #0x50]
00ba8074	stp x20,x19,[sp, #0x60]
00ba8078	stp x29,x30,[sp, #0x70]
00ba807c	add x29,sp,#0x70
00ba8080	orr w8,w4,w3
00ba8084	cmp w8,#0x0
00ba8088	cset w8,ne
00ba808c	cmp x5,#0x0
00ba8090	mov x19,x7
00ba8094	mov w28,w6
00ba8098	mov x24,x5
00ba809c	mov w25,w4
00ba80a0	mov w26,w3
00ba80a4	mov x20,x2
00ba80a8	mov x21,x1
00ba80ac	mov x22,x0
00ba80b0	cset w9,eq
00ba80b4	mov w0,#0xffffbf80
00ba80b8	cbz x1,0x00ba8144
00ba80bc	and w8,w8,w9
00ba80c0	tbnz w8,#0x0,0x00ba8144
00ba80c4	ldr x23,[x22, #0x8]
00ba80c8	cbz w26,0x00ba80ec
00ba80cc	mov w0,w26
00ba80d0	bl 0x00c30210
00ba80d4	bl 0x00c302d0
00ba80d8	tst w0,#0xff
00ba80dc	b.eq 0x00ba8140
00ba80e0	mov w8,w25
00ba80e4	cmp x8,w0, UXTB 
00ba80e8	b.ne 0x00ba8140
00ba80ec	ldr w8,[x22, #0xe4]
00ba80f0	cmp w8,#0x0
00ba80f4	csel w27,w26,w8,eq
00ba80f8	mov w0,w27
00ba80fc	bl 0x00c30210
00ba8100	bl 0x00c302d0
00ba8104	tst w0,#0xff
00ba8108	b.eq 0x00ba8140
00ba810c	cmn w28,#0x1
00ba8110	and x9,x0,#0xff
00ba8114	b.eq 0x00ba8134
00ba8118	tbnz w28,#0x1f,0x00ba8140
00ba811c	sxtw x26,w28
00ba8120	add x8,x26,x9
00ba8124	add x8,x8,#0x2
00ba8128	cmp x8,x23
00ba812c	b.ls 0x00ba817c
00ba8130	b 0x00ba8140
00ba8134	lsl x8,x9,#0x1
00ba8138	cmp x23,x8
00ba813c	b.cs 0x00ba8164
00ba8140	mov w0,#0xffffbf80
00ba8144	ldp x29,x30,[sp, #0x70]
00ba8148	ldp x20,x19,[sp, #0x60]
00ba814c	ldp x22,x21,[sp, #0x50]
00ba8150	ldp x24,x23,[sp, #0x40]
00ba8154	ldp x26,x25,[sp, #0x30]
00ba8158	ldp x28,x27,[sp, #0x20]
00ba815c	add sp,sp,#0x80
00ba8160	ret
00ba8164	add x8,x8,#0x2
00ba8168	cmp x23,x8
00ba816c	mov x26,x9
00ba8170	b.cs 0x00ba817c
00ba8174	sub x8,x23,#0x2
00ba8178	sub x26,x8,x9
00ba817c	mov x0,x19
00ba8180	mov w1,wzr
00ba8184	mov x2,x23
00ba8188	mov x28,x9
00ba818c	bl 0x00c301c0
00ba8190	add x0,x22,#0x10
00ba8194	str x0,[sp]
00ba8198	bl 0x00c41b30
00ba819c	sub x8,x23,x28
00ba81a0	stp x0,x8,[sp, #0x8]
00ba81a4	sub x8,x8,#0x2
00ba81a8	sub x8,x8,x26
00ba81ac	str x28,[sp, #0x18]
00ba81b0	add x28,x19,x8
00ba81b4	mov w8,#0x1
00ba81b8	strb w8,[x28], #0x1
00ba81bc	mov x0,x20
00ba81c0	mov x1,x28
00ba81c4	mov x2,x26
00ba81c8	blr x21
00ba81cc	cbz w0,0x00ba81dc
00ba81d0	mov w8,#0xffffbb80
00ba81d4	add w0,w0,w8
00ba81d8	b 0x00ba8144
00ba81dc	add x8,x28,x26
00ba81e0	mov w1,w25
00ba81e4	mov x0,x24
00ba81e8	mov x2,x28
00ba81ec	mov x3,x26
00ba81f0	mov x4,x8
00ba81f4	mov w5,w27
00ba81f8	mov x24,x8
00ba81fc	bl 0x00ba8898
00ba8200	cbnz w0,0x00ba8144
00ba8204	ldp x8,x9,[sp, #0x8]
00ba8208	ldr x3,[sp, #0x18]
00ba820c	mov x2,x24
00ba8210	mov w4,w27
00ba8214	add x8,x8,#0x7
00ba8218	tst x8,#0x7
00ba821c	cset w8,eq
00ba8220	sub x8,x9,x8
00ba8224	cinc x0,x19,eq
00ba8228	sub x1,x8,#0x1
00ba822c	bl 0x00ba76c0
00ba8230	cbnz w0,0x00ba8144
00ba8234	ldr x0,[sp]
00ba8238	bl 0x00c41b30
00ba823c	mov w8,#0x1
00ba8240	ldrb w9,[x19]
00ba8244	bfm w8,w23,#0x1d,#0x1c
00ba8248	sub w8,w8,w0
00ba824c	orr w10,wzr,#0xff
00ba8250	lsr w8,w10,w8
00ba8254	and w8,w9,w8
00ba8258	strb w8,[x19]
00ba825c	ldr x8,[sp, #0x18]
00ba8260	mov w10,#0xbc
00ba8264	mov x0,x22
00ba8268	mov x1,x21
00ba826c	strb w10,[x24, x8]
00ba8270	mov x2,x20
00ba8274	mov x3,x19
00ba8278	mov x4,x19
00ba827c	ldp x29,x30,[sp, #0x70]
00ba8280	ldp x20,x19,[sp, #0x60]
00ba8284	ldp x22,x21,[sp, #0x50]
00ba8288	ldp x24,x23,[sp, #0x40]
00ba828c	ldp x26,x25,[sp, #0x30]
00ba8290	ldp x28,x27,[sp, #0x20]
00ba8294	add sp,sp,#0x80
00ba8298	b 0x00c43460
