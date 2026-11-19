; std::__ndk1::__codecvt_utf16<wchar_t,true>::do_length @ 00c008c0
00c008c0	bti c
00c008c4	sub x8,x3,x2
00c008c8	cmp x8,#0x2
00c008cc	mov x8,x2
00c008d0	b.lt 0x00c00900
00c008d4	ldr w9,[x0, #0x20]
00c008d8	mov x8,x2
00c008dc	tbz w9,#0x2,0x00c00900
00c008e0	ldrb w8,[x2]
00c008e4	cmp w8,#0xff
00c008e8	mov x8,x2
00c008ec	b.ne 0x00c00900
00c008f0	ldrb w8,[x2, #0x1]
00c008f4	cmp w8,#0xfe
00c008f8	cset w8,eq
00c008fc	add x8,x2,w8, UXTW  #0x1
00c00900	cbz x4,0x00c009ac
00c00904	sub x9,x3,#0x1
00c00908	cmp x8,x9
00c0090c	b.cs 0x00c009ac
00c00910	ldr x10,[x0, #0x18]
00c00914	mov w11,#0x1
00c00918	mov w12,#0xd800
00c0091c	mov w13,#0xdc00
00c00920	ldrb w16,[x8, #0x1]
00c00924	ldrb w14,[x8]
00c00928	lsl w15,w16,#0x8
00c0092c	bfm w14,w16,#0x18,#0x7
00c00930	and w15,w15,#0xfc00
00c00934	cmp w15,w12
00c00938	b.eq 0x00c00960
00c0093c	cmp w15,w13
00c00940	b.eq 0x00c009ac
00c00944	cmp x10,w14, UXTW 
00c00948	cset w14,cs
00c0094c	add x8,x8,w14, UXTW  #0x1
00c00950	b.cc 0x00c009ac
00c00954	cmp x8,x9
00c00958	b.cc 0x00c009a0
00c0095c	b 0x00c009ac
00c00960	sub x15,x3,x8
00c00964	cmp x15,#0x4
00c00968	b.lt 0x00c009ac
00c0096c	ldrb w15,[x8, #0x3]
00c00970	and w16,w15,#0xfc
00c00974	cmp w16,#0xdc
00c00978	b.ne 0x00c009ac
00c0097c	ldrb w16,[x8, #0x2]
00c00980	bfm w16,w15,#0x18,#0x1
00c00984	bfm w16,w14,#0x16,#0x9
00c00988	add w14,w16,#0x10, LSL #12
00c0098c	cmp x10,x14
00c00990	b.cc 0x00c009ac
00c00994	add x8,x8,#0x4
00c00998	cmp x8,x9
00c0099c	b.cs 0x00c009ac
00c009a0	cmp x11,x4
00c009a4	add x11,x11,#0x1
00c009a8	b.cc 0x00c00920
00c009ac	sub w0,w8,w2
00c009b0	ret
