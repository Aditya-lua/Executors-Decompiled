; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append @ 00bc4dec
00bc4dec	paciasp
00bc4df0	stp x29,x30,[sp, #-0x40]!
00bc4df4	str x23,[sp, #0x10]
00bc4df8	stp x22,x21,[sp, #0x20]
00bc4dfc	stp x20,x19,[sp, #0x30]
00bc4e00	mov x29,sp
00bc4e04	mov x19,x0
00bc4e08	mov x0,x1
00bc4e0c	mov x20,x1
00bc4e10	bl 0x00c2ff50
00bc4e14	ldp x8,x10,[x19]
00bc4e18	mov x21,x0
00bc4e1c	ldrb w9,[x19]
00bc4e20	and x11,x8,#-0x2
00bc4e24	tst w9,#0x1
00bc4e28	mov w9,#0x16
00bc4e2c	sub x11,x11,#0x1
00bc4e30	ubfx x12,x8,#0x1,#0x7
00bc4e34	csel x1,x9,x11,eq
00bc4e38	tst x8,#0x1
00bc4e3c	csel x22,x12,x10,eq
00bc4e40	sub x9,x1,x22
00bc4e44	cmp x9,x0
00bc4e48	b.cs 0x00bc4e74
00bc4e4c	sub x8,x21,x1
00bc4e50	mov x0,x19
00bc4e54	mov x3,x22
00bc4e58	add x2,x8,x22
00bc4e5c	mov x4,x22
00bc4e60	mov x5,xzr
00bc4e64	mov x6,x21
00bc4e68	mov x7,x20
00bc4e6c	bl 0x00c30200
00bc4e70	b 0x00bc4eb4
00bc4e74	cbz x21,0x00bc4eb4
00bc4e78	ldr x9,[x19, #0x10]
00bc4e7c	tst x8,#0x1
00bc4e80	mov x1,x20
00bc4e84	mov x2,x21
00bc4e88	csinc x23,x9,x19,ne
00bc4e8c	add x0,x23,x22
00bc4e90	bl 0x00c2ff60
00bc4e94	ldrb w9,[x19]
00bc4e98	add x8,x22,x21
00bc4e9c	tbnz w9,#0x0,0x00bc4eac
00bc4ea0	lsl w9,w8,#0x1
00bc4ea4	strb w9,[x19]
00bc4ea8	b 0x00bc4eb0
00bc4eac	str x8,[x19, #0x8]
00bc4eb0	strb wzr,[x23, x8]
00bc4eb4	mov x0,x19
00bc4eb8	ldp x20,x19,[sp, #0x30]
00bc4ebc	ldr x23,[sp, #0x10]
00bc4ec0	ldp x22,x21,[sp, #0x20]
00bc4ec4	ldp x29,x30,[sp], #0x40
00bc4ec8	autiasp
00bc4ecc	ret
