; ossl_ctype_check @ 00a8331c
00a8331c	cmp w0,#0x7f
00a83320	mov w8,wzr
00a83324	b.hi 0x00a8333c
00a83328	adrp x8,0x766000
00a8332c	add x8,x8,#0xc40
00a83330	ldrh w8,[x8, w0, SXTW #0x1]
00a83334	tst w8,w1
00a83338	cset w8,ne
00a8333c	mov w0,w8
00a83340	ret
