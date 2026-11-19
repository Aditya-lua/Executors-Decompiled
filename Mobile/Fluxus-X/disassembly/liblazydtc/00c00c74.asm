; std::__ndk1::__codecvt_utf16<char16_t,true>::do_in @ 00c00c74
00c00c74	bti c
00c00c78	sub x8,x3,x2
00c00c7c	cmp x8,#0x2
00c00c80	b.lt 0x00c00ca8
00c00c84	ldr w8,[x0, #0x18]
00c00c88	tbz w8,#0x2,0x00c00ca8
00c00c8c	ldrb w8,[x2]
00c00c90	cmp w8,#0xff
00c00c94	b.ne 0x00c00ca8
00c00c98	ldrb w8,[x2, #0x1]
00c00c9c	cmp w8,#0xfe
00c00ca0	cset w8,eq
00c00ca4	add x2,x2,w8, UXTW  #0x1
00c00ca8	sub x8,x3,#0x1
00c00cac	cmp x2,x8
00c00cb0	b.cs 0x00c00cf4
00c00cb4	ldr x9,[x0, #0x10]
00c00cb8	mov w0,#0x2
00c00cbc	cmp x5,x6
00c00cc0	b.cs 0x00c00cf4
00c00cc4	ldrb w10,[x2, #0x1]
00c00cc8	and w11,w10,#0xf8
00c00ccc	cmp w11,#0xd8
00c00cd0	b.eq 0x00c00cfc
00c00cd4	ldrb w11,[x2]
00c00cd8	orr w10,w11,w10, LSL #0x8
00c00cdc	cmp x9,x10
00c00ce0	b.cc 0x00c00cfc
00c00ce4	add x2,x2,#0x2
00c00ce8	strh w10,[x5], #0x2
00c00cec	cmp x2,x8
00c00cf0	b.cc 0x00c00cbc
00c00cf4	cmp x2,x3
00c00cf8	cset w0,cc
00c00cfc	str x2,[x4]
00c00d00	str x5,[x7]
00c00d04	ret
