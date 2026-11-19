; ossl_prov_bio_new_file @ 00b1fb7c
00b1fb7c	adrp x8,0xd23000
00b1fb80	ldr x2,[x8, #0x7b8]
00b1fb84	cbz x2,0x00b1fb8c
00b1fb88	br x2
00b1fb8c	mov x0,xzr
00b1fb90	ret
