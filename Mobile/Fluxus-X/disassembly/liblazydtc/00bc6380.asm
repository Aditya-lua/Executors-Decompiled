; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find @ 00bc6380
00bc6380	bti c
00bc6384	ldrb w9,[x0]
00bc6388	ldr x8,[x0, #0x8]
00bc638c	lsr x10,x9,#0x1
00bc6390	tst w9,#0x1
00bc6394	csel x8,x10,x8,eq
00bc6398	subs x8,x8,x2
00bc639c	b.ls 0x00bc63ec
00bc63a0	paciasp
00bc63a4	stp x29,x30,[sp, #-0x20]!
00bc63a8	str x19,[sp, #0x10]
00bc63ac	mov x29,sp
00bc63b0	ldr x10,[x0, #0x10]
00bc63b4	add x11,x0,#0x4
00bc63b8	tst w9,#0x1
00bc63bc	csel x19,x11,x10,eq
00bc63c0	add x0,x19,x2, LSL #0x2
00bc63c4	mov x2,x8
00bc63c8	bl 0x00c43a60
00bc63cc	sub x8,x0,x19
00bc63d0	cmp x0,#0x0
00bc63d4	asr x8,x8,#0x2
00bc63d8	csinv x0,x8,xzr,ne
00bc63dc	ldr x19,[sp, #0x10]
00bc63e0	ldp x29,x30,[sp], #0x20
00bc63e4	autiasp
00bc63e8	ret
00bc63ec	mov x0,#-0x1
00bc63f0	ret
