; OSSL_ENCODER_CTX_get_num_encoders @ 00a61b28
00a61b28	cbz x0,0x00a61b38
00a61b2c	ldr x0,[x0, #0x18]
00a61b30	cbz x0,0x00a61b38
00a61b34	b 0x00c325e0
00a61b38	mov w0,wzr
00a61b3c	ret
