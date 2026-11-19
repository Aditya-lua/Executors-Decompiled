; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_day @ 00beb804
00beb804	paciasp
00beb808	stp x29,x30,[sp, #-0x20]!
00beb80c	stp x20,x19,[sp, #0x10]
00beb810	mov x29,sp
00beb814	mov x19,x4
00beb818	mov x0,x2
00beb81c	mov x20,x1
00beb820	mov x1,x3
00beb824	mov x2,x4
00beb828	mov x3,x5
00beb82c	mov w4,#0x2
00beb830	bl 0x00bec028
00beb834	ldr w8,[x19]
00beb838	sub w9,w0,#0x1
00beb83c	cmp w9,#0x1e
00beb840	b.hi 0x00beb850
00beb844	tbnz w8,#0x2,0x00beb850
00beb848	str w0,[x20]
00beb84c	b 0x00beb858
00beb850	orr w8,w8,#0x4
00beb854	str w8,[x19]
00beb858	ldp x20,x19,[sp, #0x10]
00beb85c	ldp x29,x30,[sp], #0x20
00beb860	autiasp
00beb864	ret
