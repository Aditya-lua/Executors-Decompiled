; std::__ndk1::__codecvt_utf16<char16_t,true>::do_length @ 00c00d30
00c00d30	bti c
00c00d34	sub x8,x3,x2
00c00d38	cmp x8,#0x2
00c00d3c	mov x8,x2
00c00d40	b.lt 0x00c00d70
00c00d44	ldr w9,[x0, #0x18]
00c00d48	mov x8,x2
00c00d4c	tbz w9,#0x2,0x00c00d70
00c00d50	ldrb w8,[x2]
00c00d54	cmp w8,#0xff
00c00d58	mov x8,x2
00c00d5c	b.ne 0x00c00d70
00c00d60	ldrb w8,[x2, #0x1]
00c00d64	cmp w8,#0xfe
00c00d68	cset w8,eq
00c00d6c	add x8,x2,w8, UXTW  #0x1
00c00d70	cbz x4,0x00c00dbc
00c00d74	sub x9,x3,#0x1
00c00d78	cmp x8,x9
00c00d7c	b.cs 0x00c00dbc
00c00d80	ldr x10,[x0, #0x10]
00c00d84	mov w11,#0x1
00c00d88	ldrb w12,[x8, #0x1]
00c00d8c	and w13,w12,#0xf8
00c00d90	cmp w13,#0xd8
00c00d94	b.eq 0x00c00dbc
00c00d98	ldrb w13,[x8]
00c00d9c	orr w12,w13,w12, LSL #0x8
00c00da0	cmp x10,x12
00c00da4	cset w12,cs
00c00da8	add x8,x8,w12, UXTW  #0x1
00c00dac	ccmp x8,x9,#0x2,cs
00c00db0	ccmp x11,x4,#0x2,cc
00c00db4	add x11,x11,#0x1
00c00db8	b.cc 0x00c00d88
00c00dbc	sub w0,w8,w2
00c00dc0	ret
