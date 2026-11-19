; std::__ndk1::numpunct<wchar_t>::numpunct @ 00c01d08
00c01d08	bti c
00c01d0c	adrp x9,0xcb5000
00c01d10	adrp x8,0x29b000
00c01d14	sub x10,x1,#0x1
00c01d18	ldr x9,[x9, #0xe40]
00c01d1c	ldr d0,[x8, #0xa48]
00c01d20	stp xzr,xzr,[x0, #0x20]
00c01d24	str xzr,[x0, #0x18]
00c01d28	add x8,x9,#0x10
00c01d2c	str d0,[x0, #0x10]
00c01d30	stp x8,x10,[x0]
00c01d34	ret
