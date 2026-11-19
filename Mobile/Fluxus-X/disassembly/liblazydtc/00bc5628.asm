; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::basic_string @ 00bc5628
00bc5628	bti c
00bc562c	ldrb w8,[x1]
00bc5630	tbnz w8,#0x0,0x00bc5648
00bc5634	ldr x8,[x1, #0x10]
00bc5638	ldr q0,[x1]
00bc563c	str x8,[x0, #0x10]
00bc5640	str q0,[x0]
00bc5644	ret
00bc5648	ldp x2,x8,[x1, #0x8]
00bc564c	mov x1,x8
00bc5650	b 0x00bc5654
