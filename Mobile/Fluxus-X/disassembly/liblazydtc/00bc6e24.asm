; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::at @ 00bc6e24
00bc6e24	bti c
00bc6e28	ldrb w8,[x0]
00bc6e2c	ldr x9,[x0, #0x8]
00bc6e30	lsr x10,x8,#0x1
00bc6e34	tst w8,#0x1
00bc6e38	csel x9,x10,x9,eq
00bc6e3c	cmp x1,x9
00bc6e40	b.cs 0x00bc6e5c
00bc6e44	ldr x9,[x0, #0x10]
00bc6e48	add x10,x0,#0x4
00bc6e4c	tst w8,#0x1
00bc6e50	csel x8,x10,x9,eq
00bc6e54	add x0,x8,x1, LSL #0x2
00bc6e58	ret
00bc6e5c	paciasp
00bc6e60	stp x29,x30,[sp, #-0x10]!
00bc6e64	mov x29,sp
00bc6e68	bl 0x00bc531c
