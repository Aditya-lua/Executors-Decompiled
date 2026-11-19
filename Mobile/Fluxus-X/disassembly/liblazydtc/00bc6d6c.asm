; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::compare @ 00bc6d6c
00bc6d6c	paciasp
00bc6d70	stp x29,x30,[sp, #-0x40]!
00bc6d74	str x23,[sp, #0x10]
00bc6d78	stp x22,x21,[sp, #0x20]
00bc6d7c	stp x20,x19,[sp, #0x30]
00bc6d80	mov x29,sp
00bc6d84	mov x22,x0
00bc6d88	mov x0,x3
00bc6d8c	mov x19,x3
00bc6d90	mov x23,x2
00bc6d94	mov x21,x1
00bc6d98	bl 0x00c437b0
00bc6d9c	ldrb w8,[x22]
00bc6da0	ldr x9,[x22, #0x8]
00bc6da4	lsr x10,x8,#0x1
00bc6da8	tst w8,#0x1
00bc6dac	csel x9,x10,x9,eq
00bc6db0	cmn x0,#0x1
00bc6db4	b.eq 0x00bc6e20
00bc6db8	subs x9,x9,x21
00bc6dbc	b.cc 0x00bc6e20
00bc6dc0	cmp x9,x23
00bc6dc4	mov x20,x0
00bc6dc8	csel x23,x9,x23,cc
00bc6dcc	cmp x0,x23
00bc6dd0	csel x2,x0,x23,cc
00bc6dd4	cbz x2,0x00bc6dfc
00bc6dd8	ldr x9,[x22, #0x10]
00bc6ddc	add x10,x22,#0x4
00bc6de0	tst w8,#0x1
00bc6de4	mov x1,x19
00bc6de8	csel x8,x10,x9,eq
00bc6dec	add x0,x8,x21, LSL #0x2
00bc6df0	bl 0x00c438b0
00bc6df4	cbz w0,0x00bc6dfc
00bc6df8	b 0x00bc6e08
00bc6dfc	cmp x23,x20
00bc6e00	cset w8,hi
00bc6e04	csinv w0,w8,wzr,cs
00bc6e08	ldp x20,x19,[sp, #0x30]
00bc6e0c	ldr x23,[sp, #0x10]
00bc6e10	ldp x22,x21,[sp, #0x20]
00bc6e14	ldp x29,x30,[sp], #0x40
00bc6e18	autiasp
00bc6e1c	ret
00bc6e20	bl 0x00bc531c
