; std::__ndk1::__codecvt_utf16<wchar_t,false>::do_length @ 00c005b4
00c005b4	bti c
00c005b8	sub x8,x3,x2
00c005bc	cmp x8,#0x2
00c005c0	mov x8,x2
00c005c4	b.lt 0x00c005f4
00c005c8	ldr w9,[x0, #0x20]
00c005cc	mov x8,x2
00c005d0	tbz w9,#0x2,0x00c005f4
00c005d4	ldrb w8,[x2]
00c005d8	cmp w8,#0xfe
00c005dc	mov x8,x2
00c005e0	b.ne 0x00c005f4
00c005e4	ldrb w8,[x2, #0x1]
00c005e8	cmp w8,#0xff
00c005ec	cset w8,eq
00c005f0	add x8,x2,w8, UXTW  #0x1
00c005f4	cbz x4,0x00c006a0
00c005f8	sub x9,x3,#0x1
00c005fc	cmp x8,x9
00c00600	b.cs 0x00c006a0
00c00604	ldr x10,[x0, #0x18]
00c00608	mov w11,#0x1
00c0060c	mov w12,#0xd800
00c00610	mov w13,#0xdc00
00c00614	ldrb w16,[x8]
00c00618	ldrb w14,[x8, #0x1]
00c0061c	lsl w15,w16,#0x8
00c00620	bfm w14,w16,#0x18,#0x7
00c00624	and w15,w15,#0xfc00
00c00628	cmp w15,w12
00c0062c	b.eq 0x00c00654
00c00630	cmp w15,w13
00c00634	b.eq 0x00c006a0
00c00638	cmp x10,w14, UXTW 
00c0063c	cset w14,cs
00c00640	add x8,x8,w14, UXTW  #0x1
00c00644	b.cc 0x00c006a0
00c00648	cmp x8,x9
00c0064c	b.cc 0x00c00694
00c00650	b 0x00c006a0
00c00654	sub x15,x3,x8
00c00658	cmp x15,#0x4
00c0065c	b.lt 0x00c006a0
00c00660	ldrb w15,[x8, #0x2]
00c00664	and w16,w15,#0xfc
00c00668	cmp w16,#0xdc
00c0066c	b.ne 0x00c006a0
00c00670	ldrb w16,[x8, #0x3]
00c00674	bfm w16,w15,#0x18,#0x1
00c00678	bfm w16,w14,#0x16,#0x9
00c0067c	add w14,w16,#0x10, LSL #12
00c00680	cmp x10,x14
00c00684	b.cc 0x00c006a0
00c00688	add x8,x8,#0x4
00c0068c	cmp x8,x9
00c00690	b.cs 0x00c006a0
00c00694	cmp x11,x4
00c00698	add x11,x11,#0x1
00c0069c	b.cc 0x00c00614
00c006a0	sub w0,w8,w2
00c006a4	ret
