; std::__ndk1::locale::global @ 00bfb3e0
00bfb3e0	paciasp
00bfb3e4	sub sp,sp,#0x60
00bfb3e8	stp x29,x30,[sp, #0x20]
00bfb3ec	str x23,[sp, #0x30]
00bfb3f0	stp x22,x21,[sp, #0x40]
00bfb3f4	stp x20,x19,[sp, #0x50]
00bfb3f8	add x29,sp,#0x20
00bfb3fc	adrp x9,0xd27000
00bfb400	add x9,x9,#0x250
00bfb404	mov x20,x0
00bfb408	ldarb w9,[x9]
00bfb40c	mov x19,x8
00bfb410	tbz w9,#0x0,0x00bfb57c
00bfb414	adrp x1,0xd27000
00bfb418	add x1,x1,#0x248
00bfb41c	mov x0,x19
00bfb420	bl 0x00c30660
00bfb424	ldr x8,[x20]
00bfb428	adrp x23,0xd27000
00bfb42c	add x23,x23,#0x100
00bfb430	cmp x8,x23
00bfb434	b.eq 0x00bfb444
00bfb438	add x1,x8,#0x8
00bfb43c	mov w0,#0x1
00bfb440	bl 0x00c2bce0
00bfb444	adrp x22,0xd27000
00bfb448	ldr x21,[x22, #0x248]
00bfb44c	cmp x21,x23
00bfb450	b.eq 0x00bfb474
00bfb454	add x1,x21,#0x8
00bfb458	mov x0,#-0x1
00bfb45c	bl 0x00c2bd10
00bfb460	cbnz x0,0x00bfb474
00bfb464	ldr x8,[x21]
00bfb468	mov x0,x21
00bfb46c	ldr x8,[x8, #0x10]
00bfb470	blr x8
00bfb474	ldr x8,[x20]
00bfb478	ldrb w9,[x8, #0x120]
00bfb47c	str x8,[x22, #0x248]
00bfb480	tbnz w9,#0x0,0x00bfb498
00bfb484	ldr q0,[x8, #0x120]
00bfb488	ldr x8,[x8, #0x130]
00bfb48c	str q0,[sp]
00bfb490	str x8,[sp, #0x10]
00bfb494	b 0x00bfb4a4
00bfb498	ldp x2,x1,[x8, #0x128]
00bfb49c	mov x0,sp
00bfb4a0	bl 0x007ff40c
00bfb4a4	ldrb w8,[sp]
00bfb4a8	ldr x9,[sp, #0x8]
00bfb4ac	ubfx w10,w8,#0x1,#0x7
00bfb4b0	tst w8,#0x1
00bfb4b4	csel x9,x10,x9,eq
00bfb4b8	cmp x9,#0x1
00bfb4bc	b.ne 0x00bfb4e4
00bfb4c0	ldr x9,[sp, #0x10]
00bfb4c4	tst w8,#0x1
00bfb4c8	mov x10,sp
00bfb4cc	csinc x9,x9,x10,ne
00bfb4d0	ldrb w9,[x9]
00bfb4d4	cmp w9,#0x2a
00bfb4d8	cset w20,eq
00bfb4dc	tbnz w8,#0x0,0x00bfb4ec
00bfb4e0	b 0x00bfb4fc
00bfb4e4	mov w20,wzr
00bfb4e8	tbz w8,#0x0,0x00bfb4fc
00bfb4ec	ldr x8,[sp]
00bfb4f0	ldr x0,[sp, #0x10]
00bfb4f4	and x1,x8,#-0x2
00bfb4f8	bl 0x00c2fe80
00bfb4fc	tbnz w20,#0x0,0x00bfb560
00bfb500	ldr x8,[x22, #0x248]
00bfb504	ldrb w9,[x8, #0x120]
00bfb508	tbnz w9,#0x0,0x00bfb520
00bfb50c	ldr q0,[x8, #0x120]
00bfb510	ldr x8,[x8, #0x130]
00bfb514	str q0,[sp]
00bfb518	str x8,[sp, #0x10]
00bfb51c	b 0x00bfb52c
00bfb520	ldp x2,x1,[x8, #0x128]
00bfb524	mov x0,sp
00bfb528	bl 0x007ff40c
00bfb52c	ldrb w8,[sp]
00bfb530	ldr x9,[sp, #0x10]
00bfb534	tst w8,#0x1
00bfb538	mov x8,sp
00bfb53c	csinc x1,x9,x8,ne
00bfb540	mov w0,#0x6
00bfb544	bl 0x00c43bd0
00bfb548	ldrb w8,[sp]
00bfb54c	tbz w8,#0x0,0x00bfb560
00bfb550	ldr x8,[sp]
00bfb554	ldr x0,[sp, #0x10]
00bfb558	and x1,x8,#-0x2
00bfb55c	bl 0x00c2fe80
00bfb560	ldp x20,x19,[sp, #0x50]
00bfb564	ldr x23,[sp, #0x30]
00bfb568	ldp x22,x21,[sp, #0x40]
00bfb56c	ldp x29,x30,[sp, #0x20]
00bfb570	add sp,sp,#0x60
00bfb574	autiasp
00bfb578	ret
00bfb57c	adrp x0,0xd27000
00bfb580	add x0,x0,#0x250
00bfb584	bl 0x00c2fe90
00bfb588	cbz w0,0x00bfb414
00bfb58c	bl 0x00c44420
00bfb590	mov x1,x0
00bfb594	adrp x0,0xd27000
00bfb598	add x0,x0,#0x248
00bfb59c	bl 0x00c30660
00bfb5a0	adrp x0,0xd27000
00bfb5a4	add x0,x0,#0x250
00bfb5a8	bl 0x00c2fea0
00bfb5ac	b 0x00bfb414
