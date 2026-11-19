; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::basic_streambuf @ 00bcea10
00bcea10	paciasp
00bcea14	stp x29,x30,[sp, #-0x20]!
00bcea18	stp x20,x19,[sp, #0x10]
00bcea1c	mov x29,sp
00bcea20	adrp x8,0xcb4000
00bcea24	mov x19,x1
00bcea28	add x1,x1,#0x8
00bcea2c	ldr x8,[x8, #0xa08]
00bcea30	mov x20,x0
00bcea34	add x8,x8,#0x10
00bcea38	str x8,[x0], #0x8
00bcea3c	bl 0x00c30660
00bcea40	ldr q0,[x19, #0x10]
00bcea44	str q0,[x20, #0x10]
00bcea48	ldr q0,[x19, #0x20]
00bcea4c	str q0,[x20, #0x20]
00bcea50	ldr q0,[x19, #0x30]
00bcea54	str q0,[x20, #0x30]
00bcea58	ldp x20,x19,[sp, #0x10]
00bcea5c	ldp x29,x30,[sp], #0x20
00bcea60	autiasp
00bcea64	ret
