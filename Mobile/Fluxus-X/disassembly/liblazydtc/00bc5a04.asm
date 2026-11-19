; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::operator= @ 00bc5a04
00bc5a04	bti c
00bc5a08	ldrb w8,[x0]
00bc5a0c	tbnz w8,#0x0,0x00bc5a24
00bc5a10	mov w9,#0x2
00bc5a14	mov x8,x0
00bc5a18	strb w9,[x8], #0x4
00bc5a1c	stp w1,wzr,[x8]
00bc5a20	ret
00bc5a24	ldr x8,[x0, #0x10]
00bc5a28	mov w9,#0x1
00bc5a2c	str x9,[x0, #0x8]
00bc5a30	stp w1,wzr,[x8]
00bc5a34	ret
