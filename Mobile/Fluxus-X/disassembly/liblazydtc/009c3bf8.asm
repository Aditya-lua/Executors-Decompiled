; ssl_hmac_final @ 009c3bf8
009c3bf8	ldr x8,[x0]
009c3bfc	cbz x8,0x009c3c08
009c3c00	mov x0,x8
009c3c04	b 0x00c363b0
009c3c08	ldr x8,[x0, #0x8]
009c3c0c	cbz x8,0x009c3c14
009c3c10	b 0x00c36630
009c3c14	mov w0,wzr
009c3c18	ret
