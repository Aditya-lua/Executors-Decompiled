; curl_share_strerror @ 00941a4c
00941a4c	cmp w0,#0x5
00941a50	b.hi 0x00941a64
00941a54	adrp x8,0xc50000
00941a58	add x8,x8,#0x40
00941a5c	ldr x0,[x8, w0, SXTW #0x3]
00941a60	ret
00941a64	adrp x0,0x2a3000
00941a68	add x0,x0,#0x77e
00941a6c	ret
