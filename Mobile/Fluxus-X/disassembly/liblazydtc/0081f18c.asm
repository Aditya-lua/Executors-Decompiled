; FUN_0081f18c @ 0081f18c
0081f18c	sub sp,sp,#0xc0
0081f190	stp x29,x30,[sp, #0x60]
0081f194	stp x28,x27,[sp, #0x70]
0081f198	stp x26,x25,[sp, #0x80]
0081f19c	stp x24,x23,[sp, #0x90]
0081f1a0	stp x22,x21,[sp, #0xa0]
0081f1a4	stp x20,x19,[sp, #0xb0]
0081f1a8	add x29,sp,#0x60
0081f1ac	mrs x23,tpidr_el0
0081f1b0	ldr x8,[x23, #0x28]
0081f1b4	stur x8,[x29, #-0x8]
0081f1b8	ldrb w8,[x0]
0081f1bc	ldp x9,x11,[x0, #0x8]
0081f1c0	lsr x10,x8,#0x1
0081f1c4	tst w8,#0x1
0081f1c8	csinc x19,x11,x0,ne
0081f1cc	csel x9,x10,x9,eq
0081f1d0	cbz x9,0x0081f478
0081f1d4	mov x8,x9
0081f1d8	cbz x8,0x0081f478
0081f1dc	add x10,x19,x8
0081f1e0	sub x8,x8,#0x1
0081f1e4	ldurb w10,[x10, #-0x1]
0081f1e8	cmp w10,#0x2f
0081f1ec	b.ne 0x0081f1d8
0081f1f0	cmn x8,#0x1
0081f1f4	b.eq 0x0081f478
0081f1f8	cmp x9,x8
0081f1fc	csel x20,x9,x8,cc
0081f200	cmn x20,#0x8
0081f204	b.cs 0x0081f4bc
0081f208	cmp x20,#0x17
0081f20c	b.cs 0x0081f228
0081f210	lsl w9,w20,#0x1
0081f214	sub x10,x29,#0x20
0081f218	orr x21,x10,#0x1
0081f21c	sturb w9,[x29, #-0x20]
0081f220	cbnz x8,0x0081f250
0081f224	b 0x0081f260
0081f228	orr x8,x20,#0x7
0081f22c	mov w9,#0x1a
0081f230	cmp x8,#0x17
0081f234	csinc x22,x9,x8,eq
0081f238	mov x0,x22
0081f23c	bl 0x00c2fed0
0081f240	orr x8,x22,#0x1
0081f244	mov x21,x0
0081f248	stp x20,x0,[x29, #-0x18]
0081f24c	stur x8,[x29, #-0x20]
0081f250	mov x0,x21
0081f254	mov x1,x19
0081f258	mov x2,x20
0081f25c	bl 0x00c2ff60
0081f260	strb wzr,[x21, x20]
0081f264	ldurb w8,[x29, #-0x20]
0081f268	ldur x21,[x29, #-0x18]
0081f26c	stp xzr,xzr,[sp, #0x20]
0081f270	str xzr,[sp, #0x30]
0081f274	lsr x9,x8,#0x1
0081f278	tst w8,#0x1
0081f27c	cset w24,eq
0081f280	csel x20,x9,x21,eq
0081f284	cbz x20,0x0081f460
0081f288	ldur x22,[x29, #-0x10]
0081f28c	sub x26,x29,#0x20
0081f290	tst w8,#0x1
0081f294	add x9,sp,#0x20
0081f298	mov w1,#0x2f
0081f29c	mov x2,x20
0081f2a0	csinc x19,x22,x26,ne
0081f2a4	orr x8,x9,#0x1
0081f2a8	mov x0,x19
0081f2ac	str x8,[sp]
0081f2b0	bl 0x00c300a0
0081f2b4	mov w8,#0x1
0081f2b8	cbz x0,0x0081f3ec
0081f2bc	sub x28,x0,x19
0081f2c0	cmn x28,#0x1
0081f2c4	b.eq 0x0081f3ec
0081f2c8	add x8,sp,#0x8
0081f2cc	mov w25,wzr
0081f2d0	orr x26,x26,#0x1
0081f2d4	orr x27,x8,#0x1
0081f2d8	cmp x20,x28
0081f2dc	csel x20,x20,x28,cc
0081f2e0	cmn x20,#0x8
0081f2e4	b.cs 0x0081f4a8
0081f2e8	cmp x20,#0x17
0081f2ec	b.cs 0x0081f308
0081f2f0	lsl w8,w20,#0x1
0081f2f4	cmp x0,x19
0081f2f8	mov x21,x27
0081f2fc	strb w8,[sp, #0x8]
0081f300	b.ne 0x0081f330
0081f304	b 0x0081f340
0081f308	orr x8,x20,#0x7
0081f30c	mov w9,#0x1a
0081f310	cmp x8,#0x17
0081f314	csinc x22,x9,x8,eq
0081f318	mov x0,x22
0081f31c	bl 0x00c2fed0
0081f320	orr x8,x22,#0x1
0081f324	mov x21,x0
0081f328	stp x20,x0,[sp, #0x10]
0081f32c	str x8,[sp, #0x8]
0081f330	mov x0,x21
0081f334	mov x1,x19
0081f338	mov x2,x20
0081f33c	bl 0x00c2ff60
0081f340	ldrb w8,[sp, #0x20]
0081f344	strb wzr,[x21, x20]
0081f348	tbz w8,#0x0,0x0081f35c
0081f34c	ldr x8,[sp, #0x20]
0081f350	ldr x0,[sp, #0x30]
0081f354	and x1,x8,#-0x2
0081f358	bl 0x00c2fe80
0081f35c	ldur q0,[sp, #0x8]
0081f360	ldr x10,[sp, #0x18]
0081f364	str q0,[sp, #0x20]
0081f368	ldrb w25,[sp, #0x20]
0081f36c	ldr x8,[sp, #0x28]
0081f370	str x10,[sp, #0x30]
0081f374	lsr x9,x25,#0x1
0081f378	tst w25,#0x1
0081f37c	csel x8,x9,x8,eq
0081f380	cbz x8,0x0081f398
0081f384	ldr x8,[sp, #0x30]
0081f388	ldr x9,[sp]
0081f38c	mov w1,#0x1ff
0081f390	csel x0,x9,x8,eq
0081f394	bl 0x00c303f0
0081f398	ldurb w8,[x29, #-0x20]
0081f39c	ldur x21,[x29, #-0x18]
0081f3a0	add x9,x28,#0x1
0081f3a4	lsr x10,x8,#0x1
0081f3a8	tst w8,#0x1
0081f3ac	cset w24,eq
0081f3b0	csel x20,x10,x21,eq
0081f3b4	subs x2,x20,x9
0081f3b8	b.ls 0x0081f44c
0081f3bc	ldur x22,[x29, #-0x10]
0081f3c0	tst w8,#0x1
0081f3c4	mov w1,#0x2f
0081f3c8	csel x19,x26,x22,eq
0081f3cc	add x0,x19,x9
0081f3d0	bl 0x00c300a0
0081f3d4	cbz x0,0x0081f3e4
0081f3d8	sub x28,x0,x19
0081f3dc	cmn x28,#0x1
0081f3e0	b.ne 0x0081f2d8
0081f3e4	tst w25,#0x1
0081f3e8	cset w8,eq
0081f3ec	cbz w8,0x0081f408
0081f3f0	cbz w24,0x0081f41c
0081f3f4	ldur q0,[x29, #-0x20]
0081f3f8	ldur x8,[x29, #-0x10]
0081f3fc	str q0,[sp, #0x20]
0081f400	str x8,[sp, #0x30]
0081f404	b 0x0081f42c
0081f408	add x0,sp,#0x20
0081f40c	mov x1,x19
0081f410	mov x2,x20
0081f414	bl 0x007fe004
0081f418	b 0x0081f42c
0081f41c	add x0,sp,#0x20
0081f420	mov x1,x22
0081f424	mov x2,x21
0081f428	bl 0x007fdf5c
0081f42c	ldrb w8,[sp, #0x20]
0081f430	ldr x9,[sp, #0x30]
0081f434	mov w1,#0x1ff
0081f438	tst w8,#0x1
0081f43c	ldr x8,[sp]
0081f440	csel x0,x8,x9,eq
0081f444	bl 0x00c303f0
0081f448	ldrb w25,[sp, #0x20]
0081f44c	tbz w25,#0x0,0x0081f460
0081f450	ldr x8,[sp, #0x20]
0081f454	ldr x0,[sp, #0x30]
0081f458	and x1,x8,#-0x2
0081f45c	bl 0x00c2fe80
0081f460	ldurb w8,[x29, #-0x20]
0081f464	tbz w8,#0x0,0x0081f478
0081f468	ldur x8,[x29, #-0x20]
0081f46c	ldur x0,[x29, #-0x10]
0081f470	and x1,x8,#-0x2
0081f474	bl 0x00c2fe80
0081f478	ldr x8,[x23, #0x28]
0081f47c	ldur x9,[x29, #-0x8]
0081f480	cmp x8,x9
0081f484	b.ne 0x0081f524
0081f488	ldp x20,x19,[sp, #0xb0]
0081f48c	ldp x22,x21,[sp, #0xa0]
0081f490	ldp x24,x23,[sp, #0x90]
0081f494	ldp x26,x25,[sp, #0x80]
0081f498	ldp x28,x27,[sp, #0x70]
0081f49c	ldp x29,x30,[sp, #0x60]
0081f4a0	add sp,sp,#0xc0
0081f4a4	ret
0081f4a8	ldr x8,[x23, #0x28]
0081f4ac	ldur x9,[x29, #-0x8]
0081f4b0	cmp x8,x9
0081f4b4	b.ne 0x0081f524
0081f4b8	bl 0x007fe124
0081f4bc	ldr x8,[x23, #0x28]
0081f4c0	ldur x9,[x29, #-0x8]
0081f4c4	cmp x8,x9
0081f4c8	b.ne 0x0081f524
0081f4cc	bl 0x007fe124
0081f524	bl 0x00c2fec0
