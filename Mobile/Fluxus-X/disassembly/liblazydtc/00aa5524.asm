; CRYPTO_atomic_or @ 00aa5524
00aa5524	ldaxr x8,[x0]
00aa5528	orr x8,x8,x1
00aa552c	stlxr w9,x8,[x0]
00aa5530	cbnz w9,0x00aa5524
00aa5534	mov w0,#0x1
00aa5538	str x8,[x2]
00aa553c	ret
