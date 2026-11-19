; ossl_prov_bio_read_ex @ 00b1fbac
00b1fbac	adrp x8,0xd23000
00b1fbb0	ldr x4,[x8, #0x7c8]
00b1fbb4	cbz x4,0x00b1fbbc
00b1fbb8	br x4
00b1fbbc	mov w0,wzr
00b1fbc0	ret
