; RC2_set_key @ 00acb368
00acb368	cmp w1,#0x80
00acb36c	mov w8,#0x80
00acb370	mov w10,#0x400
00acb374	csel w9,w1,w8,lt
00acb378	cmp w3,#0x1
00acb37c	csel w8,w10,w3,lt
00acb380	cmp w8,#0x400
00acb384	csel w8,w8,w10,lt
00acb388	cmp w1,#0x1
00acb38c	strb wzr,[x0]
00acb390	b.lt 0x00acb414
00acb394	sxtw x10,w9
00acb398	cmp x10,#0x1
00acb39c	csinc x12,x10,xzr,gt
00acb3a0	cmp x12,#0x20
00acb3a4	mov x11,xzr
00acb3a8	b.cc 0x00acb400
00acb3ac	cmp x10,#0x1
00acb3b0	csinc x11,x10,xzr,gt
00acb3b4	add x13,x2,x11
00acb3b8	cmp x13,x0
00acb3bc	b.ls 0x00acb3d0
00acb3c0	add x11,x0,x11
00acb3c4	cmp x11,x2
00acb3c8	mov x11,xzr
00acb3cc	b.hi 0x00acb400
00acb3d0	and x11,x12,#0x7fffffffffffffe0
00acb3d4	add x13,x2,#0x10
00acb3d8	add x14,x0,#0x10
00acb3dc	mov x15,x11
00acb3e0	ldp q0,q1,[x13, #-0x10]
00acb3e4	add x13,x13,#0x20
00acb3e8	subs x15,x15,#0x20
00acb3ec	stp q0,q1,[x14, #-0x10]
00acb3f0	add x14,x14,#0x20
00acb3f4	b.ne 0x00acb3e0
00acb3f8	cmp x12,x11
00acb3fc	b.eq 0x00acb414
00acb400	ldrb w12,[x2, x11]
00acb404	strb w12,[x0, x11]
00acb408	add x11,x11,#0x1
00acb40c	cmp x11,x10
00acb410	b.lt 0x00acb400
00acb414	cmp w1,#0x7f
00acb418	b.gt 0x00acb468
00acb41c	add x11,x0,w9, SXTW 
00acb420	ldurb w11,[x11, #-0x1]
00acb424	add w9,w9,#0x1
00acb428	sxtw x9,w9
00acb42c	adrp x13,0x774000
00acb430	mov x10,xzr
00acb434	add x12,x0,x9
00acb438	add x13,x13,#0x7ac
00acb43c	ldrb w14,[x0, x10]
00acb440	add x15,x12,x10
00acb444	add x10,x10,#0x1
00acb448	add w11,w14,w11
00acb44c	and x11,x11,#0xff
00acb450	ldrb w11,[x13, x11]
00acb454	add x14,x9,x10
00acb458	sub x14,x14,#0x2
00acb45c	cmp x14,#0x7f
00acb460	sturb w11,[x15, #-0x1]
00acb464	b.lt 0x00acb43c
00acb468	add w9,w8,#0x7
00acb46c	mov w10,#0x80
00acb470	asr w12,w9,#0x3
00acb474	sub x10,x10,w12, SXTW 
00acb478	ldrb w9,[x0, x10]
00acb47c	neg w8,w8
00acb480	orr w11,wzr,#0xff
00acb484	and w8,w8,#0x7
00acb488	lsr w8,w11,w8
00acb48c	and w9,w8,w9
00acb490	adrp x8,0x774000
00acb494	add x8,x8,#0x7ac
00acb498	ldrb w9,[x8, w9, UXTW ]
00acb49c	strb w9,[x0, x10]
00acb4a0	cbz w10,0x00acb4d4
00acb4a4	sxtw x11,w10
00acb4a8	add x10,x0,#0x7f
00acb4ac	sub x11,x11,#0x80
00acb4b0	sub w12,w12,#0x80
00acb4b4	ldrb w13,[x10]
00acb4b8	adds w12,w12,#0x1
00acb4bc	eor w9,w13,w9
00acb4c0	and x9,x9,#0xff
00acb4c4	ldrb w9,[x8, x9]
00acb4c8	strb w9,[x10, x11]
00acb4cc	sub x10,x10,#0x1
00acb4d0	b.ne 0x00acb4b4
00acb4d4	mov x9,xzr
00acb4d8	orr w8,wzr,#0xfc
00acb4dc	add x10,x0,x9
00acb4e0	ldrb w11,[x10, #0x7f]
00acb4e4	ldrb w10,[x10, #0x7e]
00acb4e8	add x12,x9,#0x7f
00acb4ec	sub x9,x9,#0x2
00acb4f0	cmp x12,#0x1
00acb4f4	bfm w10,w11,#0x18,#0x7
00acb4f8	str w10,[x0, x8#0x0]
00acb4fc	sub x8,x8,#0x4
00acb500	b.hi 0x00acb4dc
00acb504	ret
