; std::__ndk1::moneypunct_byname<char,false>::do_negative_sign @ 00bece98
00bece98	bti c
00bece9c	mov x9,x0
00becea0	ldrb w10,[x9, #0x60]!
00becea4	tbnz w10,#0x0,0x00becebc
00becea8	ldr q0,[x9]
00beceac	ldr x9,[x9, #0x10]
00beceb0	str q0,[x8]
00beceb4	str x9,[x8, #0x10]
00beceb8	ret
00becebc	ldp x2,x1,[x0, #0x68]
00becec0	mov x0,x8
00becec4	b 0x007ff40c
