; std::__ndk1::moneypunct_byname<char,true>::do_positive_sign @ 00becf64
00becf64	bti c
00becf68	mov x9,x0
00becf6c	ldrb w10,[x9, #0x48]!
00becf70	tbnz w10,#0x0,0x00becf88
00becf74	ldr q0,[x9]
00becf78	ldr x9,[x9, #0x10]
00becf7c	str q0,[x8]
00becf80	str x9,[x8, #0x10]
00becf84	ret
00becf88	ldp x2,x1,[x0, #0x50]
00becf8c	mov x0,x8
00becf90	b 0x007ff40c
