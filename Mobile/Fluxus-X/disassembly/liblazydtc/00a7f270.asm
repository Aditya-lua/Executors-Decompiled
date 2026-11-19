; ossl_ffc_params_full_validate @ 00a7f270
00a7f270	str x23,[sp, #-0x40]!
00a7f274	stp x22,x21,[sp, #0x10]
00a7f278	stp x20,x19,[sp, #0x20]
00a7f27c	stp x29,x30,[sp, #0x30]
00a7f280	add x29,sp,#0x30
00a7f284	str wzr,[sp, #0xc]
00a7f288	cbz x1,0x00a7f388
00a7f28c	ldr x8,[x1, #0x20]
00a7f290	cmp x3,#0x0
00a7f294	add x9,sp,#0xc
00a7f298	mov w21,w2
00a7f29c	mov x19,x1
00a7f2a0	mov x20,x0
00a7f2a4	csel x22,x9,x3,eq
00a7f2a8	cbz x8,0x00a7f304
00a7f2ac	ldrb w8,[x19, #0x40]
00a7f2b0	ldr x0,[x19]
00a7f2b4	tbnz w8,#0x2,0x00a7f3a4
00a7f2b8	cbz x0,0x00a7f388
00a7f2bc	ldr x8,[x19, #0x8]
00a7f2c0	cbz x8,0x00a7f388
00a7f2c4	bl 0x00c322f0
00a7f2c8	ldr x8,[x19, #0x8]
00a7f2cc	sxtw x23,w0
00a7f2d0	mov x0,x8
00a7f2d4	bl 0x00c322f0
00a7f2d8	sxtw x5,w0
00a7f2dc	mov x0,x20
00a7f2e0	mov x1,x19
00a7f2e4	mov w2,wzr
00a7f2e8	mov w3,w21
00a7f2ec	mov x4,x23
00a7f2f0	mov x6,x22
00a7f2f4	mov x7,xzr
00a7f2f8	bl 0x00c3dd10
00a7f2fc	mov w21,w0
00a7f300	b 0x00a7f38c
00a7f304	mov x0,x20
00a7f308	mov x1,x19
00a7f30c	mov w2,w21
00a7f310	mov x3,x22
00a7f314	bl 0x00a7f0ec
00a7f318	mov w21,w0
00a7f31c	cbz w0,0x00a7f38c
00a7f320	mov x0,x20
00a7f324	bl 0x00c38a60
00a7f328	cbz x0,0x00a7f388
00a7f32c	mov x20,x0
00a7f330	ldr x0,[x19, #0x8]
00a7f334	mov x1,x20
00a7f338	mov x2,xzr
00a7f33c	bl 0x00c39110
00a7f340	cmp w0,#0x1
00a7f344	b.ne 0x00a7f400
00a7f348	ldr x0,[x19]
00a7f34c	mov x1,x20
00a7f350	mov x2,xzr
00a7f354	bl 0x00c39110
00a7f358	cmp w0,#0x1
00a7f35c	b.eq 0x00a7f430
00a7f360	bl 0x00c342a0
00a7f364	adrp x0,0x2d1000
00a7f368	adrp x2,0x2c9000
00a7f36c	add x0,x0,#0xb13
00a7f370	add x2,x2,#0xaa4
00a7f374	mov w1,#0xb2
00a7f378	bl 0x00c342b0
00a7f37c	mov w0,#0xa
00a7f380	mov w1,#0x73
00a7f384	b 0x00a7f424
00a7f388	mov w21,wzr
00a7f38c	mov w0,w21
00a7f390	ldp x29,x30,[sp, #0x30]
00a7f394	ldp x20,x19,[sp, #0x20]
00a7f398	ldp x22,x21,[sp, #0x10]
00a7f39c	ldr x23,[sp], #0x40
00a7f3a0	ret
00a7f3a4	cbz x0,0x00a7f3f0
00a7f3a8	ldr x8,[x19, #0x8]
00a7f3ac	cbz x8,0x00a7f3f0
00a7f3b0	bl 0x00c322f0
00a7f3b4	ldr x8,[x19, #0x8]
00a7f3b8	sxtw x23,w0
00a7f3bc	mov x0,x8
00a7f3c0	bl 0x00c322f0
00a7f3c4	sxtw x5,w0
00a7f3c8	mov x0,x20
00a7f3cc	mov x1,x19
00a7f3d0	mov w2,wzr
00a7f3d4	mov w3,w21
00a7f3d8	mov x4,x23
00a7f3dc	mov x6,x22
00a7f3e0	mov x7,xzr
00a7f3e4	bl 0x00c3dd00
00a7f3e8	mov w21,w0
00a7f3ec	b 0x00a7f38c
00a7f3f0	mov w8,#0x800
00a7f3f4	mov w21,wzr
00a7f3f8	str w8,[x22]
00a7f3fc	b 0x00a7f38c
00a7f400	bl 0x00c342a0
00a7f404	adrp x0,0x2d1000
00a7f408	adrp x2,0x2c9000
00a7f40c	add x0,x0,#0xb13
00a7f410	add x2,x2,#0xaa4
00a7f414	mov w1,#0xac
00a7f418	bl 0x00c342b0
00a7f41c	mov w0,#0xa
00a7f420	mov w1,#0x71
00a7f424	mov x2,xzr
00a7f428	bl 0x00c342c0
00a7f42c	mov w21,wzr
00a7f430	mov x0,x20
00a7f434	bl 0x00c38a30
00a7f438	b 0x00a7f38c
