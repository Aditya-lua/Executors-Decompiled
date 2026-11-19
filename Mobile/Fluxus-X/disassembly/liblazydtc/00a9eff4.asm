; OSSL_PARAM_construct_int64 @ 00a9eff4
00a9eff4	adrp x9,0x29c000
00a9eff8	ldr q0,[x9, #0xc80]
00a9effc	mov w9,#0x1
00a9f000	str x0,[x8]
00a9f004	str w9,[x8, #0x8]
00a9f008	str x1,[x8, #0x10]
00a9f00c	stur q0,[x8, #0x18]
00a9f010	ret
