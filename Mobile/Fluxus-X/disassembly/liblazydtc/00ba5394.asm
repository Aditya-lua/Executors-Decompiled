; mbedtls_ripemd160_self_test @ 00ba5394
00ba5394	sub sp,sp,#0x110
00ba5398	stp x28,x27,[sp, #0xb0]
00ba539c	stp x26,x25,[sp, #0xc0]
00ba53a0	stp x24,x23,[sp, #0xd0]
00ba53a4	stp x22,x21,[sp, #0xe0]
00ba53a8	stp x20,x19,[sp, #0xf0]
00ba53ac	stp x29,x30,[sp, #0x100]
00ba53b0	add x29,sp,#0x100
00ba53b4	mrs x10,tpidr_el0
00ba53b8	adrp x9,0x29c000
00ba53bc	str x10,[sp, #0x8]
00ba53c0	ldr x10,[x10, #0x28]
00ba53c4	ldr q0,[x9, #0x2e0]
00ba53c8	add x8,sp,#0x40
00ba53cc	adrp x28,0x2d6000
00ba53d0	adrp x25,0x788000
00ba53d4	mov w19,w0
00ba53d8	mov x26,xzr
00ba53dc	add x28,x28,#0xd35
00ba53e0	mov w27,#0x51
00ba53e4	mov w20,#0x14
00ba53e8	add x25,x25,#0x2a8
00ba53ec	add x21,x8,#0x1c
00ba53f0	str q0,[sp, #0x10]
00ba53f4	stur x10,[x29, #-0x60]
00ba53f8	stp xzr,xzr,[sp, #0x28]
00ba53fc	str wzr,[sp, #0x38]
00ba5400	cbz w19,0x00ba5410
00ba5404	add w1,w26,#0x1
00ba5408	mov x0,x28
00ba540c	bl 0x00c41af0
00ba5410	add x0,sp,#0x40
00ba5414	mov w2,#0x5c
00ba5418	mov w1,wzr
00ba541c	bl 0x00c301c0
00ba5420	ldr q0,[sp, #0x10]
00ba5424	mov w8,#0xe1f0
00ba5428	movk w8,#0xc3d2, LSL #16
00ba542c	str w8,[sp, #0x58]
00ba5430	stur q0,[sp, #0x48]
00ba5434	cbz x26,0x00ba54b4
00ba5438	adrp x8,0x788000
00ba543c	add x8,x8,#0x268
00ba5440	ldr x23,[x8, x26, LSL #0x3]
00ba5444	adrp x8,0x787000
00ba5448	add x8,x8,#0xfe0
00ba544c	madd x24,x26,x27,x8
00ba5450	cmp x26,#0x7
00ba5454	str w23,[sp, #0x40]
00ba5458	b.ne 0x00ba54a4
00ba545c	mov x27,x28
00ba5460	sub x28,x23,#0x40
00ba5464	and x22,x28,#-0x40
00ba5468	add x0,sp,#0x40
00ba546c	mov x1,x24
00ba5470	bl 0x00c433f0
00ba5474	sub x23,x23,#0x40
00ba5478	cmp x23,#0x3f
00ba547c	add x24,x24,#0x40
00ba5480	b.hi 0x00ba5468
00ba5484	subs x23,x28,x22
00ba5488	mov x28,x27
00ba548c	mov w27,#0x51
00ba5490	b.eq 0x00ba54b4
00ba5494	adrp x8,0x787000
00ba5498	add x8,x8,#0xfe0
00ba549c	add x8,x8,x22
00ba54a0	add x24,x8,#0x277
00ba54a4	mov x0,x21
00ba54a8	mov x1,x24
00ba54ac	mov x2,x23
00ba54b0	bl 0x00c2ffd0
00ba54b4	add x0,sp,#0x40
00ba54b8	add x1,sp,#0x28
00ba54bc	bl 0x00c429b0
00ba54c0	add x0,sp,#0x40
00ba54c4	mov w1,#0x5c
00ba54c8	bl 0x00c42220
00ba54cc	madd x1,x26,x20,x25
00ba54d0	add x0,sp,#0x28
00ba54d4	mov w2,#0x14
00ba54d8	bl 0x00c300b0
00ba54dc	cbnz w0,0x00ba5510
00ba54e0	cbz w19,0x00ba54f0
00ba54e4	adrp x0,0x77c000
00ba54e8	add x0,x0,#0x87c
00ba54ec	bl 0x00c30760
00ba54f0	add x26,x26,#0x1
00ba54f4	cmp x26,#0x8
00ba54f8	b.cc 0x00ba5400
00ba54fc	cbz w19,0x00ba5508
00ba5500	mov w0,#0xa
00ba5504	bl 0x00c42240
00ba5508	mov w0,wzr
00ba550c	b 0x00ba5524
00ba5510	cbz w19,0x00ba5520
00ba5514	adrp x0,0x77c000
00ba5518	add x0,x0,#0x854
00ba551c	bl 0x00c30760
00ba5520	mov w0,#0x1
00ba5524	ldr x8,[sp, #0x8]
00ba5528	ldr x8,[x8, #0x28]
00ba552c	ldur x9,[x29, #-0x60]
00ba5530	cmp x8,x9
00ba5534	b.ne 0x00ba5558
00ba5538	ldp x29,x30,[sp, #0x100]
00ba553c	ldp x20,x19,[sp, #0xf0]
00ba5540	ldp x22,x21,[sp, #0xe0]
00ba5544	ldp x24,x23,[sp, #0xd0]
00ba5548	ldp x26,x25,[sp, #0xc0]
00ba554c	ldp x28,x27,[sp, #0xb0]
00ba5550	add sp,sp,#0x110
00ba5554	ret
00ba5558	bl 0x00c2fec0
