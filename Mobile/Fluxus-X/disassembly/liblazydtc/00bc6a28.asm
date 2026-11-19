; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::erase @ 00bc6a28
00bc6a28	paciasp
00bc6a2c	stp x29,x30,[sp, #-0x20]!
00bc6a30	str x19,[sp, #0x10]
00bc6a34	mov x29,sp
00bc6a38	ldrb w8,[x0]
00bc6a3c	ldr x9,[x0, #0x8]
00bc6a40	lsr x10,x8,#0x1
00bc6a44	tst w8,#0x1
00bc6a48	csel x9,x10,x9,eq
00bc6a4c	cmp x1,x9
00bc6a50	b.hi 0x00bc6a9c
00bc6a54	cmn x2,#0x1
00bc6a58	b.eq 0x00bc6a6c
00bc6a5c	mov x19,x0
00bc6a60	bl 0x00bc6aa0
00bc6a64	mov x0,x19
00bc6a68	b 0x00bc6a8c
00bc6a6c	tbnz w8,#0x0,0x00bc6a80
00bc6a70	lsl w9,w1,#0x1
00bc6a74	mov x8,x0
00bc6a78	strb w9,[x8], #0x4
00bc6a7c	b 0x00bc6a88
00bc6a80	ldr x8,[x0, #0x10]
00bc6a84	str x1,[x0, #0x8]
00bc6a88	str wzr,[x8, x1, LSL #0x2]
00bc6a8c	ldr x19,[sp, #0x10]
00bc6a90	ldp x29,x30,[sp], #0x20
00bc6a94	autiasp
00bc6a98	ret
00bc6a9c	bl 0x00bc531c
