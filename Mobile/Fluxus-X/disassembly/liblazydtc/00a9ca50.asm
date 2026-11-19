; WPACKET_set_flags @ 00a9ca50
00a9ca50	ldr x8,[x0, #0x28]
00a9ca54	cbz x8,0x00a9ca64
00a9ca58	mov w0,#0x1
00a9ca5c	str w1,[x8, #0x20]
00a9ca60	ret
00a9ca64	mov w0,wzr
00a9ca68	ret
