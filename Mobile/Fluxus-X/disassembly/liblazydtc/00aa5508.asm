; CRYPTO_atomic_add @ 00aa5508
00aa5508	ldaxr w8,[x0]
00aa550c	add w8,w8,w1
00aa5510	stlxr w9,w8,[x0]
00aa5514	cbnz w9,0x00aa5508
00aa5518	mov w0,#0x1
00aa551c	str w8,[x2]
00aa5520	ret
