; ossl_pw_disable_passphrase_caching @ 00aa105c
00aa105c	ldrb w9,[x0, #0x18]
00aa1060	mov x8,x0
00aa1064	mov w0,#0x1
00aa1068	and w9,w9,#0xfe
00aa106c	strb w9,[x8, #0x18]
00aa1070	ret
