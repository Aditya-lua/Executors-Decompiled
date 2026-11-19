; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::rfind @ 00bc46f8
00bc46f8	bti c
00bc46fc	ldrb w8,[x0]
00bc4700	ldp x9,x11,[x0, #0x8]
00bc4704	lsr x10,x8,#0x1
00bc4708	tst w8,#0x1
00bc470c	csel x10,x10,x9,eq
00bc4710	csinc x9,x11,x0,ne
00bc4714	cbz x10,0x00bc4740
00bc4718	cmp x2,x10
00bc471c	and w8,w1,#0xff
00bc4720	sub x9,x9,#0x1
00bc4724	csinc x0,x10,x2,cs
00bc4728	cbz x0,0x00bc4740
00bc472c	ldrb w10,[x9, x0]
00bc4730	sub x0,x0,#0x1
00bc4734	cmp w10,w8
00bc4738	b.ne 0x00bc4728
00bc473c	ret
00bc4740	mov x0,#-0x1
00bc4744	ret
