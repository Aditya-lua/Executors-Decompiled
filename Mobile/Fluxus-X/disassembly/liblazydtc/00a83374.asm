; ossl_tolower @ 00a83374
00a83374	sub w8,w0,#0x41
00a83378	eor w9,w0,#0x20
00a8337c	cmp w8,#0x1a
00a83380	csel w0,w9,w0,cc
00a83384	ret
