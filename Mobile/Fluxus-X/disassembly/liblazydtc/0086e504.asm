; FUN_0086e504 @ 0086e504
0086e504	sub sp,sp,#0x90
0086e508	stp x29,x30,[sp, #0x50]
0086e50c	str x23,[sp, #0x60]
0086e510	stp x22,x21,[sp, #0x70]
0086e514	stp x20,x19,[sp, #0x80]
0086e518	add x29,sp,#0x50
0086e51c	mrs x22,tpidr_el0
0086e520	mov x20,x0
0086e524	mov w19,w1
0086e528	ldr x8,[x22, #0x28]
0086e52c	stur x8,[x29, #-0x8]
0086e530	ldr w8,[x0, #0x148]
0086e534	cbz w8,0x0086e5f0
0086e538	ldr w9,[x20, #0x14c]
0086e53c	ldr w10,[x2, #0x4]
0086e540	cmp w9,w10
0086e544	b.ls 0x0086e5f0
0086e548	mov x21,x2
0086e54c	add x0,sp,#0x10
0086e550	mov x1,sp
0086e554	mov w2,w8
0086e558	stp xzr,xzr,[sp]
0086e55c	bl 0x008521dc
0086e560	sub x8,x29,#0x20
0086e564	add x0,sp,#0x10
0086e568	sub x23,x29,#0x20
0086e56c	bl 0x008521fc
0086e570	ldurb w8,[x29, #-0x20]
0086e574	ldur x9,[x29, #-0x10]
0086e578	ldr w10,[x20, #0x14c]
0086e57c	tst w8,#0x1
0086e580	csinc x1,x9,x23,ne
0086e584	adrp x0,0x2b8000
0086e588	add x0,x0,#0xf1b
0086e58c	add x8,sp,#0x10
0086e590	add w2,w10,#0x1
0086e594	add x23,sp,#0x10
0086e598	bl 0x008aa02c
0086e59c	ldrb w8,[sp, #0x10]
0086e5a0	ldr x9,[sp, #0x20]
0086e5a4	tst w8,#0x1
0086e5a8	csinc x3,x9,x23,ne
0086e5ac	mov x0,x20
0086e5b0	mov w1,w19
0086e5b4	mov x2,x21
0086e5b8	bl 0x0086b5f8
0086e5bc	ldrb w8,[sp, #0x10]
0086e5c0	tbz w8,#0x0,0x0086e5d4
0086e5c4	ldr x8,[sp, #0x10]
0086e5c8	ldr x0,[sp, #0x20]
0086e5cc	and x1,x8,#-0x2
0086e5d0	bl 0x00c2fe80
0086e5d4	ldurb w8,[x29, #-0x20]
0086e5d8	tbz w8,#0x0,0x0086e600
0086e5dc	ldur x8,[x29, #-0x20]
0086e5e0	ldur x0,[x29, #-0x10]
0086e5e4	and x1,x8,#-0x2
0086e5e8	bl 0x00c2fe80
0086e5ec	b 0x0086e600
0086e5f0	mov x0,x20
0086e5f4	mov w1,w19
0086e5f8	mov x3,xzr
0086e5fc	bl 0x0086b5f8
0086e600	add x8,sp,#0x10
0086e604	add x0,x20,#0x70
0086e608	bl 0x00853d20
0086e60c	ldr w21,[sp, #0x10]
0086e610	cmp w21,w19
0086e614	b.ne 0x0086e628
0086e618	mov x0,x20
0086e61c	bl 0x00858f2c
0086e620	mov x0,x20
0086e624	bl 0x00858f2c
0086e628	ldr x8,[x22, #0x28]
0086e62c	ldur x9,[x29, #-0x8]
0086e630	cmp w21,w19
0086e634	cset w0,eq
0086e638	cmp x8,x9
0086e63c	b.ne 0x0086e6ac
0086e640	ldp x20,x19,[sp, #0x80]
0086e644	ldr x23,[sp, #0x60]
0086e648	ldp x22,x21,[sp, #0x70]
0086e64c	ldp x29,x30,[sp, #0x50]
0086e650	add sp,sp,#0x90
0086e654	ret
0086e6ac	bl 0x00c2fec0
