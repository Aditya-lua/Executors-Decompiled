; curl_multi_strerror @ 00941a24
00941a24	add w8,w0,#0x1
00941a28	cmp w8,#0xd
00941a2c	b.hi 0x00941a40
00941a30	adrp x9,0xc4f000
00941a34	add x9,x9,#0xfd0
00941a38	ldr x0,[x9, w8, SXTW #0x3]
00941a3c	ret
00941a40	adrp x0,0x2a7000
00941a44	add x0,x0,#0x503
00941a48	ret
