; std::__ndk1::moneypunct_byname<char,false>::do_grouping @ 00bece08
00bece08	bti c
00bece0c	mov x9,x0
00bece10	ldrb w10,[x9, #0x18]!
00bece14	tbnz w10,#0x0,0x00bece2c
00bece18	ldr q0,[x9]
00bece1c	ldr x9,[x9, #0x10]
00bece20	str q0,[x8]
00bece24	str x9,[x8, #0x10]
00bece28	ret
00bece2c	ldp x2,x1,[x0, #0x20]
00bece30	mov x0,x8
00bece34	b 0x007ff40c
