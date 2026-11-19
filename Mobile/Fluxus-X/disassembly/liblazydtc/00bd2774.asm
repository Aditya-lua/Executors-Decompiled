; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sgetc @ 00bd2774
00bd2774	bti c
00bd2778	ldp x8,x9,[x0, #0x18]
00bd277c	cmp x8,x9
00bd2780	b.eq 0x00bd278c
00bd2784	ldr w0,[x8]
00bd2788	ret
00bd278c	ldr x8,[x0]
00bd2790	ldr x16,[x8, #0x48]
00bd2794	br x16
