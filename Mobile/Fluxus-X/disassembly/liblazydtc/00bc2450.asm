; FUN_00bc2450 @ 00bc2450
00bc2450	paciasp
00bc2454	stp x29,x30,[sp, #-0x20]!
00bc2458	str x19,[sp, #0x10]
00bc245c	mov x29,sp
00bc2460	ldrb w8,[x0, #0x8]
00bc2464	tbnz w8,#0x0,0x00bc2498
00bc2468	mov x19,x0
00bc246c	adrp x0,0xd26000
00bc2470	add x0,x0,#0x194
00bc2474	bl 0x00c31ca0
00bc2478	ldr x8,[x19]
00bc247c	str xzr,[x8]
00bc2480	adrp x0,0xd26000
00bc2484	add x0,x0,#0x194
00bc2488	bl 0x00c31cb0
00bc248c	adrp x0,0xd26000
00bc2490	add x0,x0,#0x1bc
00bc2494	bl 0x00c43a80
00bc2498	ldr x19,[sp, #0x10]
00bc249c	ldp x29,x30,[sp], #0x20
00bc24a0	autiasp
00bc24a4	ret
