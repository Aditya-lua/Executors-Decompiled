; std::__ndk1::ios_base::sync_with_stdio @ 00bce5ec
00bce5ec	bti c
00bce5f0	adrp x10,0xcca000
00bce5f4	mov w9,w0
00bce5f8	ldrb w8,[x10, #0x600]
00bce5fc	strb w9,[x10, #0x600]
00bce600	mov w0,w8
00bce604	ret
