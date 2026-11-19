; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__init @ 00bc3ac8
00bc3ac8	paciasp
00bc3acc	stp x29,x30,[sp, #-0x30]!
00bc3ad0	stp x22,x21,[sp, #0x10]
00bc3ad4	stp x20,x19,[sp, #0x20]
00bc3ad8	mov x29,sp
00bc3adc	cmn x3,#0x8
00bc3ae0	b.cs 0x00bc3b5c
00bc3ae4	mov x19,x2
00bc3ae8	mov x20,x0
00bc3aec	cmp x3,#0x16
00bc3af0	b.hi 0x00bc3b04
00bc3af4	lsl w8,w19,#0x1
00bc3af8	strb w8,[x20], #0x1
00bc3afc	cbnz x19,0x00bc3b38
00bc3b00	b 0x00bc3b44
00bc3b04	orr x8,x3,#0x7
00bc3b08	mov w9,#0x1a
00bc3b0c	mov x22,x1
00bc3b10	cmp x8,#0x17
00bc3b14	csinc x21,x9,x8,eq
00bc3b18	mov x0,x21
00bc3b1c	bl 0x00c2fed0
00bc3b20	orr x8,x21,#0x1
00bc3b24	mov x1,x22
00bc3b28	stp x19,x0,[x20, #0x8]
00bc3b2c	str x8,[x20]
00bc3b30	mov x20,x0
00bc3b34	cbz x19,0x00bc3b44
00bc3b38	mov x0,x20
00bc3b3c	mov x2,x19
00bc3b40	bl 0x00c2ff60
00bc3b44	strb wzr,[x20, x19]
00bc3b48	ldp x20,x19,[sp, #0x20]
00bc3b4c	ldp x22,x21,[sp, #0x10]
00bc3b50	ldp x29,x30,[sp], #0x30
00bc3b54	autiasp
00bc3b58	ret
00bc3b5c	bl 0x007fe124
