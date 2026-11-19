; EVP_RAND_get_params @ 00ac9778
00ac9778	ldr x2,[x0, #0xa0]
00ac977c	cbz x2,0x00ac9788
00ac9780	mov x0,x1
00ac9784	br x2
00ac9788	mov w0,#0x1
00ac978c	ret
