; tls_parse_ctos_npn @ 009d7394
009d7394	ldr x8,[x0, #0x240]
009d7398	cbz x8,0x009d73ac
009d739c	ldr x8,[x0, #0x2c8]
009d73a0	cbz x8,0x009d73ac
009d73a4	mov w0,#0x1
009d73a8	ret
009d73ac	mov w8,#0x1
009d73b0	str w8,[x0, #0x484]
009d73b4	mov w0,#0x1
009d73b8	ret
