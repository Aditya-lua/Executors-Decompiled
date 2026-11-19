; FUN_008cc36c @ 008cc36c
008cc36c	sub sp,sp,#0x70
008cc370	stp x29,x30,[sp, #0x20]
008cc374	str x25,[sp, #0x30]
008cc378	stp x24,x23,[sp, #0x40]
008cc37c	stp x22,x21,[sp, #0x50]
008cc380	stp x20,x19,[sp, #0x60]
008cc384	add x29,sp,#0x20
008cc388	mrs x23,tpidr_el0
008cc38c	mov x20,x3
008cc390	mov x21,x2
008cc394	ldr x8,[x23, #0x28]
008cc398	mov x19,x1
008cc39c	mov x22,x0
008cc3a0	stur x8,[x29, #-0x8]
008cc3a4	ldr w8,[x2, #0xc]
008cc3a8	ldr w11,[x3, #0xc]
008cc3ac	cmp w8,#0x4
008cc3b0	csel x10,x2,xzr,eq
008cc3b4	cmp w11,#0x4
008cc3b8	csel x9,x3,xzr,eq
008cc3bc	cbz x10,0x008cc3fc
008cc3c0	cbz x9,0x008cc3fc
008cc3c4	ldr s0,[x10]
008cc3c8	ldr s1,[x9]
008cc3cc	mov w8,#0x4
008cc3d0	fadd s0,s0,s1
008cc3d4	str s0,[x19]
008cc3d8	ldr s0,[x10, #0x4]
008cc3dc	ldr s1,[x9, #0x4]
008cc3e0	fadd s0,s0,s1
008cc3e4	str s0,[x19, #0x4]
008cc3e8	ldr s0,[x10, #0x8]
008cc3ec	ldr s1,[x9, #0x8]
008cc3f0	fadd s0,s0,s1
008cc3f4	str s0,[x19, #0x8]
008cc3f8	b 0x008cc51c
008cc3fc	cbz x10,0x008cc424
008cc400	cmp w11,#0x3
008cc404	b.eq 0x008cc454
008cc408	cmp w11,#0x5
008cc40c	b.ne 0x008cc454
008cc410	ldr x8,[x20]
008cc414	add x1,sp,#0x10
008cc418	add x0,x8,#0x18
008cc41c	bl 0x008b93c8
008cc420	b 0x008cc454
008cc424	cmp w8,#0x3
008cc428	b.eq 0x008cc454
008cc42c	cbz x9,0x008cc454
008cc430	cmp w8,#0x5
008cc434	b.ne 0x008cc454
008cc438	ldr x8,[x21]
008cc43c	add x1,sp,#0x10
008cc440	add x0,x8,#0x18
008cc444	bl 0x008b93c8
008cc448	cbz w0,0x008cc454
008cc44c	ldr d0,[sp, #0x10]
008cc450	str d0,[sp, #0x8]
008cc454	ldr w8,[x21, #0xc]
008cc458	mov x24,x21
008cc45c	cmp w8,#0x3
008cc460	b.eq 0x008cc48c
008cc464	cmp w8,#0x5
008cc468	b.ne 0x008cc4b8
008cc46c	ldr x8,[x21]
008cc470	add x1,sp,#0x10
008cc474	add x0,x8,#0x18
008cc478	bl 0x008b93c8
008cc47c	cbz w0,0x008cc4b8
008cc480	ldr d0,[sp, #0x10]
008cc484	add x24,sp,#0x8
008cc488	str d0,[sp, #0x8]
008cc48c	ldr w8,[x20, #0xc]
008cc490	cmp w8,#0x3
008cc494	b.eq 0x008cc504
008cc498	cmp w8,#0x5
008cc49c	b.ne 0x008cc4b8
008cc4a0	ldr x8,[x20]
008cc4a4	add x1,sp,#0x10
008cc4a8	add x25,sp,#0x10
008cc4ac	add x0,x8,#0x18
008cc4b0	bl 0x008b93c8
008cc4b4	cbnz w0,0x008cc508
008cc4b8	mov x0,x22
008cc4bc	mov x1,x21
008cc4c0	mov w2,#0x8
008cc4c4	bl 0x008be028
008cc4c8	ldr w8,[x0, #0xc]
008cc4cc	cbnz w8,0x008cc4e8
008cc4d0	mov x0,x22
008cc4d4	mov x1,x20
008cc4d8	mov w2,#0x8
008cc4dc	bl 0x008be028
008cc4e0	ldr w8,[x0, #0xc]
008cc4e4	cbz w8,0x008cc54c
008cc4e8	mov x2,x0
008cc4ec	mov x0,x22
008cc4f0	mov x1,x19
008cc4f4	mov x3,x21
008cc4f8	mov x4,x20
008cc4fc	bl 0x008cb070
008cc500	b 0x008cc520
008cc504	mov x25,x20
008cc508	ldr d0,[x25]
008cc50c	ldr d1,[x24]
008cc510	mov w8,#0x3
008cc514	fadd d0,d1,d0
008cc518	str d0,[x19]
008cc51c	str w8,[x19, #0xc]
008cc520	ldr x8,[x23, #0x28]
008cc524	ldur x9,[x29, #-0x8]
008cc528	cmp x8,x9
008cc52c	b.ne 0x008cc570
008cc530	ldp x20,x19,[sp, #0x60]
008cc534	ldr x25,[sp, #0x30]
008cc538	ldp x22,x21,[sp, #0x50]
008cc53c	ldp x24,x23,[sp, #0x40]
008cc540	ldp x29,x30,[sp, #0x20]
008cc544	add sp,sp,#0x70
008cc548	ret
008cc54c	ldr x8,[x23, #0x28]
008cc550	ldur x9,[x29, #-0x8]
008cc554	cmp x8,x9
008cc558	b.ne 0x008cc570
008cc55c	mov x0,x22
008cc560	mov x1,x21
008cc564	mov x2,x20
008cc568	mov w3,#0x8
008cc56c	bl 0x008b3afc
008cc570	bl 0x00c2fec0
