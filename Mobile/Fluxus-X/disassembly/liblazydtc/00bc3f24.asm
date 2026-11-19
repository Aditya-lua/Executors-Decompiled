; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__init @ 00bc3f24
00bc3f24	paciasp
00bc3f28	stp x29,x30,[sp, #-0x30]!
00bc3f2c	stp x22,x21,[sp, #0x10]
00bc3f30	stp x20,x19,[sp, #0x20]
00bc3f34	mov x29,sp
00bc3f38	cmn x2,#0x8
00bc3f3c	b.cs 0x00bc3fb4
00bc3f40	mov x19,x2
00bc3f44	mov x20,x0
00bc3f48	cmp x2,#0x17
00bc3f4c	b.cs 0x00bc3f60
00bc3f50	lsl w8,w19,#0x1
00bc3f54	strb w8,[x20], #0x1
00bc3f58	cbnz x19,0x00bc3f90
00bc3f5c	b 0x00bc3f9c
00bc3f60	orr x8,x19,#0x7
00bc3f64	mov w9,#0x1a
00bc3f68	mov x22,x1
00bc3f6c	cmp x8,#0x17
00bc3f70	csinc x21,x9,x8,eq
00bc3f74	mov x0,x21
00bc3f78	bl 0x00c2fed0
00bc3f7c	orr x8,x21,#0x1
00bc3f80	mov x1,x22
00bc3f84	stp x19,x0,[x20, #0x8]
00bc3f88	str x8,[x20]
00bc3f8c	mov x20,x0
00bc3f90	mov x0,x20
00bc3f94	mov x2,x19
00bc3f98	bl 0x00c2ff60
00bc3f9c	strb wzr,[x20, x19]
00bc3fa0	ldp x20,x19,[sp, #0x20]
00bc3fa4	ldp x22,x21,[sp, #0x10]
00bc3fa8	ldp x29,x30,[sp], #0x30
00bc3fac	autiasp
00bc3fb0	ret
00bc3fb4	bl 0x007fe124
