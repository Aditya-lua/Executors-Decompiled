; std::__ndk1::moneypunct<wchar_t,false>::do_negative_sign @ 00becd18
00becd18	bti c
00becd1c	adrp x9,0x29b000
00becd20	mov w10,#0x2
00becd24	ldr d0,[x9, #0x60]
00becd28	strb w10,[x8]
00becd2c	stur d0,[x8, #0x4]
00becd30	ret
