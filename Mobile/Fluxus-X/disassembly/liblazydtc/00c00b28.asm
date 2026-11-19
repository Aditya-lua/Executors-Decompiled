; std::__ndk1::__codecvt_utf16<char16_t,false>::do_length @ 00c00b28
00c00b28	bti c
00c00b2c	sub x8,x3,x2
00c00b30	cmp x8,#0x2
00c00b34	mov x8,x2
00c00b38	b.lt 0x00c00b68
00c00b3c	ldr w9,[x0, #0x18]
00c00b40	mov x8,x2
00c00b44	tbz w9,#0x2,0x00c00b68
00c00b48	ldrb w8,[x2]
00c00b4c	cmp w8,#0xfe
00c00b50	mov x8,x2
00c00b54	b.ne 0x00c00b68
00c00b58	ldrb w8,[x2, #0x1]
00c00b5c	cmp w8,#0xff
00c00b60	cset w8,eq
00c00b64	add x8,x2,w8, UXTW  #0x1
00c00b68	cbz x4,0x00c00bb4
00c00b6c	sub x9,x3,#0x1
00c00b70	cmp x8,x9
00c00b74	b.cs 0x00c00bb4
00c00b78	ldr x10,[x0, #0x10]
00c00b7c	mov w11,#0x1
00c00b80	ldrb w12,[x8]
00c00b84	and w13,w12,#0xf8
00c00b88	cmp w13,#0xd8
00c00b8c	b.eq 0x00c00bb4
00c00b90	ldrb w13,[x8, #0x1]
00c00b94	orr w12,w13,w12, LSL #0x8
00c00b98	cmp x10,x12
00c00b9c	cset w12,cs
00c00ba0	add x8,x8,w12, UXTW  #0x1
00c00ba4	ccmp x8,x9,#0x2,cs
00c00ba8	ccmp x11,x4,#0x2,cc
00c00bac	add x11,x11,#0x1
00c00bb0	b.cc 0x00c00b80
00c00bb4	sub w0,w8,w2
00c00bb8	ret
