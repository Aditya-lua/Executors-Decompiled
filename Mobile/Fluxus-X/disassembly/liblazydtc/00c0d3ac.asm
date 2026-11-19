; std::__ndk1::__match_any_but_newline<wchar_t>::__exec @ 00c0d3ac
00c0d3ac	bti c
00c0d3b0	ldp x8,x9,[x1, #0x10]
00c0d3b4	cmp x8,x9
00c0d3b8	b.eq 0x00c0d3d8
00c0d3bc	ldr w9,[x8]
00c0d3c0	mov w10,#0xffffdfd8
00c0d3c4	add w10,w9,w10
00c0d3c8	cmp w10,#0x2
00c0d3cc	ccmp w9,#0xd,#0x4,cs
00c0d3d0	ccmp w9,#0xa,#0x4,ne
00c0d3d4	b.ne 0x00c0d3e8
00c0d3d8	mov w9,#0xfffffc1f
00c0d3dc	str xzr,[x1, #0x50]
00c0d3e0	str w9,[x1]
00c0d3e4	ret
00c0d3e8	add x10,x8,#0x4
00c0d3ec	ldr x8,[x0, #0x8]
00c0d3f0	mov w9,#0xfffffc1d
00c0d3f4	str w9,[x1]
00c0d3f8	str x10,[x1, #0x10]
00c0d3fc	str x8,[x1, #0x50]
00c0d400	ret
