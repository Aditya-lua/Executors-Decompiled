; mbedtls_md_get_name @ 00b78fd8
00b78fd8	cbz x0,0x00b7900c
00b78fdc	ldr w8,[x0]
00b78fe0	sub w8,w8,#0x3
00b78fe4	cmp w8,#0x10
00b78fe8	b.hi 0x00b78ffc
00b78fec	adrp x9,0xca8000
00b78ff0	add x9,x9,#0x460
00b78ff4	ldr x8,[x9, w8, SXTW #0x3]
00b78ff8	b 0x00b79008
00b78ffc	adrp x8,0xca8000
00b79000	add x8,x8,#0x300
00b79004	add x8,x8,#0xc0
00b79008	ldr x0,[x8]
00b7900c	ret
