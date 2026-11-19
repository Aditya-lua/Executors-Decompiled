; std::__ndk1::ctype<wchar_t>::do_scan_not @ 00bfc5e8
00bfc5e8	bti c
00bfc5ec	mov x0,x2
00bfc5f0	cmp x2,x3
00bfc5f4	b.eq 0x00bfc624
00bfc5f8	adrp x8,0x78a000
00bfc5fc	add x8,x8,#0x8e8
00bfc600	ldr w9,[x0]
00bfc604	cmp w9,#0x7f
00bfc608	b.hi 0x00bfc624
00bfc60c	ldr x9,[x8, x9, LSL #0x3]
00bfc610	tst x9,x1
00bfc614	b.eq 0x00bfc624
00bfc618	add x0,x0,#0x4
00bfc61c	cmp x0,x3
00bfc620	b.ne 0x00bfc600
00bfc624	ret
