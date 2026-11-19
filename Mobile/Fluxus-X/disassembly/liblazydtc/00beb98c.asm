; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_month @ 00beb98c
00beb98c	paciasp
00beb990	stp x29,x30,[sp, #-0x20]!
00beb994	stp x20,x19,[sp, #0x10]
00beb998	mov x29,sp
00beb99c	mov x19,x4
00beb9a0	mov x0,x2
00beb9a4	mov x20,x1
00beb9a8	mov x1,x3
00beb9ac	mov x2,x4
00beb9b0	mov x3,x5
00beb9b4	mov w4,#0x2
00beb9b8	bl 0x00bec028
00beb9bc	ldr w9,[x19]
00beb9c0	sub w8,w0,#0x1
00beb9c4	cmp w8,#0xb
00beb9c8	b.hi 0x00beb9d8
00beb9cc	tbnz w9,#0x2,0x00beb9d8
00beb9d0	str w8,[x20]
00beb9d4	b 0x00beb9e0
00beb9d8	orr w8,w9,#0x4
00beb9dc	str w8,[x19]
00beb9e0	ldp x20,x19,[sp, #0x10]
00beb9e4	ldp x29,x30,[sp], #0x20
00beb9e8	autiasp
00beb9ec	ret
