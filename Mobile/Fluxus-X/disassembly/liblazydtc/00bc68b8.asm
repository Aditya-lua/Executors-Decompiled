; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::rfind @ 00bc68b8
00bc68b8	bti c
00bc68bc	ldrb w8,[x0]
00bc68c0	ldp x9,x11,[x0, #0x8]
00bc68c4	add x12,x0,#0x4
00bc68c8	lsr x10,x8,#0x1
00bc68cc	tst w8,#0x1
00bc68d0	csel x8,x10,x9,eq
00bc68d4	csel x9,x12,x11,eq
00bc68d8	cbz x8,0x00bc6908
00bc68dc	cmp x2,x8
00bc68e0	sub x9,x9,#0x4
00bc68e4	csinc x8,x8,x2,cs
00bc68e8	lsl x8,x8,#0x2
00bc68ec	cbz x8,0x00bc6908
00bc68f0	ldr w10,[x9, x8#0x0]
00bc68f4	sub x8,x8,#0x4
00bc68f8	cmp w10,w1
00bc68fc	b.ne 0x00bc68ec
00bc6900	asr x0,x8,#0x2
00bc6904	ret
00bc6908	mov x0,#-0x1
00bc690c	ret
