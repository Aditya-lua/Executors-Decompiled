; EVP_PKEY_get_bn_param @ 00a6f1cc
00a6f1cc	stp x28,x23,[sp, #-0x40]!
00a6f1d0	stp x22,x21,[sp, #0x10]
00a6f1d4	stp x20,x19,[sp, #0x20]
00a6f1d8	stp x29,x30,[sp, #0x30]
00a6f1dc	add x29,sp,#0x30
00a6f1e0	sub sp,sp,#0x880
00a6f1e4	mov w22,wzr
00a6f1e8	cbz x1,0x00a6f344
00a6f1ec	mov x19,x2
00a6f1f0	cbz x2,0x00a6f344
00a6f1f4	mov x20,x1
00a6f1f8	mov x23,x0
00a6f1fc	add x0,sp,#0x30
00a6f200	mov w2,#0x800
00a6f204	mov w1,wzr
00a6f208	sub x21,x29,#0x80
00a6f20c	bl 0x00c301c0
00a6f210	add x8,sp,#0x8
00a6f214	add x1,sp,#0x30
00a6f218	mov w2,#0x800
00a6f21c	mov x0,x20
00a6f220	bl 0x00c3d990
00a6f224	ldr x8,[sp, #0x28]
00a6f228	ldur q0,[sp, #0x8]
00a6f22c	ldur q1,[sp, #0x18]
00a6f230	stur x8,[x29, #-0x60]
00a6f234	add x8,sp,#0x8
00a6f238	stp q0,q1,[x21]
00a6f23c	bl 0x00c34c40
00a6f240	ldr x8,[sp, #0x28]
00a6f244	ldur q0,[sp, #0x18]
00a6f248	ldur q1,[sp, #0x8]
00a6f24c	sub x1,x29,#0x80
00a6f250	mov x0,x23
00a6f254	stur x8,[x29, #-0x38]
00a6f258	stur q0,[x21, #0x38]
00a6f25c	stur q1,[x21, #0x28]
00a6f260	bl 0x00a6f360
00a6f264	cbz w0,0x00a6f290
00a6f268	mov x21,xzr
00a6f26c	mov x20,xzr
00a6f270	sub x0,x29,#0x80
00a6f274	bl 0x00c3d030
00a6f278	cbz w0,0x00a6f304
00a6f27c	sub x0,x29,#0x80
00a6f280	mov x1,x19
00a6f284	bl 0x00c39d50
00a6f288	mov w22,w0
00a6f28c	b 0x00a6f308
00a6f290	sub x0,x29,#0x80
00a6f294	bl 0x00c3d030
00a6f298	cbz w0,0x00a6f2fc
00a6f29c	ldur x20,[x29, #-0x60]
00a6f2a0	cbz x20,0x00a6f2fc
00a6f2a4	adrp x1,0x2c1000
00a6f2a8	add x1,x1,#0xcf9
00a6f2ac	mov w2,#0x882
00a6f2b0	mov x0,x20
00a6f2b4	bl 0x00c34250
00a6f2b8	cbz x0,0x00a6f2fc
00a6f2bc	mov x21,x0
00a6f2c0	stp x0,x20,[x29, #-0x70]
00a6f2c4	sub x1,x29,#0x80
00a6f2c8	mov x0,x23
00a6f2cc	bl 0x00a6f360
00a6f2d0	cbnz w0,0x00a6f270
00a6f2d4	sub x0,x29,#0x80
00a6f2d8	bl 0x00c3d030
00a6f2dc	mov w22,wzr
00a6f2e0	cbnz w0,0x00a6f318
00a6f2e4	adrp x1,0x2c1000
00a6f2e8	add x1,x1,#0xcf9
00a6f2ec	mov w2,#0x894
00a6f2f0	mov x0,x21
00a6f2f4	bl 0x00c32310
00a6f2f8	b 0x00a6f344
00a6f2fc	mov w22,wzr
00a6f300	b 0x00a6f344
00a6f304	mov w22,wzr
00a6f308	sub x0,x29,#0x80
00a6f30c	bl 0x00c3d030
00a6f310	cbz x21,0x00a6f334
00a6f314	cbz w0,0x00a6f2e4
00a6f318	adrp x2,0x2c1000
00a6f31c	add x2,x2,#0xcf9
00a6f320	mov w3,#0x892
00a6f324	mov x0,x21
00a6f328	mov x1,x20
00a6f32c	bl 0x00c345e0
00a6f330	b 0x00a6f344
00a6f334	cbz w0,0x00a6f344
00a6f338	ldur x1,[x29, #-0x68]
00a6f33c	add x0,sp,#0x30
00a6f340	bl 0x00c34750
00a6f344	mov w0,w22
00a6f348	add sp,sp,#0x880
00a6f34c	ldp x29,x30,[sp, #0x30]
00a6f350	ldp x20,x19,[sp, #0x20]
00a6f354	ldp x22,x21,[sp, #0x10]
00a6f358	ldp x28,x23,[sp], #0x40
00a6f35c	ret
