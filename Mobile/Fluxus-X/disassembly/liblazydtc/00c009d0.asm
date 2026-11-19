; std::__ndk1::__codecvt_utf16<char16_t,false>::do_out @ 00c009d0
00c009d0	bti c
00c009d4	ldrb w9,[x0, #0x18]
00c009d8	ldr x8,[x0, #0x10]
00c009dc	tbz w9,#0x1,0x00c009fc
00c009e0	sub x9,x6,x5
00c009e4	cmp x9,#0x2
00c009e8	b.ge 0x00c009f4
00c009ec	mov w0,#0x1
00c009f0	b 0x00c00a60
00c009f4	mov w9,#0xfffe
00c009f8	strh w9,[x5], #0x2
00c009fc	cmp x2,x3
00c00a00	b.cs 0x00c00a54
00c00a04	sub x9,x6,x5
00c00a08	mov w10,#0xd800
00c00a0c	ldrh w11,[x2]
00c00a10	and w12,w11,#0xf800
00c00a14	cmp w12,w10
00c00a18	ccmp x8,x11,#0x0,ne
00c00a1c	b.cc 0x00c00a5c
00c00a20	subs x9,x9,#0x2
00c00a24	b.lt 0x00c009ec
00c00a28	lsr w13,w11,#0x8
00c00a2c	add x2,x2,#0x2
00c00a30	add x12,x5,#0x2
00c00a34	cmp x2,x3
00c00a38	strb w11,[x5, #0x1]
00c00a3c	strb w13,[x5]
00c00a40	mov x5,x12
00c00a44	b.cc 0x00c00a0c
00c00a48	mov w0,wzr
00c00a4c	mov x5,x12
00c00a50	b 0x00c00a60
00c00a54	mov w0,wzr
00c00a58	b 0x00c00a60
00c00a5c	mov w0,#0x2
00c00a60	str x2,[x4]
00c00a64	str x5,[x7]
00c00a68	ret
