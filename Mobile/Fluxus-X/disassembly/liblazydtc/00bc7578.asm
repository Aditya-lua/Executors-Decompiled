; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::insert @ 00bc7578
00bc7578	bti c
00bc757c	ldrb w8,[x2]
00bc7580	ldr x9,[x2, #0x8]
00bc7584	lsr x10,x8,#0x1
00bc7588	tst w8,#0x1
00bc758c	csel x9,x10,x9,eq
00bc7590	subs x9,x9,x3
00bc7594	b.cc 0x00bc75b8
00bc7598	ldr x10,[x2, #0x10]
00bc759c	add x11,x2,#0x4
00bc75a0	tst w8,#0x1
00bc75a4	csel x8,x11,x10,eq
00bc75a8	cmp x9,x4
00bc75ac	add x2,x8,x3, LSL #0x2
00bc75b0	csel x3,x9,x4,cc
00bc75b4	b 0x00c43d80
00bc75b8	paciasp
00bc75bc	stp x29,x30,[sp, #-0x10]!
00bc75c0	mov x29,sp
00bc75c4	bl 0x00bc531c
