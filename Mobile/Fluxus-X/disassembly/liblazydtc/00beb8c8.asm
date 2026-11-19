; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_12_hour @ 00beb8c8
00beb8c8	paciasp
00beb8cc	stp x29,x30,[sp, #-0x20]!
00beb8d0	stp x20,x19,[sp, #0x10]
00beb8d4	mov x29,sp
00beb8d8	mov x19,x4
00beb8dc	mov x0,x2
00beb8e0	mov x20,x1
00beb8e4	mov x1,x3
00beb8e8	mov x2,x4
00beb8ec	mov x3,x5
00beb8f0	mov w4,#0x2
00beb8f4	bl 0x00bec028
00beb8f8	ldr w8,[x19]
00beb8fc	sub w9,w0,#0x1
00beb900	cmp w9,#0xb
00beb904	b.hi 0x00beb914
00beb908	tbnz w8,#0x2,0x00beb914
00beb90c	str w0,[x20]
00beb910	b 0x00beb91c
00beb914	orr w8,w8,#0x4
00beb918	str w8,[x19]
00beb91c	ldp x20,x19,[sp, #0x10]
00beb920	ldp x29,x30,[sp], #0x20
00beb924	autiasp
00beb928	ret
