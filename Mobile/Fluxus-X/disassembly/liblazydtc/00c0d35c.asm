; std::__ndk1::__match_any_but_newline<char>::__exec @ 00c0d35c
00c0d35c	bti c
00c0d360	ldp x8,x9,[x1, #0x10]
00c0d364	cmp x8,x9
00c0d368	b.eq 0x00c0d380
00c0d36c	ldrb w9,[x8]
00c0d370	cmp w9,#0xd
00c0d374	b.eq 0x00c0d380
00c0d378	cmp w9,#0xa
00c0d37c	b.ne 0x00c0d390
00c0d380	mov w9,#0xfffffc1f
00c0d384	str xzr,[x1, #0x50]
00c0d388	str w9,[x1]
00c0d38c	ret
00c0d390	add x10,x8,#0x1
00c0d394	ldr x8,[x0, #0x8]
00c0d398	mov w9,#0xfffffc1d
00c0d39c	str w9,[x1]
00c0d3a0	str x10,[x1, #0x10]
00c0d3a4	str x8,[x1, #0x50]
00c0d3a8	ret
