; FUN_0096a3a4 @ 0096a3a4
0096a3a4	sub sp,sp,#0x50
0096a3a8	str x23,[sp, #0x10]
0096a3ac	stp x22,x21,[sp, #0x20]
0096a3b0	stp x20,x19,[sp, #0x30]
0096a3b4	stp x29,x30,[sp, #0x40]
0096a3b8	add x29,sp,#0x40
0096a3bc	mrs x22,tpidr_el0
0096a3c0	ldr x8,[x22, #0x28]
0096a3c4	adrp x21,0xcb4000
0096a3c8	mov x19,x0
0096a3cc	orr w1,wzr,#0x60
0096a3d0	str x8,[sp, #0x8]
0096a3d4	ldr x8,[x0, #0x18]
0096a3d8	ldr x21,[x21, #0xdd0]
0096a3dc	str xzr,[sp]
0096a3e0	mov w0,#0x1
0096a3e4	ldr x23,[x8, #0x3a0]
0096a3e8	ldr x8,[x21]
0096a3ec	blr x8
0096a3f0	mov x20,x0
0096a3f4	cbz x0,0x0096a46c
0096a3f8	adrp x9,0x749000
0096a3fc	lsl x8,x23,#0x27
0096a400	add x9,x9,#0x238
0096a404	and x8,x9,x8, ASR #0x3f
0096a408	str x8,[x20, #0x28]
0096a40c	adrp x8,0xcc4000
0096a410	ldr x8,[x8, #0xd08]
0096a414	ldr x9,[x21]
0096a418	mov w0,#0x1
0096a41c	ldr x1,[x8, #0x18]
0096a420	blr x9
0096a424	str x0,[x20, #0x30]
0096a428	cbz x0,0x0096a474
0096a42c	adrp x1,0xcc4000
0096a430	add x1,x1,#0xd20
0096a434	mov x0,sp
0096a438	mov x2,x20
0096a43c	bl 0x00907328
0096a440	mov w21,w0
0096a444	cbz w0,0x0096a490
0096a448	adrp x19,0xcc4000
0096a44c	add x19,x19,#0x678
0096a450	ldr x0,[x20, #0x30]
0096a454	ldr x8,[x19]
0096a458	blr x8
0096a45c	ldr x8,[x19]
0096a460	mov x0,x20
0096a464	blr x8
0096a468	b 0x0096a49c
0096a46c	mov w21,#0x1b
0096a470	b 0x0096a49c
0096a474	adrp x8,0xcc4000
0096a478	add x8,x8,#0x678
0096a47c	mov x0,x20
0096a480	ldr x8,[x8]
0096a484	blr x8
0096a488	mov w21,#0x1b
0096a48c	b 0x0096a49c
0096a490	ldr x1,[sp]
0096a494	mov x0,x19
0096a498	bl 0x009073e8
0096a49c	ldr x8,[x22, #0x28]
0096a4a0	ldr x9,[sp, #0x8]
0096a4a4	cmp x8,x9
0096a4a8	b.ne 0x0096a4c8
0096a4ac	mov w0,w21
0096a4b0	ldp x29,x30,[sp, #0x40]
0096a4b4	ldp x20,x19,[sp, #0x30]
0096a4b8	ldp x22,x21,[sp, #0x20]
0096a4bc	ldr x23,[sp, #0x10]
0096a4c0	add sp,sp,#0x50
0096a4c4	ret
0096a4c8	bl 0x00c2fec0
