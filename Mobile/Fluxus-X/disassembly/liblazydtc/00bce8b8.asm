; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sbumpc @ 00bce8b8
00bce8b8	bti c
00bce8bc	ldp x8,x9,[x0, #0x18]
00bce8c0	cmp x8,x9
00bce8c4	b.eq 0x00bce8d8
00bce8c8	add x9,x8,#0x1
00bce8cc	str x9,[x0, #0x18]
00bce8d0	ldrb w0,[x8]
00bce8d4	ret
00bce8d8	ldr x8,[x0]
00bce8dc	ldr x16,[x8, #0x50]
00bce8e0	br x16
