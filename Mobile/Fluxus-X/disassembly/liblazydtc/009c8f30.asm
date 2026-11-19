; SSL_get_srp_username @ 009c8f30
009c8f30	mov x8,x0
009c8f34	ldr x0,[x0, #0xbf0]
009c8f38	cbz x0,0x009c8f40
009c8f3c	ret
009c8f40	ldr x8,[x8, #0x9a8]
009c8f44	ldr x0,[x8, #0x338]
009c8f48	ret
