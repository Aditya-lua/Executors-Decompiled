; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find @ 00bc4c1c
00bc4c1c	paciasp
00bc4c20	stp x29,x30,[sp, #-0x40]!
00bc4c24	stp x24,x23,[sp, #0x10]
00bc4c28	stp x22,x21,[sp, #0x20]
00bc4c2c	stp x20,x19,[sp, #0x30]
00bc4c30	mov x29,sp
00bc4c34	ldrb w8,[x0]
00bc4c38	ldp x9,x11,[x0, #0x8]
00bc4c3c	lsr x10,x8,#0x1
00bc4c40	tst w8,#0x1
00bc4c44	csinc x23,x11,x0,ne
00bc4c48	csel x9,x10,x9,eq
00bc4c4c	subs x8,x9,x2
00bc4c50	b.cs 0x00bc4c5c
00bc4c54	mov x2,#-0x1
00bc4c58	b 0x00bc4c80
00bc4c5c	mov x19,x3
00bc4c60	cbz x3,0x00bc4c80
00bc4c64	cmp x8,x19
00bc4c68	add x24,x23,x9
00bc4c6c	b.ge 0x00bc4c9c
00bc4c70	mov x22,x24
00bc4c74	sub x8,x22,x23
00bc4c78	cmp x22,x24
00bc4c7c	csinv x2,x8,xzr,ne
00bc4c80	mov x0,x2
00bc4c84	ldp x20,x19,[sp, #0x30]
00bc4c88	ldp x22,x21,[sp, #0x20]
00bc4c8c	ldp x24,x23,[sp, #0x10]
00bc4c90	ldp x29,x30,[sp], #0x40
00bc4c94	autiasp
00bc4c98	ret
00bc4c9c	ldrb w21,[x1]
00bc4ca0	mov x20,x1
00bc4ca4	add x0,x23,x2
00bc4ca8	sub x8,x8,x19
00bc4cac	adds x2,x8,#0x1
00bc4cb0	b.cs 0x00bc4c70
00bc4cb4	mov w1,w21
00bc4cb8	bl 0x00c300a0
00bc4cbc	cbz x0,0x00bc4c70
00bc4cc0	mov x1,x20
00bc4cc4	mov x2,x19
00bc4cc8	mov x22,x0
00bc4ccc	bl 0x00c300b0
00bc4cd0	cbz w0,0x00bc4c74
00bc4cd4	add x0,x22,#0x1
00bc4cd8	sub x8,x24,x0
00bc4cdc	cmp x8,x19
00bc4ce0	b.ge 0x00bc4ca8
00bc4ce4	b 0x00bc4c70
