; ossl_provider_set_fallback @ 00aa4350
00aa4350	cbz x0,0x00aa4364
00aa4354	ldrb w8,[x0]
00aa4358	orr w8,w8,#0x4
00aa435c	strb w8,[x0]
00aa4360	mov w0,#0x1
00aa4364	ret
