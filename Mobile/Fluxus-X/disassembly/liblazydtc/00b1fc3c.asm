; ossl_prov_bio_free @ 00b1fc3c
00b1fc3c	adrp x8,0xd23000
00b1fc40	ldr x1,[x8, #0x7f8]
00b1fc44	cbz x1,0x00b1fc4c
00b1fc48	br x1
00b1fc4c	mov w0,wzr
00b1fc50	ret
