; std::__ndk1::ios_base::__set_badbit_and_consider_rethrow @ 00bce594
00bce594	bti c
00bce598	ldr w8,[x0, #0x20]
00bce59c	ldrb w9,[x0, #0x24]
00bce5a0	orr w8,w8,#0x1
00bce5a4	str w8,[x0, #0x20]
00bce5a8	tbnz w9,#0x0,0x00bce5b0
00bce5ac	ret
00bce5b0	paciasp
00bce5b4	stp x29,x30,[sp, #-0x10]!
00bce5b8	mov x29,sp
00bce5bc	bl 0x00c30170
