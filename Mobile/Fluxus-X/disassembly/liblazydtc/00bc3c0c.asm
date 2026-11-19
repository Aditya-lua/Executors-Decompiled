; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find_last_not_of @ 00bc3c0c
00bc3c0c	paciasp
00bc3c10	stp x29,x30,[sp, #-0x30]!
00bc3c14	stp x22,x21,[sp, #0x10]
00bc3c18	stp x20,x19,[sp, #0x20]
00bc3c1c	mov x29,sp
00bc3c20	ldrb w8,[x0]
00bc3c24	ldp x9,x11,[x0, #0x8]
00bc3c28	mov x19,x3
00bc3c2c	mov x20,x1
00bc3c30	lsr x10,x8,#0x1
00bc3c34	tst w8,#0x1
00bc3c38	csinc x22,x11,x0,ne
00bc3c3c	csel x8,x10,x9,eq
00bc3c40	cmp x2,x8
00bc3c44	csinc x8,x8,x2,cs
00bc3c48	sub x8,x8,#0x1
00bc3c4c	mov x21,x8
00bc3c50	cmn x8,#0x1
00bc3c54	b.eq 0x00bc3c74
00bc3c58	cbz x19,0x00bc3c74
00bc3c5c	ldrb w1,[x22, x21]
00bc3c60	mov x0,x20
00bc3c64	mov x2,x19
00bc3c68	bl 0x00c300a0
00bc3c6c	sub x8,x21,#0x1
00bc3c70	cbnz x0,0x00bc3c4c
00bc3c74	mov x0,x21
00bc3c78	ldp x20,x19,[sp, #0x20]
00bc3c7c	ldp x22,x21,[sp, #0x10]
00bc3c80	ldp x29,x30,[sp], #0x30
00bc3c84	autiasp
00bc3c88	ret
