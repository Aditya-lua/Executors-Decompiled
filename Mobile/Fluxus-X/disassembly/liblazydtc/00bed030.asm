; std::__ndk1::moneypunct_byname<wchar_t,false>::do_curr_symbol @ 00bed030
00bed030	bti c
00bed034	mov x9,x0
00bed038	ldrb w10,[x9, #0x30]!
00bed03c	tbnz w10,#0x0,0x00bed054
00bed040	ldr q0,[x9]
00bed044	ldr x9,[x9, #0x10]
00bed048	str q0,[x8]
00bed04c	str x9,[x8, #0x10]
00bed050	ret
00bed054	ldp x2,x1,[x0, #0x38]
00bed058	mov x0,x8
00bed05c	b 0x00bc5654
