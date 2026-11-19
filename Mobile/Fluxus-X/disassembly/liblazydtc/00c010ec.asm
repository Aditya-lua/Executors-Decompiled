; std::__ndk1::__codecvt_utf16<char32_t,true>::do_out @ 00c010ec
00c010ec	bti c
00c010f0	ldrb w9,[x0, #0x18]
00c010f4	ldr x8,[x0, #0x10]
00c010f8	tbz w9,#0x1,0x00c01118
00c010fc	sub x9,x6,x5
00c01100	cmp x9,#0x2
00c01104	b.ge 0x00c01110
00c01108	mov w0,#0x1
00c0110c	b 0x00c011b8
00c01110	mov w9,#0xfeff
00c01114	strh w9,[x5], #0x2
00c01118	cmp x2,x3
00c0111c	b.cs 0x00c011ac
00c01120	mov w9,#0x3fc0
00c01124	mov w10,#0xd8
00c01128	b 0x00c0113c
00c0112c	add x2,x2,#0x4
00c01130	strb w12,[x5], #0x1
00c01134	cmp x2,x3
00c01138	b.cs 0x00c011ac
00c0113c	ldr w11,[x2]
00c01140	lsr w12,w11,#0xb
00c01144	cmp w12,#0x1b
00c01148	ccmp x8,x11,#0x0,ne
00c0114c	b.cc 0x00c011b4
00c01150	lsr w13,w11,#0x10
00c01154	sub x12,x6,x5
00c01158	cbnz w13,0x00c01170
00c0115c	cmp x12,#0x2
00c01160	b.lt 0x00c01108
00c01164	lsr w12,w11,#0x8
00c01168	strb w11,[x5], #0x1
00c0116c	b 0x00c0112c
00c01170	cmp x12,#0x4
00c01174	b.lt 0x00c01108
00c01178	lsr w12,w11,#0xa
00c0117c	strb w11,[x5, #0x2]
00c01180	and w12,w12,#0x7c0
00c01184	add w13,w12,w9
00c01188	mov w12,#0xffffffdc
00c0118c	orr w14,w10,w13, LSR #0x8
00c01190	bfxil w13,w11,#0xa,#0x6
00c01194	bfxil w12,w11,#0x8,#0x2
00c01198	strb w13,[x5]
00c0119c	add x13,x5,#0x3
00c011a0	strb w14,[x5, #0x1]
00c011a4	mov x5,x13
00c011a8	b 0x00c0112c
00c011ac	mov w0,wzr
00c011b0	b 0x00c011b8
00c011b4	mov w0,#0x2
00c011b8	str x2,[x4]
00c011bc	str x5,[x7]
00c011c0	ret
