; std::__ndk1::numpunct<char>::numpunct @ 00c01cdc
00c01cdc	bti c
00c01ce0	adrp x9,0xcb5000
00c01ce4	mov w8,#0x2c2e
00c01ce8	ldr x9,[x9, #0xe38]
00c01cec	strh w8,[x0, #0x10]
00c01cf0	sub x8,x1,#0x1
00c01cf4	stp xzr,xzr,[x0, #0x20]
00c01cf8	add x9,x9,#0x10
00c01cfc	str xzr,[x0, #0x18]
00c01d00	stp x9,x8,[x0]
00c01d04	ret
