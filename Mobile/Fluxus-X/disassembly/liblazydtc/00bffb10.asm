; std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::do_out @ 00bffb10
00bffb10	bti c
00bffb14	cmp x2,x3
00bffb18	b.cs 0x00bffc18
00bffb1c	mov w8,#0xd800
00bffb20	b 0x00bffb34
00bffb24	mov x5,x9
00bffb28	add x2,x2,#0x4
00bffb2c	cmp x2,x3
00bffb30	b.cs 0x00bffc18
00bffb34	ldr w9,[x2]
00bffb38	lsr w10,w9,#0x10
00bffb3c	and w11,w9,#0xfffff800
00bffb40	cmp w10,#0x10
00bffb44	ccmp w11,w8,#0x4,ls
00bffb48	b.eq 0x00bffc20
00bffb4c	cmp w9,#0x7f
00bffb50	b.hi 0x00bffb68
00bffb54	sub x10,x6,x5
00bffb58	cmp x10,#0x1
00bffb5c	b.lt 0x00bffc28
00bffb60	strb w9,[x5], #0x1
00bffb64	b 0x00bffb28
00bffb68	cmp w9,#0x7ff
00bffb6c	b.hi 0x00bffb9c
00bffb70	sub x10,x6,x5
00bffb74	cmp x10,#0x2
00bffb78	b.lt 0x00bffc28
00bffb7c	lsr w10,w9,#0x6
00bffb80	mov w11,#0x80
00bffb84	bfxil w11,w9,#0x0,#0x6
00bffb88	add x9,x5,#0x2
00bffb8c	orr w10,w10,#0xc0
00bffb90	strb w10,[x5]
00bffb94	strb w11,[x5, #0x1]
00bffb98	b 0x00bffb24
00bffb9c	sub x11,x6,x5
00bffba0	cbnz w10,0x00bffbd8
00bffba4	cmp x11,#0x3
00bffba8	b.lt 0x00bffc28
00bffbac	lsr w10,w9,#0xc
00bffbb0	mov w11,#0x80
00bffbb4	mov w12,#0x80
00bffbb8	bfxil w11,w9,#0x6,#0x6
00bffbbc	bfxil w12,w9,#0x0,#0x6
00bffbc0	add x9,x5,#0x3
00bffbc4	orr w10,w10,#0xe0
00bffbc8	strb w10,[x5]
00bffbcc	strb w11,[x5, #0x1]
00bffbd0	strb w12,[x5, #0x2]
00bffbd4	b 0x00bffb24
00bffbd8	cmp x11,#0x4
00bffbdc	b.lt 0x00bffc28
00bffbe0	lsr w10,w9,#0x12
00bffbe4	mov w11,#0x80
00bffbe8	mov w12,#0x80
00bffbec	mov w13,#0x80
00bffbf0	bfxil w11,w9,#0xc,#0x6
00bffbf4	bfxil w12,w9,#0x6,#0x6
00bffbf8	bfxil w13,w9,#0x0,#0x6
00bffbfc	orr w10,w10,#0xf0
00bffc00	add x9,x5,#0x4
00bffc04	strb w10,[x5]
00bffc08	strb w11,[x5, #0x1]
00bffc0c	strb w12,[x5, #0x2]
00bffc10	strb w13,[x5, #0x3]
00bffc14	b 0x00bffb24
00bffc18	mov w0,wzr
00bffc1c	b 0x00bffc2c
00bffc20	mov w0,#0x2
00bffc24	b 0x00bffc2c
00bffc28	mov w0,#0x1
00bffc2c	str x2,[x4]
00bffc30	str x5,[x7]
00bffc34	ret
