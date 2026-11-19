; mbedtls_internal_sha1_process @ 00bab204
00bab204	sub sp,sp,#0x110
00bab208	stp x28,x27,[sp, #0xb0]
00bab20c	stp x26,x25,[sp, #0xc0]
00bab210	stp x24,x23,[sp, #0xd0]
00bab214	stp x22,x21,[sp, #0xe0]
00bab218	stp x20,x19,[sp, #0xf0]
00bab21c	stp x29,x30,[sp, #0x100]
00bab220	add x29,sp,#0x100
00bab224	mrs x8,tpidr_el0
00bab228	str x8,[sp, #0x40]
00bab22c	ldr x8,[x8, #0x28]
00bab230	mov x16,x0
00bab234	stur x8,[x29, #-0x60]
00bab238	ldp w8,w9,[x1]
00bab23c	rev w15,w8
00bab240	rev w17,w9
00bab244	stp w15,w17,[sp, #0x4c]
00bab248	ldr w10,[x1, #0x8]
00bab24c	rev w11,w10
00bab250	str w11,[sp, #0x20]
00bab254	str w11,[sp, #0x54]
00bab258	ldp w11,w12,[x1, #0xc]
00bab25c	eor w27,w10,w8
00bab260	rev w6,w11
00bab264	rev w5,w12
00bab268	stp w6,w5,[sp, #0x58]
00bab26c	ldp w13,w7,[x1, #0x14]
00bab270	eor w25,w11,w9
00bab274	eor w23,w12,w10
00bab278	rev w4,w13
00bab27c	rev w3,w7
00bab280	stp w4,w3,[sp, #0x60]
00bab284	ldp w26,w24,[x1, #0x1c]
00bab288	eor w12,w7,w12
00bab28c	rev w2,w26
00bab290	rev w18,w24
00bab294	stp w2,w18,[sp, #0x68]
00bab298	ldp w22,w20,[x1, #0x24]
00bab29c	eor w21,w27,w24
00bab2a0	eor w0,w26,w13
00bab2a4	str x16,[sp, #0x38]
00bab2a8	rev w8,w22
00bab2ac	rev w9,w20
00bab2b0	str w8,[sp, #0x70]
00bab2b4	str w9,[sp, #0x74]
00bab2b8	str w9,[sp, #0x14]
00bab2bc	ldr w28,[x1, #0x2c]
00bab2c0	eor w9,w24,w7
00bab2c4	ldr w7,[x1, #0x30]
00bab2c8	str w9,[sp, #0x34]
00bab2cc	rev w9,w28
00bab2d0	str w8,[sp, #0x18]
00bab2d4	rev w27,w7
00bab2d8	eor w8,w13,w11
00bab2dc	str w9,[sp, #0x1c]
00bab2e0	stp w9,w27,[sp, #0x78]
00bab2e4	eor w9,w20,w24
00bab2e8	ldr w10,[x1, #0x34]
00bab2ec	str w9,[sp, #0xc]
00bab2f0	eor w9,w23,w20
00bab2f4	ldr w23,[x1, #0x38]
00bab2f8	eor w13,w8,w28
00bab2fc	ldr w8,[sp, #0x34]
00bab300	eor w25,w25,w22
00bab304	rev w30,w10
00bab308	eor w19,w23,w7
00bab30c	eor w14,w25,w23
00bab310	eor w25,w8,w23
00bab314	rev w23,w23
00bab318	stp w30,w23,[sp, #0x80]
00bab31c	ldr w8,[x1, #0x3c]
00bab320	eor w11,w22,w26
00bab324	eor w22,w28,w22
00bab328	eor w26,w10,w28
00bab32c	eor w21,w21,w10
00bab330	eor w28,w0,w10
00bab334	eor w10,w8,w10
00bab338	rev w0,w8
00bab33c	str w10,[sp, #0x10]
00bab340	str w0,[sp, #0x88]
00bab344	eor w20,w7,w20
00bab348	eor w12,w12,w7
00bab34c	eor w7,w9,w8
00bab350	eor w24,w11,w8
00bab354	ldp w9,w8,[x16, #0x10]
00bab358	ldp w1,w10,[x16, #0x8]
00bab35c	rev w14,w14
00bab360	rev w12,w12
00bab364	stp w9,w8,[sp, #0x28]
00bab368	ldr w16,[x16, #0x18]
00bab36c	ror w11,w1,#0x1b
00bab370	add w11,w15,w11
00bab374	eor w15,w8,w9
00bab378	and w15,w15,w10
00bab37c	eor w15,w15,w8
00bab380	add w11,w11,w16
00bab384	add w11,w11,w15
00bab388	add w15,w17,w8
00bab38c	ror w8,w10,#0x2
00bab390	eor w17,w8,w9
00bab394	and w17,w17,w1
00bab398	eor w17,w17,w9
00bab39c	add w15,w15,w17
00bab3a0	mov w17,#0x7999
00bab3a4	movk w17,#0x5a82, LSL #16
00bab3a8	add w11,w11,w17
00bab3ac	stp w10,w1,[sp, #0x30]
00bab3b0	mov w10,w1
00bab3b4	ror w1,w11,#0x1b
00bab3b8	add w15,w15,w1
00bab3bc	add w1,w6,w8
00bab3c0	ror w6,w10,#0x2
00bab3c4	ldr w10,[sp, #0x20]
00bab3c8	str w16,[sp, #0x24]
00bab3cc	eor w16,w8,w6
00bab3d0	and w16,w11,w16
00bab3d4	eor w8,w16,w8
00bab3d8	add w16,w10,w9
00bab3dc	add w15,w15,w17
00bab3e0	add w8,w16,w8
00bab3e4	ror w16,w15,#0x1b
00bab3e8	ror w11,w11,#0x2
00bab3ec	add w8,w8,w16
00bab3f0	add w16,w5,w6
00bab3f4	eor w5,w11,w6
00bab3f8	and w5,w15,w5
00bab3fc	eor w5,w5,w6
00bab400	add w8,w8,w17
00bab404	add w1,w1,w5
00bab408	ror w5,w8,#0x1b
00bab40c	ror w15,w15,#0x2
00bab410	add w1,w1,w5
00bab414	eor w5,w15,w11
00bab418	and w5,w8,w5
00bab41c	add w4,w4,w11
00bab420	eor w11,w5,w11
00bab424	add w11,w16,w11
00bab428	add w16,w1,w17
00bab42c	ror w1,w16,#0x1b
00bab430	ror w8,w8,#0x2
00bab434	add w11,w11,w1
00bab438	add w1,w3,w15
00bab43c	eor w3,w8,w15
00bab440	and w3,w16,w3
00bab444	eor w15,w3,w15
00bab448	add w11,w11,w17
00bab44c	add w15,w4,w15
00bab450	ror w3,w11,#0x1b
00bab454	ror w16,w16,#0x2
00bab458	add w15,w15,w3
00bab45c	eor w3,w16,w8
00bab460	and w3,w11,w3
00bab464	add w2,w2,w8
00bab468	eor w8,w3,w8
00bab46c	add w15,w15,w17
00bab470	add w8,w1,w8
00bab474	ror w1,w15,#0x1b
00bab478	ror w11,w11,#0x2
00bab47c	add w8,w8,w1
00bab480	eor w1,w11,w16
00bab484	ldr w9,[sp, #0x18]
00bab488	and w1,w15,w1
00bab48c	add w18,w18,w16
00bab490	eor w16,w1,w16
00bab494	add w8,w8,w17
00bab498	add w16,w2,w16
00bab49c	ror w1,w8,#0x1b
00bab4a0	ror w15,w15,#0x2
00bab4a4	add w16,w16,w1
00bab4a8	add w1,w9,w11
00bab4ac	eor w2,w15,w11
00bab4b0	ldr w9,[sp, #0x14]
00bab4b4	and w2,w8,w2
00bab4b8	eor w11,w2,w11
00bab4bc	add w16,w16,w17
00bab4c0	ror w8,w8,#0x2
00bab4c4	add w11,w18,w11
00bab4c8	ror w18,w16,#0x1b
00bab4cc	eor w2,w8,w15
00bab4d0	add w11,w11,w18
00bab4d4	add w18,w9,w15
00bab4d8	and w2,w16,w2
00bab4dc	ldr w9,[sp, #0x1c]
00bab4e0	eor w15,w2,w15
00bab4e4	add w11,w11,w17
00bab4e8	ror w16,w16,#0x2
00bab4ec	add w15,w1,w15
00bab4f0	ror w1,w11,#0x1b
00bab4f4	eor w2,w16,w8
00bab4f8	add w15,w15,w1
00bab4fc	and w2,w11,w2
00bab500	add w1,w9,w8
00bab504	eor w8,w2,w8
00bab508	add w15,w15,w17
00bab50c	add w8,w18,w8
00bab510	ror w18,w15,#0x1b
00bab514	ror w11,w11,#0x2
00bab518	add w8,w8,w18
00bab51c	eor w18,w11,w16
00bab520	and w18,w15,w18
00bab524	add w4,w27,w16
00bab528	eor w16,w18,w16
00bab52c	add w8,w8,w17
00bab530	add w16,w1,w16
00bab534	ror w18,w8,#0x1b
00bab538	ror w15,w15,#0x2
00bab53c	add w1,w16,w18
00bab540	eor w16,w15,w11
00bab544	and w16,w8,w16
00bab548	ror w3,w14,#0x1f
00bab54c	rev w10,w7
00bab550	add w5,w30,w11
00bab554	eor w11,w16,w11
00bab558	rev w16,w21
00bab55c	eor w12,w12,w3
00bab560	ror w18,w10,#0x1f
00bab564	add w10,w1,w17
00bab568	ror w2,w16,#0x1f
00bab56c	ror w16,w12,#0x1f
00bab570	ror w8,w8,#0x2
00bab574	add w11,w4,w11
00bab578	ror w12,w10,#0x1b
00bab57c	add w11,w11,w12
00bab580	eor w12,w8,w15
00bab584	and w12,w10,w12
00bab588	eor w12,w12,w15
00bab58c	add w11,w11,w17
00bab590	add w14,w23,w15
00bab594	ror w10,w10,#0x2
00bab598	add w12,w5,w12
00bab59c	ror w15,w11,#0x1b
00bab5a0	add w12,w12,w15
00bab5a4	eor w15,w10,w8
00bab5a8	and w15,w11,w15
00bab5ac	eor w15,w15,w8
00bab5b0	add w12,w12,w17
00bab5b4	ror w11,w11,#0x2
00bab5b8	add w14,w14,w15
00bab5bc	ror w15,w12,#0x1b
00bab5c0	add w14,w14,w15
00bab5c4	eor w15,w11,w10
00bab5c8	and w15,w12,w15
00bab5cc	add w8,w0,w8
00bab5d0	eor w15,w15,w10
00bab5d4	add w14,w14,w17
00bab5d8	ror w12,w12,#0x2
00bab5dc	add w8,w8,w15
00bab5e0	ror w15,w14,#0x1b
00bab5e4	add w8,w8,w15
00bab5e8	eor w15,w12,w11
00bab5ec	and w15,w14,w15
00bab5f0	add w10,w2,w10
00bab5f4	eor w15,w15,w11
00bab5f8	add w8,w8,w17
00bab5fc	ror w14,w14,#0x2
00bab600	add w10,w10,w15
00bab604	ror w15,w8,#0x1b
00bab608	add w10,w10,w15
00bab60c	eor w15,w14,w12
00bab610	and w15,w8,w15
00bab614	add w11,w3,w11
00bab618	eor w15,w15,w12
00bab61c	add w10,w10,w17
00bab620	ror w8,w8,#0x2
00bab624	add w11,w11,w15
00bab628	ror w15,w10,#0x1b
00bab62c	add w11,w11,w15
00bab630	eor w15,w8,w14
00bab634	and w15,w10,w15
00bab638	add w12,w18,w12
00bab63c	eor w15,w15,w14
00bab640	add w11,w11,w17
00bab644	rev w13,w13
00bab648	ror w10,w10,#0x2
00bab64c	add w12,w12,w15
00bab650	ror w15,w11,#0x1b
00bab654	eor w13,w13,w2
00bab658	add w12,w12,w15
00bab65c	eor w15,w10,w8
00bab660	ror w13,w13,#0x1f
00bab664	and w15,w11,w15
00bab668	add w14,w13,w14
00bab66c	eor w1,w15,w8
00bab670	add w6,w12,w17
00bab674	ror w15,w11,#0x2
00bab678	add w11,w14,w1
00bab67c	ror w12,w6,#0x1b
00bab680	add w11,w11,w12
00bab684	eor w12,w15,w10
00bab688	add w8,w16,w8
00bab68c	eor w12,w12,w6
00bab690	add w27,w8,w12
00bab694	ldr w8,[sp, #0xc]
00bab698	rev w1,w22
00bab69c	rev w4,w26
00bab6a0	rev w5,w20
00bab6a4	rev w8,w8
00bab6a8	eor w12,w8,w2
00bab6ac	rev w8,w25
00bab6b0	eor w8,w8,w13
00bab6b4	ror w7,w8,#0x1f
00bab6b8	eor w8,w1,w3
00bab6bc	eor w20,w4,w13
00bab6c0	rev w22,w19
00bab6c4	eor w4,w2,w23
00bab6c8	eor w8,w8,w7
00bab6cc	eor w19,w4,w7
00bab6d0	ror w4,w8,#0x1f
00bab6d4	eor w8,w22,w16
00bab6d8	rev w21,w28
00bab6dc	eor w8,w8,w4
00bab6e0	eor w9,w3,w0
00bab6e4	stp w2,w3,[sp, #0x4c]
00bab6e8	eor w1,w13,w3
00bab6ec	eor w3,w21,w18
00bab6f0	eor w21,w5,w18
00bab6f4	ror w5,w8,#0x1f
00bab6f8	ldr w8,[sp, #0x10]
00bab6fc	rev w0,w24
00bab700	eor w0,w0,w16
00bab704	ror w0,w0,#0x1f
00bab708	add w11,w11,w17
00bab70c	mov w14,#0xeba1
00bab710	rev w22,w8
00bab714	eor w8,w21,w0
00bab718	ror w21,w6,#0x2
00bab71c	ror w17,w11,#0x1b
00bab720	movk w14,#0x6ed9, LSL #16
00bab724	ror w3,w3,#0x1f
00bab728	add w17,w27,w17
00bab72c	eor w6,w21,w15
00bab730	eor w9,w9,w0
00bab734	add w10,w3,w10
00bab738	eor w6,w6,w11
00bab73c	add w24,w17,w14
00bab740	add w10,w10,w6
00bab744	ror w17,w24,#0x1b
00bab748	eor w12,w12,w3
00bab74c	ror w8,w8,#0x1f
00bab750	eor w6,w22,w3
00bab754	eor w9,w9,w5
00bab758	stp w18,w13,[sp, #0x54]
00bab75c	eor w2,w18,w2
00bab760	eor w18,w16,w18
00bab764	add w10,w10,w17
00bab768	eor w17,w4,w0
00bab76c	eor w23,w3,w13
00bab770	ror w12,w12,#0x1f
00bab774	eor w13,w6,w8
00bab778	ror w6,w9,#0x1f
00bab77c	ror w11,w11,#0x2
00bab780	eor w9,w18,w8
00bab784	eor w18,w20,w12
00bab788	eor w20,w17,w6
00bab78c	eor w17,w11,w21
00bab790	add w15,w7,w15
00bab794	eor w17,w17,w24
00bab798	add w25,w10,w14
00bab79c	add w15,w15,w17
00bab7a0	ror w10,w25,#0x1b
00bab7a4	eor w22,w0,w3
00bab7a8	ror w13,w13,#0x1f
00bab7ac	eor w2,w2,w12
00bab7b0	eor w9,w9,w6
00bab7b4	add w26,w15,w10
00bab7b8	ror w10,w18,#0x1f
00bab7bc	stp w3,w7,[sp, #0x60]
00bab7c0	eor w17,w2,w13
00bab7c4	ror w3,w9,#0x1f
00bab7c8	eor w9,w22,w13
00bab7cc	eor w18,w19,w10
00bab7d0	eor w1,w1,w4
00bab7d4	eor w15,w8,w12
00bab7d8	ror w22,w17,#0x1f
00bab7dc	eor w17,w23,w10
00bab7e0	eor w9,w9,w3
00bab7e4	ror w23,w18,#0x1f
00bab7e8	str w16,[sp, #0x5c]
00bab7ec	eor w16,w7,w16
00bab7f0	eor w7,w12,w7
00bab7f4	eor w18,w17,w22
00bab7f8	ror w17,w9,#0x1f
00bab7fc	eor w9,w15,w22
00bab800	eor w15,w1,w23
00bab804	eor w16,w16,w5
00bab808	ror w2,w18,#0x1f
00bab80c	eor w18,w7,w23
00bab810	eor w9,w9,w17
00bab814	ror w7,w15,#0x1f
00bab818	stp w0,w12,[sp, #0x68]
00bab81c	add w0,w0,w21
00bab820	ror w21,w9,#0x1f
00bab824	eor w9,w16,w7
00bab828	ror w1,w9,#0x1f
00bab82c	eor w15,w18,w2
00bab830	eor w9,w20,w1
00bab834	ror w16,w15,#0x1f
00bab838	ror w15,w9,#0x1f
00bab83c	add w9,w12,w11
00bab840	ror w12,w24,#0x2
00bab844	eor w11,w12,w11
00bab848	eor w11,w11,w25
00bab84c	add w18,w26,w14
00bab850	add w11,w0,w11
00bab854	ror w0,w18,#0x1b
00bab858	ror w19,w25,#0x2
00bab85c	add w11,w11,w0
00bab860	add w0,w4,w12
00bab864	eor w12,w19,w12
00bab868	eor w12,w12,w18
00bab86c	add w11,w11,w14
00bab870	add w9,w9,w12
00bab874	ror w12,w11,#0x1b
00bab878	ror w18,w18,#0x2
00bab87c	add w9,w9,w12
00bab880	add w12,w8,w19
00bab884	eor w19,w18,w19
00bab888	eor w19,w19,w11
00bab88c	add w9,w9,w14
00bab890	add w0,w0,w19
00bab894	ror w19,w9,#0x1b
00bab898	ror w11,w11,#0x2
00bab89c	add w0,w0,w19
00bab8a0	add w19,w10,w18
00bab8a4	eor w18,w11,w18
00bab8a8	eor w18,w18,w9
00bab8ac	add w12,w12,w18
00bab8b0	add w18,w0,w14
00bab8b4	ror w0,w18,#0x1b
00bab8b8	ror w9,w9,#0x2
00bab8bc	add w12,w12,w0
00bab8c0	add w0,w5,w11
00bab8c4	eor w11,w9,w11
00bab8c8	eor w11,w11,w18
00bab8cc	add w12,w12,w14
00bab8d0	add w11,w19,w11
00bab8d4	ror w19,w12,#0x1b
00bab8d8	ror w18,w18,#0x2
00bab8dc	add w11,w11,w19
00bab8e0	add w19,w13,w9
00bab8e4	eor w9,w18,w9
00bab8e8	eor w9,w9,w12
00bab8ec	add w11,w11,w14
00bab8f0	add w9,w0,w9
00bab8f4	ror w0,w11,#0x1b
00bab8f8	ror w12,w12,#0x2
00bab8fc	add w9,w9,w0
00bab900	add w0,w23,w18
00bab904	eor w18,w12,w18
00bab908	eor w18,w18,w11
00bab90c	add w9,w9,w14
00bab910	add w18,w19,w18
00bab914	ror w19,w9,#0x1b
00bab918	ror w11,w11,#0x2
00bab91c	add w18,w18,w19
00bab920	add w19,w6,w12
00bab924	eor w12,w11,w12
00bab928	eor w12,w12,w9
00bab92c	add w18,w18,w14
00bab930	add w12,w0,w12
00bab934	ror w0,w18,#0x1b
00bab938	ror w9,w9,#0x2
00bab93c	add w12,w12,w0
00bab940	add w0,w22,w11
00bab944	eor w11,w9,w11
00bab948	eor w11,w11,w18
00bab94c	add w12,w12,w14
00bab950	add w11,w19,w11
00bab954	ror w19,w12,#0x1b
00bab958	ror w18,w18,#0x2
00bab95c	add w11,w11,w19
00bab960	add w19,w7,w9
00bab964	eor w9,w18,w9
00bab968	eor w9,w9,w12
00bab96c	add w11,w11,w14
00bab970	add w9,w0,w9
00bab974	ror w0,w11,#0x1b
00bab978	ror w12,w12,#0x2
00bab97c	add w9,w9,w0
00bab980	add w0,w3,w18
00bab984	eor w18,w12,w18
00bab988	eor w18,w18,w11
00bab98c	add w9,w9,w14
00bab990	add w18,w19,w18
00bab994	ror w19,w9,#0x1b
00bab998	ror w11,w11,#0x2
00bab99c	add w18,w18,w19
00bab9a0	add w19,w2,w12
00bab9a4	eor w12,w11,w12
00bab9a8	eor w12,w12,w9
00bab9ac	add w18,w18,w14
00bab9b0	add w12,w0,w12
00bab9b4	ror w0,w18,#0x1b
00bab9b8	ror w9,w9,#0x2
00bab9bc	add w12,w12,w0
00bab9c0	add w0,w1,w11
00bab9c4	eor w11,w9,w11
00bab9c8	eor w11,w11,w18
00bab9cc	add w12,w12,w14
00bab9d0	add w11,w19,w11
00bab9d4	ror w19,w12,#0x1b
00bab9d8	ror w18,w18,#0x2
00bab9dc	add w11,w11,w19
00bab9e0	add w19,w17,w9
00bab9e4	eor w9,w18,w9
00bab9e8	eor w9,w9,w12
00bab9ec	add w11,w11,w14
00bab9f0	add w9,w0,w9
00bab9f4	ror w0,w11,#0x1b
00bab9f8	ror w12,w12,#0x2
00bab9fc	add w9,w9,w0
00baba00	add w0,w16,w18
00baba04	eor w18,w12,w18
00baba08	eor w18,w18,w11
00baba0c	add w9,w9,w14
00baba10	add w18,w19,w18
00baba14	ror w19,w9,#0x1b
00baba18	ror w11,w11,#0x2
00baba1c	add w18,w18,w19
00baba20	add w19,w15,w12
00baba24	eor w12,w11,w12
00baba28	eor w12,w12,w9
00baba2c	add w18,w18,w14
00baba30	add w12,w0,w12
00baba34	ror w0,w18,#0x1b
00baba38	ror w9,w9,#0x2
00baba3c	add w12,w12,w0
00baba40	add w0,w21,w11
00baba44	eor w11,w9,w11
00baba48	eor w11,w11,w18
00baba4c	add w12,w12,w14
00baba50	ror w24,w18,#0x2
00baba54	add w11,w19,w11
00baba58	ror w18,w12,#0x1b
00baba5c	add w11,w11,w18
00baba60	add w11,w11,w14
00baba64	orr w14,w12,w24
00baba68	and w18,w12,w24
00baba6c	and w14,w14,w9
00baba70	orr w14,w14,w18
00baba74	ror w12,w12,#0x2
00baba78	ror w18,w11,#0x1b
00baba7c	add w14,w0,w14
00baba80	add w14,w14,w18
00baba84	orr w18,w11,w12
00baba88	stp w4,w8,[sp, #0x70]
00baba8c	eor w4,w10,w4
00baba90	and w0,w11,w12
00baba94	and w18,w18,w24
00baba98	eor w4,w4,w7
00baba9c	orr w0,w18,w0
00babaa0	mov w18,#0xbcdc
00babaa4	eor w4,w4,w16
00babaa8	movk w18,#0x8f1b, LSL #16
00babaac	ror w20,w4,#0x1f
00babab0	add w9,w20,w9
00babab4	add w14,w14,w18
00babab8	eor w8,w5,w8
00bababc	ror w11,w11,#0x2
00babac0	add w9,w9,w0
00babac4	ror w0,w14,#0x1b
00babac8	eor w8,w8,w3
00babacc	add w9,w9,w0
00babad0	orr w0,w14,w11
00babad4	eor w8,w8,w15
00babad8	and w0,w0,w12
00babadc	and w4,w14,w11
00babae0	ror w28,w8,#0x1f
00babae4	orr w0,w0,w4
00babae8	add w8,w28,w24
00babaec	add w9,w9,w18
00babaf0	ror w14,w14,#0x2
00babaf4	add w8,w8,w0
00babaf8	ror w0,w9,#0x1b
00babafc	stp w10,w5,[sp, #0x78]
00babb00	eor w10,w13,w10
00babb04	add w8,w8,w0
00babb08	orr w0,w9,w14
00babb0c	eor w10,w10,w2
00babb10	and w0,w0,w11
00babb14	and w4,w9,w14
00babb18	eor w10,w10,w21
00babb1c	orr w0,w0,w4
00babb20	ror w4,w10,#0x1f
00babb24	add w10,w4,w12
00babb28	add w12,w8,w18
00babb2c	ror w9,w9,#0x2
00babb30	add w8,w10,w0
00babb34	ror w10,w12,#0x1b
00babb38	add w10,w8,w10
00babb3c	orr w8,w12,w9
00babb40	and w8,w8,w14
00babb44	and w0,w12,w9
00babb48	orr w0,w8,w0
00babb4c	eor w8,w23,w5
00babb50	eor w8,w8,w1
00babb54	eor w8,w8,w20
00babb58	ror w8,w8,#0x1f
00babb5c	add w11,w8,w11
00babb60	add w10,w10,w18
00babb64	ror w12,w12,#0x2
00babb68	add w11,w11,w0
00babb6c	ror w0,w10,#0x1b
00babb70	stp w13,w23,[sp, #0x80]
00babb74	eor w13,w6,w13
00babb78	add w11,w11,w0
00babb7c	orr w0,w10,w12
00babb80	eor w13,w13,w17
00babb84	and w0,w0,w9
00babb88	and w5,w10,w12
00babb8c	eor w13,w13,w28
00babb90	orr w0,w0,w5
00babb94	ror w5,w13,#0x1f
00babb98	add w13,w5,w14
00babb9c	add w11,w11,w18
00babba0	ror w10,w10,#0x2
00babba4	add w13,w13,w0
00babba8	ror w14,w11,#0x1b
00babbac	add w14,w13,w14
00babbb0	orr w13,w11,w10
00babbb4	and w13,w13,w12
00babbb8	and w0,w11,w10
00babbbc	orr w0,w13,w0
00babbc0	eor w13,w22,w23
00babbc4	eor w13,w13,w16
00babbc8	eor w13,w13,w4
00babbcc	ror w13,w13,#0x1f
00babbd0	add w9,w13,w9
00babbd4	add w14,w14,w18
00babbd8	str w6,[sp, #0x88]
00babbdc	eor w6,w7,w6
00babbe0	ror w11,w11,#0x2
00babbe4	add w9,w9,w0
00babbe8	ror w0,w14,#0x1b
00babbec	eor w6,w6,w15
00babbf0	add w9,w9,w0
00babbf4	orr w0,w14,w11
00babbf8	eor w6,w6,w8
00babbfc	and w0,w0,w10
00babc00	and w19,w14,w11
00babc04	ror w26,w6,#0x1f
00babc08	orr w0,w0,w19
00babc0c	add w12,w26,w12
00babc10	add w9,w9,w18
00babc14	ror w14,w14,#0x2
00babc18	add w12,w12,w0
00babc1c	ror w0,w9,#0x1b
00babc20	add w12,w12,w0
00babc24	orr w0,w9,w14
00babc28	and w0,w0,w11
00babc2c	and w6,w9,w14
00babc30	orr w0,w0,w6
00babc34	eor w6,w3,w22
00babc38	eor w6,w6,w21
00babc3c	eor w6,w6,w5
00babc40	ror w30,w6,#0x1f
00babc44	add w10,w30,w10
00babc48	add w12,w12,w18
00babc4c	ror w9,w9,#0x2
00babc50	add w10,w10,w0
00babc54	ror w0,w12,#0x1b
00babc58	add w10,w10,w0
00babc5c	orr w0,w12,w9
00babc60	and w0,w0,w14
00babc64	and w6,w12,w9
00babc68	orr w0,w0,w6
00babc6c	eor w6,w2,w7
00babc70	eor w6,w6,w20
00babc74	eor w6,w6,w13
00babc78	stp w22,w7,[sp, #0x4c]
00babc7c	ror w22,w6,#0x1f
00babc80	add w11,w22,w11
00babc84	add w10,w10,w18
00babc88	stp w3,w2,[sp, #0x54]
00babc8c	eor w3,w1,w3
00babc90	ror w12,w12,#0x2
00babc94	add w11,w11,w0
00babc98	ror w0,w10,#0x1b
00babc9c	eor w3,w3,w28
00babca0	add w11,w11,w0
00babca4	orr w0,w10,w12
00babca8	eor w3,w3,w26
00babcac	and w0,w0,w9
00babcb0	and w6,w10,w12
00babcb4	ror w27,w3,#0x1f
00babcb8	orr w0,w0,w6
00babcbc	add w14,w27,w14
00babcc0	add w11,w11,w18
00babcc4	eor w2,w17,w2
00babcc8	ror w10,w10,#0x2
00babccc	add w14,w14,w0
00babcd0	ror w0,w11,#0x1b
00babcd4	eor w2,w2,w4
00babcd8	add w14,w14,w0
00babcdc	orr w0,w11,w10
00babce0	eor w2,w2,w30
00babce4	and w0,w0,w12
00babce8	and w3,w11,w10
00babcec	ror w25,w2,#0x1f
00babcf0	orr w0,w0,w3
00babcf4	add w9,w25,w9
00babcf8	add w14,w14,w18
00babcfc	stp w1,w17,[sp, #0x5c]
00babd00	eor w1,w16,w1
00babd04	ror w11,w11,#0x2
00babd08	add w9,w9,w0
00babd0c	ror w0,w14,#0x1b
00babd10	eor w1,w1,w8
00babd14	add w9,w9,w0
00babd18	orr w0,w14,w11
00babd1c	eor w1,w1,w22
00babd20	and w0,w0,w10
00babd24	and w2,w14,w11
00babd28	ror w24,w1,#0x1f
00babd2c	orr w0,w0,w2
00babd30	add w12,w24,w12
00babd34	add w9,w9,w18
00babd38	ror w1,w14,#0x2
00babd3c	add w12,w12,w0
00babd40	ror w14,w9,#0x1b
00babd44	add w12,w12,w14
00babd48	orr w14,w9,w1
00babd4c	and w14,w14,w11
00babd50	and w0,w9,w1
00babd54	orr w0,w14,w0
00babd58	eor w14,w15,w17
00babd5c	eor w14,w14,w5
00babd60	eor w14,w14,w27
00babd64	ror w14,w14,#0x1f
00babd68	add w10,w14,w10
00babd6c	add w12,w12,w18
00babd70	stp w16,w15,[sp, #0x64]
00babd74	eor w16,w21,w16
00babd78	ror w9,w9,#0x2
00babd7c	add w10,w10,w0
00babd80	ror w17,w12,#0x1b
00babd84	eor w16,w16,w13
00babd88	add w10,w10,w17
00babd8c	orr w17,w12,w9
00babd90	eor w16,w16,w25
00babd94	and w17,w17,w1
00babd98	and w0,w12,w9
00babd9c	ror w23,w16,#0x1f
00babda0	orr w17,w17,w0
00babda4	add w11,w23,w11
00babda8	add w10,w10,w18
00babdac	eor w15,w20,w15
00babdb0	ror w12,w12,#0x2
00babdb4	add w11,w11,w17
00babdb8	ror w16,w10,#0x1b
00babdbc	eor w15,w15,w26
00babdc0	add w11,w11,w16
00babdc4	orr w16,w10,w12
00babdc8	eor w15,w15,w24
00babdcc	and w16,w16,w9
00babdd0	and w17,w10,w12
00babdd4	ror w15,w15,#0x1f
00babdd8	orr w16,w16,w17
00babddc	add w17,w15,w1
00babde0	add w11,w11,w18
00babde4	ror w10,w10,#0x2
00babde8	add w16,w17,w16
00babdec	ror w17,w11,#0x1b
00babdf0	add w16,w16,w17
00babdf4	orr w17,w11,w10
00babdf8	and w17,w17,w12
00babdfc	and w0,w11,w10
00babe00	orr w17,w17,w0
00babe04	eor w0,w28,w21
00babe08	eor w0,w0,w30
00babe0c	eor w0,w0,w14
00babe10	stp w21,w20,[sp, #0x6c]
00babe14	ror w21,w0,#0x1f
00babe18	add w9,w21,w9
00babe1c	add w0,w16,w18
00babe20	ror w11,w11,#0x2
00babe24	add w9,w9,w17
00babe28	ror w16,w0,#0x1b
00babe2c	add w9,w9,w16
00babe30	orr w16,w0,w11
00babe34	and w16,w16,w10
00babe38	and w17,w0,w11
00babe3c	orr w17,w16,w17
00babe40	eor w16,w4,w20
00babe44	eor w16,w16,w22
00babe48	eor w16,w16,w23
00babe4c	ror w16,w16,#0x1f
00babe50	add w12,w16,w12
00babe54	add w9,w9,w18
00babe58	ror w0,w0,#0x2
00babe5c	add w12,w12,w17
00babe60	ror w17,w9,#0x1b
00babe64	add w12,w12,w17
00babe68	orr w17,w9,w0
00babe6c	and w17,w17,w11
00babe70	and w1,w9,w0
00babe74	orr w17,w17,w1
00babe78	eor w1,w8,w28
00babe7c	eor w1,w1,w27
00babe80	eor w1,w1,w15
00babe84	ror w20,w1,#0x1f
00babe88	add w10,w20,w10
00babe8c	add w12,w12,w18
00babe90	ror w9,w9,#0x2
00babe94	add w10,w10,w17
00babe98	ror w17,w12,#0x1b
00babe9c	add w10,w10,w17
00babea0	orr w17,w12,w9
00babea4	and w17,w17,w0
00babea8	and w1,w12,w9
00babeac	orr w1,w17,w1
00babeb0	eor w17,w5,w4
00babeb4	str w8,[sp, #0x7c]
00babeb8	eor w8,w13,w8
00babebc	eor w17,w17,w25
00babec0	eor w8,w8,w24
00babec4	eor w17,w17,w21
00babec8	ror w17,w17,#0x1f
00babecc	eor w8,w8,w16
00babed0	ror w7,w8,#0x1f
00babed4	add w8,w17,w11
00babed8	add w10,w10,w18
00babedc	stp w5,w13,[sp, #0x80]
00babee0	eor w13,w30,w13
00babee4	add w11,w7,w0
00babee8	ror w12,w12,#0x2
00babeec	add w8,w8,w1
00babef0	ror w0,w10,#0x1b
00babef4	eor w13,w13,w23
00babef8	add w0,w8,w0
00babefc	eor w8,w12,w9
00babf00	eor w1,w26,w5
00babf04	eor w13,w13,w17
00babf08	eor w8,w8,w10
00babf0c	eor w1,w1,w14
00babf10	ror w2,w13,#0x1f
00babf14	add w13,w0,w18
00babf18	add w11,w11,w8
00babf1c	mov w8,#0xc1d6
00babf20	eor w1,w1,w20
00babf24	ror w18,w13,#0x1b
00babf28	ror w3,w10,#0x2
00babf2c	movk w8,#0xca62, LSL #16
00babf30	ror w1,w1,#0x1f
00babf34	add w11,w11,w18
00babf38	eor w10,w3,w12
00babf3c	add w9,w1,w9
00babf40	eor w10,w10,w13
00babf44	add w5,w11,w8
00babf48	stp w28,w4,[sp, #0x74]
00babf4c	ror w4,w13,#0x2
00babf50	add w9,w9,w10
00babf54	ror w10,w5,#0x1b
00babf58	add w9,w9,w10
00babf5c	eor w10,w4,w3
00babf60	add w18,w2,w12
00babf64	eor w10,w10,w5
00babf68	add w10,w18,w10
00babf6c	add w18,w9,w8
00babf70	ror w9,w18,#0x1b
00babf74	eor w12,w27,w30
00babf78	add w6,w10,w9
00babf7c	eor w9,w22,w26
00babf80	eor w12,w12,w21
00babf84	eor w11,w9,w15
00babf88	eor w9,w14,w25
00babf8c	eor w12,w12,w1
00babf90	eor w10,w25,w22
00babf94	ror w19,w12,#0x1f
00babf98	eor w9,w9,w17
00babf9c	eor w13,w24,w27
00babfa0	eor w0,w23,w24
00babfa4	eor w12,w10,w16
00babfa8	eor w10,w9,w19
00babfac	eor w9,w11,w7
00babfb0	ror w5,w5,#0x2
00babfb4	stp w30,w22,[sp, #0x4c]
00babfb8	eor w22,w13,w20
00babfbc	eor w13,w20,w21
00babfc0	stp w20,w17,[sp, #0x74]
00babfc4	stp w7,w1,[sp, #0x7c]
00babfc8	eor w11,w0,w7
00babfcc	eor w20,w7,w20
00babfd0	eor w0,w2,w7
00babfd4	ror w9,w9,#0x1f
00babfd8	add w7,w19,w4
00babfdc	eor w4,w5,w4
00babfe0	add w3,w9,w3
00babfe4	eor w4,w4,w18
00babfe8	eor w12,w12,w2
00babfec	add w3,w3,w4
00babff0	add w4,w6,w8
00babff4	stp w24,w14,[sp, #0x5c]
00babff8	stp w23,w15,[sp, #0x64]
00babffc	stp w21,w16,[sp, #0x6c]
00bac000	ror w6,w4,#0x1b
00bac004	eor w14,w15,w14
00bac008	eor w15,w16,w15
00bac00c	eor w16,w17,w16
00bac010	ror w12,w12,#0x1f
00bac014	ror w18,w18,#0x2
00bac018	str w26,[sp, #0x88]
00bac01c	str w9,[sp, #0x88]
00bac020	add w3,w3,w6
00bac024	eor w14,w14,w1
00bac028	eor w17,w1,w17
00bac02c	eor w11,w11,w12
00bac030	eor w16,w16,w12
00bac034	stp w19,w12,[sp, #0x4c]
00bac038	eor w6,w22,w9
00bac03c	eor w15,w15,w9
00bac040	eor w1,w9,w1
00bac044	eor w9,w12,w9
00bac048	add w12,w12,w5
00bac04c	eor w5,w18,w5
00bac050	eor w5,w5,w4
00bac054	add w3,w3,w8
00bac058	add w5,w7,w5
00bac05c	ror w7,w3,#0x1b
00bac060	ror w6,w6,#0x1f
00bac064	ror w4,w4,#0x2
00bac068	stp w27,w25,[sp, #0x54]
00bac06c	add w5,w5,w7
00bac070	str w6,[sp, #0x54]
00bac074	eor w14,w14,w6
00bac078	eor w7,w20,w6
00bac07c	add w6,w6,w18
00bac080	eor w18,w4,w18
00bac084	eor w18,w18,w3
00bac088	eor w23,w21,w23
00bac08c	add w12,w12,w18
00bac090	add w18,w5,w8
00bac094	eor w21,w23,w2
00bac098	ror w5,w18,#0x1b
00bac09c	ror w10,w10,#0x1f
00bac0a0	ror w3,w3,#0x2
00bac0a4	add w12,w12,w5
00bac0a8	eor w5,w21,w10
00bac0ac	eor w17,w17,w10
00bac0b0	str w10,[sp, #0x58]
00bac0b4	add w10,w10,w4
00bac0b8	eor w4,w3,w4
00bac0bc	eor w4,w4,w18
00bac0c0	add w12,w12,w8
00bac0c4	ror w11,w11,#0x1f
00bac0c8	ror w18,w18,#0x2
00bac0cc	add w4,w6,w4
00bac0d0	ror w6,w12,#0x1b
00bac0d4	eor w15,w15,w11
00bac0d8	eor w0,w0,w11
00bac0dc	str w11,[sp, #0x5c]
00bac0e0	add w11,w11,w3
00bac0e4	eor w3,w18,w3
00bac0e8	add w4,w4,w6
00bac0ec	eor w3,w3,w12
00bac0f0	add w10,w10,w3
00bac0f4	add w3,w4,w8
00bac0f8	eor w13,w13,w19
00bac0fc	ror w4,w3,#0x1b
00bac100	ror w14,w14,#0x1f
00bac104	ror w12,w12,#0x2
00bac108	add w10,w10,w4
00bac10c	str w14,[sp, #0x60]
00bac110	eor w13,w13,w14
00bac114	eor w1,w1,w14
00bac118	add w14,w14,w18
00bac11c	eor w18,w12,w18
00bac120	eor w18,w18,w3
00bac124	add w10,w10,w8
00bac128	add w11,w11,w18
00bac12c	ror w18,w10,#0x1b
00bac130	str w2,[sp, #0x84]
00bac134	eor w2,w19,w2
00bac138	add w11,w11,w18
00bac13c	ror w18,w5,#0x1f
00bac140	ror w3,w3,#0x2
00bac144	eor w16,w16,w18
00bac148	eor w2,w2,w18
00bac14c	str w18,[sp, #0x64]
00bac150	add w18,w18,w12
00bac154	eor w12,w3,w12
00bac158	eor w12,w12,w10
00bac15c	add w11,w11,w8
00bac160	add w12,w14,w12
00bac164	ror w14,w11,#0x1b
00bac168	add w12,w12,w14
00bac16c	ror w14,w15,#0x1f
00bac170	ror w10,w10,#0x2
00bac174	eor w15,w7,w14
00bac178	eor w9,w9,w14
00bac17c	str w14,[sp, #0x68]
00bac180	add w14,w14,w3
00bac184	eor w3,w10,w3
00bac188	eor w3,w3,w11
00bac18c	add w12,w12,w8
00bac190	ror w13,w13,#0x1f
00bac194	ror w11,w11,#0x2
00bac198	add w18,w18,w3
00bac19c	ror w3,w12,#0x1b
00bac1a0	str w13,[sp, #0x6c]
00bac1a4	eor w17,w17,w13
00bac1a8	add w13,w13,w10
00bac1ac	eor w10,w11,w10
00bac1b0	add w18,w18,w3
00bac1b4	eor w10,w10,w12
00bac1b8	add w10,w14,w10
00bac1bc	add w14,w18,w8
00bac1c0	ror w18,w14,#0x1b
00bac1c4	ror w16,w16,#0x1f
00bac1c8	ror w12,w12,#0x2
00bac1cc	add w10,w10,w18
00bac1d0	eor w18,w0,w16
00bac1d4	str w16,[sp, #0x70]
00bac1d8	add w16,w16,w11
00bac1dc	eor w11,w12,w11
00bac1e0	eor w11,w11,w14
00bac1e4	add w10,w10,w8
00bac1e8	add w11,w13,w11
00bac1ec	ror w13,w10,#0x1b
00bac1f0	add w11,w11,w13
00bac1f4	ror w13,w15,#0x1f
00bac1f8	ror w14,w14,#0x2
00bac1fc	eor w15,w1,w13
00bac200	str w13,[sp, #0x74]
00bac204	add w13,w13,w12
00bac208	eor w12,w14,w12
00bac20c	eor w12,w12,w10
00bac210	add w11,w11,w8
00bac214	add w12,w16,w12
00bac218	ror w16,w11,#0x1b
00bac21c	add w12,w12,w16
00bac220	ror w16,w17,#0x1f
00bac224	ror w10,w10,#0x2
00bac228	str w16,[sp, #0x78]
00bac22c	eor w17,w2,w16
00bac230	add w16,w16,w14
00bac234	eor w14,w10,w14
00bac238	eor w14,w14,w11
00bac23c	add w12,w12,w8
00bac240	add w13,w13,w14
00bac244	ror w14,w12,#0x1b
00bac248	add w13,w13,w14
00bac24c	ror w14,w18,#0x1f
00bac250	ror w11,w11,#0x2
00bac254	eor w9,w9,w14
00bac258	str w14,[sp, #0x7c]
00bac25c	add w14,w14,w10
00bac260	eor w10,w11,w10
00bac264	eor w10,w10,w12
00bac268	add w13,w13,w8
00bac26c	add w10,w16,w10
00bac270	ror w16,w13,#0x1b
00bac274	ror w15,w15,#0x1f
00bac278	ror w12,w12,#0x2
00bac27c	add w10,w10,w16
00bac280	str w15,[sp, #0x80]
00bac284	add w15,w15,w11
00bac288	eor w11,w12,w11
00bac28c	eor w11,w11,w13
00bac290	add w10,w10,w8
00bac294	ror w13,w13,#0x2
00bac298	add w11,w14,w11
00bac29c	ror w14,w10,#0x1b
00bac2a0	add w11,w11,w14
00bac2a4	eor w14,w13,w12
00bac2a8	eor w14,w14,w10
00bac2ac	add w14,w15,w14
00bac2b0	ror w15,w17,#0x1f
00bac2b4	add w11,w11,w8
00bac2b8	add w12,w15,w12
00bac2bc	ror w10,w10,#0x2
00bac2c0	str w15,[sp, #0x84]
00bac2c4	ror w15,w11,#0x1b
00bac2c8	ldr w16,[sp, #0x24]
00bac2cc	add w14,w14,w15
00bac2d0	eor w15,w10,w13
00bac2d4	eor w15,w15,w11
00bac2d8	add w14,w14,w8
00bac2dc	add w12,w12,w15
00bac2e0	ror w15,w14,#0x1b
00bac2e4	ror w11,w11,#0x2
00bac2e8	str w10,[sp, #0x9c]
00bac2ec	add w12,w12,w15
00bac2f0	ror w15,w9,#0x1f
00bac2f4	add w16,w10,w16
00bac2f8	eor w10,w11,w10
00bac2fc	add w13,w15,w13
00bac300	eor w10,w10,w14
00bac304	add w10,w13,w10
00bac308	ldr w13,[sp, #0x2c]
00bac30c	add w12,w12,w8
00bac310	str w11,[sp, #0x98]
00bac314	str w9,[sp, #0x48]
00bac318	add w13,w11,w13
00bac31c	ror w11,w12,#0x1b
00bac320	add w10,w10,w11
00bac324	ldr w11,[sp, #0x28]
00bac328	add w8,w10,w8
00bac32c	ror w10,w14,#0x2
00bac330	str w10,[sp, #0x94]
00bac334	add w11,w10,w11
00bac338	ldr w10,[sp, #0x34]
00bac33c	ldr w9,[sp, #0x30]
00bac340	stp w8,w12,[sp, #0x8c]
00bac344	add x0,sp,#0x48
00bac348	add w8,w8,w10
00bac34c	ldr x10,[sp, #0x38]
00bac350	add w9,w12,w9
00bac354	mov w1,#0x58
00bac358	str w15,[sp, #0x88]
00bac35c	stp w11,w13,[x10, #0x10]
00bac360	stp w8,w9,[x10, #0x8]
00bac364	str w16,[x10, #0x18]
00bac368	bl 0x00c42220
00bac36c	ldr x8,[sp, #0x40]
00bac370	ldr x8,[x8, #0x28]
00bac374	ldur x9,[x29, #-0x60]
00bac378	cmp x8,x9
00bac37c	b.ne 0x00bac3a4
00bac380	ldp x29,x30,[sp, #0x100]
00bac384	ldp x20,x19,[sp, #0xf0]
00bac388	ldp x22,x21,[sp, #0xe0]
00bac38c	ldp x24,x23,[sp, #0xd0]
00bac390	ldp x26,x25,[sp, #0xc0]
00bac394	ldp x28,x27,[sp, #0xb0]
00bac398	mov w0,wzr
00bac39c	add sp,sp,#0x110
00bac3a0	ret
00bac3a4	bl 0x00c2fec0
