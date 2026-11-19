; std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__do_get @ 00bed524
00bed524	paciasp
00bed528	stp x29,x30,[sp, #-0x60]!
00bed52c	stp x28,x27,[sp, #0x10]
00bed530	stp x26,x25,[sp, #0x20]
00bed534	stp x24,x23,[sp, #0x30]
00bed538	stp x22,x21,[sp, #0x40]
00bed53c	stp x20,x19,[sp, #0x50]
00bed540	mov x29,sp
00bed544	sub sp,sp,#0x2b0
00bed548	mov x21,x0
00bed54c	ldr x0,[x0]
00bed550	mov x23,x5
00bed554	mov x19,x3
00bed558	mov w26,w2
00bed55c	mov x22,x1
00bed560	str x7,[sp, #0x78]
00bed564	str x6,[sp, #0x40]
00bed568	str w4,[sp, #0x4c]
00bed56c	cbz x0,0x00bed5bc
00bed570	ldp x8,x9,[x0, #0x18]
00bed574	cmp x8,x9
00bed578	b.eq 0x00bed590
00bed57c	mov w20,wzr
00bed580	cbnz x22,0x00bed5c4
00bed584	tbnz w20,#0x0,0x00bee550
00bed588	mov x22,xzr
00bed58c	b 0x00bed5d4
00bed590	ldr x8,[x0]
00bed594	ldr x8,[x8, #0x48]
00bed598	blr x8
00bed59c	cmn w0,#0x1
00bed5a0	b.eq 0x00bed5b8
00bed5a4	ldr x8,[x21]
00bed5a8	cmp x8,#0x0
00bed5ac	cset w20,eq
00bed5b0	cbnz x22,0x00bed5c4
00bed5b4	b 0x00bed584
00bed5b8	str xzr,[x21]
00bed5bc	mov w20,#0x1
00bed5c0	cbz x22,0x00bed584
00bed5c4	ldp x8,x9,[x22, #0x18]
00bed5c8	cmp x8,x9
00bed5cc	b.eq 0x00bee52c
00bed5d0	tbz w20,#0x0,0x00bee550
00bed5d4	str x23,[sp, #0x20]
00bed5d8	stp xzr,xzr,[sp, #0xf0]
00bed5dc	str xzr,[sp, #0x100]
00bed5e0	stp xzr,xzr,[sp, #0xd8]
00bed5e4	str xzr,[sp, #0xe8]
00bed5e8	stp xzr,xzr,[sp, #0xc0]
00bed5ec	str xzr,[sp, #0xd0]
00bed5f0	stp xzr,xzr,[sp, #0xa8]
00bed5f4	str xzr,[sp, #0xb8]
00bed5f8	stp xzr,xzr,[sp, #0x90]
00bed5fc	str xzr,[sp, #0xa0]
00bed600	add x8,sp,#0x8c
00bed604	add x20,sp,#0xa8
00bed608	and w0,w26,#0x1
00bed60c	add x2,sp,#0x114
00bed610	add x3,sp,#0x110
00bed614	add x4,sp,#0x10c
00bed618	add x5,sp,#0xf0
00bed61c	add x6,sp,#0xd8
00bed620	add x7,sp,#0xc0
00bed624	mov x1,x19
00bed628	stp x20,x8,[sp]
00bed62c	add x19,sp,#0xd8
00bed630	add x23,sp,#0xc0
00bed634	bl 0x00c44210
00bed638	ldp x9,x10,[x29, #0x60]
00bed63c	orr x11,x23,#0x1
00bed640	add x27,sp,#0x118
00bed644	str x11,[sp, #0x28]
00bed648	orr x11,x20,#0x1
00bed64c	orr x8,x19,#0x1
00bed650	str x11,[sp, #0x18]
00bed654	add x11,x27,#0x190
00bed658	str xzr,[sp, #0x60]
00bed65c	adrp x28,0xcb5000
00bed660	mov x26,xzr
00bed664	str x8,[sp, #0x30]
00bed668	add x8,sp,#0x90
00bed66c	add x23,sp,#0x118
00bed670	str x9,[sp, #0x68]
00bed674	ldr x9,[x9]
00bed678	orr x8,x8,#0x1
00bed67c	str x11,[sp, #0x80]
00bed680	ldr x28,[x28, #0xc18]
00bed684	str x8,[sp, #0x38]
00bed688	str x9,[x10]
00bed68c	str x10,[sp, #0x70]
00bed690	b 0x00bed6b4
00bed694	ldp x9,x8,[sp, #0x68]
00bed698	ldr x8,[x8]
00bed69c	ldr x9,[x9]
00bed6a0	cmp x8,x9
00bed6a4	b.eq 0x00bee660
00bed6a8	add x26,x26,#0x1
00bed6ac	cmp x26,#0x4
00bed6b0	b.eq 0x00bee3d4
00bed6b4	ldr x0,[x21]
00bed6b8	cbz x0,0x00bed704
00bed6bc	ldp x8,x9,[x0, #0x18]
00bed6c0	cmp x8,x9
00bed6c4	b.eq 0x00bed6d8
00bed6c8	mov w19,wzr
00bed6cc	cbnz x22,0x00bed70c
00bed6d0	tbz w19,#0x0,0x00bed744
00bed6d4	b 0x00bee3d4
00bed6d8	ldr x8,[x0]
00bed6dc	ldr x8,[x8, #0x48]
00bed6e0	blr x8
00bed6e4	cmn w0,#0x1
00bed6e8	b.eq 0x00bed700
00bed6ec	ldr x8,[x21]
00bed6f0	cmp x8,#0x0
00bed6f4	cset w19,eq
00bed6f8	cbnz x22,0x00bed70c
00bed6fc	b 0x00bed6d0
00bed700	str xzr,[x21]
00bed704	mov w19,#0x1
00bed708	cbz x22,0x00bed6d0
00bed70c	ldp x8,x9,[x22, #0x18]
00bed710	cmp x8,x9
00bed714	b.eq 0x00bed720
00bed718	tbnz w19,#0x0,0x00bed744
00bed71c	b 0x00bee3d4
00bed720	ldr x8,[x22]
00bed724	ldr x8,[x8, #0x48]
00bed728	mov x0,x22
00bed72c	blr x8
00bed730	cmn w0,#0x1
00bed734	cset w8,eq
00bed738	csel x22,xzr,x22,eq
00bed73c	eor w8,w19,w8
00bed740	tbz w8,#0x0,0x00bee3d4
00bed744	add x8,sp,#0x114
00bed748	ldrb w8,[x8, x26]
00bed74c	cmp w8,#0x1
00bed750	b.le 0x00bed960
00bed754	cmp w8,#0x2
00bed758	b.eq 0x00bed990
00bed75c	cmp w8,#0x3
00bed760	b.eq 0x00bed9c4
00bed764	cmp w8,#0x4
00bed768	b.ne 0x00bed6a8
00bed76c	mov w24,wzr
00bed770	b 0x00bed77c
00bed774	add x8,x8,#0x1
00bed778	str x8,[x0, #0x18]
00bed77c	ldr x0,[x21]
00bed780	cbz x0,0x00bed7cc
00bed784	ldp x8,x9,[x0, #0x18]
00bed788	cmp x8,x9
00bed78c	b.eq 0x00bed7a0
00bed790	mov w19,wzr
00bed794	cbnz x22,0x00bed7d4
00bed798	tbz w19,#0x0,0x00bed80c
00bed79c	b 0x00beda00
00bed7a0	ldr x8,[x0]
00bed7a4	ldr x8,[x8, #0x48]
00bed7a8	blr x8
00bed7ac	cmn w0,#0x1
00bed7b0	b.eq 0x00bed7c8
00bed7b4	ldr x8,[x21]
00bed7b8	cmp x8,#0x0
00bed7bc	cset w19,eq
00bed7c0	cbnz x22,0x00bed7d4
00bed7c4	b 0x00bed798
00bed7c8	str xzr,[x21]
00bed7cc	mov w19,#0x1
00bed7d0	cbz x22,0x00bed798
00bed7d4	ldp x8,x9,[x22, #0x18]
00bed7d8	cmp x8,x9
00bed7dc	b.eq 0x00bed7e8
00bed7e0	tbnz w19,#0x0,0x00bed80c
00bed7e4	b 0x00beda00
00bed7e8	ldr x8,[x22]
00bed7ec	ldr x8,[x8, #0x48]
00bed7f0	mov x0,x22
00bed7f4	blr x8
00bed7f8	cmn w0,#0x1
00bed7fc	cset w8,eq
00bed800	csel x22,xzr,x22,eq
00bed804	cmp w19,w8
00bed808	b.eq 0x00beda00
00bed80c	ldr x0,[x21]
00bed810	ldp x8,x9,[x0, #0x18]
00bed814	cmp x8,x9
00bed818	b.eq 0x00bed828
00bed81c	ldrb w19,[x8]
00bed820	tbz w19,#0x7,0x00bed83c
00bed824	b 0x00bed84c
00bed828	ldr x8,[x0]
00bed82c	ldr x8,[x8, #0x48]
00bed830	blr x8
00bed834	and x19,x0,#0xff
00bed838	tbnz w19,#0x7,0x00bed84c
00bed83c	ldr x8,[sp, #0x78]
00bed840	ldr x8,[x8, #0x10]
00bed844	ldr x8,[x8, x19, LSL #0x3]
00bed848	tbnz w8,#0x6,0x00bed8c4
00bed84c	ldrb w8,[sp, #0xf0]
00bed850	ldr x9,[sp, #0xf8]
00bed854	lsr x10,x8,#0x1
00bed858	tst w8,#0x1
00bed85c	csel x8,x10,x9,eq
00bed860	cbz x8,0x00beda00
00bed864	cbz w24,0x00beda00
00bed868	ldrb w8,[sp, #0x10c]
00bed86c	cmp x19,x8
00bed870	b.ne 0x00beda00
00bed874	ldr x8,[sp, #0x80]
00bed878	cmp x23,x8
00bed87c	b.ne 0x00bed938
00bed880	subs x23,x8,x27
00bed884	mov w9,#0x4
00bed888	lsl x8,x23,#0x1
00bed88c	csel x8,x9,x8,eq
00bed890	mov x9,#0x7fffffffffffffff
00bed894	cmp x23,x9
00bed898	csinv x19,x8,xzr,cc
00bed89c	adrp x8,0xcb5000
00bed8a0	ldr x8,[x8, #0xc18]
00bed8a4	cmp x28,x8
00bed8a8	b.eq 0x00bed900
00bed8ac	mov x0,x27
00bed8b0	mov x1,x19
00bed8b4	bl 0x00c30950
00bed8b8	mov x20,x0
00bed8bc	cbnz x0,0x00bed91c
00bed8c0	b 0x00bee748
00bed8c4	ldr x1,[sp, #0x70]
00bed8c8	ldr x9,[x29, #0x70]
00bed8cc	ldr x8,[x1]
00bed8d0	cmp x8,x9
00bed8d4	b.ne 0x00bed8ec
00bed8d8	ldr x0,[sp, #0x68]
00bed8dc	add x2,x29,#0x70
00bed8e0	bl 0x00bef074
00bed8e4	ldr x1,[sp, #0x70]
00bed8e8	ldr x8,[x1]
00bed8ec	add x9,x8,#0x1
00bed8f0	add w24,w24,#0x1
00bed8f4	str x9,[x1]
00bed8f8	strb w19,[x8]
00bed8fc	b 0x00bed940
00bed900	mov x0,x19
00bed904	bl 0x00c308d0
00bed908	cbz x0,0x00bee748
00bed90c	mov x20,x0
00bed910	cbz x27,0x00bed91c
00bed914	mov x0,x27
00bed918	blr x28
00bed91c	and x8,x19,#-0x4
00bed920	adrp x28,0xcb4000
00bed924	add x23,x20,x23
00bed928	add x8,x20,x8
00bed92c	mov x27,x20
00bed930	str x8,[sp, #0x80]
00bed934	ldr x28,[x28, #0xbf8]
00bed938	str w24,[x23], #0x4
00bed93c	mov w24,wzr
00bed940	ldr x0,[x21]
00bed944	ldp x8,x9,[x0, #0x18]
00bed948	cmp x8,x9
00bed94c	b.ne 0x00bed774
00bed950	ldr x8,[x0]
00bed954	ldr x8,[x8, #0x50]
00bed958	blr x8
00bed95c	b 0x00bed77c
00bed960	cbz w8,0x00bed9f4
00bed964	cmp w8,#0x1
00bed968	b.ne 0x00bed6a8
00bed96c	cmp x26,#0x3
00bed970	b.eq 0x00bee3d4
00bed974	ldr x0,[x21]
00bed978	ldp x8,x9,[x0, #0x18]
00bed97c	cmp x8,x9
00bed980	b.eq 0x00beda80
00bed984	ldrb w8,[x8]
00bed988	tbz w8,#0x7,0x00beda94
00bed98c	b 0x00bee660
00bed990	ldr x8,[sp, #0x60]
00bed994	cbnz x8,0x00beda5c
00bed998	cmp x26,#0x2
00bed99c	b.cc 0x00beda5c
00bed9a0	ldrb w8,[sp, #0x117]
00bed9a4	ldr w9,[sp, #0x4c]
00bed9a8	tst w8,#0xff
00bed9ac	ccmp x26,#0x2,#0x0,ne
00bed9b0	cset w8,ne
00bed9b4	tbnz w9,#0x9,0x00bedb54
00bed9b8	tbz w8,#0x0,0x00bedb54
00bed9bc	str xzr,[sp, #0x60]
00bed9c0	b 0x00bed6a8
00bed9c4	ldrb w8,[sp, #0xc0]
00bed9c8	ldr x10,[sp, #0xc8]
00bed9cc	lsr x11,x8,#0x1
00bed9d0	ands w9,w8,#0x1
00bed9d4	csel x10,x11,x10,eq
00bed9d8	cbz x10,0x00bedc18
00bed9dc	ldr x0,[x21]
00bed9e0	ldp x10,x11,[x0, #0x18]
00bed9e4	cmp x10,x11
00bed9e8	b.eq 0x00bedbc8
00bed9ec	ldrb w10,[x10]
00bed9f0	b 0x00bedbe0
00bed9f4	cmp x26,#0x3
00bed9f8	b.ne 0x00bee234
00bed9fc	b 0x00bee3d4
00beda00	cmp x27,x23
00beda04	b.eq 0x00bedf64
00beda08	cbz w24,0x00bedf64
00beda0c	ldr x8,[sp, #0x80]
00beda10	cmp x23,x8
00beda14	b.ne 0x00bedf60
00beda18	subs x23,x8,x27
00beda1c	mov w9,#0x4
00beda20	lsl x8,x23,#0x1
00beda24	csel x8,x9,x8,eq
00beda28	mov x9,#0x7fffffffffffffff
00beda2c	cmp x23,x9
00beda30	csinv x19,x8,xzr,cc
00beda34	adrp x8,0xcb5000
00beda38	ldr x8,[x8, #0xc18]
00beda3c	cmp x28,x8
00beda40	b.eq 0x00bedf28
00beda44	mov x0,x27
00beda48	mov x1,x19
00beda4c	bl 0x00c30950
00beda50	mov x20,x0
00beda54	cbnz x0,0x00bedf44
00beda58	b 0x00bee754
00beda5c	ldrb w19,[sp, #0xd8]
00beda60	ldp x24,x20,[sp, #0xe0]
00beda64	stp x28,x27,[sp, #0x50]
00beda68	ldr x27,[sp, #0x30]
00beda6c	tst w19,#0x1
00beda70	cset w8,eq
00beda74	csel x28,x27,x20,eq
00beda78	cbnz x26,0x00bedb70
00beda7c	b 0x00bedd78
00beda80	ldr x8,[x0]
00beda84	ldr x8,[x8, #0x48]
00beda88	blr x8
00beda8c	and x8,x0,#0xff
00beda90	tbnz w8,#0x7,0x00bee660
00beda94	ldr x9,[sp, #0x78]
00beda98	ldr x9,[x9, #0x10]
00beda9c	ldr x8,[x9, x8, LSL #0x3]
00bedaa0	tbz w8,#0x0,0x00bee660
00bedaa4	ldr x0,[x21]
00bedaa8	stp x28,x27,[sp, #0x50]
00bedaac	ldp x8,x9,[x0, #0x18]
00bedab0	cmp x8,x9
00bedab4	b.eq 0x00bedae4
00bedab8	add x9,x8,#0x1
00bedabc	str x9,[x0, #0x18]
00bedac0	ldrb w28,[x8]
00bedac4	ldrb w8,[sp, #0x90]
00bedac8	tbnz w8,#0x0,0x00bedafc
00bedacc	cmp w8,#0x2c
00bedad0	b.ne 0x00bee334
00bedad4	ldr x25,[sp, #0x38]
00bedad8	mov w24,#0x16
00bedadc	mov w27,#0x30
00bedae0	b 0x00bedb4c
00bedae4	ldr x8,[x0]
00bedae8	ldr x8,[x8, #0x50]
00bedaec	blr x8
00bedaf0	mov w28,w0
00bedaf4	ldrb w8,[sp, #0x90]
00bedaf8	tbz w8,#0x0,0x00bedacc
00bedafc	ldp x9,x8,[sp, #0x90]
00bedb00	and x20,x9,#-0x2
00bedb04	sub x24,x20,#0x1
00bedb08	cmp x8,x24
00bedb0c	b.ne 0x00bee1e0
00bedb10	cmn x20,#0x8
00bedb14	b.eq 0x00bee750
00bedb18	mov x8,#-0xd
00bedb1c	ldr x25,[sp, #0xa0]
00bedb20	movk x8,#0x7fff, LSL #48
00bedb24	cmp x24,x8
00bedb28	b.cs 0x00bedd1c
00bedb2c	lsl x8,x24,#0x1
00bedb30	mov w9,#0x1a
00bedb34	orr x8,x8,#0x7
00bedb38	cmp x8,#0x17
00bedb3c	csinc x8,x9,x8,eq
00bedb40	cmp x24,#0xc
00bedb44	mov w9,#0x17
00bedb48	csel x27,x9,x8,cc
00bedb4c	add x20,x24,#0x1
00bedb50	b 0x00bedd20
00bedb54	ldrb w19,[sp, #0xd8]
00bedb58	ldp x24,x20,[sp, #0xe0]
00bedb5c	stp x28,x27,[sp, #0x50]
00bedb60	ldr x27,[sp, #0x30]
00bedb64	tst w19,#0x1
00bedb68	cset w8,eq
00bedb6c	csel x28,x27,x20,eq
00bedb70	add x9,sp,#0x114
00bedb74	add x9,x26,x9
00bedb78	ldurb w9,[x9, #-0x1]
00bedb7c	cmp w9,#0x1
00bedb80	b.hi 0x00bedd78
00bedb84	lsr w9,w19,#0x1
00bedb88	cmp w8,#0x0
00bedb8c	csel x8,x9,x24,ne
00bedb90	cbz x8,0x00bedd2c
00bedb94	ldr x9,[sp, #0x78]
00bedb98	mov x25,x28
00bedb9c	ldr x10,[x9, #0x10]
00bedba0	add x9,x28,x8
00bedba4	ldrsb x11,[x25]
00bedba8	tbnz x11,#0x3f,0x00bedd30
00bedbac	ldr x11,[x10, x11, LSL #0x3]
00bedbb0	tbz w11,#0x0,0x00bedd30
00bedbb4	subs x8,x8,#0x1
00bedbb8	add x25,x25,#0x1
00bedbbc	b.ne 0x00bedba4
00bedbc0	mov x25,x9
00bedbc4	b 0x00bedd30
00bedbc8	ldr x8,[x0]
00bedbcc	ldr x8,[x8, #0x48]
00bedbd0	blr x8
00bedbd4	ldrb w8,[sp, #0xc0]
00bedbd8	and w10,w0,#0xff
00bedbdc	and w9,w8,#0x1
00bedbe0	ldr x11,[sp, #0xd0]
00bedbe4	ldr x12,[sp, #0x28]
00bedbe8	cmp w9,#0x0
00bedbec	csel x11,x12,x11,eq
00bedbf0	ldrb w11,[x11]
00bedbf4	cmp w10,w11
00bedbf8	b.ne 0x00bedc18
00bedbfc	ldr x0,[x21]
00bedc00	ldp x10,x11,[x0, #0x18]
00bedc04	cmp x10,x11
00bedc08	b.eq 0x00bedce0
00bedc0c	add x10,x10,#0x1
00bedc10	str x10,[x0, #0x18]
00bedc14	b 0x00bedcf4
00bedc18	ldrb w9,[sp, #0xa8]
00bedc1c	ldr x11,[sp, #0xb0]
00bedc20	lsr x12,x9,#0x1
00bedc24	ands w10,w9,#0x1
00bedc28	csel x11,x12,x11,eq
00bedc2c	cbz x11,0x00bedc9c
00bedc30	ldr x0,[x21]
00bedc34	ldp x8,x11,[x0, #0x18]
00bedc38	cmp x8,x11
00bedc3c	b.eq 0x00bedc48
00bedc40	ldrb w8,[x8]
00bedc44	b 0x00bedc60
00bedc48	ldr x8,[x0]
00bedc4c	ldr x8,[x8, #0x48]
00bedc50	blr x8
00bedc54	ldrb w9,[sp, #0xa8]
00bedc58	and w8,w0,#0xff
00bedc5c	and w10,w9,#0x1
00bedc60	ldr x11,[sp, #0xb8]
00bedc64	ldr x12,[sp, #0x18]
00bedc68	cmp w10,#0x0
00bedc6c	csel x11,x12,x11,eq
00bedc70	ldrb w11,[x11]
00bedc74	cmp w8,w11
00bedc78	b.ne 0x00bedc98
00bedc7c	ldr x0,[x21]
00bedc80	ldp x8,x11,[x0, #0x18]
00bedc84	cmp x8,x11
00bedc88	b.eq 0x00bedee0
00bedc8c	add x8,x8,#0x1
00bedc90	str x8,[x0, #0x18]
00bedc94	b 0x00bedef4
00bedc98	ldrb w8,[sp, #0xc0]
00bedc9c	ldr x10,[sp, #0xc8]
00bedca0	lsr w11,w8,#0x1
00bedca4	tst w8,#0x1
00bedca8	ldr x12,[sp, #0xb0]
00bedcac	lsr w13,w9,#0x1
00bedcb0	csel x8,x11,x10,eq
00bedcb4	tst w9,#0x1
00bedcb8	csel x9,x13,x12,eq
00bedcbc	cbz x8,0x00bedcc8
00bedcc0	cbz x9,0x00bedccc
00bedcc4	b 0x00bee660
00bedcc8	cbz x9,0x00bed6a8
00bedccc	cmp x8,#0x0
00bedcd0	ldr x9,[sp, #0x40]
00bedcd4	cset w8,ne
00bedcd8	strb w8,[x9]
00bedcdc	b 0x00bed6a8
00bedce0	ldr x8,[x0]
00bedce4	ldr x8,[x8, #0x50]
00bedce8	blr x8
00bedcec	ldrb w8,[sp, #0xc0]
00bedcf0	and w9,w8,#0x1
00bedcf4	ldr x10,[sp, #0xc8]
00bedcf8	lsr w8,w8,#0x1
00bedcfc	cmp w9,#0x0
00bedd00	add x9,sp,#0xc0
00bedd04	csel x8,x8,x10,eq
00bedd08	cmp x8,#0x1
00bedd0c	ldr x8,[sp, #0x40]
00bedd10	strb wzr,[x8]
00bedd14	ldr x8,[sp, #0x60]
00bedd18	b 0x00bedf1c
00bedd1c	mov x27,#-0x9
00bedd20	mov x0,x27
00bedd24	bl 0x00c2fed0
00bedd28	b 0x00bee1ec
00bedd2c	mov x25,x28
00bedd30	ldrb w8,[sp, #0x90]
00bedd34	ldr x9,[sp, #0x98]
00bedd38	sub x2,x25,x28
00bedd3c	lsr x10,x8,#0x1
00bedd40	tst w8,#0x1
00bedd44	csel x9,x10,x9,eq
00bedd48	cmp x2,x9
00bedd4c	b.hi 0x00bedd78
00bedd50	ldr x10,[sp, #0xa0]
00bedd54	tst w8,#0x1
00bedd58	ldr x8,[sp, #0x38]
00bedd5c	mov x1,x28
00bedd60	csel x8,x8,x10,eq
00bedd64	add x8,x8,x9
00bedd68	sub x0,x8,x2
00bedd6c	bl 0x00c300b0
00bedd70	cbnz w0,0x00bedd78
00bedd74	mov x28,x25
00bedd78	lsr w8,w19,#0x1
00bedd7c	tst w19,#0x1
00bedd80	csel x9,x27,x20,eq
00bedd84	csel x8,x8,x24,eq
00bedd88	add x8,x9,x8
00bedd8c	b 0x00beddb8
00bedd90	add x8,x8,#0x1
00bedd94	str x8,[x0, #0x18]
00bedd98	ldrb w8,[sp, #0xd8]
00bedd9c	ldp x10,x9,[sp, #0xe0]
00bedda0	add x28,x28,#0x1
00bedda4	lsr x11,x8,#0x1
00bedda8	tst w8,#0x1
00beddac	csel x8,x27,x9,eq
00beddb0	csel x9,x11,x10,eq
00beddb4	add x8,x8,x9
00beddb8	cmp x28,x8
00beddbc	b.eq 0x00bedea4
00beddc0	ldr x0,[x21]
00beddc4	cbz x0,0x00bede10
00beddc8	ldp x8,x9,[x0, #0x18]
00beddcc	cmp x8,x9
00beddd0	b.eq 0x00bedde4
00beddd4	mov w19,wzr
00beddd8	cbnz x22,0x00bede18
00bedddc	tbz w19,#0x0,0x00bede50
00bedde0	b 0x00bedea4
00bedde4	ldr x8,[x0]
00bedde8	ldr x8,[x8, #0x48]
00beddec	blr x8
00beddf0	cmn w0,#0x1
00beddf4	b.eq 0x00bede0c
00beddf8	ldr x8,[x21]
00beddfc	cmp x8,#0x0
00bede00	cset w19,eq
00bede04	cbnz x22,0x00bede18
00bede08	b 0x00bedddc
00bede0c	str xzr,[x21]
00bede10	mov w19,#0x1
00bede14	cbz x22,0x00bedddc
00bede18	ldp x8,x9,[x22, #0x18]
00bede1c	cmp x8,x9
00bede20	b.eq 0x00bede2c
00bede24	tbnz w19,#0x0,0x00bede50
00bede28	b 0x00bedea4
00bede2c	ldr x8,[x22]
00bede30	ldr x8,[x8, #0x48]
00bede34	mov x0,x22
00bede38	blr x8
00bede3c	cmn w0,#0x1
00bede40	cset w8,eq
00bede44	csel x22,xzr,x22,eq
00bede48	cmp w19,w8
00bede4c	b.eq 0x00bedea4
00bede50	ldr x0,[x21]
00bede54	ldp x8,x9,[x0, #0x18]
00bede58	cmp x8,x9
00bede5c	b.eq 0x00bede68
00bede60	ldrb w8,[x8]
00bede64	b 0x00bede78
00bede68	ldr x8,[x0]
00bede6c	ldr x8,[x8, #0x48]
00bede70	blr x8
00bede74	and w8,w0,#0xff
00bede78	ldrb w9,[x28]
00bede7c	cmp w8,w9
00bede80	b.ne 0x00bedea4
00bede84	ldr x0,[x21]
00bede88	ldp x8,x9,[x0, #0x18]
00bede8c	cmp x8,x9
00bede90	b.ne 0x00bedd90
00bede94	ldr x8,[x0]
00bede98	ldr x8,[x8, #0x50]
00bede9c	blr x8
00bedea0	b 0x00bedd98
00bedea4	ldr w8,[sp, #0x4c]
00bedea8	tbnz w8,#0x9,0x00bedeb4
00bedeac	ldp x28,x27,[sp, #0x50]
00bedeb0	b 0x00bed6a8
00bedeb4	ldrb w8,[sp, #0xd8]
00bedeb8	ldp x10,x9,[sp, #0xe0]
00bedebc	lsr x11,x8,#0x1
00bedec0	tst w8,#0x1
00bedec4	csel x8,x27,x9,eq
00bedec8	csel x9,x11,x10,eq
00bedecc	add x8,x8,x9
00beded0	cmp x28,x8
00beded4	ldp x28,x27,[sp, #0x50]
00beded8	b.eq 0x00bed6a8
00bededc	b 0x00bee660
00bedee0	ldr x8,[x0]
00bedee4	ldr x8,[x8, #0x50]
00bedee8	blr x8
00bedeec	ldrb w9,[sp, #0xa8]
00bedef0	and w10,w9,#0x1
00bedef4	ldr x8,[sp, #0xb0]
00bedef8	lsr w9,w9,#0x1
00bedefc	cmp w10,#0x0
00bedf00	csel x8,x9,x8,eq
00bedf04	mov w9,#0x1
00bedf08	cmp x8,#0x1
00bedf0c	ldr x8,[sp, #0x40]
00bedf10	strb w9,[x8]
00bedf14	ldr x8,[sp, #0x60]
00bedf18	add x9,sp,#0xa8
00bedf1c	csel x8,x9,x8,hi
00bedf20	str x8,[sp, #0x60]
00bedf24	b 0x00bed6a8
00bedf28	mov x0,x19
00bedf2c	bl 0x00c308d0
00bedf30	cbz x0,0x00bee754
00bedf34	mov x20,x0
00bedf38	cbz x27,0x00bedf44
00bedf3c	mov x0,x27
00bedf40	blr x28
00bedf44	and x8,x19,#-0x4
00bedf48	adrp x28,0xcb4000
00bedf4c	add x23,x20,x23
00bedf50	add x8,x20,x8
00bedf54	mov x27,x20
00bedf58	str x8,[sp, #0x80]
00bedf5c	ldr x28,[x28, #0xbf8]
00bedf60	str w24,[x23], #0x4
00bedf64	ldr w8,[sp, #0x8c]
00bedf68	cmp w8,#0x1
00bedf6c	b.lt 0x00bed694
00bedf70	ldr x0,[x21]
00bedf74	cbz x0,0x00bedfb4
00bedf78	ldp x8,x9,[x0, #0x18]
00bedf7c	cmp x8,x9
00bedf80	b.eq 0x00bedf8c
00bedf84	mov w19,wzr
00bedf88	b 0x00bedfb8
00bedf8c	ldr x8,[x0]
00bedf90	ldr x8,[x8, #0x48]
00bedf94	blr x8
00bedf98	cmn w0,#0x1
00bedf9c	b.eq 0x00bedfb0
00bedfa0	ldr x8,[x21]
00bedfa4	cmp x8,#0x0
00bedfa8	cset w19,eq
00bedfac	b 0x00bedfb8
00bedfb0	str xzr,[x21]
00bedfb4	mov w19,#0x1
00bedfb8	cbz x22,0x00bedfd0
00bedfbc	ldp x8,x9,[x22, #0x18]
00bedfc0	cmp x8,x9
00bedfc4	b.eq 0x00bedfdc
00bedfc8	tbnz w19,#0x0,0x00bee000
00bedfcc	b 0x00bee660
00bedfd0	tbnz w19,#0x0,0x00bee660
00bedfd4	mov x22,xzr
00bedfd8	b 0x00bee000
00bedfdc	ldr x8,[x22]
00bedfe0	ldr x8,[x8, #0x48]
00bedfe4	mov x0,x22
00bedfe8	blr x8
00bedfec	cmn w0,#0x1
00bedff0	cset w8,eq
00bedff4	csel x22,xzr,x22,eq
00bedff8	cmp w19,w8
00bedffc	b.eq 0x00bee660
00bee000	ldr x0,[x21]
00bee004	ldp x8,x9,[x0, #0x18]
00bee008	cmp x8,x9
00bee00c	b.eq 0x00bee018
00bee010	ldrb w8,[x8]
00bee014	b 0x00bee028
00bee018	ldr x8,[x0]
00bee01c	ldr x8,[x8, #0x48]
00bee020	blr x8
00bee024	and w8,w0,#0xff
00bee028	ldrb w9,[sp, #0x110]
00bee02c	cmp w8,w9
00bee030	b.ne 0x00bee660
00bee034	ldr x0,[x21]
00bee038	ldp x8,x9,[x0, #0x18]
00bee03c	cmp x8,x9
00bee040	b.eq 0x00bee050
00bee044	add x8,x8,#0x1
00bee048	str x8,[x0, #0x18]
00bee04c	b 0x00bee05c
00bee050	ldr x8,[x0]
00bee054	ldr x8,[x8, #0x50]
00bee058	blr x8
00bee05c	ldr w8,[sp, #0x8c]
00bee060	cmp w8,#0x1
00bee064	b.ge 0x00bee07c
00bee068	b 0x00bed694
00bee06c	add x9,x9,#0x1
00bee070	str x9,[x0, #0x18]
00bee074	cmp w8,#0x0
00bee078	b.le 0x00bed694
00bee07c	ldr x0,[x21]
00bee080	cbz x0,0x00bee0d0
00bee084	ldp x8,x9,[x0, #0x18]
00bee088	cmp x8,x9
00bee08c	b.eq 0x00bee0a4
00bee090	mov w19,wzr
00bee094	cbnz x22,0x00bee0d8
00bee098	tbnz w19,#0x0,0x00bee660
00bee09c	mov x22,xzr
00bee0a0	b 0x00bee110
00bee0a4	ldr x8,[x0]
00bee0a8	ldr x8,[x8, #0x48]
00bee0ac	blr x8
00bee0b0	cmn w0,#0x1
00bee0b4	b.eq 0x00bee0cc
00bee0b8	ldr x8,[x21]
00bee0bc	cmp x8,#0x0
00bee0c0	cset w19,eq
00bee0c4	cbnz x22,0x00bee0d8
00bee0c8	b 0x00bee098
00bee0cc	str xzr,[x21]
00bee0d0	mov w19,#0x1
00bee0d4	cbz x22,0x00bee098
00bee0d8	ldp x8,x9,[x22, #0x18]
00bee0dc	cmp x8,x9
00bee0e0	b.eq 0x00bee0ec
00bee0e4	tbnz w19,#0x0,0x00bee110
00bee0e8	b 0x00bee660
00bee0ec	ldr x8,[x22]
00bee0f0	ldr x8,[x8, #0x48]
00bee0f4	mov x0,x22
00bee0f8	blr x8
00bee0fc	cmn w0,#0x1
00bee100	cset w8,eq
00bee104	csel x22,xzr,x22,eq
00bee108	cmp w19,w8
00bee10c	b.eq 0x00bee660
00bee110	ldr x0,[x21]
00bee114	ldp x8,x9,[x0, #0x18]
00bee118	cmp x8,x9
00bee11c	b.eq 0x00bee12c
00bee120	ldrb w8,[x8]
00bee124	tbz w8,#0x7,0x00bee140
00bee128	b 0x00bee660
00bee12c	ldr x8,[x0]
00bee130	ldr x8,[x8, #0x48]
00bee134	blr x8
00bee138	and x8,x0,#0xff
00bee13c	tbnz w8,#0x7,0x00bee660
00bee140	ldr x9,[sp, #0x78]
00bee144	ldr x9,[x9, #0x10]
00bee148	ldr x8,[x9, x8, LSL #0x3]
00bee14c	tbz w8,#0x6,0x00bee660
00bee150	ldr x8,[sp, #0x70]
00bee154	ldr x9,[x29, #0x70]
00bee158	ldr x8,[x8]
00bee15c	cmp x8,x9
00bee160	b.ne 0x00bee170
00bee164	ldp x0,x1,[sp, #0x68]
00bee168	add x2,x29,#0x70
00bee16c	bl 0x00bef074
00bee170	ldr x0,[x21]
00bee174	ldp x8,x9,[x0, #0x18]
00bee178	cmp x8,x9
00bee17c	b.eq 0x00bee188
00bee180	ldrb w0,[x8]
00bee184	b 0x00bee194
00bee188	ldr x8,[x0]
00bee18c	ldr x8,[x8, #0x48]
00bee190	blr x8
00bee194	ldr x10,[sp, #0x70]
00bee198	ldr x8,[x10]
00bee19c	add x9,x8,#0x1
00bee1a0	str x9,[x10]
00bee1a4	strb w0,[x8]
00bee1a8	ldr x0,[x21]
00bee1ac	ldr w8,[sp, #0x8c]
00bee1b0	ldp x9,x10,[x0, #0x18]
00bee1b4	sub w8,w8,#0x1
00bee1b8	str w8,[sp, #0x8c]
00bee1bc	cmp x9,x10
00bee1c0	b.ne 0x00bee06c
00bee1c4	ldr x8,[x0]
00bee1c8	ldr x8,[x8, #0x50]
00bee1cc	blr x8
00bee1d0	ldr w8,[sp, #0x8c]
00bee1d4	cmp w8,#0x0
00bee1d8	b.gt 0x00bee07c
00bee1dc	b 0x00bed694
00bee1e0	ldr x19,[sp, #0xa0]
00bee1e4	mov x24,x8
00bee1e8	b 0x00bee21c
00bee1ec	mov x1,x25
00bee1f0	mov x2,x24
00bee1f4	mov x19,x0
00bee1f8	bl 0x00c2ff60
00bee1fc	cmp x20,#0x17
00bee200	b.eq 0x00bee210
00bee204	mov x0,x25
00bee208	mov x1,x20
00bee20c	bl 0x00c2fe80
00bee210	orr x8,x27,#0x1
00bee214	str x19,[sp, #0xa0]
00bee218	str x8,[sp, #0x90]
00bee21c	add x8,x24,#0x1
00bee220	str x8,[sp, #0x98]
00bee224	add x8,x19,x24
00bee228	strb w28,[x8]
00bee22c	ldp x28,x27,[sp, #0x50]
00bee230	strb wzr,[x8, #0x1]
00bee234	ldr x0,[x21]
00bee238	mov w19,#0x1
00bee23c	cbz x0,0x00bee250
00bee240	ldp x8,x9,[x0, #0x18]
00bee244	mov w19,wzr
00bee248	cmp x8,x9
00bee24c	b.eq 0x00bee268
00bee250	cbz x22,0x00bee28c
00bee254	ldp x8,x9,[x22, #0x18]
00bee258	cmp x8,x9
00bee25c	b.eq 0x00bee294
00bee260	tbz w19,#0x0,0x00bed6a8
00bee264	b 0x00bee2b8
00bee268	ldr x8,[x0]
00bee26c	ldr x8,[x8, #0x48]
00bee270	blr x8
00bee274	cmn w0,#0x1
00bee278	b.eq 0x00bee348
00bee27c	ldr x8,[x21]
00bee280	cmp x8,#0x0
00bee284	cset w19,eq
00bee288	cbnz x22,0x00bee254
00bee28c	tbnz w19,#0x0,0x00bed6a8
00bee290	b 0x00bee2b8
00bee294	ldr x8,[x22]
00bee298	ldr x8,[x8, #0x48]
00bee29c	mov x0,x22
00bee2a0	blr x8
00bee2a4	cmn w0,#0x1
00bee2a8	cset w8,eq
00bee2ac	csel x22,xzr,x22,eq
00bee2b0	cmp w19,w8
00bee2b4	b.eq 0x00bed6a8
00bee2b8	ldr x0,[x21]
00bee2bc	ldp x8,x9,[x0, #0x18]
00bee2c0	cmp x8,x9
00bee2c4	b.eq 0x00bee2d4
00bee2c8	ldrb w8,[x8]
00bee2cc	tbz w8,#0x7,0x00bee2e8
00bee2d0	b 0x00bed6a8
00bee2d4	ldr x8,[x0]
00bee2d8	ldr x8,[x8, #0x48]
00bee2dc	blr x8
00bee2e0	and x8,x0,#0xff
00bee2e4	tbnz w8,#0x7,0x00bed6a8
00bee2e8	ldr x9,[sp, #0x78]
00bee2ec	ldr x9,[x9, #0x10]
00bee2f0	ldr x8,[x9, x8, LSL #0x3]
00bee2f4	tbz w8,#0x0,0x00bed6a8
00bee2f8	ldr x0,[x21]
00bee2fc	stp x28,x27,[sp, #0x50]
00bee300	ldp x8,x9,[x0, #0x18]
00bee304	cmp x8,x9
00bee308	b.eq 0x00bee358
00bee30c	add x9,x8,#0x1
00bee310	str x9,[x0, #0x18]
00bee314	ldrb w28,[x8]
00bee318	ldrb w8,[sp, #0x90]
00bee31c	tbnz w8,#0x0,0x00bee370
00bee320	ldr x25,[sp, #0x38]
00bee324	cmp w8,#0x2c
00bee328	mov w24,#0x16
00bee32c	mov w27,#0x30
00bee330	b.eq 0x00bee3c4
00bee334	lsr x24,x8,#0x1
00bee338	add w8,w8,#0x2
00bee33c	ldr x19,[sp, #0x38]
00bee340	strb w8,[sp, #0x90]
00bee344	b 0x00bee224
00bee348	mov w19,#0x1
00bee34c	str xzr,[x21]
00bee350	cbnz x22,0x00bee254
00bee354	b 0x00bee28c
00bee358	ldr x8,[x0]
00bee35c	ldr x8,[x8, #0x50]
00bee360	blr x8
00bee364	mov w28,w0
00bee368	ldrb w8,[sp, #0x90]
00bee36c	tbz w8,#0x0,0x00bee320
00bee370	ldp x9,x8,[sp, #0x90]
00bee374	and x20,x9,#-0x2
00bee378	sub x24,x20,#0x1
00bee37c	cmp x8,x24
00bee380	b.ne 0x00bee1e0
00bee384	cmn x20,#0x8
00bee388	b.eq 0x00bee75c
00bee38c	mov x8,#-0xd
00bee390	ldr x25,[sp, #0xa0]
00bee394	mov x27,#-0x9
00bee398	movk x8,#0x7fff, LSL #48
00bee39c	cmp x24,x8
00bee3a0	b.cs 0x00bee3c8
00bee3a4	lsl x8,x24,#0x1
00bee3a8	mov w9,#0x1a
00bee3ac	orr x8,x8,#0x7
00bee3b0	cmp x8,#0x17
00bee3b4	csinc x8,x9,x8,eq
00bee3b8	cmp x24,#0xc
00bee3bc	mov w9,#0x17
00bee3c0	csel x27,x9,x8,cc
00bee3c4	add x20,x24,#0x1
00bee3c8	mov x0,x27
00bee3cc	bl 0x00c2fed0
00bee3d0	b 0x00bee1ec
00bee3d4	ldr x26,[sp, #0x60]
00bee3d8	cbz x26,0x00bee564
00bee3dc	ldrb w8,[x26]
00bee3e0	ldr x9,[x26, #0x8]
00bee3e4	lsr x10,x8,#0x1
00bee3e8	tst w8,#0x1
00bee3ec	csel x8,x10,x9,eq
00bee3f0	cmp x8,#0x2
00bee3f4	b.cc 0x00bee564
00bee3f8	add x19,x26,#0x1
00bee3fc	mov w20,#0x2
00bee400	mov w24,#0x1
00bee404	b 0x00bee434
00bee408	add x8,x8,#0x1
00bee40c	str x8,[x0, #0x18]
00bee410	ldrb w8,[x26]
00bee414	ldr x9,[x26, #0x8]
00bee418	mov w24,w20
00bee41c	add w20,w20,#0x1
00bee420	lsr x10,x8,#0x1
00bee424	tst w8,#0x1
00bee428	csel x8,x10,x9,eq
00bee42c	cmp x8,x24
00bee430	b.ls 0x00bee564
00bee434	ldr x0,[x21]
00bee438	cbz x0,0x00bee488
00bee43c	ldp x8,x9,[x0, #0x18]
00bee440	cmp x8,x9
00bee444	b.eq 0x00bee45c
00bee448	mov w25,wzr
00bee44c	cbnz x22,0x00bee490
00bee450	tbnz w25,#0x0,0x00bee660
00bee454	mov x22,xzr
00bee458	b 0x00bee4c8
00bee45c	ldr x8,[x0]
00bee460	ldr x8,[x8, #0x48]
00bee464	blr x8
00bee468	cmn w0,#0x1
00bee46c	b.eq 0x00bee484
00bee470	ldr x8,[x21]
00bee474	cmp x8,#0x0
00bee478	cset w25,eq
00bee47c	cbnz x22,0x00bee490
00bee480	b 0x00bee450
00bee484	str xzr,[x21]
00bee488	mov w25,#0x1
00bee48c	cbz x22,0x00bee450
00bee490	ldp x8,x9,[x22, #0x18]
00bee494	cmp x8,x9
00bee498	b.eq 0x00bee4a4
00bee49c	tbnz w25,#0x0,0x00bee4c8
00bee4a0	b 0x00bee660
00bee4a4	ldr x8,[x22]
00bee4a8	ldr x8,[x8, #0x48]
00bee4ac	mov x0,x22
00bee4b0	blr x8
00bee4b4	cmn w0,#0x1
00bee4b8	cset w8,eq
00bee4bc	csel x22,xzr,x22,eq
00bee4c0	cmp w25,w8
00bee4c4	b.eq 0x00bee660
00bee4c8	ldr x0,[x21]
00bee4cc	ldp x8,x9,[x0, #0x18]
00bee4d0	cmp x8,x9
00bee4d4	b.eq 0x00bee4e0
00bee4d8	ldrb w8,[x8]
00bee4dc	b 0x00bee4f0
00bee4e0	ldr x8,[x0]
00bee4e4	ldr x8,[x8, #0x48]
00bee4e8	blr x8
00bee4ec	and w8,w0,#0xff
00bee4f0	ldrb w9,[x26]
00bee4f4	ldr x10,[x26, #0x10]
00bee4f8	tst w9,#0x1
00bee4fc	csel x9,x19,x10,eq
00bee500	ldrb w9,[x9, x24]
00bee504	cmp w8,w9
00bee508	b.ne 0x00bee660
00bee50c	ldr x0,[x21]
00bee510	ldp x8,x9,[x0, #0x18]
00bee514	cmp x8,x9
00bee518	b.ne 0x00bee408
00bee51c	ldr x8,[x0]
00bee520	ldr x8,[x8, #0x50]
00bee524	blr x8
00bee528	b 0x00bee410
00bee52c	ldr x8,[x22]
00bee530	mov x0,x22
00bee534	ldr x8,[x8, #0x48]
00bee538	blr x8
00bee53c	cmn w0,#0x1
00bee540	cset w8,eq
00bee544	csel x22,xzr,x22,eq
00bee548	eor w8,w20,w8
00bee54c	tbnz w8,#0x0,0x00bed5d4
00bee550	ldr w8,[x23]
00bee554	mov w21,wzr
00bee558	orr w8,w8,#0x4
00bee55c	str w8,[x23]
00bee560	b 0x00bee720
00bee564	cmp x27,x23
00bee568	b.eq 0x00bee624
00bee56c	ldrb w9,[sp, #0xf0]
00bee570	ldr x8,[sp, #0xf8]
00bee574	sub x11,x23,x27
00bee578	mov w21,#0x1
00bee57c	lsr x10,x9,#0x1
00bee580	tst w9,#0x1
00bee584	csel x8,x10,x8,eq
00bee588	cmp x11,#0x5
00bee58c	b.lt 0x00bee674
00bee590	cbz x8,0x00bee674
00bee594	sub x8,x23,#0x4
00bee598	cmp x27,x8
00bee59c	b.cs 0x00bee62c
00bee5a0	add x9,x27,#0x4
00bee5a4	mov x10,x8
00bee5a8	ldr w11,[x10]
00bee5ac	ldur w12,[x9, #-0x4]
00bee5b0	stur w11,[x9, #-0x4]
00bee5b4	str w12,[x10], #-0x4
00bee5b8	cmp x9,x10
00bee5bc	add x9,x9,#0x4
00bee5c0	b.cc 0x00bee5a8
00bee5c4	ldrb w9,[sp, #0xf0]
00bee5c8	ldp x12,x11,[sp, #0xf8]
00bee5cc	lsr x10,x9,#0x1
00bee5d0	tst w9,#0x1
00bee5d4	add x9,sp,#0xf0
00bee5d8	csinc x9,x11,x9,ne
00bee5dc	mov x11,x27
00bee5e0	csel x10,x10,x12,eq
00bee5e4	add x10,x9,x10
00bee5e8	b 0x00bee604
00bee5ec	sub x12,x10,x9
00bee5f0	add x11,x11,#0x4
00bee5f4	cmp x12,#0x1
00bee5f8	cinc x9,x9,gt
00bee5fc	cmp x11,x8
00bee600	b.cs 0x00bee63c
00bee604	ldrb w12,[x9]
00bee608	cbz w12,0x00bee5ec
00bee60c	cmp w12,#0xff
00bee610	b.eq 0x00bee5ec
00bee614	ldr w13,[x11]
00bee618	cmp w13,w12
00bee61c	b.eq 0x00bee5ec
00bee620	b 0x00bee660
00bee624	mov w21,#0x1
00bee628	b 0x00bee674
00bee62c	ldr x10,[sp, #0x100]
00bee630	tst w9,#0x1
00bee634	add x9,sp,#0xf0
00bee638	csinc x9,x10,x9,ne
00bee63c	ldrb w9,[x9]
00bee640	mov w21,#0x1
00bee644	cbz w9,0x00bee674
00bee648	cmp w9,#0xff
00bee64c	b.eq 0x00bee674
00bee650	ldr w8,[x8]
00bee654	sub w8,w8,#0x1
00bee658	cmp w8,w9
00bee65c	b.cc 0x00bee674
00bee660	ldr x9,[sp, #0x20]
00bee664	mov w21,wzr
00bee668	ldr w8,[x9]
00bee66c	orr w8,w8,#0x4
00bee670	str w8,[x9]
00bee674	ldrb w8,[sp, #0x90]
00bee678	tbnz w8,#0x0,0x00bee6a4
00bee67c	ldrb w8,[sp, #0xa8]
00bee680	tbnz w8,#0x0,0x00bee6bc
00bee684	ldrb w8,[sp, #0xc0]
00bee688	tbnz w8,#0x0,0x00bee6d4
00bee68c	ldrb w8,[sp, #0xd8]
00bee690	tbnz w8,#0x0,0x00bee6ec
00bee694	ldrb w8,[sp, #0xf0]
00bee698	tbnz w8,#0x0,0x00bee704
00bee69c	cbnz x27,0x00bee718
00bee6a0	b 0x00bee720
00bee6a4	ldr x8,[sp, #0x90]
00bee6a8	ldr x0,[sp, #0xa0]
00bee6ac	and x1,x8,#-0x2
00bee6b0	bl 0x00c2fe80
00bee6b4	ldrb w8,[sp, #0xa8]
00bee6b8	tbz w8,#0x0,0x00bee684
00bee6bc	ldr x8,[sp, #0xa8]
00bee6c0	ldr x0,[sp, #0xb8]
00bee6c4	and x1,x8,#-0x2
00bee6c8	bl 0x00c2fe80
00bee6cc	ldrb w8,[sp, #0xc0]
00bee6d0	tbz w8,#0x0,0x00bee68c
00bee6d4	ldr x8,[sp, #0xc0]
00bee6d8	ldr x0,[sp, #0xd0]
00bee6dc	and x1,x8,#-0x2
00bee6e0	bl 0x00c2fe80
00bee6e4	ldrb w8,[sp, #0xd8]
00bee6e8	tbz w8,#0x0,0x00bee694
00bee6ec	ldr x8,[sp, #0xd8]
00bee6f0	ldr x0,[sp, #0xe8]
00bee6f4	and x1,x8,#-0x2
00bee6f8	bl 0x00c2fe80
00bee6fc	ldrb w8,[sp, #0xf0]
00bee700	tbz w8,#0x0,0x00bee69c
00bee704	ldr x8,[sp, #0xf0]
00bee708	ldr x0,[sp, #0x100]
00bee70c	and x1,x8,#-0x2
00bee710	bl 0x00c2fe80
00bee714	cbz x27,0x00bee720
00bee718	mov x0,x27
00bee71c	blr x28
00bee720	mov w0,w21
00bee724	add sp,sp,#0x2b0
00bee728	ldp x20,x19,[sp, #0x50]
00bee72c	ldp x22,x21,[sp, #0x40]
00bee730	ldp x24,x23,[sp, #0x30]
00bee734	ldp x26,x25,[sp, #0x20]
00bee738	ldp x28,x27,[sp, #0x10]
00bee73c	ldp x29,x30,[sp], #0x60
00bee740	autiasp
00bee744	ret
00bee748	stp x28,x27,[sp, #0x50]
00bee74c	bl 0x00c43cc0
00bee750	bl 0x007fe124
00bee754	stp x28,x27,[sp, #0x50]
00bee758	bl 0x00c43cc0
00bee75c	bl 0x007fe124
