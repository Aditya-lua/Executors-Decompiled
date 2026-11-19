; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare @ 00bc4ce8
00bc4ce8	paciasp
00bc4cec	stp x29,x30,[sp, #-0x20]!
00bc4cf0	stp x20,x19,[sp, #0x10]
00bc4cf4	mov x29,sp
00bc4cf8	ldrb w8,[x3]
00bc4cfc	ldrb w9,[x0]
00bc4d00	ldr x13,[x0, #0x8]
00bc4d04	ldp x11,x10,[x3, #0x8]
00bc4d08	lsr x12,x8,#0x1
00bc4d0c	tst w8,#0x1
00bc4d10	lsr x14,x9,#0x1
00bc4d14	csinc x8,x10,x3,ne
00bc4d18	csel x10,x12,x11,eq
00bc4d1c	tst w9,#0x1
00bc4d20	csel x11,x14,x13,eq
00bc4d24	subs x11,x11,x1
00bc4d28	b.cc 0x00bc4d8c
00bc4d2c	cmp x11,x2
00bc4d30	csel x19,x11,x2,cc
00bc4d34	subs x10,x10,x4
00bc4d38	b.cc 0x00bc4d8c
00bc4d3c	ldr x11,[x0, #0x10]
00bc4d40	tst w9,#0x1
00bc4d44	csinc x9,x11,x0,ne
00bc4d48	cmp x10,x5
00bc4d4c	csel x20,x10,x5,cc
00bc4d50	add x0,x9,x1
00bc4d54	add x1,x8,x4
00bc4d58	cmp x20,x19
00bc4d5c	csel x2,x20,x19,cc
00bc4d60	bl 0x00c300b0
00bc4d64	cmp x19,x20
00bc4d68	mov w8,#0xffffffff
00bc4d6c	cneg w8,w8,cs
00bc4d70	csel w8,wzr,w8,eq
00bc4d74	cmp w0,#0x0
00bc4d78	csel w0,w0,w8,ne
00bc4d7c	ldp x20,x19,[sp, #0x10]
00bc4d80	ldp x29,x30,[sp], #0x20
00bc4d84	autiasp
00bc4d88	ret
00bc4d8c	adrp x0,0x2ba000
00bc4d90	add x0,x0,#0xc54
00bc4d94	bl 0x0080c8d0
