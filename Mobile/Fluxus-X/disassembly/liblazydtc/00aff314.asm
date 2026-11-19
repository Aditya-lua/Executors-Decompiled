; NAME_CONSTRAINTS_check_CN @ 00aff314
00aff314	sub sp,sp,#0xa0
00aff318	stp x28,x27,[sp, #0x40]
00aff31c	stp x26,x25,[sp, #0x50]
00aff320	stp x24,x23,[sp, #0x60]
00aff324	stp x22,x21,[sp, #0x70]
00aff328	stp x20,x19,[sp, #0x80]
00aff32c	stp x29,x30,[sp, #0x90]
00aff330	add x29,sp,#0x90
00aff334	str x1,[sp, #0x8]
00aff338	bl 0x00c32d20
00aff33c	mov w8,#0x16
00aff340	mov w9,#0x2
00aff344	add x10,sp,#0x20
00aff348	mov w1,#0xd
00aff34c	mov w2,#0xffffffff
00aff350	mov x20,x0
00aff354	str xzr,[sp, #0x30]
00aff358	str w8,[sp, #0x24]
00aff35c	str w9,[sp, #0x10]
00aff360	str x10,[sp, #0x18]
00aff364	bl 0x00c32bc0
00aff368	cmn w0,#0x1
00aff36c	b.eq 0x00aff500
00aff370	adrp x23,0x2bc000
00aff374	mov w22,w0
00aff378	orr x26,xzr,#0x100000000
00aff37c	add x23,x23,#0x5f4
00aff380	mov x0,x20
00aff384	mov w1,w22
00aff388	bl 0x00c32bb0
00aff38c	bl 0x00c32ba0
00aff390	mov x1,x0
00aff394	add x0,sp,#0x38
00aff398	bl 0x00c32160
00aff39c	tbnz w0,#0x1f,0x00aff508
00aff3a0	ldr x24,[sp, #0x38]
00aff3a4	sxtw x8,w0
00aff3a8	neg x9,x8, LSL #0x20
00aff3ac	sub x8,x8,#0x1
00aff3b0	add x10,x8,#0x1
00aff3b4	cmp x10,#0x1
00aff3b8	mov w27,w0
00aff3bc	mov x28,x9
00aff3c0	b.lt 0x00aff3d8
00aff3c4	ldrb w10,[x24, x8]
00aff3c8	sub w0,w27,#0x1
00aff3cc	add x9,x28,x26
00aff3d0	sub x8,x8,#0x1
00aff3d4	cbz w10,0x00aff3b0
00aff3d8	neg x19,x28
00aff3dc	asr x25,x19,#0x20
00aff3e0	mov x0,x24
00aff3e4	mov w1,wzr
00aff3e8	mov x2,x25
00aff3ec	bl 0x00c300a0
00aff3f0	cbnz x0,0x00aff510
00aff3f4	cmp w27,#0x1
00aff3f8	b.lt 0x00aff4d4
00aff3fc	orr x9,xzr,#-0x100000000
00aff400	sub x9,x9,x28
00aff404	mov x8,xzr
00aff408	mov w10,wzr
00aff40c	asr x9,x9,#0x20
00aff410	ldrb w11,[x24, x8]
00aff414	and w12,w11,#0xffffffdf
00aff418	sub w12,w12,#0x41
00aff41c	and w12,w12,#0xff
00aff420	cmp w12,#0x1a
00aff424	b.cc 0x00aff484
00aff428	cmp w11,#0x5f
00aff42c	b.eq 0x00aff484
00aff430	sub w12,w11,#0x30
00aff434	and w12,w12,#0xff
00aff438	cmp w12,#0xa
00aff43c	b.cc 0x00aff484
00aff440	cbz x8,0x00aff4d4
00aff444	cmp x8,x9
00aff448	b.ge 0x00aff4d4
00aff44c	cmp w11,#0x2d
00aff450	b.eq 0x00aff484
00aff454	cmp w11,#0x2e
00aff458	b.ne 0x00aff4d4
00aff45c	add x10,x24,x8
00aff460	ldrb w11,[x10, #0x1]
00aff464	cmp w11,#0x2e
00aff468	b.eq 0x00aff4d4
00aff46c	cmp w11,#0x2d
00aff470	b.eq 0x00aff4d4
00aff474	ldurb w10,[x10, #-0x1]
00aff478	cmp w10,#0x2d
00aff47c	b.eq 0x00aff4d4
00aff480	mov w10,#0x1
00aff484	add x8,x8,#0x1
00aff488	cmp x8,x25
00aff48c	b.lt 0x00aff410
00aff490	cbz w10,0x00aff4d4
00aff494	cbz x28,0x00aff4e4
00aff498	ldr x1,[sp, #0x8]
00aff49c	lsr x8,x19,#0x20
00aff4a0	add x0,sp,#0x10
00aff4a4	str w8,[sp, #0x20]
00aff4a8	str x24,[sp, #0x28]
00aff4ac	bl 0x00aff100
00aff4b0	mov w25,w0
00aff4b4	mov w2,#0x1bc
00aff4b8	mov x0,x24
00aff4bc	mov x1,x23
00aff4c0	bl 0x00c32310
00aff4c4	cmp w25,#0x0
00aff4c8	csel w21,w21,w25,eq
00aff4cc	cbz w25,0x00aff4e4
00aff4d0	b 0x00aff528
00aff4d4	mov w2,#0x192
00aff4d8	mov x0,x24
00aff4dc	mov x1,x23
00aff4e0	bl 0x00c32310
00aff4e4	mov w1,#0xd
00aff4e8	mov x0,x20
00aff4ec	mov w2,w22
00aff4f0	bl 0x00c32bc0
00aff4f4	mov w22,w0
00aff4f8	cmn w0,#0x1
00aff4fc	b.ne 0x00aff380
00aff500	mov w21,wzr
00aff504	b 0x00aff528
00aff508	mov w21,#0x11
00aff50c	b 0x00aff528
00aff510	adrp x1,0x2bc000
00aff514	add x1,x1,#0x5f4
00aff518	mov w2,#0x162
00aff51c	mov x0,x24
00aff520	bl 0x00c32310
00aff524	mov w21,#0x35
00aff528	mov w0,w21
00aff52c	ldp x29,x30,[sp, #0x90]
00aff530	ldp x20,x19,[sp, #0x80]
00aff534	ldp x22,x21,[sp, #0x70]
00aff538	ldp x24,x23,[sp, #0x60]
00aff53c	ldp x26,x25,[sp, #0x50]
00aff540	ldp x28,x27,[sp, #0x40]
00aff544	add sp,sp,#0xa0
00aff548	ret
