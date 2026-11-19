; std::__ndk1::ctype<char>::do_widen @ 00bfcecc
00bfcecc	bti c
00bfced0	cmp x1,x2
00bfced4	b.eq 0x00bfcf2c
00bfced8	sub x9,x2,x1
00bfcedc	cmp x9,#0x20
00bfcee0	b.cc 0x00bfcf34
00bfcee4	sub x8,x3,x1
00bfcee8	cmp x8,#0x20
00bfceec	b.cc 0x00bfcf34
00bfcef0	and x10,x9,#-0x20
00bfcef4	add x11,x1,#0x10
00bfcef8	add x12,x3,#0x10
00bfcefc	add x8,x3,x10
00bfcf00	add x0,x1,x10
00bfcf04	mov x13,x10
00bfcf08	ldp q0,q1,[x11, #-0x10]
00bfcf0c	subs x13,x13,#0x20
00bfcf10	add x11,x11,#0x20
00bfcf14	stp q0,q1,[x12, #-0x10]
00bfcf18	add x12,x12,#0x20
00bfcf1c	b.ne 0x00bfcf08
00bfcf20	cmp x9,x10
00bfcf24	b.ne 0x00bfcf3c
00bfcf28	ret
00bfcf2c	mov x0,x1
00bfcf30	ret
00bfcf34	mov x8,x3
00bfcf38	mov x0,x1
00bfcf3c	ldrb w9,[x0], #0x1
00bfcf40	cmp x0,x2
00bfcf44	strb w9,[x8], #0x1
00bfcf48	b.ne 0x00bfcf3c
00bfcf4c	b 0x00bfcf28
