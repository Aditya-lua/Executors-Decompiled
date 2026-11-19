; mbedtls_ecjpake_set_point_format @ 00ba06b8
00ba06b8	cmp w1,#0x1
00ba06bc	mov x8,x0
00ba06c0	b.hi 0x00ba06d0
00ba06c4	mov w0,wzr
00ba06c8	str w1,[x8, #0xcc]
00ba06cc	ret
00ba06d0	mov w0,#0xffffb080
00ba06d4	ret
