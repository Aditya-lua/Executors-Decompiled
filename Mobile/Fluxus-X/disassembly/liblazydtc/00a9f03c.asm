; OSSL_PARAM_construct_size_t @ 00a9f03c
00a9f03c	adrp x9,0x29c000
00a9f040	ldr q0,[x9, #0xc80]
00a9f044	mov w9,#0x2
00a9f048	str x0,[x8]
00a9f04c	str w9,[x8, #0x8]
00a9f050	str x1,[x8, #0x10]
00a9f054	stur q0,[x8, #0x18]
00a9f058	ret
