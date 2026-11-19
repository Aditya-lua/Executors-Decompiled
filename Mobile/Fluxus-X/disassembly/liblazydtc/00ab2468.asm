; a2i_ASN1_ENUMERATED @ 00ab2468
00ab2468	str x19,[sp, #-0x20]!
00ab246c	stp x29,x30,[sp, #0x10]
00ab2470	add x29,sp,#0x10
00ab2474	mov x19,x1
00ab2478	bl 0x00ab213c
00ab247c	cmp w0,#0x1
00ab2480	b.ne 0x00ab2494
00ab2484	ldr w8,[x19, #0x4]
00ab2488	and w8,w8,#0x100
00ab248c	orr w8,w8,#0x2
00ab2490	str w8,[x19, #0x4]
00ab2494	ldp x29,x30,[sp, #0x10]
00ab2498	ldr x19,[sp], #0x20
00ab249c	ret
