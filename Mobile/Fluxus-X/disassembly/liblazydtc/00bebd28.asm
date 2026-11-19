; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_second @ 00bebd28
00bebd28	paciasp
00bebd2c	stp x29,x30,[sp, #-0x20]!
00bebd30	stp x20,x19,[sp, #0x10]
00bebd34	mov x29,sp
00bebd38	mov x19,x4
00bebd3c	mov x0,x2
00bebd40	mov x20,x1
00bebd44	mov x1,x3
00bebd48	mov x2,x4
00bebd4c	mov x3,x5
00bebd50	mov w4,#0x2
00bebd54	bl 0x00bec028
00bebd58	ldr w8,[x19]
00bebd5c	cmp w0,#0x3c
00bebd60	b.gt 0x00bebd70
00bebd64	tbnz w8,#0x2,0x00bebd70
00bebd68	str w0,[x20]
00bebd6c	b 0x00bebd78
00bebd70	orr w8,w8,#0x4
00bebd74	str w8,[x19]
00bebd78	ldp x20,x19,[sp, #0x10]
00bebd7c	ldp x29,x30,[sp], #0x20
00bebd80	autiasp
00bebd84	ret
