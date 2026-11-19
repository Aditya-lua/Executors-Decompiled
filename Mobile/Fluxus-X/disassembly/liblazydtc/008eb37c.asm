; cpr::Session::SetHeaderInternal @ 008eb37c
008eb37c	sub sp,sp,#0xb0
008eb380	stp x28,x27,[sp, #0x50]
008eb384	stp x26,x25,[sp, #0x60]
008eb388	stp x24,x23,[sp, #0x70]
008eb38c	stp x22,x21,[sp, #0x80]
008eb390	stp x20,x19,[sp, #0x90]
008eb394	stp x29,x30,[sp, #0xa0]
008eb398	add x29,sp,#0xa0
008eb39c	mrs x8,tpidr_el0
008eb3a0	str x8,[sp, #0x10]
008eb3a4	ldr x8,[x8, #0x28]
008eb3a8	add x28,x0,#0xa0
008eb3ac	str x8,[sp, #0x48]
008eb3b0	ldr x22,[x0, #0x98]
008eb3b4	str x0,[sp, #0x8]
008eb3b8	cmp x22,x28
008eb3bc	b.eq 0x008eb55c
008eb3c0	add x8,sp,#0x30
008eb3c4	add x9,sp,#0x18
008eb3c8	adrp x19,0x2d4000
008eb3cc	mov x20,xzr
008eb3d0	orr x21,x8,#0x1
008eb3d4	orr x27,x9,#0x1
008eb3d8	add x19,x19,#0xf75
008eb3dc	stp xzr,xzr,[sp, #0x38]
008eb3e0	str xzr,[sp, #0x30]
008eb3e4	mov x8,x22
008eb3e8	ldrb w9,[x8, #0x20]!
008eb3ec	tbnz w9,#0x0,0x008eb404
008eb3f0	ldr x9,[x8, #0x10]
008eb3f4	str x9,[sp, #0x40]
008eb3f8	ldr q0,[x8]
008eb3fc	str q0,[sp, #0x30]
008eb400	b 0x008eb464
008eb404	ldr x23,[x22, #0x28]
008eb408	cmn x23,#0x10
008eb40c	b.cs 0x008eb6a8
008eb410	ldr x24,[x22, #0x30]
008eb414	cmp x23,#0x17
008eb418	b.cs 0x008eb430
008eb41c	lsl w8,w23,#0x1
008eb420	mov x25,x21
008eb424	strb w8,[sp, #0x30]
008eb428	cbnz x23,0x008eb450
008eb42c	b 0x008eb460
008eb430	add x8,x23,#0x10
008eb434	and x26,x8,#-0x10
008eb438	mov x0,x26
008eb43c	bl 0x00c2fed0
008eb440	orr x8,x26,#0x1
008eb444	mov x25,x0
008eb448	stp x23,x0,[sp, #0x38]
008eb44c	str x8,[sp, #0x30]
008eb450	mov x0,x25
008eb454	mov x1,x24
008eb458	mov x2,x23
008eb45c	bl 0x00c2ffd0
008eb460	strb wzr,[x25, x23]
008eb464	mov x1,x22
008eb468	ldrb w8,[x1, #0x38]!
008eb46c	tbnz w8,#0x0,0x008eb4b8
008eb470	lsr w8,w8,#0x1
008eb474	cbz x8,0x008eb4c0
008eb478	add x8,sp,#0x18
008eb47c	mov x0,x19
008eb480	bl 0x00c304a0
008eb484	ldrb w8,[sp, #0x18]
008eb488	ldp x10,x9,[sp, #0x20]
008eb48c	tst w8,#0x1
008eb490	lsr w11,w8,#0x1
008eb494	csel x1,x27,x9,eq
008eb498	csel x2,x11,x10,eq
008eb49c	add x0,sp,#0x30
008eb4a0	bl 0x00c308c0
008eb4a4	ldrb w8,[sp, #0x18]
008eb4a8	tbz w8,#0x0,0x008eb4d4
008eb4ac	ldr x0,[sp, #0x28]
008eb4b0	bl 0x00c301d0
008eb4b4	b 0x008eb4d4
008eb4b8	ldr x8,[x22, #0x40]
008eb4bc	cbnz x8,0x008eb478
008eb4c0	adrp x1,0x2b5000
008eb4c4	add x0,sp,#0x30
008eb4c8	mov w2,#0x1
008eb4cc	add x1,x1,#0x29b
008eb4d0	bl 0x00c308c0
008eb4d4	ldrb w8,[sp, #0x30]
008eb4d8	ldr x9,[sp, #0x40]
008eb4dc	tst w8,#0x1
008eb4e0	csel x1,x21,x9,eq
008eb4e4	mov x0,x20
008eb4e8	bl 0x00c31840
008eb4ec	ldrb w8,[sp, #0x30]
008eb4f0	cmp x0,#0x0
008eb4f4	csel x20,x20,x0,eq
008eb4f8	tbz w8,#0x0,0x008eb504
008eb4fc	ldr x0,[sp, #0x40]
008eb500	bl 0x00c301d0
008eb504	ldr x8,[x22, #0x8]
008eb508	cbz x8,0x008eb51c
008eb50c	mov x22,x8
008eb510	ldr x8,[x8]
008eb514	cbnz x8,0x008eb50c
008eb518	b 0x008eb550
008eb51c	mov x8,x22
008eb520	ldr x9,[x8, #0x10]!
008eb524	ldr x10,[x9]
008eb528	cmp x10,x22
008eb52c	b.eq 0x008eb54c
008eb530	ldr x9,[x8]
008eb534	mov x8,x9
008eb538	ldr x22,[x8, #0x10]!
008eb53c	ldr x10,[x22]
008eb540	cmp x10,x9
008eb544	b.ne 0x008eb530
008eb548	b 0x008eb550
008eb54c	mov x22,x9
008eb550	cmp x22,x28
008eb554	b.ne 0x008eb3dc
008eb558	b 0x008eb560
008eb55c	mov x20,xzr
008eb560	ldr x19,[sp, #0x8]
008eb564	ldrb w8,[x19, #0x11]
008eb568	cbz w8,0x008eb5f8
008eb56c	adrp x9,0x2bc000
008eb570	add x9,x9,#0xd92
008eb574	ldr q0,[x9]
008eb578	mov w8,#0x22
008eb57c	stp xzr,xzr,[sp, #0x30]
008eb580	strb w8,[sp, #0x30]
008eb584	mov w8,#0x67
008eb588	str xzr,[sp, #0x40]
008eb58c	sturh w8,[sp, #0x41]
008eb590	stur q0,[sp, #0x31]
008eb594	ldr x23,[x28]
008eb598	cbz x23,0x008eb670
008eb59c	add x21,x19,#0xa8
008eb5a0	mov w24,#0x8
008eb5a4	mov x22,x28
008eb5a8	add x1,x23,#0x20
008eb5ac	add x2,sp,#0x30
008eb5b0	mov x0,x21
008eb5b4	bl 0x00c30490
008eb5b8	tst w0,#0x1
008eb5bc	csel x8,x24,xzr,ne
008eb5c0	csel x22,x22,x23,ne
008eb5c4	ldr x23,[x23, x8#0x0]
008eb5c8	cbnz x23,0x008eb5a8
008eb5cc	cmp x22,x28
008eb5d0	b.eq 0x008eb670
008eb5d4	add x2,x22,#0x20
008eb5d8	add x1,sp,#0x30
008eb5dc	mov x0,x21
008eb5e0	bl 0x00c30490
008eb5e4	tbnz w0,#0x0,0x008eb670
008eb5e8	ldrb w8,[sp, #0x30]
008eb5ec	tbnz w8,#0x0,0x008eb67c
008eb5f0	cmp x22,x28
008eb5f4	b.eq 0x008eb68c
008eb5f8	ldr x21,[sp, #0x10]
008eb5fc	adrp x1,0x2cc000
008eb600	add x1,x1,#0xc83
008eb604	mov x0,x20
008eb608	bl 0x00c31840
008eb60c	ldr x8,[x19, #0x18]
008eb610	cmp x0,#0x0
008eb614	csel x20,x20,x0,eq
008eb618	mov w1,#0x2727
008eb61c	ldr x8,[x8]
008eb620	mov x2,x20
008eb624	mov x0,x8
008eb628	bl 0x00c317c0
008eb62c	ldr x8,[x19, #0x18]
008eb630	ldr x0,[x8, #0x8]
008eb634	bl 0x00c31040
008eb638	ldr x8,[x19, #0x18]
008eb63c	str x20,[x8, #0x8]
008eb640	ldr x8,[x21, #0x28]
008eb644	ldr x9,[sp, #0x48]
008eb648	cmp x8,x9
008eb64c	b.ne 0x008eb6b0
008eb650	ldp x29,x30,[sp, #0xa0]
008eb654	ldp x20,x19,[sp, #0x90]
008eb658	ldp x22,x21,[sp, #0x80]
008eb65c	ldp x24,x23,[sp, #0x70]
008eb660	ldp x26,x25,[sp, #0x60]
008eb664	ldp x28,x27,[sp, #0x50]
008eb668	add sp,sp,#0xb0
008eb66c	ret
008eb670	mov x22,x28
008eb674	ldrb w8,[sp, #0x30]
008eb678	tbz w8,#0x0,0x008eb5f0
008eb67c	ldr x0,[sp, #0x40]
008eb680	bl 0x00c301d0
008eb684	cmp x22,x28
008eb688	b.ne 0x008eb5f8
008eb68c	adrp x1,0x2af000
008eb690	add x1,x1,#0xe5
008eb694	mov x0,x20
008eb698	bl 0x00c31840
008eb69c	cmp x0,#0x0
008eb6a0	csel x20,x20,x0,eq
008eb6a4	b 0x008eb5f8
008eb6a8	add x0,sp,#0x30
008eb6ac	bl 0x00c30ce0
008eb6b0	bl 0x00c2fec0
