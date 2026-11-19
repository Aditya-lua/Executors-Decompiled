; mbedtls_md_info_from_type @ 00b7887c
00b7887c	sub w8,w0,#0x3
00b78880	cmp w8,#0x10
00b78884	b.hi 0x00b78898
00b78888	adrp x9,0xca8000
00b7888c	add x9,x9,#0x3d0
00b78890	ldr x0,[x9, w8, SXTW #0x3]
00b78894	ret
00b78898	mov x0,xzr
00b7889c	ret
