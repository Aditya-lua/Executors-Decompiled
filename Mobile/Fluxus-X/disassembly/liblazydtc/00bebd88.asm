; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_weekday @ 00bebd88
00bebd88	paciasp
00bebd8c	stp x29,x30,[sp, #-0x20]!
00bebd90	stp x20,x19,[sp, #0x10]
00bebd94	mov x29,sp
00bebd98	mov x19,x4
00bebd9c	mov x0,x2
00bebda0	mov x20,x1
00bebda4	mov x1,x3
00bebda8	mov x2,x4
00bebdac	mov x3,x5
00bebdb0	mov w4,#0x1
00bebdb4	bl 0x00bec028
00bebdb8	ldr w8,[x19]
00bebdbc	cmp w0,#0x6
00bebdc0	b.gt 0x00bebdd0
00bebdc4	tbnz w8,#0x2,0x00bebdd0
00bebdc8	str w0,[x20]
00bebdcc	b 0x00bebdd8
00bebdd0	orr w8,w8,#0x4
00bebdd4	str w8,[x19]
00bebdd8	ldp x20,x19,[sp, #0x10]
00bebddc	ldp x29,x30,[sp], #0x20
00bebde0	autiasp
00bebde4	ret
