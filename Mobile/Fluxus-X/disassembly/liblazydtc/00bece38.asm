; std::__ndk1::moneypunct_byname<char,false>::do_curr_symbol @ 00bece38
00bece38	bti c
00bece3c	mov x9,x0
00bece40	ldrb w10,[x9, #0x30]!
00bece44	tbnz w10,#0x0,0x00bece5c
00bece48	ldr q0,[x9]
00bece4c	ldr x9,[x9, #0x10]
00bece50	str q0,[x8]
00bece54	str x9,[x8, #0x10]
00bece58	ret
00bece5c	ldp x2,x1,[x0, #0x38]
00bece60	mov x0,x8
00bece64	b 0x007ff40c
