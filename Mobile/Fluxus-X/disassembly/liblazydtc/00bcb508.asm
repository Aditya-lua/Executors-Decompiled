; std::__ndk1::system_error::system_error @ 00bcb508
00bcb508	paciasp
00bcb50c	sub sp,sp,#0x80
00bcb510	stp x29,x30,[sp, #0x40]
00bcb514	str x23,[sp, #0x50]
00bcb518	stp x22,x21,[sp, #0x60]
00bcb51c	stp x20,x19,[sp, #0x70]
00bcb520	add x29,sp,#0x40
00bcb524	mov x19,x0
00bcb528	mov x0,x3
00bcb52c	mov x20,x3
00bcb530	stp x1,x2,[x29, #-0x10]
00bcb534	bl 0x00c2ff50
00bcb538	cmn x0,#0x8
00bcb53c	b.cs 0x00bcb620
00bcb540	mov x21,x0
00bcb544	cmp x0,#0x17
00bcb548	b.cs 0x00bcb564
00bcb54c	lsl w8,w21,#0x1
00bcb550	mov x9,sp
00bcb554	orr x22,x9,#0x1
00bcb558	strb w8,[sp]
00bcb55c	cbnz x21,0x00bcb58c
00bcb560	b 0x00bcb59c
00bcb564	orr x8,x21,#0x7
00bcb568	mov w9,#0x1a
00bcb56c	cmp x8,#0x17
00bcb570	csinc x23,x9,x8,eq
00bcb574	mov x0,x23
00bcb578	bl 0x00c2fed0
00bcb57c	orr x8,x23,#0x1
00bcb580	mov x22,x0
00bcb584	stp x21,x0,[sp, #0x8]
00bcb588	str x8,[sp]
00bcb58c	mov x0,x22
00bcb590	mov x1,x20
00bcb594	mov x2,x21
00bcb598	bl 0x00c2ffd0
00bcb59c	strb wzr,[x22, x21]
00bcb5a0	add x8,sp,#0x18
00bcb5a4	sub x0,x29,#0x10
00bcb5a8	mov x1,sp
00bcb5ac	bl 0x00bcb424
00bcb5b0	add x1,sp,#0x18
00bcb5b4	mov x0,x19
00bcb5b8	bl 0x00c43cf0
00bcb5bc	ldrb w8,[sp, #0x18]
00bcb5c0	tbz w8,#0x0,0x00bcb5d4
00bcb5c4	ldr x8,[sp, #0x18]
00bcb5c8	ldr x0,[sp, #0x28]
00bcb5cc	and x1,x8,#-0x2
00bcb5d0	bl 0x00c2fe80
00bcb5d4	ldrb w8,[sp]
00bcb5d8	tbz w8,#0x0,0x00bcb5ec
00bcb5dc	ldr x8,[sp]
00bcb5e0	ldr x0,[sp, #0x10]
00bcb5e4	and x1,x8,#-0x2
00bcb5e8	bl 0x00c2fe80
00bcb5ec	adrp x8,0xcb5000
00bcb5f0	ldr x8,[x8, #0xb18]
00bcb5f4	ldur q0,[x29, #-0x10]
00bcb5f8	add x8,x8,#0x10
00bcb5fc	str x8,[x19]
00bcb600	str q0,[x19, #0x10]
00bcb604	ldp x20,x19,[sp, #0x70]
00bcb608	ldr x23,[sp, #0x50]
00bcb60c	ldp x22,x21,[sp, #0x60]
00bcb610	ldp x29,x30,[sp, #0x40]
00bcb614	add sp,sp,#0x80
00bcb618	autiasp
00bcb61c	ret
00bcb620	bl 0x007fe124
