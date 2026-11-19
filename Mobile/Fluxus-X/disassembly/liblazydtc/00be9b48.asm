; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_hour @ 00be9b48
00be9b48	paciasp
00be9b4c	stp x29,x30,[sp, #-0x20]!
00be9b50	stp x20,x19,[sp, #0x10]
00be9b54	mov x29,sp
00be9b58	mov x19,x4
00be9b5c	mov x0,x2
00be9b60	mov x20,x1
00be9b64	mov x1,x3
00be9b68	mov x2,x4
00be9b6c	mov x3,x5
00be9b70	mov w4,#0x2
00be9b74	bl 0x00bea2fc
00be9b78	ldr w8,[x19]
00be9b7c	cmp w0,#0x17
00be9b80	b.gt 0x00be9b90
00be9b84	tbnz w8,#0x2,0x00be9b90
00be9b88	str w0,[x20]
00be9b8c	b 0x00be9b98
00be9b90	orr w8,w8,#0x4
00be9b94	str w8,[x19]
00be9b98	ldp x20,x19,[sp, #0x10]
00be9b9c	ldp x29,x30,[sp], #0x20
00be9ba0	autiasp
00be9ba4	ret
