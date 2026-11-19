; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::in_avail @ 00bd2690
00bd2690	bti c
00bd2694	ldp x8,x9,[x0, #0x18]
00bd2698	cmp x8,x9
00bd269c	b.cs 0x00bd26ac
00bd26a0	sub x8,x9,x8
00bd26a4	asr x0,x8,#0x2
00bd26a8	ret
00bd26ac	ldr x8,[x0]
00bd26b0	ldr x16,[x8, #0x38]
00bd26b4	br x16
