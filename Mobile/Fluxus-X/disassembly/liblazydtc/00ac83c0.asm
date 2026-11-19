; RAND_get0_private @ 00ac83c0
00ac83c0	stp x22,x21,[sp, #-0x30]!
00ac83c4	adrp x2,0xc7c000
00ac83c8	add x2,x2,#0xa38
00ac83cc	mov w1,#0x5
00ac83d0	stp x20,x19,[sp, #0x10]
00ac83d4	stp x29,x30,[sp, #0x20]
00ac83d8	add x29,sp,#0x20
00ac83dc	mov x21,x0
00ac83e0	bl 0x00c3b520
00ac83e4	cbz x0,0x00ac8464
00ac83e8	add x19,x0,#0x1c
00ac83ec	mov x22,x0
00ac83f0	mov x0,x19
00ac83f4	bl 0x00c38360
00ac83f8	mov x20,x0
00ac83fc	cbnz x0,0x00ac8468
00ac8400	mov x0,x21
00ac8404	bl 0x00ac7f78
00ac8408	mov x20,x0
00ac840c	cbz x0,0x00ac8468
00ac8410	mov x0,x21
00ac8414	bl 0x00c383c0
00ac8418	mov x21,x0
00ac841c	add x0,x22,#0x18
00ac8420	bl 0x00c38360
00ac8424	cbnz x0,0x00ac843c
00ac8428	adrp x2,0xac8000
00ac842c	add x2,x2,#0x9c8
00ac8430	mov x1,x21
00ac8434	bl 0x00c383b0
00ac8438	cbz w0,0x00ac8464
00ac843c	mov w2,#0x10000
00ac8440	mov w3,#0x1a4
00ac8444	mov x0,x21
00ac8448	mov x1,x20
00ac844c	bl 0x00ac871c
00ac8450	mov x20,x0
00ac8454	mov x0,x19
00ac8458	mov x1,x20
00ac845c	bl 0x00c38380
00ac8460	b 0x00ac8468
00ac8464	mov x20,xzr
00ac8468	mov x0,x20
00ac846c	ldp x29,x30,[sp, #0x20]
00ac8470	ldp x20,x19,[sp, #0x10]
00ac8474	ldp x22,x21,[sp], #0x30
00ac8478	ret
