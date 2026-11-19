; ossl_prov_bio_ctrl @ 00b1fc0c
00b1fc0c	adrp x8,0xd23000
00b1fc10	ldr x4,[x8, #0x7e8]
00b1fc14	cbz x4,0x00b1fc1c
00b1fc18	br x4
00b1fc1c	mov w0,#0xffffffff
00b1fc20	ret
