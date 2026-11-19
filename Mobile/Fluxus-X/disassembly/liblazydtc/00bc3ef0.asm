; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bc3ef0
00bc3ef0	bti c
00bc3ef4	ldrb w8,[x0]
00bc3ef8	tbnz w8,#0x0,0x00bc3f0c
00bc3efc	mov w9,#0x2
00bc3f00	mov x8,x0
00bc3f04	strb w9,[x8], #0x1
00bc3f08	b 0x00bc3f18
00bc3f0c	ldr x8,[x0, #0x10]
00bc3f10	mov w9,#0x1
00bc3f14	str x9,[x0, #0x8]
00bc3f18	strb w1,[x8]
00bc3f1c	strb wzr,[x8, #0x1]
00bc3f20	ret
