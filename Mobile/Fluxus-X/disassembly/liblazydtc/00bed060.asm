; std::__ndk1::moneypunct_byname<wchar_t,false>::do_positive_sign @ 00bed060
00bed060	bti c
00bed064	mov x9,x0
00bed068	ldrb w10,[x9, #0x48]!
00bed06c	tbnz w10,#0x0,0x00bed084
00bed070	ldr q0,[x9]
00bed074	ldr x9,[x9, #0x10]
00bed078	str q0,[x8]
00bed07c	str x9,[x8, #0x10]
00bed080	ret
00bed084	ldp x2,x1,[x0, #0x50]
00bed088	mov x0,x8
00bed08c	b 0x00bc5654
