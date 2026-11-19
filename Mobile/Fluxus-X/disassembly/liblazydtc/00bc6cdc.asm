; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::compare @ 00bc6cdc
00bc6cdc	paciasp
00bc6ce0	stp x29,x30,[sp, #-0x20]!
00bc6ce4	stp x20,x19,[sp, #0x10]
00bc6ce8	mov x29,sp
00bc6cec	ldrb w8,[x0]
00bc6cf0	ldr x9,[x0, #0x8]
00bc6cf4	lsr x10,x8,#0x1
00bc6cf8	tst w8,#0x1
00bc6cfc	csel x9,x10,x9,eq
00bc6d00	cmn x4,#0x1
00bc6d04	b.eq 0x00bc6d68
00bc6d08	subs x9,x9,x1
00bc6d0c	b.cc 0x00bc6d68
00bc6d10	cmp x9,x2
00bc6d14	mov x19,x4
00bc6d18	csel x20,x9,x2,cc
00bc6d1c	cmp x4,x20
00bc6d20	csel x2,x4,x20,cc
00bc6d24	cbz x2,0x00bc6d4c
00bc6d28	ldr x9,[x0, #0x10]
00bc6d2c	add x10,x0,#0x4
00bc6d30	tst w8,#0x1
00bc6d34	csel x8,x10,x9,eq
00bc6d38	add x0,x8,x1, LSL #0x2
00bc6d3c	mov x1,x3
00bc6d40	bl 0x00c438b0
00bc6d44	cbz w0,0x00bc6d4c
00bc6d48	b 0x00bc6d58
00bc6d4c	cmp x20,x19
00bc6d50	cset w8,hi
00bc6d54	csinv w0,w8,wzr,cs
00bc6d58	ldp x20,x19,[sp, #0x10]
00bc6d5c	ldp x29,x30,[sp], #0x20
00bc6d60	autiasp
00bc6d64	ret
00bc6d68	bl 0x00bc531c
