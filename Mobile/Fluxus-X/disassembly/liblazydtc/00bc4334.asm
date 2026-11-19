; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::basic_string @ 00bc4334
00bc4334	paciasp
00bc4338	stp x29,x30,[sp, #-0x40]!
00bc433c	str x23,[sp, #0x10]
00bc4340	stp x22,x21,[sp, #0x20]
00bc4344	stp x20,x19,[sp, #0x30]
00bc4348	mov x29,sp
00bc434c	ldrb w8,[x1]
00bc4350	ldr x9,[x1, #0x8]
00bc4354	lsr x10,x8,#0x1
00bc4358	tst w8,#0x1
00bc435c	csel x9,x10,x9,eq
00bc4360	subs x9,x9,x2
00bc4364	b.cc 0x00bc43f8
00bc4368	ldr x10,[x1, #0x10]
00bc436c	tst w8,#0x1
00bc4370	csinc x23,x10,x1,ne
00bc4374	cmp x9,x3
00bc4378	csel x21,x9,x3,cc
00bc437c	cmn x21,#0x8
00bc4380	b.cs 0x00bc43fc
00bc4384	mov x19,x2
00bc4388	mov x20,x0
00bc438c	cmp x21,#0x17
00bc4390	b.cs 0x00bc43a4
00bc4394	lsl w8,w21,#0x1
00bc4398	strb w8,[x20], #0x1
00bc439c	cbnz x21,0x00bc43cc
00bc43a0	b 0x00bc43dc
00bc43a4	orr x8,x21,#0x7
00bc43a8	mov w9,#0x1a
00bc43ac	cmp x8,#0x17
00bc43b0	csinc x22,x9,x8,eq
00bc43b4	mov x0,x22
00bc43b8	bl 0x00c2fed0
00bc43bc	orr x8,x22,#0x1
00bc43c0	stp x21,x0,[x20, #0x8]
00bc43c4	str x8,[x20]
00bc43c8	mov x20,x0
00bc43cc	add x1,x23,x19
00bc43d0	mov x0,x20
00bc43d4	mov x2,x21
00bc43d8	bl 0x00c2ff60
00bc43dc	strb wzr,[x20, x21]
00bc43e0	ldp x20,x19,[sp, #0x30]
00bc43e4	ldr x23,[sp, #0x10]
00bc43e8	ldp x22,x21,[sp, #0x20]
00bc43ec	ldp x29,x30,[sp], #0x40
00bc43f0	autiasp
00bc43f4	ret
00bc43f8	bl 0x00814f80
00bc43fc	bl 0x007fe124
