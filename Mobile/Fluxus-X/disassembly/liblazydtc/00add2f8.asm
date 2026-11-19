; SEED_decrypt @ 00add2f8
00add2f8	ldp w12,w13,[x0, #0x8]
00add2fc	ldp w14,w15,[x2, #0x78]
00add300	adrp x8,0x774000
00add304	add x8,x8,#0xae8
00add308	rev w12,w12
00add30c	eor w14,w14,w12
00add310	rev w13,w13
00add314	eor w15,w14,w15
00add318	eor w15,w15,w13
00add31c	add x9,x8,#0x400
00add320	and w16,w15,#0xff
00add324	ubfx w17,w15,#0x8,#0x8
00add328	add x10,x8,#0x800
00add32c	ubfx w18,w15,#0x10,#0x8
00add330	ldr w16,[x8, w16, UXTW #0x2]
00add334	ldr w17,[x9, w17, UXTW #0x2]
00add338	add x11,x8,#0xc00
00add33c	lsr w15,w15,#0x18
00add340	ldr w18,[x10, w18, UXTW #0x2]
00add344	ldr w15,[x11, w15, UXTW #0x2]
00add348	eor w16,w17,w16
00add34c	ldp w3,w0,[x0]
00add350	eor w16,w16,w18
00add354	eor w15,w16,w15
00add358	add w14,w15,w14
00add35c	and w16,w14,#0xff
00add360	ubfx w17,w14,#0x8,#0x8
00add364	ubfx w18,w14,#0x10,#0x8
00add368	ldr w16,[x8, w16, UXTW #0x2]
00add36c	ldr w17,[x9, w17, UXTW #0x2]
00add370	lsr w14,w14,#0x18
00add374	ldr w18,[x10, w18, UXTW #0x2]
00add378	ldr w14,[x11, w14, UXTW #0x2]
00add37c	eor w16,w17,w16
00add380	rev w3,w3
00add384	eor w16,w16,w18
00add388	eor w14,w16,w14
00add38c	add w15,w14,w15
00add390	and w16,w15,#0xff
00add394	ubfx w17,w15,#0x8,#0x8
00add398	ubfx w18,w15,#0x10,#0x8
00add39c	ldr w16,[x8, w16, UXTW #0x2]
00add3a0	ldr w17,[x9, w17, UXTW #0x2]
00add3a4	ldr w18,[x10, w18, UXTW #0x2]
00add3a8	lsr w15,w15,#0x18
00add3ac	ldr w15,[x11, w15, UXTW #0x2]
00add3b0	eor w16,w17,w16
00add3b4	eor w16,w16,w18
00add3b8	ldp w17,w18,[x2, #0x70]
00add3bc	eor w15,w16,w15
00add3c0	rev w0,w0
00add3c4	add w14,w15,w14
00add3c8	eor w15,w15,w0
00add3cc	eor w14,w14,w3
00add3d0	eor w16,w15,w18
00add3d4	eor w17,w14,w17
00add3d8	eor w16,w16,w17
00add3dc	and w18,w16,#0xff
00add3e0	ubfx w0,w16,#0x8,#0x8
00add3e4	ubfx w3,w16,#0x10,#0x8
00add3e8	ldr w18,[x8, w18, UXTW #0x2]
00add3ec	ldr w0,[x9, w0, UXTW #0x2]
00add3f0	lsr w16,w16,#0x18
00add3f4	ldr w3,[x10, w3, UXTW #0x2]
00add3f8	ldr w16,[x11, w16, UXTW #0x2]
00add3fc	eor w18,w0,w18
00add400	eor w18,w18,w3
00add404	eor w16,w18,w16
00add408	add w17,w16,w17
00add40c	and w18,w17,#0xff
00add410	ubfx w0,w17,#0x8,#0x8
00add414	ubfx w3,w17,#0x10,#0x8
00add418	ldr w18,[x8, w18, UXTW #0x2]
00add41c	ldr w0,[x9, w0, UXTW #0x2]
00add420	lsr w17,w17,#0x18
00add424	ldr w3,[x10, w3, UXTW #0x2]
00add428	ldr w17,[x11, w17, UXTW #0x2]
00add42c	eor w18,w0,w18
00add430	eor w18,w18,w3
00add434	eor w17,w18,w17
00add438	add w16,w17,w16
00add43c	and w18,w16,#0xff
00add440	ubfx w0,w16,#0x8,#0x8
00add444	ubfx w3,w16,#0x10,#0x8
00add448	ldr w18,[x8, w18, UXTW #0x2]
00add44c	ldr w0,[x9, w0, UXTW #0x2]
00add450	ldr w3,[x10, w3, UXTW #0x2]
00add454	lsr w16,w16,#0x18
00add458	ldr w16,[x11, w16, UXTW #0x2]
00add45c	eor w18,w0,w18
00add460	eor w18,w18,w3
00add464	ldp w0,w3,[x2, #0x68]
00add468	eor w16,w18,w16
00add46c	add w17,w16,w17
00add470	eor w13,w16,w13
00add474	eor w12,w17,w12
00add478	eor w16,w13,w3
00add47c	eor w17,w12,w0
00add480	eor w16,w16,w17
00add484	and w18,w16,#0xff
00add488	ubfx w0,w16,#0x8,#0x8
00add48c	ubfx w3,w16,#0x10,#0x8
00add490	ldr w18,[x8, w18, UXTW #0x2]
00add494	ldr w0,[x9, w0, UXTW #0x2]
00add498	lsr w16,w16,#0x18
00add49c	ldr w3,[x10, w3, UXTW #0x2]
00add4a0	ldr w16,[x11, w16, UXTW #0x2]
00add4a4	eor w18,w0,w18
00add4a8	eor w18,w18,w3
00add4ac	eor w16,w18,w16
00add4b0	add w17,w16,w17
00add4b4	and w18,w17,#0xff
00add4b8	ubfx w0,w17,#0x8,#0x8
00add4bc	ubfx w3,w17,#0x10,#0x8
00add4c0	ldr w18,[x8, w18, UXTW #0x2]
00add4c4	ldr w0,[x9, w0, UXTW #0x2]
00add4c8	lsr w17,w17,#0x18
00add4cc	ldr w3,[x10, w3, UXTW #0x2]
00add4d0	ldr w17,[x11, w17, UXTW #0x2]
00add4d4	eor w18,w0,w18
00add4d8	eor w18,w18,w3
00add4dc	eor w17,w18,w17
00add4e0	add w16,w17,w16
00add4e4	and w18,w16,#0xff
00add4e8	ubfx w0,w16,#0x8,#0x8
00add4ec	ubfx w3,w16,#0x10,#0x8
00add4f0	ldr w18,[x8, w18, UXTW #0x2]
00add4f4	ldr w0,[x9, w0, UXTW #0x2]
00add4f8	ldr w3,[x10, w3, UXTW #0x2]
00add4fc	lsr w16,w16,#0x18
00add500	ldr w16,[x11, w16, UXTW #0x2]
00add504	eor w18,w0,w18
00add508	eor w18,w18,w3
00add50c	ldp w0,w3,[x2, #0x60]
00add510	eor w16,w18,w16
00add514	add w17,w16,w17
00add518	eor w15,w16,w15
00add51c	eor w14,w17,w14
00add520	eor w16,w15,w3
00add524	eor w17,w14,w0
00add528	eor w16,w16,w17
00add52c	and w18,w16,#0xff
00add530	ubfx w0,w16,#0x8,#0x8
00add534	ubfx w3,w16,#0x10,#0x8
00add538	ldr w18,[x8, w18, UXTW #0x2]
00add53c	ldr w0,[x9, w0, UXTW #0x2]
00add540	lsr w16,w16,#0x18
00add544	ldr w3,[x10, w3, UXTW #0x2]
00add548	ldr w16,[x11, w16, UXTW #0x2]
00add54c	eor w18,w0,w18
00add550	eor w18,w18,w3
00add554	eor w16,w18,w16
00add558	add w17,w16,w17
00add55c	and w18,w17,#0xff
00add560	ubfx w0,w17,#0x8,#0x8
00add564	ubfx w3,w17,#0x10,#0x8
00add568	ldr w18,[x8, w18, UXTW #0x2]
00add56c	ldr w0,[x9, w0, UXTW #0x2]
00add570	lsr w17,w17,#0x18
00add574	ldr w3,[x10, w3, UXTW #0x2]
00add578	ldr w17,[x11, w17, UXTW #0x2]
00add57c	eor w18,w0,w18
00add580	eor w18,w18,w3
00add584	eor w17,w18,w17
00add588	add w16,w17,w16
00add58c	and w18,w16,#0xff
00add590	ubfx w0,w16,#0x8,#0x8
00add594	ubfx w3,w16,#0x10,#0x8
00add598	ldr w18,[x8, w18, UXTW #0x2]
00add59c	ldr w0,[x9, w0, UXTW #0x2]
00add5a0	ldr w3,[x10, w3, UXTW #0x2]
00add5a4	lsr w16,w16,#0x18
00add5a8	ldr w16,[x11, w16, UXTW #0x2]
00add5ac	eor w18,w0,w18
00add5b0	eor w18,w18,w3
00add5b4	ldp w0,w3,[x2, #0x58]
00add5b8	eor w16,w18,w16
00add5bc	add w17,w16,w17
00add5c0	eor w13,w16,w13
00add5c4	eor w12,w17,w12
00add5c8	eor w16,w13,w3
00add5cc	eor w17,w12,w0
00add5d0	eor w16,w16,w17
00add5d4	and w18,w16,#0xff
00add5d8	ubfx w0,w16,#0x8,#0x8
00add5dc	ubfx w3,w16,#0x10,#0x8
00add5e0	ldr w18,[x8, w18, UXTW #0x2]
00add5e4	ldr w0,[x9, w0, UXTW #0x2]
00add5e8	lsr w16,w16,#0x18
00add5ec	ldr w3,[x10, w3, UXTW #0x2]
00add5f0	ldr w16,[x11, w16, UXTW #0x2]
00add5f4	eor w18,w0,w18
00add5f8	eor w18,w18,w3
00add5fc	eor w16,w18,w16
00add600	add w17,w16,w17
00add604	and w18,w17,#0xff
00add608	ubfx w0,w17,#0x8,#0x8
00add60c	ubfx w3,w17,#0x10,#0x8
00add610	ldr w18,[x8, w18, UXTW #0x2]
00add614	ldr w0,[x9, w0, UXTW #0x2]
00add618	lsr w17,w17,#0x18
00add61c	ldr w3,[x10, w3, UXTW #0x2]
00add620	ldr w17,[x11, w17, UXTW #0x2]
00add624	eor w18,w0,w18
00add628	eor w18,w18,w3
00add62c	eor w17,w18,w17
00add630	add w16,w17,w16
00add634	and w18,w16,#0xff
00add638	ubfx w0,w16,#0x8,#0x8
00add63c	ubfx w3,w16,#0x10,#0x8
00add640	ldr w18,[x8, w18, UXTW #0x2]
00add644	ldr w0,[x9, w0, UXTW #0x2]
00add648	ldr w3,[x10, w3, UXTW #0x2]
00add64c	lsr w16,w16,#0x18
00add650	ldr w16,[x11, w16, UXTW #0x2]
00add654	eor w18,w0,w18
00add658	eor w18,w18,w3
00add65c	ldp w0,w3,[x2, #0x50]
00add660	eor w16,w18,w16
00add664	add w17,w16,w17
00add668	eor w15,w16,w15
00add66c	eor w14,w17,w14
00add670	eor w16,w15,w3
00add674	eor w17,w14,w0
00add678	eor w16,w16,w17
00add67c	and w18,w16,#0xff
00add680	ubfx w0,w16,#0x8,#0x8
00add684	ubfx w3,w16,#0x10,#0x8
00add688	ldr w18,[x8, w18, UXTW #0x2]
00add68c	ldr w0,[x9, w0, UXTW #0x2]
00add690	lsr w16,w16,#0x18
00add694	ldr w3,[x10, w3, UXTW #0x2]
00add698	ldr w16,[x11, w16, UXTW #0x2]
00add69c	eor w18,w0,w18
00add6a0	eor w18,w18,w3
00add6a4	eor w16,w18,w16
00add6a8	add w17,w16,w17
00add6ac	and w18,w17,#0xff
00add6b0	ubfx w0,w17,#0x8,#0x8
00add6b4	ubfx w3,w17,#0x10,#0x8
00add6b8	ldr w18,[x8, w18, UXTW #0x2]
00add6bc	ldr w0,[x9, w0, UXTW #0x2]
00add6c0	lsr w17,w17,#0x18
00add6c4	ldr w3,[x10, w3, UXTW #0x2]
00add6c8	ldr w17,[x11, w17, UXTW #0x2]
00add6cc	eor w18,w0,w18
00add6d0	eor w18,w18,w3
00add6d4	eor w17,w18,w17
00add6d8	add w16,w17,w16
00add6dc	and w18,w16,#0xff
00add6e0	ubfx w0,w16,#0x8,#0x8
00add6e4	ubfx w3,w16,#0x10,#0x8
00add6e8	ldr w18,[x8, w18, UXTW #0x2]
00add6ec	ldr w0,[x9, w0, UXTW #0x2]
00add6f0	ldr w3,[x10, w3, UXTW #0x2]
00add6f4	lsr w16,w16,#0x18
00add6f8	ldr w16,[x11, w16, UXTW #0x2]
00add6fc	eor w18,w0,w18
00add700	eor w18,w18,w3
00add704	ldp w0,w3,[x2, #0x48]
00add708	eor w16,w18,w16
00add70c	add w17,w16,w17
00add710	eor w13,w16,w13
00add714	eor w12,w17,w12
00add718	eor w16,w13,w3
00add71c	eor w17,w12,w0
00add720	eor w16,w16,w17
00add724	and w18,w16,#0xff
00add728	ubfx w0,w16,#0x8,#0x8
00add72c	ubfx w3,w16,#0x10,#0x8
00add730	ldr w18,[x8, w18, UXTW #0x2]
00add734	ldr w0,[x9, w0, UXTW #0x2]
00add738	lsr w16,w16,#0x18
00add73c	ldr w3,[x10, w3, UXTW #0x2]
00add740	ldr w16,[x11, w16, UXTW #0x2]
00add744	eor w18,w0,w18
00add748	eor w18,w18,w3
00add74c	eor w16,w18,w16
00add750	add w17,w16,w17
00add754	and w18,w17,#0xff
00add758	ubfx w0,w17,#0x8,#0x8
00add75c	ubfx w3,w17,#0x10,#0x8
00add760	ldr w18,[x8, w18, UXTW #0x2]
00add764	ldr w0,[x9, w0, UXTW #0x2]
00add768	lsr w17,w17,#0x18
00add76c	ldr w3,[x10, w3, UXTW #0x2]
00add770	ldr w17,[x11, w17, UXTW #0x2]
00add774	eor w18,w0,w18
00add778	eor w18,w18,w3
00add77c	eor w17,w18,w17
00add780	add w16,w17,w16
00add784	and w18,w16,#0xff
00add788	ubfx w0,w16,#0x8,#0x8
00add78c	ubfx w3,w16,#0x10,#0x8
00add790	ldr w18,[x8, w18, UXTW #0x2]
00add794	ldr w0,[x9, w0, UXTW #0x2]
00add798	ldr w3,[x10, w3, UXTW #0x2]
00add79c	lsr w16,w16,#0x18
00add7a0	ldr w16,[x11, w16, UXTW #0x2]
00add7a4	eor w18,w0,w18
00add7a8	eor w18,w18,w3
00add7ac	ldp w0,w3,[x2, #0x40]
00add7b0	eor w16,w18,w16
00add7b4	add w17,w16,w17
00add7b8	eor w15,w16,w15
00add7bc	eor w14,w17,w14
00add7c0	eor w16,w15,w3
00add7c4	eor w17,w14,w0
00add7c8	eor w16,w16,w17
00add7cc	and w18,w16,#0xff
00add7d0	ubfx w0,w16,#0x8,#0x8
00add7d4	ubfx w3,w16,#0x10,#0x8
00add7d8	ldr w18,[x8, w18, UXTW #0x2]
00add7dc	ldr w0,[x9, w0, UXTW #0x2]
00add7e0	lsr w16,w16,#0x18
00add7e4	ldr w3,[x10, w3, UXTW #0x2]
00add7e8	ldr w16,[x11, w16, UXTW #0x2]
00add7ec	eor w18,w0,w18
00add7f0	eor w18,w18,w3
00add7f4	eor w16,w18,w16
00add7f8	add w17,w16,w17
00add7fc	and w18,w17,#0xff
00add800	ubfx w0,w17,#0x8,#0x8
00add804	ubfx w3,w17,#0x10,#0x8
00add808	ldr w18,[x8, w18, UXTW #0x2]
00add80c	ldr w0,[x9, w0, UXTW #0x2]
00add810	lsr w17,w17,#0x18
00add814	ldr w3,[x10, w3, UXTW #0x2]
00add818	ldr w17,[x11, w17, UXTW #0x2]
00add81c	eor w18,w0,w18
00add820	eor w18,w18,w3
00add824	eor w17,w18,w17
00add828	add w16,w17,w16
00add82c	and w18,w16,#0xff
00add830	ubfx w0,w16,#0x8,#0x8
00add834	ubfx w3,w16,#0x10,#0x8
00add838	ldr w18,[x8, w18, UXTW #0x2]
00add83c	ldr w0,[x9, w0, UXTW #0x2]
00add840	ldr w3,[x10, w3, UXTW #0x2]
00add844	lsr w16,w16,#0x18
00add848	ldr w16,[x11, w16, UXTW #0x2]
00add84c	eor w18,w0,w18
00add850	eor w18,w18,w3
00add854	ldp w0,w3,[x2, #0x38]
00add858	eor w16,w18,w16
00add85c	add w17,w16,w17
00add860	eor w13,w16,w13
00add864	eor w12,w17,w12
00add868	eor w16,w13,w3
00add86c	eor w17,w12,w0
00add870	eor w16,w16,w17
00add874	and w18,w16,#0xff
00add878	ubfx w0,w16,#0x8,#0x8
00add87c	ubfx w3,w16,#0x10,#0x8
00add880	ldr w18,[x8, w18, UXTW #0x2]
00add884	ldr w0,[x9, w0, UXTW #0x2]
00add888	lsr w16,w16,#0x18
00add88c	ldr w3,[x10, w3, UXTW #0x2]
00add890	ldr w16,[x11, w16, UXTW #0x2]
00add894	eor w18,w0,w18
00add898	eor w18,w18,w3
00add89c	eor w16,w18,w16
00add8a0	add w17,w16,w17
00add8a4	and w18,w17,#0xff
00add8a8	ubfx w0,w17,#0x8,#0x8
00add8ac	ubfx w3,w17,#0x10,#0x8
00add8b0	ldr w18,[x8, w18, UXTW #0x2]
00add8b4	ldr w0,[x9, w0, UXTW #0x2]
00add8b8	lsr w17,w17,#0x18
00add8bc	ldr w3,[x10, w3, UXTW #0x2]
00add8c0	ldr w17,[x11, w17, UXTW #0x2]
00add8c4	eor w18,w0,w18
00add8c8	eor w18,w18,w3
00add8cc	eor w17,w18,w17
00add8d0	add w16,w17,w16
00add8d4	and w18,w16,#0xff
00add8d8	ubfx w0,w16,#0x8,#0x8
00add8dc	ubfx w3,w16,#0x10,#0x8
00add8e0	ldr w18,[x8, w18, UXTW #0x2]
00add8e4	ldr w0,[x9, w0, UXTW #0x2]
00add8e8	ldr w3,[x10, w3, UXTW #0x2]
00add8ec	lsr w16,w16,#0x18
00add8f0	ldr w16,[x11, w16, UXTW #0x2]
00add8f4	eor w18,w0,w18
00add8f8	eor w18,w18,w3
00add8fc	ldp w0,w3,[x2, #0x30]
00add900	eor w16,w18,w16
00add904	add w17,w16,w17
00add908	eor w15,w16,w15
00add90c	eor w14,w17,w14
00add910	eor w16,w15,w3
00add914	eor w17,w14,w0
00add918	eor w16,w16,w17
00add91c	and w18,w16,#0xff
00add920	ubfx w0,w16,#0x8,#0x8
00add924	ubfx w3,w16,#0x10,#0x8
00add928	ldr w18,[x8, w18, UXTW #0x2]
00add92c	ldr w0,[x9, w0, UXTW #0x2]
00add930	lsr w16,w16,#0x18
00add934	ldr w3,[x10, w3, UXTW #0x2]
00add938	ldr w16,[x11, w16, UXTW #0x2]
00add93c	eor w18,w0,w18
00add940	eor w18,w18,w3
00add944	eor w16,w18,w16
00add948	add w17,w16,w17
00add94c	and w18,w17,#0xff
00add950	ubfx w0,w17,#0x8,#0x8
00add954	ubfx w3,w17,#0x10,#0x8
00add958	ldr w18,[x8, w18, UXTW #0x2]
00add95c	ldr w0,[x9, w0, UXTW #0x2]
00add960	lsr w17,w17,#0x18
00add964	ldr w3,[x10, w3, UXTW #0x2]
00add968	ldr w17,[x11, w17, UXTW #0x2]
00add96c	eor w18,w0,w18
00add970	eor w18,w18,w3
00add974	eor w17,w18,w17
00add978	add w16,w17,w16
00add97c	and w18,w16,#0xff
00add980	ubfx w0,w16,#0x8,#0x8
00add984	ubfx w3,w16,#0x10,#0x8
00add988	ldr w18,[x8, w18, UXTW #0x2]
00add98c	ldr w0,[x9, w0, UXTW #0x2]
00add990	ldr w3,[x10, w3, UXTW #0x2]
00add994	lsr w16,w16,#0x18
00add998	ldr w16,[x11, w16, UXTW #0x2]
00add99c	eor w18,w0,w18
00add9a0	eor w18,w18,w3
00add9a4	ldp w0,w3,[x2, #0x28]
00add9a8	eor w16,w18,w16
00add9ac	add w17,w16,w17
00add9b0	eor w13,w16,w13
00add9b4	eor w12,w17,w12
00add9b8	eor w16,w13,w3
00add9bc	eor w17,w12,w0
00add9c0	eor w16,w16,w17
00add9c4	and w18,w16,#0xff
00add9c8	ubfx w0,w16,#0x8,#0x8
00add9cc	ubfx w3,w16,#0x10,#0x8
00add9d0	ldr w18,[x8, w18, UXTW #0x2]
00add9d4	ldr w0,[x9, w0, UXTW #0x2]
00add9d8	lsr w16,w16,#0x18
00add9dc	ldr w3,[x10, w3, UXTW #0x2]
00add9e0	ldr w16,[x11, w16, UXTW #0x2]
00add9e4	eor w18,w0,w18
00add9e8	eor w18,w18,w3
00add9ec	eor w16,w18,w16
00add9f0	add w17,w16,w17
00add9f4	and w18,w17,#0xff
00add9f8	ubfx w0,w17,#0x8,#0x8
00add9fc	ubfx w3,w17,#0x10,#0x8
00adda00	ldr w18,[x8, w18, UXTW #0x2]
00adda04	ldr w0,[x9, w0, UXTW #0x2]
00adda08	lsr w17,w17,#0x18
00adda0c	ldr w3,[x10, w3, UXTW #0x2]
00adda10	ldr w17,[x11, w17, UXTW #0x2]
00adda14	eor w18,w0,w18
00adda18	eor w18,w18,w3
00adda1c	eor w17,w18,w17
00adda20	add w16,w17,w16
00adda24	and w18,w16,#0xff
00adda28	ubfx w0,w16,#0x8,#0x8
00adda2c	ubfx w3,w16,#0x10,#0x8
00adda30	ldr w18,[x8, w18, UXTW #0x2]
00adda34	ldr w0,[x9, w0, UXTW #0x2]
00adda38	ldr w3,[x10, w3, UXTW #0x2]
00adda3c	lsr w16,w16,#0x18
00adda40	ldr w16,[x11, w16, UXTW #0x2]
00adda44	eor w18,w0,w18
00adda48	eor w18,w18,w3
00adda4c	ldp w0,w3,[x2, #0x20]
00adda50	eor w16,w18,w16
00adda54	add w17,w16,w17
00adda58	eor w15,w16,w15
00adda5c	eor w14,w17,w14
00adda60	eor w16,w15,w3
00adda64	eor w17,w14,w0
00adda68	eor w16,w16,w17
00adda6c	and w18,w16,#0xff
00adda70	ubfx w0,w16,#0x8,#0x8
00adda74	ubfx w3,w16,#0x10,#0x8
00adda78	ldr w18,[x8, w18, UXTW #0x2]
00adda7c	ldr w0,[x9, w0, UXTW #0x2]
00adda80	lsr w16,w16,#0x18
00adda84	ldr w3,[x10, w3, UXTW #0x2]
00adda88	ldr w16,[x11, w16, UXTW #0x2]
00adda8c	eor w18,w0,w18
00adda90	eor w18,w18,w3
00adda94	eor w16,w18,w16
00adda98	add w17,w16,w17
00adda9c	and w18,w17,#0xff
00addaa0	ubfx w0,w17,#0x8,#0x8
00addaa4	ubfx w3,w17,#0x10,#0x8
00addaa8	ldr w18,[x8, w18, UXTW #0x2]
00addaac	ldr w0,[x9, w0, UXTW #0x2]
00addab0	lsr w17,w17,#0x18
00addab4	ldr w3,[x10, w3, UXTW #0x2]
00addab8	ldr w17,[x11, w17, UXTW #0x2]
00addabc	eor w18,w0,w18
00addac0	eor w18,w18,w3
00addac4	eor w17,w18,w17
00addac8	add w16,w17,w16
00addacc	and w18,w16,#0xff
00addad0	ubfx w0,w16,#0x8,#0x8
00addad4	ubfx w3,w16,#0x10,#0x8
00addad8	ldr w18,[x8, w18, UXTW #0x2]
00addadc	ldr w0,[x9, w0, UXTW #0x2]
00addae0	ldr w3,[x10, w3, UXTW #0x2]
00addae4	lsr w16,w16,#0x18
00addae8	ldr w16,[x11, w16, UXTW #0x2]
00addaec	eor w18,w0,w18
00addaf0	eor w18,w18,w3
00addaf4	ldp w0,w3,[x2, #0x18]
00addaf8	eor w16,w18,w16
00addafc	add w17,w16,w17
00addb00	eor w13,w16,w13
00addb04	eor w12,w17,w12
00addb08	eor w16,w13,w3
00addb0c	eor w17,w12,w0
00addb10	eor w16,w16,w17
00addb14	and w18,w16,#0xff
00addb18	ubfx w0,w16,#0x8,#0x8
00addb1c	ubfx w3,w16,#0x10,#0x8
00addb20	ldr w18,[x8, w18, UXTW #0x2]
00addb24	ldr w0,[x9, w0, UXTW #0x2]
00addb28	lsr w16,w16,#0x18
00addb2c	ldr w3,[x10, w3, UXTW #0x2]
00addb30	ldr w16,[x11, w16, UXTW #0x2]
00addb34	eor w18,w0,w18
00addb38	eor w18,w18,w3
00addb3c	eor w16,w18,w16
00addb40	add w17,w16,w17
00addb44	and w18,w17,#0xff
00addb48	ubfx w0,w17,#0x8,#0x8
00addb4c	ubfx w3,w17,#0x10,#0x8
00addb50	ldr w18,[x8, w18, UXTW #0x2]
00addb54	ldr w0,[x9, w0, UXTW #0x2]
00addb58	lsr w17,w17,#0x18
00addb5c	ldr w3,[x10, w3, UXTW #0x2]
00addb60	ldr w17,[x11, w17, UXTW #0x2]
00addb64	eor w18,w0,w18
00addb68	eor w18,w18,w3
00addb6c	eor w17,w18,w17
00addb70	add w16,w17,w16
00addb74	and w18,w16,#0xff
00addb78	ubfx w0,w16,#0x8,#0x8
00addb7c	ubfx w3,w16,#0x10,#0x8
00addb80	ldr w18,[x8, w18, UXTW #0x2]
00addb84	ldr w0,[x9, w0, UXTW #0x2]
00addb88	ldr w3,[x10, w3, UXTW #0x2]
00addb8c	lsr w16,w16,#0x18
00addb90	ldr w16,[x11, w16, UXTW #0x2]
00addb94	eor w18,w0,w18
00addb98	eor w18,w18,w3
00addb9c	ldp w0,w3,[x2, #0x10]
00addba0	eor w16,w18,w16
00addba4	add w17,w16,w17
00addba8	eor w16,w16,w15
00addbac	eor w15,w17,w14
00addbb0	eor w14,w16,w3
00addbb4	eor w17,w15,w0
00addbb8	eor w14,w14,w17
00addbbc	and w18,w14,#0xff
00addbc0	ubfx w0,w14,#0x8,#0x8
00addbc4	ubfx w3,w14,#0x10,#0x8
00addbc8	ldr w18,[x8, w18, UXTW #0x2]
00addbcc	ldr w0,[x9, w0, UXTW #0x2]
00addbd0	lsr w14,w14,#0x18
00addbd4	ldr w3,[x10, w3, UXTW #0x2]
00addbd8	ldr w14,[x11, w14, UXTW #0x2]
00addbdc	eor w18,w0,w18
00addbe0	eor w18,w18,w3
00addbe4	eor w14,w18,w14
00addbe8	add w17,w14,w17
00addbec	and w18,w17,#0xff
00addbf0	ubfx w0,w17,#0x8,#0x8
00addbf4	ubfx w3,w17,#0x10,#0x8
00addbf8	ldr w18,[x8, w18, UXTW #0x2]
00addbfc	ldr w0,[x9, w0, UXTW #0x2]
00addc00	lsr w17,w17,#0x18
00addc04	ldr w3,[x10, w3, UXTW #0x2]
00addc08	ldr w17,[x11, w17, UXTW #0x2]
00addc0c	eor w18,w0,w18
00addc10	eor w18,w18,w3
00addc14	eor w17,w18,w17
00addc18	add w14,w17,w14
00addc1c	and w18,w14,#0xff
00addc20	ubfx w0,w14,#0x8,#0x8
00addc24	ubfx w3,w14,#0x10,#0x8
00addc28	ldr w18,[x8, w18, UXTW #0x2]
00addc2c	ldr w0,[x9, w0, UXTW #0x2]
00addc30	ldr w3,[x10, w3, UXTW #0x2]
00addc34	lsr w14,w14,#0x18
00addc38	ldr w14,[x11, w14, UXTW #0x2]
00addc3c	eor w18,w0,w18
00addc40	eor w18,w18,w3
00addc44	ldp w0,w3,[x2, #0x8]
00addc48	eor w14,w18,w14
00addc4c	add w17,w14,w17
00addc50	eor w13,w14,w13
00addc54	eor w12,w17,w12
00addc58	eor w14,w13,w3
00addc5c	eor w17,w12,w0
00addc60	eor w14,w14,w17
00addc64	and w18,w14,#0xff
00addc68	ubfx w0,w14,#0x8,#0x8
00addc6c	ubfx w3,w14,#0x10,#0x8
00addc70	ldr w18,[x8, w18, UXTW #0x2]
00addc74	ldr w0,[x9, w0, UXTW #0x2]
00addc78	lsr w14,w14,#0x18
00addc7c	ldr w3,[x10, w3, UXTW #0x2]
00addc80	ldr w14,[x11, w14, UXTW #0x2]
00addc84	eor w18,w0,w18
00addc88	eor w18,w18,w3
00addc8c	eor w14,w18,w14
00addc90	add w17,w14,w17
00addc94	and w18,w17,#0xff
00addc98	ubfx w0,w17,#0x8,#0x8
00addc9c	ubfx w3,w17,#0x10,#0x8
00addca0	ldr w18,[x8, w18, UXTW #0x2]
00addca4	ldr w0,[x9, w0, UXTW #0x2]
00addca8	lsr w17,w17,#0x18
00addcac	ldr w3,[x10, w3, UXTW #0x2]
00addcb0	ldr w17,[x11, w17, UXTW #0x2]
00addcb4	eor w18,w0,w18
00addcb8	eor w18,w18,w3
00addcbc	eor w18,w18,w17
00addcc0	add w14,w18,w14
00addcc4	and w17,w14,#0xff
00addcc8	ubfx w0,w14,#0x8,#0x8
00addccc	ldr w17,[x8, w17, UXTW #0x2]
00addcd0	ldr w0,[x9, w0, UXTW #0x2]
00addcd4	ubfx w3,w14,#0x10,#0x8
00addcd8	ldr w3,[x10, w3, UXTW #0x2]
00addcdc	lsr w14,w14,#0x18
00addce0	ldr w14,[x11, w14, UXTW #0x2]
00addce4	eor w17,w0,w17
00addce8	eor w0,w17,w3
00addcec	ldp w17,w2,[x2]
00addcf0	eor w14,w0,w14
00addcf4	add w18,w14,w18
00addcf8	eor w14,w14,w16
00addcfc	eor w15,w18,w15
00addd00	eor w16,w14,w2
00addd04	lsr w18,w14,#0x18
00addd08	lsr w0,w14,#0x10
00addd0c	eor w17,w15,w17
00addd10	lsr w2,w14,#0x8
00addd14	strb w18,[x1, #0xc]
00addd18	lsr w18,w15,#0x18
00addd1c	strb w0,[x1, #0xd]
00addd20	lsr w0,w15,#0x10
00addd24	eor w16,w16,w17
00addd28	strb w2,[x1, #0xe]
00addd2c	strb w18,[x1, #0x8]
00addd30	strb w0,[x1, #0x9]
00addd34	and w18,w16,#0xff
00addd38	ubfx w0,w16,#0x8,#0x8
00addd3c	ubfx w2,w16,#0x10,#0x8
00addd40	ldr w18,[x8, w18, UXTW #0x2]
00addd44	ldr w0,[x9, w0, UXTW #0x2]
00addd48	lsr w16,w16,#0x18
00addd4c	ldr w2,[x10, w2, UXTW #0x2]
00addd50	ldr w16,[x11, w16, UXTW #0x2]
00addd54	eor w18,w0,w18
00addd58	strb w15,[x1, #0xb]
00addd5c	eor w18,w18,w2
00addd60	eor w16,w18,w16
00addd64	add w17,w16,w17
00addd68	and w18,w17,#0xff
00addd6c	ubfx w0,w17,#0x8,#0x8
00addd70	ubfx w2,w17,#0x10,#0x8
00addd74	ldr w18,[x8, w18, UXTW #0x2]
00addd78	ldr w0,[x9, w0, UXTW #0x2]
00addd7c	lsr w17,w17,#0x18
00addd80	ldr w2,[x10, w2, UXTW #0x2]
00addd84	ldr w17,[x11, w17, UXTW #0x2]
00addd88	eor w18,w0,w18
00addd8c	lsr w15,w15,#0x8
00addd90	eor w18,w18,w2
00addd94	eor w17,w18,w17
00addd98	add w16,w17,w16
00addd9c	and w18,w16,#0xff
00addda0	ubfx w0,w16,#0x8,#0x8
00addda4	ubfx w2,w16,#0x10,#0x8
00addda8	ldr w8,[x8, w18, UXTW #0x2]
00adddac	ldr w9,[x9, w0, UXTW #0x2]
00adddb0	lsr w16,w16,#0x18
00adddb4	ldr w10,[x10, w2, UXTW #0x2]
00adddb8	ldr w11,[x11, w16, UXTW #0x2]
00adddbc	eor w8,w9,w8
00adddc0	strb w15,[x1, #0xa]
00adddc4	eor w8,w8,w10
00adddc8	eor w8,w8,w11
00adddcc	add w9,w8,w17
00adddd0	eor w8,w8,w13
00adddd4	eor w9,w9,w12
00adddd8	lsr w10,w8,#0x18
00addddc	lsr w11,w8,#0x10
00addde0	lsr w12,w8,#0x8
00addde4	strb w8,[x1, #0x7]
00addde8	lsr w8,w9,#0x18
00adddec	lsr w13,w9,#0x10
00adddf0	lsr w15,w9,#0x8
00adddf4	strb w9,[x1, #0x3]
00adddf8	strb w10,[x1, #0x4]
00adddfc	strb w11,[x1, #0x5]
00adde00	strb w12,[x1, #0x6]
00adde04	strb w8,[x1]
00adde08	strb w13,[x1, #0x1]
00adde0c	strb w15,[x1, #0x2]
00adde10	strb w14,[x1, #0xf]
00adde14	ret
