; OSSL_PARAM_construct_double @ 00a9f440
00a9f440	adrp x9,0x29c000
00a9f444	ldr q0,[x9, #0xc80]
00a9f448	orr w9,wzr,#0x3
00a9f44c	str x0,[x8]
00a9f450	str w9,[x8, #0x8]
00a9f454	str x1,[x8, #0x10]
00a9f458	stur q0,[x8, #0x18]
00a9f45c	ret
