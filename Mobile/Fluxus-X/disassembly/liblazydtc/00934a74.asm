; FUN_00934a74 @ 00934a74
00934a74	stp xzr,xzr,[x0]
00934a78	str xzr,[x0, #0x10]
00934a7c	cbz x1,0x00934a8c
00934a80	cbz w2,0x00934a8c
00934a84	str x1,[x0]
00934a88	str w2,[x0, #0xc]
00934a8c	ret
