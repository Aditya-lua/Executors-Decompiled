; BIO_copy_next_retry @ 009fd1f8
009fd1f8	ldr x8,[x0, #0x48]
009fd1fc	ldr w10,[x0, #0x30]
009fd200	ldr w9,[x8, #0x30]
009fd204	and w9,w9,#0xf
009fd208	orr w9,w10,w9
009fd20c	str w9,[x0, #0x30]
009fd210	ldr w8,[x8, #0x34]
009fd214	str w8,[x0, #0x34]
009fd218	ret
