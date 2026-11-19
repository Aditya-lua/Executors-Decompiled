; std::__ndk1::ctype<wchar_t>::do_scan_is @ 00bfc5a4
00bfc5a4	bti c
00bfc5a8	mov x0,x2
00bfc5ac	cmp x2,x3
00bfc5b0	b.eq 0x00bfc5e4
00bfc5b4	adrp x8,0x78a000
00bfc5b8	add x8,x8,#0x8e8
00bfc5bc	b 0x00bfc5cc
00bfc5c0	add x0,x0,#0x4
00bfc5c4	cmp x0,x3
00bfc5c8	b.eq 0x00bfc5e4
00bfc5cc	ldr w9,[x0]
00bfc5d0	cmp w9,#0x7f
00bfc5d4	b.hi 0x00bfc5c0
00bfc5d8	ldr x9,[x8, x9, LSL #0x3]
00bfc5dc	tst x9,x1
00bfc5e0	b.eq 0x00bfc5c0
00bfc5e4	ret
