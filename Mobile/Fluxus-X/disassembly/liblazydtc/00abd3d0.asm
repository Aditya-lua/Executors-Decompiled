; OPENSSL_uni2utf8 @ 00abd3d0
00abd3d0	str x27,[sp, #-0x60]!
00abd3d4	stp x22,x21,[sp, #0x30]
00abd3d8	stp x20,x19,[sp, #0x40]
00abd3dc	mov w19,w1
00abd3e0	mov x21,xzr
00abd3e4	stp x26,x25,[sp, #0x10]
00abd3e8	stp x24,x23,[sp, #0x20]
00abd3ec	stp x29,x30,[sp, #0x50]
00abd3f0	add x29,sp,#0x50
00abd3f4	tbnz w1,#0x0,0x00abd640
00abd3f8	mov x20,x0
00abd3fc	cmp w19,#0x1
00abd400	b.lt 0x00abd4e0
00abd404	mov x23,#-0x10000
00abd408	mov w22,wzr
00abd40c	mov w21,wzr
00abd410	movk x23,#0xfca0, LSL #16
00abd414	mov w24,#0xffff2400
00abd418	mov w25,#0x4
00abd41c	mov w26,#0x2
00abd420	subs w8,w19,w22
00abd424	b.eq 0x00abd4a0
00abd428	cmp w8,#0x2
00abd42c	b.lt 0x00abd4bc
00abd430	add x9,x20,w22, SXTW 
00abd434	ldrb w10,[x9]
00abd438	ldrb w2,[x9, #0x1]
00abd43c	and x11,x10,#0xf8
00abd440	cmp x11,#0xd8
00abd444	bfm x2,x10,#0x38,#0x7
00abd448	b.ne 0x00abd47c
00abd44c	cmp w8,#0x4
00abd450	b.lt 0x00abd4bc
00abd454	ldrb w10,[x9, #0x2]
00abd458	and w11,w10,#0xfc
00abd45c	cmp w11,#0xdc
00abd460	b.ne 0x00abd4bc
00abd464	ldrb w9,[x9, #0x3]
00abd468	add x11,x23,x2, LSL #0xa
00abd46c	bfm w9,w10,#0x18,#0x7
00abd470	add w9,w9,w24
00abd474	orr x9,x11,x9
00abd478	add x2,x9,#0x10, LSL #12
00abd47c	cmp w8,#0x4
00abd480	csel w1,w8,w25,lt
00abd484	mov x0,xzr
00abd488	bl 0x00c37830
00abd48c	tbnz w0,#0x1f,0x00abd4bc
00abd490	cmp w0,#0x4
00abd494	csel w8,w0,w26,eq
00abd498	add w22,w8,w22
00abd49c	b 0x00abd4a8
00abd4a0	mov w0,wzr
00abd4a4	add w22,w22,#0x2
00abd4a8	cmp w22,w19
00abd4ac	add w21,w0,w21
00abd4b0	b.lt 0x00abd420
00abd4b4	cbnz w19,0x00abd4e8
00abd4b8	b 0x00abd500
00abd4bc	mov x0,x20
00abd4c0	mov w1,w19
00abd4c4	ldp x29,x30,[sp, #0x50]
00abd4c8	ldp x20,x19,[sp, #0x40]
00abd4cc	ldp x22,x21,[sp, #0x30]
00abd4d0	ldp x24,x23,[sp, #0x20]
00abd4d4	ldp x26,x25,[sp, #0x10]
00abd4d8	ldr x27,[sp], #0x60
00abd4dc	b 0x00abd0b0
00abd4e0	mov w21,wzr
00abd4e4	cbz w19,0x00abd500
00abd4e8	sxtw x8,w19
00abd4ec	add x8,x20,x8
00abd4f0	ldurb w9,[x8, #-0x2]
00abd4f4	cbnz w9,0x00abd500
00abd4f8	ldurb w8,[x8, #-0x1]
00abd4fc	cbz w8,0x00abd504
00abd500	add w21,w21,#0x1
00abd504	adrp x1,0x2b4000
00abd508	sxtw x0,w21
00abd50c	add x1,x1,#0x83a
00abd510	mov w2,#0xcf
00abd514	bl 0x00c32320
00abd518	mov x21,x0
00abd51c	cbz x0,0x00abd5e8
00abd520	cmp w19,#0x1
00abd524	b.lt 0x00abd61c
00abd528	mov x24,#-0x10000
00abd52c	mov w23,wzr
00abd530	mov w22,wzr
00abd534	movk x24,#0xfca0, LSL #16
00abd538	mov w25,#0xffff2400
00abd53c	mov w26,#0x4
00abd540	mov w27,#0x2
00abd544	subs w8,w19,w23
00abd548	b.eq 0x00abd5c8
00abd54c	cmp w8,#0x2
00abd550	b.lt 0x00abd5c0
00abd554	add x9,x20,w23, SXTW 
00abd558	ldrb w10,[x9]
00abd55c	ldrb w2,[x9, #0x1]
00abd560	and x11,x10,#0xf8
00abd564	cmp x11,#0xd8
00abd568	bfm x2,x10,#0x38,#0x7
00abd56c	b.ne 0x00abd5a0
00abd570	cmp w8,#0x4
00abd574	b.lt 0x00abd5c0
00abd578	ldrb w10,[x9, #0x2]
00abd57c	and w11,w10,#0xfc
00abd580	cmp w11,#0xdc
00abd584	b.ne 0x00abd5c0
00abd588	ldrb w9,[x9, #0x3]
00abd58c	add x11,x24,x2, LSL #0xa
00abd590	bfm w9,w10,#0x18,#0x7
00abd594	add w9,w9,w25
00abd598	orr x9,x11,x9
00abd59c	add x2,x9,#0x10, LSL #12
00abd5a0	cmp w8,#0x4
00abd5a4	add x0,x21,w22, SXTW 
00abd5a8	csel w1,w8,w26,lt
00abd5ac	bl 0x00c37830
00abd5b0	cmp w0,#0x4
00abd5b4	csel w8,w0,w27,eq
00abd5b8	add w23,w8,w23
00abd5bc	b 0x00abd5d0
00abd5c0	mov w0,#0xffffffff
00abd5c4	b 0x00abd5cc
00abd5c8	mov w0,wzr
00abd5cc	add w23,w23,#0x2
00abd5d0	cmp w23,w19
00abd5d4	add w22,w0,w22
00abd5d8	b.lt 0x00abd544
00abd5dc	sxtw x8,w22
00abd5e0	cbnz w19,0x00abd624
00abd5e4	b 0x00abd63c
00abd5e8	bl 0x00c342a0
00abd5ec	adrp x0,0x2b4000
00abd5f0	adrp x2,0x2d8000
00abd5f4	add x0,x0,#0x83a
00abd5f8	add x2,x2,#0x60a
00abd5fc	mov w1,#0xd0
00abd600	bl 0x00c342b0
00abd604	mov w1,#0x100
00abd608	mov w0,#0x23
00abd60c	movk w1,#0xc, LSL #16
00abd610	mov x2,xzr
00abd614	bl 0x00c342c0
00abd618	b 0x00abd640
00abd61c	mov x8,xzr
00abd620	cbz w19,0x00abd63c
00abd624	sxtw x9,w19
00abd628	add x9,x20,x9
00abd62c	ldurb w10,[x9, #-0x2]
00abd630	cbnz w10,0x00abd63c
00abd634	ldurb w9,[x9, #-0x1]
00abd638	cbz w9,0x00abd640
00abd63c	strb wzr,[x21, x8]
00abd640	mov x0,x21
00abd644	ldp x29,x30,[sp, #0x50]
00abd648	ldp x20,x19,[sp, #0x40]
00abd64c	ldp x22,x21,[sp, #0x30]
00abd650	ldp x24,x23,[sp, #0x20]
00abd654	ldp x26,x25,[sp, #0x10]
00abd658	ldr x27,[sp], #0x60
00abd65c	ret
