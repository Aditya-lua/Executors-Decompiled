; std::__ndk1::__codecvt_utf16<char16_t,true>::do_out @ 00c00bd8
00c00bd8	bti c
00c00bdc	ldrb w9,[x0, #0x18]
00c00be0	ldr x8,[x0, #0x10]
00c00be4	tbz w9,#0x1,0x00c00c04
00c00be8	sub x9,x6,x5
00c00bec	cmp x9,#0x2
00c00bf0	b.ge 0x00c00bfc
00c00bf4	mov w0,#0x1
00c00bf8	b 0x00c00c68
00c00bfc	mov w9,#0xfeff
00c00c00	strh w9,[x5], #0x2
00c00c04	cmp x2,x3
00c00c08	b.cs 0x00c00c5c
00c00c0c	sub x9,x6,x5
00c00c10	mov w10,#0xd800
00c00c14	ldrh w11,[x2]
00c00c18	and w12,w11,#0xf800
00c00c1c	cmp w12,w10
00c00c20	ccmp x8,x11,#0x0,ne
00c00c24	b.cc 0x00c00c64
00c00c28	subs x9,x9,#0x2
00c00c2c	b.lt 0x00c00bf4
00c00c30	lsr w12,w11,#0x8
00c00c34	add x2,x2,#0x2
00c00c38	strb w11,[x5]
00c00c3c	add x11,x5,#0x2
00c00c40	cmp x2,x3
00c00c44	strb w12,[x5, #0x1]
00c00c48	mov x5,x11
00c00c4c	b.cc 0x00c00c14
00c00c50	mov w0,wzr
00c00c54	mov x5,x11
00c00c58	b 0x00c00c68
00c00c5c	mov w0,wzr
00c00c60	b 0x00c00c68
00c00c64	mov w0,#0x2
00c00c68	str x2,[x4]
00c00c6c	str x5,[x7]
00c00c70	ret
