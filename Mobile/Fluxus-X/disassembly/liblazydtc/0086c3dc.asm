; FUN_0086c3dc @ 0086c3dc
0086c3dc	sub sp,sp,#0xa0
0086c3e0	stp x29,x30,[sp, #0x40]
0086c3e4	stp x28,x27,[sp, #0x50]
0086c3e8	stp x26,x25,[sp, #0x60]
0086c3ec	stp x24,x23,[sp, #0x70]
0086c3f0	stp x22,x21,[sp, #0x80]
0086c3f4	stp x20,x19,[sp, #0x90]
0086c3f8	add x29,sp,#0x40
0086c3fc	mrs x24,tpidr_el0
0086c400	mov x22,x2
0086c404	mov x23,x1
0086c408	ldr x8,[x24, #0x28]
0086c40c	mov x19,x0
0086c410	stur x8,[x29, #-0x8]
0086c414	cbz x1,0x0086c428
0086c418	ldur x8,[x19, #0x94]
0086c41c	add x20,sp,#0x20
0086c420	str x8,[x23]
0086c424	b 0x0086c42c
0086c428	mov x20,xzr
0086c42c	mov x27,x19
0086c430	ldr w26,[x19, #0x90]
0086c434	add x0,x19,#0x70
0086c438	ldr x25,[x27, #0x94]!
0086c43c	bl 0x00853424
0086c440	ldr x8,[x19, #0x458]
0086c444	ldr x9,[x19, #0x450]
0086c448	add x10,x23,#0x8
0086c44c	cmp x23,#0x0
0086c450	str xzr,[sp, #0x30]
0086c454	sub x8,x8,x9
0086c458	add x9,x19,#0x450
0086c45c	csel x1,xzr,x10,eq
0086c460	asr x8,x8,#0x3
0086c464	stp x9,x8,[sp, #0x20]
0086c468	add x9,x23,#0x20
0086c46c	csel x3,xzr,x9,eq
0086c470	mov x0,x19
0086c474	mov x2,x20
0086c478	bl 0x0086ab5c
0086c47c	mov x21,x0
0086c480	mov x28,x1
0086c484	cbz x23,0x0086c518
0086c488	str x28,[sp, #0x8]
0086c48c	ldr x28,[sp, #0x30]
0086c490	cbz x28,0x0086c4f8
0086c494	str x21,[sp]
0086c498	ldp x8,x21,[sp, #0x20]
0086c49c	ldr x0,[x19, #0xe8]
0086c4a0	lsl x1,x28,#0x3
0086c4a4	ldr x20,[x8]
0086c4a8	bl 0x0084e938
0086c4ac	cmp x28,#0x8
0086c4b0	b.cc 0x0086c4c8
0086c4b4	lsl x8,x21,#0x3
0086c4b8	add x10,x8,x20
0086c4bc	sub x8,x0,x10
0086c4c0	cmp x8,#0x20
0086c4c4	b.cs 0x0086c5d8
0086c4c8	mov x8,xzr
0086c4cc	lsl x10,x8,#0x3
0086c4d0	sub x8,x28,x8
0086c4d4	add x9,x10,x21, LSL #0x3
0086c4d8	add x10,x0,x10
0086c4dc	add x9,x20,x9
0086c4e0	ldr x11,[x9], #0x8
0086c4e4	subs x8,x8,#0x1
0086c4e8	str x11,[x10], #0x8
0086c4ec	b.ne 0x0086c4e0
0086c4f0	ldr x21,[sp]
0086c4f4	b 0x0086c4fc
0086c4f8	mov x0,xzr
0086c4fc	ldr w8,[x19, #0x90]
0086c500	stp x0,x28,[x23, #0x10]
0086c504	ldr x28,[sp, #0x8]
0086c508	cmp w8,#0x3e
0086c50c	b.ne 0x0086c518
0086c510	ldr x8,[x27]
0086c514	str x8,[x23, #0x28]
0086c518	cbz x22,0x0086c524
0086c51c	ldr q0,[x27]
0086c520	str q0,[x22]
0086c524	ldr w8,[x19, #0x90]
0086c528	str w26,[sp, #0x14]
0086c52c	stur x25,[sp, #0x18]
0086c530	cmp w8,#0x3e
0086c534	b.ne 0x0086c544
0086c538	mov x0,x19
0086c53c	bl 0x00858f2c
0086c540	b 0x0086c568
0086c544	add x2,sp,#0x14
0086c548	mov x0,x19
0086c54c	mov w1,#0x3e
0086c550	mov x3,xzr
0086c554	bl 0x0086b5f8
0086c558	mov x0,x19
0086c55c	mov w1,#0x3e
0086c560	mov w3,wzr
0086c564	bl 0x0086e434
0086c568	ldp x20,x9,[sp, #0x20]
0086c56c	ldp x10,x8,[x20]
0086c570	add x19,x10,x9, LSL #0x3
0086c574	cmp x19,x8
0086c578	b.eq 0x0086c5a0
0086c57c	sub x9,x8,x19
0086c580	add x1,x19,x9
0086c584	subs x22,x8,x1
0086c588	b.eq 0x0086c598
0086c58c	mov x0,x19
0086c590	mov x2,x22
0086c594	bl 0x00c2ff60
0086c598	add x8,x19,x22
0086c59c	str x8,[x20, #0x8]
0086c5a0	ldr x8,[x24, #0x28]
0086c5a4	ldur x9,[x29, #-0x8]
0086c5a8	cmp x8,x9
0086c5ac	b.ne 0x0086c668
0086c5b0	mov x0,x21
0086c5b4	mov x1,x28
0086c5b8	ldp x20,x19,[sp, #0x90]
0086c5bc	ldp x22,x21,[sp, #0x80]
0086c5c0	ldp x24,x23,[sp, #0x70]
0086c5c4	ldp x26,x25,[sp, #0x60]
0086c5c8	ldp x28,x27,[sp, #0x50]
0086c5cc	ldp x29,x30,[sp, #0x40]
0086c5d0	add sp,sp,#0xa0
0086c5d4	ret
0086c5d8	and x8,x28,#-0x4
0086c5dc	add x9,x0,#0x10
0086c5e0	add x10,x10,#0x10
0086c5e4	mov x11,x8
0086c5e8	ldp q0,q1,[x10, #-0x10]
0086c5ec	subs x11,x11,#0x4
0086c5f0	add x10,x10,#0x20
0086c5f4	stp q0,q1,[x9, #-0x10]
0086c5f8	add x9,x9,#0x20
0086c5fc	b.ne 0x0086c5e8
0086c600	cmp x28,x8
0086c604	b.eq 0x0086c4f0
0086c608	b 0x0086c4cc
0086c668	bl 0x00c2fec0
