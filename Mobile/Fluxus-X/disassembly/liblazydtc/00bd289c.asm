; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_streambuf @ 00bd289c
00bd289c	paciasp
00bd28a0	stp x29,x30,[sp, #-0x20]!
00bd28a4	stp x20,x19,[sp, #0x10]
00bd28a8	mov x29,sp
00bd28ac	adrp x8,0xcb5000
00bd28b0	mov x19,x1
00bd28b4	add x1,x1,#0x8
00bd28b8	ldr x8,[x8, #0xb88]
00bd28bc	mov x20,x0
00bd28c0	add x8,x8,#0x10
00bd28c4	str x8,[x0], #0x8
00bd28c8	bl 0x00c30660
00bd28cc	ldr q0,[x19, #0x10]
00bd28d0	str q0,[x20, #0x10]
00bd28d4	ldr q0,[x19, #0x20]
00bd28d8	str q0,[x20, #0x20]
00bd28dc	ldr q0,[x19, #0x30]
00bd28e0	str q0,[x20, #0x30]
00bd28e4	ldp x20,x19,[sp, #0x10]
00bd28e8	ldp x29,x30,[sp], #0x20
00bd28ec	autiasp
00bd28f0	ret
