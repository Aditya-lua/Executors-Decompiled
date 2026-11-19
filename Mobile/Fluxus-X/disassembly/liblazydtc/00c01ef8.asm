; std::__ndk1::numpunct<wchar_t>::do_truename @ 00c01ef8
00c01ef8	bti c
00c01efc	adrp x10,0x78a000
00c01f00	add x10,x10,#0x98
00c01f04	mov w9,#0x8
00c01f08	ldr q0,[x10]
00c01f0c	strb w9,[x8]
00c01f10	str wzr,[x8, #0x14]
00c01f14	stur q0,[x8, #0x4]
00c01f18	ret
