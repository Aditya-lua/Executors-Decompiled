; std::__ndk1::basic_ifstream<char,std::__ndk1::char_traits<char>>::open @ 00bd7e38
00bd7e38	paciasp
00bd7e3c	stp x29,x30,[sp, #-0x20]!
00bd7e40	str x19,[sp, #0x10]
00bd7e44	mov x29,sp
00bd7e48	mov x19,x0
00bd7e4c	add x0,x0,#0x10
00bd7e50	orr w2,w2,#0x8
00bd7e54	bl 0x00c30120
00bd7e58	ldr x8,[x19]
00bd7e5c	ldur x9,[x8, #-0x18]
00bd7e60	mov x8,x0
00bd7e64	add x0,x19,x9
00bd7e68	cbz x8,0x00bd7e74
00bd7e6c	mov w1,wzr
00bd7e70	b 0x00bd7e7c
00bd7e74	ldr w8,[x0, #0x20]
00bd7e78	orr w1,w8,#0x4
00bd7e7c	ldr x19,[sp, #0x10]
00bd7e80	ldp x29,x30,[sp], #0x20
00bd7e84	autiasp
00bd7e88	b 0x00c30130
