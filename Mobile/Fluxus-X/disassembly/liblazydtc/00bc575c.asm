; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find_last_not_of @ 00bc575c
00bc575c	paciasp
00bc5760	stp x29,x30,[sp, #-0x30]!
00bc5764	stp x22,x21,[sp, #0x10]
00bc5768	stp x20,x19,[sp, #0x20]
00bc576c	mov x29,sp
00bc5770	ldrb w8,[x0]
00bc5774	ldp x9,x11,[x0, #0x8]
00bc5778	mov x19,x3
00bc577c	mov x20,x1
00bc5780	lsr x10,x8,#0x1
00bc5784	tst w8,#0x1
00bc5788	add x8,x0,#0x4
00bc578c	csel x21,x8,x11,eq
00bc5790	csel x9,x10,x9,eq
00bc5794	cmp x2,x9
00bc5798	csinc x8,x9,x2,cs
00bc579c	lsl x8,x8,#0x2
00bc57a0	sub x8,x8,#0x4
00bc57a4	cmn x8,#0x4
00bc57a8	b.eq 0x00bc57d4
00bc57ac	mov x22,x8
00bc57b0	cbz x19,0x00bc57cc
00bc57b4	ldr w1,[x21, x22#0x0]
00bc57b8	mov x0,x20
00bc57bc	mov x2,x19
00bc57c0	bl 0x00c43a60
00bc57c4	sub x8,x22,#0x4
00bc57c8	cbnz x0,0x00bc57a4
00bc57cc	asr x0,x22,#0x2
00bc57d0	b 0x00bc57d8
00bc57d4	mov x0,#-0x1
00bc57d8	ldp x20,x19,[sp, #0x20]
00bc57dc	ldp x22,x21,[sp, #0x10]
00bc57e0	ldp x29,x30,[sp], #0x30
00bc57e4	autiasp
00bc57e8	ret
