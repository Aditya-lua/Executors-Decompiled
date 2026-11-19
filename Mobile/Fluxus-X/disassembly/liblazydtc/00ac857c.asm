; RAND_get0_public @ 00ac857c
00ac857c	stp x22,x21,[sp, #-0x30]!
00ac8580	adrp x2,0xc7c000
00ac8584	add x2,x2,#0xa38
00ac8588	mov w1,#0x5
00ac858c	stp x20,x19,[sp, #0x10]
00ac8590	stp x29,x30,[sp, #0x20]
00ac8594	add x29,sp,#0x20
00ac8598	mov x21,x0
00ac859c	bl 0x00c3b520
00ac85a0	cbz x0,0x00ac8620
00ac85a4	add x19,x0,#0x18
00ac85a8	mov x22,x0
00ac85ac	mov x0,x19
00ac85b0	bl 0x00c38360
00ac85b4	mov x20,x0
00ac85b8	cbnz x0,0x00ac8624
00ac85bc	mov x0,x21
00ac85c0	bl 0x00ac7f78
00ac85c4	mov x20,x0
00ac85c8	cbz x0,0x00ac8624
00ac85cc	mov x0,x21
00ac85d0	bl 0x00c383c0
00ac85d4	mov x21,x0
00ac85d8	add x0,x22,#0x1c
00ac85dc	bl 0x00c38360
00ac85e0	cbnz x0,0x00ac85f8
00ac85e4	adrp x2,0xac8000
00ac85e8	add x2,x2,#0x9c8
00ac85ec	mov x1,x21
00ac85f0	bl 0x00c383b0
00ac85f4	cbz w0,0x00ac8620
00ac85f8	mov w2,#0x10000
00ac85fc	mov w3,#0x1a4
00ac8600	mov x0,x21
00ac8604	mov x1,x20
00ac8608	bl 0x00ac871c
00ac860c	mov x20,x0
00ac8610	mov x0,x19
00ac8614	mov x1,x20
00ac8618	bl 0x00c38380
00ac861c	b 0x00ac8624
00ac8620	mov x20,xzr
00ac8624	mov x0,x20
00ac8628	ldp x29,x30,[sp, #0x20]
00ac862c	ldp x20,x19,[sp, #0x10]
00ac8630	ldp x22,x21,[sp], #0x30
00ac8634	ret
