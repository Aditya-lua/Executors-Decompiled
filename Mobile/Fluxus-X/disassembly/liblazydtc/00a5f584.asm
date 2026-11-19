; EVP_CIPHER_get0_name @ 00a5f584
00a5f584	ldr x8,[x0, #0x68]
00a5f588	cbz x8,0x00a5f594
00a5f58c	mov x0,x8
00a5f590	ret
00a5f594	ldr w0,[x0]
00a5f598	b 0x00c324f0
