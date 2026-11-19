; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_streambuf @ 00bd2858
00bd2858	paciasp
00bd285c	stp x29,x30,[sp, #-0x20]!
00bd2860	str x19,[sp, #0x10]
00bd2864	mov x29,sp
00bd2868	adrp x8,0xcb5000
00bd286c	mov x19,x0
00bd2870	ldr x8,[x8, #0xb88]
00bd2874	add x8,x8,#0x10
00bd2878	str x8,[x0], #0x8
00bd287c	bl 0x00c30480
00bd2880	movi v0.2D,#0x0
00bd2884	stp q0,q0,[x19, #0x20]
00bd2888	str q0,[x19, #0x10]
00bd288c	ldr x19,[sp, #0x10]
00bd2890	ldp x29,x30,[sp], #0x20
00bd2894	autiasp
00bd2898	ret
