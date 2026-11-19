; BN_is_odd @ 00a02e3c
00a02e3c	ldr w8,[x0, #0x8]
00a02e40	cmp w8,#0x1
00a02e44	b.lt 0x00a02e58
00a02e48	ldr x8,[x0]
00a02e4c	ldr w8,[x8]
00a02e50	and w0,w8,#0x1
00a02e54	ret
00a02e58	mov w0,wzr
00a02e5c	ret
