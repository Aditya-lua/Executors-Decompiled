; std::__ndk1::__codecvt_utf16<char32_t,false>::do_length @ 00c00fdc
00c00fdc	bti c
00c00fe0	sub x8,x3,x2
00c00fe4	cmp x8,#0x2
00c00fe8	mov x8,x2
00c00fec	b.lt 0x00c0101c
00c00ff0	ldr w9,[x0, #0x18]
00c00ff4	mov x8,x2
00c00ff8	tbz w9,#0x2,0x00c0101c
00c00ffc	ldrb w8,[x2]
00c01000	cmp w8,#0xfe
00c01004	mov x8,x2
00c01008	b.ne 0x00c0101c
00c0100c	ldrb w8,[x2, #0x1]
00c01010	cmp w8,#0xff
00c01014	cset w8,eq
00c01018	add x8,x2,w8, UXTW  #0x1
00c0101c	cbz x4,0x00c010c8
00c01020	sub x9,x3,#0x1
00c01024	cmp x8,x9
00c01028	b.cs 0x00c010c8
00c0102c	ldr x10,[x0, #0x10]
00c01030	mov w11,#0x1
00c01034	mov w12,#0xd800
00c01038	mov w13,#0xdc00
00c0103c	ldrb w16,[x8]
00c01040	ldrb w14,[x8, #0x1]
00c01044	lsl w15,w16,#0x8
00c01048	bfm w14,w16,#0x18,#0x7
00c0104c	and w15,w15,#0xfc00
00c01050	cmp w15,w12
00c01054	b.eq 0x00c0107c
00c01058	cmp w15,w13
00c0105c	b.eq 0x00c010c8
00c01060	cmp x10,w14, UXTW 
00c01064	cset w14,cs
00c01068	add x8,x8,w14, UXTW  #0x1
00c0106c	b.cc 0x00c010c8
00c01070	cmp x8,x9
00c01074	b.cc 0x00c010bc
00c01078	b 0x00c010c8
00c0107c	sub x15,x3,x8
00c01080	cmp x15,#0x4
00c01084	b.lt 0x00c010c8
00c01088	ldrb w15,[x8, #0x2]
00c0108c	and w16,w15,#0xfc
00c01090	cmp w16,#0xdc
00c01094	b.ne 0x00c010c8
00c01098	ldrb w16,[x8, #0x3]
00c0109c	bfm w16,w15,#0x18,#0x1
00c010a0	bfm w16,w14,#0x16,#0x9
00c010a4	add w14,w16,#0x10, LSL #12
00c010a8	cmp x10,x14
00c010ac	b.cc 0x00c010c8
00c010b0	add x8,x8,#0x4
00c010b4	cmp x8,x9
00c010b8	b.cs 0x00c010c8
00c010bc	cmp x11,x4
00c010c0	add x11,x11,#0x1
00c010c4	b.cc 0x00c0103c
00c010c8	sub w0,w8,w2
00c010cc	ret
