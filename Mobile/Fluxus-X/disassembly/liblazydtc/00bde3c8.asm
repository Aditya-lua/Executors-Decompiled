; std::__ndk1::num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get @ 00bde3c8
00bde3c8	paciasp
00bde3cc	sub sp,sp,#0xc0
00bde3d0	stp x29,x30,[sp, #0x60]
00bde3d4	stp x28,x27,[sp, #0x70]
00bde3d8	stp x26,x25,[sp, #0x80]
00bde3dc	stp x24,x23,[sp, #0x90]
00bde3e0	stp x22,x21,[sp, #0xa0]
00bde3e4	stp x20,x19,[sp, #0xb0]
00bde3e8	add x29,sp,#0x60
00bde3ec	mov x25,x5
00bde3f0	mov x24,x4
00bde3f4	mov x0,x3
00bde3f8	mov x21,x2
00bde3fc	mov x19,x1
00bde400	add x8,sp,#0x28
00bde404	bl 0x00c30070
00bde408	adrp x22,0xcb4000
00bde40c	ldr x22,[x22, #0x998]
00bde410	ldr x20,[sp, #0x28]
00bde414	stur x22,[x29, #-0x10]
00bde418	ldar x8,[x22]
00bde41c	cmn x8,#0x1
00bde420	b.eq 0x00bde44c
00bde424	sub x8,x29,#0x10
00bde428	add x9,sp,#0x10
00bde42c	str x8,[sp, #0x10]
00bde430	stur x9,[x29, #-0x8]
00bde434	adrp x0,0xcb4000
00bde438	nop
00bde43c	adr x2,0xc0bab0
00bde440	ldr x0,[x0, #0x998]
00bde444	sub x1,x29,#0x8
00bde448	bl 0x00c305d0
00bde44c	ldp x8,x10,[x20, #0x10]
00bde450	ldrsw x9,[x22, #0x8]
00bde454	sub x9,x9,#0x1
00bde458	sub x10,x10,x8
00bde45c	cmp x9,x10, ASR #0x3
00bde460	b.cs 0x00bde870
00bde464	ldr x0,[x8, x9, LSL #0x3]
00bde468	cbz x0,0x00bde870
00bde46c	ldr x8,[x0]
00bde470	ldr x8,[x8, #0x40]
00bde474	adrp x23,0xcb5000
00bde478	sub x3,x29,#0x2a
00bde47c	ldr x23,[x23, #0xc08]
00bde480	add x2,x23,#0x1a
00bde484	mov x1,x23
00bde488	blr x8
00bde48c	add x0,sp,#0x28
00bde490	stp x25,x24,[sp]
00bde494	bl 0x00c30090
00bde498	stp xzr,xzr,[sp, #0x10]
00bde49c	str xzr,[sp, #0x20]
00bde4a0	add x0,sp,#0x10
00bde4a4	mov w1,#0x16
00bde4a8	mov w2,wzr
00bde4ac	add x20,sp,#0x10
00bde4b0	bl 0x00c30250
00bde4b4	ldrb w8,[sp, #0x10]
00bde4b8	ldr x9,[sp, #0x20]
00bde4bc	sub x26,x29,#0x2a
00bde4c0	orr x25,x20,#0x1
00bde4c4	add x27,x26,#0x1a
00bde4c8	mov w28,#0x16
00bde4cc	tst w8,#0x1
00bde4d0	csinc x22,x9,x20,ne
00bde4d4	mov x20,x22
00bde4d8	b 0x00bde4e4
00bde4dc	add x8,x8,#0x1
00bde4e0	str x8,[x19, #0x18]
00bde4e4	cbz x19,0x00bde500
00bde4e8	ldp x8,x9,[x19, #0x18]
00bde4ec	cmp x8,x9
00bde4f0	b.eq 0x00bde51c
00bde4f4	mov w24,wzr
00bde4f8	cbnz x21,0x00bde508
00bde4fc	b 0x00bde53c
00bde500	mov w24,#0x1
00bde504	cbz x21,0x00bde53c
00bde508	ldp x8,x9,[x21, #0x18]
00bde50c	cmp x8,x9
00bde510	b.eq 0x00bde544
00bde514	tbnz w24,#0x0,0x00bde568
00bde518	b 0x00bde704
00bde51c	ldr x8,[x19]
00bde520	ldr x8,[x8, #0x48]
00bde524	mov x0,x19
00bde528	blr x8
00bde52c	cmn w0,#0x1
00bde530	cset w24,eq
00bde534	csel x19,xzr,x19,eq
00bde538	cbnz x21,0x00bde508
00bde53c	tbz w24,#0x0,0x00bde568
00bde540	b 0x00bde704
00bde544	ldr x8,[x21]
00bde548	ldr x8,[x8, #0x48]
00bde54c	mov x0,x21
00bde550	blr x8
00bde554	cmn w0,#0x1
00bde558	cset w8,eq
00bde55c	csel x21,xzr,x21,eq
00bde560	cmp w24,w8
00bde564	b.eq 0x00bde704
00bde568	ldrb w8,[sp, #0x10]
00bde56c	ldr x9,[sp, #0x18]
00bde570	lsr x10,x8,#0x1
00bde574	tst w8,#0x1
00bde578	csel x24,x10,x9,eq
00bde57c	add x9,x20,x24
00bde580	cmp x22,x9
00bde584	b.ne 0x00bde638
00bde588	cmp x24,#0x1
00bde58c	b.lt 0x00bde5a4
00bde590	add x0,sp,#0x10
00bde594	mov x1,x24
00bde598	mov w2,wzr
00bde59c	bl 0x00c30250
00bde5a0	b 0x00bde5c8
00bde5a4	lsl x9,x24,#0x1
00bde5a8	tbnz w8,#0x0,0x00bde5bc
00bde5ac	lsl w8,w9,#0x1
00bde5b0	strb w8,[sp, #0x10]
00bde5b4	mov x8,x25
00bde5b8	b 0x00bde5c4
00bde5bc	ldr x8,[sp, #0x20]
00bde5c0	str x9,[sp, #0x18]
00bde5c4	strb wzr,[x8, x9]
00bde5c8	ldp x9,x10,[sp, #0x10]
00bde5cc	ldrb w8,[sp, #0x10]
00bde5d0	tst w8,#0x1
00bde5d4	and x11,x9,#-0x2
00bde5d8	ubfx x12,x9,#0x1,#0x7
00bde5dc	sub x11,x11,#0x1
00bde5e0	csel x8,x28,x11,eq
00bde5e4	tst x9,#0x1
00bde5e8	csel x10,x12,x10,eq
00bde5ec	subs x1,x8,x10
00bde5f0	b.ls 0x00bde604
00bde5f4	add x0,sp,#0x10
00bde5f8	mov w2,wzr
00bde5fc	bl 0x00c30250
00bde600	b 0x00bde624
00bde604	tbnz w9,#0x0,0x00bde618
00bde608	lsl w9,w8,#0x1
00bde60c	strb w9,[sp, #0x10]
00bde610	mov x9,x25
00bde614	b 0x00bde620
00bde618	ldr x9,[sp, #0x20]
00bde61c	str x8,[sp, #0x18]
00bde620	strb wzr,[x9, x8]
00bde624	ldrb w8,[sp, #0x10]
00bde628	ldr x9,[sp, #0x20]
00bde62c	tst w8,#0x1
00bde630	csel x20,x25,x9,eq
00bde634	add x22,x20,x24
00bde638	ldp x8,x9,[x19, #0x18]
00bde63c	cmp x8,x9
00bde640	b.eq 0x00bde654
00bde644	ldrb w1,[x8]
00bde648	cmp x22,x20
00bde64c	b.ne 0x00bde698
00bde650	b 0x00bde670
00bde654	ldr x8,[x19]
00bde658	ldr x8,[x8, #0x48]
00bde65c	mov x0,x19
00bde660	blr x8
00bde664	and w1,w0,#0xff
00bde668	cmp x22,x20
00bde66c	b.ne 0x00bde698
00bde670	ldurb w8,[x29, #-0x12]
00bde674	cmp w1,w8
00bde678	b.ne 0x00bde684
00bde67c	mov w8,#0x2b
00bde680	b 0x00bde6e0
00bde684	ldurb w8,[x29, #-0x11]
00bde688	cmp w1,w8
00bde68c	b.ne 0x00bde698
00bde690	mov w8,#0x2d
00bde694	b 0x00bde6e0
00bde698	sub x0,x29,#0x2a
00bde69c	mov w2,#0x1a
00bde6a0	bl 0x00c300a0
00bde6a4	cmp x0,#0x0
00bde6a8	csel x8,x27,x0,eq
00bde6ac	sub x8,x8,x26
00bde6b0	cmp x8,#0x17
00bde6b4	b.gt 0x00bde704
00bde6b8	cmp x8,#0x16
00bde6bc	b.lt 0x00bde6dc
00bde6c0	subs x9,x22,x20
00bde6c4	b.eq 0x00bde704
00bde6c8	cmp x9,#0x2
00bde6cc	b.gt 0x00bde704
00bde6d0	ldurb w9,[x22, #-0x1]
00bde6d4	cmp w9,#0x30
00bde6d8	b.ne 0x00bde704
00bde6dc	ldrb w8,[x23, x8]
00bde6e0	strb w8,[x22], #0x1
00bde6e4	ldp x8,x9,[x19, #0x18]
00bde6e8	cmp x8,x9
00bde6ec	b.ne 0x00bde4dc
00bde6f0	ldr x8,[x19]
00bde6f4	ldr x8,[x8, #0x50]
00bde6f8	mov x0,x19
00bde6fc	blr x8
00bde700	b 0x00bde4e4
00bde704	ldrb w9,[sp, #0x10]
00bde708	ldr x10,[sp, #0x18]
00bde70c	sub x8,x22,x20
00bde710	ldr x22,[sp, #0x8]
00bde714	lsr x11,x9,#0x1
00bde718	tst w9,#0x1
00bde71c	csel x10,x11,x10,eq
00bde720	subs x1,x8,x10
00bde724	b.ls 0x00bde738
00bde728	add x0,sp,#0x10
00bde72c	mov w2,wzr
00bde730	bl 0x00c30250
00bde734	b 0x00bde758
00bde738	tbnz w9,#0x0,0x00bde74c
00bde73c	lsl w9,w8,#0x1
00bde740	strb w9,[sp, #0x10]
00bde744	mov x9,x25
00bde748	b 0x00bde754
00bde74c	ldr x9,[sp, #0x20]
00bde750	str x8,[sp, #0x18]
00bde754	strb wzr,[x9, x8]
00bde758	ldrb w8,[sp, #0x10]
00bde75c	ldr x9,[sp, #0x20]
00bde760	adrp x10,0xd27000
00bde764	add x10,x10,#0xf8
00bde768	adrp x20,0xd27000
00bde76c	ldarb w10,[x10]
00bde770	tst w8,#0x1
00bde774	csel x23,x25,x9,eq
00bde778	tbz w10,#0x0,0x00bde874
00bde77c	ldr x1,[x20, #0xf0]
00bde780	ldr x3,[sp]
00bde784	adrp x2,0x2ab000
00bde788	add x2,x2,#0x219
00bde78c	mov x0,x23
00bde790	bl 0x00c0ca90
00bde794	cmp w0,#0x1
00bde798	b.eq 0x00bde7a4
00bde79c	mov w8,#0x4
00bde7a0	str w8,[x22]
00bde7a4	cbz x19,0x00bde7c0
00bde7a8	ldp x8,x9,[x19, #0x18]
00bde7ac	cmp x8,x9
00bde7b0	b.eq 0x00bde824
00bde7b4	mov w20,wzr
00bde7b8	cbnz x21,0x00bde7c8
00bde7bc	b 0x00bde844
00bde7c0	mov w20,#0x1
00bde7c4	cbz x21,0x00bde844
00bde7c8	ldp x8,x9,[x21, #0x18]
00bde7cc	cmp x8,x9
00bde7d0	b.eq 0x00bde84c
00bde7d4	tbnz w20,#0x0,0x00bde7e4
00bde7d8	ldr w8,[x22]
00bde7dc	orr w8,w8,#0x2
00bde7e0	str w8,[x22]
00bde7e4	ldrb w8,[sp, #0x10]
00bde7e8	tbz w8,#0x0,0x00bde7fc
00bde7ec	ldr x8,[sp, #0x10]
00bde7f0	ldr x0,[sp, #0x20]
00bde7f4	and x1,x8,#-0x2
00bde7f8	bl 0x00c2fe80
00bde7fc	mov x0,x19
00bde800	ldp x20,x19,[sp, #0xb0]
00bde804	ldp x22,x21,[sp, #0xa0]
00bde808	ldp x24,x23,[sp, #0x90]
00bde80c	ldp x26,x25,[sp, #0x80]
00bde810	ldp x28,x27,[sp, #0x70]
00bde814	ldp x29,x30,[sp, #0x60]
00bde818	add sp,sp,#0xc0
00bde81c	autiasp
00bde820	ret
00bde824	ldr x8,[x19]
00bde828	ldr x8,[x8, #0x48]
00bde82c	mov x0,x19
00bde830	blr x8
00bde834	cmn w0,#0x1
00bde838	cset w20,eq
00bde83c	csel x19,xzr,x19,eq
00bde840	cbnz x21,0x00bde7c8
00bde844	tbnz w20,#0x0,0x00bde7d8
00bde848	b 0x00bde7e4
00bde84c	ldr x8,[x21]
00bde850	ldr x8,[x8, #0x48]
00bde854	mov x0,x21
00bde858	blr x8
00bde85c	cmn w0,#0x1
00bde860	cset w8,eq
00bde864	eor w8,w20,w8
00bde868	tbz w8,#0x0,0x00bde7d8
00bde86c	b 0x00bde7e4
00bde870	bl 0x00bd8968
00bde874	adrp x0,0xd27000
00bde878	add x0,x0,#0xf8
00bde87c	bl 0x00c2fe90
00bde880	cbz w0,0x00bde77c
00bde884	adrp x1,0x2c6000
00bde888	add x1,x1,#0xbfc
00bde88c	mov w0,#0x1fbf
00bde890	mov x2,xzr
00bde894	bl 0x00c43890
00bde898	str x0,[x20, #0xf0]
00bde89c	adrp x0,0xd27000
00bde8a0	add x0,x0,#0xf8
00bde8a4	bl 0x00c2fea0
00bde8a8	ldr x22,[sp, #0x8]
00bde8ac	b 0x00bde77c
