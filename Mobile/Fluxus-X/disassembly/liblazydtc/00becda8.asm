; std::__ndk1::moneypunct<wchar_t,true>::do_negative_sign @ 00becda8
00becda8	bti c
00becdac	adrp x9,0x29b000
00becdb0	mov w10,#0x2
00becdb4	ldr d0,[x9, #0x60]
00becdb8	strb w10,[x8]
00becdbc	stur d0,[x8, #0x4]
00becdc0	ret
