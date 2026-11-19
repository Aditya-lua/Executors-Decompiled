; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::~basic_string @ 00bc57ec
00bc57ec	bti c
00bc57f0	ldrb w8,[x0]
00bc57f4	tbnz w8,#0x0,0x00bc57fc
00bc57f8	ret
00bc57fc	ldr x8,[x0]
00bc5800	ldr x0,[x0, #0x10]
00bc5804	lsl x8,x8,#0x2
00bc5808	and x1,x8,#-0x8
00bc580c	b 0x00c2fe80
