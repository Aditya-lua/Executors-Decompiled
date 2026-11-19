; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::__init @ 00bc5a38
00bc5a38	paciasp
00bc5a3c	stp x29,x30,[sp, #-0x30]!
00bc5a40	stp x22,x21,[sp, #0x10]
00bc5a44	stp x20,x19,[sp, #0x20]
00bc5a48	mov x29,sp
00bc5a4c	orr x8,xzr,#0x3ffffffffffffff8
00bc5a50	cmp x2,x8
00bc5a54	b.cs 0x00bc5acc
00bc5a58	mov x19,x2
00bc5a5c	mov x20,x0
00bc5a60	cmp x2,#0x5
00bc5a64	b.cs 0x00bc5a78
00bc5a68	lsl w8,w19,#0x1
00bc5a6c	strb w8,[x20], #0x4
00bc5a70	cbnz x19,0x00bc5aa8
00bc5a74	b 0x00bc5ab4
00bc5a78	orr x8,x19,#0x1
00bc5a7c	mov w9,#0x8
00bc5a80	mov x21,x1
00bc5a84	cmp x8,#0x5
00bc5a88	csinc x22,x9,x8,eq
00bc5a8c	lsl x0,x22,#0x2
00bc5a90	bl 0x00c2fed0
00bc5a94	orr x8,x22,#0x1
00bc5a98	mov x1,x21
00bc5a9c	stp x19,x0,[x20, #0x8]
00bc5aa0	str x8,[x20]
00bc5aa4	mov x20,x0
00bc5aa8	lsl x2,x19,#0x2
00bc5aac	mov x0,x20
00bc5ab0	bl 0x00c2ff60
00bc5ab4	str wzr,[x20, x19, LSL #0x2]
00bc5ab8	ldp x20,x19,[sp, #0x20]
00bc5abc	ldp x22,x21,[sp, #0x10]
00bc5ac0	ldp x29,x30,[sp], #0x30
00bc5ac4	autiasp
00bc5ac8	ret
00bc5acc	bl 0x00bc5610
