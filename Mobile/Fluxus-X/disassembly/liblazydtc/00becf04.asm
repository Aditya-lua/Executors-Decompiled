; std::__ndk1::moneypunct_byname<char,true>::do_grouping @ 00becf04
00becf04	bti c
00becf08	mov x9,x0
00becf0c	ldrb w10,[x9, #0x18]!
00becf10	tbnz w10,#0x0,0x00becf28
00becf14	ldr q0,[x9]
00becf18	ldr x9,[x9, #0x10]
00becf1c	str q0,[x8]
00becf20	str x9,[x8, #0x10]
00becf24	ret
00becf28	ldp x2,x1,[x0, #0x20]
00becf2c	mov x0,x8
00becf30	b 0x007ff40c
