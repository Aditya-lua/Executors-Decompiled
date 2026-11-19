; EVP_PKEY_get0 @ 00a6d7ec
00a6d7ec	cbz x0,0x00a6d800
00a6d7f0	ldr x9,[x0, #0x60]
00a6d7f4	mov x8,x0
00a6d7f8	mov x0,xzr
00a6d7fc	cbz x9,0x00a6d804
00a6d800	ret
00a6d804	ldr x0,[x8, #0x20]
00a6d808	ret
