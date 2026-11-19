; std::__ndk1::codecvt<char32_t,char,mbstate_t>::do_out @ 00bff358
00bff358	bti c
00bff35c	cmp x2,x3
00bff360	b.cs 0x00bff460
00bff364	mov w8,#0xd800
00bff368	b 0x00bff37c
00bff36c	mov x5,x9
00bff370	add x2,x2,#0x4
00bff374	cmp x2,x3
00bff378	b.cs 0x00bff460
00bff37c	ldr w9,[x2]
00bff380	lsr w10,w9,#0x10
00bff384	and w11,w9,#0xfffff800
00bff388	cmp w10,#0x10
00bff38c	ccmp w11,w8,#0x4,ls
00bff390	b.eq 0x00bff468
00bff394	cmp w9,#0x7f
00bff398	b.hi 0x00bff3b0
00bff39c	sub x10,x6,x5
00bff3a0	cmp x10,#0x1
00bff3a4	b.lt 0x00bff470
00bff3a8	strb w9,[x5], #0x1
00bff3ac	b 0x00bff370
00bff3b0	cmp w9,#0x7ff
00bff3b4	b.hi 0x00bff3e4
00bff3b8	sub x10,x6,x5
00bff3bc	cmp x10,#0x2
00bff3c0	b.lt 0x00bff470
00bff3c4	lsr w10,w9,#0x6
00bff3c8	mov w11,#0x80
00bff3cc	bfxil w11,w9,#0x0,#0x6
00bff3d0	add x9,x5,#0x2
00bff3d4	orr w10,w10,#0xc0
00bff3d8	strb w10,[x5]
00bff3dc	strb w11,[x5, #0x1]
00bff3e0	b 0x00bff36c
00bff3e4	sub x11,x6,x5
00bff3e8	cbnz w10,0x00bff420
00bff3ec	cmp x11,#0x3
00bff3f0	b.lt 0x00bff470
00bff3f4	lsr w10,w9,#0xc
00bff3f8	mov w11,#0x80
00bff3fc	mov w12,#0x80
00bff400	bfxil w11,w9,#0x6,#0x6
00bff404	bfxil w12,w9,#0x0,#0x6
00bff408	add x9,x5,#0x3
00bff40c	orr w10,w10,#0xe0
00bff410	strb w10,[x5]
00bff414	strb w11,[x5, #0x1]
00bff418	strb w12,[x5, #0x2]
00bff41c	b 0x00bff36c
00bff420	cmp x11,#0x4
00bff424	b.lt 0x00bff470
00bff428	lsr w10,w9,#0x12
00bff42c	mov w11,#0x80
00bff430	mov w12,#0x80
00bff434	mov w13,#0x80
00bff438	bfxil w11,w9,#0xc,#0x6
00bff43c	bfxil w12,w9,#0x6,#0x6
00bff440	bfxil w13,w9,#0x0,#0x6
00bff444	orr w10,w10,#0xf0
00bff448	add x9,x5,#0x4
00bff44c	strb w10,[x5]
00bff450	strb w11,[x5, #0x1]
00bff454	strb w12,[x5, #0x2]
00bff458	strb w13,[x5, #0x3]
00bff45c	b 0x00bff36c
00bff460	mov w0,wzr
00bff464	b 0x00bff474
00bff468	mov w0,#0x2
00bff46c	b 0x00bff474
00bff470	mov w0,#0x1
00bff474	str x2,[x4]
00bff478	str x5,[x7]
00bff47c	ret
