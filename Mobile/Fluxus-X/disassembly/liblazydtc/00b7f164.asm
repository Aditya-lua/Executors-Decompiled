; mbedtls_mpi_sub_abs @ 00b7f164
00b7f164	str x27,[sp, #-0x60]!
00b7f168	stp x26,x25,[sp, #0x10]
00b7f16c	stp x24,x23,[sp, #0x20]
00b7f170	stp x22,x21,[sp, #0x30]
00b7f174	stp x20,x19,[sp, #0x40]
00b7f178	stp x29,x30,[sp, #0x50]
00b7f17c	add x29,sp,#0x50
00b7f180	ldrh w8,[x2, #0xa]
00b7f184	mov x20,x2
00b7f188	mov x21,x1
00b7f18c	mov x19,x0
00b7f190	sub x8,x8,#0x1
00b7f194	cmn x8,#0x1
00b7f198	b.eq 0x00b7f1c4
00b7f19c	ldr x9,[x20]
00b7f1a0	ldr x9,[x9, x8, LSL #0x3]
00b7f1a4	sub x8,x8,#0x1
00b7f1a8	cbz x9,0x00b7f194
00b7f1ac	mov x27,x21
00b7f1b0	ldrh w0,[x27, #0xa]!
00b7f1b4	add x22,x8,#0x2
00b7f1b8	cmp x22,x0
00b7f1bc	b.ls 0x00b7f1d0
00b7f1c0	b 0x00b7f2cc
00b7f1c4	mov x27,x21
00b7f1c8	ldrh w0,[x27, #0xa]!
00b7f1cc	mov x22,xzr
00b7f1d0	mov w8,#0x2710
00b7f1d4	mov w26,w0
00b7f1d8	cmp w0,w8
00b7f1dc	b.ls 0x00b7f1e8
00b7f1e0	orr w0,wzr,#0xfffffff0
00b7f1e4	b 0x00b7f2e0
00b7f1e8	ldrh w25,[x19, #0xa]
00b7f1ec	cmp w25,w26
00b7f1f0	b.cs 0x00b7f240
00b7f1f4	mov w1,#0x8
00b7f1f8	bl 0x00c30a30
00b7f1fc	mov x23,x0
00b7f200	cbz x0,0x00b7f1e0
00b7f204	ldr x24,[x19]
00b7f208	cbz x24,0x00b7f22c
00b7f20c	lsl x25,x25,#0x3
00b7f210	mov x0,x23
00b7f214	mov x1,x24
00b7f218	mov x2,x25
00b7f21c	bl 0x00c2ffd0
00b7f220	mov x0,x24
00b7f224	mov x1,x25
00b7f228	bl 0x00c42230
00b7f22c	strh w26,[x19, #0xa]
00b7f230	str x23,[x19]
00b7f234	ldrh w0,[x27]
00b7f238	mov w25,w26
00b7f23c	mov w26,w0
00b7f240	cmp x21,x19
00b7f244	b.eq 0x00b7f274
00b7f248	subs x8,x0,x22
00b7f24c	b.ls 0x00b7f274
00b7f250	ldr x9,[x19]
00b7f254	ldr x10,[x21]
00b7f258	lsl x11,x22,#0x3
00b7f25c	lsl x2,x8,#0x3
00b7f260	add x0,x9,x11
00b7f264	add x1,x10,x11
00b7f268	bl 0x00c2ffd0
00b7f26c	ldrh w25,[x19, #0xa]
00b7f270	ldrh w26,[x21, #0xa]
00b7f274	cmp w25,w26
00b7f278	b.ls 0x00b7f294
00b7f27c	ldr x8,[x19]
00b7f280	sub x9,x25,x26
00b7f284	lsl x2,x9,#0x3
00b7f288	mov w1,wzr
00b7f28c	add x0,x8,w26, UXTW  #0x3
00b7f290	bl 0x00c301c0
00b7f294	ldr x0,[x19]
00b7f298	ldr x1,[x21]
00b7f29c	ldr x2,[x20]
00b7f2a0	mov x3,x22
00b7f2a4	bl 0x00c41f00
00b7f2a8	mov x2,x0
00b7f2ac	cbz x0,0x00b7f2d4
00b7f2b0	ldr x8,[x19]
00b7f2b4	ldrh w9,[x19, #0xa]
00b7f2b8	add x0,x8,x22, LSL #0x3
00b7f2bc	sub x3,x9,x22
00b7f2c0	mov x1,x0
00b7f2c4	bl 0x00c41f10
00b7f2c8	cbz x0,0x00b7f2d4
00b7f2cc	mov w0,#0xfffffff6
00b7f2d0	b 0x00b7f2e0
00b7f2d4	mov w0,wzr
00b7f2d8	mov w8,#0x1
00b7f2dc	strh w8,[x19, #0x8]
00b7f2e0	ldp x29,x30,[sp, #0x50]
00b7f2e4	ldp x20,x19,[sp, #0x40]
00b7f2e8	ldp x22,x21,[sp, #0x30]
00b7f2ec	ldp x24,x23,[sp, #0x20]
00b7f2f0	ldp x26,x25,[sp, #0x10]
00b7f2f4	ldr x27,[sp], #0x60
00b7f2f8	ret
