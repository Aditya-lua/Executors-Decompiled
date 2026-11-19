; ix::SocketServer::runGC @ 0098a42c
0098a42c	sub sp,sp,#0x90
0098a430	stp x26,x25,[sp, #0x40]
0098a434	stp x24,x23,[sp, #0x50]
0098a438	stp x22,x21,[sp, #0x60]
0098a43c	stp x20,x19,[sp, #0x70]
0098a440	stp x29,x30,[sp, #0x80]
0098a444	add x29,sp,#0x80
0098a448	mrs x23,tpidr_el0
0098a44c	ldr x8,[x23, #0x28]
0098a450	mov x19,x0
0098a454	str x8,[sp, #0x38]
0098a458	ldr w0,[x0, #0x8]
0098a45c	add x8,sp,#0x8
0098a460	bl 0x00c305a0
0098a464	adrp x2,0x2b1000
0098a468	add x2,x2,#0x9aa
0098a46c	add x0,sp,#0x8
0098a470	orr w3,wzr,#0x7
0098a474	mov x1,xzr
0098a478	bl 0x00c314c0
0098a47c	ldr x8,[x0, #0x10]
0098a480	str x8,[sp, #0x30]
0098a484	ldr q0,[x0]
0098a488	str q0,[sp, #0x20]
0098a48c	stp xzr,xzr,[x0]
0098a490	str xzr,[x0, #0x10]
0098a494	add x0,sp,#0x20
0098a498	bl 0x00c334c0
0098a49c	ldrb w8,[sp, #0x20]
0098a4a0	tbz w8,#0x0,0x0098a4ac
0098a4a4	ldr x0,[sp, #0x30]
0098a4a8	bl 0x00c301d0
0098a4ac	ldrb w8,[sp, #0x8]
0098a4b0	tbz w8,#0x0,0x0098a4bc
0098a4b4	ldr x0,[sp, #0x18]
0098a4b8	bl 0x00c301d0
0098a4bc	add x20,x19,#0xa0
0098a4c0	add x21,x19,#0x210
0098a4c4	add x22,x19,#0x1e0
0098a4c8	mov w24,#0x1
0098a4cc	b 0x0098a4d8
0098a4d0	ldr x0,[sp, #0x20]
0098a4d4	bl 0x00c2ff20
0098a4d8	mov x0,x19
0098a4dc	bl 0x00c33630
0098a4e0	add x25,x19,#0x78
0098a4e4	ldarb w8,[x25]
0098a4e8	tbz w8,#0x0,0x0098a504
0098a4ec	mov x0,x20
0098a4f0	bl 0x00c2ff10
0098a4f4	ldr x26,[x19, #0x98]
0098a4f8	mov x0,x20
0098a4fc	bl 0x00c2ff20
0098a500	cbz x26,0x0098a548
0098a504	ldarb w8,[x25]
0098a508	tbnz w8,#0x0,0x0098a4d8
0098a50c	mov x0,x21
0098a510	str x21,[sp, #0x20]
0098a514	strb w24,[sp, #0x28]
0098a518	bl 0x00c2ff10
0098a51c	ldrb w8,[x19, #0x238]
0098a520	cbnz w8,0x0098a538
0098a524	add x1,sp,#0x20
0098a528	mov x0,x22
0098a52c	bl 0x00c33250
0098a530	ldrb w8,[x19, #0x238]
0098a534	cbz w8,0x0098a524
0098a538	strb wzr,[x19, #0x238]
0098a53c	ldrb w8,[sp, #0x28]
0098a540	cbnz w8,0x0098a4d0
0098a544	b 0x0098a4d8
0098a548	ldr x8,[x23, #0x28]
0098a54c	ldr x9,[sp, #0x38]
0098a550	cmp x8,x9
0098a554	b.ne 0x0098a574
0098a558	ldp x29,x30,[sp, #0x80]
0098a55c	ldp x20,x19,[sp, #0x70]
0098a560	ldp x22,x21,[sp, #0x60]
0098a564	ldp x24,x23,[sp, #0x50]
0098a568	ldp x26,x25,[sp, #0x40]
0098a56c	add sp,sp,#0x90
0098a570	ret
0098a574	bl 0x00c2fec0
