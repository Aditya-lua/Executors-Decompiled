; std::__ndk1::numpunct<wchar_t>::do_grouping @ 00c01ea8
00c01ea8	bti c
00c01eac	mov x9,x0
00c01eb0	ldrb w10,[x9, #0x18]!
00c01eb4	tbnz w10,#0x0,0x00c01ecc
00c01eb8	ldr q0,[x9]
00c01ebc	ldr x9,[x9, #0x10]
00c01ec0	str q0,[x8]
00c01ec4	str x9,[x8, #0x10]
00c01ec8	ret
00c01ecc	ldp x2,x1,[x0, #0x20]
00c01ed0	mov x0,x8
00c01ed4	b 0x007ff40c
