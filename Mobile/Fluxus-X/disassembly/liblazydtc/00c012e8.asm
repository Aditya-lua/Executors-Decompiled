; std::__ndk1::__codecvt_utf16<char32_t,true>::do_length @ 00c012e8
00c012e8	bti c
00c012ec	sub x8,x3,x2
00c012f0	cmp x8,#0x2
00c012f4	mov x8,x2
00c012f8	b.lt 0x00c01328
00c012fc	ldr w9,[x0, #0x18]
00c01300	mov x8,x2
00c01304	tbz w9,#0x2,0x00c01328
00c01308	ldrb w8,[x2]
00c0130c	cmp w8,#0xff
00c01310	mov x8,x2
00c01314	b.ne 0x00c01328
00c01318	ldrb w8,[x2, #0x1]
00c0131c	cmp w8,#0xfe
00c01320	cset w8,eq
00c01324	add x8,x2,w8, UXTW  #0x1
00c01328	cbz x4,0x00c013d4
00c0132c	sub x9,x3,#0x1
00c01330	cmp x8,x9
00c01334	b.cs 0x00c013d4
00c01338	ldr x10,[x0, #0x10]
00c0133c	mov w11,#0x1
00c01340	mov w12,#0xd800
00c01344	mov w13,#0xdc00
00c01348	ldrb w16,[x8, #0x1]
00c0134c	ldrb w14,[x8]
00c01350	lsl w15,w16,#0x8
00c01354	bfm w14,w16,#0x18,#0x7
00c01358	and w15,w15,#0xfc00
00c0135c	cmp w15,w12
00c01360	b.eq 0x00c01388
00c01364	cmp w15,w13
00c01368	b.eq 0x00c013d4
00c0136c	cmp x10,w14, UXTW 
00c01370	cset w14,cs
00c01374	add x8,x8,w14, UXTW  #0x1
00c01378	b.cc 0x00c013d4
00c0137c	cmp x8,x9
00c01380	b.cc 0x00c013c8
00c01384	b 0x00c013d4
00c01388	sub x15,x3,x8
00c0138c	cmp x15,#0x4
00c01390	b.lt 0x00c013d4
00c01394	ldrb w15,[x8, #0x3]
00c01398	and w16,w15,#0xfc
00c0139c	cmp w16,#0xdc
00c013a0	b.ne 0x00c013d4
00c013a4	ldrb w16,[x8, #0x2]
00c013a8	bfm w16,w15,#0x18,#0x1
00c013ac	bfm w16,w14,#0x16,#0x9
00c013b0	add w14,w16,#0x10, LSL #12
00c013b4	cmp x10,x14
00c013b8	b.cc 0x00c013d4
00c013bc	add x8,x8,#0x4
00c013c0	cmp x8,x9
00c013c4	b.cs 0x00c013d4
00c013c8	cmp x11,x4
00c013cc	add x11,x11,#0x1
00c013d0	b.cc 0x00c01348
00c013d4	sub w0,w8,w2
00c013d8	ret
