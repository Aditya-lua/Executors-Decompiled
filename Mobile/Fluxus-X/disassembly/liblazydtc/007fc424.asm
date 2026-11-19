; _INIT_10 @ 007fc424
007fc424	stp x29,x30,[sp, #-0x10]!
007fc428	mov x29,sp
007fc42c	adrp x8,0xcca000
007fc430	add x8,x8,#0x8e0
007fc434	ldarb w8,[x8]
007fc438	tbnz w8,#0x0,0x007fc4fc
007fc43c	adrp x0,0xcca000
007fc440	add x0,x0,#0x8e0
007fc444	bl 0x00c2fe90
007fc448	cbz w0,0x007fc4fc
007fc44c	adrp x8,0xcca000
007fc450	add x8,x8,#0xa60
007fc454	ldarb w9,[x8]
007fc458	adrp x8,0xcca000
007fc45c	add x8,x8,#0xa20
007fc460	tbz w9,#0x0,0x007fc504
007fc464	adrp x9,0xcca000
007fc468	ldrb w9,[x9, #0xa5b]
007fc46c	cmp w9,#0x1
007fc470	b.ne 0x007fc4e4
007fc474	adrp x9,0x29a000
007fc478	ldp d1,d2,[x8]
007fc47c	ldr d0,[x9, #0x90]
007fc480	ldp d3,d4,[x8, #0x10]
007fc484	ldp d5,d6,[x8, #0x20]
007fc488	mov w10,#0x37
007fc48c	eor v1.8B,v1.8B,v0.8B
007fc490	eor v2.8B,v2.8B,v0.8B
007fc494	ldrb w9,[x8, #0x38]
007fc498	eor v3.8B,v3.8B,v0.8B
007fc49c	eor v4.8B,v4.8B,v0.8B
007fc4a0	strb wzr,[x8, #0x3b]
007fc4a4	eor w9,w9,w10
007fc4a8	ldrb w10,[x8, #0x39]
007fc4ac	stp d1,d2,[x8]
007fc4b0	ldr d2,[x8, #0x30]
007fc4b4	eor v1.8B,v5.8B,v0.8B
007fc4b8	eor v5.8B,v6.8B,v0.8B
007fc4bc	strb w9,[x8, #0x38]
007fc4c0	ldrb w9,[x8, #0x3a]
007fc4c4	eor v0.8B,v2.8B,v0.8B
007fc4c8	eor w10,w10,#0xffffffe7
007fc4cc	stp d3,d4,[x8, #0x10]
007fc4d0	eor w9,w9,#0x7f
007fc4d4	strb w10,[x8, #0x39]
007fc4d8	stp d1,d5,[x8, #0x20]
007fc4dc	str d0,[x8, #0x30]
007fc4e0	strb w9,[x8, #0x3a]
007fc4e4	adrp x9,0xcca000
007fc4e8	adrp x0,0xcca000
007fc4ec	add x0,x0,#0x8e0
007fc4f0	str x8,[x9, #0x8d8]
007fc4f4	ldp x29,x30,[sp], #0x10
007fc4f8	b 0x00c2fea0
007fc4fc	ldp x29,x30,[sp], #0x10
007fc500	ret
007fc504	adrp x0,0xcca000
007fc508	add x0,x0,#0xa60
007fc50c	bl 0x00c2fe90
007fc510	adrp x8,0xcca000
007fc514	add x8,x8,#0xa20
007fc518	cbz w0,0x007fc464
007fc51c	adrp x10,0x29d000
007fc520	add x10,x10,#0x311
007fc524	mov w9,#0x1
007fc528	ldp q0,q1,[x10]
007fc52c	ldr q2,[x10, #0x20]
007fc530	nop
007fc534	adr x0,0x7fdee0
007fc538	adrp x2,0xc48000
007fc53c	add x2,x2,#0x880
007fc540	adrp x1,0xcca000
007fc544	add x1,x1,#0xa20
007fc548	stp q0,q1,[x8]
007fc54c	ldur q0,[x10, #0x2b]
007fc550	strb w9,[x8, #0x3b]
007fc554	str q2,[x8, #0x20]
007fc558	stur q0,[x8, #0x2b]
007fc55c	bl 0x00c2fe70
007fc560	adrp x0,0xcca000
007fc564	add x0,x0,#0xa60
007fc568	bl 0x00c2fea0
007fc56c	adrp x8,0xcca000
007fc570	add x8,x8,#0xa20
007fc574	b 0x007fc464
