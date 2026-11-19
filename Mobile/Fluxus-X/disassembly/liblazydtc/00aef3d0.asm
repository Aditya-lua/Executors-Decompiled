; ERR_add_error_txt @ 00aef3d0
00aef3d0	sub sp,sp,#0x90
00aef3d4	stp x28,x27,[sp, #0x30]
00aef3d8	stp x26,x25,[sp, #0x40]
00aef3dc	stp x24,x23,[sp, #0x50]
00aef3e0	stp x22,x21,[sp, #0x60]
00aef3e4	stp x20,x19,[sp, #0x70]
00aef3e8	stp x29,x30,[sp, #0x80]
00aef3ec	add x29,sp,#0x80
00aef3f0	mov x23,x1
00aef3f4	mov x20,x0
00aef3f8	str xzr,[sp, #0x28]
00aef3fc	stp xzr,xzr,[sp, #0x10]
00aef400	bl 0x00c32420
00aef404	adrp x27,0x2ab000
00aef408	add x27,x27,#0x32c
00aef40c	cmp x20,#0x0
00aef410	mov x19,x0
00aef414	csel x20,x27,x20,eq
00aef418	cbnz x0,0x00aef444
00aef41c	bl 0x00c342a0
00aef420	adrp x0,0x2ab000
00aef424	add x0,x0,#0x32c
00aef428	mov w1,wzr
00aef42c	mov x2,xzr
00aef430	bl 0x00c342b0
00aef434	mov w0,#0x1
00aef438	mov w1,wzr
00aef43c	mov x2,xzr
00aef440	bl 0x00c342c0
00aef444	ubfx w8,w19,#0x17,#0x8
00aef448	cmp w19,#0x0
00aef44c	mov w9,#0x2
00aef450	adrp x21,0x2a2000
00aef454	add x21,x21,#0xd34
00aef458	csel w8,w9,w8,lt
00aef45c	str w8,[sp, #0x8]
00aef460	add x0,sp,#0x28
00aef464	add x1,sp,#0x24
00aef468	add x2,sp,#0x18
00aef46c	add x3,sp,#0x10
00aef470	add x4,sp,#0xc
00aef474	bl 0x00c3be30
00aef478	ldrb w8,[sp, #0xc]
00aef47c	tbnz w8,#0x1,0x00aef490
00aef480	mov x0,x27
00aef484	mov x24,x27
00aef488	str x27,[sp, #0x10]
00aef48c	b 0x00aef498
00aef490	ldr x0,[sp, #0x10]
00aef494	mov x24,x20
00aef498	bl 0x00c2ff50
00aef49c	cmp x0,#0xf9b
00aef4a0	mov x28,xzr
00aef4a4	b.hi 0x00aef4d0
00aef4a8	mov x25,x0
00aef4ac	mov x0,x20
00aef4b0	bl 0x00c2ff50
00aef4b4	mov w8,#0xf9c
00aef4b8	sub x8,x8,x25
00aef4bc	cmp x8,x0
00aef4c0	mov x28,xzr
00aef4c4	b.ls 0x00aef4d0
00aef4c8	sub x8,x8,#0x1
00aef4cc	sub x28,x8,x0
00aef4d0	ldrb w8,[x20]
00aef4d4	cbz w8,0x00aef5c0
00aef4d8	ldrb w8,[x23]
00aef4dc	mov x26,x23
00aef4e0	cbz w8,0x00aef634
00aef4e4	mov w22,wzr
00aef4e8	mov x26,x23
00aef4ec	mov x0,x26
00aef4f0	mov x1,x20
00aef4f4	mov x25,x26
00aef4f8	bl 0x00c30c40
00aef4fc	cbz x0,0x00aef520
00aef500	mov x26,x0
00aef504	mov x0,x20
00aef508	bl 0x00c2ff50
00aef50c	add x26,x26,x0
00aef510	ldrb w8,[x26]
00aef514	cmp w8,#0x0
00aef518	cset w22,eq
00aef51c	b 0x00aef530
00aef520	mov x0,x25
00aef524	bl 0x00c2ff50
00aef528	add x26,x25,x0
00aef52c	ldrb w8,[x26]
00aef530	sub x9,x26,x23
00aef534	cmp x9,x28
00aef538	b.hi 0x00aef540
00aef53c	cbnz w8,0x00aef4ec
00aef540	cmp x9,x28
00aef544	b.ls 0x00aef5e0
00aef548	cbz x25,0x00aef5e0
00aef54c	subs x1,x25,x23
00aef550	b.eq 0x00aef58c
00aef554	mov w3,#0x7b
00aef558	mov x0,x23
00aef55c	mov x2,x21
00aef560	bl 0x00c36180
00aef564	cbz x0,0x00aef654
00aef568	mov x23,x0
00aef56c	mov w0,#0x2
00aef570	mov x1,x20
00aef574	mov x2,x23
00aef578	bl 0x00c37fb0
00aef57c	orr w2,wzr,#0x7f
00aef580	mov x0,x23
00aef584	mov x1,x21
00aef588	bl 0x00c32310
00aef58c	ldr x23,[sp, #0x18]
00aef590	ldr x24,[sp, #0x28]
00aef594	ldr w26,[sp, #0x24]
00aef598	bl 0x00c342a0
00aef59c	mov x0,x24
00aef5a0	mov w1,w26
00aef5a4	mov x2,x23
00aef5a8	bl 0x00c342b0
00aef5ac	ldr w0,[sp, #0x8]
00aef5b0	mov w1,w19
00aef5b4	mov x2,xzr
00aef5b8	bl 0x00c342c0
00aef5bc	b 0x00aef648
00aef5c0	mov x0,x23
00aef5c4	bl 0x00c2ff50
00aef5c8	cmp x0,x28
00aef5cc	b.ls 0x00aef630
00aef5d0	add x25,x23,x28
00aef5d4	mov w22,wzr
00aef5d8	mov x26,x25
00aef5dc	cbnz x25,0x00aef54c
00aef5e0	cbz w22,0x00aef634
00aef5e4	mov x0,x20
00aef5e8	bl 0x00c2ff50
00aef5ec	sub x8,x26,x0
00aef5f0	sub x1,x8,x23
00aef5f4	mov w3,#0x85
00aef5f8	mov x0,x23
00aef5fc	mov x2,x21
00aef600	bl 0x00c36180
00aef604	cbz x0,0x00aef654
00aef608	mov x23,x0
00aef60c	mov w0,#0x2
00aef610	mov x1,x24
00aef614	mov x2,x23
00aef618	bl 0x00c37fb0
00aef61c	mov w2,#0x8a
00aef620	mov x0,x23
00aef624	mov x1,x21
00aef628	bl 0x00c32310
00aef62c	b 0x00aef644
00aef630	add x26,x23,x0
00aef634	mov w0,#0x2
00aef638	mov x1,x24
00aef63c	mov x2,x23
00aef640	bl 0x00c37fb0
00aef644	mov x25,x26
00aef648	ldrb w8,[x25]
00aef64c	mov x23,x25
00aef650	cbnz w8,0x00aef460
00aef654	ldp x29,x30,[sp, #0x80]
00aef658	ldp x20,x19,[sp, #0x70]
00aef65c	ldp x22,x21,[sp, #0x60]
00aef660	ldp x24,x23,[sp, #0x50]
00aef664	ldp x26,x25,[sp, #0x40]
00aef668	ldp x28,x27,[sp, #0x30]
00aef66c	add sp,sp,#0x90
00aef670	ret
