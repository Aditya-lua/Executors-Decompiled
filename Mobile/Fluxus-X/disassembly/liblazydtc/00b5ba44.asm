; ossl_rand_pool_init @ 00b5ba44
00b5ba44	adrp x8,0xd23000
00b5ba48	add x8,x8,#0x828
00b5ba4c	mov w9,#0xffffffff
00b5ba50	mov w0,#0x1
00b5ba54	str w9,[x8]
00b5ba58	str w9,[x8, #0x28]
00b5ba5c	str w9,[x8, #0x50]
00b5ba60	str w9,[x8, #0x78]
00b5ba64	ret
