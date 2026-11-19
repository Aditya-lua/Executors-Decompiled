; EVP_MD_get0_description @ 00a5f678
00a5f678	ldr x8,[x0, #0x68]
00a5f67c	cbz x8,0x00a5f688
00a5f680	mov x0,x8
00a5f684	ret
00a5f688	ldr w0,[x0]
00a5f68c	b 0x00c34d80
