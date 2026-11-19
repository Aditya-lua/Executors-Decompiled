; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::basic_streambuf @ 00bce9cc
00bce9cc	paciasp
00bce9d0	stp x29,x30,[sp, #-0x20]!
00bce9d4	str x19,[sp, #0x10]
00bce9d8	mov x29,sp
00bce9dc	adrp x8,0xcb4000
00bce9e0	mov x19,x0
00bce9e4	ldr x8,[x8, #0xa08]
00bce9e8	add x8,x8,#0x10
00bce9ec	str x8,[x0], #0x8
00bce9f0	bl 0x00c30480
00bce9f4	movi v0.2D,#0x0
00bce9f8	stp q0,q0,[x19, #0x20]
00bce9fc	str q0,[x19, #0x10]
00bcea00	ldr x19,[sp, #0x10]
00bcea04	ldp x29,x30,[sp], #0x20
00bcea08	autiasp
00bcea0c	ret
