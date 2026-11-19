; ossl_prov_bio_gets @ 00b1fbdc
00b1fbdc	adrp x8,0xd23000
00b1fbe0	ldr x3,[x8, #0x7d8]
00b1fbe4	cbz x3,0x00b1fbec
00b1fbe8	br x3
00b1fbec	mov w0,#0xffffffff
00b1fbf0	ret
