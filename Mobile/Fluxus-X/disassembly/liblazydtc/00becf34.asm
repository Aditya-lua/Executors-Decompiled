; std::__ndk1::moneypunct_byname<char,true>::do_curr_symbol @ 00becf34
00becf34	bti c
00becf38	mov x9,x0
00becf3c	ldrb w10,[x9, #0x30]!
00becf40	tbnz w10,#0x0,0x00becf58
00becf44	ldr q0,[x9]
00becf48	ldr x9,[x9, #0x10]
00becf4c	str q0,[x8]
00becf50	str x9,[x8, #0x10]
00becf54	ret
00becf58	ldp x2,x1,[x0, #0x38]
00becf5c	mov x0,x8
00becf60	b 0x007ff40c
