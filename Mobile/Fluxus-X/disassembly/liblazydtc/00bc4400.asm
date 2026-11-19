; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find @ 00bc4400
00bc4400	bti c
00bc4404	ldrb w9,[x0]
00bc4408	ldr x8,[x0, #0x8]
00bc440c	lsr x10,x9,#0x1
00bc4410	tst w9,#0x1
00bc4414	csel x8,x10,x8,eq
00bc4418	subs x8,x8,x2
00bc441c	b.ls 0x00bc4468
00bc4420	paciasp
00bc4424	stp x29,x30,[sp, #-0x20]!
00bc4428	str x19,[sp, #0x10]
00bc442c	mov x29,sp
00bc4430	ldr x10,[x0, #0x10]
00bc4434	tst w9,#0x1
00bc4438	and w1,w1,#0xff
00bc443c	csinc x19,x10,x0,ne
00bc4440	add x0,x19,x2
00bc4444	mov x2,x8
00bc4448	bl 0x00c300a0
00bc444c	sub x8,x0,x19
00bc4450	cmp x0,#0x0
00bc4454	csinv x0,x8,xzr,ne
00bc4458	ldr x19,[sp, #0x10]
00bc445c	ldp x29,x30,[sp], #0x20
00bc4460	autiasp
00bc4464	ret
00bc4468	mov x0,#-0x1
00bc446c	ret
