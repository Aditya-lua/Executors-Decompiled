; std::__ndk1::ios_base::__set_failbit_and_consider_rethrow @ 00bce5c0
00bce5c0	bti c
00bce5c4	ldr w8,[x0, #0x20]
00bce5c8	ldrb w9,[x0, #0x24]
00bce5cc	orr w8,w8,#0x4
00bce5d0	str w8,[x0, #0x20]
00bce5d4	tbnz w9,#0x2,0x00bce5dc
00bce5d8	ret
00bce5dc	paciasp
00bce5e0	stp x29,x30,[sp, #-0x10]!
00bce5e4	mov x29,sp
00bce5e8	bl 0x00c30170
