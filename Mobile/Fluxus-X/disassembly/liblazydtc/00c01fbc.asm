; std::__ndk1::numpunct<char>::do_falsename @ 00c01fbc
00c01fbc	bti c
00c01fc0	mov w9,#0xa
00c01fc4	mov w10,#0x6166
00c01fc8	movk w10,#0x736c, LSL #16
00c01fcc	strb w9,[x8]
00c01fd0	mov w9,#0x65
00c01fd4	stur w10,[x8, #0x1]
00c01fd8	sturh w9,[x8, #0x5]
00c01fdc	ret
