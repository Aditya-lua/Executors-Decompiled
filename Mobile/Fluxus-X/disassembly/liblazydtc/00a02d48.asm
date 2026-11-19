; BN_is_word @ 00a02d48
00a02d48	ldr w8,[x0, #0x8]
00a02d4c	cmp w8,#0x1
00a02d50	b.ne 0x00a02d78
00a02d54	ldr x9,[x0]
00a02d58	ldr x9,[x9]
00a02d5c	cmp x9,x1
00a02d60	b.ne 0x00a02d78
00a02d64	cbz x1,0x00a02d90
00a02d68	ldr w8,[x0, #0x10]
00a02d6c	cmp w8,#0x0
00a02d70	cset w0,eq
00a02d74	ret
00a02d78	mov w0,wzr
00a02d7c	cbz x1,0x00a02d84
00a02d80	ret
00a02d84	cmp w8,#0x0
00a02d88	cset w0,eq
00a02d8c	ret
00a02d90	mov w0,#0x1
00a02d94	ret
