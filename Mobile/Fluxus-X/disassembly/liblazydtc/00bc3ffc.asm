; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find_first_of @ 00bc3ffc
00bc3ffc	bti c
00bc4000	mov x8,x0
00bc4004	mov x0,#-0x1
00bc4008	ldrb w9,[x8]
00bc400c	ldp x11,x10,[x8, #0x8]
00bc4010	lsr x12,x9,#0x1
00bc4014	tst w9,#0x1
00bc4018	csinc x8,x10,x8,ne
00bc401c	csel x9,x12,x11,eq
00bc4020	cbz x3,0x00bc4074
00bc4024	cmp x2,x9
00bc4028	b.cs 0x00bc4074
00bc402c	add x9,x8,x9
00bc4030	add x10,x8,x2
00bc4034	ldrb w11,[x10]
00bc4038	mov x12,x3
00bc403c	mov x13,x1
00bc4040	ldrb w14,[x13]
00bc4044	cmp w11,w14
00bc4048	b.eq 0x00bc4068
00bc404c	subs x12,x12,#0x1
00bc4050	add x13,x13,#0x1
00bc4054	b.ne 0x00bc4040
00bc4058	add x10,x10,#0x1
00bc405c	cmp x10,x9
00bc4060	b.ne 0x00bc4034
00bc4064	mov x10,x9
00bc4068	sub x8,x10,x8
00bc406c	cmp x10,x9
00bc4070	csinv x0,x8,xzr,ne
00bc4074	ret
