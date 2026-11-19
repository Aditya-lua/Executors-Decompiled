; curl_share_setopt @ 0093f178
0093f178	sub sp,sp,#0x110
0093f17c	stp x28,x21,[sp, #0xe0]
0093f180	stp x20,x19,[sp, #0xf0]
0093f184	stp x29,x30,[sp, #0x100]
0093f188	add x29,sp,#0x100
0093f18c	stp q6,q7,[sp, #0x60]
0093f190	stp q4,q5,[sp, #0x40]
0093f194	stp q2,q3,[sp, #0x20]
0093f198	stp q0,q1,[sp]
0093f19c	stp x6,x7,[x29, #-0x58]
0093f1a0	stp x4,x5,[x29, #-0x68]
0093f1a4	stp x2,x3,[x29, #-0x78]
0093f1a8	mrs x20,tpidr_el0
0093f1ac	ldr x8,[x20, #0x28]
0093f1b0	mov x19,x0
0093f1b4	stur x8,[x29, #-0x28]
0093f1b8	cbz x0,0x0093f1e0
0093f1bc	ldr w8,[x19]
0093f1c0	mov w9,#0x7a1e
0093f1c4	movk w9,#0x7e11, LSL #16
0093f1c8	cmp w8,w9
0093f1cc	b.ne 0x0093f1e0
0093f1d0	ldr w8,[x19, #0x8]
0093f1d4	cbz w8,0x0093f208
0093f1d8	mov w0,#0x2
0093f1dc	b 0x0093f1e4
0093f1e0	orr w0,wzr,#0x3
0093f1e4	ldr x8,[x20, #0x28]
0093f1e8	ldur x9,[x29, #-0x28]
0093f1ec	cmp x8,x9
0093f1f0	b.ne 0x0093f4e0
0093f1f4	ldp x29,x30,[sp, #0x100]
0093f1f8	ldp x20,x19,[sp, #0xf0]
0093f1fc	ldp x28,x21,[sp, #0xe0]
0093f200	add sp,sp,#0x110
0093f204	ret
0093f208	orr x9,xzr,#-0x7f00000080
0093f20c	movk x9,#0xffd0
0093f210	add x10,x29,#0x10
0093f214	mov x11,sp
0093f218	sub x12,x29,#0x78
0093f21c	sub w8,w1,#0x1
0093f220	stur x9,[x29, #-0x30]
0093f224	stur x10,[x29, #-0x48]
0093f228	add x9,x11,#0x80
0093f22c	add x10,x12,#0x30
0093f230	cmp w8,#0x4
0093f234	stp x10,x9,[x29, #-0x40]
0093f238	b.hi 0x0093f3a4
0093f23c	adrp x9,0x748000
0093f240	add x9,x9,#0x2d4
0093f244	ldrsw x8,[x9, x8, LSL #0x2]
0093f248	add x8,x8,x9
0093f24c	br x8
0093f250	ldursw x8,[x29, #-0x30]
0093f254	tbz w8,#0x1f,0x0093f268
0093f258	add w9,w8,#0x8
0093f25c	cmp w9,#0x0
0093f260	stur w9,[x29, #-0x30]
0093f264	b.le 0x0093f4b4
0093f268	ldur x8,[x29, #-0x48]
0093f26c	add x9,x8,#0x8
0093f270	stur x9,[x29, #-0x48]
0093f274	ldr w21,[x8]
0093f278	sub w8,w21,#0x2
0093f27c	cmp w8,#0x5
0093f280	b.hi 0x0093f3a4
0093f284	adrp x9,0x748000
0093f288	add x9,x9,#0x300
0093f28c	ldrsw x8,[x9, x8, LSL #0x2]
0093f290	mov w0,#0x5
0093f294	add x8,x8,x9
0093f298	br x8
0093f29c	ldr x8,[x19, #0xe8]
0093f2a0	cbnz x8,0x0093f480
0093f2a4	mov w3,#0x1
0093f2a8	mov x0,xzr
0093f2ac	mov x1,xzr
0093f2b0	mov x2,xzr
0093f2b4	bl 0x00912ca4
0093f2b8	str x0,[x19, #0xe8]
0093f2bc	cbnz x0,0x0093f480
0093f2c0	b 0x0093f464
0093f2c4	ldursw x8,[x29, #-0x30]
0093f2c8	tbz w8,#0x1f,0x0093f2dc
0093f2cc	add w9,w8,#0x8
0093f2d0	cmp w9,#0x0
0093f2d4	stur w9,[x29, #-0x30]
0093f2d8	b.le 0x0093f49c
0093f2dc	ldur x8,[x29, #-0x48]
0093f2e0	add x9,x8,#0x8
0093f2e4	stur x9,[x29, #-0x48]
0093f2e8	ldr x8,[x8]
0093f2ec	mov w0,wzr
0093f2f0	str x8,[x19, #0x10]
0093f2f4	b 0x0093f1e4
0093f2f8	ldursw x8,[x29, #-0x30]
0093f2fc	tbz w8,#0x1f,0x0093f310
0093f300	add w9,w8,#0x8
0093f304	cmp w9,#0x0
0093f308	stur w9,[x29, #-0x30]
0093f30c	b.le 0x0093f4a8
0093f310	ldur x8,[x29, #-0x48]
0093f314	add x9,x8,#0x8
0093f318	stur x9,[x29, #-0x48]
0093f31c	ldr x8,[x8]
0093f320	mov w0,wzr
0093f324	str x8,[x19, #0x20]
0093f328	b 0x0093f1e4
0093f32c	ldursw x8,[x29, #-0x30]
0093f330	tbz w8,#0x1f,0x0093f344
0093f334	add w9,w8,#0x8
0093f338	cmp w9,#0x0
0093f33c	stur w9,[x29, #-0x30]
0093f340	b.le 0x0093f4c0
0093f344	ldur x8,[x29, #-0x48]
0093f348	add x9,x8,#0x8
0093f34c	stur x9,[x29, #-0x48]
0093f350	ldr w8,[x8]
0093f354	ldr w9,[x19, #0x4]
0093f358	mov w10,#0x1
0093f35c	lsl w10,w10,w8
0093f360	sub w8,w8,#0x2
0093f364	bic w9,w9,w10
0093f368	cmp w8,#0x5
0093f36c	str w9,[x19, #0x4]
0093f370	b.hi 0x0093f3a4
0093f374	adrp x9,0x748000
0093f378	add x9,x9,#0x2e8
0093f37c	ldrsw x8,[x9, x8, LSL #0x2]
0093f380	mov w0,wzr
0093f384	add x8,x8,x9
0093f388	br x8
0093f38c	ldr x0,[x19, #0xe8]
0093f390	cbz x0,0x0093f1e4
0093f394	bl 0x00914d68
0093f398	mov w0,wzr
0093f39c	str xzr,[x19, #0xe8]
0093f3a0	b 0x0093f1e4
0093f3a4	mov w0,#0x1
0093f3a8	b 0x0093f1e4
0093f3ac	ldursw x8,[x29, #-0x30]
0093f3b0	tbz w8,#0x1f,0x0093f3c4
0093f3b4	add w9,w8,#0x8
0093f3b8	cmp w9,#0x0
0093f3bc	stur w9,[x29, #-0x30]
0093f3c0	b.le 0x0093f4cc
0093f3c4	ldur x8,[x29, #-0x48]
0093f3c8	add x9,x8,#0x8
0093f3cc	stur x9,[x29, #-0x48]
0093f3d0	ldr x8,[x8]
0093f3d4	mov w0,wzr
0093f3d8	str x8,[x19, #0x18]
0093f3dc	b 0x0093f1e4
0093f3e0	adrp x8,0xcc4000
0093f3e4	add x8,x8,#0x678
0093f3e8	ldr x0,[x19, #0xf8]
0093f3ec	ldr x8,[x8]
0093f3f0	blr x8
0093f3f4	mov w0,wzr
0093f3f8	str xzr,[x19, #0xf8]
0093f3fc	b 0x0093f1e4
0093f400	ldr x8,[x19, #0xf0]!
0093f404	cbz x8,0x0093f4d8
0093f408	mov x0,x19
0093f40c	bl 0x0091839c
0093f410	mov w0,wzr
0093f414	b 0x0093f1e4
0093f418	ldr x8,[x19, #0xf8]
0093f41c	cbnz x8,0x0093f480
0093f420	mov w8,#0x8
0093f424	str x8,[x19, #0x100]
0093f428	adrp x8,0xcc4000
0093f42c	add x8,x8,#0x690
0093f430	mov w0,#0x8
0093f434	mov w1,#0xc8
0093f438	ldr x8,[x8]
0093f43c	blr x8
0093f440	str x0,[x19, #0xf8]
0093f444	str xzr,[x19, #0x108]
0093f448	cbnz x0,0x0093f480
0093f44c	b 0x0093f464
0093f450	add x0,x19,#0x28
0093f454	mov w2,#0x67
0093f458	mov x1,xzr
0093f45c	bl 0x0090fae0
0093f460	cbz w0,0x0093f480
0093f464	mov w0,#0x4
0093f468	b 0x0093f1e4
0093f46c	ldr x8,[x19, #0xf0]
0093f470	cbnz x8,0x0093f480
0093f474	bl 0x00918354
0093f478	str x0,[x19, #0xf0]
0093f47c	cbz x0,0x0093f464
0093f480	ldr w8,[x19, #0x4]
0093f484	mov w9,#0x1
0093f488	lsl w9,w9,w21
0093f48c	mov w0,wzr
0093f490	orr w8,w8,w9
0093f494	str w8,[x19, #0x4]
0093f498	b 0x0093f1e4
0093f49c	ldur x9,[x29, #-0x40]
0093f4a0	add x8,x9,x8
0093f4a4	b 0x0093f2e8
0093f4a8	ldur x9,[x29, #-0x40]
0093f4ac	add x8,x9,x8
0093f4b0	b 0x0093f31c
0093f4b4	ldur x9,[x29, #-0x40]
0093f4b8	add x8,x9,x8
0093f4bc	b 0x0093f274
0093f4c0	ldur x9,[x29, #-0x40]
0093f4c4	add x8,x9,x8
0093f4c8	b 0x0093f350
0093f4cc	ldur x9,[x29, #-0x40]
0093f4d0	add x8,x9,x8
0093f4d4	b 0x0093f3d0
0093f4d8	mov w0,wzr
0093f4dc	b 0x0093f1e4
0093f4e0	bl 0x00c2fec0
