; EC_KEY_METHOD_get_sign @ 00a30118
00a30118	cbz x1,0x00a30124
00a3011c	ldr x8,[x0, #0x50]
00a30120	str x8,[x1]
00a30124	cbz x2,0x00a30130
00a30128	ldr x8,[x0, #0x58]
00a3012c	str x8,[x2]
00a30130	cbz x3,0x00a3013c
00a30134	ldr x8,[x0, #0x60]
00a30138	str x8,[x3]
00a3013c	ret
