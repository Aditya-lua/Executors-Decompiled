; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::copy @ 00bc42c4
00bc42c4	paciasp
00bc42c8	stp x29,x30,[sp, #-0x20]!
00bc42cc	str x19,[sp, #0x10]
00bc42d0	mov x29,sp
00bc42d4	ldrb w9,[x0]
00bc42d8	ldr x8,[x0, #0x8]
00bc42dc	lsr x10,x9,#0x1
00bc42e0	tst w9,#0x1
00bc42e4	csel x8,x10,x8,eq
00bc42e8	subs x10,x8,x3
00bc42ec	b.cc 0x00bc4330
00bc42f0	cmp x10,x2
00bc42f4	csel x19,x10,x2,cc
00bc42f8	cbz x19,0x00bc431c
00bc42fc	ldr x10,[x0, #0x10]
00bc4300	tst w9,#0x1
00bc4304	mov x8,x1
00bc4308	mov x2,x19
00bc430c	csinc x9,x10,x0,ne
00bc4310	mov x0,x8
00bc4314	add x1,x9,x3
00bc4318	bl 0x00c2ff60
00bc431c	mov x0,x19
00bc4320	ldr x19,[sp, #0x10]
00bc4324	ldp x29,x30,[sp], #0x20
00bc4328	autiasp
00bc432c	ret
00bc4330	bl 0x00814f80
