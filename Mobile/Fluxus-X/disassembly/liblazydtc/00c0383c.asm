; std::__ndk1::__time_get_c_storage<wchar_t>::__months @ 00c0383c
00c0383c	paciasp
00c03840	stp x29,x30,[sp, #-0x20]!
00c03844	str x19,[sp, #0x10]
00c03848	mov x29,sp
00c0384c	adrp x8,0xd27000
00c03850	add x8,x8,#0x338
00c03854	adrp x19,0xd27000
00c03858	ldarb w8,[x8]
00c0385c	tbz w8,#0x0,0x00c03874
00c03860	ldr x0,[x19, #0x330]
00c03864	ldr x19,[sp, #0x10]
00c03868	ldp x29,x30,[sp], #0x20
00c0386c	autiasp
00c03870	ret
00c03874	adrp x0,0xd27000
00c03878	add x0,x0,#0x338
00c0387c	bl 0x00c2fe90
00c03880	cbz w0,0x00c03860
00c03884	bl 0x00c038bc
00c03888	adrp x8,0xd27000
00c0388c	add x8,x8,#0x8f8
00c03890	adrp x0,0xd27000
00c03894	add x0,x0,#0x338
00c03898	str x8,[x19, #0x330]
00c0389c	bl 0x00c2fea0
00c038a0	b 0x00c03860
