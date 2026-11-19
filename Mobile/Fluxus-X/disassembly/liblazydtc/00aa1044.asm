; ossl_pw_enable_passphrase_caching @ 00aa1044
00aa1044	ldrb w9,[x0, #0x18]
00aa1048	mov x8,x0
00aa104c	mov w0,#0x1
00aa1050	orr w9,w9,#0x1
00aa1054	strb w9,[x8, #0x18]
00aa1058	ret
