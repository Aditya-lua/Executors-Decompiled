; SSL_CIPHER_get_bits @ 009b0b20
009b0b20	cbz x0,0x009b0b34
009b0b24	cbz x1,0x009b0b30
009b0b28	ldr w8,[x0, #0x48]
009b0b2c	str w8,[x1]
009b0b30	ldr w0,[x0, #0x44]
009b0b34	ret
