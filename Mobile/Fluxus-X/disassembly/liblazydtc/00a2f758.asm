; EC_KEY_clear_flags @ 00a2f758
00a2f758	ldr w8,[x0, #0x3c]
00a2f75c	ldr x9,[x0, #0x68]
00a2f760	bic w8,w8,w1
00a2f764	add x9,x9,#0x1
00a2f768	str w8,[x0, #0x3c]
00a2f76c	str x9,[x0, #0x68]
00a2f770	ret
