; std::__ndk1::moneypunct_byname<wchar_t,true>::do_positive_sign @ 00bed15c
00bed15c	bti c
00bed160	mov x9,x0
00bed164	ldrb w10,[x9, #0x48]!
00bed168	tbnz w10,#0x0,0x00bed180
00bed16c	ldr q0,[x9]
00bed170	ldr x9,[x9, #0x10]
00bed174	str q0,[x8]
00bed178	str x9,[x8, #0x10]
00bed17c	ret
00bed180	ldp x2,x1,[x0, #0x50]
00bed184	mov x0,x8
00bed188	b 0x00bc5654
