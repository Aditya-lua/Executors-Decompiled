; SSL_client_hello_get0_legacy_version @ 009b8840
009b8840	ldr x8,[x0, #0xb58]
009b8844	cbz x8,0x009b8850
009b8848	ldr w0,[x8, #0x4]
009b884c	ret
009b8850	mov w0,wzr
009b8854	ret
