; std::__ndk1::numpunct<char>::do_grouping @ 00c01e78
00c01e78	bti c
00c01e7c	mov x9,x0
00c01e80	ldrb w10,[x9, #0x18]!
00c01e84	tbnz w10,#0x0,0x00c01e9c
00c01e88	ldr q0,[x9]
00c01e8c	ldr x9,[x9, #0x10]
00c01e90	str q0,[x8]
00c01e94	str x9,[x8, #0x10]
00c01e98	ret
00c01e9c	ldp x2,x1,[x0, #0x20]
00c01ea0	mov x0,x8
00c01ea4	b 0x007ff40c
