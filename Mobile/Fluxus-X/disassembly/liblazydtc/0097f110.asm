; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::pbackfail @ 0097f110
0097f110	ldr x9,[x0, #0x78]
0097f114	mov x8,x0
0097f118	mov w0,w1
0097f11c	cbz x9,0x0097f148
0097f120	ldp x10,x9,[x8, #0x10]
0097f124	cmp x10,x9
0097f128	b.cs 0x0097f148
0097f12c	cmn w0,#0x1
0097f130	b.eq 0x0097f150
0097f134	ldrb w10,[x8, #0x98]
0097f138	tbnz w10,#0x4,0x0097f160
0097f13c	ldrb w10,[x9, #-0x1]!
0097f140	cmp w10,w0, UXTB 
0097f144	b.eq 0x0097f164
0097f148	mov w0,#0xffffffff
0097f14c	ret
0097f150	mov w0,wzr
0097f154	sub x9,x9,#0x1
0097f158	str x9,[x8, #0x18]
0097f15c	ret
0097f160	sub x9,x9,#0x1
0097f164	str x9,[x8, #0x18]
0097f168	strb w0,[x9]
0097f16c	ret
