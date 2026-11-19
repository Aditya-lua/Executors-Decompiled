; FUN_00ade188 @ 00ade188
00ade188	sub sp,sp,#0x120
00ade18c	stp x28,x27,[sp, #0xc0]
00ade190	stp x26,x25,[sp, #0xd0]
00ade194	stp x24,x23,[sp, #0xe0]
00ade198	stp x22,x21,[sp, #0xf0]
00ade19c	stp x20,x19,[sp, #0x100]
00ade1a0	stp x29,x30,[sp, #0x110]
00ade1a4	ldp w12,w3,[x0]
00ade1a8	ldp w13,w14,[x0, #0x8]
00ade1ac	ldr w8,[x0, #0x10]
00ade1b0	str x0,[sp, #0xb8]
00ade1b4	mov w9,#0x7999
00ade1b8	movk w9,#0x5a82, LSL #16
00ade1bc	stp x1,x2,[sp, #0xa8]
00ade1c0	add w4,w8,w9
00ade1c4	add w8,w14,w9
00ade1c8	ldp w7,w6,[x1]
00ade1cc	str w8,[sp, #0xa4]
00ade1d0	ldp w16,w8,[x1, #0x38]
00ade1d4	ldp w20,w19,[x1, #0x8]
00ade1d8	ldp w22,w23,[x1, #0x10]
00ade1dc	ldp w24,w25,[x1, #0x18]
00ade1e0	ldp w26,w27,[x1, #0x20]
00ade1e4	ldp w28,w29,[x1, #0x28]
00ade1e8	ldp w10,w30,[x1, #0x30]
00ade1ec	str w8,[sp, #0xa0]
00ade1f0	ldr x8,[sp, #0xb8]
00ade1f4	eor w11,w13,w14
00ade1f8	ror w18,w3,#0x2
00ade1fc	ror w2,w12,#0x1b
00ade200	ldp w17,w8,[x8]
00ade204	add w21,w13,w9
00ade208	eor w9,w18,w13
00ade20c	ror w5,w12,#0x2
00ade210	str w8,[sp, #0x9c]
00ade214	and w8,w11,w3
00ade218	eor w8,w8,w14
00ade21c	add w8,w4,w8
00ade220	ldr w3,[sp, #0xa4]
00ade224	and w9,w9,w12
00ade228	rev w12,w7
00ade22c	add w8,w8,w2
00ade230	eor w11,w5,w18
00ade234	add w8,w8,w12
00ade238	eor w9,w9,w13
00ade23c	and w11,w8,w11
00ade240	rev w13,w6
00ade244	add w9,w3,w9
00ade248	eor w11,w11,w18
00ade24c	rev w2,w20
00ade250	add w9,w9,w13
00ade254	ror w13,w8,#0x1b
00ade258	add w11,w21,w11
00ade25c	ror w8,w8,#0x2
00ade260	mov w15,#0x7999
00ade264	add w9,w9,w13
00ade268	add w11,w11,w2
00ade26c	eor w2,w8,w5
00ade270	movk w15,#0x5a82, LSL #16
00ade274	and w2,w9,w2
00ade278	add w0,w18,w15
00ade27c	add w14,w5,w15
00ade280	eor w2,w2,w5
00ade284	ror w5,w9,#0x1b
00ade288	rev w4,w19
00ade28c	add w11,w11,w5
00ade290	add w0,w0,w2
00ade294	ror w9,w9,#0x2
00ade298	add w0,w0,w4
00ade29c	ror w4,w11,#0x1b
00ade2a0	add w0,w0,w4
00ade2a4	eor w4,w9,w8
00ade2a8	and w4,w11,w4
00ade2ac	eor w4,w4,w8
00ade2b0	eor w1,w20,w7
00ade2b4	rev w7,w22
00ade2b8	add w14,w14,w4
00ade2bc	ror w11,w11,#0x2
00ade2c0	add w14,w14,w7
00ade2c4	ror w7,w0,#0x1b
00ade2c8	mov w15,#0x7999
00ade2cc	add w14,w14,w7
00ade2d0	eor w7,w11,w9
00ade2d4	movk w15,#0x5a82, LSL #16
00ade2d8	and w7,w0,w7
00ade2dc	add w8,w8,w15
00ade2e0	eor w7,w7,w9
00ade2e4	rev w12,w23
00ade2e8	add w8,w8,w7
00ade2ec	ror w0,w0,#0x2
00ade2f0	add w8,w8,w12
00ade2f4	ror w12,w14,#0x1b
00ade2f8	add w12,w8,w12
00ade2fc	eor w8,w0,w11
00ade300	and w8,w14,w8
00ade304	eor w3,w19,w6
00ade308	eor w6,w22,w20
00ade30c	eor w19,w23,w19
00ade310	add w9,w9,w15
00ade314	eor w8,w8,w11
00ade318	eor w20,w24,w22
00ade31c	rev w13,w24
00ade320	eor w22,w25,w23
00ade324	rev w18,w25
00ade328	eor w23,w26,w24
00ade32c	rev w21,w26
00ade330	eor w24,w27,w25
00ade334	rev w5,w27
00ade338	eor w1,w1,w26
00ade33c	eor w25,w28,w26
00ade340	rev w2,w28
00ade344	eor w3,w3,w27
00ade348	eor w26,w29,w27
00ade34c	rev w4,w29
00ade350	eor w6,w6,w28
00ade354	eor w27,w10,w28
00ade358	eor w19,w19,w29
00ade35c	eor w28,w30,w29
00ade360	add w29,w9,w8
00ade364	ldr w9,[sp, #0xa0]
00ade368	rev w8,w30
00ade36c	eor w3,w3,w16
00ade370	eor w22,w22,w30
00ade374	eor w1,w1,w30
00ade378	eor w30,w9,w30
00ade37c	eor w24,w24,w9
00ade380	eor w6,w6,w9
00ade384	rev w15,w9
00ade388	mov w9,#0xc1d6
00ade38c	rev w7,w10
00ade390	str w8,[sp, #0x94]
00ade394	eor w20,w20,w10
00ade398	eor w8,w16,w10
00ade39c	movk w9,#0xca62, LSL #16
00ade3a0	rev w10,w1
00ade3a4	rev w1,w3
00ade3a8	rev w3,w6
00ade3ac	add w9,w17,w9
00ade3b0	rev w17,w25
00ade3b4	rev w25,w26
00ade3b8	rev w26,w27
00ade3bc	ror w6,w10,#0x1f
00ade3c0	ror w10,w3,#0x1f
00ade3c4	rev w27,w28
00ade3c8	rev w28,w30
00ade3cc	eor w30,w26,w10
00ade3d0	ror w14,w14,#0x2
00ade3d4	add w13,w29,w13
00ade3d8	ror w26,w12,#0x1b
00ade3dc	str w9,[sp, #0xa4]
00ade3e0	mov w9,#0x7999
00ade3e4	add w13,w13,w26
00ade3e8	eor w26,w14,w0
00ade3ec	movk w9,#0x5a82, LSL #16
00ade3f0	and w26,w12,w26
00ade3f4	add w11,w11,w9
00ade3f8	eor w26,w26,w0
00ade3fc	add w11,w11,w26
00ade400	ror w12,w12,#0x2
00ade404	add w11,w11,w18
00ade408	ror w18,w13,#0x1b
00ade40c	add w11,w11,w18
00ade410	eor w18,w12,w14
00ade414	and w18,w13,w18
00ade418	add w0,w0,w9
00ade41c	eor w18,w18,w14
00ade420	add w18,w0,w18
00ade424	ror w13,w13,#0x2
00ade428	add w18,w18,w21
00ade42c	ror w21,w11,#0x1b
00ade430	add w18,w18,w21
00ade434	eor w21,w13,w12
00ade438	and w21,w11,w21
00ade43c	add w14,w14,w9
00ade440	eor w21,w21,w12
00ade444	add w14,w14,w21
00ade448	ror w11,w11,#0x2
00ade44c	add w14,w14,w5
00ade450	ror w5,w18,#0x1b
00ade454	add w14,w14,w5
00ade458	eor w5,w11,w13
00ade45c	and w5,w18,w5
00ade460	add w12,w12,w9
00ade464	eor w5,w5,w13
00ade468	add w12,w12,w5
00ade46c	ror w18,w18,#0x2
00ade470	add w12,w12,w2
00ade474	ror w2,w14,#0x1b
00ade478	add w12,w12,w2
00ade47c	eor w2,w18,w11
00ade480	and w2,w14,w2
00ade484	add w13,w13,w9
00ade488	eor w2,w2,w11
00ade48c	add w13,w13,w2
00ade490	ror w14,w14,#0x2
00ade494	add w13,w13,w4
00ade498	ror w2,w12,#0x1b
00ade49c	add w13,w13,w2
00ade4a0	eor w2,w14,w18
00ade4a4	and w2,w12,w2
00ade4a8	rev w19,w19
00ade4ac	rev w20,w20
00ade4b0	ror w1,w1,#0x1f
00ade4b4	add w11,w11,w9
00ade4b8	eor w2,w2,w18
00ade4bc	eor w3,w19,w6
00ade4c0	eor w19,w20,w1
00ade4c4	add w11,w11,w2
00ade4c8	rev w8,w8
00ade4cc	rev w22,w22
00ade4d0	ror w3,w3,#0x1f
00ade4d4	ror w19,w19,#0x1f
00ade4d8	ror w12,w12,#0x2
00ade4dc	add w11,w11,w7
00ade4e0	ror w7,w13,#0x1b
00ade4e4	str w15,[sp, #0x98]
00ade4e8	eor w20,w22,w10
00ade4ec	eor w22,w25,w1
00ade4f0	eor w25,w15,w1
00ade4f4	add w15,w3,w9
00ade4f8	mov w9,#0x7999
00ade4fc	eor w4,w8,w19
00ade500	add w11,w11,w7
00ade504	eor w7,w12,w14
00ade508	ldr w8,[sp, #0x94]
00ade50c	str w15,[sp, #0x90]
00ade510	mov w15,#0xeba1
00ade514	movk w9,#0x5a82, LSL #16
00ade518	and w7,w13,w7
00ade51c	ror w20,w20,#0x1f
00ade520	movk w15,#0x6ed9, LSL #16
00ade524	add w18,w18,w9
00ade528	eor w7,w7,w14
00ade52c	add w29,w19,w15
00ade530	add w15,w20,w15
00ade534	add w18,w18,w7
00ade538	str w15,[sp, #0xa0]
00ade53c	ror w13,w13,#0x2
00ade540	add w15,w18,w8
00ade544	ror w18,w11,#0x1b
00ade548	eor w23,w23,w16
00ade54c	add w15,w15,w18
00ade550	eor w18,w13,w12
00ade554	rev w23,w23
00ade558	rev w24,w24
00ade55c	and w18,w11,w18
00ade560	eor w17,w17,w6
00ade564	eor w2,w23,w3
00ade568	eor w5,w24,w19
00ade56c	eor w23,w27,w3
00ade570	add w14,w14,w9
00ade574	ror w27,w11,#0x2
00ade578	eor w11,w18,w12
00ade57c	rev w16,w16
00ade580	eor w17,w17,w20
00ade584	add w18,w14,w11
00ade588	add w11,w27,w9
00ade58c	ror w0,w5,#0x1f
00ade590	eor w26,w16,w6
00ade594	eor w24,w28,w20
00ade598	add w7,w13,w9
00ade59c	add w28,w11,w1
00ade5a0	ror w11,w2,#0x1f
00ade5a4	ror w14,w17,#0x1f
00ade5a8	eor w2,w30,w0
00ade5ac	eor w21,w10,w6
00ade5b0	add w6,w7,w6
00ade5b4	eor w7,w1,w3
00ade5b8	eor w8,w10,w19
00ade5bc	eor w3,w20,w3
00ade5c0	eor w17,w22,w11
00ade5c4	eor w5,w23,w14
00ade5c8	eor w22,w26,w11
00ade5cc	eor w23,w25,w0
00ade5d0	eor w20,w20,w0
00ade5d4	mov w26,w0
00ade5d8	str w0,[sp, #0x20]
00ade5dc	add w16,w18,w16
00ade5e0	eor w18,w27,w13
00ade5e4	ror w0,w2,#0x1f
00ade5e8	eor w21,w21,w14
00ade5ec	and w18,w15,w18
00ade5f0	eor w25,w14,w11
00ade5f4	mov w1,w14
00ade5f8	str w14,[sp, #0x2c]
00ade5fc	ror w14,w17,#0x1f
00ade600	eor w17,w24,w0
00ade604	eor w24,w8,w0
00ade608	add w8,w12,w9
00ade60c	ror w12,w15,#0x2
00ade610	eor w18,w18,w13
00ade614	ror w13,w15,#0x1b
00ade618	add w15,w12,w9
00ade61c	ldr w9,[sp, #0x98]
00ade620	add w16,w16,w13
00ade624	add w8,w8,w18
00ade628	add w10,w15,w10
00ade62c	add w8,w8,w9
00ade630	ror w15,w16,#0x1b
00ade634	add w8,w8,w15
00ade638	eor w15,w12,w27
00ade63c	and w15,w16,w15
00ade640	eor w15,w15,w27
00ade644	ror w16,w16,#0x2
00ade648	add w15,w6,w15
00ade64c	ror w6,w8,#0x1b
00ade650	add w6,w15,w6
00ade654	eor w15,w16,w12
00ade658	eor w13,w4,w14
00ade65c	and w15,w8,w15
00ade660	eor w12,w15,w12
00ade664	ror w9,w13,#0x1f
00ade668	ror w13,w17,#0x1f
00ade66c	ldr w15,[sp, #0x90]
00ade670	eor w17,w23,w9
00ade674	eor w23,w21,w13
00ade678	ror w8,w8,#0x2
00ade67c	add w12,w28,w12
00ade680	ror w21,w6,#0x1b
00ade684	add w12,w12,w21
00ade688	eor w21,w8,w16
00ade68c	str w11,[sp, #0x48]
00ade690	eor w19,w19,w11
00ade694	ror w11,w5,#0x1f
00ade698	and w21,w6,w21
00ade69c	eor w2,w22,w11
00ade6a0	add w22,w15,w16
00ade6a4	eor w16,w21,w16
00ade6a8	ror w6,w6,#0x2
00ade6ac	add w10,w10,w16
00ade6b0	ror w16,w12,#0x1b
00ade6b4	add w15,w10,w16
00ade6b8	eor w10,w6,w8
00ade6bc	and w10,w12,w10
00ade6c0	mov w5,w0
00ade6c4	mov w0,w11
00ade6c8	add w28,w29,w8
00ade6cc	eor w8,w10,w8
00ade6d0	str w14,[sp, #0x38]
00ade6d4	eor w7,w7,w14
00ade6d8	eor w3,w3,w11
00ade6dc	eor w11,w26,w14
00ade6e0	eor w26,w0,w14
00ade6e4	ror w14,w2,#0x1f
00ade6e8	add w8,w22,w8
00ade6ec	ror w10,w15,#0x1b
00ade6f0	eor w7,w7,w14
00ade6f4	add w8,w8,w10
00ade6f8	eor w19,w19,w9
00ade6fc	stp w15,w8,[sp, #0x14]
00ade700	ror w21,w17,#0x1f
00ade704	ror w8,w7,#0x1f
00ade708	eor w17,w24,w21
00ade70c	eor w7,w19,w8
00ade710	eor w19,w11,w21
00ade714	eor w24,w26,w8
00ade718	mov w11,w8
00ade71c	ldr w8,[sp, #0xa0]
00ade720	ror w22,w23,#0x1f
00ade724	eor w3,w3,w22
00ade728	eor w4,w1,w5
00ade72c	add w8,w8,w6
00ade730	str w8,[sp, #0x10]
00ade734	ror w8,w12,#0x2
00ade738	eor w12,w8,w6
00ade73c	eor w12,w12,w15
00ade740	str w8,[sp, #0x1c]
00ade744	add w8,w28,w12
00ade748	eor w20,w20,w13
00ade74c	eor w25,w25,w14
00ade750	eor w27,w5,w9
00ade754	str w9,[sp, #0x4c]
00ade758	eor w30,w14,w9
00ade75c	str w8,[sp, #0xc]
00ade760	ror w9,w17,#0x1f
00ade764	ror w8,w3,#0x1f
00ade768	ror w12,w7,#0x1f
00ade76c	eor w29,w0,w13
00ade770	eor w23,w4,w22
00ade774	eor w4,w20,w9
00ade778	eor w6,w25,w8
00ade77c	eor w7,w19,w12
00ade780	eor w20,w27,w9
00ade784	eor w25,w29,w8
00ade788	mov w10,w8
00ade78c	ror w19,w4,#0x1f
00ade790	ror w6,w6,#0x1f
00ade794	ror w8,w7,#0x1f
00ade798	eor w7,w23,w19
00ade79c	eor w23,w24,w6
00ade7a0	eor w24,w20,w8
00ade7a4	eor w20,w14,w22
00ade7a8	eor w28,w20,w6
00ade7ac	eor w20,w11,w21
00ade7b0	eor w27,w30,w12
00ade7b4	eor w29,w20,w8
00ade7b8	ror w7,w7,#0x1f
00ade7bc	ror w20,w23,#0x1f
00ade7c0	eor w26,w13,w21
00ade7c4	ror w23,w24,#0x1f
00ade7c8	eor w24,w25,w7
00ade7cc	eor w25,w27,w20
00ade7d0	eor w27,w22,w9
00ade7d4	str w13,[sp, #0x44]
00ade7d8	mov w13,w12
00ade7dc	eor w26,w26,w19
00ade7e0	eor w30,w27,w7
00ade7e4	eor w27,w11,w10
00ade7e8	eor w26,w26,w23
00ade7ec	eor w12,w27,w20
00ade7f0	eor w27,w13,w9
00ade7f4	str w9,[sp, #0x40]
00ade7f8	eor w9,w27,w23
00ade7fc	ror w24,w24,#0x1f
00ade800	ror w25,w25,#0x1f
00ade804	ror w27,w26,#0x1f
00ade808	eor w26,w28,w24
00ade80c	eor w28,w29,w25
00ade810	eor w29,w30,w27
00ade814	eor w30,w10,w19
00ade818	str w14,[sp, #0x28]
00ade81c	mov w14,w8
00ade820	stp w13,w8,[sp, #0x50]
00ade824	eor w8,w30,w24
00ade828	eor w30,w13,w6
00ade82c	ror w26,w26,#0x1f
00ade830	ror w15,w28,#0x1f
00ade834	ror w13,w29,#0x1f
00ade838	str w11,[sp, #0x34]
00ade83c	eor w11,w30,w25
00ade840	eor w30,w14,w19
00ade844	eor w12,w12,w26
00ade848	eor w9,w9,w15
00ade84c	eor w8,w8,w13
00ade850	eor w29,w6,w7
00ade854	str w10,[sp, #0x3c]
00ade858	eor w10,w30,w27
00ade85c	eor w29,w29,w26
00ade860	ror w4,w12,#0x1f
00ade864	ror w12,w9,#0x1f
00ade868	ror w3,w8,#0x1f
00ade86c	eor w30,w14,w20
00ade870	eor w28,w23,w7
00ade874	eor w8,w11,w4
00ade878	eor w9,w10,w12
00ade87c	eor w10,w29,w3
00ade880	eor w11,w20,w24
00ade884	eor w29,w23,w25
00ade888	str w5,[sp, #0x24]
00ade88c	eor w30,w30,w15
00ade890	mov w17,w15
00ade894	eor w28,w28,w13
00ade898	mov w2,w13
00ade89c	str w13,[sp, #0x5c]
00ade8a0	eor w11,w11,w4
00ade8a4	eor w29,w29,w12
00ade8a8	mov w18,w12
00ade8ac	str w12,[sp, #0x64]
00ade8b0	eor w12,w27,w24
00ade8b4	ror w15,w8,#0x1f
00ade8b8	ror w13,w9,#0x1f
00ade8bc	ror w5,w10,#0x1f
00ade8c0	str w0,[sp, #0x30]
00ade8c4	eor w1,w12,w3
00ade8c8	eor w8,w30,w15
00ade8cc	eor w12,w28,w13
00ade8d0	eor w0,w11,w5
00ade8d4	eor w11,w25,w26
00ade8d8	eor w11,w11,w15
00ade8dc	eor w28,w27,w17
00ade8e0	mov w9,w17
00ade8e4	str w17,[sp, #0x58]
00ade8e8	ror w17,w8,#0x1f
00ade8ec	ror w14,w12,#0x1f
00ade8f0	ror w8,w0,#0x1f
00ade8f4	eor w30,w2,w26
00ade8f8	eor w0,w29,w17
00ade8fc	eor w1,w1,w14
00ade900	eor w16,w11,w8
00ade904	eor w11,w9,w4
00ade908	eor w12,w2,w18
00ade90c	eor w29,w3,w4
00ade910	eor w28,w28,w13
00ade914	mov w10,w13
00ade918	eor w30,w30,w5
00ade91c	eor w11,w11,w17
00ade920	eor w2,w12,w14
00ade924	mov w12,w14
00ade928	stp w13,w14,[sp, #0x68]
00ade92c	eor w18,w29,w8
00ade930	ror w14,w0,#0x1f
00ade934	ror w29,w1,#0x1f
00ade938	ror w9,w16,#0x1f
00ade93c	str w14,[sp, #0x78]
00ade940	eor w13,w28,w14
00ade944	eor w14,w30,w29
00ade948	eor w16,w11,w9
00ade94c	eor w11,w3,w10
00ade950	eor w28,w5,w15
00ade954	str w15,[sp, #0x60]
00ade958	eor w11,w11,w29
00ade95c	mov w30,w29
00ade960	stp w8,w29,[sp, #0x70]
00ade964	eor w28,w28,w9
00ade968	mov w15,w9
00ade96c	str w9,[sp, #0x7c]
00ade970	ror w9,w13,#0x1f
00ade974	ror w29,w14,#0x1f
00ade978	ror w14,w16,#0x1f
00ade97c	stp w9,w14,[sp, #0x80]
00ade980	eor w9,w2,w9
00ade984	eor w13,w18,w29
00ade988	ror w9,w9,#0x1f
00ade98c	ror w13,w13,#0x1f
00ade990	eor w10,w5,w12
00ade994	stp w13,w9,[sp, #0x88]
00ade998	eor w9,w11,w9
00ade99c	eor w10,w10,w29
00ade9a0	eor w12,w8,w17
00ade9a4	eor w28,w28,w13
00ade9a8	eor w11,w8,w30
00ade9ac	ror w30,w9,#0x1f
00ade9b0	eor w12,w12,w14
00ade9b4	ror w28,w28,#0x1f
00ade9b8	eor w8,w10,w30
00ade9bc	eor w10,w15,w29
00ade9c0	eor w11,w11,w13
00ade9c4	str w28,[sp, #0x98]
00ade9c8	eor w12,w12,w28
00ade9cc	eor w10,w10,w28
00ade9d0	ror w28,w8,#0x1f
00ade9d4	eor w8,w11,w28
00ade9d8	ror w12,w12,#0x1f
00ade9dc	ror w8,w8,#0x1f
00ade9e0	eor w9,w14,w13
00ade9e4	stp w12,w8,[sp, #0x90]
00ade9e8	eor w8,w10,w8
00ade9ec	eor w9,w9,w12
00ade9f0	ror w8,w8,#0x1f
00ade9f4	str w8,[sp, #0xa0]
00ade9f8	eor w8,w9,w8
00ade9fc	ldr w9,[sp, #0xa4]
00adea00	ror w8,w8,#0x1f
00adea04	ldp w12,w11,[sp, #0x18]
00adea08	ldr w10,[sp, #0x14]
00adea0c	add w8,w9,w8
00adea10	ldr w9,[sp, #0xc]
00adea14	str w8,[sp, #0xa4]
00adea18	ror w8,w12,#0x1b
00adea1c	mov w14,#0xeba1
00adea20	add w8,w9,w8
00adea24	ldr w9,[sp, #0x48]
00adea28	movk w14,#0x6ed9, LSL #16
00adea2c	ror w10,w10,#0x2
00adea30	mov w13,w12
00adea34	add w9,w9,w14
00adea38	add w9,w9,w11
00adea3c	eor w11,w10,w11
00adea40	eor w11,w11,w12
00adea44	ldr w12,[sp, #0x10]
00adea48	ror w0,w13,#0x2
00adea4c	ldr w13,[sp, #0x38]
00adea50	mov w18,w17
00adea54	add w11,w12,w11
00adea58	ror w12,w8,#0x1b
00adea5c	add w11,w11,w12
00adea60	ldr w12,[sp, #0x20]
00adea64	mov w17,#0xbcdc
00adea68	movk w17,#0x8f1b, LSL #16
00adea6c	ldr w16,[sp, #0x60]
00adea70	add w12,w12,w14
00adea74	add w12,w12,w10
00adea78	eor w10,w0,w10
00adea7c	eor w10,w10,w8
00adea80	add w9,w9,w10
00adea84	ror w10,w11,#0x1b
00adea88	add w9,w9,w10
00adea8c	ldr w10,[sp, #0x2c]
00adea90	ror w8,w8,#0x2
00adea94	ldr x2,[sp, #0xb0]
00adea98	add w10,w10,w14
00adea9c	add w10,w10,w0
00adeaa0	eor w0,w8,w0
00adeaa4	eor w0,w0,w11
00adeaa8	add w12,w12,w0
00adeaac	ror w0,w9,#0x1b
00adeab0	add w12,w12,w0
00adeab4	add w0,w13,w14
00adeab8	ror w11,w11,#0x2
00adeabc	add w0,w0,w8
00adeac0	eor w8,w11,w8
00adeac4	eor w8,w8,w9
00adeac8	add w8,w10,w8
00adeacc	ror w10,w12,#0x1b
00adead0	add w8,w8,w10
00adead4	ldr w10,[sp, #0x24]
00adead8	ror w9,w9,#0x2
00adeadc	ldr w13,[sp, #0x30]
00adeae0	subs x2,x2,#0x1
00adeae4	add w10,w10,w14
00adeae8	add w10,w10,w11
00adeaec	eor w11,w9,w11
00adeaf0	eor w11,w11,w12
00adeaf4	add w11,w0,w11
00adeaf8	ror w0,w8,#0x1b
00adeafc	add w11,w11,w0
00adeb00	add w0,w13,w14
00adeb04	ror w12,w12,#0x2
00adeb08	add w0,w0,w9
00adeb0c	eor w9,w12,w9
00adeb10	eor w9,w9,w8
00adeb14	add w9,w10,w9
00adeb18	ror w10,w11,#0x1b
00adeb1c	add w9,w9,w10
00adeb20	ldr w10,[sp, #0x4c]
00adeb24	ror w8,w8,#0x2
00adeb28	ldr w13,[sp, #0x44]
00adeb2c	ror w15,w9,#0x1b
00adeb30	add w10,w10,w14
00adeb34	add w10,w10,w12
00adeb38	eor w12,w8,w12
00adeb3c	eor w12,w12,w11
00adeb40	add w12,w0,w12
00adeb44	add w12,w12,w15
00adeb48	add w15,w13,w14
00adeb4c	ror w11,w11,#0x2
00adeb50	add w15,w15,w8
00adeb54	eor w8,w11,w8
00adeb58	eor w8,w8,w9
00adeb5c	add w8,w10,w8
00adeb60	ror w10,w12,#0x1b
00adeb64	add w8,w8,w10
00adeb68	ldr w10,[sp, #0x28]
00adeb6c	ror w9,w9,#0x2
00adeb70	add w13,w21,w14
00adeb74	add w13,w13,w9
00adeb78	add w10,w10,w14
00adeb7c	add w10,w10,w11
00adeb80	eor w11,w9,w11
00adeb84	eor w11,w11,w12
00adeb88	ror w12,w12,#0x2
00adeb8c	add w11,w15,w11
00adeb90	ror w15,w8,#0x1b
00adeb94	eor w9,w12,w9
00adeb98	add w11,w11,w15
00adeb9c	eor w9,w9,w8
00adeba0	add w9,w10,w9
00adeba4	ror w10,w11,#0x1b
00adeba8	add w9,w9,w10
00adebac	add w10,w22,w14
00adebb0	ror w8,w8,#0x2
00adebb4	add w10,w10,w12
00adebb8	eor w12,w8,w12
00adebbc	eor w12,w12,w11
00adebc0	add w12,w13,w12
00adebc4	ror w13,w9,#0x1b
00adebc8	add w12,w12,w13
00adebcc	ldr w13,[sp, #0x34]
00adebd0	ror w11,w11,#0x2
00adebd4	ldr w15,[sp, #0x64]
00adebd8	add w13,w13,w14
00adebdc	add w13,w13,w8
00adebe0	eor w8,w11,w8
00adebe4	eor w8,w8,w9
00adebe8	add w8,w10,w8
00adebec	ror w10,w12,#0x1b
00adebf0	add w8,w8,w10
00adebf4	ldr w10,[sp, #0x40]
00adebf8	ror w9,w9,#0x2
00adebfc	add w10,w10,w14
00adec00	add w10,w10,w11
00adec04	eor w11,w9,w11
00adec08	eor w11,w11,w12
00adec0c	add w11,w13,w11
00adec10	ror w13,w8,#0x1b
00adec14	add w11,w11,w13
00adec18	ldr w13,[sp, #0x3c]
00adec1c	ror w12,w12,#0x2
00adec20	add w13,w13,w14
00adec24	add w13,w13,w9
00adec28	eor w9,w12,w9
00adec2c	eor w9,w9,w8
00adec30	add w9,w10,w9
00adec34	ror w10,w11,#0x1b
00adec38	add w9,w9,w10
00adec3c	ldr w10,[sp, #0x50]
00adec40	ror w8,w8,#0x2
00adec44	add w10,w10,w14
00adec48	add w10,w10,w12
00adec4c	eor w12,w8,w12
00adec50	eor w12,w12,w11
00adec54	add w12,w13,w12
00adec58	ror w13,w9,#0x1b
00adec5c	add w12,w12,w13
00adec60	add w13,w19,w14
00adec64	ror w11,w11,#0x2
00adec68	add w13,w13,w8
00adec6c	eor w8,w11,w8
00adec70	eor w8,w8,w9
00adec74	add w8,w10,w8
00adec78	ror w10,w12,#0x1b
00adec7c	add w8,w8,w10
00adec80	add w10,w6,w14
00adec84	ror w9,w9,#0x2
00adec88	add w10,w10,w11
00adec8c	eor w11,w9,w11
00adec90	eor w11,w11,w12
00adec94	add w11,w13,w11
00adec98	ror w13,w8,#0x1b
00adec9c	add w11,w11,w13
00adeca0	ldr w13,[sp, #0x54]
00adeca4	mov w14,#0xeba1
00adeca8	movk w14,#0x6ed9, LSL #16
00adecac	ror w12,w12,#0x2
00adecb0	add w13,w13,w14
00adecb4	add w13,w13,w9
00adecb8	eor w9,w12,w9
00adecbc	eor w9,w9,w8
00adecc0	add w9,w10,w9
00adecc4	ror w10,w11,#0x1b
00adecc8	add w9,w9,w10
00adeccc	add w10,w7,w17
00adecd0	ror w8,w8,#0x2
00adecd4	add w10,w10,w12
00adecd8	eor w12,w8,w12
00adecdc	eor w12,w12,w11
00adece0	add w12,w13,w12
00adece4	ror w13,w9,#0x1b
00adece8	ror w11,w11,#0x2
00adecec	add w12,w12,w13
00adecf0	add w13,w20,w17
00adecf4	orr w14,w9,w11
00adecf8	add w13,w13,w8
00adecfc	and w8,w14,w8
00aded00	and w14,w9,w11
00aded04	orr w8,w8,w14
00aded08	ror w9,w9,#0x2
00aded0c	add w8,w10,w8
00aded10	add w10,w23,w17
00aded14	orr w14,w12,w9
00aded18	add w10,w10,w11
00aded1c	and w11,w14,w11
00aded20	ror w14,w12,#0x1b
00aded24	add w8,w8,w14
00aded28	and w14,w12,w9
00aded2c	orr w11,w11,w14
00aded30	add w11,w13,w11
00aded34	ror w13,w8,#0x1b
00aded38	ror w12,w12,#0x2
00aded3c	add w11,w11,w13
00aded40	add w13,w24,w17
00aded44	orr w14,w8,w12
00aded48	add w13,w13,w9
00aded4c	and w9,w14,w9
00aded50	and w14,w8,w12
00aded54	orr w9,w9,w14
00aded58	ror w8,w8,#0x2
00aded5c	add w9,w10,w9
00aded60	add w10,w25,w17
00aded64	orr w14,w11,w8
00aded68	add w10,w10,w12
00aded6c	and w12,w14,w12
00aded70	ror w14,w11,#0x1b
00aded74	add w9,w9,w14
00aded78	and w14,w11,w8
00aded7c	orr w12,w12,w14
00aded80	add w12,w13,w12
00aded84	ror w13,w9,#0x1b
00aded88	ror w11,w11,#0x2
00aded8c	add w12,w12,w13
00aded90	add w13,w27,w17
00aded94	orr w14,w9,w11
00aded98	add w13,w13,w8
00aded9c	and w8,w14,w8
00adeda0	and w14,w9,w11
00adeda4	orr w8,w8,w14
00adeda8	ror w9,w9,#0x2
00adedac	add w8,w10,w8
00adedb0	add w10,w26,w17
00adedb4	orr w14,w12,w9
00adedb8	add w10,w10,w11
00adedbc	and w11,w14,w11
00adedc0	ror w14,w12,#0x1b
00adedc4	add w8,w8,w14
00adedc8	and w14,w12,w9
00adedcc	orr w11,w11,w14
00adedd0	add w11,w13,w11
00adedd4	ror w13,w8,#0x1b
00adedd8	add w11,w11,w13
00adeddc	ldr w13,[sp, #0x58]
00adede0	ror w12,w12,#0x2
00adede4	orr w14,w8,w12
00adede8	add w13,w13,w17
00adedec	add w13,w13,w9
00adedf0	and w9,w14,w9
00adedf4	and w14,w8,w12
00adedf8	orr w9,w9,w14
00adedfc	add w9,w10,w9
00adee00	ldr w10,[sp, #0x5c]
00adee04	ror w8,w8,#0x2
00adee08	orr w14,w11,w8
00adee0c	add w10,w10,w17
00adee10	add w10,w10,w12
00adee14	and w12,w14,w12
00adee18	ror w14,w11,#0x1b
00adee1c	add w9,w9,w14
00adee20	and w14,w11,w8
00adee24	orr w12,w12,w14
00adee28	ror w11,w11,#0x2
00adee2c	add w12,w13,w12
00adee30	ror w13,w9,#0x1b
00adee34	add w14,w4,w17
00adee38	add w12,w12,w13
00adee3c	orr w13,w9,w11
00adee40	add w14,w14,w8
00adee44	and w8,w13,w8
00adee48	and w13,w9,w11
00adee4c	orr w8,w8,w13
00adee50	ror w9,w9,#0x2
00adee54	add w13,w15,w17
00adee58	add w8,w10,w8
00adee5c	orr w10,w12,w9
00adee60	add w13,w13,w11
00adee64	and w10,w10,w11
00adee68	ror w11,w12,#0x1b
00adee6c	add w8,w8,w11
00adee70	and w11,w12,w9
00adee74	orr w10,w10,w11
00adee78	ror w12,w12,#0x2
00adee7c	add w10,w14,w10
00adee80	ror w14,w8,#0x1b
00adee84	add w11,w3,w17
00adee88	add w10,w10,w14
00adee8c	orr w14,w8,w12
00adee90	add w11,w11,w9
00adee94	and w9,w14,w9
00adee98	and w14,w8,w12
00adee9c	orr w9,w9,w14
00adeea0	ror w8,w8,#0x2
00adeea4	eor w14,w15,w16
00adeea8	add w15,w16,w17
00adeeac	add w9,w13,w9
00adeeb0	orr w13,w10,w8
00adeeb4	add w15,w15,w12
00adeeb8	and w12,w13,w12
00adeebc	ror w13,w10,#0x1b
00adeec0	ldr w16,[sp, #0x68]
00adeec4	add w9,w9,w13
00adeec8	and w13,w10,w8
00adeecc	orr w12,w12,w13
00adeed0	ror w10,w10,#0x2
00adeed4	add w11,w11,w12
00adeed8	ror w12,w9,#0x1b
00adeedc	add w13,w16,w17
00adeee0	add w11,w11,w12
00adeee4	orr w12,w9,w10
00adeee8	add w13,w13,w8
00adeeec	and w8,w12,w8
00adeef0	and w12,w9,w10
00adeef4	orr w8,w8,w12
00adeef8	ror w9,w9,#0x2
00adeefc	add w12,w5,w17
00adef00	add w8,w15,w8
00adef04	orr w15,w11,w9
00adef08	add w12,w12,w10
00adef0c	and w10,w15,w10
00adef10	ror w15,w11,#0x1b
00adef14	add w8,w8,w15
00adef18	and w15,w11,w9
00adef1c	orr w10,w10,w15
00adef20	eor w15,w16,w18
00adef24	add w16,w18,w17
00adef28	ror w11,w11,#0x2
00adef2c	add w10,w13,w10
00adef30	ror w13,w8,#0x1b
00adef34	ldr w18,[sp, #0x6c]
00adef38	add w10,w10,w13
00adef3c	orr w13,w8,w11
00adef40	add w16,w16,w9
00adef44	and w9,w13,w9
00adef48	and w13,w8,w11
00adef4c	orr w9,w9,w13
00adef50	ror w8,w8,#0x2
00adef54	add w13,w18,w17
00adef58	add w9,w12,w9
00adef5c	orr w12,w10,w8
00adef60	add w13,w13,w11
00adef64	and w11,w12,w11
00adef68	ror w12,w10,#0x1b
00adef6c	add w9,w9,w12
00adef70	and w12,w10,w8
00adef74	orr w11,w11,w12
00adef78	ldr w12,[sp, #0x70]
00adef7c	ror w10,w10,#0x2
00adef80	add w11,w16,w11
00adef84	ror w16,w9,#0x1b
00adef88	ldp w4,w0,[sp, #0x74]
00adef8c	add w12,w12,w17
00adef90	add w11,w11,w16
00adef94	orr w16,w9,w10
00adef98	add w12,w12,w8
00adef9c	and w8,w16,w8
00adefa0	and w16,w9,w10
00adefa4	orr w8,w8,w16
00adefa8	ror w9,w9,#0x2
00adefac	add w16,w0,w17
00adefb0	add w8,w13,w8
00adefb4	orr w13,w11,w9
00adefb8	add w16,w16,w10
00adefbc	and w10,w13,w10
00adefc0	ror w13,w11,#0x1b
00adefc4	add w8,w8,w13
00adefc8	and w13,w11,w9
00adefcc	orr w10,w10,w13
00adefd0	ror w11,w11,#0x2
00adefd4	add w10,w12,w10
00adefd8	ror w12,w8,#0x1b
00adefdc	add w13,w4,w17
00adefe0	add w10,w10,w12
00adefe4	orr w12,w8,w11
00adefe8	add w13,w13,w9
00adefec	and w9,w12,w9
00adeff0	and w12,w8,w11
00adeff4	orr w9,w9,w12
00adeff8	eor w12,w14,w0
00adeffc	eor w14,w18,w0
00adf000	ldr w18,[sp, #0x7c]
00adf004	mov w3,#0xc1d6
00adf008	movk w3,#0xca62, LSL #16
00adf00c	ror w8,w8,#0x2
00adf010	eor w17,w18,w0
00adf014	add w18,w18,w3
00adf018	add w9,w16,w9
00adf01c	orr w16,w10,w8
00adf020	add w18,w18,w11
00adf024	and w11,w16,w11
00adf028	ror w16,w10,#0x1b
00adf02c	ldp w0,w1,[sp, #0x80]
00adf030	add w9,w9,w16
00adf034	and w16,w10,w8
00adf038	orr w11,w11,w16
00adf03c	add w11,w13,w11
00adf040	ror w13,w9,#0x1b
00adf044	add w11,w11,w13
00adf048	add w13,w0,w3
00adf04c	ror w10,w10,#0x2
00adf050	add w13,w13,w8
00adf054	eor w8,w10,w8
00adf058	eor w8,w8,w9
00adf05c	add w8,w18,w8
00adf060	ror w16,w11,#0x1b
00adf064	add w8,w8,w16
00adf068	add w16,w29,w3
00adf06c	ror w9,w9,#0x2
00adf070	add w16,w16,w10
00adf074	eor w10,w9,w10
00adf078	eor w10,w10,w11
00adf07c	add w10,w13,w10
00adf080	ror w13,w8,#0x1b
00adf084	add w10,w10,w13
00adf088	eor w12,w12,w1
00adf08c	eor w13,w15,w0
00adf090	eor w15,w4,w0
00adf094	eor w18,w1,w0
00adf098	add w0,w1,w3
00adf09c	ror w11,w11,#0x2
00adf0a0	ldr w1,[sp, #0x8c]
00adf0a4	add w0,w0,w9
00adf0a8	eor w9,w11,w9
00adf0ac	eor w9,w9,w8
00adf0b0	add w9,w16,w9
00adf0b4	ror w16,w10,#0x1b
00adf0b8	add w9,w9,w16
00adf0bc	eor w14,w14,w1
00adf0c0	eor w16,w29,w1
00adf0c4	add w1,w1,w3
00adf0c8	ror w8,w8,#0x2
00adf0cc	add w1,w1,w11
00adf0d0	eor w11,w8,w11
00adf0d4	eor w11,w11,w10
00adf0d8	add w11,w0,w11
00adf0dc	ror w0,w9,#0x1b
00adf0e0	add w11,w11,w0
00adf0e4	ldr w0,[sp, #0x88]
00adf0e8	ror w10,w10,#0x2
00adf0ec	ror w12,w12,#0x1f
00adf0f0	eor w13,w13,w12
00adf0f4	add w0,w0,w3
00adf0f8	add w0,w0,w8
00adf0fc	eor w8,w10,w8
00adf100	eor w8,w8,w9
00adf104	eor w17,w17,w12
00adf108	add w12,w12,w3
00adf10c	ror w9,w9,#0x2
00adf110	add w8,w1,w8
00adf114	ror w1,w11,#0x1b
00adf118	add w12,w12,w10
00adf11c	eor w10,w9,w10
00adf120	add w8,w8,w1
00adf124	eor w10,w10,w11
00adf128	add w10,w0,w10
00adf12c	ror w0,w8,#0x1b
00adf130	add w10,w10,w0
00adf134	add w0,w30,w3
00adf138	ror w11,w11,#0x2
00adf13c	add w0,w0,w9
00adf140	eor w9,w11,w9
00adf144	eor w9,w9,w8
00adf148	add w9,w12,w9
00adf14c	ror w12,w10,#0x1b
00adf150	add w9,w9,w12
00adf154	ldr w12,[sp, #0x98]
00adf158	ror w8,w8,#0x2
00adf15c	ror w13,w13,#0x1f
00adf160	eor w14,w14,w13
00adf164	add w12,w12,w3
00adf168	add w12,w12,w11
00adf16c	eor w11,w8,w11
00adf170	eor w11,w11,w10
00adf174	eor w18,w18,w13
00adf178	add w13,w13,w3
00adf17c	ror w10,w10,#0x2
00adf180	add w11,w0,w11
00adf184	ror w0,w9,#0x1b
00adf188	add w13,w13,w8
00adf18c	eor w8,w10,w8
00adf190	add w11,w11,w0
00adf194	eor w8,w8,w9
00adf198	add w8,w12,w8
00adf19c	ror w12,w11,#0x1b
00adf1a0	add w8,w8,w12
00adf1a4	eor w12,w16,w28
00adf1a8	add w16,w28,w3
00adf1ac	ror w9,w9,#0x2
00adf1b0	ldr w28,[sp, #0x90]
00adf1b4	add w16,w16,w10
00adf1b8	eor w10,w9,w10
00adf1bc	eor w10,w10,w11
00adf1c0	add w10,w13,w10
00adf1c4	ror w13,w8,#0x1b
00adf1c8	add w10,w10,w13
00adf1cc	eor w13,w17,w28
00adf1d0	add w17,w28,w3
00adf1d4	ror w11,w11,#0x2
00adf1d8	eor w15,w15,w30
00adf1dc	add w17,w17,w9
00adf1e0	eor w9,w11,w9
00adf1e4	ror w14,w14,#0x1f
00adf1e8	eor w9,w9,w8
00adf1ec	eor w15,w15,w14
00adf1f0	add w14,w14,w3
00adf1f4	ror w8,w8,#0x2
00adf1f8	add w9,w16,w9
00adf1fc	ror w16,w10,#0x1b
00adf200	add w14,w14,w11
00adf204	eor w11,w8,w11
00adf208	add w9,w9,w16
00adf20c	eor w11,w11,w10
00adf210	add w11,w17,w11
00adf214	ror w16,w9,#0x1b
00adf218	add w11,w11,w16
00adf21c	ldr w16,[sp, #0x94]
00adf220	ror w10,w10,#0x2
00adf224	ror w13,w13,#0x1f
00adf228	ror w15,w15,#0x1f
00adf22c	add w16,w16,w3
00adf230	add w16,w16,w8
00adf234	eor w8,w10,w8
00adf238	eor w8,w8,w9
00adf23c	add w8,w14,w8
00adf240	ror w14,w11,#0x1b
00adf244	add w8,w8,w14
00adf248	eor w14,w18,w13
00adf24c	add w13,w13,w3
00adf250	ror w9,w9,#0x2
00adf254	add w13,w13,w10
00adf258	eor w10,w9,w10
00adf25c	eor w10,w10,w11
00adf260	eor w12,w12,w15
00adf264	add w15,w15,w3
00adf268	ror w11,w11,#0x2
00adf26c	add w10,w16,w10
00adf270	ror w16,w8,#0x1b
00adf274	add w15,w15,w9
00adf278	eor w9,w11,w9
00adf27c	add w10,w10,w16
00adf280	eor w9,w9,w8
00adf284	add w9,w13,w9
00adf288	ror w13,w10,#0x1b
00adf28c	add w9,w9,w13
00adf290	ldr w13,[sp, #0xa0]
00adf294	ror w8,w8,#0x2
00adf298	ror w14,w14,#0x1f
00adf29c	add w14,w14,w3
00adf2a0	add w13,w13,w3
00adf2a4	add w13,w13,w11
00adf2a8	eor w11,w8,w11
00adf2ac	eor w11,w11,w10
00adf2b0	ror w10,w10,#0x2
00adf2b4	add w11,w15,w11
00adf2b8	ror w15,w9,#0x1b
00adf2bc	add w14,w14,w8
00adf2c0	eor w8,w10,w8
00adf2c4	add w11,w11,w15
00adf2c8	eor w8,w8,w9
00adf2cc	mov w15,#0xc1d6
00adf2d0	add w8,w13,w8
00adf2d4	ror w13,w11,#0x1b
00adf2d8	movk w15,#0xca62, LSL #16
00adf2dc	add w13,w8,w13
00adf2e0	ror w8,w12,#0x1f
00adf2e4	add w8,w8,w15
00adf2e8	ror w9,w9,#0x2
00adf2ec	add w8,w8,w10
00adf2f0	eor w10,w9,w10
00adf2f4	eor w10,w10,w11
00adf2f8	add w10,w14,w10
00adf2fc	ldr x16,[sp, #0xb8]
00adf300	ldr w14,[sp, #0xa4]
00adf304	ror w12,w13,#0x1b
00adf308	add w10,w10,w12
00adf30c	ror w11,w11,#0x2
00adf310	add w15,w14,w9
00adf314	ldp w14,w12,[x16, #0xc]
00adf318	eor w9,w11,w9
00adf31c	eor w9,w9,w13
00adf320	add w9,w8,w9
00adf324	add w8,w11,w12
00adf328	ror w12,w13,#0x2
00adf32c	eor w11,w12,w11
00adf330	add w14,w12,w14
00adf334	ror w12,w10,#0x1b
00adf338	add w9,w9,w12
00adf33c	ldr w12,[x16, #0x8]
00adf340	eor w11,w11,w10
00adf344	ror w10,w10,#0x2
00adf348	ldr x1,[sp, #0xa8]
00adf34c	add w13,w10,w12
00adf350	ldr w10,[sp, #0x9c]
00adf354	add w11,w15,w11
00adf358	add x1,x1,#0x40
00adf35c	stp w14,w8,[x16, #0xc]
00adf360	add w3,w9,w10
00adf364	ror w9,w9,#0x1b
00adf368	add w12,w11,w9
00adf36c	stp w3,w13,[x16, #0x4]
00adf370	str w12,[x16]
00adf374	b.ne 0x00ade1b4
00adf378	ldp x29,x30,[sp, #0x110]
00adf37c	ldp x20,x19,[sp, #0x100]
00adf380	ldp x22,x21,[sp, #0xf0]
00adf384	ldp x24,x23,[sp, #0xe0]
00adf388	ldp x26,x25,[sp, #0xd0]
00adf38c	ldp x28,x27,[sp, #0xc0]
00adf390	add sp,sp,#0x120
00adf394	ret
