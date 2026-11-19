; ossl_toupper @ 00a83388
00a83388	sub w8,w0,#0x61
00a8338c	eor w9,w0,#0x20
00a83390	cmp w8,#0x1a
00a83394	csel w0,w9,w0,cc
00a83398	ret
