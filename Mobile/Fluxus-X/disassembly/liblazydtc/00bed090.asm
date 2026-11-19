; std::__ndk1::moneypunct_byname<wchar_t,false>::do_negative_sign @ 00bed090
00bed090	bti c
00bed094	mov x9,x0
00bed098	ldrb w10,[x9, #0x60]!
00bed09c	tbnz w10,#0x0,0x00bed0b4
00bed0a0	ldr q0,[x9]
00bed0a4	ldr x9,[x9, #0x10]
00bed0a8	str q0,[x8]
00bed0ac	str x9,[x8, #0x10]
00bed0b0	ret
00bed0b4	ldp x2,x1,[x0, #0x68]
00bed0b8	mov x0,x8
00bed0bc	b 0x00bc5654
