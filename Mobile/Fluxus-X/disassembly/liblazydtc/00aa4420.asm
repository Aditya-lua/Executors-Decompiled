; ossl_provider_get_capabilities @ 00aa4420
00aa4420	ldr x4,[x0, #0x88]
00aa4424	cbz x4,0x00aa4430
00aa4428	ldr x0,[x0, #0xd0]
00aa442c	br x4
00aa4430	mov w0,#0x1
00aa4434	ret
