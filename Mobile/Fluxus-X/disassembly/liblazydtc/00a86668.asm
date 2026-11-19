; EVP_CIPHER_meth_set_get_asn1_params @ 00a86668
00a86668	ldr x9,[x0, #0x48]
00a8666c	mov x8,x0
00a86670	mov w0,wzr
00a86674	cbz x9,0x00a8667c
00a86678	ret
00a8667c	mov w0,#0x1
00a86680	str x1,[x8, #0x48]
00a86684	ret
