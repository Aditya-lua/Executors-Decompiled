; SSL_client_hello_get0_ciphers @ 009b88a4
009b88a4	ldr x8,[x0, #0xb58]
009b88a8	cbz x8,0x009b88c4
009b88ac	cbz x1,0x009b88bc
009b88b0	ldr x8,[x8, #0x158]
009b88b4	str x8,[x1]
009b88b8	ldr x8,[x0, #0xb58]
009b88bc	ldr x0,[x8, #0x160]
009b88c0	ret
009b88c4	mov x0,xzr
009b88c8	ret
