; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::at @ 00bc5ad0
00bc5ad0	bti c
00bc5ad4	ldrb w8,[x0]
00bc5ad8	ldr x9,[x0, #0x8]
00bc5adc	lsr x10,x8,#0x1
00bc5ae0	tst w8,#0x1
00bc5ae4	csel x9,x10,x9,eq
00bc5ae8	cmp x1,x9
00bc5aec	b.cs 0x00bc5b08
00bc5af0	ldr x9,[x0, #0x10]
00bc5af4	add x10,x0,#0x4
00bc5af8	tst w8,#0x1
00bc5afc	csel x8,x10,x9,eq
00bc5b00	add x0,x8,x1, LSL #0x2
00bc5b04	ret
00bc5b08	paciasp
00bc5b0c	stp x29,x30,[sp, #-0x10]!
00bc5b10	mov x29,sp
00bc5b14	bl 0x00bc531c
