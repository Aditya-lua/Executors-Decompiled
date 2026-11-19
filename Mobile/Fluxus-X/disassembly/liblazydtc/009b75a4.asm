; SSL_get_current_cipher @ 009b75a4
009b75a4	ldr x8,[x0, #0x918]
009b75a8	cbz x8,0x009b75b8
009b75ac	ldr x0,[x8, #0x2f8]
009b75b0	cbz x0,0x009b75b8
009b75b4	ret
009b75b8	mov x0,xzr
009b75bc	ret
