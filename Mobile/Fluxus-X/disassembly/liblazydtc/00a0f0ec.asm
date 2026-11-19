; FUN_00a0f0ec @ 00a0f0ec
00a0f0ec	stp x28,x27,[sp, #-0x60]!
00a0f0f0	stp x26,x25,[sp, #0x10]
00a0f0f4	stp x24,x23,[sp, #0x20]
00a0f0f8	stp x22,x21,[sp, #0x30]
00a0f0fc	stp x20,x19,[sp, #0x40]
00a0f100	stp x29,x30,[sp, #0x50]
00a0f104	add x29,sp,#0x50
00a0f108	mov x19,x1
00a0f10c	mov x20,x0
00a0f110	bl 0x00c2ff50
00a0f114	adrp x21,0x2a9000
00a0f118	adrp x22,0x2d7000
00a0f11c	adrp x27,0x2b2000
00a0f120	add x26,x0,#0x2
00a0f124	add x21,x21,#0xfe2
00a0f128	add x22,x22,#0xc86
00a0f12c	add x27,x27,#0x90
00a0f130	mov x0,x19
00a0f134	mov x1,x20
00a0f138	bl 0x00c34da0
00a0f13c	cbz x0,0x00a0f278
00a0f140	mov x28,x0
00a0f144	bl 0x00c2ff50
00a0f148	mov x24,x0
00a0f14c	cmp x0,#0x6
00a0f150	b.cc 0x00a0f16c
00a0f154	add x8,x28,x24
00a0f158	sub x0,x8,#0x5
00a0f15c	mov x1,x21
00a0f160	bl 0x00c35ee0
00a0f164	cbnz w0,0x00a0f174
00a0f168	b 0x00a0f194
00a0f16c	cmp x24,#0x5
00a0f170	b.ne 0x00a0f224
00a0f174	add x8,x28,x24
00a0f178	sub x0,x8,#0x4
00a0f17c	mov x1,x27
00a0f180	bl 0x00c35ee0
00a0f184	cbz w0,0x00a0f194
00a0f188	mov w8,wzr
00a0f18c	cbz w8,0x00a0f130
00a0f190	b 0x00a0f270
00a0f194	add x24,x26,x24
00a0f198	mov w2,#0x364
00a0f19c	mov x0,x24
00a0f1a0	mov x1,x22
00a0f1a4	bl 0x00c34250
00a0f1a8	cbz x0,0x00a0f230
00a0f1ac	ldrb w8,[x0]
00a0f1b0	mov x25,x0
00a0f1b4	cbnz w8,0x00a0f1dc
00a0f1b8	mov x0,x25
00a0f1bc	mov x1,x20
00a0f1c0	mov x2,x24
00a0f1c4	bl 0x00c387f0
00a0f1c8	adrp x1,0x2a9000
00a0f1cc	mov x0,x25
00a0f1d0	add x1,x1,#0x1de
00a0f1d4	mov x2,x24
00a0f1d8	bl 0x00c395d0
00a0f1dc	mov x0,x25
00a0f1e0	mov x1,x28
00a0f1e4	mov x2,x24
00a0f1e8	bl 0x00c395d0
00a0f1ec	adrp x1,0x2c8000
00a0f1f0	mov x0,x25
00a0f1f4	add x1,x1,#0xcc8
00a0f1f8	bl 0x00c387e0
00a0f1fc	mov x24,x0
00a0f200	mov w2,#0x37c
00a0f204	mov x0,x25
00a0f208	mov x1,x22
00a0f20c	bl 0x00c32310
00a0f210	cbz x24,0x00a0f268
00a0f214	mov w8,#0x1
00a0f218	mov x23,x24
00a0f21c	cbz w8,0x00a0f130
00a0f220	b 0x00a0f270
00a0f224	mov w8,wzr
00a0f228	cbz w8,0x00a0f130
00a0f22c	b 0x00a0f270
00a0f230	bl 0x00c342a0
00a0f234	adrp x2,0x2cd000
00a0f238	mov w1,#0x366
00a0f23c	mov x0,x22
00a0f240	add x2,x2,#0x8c4
00a0f244	bl 0x00c342b0
00a0f248	mov w1,#0x100
00a0f24c	orr w0,wzr,#0xe
00a0f250	movk w1,#0xc, LSL #16
00a0f254	mov x2,xzr
00a0f258	bl 0x00c342c0
00a0f25c	orr w8,wzr,#0x3
00a0f260	cbz w8,0x00a0f130
00a0f264	b 0x00a0f270
00a0f268	mov w8,wzr
00a0f26c	cbz w8,0x00a0f130
00a0f270	cmp w8,#0x3
00a0f274	b.ne 0x00a0f288
00a0f278	mov x0,x19
00a0f27c	bl 0x00c34d90
00a0f280	mov x23,xzr
00a0f284	str xzr,[x19]
00a0f288	mov x0,x23
00a0f28c	ldp x29,x30,[sp, #0x50]
00a0f290	ldp x20,x19,[sp, #0x40]
00a0f294	ldp x22,x21,[sp, #0x30]
00a0f298	ldp x24,x23,[sp, #0x20]
00a0f29c	ldp x26,x25,[sp, #0x10]
00a0f2a0	ldp x28,x27,[sp], #0x60
00a0f2a4	ret
