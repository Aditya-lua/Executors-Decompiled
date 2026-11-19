; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::basic_string @ 00bc5730
00bc5730	bti c
00bc5734	ldrb w8,[x1]
00bc5738	tbnz w8,#0x0,0x00bc5750
00bc573c	ldr x8,[x1, #0x10]
00bc5740	ldr q0,[x1]
00bc5744	str x8,[x0, #0x10]
00bc5748	str q0,[x0]
00bc574c	ret
00bc5750	ldp x2,x8,[x1, #0x8]
00bc5754	mov x1,x8
00bc5758	b 0x00bc5654
