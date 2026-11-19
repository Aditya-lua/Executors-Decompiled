; std::__ndk1::__codecvt_utf8<char16_t>::do_out @ 00bffe20
00bffe20	bti c
00bffe24	ldrb w9,[x0, #0x18]
00bffe28	ldr x8,[x0, #0x10]
00bffe2c	tbz w9,#0x1,0x00bffe5c
00bffe30	sub x9,x6,x5
00bffe34	cmp x9,#0x3
00bffe38	b.ge 0x00bffe44
00bffe3c	mov w0,#0x1
00bffe40	b 0x00bfff20
00bffe44	mov w9,#0xbbef
00bffe48	mov w10,#0xbf
00bffe4c	strh w9,[x5]
00bffe50	add x9,x5,#0x3
00bffe54	strb w10,[x5, #0x2]
00bffe58	mov x5,x9
00bffe5c	cmp x2,x3
00bffe60	b.cs 0x00bfff14
00bffe64	mov w9,#0xd800
00bffe68	b 0x00bffe7c
00bffe6c	mov x5,x10
00bffe70	add x2,x2,#0x2
00bffe74	cmp x2,x3
00bffe78	b.cs 0x00bfff14
00bffe7c	ldrh w10,[x2]
00bffe80	and w11,w10,#0xf800
00bffe84	cmp w11,w9
00bffe88	ccmp x8,x10,#0x0,ne
00bffe8c	b.cc 0x00bfff1c
00bffe90	cmp w10,#0x7f
00bffe94	b.hi 0x00bffeac
00bffe98	sub x11,x6,x5
00bffe9c	cmp x11,#0x1
00bffea0	b.lt 0x00bffe3c
00bffea4	strb w10,[x5], #0x1
00bffea8	b 0x00bffe70
00bffeac	cmp w10,#0x7ff
00bffeb0	sub x11,x6,x5
00bffeb4	b.hi 0x00bffee0
00bffeb8	cmp x11,#0x2
00bffebc	b.lt 0x00bffe3c
00bffec0	lsr w11,w10,#0x6
00bffec4	mov w12,#0x80
00bffec8	bfxil w12,w10,#0x0,#0x6
00bffecc	add x10,x5,#0x2
00bffed0	orr w11,w11,#0xc0
00bffed4	strb w11,[x5]
00bffed8	strb w12,[x5, #0x1]
00bffedc	b 0x00bffe6c
00bffee0	cmp x11,#0x3
00bffee4	b.lt 0x00bffe3c
00bffee8	lsr w11,w10,#0xc
00bffeec	mov w12,#0x80
00bffef0	mov w13,#0x80
00bffef4	bfxil w12,w10,#0x6,#0x6
00bffef8	bfxil w13,w10,#0x0,#0x6
00bffefc	add x10,x5,#0x3
00bfff00	orr w11,w11,#0xe0
00bfff04	strb w11,[x5]
00bfff08	strb w12,[x5, #0x1]
00bfff0c	strb w13,[x5, #0x2]
00bfff10	b 0x00bffe6c
00bfff14	mov w0,wzr
00bfff18	b 0x00bfff20
00bfff1c	mov w0,#0x2
00bfff20	str x2,[x4]
00bfff24	str x5,[x7]
00bfff28	ret
