; ossl_prov_bio_up_ref @ 00b1fc24
00b1fc24	adrp x8,0xd23000
00b1fc28	ldr x1,[x8, #0x7f0]
00b1fc2c	cbz x1,0x00b1fc34
00b1fc30	br x1
00b1fc34	mov w0,wzr
00b1fc38	ret
