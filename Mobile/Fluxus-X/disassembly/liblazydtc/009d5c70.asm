; SSL_get_srtp_profiles @ 009d5c70
009d5c70	cbz x0,0x009d5c94
009d5c74	mov x8,x0
009d5c78	ldr x0,[x0, #0xb90]
009d5c7c	cbnz x0,0x009d5c90
009d5c80	ldr x8,[x8, #0x9a8]
009d5c84	cbz x8,0x009d5c94
009d5c88	ldr x0,[x8, #0x3b8]
009d5c8c	cbz x0,0x009d5c94
009d5c90	ret
009d5c94	mov x0,xzr
009d5c98	ret
