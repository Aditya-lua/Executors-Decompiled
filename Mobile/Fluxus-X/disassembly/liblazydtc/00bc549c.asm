; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::rfind @ 00bc549c
00bc549c	bti c
00bc54a0	ldrb w8,[x0]
00bc54a4	ldp x9,x11,[x0, #0x8]
00bc54a8	lsr x10,x8,#0x1
00bc54ac	tst w8,#0x1
00bc54b0	add x8,x0,#0x4
00bc54b4	csel x8,x8,x11,eq
00bc54b8	csel x9,x10,x9,eq
00bc54bc	cmp x9,x2
00bc54c0	csel x10,x9,x2,cc
00bc54c4	sub x11,x9,x10
00bc54c8	add x10,x10,x3
00bc54cc	cmp x3,x11
00bc54d0	csel x10,x10,x9,cc
00bc54d4	add x9,x8,x10, LSL #0x2
00bc54d8	cbz x3,0x00bc5558
00bc54dc	cbz x10,0x00bc5558
00bc54e0	lsl x10,x3,#0x2
00bc54e4	ldr w11,[x1], #0x4
00bc54e8	mov x13,x8
00bc54ec	sub x12,x10,#0x4
00bc54f0	mov x10,x9
00bc54f4	add x14,x13,#0x4
00bc54f8	ldr w15,[x13]
00bc54fc	cmp w15,w11
00bc5500	b.eq 0x00bc5518
00bc5504	add x13,x13,#0x4
00bc5508	add x14,x14,#0x4
00bc550c	cmp x13,x9
00bc5510	b.ne 0x00bc54f8
00bc5514	b 0x00bc555c
00bc5518	mov x15,x12
00bc551c	mov x16,x1
00bc5520	cbz x15,0x00bc5544
00bc5524	cmp x14,x9
00bc5528	b.eq 0x00bc555c
00bc552c	ldr w17,[x14], #0x4
00bc5530	sub x15,x15,#0x4
00bc5534	ldr w0,[x16], #0x4
00bc5538	cmp w17,w0
00bc553c	b.eq 0x00bc5520
00bc5540	b 0x00bc5548
00bc5544	mov x10,x13
00bc5548	add x13,x13,#0x4
00bc554c	cmp x13,x9
00bc5550	b.ne 0x00bc54f4
00bc5554	b 0x00bc555c
00bc5558	mov x10,x9
00bc555c	sub x8,x10,x8
00bc5560	cmp x10,x9
00bc5564	asr x8,x8,#0x2
00bc5568	ccmp x3,#0x0,#0x4,eq
00bc556c	csinv x0,x8,xzr,eq
00bc5570	ret
