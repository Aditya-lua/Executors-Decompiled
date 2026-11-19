; SSL_get_srp_N @ 009c8f14
009c8f14	mov x8,x0
009c8f18	ldr x0,[x0, #0xbf8]
009c8f1c	cbz x0,0x009c8f24
009c8f20	ret
009c8f24	ldr x8,[x8, #0x9a8]
009c8f28	ldr x0,[x8, #0x340]
009c8f2c	ret
