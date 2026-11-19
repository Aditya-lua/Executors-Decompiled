; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::insert @ 00bc5b18
00bc5b18	paciasp
00bc5b1c	stp x29,x30,[sp, #-0x40]!
00bc5b20	stp x24,x23,[sp, #0x10]
00bc5b24	stp x22,x21,[sp, #0x20]
00bc5b28	stp x20,x19,[sp, #0x30]
00bc5b2c	mov x29,sp
00bc5b30	ldrb w9,[x0]
00bc5b34	ldr x8,[x0, #0x8]
00bc5b38	lsr x10,x9,#0x1
00bc5b3c	tst w9,#0x1
00bc5b40	csel x21,x10,x8,eq
00bc5b44	cmp x21,x1
00bc5b48	b.cc 0x00bc5c34
00bc5b4c	ldr x8,[x0]
00bc5b50	tst w9,#0x1
00bc5b54	mov w9,#0x4
00bc5b58	mov x4,x1
00bc5b5c	mov x20,x3
00bc5b60	mov x19,x0
00bc5b64	and x10,x8,#-0x2
00bc5b68	mov x22,x2
00bc5b6c	sub x10,x10,#0x1
00bc5b70	csel x1,x9,x10,eq
00bc5b74	sub x9,x1,x21
00bc5b78	cmp x9,x3
00bc5b7c	b.cs 0x00bc5ba4
00bc5b80	add x8,x21,x20
00bc5b84	mov x0,x19
00bc5b88	mov x3,x21
00bc5b8c	sub x2,x8,x1
00bc5b90	mov x5,xzr
00bc5b94	mov x6,x20
00bc5b98	mov x7,x22
00bc5b9c	bl 0x00c43d40
00bc5ba0	b 0x00bc5c18
00bc5ba4	cbz x20,0x00bc5c18
00bc5ba8	ldr x9,[x19, #0x10]
00bc5bac	add x10,x19,#0x4
00bc5bb0	tst x8,#0x1
00bc5bb4	csel x24,x10,x9,eq
00bc5bb8	subs x8,x21,x4
00bc5bbc	add x23,x24,x4, LSL #0x2
00bc5bc0	b.eq 0x00bc5be8
00bc5bc4	add x9,x24,x21, LSL #0x2
00bc5bc8	add x0,x23,x20, LSL #0x2
00bc5bcc	lsl x2,x8,#0x2
00bc5bd0	mov x1,x23
00bc5bd4	cmp x22,x9
00bc5bd8	ccmp x22,x23,#0x0,cc
00bc5bdc	csel x9,x20,xzr,cs
00bc5be0	add x22,x22,x9, LSL #0x2
00bc5be4	bl 0x00c2ff60
00bc5be8	lsl x2,x20,#0x2
00bc5bec	mov x0,x23
00bc5bf0	mov x1,x22
00bc5bf4	bl 0x00c2ff60
00bc5bf8	ldrb w9,[x19]
00bc5bfc	add x8,x21,x20
00bc5c00	tbnz w9,#0x0,0x00bc5c10
00bc5c04	lsl w9,w8,#0x1
00bc5c08	strb w9,[x19]
00bc5c0c	b 0x00bc5c14
00bc5c10	str x8,[x19, #0x8]
00bc5c14	str wzr,[x24, x8, LSL #0x2]
00bc5c18	mov x0,x19
00bc5c1c	ldp x20,x19,[sp, #0x30]
00bc5c20	ldp x22,x21,[sp, #0x20]
00bc5c24	ldp x24,x23,[sp, #0x10]
00bc5c28	ldp x29,x30,[sp], #0x40
00bc5c2c	autiasp
00bc5c30	ret
00bc5c34	bl 0x00bc531c
