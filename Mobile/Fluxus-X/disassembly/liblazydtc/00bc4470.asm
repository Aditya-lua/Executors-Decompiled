; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__init @ 00bc4470
00bc4470	paciasp
00bc4474	stp x29,x30,[sp, #-0x30]!
00bc4478	stp x22,x21,[sp, #0x10]
00bc447c	stp x20,x19,[sp, #0x20]
00bc4480	mov x29,sp
00bc4484	cmn x1,#0x8
00bc4488	b.cs 0x00bc4500
00bc448c	mov w21,w2
00bc4490	mov x19,x1
00bc4494	mov x20,x0
00bc4498	cmp x1,#0x17
00bc449c	b.cs 0x00bc44b0
00bc44a0	lsl w8,w19,#0x1
00bc44a4	strb w8,[x20], #0x1
00bc44a8	cbnz x19,0x00bc44d8
00bc44ac	b 0x00bc44e8
00bc44b0	orr x8,x19,#0x7
00bc44b4	mov w9,#0x1a
00bc44b8	cmp x8,#0x17
00bc44bc	csinc x22,x9,x8,eq
00bc44c0	mov x0,x22
00bc44c4	bl 0x00c2fed0
00bc44c8	orr x8,x22,#0x1
00bc44cc	stp x19,x0,[x20, #0x8]
00bc44d0	str x8,[x20]
00bc44d4	mov x20,x0
00bc44d8	mov x0,x20
00bc44dc	mov w1,w21
00bc44e0	mov x2,x19
00bc44e4	bl 0x00c301c0
00bc44e8	strb wzr,[x20, x19]
00bc44ec	ldp x20,x19,[sp, #0x20]
00bc44f0	ldp x22,x21,[sp, #0x10]
00bc44f4	ldp x29,x30,[sp], #0x30
00bc44f8	autiasp
00bc44fc	ret
00bc4500	bl 0x007fe124
