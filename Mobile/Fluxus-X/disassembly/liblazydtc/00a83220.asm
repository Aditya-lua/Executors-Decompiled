; CRYPTO_memcmp @ 00a83220
00a83220	cbz x2,0x00a8324c
00a83224	mov w8,wzr
00a83228	ldrb w9,[x0], #0x1
00a8322c	ldrb w10,[x1], #0x1
00a83230	subs x2,x2,#0x1
00a83234	eor w9,w10,w9
00a83238	and w9,w9,#0xff
00a8323c	orr w8,w8,w9
00a83240	b.ne 0x00a83228
00a83244	mov w0,w8
00a83248	ret
00a8324c	mov w0,wzr
00a83250	ret
