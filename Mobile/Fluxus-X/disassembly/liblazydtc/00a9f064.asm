; OSSL_PARAM_construct_time_t @ 00a9f064
00a9f064	adrp x9,0x29c000
00a9f068	ldr q0,[x9, #0xc80]
00a9f06c	mov w9,#0x1
00a9f070	str x0,[x8]
00a9f074	str w9,[x8, #0x8]
00a9f078	str x1,[x8, #0x10]
00a9f07c	stur q0,[x8, #0x18]
00a9f080	ret
