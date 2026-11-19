; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::__grow_by @ 00bc65b0
00bc65b0	paciasp
00bc65b4	stp x29,x30,[sp, #-0x60]!
00bc65b8	stp x28,x27,[sp, #0x10]
00bc65bc	stp x26,x25,[sp, #0x20]
00bc65c0	stp x24,x23,[sp, #0x30]
00bc65c4	stp x22,x21,[sp, #0x40]
00bc65c8	stp x20,x19,[sp, #0x50]
00bc65cc	mov x29,sp
00bc65d0	mov x28,#-0x9
00bc65d4	movk x28,#0x3fff, LSL #48
00bc65d8	sub x8,x28,x1
00bc65dc	cmp x2,x8
00bc65e0	b.hi 0x00bc66e0
00bc65e4	ldrb w8,[x0]
00bc65e8	ldr x9,[x0, #0x10]
00bc65ec	add x10,x0,#0x4
00bc65f0	mov x21,x6
00bc65f4	mov x22,x5
00bc65f8	mov x24,x4
00bc65fc	tst w8,#0x1
00bc6600	mov x8,#-0xe
00bc6604	mov x20,x1
00bc6608	movk x8,#0x1fff, LSL #48
00bc660c	mov x25,x3
00bc6610	mov x19,x0
00bc6614	csel x23,x10,x9,eq
00bc6618	cmp x1,x8
00bc661c	b.hi 0x00bc6654
00bc6620	lsl x8,x20,#0x1
00bc6624	add x9,x2,x20
00bc6628	mov w10,#0x8
00bc662c	cmp x9,x8
00bc6630	csel x8,x9,x8,hi
00bc6634	orr x9,x8,#0x1
00bc6638	cmp x9,#0x5
00bc663c	csinc x9,x10,x9,eq
00bc6640	cmp x8,#0x5
00bc6644	mov w8,#0x5
00bc6648	csel x28,x8,x9,cc
00bc664c	lsr x8,x28,#0x3e
00bc6650	cbnz x8,0x00bc66e4
00bc6654	lsl x0,x28,#0x2
00bc6658	bl 0x00c2fed0
00bc665c	lsl x27,x24,#0x2
00bc6660	mov x26,x0
00bc6664	cbz x24,0x00bc6678
00bc6668	mov x0,x26
00bc666c	mov x1,x23
00bc6670	mov x2,x27
00bc6674	bl 0x00c2ff60
00bc6678	add x8,x22,x24
00bc667c	subs x8,x25,x8
00bc6680	b.eq 0x00bc669c
00bc6684	add x9,x23,x27
00bc6688	add x10,x26,x27
00bc668c	lsl x2,x8,#0x2
00bc6690	add x1,x9,x22, LSL #0x2
00bc6694	add x0,x10,x21, LSL #0x2
00bc6698	bl 0x00c2ff60
00bc669c	add x8,x20,#0x1
00bc66a0	cmp x8,#0x5
00bc66a4	b.eq 0x00bc66b4
00bc66a8	lsl x1,x8,#0x2
00bc66ac	mov x0,x23
00bc66b0	bl 0x00c2fe80
00bc66b4	orr x8,x28,#0x1
00bc66b8	str x26,[x19, #0x10]
00bc66bc	str x8,[x19]
00bc66c0	ldp x20,x19,[sp, #0x50]
00bc66c4	ldp x22,x21,[sp, #0x40]
00bc66c8	ldp x24,x23,[sp, #0x30]
00bc66cc	ldp x26,x25,[sp, #0x20]
00bc66d0	ldp x28,x27,[sp, #0x10]
00bc66d4	ldp x29,x30,[sp], #0x60
00bc66d8	autiasp
00bc66dc	ret
00bc66e0	bl 0x00bc5610
00bc66e4	bl 0x007fe1b8
