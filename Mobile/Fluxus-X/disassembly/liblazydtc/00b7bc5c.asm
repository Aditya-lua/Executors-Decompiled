; mbedtls_psa_get_random @ 00b7bc5c
00b7bc5c	stp x29,x30,[sp, #-0x10]!
00b7bc60	mov x29,sp
00b7bc64	mov x0,x1
00b7bc68	mov x1,x2
00b7bc6c	bl 0x00c42cb0
00b7bc70	cmp w0,#0x0
00b7bc74	mov w8,#0xffffffc4
00b7bc78	csel w0,wzr,w8,eq
00b7bc7c	ldp x29,x30,[sp], #0x10
00b7bc80	ret
