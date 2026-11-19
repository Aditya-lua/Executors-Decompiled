; FUN_00bbb0e8 @ 00bbb0e8
00bbb0e8	stp x29,x30,[sp, #-0x60]!
00bbb0ec	stp x28,x27,[sp, #0x10]
00bbb0f0	stp x26,x25,[sp, #0x20]
00bbb0f4	stp x24,x23,[sp, #0x30]
00bbb0f8	stp x22,x21,[sp, #0x40]
00bbb0fc	stp x20,x19,[sp, #0x50]
00bbb100	mov x29,sp
00bbb104	sub sp,sp,#0x210
00bbb108	mrs x20,tpidr_el0
00bbb10c	mov w9,#0x683c
00bbb110	mov x26,x3
00bbb114	ldr x8,[x20, #0x28]
00bbb118	add x22,x0,x9
00bbb11c	mov x28,x0
00bbb120	mov x24,x1
00bbb124	stur x8,[x29, #-0x10]
00bbb128	ldr w8,[x22, #0xe64]
00bbb12c	cmp w8,#0x1
00bbb130	b.ne 0x00bbb13c
00bbb134	ldr x23,[x28, #0x7690]
00bbb138	b 0x00bbb144
00bbb13c	bic x9,x2,x2, ASR #0x3f
00bbb140	add x23,x24,x9
00bbb144	ldr x1,[x28, #0x75a8]
00bbb148	ldr x14,[x28, #0x7698]
00bbb14c	stur x1,[x29, #-0xf0]
00bbb150	cbz w5,0x00bbb1b8
00bbb154	ldr x9,[x28, #0x74d8]
00bbb158	ldr x8,[x28, #0x74d0]
00bbb15c	cmp w5,#0x8
00bbb160	ldr x6,[x28, #0x74c8]
00bbb164	str x9,[sp, #0x108]
00bbb168	mov w9,#0x8
00bbb16c	str x8,[sp, #0xb0]
00bbb170	mov w8,#0x1
00bbb174	csel w17,w5,w9,lt
00bbb178	str w8,[x22, #0xcf8]
00bbb17c	cbz x4,0x00bbb318
00bbb180	ldp w7,w25,[x22]
00bbb184	ldr w0,[x22, #0x8]
00bbb188	subs x10,x4,#0x8
00bbb18c	b.cc 0x00bbb210
00bbb190	ldr x9,[x26, x10#0x0]
00bbb194	lsr x8,x9,#0x38
00bbb198	cbz x8,0x00bbb318
00bbb19c	cmn x4,#0x78
00bbb1a0	b.hi 0x00bbb318
00bbb1a4	clz w8,w8
00bbb1a8	mov w11,#0x8
00bbb1ac	eor w8,w8,#0x1f
00bbb1b0	sub w11,w11,w8
00bbb1b4	b 0x00bbb2b4
00bbb1b8	mov x21,x24
00bbb1bc	cmp w8,#0x2
00bbb1c0	b.ne 0x00bbb1f8
00bbb1c4	sub x19,x14,x1
00bbb1c8	sub x8,x23,x21
00bbb1cc	cmp x19,x8
00bbb1d0	b.hi 0x00bbb208
00bbb1d4	cbz x21,0x00bbb1e8
00bbb1d8	mov x0,x21
00bbb1dc	mov x2,x19
00bbb1e0	bl 0x00c2ff60
00bbb1e4	add x21,x21,x19
00bbb1e8	mov w8,#0x76a4
00bbb1ec	add x9,x28,#0x17, LSL #12
00bbb1f0	add x1,x28,x8
00bbb1f4	add x14,x9,#0x6a4
00bbb1f8	sub x19,x14,x1
00bbb1fc	sub x8,x23,x21
00bbb200	cmp x19,x8
00bbb204	b.ls 0x00bbb238
00bbb208	mov x0,#-0x46
00bbb20c	b 0x00bbd584
00bbb210	ldrb w9,[x26]
00bbb214	cmp x4,#0x4
00bbb218	b.gt 0x00bbb250
00bbb21c	cmp x4,#0x2
00bbb220	b.eq 0x00bbb290
00bbb224	cmp x4,#0x3
00bbb228	b.eq 0x00bbb288
00bbb22c	cmp x4,#0x4
00bbb230	b.eq 0x00bbb280
00bbb234	b 0x00bbb298
00bbb238	cbz x21,0x00bbb3b4
00bbb23c	mov x0,x21
00bbb240	mov x2,x19
00bbb244	bl 0x00c2ff60
00bbb248	add x8,x21,x19
00bbb24c	b 0x00bbb3b8
00bbb250	cmp x4,#0x5
00bbb254	b.eq 0x00bbb278
00bbb258	cmp x4,#0x6
00bbb25c	b.eq 0x00bbb270
00bbb260	cmp x4,#0x7
00bbb264	b.ne 0x00bbb298
00bbb268	ldrb w8,[x26, #0x6]
00bbb26c	orr x9,x9,x8, LSL #0x30
00bbb270	ldrb w8,[x26, #0x5]
00bbb274	add x9,x9,x8, LSL #0x28
00bbb278	ldrb w8,[x26, #0x4]
00bbb27c	add x9,x9,x8, LSL #0x20
00bbb280	ldrb w8,[x26, #0x3]
00bbb284	add x9,x9,x8, LSL #0x18
00bbb288	ldrb w8,[x26, #0x2]
00bbb28c	add x9,x9,x8, LSL #0x10
00bbb290	ldrb w8,[x26, #0x1]
00bbb294	add x9,x9,x8, LSL #0x8
00bbb298	add x8,x26,x4
00bbb29c	ldurb w8,[x8, #-0x1]
00bbb2a0	cbz w8,0x00bbb318
00bbb2a4	clz w8,w8
00bbb2a8	mov x10,xzr
00bbb2ac	sub w8,w8,w4, LSL #0x3
00bbb2b0	add w11,w8,#0x29
00bbb2b4	ldr x8,[x28]
00bbb2b8	adrp x19,0x789000
00bbb2bc	add x19,x19,#0xa30
00bbb2c0	mov x2,x14
00bbb2c4	ldr w13,[x8, #0x4]
00bbb2c8	add w12,w13,w11
00bbb2cc	ldr w11,[x19, x13, LSL #0x2]
00bbb2d0	cmp w12,#0x40
00bbb2d4	neg w13,w12
00bbb2d8	b.hi 0x00bbd600
00bbb2dc	cmp x10,#0x8
00bbb2e0	add x14,x26,x10
00bbb2e4	b.ge 0x00bbb320
00bbb2e8	mov x16,x26
00bbb2ec	mov x4,x9
00bbb2f0	cbz x10,0x00bbb334
00bbb2f4	lsr w15,w12,#0x3
00bbb2f8	sub x16,x14,x15
00bbb2fc	cmp x16,x26
00bbb300	csel w10,w10,w15,cc
00bbb304	sub x14,x14,x10
00bbb308	sub w12,w12,w10, LSL #0x3
00bbb30c	ldr x4,[x14]
00bbb310	mov x16,x14
00bbb314	b 0x00bbb334
00bbb318	mov x0,#-0x14
00bbb31c	b 0x00bbd584
00bbb320	lsr w10,w12,#0x3
00bbb324	and w12,w12,#0x7
00bbb328	sub x10,x14,x10
00bbb32c	ldr x4,[x10]
00bbb330	mov x16,x10
00bbb334	ldr x10,[x28, #0x10]
00bbb338	stp x20,x17,[sp, #0x38]
00bbb33c	str x23,[sp, #0x48]
00bbb340	ldr w14,[x10, #0x4]
00bbb344	add w15,w14,w12
00bbb348	lsr x12,x9,x13
00bbb34c	ldr w14,[x19, x14, LSL #0x2]
00bbb350	neg w9,w15
00bbb354	cmp w15,#0x40
00bbb358	lsr x13,x4,x9
00bbb35c	add x9,x26,#0x8
00bbb360	str x9,[sp, #0x78]
00bbb364	b.hi 0x00bbd610
00bbb368	mov x1,x16
00bbb36c	cmp x16,x9
00bbb370	b.cs 0x00bbb3a0
00bbb374	cmp x1,x26
00bbb378	b.eq 0x00bbb3c0
00bbb37c	lsr w9,w15,#0x3
00bbb380	sub w17,w1,w26
00bbb384	sub x16,x1,x9
00bbb388	cmp x16,x26
00bbb38c	csel w9,w17,w9,cc
00bbb390	sub x20,x1,x9
00bbb394	sub w15,w15,w9, LSL #0x3
00bbb398	ldr x4,[x20]
00bbb39c	b 0x00bbb3c4
00bbb3a0	lsr w9,w15,#0x3
00bbb3a4	and w15,w15,#0x7
00bbb3a8	sub x20,x1,x9
00bbb3ac	ldr x4,[x20]
00bbb3b0	b 0x00bbb3c4
00bbb3b4	mov x8,xzr
00bbb3b8	sub x0,x8,x24
00bbb3bc	b 0x00bbd584
00bbb3c0	mov x20,x1
00bbb3c4	ldr x9,[x28, #0x8]
00bbb3c8	and x11,x12,x11
00bbb3cc	ldr x30,[sp, #0x78]
00bbb3d0	sub x3,x24,x6
00bbb3d4	stur x11,[x29, #-0xf8]
00bbb3d8	and x17,x13,x14
00bbb3dc	ldr w16,[x9, #0x4]
00bbb3e0	str x0,[sp, #0xe8]
00bbb3e4	add w27,w16,w15
00bbb3e8	ldr w16,[x19, x16, LSL #0x2]
00bbb3ec	neg w15,w27
00bbb3f0	cmp w27,#0x40
00bbb3f4	lsr x15,x4,x15
00bbb3f8	and x11,x15,x16
00bbb3fc	stur x11,[x29, #-0x100]
00bbb400	b.hi 0x00bbd61c
00bbb404	cmp x20,x30
00bbb408	mov x15,x2
00bbb40c	b.cs 0x00bbb438
00bbb410	cmp x20,x26
00bbb414	b.eq 0x00bbb448
00bbb418	lsr w11,w27,#0x3
00bbb41c	sub w13,w20,w26
00bbb420	sub x12,x20,x11
00bbb424	cmp x12,x26
00bbb428	csel w11,w13,w11,cc
00bbb42c	sub x20,x20,x11
00bbb430	sub w27,w27,w11, LSL #0x3
00bbb434	b 0x00bbb444
00bbb438	lsr w11,w27,#0x3
00bbb43c	and w27,w27,#0x7
00bbb440	sub x20,x20,x11
00bbb444	ldr x4,[x20]
00bbb448	add x8,x8,#0x8
00bbb44c	subs w11,w5,#0x1
00bbb450	str x24,[sp, #0x28]
00bbb454	str x8,[sp, #0x100]
00bbb458	add x8,x10,#0x8
00bbb45c	str x8,[sp, #0xf8]
00bbb460	add x8,x9,#0x8
00bbb464	str x8,[sp, #0xf0]
00bbb468	str x11,[sp, #0x70]
00bbb46c	b.lt 0x00bbb718
00bbb470	sub x9,x29,#0xd0
00bbb474	mov x10,x11
00bbb478	ldr x11,[sp, #0x40]
00bbb47c	add x9,x9,#0x10
00bbb480	mov w16,w27
00bbb484	str x15,[sp, #0x68]
00bbb488	b 0x00bbb4c8
00bbb48c	mov x17,x23
00bbb490	add x14,x12,x21
00bbb494	ldr x8,[sp, #0x108]
00bbb498	sub x11,x11,#0x1
00bbb49c	cmp x7,x14
00bbb4a0	add x3,x14,x13
00bbb4a4	sub x10,x10,#0x1
00bbb4a8	csel x15,x8,x6,hi
00bbb4ac	add x15,x15,x14
00bbb4b0	sub x15,x15,x7
00bbb4b4	prfm PLDL1KEEP,[x15]
00bbb4b8	prfm PLDL1KEEP,[x15, #0x40]
00bbb4bc	stp x12,x13,[x9, #-0x10]
00bbb4c0	str x7,[x9], #0x18
00bbb4c4	cbz x11,0x00bbb708
00bbb4c8	ldr x8,[sp, #0xf8]
00bbb4cc	ldur x12,[x29, #-0xf8]
00bbb4d0	mov x23,x17
00bbb4d4	add x14,x8,x17, LSL #0x3
00bbb4d8	ldr x8,[sp, #0x100]
00bbb4dc	add x15,x8,x12, LSL #0x3
00bbb4e0	ldrb w0,[x14, #0x2]
00bbb4e4	ldr w13,[x14, #0x4]
00bbb4e8	ldr w12,[x15, #0x4]
00bbb4ec	cmp w0,#0x2
00bbb4f0	b.cc 0x00bbb51c
00bbb4f4	lsl x17,x4,x16
00bbb4f8	neg w1,w0
00bbb4fc	add w27,w16,w0
00bbb500	str x25,[sp, #0xe8]
00bbb504	mov x25,x7
00bbb508	mov w16,w27
00bbb50c	lsr x17,x17,x1
00bbb510	add x13,x17,x13
00bbb514	mov x7,x13
00bbb518	b 0x00bbb530
00bbb51c	cmp w12,#0x0
00bbb520	cbnz w0,0x00bbb694
00bbb524	csel x13,x7,x25,eq
00bbb528	csel x7,x25,x7,eq
00bbb52c	mov x25,x13
00bbb530	ldr x8,[sp, #0xf0]
00bbb534	ldur x13,[x29, #-0x100]
00bbb538	mov x21,x3
00bbb53c	add x17,x8,x13, LSL #0x3
00bbb540	ldrb w2,[x17, #0x2]
00bbb544	ldr w13,[x17, #0x4]
00bbb548	cbz w2,0x00bbb568
00bbb54c	lsl x1,x4,x16
00bbb550	neg w3,w2
00bbb554	add w27,w16,w2
00bbb558	mov w16,w27
00bbb55c	lsr x1,x1,x3
00bbb560	add x13,x1,x13
00bbb564	b 0x00bbb568
00bbb568	ldrb w1,[x15, #0x2]
00bbb56c	add w2,w2,w1
00bbb570	add w0,w2,w0
00bbb574	and w0,w0,#0xff
00bbb578	cmp w0,#0x1f
00bbb57c	b.cs 0x00bbb654
00bbb580	cbz w1,0x00bbb59c
00bbb584	lsl x0,x4,x16
00bbb588	neg w2,w1
00bbb58c	add w27,w16,w1
00bbb590	mov w16,w27
00bbb594	lsr x0,x0,x2
00bbb598	add x12,x0,x12
00bbb59c	cbz x10,0x00bbb48c
00bbb5a0	ldrb w0,[x15, #0x3]
00bbb5a4	ldrb w1,[x17, #0x3]
00bbb5a8	ldrb w2,[x14, #0x3]
00bbb5ac	ldrh w15,[x15]
00bbb5b0	ldrh w17,[x17]
00bbb5b4	ldrh w14,[x14]
00bbb5b8	add w16,w16,w0
00bbb5bc	ldr w0,[x19, w0, UXTW #0x2]
00bbb5c0	neg w3,w16
00bbb5c4	add w16,w16,w1
00bbb5c8	ldr w1,[x19, w1, UXTW #0x2]
00bbb5cc	lsr x3,x4,x3
00bbb5d0	add w27,w16,w2
00bbb5d4	neg w8,w16
00bbb5d8	lsr x16,x4,x8
00bbb5dc	ldr w2,[x19, w2, UXTW #0x2]
00bbb5e0	cmp w27,#0x40
00bbb5e4	and x0,x3,x0
00bbb5e8	neg w3,w27
00bbb5ec	lsr x3,x4,x3
00bbb5f0	and x16,x16,x1
00bbb5f4	add x8,x0,x15
00bbb5f8	stur x8,[x29, #-0xf8]
00bbb5fc	add x8,x16,x17
00bbb600	and x1,x3,x2
00bbb604	stur x8,[x29, #-0x100]
00bbb608	add x17,x1,x14
00bbb60c	b.hi 0x00bbb688
00bbb610	cmp x20,x30
00bbb614	b.cs 0x00bbb63c
00bbb618	cmp x20,x26
00bbb61c	b.eq 0x00bbb64c
00bbb620	lsr w14,w27,#0x3
00bbb624	sub w16,w20,w26
00bbb628	sub x15,x20,x14
00bbb62c	cmp x15,x26
00bbb630	csel w14,w16,w14,cc
00bbb634	sub w27,w27,w14, LSL #0x3
00bbb638	b 0x00bbb644
00bbb63c	lsr w14,w27,#0x3
00bbb640	and w27,w27,#0x7
00bbb644	sub x20,x20,x14
00bbb648	ldr x4,[x20]
00bbb64c	mov w16,w27
00bbb650	b 0x00bbb490
00bbb654	cmp w16,#0x40
00bbb658	b.hi 0x00bbb6fc
00bbb65c	cmp x20,x30
00bbb660	b.cs 0x00bbb6b8
00bbb664	cmp x20,x26
00bbb668	b.eq 0x00bbb580
00bbb66c	lsr w0,w16,#0x3
00bbb670	sub w3,w20,w26
00bbb674	sub x2,x20,x0
00bbb678	cmp x2,x26
00bbb67c	csel w0,w3,w0,cc
00bbb680	sub w27,w16,w0, LSL #0x3
00bbb684	b 0x00bbb6c0
00bbb688	adrp x20,0x789000
00bbb68c	add x20,x20,#0xab0
00bbb690	b 0x00bbb64c
00bbb694	lsl x17,x4,x16
00bbb698	cinc w13,w13,eq
00bbb69c	add x13,x13,x17, LSR #0x3f
00bbb6a0	cmp x13,#0x1
00bbb6a4	b.eq 0x00bbb6e4
00bbb6a8	cmp x13,#0x3
00bbb6ac	b.ne 0x00bbb6d0
00bbb6b0	sub x13,x7,#0x1
00bbb6b4	b 0x00bbb6dc
00bbb6b8	lsr w0,w16,#0x3
00bbb6bc	and w27,w16,#0x7
00bbb6c0	sub x20,x20,x0
00bbb6c4	ldr x4,[x20]
00bbb6c8	mov w16,w27
00bbb6cc	b 0x00bbb580
00bbb6d0	ldr x8,[sp, #0xe8]
00bbb6d4	cmp x13,#0x0
00bbb6d8	csel x13,x7,x8,eq
00bbb6dc	str x25,[sp, #0xe8]
00bbb6e0	mov x25,x13
00bbb6e4	cmp x25,#0x0
00bbb6e8	add w27,w16,#0x1
00bbb6ec	csinv x13,x25,xzr,ne
00bbb6f0	mov w16,w27
00bbb6f4	mov x25,x7
00bbb6f8	b 0x00bbb514
00bbb6fc	adrp x20,0x789000
00bbb700	add x20,x20,#0xab0
00bbb704	b 0x00bbb580
00bbb708	ldr x8,[sp, #0x40]
00bbb70c	ldr x15,[sp, #0x68]
00bbb710	mov w1,w8
00bbb714	b 0x00bbb71c
00bbb718	mov w1,wzr
00bbb71c	ldr x10,[sp, #0x70]
00bbb720	cmp w1,w5
00bbb724	str x28,[sp, #0x80]
00bbb728	stp x22,x6,[sp, #0xc0]
00bbb72c	str w5,[sp, #0xbc]
00bbb730	b.ge 0x00bbb788
00bbb734	ldr x8,[sp, #0x48]
00bbb738	add x11,x22,#0xe78
00bbb73c	add x9,x6,#0x10
00bbb740	ldr x21,[sp, #0x28]
00bbb744	stp x9,x11,[sp, #0x18]
00bbb748	add x9,x6,#0x18
00bbb74c	sub x8,x8,#0x20
00bbb750	mov w24,#0x18
00bbb754	sub x2,x29,#0xd0
00bbb758	str x8,[sp, #0x60]
00bbb75c	add x8,x22,#0xe68
00bbb760	mov x16,x30
00bbb764	str x8,[sp, #0x50]
00bbb768	add x8,x28,#0x17, LSL #12
00bbb76c	mov x5,x10
00bbb770	add x8,x8,#0x6a4
00bbb774	str x26,[sp, #0x88]
00bbb778	str x8,[sp, #0x30]
00bbb77c	add x8,x22,#0xe98
00bbb780	stp x9,x8,[sp, #0x8]
00bbb784	b 0x00bbb874
00bbb788	ldr x21,[sp, #0x28]
00bbb78c	b 0x00bbc958
00bbb790	stp x11,x19,[x29, #-0xe8]
00bbb794	mov x0,x21
00bbb798	mov w21,w1
00bbb79c	ldr x1,[sp, #0x48]
00bbb7a0	mov x5,x6
00bbb7a4	ldr x6,[sp, #0xb0]
00bbb7a8	mov x19,x7
00bbb7ac	ldr x7,[sp, #0x108]
00bbb7b0	sub x2,x29,#0xe8
00bbb7b4	str x3,[sp, #0xa8]
00bbb7b8	sub x3,x29,#0xf0
00bbb7bc	mov x4,x15
00bbb7c0	stur x26,[x29, #-0xd8]
00bbb7c4	mov x22,x17
00bbb7c8	mov x26,x15
00bbb7cc	mov x20,x16
00bbb7d0	mov x24,x23
00bbb7d4	mov x23,x30
00bbb7d8	bl 0x00bbf92c
00bbb7dc	ldr x5,[sp, #0x70]
00bbb7e0	ldr x3,[sp, #0xa8]
00bbb7e4	mov x30,x23
00bbb7e8	mov x23,x24
00bbb7ec	mov x16,x20
00bbb7f0	mov x15,x26
00bbb7f4	sub x2,x29,#0xd0
00bbb7f8	mov w1,w21
00bbb7fc	mov x17,x22
00bbb800	mov w24,#0x18
00bbb804	mov x7,x19
00bbb808	ldr x22,[sp, #0xc0]
00bbb80c	ldr x26,[sp, #0x88]
00bbb810	ldr x20,[sp, #0xe0]
00bbb814	cmn x0,#0x78
00bbb818	b.hi 0x00bbd580
00bbb81c	ldp x6,x4,[sp, #0xc8]
00bbb820	add x8,x30,x3
00bbb824	ldr x10,[sp, #0x108]
00bbb828	cmp x7,x8
00bbb82c	and w9,w1,#0x7
00bbb830	umaddl x9,w9,w24,x2
00bbb834	adrp x19,0x789000
00bbb838	add x19,x19,#0xa30
00bbb83c	csel x10,x10,x6,hi
00bbb840	add x10,x10,x8
00bbb844	sub x10,x10,x7
00bbb848	prfm PLDL1KEEP,[x10]
00bbb84c	prfm PLDL1KEEP,[x10, #0x40]
00bbb850	ldr x21,[sp, #0xd8]
00bbb854	stp x30,x23,[x9]
00bbb858	add x21,x21,x0
00bbb85c	str x7,[x9, #0x10]
00bbb860	ldr w9,[sp, #0xbc]
00bbb864	add w1,w1,#0x1
00bbb868	add x3,x8,x23
00bbb86c	cmp w1,w9
00bbb870	b.eq 0x00bbc950
00bbb874	ldp x8,x9,[sp, #0xf8]
00bbb878	ldur x10,[x29, #-0xf8]
00bbb87c	add x8,x8,x17, LSL #0x3
00bbb880	add x9,x9,x10, LSL #0x3
00bbb884	ldrb w11,[x8, #0x2]
00bbb888	ldr w30,[x9, #0x4]
00bbb88c	ldr w10,[x8, #0x4]
00bbb890	cmp w11,#0x2
00bbb894	b.cc 0x00bbb8bc
00bbb898	lsl x12,x4,x27
00bbb89c	neg w13,w11
00bbb8a0	str x25,[sp, #0xe8]
00bbb8a4	mov x25,x7
00bbb8a8	add w27,w27,w11
00bbb8ac	lsr x12,x12,x13
00bbb8b0	add x10,x12,x10
00bbb8b4	mov x7,x10
00bbb8b8	b 0x00bbb8d0
00bbb8bc	cmp w30,#0x0
00bbb8c0	cbnz w11,0x00bbc214
00bbb8c4	csel x10,x7,x25,eq
00bbb8c8	csel x7,x25,x7,eq
00bbb8cc	mov x25,x10
00bbb8d0	ldr x10,[sp, #0xf0]
00bbb8d4	ldur x12,[x29, #-0x100]
00bbb8d8	add x10,x10,x12, LSL #0x3
00bbb8dc	ldrb w13,[x10, #0x2]
00bbb8e0	ldr w23,[x10, #0x4]
00bbb8e4	cbz w13,0x00bbb900
00bbb8e8	lsl x12,x4,x27
00bbb8ec	neg w14,w13
00bbb8f0	add w27,w27,w13
00bbb8f4	lsr x12,x12,x14
00bbb8f8	add x23,x12,x23
00bbb8fc	b 0x00bbb900
00bbb900	ldrb w12,[x9, #0x2]
00bbb904	add w13,w13,w12
00bbb908	add w11,w13,w11
00bbb90c	and w11,w11,#0xff
00bbb910	cmp w11,#0x1f
00bbb914	b.cs 0x00bbc1d8
00bbb918	cbz w12,0x00bbb930
00bbb91c	lsl x11,x4,x27
00bbb920	neg w13,w12
00bbb924	add w27,w27,w12
00bbb928	lsr x11,x11,x13
00bbb92c	add x30,x11,x30
00bbb930	cmp w1,w5
00bbb934	b.ne 0x00bbb93c
00bbb938	b 0x00bbba1c
00bbb93c	ldrb w11,[x9, #0x3]
00bbb940	ldrb w12,[x10, #0x3]
00bbb944	mov x0,x15
00bbb948	ldrb w14,[x8, #0x3]
00bbb94c	mov x2,x5
00bbb950	mov x5,x23
00bbb954	add w13,w27,w11
00bbb958	ldr w11,[x19, w11, UXTW #0x2]
00bbb95c	mov x23,x30
00bbb960	neg w15,w13
00bbb964	add w13,w13,w12
00bbb968	mov x30,x16
00bbb96c	lsr x15,x4,x15
00bbb970	add w27,w13,w14
00bbb974	neg w16,w13
00bbb978	lsr x13,x4,x16
00bbb97c	ldr w12,[x19, w12, UXTW #0x2]
00bbb980	ldr w14,[x19, w14, UXTW #0x2]
00bbb984	and x11,x15,x11
00bbb988	neg w15,w27
00bbb98c	ldrh w9,[x9]
00bbb990	lsr x15,x4,x15
00bbb994	ldrh w10,[x10]
00bbb998	ldrh w8,[x8]
00bbb99c	and x12,x13,x12
00bbb9a0	add x9,x11,x9
00bbb9a4	cmp w27,#0x40
00bbb9a8	and x13,x15,x14
00bbb9ac	stur x9,[x29, #-0xf8]
00bbb9b0	add x9,x12,x10
00bbb9b4	add x17,x13,x8
00bbb9b8	stur x9,[x29, #-0x100]
00bbb9bc	b.hi 0x00bbc238
00bbb9c0	mov x16,x30
00bbb9c4	cmp x20,x30
00bbb9c8	mov x15,x0
00bbb9cc	b.cs 0x00bbb9fc
00bbb9d0	cmp x20,x26
00bbb9d4	mov x30,x23
00bbb9d8	b.eq 0x00bbba10
00bbb9dc	lsr w8,w27,#0x3
00bbb9e0	sub w10,w20,w26
00bbb9e4	sub x9,x20,x8
00bbb9e8	cmp x9,x26
00bbb9ec	csel w8,w10,w8,cc
00bbb9f0	sub x20,x20,x8
00bbb9f4	sub w27,w27,w8, LSL #0x3
00bbb9f8	b 0x00bbba0c
00bbb9fc	lsr w8,w27,#0x3
00bbba00	and w27,w27,#0x7
00bbba04	mov x30,x23
00bbba08	sub x20,x20,x8
00bbba0c	ldr x4,[x20]
00bbba10	mov x23,x5
00bbba14	mov x5,x2
00bbba18	sub x2,x29,#0xd0
00bbba1c	ldr w8,[x22, #0xe64]
00bbba20	str x4,[sp, #0xd0]
00bbba24	str x20,[sp, #0xe0]
00bbba28	cmp w8,#0x2
00bbba2c	and w8,w1,#0x7
00bbba30	b.ne 0x00bbbad8
00bbba34	umaddl x13,w8,w24,x2
00bbba38	ldur x10,[x29, #-0xf0]
00bbba3c	ldr x12,[x28, #0x7698]
00bbba40	ldr x11,[x13]
00bbba44	add x8,x10,x11
00bbba48	cmp x8,x12
00bbba4c	b.ls 0x00bbbbd0
00bbba50	subs x8,x12,x10
00bbba54	str x13,[sp, #0x68]
00bbba58	b.eq 0x00bbbfd0
00bbba5c	ldr x9,[sp, #0x48]
00bbba60	sub x9,x9,x21
00bbba64	cmp x8,x9
00bbba68	b.hi 0x00bbd5e8
00bbba6c	sub x13,x21,x10
00bbba70	add x9,x21,x8
00bbba74	cmn x13,#0x8
00bbba78	b.gt 0x00bbbdc0
00bbba7c	cmp x8,#0x7
00bbba80	b.ls 0x00bbbdc0
00bbba84	cmn x13,#0x11
00bbba88	b.hi 0x00bbbe50
00bbba8c	sub x11,x9,#0x20
00bbba90	cmp x21,x11
00bbba94	b.hi 0x00bbbe50
00bbba98	sub x12,x11,x21
00bbba9c	ldr q0,[x10]
00bbbaa0	cmp x12,#0x11
00bbbaa4	str q0,[x21]
00bbbaa8	b.cc 0x00bbbad0
00bbbaac	add x13,x21,#0x10
00bbbab0	add x14,x10,#0x20
00bbbab4	ldur q0,[x14, #-0x10]
00bbbab8	str q0,[x13]
00bbbabc	ldr q0,[x14], #0x20
00bbbac0	str q0,[x13, #0x10]
00bbbac4	add x13,x13,#0x20
00bbbac8	cmp x13,x11
00bbbacc	b.cc 0x00bbbab4
00bbbad0	add x10,x10,x12
00bbbad4	b 0x00bbbe54
00bbbad8	umaddl x8,w8,w24,x2
00bbbadc	ldur x10,[x29, #-0xf0]
00bbbae0	ldp x11,x19,[x8]
00bbbae4	ldr x26,[x8, #0x10]
00bbbae8	add x20,x21,x11
00bbbaec	add x9,x10,x11
00bbbaf0	sub x8,x20,x26
00bbbaf4	cmp x9,x15
00bbbaf8	prfm PLDL1KEEP,[x8]
00bbbafc	str x21,[sp, #0xd8]
00bbbb00	b.hi 0x00bbb790
00bbbb04	add x0,x19,x11
00bbbb08	ldr x13,[sp, #0x60]
00bbbb0c	add x12,x21,x0
00bbbb10	cmp x12,x13
00bbbb14	b.hi 0x00bbb790
00bbbb18	ldr q0,[x10]
00bbbb1c	subs x11,x11,#0x10
00bbbb20	str q0,[x21]
00bbbb24	b.hi 0x00bbc2e8
00bbbb28	sub x4,x20,x6
00bbbb2c	stur x9,[x29, #-0xf0]
00bbbb30	cmp x26,x4
00bbbb34	b.ls 0x00bbbcb4
00bbbb38	ldr x9,[sp, #0xb0]
00bbbb3c	sub x9,x20,x9
00bbbb40	cmp x26,x9
00bbbb44	b.hi 0x00bbd5f4
00bbbb48	ldr x9,[sp, #0x108]
00bbbb4c	sub x28,x8,x6
00bbbb50	str w1,[sp, #0x58]
00bbbb54	str x23,[sp, #0x68]
00bbbb58	mov x24,x15
00bbbb5c	mov x23,x25
00bbbb60	add x1,x9,x28
00bbbb64	mov x25,x7
00bbbb68	stp x30,x0,[sp, #0x90]
00bbbb6c	add x8,x1,x19
00bbbb70	stp x17,x3,[sp, #0xa0]
00bbbb74	cmp x8,x9
00bbbb78	b.ls 0x00bbbd30
00bbbb7c	neg x2,x28
00bbbb80	mov x0,x20
00bbbb84	mov x22,x6
00bbbb88	mov x21,x4
00bbbb8c	bl 0x00c2ff60
00bbbb90	sub x20,x20,x28
00bbbb94	add x12,x28,x19
00bbbb98	mov x7,x25
00bbbb9c	ldp x16,x28,[sp, #0x78]
00bbbba0	mov x25,x23
00bbbba4	ldp x17,x3,[sp, #0xa0]
00bbbba8	ldr w1,[sp, #0x58]
00bbbbac	ldp x23,x5,[sp, #0x68]
00bbbbb0	mov x4,x21
00bbbbb4	ldp x30,x0,[sp, #0x90]
00bbbbb8	mov x8,x22
00bbbbbc	mov x6,x22
00bbbbc0	mov x15,x24
00bbbbc4	mov w24,#0x18
00bbbbc8	sub x2,x29,#0xd0
00bbbbcc	b 0x00bbbcb8
00bbbbd0	ldp x20,x26,[x13, #0x8]
00bbbbd4	cmp x8,x15
00bbbbd8	sub x2,x8,#0x20
00bbbbdc	str x21,[sp, #0xd8]
00bbbbe0	b.hi 0x00bbc250
00bbbbe4	add x0,x20,x11
00bbbbe8	add x9,x21,x0
00bbbbec	cmp x9,x2
00bbbbf0	b.hi 0x00bbc250
00bbbbf4	ldr q0,[x10]
00bbbbf8	subs x9,x11,#0x10
00bbbbfc	add x19,x21,x11
00bbbc00	str q0,[x21]
00bbbc04	b.hi 0x00bbc400
00bbbc08	sub x10,x19,x6
00bbbc0c	sub x9,x19,x26
00bbbc10	sub x2,x29,#0xd0
00bbbc14	cmp x26,x10
00bbbc18	stur x8,[x29, #-0xf0]
00bbbc1c	b.ls 0x00bbbd04
00bbbc20	ldr x8,[sp, #0xb0]
00bbbc24	sub x8,x19,x8
00bbbc28	cmp x26,x8
00bbbc2c	b.hi 0x00bbd5f4
00bbbc30	sub x28,x9,x6
00bbbc34	ldr x9,[sp, #0x108]
00bbbc38	mov x24,x23
00bbbc3c	mov x23,x25
00bbbc40	mov w25,w1
00bbbc44	stp x30,x0,[sp, #0x90]
00bbbc48	add x1,x9,x28
00bbbc4c	str x15,[sp, #0x68]
00bbbc50	add x8,x1,x20
00bbbc54	stp x17,x3,[sp, #0xa0]
00bbbc58	cmp x8,x9
00bbbc5c	str x7,[sp, #0x58]
00bbbc60	b.ls 0x00bbbdf8
00bbbc64	neg x2,x28
00bbbc68	mov x0,x19
00bbbc6c	mov x22,x6
00bbbc70	mov x21,x10
00bbbc74	bl 0x00c2ff60
00bbbc78	ldp x17,x3,[sp, #0xa0]
00bbbc7c	sub x19,x19,x28
00bbbc80	ldp x15,x5,[sp, #0x68]
00bbbc84	add x12,x28,x20
00bbbc88	ldp x30,x0,[sp, #0x90]
00bbbc8c	mov x10,x21
00bbbc90	ldr x28,[sp, #0x80]
00bbbc94	ldr x7,[sp, #0x58]
00bbbc98	mov x9,x22
00bbbc9c	mov w1,w25
00bbbca0	mov x25,x23
00bbbca4	sub x2,x29,#0xd0
00bbbca8	mov x23,x24
00bbbcac	mov w24,#0x18
00bbbcb0	b 0x00bbbd08
00bbbcb4	mov x12,x19
00bbbcb8	cmp x26,#0x10
00bbbcbc	b.cc 0x00bbc3ac
00bbbcc0	ldr q0,[x8]
00bbbcc4	cmp x12,#0x11
00bbbcc8	str q0,[x20]
00bbbccc	b.cc 0x00bbb808
00bbbcd0	ldr x22,[sp, #0xc0]
00bbbcd4	ldr x26,[sp, #0x88]
00bbbcd8	add x9,x20,x12
00bbbcdc	add x10,x20,#0x10
00bbbce0	add x8,x8,#0x20
00bbbce4	ldur q0,[x8, #-0x10]
00bbbce8	str q0,[x10]
00bbbcec	ldr q0,[x8], #0x20
00bbbcf0	str q0,[x10, #0x10]
00bbbcf4	add x10,x10,#0x20
00bbbcf8	cmp x10,x9
00bbbcfc	b.cc 0x00bbbce4
00bbbd00	b 0x00bbb810
00bbbd04	mov x12,x20
00bbbd08	cmp x26,#0x10
00bbbd0c	b.cc 0x00bbc474
00bbbd10	ldr q0,[x9]
00bbbd14	cmp x12,#0x11
00bbbd18	str q0,[x19]
00bbbd1c	b.cs 0x00bbbd7c
00bbbd20	ldr x22,[sp, #0xc0]
00bbbd24	ldr x26,[sp, #0x88]
00bbbd28	ldr x20,[sp, #0xe0]
00bbbd2c	b 0x00bbbdb0
00bbbd30	mov x0,x20
00bbbd34	mov x2,x19
00bbbd38	bl 0x00c2ff60
00bbbd3c	ldp x28,x26,[sp, #0x80]
00bbbd40	mov x7,x25
00bbbd44	ldp x5,x16,[sp, #0x70]
00bbbd48	mov x25,x23
00bbbd4c	ldp x17,x3,[sp, #0xa0]
00bbbd50	mov x15,x24
00bbbd54	ldp x30,x0,[sp, #0x90]
00bbbd58	mov w24,#0x18
00bbbd5c	ldr x22,[sp, #0xc0]
00bbbd60	ldr x20,[sp, #0xe0]
00bbbd64	sub x2,x29,#0xd0
00bbbd68	ldr w1,[sp, #0x58]
00bbbd6c	ldr x23,[sp, #0x68]
00bbbd70	cmn x0,#0x78
00bbbd74	b.ls 0x00bbb81c
00bbbd78	b 0x00bbd580
00bbbd7c	ldr x22,[sp, #0xc0]
00bbbd80	ldr x26,[sp, #0x88]
00bbbd84	add x8,x19,x12
00bbbd88	ldr x20,[sp, #0xe0]
00bbbd8c	add x10,x19,#0x10
00bbbd90	add x9,x9,#0x20
00bbbd94	ldur q0,[x9, #-0x10]
00bbbd98	str q0,[x10]
00bbbd9c	ldr q0,[x9], #0x20
00bbbda0	str q0,[x10, #0x10]
00bbbda4	add x10,x10,#0x20
00bbbda8	cmp x10,x8
00bbbdac	b.cc 0x00bbbd94
00bbbdb0	ldr x16,[sp, #0x78]
00bbbdb4	cmn x0,#0x78
00bbbdb8	b.ls 0x00bbb81c
00bbbdbc	b 0x00bbd580
00bbbdc0	add x11,x21,x12
00bbbdc4	add x12,x21,#0x1
00bbbdc8	sub x11,x11,x10
00bbbdcc	cmp x11,x12
00bbbdd0	csinc x11,x11,x21,hi
00bbbdd4	sub x11,x11,x21
00bbbdd8	cmp x11,#0x8
00bbbddc	b.cc 0x00bbbe44
00bbbde0	cmp x13,#0x20
00bbbde4	b.cc 0x00bbbe44
00bbbde8	cmp x11,#0x20
00bbbdec	b.cs 0x00bbbe90
00bbbdf0	mov x14,xzr
00bbbdf4	b 0x00bbbec8
00bbbdf8	mov x0,x19
00bbbdfc	mov x2,x20
00bbbe00	bl 0x00c2ff60
00bbbe04	ldp x28,x26,[sp, #0x80]
00bbbe08	mov w1,w25
00bbbe0c	ldp x5,x16,[sp, #0x70]
00bbbe10	mov x25,x23
00bbbe14	ldp x17,x3,[sp, #0xa0]
00bbbe18	sub x2,x29,#0xd0
00bbbe1c	ldp x30,x0,[sp, #0x90]
00bbbe20	mov x23,x24
00bbbe24	ldr x22,[sp, #0xc0]
00bbbe28	ldr x7,[sp, #0x58]
00bbbe2c	mov w24,#0x18
00bbbe30	ldr x20,[sp, #0xe0]
00bbbe34	ldr x15,[sp, #0x68]
00bbbe38	cmn x0,#0x78
00bbbe3c	b.ls 0x00bbb81c
00bbbe40	b 0x00bbd580
00bbbe44	mov x12,x21
00bbbe48	mov x13,x10
00bbbe4c	b 0x00bbbf88
00bbbe50	mov x11,x21
00bbbe54	add x12,x8,x21
00bbbe58	sub x12,x12,x11
00bbbe5c	cmp x12,#0x8
00bbbe60	b.cc 0x00bbbe84
00bbbe64	sub x13,x11,x10
00bbbe68	cmp x13,#0x20
00bbbe6c	b.cc 0x00bbbe84
00bbbe70	mov x19,x16
00bbbe74	cmp x12,#0x20
00bbbe78	b.cs 0x00bbbf04
00bbbe7c	mov x15,xzr
00bbbe80	b 0x00bbbf40
00bbbe84	mov x13,x11
00bbbe88	mov x14,x10
00bbbe8c	b 0x00bbbfa8
00bbbe90	and x14,x11,#-0x20
00bbbe94	add x12,x10,#0x10
00bbbe98	add x13,x21,#0x10
00bbbe9c	mov x15,x14
00bbbea0	ldp q0,q1,[x12, #-0x10]
00bbbea4	subs x15,x15,#0x20
00bbbea8	add x12,x12,#0x20
00bbbeac	stp q0,q1,[x13, #-0x10]
00bbbeb0	add x13,x13,#0x20
00bbbeb4	b.ne 0x00bbbea0
00bbbeb8	cmp x11,x14
00bbbebc	b.eq 0x00bbbfbc
00bbbec0	tst x11,#0x18
00bbbec4	b.eq 0x00bbbf80
00bbbec8	and x15,x11,#-0x8
00bbbecc	mov x0,x16
00bbbed0	add x16,x21,x14
00bbbed4	add x12,x21,x15
00bbbed8	add x13,x10,x15
00bbbedc	add x10,x10,x14
00bbbee0	sub x14,x14,x15
00bbbee4	ldr d0,[x10], #0x8
00bbbee8	adds x14,x14,#0x8
00bbbeec	str d0,[x16], #0x8
00bbbef0	b.ne 0x00bbbee4
00bbbef4	cmp x11,x15
00bbbef8	mov x16,x0
00bbbefc	b.ne 0x00bbbf88
00bbbf00	b 0x00bbbfbc
00bbbf04	and x15,x12,#-0x20
00bbbf08	add x13,x10,#0x10
00bbbf0c	add x14,x11,#0x10
00bbbf10	mov x16,x15
00bbbf14	ldp q0,q1,[x13, #-0x10]
00bbbf18	subs x16,x16,#0x20
00bbbf1c	add x13,x13,#0x20
00bbbf20	stp q0,q1,[x14, #-0x10]
00bbbf24	add x14,x14,#0x20
00bbbf28	b.ne 0x00bbbf14
00bbbf2c	cmp x12,x15
00bbbf30	mov x16,x19
00bbbf34	b.eq 0x00bbbfbc
00bbbf38	tst x12,#0x18
00bbbf3c	b.eq 0x00bbbf9c
00bbbf40	and x16,x12,#-0x8
00bbbf44	mov x0,x17
00bbbf48	add x17,x11,x15
00bbbf4c	add x13,x11,x16
00bbbf50	add x14,x10,x16
00bbbf54	add x10,x10,x15
00bbbf58	sub x15,x15,x16
00bbbf5c	ldr d0,[x10], #0x8
00bbbf60	adds x15,x15,#0x8
00bbbf64	str d0,[x17], #0x8
00bbbf68	b.ne 0x00bbbf5c
00bbbf6c	cmp x12,x16
00bbbf70	mov x17,x0
00bbbf74	mov x16,x19
00bbbf78	b.ne 0x00bbbfa8
00bbbf7c	b 0x00bbbfbc
00bbbf80	add x12,x21,x14
00bbbf84	add x13,x10,x14
00bbbf88	ldrb w10,[x13], #0x1
00bbbf8c	strb w10,[x12], #0x1
00bbbf90	cmp x12,x9
00bbbf94	b.cc 0x00bbbf88
00bbbf98	b 0x00bbbfbc
00bbbf9c	add x13,x11,x15
00bbbfa0	add x14,x10,x15
00bbbfa4	mov x16,x19
00bbbfa8	add x10,x11,x12
00bbbfac	ldrb w11,[x14], #0x1
00bbbfb0	strb w11,[x13], #0x1
00bbbfb4	cmp x13,x10
00bbbfb8	b.ne 0x00bbbfac
00bbbfbc	ldr x13,[sp, #0x68]
00bbbfc0	mov x21,x9
00bbbfc4	ldr x10,[x13]
00bbbfc8	sub x11,x10,x8
00bbbfcc	str x11,[x13]
00bbbfd0	ldp x19,x24,[x13, #0x8]
00bbbfd4	add x20,x21,x11
00bbbfd8	ldr x8,[sp, #0x50]
00bbbfdc	cmp x11,#0x10, LSL #12
00bbbfe0	str wzr,[x22, #0xe64]
00bbbfe4	stur x8,[x29, #-0xf0]
00bbbfe8	sub x8,x20,x24
00bbbfec	prfm PLDL1KEEP,[x8]
00bbbff0	str x21,[sp, #0xd8]
00bbbff4	b.gt 0x00bbc320
00bbbff8	add x0,x19,x11
00bbbffc	ldr x10,[sp, #0x60]
00bbc000	add x9,x21,x0
00bbc004	cmp x9,x10
00bbc008	b.hi 0x00bbc320
00bbc00c	ldr x12,[sp, #0x50]
00bbc010	subs x9,x11,#0x10
00bbc014	ldr q0,[x12]
00bbc018	str q0,[x21]
00bbc01c	b.hi 0x00bbc438
00bbc020	sub x10,x20,x6
00bbc024	add x9,x12,x11
00bbc028	cmp x24,x10
00bbc02c	stur x9,[x29, #-0xf0]
00bbc030	b.ls 0x00bbc0c0
00bbc034	ldr x9,[sp, #0xb0]
00bbc038	sub x9,x20,x9
00bbc03c	cmp x24,x9
00bbc040	b.hi 0x00bbd5f4
00bbc044	ldr x9,[sp, #0x108]
00bbc048	sub x28,x8,x6
00bbc04c	mov x21,x23
00bbc050	mov w23,w1
00bbc054	stp x30,x0,[sp, #0x90]
00bbc058	add x1,x9,x28
00bbc05c	stp x17,x3,[sp, #0xa0]
00bbc060	add x8,x1,x19
00bbc064	str x7,[sp, #0x58]
00bbc068	cmp x8,x9
00bbc06c	b.ls 0x00bbc14c
00bbc070	neg x2,x28
00bbc074	mov x0,x20
00bbc078	mov x22,x6
00bbc07c	mov x26,x10
00bbc080	bl 0x00c2ff60
00bbc084	mov x10,x26
00bbc088	sub x20,x20,x28
00bbc08c	add x12,x28,x19
00bbc090	ldp x28,x26,[sp, #0x80]
00bbc094	ldr x7,[sp, #0x58]
00bbc098	ldp x17,x3,[sp, #0xa0]
00bbc09c	ldr x4,[sp, #0xd0]
00bbc0a0	ldp x30,x0,[sp, #0x90]
00bbc0a4	mov x8,x22
00bbc0a8	ldr x16,[sp, #0x78]
00bbc0ac	ldr x13,[sp, #0x68]
00bbc0b0	mov w1,w23
00bbc0b4	sub x2,x29,#0xd0
00bbc0b8	mov x23,x21
00bbc0bc	b 0x00bbc0c4
00bbc0c0	mov x12,x19
00bbc0c4	cmp x24,#0x10
00bbc0c8	b.cc 0x00bbc5c4
00bbc0cc	ldr q0,[x8]
00bbc0d0	cmp x12,#0x11
00bbc0d4	str q0,[x20]
00bbc0d8	b.cs 0x00bbc100
00bbc0dc	ldr x22,[sp, #0xc0]
00bbc0e0	ldr x20,[sp, #0xe0]
00bbc0e4	adrp x19,0x789000
00bbc0e8	add x19,x19,#0xa30
00bbc0ec	ldr x5,[sp, #0x70]
00bbc0f0	mov w24,#0x18
00bbc0f4	cmn x0,#0x78
00bbc0f8	b.ls 0x00bbc19c
00bbc0fc	b 0x00bbd580
00bbc100	ldr x22,[sp, #0xc0]
00bbc104	ldr x5,[sp, #0x70]
00bbc108	add x9,x20,x12
00bbc10c	add x10,x20,#0x10
00bbc110	add x8,x8,#0x20
00bbc114	adrp x19,0x789000
00bbc118	add x19,x19,#0xa30
00bbc11c	mov w24,#0x18
00bbc120	ldur q0,[x8, #-0x10]
00bbc124	str q0,[x10]
00bbc128	ldr q0,[x8], #0x20
00bbc12c	str q0,[x10, #0x10]
00bbc130	add x10,x10,#0x20
00bbc134	cmp x10,x9
00bbc138	b.cc 0x00bbc120
00bbc13c	ldr x20,[sp, #0xe0]
00bbc140	cmn x0,#0x78
00bbc144	b.ls 0x00bbc19c
00bbc148	b 0x00bbd580
00bbc14c	mov x0,x20
00bbc150	mov x2,x19
00bbc154	bl 0x00c2ff60
00bbc158	ldp x28,x26,[sp, #0x80]
00bbc15c	adrp x19,0x789000
00bbc160	add x19,x19,#0xa30
00bbc164	ldp x17,x3,[sp, #0xa0]
00bbc168	ldp x5,x16,[sp, #0x70]
00bbc16c	mov w1,w23
00bbc170	ldp x30,x0,[sp, #0x90]
00bbc174	mov w24,#0x18
00bbc178	ldr x22,[sp, #0xc0]
00bbc17c	ldr x7,[sp, #0x58]
00bbc180	sub x2,x29,#0xd0
00bbc184	ldr x20,[sp, #0xe0]
00bbc188	ldr x4,[sp, #0xd0]
00bbc18c	mov x23,x21
00bbc190	ldr x13,[sp, #0x68]
00bbc194	cmn x0,#0x78
00bbc198	b.hi 0x00bbd580
00bbc19c	add x8,x30,x3
00bbc1a0	ldr x6,[sp, #0xc8]
00bbc1a4	ldr x9,[sp, #0x108]
00bbc1a8	cmp x7,x8
00bbc1ac	csel x9,x9,x6,hi
00bbc1b0	add x9,x9,x8
00bbc1b4	sub x9,x9,x7
00bbc1b8	prfm PLDL1KEEP,[x9]
00bbc1bc	prfm PLDL1KEEP,[x9, #0x40]
00bbc1c0	ldr x21,[sp, #0xd8]
00bbc1c4	ldr x15,[sp, #0x30]
00bbc1c8	stp x30,x23,[x13]
00bbc1cc	str x7,[x13, #0x10]
00bbc1d0	add x21,x21,x0
00bbc1d4	b 0x00bbb860
00bbc1d8	cmp w27,#0x40
00bbc1dc	b.hi 0x00bbc944
00bbc1e0	cmp x20,x16
00bbc1e4	b.cs 0x00bbc2d4
00bbc1e8	cmp x20,x26
00bbc1ec	b.eq 0x00bbb918
00bbc1f0	lsr w11,w27,#0x3
00bbc1f4	sub w14,w20,w26
00bbc1f8	sub x13,x20,x11
00bbc1fc	cmp x13,x26
00bbc200	csel w11,w14,w11,cc
00bbc204	sub x20,x20,x11
00bbc208	sub w27,w27,w11, LSL #0x3
00bbc20c	ldr x4,[x20]
00bbc210	b 0x00bbb918
00bbc214	lsl x12,x4,x27
00bbc218	cinc w10,w10,eq
00bbc21c	add x10,x10,x12, LSR #0x3f
00bbc220	cmp x10,#0x1
00bbc224	b.eq 0x00bbc63c
00bbc228	cmp x10,#0x3
00bbc22c	b.ne 0x00bbc628
00bbc230	sub x10,x7,#0x1
00bbc234	b 0x00bbc634
00bbc238	adrp x20,0x789000
00bbc23c	add x20,x20,#0xab0
00bbc240	mov x15,x0
00bbc244	mov x16,x30
00bbc248	mov x30,x23
00bbc24c	b 0x00bbba10
00bbc250	mov x0,x21
00bbc254	mov w21,w1
00bbc258	ldr x1,[sp, #0x48]
00bbc25c	mov x19,x7
00bbc260	ldr x7,[sp, #0xb0]
00bbc264	ldr x8,[sp, #0x108]
00bbc268	str x23,[sp, #0x68]
00bbc26c	mov x23,x3
00bbc270	sub x3,x29,#0xe8
00bbc274	sub x4,x29,#0xf0
00bbc278	mov x24,x5
00bbc27c	mov x5,x15
00bbc280	stp x11,x20,[x29, #-0xe8]
00bbc284	mov x22,x17
00bbc288	mov x20,x30
00bbc28c	stur x26,[x29, #-0xd8]
00bbc290	mov x26,x15
00bbc294	str x8,[sp]
00bbc298	bl 0x00bc006c
00bbc29c	mov x30,x20
00bbc2a0	mov x15,x26
00bbc2a4	mov x17,x22
00bbc2a8	mov x3,x23
00bbc2ac	ldr x23,[sp, #0x68]
00bbc2b0	ldr x22,[sp, #0xc0]
00bbc2b4	ldr x26,[sp, #0x88]
00bbc2b8	ldr x20,[sp, #0xe0]
00bbc2bc	ldr x16,[sp, #0x78]
00bbc2c0	mov x5,x24
00bbc2c4	mov w1,w21
00bbc2c8	mov w24,#0x18
00bbc2cc	mov x7,x19
00bbc2d0	b 0x00bbc8c8
00bbc2d4	lsr w11,w27,#0x3
00bbc2d8	and w27,w27,#0x7
00bbc2dc	sub x20,x20,x11
00bbc2e0	ldr x4,[x20]
00bbc2e4	b 0x00bbb918
00bbc2e8	ldr q0,[x10, #0x10]
00bbc2ec	cmp x11,#0x11
00bbc2f0	str q0,[x21, #0x10]
00bbc2f4	b.cc 0x00bbbb28
00bbc2f8	add x11,x21,#0x20
00bbc2fc	add x10,x10,#0x30
00bbc300	ldur q0,[x10, #-0x10]
00bbc304	str q0,[x11]
00bbc308	ldr q0,[x10], #0x20
00bbc30c	str q0,[x11, #0x10]
00bbc310	add x11,x11,#0x20
00bbc314	cmp x11,x20
00bbc318	b.cc 0x00bbc300
00bbc31c	b 0x00bbbb28
00bbc320	stp x11,x19,[x29, #-0xe8]
00bbc324	ldr x4,[sp, #0x30]
00bbc328	mov x5,x6
00bbc32c	str w1,[sp, #0x58]
00bbc330	ldr x1,[sp, #0x48]
00bbc334	ldr x6,[sp, #0xb0]
00bbc338	mov x19,x7
00bbc33c	ldr x7,[sp, #0x108]
00bbc340	sub x2,x29,#0xe8
00bbc344	str x3,[sp, #0xa8]
00bbc348	sub x3,x29,#0xf0
00bbc34c	mov x0,x21
00bbc350	stur x24,[x29, #-0xd8]
00bbc354	mov x21,x23
00bbc358	mov x23,x17
00bbc35c	mov x20,x16
00bbc360	mov x24,x30
00bbc364	bl 0x00bbf92c
00bbc368	ldp x13,x5,[sp, #0x68]
00bbc36c	mov x16,x20
00bbc370	ldr w1,[sp, #0x58]
00bbc374	ldr x3,[sp, #0xa8]
00bbc378	mov x30,x24
00bbc37c	ldr x4,[sp, #0xd0]
00bbc380	ldr x20,[sp, #0xe0]
00bbc384	sub x2,x29,#0xd0
00bbc388	mov x17,x23
00bbc38c	mov x23,x21
00bbc390	mov w24,#0x18
00bbc394	mov x7,x19
00bbc398	adrp x19,0x789000
00bbc39c	add x19,x19,#0xa30
00bbc3a0	cmn x0,#0x78
00bbc3a4	b.ls 0x00bbc19c
00bbc3a8	b 0x00bbd580
00bbc3ac	cmp x26,#0x7
00bbc3b0	b.hi 0x00bbc4dc
00bbc3b4	ldrb w9,[x8]
00bbc3b8	adrp x10,0x364000
00bbc3bc	add x10,x10,#0xd10
00bbc3c0	ldrsw x10,[x10, x26, LSL #0x2]
00bbc3c4	strb w9,[x20]
00bbc3c8	ldrb w9,[x8, #0x1]
00bbc3cc	strb w9,[x20, #0x1]
00bbc3d0	ldrb w9,[x8, #0x2]
00bbc3d4	strb w9,[x20, #0x2]
00bbc3d8	ldrb w9,[x8, #0x3]
00bbc3dc	strb w9,[x20, #0x3]
00bbc3e0	adrp x9,0x364000
00bbc3e4	add x9,x9,#0xe10
00bbc3e8	ldr w9,[x9, x26, LSL #0x2]
00bbc3ec	add x8,x8,x9
00bbc3f0	ldr w9,[x8]
00bbc3f4	sub x8,x8,x10
00bbc3f8	str w9,[x20, #0x4]
00bbc3fc	b 0x00bbc4e4
00bbc400	ldr q0,[x10, #0x10]
00bbc404	cmp x9,#0x11
00bbc408	str q0,[x21, #0x10]
00bbc40c	b.cc 0x00bbbc08
00bbc410	add x9,x21,#0x20
00bbc414	add x10,x10,#0x30
00bbc418	ldur q0,[x10, #-0x10]
00bbc41c	str q0,[x9]
00bbc420	ldr q0,[x10], #0x20
00bbc424	str q0,[x9, #0x10]
00bbc428	add x9,x9,#0x20
00bbc42c	cmp x9,x19
00bbc430	b.cc 0x00bbc418
00bbc434	b 0x00bbbc08
00bbc438	ldr x10,[sp, #0x20]
00bbc43c	cmp x9,#0x11
00bbc440	ldr q0,[x10]
00bbc444	str q0,[x21, #0x10]
00bbc448	b.cc 0x00bbc020
00bbc44c	ldr x10,[sp, #0x10]
00bbc450	add x9,x21,#0x20
00bbc454	ldur q0,[x10, #-0x10]
00bbc458	str q0,[x9]
00bbc45c	ldr q0,[x10], #0x20
00bbc460	str q0,[x9, #0x10]
00bbc464	add x9,x9,#0x20
00bbc468	cmp x9,x20
00bbc46c	b.cc 0x00bbc454
00bbc470	b 0x00bbc020
00bbc474	mov x14,x10
00bbc478	mov w6,w1
00bbc47c	mov x2,x0
00bbc480	mov x1,x17
00bbc484	mov x4,x15
00bbc488	cmp x26,#0x7
00bbc48c	b.hi 0x00bbc650
00bbc490	ldrb w8,[x9]
00bbc494	adrp x10,0x364000
00bbc498	add x10,x10,#0xd10
00bbc49c	ldrsw x10,[x10, x26, LSL #0x2]
00bbc4a0	strb w8,[x19]
00bbc4a4	ldrb w8,[x9, #0x1]
00bbc4a8	strb w8,[x19, #0x1]
00bbc4ac	ldrb w8,[x9, #0x2]
00bbc4b0	strb w8,[x19, #0x2]
00bbc4b4	ldrb w8,[x9, #0x3]
00bbc4b8	strb w8,[x19, #0x3]
00bbc4bc	adrp x8,0x364000
00bbc4c0	add x8,x8,#0xe10
00bbc4c4	ldr w8,[x8, x26, LSL #0x2]
00bbc4c8	add x8,x9,x8
00bbc4cc	ldr w9,[x8]
00bbc4d0	str w9,[x19, #0x4]
00bbc4d4	sub x9,x8,x10
00bbc4d8	b 0x00bbc658
00bbc4dc	ldr x9,[x8]
00bbc4e0	str x9,[x20]
00bbc4e4	cmp x12,#0x9
00bbc4e8	b.cc 0x00bbb808
00bbc4ec	add x11,x8,#0x8
00bbc4f0	add x10,x20,#0x8
00bbc4f4	mov w2,w1
00bbc4f8	sub x13,x10,x11
00bbc4fc	mov x1,x0
00bbc500	mov x0,x17
00bbc504	mov x21,x15
00bbc508	cmp x13,#0xf
00bbc50c	add x9,x20,x12
00bbc510	b.gt 0x00bbc730
00bbc514	cmp x26,x4
00bbc518	add x12,x19,x6
00bbc51c	ldr x15,[sp, #0x18]
00bbc520	csel x14,x26,x4,cc
00bbc524	add x12,x12,x14
00bbc528	csel x14,x26,x4,hi
00bbc52c	add x12,x12,x14
00bbc530	add x15,x15,x14
00bbc534	sub x12,x12,x26
00bbc538	cmp x12,x15
00bbc53c	csel x12,x12,x15,hi
00bbc540	add x15,x14,x6
00bbc544	sub x12,x12,x15
00bbc548	sub x12,x12,#0x9
00bbc54c	cmp x12,#0x18
00bbc550	b.cc 0x00bbc5b0
00bbc554	cmp x13,#0x20
00bbc558	b.cc 0x00bbc5b0
00bbc55c	lsr x12,x12,#0x3
00bbc560	ldr x17,[sp, #0xd8]
00bbc564	ldr x16,[sp, #0x8]
00bbc568	add x8,x8,#0x18
00bbc56c	add x12,x12,#0x1
00bbc570	add x16,x17,x16
00bbc574	sub x14,x14,x17
00bbc578	and x13,x12,#0x3ffffffffffffffc
00bbc57c	add x14,x16,x14
00bbc580	lsl x15,x13,#0x3
00bbc584	add x10,x10,x15
00bbc588	add x11,x11,x15
00bbc58c	mov x15,x13
00bbc590	ldp q0,q1,[x8, #-0x10]
00bbc594	subs x15,x15,#0x4
00bbc598	add x8,x8,#0x20
00bbc59c	stp q0,q1,[x14, #-0x10]
00bbc5a0	add x14,x14,#0x20
00bbc5a4	b.ne 0x00bbc590
00bbc5a8	cmp x12,x13
00bbc5ac	b.eq 0x00bbc768
00bbc5b0	ldr x8,[x11], #0x8
00bbc5b4	str x8,[x10], #0x8
00bbc5b8	cmp x10,x9
00bbc5bc	b.cc 0x00bbc5b0
00bbc5c0	b 0x00bbc768
00bbc5c4	mov x14,x10
00bbc5c8	mov w2,w1
00bbc5cc	mov x1,x0
00bbc5d0	mov x0,x17
00bbc5d4	cmp x24,#0x7
00bbc5d8	b.hi 0x00bbc78c
00bbc5dc	ldrb w9,[x8]
00bbc5e0	adrp x10,0x364000
00bbc5e4	add x10,x10,#0xd10
00bbc5e8	ldrsw x10,[x10, x24, LSL #0x2]
00bbc5ec	strb w9,[x20]
00bbc5f0	ldrb w9,[x8, #0x1]
00bbc5f4	strb w9,[x20, #0x1]
00bbc5f8	ldrb w9,[x8, #0x2]
00bbc5fc	strb w9,[x20, #0x2]
00bbc600	ldrb w9,[x8, #0x3]
00bbc604	strb w9,[x20, #0x3]
00bbc608	adrp x9,0x364000
00bbc60c	add x9,x9,#0xe10
00bbc610	ldr w9,[x9, x24, LSL #0x2]
00bbc614	add x8,x8,x9
00bbc618	ldr w9,[x8]
00bbc61c	sub x8,x8,x10
00bbc620	str w9,[x20, #0x4]
00bbc624	b 0x00bbc794
00bbc628	cmp x10,#0x0
00bbc62c	ldr x10,[sp, #0xe8]
00bbc630	csel x10,x7,x10,eq
00bbc634	str x25,[sp, #0xe8]
00bbc638	mov x25,x10
00bbc63c	cmp x25,#0x0
00bbc640	add w27,w27,#0x1
00bbc644	csinv x10,x25,xzr,ne
00bbc648	mov x25,x7
00bbc64c	b 0x00bbb8b4
00bbc650	ldr x8,[x9]
00bbc654	str x8,[x19]
00bbc658	cmp x12,#0x9
00bbc65c	b.cc 0x00bbc8a4
00bbc660	add x11,x9,#0x8
00bbc664	add x10,x19,#0x8
00bbc668	add x8,x19,x12
00bbc66c	sub x13,x10,x11
00bbc670	cmp x13,#0xf
00bbc674	b.gt 0x00bbc86c
00bbc678	ldr x16,[sp, #0xc8]
00bbc67c	cmp x26,x14
00bbc680	mov x15,x14
00bbc684	csel x14,x26,x14,cc
00bbc688	add x12,x20,x16
00bbc68c	add x12,x12,x14
00bbc690	csel x14,x26,x15,hi
00bbc694	ldr x15,[sp, #0x18]
00bbc698	add x12,x12,x14
00bbc69c	sub x12,x12,x26
00bbc6a0	add x15,x15,x14
00bbc6a4	cmp x12,x15
00bbc6a8	csel x12,x12,x15,hi
00bbc6ac	add x15,x14,x16
00bbc6b0	sub x12,x12,x15
00bbc6b4	sub x12,x12,#0x9
00bbc6b8	cmp x12,#0x18
00bbc6bc	b.cc 0x00bbc71c
00bbc6c0	cmp x13,#0x20
00bbc6c4	b.cc 0x00bbc71c
00bbc6c8	lsr x12,x12,#0x3
00bbc6cc	ldr x17,[sp, #0xd8]
00bbc6d0	ldr x16,[sp, #0x8]
00bbc6d4	add x9,x9,#0x18
00bbc6d8	add x12,x12,#0x1
00bbc6dc	add x16,x17,x16
00bbc6e0	sub x14,x14,x17
00bbc6e4	and x13,x12,#0x3ffffffffffffffc
00bbc6e8	add x14,x16,x14
00bbc6ec	lsl x15,x13,#0x3
00bbc6f0	add x10,x10,x15
00bbc6f4	add x11,x11,x15
00bbc6f8	mov x15,x13
00bbc6fc	ldp q0,q1,[x9, #-0x10]
00bbc700	subs x15,x15,#0x4
00bbc704	add x9,x9,#0x20
00bbc708	stp q0,q1,[x14, #-0x10]
00bbc70c	add x14,x14,#0x20
00bbc710	b.ne 0x00bbc6fc
00bbc714	cmp x12,x13
00bbc718	b.eq 0x00bbc8a4
00bbc71c	ldr x9,[x11], #0x8
00bbc720	str x9,[x10], #0x8
00bbc724	cmp x10,x8
00bbc728	b.cc 0x00bbc71c
00bbc72c	b 0x00bbc8a4
00bbc730	sub x12,x12,#0x8
00bbc734	ldr q0,[x11]
00bbc738	cmp x12,#0x11
00bbc73c	str q0,[x10]
00bbc740	b.cc 0x00bbc768
00bbc744	add x10,x20,#0x18
00bbc748	add x8,x8,#0x28
00bbc74c	ldur q0,[x8, #-0x10]
00bbc750	str q0,[x10]
00bbc754	ldr q0,[x8], #0x20
00bbc758	str q0,[x10, #0x10]
00bbc75c	add x10,x10,#0x20
00bbc760	cmp x10,x9
00bbc764	b.cc 0x00bbc74c
00bbc768	ldp x28,x26,[sp, #0x80]
00bbc76c	mov x15,x21
00bbc770	ldp x5,x16,[sp, #0x70]
00bbc774	mov x17,x0
00bbc778	ldr x22,[sp, #0xc0]
00bbc77c	ldr x20,[sp, #0xe0]
00bbc780	mov x0,x1
00bbc784	mov w1,w2
00bbc788	b 0x00bbc8c4
00bbc78c	ldr x9,[x8]
00bbc790	str x9,[x20]
00bbc794	cmp x12,#0x9
00bbc798	b.cc 0x00bbc910
00bbc79c	add x11,x8,#0x8
00bbc7a0	add x10,x20,#0x8
00bbc7a4	add x9,x20,x12
00bbc7a8	sub x13,x10,x11
00bbc7ac	cmp x13,#0xf
00bbc7b0	b.gt 0x00bbc8d8
00bbc7b4	ldr x16,[sp, #0xc8]
00bbc7b8	cmp x24,x14
00bbc7bc	mov x15,x14
00bbc7c0	csel x14,x24,x14,cc
00bbc7c4	add x12,x19,x16
00bbc7c8	add x12,x12,x14
00bbc7cc	csel x14,x24,x15,hi
00bbc7d0	ldr x15,[sp, #0x18]
00bbc7d4	add x12,x12,x14
00bbc7d8	sub x12,x12,x24
00bbc7dc	add x15,x15,x14
00bbc7e0	cmp x12,x15
00bbc7e4	csel x12,x12,x15,hi
00bbc7e8	add x15,x14,x16
00bbc7ec	sub x12,x12,x15
00bbc7f0	sub x12,x12,#0x9
00bbc7f4	cmp x12,#0x18
00bbc7f8	b.cc 0x00bbc858
00bbc7fc	cmp x13,#0x20
00bbc800	b.cc 0x00bbc858
00bbc804	lsr x12,x12,#0x3
00bbc808	ldr x17,[sp, #0xd8]
00bbc80c	ldr x16,[sp, #0x8]
00bbc810	add x8,x8,#0x18
00bbc814	add x12,x12,#0x1
00bbc818	add x16,x17,x16
00bbc81c	sub x14,x14,x17
00bbc820	and x13,x12,#0x3ffffffffffffffc
00bbc824	add x14,x16,x14
00bbc828	lsl x15,x13,#0x3
00bbc82c	add x10,x10,x15
00bbc830	add x11,x11,x15
00bbc834	mov x15,x13
00bbc838	ldp q0,q1,[x8, #-0x10]
00bbc83c	subs x15,x15,#0x4
00bbc840	add x8,x8,#0x20
00bbc844	stp q0,q1,[x14, #-0x10]
00bbc848	add x14,x14,#0x20
00bbc84c	b.ne 0x00bbc838
00bbc850	cmp x12,x13
00bbc854	b.eq 0x00bbc910
00bbc858	ldr x8,[x11], #0x8
00bbc85c	str x8,[x10], #0x8
00bbc860	cmp x10,x9
00bbc864	b.cc 0x00bbc858
00bbc868	b 0x00bbc910
00bbc86c	sub x12,x12,#0x8
00bbc870	ldr q0,[x11]
00bbc874	cmp x12,#0x11
00bbc878	str q0,[x10]
00bbc87c	b.cc 0x00bbc8a4
00bbc880	add x10,x19,#0x18
00bbc884	add x9,x9,#0x28
00bbc888	ldur q0,[x9, #-0x10]
00bbc88c	str q0,[x10]
00bbc890	ldr q0,[x9], #0x20
00bbc894	str q0,[x10, #0x10]
00bbc898	add x10,x10,#0x20
00bbc89c	cmp x10,x8
00bbc8a0	b.cc 0x00bbc888
00bbc8a4	ldp x28,x26,[sp, #0x80]
00bbc8a8	mov x15,x4
00bbc8ac	ldp x5,x16,[sp, #0x70]
00bbc8b0	mov x17,x1
00bbc8b4	ldr x22,[sp, #0xc0]
00bbc8b8	ldr x20,[sp, #0xe0]
00bbc8bc	mov x0,x2
00bbc8c0	mov w1,w6
00bbc8c4	mov w24,#0x18
00bbc8c8	sub x2,x29,#0xd0
00bbc8cc	cmn x0,#0x78
00bbc8d0	b.ls 0x00bbb81c
00bbc8d4	b 0x00bbd580
00bbc8d8	sub x12,x12,#0x8
00bbc8dc	ldr q0,[x11]
00bbc8e0	cmp x12,#0x11
00bbc8e4	str q0,[x10]
00bbc8e8	b.cc 0x00bbc910
00bbc8ec	add x10,x20,#0x18
00bbc8f0	add x8,x8,#0x28
00bbc8f4	ldur q0,[x8, #-0x10]
00bbc8f8	str q0,[x10]
00bbc8fc	ldr q0,[x8], #0x20
00bbc900	str q0,[x10, #0x10]
00bbc904	add x10,x10,#0x20
00bbc908	cmp x10,x9
00bbc90c	b.cc 0x00bbc8f4
00bbc910	ldp x28,x26,[sp, #0x80]
00bbc914	adrp x19,0x789000
00bbc918	add x19,x19,#0xa30
00bbc91c	ldp x5,x16,[sp, #0x70]
00bbc920	ldr x22,[sp, #0xc0]
00bbc924	ldr x20,[sp, #0xe0]
00bbc928	mov x17,x0
00bbc92c	ldr x4,[sp, #0xd0]
00bbc930	mov x0,x1
00bbc934	mov w1,w2
00bbc938	mov w24,#0x18
00bbc93c	sub x2,x29,#0xd0
00bbc940	b 0x00bbc190
00bbc944	adrp x20,0x789000
00bbc948	add x20,x20,#0xab0
00bbc94c	b 0x00bbb918
00bbc950	ldr w5,[sp, #0xbc]
00bbc954	mov w1,w5
00bbc958	cmp x20,x26
00bbc95c	mov x0,#-0x14
00bbc960	b.ne 0x00bbd580
00bbc964	ldr x20,[sp, #0x38]
00bbc968	cmp w27,#0x40
00bbc96c	b.ne 0x00bbd584
00bbc970	ldr x8,[sp, #0x40]
00bbc974	str x25,[sp, #0xf8]
00bbc978	str x15,[sp, #0x68]
00bbc97c	sub w25,w1,w8
00bbc980	cmp w25,w5
00bbc984	b.ge 0x00bbd5b4
00bbc988	ldr x8,[sp, #0x48]
00bbc98c	add x9,x22,#0xe78
00bbc990	add x23,x22,#0xe68
00bbc994	str x9,[sp, #0xf0]
00bbc998	add x9,x6,#0x10
00bbc99c	sub x8,x8,#0x20
00bbc9a0	str x7,[sp, #0x58]
00bbc9a4	stur x8,[x29, #-0xf8]
00bbc9a8	add x8,x28,#0x17, LSL #12
00bbc9ac	add x8,x8,#0x6a4
00bbc9b0	stur x23,[x29, #-0x100]
00bbc9b4	str x8,[sp, #0x100]
00bbc9b8	add x8,x6,#0x18
00bbc9bc	str x8,[sp, #0xd0]
00bbc9c0	add x8,x22,#0xe98
00bbc9c4	stp x8,x9,[sp, #0xd8]
00bbc9c8	b 0x00bbc9f4
00bbc9cc	ldr x22,[sp, #0xc0]
00bbc9d0	cmn x0,#0x77
00bbc9d4	b.cs 0x00bbd580
00bbc9d8	ldr x8,[sp, #0x100]
00bbc9dc	add x21,x21,x0
00bbc9e0	str x8,[sp, #0x68]
00bbc9e4	add w25,w25,#0x1
00bbc9e8	ldr x6,[sp, #0xc8]
00bbc9ec	cmp w25,w5
00bbc9f0	b.eq 0x00bbd5b4
00bbc9f4	and w8,w25,#0x7
00bbc9f8	mov w10,#0x18
00bbc9fc	ldr w9,[x22, #0xe64]
00bbca00	sub x11,x29,#0xd0
00bbca04	umaddl x8,w8,w10,x11
00bbca08	cmp w9,#0x2
00bbca0c	b.ne 0x00bbcaac
00bbca10	ldur x11,[x29, #-0xf0]
00bbca14	ldr x12,[x8]
00bbca18	ldr x13,[x28, #0x7698]
00bbca1c	add x10,x11,x12
00bbca20	cmp x10,x13
00bbca24	b.ls 0x00bbcb68
00bbca28	subs x9,x13,x11
00bbca2c	b.eq 0x00bbcea0
00bbca30	ldr x10,[sp, #0x48]
00bbca34	sub x10,x10,x21
00bbca38	cmp x9,x10
00bbca3c	b.hi 0x00bbd5e8
00bbca40	sub x14,x21,x11
00bbca44	add x10,x21,x9
00bbca48	cmn x14,#0x8
00bbca4c	b.gt 0x00bbcccc
00bbca50	cmp x9,#0x7
00bbca54	b.ls 0x00bbcccc
00bbca58	cmn x14,#0x11
00bbca5c	b.hi 0x00bbcd44
00bbca60	sub x12,x10,#0x20
00bbca64	cmp x21,x12
00bbca68	b.hi 0x00bbcd44
00bbca6c	sub x13,x12,x21
00bbca70	ldr q0,[x11]
00bbca74	cmp x13,#0x11
00bbca78	str q0,[x21]
00bbca7c	b.cc 0x00bbcaa4
00bbca80	add x14,x21,#0x10
00bbca84	add x15,x11,#0x20
00bbca88	ldur q0,[x15, #-0x10]
00bbca8c	str q0,[x14]
00bbca90	ldr q0,[x15], #0x20
00bbca94	str q0,[x14, #0x10]
00bbca98	add x14,x14,#0x20
00bbca9c	cmp x14,x12
00bbcaa0	b.cc 0x00bbca88
00bbcaa4	add x11,x11,x13
00bbcaa8	b 0x00bbcd48
00bbcaac	ldp x11,x20,[x8]
00bbcab0	ldr x19,[x8, #0x10]
00bbcab4	ldp x13,x10,[x29, #-0xf8]
00bbcab8	ldr x8,[sp, #0x68]
00bbcabc	add x0,x20,x11
00bbcac0	add x28,x21,x11
00bbcac4	add x9,x10,x11
00bbcac8	add x12,x21,x0
00bbcacc	cmp x9,x8
00bbcad0	sub x8,x28,x19
00bbcad4	ccmp x12,x13,#0x2,ls
00bbcad8	prfm PLDL1KEEP,[x8]
00bbcadc	b.hi 0x00bbcfcc
00bbcae0	ldr q0,[x10]
00bbcae4	subs x11,x11,#0x10
00bbcae8	str q0,[x21]
00bbcaec	b.hi 0x00bbd048
00bbcaf0	sub x24,x28,x6
00bbcaf4	stur x9,[x29, #-0xf0]
00bbcaf8	cmp x19,x24
00bbcafc	b.ls 0x00bbcc1c
00bbcb00	ldr x9,[sp, #0xb0]
00bbcb04	sub x9,x28,x9
00bbcb08	cmp x19,x9
00bbcb0c	b.hi 0x00bbd5f4
00bbcb10	ldr x9,[sp, #0x108]
00bbcb14	sub x26,x8,x6
00bbcb18	mov x23,x0
00bbcb1c	mov x27,x21
00bbcb20	add x1,x9,x26
00bbcb24	add x8,x1,x20
00bbcb28	cmp x8,x9
00bbcb2c	b.ls 0x00bbcc94
00bbcb30	neg x2,x26
00bbcb34	mov x0,x28
00bbcb38	mov x22,x6
00bbcb3c	bl 0x00c2ff60
00bbcb40	mov x8,x22
00bbcb44	ldr x22,[sp, #0xc0]
00bbcb48	ldr w5,[sp, #0xbc]
00bbcb4c	ldr x7,[sp, #0x58]
00bbcb50	mov x0,x23
00bbcb54	ldur x23,[x29, #-0x100]
00bbcb58	sub x28,x28,x26
00bbcb5c	add x12,x26,x20
00bbcb60	mov x21,x27
00bbcb64	b 0x00bbcc20
00bbcb68	ldp x20,x24,[x8, #0x8]
00bbcb6c	sub x2,x10,#0x20
00bbcb70	ldr x8,[sp, #0x68]
00bbcb74	cmp x10,x8
00bbcb78	b.hi 0x00bbd00c
00bbcb7c	add x0,x20,x12
00bbcb80	add x8,x21,x0
00bbcb84	cmp x8,x2
00bbcb88	b.hi 0x00bbd00c
00bbcb8c	ldr q0,[x11]
00bbcb90	subs x8,x12,#0x10
00bbcb94	add x19,x21,x12
00bbcb98	str q0,[x21]
00bbcb9c	b.hi 0x00bbd10c
00bbcba0	sub x26,x19,x6
00bbcba4	sub x9,x19,x24
00bbcba8	stur x10,[x29, #-0xf0]
00bbcbac	cmp x24,x26
00bbcbb0	b.ls 0x00bbcc6c
00bbcbb4	ldr x8,[sp, #0xb0]
00bbcbb8	sub x8,x19,x8
00bbcbbc	cmp x24,x8
00bbcbc0	b.hi 0x00bbd5f4
00bbcbc4	sub x28,x9,x6
00bbcbc8	ldr x9,[sp, #0x108]
00bbcbcc	mov x23,x0
00bbcbd0	mov x27,x21
00bbcbd4	add x1,x9,x28
00bbcbd8	add x8,x1,x20
00bbcbdc	cmp x8,x9
00bbcbe0	b.ls 0x00bbcd04
00bbcbe4	neg x2,x28
00bbcbe8	mov x0,x19
00bbcbec	mov x22,x6
00bbcbf0	bl 0x00c2ff60
00bbcbf4	sub x19,x19,x28
00bbcbf8	add x12,x28,x20
00bbcbfc	ldr x28,[sp, #0x80]
00bbcc00	ldr w5,[sp, #0xbc]
00bbcc04	ldr x7,[sp, #0x58]
00bbcc08	mov x0,x23
00bbcc0c	ldur x23,[x29, #-0x100]
00bbcc10	mov x9,x22
00bbcc14	mov x21,x27
00bbcc18	b 0x00bbcc70
00bbcc1c	mov x12,x20
00bbcc20	cmp x19,#0x10
00bbcc24	b.cc 0x00bbd0b4
00bbcc28	ldr q0,[x8]
00bbcc2c	cmp x12,#0x11
00bbcc30	mov x27,x21
00bbcc34	str q0,[x28]
00bbcc38	b.cc 0x00bbcc64
00bbcc3c	add x9,x28,x12
00bbcc40	add x10,x28,#0x10
00bbcc44	add x8,x8,#0x20
00bbcc48	ldur q0,[x8, #-0x10]
00bbcc4c	str q0,[x10]
00bbcc50	ldr q0,[x8], #0x20
00bbcc54	str q0,[x10, #0x10]
00bbcc58	add x10,x10,#0x20
00bbcc5c	cmp x10,x9
00bbcc60	b.cc 0x00bbcc48
00bbcc64	ldr x28,[sp, #0x80]
00bbcc68	b 0x00bbcd28
00bbcc6c	mov x12,x20
00bbcc70	cmp x24,#0x10
00bbcc74	b.cc 0x00bbd180
00bbcc78	ldr q0,[x9]
00bbcc7c	cmp x12,#0x11
00bbcc80	mov x27,x21
00bbcc84	str q0,[x19]
00bbcc88	b.cs 0x00bbcc9c
00bbcc8c	ldr x22,[sp, #0xc0]
00bbcc90	b 0x00bbcd28
00bbcc94	mov x0,x28
00bbcc98	b 0x00bbcd08
00bbcc9c	ldr x22,[sp, #0xc0]
00bbcca0	add x8,x19,x12
00bbcca4	add x10,x19,#0x10
00bbcca8	add x9,x9,#0x20
00bbccac	ldur q0,[x9, #-0x10]
00bbccb0	str q0,[x10]
00bbccb4	ldr q0,[x9], #0x20
00bbccb8	str q0,[x10, #0x10]
00bbccbc	add x10,x10,#0x20
00bbccc0	cmp x10,x8
00bbccc4	b.cc 0x00bbccac
00bbccc8	b 0x00bbcd28
00bbcccc	add x12,x21,x13
00bbccd0	add x13,x21,#0x1
00bbccd4	sub x12,x12,x11
00bbccd8	cmp x12,x13
00bbccdc	csinc x12,x12,x21,hi
00bbcce0	sub x12,x12,x21
00bbcce4	cmp x12,#0x8
00bbcce8	b.cc 0x00bbcd38
00bbccec	cmp x14,#0x20
00bbccf0	b.cc 0x00bbcd38
00bbccf4	cmp x12,#0x20
00bbccf8	b.cs 0x00bbcd80
00bbccfc	mov x15,xzr
00bbcd00	b 0x00bbcdb8
00bbcd04	mov x0,x19
00bbcd08	mov x2,x20
00bbcd0c	bl 0x00c2ff60
00bbcd10	ldr x28,[sp, #0x80]
00bbcd14	ldr x22,[sp, #0xc0]
00bbcd18	mov x0,x23
00bbcd1c	ldr w5,[sp, #0xbc]
00bbcd20	ldr x7,[sp, #0x58]
00bbcd24	ldur x23,[x29, #-0x100]
00bbcd28	cmn x0,#0x78
00bbcd2c	b.hi 0x00bbd580
00bbcd30	add x21,x27,x0
00bbcd34	b 0x00bbc9e4
00bbcd38	mov x13,x21
00bbcd3c	mov x14,x11
00bbcd40	b 0x00bbce60
00bbcd44	mov x12,x21
00bbcd48	add x13,x9,x21
00bbcd4c	sub x13,x13,x12
00bbcd50	cmp x13,#0x8
00bbcd54	b.cc 0x00bbcd74
00bbcd58	sub x14,x12,x11
00bbcd5c	cmp x14,#0x20
00bbcd60	b.cc 0x00bbcd74
00bbcd64	cmp x13,#0x20
00bbcd68	b.cs 0x00bbcdec
00bbcd6c	mov x16,xzr
00bbcd70	b 0x00bbce24
00bbcd74	mov x14,x12
00bbcd78	mov x15,x11
00bbcd7c	b 0x00bbce7c
00bbcd80	and x15,x12,#-0x20
00bbcd84	add x13,x11,#0x10
00bbcd88	add x14,x21,#0x10
00bbcd8c	mov x16,x15
00bbcd90	ldp q0,q1,[x13, #-0x10]
00bbcd94	subs x16,x16,#0x20
00bbcd98	add x13,x13,#0x20
00bbcd9c	stp q0,q1,[x14, #-0x10]
00bbcda0	add x14,x14,#0x20
00bbcda4	b.ne 0x00bbcd90
00bbcda8	cmp x12,x15
00bbcdac	b.eq 0x00bbce90
00bbcdb0	tst x12,#0x18
00bbcdb4	b.eq 0x00bbce58
00bbcdb8	and x16,x12,#-0x8
00bbcdbc	add x17,x21,x15
00bbcdc0	add x13,x21,x16
00bbcdc4	add x14,x11,x16
00bbcdc8	add x11,x11,x15
00bbcdcc	sub x15,x15,x16
00bbcdd0	ldr d0,[x11], #0x8
00bbcdd4	adds x15,x15,#0x8
00bbcdd8	str d0,[x17], #0x8
00bbcddc	b.ne 0x00bbcdd0
00bbcde0	cmp x12,x16
00bbcde4	b.ne 0x00bbce60
00bbcde8	b 0x00bbce90
00bbcdec	and x16,x13,#-0x20
00bbcdf0	add x14,x11,#0x10
00bbcdf4	add x15,x12,#0x10
00bbcdf8	mov x17,x16
00bbcdfc	ldp q0,q1,[x14, #-0x10]
00bbce00	subs x17,x17,#0x20
00bbce04	add x14,x14,#0x20
00bbce08	stp q0,q1,[x15, #-0x10]
00bbce0c	add x15,x15,#0x20
00bbce10	b.ne 0x00bbcdfc
00bbce14	cmp x13,x16
00bbce18	b.eq 0x00bbce90
00bbce1c	tst x13,#0x18
00bbce20	b.eq 0x00bbce74
00bbce24	and x17,x13,#-0x8
00bbce28	add x0,x12,x16
00bbce2c	add x14,x12,x17
00bbce30	add x15,x11,x17
00bbce34	add x11,x11,x16
00bbce38	sub x16,x16,x17
00bbce3c	ldr d0,[x11], #0x8
00bbce40	adds x16,x16,#0x8
00bbce44	str d0,[x0], #0x8
00bbce48	b.ne 0x00bbce3c
00bbce4c	cmp x13,x17
00bbce50	b.ne 0x00bbce7c
00bbce54	b 0x00bbce90
00bbce58	add x13,x21,x15
00bbce5c	add x14,x11,x15
00bbce60	ldrb w11,[x14], #0x1
00bbce64	strb w11,[x13], #0x1
00bbce68	cmp x13,x10
00bbce6c	b.cc 0x00bbce60
00bbce70	b 0x00bbce90
00bbce74	add x14,x12,x16
00bbce78	add x15,x11,x16
00bbce7c	add x11,x12,x13
00bbce80	ldrb w12,[x15], #0x1
00bbce84	strb w12,[x14], #0x1
00bbce88	cmp x14,x11
00bbce8c	b.ne 0x00bbce80
00bbce90	ldr x11,[x8]
00bbce94	mov x21,x10
00bbce98	sub x12,x11,x9
00bbce9c	str x12,[x8]
00bbcea0	ldp x19,x24,[x8, #0x8]
00bbcea4	add x20,x21,x12
00bbcea8	cmp x12,#0x10, LSL #12
00bbceac	stur x23,[x29, #-0xf0]
00bbceb0	str wzr,[x22, #0xe64]
00bbceb4	sub x8,x20,x24
00bbceb8	prfm PLDL1KEEP,[x8]
00bbcebc	b.gt 0x00bbd080
00bbcec0	add x0,x19,x12
00bbcec4	ldur x10,[x29, #-0xf8]
00bbcec8	add x9,x21,x0
00bbcecc	cmp x9,x10
00bbced0	b.hi 0x00bbd080
00bbced4	ldr q0,[x23]
00bbced8	subs x9,x12,#0x10
00bbcedc	str q0,[x21]
00bbcee0	b.hi 0x00bbd144
00bbcee4	sub x26,x20,x6
00bbcee8	add x9,x23,x12
00bbceec	cmp x24,x26
00bbcef0	stur x9,[x29, #-0xf0]
00bbcef4	b.ls 0x00bbcf58
00bbcef8	ldr x9,[sp, #0xb0]
00bbcefc	sub x9,x20,x9
00bbcf00	cmp x24,x9
00bbcf04	b.hi 0x00bbd5f4
00bbcf08	ldr x9,[sp, #0x108]
00bbcf0c	sub x28,x8,x6
00bbcf10	mov x23,x0
00bbcf14	add x1,x9,x28
00bbcf18	add x8,x1,x19
00bbcf1c	cmp x8,x9
00bbcf20	b.ls 0x00bbcfa4
00bbcf24	neg x2,x28
00bbcf28	mov x0,x20
00bbcf2c	mov x22,x6
00bbcf30	bl 0x00c2ff60
00bbcf34	sub x20,x20,x28
00bbcf38	add x12,x28,x19
00bbcf3c	ldr x28,[sp, #0x80]
00bbcf40	ldr w5,[sp, #0xbc]
00bbcf44	ldr x7,[sp, #0x58]
00bbcf48	mov x0,x23
00bbcf4c	ldur x23,[x29, #-0x100]
00bbcf50	mov x8,x22
00bbcf54	b 0x00bbcf5c
00bbcf58	mov x12,x19
00bbcf5c	cmp x24,#0x10
00bbcf60	b.cc 0x00bbd2b0
00bbcf64	ldr q0,[x8]
00bbcf68	cmp x12,#0x11
00bbcf6c	str q0,[x20]
00bbcf70	b.cc 0x00bbc9cc
00bbcf74	ldr x22,[sp, #0xc0]
00bbcf78	add x9,x20,x12
00bbcf7c	add x10,x20,#0x10
00bbcf80	add x8,x8,#0x20
00bbcf84	ldur q0,[x8, #-0x10]
00bbcf88	str q0,[x10]
00bbcf8c	ldr q0,[x8], #0x20
00bbcf90	str q0,[x10, #0x10]
00bbcf94	add x10,x10,#0x20
00bbcf98	cmp x10,x9
00bbcf9c	b.cc 0x00bbcf84
00bbcfa0	b 0x00bbc9d0
00bbcfa4	mov x0,x20
00bbcfa8	mov x2,x19
00bbcfac	bl 0x00c2ff60
00bbcfb0	ldr x28,[sp, #0x80]
00bbcfb4	ldr x22,[sp, #0xc0]
00bbcfb8	mov x0,x23
00bbcfbc	ldr w5,[sp, #0xbc]
00bbcfc0	ldr x7,[sp, #0x58]
00bbcfc4	ldur x23,[x29, #-0x100]
00bbcfc8	b 0x00bbc9d0
00bbcfcc	ldr x1,[sp, #0x48]
00bbcfd0	ldr x4,[sp, #0x68]
00bbcfd4	mov x5,x6
00bbcfd8	ldr x6,[sp, #0xb0]
00bbcfdc	ldr x7,[sp, #0x108]
00bbcfe0	sub x2,x29,#0xe8
00bbcfe4	sub x3,x29,#0xf0
00bbcfe8	mov x0,x21
00bbcfec	stp x11,x20,[x29, #-0xe8]
00bbcff0	stur x19,[x29, #-0xd8]
00bbcff4	mov x27,x21
00bbcff8	bl 0x00bbf92c
00bbcffc	ldr x7,[sp, #0x58]
00bbd000	ldr w5,[sp, #0xbc]
00bbd004	ldr x28,[sp, #0x80]
00bbd008	b 0x00bbcd28
00bbd00c	ldr x1,[sp, #0x48]
00bbd010	ldr x5,[sp, #0x68]
00bbd014	sub x3,x29,#0xe8
00bbd018	ldr x7,[sp, #0xb0]
00bbd01c	ldr x8,[sp, #0x108]
00bbd020	sub x4,x29,#0xf0
00bbd024	mov x0,x21
00bbd028	stp x12,x20,[x29, #-0xe8]
00bbd02c	mov x27,x21
00bbd030	stur x24,[x29, #-0xd8]
00bbd034	str x8,[sp]
00bbd038	bl 0x00bc006c
00bbd03c	ldr x7,[sp, #0x58]
00bbd040	ldr w5,[sp, #0xbc]
00bbd044	b 0x00bbcd28
00bbd048	ldr q0,[x10, #0x10]
00bbd04c	cmp x11,#0x11
00bbd050	str q0,[x21, #0x10]
00bbd054	b.cc 0x00bbcaf0
00bbd058	add x11,x21,#0x20
00bbd05c	add x10,x10,#0x30
00bbd060	ldur q0,[x10, #-0x10]
00bbd064	str q0,[x11]
00bbd068	ldr q0,[x10], #0x20
00bbd06c	str q0,[x11, #0x10]
00bbd070	add x11,x11,#0x20
00bbd074	cmp x11,x28
00bbd078	b.cc 0x00bbd060
00bbd07c	b 0x00bbcaf0
00bbd080	ldp x4,x7,[sp, #0x100]
00bbd084	mov x5,x6
00bbd088	ldr x1,[sp, #0x48]
00bbd08c	ldr x6,[sp, #0xb0]
00bbd090	sub x2,x29,#0xe8
00bbd094	sub x3,x29,#0xf0
00bbd098	mov x0,x21
00bbd09c	stp x12,x19,[x29, #-0xe8]
00bbd0a0	stur x24,[x29, #-0xd8]
00bbd0a4	bl 0x00bbf92c
00bbd0a8	ldr x7,[sp, #0x58]
00bbd0ac	ldr w5,[sp, #0xbc]
00bbd0b0	b 0x00bbc9d0
00bbd0b4	mov x27,x21
00bbd0b8	cmp x19,#0x7
00bbd0bc	b.hi 0x00bbd1d8
00bbd0c0	ldrb w9,[x8]
00bbd0c4	adrp x10,0x364000
00bbd0c8	add x10,x10,#0xd10
00bbd0cc	ldrsw x10,[x10, x19, LSL #0x2]
00bbd0d0	strb w9,[x28]
00bbd0d4	ldrb w9,[x8, #0x1]
00bbd0d8	strb w9,[x28, #0x1]
00bbd0dc	ldrb w9,[x8, #0x2]
00bbd0e0	strb w9,[x28, #0x2]
00bbd0e4	ldrb w9,[x8, #0x3]
00bbd0e8	strb w9,[x28, #0x3]
00bbd0ec	adrp x9,0x364000
00bbd0f0	add x9,x9,#0xe10
00bbd0f4	ldr w9,[x9, x19, LSL #0x2]
00bbd0f8	add x8,x8,x9
00bbd0fc	ldr w9,[x8]
00bbd100	sub x8,x8,x10
00bbd104	str w9,[x28, #0x4]
00bbd108	b 0x00bbd1e0
00bbd10c	ldr q0,[x11, #0x10]
00bbd110	cmp x8,#0x11
00bbd114	str q0,[x21, #0x10]
00bbd118	b.cc 0x00bbcba0
00bbd11c	add x8,x21,#0x20
00bbd120	add x9,x11,#0x30
00bbd124	ldur q0,[x9, #-0x10]
00bbd128	str q0,[x8]
00bbd12c	ldr q0,[x9], #0x20
00bbd130	str q0,[x8, #0x10]
00bbd134	add x8,x8,#0x20
00bbd138	cmp x8,x19
00bbd13c	b.cc 0x00bbd124
00bbd140	b 0x00bbcba0
00bbd144	ldr x10,[sp, #0xf0]
00bbd148	cmp x9,#0x11
00bbd14c	ldr q0,[x10]
00bbd150	str q0,[x21, #0x10]
00bbd154	b.cc 0x00bbcee4
00bbd158	ldr x10,[sp, #0xd8]
00bbd15c	add x9,x21,#0x20
00bbd160	ldur q0,[x10, #-0x10]
00bbd164	str q0,[x9]
00bbd168	ldr q0,[x10], #0x20
00bbd16c	str q0,[x9, #0x10]
00bbd170	add x9,x9,#0x20
00bbd174	cmp x9,x20
00bbd178	b.cc 0x00bbd160
00bbd17c	b 0x00bbcee4
00bbd180	mov x27,x21
00bbd184	cmp x24,#0x7
00bbd188	b.hi 0x00bbd308
00bbd18c	ldrb w8,[x9]
00bbd190	adrp x10,0x364000
00bbd194	add x10,x10,#0xd10
00bbd198	ldrsw x10,[x10, x24, LSL #0x2]
00bbd19c	strb w8,[x19]
00bbd1a0	ldrb w8,[x9, #0x1]
00bbd1a4	strb w8,[x19, #0x1]
00bbd1a8	ldrb w8,[x9, #0x2]
00bbd1ac	strb w8,[x19, #0x2]
00bbd1b0	ldrb w8,[x9, #0x3]
00bbd1b4	strb w8,[x19, #0x3]
00bbd1b8	adrp x8,0x364000
00bbd1bc	add x8,x8,#0xe10
00bbd1c0	ldr w8,[x8, x24, LSL #0x2]
00bbd1c4	add x8,x9,x8
00bbd1c8	ldr w9,[x8]
00bbd1cc	str w9,[x19, #0x4]
00bbd1d0	sub x9,x8,x10
00bbd1d4	b 0x00bbd310
00bbd1d8	ldr x9,[x8]
00bbd1dc	str x9,[x28]
00bbd1e0	cmp x12,#0x9
00bbd1e4	b.cc 0x00bbd52c
00bbd1e8	add x11,x8,#0x8
00bbd1ec	add x10,x28,#0x8
00bbd1f0	add x9,x28,x12
00bbd1f4	sub x13,x10,x11
00bbd1f8	cmp x13,#0xf
00bbd1fc	b.gt 0x00bbd3e0
00bbd200	ldr x16,[sp, #0xc8]
00bbd204	cmp x19,x24
00bbd208	ldr x15,[sp, #0xe0]
00bbd20c	csel x14,x19,x24,cc
00bbd210	add x12,x20,x16
00bbd214	add x12,x12,x14
00bbd218	csel x14,x19,x24,hi
00bbd21c	add x12,x12,x14
00bbd220	add x15,x15,x14
00bbd224	sub x12,x12,x19
00bbd228	cmp x12,x15
00bbd22c	csel x12,x12,x15,hi
00bbd230	add x15,x14,x16
00bbd234	sub x12,x12,x15
00bbd238	sub x12,x12,#0x9
00bbd23c	cmp x12,#0x18
00bbd240	b.cc 0x00bbd29c
00bbd244	cmp x13,#0x20
00bbd248	b.cc 0x00bbd29c
00bbd24c	lsr x12,x12,#0x3
00bbd250	ldr x16,[sp, #0xd0]
00bbd254	sub x14,x14,x27
00bbd258	add x8,x8,#0x18
00bbd25c	add x12,x12,#0x1
00bbd260	add x16,x27,x16
00bbd264	and x13,x12,#0x3ffffffffffffffc
00bbd268	add x14,x16,x14
00bbd26c	lsl x15,x13,#0x3
00bbd270	add x10,x10,x15
00bbd274	add x11,x11,x15
00bbd278	mov x15,x13
00bbd27c	ldp q0,q1,[x8, #-0x10]
00bbd280	subs x15,x15,#0x4
00bbd284	add x8,x8,#0x20
00bbd288	stp q0,q1,[x14, #-0x10]
00bbd28c	add x14,x14,#0x20
00bbd290	b.ne 0x00bbd27c
00bbd294	cmp x12,x13
00bbd298	b.eq 0x00bbd52c
00bbd29c	ldr x8,[x11], #0x8
00bbd2a0	str x8,[x10], #0x8
00bbd2a4	cmp x10,x9
00bbd2a8	b.cc 0x00bbd29c
00bbd2ac	b 0x00bbd52c
00bbd2b0	mov x1,x0
00bbd2b4	cmp x24,#0x7
00bbd2b8	b.hi 0x00bbd41c
00bbd2bc	ldrb w9,[x8]
00bbd2c0	adrp x10,0x364000
00bbd2c4	add x10,x10,#0xd10
00bbd2c8	ldrsw x10,[x10, x24, LSL #0x2]
00bbd2cc	strb w9,[x20]
00bbd2d0	ldrb w9,[x8, #0x1]
00bbd2d4	strb w9,[x20, #0x1]
00bbd2d8	ldrb w9,[x8, #0x2]
00bbd2dc	strb w9,[x20, #0x2]
00bbd2e0	ldrb w9,[x8, #0x3]
00bbd2e4	strb w9,[x20, #0x3]
00bbd2e8	adrp x9,0x364000
00bbd2ec	add x9,x9,#0xe10
00bbd2f0	ldr w9,[x9, x24, LSL #0x2]
00bbd2f4	add x8,x8,x9
00bbd2f8	ldr w9,[x8]
00bbd2fc	sub x8,x8,x10
00bbd300	str w9,[x20, #0x4]
00bbd304	b 0x00bbd424
00bbd308	ldr x8,[x9]
00bbd30c	str x8,[x19]
00bbd310	cmp x12,#0x9
00bbd314	b.cc 0x00bbd52c
00bbd318	add x11,x9,#0x8
00bbd31c	add x10,x19,#0x8
00bbd320	add x8,x19,x12
00bbd324	sub x13,x10,x11
00bbd328	cmp x13,#0xf
00bbd32c	b.gt 0x00bbd4f4
00bbd330	ldr x16,[sp, #0xc8]
00bbd334	cmp x24,x26
00bbd338	ldr x15,[sp, #0xe0]
00bbd33c	csel x14,x24,x26,cc
00bbd340	add x12,x20,x16
00bbd344	add x12,x12,x14
00bbd348	csel x14,x24,x26,hi
00bbd34c	add x12,x12,x14
00bbd350	add x15,x15,x14
00bbd354	sub x12,x12,x24
00bbd358	cmp x12,x15
00bbd35c	csel x12,x12,x15,hi
00bbd360	add x15,x14,x16
00bbd364	sub x12,x12,x15
00bbd368	sub x12,x12,#0x9
00bbd36c	cmp x12,#0x18
00bbd370	b.cc 0x00bbd3cc
00bbd374	cmp x13,#0x20
00bbd378	b.cc 0x00bbd3cc
00bbd37c	lsr x12,x12,#0x3
00bbd380	ldr x16,[sp, #0xd0]
00bbd384	sub x14,x14,x27
00bbd388	add x9,x9,#0x18
00bbd38c	add x12,x12,#0x1
00bbd390	add x16,x27,x16
00bbd394	and x13,x12,#0x3ffffffffffffffc
00bbd398	add x14,x16,x14
00bbd39c	lsl x15,x13,#0x3
00bbd3a0	add x10,x10,x15
00bbd3a4	add x11,x11,x15
00bbd3a8	mov x15,x13
00bbd3ac	ldp q0,q1,[x9, #-0x10]
00bbd3b0	subs x15,x15,#0x4
00bbd3b4	add x9,x9,#0x20
00bbd3b8	stp q0,q1,[x14, #-0x10]
00bbd3bc	add x14,x14,#0x20
00bbd3c0	b.ne 0x00bbd3ac
00bbd3c4	cmp x12,x13
00bbd3c8	b.eq 0x00bbd52c
00bbd3cc	ldr x9,[x11], #0x8
00bbd3d0	str x9,[x10], #0x8
00bbd3d4	cmp x10,x8
00bbd3d8	b.cc 0x00bbd3cc
00bbd3dc	b 0x00bbd52c
00bbd3e0	sub x12,x12,#0x8
00bbd3e4	ldr q0,[x11]
00bbd3e8	cmp x12,#0x11
00bbd3ec	str q0,[x10]
00bbd3f0	b.cc 0x00bbd52c
00bbd3f4	add x10,x28,#0x18
00bbd3f8	add x8,x8,#0x28
00bbd3fc	ldur q0,[x8, #-0x10]
00bbd400	str q0,[x10]
00bbd404	ldr q0,[x8], #0x20
00bbd408	str q0,[x10, #0x10]
00bbd40c	add x10,x10,#0x20
00bbd410	cmp x10,x9
00bbd414	b.cc 0x00bbd3fc
00bbd418	b 0x00bbd52c
00bbd41c	ldr x9,[x8]
00bbd420	str x9,[x20]
00bbd424	cmp x12,#0x9
00bbd428	b.cc 0x00bbd570
00bbd42c	add x11,x8,#0x8
00bbd430	add x10,x20,#0x8
00bbd434	add x9,x20,x12
00bbd438	sub x13,x10,x11
00bbd43c	cmp x13,#0xf
00bbd440	b.gt 0x00bbd538
00bbd444	ldr x16,[sp, #0xc8]
00bbd448	cmp x24,x26
00bbd44c	ldr x15,[sp, #0xe0]
00bbd450	csel x14,x24,x26,cc
00bbd454	add x12,x19,x16
00bbd458	add x12,x12,x14
00bbd45c	csel x14,x24,x26,hi
00bbd460	add x12,x12,x14
00bbd464	add x15,x15,x14
00bbd468	sub x12,x12,x24
00bbd46c	cmp x12,x15
00bbd470	csel x12,x12,x15,hi
00bbd474	add x15,x14,x16
00bbd478	sub x12,x12,x15
00bbd47c	sub x12,x12,#0x9
00bbd480	cmp x12,#0x18
00bbd484	b.cc 0x00bbd4e0
00bbd488	cmp x13,#0x20
00bbd48c	b.cc 0x00bbd4e0
00bbd490	lsr x12,x12,#0x3
00bbd494	ldr x16,[sp, #0xd0]
00bbd498	sub x14,x14,x21
00bbd49c	add x8,x8,#0x18
00bbd4a0	add x12,x12,#0x1
00bbd4a4	add x16,x21,x16
00bbd4a8	and x13,x12,#0x3ffffffffffffffc
00bbd4ac	add x14,x16,x14
00bbd4b0	lsl x15,x13,#0x3
00bbd4b4	add x10,x10,x15
00bbd4b8	add x11,x11,x15
00bbd4bc	mov x15,x13
00bbd4c0	ldp q0,q1,[x8, #-0x10]
00bbd4c4	subs x15,x15,#0x4
00bbd4c8	add x8,x8,#0x20
00bbd4cc	stp q0,q1,[x14, #-0x10]
00bbd4d0	add x14,x14,#0x20
00bbd4d4	b.ne 0x00bbd4c0
00bbd4d8	cmp x12,x13
00bbd4dc	b.eq 0x00bbd570
00bbd4e0	ldr x8,[x11], #0x8
00bbd4e4	str x8,[x10], #0x8
00bbd4e8	cmp x10,x9
00bbd4ec	b.cc 0x00bbd4e0
00bbd4f0	b 0x00bbd570
00bbd4f4	sub x12,x12,#0x8
00bbd4f8	ldr q0,[x11]
00bbd4fc	cmp x12,#0x11
00bbd500	str q0,[x10]
00bbd504	b.cc 0x00bbd52c
00bbd508	add x10,x19,#0x18
00bbd50c	add x9,x9,#0x28
00bbd510	ldur q0,[x9, #-0x10]
00bbd514	str q0,[x10]
00bbd518	ldr q0,[x9], #0x20
00bbd51c	str q0,[x10, #0x10]
00bbd520	add x10,x10,#0x20
00bbd524	cmp x10,x8
00bbd528	b.cc 0x00bbd510
00bbd52c	ldr x28,[sp, #0x80]
00bbd530	ldr x22,[sp, #0xc0]
00bbd534	b 0x00bbcd1c
00bbd538	sub x12,x12,#0x8
00bbd53c	ldr q0,[x11]
00bbd540	cmp x12,#0x11
00bbd544	str q0,[x10]
00bbd548	b.cc 0x00bbd570
00bbd54c	add x10,x20,#0x18
00bbd550	add x8,x8,#0x28
00bbd554	ldur q0,[x8, #-0x10]
00bbd558	str q0,[x10]
00bbd55c	ldr q0,[x8], #0x20
00bbd560	str q0,[x10, #0x10]
00bbd564	add x10,x10,#0x20
00bbd568	cmp x10,x9
00bbd56c	b.cc 0x00bbd554
00bbd570	ldr x28,[sp, #0x80]
00bbd574	ldr x22,[sp, #0xc0]
00bbd578	mov x0,x1
00bbd57c	b 0x00bbcfbc
00bbd580	ldr x20,[sp, #0x38]
00bbd584	ldr x8,[x20, #0x28]
00bbd588	ldur x9,[x29, #-0x10]
00bbd58c	cmp x8,x9
00bbd590	b.ne 0x00bbd62c
00bbd594	add sp,sp,#0x210
00bbd598	ldp x20,x19,[sp, #0x50]
00bbd59c	ldp x22,x21,[sp, #0x40]
00bbd5a0	ldp x24,x23,[sp, #0x30]
00bbd5a4	ldp x26,x25,[sp, #0x20]
00bbd5a8	ldp x28,x27,[sp, #0x10]
00bbd5ac	ldp x29,x30,[sp], #0x60
00bbd5b0	ret
00bbd5b4	ldr x8,[sp, #0xf8]
00bbd5b8	ldur x1,[x29, #-0xf0]
00bbd5bc	ldr x9,[sp, #0xe8]
00bbd5c0	ldr x20,[sp, #0x38]
00bbd5c4	ldr x24,[sp, #0x28]
00bbd5c8	ldr x23,[sp, #0x48]
00bbd5cc	stp w7,w8,[x22]
00bbd5d0	ldr w8,[x22, #0xe64]
00bbd5d4	ldr x14,[sp, #0x68]
00bbd5d8	str w9,[x22, #0x8]
00bbd5dc	cmp w8,#0x2
00bbd5e0	b.eq 0x00bbb1c4
00bbd5e4	b 0x00bbb1f8
00bbd5e8	ldr x20,[sp, #0x38]
00bbd5ec	mov x0,#-0x46
00bbd5f0	b 0x00bbd584
00bbd5f4	ldr x20,[sp, #0x38]
00bbd5f8	mov x0,#-0x14
00bbd5fc	b 0x00bbd584
00bbd600	adrp x16,0x789000
00bbd604	add x16,x16,#0xab0
00bbd608	mov x4,x9
00bbd60c	b 0x00bbb334
00bbd610	adrp x20,0x789000
00bbd614	add x20,x20,#0xab0
00bbd618	b 0x00bbb3c4
00bbd61c	adrp x20,0x789000
00bbd620	add x20,x20,#0xab0
00bbd624	mov x15,x2
00bbd628	b 0x00bbb448
00bbd62c	bl 0x00c2fec0
