; std::__ndk1::moneypunct_byname<char,true>::do_negative_sign @ 00becf94
00becf94	bti c
00becf98	mov x9,x0
00becf9c	ldrb w10,[x9, #0x60]!
00becfa0	tbnz w10,#0x0,0x00becfb8
00becfa4	ldr q0,[x9]
00becfa8	ldr x9,[x9, #0x10]
00becfac	str q0,[x8]
00becfb0	str x9,[x8, #0x10]
00becfb4	ret
00becfb8	ldp x2,x1,[x0, #0x68]
00becfbc	mov x0,x8
00becfc0	b 0x007ff40c
