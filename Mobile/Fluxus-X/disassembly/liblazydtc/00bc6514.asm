; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find_last_of @ 00bc6514
00bc6514	bti c
00bc6518	ldrb w9,[x0]
00bc651c	ldr x8,[x0, #0x10]
00bc6520	add x10,x0,#0x4
00bc6524	tst w9,#0x1
00bc6528	csel x8,x10,x8,eq
00bc652c	cbz x3,0x00bc6590
00bc6530	paciasp
00bc6534	stp x29,x30,[sp, #-0x30]!
00bc6538	stp x22,x21,[sp, #0x10]
00bc653c	stp x20,x19,[sp, #0x20]
00bc6540	mov x29,sp
00bc6544	lsr x10,x9,#0x1
00bc6548	ldr x11,[x0, #0x8]
00bc654c	tst w9,#0x1
00bc6550	mov x19,x3
00bc6554	mov x20,x1
00bc6558	sub x22,x8,#0x4
00bc655c	csel x9,x10,x11,eq
00bc6560	cmp x2,x9
00bc6564	csinc x9,x9,x2,cs
00bc6568	lsl x21,x9,#0x2
00bc656c	cbz x21,0x00bc6598
00bc6570	ldr w1,[x22, x21#0x0]
00bc6574	mov x0,x20
00bc6578	mov x2,x19
00bc657c	bl 0x00c43a60
00bc6580	sub x21,x21,#0x4
00bc6584	cbz x0,0x00bc656c
00bc6588	asr x0,x21,#0x2
00bc658c	b 0x00bc659c
00bc6590	mov x0,#-0x1
00bc6594	ret
00bc6598	mov x0,#-0x1
00bc659c	ldp x20,x19,[sp, #0x20]
00bc65a0	ldp x22,x21,[sp, #0x10]
00bc65a4	ldp x29,x30,[sp], #0x30
00bc65a8	autiasp
00bc65ac	ret
