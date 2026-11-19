; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_day_year_num @ 00beb92c
00beb92c	paciasp
00beb930	stp x29,x30,[sp, #-0x20]!
00beb934	stp x20,x19,[sp, #0x10]
00beb938	mov x29,sp
00beb93c	mov x19,x4
00beb940	mov x0,x2
00beb944	mov x20,x1
00beb948	mov x1,x3
00beb94c	mov x2,x4
00beb950	mov x3,x5
00beb954	mov w4,#0x3
00beb958	bl 0x00bec028
00beb95c	ldr w8,[x19]
00beb960	cmp w0,#0x16d
00beb964	b.gt 0x00beb974
00beb968	tbnz w8,#0x2,0x00beb974
00beb96c	str w0,[x20]
00beb970	b 0x00beb97c
00beb974	orr w8,w8,#0x4
00beb978	str w8,[x19]
00beb97c	ldp x20,x19,[sp, #0x10]
00beb980	ldp x29,x30,[sp], #0x20
00beb984	autiasp
00beb988	ret
