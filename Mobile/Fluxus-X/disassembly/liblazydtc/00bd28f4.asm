; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator= @ 00bd28f4
00bd28f4	paciasp
00bd28f8	stp x29,x30,[sp, #-0x20]!
00bd28fc	stp x20,x19,[sp, #0x10]
00bd2900	mov x29,sp
00bd2904	mov x19,x1
00bd2908	mov x20,x0
00bd290c	add x0,x0,#0x8
00bd2910	add x1,x1,#0x8
00bd2914	bl 0x00c43f00
00bd2918	ldr q0,[x19, #0x10]
00bd291c	mov x0,x20
00bd2920	str q0,[x20, #0x10]
00bd2924	ldr q0,[x19, #0x20]
00bd2928	str q0,[x20, #0x20]
00bd292c	ldr q0,[x19, #0x30]
00bd2930	str q0,[x20, #0x30]
00bd2934	ldp x20,x19,[sp, #0x10]
00bd2938	ldp x29,x30,[sp], #0x20
00bd293c	autiasp
00bd2940	ret
