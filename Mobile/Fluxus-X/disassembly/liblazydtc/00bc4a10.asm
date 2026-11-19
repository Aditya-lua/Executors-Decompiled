; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare @ 00bc4a10
00bc4a10	paciasp
00bc4a14	stp x29,x30,[sp, #-0x30]!
00bc4a18	stp x22,x21,[sp, #0x10]
00bc4a1c	stp x20,x19,[sp, #0x20]
00bc4a20	mov x29,sp
00bc4a24	mov x21,x0
00bc4a28	mov x0,x1
00bc4a2c	mov x19,x1
00bc4a30	bl 0x00c2ff50
00bc4a34	cmn x0,#0x1
00bc4a38	b.eq 0x00bc4a90
00bc4a3c	ldrb w8,[x21]
00bc4a40	mov x20,x0
00bc4a44	mov x1,x19
00bc4a48	lsr x9,x8,#0x1
00bc4a4c	tst w8,#0x1
00bc4a50	ldp x10,x8,[x21, #0x8]
00bc4a54	csel x22,x9,x10,eq
00bc4a58	csinc x0,x8,x21,ne
00bc4a5c	cmp x20,x22
00bc4a60	csel x2,x20,x22,cc
00bc4a64	bl 0x00c300b0
00bc4a68	cmp x22,x20
00bc4a6c	cset w8,hi
00bc4a70	csinv w8,w8,wzr,cs
00bc4a74	cmp w0,#0x0
00bc4a78	csel w0,w8,w0,eq
00bc4a7c	ldp x20,x19,[sp, #0x20]
00bc4a80	ldp x22,x21,[sp, #0x10]
00bc4a84	ldp x29,x30,[sp], #0x30
00bc4a88	autiasp
00bc4a8c	ret
00bc4a90	bl 0x00814f80
