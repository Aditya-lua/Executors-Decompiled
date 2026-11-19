; FUN_00931c50 @ 00931c50
00931c50	tbnz x1,#0x3f,0x00931c68
00931c54	ldr w8,[x0, #0xadc]
00931c58	str x1,[x0, #0xab8]
00931c5c	orr w8,w8,#0x20
00931c60	str w8,[x0, #0xadc]
00931c64	ret
00931c68	ldr w8,[x0, #0xadc]
00931c6c	str xzr,[x0, #0xab8]
00931c70	and w8,w8,#0xffffffdf
00931c74	str w8,[x0, #0xadc]
00931c78	ret
