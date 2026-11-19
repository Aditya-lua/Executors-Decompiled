; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::~basic_string @ 00bc3c8c
00bc3c8c	bti c
00bc3c90	ldrb w8,[x0]
00bc3c94	tbnz w8,#0x0,0x00bc3c9c
00bc3c98	ret
00bc3c9c	ldr x8,[x0, #0x10]
00bc3ca0	ldr x9,[x0]
00bc3ca4	and x1,x9,#-0x2
00bc3ca8	mov x0,x8
00bc3cac	b 0x00c2fe80
