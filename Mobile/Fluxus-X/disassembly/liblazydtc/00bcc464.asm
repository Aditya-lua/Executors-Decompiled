; std::__ndk1::__assoc_sub_state::copy @ 00bcc464
00bcc464	paciasp
00bcc468	sub sp,sp,#0x40
00bcc46c	stp x29,x30,[sp, #0x20]
00bcc470	stp x20,x19,[sp, #0x30]
00bcc474	add x29,sp,#0x20
00bcc478	add x20,x0,#0x18
00bcc47c	mov x19,x0
00bcc480	mov w8,#0x1
00bcc484	mov x0,x20
00bcc488	str x20,[sp, #0x10]
00bcc48c	strb w8,[sp, #0x18]
00bcc490	bl 0x00c2ff10
00bcc494	ldr w8,[x19, #0x70]
00bcc498	tbnz w8,#0x2,0x00bcc4dc
00bcc49c	tbnz w8,#0x3,0x00bcc4b8
00bcc4a0	add x0,x19,#0x40
00bcc4a4	add x1,sp,#0x10
00bcc4a8	bl 0x00c33250
00bcc4ac	ldrb w8,[x19, #0x70]
00bcc4b0	tbz w8,#0x2,0x00bcc4a0
00bcc4b4	b 0x00bcc4dc
00bcc4b8	and w8,w8,#0xfffffff3
00bcc4bc	mov x0,x20
00bcc4c0	str w8,[x19, #0x70]
00bcc4c4	bl 0x00c2ff20
00bcc4c8	ldr x8,[x19]
00bcc4cc	mov x0,x19
00bcc4d0	strb wzr,[sp, #0x18]
00bcc4d4	ldr x8,[x8, #0x18]
00bcc4d8	blr x8
00bcc4dc	ldr x20,[x19, #0x10]!
00bcc4e0	add x0,sp,#0x8
00bcc4e4	str xzr,[sp, #0x8]
00bcc4e8	bl 0x00c31450
00bcc4ec	cbnz x20,0x00bcc518
00bcc4f0	ldrb w8,[sp, #0x18]
00bcc4f4	cmp w8,#0x1
00bcc4f8	b.ne 0x00bcc504
00bcc4fc	ldr x0,[sp, #0x10]
00bcc500	bl 0x00c2ff20
00bcc504	ldp x20,x19,[sp, #0x30]
00bcc508	ldp x29,x30,[sp, #0x20]
00bcc50c	add sp,sp,#0x40
00bcc510	autiasp
00bcc514	ret
00bcc518	mov x0,sp
00bcc51c	mov x1,x19
00bcc520	bl 0x00c31440
00bcc524	mov x0,sp
00bcc528	bl 0x00c43c80
00bcc52c	mov x19,x0
00bcc530	mov x0,sp
00bcc534	bl 0x00c31450
00bcc538	ldrb w8,[sp, #0x18]
00bcc53c	tbz w8,#0x0,0x00bcc548
00bcc540	ldr x0,[sp, #0x10]
00bcc544	bl 0x00c2ff20
00bcc548	mov x0,x19
00bcc54c	bl 0x00c2c090
