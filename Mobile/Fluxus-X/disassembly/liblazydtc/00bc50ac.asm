; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::resize @ 00bc50ac
00bc50ac	bti c
00bc50b0	ldrb w9,[x0]
00bc50b4	ldr x8,[x0, #0x8]
00bc50b8	lsr x10,x9,#0x1
00bc50bc	tst w9,#0x1
00bc50c0	csel x8,x10,x8,eq
00bc50c4	subs x8,x1,x8
00bc50c8	b.ls 0x00bc50d4
00bc50cc	mov x1,x8
00bc50d0	b 0x00c30250
00bc50d4	tbnz w9,#0x0,0x00bc50e8
00bc50d8	lsl w8,w1,#0x1
00bc50dc	strb w8,[x0], #0x1
00bc50e0	strb wzr,[x0, x1]
00bc50e4	ret
00bc50e8	ldr x8,[x0, #0x10]
00bc50ec	str x1,[x0, #0x8]
00bc50f0	strb wzr,[x8, x1]
00bc50f4	ret
