; EVP_CIPHER_get0_description @ 00a5f5a4
00a5f5a4	ldr x8,[x0, #0x70]
00a5f5a8	cbz x8,0x00a5f5b4
00a5f5ac	mov x0,x8
00a5f5b0	ret
00a5f5b4	ldr w0,[x0]
00a5f5b8	b 0x00c34d80
