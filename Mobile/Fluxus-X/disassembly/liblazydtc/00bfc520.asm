; std::__ndk1::ctype<wchar_t>::do_is @ 00bfc520
00bfc520	bti c
00bfc524	cmp w2,#0x7f
00bfc528	b.hi 0x00bfc544
00bfc52c	adrp x8,0x78a000
00bfc530	add x8,x8,#0x8e8
00bfc534	ldr x8,[x8, w2, UXTW #0x3]
00bfc538	tst x8,x1
00bfc53c	cset w0,ne
00bfc540	ret
00bfc544	mov w0,wzr
00bfc548	ret
