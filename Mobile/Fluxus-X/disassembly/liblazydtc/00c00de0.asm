; std::__ndk1::__codecvt_utf16<char32_t,false>::do_out @ 00c00de0
00c00de0	bti c
00c00de4	ldrb w9,[x0, #0x18]
00c00de8	ldr x8,[x0, #0x10]
00c00dec	tbz w9,#0x1,0x00c00e0c
00c00df0	sub x9,x6,x5
00c00df4	cmp x9,#0x2
00c00df8	b.ge 0x00c00e04
00c00dfc	mov w0,#0x1
00c00e00	b 0x00c00eac
00c00e04	mov w9,#0xfffe
00c00e08	strh w9,[x5], #0x2
00c00e0c	cmp x2,x3
00c00e10	b.cs 0x00c00ea0
00c00e14	mov w9,#0x3fc0
00c00e18	mov w10,#0xd8
00c00e1c	b 0x00c00e30
00c00e20	add x2,x2,#0x4
00c00e24	strb w11,[x5], #0x1
00c00e28	cmp x2,x3
00c00e2c	b.cs 0x00c00ea0
00c00e30	ldr w11,[x2]
00c00e34	lsr w12,w11,#0xb
00c00e38	cmp w12,#0x1b
00c00e3c	ccmp x8,x11,#0x0,ne
00c00e40	b.cc 0x00c00ea8
00c00e44	lsr w13,w11,#0x10
00c00e48	sub x12,x6,x5
00c00e4c	cbnz w13,0x00c00e64
00c00e50	cmp x12,#0x2
00c00e54	b.lt 0x00c00dfc
00c00e58	lsr w12,w11,#0x8
00c00e5c	strb w12,[x5], #0x1
00c00e60	b 0x00c00e20
00c00e64	cmp x12,#0x4
00c00e68	b.lt 0x00c00dfc
00c00e6c	lsr w12,w11,#0xa
00c00e70	mov w14,#0xdc
00c00e74	bfxil w14,w11,#0x8,#0x2
00c00e78	and w12,w12,#0x7c0
00c00e7c	add w12,w12,w9
00c00e80	strb w14,[x5, #0x2]
00c00e84	orr w13,w10,w12, LSR #0x8
00c00e88	bfxil w12,w11,#0xa,#0x6
00c00e8c	strb w12,[x5, #0x1]
00c00e90	add x12,x5,#0x3
00c00e94	strb w13,[x5]
00c00e98	mov x5,x12
00c00e9c	b 0x00c00e20
00c00ea0	mov w0,wzr
00c00ea4	b 0x00c00eac
00c00ea8	mov w0,#0x2
00c00eac	str x2,[x4]
00c00eb0	str x5,[x7]
00c00eb4	ret
