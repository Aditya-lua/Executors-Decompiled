; OSSL_PARAM_construct_long @ 00a9ebf0
00a9ebf0	adrp x9,0x29c000
00a9ebf4	ldr q0,[x9, #0xc80]
00a9ebf8	mov w9,#0x1
00a9ebfc	str x0,[x8]
00a9ec00	str w9,[x8, #0x8]
00a9ec04	str x1,[x8, #0x10]
00a9ec08	stur q0,[x8, #0x18]
00a9ec0c	ret
