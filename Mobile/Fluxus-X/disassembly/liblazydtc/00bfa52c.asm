; FUN_00bfa52c @ 00bfa52c
00bfa52c	paciasp
00bfa530	sub sp,sp,#0x50
00bfa534	stp x29,x30,[sp, #0x20]
00bfa538	stp x22,x21,[sp, #0x30]
00bfa53c	stp x20,x19,[sp, #0x40]
00bfa540	add x29,sp,#0x20
00bfa544	adrp x20,0xcb5000
00bfa548	mov x19,x1
00bfa54c	mov x21,x0
00bfa550	ldr x20,[x20, #0xd60]
00bfa554	str x20,[sp, #0x8]
00bfa558	ldar x8,[x20]
00bfa55c	cmn x8,#0x1
00bfa560	b.eq 0x00bfa58c
00bfa564	add x8,sp,#0x8
00bfa568	sub x9,x29,#0x8
00bfa56c	adrp x0,0xcb5000
00bfa570	stur x8,[x29, #-0x8]
00bfa574	nop
00bfa578	adr x2,0xc0bab0
00bfa57c	str x9,[sp, #0x10]
00bfa580	add x1,sp,#0x10
00bfa584	ldr x0,[x0, #0xd60]
00bfa588	bl 0x00c305d0
00bfa58c	ldp x8,x10,[x19, #0x10]
00bfa590	ldrsw x9,[x20, #0x8]
00bfa594	sub x22,x9,#0x1
00bfa598	sub x9,x10,x8
00bfa59c	cmp x22,x9, ASR #0x3
00bfa5a0	b.cs 0x00bfa640
00bfa5a4	ldr x19,[x8, x22, LSL #0x3]
00bfa5a8	cbz x19,0x00bfa640
00bfa5ac	add x1,x19,#0x8
00bfa5b0	mov w0,#0x1
00bfa5b4	bl 0x00c2bce0
00bfa5b8	mov x20,x21
00bfa5bc	ldp x8,x9,[x20, #0x10]!
00bfa5c0	sub x9,x9,x8
00bfa5c4	asr x10,x9,#0x3
00bfa5c8	cmp x10,x22
00bfa5cc	b.hi 0x00bfa5f8
00bfa5d0	add x9,x22,#0x1
00bfa5d4	subs x1,x9,x10
00bfa5d8	b.ls 0x00bfa5ec
00bfa5dc	mov x0,x20
00bfa5e0	bl 0x00c0b6e4
00bfa5e4	ldr x8,[x20]
00bfa5e8	b 0x00bfa5f8
00bfa5ec	b.cs 0x00bfa5f8
00bfa5f0	add x9,x8,x9, LSL #0x3
00bfa5f4	str x9,[x21, #0x18]
00bfa5f8	ldr x21,[x8, x22, LSL #0x3]
00bfa5fc	cbz x21,0x00bfa620
00bfa600	add x1,x21,#0x8
00bfa604	mov x0,#-0x1
00bfa608	bl 0x00c2bd10
00bfa60c	cbnz x0,0x00bfa620
00bfa610	ldr x8,[x21]
00bfa614	mov x0,x21
00bfa618	ldr x8,[x8, #0x10]
00bfa61c	blr x8
00bfa620	ldr x8,[x20]
00bfa624	str x19,[x8, x22, LSL #0x3]
00bfa628	ldp x20,x19,[sp, #0x40]
00bfa62c	ldp x22,x21,[sp, #0x30]
00bfa630	ldp x29,x30,[sp, #0x20]
00bfa634	add sp,sp,#0x50
00bfa638	autiasp
00bfa63c	ret
00bfa640	bl 0x00bd8968
