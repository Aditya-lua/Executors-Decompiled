; EC_GROUP_precompute_mult @ 00a321fc
00a321fc	ldr x8,[x0]
00a32200	ldr x9,[x8, #0xe0]
00a32204	cbz x9,0x00a32214
00a32208	ldr x2,[x8, #0xe8]
00a3220c	cbz x2,0x00a32218
00a32210	br x2
00a32214	b 0x00c3b120
00a32218	mov w0,#0x1
00a3221c	ret
