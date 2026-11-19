; std::__ndk1::moneypunct_byname<wchar_t,true>::do_negative_sign @ 00bed18c
00bed18c	bti c
00bed190	mov x9,x0
00bed194	ldrb w10,[x9, #0x60]!
00bed198	tbnz w10,#0x0,0x00bed1b0
00bed19c	ldr q0,[x9]
00bed1a0	ldr x9,[x9, #0x10]
00bed1a4	str q0,[x8]
00bed1a8	str x9,[x8, #0x10]
00bed1ac	ret
00bed1b0	ldp x2,x1,[x0, #0x68]
00bed1b4	mov x0,x8
00bed1b8	b 0x00bc5654
