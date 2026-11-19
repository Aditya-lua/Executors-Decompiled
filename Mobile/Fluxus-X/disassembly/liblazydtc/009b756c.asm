; SSL_CTX_get0_certificate @ 009b756c
009b756c	ldr x8,[x0, #0x158]
009b7570	cbz x8,0x009b7580
009b7574	ldr x8,[x8]
009b7578	ldr x0,[x8]
009b757c	ret
009b7580	mov x0,xzr
009b7584	ret
