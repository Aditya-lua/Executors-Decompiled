; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::compare @ 00bc6c44
00bc6c44	paciasp
00bc6c48	stp x29,x30,[sp, #-0x30]!
00bc6c4c	stp x22,x21,[sp, #0x10]
00bc6c50	stp x20,x19,[sp, #0x20]
00bc6c54	mov x29,sp
00bc6c58	mov x21,x0
00bc6c5c	mov x0,x1
00bc6c60	mov x20,x1
00bc6c64	bl 0x00c437b0
00bc6c68	ldrb w8,[x21]
00bc6c6c	ldr x9,[x21, #0x8]
00bc6c70	lsr x10,x8,#0x1
00bc6c74	tst w8,#0x1
00bc6c78	csel x22,x10,x9,eq
00bc6c7c	cmn x0,#0x1
00bc6c80	b.eq 0x00bc6cd4
00bc6c84	cmp x0,x22
00bc6c88	mov x19,x0
00bc6c8c	csel x2,x0,x22,cc
00bc6c90	cbz x2,0x00bc6cb4
00bc6c94	ldr x9,[x21, #0x10]
00bc6c98	add x10,x21,#0x4
00bc6c9c	tst w8,#0x1
00bc6ca0	mov x1,x20
00bc6ca4	csel x0,x10,x9,eq
00bc6ca8	bl 0x00c438b0
00bc6cac	cbz w0,0x00bc6cb4
00bc6cb0	b 0x00bc6cc0
00bc6cb4	cmp x22,x19
00bc6cb8	cset w8,hi
00bc6cbc	csinv w0,w8,wzr,cs
00bc6cc0	ldp x20,x19,[sp, #0x20]
00bc6cc4	ldp x22,x21,[sp, #0x10]
00bc6cc8	ldp x29,x30,[sp], #0x30
00bc6ccc	autiasp
00bc6cd0	ret
00bc6cd4	bl 0x00bc531c
