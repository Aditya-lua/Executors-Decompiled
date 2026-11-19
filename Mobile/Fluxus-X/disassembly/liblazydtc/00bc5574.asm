; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::__init @ 00bc5574
00bc5574	paciasp
00bc5578	stp x29,x30,[sp, #-0x30]!
00bc557c	stp x22,x21,[sp, #0x10]
00bc5580	stp x20,x19,[sp, #0x20]
00bc5584	mov x29,sp
00bc5588	orr x8,xzr,#0x3ffffffffffffff8
00bc558c	cmp x3,x8
00bc5590	b.cs 0x00bc560c
00bc5594	mov x19,x2
00bc5598	mov x20,x0
00bc559c	cmp x3,#0x4
00bc55a0	b.hi 0x00bc55b4
00bc55a4	lsl w8,w19,#0x1
00bc55a8	strb w8,[x20], #0x4
00bc55ac	cbnz x19,0x00bc55e8
00bc55b0	b 0x00bc55f4
00bc55b4	orr x8,x3,#0x1
00bc55b8	mov w9,#0x8
00bc55bc	mov x21,x1
00bc55c0	cmp x8,#0x5
00bc55c4	csinc x22,x9,x8,eq
00bc55c8	lsl x0,x22,#0x2
00bc55cc	bl 0x00c2fed0
00bc55d0	orr x8,x22,#0x1
00bc55d4	mov x1,x21
00bc55d8	stp x19,x0,[x20, #0x8]
00bc55dc	str x8,[x20]
00bc55e0	mov x20,x0
00bc55e4	cbz x19,0x00bc55f4
00bc55e8	lsl x2,x19,#0x2
00bc55ec	mov x0,x20
00bc55f0	bl 0x00c2ff60
00bc55f4	str wzr,[x20, x19, LSL #0x2]
00bc55f8	ldp x20,x19,[sp, #0x20]
00bc55fc	ldp x22,x21,[sp, #0x10]
00bc5600	ldp x29,x30,[sp], #0x30
00bc5604	autiasp
00bc5608	ret
00bc560c	bl 0x00bc5610
