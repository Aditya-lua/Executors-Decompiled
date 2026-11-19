; std::__ndk1::__codecvt_utf16<char16_t,false>::do_in @ 00c00a6c
00c00a6c	bti c
00c00a70	sub x8,x3,x2
00c00a74	cmp x8,#0x2
00c00a78	b.lt 0x00c00aa0
00c00a7c	ldr w8,[x0, #0x18]
00c00a80	tbz w8,#0x2,0x00c00aa0
00c00a84	ldrb w8,[x2]
00c00a88	cmp w8,#0xfe
00c00a8c	b.ne 0x00c00aa0
00c00a90	ldrb w8,[x2, #0x1]
00c00a94	cmp w8,#0xff
00c00a98	cset w8,eq
00c00a9c	add x2,x2,w8, UXTW  #0x1
00c00aa0	sub x8,x3,#0x1
00c00aa4	cmp x2,x8
00c00aa8	b.cs 0x00c00aec
00c00aac	ldr x9,[x0, #0x10]
00c00ab0	mov w0,#0x2
00c00ab4	cmp x5,x6
00c00ab8	b.cs 0x00c00aec
00c00abc	ldrb w10,[x2]
00c00ac0	and w11,w10,#0xf8
00c00ac4	cmp w11,#0xd8
00c00ac8	b.eq 0x00c00af4
00c00acc	ldrb w11,[x2, #0x1]
00c00ad0	orr w10,w11,w10, LSL #0x8
00c00ad4	cmp x9,x10
00c00ad8	b.cc 0x00c00af4
00c00adc	add x2,x2,#0x2
00c00ae0	strh w10,[x5], #0x2
00c00ae4	cmp x2,x8
00c00ae8	b.cc 0x00c00ab4
00c00aec	cmp x2,x3
00c00af0	cset w0,cc
00c00af4	str x2,[x4]
00c00af8	str x5,[x7]
00c00afc	ret
