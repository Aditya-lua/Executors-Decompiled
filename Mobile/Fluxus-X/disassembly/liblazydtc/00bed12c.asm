; std::__ndk1::moneypunct_byname<wchar_t,true>::do_curr_symbol @ 00bed12c
00bed12c	bti c
00bed130	mov x9,x0
00bed134	ldrb w10,[x9, #0x30]!
00bed138	tbnz w10,#0x0,0x00bed150
00bed13c	ldr q0,[x9]
00bed140	ldr x9,[x9, #0x10]
00bed144	str q0,[x8]
00bed148	str x9,[x8, #0x10]
00bed14c	ret
00bed150	ldp x2,x1,[x0, #0x38]
00bed154	mov x0,x8
00bed158	b 0x00bc5654
