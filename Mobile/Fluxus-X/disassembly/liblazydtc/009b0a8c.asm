; SSL_CIPHER_get_version @ 009b0a8c
009b0a8c	cbz x0,0x009b0aa8
009b0a90	ldr w0,[x0, #0x2c]
009b0a94	cmp w0,#0x301
009b0a98	b.ne 0x009b0ab4
009b0a9c	adrp x0,0x2af000
009b0aa0	add x0,x0,#0x62b
009b0aa4	ret
009b0aa8	adrp x0,0x2a1000
009b0aac	add x0,x0,#0xdbf
009b0ab0	ret
009b0ab4	b 0x00c35450
