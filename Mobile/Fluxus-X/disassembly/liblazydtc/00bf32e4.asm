; std::__ndk1::messages<char>::do_get @ 00bf32e4
00bf32e4	bti c
00bf32e8	ldrb w9,[x4]
00bf32ec	tbnz w9,#0x0,0x00bf3304
00bf32f0	ldr q0,[x4]
00bf32f4	ldr x9,[x4, #0x10]
00bf32f8	str q0,[x8]
00bf32fc	str x9,[x8, #0x10]
00bf3300	ret
00bf3304	ldp x2,x1,[x4, #0x8]
00bf3308	mov x0,x8
00bf330c	b 0x007ff40c
