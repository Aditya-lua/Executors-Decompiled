; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::operator= @ 00bcea68
00bcea68	paciasp
00bcea6c	stp x29,x30,[sp, #-0x20]!
00bcea70	stp x20,x19,[sp, #0x10]
00bcea74	mov x29,sp
00bcea78	mov x19,x1
00bcea7c	mov x20,x0
00bcea80	add x0,x0,#0x8
00bcea84	add x1,x1,#0x8
00bcea88	bl 0x00c43f00
00bcea8c	ldr q0,[x19, #0x10]
00bcea90	mov x0,x20
00bcea94	str q0,[x20, #0x10]
00bcea98	ldr q0,[x19, #0x20]
00bcea9c	str q0,[x20, #0x20]
00bceaa0	ldr q0,[x19, #0x30]
00bceaa4	str q0,[x20, #0x30]
00bceaa8	ldp x20,x19,[sp, #0x10]
00bceaac	ldp x29,x30,[sp], #0x20
00bceab0	autiasp
00bceab4	ret
