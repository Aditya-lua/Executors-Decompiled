; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_weekday @ 00bea060
00bea060	paciasp
00bea064	stp x29,x30,[sp, #-0x20]!
00bea068	stp x20,x19,[sp, #0x10]
00bea06c	mov x29,sp
00bea070	mov x19,x4
00bea074	mov x0,x2
00bea078	mov x20,x1
00bea07c	mov x1,x3
00bea080	mov x2,x4
00bea084	mov x3,x5
00bea088	mov w4,#0x1
00bea08c	bl 0x00bea2fc
00bea090	ldr w8,[x19]
00bea094	cmp w0,#0x6
00bea098	b.gt 0x00bea0a8
00bea09c	tbnz w8,#0x2,0x00bea0a8
00bea0a0	str w0,[x20]
00bea0a4	b 0x00bea0b0
00bea0a8	orr w8,w8,#0x4
00bea0ac	str w8,[x19]
00bea0b0	ldp x20,x19,[sp, #0x10]
00bea0b4	ldp x29,x30,[sp], #0x20
00bea0b8	autiasp
00bea0bc	ret
