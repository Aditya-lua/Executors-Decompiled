; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::__init @ 00bc63f4
00bc63f4	paciasp
00bc63f8	stp x29,x30,[sp, #-0x30]!
00bc63fc	stp x22,x21,[sp, #0x10]
00bc6400	stp x20,x19,[sp, #0x20]
00bc6404	mov x29,sp
00bc6408	orr x8,xzr,#0x3ffffffffffffff8
00bc640c	cmp x1,x8
00bc6410	b.cs 0x00bc64c4
00bc6414	mov w21,w2
00bc6418	mov x19,x1
00bc641c	mov x20,x0
00bc6420	cmp x1,#0x5
00bc6424	b.cs 0x00bc6438
00bc6428	lsl w8,w19,#0x1
00bc642c	strb w8,[x20], #0x4
00bc6430	cbnz x19,0x00bc6460
00bc6434	b 0x00bc64ac
00bc6438	orr x8,x19,#0x1
00bc643c	mov w9,#0x8
00bc6440	cmp x8,#0x5
00bc6444	csinc x22,x9,x8,eq
00bc6448	lsl x0,x22,#0x2
00bc644c	bl 0x00c2fed0
00bc6450	orr x8,x22,#0x1
00bc6454	stp x19,x0,[x20, #0x8]
00bc6458	str x8,[x20]
00bc645c	mov x20,x0
00bc6460	cmp x19,#0x8
00bc6464	mov x8,x20
00bc6468	mov x9,x19
00bc646c	b.cc 0x00bc64a0
00bc6470	and x10,x19,#0x3ffffffffffffff8
00bc6474	dup v0.4S,w21
00bc6478	and x9,x19,#0x7
00bc647c	add x8,x20,x10, LSL #0x2
00bc6480	add x11,x20,#0x10
00bc6484	mov x12,x10
00bc6488	subs x12,x12,#0x8
00bc648c	stp q0,q0,[x11, #-0x10]
00bc6490	add x11,x11,#0x20
00bc6494	b.ne 0x00bc6488
00bc6498	cmp x19,x10
00bc649c	b.eq 0x00bc64ac
00bc64a0	subs x9,x9,#0x1
00bc64a4	str w21,[x8], #0x4
00bc64a8	b.ne 0x00bc64a0
00bc64ac	str wzr,[x20, x19, LSL #0x2]
00bc64b0	ldp x20,x19,[sp, #0x20]
00bc64b4	ldp x22,x21,[sp, #0x10]
00bc64b8	ldp x29,x30,[sp], #0x30
00bc64bc	autiasp
00bc64c0	ret
00bc64c4	bl 0x00bc5610
