; std::__ndk1::moneypunct_byname<wchar_t,true>::do_grouping @ 00bed0fc
00bed0fc	bti c
00bed100	mov x9,x0
00bed104	ldrb w10,[x9, #0x18]!
00bed108	tbnz w10,#0x0,0x00bed120
00bed10c	ldr q0,[x9]
00bed110	ldr x9,[x9, #0x10]
00bed114	str q0,[x8]
00bed118	str x9,[x8, #0x10]
00bed11c	ret
00bed120	ldp x2,x1,[x0, #0x20]
00bed124	mov x0,x8
00bed128	b 0x007ff40c
