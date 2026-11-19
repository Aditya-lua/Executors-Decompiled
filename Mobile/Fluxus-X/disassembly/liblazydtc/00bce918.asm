; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sputbackc @ 00bce918
00bce918	bti c
00bce91c	ldp x9,x8,[x0, #0x10]
00bce920	cmp x9,x8
00bce924	b.eq 0x00bce940
00bce928	ldrb w9,[x8, #-0x1]!
00bce92c	cmp w9,w1, UXTB 
00bce930	b.ne 0x00bce940
00bce934	str x8,[x0, #0x18]
00bce938	ldrb w0,[x8]
00bce93c	ret
00bce940	ldr x8,[x0]
00bce944	and w1,w1,#0xff
00bce948	ldr x16,[x8, #0x58]
00bce94c	br x16
