; ossl_provider_teardown @ 00aa33a0
00aa33a0	ldr x1,[x0, #0x70]
00aa33a4	cbz x1,0x00aa33b8
00aa33a8	ldrb w8,[x0, #0xc8]
00aa33ac	tbnz w8,#0x0,0x00aa33b8
00aa33b0	ldr x0,[x0, #0xd0]
00aa33b4	br x1
00aa33b8	ret
