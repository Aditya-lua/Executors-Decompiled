; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert @ 00bc3d3c
00bc3d3c	paciasp
00bc3d40	stp x29,x30,[sp, #-0x60]!
00bc3d44	stp x28,x27,[sp, #0x10]
00bc3d48	stp x26,x25,[sp, #0x20]
00bc3d4c	stp x24,x23,[sp, #0x30]
00bc3d50	stp x22,x21,[sp, #0x40]
00bc3d54	stp x20,x19,[sp, #0x50]
00bc3d58	mov x29,sp
00bc3d5c	ldrb w8,[x0]
00bc3d60	ldr x9,[x0, #0x8]
00bc3d64	lsr x10,x8,#0x1
00bc3d68	tst w8,#0x1
00bc3d6c	csel x26,x10,x9,eq
00bc3d70	cmp x26,x1
00bc3d74	b.cc 0x00bc3ee8
00bc3d78	mov x19,x0
00bc3d7c	mov x22,x2
00bc3d80	cbz x2,0x00bc3ec4
00bc3d84	ldr x9,[x19]
00bc3d88	tst w8,#0x1
00bc3d8c	mov w8,#0x16
00bc3d90	mov w20,w3
00bc3d94	mov x21,x1
00bc3d98	and x10,x9,#-0x2
00bc3d9c	sub x10,x10,#0x1
00bc3da0	csel x28,x8,x10,eq
00bc3da4	sub x8,x28,x26
00bc3da8	cmp x8,x22
00bc3dac	and w8,w9,#0xff
00bc3db0	b.cs 0x00bc3e14
00bc3db4	add x27,x26,x22
00bc3db8	mov x9,#-0x9
00bc3dbc	sub x10,x27,x28
00bc3dc0	sub x9,x9,x28
00bc3dc4	cmp x10,x9
00bc3dc8	b.hi 0x00bc3eec
00bc3dcc	ldr x9,[x19, #0x10]
00bc3dd0	tst w8,#0x1
00bc3dd4	mov x8,#-0xe
00bc3dd8	movk x8,#0x7fff, LSL #48
00bc3ddc	csinc x24,x9,x19,ne
00bc3de0	cmp x28,x8
00bc3de4	b.hi 0x00bc3e38
00bc3de8	lsl x8,x28,#0x1
00bc3dec	mov w10,#0x1a
00bc3df0	cmp x27,x8
00bc3df4	csel x8,x27,x8,hi
00bc3df8	orr x9,x8,#0x7
00bc3dfc	cmp x9,#0x17
00bc3e00	csinc x9,x10,x9,eq
00bc3e04	cmp x8,#0x17
00bc3e08	mov w8,#0x17
00bc3e0c	csel x25,x8,x9,cc
00bc3e10	b 0x00bc3e3c
00bc3e14	ldr x9,[x19, #0x10]
00bc3e18	tst w8,#0x1
00bc3e1c	csinc x23,x9,x19,ne
00bc3e20	subs x2,x26,x21
00bc3e24	b.eq 0x00bc3e94
00bc3e28	add x1,x23,x21
00bc3e2c	add x0,x1,x22
00bc3e30	bl 0x00c2ff60
00bc3e34	b 0x00bc3e94
00bc3e38	mov x25,#-0x9
00bc3e3c	mov x0,x25
00bc3e40	bl 0x00c2fed0
00bc3e44	mov x23,x0
00bc3e48	cbz x21,0x00bc3e5c
00bc3e4c	mov x0,x23
00bc3e50	mov x1,x24
00bc3e54	mov x2,x21
00bc3e58	bl 0x00c2ff60
00bc3e5c	subs x2,x26,x21
00bc3e60	b.eq 0x00bc3e74
00bc3e64	add x8,x23,x21
00bc3e68	add x1,x24,x21
00bc3e6c	add x0,x8,x22
00bc3e70	bl 0x00c2ff60
00bc3e74	add x1,x28,#0x1
00bc3e78	cmp x1,#0x17
00bc3e7c	b.eq 0x00bc3e88
00bc3e80	mov x0,x24
00bc3e84	bl 0x00c2fe80
00bc3e88	orr x8,x25,#0x1
00bc3e8c	stp x27,x23,[x19, #0x8]
00bc3e90	str x8,[x19]
00bc3e94	add x0,x23,x21
00bc3e98	mov w1,w20
00bc3e9c	mov x2,x22
00bc3ea0	bl 0x00c301c0
00bc3ea4	ldrb w9,[x19]
00bc3ea8	add x8,x26,x22
00bc3eac	tbnz w9,#0x0,0x00bc3ebc
00bc3eb0	lsl w9,w8,#0x1
00bc3eb4	strb w9,[x19]
00bc3eb8	b 0x00bc3ec0
00bc3ebc	str x8,[x19, #0x8]
00bc3ec0	strb wzr,[x23, x8]
00bc3ec4	mov x0,x19
00bc3ec8	ldp x20,x19,[sp, #0x50]
00bc3ecc	ldp x22,x21,[sp, #0x40]
00bc3ed0	ldp x24,x23,[sp, #0x30]
00bc3ed4	ldp x26,x25,[sp, #0x20]
00bc3ed8	ldp x28,x27,[sp, #0x10]
00bc3edc	ldp x29,x30,[sp], #0x60
00bc3ee0	autiasp
00bc3ee4	ret
00bc3ee8	bl 0x00814f80
00bc3eec	bl 0x007fe124
