; __cxa_guard_release @ 00c0d548
00c0d548	paciasp
00c0d54c	stp x29,x30,[sp, #-0x30]!
00c0d550	str x21,[sp, #0x10]
00c0d554	stp x20,x19,[sp, #0x20]
00c0d558	mov x29,sp
00c0d55c	mov w21,#0x1
00c0d560	mov x19,x0
00c0d564	stlrb w21,[x0]
00c0d568	adrp x0,0xd27000
00c0d56c	add x0,x0,#0xe08
00c0d570	bl 0x00c31ca0
00c0d574	cbnz w0,0x00c0d5b8
00c0d578	ldrb w20,[x19, #0x1]
00c0d57c	strb w21,[x19, #0x1]
00c0d580	adrp x0,0xd27000
00c0d584	add x0,x0,#0xe08
00c0d588	bl 0x00c31cb0
00c0d58c	cbnz w0,0x00c0d5c4
00c0d590	tbz w20,#0x2,0x00c0d5a4
00c0d594	adrp x0,0xd27000
00c0d598	add x0,x0,#0xe30
00c0d59c	bl 0x00c43a80
00c0d5a0	cbnz w0,0x00c0d5d8
00c0d5a4	ldp x20,x19,[sp, #0x20]
00c0d5a8	ldr x21,[sp, #0x10]
00c0d5ac	ldp x29,x30,[sp], #0x30
00c0d5b0	autiasp
00c0d5b4	ret
00c0d5b8	adrp x0,0x2ab000
00c0d5bc	add x0,x0,#0x2ae
00c0d5c0	b 0x00c0d5e0
00c0d5c4	adrp x0,0x2a1000
00c0d5c8	add x0,x0,#0x418
00c0d5cc	adrp x1,0x2b1000
00c0d5d0	add x1,x1,#0x192
00c0d5d4	bl 0x00c0de94
00c0d5d8	adrp x0,0x2d6000
00c0d5dc	add x0,x0,#0xea1
00c0d5e0	adrp x1,0x2b1000
00c0d5e4	add x1,x1,#0x192
00c0d5e8	bl 0x00c0de94
