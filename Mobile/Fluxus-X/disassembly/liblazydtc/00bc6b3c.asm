; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::append @ 00bc6b3c
00bc6b3c	paciasp
00bc6b40	stp x29,x30,[sp, #-0x30]!
00bc6b44	stp x22,x21,[sp, #0x10]
00bc6b48	stp x20,x19,[sp, #0x20]
00bc6b4c	mov x29,sp
00bc6b50	ldrb w10,[x1]
00bc6b54	ldr x8,[x1, #0x8]
00bc6b58	lsr x9,x10,#0x1
00bc6b5c	tst w10,#0x1
00bc6b60	csel x8,x9,x8,eq
00bc6b64	subs x9,x8,x2
00bc6b68	b.cc 0x00bc6c40
00bc6b6c	ldp x8,x13,[x0]
00bc6b70	add x12,x1,#0x4
00bc6b74	ldr x11,[x1, #0x10]
00bc6b78	tst w10,#0x1
00bc6b7c	ldrb w10,[x0]
00bc6b80	mov x19,x0
00bc6b84	csel x11,x12,x11,eq
00bc6b88	cmp x9,x3
00bc6b8c	and x12,x8,#-0x2
00bc6b90	csel x6,x9,x3,cc
00bc6b94	sub x9,x12,#0x1
00bc6b98	tst w10,#0x1
00bc6b9c	mov w10,#0x4
00bc6ba0	ubfx x12,x8,#0x1,#0x7
00bc6ba4	add x7,x11,x2, LSL #0x2
00bc6ba8	csel x1,x10,x9,eq
00bc6bac	tst x8,#0x1
00bc6bb0	csel x20,x12,x13,eq
00bc6bb4	sub x9,x1,x20
00bc6bb8	cmp x9,x6
00bc6bbc	b.cs 0x00bc6be0
00bc6bc0	sub x8,x6,x1
00bc6bc4	mov x0,x19
00bc6bc8	mov x3,x20
00bc6bcc	add x2,x8,x20
00bc6bd0	mov x4,x20
00bc6bd4	mov x5,xzr
00bc6bd8	bl 0x00c43d40
00bc6bdc	b 0x00bc6c28
00bc6be0	cbz x6,0x00bc6c28
00bc6be4	ldr x9,[x19, #0x10]
00bc6be8	add x10,x19,#0x4
00bc6bec	tst x8,#0x1
00bc6bf0	lsl x2,x6,#0x2
00bc6bf4	mov x1,x7
00bc6bf8	mov x22,x6
00bc6bfc	csel x21,x10,x9,eq
00bc6c00	add x0,x21,x20, LSL #0x2
00bc6c04	bl 0x00c2ff60
00bc6c08	ldrb w9,[x19]
00bc6c0c	add x8,x20,x22
00bc6c10	tbnz w9,#0x0,0x00bc6c20
00bc6c14	lsl w9,w8,#0x1
00bc6c18	strb w9,[x19]
00bc6c1c	b 0x00bc6c24
00bc6c20	str x8,[x19, #0x8]
00bc6c24	str wzr,[x21, x8, LSL #0x2]
00bc6c28	mov x0,x19
00bc6c2c	ldp x20,x19,[sp, #0x20]
00bc6c30	ldp x22,x21,[sp, #0x10]
00bc6c34	ldp x29,x30,[sp], #0x30
00bc6c38	autiasp
00bc6c3c	ret
00bc6c40	bl 0x00bc531c
