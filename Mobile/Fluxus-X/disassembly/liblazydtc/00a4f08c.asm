; OSSL_DECODER_get_params @ 00a4f08c
00a4f08c	cbz x0,0x00a4f0a0
00a4f090	ldr x2,[x0, #0x48]
00a4f094	cbz x2,0x00a4f0a0
00a4f098	mov x0,x1
00a4f09c	br x2
00a4f0a0	mov w0,wzr
00a4f0a4	ret
