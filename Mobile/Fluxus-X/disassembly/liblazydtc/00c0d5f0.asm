; __cxa_guard_abort @ 00c0d5f0
00c0d5f0	paciasp
00c0d5f4	stp x29,x30,[sp, #-0x20]!
00c0d5f8	stp x20,x19,[sp, #0x10]
00c0d5fc	mov x29,sp
00c0d600	mov x19,x0
00c0d604	adrp x0,0xd27000
00c0d608	add x0,x0,#0xe08
00c0d60c	bl 0x00c31ca0
00c0d610	cbnz w0,0x00c0d654
00c0d614	ldrb w20,[x19, #0x1]
00c0d618	str wzr,[x19, #0x4]
00c0d61c	strb wzr,[x19, #0x1]
00c0d620	adrp x0,0xd27000
00c0d624	add x0,x0,#0xe08
00c0d628	bl 0x00c31cb0
00c0d62c	cbnz w0,0x00c0d660
00c0d630	tbz w20,#0x2,0x00c0d644
00c0d634	adrp x0,0xd27000
00c0d638	add x0,x0,#0xe30
00c0d63c	bl 0x00c43a80
00c0d640	cbnz w0,0x00c0d674
00c0d644	ldp x20,x19,[sp, #0x10]
00c0d648	ldp x29,x30,[sp], #0x20
00c0d64c	autiasp
00c0d650	ret
00c0d654	adrp x0,0x2ab000
00c0d658	add x0,x0,#0x2ae
00c0d65c	b 0x00c0d67c
00c0d660	adrp x0,0x2a1000
00c0d664	add x0,x0,#0x418
00c0d668	adrp x1,0x2c6000
00c0d66c	add x1,x1,#0x9e6
00c0d670	bl 0x00c0de94
00c0d674	adrp x0,0x2d6000
00c0d678	add x0,x0,#0xea1
00c0d67c	adrp x1,0x2c6000
00c0d680	add x1,x1,#0x9e6
00c0d684	bl 0x00c0de94
