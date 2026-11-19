; curl_url_strerror @ 00941a70
00941a70	cmp w0,#0x1f
00941a74	b.hi 0x00941a88
00941a78	adrp x8,0xc50000
00941a7c	add x8,x8,#0x70
00941a80	ldr x0,[x8, w0, SXTW #0x3]
00941a84	ret
00941a88	adrp x0,0x2b9000
00941a8c	add x0,x0,#0x361
00941a90	ret
