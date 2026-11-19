; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_hour @ 00beb868
00beb868	paciasp
00beb86c	stp x29,x30,[sp, #-0x20]!
00beb870	stp x20,x19,[sp, #0x10]
00beb874	mov x29,sp
00beb878	mov x19,x4
00beb87c	mov x0,x2
00beb880	mov x20,x1
00beb884	mov x1,x3
00beb888	mov x2,x4
00beb88c	mov x3,x5
00beb890	mov w4,#0x2
00beb894	bl 0x00bec028
00beb898	ldr w8,[x19]
00beb89c	cmp w0,#0x17
00beb8a0	b.gt 0x00beb8b0
00beb8a4	tbnz w8,#0x2,0x00beb8b0
00beb8a8	str w0,[x20]
00beb8ac	b 0x00beb8b8
00beb8b0	orr w8,w8,#0x4
00beb8b4	str w8,[x19]
00beb8b8	ldp x20,x19,[sp, #0x10]
00beb8bc	ldp x29,x30,[sp], #0x20
00beb8c0	autiasp
00beb8c4	ret
