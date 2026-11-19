; ossl_siv128_set_tag @ 00b2683c
00b2683c	cmp x2,#0x10
00b26840	mov w8,wzr
00b26844	b.ne 0x00b26854
00b26848	ldr q0,[x1]
00b2684c	mov w8,#0x1
00b26850	str q0,[x0, #0x10]
00b26854	mov w0,w8
00b26858	ret
