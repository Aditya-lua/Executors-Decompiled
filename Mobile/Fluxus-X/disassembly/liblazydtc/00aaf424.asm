; OBJ_find_sigid_by_algs @ 00aaf424
00aaf424	sub sp,sp,#0x40
00aaf428	stp x20,x19,[sp, #0x20]
00aaf42c	adrp x20,0xd22000
00aaf430	mov x19,x0
00aaf434	ldr x0,[x20, #0x198]
00aaf438	add x8,sp,#0x10
00aaf43c	stp x29,x30,[sp, #0x30]
00aaf440	add x29,sp,#0x30
00aaf444	str x8,[sp, #0x8]
00aaf448	stp w1,w2,[sp, #0x14]
00aaf44c	cbz x0,0x00aaf478
00aaf450	add x1,sp,#0x10
00aaf454	bl 0x00c34760
00aaf458	tbnz w0,#0x1f,0x00aaf478
00aaf45c	mov w1,w0
00aaf460	ldr x0,[x20, #0x198]
00aaf464	bl 0x00c32610
00aaf468	str x0,[sp, #0x8]
00aaf46c	add x0,sp,#0x8
00aaf470	cbnz x19,0x00aaf4a0
00aaf474	b 0x00aaf4ac
00aaf478	adrp x1,0xc79000
00aaf47c	adrp x4,0xaaf000
00aaf480	add x1,x1,#0xd98
00aaf484	add x4,x4,#0x680
00aaf488	add x0,sp,#0x8
00aaf48c	mov w2,#0x2c
00aaf490	mov w3,#0x8
00aaf494	bl 0x00c35830
00aaf498	cbz x0,0x00aaf4b0
00aaf49c	cbz x19,0x00aaf4ac
00aaf4a0	ldr x8,[x0]
00aaf4a4	ldr w8,[x8]
00aaf4a8	str w8,[x19]
00aaf4ac	mov w0,#0x1
00aaf4b0	ldp x29,x30,[sp, #0x30]
00aaf4b4	ldp x20,x19,[sp, #0x20]
00aaf4b8	add sp,sp,#0x40
00aaf4bc	ret
