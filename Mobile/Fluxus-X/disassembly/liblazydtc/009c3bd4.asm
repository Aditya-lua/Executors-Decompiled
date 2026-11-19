; ssl_hmac_update @ 009c3bd4
009c3bd4	ldr x8,[x0]
009c3bd8	cbz x8,0x009c3be4
009c3bdc	mov x0,x8
009c3be0	b 0x00c363e0
009c3be4	ldr x8,[x0, #0x8]
009c3be8	cbz x8,0x009c3bf0
009c3bec	b 0x00c36680
009c3bf0	mov w0,wzr
009c3bf4	ret
