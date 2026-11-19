; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_year @ 00beb130
00beb130	paciasp
00beb134	stp x29,x30,[sp, #-0x20]!
00beb138	stp x20,x19,[sp, #0x10]
00beb13c	mov x29,sp
00beb140	mov x20,x4
00beb144	mov x0,x2
00beb148	mov x19,x1
00beb14c	mov x1,x3
00beb150	mov x2,x4
00beb154	mov x3,x5
00beb158	mov w4,#0x4
00beb15c	bl 0x00bec028
00beb160	ldrb w8,[x20]
00beb164	tbnz w8,#0x2,0x00beb188
00beb168	add w8,w0,#0x76c
00beb16c	cmp w0,#0x64
00beb170	add w9,w0,#0x7d0
00beb174	csel w8,w8,w0,cc
00beb178	cmp w0,#0x45
00beb17c	csel w8,w9,w8,lt
00beb180	sub w8,w8,#0x76c
00beb184	str w8,[x19]
00beb188	ldp x20,x19,[sp, #0x10]
00beb18c	ldp x29,x30,[sp], #0x20
00beb190	autiasp
00beb194	ret
