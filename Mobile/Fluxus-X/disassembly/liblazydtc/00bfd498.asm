; std::__ndk1::ctype_byname<wchar_t>::ctype_byname @ 00bfd498
00bfd498	paciasp
00bfd49c	sub sp,sp,#0x50
00bfd4a0	stp x29,x30,[sp, #0x30]
00bfd4a4	stp x20,x19,[sp, #0x40]
00bfd4a8	add x29,sp,#0x30
00bfd4ac	adrp x8,0xcb5000
00bfd4b0	mov x20,x1
00bfd4b4	mov x19,x0
00bfd4b8	ldr x8,[x8, #0xe28]
00bfd4bc	sub x9,x2,#0x1
00bfd4c0	add x8,x8,#0x10
00bfd4c4	stp x8,x9,[x0]
00bfd4c8	mov w0,#0x1fbf
00bfd4cc	mov x2,xzr
00bfd4d0	bl 0x00c43890
00bfd4d4	str x0,[x19, #0x10]
00bfd4d8	cbz x0,0x00bfd4f0
00bfd4dc	ldp x20,x19,[sp, #0x40]
00bfd4e0	ldp x29,x30,[sp, #0x30]
00bfd4e4	add sp,sp,#0x50
00bfd4e8	autiasp
00bfd4ec	ret
00bfd4f0	mov x0,sp
00bfd4f4	mov x1,x20
00bfd4f8	bl 0x00852d7c
00bfd4fc	adrp x0,0x2d8000
00bfd500	add x0,x0,#0xe00
00bfd504	add x8,sp,#0x18
00bfd508	mov x1,sp
00bfd50c	add x20,sp,#0x18
00bfd510	bl 0x00bfb964
00bfd514	ldrb w8,[sp, #0x18]
00bfd518	ldr x9,[sp, #0x28]
00bfd51c	tst w8,#0x1
00bfd520	csinc x0,x9,x20,ne
00bfd524	bl 0x00c43d00
00bfd528	ldrb w8,[sp, #0x18]
00bfd52c	mov x20,x0
00bfd530	tbz w8,#0x0,0x00bfd54c
00bfd534	ldr x8,[sp, #0x18]
00bfd538	ldr x0,[sp, #0x28]
00bfd53c	and x1,x8,#-0x2
00bfd540	bl 0x00c2fe80
00bfd544	b 0x00bfd54c
00bfd54c	ldrb w8,[sp]
00bfd550	tbz w8,#0x0,0x00bfd570
00bfd554	ldr x8,[sp]
00bfd558	ldr x0,[sp, #0x10]
00bfd55c	and x1,x8,#-0x2
00bfd560	bl 0x00c2fe80
00bfd564	b 0x00bfd570
00bfd570	mov x0,x19
00bfd574	bl 0x00c44510
00bfd578	mov x0,x20
00bfd57c	bl 0x00c2c090
