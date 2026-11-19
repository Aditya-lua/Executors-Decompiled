; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::find_first_of @ 00bc5c38
00bc5c38	bti c
00bc5c3c	mov x8,x0
00bc5c40	mov x0,#-0x1
00bc5c44	ldrb w9,[x8]
00bc5c48	ldp x11,x10,[x8, #0x8]
00bc5c4c	add x8,x8,#0x4
00bc5c50	lsr x12,x9,#0x1
00bc5c54	tst w9,#0x1
00bc5c58	csel x8,x8,x10,eq
00bc5c5c	csel x9,x12,x11,eq
00bc5c60	cbz x3,0x00bc5cbc
00bc5c64	cmp x2,x9
00bc5c68	b.cs 0x00bc5cbc
00bc5c6c	add x9,x8,x9, LSL #0x2
00bc5c70	add x10,x8,x2, LSL #0x2
00bc5c74	lsl x11,x3,#0x2
00bc5c78	ldr w12,[x10]
00bc5c7c	mov x13,x11
00bc5c80	mov x14,x1
00bc5c84	ldr w15,[x14]
00bc5c88	cmp w12,w15
00bc5c8c	b.eq 0x00bc5cac
00bc5c90	subs x13,x13,#0x4
00bc5c94	add x14,x14,#0x4
00bc5c98	b.ne 0x00bc5c84
00bc5c9c	add x10,x10,#0x4
00bc5ca0	cmp x10,x9
00bc5ca4	b.ne 0x00bc5c78
00bc5ca8	mov x10,x9
00bc5cac	sub x8,x10,x8
00bc5cb0	cmp x10,x9
00bc5cb4	asr x8,x8,#0x2
00bc5cb8	csinv x0,x8,xzr,ne
00bc5cbc	ret
