; curl_easy_strerror @ 00941a00
00941a00	cmp w0,#0x65
00941a04	b.hi 0x00941a18
00941a08	adrp x8,0xc4f000
00941a0c	add x8,x8,#0xca0
00941a10	ldr x0,[x8, w0, SXTW #0x3]
00941a14	ret
00941a18	adrp x0,0x2a7000
00941a1c	add x0,x0,#0x503
00941a20	ret
