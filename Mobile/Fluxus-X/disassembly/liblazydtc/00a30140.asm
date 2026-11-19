; EC_KEY_METHOD_get_verify @ 00a30140
00a30140	cbz x1,0x00a3014c
00a30144	ldr x8,[x0, #0x68]
00a30148	str x8,[x1]
00a3014c	cbz x2,0x00a30158
00a30150	ldr x8,[x0, #0x70]
00a30154	str x8,[x2]
00a30158	ret
