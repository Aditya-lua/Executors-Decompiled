; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_month @ 00be9c6c
00be9c6c	paciasp
00be9c70	stp x29,x30,[sp, #-0x20]!
00be9c74	stp x20,x19,[sp, #0x10]
00be9c78	mov x29,sp
00be9c7c	mov x19,x4
00be9c80	mov x0,x2
00be9c84	mov x20,x1
00be9c88	mov x1,x3
00be9c8c	mov x2,x4
00be9c90	mov x3,x5
00be9c94	mov w4,#0x2
00be9c98	bl 0x00bea2fc
00be9c9c	ldr w9,[x19]
00be9ca0	sub w8,w0,#0x1
00be9ca4	cmp w8,#0xb
00be9ca8	b.hi 0x00be9cb8
00be9cac	tbnz w9,#0x2,0x00be9cb8
00be9cb0	str w8,[x20]
00be9cb4	b 0x00be9cc0
00be9cb8	orr w8,w9,#0x4
00be9cbc	str w8,[x19]
00be9cc0	ldp x20,x19,[sp, #0x10]
00be9cc4	ldp x29,x30,[sp], #0x20
00be9cc8	autiasp
00be9ccc	ret
