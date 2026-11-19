; FUN_00b0f224 @ 00b0f224
00b0f224	stp x22,x21,[sp, #-0x30]!
00b0f228	mov w21,w2
00b0f22c	stp x20,x19,[sp, #0x10]
00b0f230	mov x19,x1
00b0f234	mov w2,#0xffffffff
00b0f238	mov w1,w21
00b0f23c	stp x29,x30,[sp, #0x20]
00b0f240	add x29,sp,#0x20
00b0f244	mov x20,x0
00b0f248	bl 0x00c40c20
00b0f24c	tbnz w0,#0x1f,0x00b0f288
00b0f250	mov w22,w0
00b0f254	mov x0,x20
00b0f258	mov w1,w21
00b0f25c	mov w2,w22
00b0f260	bl 0x00c40c20
00b0f264	cmn w0,#0x1
00b0f268	mov w0,wzr
00b0f26c	b.ne 0x00b0f314
00b0f270	mov x0,x20
00b0f274	mov w1,w22
00b0f278	bl 0x00c40c10
00b0f27c	bl 0x00c32b60
00b0f280	mov x20,x0
00b0f284	b 0x00b0f28c
00b0f288	mov x20,xzr
00b0f28c	mov w2,#0xffffffff
00b0f290	mov x0,x19
00b0f294	mov w1,w21
00b0f298	bl 0x00c40c20
00b0f29c	tbnz w0,#0x1f,0x00b0f2fc
00b0f2a0	mov w22,w0
00b0f2a4	mov x0,x19
00b0f2a8	mov w1,w21
00b0f2ac	mov w2,w22
00b0f2b0	bl 0x00c40c20
00b0f2b4	cmn w0,#0x1
00b0f2b8	mov w0,wzr
00b0f2bc	b.ne 0x00b0f314
00b0f2c0	mov x0,x19
00b0f2c4	mov w1,w22
00b0f2c8	bl 0x00c40c10
00b0f2cc	bl 0x00c32b60
00b0f2d0	mov x1,x0
00b0f2d4	orr x8,x20,x1
00b0f2d8	cbz x8,0x00b0f308
00b0f2dc	cbz x20,0x00b0f310
00b0f2e0	mov w0,wzr
00b0f2e4	cbz x1,0x00b0f314
00b0f2e8	mov x0,x20
00b0f2ec	bl 0x00c37780
00b0f2f0	cmp w0,#0x0
00b0f2f4	cset w0,eq
00b0f2f8	b 0x00b0f314
00b0f2fc	mov x1,xzr
00b0f300	orr x8,x20,x1
00b0f304	cbnz x8,0x00b0f2dc
00b0f308	mov w0,#0x1
00b0f30c	b 0x00b0f314
00b0f310	mov w0,wzr
00b0f314	ldp x29,x30,[sp, #0x20]
00b0f318	ldp x20,x19,[sp, #0x10]
00b0f31c	ldp x22,x21,[sp], #0x30
00b0f320	ret
