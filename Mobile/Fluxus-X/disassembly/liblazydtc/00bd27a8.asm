; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sputbackc @ 00bd27a8
00bd27a8	bti c
00bd27ac	ldp x9,x8,[x0, #0x10]
00bd27b0	cmp x9,x8
00bd27b4	b.eq 0x00bd27d4
00bd27b8	ldr w9,[x8, #-0x4]!
00bd27bc	cmp w1,w9
00bd27c0	b.ne 0x00bd27d4
00bd27c4	mov x9,x0
00bd27c8	mov w0,w1
00bd27cc	str x8,[x9, #0x18]
00bd27d0	ret
00bd27d4	ldr x8,[x0]
00bd27d8	ldr x16,[x8, #0x58]
00bd27dc	br x16
