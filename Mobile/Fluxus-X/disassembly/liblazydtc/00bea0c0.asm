; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_year4 @ 00bea0c0
00bea0c0	paciasp
00bea0c4	stp x29,x30,[sp, #-0x20]!
00bea0c8	stp x20,x19,[sp, #0x10]
00bea0cc	mov x29,sp
00bea0d0	mov x20,x4
00bea0d4	mov x0,x2
00bea0d8	mov x19,x1
00bea0dc	mov x1,x3
00bea0e0	mov x2,x4
00bea0e4	mov x3,x5
00bea0e8	mov w4,#0x4
00bea0ec	bl 0x00bea2fc
00bea0f0	ldrb w8,[x20]
00bea0f4	tbnz w8,#0x2,0x00bea100
00bea0f8	sub w8,w0,#0x76c
00bea0fc	str w8,[x19]
00bea100	ldp x20,x19,[sp, #0x10]
00bea104	ldp x29,x30,[sp], #0x20
00bea108	autiasp
00bea10c	ret
