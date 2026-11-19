; std::__ndk1::moneypunct_byname<char,false>::do_positive_sign @ 00bece68
00bece68	bti c
00bece6c	mov x9,x0
00bece70	ldrb w10,[x9, #0x48]!
00bece74	tbnz w10,#0x0,0x00bece8c
00bece78	ldr q0,[x9]
00bece7c	ldr x9,[x9, #0x10]
00bece80	str q0,[x8]
00bece84	str x9,[x8, #0x10]
00bece88	ret
00bece8c	ldp x2,x1,[x0, #0x50]
00bece90	mov x0,x8
00bece94	b 0x007ff40c
