; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::rfind @ 00bc39fc
00bc39fc	bti c
00bc3a00	ldrb w8,[x0]
00bc3a04	ldp x9,x11,[x0, #0x8]
00bc3a08	lsr x10,x8,#0x1
00bc3a0c	tst w8,#0x1
00bc3a10	csinc x8,x11,x0,ne
00bc3a14	csel x9,x10,x9,eq
00bc3a18	cmp x9,x2
00bc3a1c	csel x10,x9,x2,cc
00bc3a20	sub x11,x9,x10
00bc3a24	add x10,x10,x3
00bc3a28	cmp x3,x11
00bc3a2c	csel x10,x10,x9,cc
00bc3a30	add x9,x8,x10
00bc3a34	cbz x3,0x00bc3ab0
00bc3a38	cbz x10,0x00bc3ab0
00bc3a3c	ldrb w11,[x1], #0x1
00bc3a40	sub x12,x3,#0x1
00bc3a44	mov x13,x8
00bc3a48	mov x10,x9
00bc3a4c	add x14,x13,#0x1
00bc3a50	ldrb w15,[x13]
00bc3a54	cmp w15,w11
00bc3a58	b.eq 0x00bc3a70
00bc3a5c	add x13,x13,#0x1
00bc3a60	add x14,x14,#0x1
00bc3a64	cmp x13,x9
00bc3a68	b.ne 0x00bc3a50
00bc3a6c	b 0x00bc3ab4
00bc3a70	mov x15,x12
00bc3a74	mov x16,x1
00bc3a78	cbz x15,0x00bc3a9c
00bc3a7c	cmp x14,x9
00bc3a80	b.eq 0x00bc3ab4
00bc3a84	ldrb w17,[x14], #0x1
00bc3a88	sub x15,x15,#0x1
00bc3a8c	ldrb w0,[x16], #0x1
00bc3a90	cmp w17,w0
00bc3a94	b.eq 0x00bc3a78
00bc3a98	b 0x00bc3aa0
00bc3a9c	mov x10,x13
00bc3aa0	add x13,x13,#0x1
00bc3aa4	cmp x13,x9
00bc3aa8	b.ne 0x00bc3a4c
00bc3aac	b 0x00bc3ab4
00bc3ab0	mov x10,x9
00bc3ab4	cmp x10,x9
00bc3ab8	sub x8,x10,x8
00bc3abc	ccmp x3,#0x0,#0x4,eq
00bc3ac0	csinv x0,x8,xzr,eq
00bc3ac4	ret
