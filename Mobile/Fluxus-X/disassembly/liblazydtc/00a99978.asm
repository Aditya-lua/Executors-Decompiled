; CRYPTO_get_mem_functions @ 00a99978
00a99978	cbz x0,0x00a99988
00a9997c	adrp x8,0xcc9000
00a99980	ldr x8,[x8, #0x138]
00a99984	str x8,[x0]
00a99988	cbz x1,0x00a99998
00a9998c	adrp x8,0xcc9000
00a99990	ldr x8,[x8, #0x140]
00a99994	str x8,[x1]
00a99998	cbz x2,0x00a999a8
00a9999c	adrp x8,0xcc9000
00a999a0	ldr x8,[x8, #0x148]
00a999a4	str x8,[x2]
00a999a8	ret
