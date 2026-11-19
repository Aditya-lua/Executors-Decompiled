; FUN_00931c24 @ 00931c24
00931c24	tbnz x1,#0x3f,0x00931c3c
00931c28	ldr w8,[x0, #0xadc]
00931c2c	str x1,[x0, #0xab0]
00931c30	orr w8,w8,#0x40
00931c34	str w8,[x0, #0xadc]
00931c38	ret
00931c3c	ldr w8,[x0, #0xadc]
00931c40	str xzr,[x0, #0xab0]
00931c44	and w8,w8,#0xffffffbf
00931c48	str w8,[x0, #0xadc]
00931c4c	ret
