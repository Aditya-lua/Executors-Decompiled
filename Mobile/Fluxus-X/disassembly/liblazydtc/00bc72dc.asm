; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::replace @ 00bc72dc
00bc72dc	bti c
00bc72e0	ldrb w8,[x3]
00bc72e4	ldr x9,[x3, #0x8]
00bc72e8	lsr x10,x8,#0x1
00bc72ec	tst w8,#0x1
00bc72f0	csel x9,x10,x9,eq
00bc72f4	subs x9,x9,x4
00bc72f8	b.cc 0x00bc731c
00bc72fc	ldr x10,[x3, #0x10]
00bc7300	add x11,x3,#0x4
00bc7304	tst w8,#0x1
00bc7308	csel x8,x11,x10,eq
00bc730c	cmp x9,x5
00bc7310	add x3,x8,x4, LSL #0x2
00bc7314	csel x4,x9,x5,cc
00bc7318	b 0x00c43d30
00bc731c	paciasp
00bc7320	stp x29,x30,[sp, #-0x10]!
00bc7324	mov x29,sp
00bc7328	bl 0x00bc531c
