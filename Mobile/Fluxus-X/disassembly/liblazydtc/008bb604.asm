; FUN_008bb604 @ 008bb604
008bb50c	stp x29,x30,[sp, #-0x20]!
008bb510	str x19,[sp, #0x10]
008bb514	mov x29,sp
008bb518	eor w8,w1,w1, LSR #0x10
008bb51c	mov w9,#0xca6b
008bb520	mov w10,#0xffffffff
008bb524	movk w9,#0x85eb, LSL #16
008bb528	mul w8,w8,w9
008bb52c	mov w9,#0xae35
008bb530	movk w9,#0xc2b2, LSL #16
008bb534	eor w8,w8,w8, LSR #0xd
008bb538	mul w8,w8,w9
008bb53c	ldrb w9,[x0, #0x5]
008bb540	lsl w9,w10,w9
008bb544	ldr x10,[x0, #0x28]
008bb548	eor w8,w8,w8, LSR #0x10
008bb54c	bic w8,w8,w9
008bb550	add x0,x10,x8, LSL #0x5
008bb554	ldr w8,[x0, #0x1c]
008bb558	and w9,w8,#0xf
008bb55c	cmp w9,#0x2
008bb560	b.ne 0x008bb57c
008bb564	ldr x9,[x0, #0x10]
008bb568	cmp x9,x1
008bb56c	b.ne 0x008bb57c
008bb570	ldr w9,[x0, #0x18]
008bb574	cmp w9,w2
008bb578	b.eq 0x008bb5b0
008bb57c	cmp w8,#0x10
008bb580	b.cc 0x008bb590
008bb584	sbfx x8,x8,#0x4,#0x1c
008bb588	add x0,x0,x8, LSL #0x5
008bb58c	b 0x008bb554
008bb590	adrp x8,0xd1f000
008bb594	add x8,x8,#0x1e0
008bb598	adrp x19,0xd1f000
008bb59c	ldarb w8,[x8]
008bb5a0	tbz w8,#0x0,0x008bb5bc
008bb5a4	ldr x8,[x19, #0x1d8]
008bb5a8	add x8,x8,#0x7f2, LSL #12
008bb5ac	add x0,x8,#0xef0
008bb5b0	ldr x19,[sp, #0x10]
008bb5b4	ldp x29,x30,[sp], #0x20
008bb5b8	ret
008bb5bc	adrp x0,0xd1f000
008bb5c0	add x0,x0,#0x1e0
008bb5c4	bl 0x00c2fe90
008bb5c8	cbz w0,0x008bb5a4
008bb5cc	adrp x8,0xcca000
008bb5d0	ldr x0,[x8, #0x8c8]
008bb5d4	bl 0x007fe1ec
008bb5d8	str x0,[x19, #0x1d8]
008bb5dc	adrp x0,0xd1f000
008bb5e0	add x0,x0,#0x1e0
008bb5e4	bl 0x00c2fea0
008bb5e8	b 0x008bb5a4
008bb604	stp x29,x30,[sp, #-0x20]!
008bb608	str x19,[sp, #0x10]
008bb60c	mov x29,sp
008bb610	adrp x9,0xd1f000
008bb614	add x9,x9,#0xcc0
008bb618	ldr w8,[x1, #0xc]
008bb61c	ldrb w9,[x9]
008bb620	cmp w9,#0x1
008bb624	b.ne 0x008bb648
008bb628	cmp w8,#0x2
008bb62c	b.gt 0x008bb67c
008bb630	cbz w8,0x008bb72c
008bb634	cmp w8,#0x1
008bb638	b.eq 0x008bb834
008bb63c	cmp w8,#0x2
008bb640	b.eq 0x008bb664
008bb644	b 0x008bb694
008bb648	cmp w8,#0x2
008bb64c	b.gt 0x008bb704
008bb650	cbz w8,0x008bb75c
008bb654	cmp w8,#0x1
008bb658	b.eq 0x008bb880
008bb65c	cmp w8,#0x2
008bb660	b.ne 0x008bb7c4
008bb664	ldr x8,[x1]
008bb668	ldr w2,[x1, #0x8]
008bb66c	mov x1,x8
008bb670	ldr x19,[sp, #0x10]
008bb674	ldp x29,x30,[sp], #0x20
008bb678	b 0x008bb50c
008bb67c	cmp w8,#0x3
008bb680	b.eq 0x008bb78c
008bb684	cmp w8,#0x4
008bb688	b.eq 0x008bb8cc
008bb68c	cmp w8,#0x5
008bb690	b.eq 0x008bb71c
008bb694	ldr x9,[x1]
008bb698	mov w11,#0xca6b
008bb69c	mov w12,#0xffffffff
008bb6a0	movk w11,#0x85eb, LSL #16
008bb6a4	eor w10,w9,w9, LSR #0x10
008bb6a8	mul w10,w10,w11
008bb6ac	mov w11,#0xae35
008bb6b0	movk w11,#0xc2b2, LSL #16
008bb6b4	eor w10,w10,w10, LSR #0xd
008bb6b8	mul w10,w10,w11
008bb6bc	ldrb w11,[x0, #0x5]
008bb6c0	lsl w11,w12,w11
008bb6c4	ldr x12,[x0, #0x28]
008bb6c8	eor w10,w10,w10, LSR #0x10
008bb6cc	bic w10,w10,w11
008bb6d0	add x0,x12,x10, LSL #0x5
008bb6d4	ldr w10,[x0, #0x1c]
008bb6d8	and w11,w10,#0xf
008bb6dc	cmp w11,w8
008bb6e0	b.ne 0x008bb6f0
008bb6e4	ldr x11,[x0, #0x10]
008bb6e8	cmp x11,x9
008bb6ec	b.eq 0x008bbb40
008bb6f0	cmp w10,#0x10
008bb6f4	b.cc 0x008bba90
008bb6f8	sbfx x10,x10,#0x4,#0x1c
008bb6fc	add x0,x0,x10, LSL #0x5
008bb700	b 0x008bb6d4
008bb704	cmp w8,#0x3
008bb708	b.eq 0x008bb7a4
008bb70c	cmp w8,#0x4
008bb710	b.eq 0x008bb988
008bb714	cmp w8,#0x5
008bb718	b.ne 0x008bb7c4
008bb71c	ldr x1,[x1]
008bb720	ldr x19,[sp, #0x10]
008bb724	ldp x29,x30,[sp], #0x20
008bb728	b 0x008bb440
008bb72c	adrp x8,0xd1f000
008bb730	add x8,x8,#0x1e0
008bb734	ldarb w8,[x8]
008bb738	tbnz w8,#0x0,0x008bbb30
008bb73c	adrp x0,0xd1f000
008bb740	add x0,x0,#0x1e0
008bb744	bl 0x00c2fe90
008bb748	cbz w0,0x008bbb30
008bb74c	adrp x8,0xcca000
008bb750	ldr x0,[x8, #0x8c8]
008bb754	bl 0x007fe1ec
008bb758	b 0x008bbc9c
008bb75c	adrp x8,0xd1f000
008bb760	add x8,x8,#0x1e0
008bb764	ldarb w8,[x8]
008bb768	tbnz w8,#0x0,0x008bbb30
008bb76c	adrp x0,0xd1f000
008bb770	add x0,x0,#0x1e0
008bb774	bl 0x00c2fe90
008bb778	cbz w0,0x008bbb30
008bb77c	adrp x8,0xcca000
008bb780	ldr x0,[x8, #0x8c8]
008bb784	bl 0x007fe1ec
008bb788	b 0x008bbc9c
008bb78c	ldr d0,[x1]
008bb790	fcvtzs w1,d0
008bb794	scvtf d1,w1
008bb798	fcmp d0,d1
008bb79c	b.ne 0x008bbb4c
008bb7a0	b 0x008bb7b8
008bb7a4	ldr d0,[x1]
008bb7a8	fcvtzs w1,d0
008bb7ac	scvtf d1,w1
008bb7b0	fcmp d0,d1
008bb7b4	b.ne 0x008bbbc4
008bb7b8	ldr x19,[sp, #0x10]
008bb7bc	ldp x29,x30,[sp], #0x20
008bb7c0	b 0x008bb19c
008bb7c4	ldr x9,[x1]
008bb7c8	mov w11,#0xca6b
008bb7cc	mov w12,#0xffffffff
008bb7d0	movk w11,#0x85eb, LSL #16
008bb7d4	eor w10,w9,w9, LSR #0x10
008bb7d8	mul w10,w10,w11
008bb7dc	mov w11,#0xae35
008bb7e0	movk w11,#0xc2b2, LSL #16
008bb7e4	eor w10,w10,w10, LSR #0xd
008bb7e8	mul w10,w10,w11
008bb7ec	ldrb w11,[x0, #0x5]
008bb7f0	lsl w11,w12,w11
008bb7f4	ldr x12,[x0, #0x28]
008bb7f8	eor w10,w10,w10, LSR #0x10
008bb7fc	bic w10,w10,w11
008bb800	add x0,x12,x10, LSL #0x5
008bb804	ldr w10,[x0, #0x1c]
008bb808	and w11,w10,#0xf
008bb80c	cmp w11,w8
008bb810	b.ne 0x008bb820
008bb814	ldr x11,[x0, #0x10]
008bb818	cmp x11,x9
008bb81c	b.eq 0x008bbb40
008bb820	cmp w10,#0x10
008bb824	b.cc 0x008bbac0
008bb828	sbfx x10,x10,#0x4,#0x1c
008bb82c	add x0,x0,x10, LSL #0x5
008bb830	b 0x008bb804
008bb834	ldrb w9,[x0, #0x5]
008bb838	mov w10,#0xffffffff
008bb83c	ldr w8,[x1]
008bb840	lsl w9,w10,w9
008bb844	ldr x10,[x0, #0x28]
008bb848	bic w9,w8,w9
008bb84c	add x0,x10,x9, LSL #0x5
008bb850	ldr w9,[x0, #0x1c]
008bb854	and w10,w9,#0xf
008bb858	cmp w10,#0x1
008bb85c	b.ne 0x008bb86c
008bb860	ldr w10,[x0, #0x10]
008bb864	cmp w10,w8
008bb868	b.eq 0x008bbb40
008bb86c	cmp w9,#0x10
008bb870	b.cc 0x008bbaf0
008bb874	sbfx x9,x9,#0x4,#0x1c
008bb878	add x0,x0,x9, LSL #0x5
008bb87c	b 0x008bb850
008bb880	ldrb w9,[x0, #0x5]
008bb884	mov w10,#0xffffffff
008bb888	ldr w8,[x1]
008bb88c	lsl w9,w10,w9
008bb890	ldr x10,[x0, #0x28]
008bb894	bic w9,w8,w9
008bb898	add x0,x10,x9, LSL #0x5
008bb89c	ldr w9,[x0, #0x1c]
008bb8a0	and w10,w9,#0xf
008bb8a4	cmp w10,#0x1
008bb8a8	b.ne 0x008bb8b8
008bb8ac	ldr w10,[x0, #0x10]
008bb8b0	cmp w10,w8
008bb8b4	b.eq 0x008bbb40
008bb8b8	cmp w9,#0x10
008bb8bc	b.cc 0x008bbb20
008bb8c0	sbfx x9,x9,#0x4,#0x1c
008bb8c4	add x0,x0,x9, LSL #0x5
008bb8c8	b 0x008bb89c
008bb8cc	movi v1.2S,#0x80, LSL #24
008bb8d0	ldur d0,[x1, #0x4]
008bb8d4	adrp x8,0x29a000
008bb8d8	ldr w9,[x1]
008bb8dc	mov w10,#0xf45d
008bb8e0	ldrb w11,[x0, #0x5]
008bb8e4	movk w10,#0x466, LSL #16
008bb8e8	mov w13,#0xffffffff
008bb8ec	lsl w11,w13,w11
008bb8f0	cmeq v1.2S,v0.2S,v1.2S
008bb8f4	bic v1.8B,v0.8B,v1.8B
008bb8f8	ushr v2.2S,v1.2S,#0x11
008bb8fc	eor v1.8B,v2.8B,v1.8B
008bb900	ldr d2,[x8, #0x148]
008bb904	mov w8,#0x80000000
008bb908	cmp w9,w8
008bb90c	csel w8,wzr,w9,eq
008bb910	mul v1.2S,v1.2S,v2.2S
008bb914	eor w8,w8,w8, LSR #0x11
008bb918	fmov s2,w9
008bb91c	mul w8,w8,w10
008bb920	mov w10,v1.S[0x1]
008bb924	fmov w12,s1
008bb928	dup s1,v0.S[0x1]
008bb92c	eor w8,w12,w8
008bb930	eor w8,w8,w10
008bb934	ldr x10,[x0, #0x28]
008bb938	bic w8,w8,w11
008bb93c	add x0,x10,x8, LSL #0x5
008bb940	ldr w8,[x0, #0x1c]
008bb944	and w9,w8,#0xf
008bb948	cmp w9,#0x4
008bb94c	b.ne 0x008bb974
008bb950	ldr s3,[x0, #0x10]
008bb954	fcmp s3,s2
008bb958	b.ne 0x008bb974
008bb95c	ldr s3,[x0, #0x14]
008bb960	fcmp s3,s0
008bb964	b.ne 0x008bb974
008bb968	ldr s3,[x0, #0x18]
008bb96c	fcmp s3,s1
008bb970	b.eq 0x008bbb40
008bb974	cmp w8,#0x10
008bb978	b.cc 0x008bba44
008bb97c	sbfx x8,x8,#0x4,#0x1c
008bb980	add x0,x0,x8, LSL #0x5
008bb984	b 0x008bb940
008bb988	movi v1.2S,#0x80, LSL #24
008bb98c	ldur d0,[x1, #0x4]
008bb990	adrp x8,0x29a000
008bb994	ldr w9,[x1]
008bb998	mov w10,#0xf45d
008bb99c	ldrb w11,[x0, #0x5]
008bb9a0	movk w10,#0x466, LSL #16
008bb9a4	mov w13,#0xffffffff
008bb9a8	lsl w11,w13,w11
008bb9ac	cmeq v1.2S,v0.2S,v1.2S
008bb9b0	bic v1.8B,v0.8B,v1.8B
008bb9b4	ushr v2.2S,v1.2S,#0x11
008bb9b8	eor v1.8B,v2.8B,v1.8B
008bb9bc	ldr d2,[x8, #0x148]
008bb9c0	mov w8,#0x80000000
008bb9c4	cmp w9,w8
008bb9c8	csel w8,wzr,w9,eq
008bb9cc	mul v1.2S,v1.2S,v2.2S
008bb9d0	eor w8,w8,w8, LSR #0x11
008bb9d4	fmov s2,w9
008bb9d8	mul w8,w8,w10
008bb9dc	mov w10,v1.S[0x1]
008bb9e0	fmov w12,s1
008bb9e4	dup s1,v0.S[0x1]
008bb9e8	eor w8,w12,w8
008bb9ec	eor w8,w8,w10
008bb9f0	ldr x10,[x0, #0x28]
008bb9f4	bic w8,w8,w11
008bb9f8	add x0,x10,x8, LSL #0x5
008bb9fc	ldr w8,[x0, #0x1c]
008bba00	and w9,w8,#0xf
008bba04	cmp w9,#0x4
008bba08	b.ne 0x008bba30
008bba0c	ldr s3,[x0, #0x10]
008bba10	fcmp s3,s2
008bba14	b.ne 0x008bba30
008bba18	ldr s3,[x0, #0x14]
008bba1c	fcmp s3,s0
008bba20	b.ne 0x008bba30
008bba24	ldr s3,[x0, #0x18]
008bba28	fcmp s3,s1
008bba2c	b.eq 0x008bbb40
008bba30	cmp w8,#0x10
008bba34	b.cc 0x008bba74
008bba38	sbfx x8,x8,#0x4,#0x1c
008bba3c	add x0,x0,x8, LSL #0x5
008bba40	b 0x008bb9fc
008bba44	adrp x8,0xd1f000
008bba48	add x8,x8,#0x1e0
008bba4c	ldarb w8,[x8]
008bba50	tbnz w8,#0x0,0x008bbb30
008bba54	adrp x0,0xd1f000
008bba58	add x0,x0,#0x1e0
008bba5c	bl 0x00c2fe90
008bba60	cbz w0,0x008bbb30
008bba64	adrp x8,0xcca000
008bba68	ldr x0,[x8, #0x8c8]
008bba6c	bl 0x007fe1ec
008bba70	b 0x008bbc9c
008bba74	adrp x8,0xd1f000
008bba78	add x8,x8,#0x1e0
008bba7c	adrp x19,0xd1f000
008bba80	ldarb w8,[x8]
008bba84	tbz w8,#0x0,0x008bbc50
008bba88	ldr x8,[x19, #0x1d8]
008bba8c	b 0x008bbb38
008bba90	adrp x8,0xd1f000
008bba94	add x8,x8,#0x1e0
008bba98	ldarb w8,[x8]
008bba9c	tbnz w8,#0x0,0x008bbb30
008bbaa0	adrp x0,0xd1f000
008bbaa4	add x0,x0,#0x1e0
008bbaa8	bl 0x00c2fe90
008bbaac	cbz w0,0x008bbb30
008bbab0	adrp x8,0xcca000
008bbab4	ldr x0,[x8, #0x8c8]
008bbab8	bl 0x007fe1ec
008bbabc	b 0x008bbc9c
008bbac0	adrp x8,0xd1f000
008bbac4	add x8,x8,#0x1e0
008bbac8	ldarb w8,[x8]
008bbacc	tbnz w8,#0x0,0x008bbb30
008bbad0	adrp x0,0xd1f000
008bbad4	add x0,x0,#0x1e0
008bbad8	bl 0x00c2fe90
008bbadc	cbz w0,0x008bbb30
008bbae0	adrp x8,0xcca000
008bbae4	ldr x0,[x8, #0x8c8]
008bbae8	bl 0x007fe1ec
008bbaec	b 0x008bbc9c
008bbaf0	adrp x8,0xd1f000
008bbaf4	add x8,x8,#0x1e0
008bbaf8	ldarb w8,[x8]
008bbafc	tbnz w8,#0x0,0x008bbb30
008bbb00	adrp x0,0xd1f000
008bbb04	add x0,x0,#0x1e0
008bbb08	bl 0x00c2fe90
008bbb0c	cbz w0,0x008bbb30
008bbb10	adrp x8,0xcca000
008bbb14	ldr x0,[x8, #0x8c8]
008bbb18	bl 0x007fe1ec
008bbb1c	b 0x008bbc9c
008bbb20	adrp x8,0xd1f000
008bbb24	add x8,x8,#0x1e0
008bbb28	ldarb w8,[x8]
008bbb2c	tbz w8,#0x0,0x008bbc80
008bbb30	adrp x8,0xd1f000
008bbb34	ldr x8,[x8, #0x1d8]
008bbb38	add x8,x8,#0x7f2, LSL #12
008bbb3c	add x0,x8,#0xef0
008bbb40	ldr x19,[sp, #0x10]
008bbb44	ldp x29,x30,[sp], #0x20
008bbb48	ret
008bbb4c	fmov x8,d0
008bbb50	mov w10,#0xe995
008bbb54	movk w10,#0x5bd1, LSL #16
008bbb58	ubfx x9,x8,#0x20,#0x1f
008bbb5c	eor w8,w8,w9, LSR #0x12
008bbb60	mul w8,w8,w10
008bbb64	eor w9,w9,w8, LSR #0x16
008bbb68	mul w9,w9,w10
008bbb6c	eor w8,w8,w9, LSR #0x11
008bbb70	mul w8,w8,w10
008bbb74	eor w8,w9,w8, LSR #0x13
008bbb78	ldrb w9,[x0, #0x5]
008bbb7c	mul w8,w8,w10
008bbb80	mov w10,#0xffffffff
008bbb84	lsl w9,w10,w9
008bbb88	ldr x10,[x0, #0x28]
008bbb8c	bic w8,w8,w9
008bbb90	add x0,x10,x8, LSL #0x5
008bbb94	ldr w8,[x0, #0x1c]
008bbb98	and w9,w8,#0xf
008bbb9c	cmp w9,#0x3
008bbba0	b.ne 0x008bbbb0
008bbba4	ldr d1,[x0, #0x10]
008bbba8	fcmp d1,d0
008bbbac	b.eq 0x008bbb40
008bbbb0	cmp w8,#0x10
008bbbb4	b.cc 0x008bbc3c
008bbbb8	sbfx x8,x8,#0x4,#0x1c
008bbbbc	add x0,x0,x8, LSL #0x5
008bbbc0	b 0x008bbb94
008bbbc4	fmov x8,d0
008bbbc8	mov w10,#0xe995
008bbbcc	movk w10,#0x5bd1, LSL #16
008bbbd0	ubfx x9,x8,#0x20,#0x1f
008bbbd4	eor w8,w8,w9, LSR #0x12
008bbbd8	mul w8,w8,w10
008bbbdc	eor w9,w9,w8, LSR #0x16
008bbbe0	mul w9,w9,w10
008bbbe4	eor w8,w8,w9, LSR #0x11
008bbbe8	mul w8,w8,w10
008bbbec	eor w8,w9,w8, LSR #0x13
008bbbf0	ldrb w9,[x0, #0x5]
008bbbf4	mul w8,w8,w10
008bbbf8	mov w10,#0xffffffff
008bbbfc	lsl w9,w10,w9
008bbc00	ldr x10,[x0, #0x28]
008bbc04	bic w8,w8,w9
008bbc08	add x0,x10,x8, LSL #0x5
008bbc0c	ldr w8,[x0, #0x1c]
008bbc10	and w9,w8,#0xf
008bbc14	cmp w9,#0x3
008bbc18	b.ne 0x008bbc28
008bbc1c	ldr d1,[x0, #0x10]
008bbc20	fcmp d1,d0
008bbc24	b.eq 0x008bbb40
008bbc28	cmp w8,#0x10
008bbc2c	b.cc 0x008bbc3c
008bbc30	sbfx x8,x8,#0x4,#0x1c
008bbc34	add x0,x0,x8, LSL #0x5
008bbc38	b 0x008bbc0c
008bbc3c	mov w0,#0x2ef0
008bbc40	movk w0,#0x7f, LSL #16
008bbc44	ldr x19,[sp, #0x10]
008bbc48	ldp x29,x30,[sp], #0x20
008bbc4c	b 0x008bb3b0
008bbc50	adrp x0,0xd1f000
008bbc54	add x0,x0,#0x1e0
008bbc58	bl 0x00c2fe90
008bbc5c	cbz w0,0x008bba88
008bbc60	adrp x8,0xcca000
008bbc64	ldr x0,[x8, #0x8c8]
008bbc68	bl 0x007fe1ec
008bbc6c	str x0,[x19, #0x1d8]
008bbc70	adrp x0,0xd1f000
008bbc74	add x0,x0,#0x1e0
008bbc78	bl 0x00c2fea0
008bbc7c	b 0x008bba88
008bbc80	adrp x0,0xd1f000
008bbc84	add x0,x0,#0x1e0
008bbc88	bl 0x00c2fe90
008bbc8c	cbz w0,0x008bbb30
008bbc90	adrp x8,0xcca000
008bbc94	ldr x0,[x8, #0x8c8]
008bbc98	bl 0x007fe1ec
008bbc9c	adrp x8,0xd1f000
008bbca0	str x0,[x8, #0x1d8]
008bbca4	adrp x0,0xd1f000
008bbca8	add x0,x0,#0x1e0
008bbcac	bl 0x00c2fea0
008bbcb0	b 0x008bbb30
