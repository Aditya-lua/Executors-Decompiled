; std::__ndk1::__codecvt_utf16<wchar_t,false>::do_out @ 00c003b8
00c003b8	bti c
00c003bc	ldrb w9,[x0, #0x20]
00c003c0	ldr x8,[x0, #0x18]
00c003c4	tbz w9,#0x1,0x00c003e4
00c003c8	sub x9,x6,x5
00c003cc	cmp x9,#0x2
00c003d0	b.ge 0x00c003dc
00c003d4	mov w0,#0x1
00c003d8	b 0x00c00484
00c003dc	mov w9,#0xfffe
00c003e0	strh w9,[x5], #0x2
00c003e4	cmp x2,x3
00c003e8	b.cs 0x00c00478
00c003ec	mov w9,#0x3fc0
00c003f0	mov w10,#0xd8
00c003f4	b 0x00c00408
00c003f8	add x2,x2,#0x4
00c003fc	strb w11,[x5], #0x1
00c00400	cmp x2,x3
00c00404	b.cs 0x00c00478
00c00408	ldr w11,[x2]
00c0040c	lsr w12,w11,#0xb
00c00410	cmp w12,#0x1b
00c00414	ccmp x8,x11,#0x0,ne
00c00418	b.cc 0x00c00480
00c0041c	lsr w13,w11,#0x10
00c00420	sub x12,x6,x5
00c00424	cbnz w13,0x00c0043c
00c00428	cmp x12,#0x2
00c0042c	b.lt 0x00c003d4
00c00430	lsr w12,w11,#0x8
00c00434	strb w12,[x5], #0x1
00c00438	b 0x00c003f8
00c0043c	cmp x12,#0x4
00c00440	b.lt 0x00c003d4
00c00444	lsr w12,w11,#0xa
00c00448	mov w14,#0xdc
00c0044c	bfxil w14,w11,#0x8,#0x2
00c00450	and w12,w12,#0x7c0
00c00454	add w12,w12,w9
00c00458	strb w14,[x5, #0x2]
00c0045c	orr w13,w10,w12, LSR #0x8
00c00460	bfxil w12,w11,#0xa,#0x6
00c00464	strb w12,[x5, #0x1]
00c00468	add x12,x5,#0x3
00c0046c	strb w13,[x5]
00c00470	mov x5,x12
00c00474	b 0x00c003f8
00c00478	mov w0,wzr
00c0047c	b 0x00c00484
00c00480	mov w0,#0x2
00c00484	str x2,[x4]
00c00488	str x5,[x7]
00c0048c	ret
