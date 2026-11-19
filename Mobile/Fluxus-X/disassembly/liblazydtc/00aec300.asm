; ossl_store_handle_load_result @ 00aec300
00aec300	stp x28,x27,[sp, #-0x60]!
00aec304	stp x26,x25,[sp, #0x10]
00aec308	stp x24,x23,[sp, #0x20]
00aec30c	stp x22,x21,[sp, #0x30]
00aec310	stp x20,x19,[sp, #0x40]
00aec314	stp x29,x30,[sp, #0x50]
00aec318	add x29,sp,#0x50
00aec31c	sub sp,sp,#0x4d0
00aec320	ldr x26,[x1, #0x8]
00aec324	mov x23,x0
00aec328	mov x19,x1
00aec32c	ldr x8,[x26, #0x8]
00aec330	mov x0,x8
00aec334	bl 0x00c402e0
00aec338	mov x22,x0
00aec33c	bl 0x00c3b2f0
00aec340	ldr x20,[x26, #0x30]
00aec344	mov x21,x0
00aec348	mov x0,sp
00aec34c	mov w2,#0x48
00aec350	mov w1,wzr
00aec354	bl 0x00c301c0
00aec358	adrp x1,0x2ce000
00aec35c	add x1,x1,#0xcd9
00aec360	mov x0,x23
00aec364	bl 0x00c36530
00aec368	cbz x0,0x00aec378
00aec36c	mov x1,sp
00aec370	bl 0x00c36510
00aec374	cbz w0,0x00aecb8c
00aec378	adrp x1,0x2a4000
00aec37c	add x1,x1,#0x18
00aec380	mov x0,x23
00aec384	bl 0x00c36530
00aec388	cbz x0,0x00aec39c
00aec38c	mov x8,sp
00aec390	add x1,x8,#0x8
00aec394	bl 0x00c3b420
00aec398	cbz w0,0x00aecb8c
00aec39c	adrp x1,0x2d1000
00aec3a0	add x1,x1,#0x67a
00aec3a4	mov x0,x23
00aec3a8	bl 0x00c36530
00aec3ac	cbz x0,0x00aec3d8
00aec3b0	mov x25,sp
00aec3b4	add x1,x25,#0x20
00aec3b8	add x2,x25,#0x28
00aec3bc	mov x24,x0
00aec3c0	bl 0x00c3e910
00aec3c4	cbnz w0,0x00aec3d8
00aec3c8	add x1,x25,#0x18
00aec3cc	mov x0,x24
00aec3d0	bl 0x00c3b420
00aec3d4	cbz w0,0x00aecb8c
00aec3d8	adrp x1,0x2ad000
00aec3dc	add x1,x1,#0xb85
00aec3e0	mov x0,x23
00aec3e4	bl 0x00c36530
00aec3e8	cbz x0,0x00aec3fc
00aec3ec	mov x8,sp
00aec3f0	add x1,x8,#0x10
00aec3f4	bl 0x00c3b420
00aec3f8	cbz w0,0x00aecb8c
00aec3fc	adrp x1,0x2d5000
00aec400	add x1,x1,#0xc93
00aec404	mov x0,x23
00aec408	bl 0x00c36530
00aec40c	cbz x0,0x00aec424
00aec410	mov x8,sp
00aec414	add x1,x8,#0x30
00aec418	add x2,x8,#0x38
00aec41c	bl 0x00c3e910
00aec420	cbz w0,0x00aecb8c
00aec424	adrp x1,0x2b6000
00aec428	add x1,x1,#0x49c
00aec42c	mov x0,x23
00aec430	bl 0x00c36530
00aec434	cbz x0,0x00aec448
00aec438	mov x8,sp
00aec43c	add x1,x8,#0x40
00aec440	bl 0x00c3b420
00aec444	cbz w0,0x00aecb8c
00aec448	bl 0x00c35250
00aec44c	ldr x8,[x19]
00aec450	cbnz x8,0x00aec4c8
00aec454	ldr w8,[sp]
00aec458	cmp w8,#0x1
00aec45c	b.ne 0x00aec4c8
00aec460	ldr x0,[sp, #0x18]
00aec464	cbz x0,0x00aecb84
00aec468	adrp x1,0x2cc000
00aec46c	add x1,x1,#0xeb
00aec470	mov w2,#0xa6
00aec474	bl 0x00c34600
00aec478	mov x23,x0
00aec47c	cbz x0,0x00aec4a4
00aec480	ldr x0,[sp, #0x40]
00aec484	cbz x0,0x00aec4ac
00aec488	adrp x1,0x2cc000
00aec48c	add x1,x1,#0xeb
00aec490	mov w2,#0xa8
00aec494	bl 0x00c34600
00aec498	mov x24,x0
00aec49c	cbnz x0,0x00aec4b0
00aec4a0	b 0x00aec718
00aec4a4	mov x24,xzr
00aec4a8	b 0x00aec718
00aec4ac	mov x24,xzr
00aec4b0	mov x0,x23
00aec4b4	bl 0x00c40290
00aec4b8	str x0,[x19]
00aec4bc	cbz x0,0x00aec718
00aec4c0	mov x1,x24
00aec4c4	bl 0x00c402b0
00aec4c8	bl 0x00c35240
00aec4cc	bl 0x00c35250
00aec4d0	ldr x8,[x19]
00aec4d4	cbz x8,0x00aec5f8
00aec4d8	bl 0x00c35240
00aec4dc	bl 0x00c35250
00aec4e0	ldr x8,[x19]
00aec4e4	cbz x8,0x00aec744
00aec4e8	bl 0x00c35240
00aec4ec	bl 0x00c35250
00aec4f0	ldr x8,[x19]
00aec4f4	cbz x8,0x00aec788
00aec4f8	bl 0x00c35240
00aec4fc	bl 0x00c35250
00aec500	ldr x8,[x19]
00aec504	cbnz x8,0x00aecb38
00aec508	ldr w8,[sp]
00aec50c	cbnz w8,0x00aecb38
00aec510	ldr x2,[sp, #0x28]
00aec514	mov x8,sp
00aec518	add x1,x8,#0x20
00aec51c	mov x0,xzr
00aec520	bl 0x00c3f450
00aec524	cbz x0,0x00aec898
00aec528	mov w8,#0xffffffff
00aec52c	mov x20,x0
00aec530	stp xzr,xzr,[sp, #0xa8]
00aec534	str xzr,[sp, #0xa0]
00aec538	str w8,[sp]
00aec53c	bl 0x00c3f540
00aec540	cbz w0,0x00aec8a0
00aec544	mov x0,x20
00aec548	mov x1,xzr
00aec54c	mov w2,wzr
00aec550	bl 0x00c3f550
00aec554	mov x21,xzr
00aec558	cbnz w0,0x00aec8a4
00aec55c	adrp x21,0x2ab000
00aec560	add x21,x21,#0x32c
00aec564	mov x0,x20
00aec568	mov x1,x21
00aec56c	mov w2,wzr
00aec570	bl 0x00c3f550
00aec574	cbnz w0,0x00aec8a4
00aec578	add x0,sp,#0x50
00aec57c	mov w2,#0x50
00aec580	mov w1,wzr
00aec584	bl 0x00c301c0
00aec588	adrp x11,0x29c000
00aec58c	ldr q0,[x11, #0xa70]
00aec590	adrp x8,0x29e000
00aec594	adrp x10,0xcc9000
00aec598	add x8,x8,#0x225
00aec59c	mov w9,#0x4
00aec5a0	add x10,x10,#0x3e8
00aec5a4	add x5,x26,#0x48
00aec5a8	add x0,sp,#0xc0
00aec5ac	mov w1,#0x400
00aec5b0	add x2,sp,#0xb8
00aec5b4	add x3,sp,#0x50
00aec5b8	mov w4,wzr
00aec5bc	str x8,[sp, #0x50]
00aec5c0	str w9,[sp, #0x58]
00aec5c4	str x10,[sp, #0x60]
00aec5c8	stur q0,[sp, #0x68]
00aec5cc	add x21,sp,#0xc0
00aec5d0	bl 0x00c3ea20
00aec5d4	cbz w0,0x00aecc44
00aec5d8	ldr x2,[sp, #0xb8]
00aec5dc	add x1,sp,#0xc0
00aec5e0	mov x0,x20
00aec5e4	strb wzr,[x21, x2]
00aec5e8	bl 0x00c3f550
00aec5ec	cbz w0,0x00aecc70
00aec5f0	add x21,sp,#0xc0
00aec5f4	b 0x00aec8a4
00aec5f8	ldr w8,[sp]
00aec5fc	cbz w8,0x00aec7e0
00aec600	cmp w8,#0x2
00aec604	b.ne 0x00aec4d8
00aec608	ldr x8,[sp, #0x30]
00aec60c	cbz x8,0x00aec7e0
00aec610	ldr x1,[sp, #0x8]
00aec614	cbz x1,0x00aecb84
00aec618	mov x0,x21
00aec61c	mov x2,x20
00aec620	bl 0x00c36340
00aec624	mov x23,x0
00aec628	bl 0x00c35250
00aec62c	cbz x23,0x00aeca18
00aec630	mov w24,#0x2
00aec634	mov w27,#0x87
00aec638	subs w28,w24,#0x1
00aec63c	b.lt 0x00aeca18
00aec640	mov x0,x23
00aec644	bl 0x00c36360
00aec648	cmp x0,x22
00aec64c	b.eq 0x00aec68c
00aec650	ldr x8,[x26, #0x8]
00aec654	ldr x8,[x8, #0xc8]
00aec658	stp x23,xzr,[sp, #0xc0]
00aec65c	str w27,[sp, #0xd0]
00aec660	cbz x8,0x00aec6ac
00aec664	adrp x3,0xcb5000
00aec668	ldr x0,[x26, #0x10]
00aec66c	ldp x1,x2,[sp, #0x30]
00aec670	ldr x3,[x3, #0x5b8]
00aec674	add x4,sp,#0xc0
00aec678	blr x8
00aec67c	ldr x25,[sp, #0xc8]
00aec680	cmp w24,#0x2
00aec684	b.ge 0x00aec6b8
00aec688	b 0x00aec6e8
00aec68c	ldp x1,x2,[sp, #0x30]
00aec690	mov x0,x23
00aec694	bl 0x00c3b750
00aec698	mov x25,x0
00aec69c	mov w24,wzr
00aec6a0	cbnz x25,0x00aec6f0
00aec6a4	cbnz x23,0x00aec638
00aec6a8	b 0x00aec6f0
00aec6ac	mov x25,xzr
00aec6b0	cmp w24,#0x2
00aec6b4	b.lt 0x00aec6e8
00aec6b8	cbnz x25,0x00aec6e8
00aec6bc	mov x0,x23
00aec6c0	bl 0x00c36350
00aec6c4	ldr x1,[sp, #0x8]
00aec6c8	mov x0,x22
00aec6cc	mov x2,x20
00aec6d0	bl 0x00c3bf80
00aec6d4	mov x23,x0
00aec6d8	cbz x0,0x00aeca18
00aec6dc	bl 0x00c35240
00aec6e0	bl 0x00c35250
00aec6e4	mov x25,xzr
00aec6e8	mov w24,w28
00aec6ec	cbz x25,0x00aec6a4
00aec6f0	cbz x25,0x00aeca18
00aec6f4	bl 0x00c35240
00aec6f8	mov x0,x23
00aec6fc	mov x1,x25
00aec700	bl 0x00c3b760
00aec704	mov x22,x0
00aec708	mov x0,x23
00aec70c	bl 0x00c36350
00aec710	cbnz x22,0x00aec874
00aec714	b 0x00aecb84
00aec718	adrp x19,0x2cc000
00aec71c	add x19,x19,#0xeb
00aec720	mov w2,#0xaa
00aec724	mov x0,x23
00aec728	mov x1,x19
00aec72c	bl 0x00c32310
00aec730	mov w2,#0xab
00aec734	mov x0,x24
00aec738	mov x1,x19
00aec73c	bl 0x00c32310
00aec740	b 0x00aecb84
00aec744	ldr w8,[sp]
00aec748	cmp w8,#0x3
00aec74c	b.eq 0x00aec754
00aec750	cbnz w8,0x00aec4e8
00aec754	mov x0,x21
00aec758	mov x1,x20
00aec75c	bl 0x00c350a0
00aec760	str x0,[sp, #0xc0]
00aec764	cbz x0,0x00aecb84
00aec768	ldr x0,[sp, #0x8]
00aec76c	cbz x0,0x00aec988
00aec770	adrp x1,0x2c6000
00aec774	add x1,x1,#0xbc
00aec778	bl 0x00c35ee0
00aec77c	cmp w0,#0x0
00aec780	cset w23,ne
00aec784	b 0x00aec98c
00aec788	ldr w8,[sp]
00aec78c	orr w8,w8,#0x4
00aec790	cmp w8,#0x4
00aec794	b.ne 0x00aec4f8
00aec798	ldr x2,[sp, #0x28]
00aec79c	mov x8,sp
00aec7a0	add x1,x8,#0x20
00aec7a4	mov x0,xzr
00aec7a8	bl 0x00c3f1f0
00aec7ac	cbz x0,0x00aeca00
00aec7b0	mov w8,#0x4
00aec7b4	mov x1,x21
00aec7b8	mov x2,x20
00aec7bc	mov x22,x0
00aec7c0	str w8,[sp]
00aec7c4	bl 0x00c40340
00aec7c8	cbz w0,0x00aec9f8
00aec7cc	mov x0,x22
00aec7d0	bl 0x00c40280
00aec7d4	str x0,[x19]
00aec7d8	cbnz x0,0x00aec4f8
00aec7dc	b 0x00aeca0c
00aec7e0	ldr x8,[sp, #0x20]
00aec7e4	cbz x8,0x00aecd70
00aec7e8	ldr x9,[sp, #0x28]
00aec7ec	str x8,[sp, #0x50]
00aec7f0	mov x22,xzr
00aec7f4	add x23,x26,#0x48
00aec7f8	stp x9,xzr,[sp, #0xb8]
00aec7fc	ldrsw x8,[x26, #0x28]
00aec800	cmp w8,#0x4
00aec804	b.hi 0x00aec870
00aec808	and x9,x8,#0xff
00aec80c	mov w10,#0x1d
00aec810	lsr w9,w10,w9
00aec814	mov x22,xzr
00aec818	tbz w9,#0x0,0x00aec870
00aec81c	adrp x9,0x777000
00aec820	add x9,x9,#0x210
00aec824	ldp x3,x2,[sp, #0x8]
00aec828	ldr w4,[x9, x8, LSL #0x2]
00aec82c	add x0,sp,#0xc0
00aec830	mov x1,xzr
00aec834	mov x5,x21
00aec838	mov x6,x20
00aec83c	bl 0x00c35f10
00aec840	adrp x1,0xcb5000
00aec844	ldr x1,[x1, #0x5a0]
00aec848	mov x2,x23
00aec84c	mov x22,x0
00aec850	bl 0x00c3b700
00aec854	add x1,sp,#0x50
00aec858	add x2,sp,#0xb8
00aec85c	mov x0,x22
00aec860	bl 0x00c37cf0
00aec864	mov x0,x22
00aec868	bl 0x00c35f00
00aec86c	ldr x22,[sp, #0xc0]
00aec870	cbz x22,0x00aeca28
00aec874	mov w8,#0x2
00aec878	str w8,[sp]
00aec87c	mov w1,#0x1
00aec880	mov x0,x22
00aec884	bl 0x00c37d30
00aec888	cbz w0,0x00aeca7c
00aec88c	adrp x23,0xcb5000
00aec890	ldr x23,[x23, #0x7e8]
00aec894	b 0x00aecaa0
00aec898	mov w25,#0x1
00aec89c	b 0x00aecb28
00aec8a0	mov x21,xzr
00aec8a4	add x2,sp,#0xb0
00aec8a8	add x3,sp,#0xa8
00aec8ac	add x4,sp,#0xa0
00aec8b0	mov x0,x20
00aec8b4	mov x1,x21
00aec8b8	bl 0x00c32690
00aec8bc	cbz w0,0x00aec96c
00aec8c0	bl 0x00c34780
00aec8c4	mov x21,x0
00aec8c8	cbz x0,0x00aec974
00aec8cc	ldr x0,[sp, #0xb0]
00aec8d0	cbz x0,0x00aec8f4
00aec8d4	bl 0x00c402a0
00aec8d8	mov x22,x0
00aec8dc	cbz x0,0x00aeca74
00aec8e0	mov x0,x21
00aec8e4	mov x1,x22
00aec8e8	str xzr,[sp, #0xb0]
00aec8ec	bl 0x00c347a0
00aec8f0	cbz w0,0x00aeca74
00aec8f4	ldr x0,[sp, #0xa8]
00aec8f8	cbz x0,0x00aec91c
00aec8fc	bl 0x00c40270
00aec900	mov x23,x0
00aec904	cbz x0,0x00aecab4
00aec908	mov x0,x21
00aec90c	mov x1,x23
00aec910	str xzr,[sp, #0xa8]
00aec914	bl 0x00c347a0
00aec918	cbz w0,0x00aecab4
00aec91c	ldr x0,[sp, #0xa0]
00aec920	bl 0x00c325e0
00aec924	cmp w0,#0x1
00aec928	b.lt 0x00aec974
00aec92c	ldr x0,[sp, #0xa0]
00aec930	mov w1,wzr
00aec934	bl 0x00c32610
00aec938	bl 0x00c40270
00aec93c	mov x24,x0
00aec940	cbz x0,0x00aec960
00aec944	ldr x0,[sp, #0xa0]
00aec948	bl 0x00c34e00
00aec94c	cbz x0,0x00aec960
00aec950	mov x0,x21
00aec954	mov x1,x24
00aec958	bl 0x00c347a0
00aec95c	cbnz w0,0x00aec91c
00aec960	mov x22,xzr
00aec964	mov x23,xzr
00aec968	b 0x00aecabc
00aec96c	mov w25,wzr
00aec970	b 0x00aecb14
00aec974	mov x22,xzr
00aec978	mov x23,xzr
00aec97c	mov x24,xzr
00aec980	mov w25,#0x1
00aec984	b 0x00aecac0
00aec988	mov w23,#0x1
00aec98c	ldr x2,[sp, #0x28]
00aec990	mov x8,sp
00aec994	add x22,x8,#0x20
00aec998	add x0,sp,#0xc0
00aec99c	mov x1,x22
00aec9a0	bl 0x00c3f1e0
00aec9a4	cbz x0,0x00aec9d0
00aec9a8	ldr x0,[sp, #0xc0]
00aec9ac	cbz x0,0x00aec4e8
00aec9b0	orr w8,wzr,#0x3
00aec9b4	str w8,[sp]
00aec9b8	bl 0x00c40270
00aec9bc	str x0,[x19]
00aec9c0	cbnz x0,0x00aec4e8
00aec9c4	ldr x0,[sp, #0xc0]
00aec9c8	bl 0x00c31a90
00aec9cc	b 0x00aec4e8
00aec9d0	cbz w23,0x00aec9e8
00aec9d4	ldr x2,[sp, #0x28]
00aec9d8	add x0,sp,#0xc0
00aec9dc	mov x1,x22
00aec9e0	bl 0x00c35ca0
00aec9e4	cbnz x0,0x00aec9a8
00aec9e8	ldr x0,[sp, #0xc0]
00aec9ec	bl 0x00c31a90
00aec9f0	str xzr,[sp, #0xc0]
00aec9f4	b 0x00aec4e8
00aec9f8	mov x0,x22
00aec9fc	bl 0x00c382b0
00aeca00	ldr x0,[x19]
00aeca04	mov x22,xzr
00aeca08	cbnz x0,0x00aec4f8
00aeca0c	mov x0,x22
00aeca10	bl 0x00c382b0
00aeca14	b 0x00aec4f8
00aeca18	bl 0x00c35ed0
00aeca1c	mov x0,x23
00aeca20	bl 0x00c36350
00aeca24	b 0x00aecb84
00aeca28	ldr w8,[x26, #0x28]
00aeca2c	ldp x25,x24,[sp, #0x20]
00aeca30	cmp w8,#0x3
00aeca34	b.eq 0x00aeca3c
00aeca38	cbnz w8,0x00aecbb0
00aeca3c	add x1,sp,#0x50
00aeca40	mov x0,xzr
00aeca44	mov x2,x24
00aeca48	mov x3,x21
00aeca4c	mov x4,x20
00aeca50	str x25,[sp, #0x50]
00aeca54	bl 0x00c39810
00aeca58	cbz x0,0x00aecbac
00aeca5c	mov w8,#0x2
00aeca60	str w8,[sp]
00aeca64	adrp x23,0xcb5000
00aeca68	ldr x23,[x23, #0x7f0]
00aeca6c	mov x22,x0
00aeca70	b 0x00aecaa0
00aeca74	mov x23,xzr
00aeca78	b 0x00aecab8
00aeca7c	mov w1,#0x2
00aeca80	mov x0,x22
00aeca84	bl 0x00c37d30
00aeca88	adrp x8,0xcb5000
00aeca8c	adrp x9,0xcb5000
00aeca90	ldr x8,[x8, #0x7f0]
00aeca94	ldr x9,[x9, #0x7e0]
00aeca98	cmp w0,#0x0
00aeca9c	csel x23,x9,x8,eq
00aecaa0	mov x0,x22
00aecaa4	blr x23
00aecaa8	str x0,[x19]
00aecaac	cbnz x0,0x00aec4d8
00aecab0	b 0x00aecd7c
00aecab4	mov x22,xzr
00aecab8	mov x24,xzr
00aecabc	mov w25,wzr
00aecac0	ldr x0,[sp, #0xb0]
00aecac4	bl 0x00c32450
00aecac8	ldr x0,[sp, #0xa8]
00aecacc	bl 0x00c31a90
00aecad0	adrp x1,0xcb4000
00aecad4	ldr x0,[sp, #0xa0]
00aecad8	ldr x1,[x1, #0xd88]
00aecadc	bl 0x00c32600
00aecae0	mov x0,x22
00aecae4	bl 0x00c34e20
00aecae8	mov x0,x23
00aecaec	bl 0x00c34e20
00aecaf0	mov x0,x24
00aecaf4	bl 0x00c34e20
00aecaf8	cbnz w25,0x00aecb10
00aecafc	adrp x1,0xcb5000
00aecb00	ldr x1,[x1, #0x168]
00aecb04	mov x0,x21
00aecb08	bl 0x00c32600
00aecb0c	mov x21,xzr
00aecb10	str x21,[x26, #0x40]
00aecb14	add x0,sp,#0xc0
00aecb18	mov w1,#0x401
00aecb1c	bl 0x00c34750
00aecb20	mov x0,x20
00aecb24	bl 0x00c32680
00aecb28	ldr x0,[x26, #0x40]
00aecb2c	bl 0x00c34e00
00aecb30	str x0,[x19]
00aecb34	cbz w25,0x00aecb84
00aecb38	bl 0x00c35240
00aecb3c	ldr x8,[x19]
00aecb40	cbnz x8,0x00aecb78
00aecb44	bl 0x00c342a0
00aecb48	adrp x0,0x2cc000
00aecb4c	adrp x2,0x2c8000
00aecb50	add x0,x0,#0xeb
00aecb54	add x2,x2,#0x2dc
00aecb58	mov w1,#0x97
00aecb5c	bl 0x00c342b0
00aecb60	mov w1,#0x10c
00aecb64	mov w0,#0x2c
00aecb68	movk w1,#0x8, LSL #16
00aecb6c	mov x2,xzr
00aecb70	bl 0x00c342c0
00aecb74	ldr x8,[x19]
00aecb78	cmp x8,#0x0
00aecb7c	cset w0,ne
00aecb80	b 0x00aecb8c
00aecb84	bl 0x00c35ed0
00aecb88	mov w0,wzr
00aecb8c	add sp,sp,#0x4d0
00aecb90	ldp x29,x30,[sp, #0x50]
00aecb94	ldp x20,x19,[sp, #0x40]
00aecb98	ldp x22,x21,[sp, #0x30]
00aecb9c	ldp x24,x23,[sp, #0x20]
00aecba0	ldp x26,x25,[sp, #0x10]
00aecba4	ldp x28,x27,[sp], #0x60
00aecba8	ret
00aecbac	ldr w8,[x26, #0x28]
00aecbb0	orr w8,w8,#0x4
00aecbb4	cmp w8,#0x4
00aecbb8	b.ne 0x00aecd70
00aecbbc	add x1,sp,#0x50
00aecbc0	mov x0,xzr
00aecbc4	mov x2,x24
00aecbc8	str xzr,[sp, #0xb8]
00aecbcc	str x25,[sp, #0x50]
00aecbd0	bl 0x00c38320
00aecbd4	cbz x0,0x00aeccf0
00aecbd8	mov x22,x0
00aecbdc	add x0,sp,#0xc0
00aecbe0	mov w1,#0x400
00aecbe4	add x2,sp,#0xb0
00aecbe8	mov x3,xzr
00aecbec	mov x4,x23
00aecbf0	str xzr,[sp, #0xb0]
00aecbf4	bl 0x00c3b4c0
00aecbf8	cbz w0,0x00aeccbc
00aecbfc	add x1,sp,#0xa8
00aecc00	add x2,sp,#0xa0
00aecc04	mov x0,x22
00aecc08	stp xzr,xzr,[sp, #0xa0]
00aecc0c	str wzr,[sp, #0x4c]
00aecc10	bl 0x00c38300
00aecc14	ldp x8,x0,[sp, #0xa0]
00aecc18	ldr w2,[sp, #0xb0]
00aecc1c	add x1,sp,#0xc0
00aecc20	add x5,sp,#0xb8
00aecc24	ldr x3,[x8, #0x8]
00aecc28	ldr w4,[x8]
00aecc2c	add x6,sp,#0x4c
00aecc30	mov w7,wzr
00aecc34	bl 0x00c3f4a0
00aecc38	ldrsw x24,[sp, #0x4c]
00aecc3c	ldr x25,[sp, #0xb8]
00aecc40	b 0x00aecce8
00aecc44	bl 0x00c342a0
00aecc48	adrp x0,0x2cc000
00aecc4c	adrp x2,0x2c2000
00aecc50	add x0,x0,#0xeb
00aecc54	add x2,x2,#0x3fc
00aecc58	mov w1,#0x23e
00aecc5c	bl 0x00c342b0
00aecc60	mov w0,#0x2c
00aecc64	mov w1,#0x72
00aecc68	mov x2,xzr
00aecc6c	b 0x00aeccb0
00aecc70	bl 0x00c342a0
00aecc74	adrp x0,0x2cc000
00aecc78	adrp x2,0x2c2000
00aecc7c	add x0,x0,#0xeb
00aecc80	add x2,x2,#0x3fc
00aecc84	mov w1,#0x248
00aecc88	bl 0x00c342b0
00aecc8c	ldr x8,[sp, #0xb8]
00aecc90	adrp x9,0x2d4000
00aecc94	adrp x10,0x2dc000
00aecc98	add x9,x9,#0x338
00aecc9c	add x10,x10,#0x84f
00aecca0	cmp x8,#0x0
00aecca4	csel x2,x10,x9,eq
00aecca8	mov w0,#0x2c
00aeccac	mov w1,#0x71
00aeccb0	bl 0x00c342c0
00aeccb4	mov w25,wzr
00aeccb8	b 0x00aecb14
00aeccbc	bl 0x00c342a0
00aeccc0	adrp x0,0x2cc000
00aeccc4	adrp x2,0x2be000
00aeccc8	add x0,x0,#0xeb
00aecccc	add x2,x2,#0x3ac
00aeccd0	mov w1,#0x155
00aeccd4	bl 0x00c342b0
00aeccd8	mov w0,#0x2c
00aeccdc	mov w1,#0x73
00aecce0	mov x2,xzr
00aecce4	bl 0x00c342c0
00aecce8	mov x0,x22
00aeccec	bl 0x00c382f0
00aeccf0	cbz x25,0x00aecd40
00aeccf4	add x1,sp,#0x50
00aeccf8	mov x0,xzr
00aeccfc	mov x2,x24
00aecd00	str x25,[sp, #0x50]
00aecd04	bl 0x00c37d20
00aecd08	mov x23,x0
00aecd0c	cbz x0,0x00aecd44
00aecd10	mov x0,x23
00aecd14	mov x1,x21
00aecd18	mov x2,x20
00aecd1c	bl 0x00c3d0b0
00aecd20	mov x22,x0
00aecd24	mov x0,x23
00aecd28	bl 0x00c37d00
00aecd2c	adrp x8,0xcb5000
00aecd30	ldr x8,[x8, #0x7e8]
00aecd34	cmp x22,#0x0
00aecd38	csel x23,xzr,x8,eq
00aecd3c	b 0x00aecd48
00aecd40	mov x23,xzr
00aecd44	mov x22,xzr
00aecd48	ldr x0,[sp, #0xb8]
00aecd4c	adrp x1,0x2cc000
00aecd50	add x1,x1,#0xeb
00aecd54	mov w2,#0x17c
00aecd58	bl 0x00c32310
00aecd5c	cbz x22,0x00aecd70
00aecd60	mov w8,#0x2
00aecd64	str w8,[sp]
00aecd68	cbnz x23,0x00aecaa0
00aecd6c	b 0x00aec87c
00aecd70	ldr x0,[x19]
00aecd74	mov x22,xzr
00aecd78	cbnz x0,0x00aec4d8
00aecd7c	mov x0,x22
00aecd80	bl 0x00c32450
00aecd84	b 0x00aec4d8
