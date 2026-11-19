; ossl_prov_bio_puts @ 00b1fbf4
00b1fbf4	adrp x8,0xd23000
00b1fbf8	ldr x2,[x8, #0x7e0]
00b1fbfc	cbz x2,0x00b1fc04
00b1fc00	br x2
00b1fc04	mov w0,#0xffffffff
00b1fc08	ret
