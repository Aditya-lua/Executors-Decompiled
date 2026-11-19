; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find_first_not_of @ 00bc5810
00bc5810	paciasp
00bc5814	stp x29,x30,[sp, #-0x40]!
00bc5818	str x23,[sp, #0x10]
00bc581c	stp x22,x21,[sp, #0x20]
00bc5820	stp x20,x19,[sp, #0x30]
00bc5824	mov x29,sp
00bc5828	ldrb w8,[x0]
00bc582c	ldp x9,x11,[x0, #0x8]
00bc5830	add x12,x0,#0x4
00bc5834	lsr x10,x8,#0x1
00bc5838	tst w8,#0x1
00bc583c	csel x21,x12,x11,eq
00bc5840	csel x8,x10,x9,eq
00bc5844	cmp x2,x8
00bc5848	b.cs 0x00bc5884
00bc584c	add x22,x21,x2, LSL #0x2
00bc5850	mov x19,x3
00bc5854	cbz x3,0x00bc588c
00bc5858	lsl x8,x8,#0x2
00bc585c	mov x20,x1
00bc5860	sub x23,x8,x2, LSL #0x2
00bc5864	ldr w1,[x22]
00bc5868	mov x0,x20
00bc586c	mov x2,x19
00bc5870	bl 0x00c43a60
00bc5874	cbz x0,0x00bc588c
00bc5878	subs x23,x23,#0x4
00bc587c	add x22,x22,#0x4
00bc5880	b.ne 0x00bc5864
00bc5884	mov x0,#-0x1
00bc5888	b 0x00bc5894
00bc588c	sub x8,x22,x21
00bc5890	asr x0,x8,#0x2
00bc5894	ldp x20,x19,[sp, #0x30]
00bc5898	ldr x23,[sp, #0x10]
00bc589c	ldp x22,x21,[sp, #0x20]
00bc58a0	ldp x29,x30,[sp], #0x40
00bc58a4	autiasp
00bc58a8	ret
