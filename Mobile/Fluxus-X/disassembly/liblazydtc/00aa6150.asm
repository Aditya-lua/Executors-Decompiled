; md5_block_data_order @ 00aa6150
00aa6150	stp x28,x27,[sp, #-0x60]!
00aa6154	stp x26,x25,[sp, #0x10]
00aa6158	stp x24,x23,[sp, #0x20]
00aa615c	stp x22,x21,[sp, #0x30]
00aa6160	stp x20,x19,[sp, #0x40]
00aa6164	stp x29,x30,[sp, #0x50]
00aa6168	cbz x2,0x00aa6b38
00aa616c	ldp w27,w29,[x0, #0x8]
00aa6170	ldp w30,w28,[x0]
00aa6174	mov w11,#0x11a1
00aa6178	mov w12,#0x7e82
00aa617c	mov w13,#0xf235
00aa6180	mov w14,#0xd2bb
00aa6184	mov w15,#0xd391
00aa6188	movk w11,#0x4e08, LSL #16
00aa618c	movk w12,#0xf753, LSL #16
00aa6190	movk w13,#0xbd3a, LSL #16
00aa6194	movk w14,#0x2ad7, LSL #16
00aa6198	movk w15,#0xeb86, LSL #16
00aa619c	ldp w6,w18,[x1]
00aa61a0	eor w8,w27,w29
00aa61a4	and w8,w8,w28
00aa61a8	eor w8,w8,w29
00aa61ac	add w8,w30,w8
00aa61b0	mov w10,#0xa478
00aa61b4	add w8,w8,w6
00aa61b8	movk w10,#0xd76a, LSL #16
00aa61bc	add w8,w8,w10
00aa61c0	ror w8,w8,#0x19
00aa61c4	eor w9,w28,w27
00aa61c8	add w8,w8,w28
00aa61cc	and w9,w8,w9
00aa61d0	add w29,w29,w18
00aa61d4	eor w9,w9,w27
00aa61d8	mov w10,#0xb756
00aa61dc	add w9,w29,w9
00aa61e0	movk w10,#0xe8c7, LSL #16
00aa61e4	ldp w16,w5,[x1, #0x8]
00aa61e8	add w9,w9,w10
00aa61ec	ror w9,w9,#0x14
00aa61f0	eor w29,w8,w28
00aa61f4	add w9,w9,w8
00aa61f8	and w29,w9,w29
00aa61fc	add w30,w27,w16
00aa6200	add w27,w28,w5
00aa6204	eor w28,w29,w28
00aa6208	mov w10,#0x70db
00aa620c	add w28,w30,w28
00aa6210	movk w10,#0x2420, LSL #16
00aa6214	ldp w17,w20,[x1, #0x10]
00aa6218	add w28,w28,w10
00aa621c	ror w28,w28,#0xf
00aa6220	eor w30,w9,w8
00aa6224	add w28,w28,w9
00aa6228	and w30,w28,w30
00aa622c	add w29,w8,w17
00aa6230	eor w8,w30,w8
00aa6234	mov w10,#0xceee
00aa6238	add w8,w27,w8
00aa623c	movk w10,#0xc1bd, LSL #16
00aa6240	add w8,w8,w10
00aa6244	ror w8,w8,#0xa
00aa6248	eor w27,w28,w9
00aa624c	add w8,w8,w28
00aa6250	and w27,w8,w27
00aa6254	add w30,w9,w20
00aa6258	eor w9,w27,w9
00aa625c	mov w10,#0xfaf
00aa6260	add w9,w29,w9
00aa6264	movk w10,#0xf57c, LSL #16
00aa6268	ldp w4,w23,[x1, #0x18]
00aa626c	add w9,w9,w10
00aa6270	ror w9,w9,#0x19
00aa6274	eor w29,w8,w28
00aa6278	add w9,w9,w8
00aa627c	and w29,w9,w29
00aa6280	add w27,w28,w4
00aa6284	eor w28,w29,w28
00aa6288	mov w10,#0xc62a
00aa628c	add w28,w30,w28
00aa6290	movk w10,#0x4787, LSL #16
00aa6294	add w28,w28,w10
00aa6298	ror w28,w28,#0x14
00aa629c	eor w30,w9,w8
00aa62a0	add w28,w28,w9
00aa62a4	and w30,w28,w30
00aa62a8	add w29,w8,w23
00aa62ac	eor w8,w30,w8
00aa62b0	mov w10,#0x4613
00aa62b4	add w8,w27,w8
00aa62b8	movk w10,#0xa830, LSL #16
00aa62bc	ldp w19,w3,[x1, #0x20]
00aa62c0	add w8,w8,w10
00aa62c4	ror w8,w8,#0xf
00aa62c8	eor w27,w28,w9
00aa62cc	add w8,w8,w28
00aa62d0	and w27,w8,w27
00aa62d4	add w30,w19,w9
00aa62d8	eor w9,w27,w9
00aa62dc	mov w10,#0x9501
00aa62e0	add w9,w29,w9
00aa62e4	movk w10,#0xfd46, LSL #16
00aa62e8	add w9,w9,w10
00aa62ec	ror w9,w9,#0xa
00aa62f0	eor w29,w8,w28
00aa62f4	add w9,w9,w8
00aa62f8	and w29,w9,w29
00aa62fc	add w27,w3,w28
00aa6300	eor w28,w29,w28
00aa6304	mov w10,#0x98d8
00aa6308	add w28,w30,w28
00aa630c	movk w10,#0x6980, LSL #16
00aa6310	ldp w22,w7,[x1, #0x28]
00aa6314	add w28,w28,w10
00aa6318	ror w28,w28,#0x19
00aa631c	eor w30,w9,w8
00aa6320	add w28,w28,w9
00aa6324	and w30,w28,w30
00aa6328	add w29,w22,w8
00aa632c	eor w8,w30,w8
00aa6330	mov w10,#0xf7af
00aa6334	add w8,w27,w8
00aa6338	movk w10,#0x8b44, LSL #16
00aa633c	add w8,w8,w10
00aa6340	ror w8,w8,#0x14
00aa6344	eor w27,w28,w9
00aa6348	add w8,w8,w28
00aa634c	and w27,w8,w27
00aa6350	add w30,w7,w9
00aa6354	eor w9,w27,w9
00aa6358	add w9,w29,w9
00aa635c	mov w10,#0xffff5bb1
00aa6360	ldp w25,w21,[x1, #0x30]
00aa6364	add w9,w9,w10
00aa6368	ror w9,w9,#0xf
00aa636c	eor w29,w8,w28
00aa6370	add w9,w9,w8
00aa6374	and w29,w9,w29
00aa6378	add w27,w25,w28
00aa637c	eor w28,w29,w28
00aa6380	mov w10,#0xd7be
00aa6384	add w28,w30,w28
00aa6388	movk w10,#0x895c, LSL #16
00aa638c	add w28,w28,w10
00aa6390	ror w28,w28,#0xa
00aa6394	eor w30,w9,w8
00aa6398	add w28,w28,w9
00aa639c	and w30,w28,w30
00aa63a0	add w29,w21,w8
00aa63a4	eor w8,w30,w8
00aa63a8	mov w10,#0x1122
00aa63ac	add w8,w27,w8
00aa63b0	movk w10,#0x6b90, LSL #16
00aa63b4	ldp w26,w24,[x1, #0x38]
00aa63b8	add w8,w8,w10
00aa63bc	ror w8,w8,#0x19
00aa63c0	eor w27,w28,w9
00aa63c4	add w8,w8,w28
00aa63c8	and w27,w8,w27
00aa63cc	add w30,w26,w9
00aa63d0	eor w9,w27,w9
00aa63d4	mov w10,#0x7193
00aa63d8	add w9,w29,w9
00aa63dc	movk w10,#0xfd98, LSL #16
00aa63e0	add w9,w9,w10
00aa63e4	ror w9,w9,#0x14
00aa63e8	eor w29,w8,w28
00aa63ec	add w9,w9,w8
00aa63f0	and w29,w9,w29
00aa63f4	add w27,w24,w28
00aa63f8	eor w28,w29,w28
00aa63fc	mov w10,#0x438e
00aa6400	add w28,w30,w28
00aa6404	movk w10,#0xa679, LSL #16
00aa6408	add w28,w28,w10
00aa640c	ror w28,w28,#0xf
00aa6410	eor w30,w9,w8
00aa6414	add w28,w28,w9
00aa6418	and w30,w28,w30
00aa641c	add w29,w18,w8
00aa6420	eor w8,w30,w8
00aa6424	mov w10,#0x821
00aa6428	add w8,w27,w8
00aa642c	movk w10,#0x49b4, LSL #16
00aa6430	add w8,w8,w10
00aa6434	ror w8,w8,#0xa
00aa6438	add w8,w8,w28
00aa643c	eor w27,w8,w28
00aa6440	add w30,w4,w9
00aa6444	and w9,w27,w9
00aa6448	eor w9,w9,w28
00aa644c	mov w10,#0x2562
00aa6450	add w9,w29,w9
00aa6454	movk w10,#0xf61e, LSL #16
00aa6458	add w9,w9,w10
00aa645c	ror w9,w9,#0x1b
00aa6460	add w9,w9,w8
00aa6464	eor w29,w9,w8
00aa6468	add w27,w7,w28
00aa646c	and w28,w29,w28
00aa6470	eor w28,w28,w8
00aa6474	mov w10,#0xb340
00aa6478	add w28,w30,w28
00aa647c	movk w10,#0xc040, LSL #16
00aa6480	add w28,w28,w10
00aa6484	ror w28,w28,#0x17
00aa6488	add w28,w28,w9
00aa648c	eor w30,w28,w9
00aa6490	add w29,w6,w8
00aa6494	and w8,w30,w8
00aa6498	eor w8,w8,w9
00aa649c	mov w10,#0x5a51
00aa64a0	add w8,w27,w8
00aa64a4	movk w10,#0x265e, LSL #16
00aa64a8	add w8,w8,w10
00aa64ac	ror w8,w8,#0x12
00aa64b0	add w8,w8,w28
00aa64b4	eor w27,w8,w28
00aa64b8	add w30,w20,w9
00aa64bc	and w9,w27,w9
00aa64c0	eor w9,w9,w28
00aa64c4	mov w10,#0xc7aa
00aa64c8	add w9,w29,w9
00aa64cc	movk w10,#0xe9b6, LSL #16
00aa64d0	add w9,w9,w10
00aa64d4	ror w9,w9,#0xc
00aa64d8	add w9,w9,w8
00aa64dc	eor w29,w9,w8
00aa64e0	add w27,w22,w28
00aa64e4	and w28,w29,w28
00aa64e8	eor w28,w28,w8
00aa64ec	mov w10,#0x105d
00aa64f0	add w28,w30,w28
00aa64f4	movk w10,#0xd62f, LSL #16
00aa64f8	add w28,w28,w10
00aa64fc	ror w28,w28,#0x1b
00aa6500	add w28,w28,w9
00aa6504	eor w30,w28,w9
00aa6508	add w29,w24,w8
00aa650c	and w8,w30,w8
00aa6510	eor w8,w8,w9
00aa6514	mov w10,#0x1453
00aa6518	add w8,w27,w8
00aa651c	movk w10,#0x244, LSL #16
00aa6520	add w8,w8,w10
00aa6524	ror w8,w8,#0x17
00aa6528	add w8,w8,w28
00aa652c	eor w27,w8,w28
00aa6530	add w30,w17,w9
00aa6534	and w9,w27,w9
00aa6538	eor w9,w9,w28
00aa653c	mov w10,#0xe681
00aa6540	add w9,w29,w9
00aa6544	movk w10,#0xd8a1, LSL #16
00aa6548	add w9,w9,w10
00aa654c	ror w9,w9,#0x12
00aa6550	add w9,w9,w8
00aa6554	eor w29,w9,w8
00aa6558	add w27,w3,w28
00aa655c	and w28,w29,w28
00aa6560	eor w28,w28,w8
00aa6564	mov w10,#0xfbc8
00aa6568	add w28,w30,w28
00aa656c	movk w10,#0xe7d3, LSL #16
00aa6570	add w28,w28,w10
00aa6574	ror w28,w28,#0xc
00aa6578	add w28,w28,w9
00aa657c	eor w30,w28,w9
00aa6580	add w29,w26,w8
00aa6584	and w8,w30,w8
00aa6588	eor w8,w8,w9
00aa658c	mov w10,#0xcde6
00aa6590	add w8,w27,w8
00aa6594	movk w10,#0x21e1, LSL #16
00aa6598	add w8,w8,w10
00aa659c	ror w8,w8,#0x1b
00aa65a0	add w8,w8,w28
00aa65a4	eor w27,w8,w28
00aa65a8	add w30,w5,w9
00aa65ac	and w9,w27,w9
00aa65b0	eor w9,w9,w28
00aa65b4	mov w10,#0x7d6
00aa65b8	add w9,w29,w9
00aa65bc	movk w10,#0xc337, LSL #16
00aa65c0	add w9,w9,w10
00aa65c4	ror w9,w9,#0x17
00aa65c8	add w9,w9,w8
00aa65cc	eor w29,w9,w8
00aa65d0	add w27,w19,w28
00aa65d4	and w28,w29,w28
00aa65d8	eor w28,w28,w8
00aa65dc	mov w10,#0xd87
00aa65e0	add w28,w30,w28
00aa65e4	movk w10,#0xf4d5, LSL #16
00aa65e8	add w28,w28,w10
00aa65ec	ror w28,w28,#0x12
00aa65f0	add w28,w28,w9
00aa65f4	eor w30,w28,w9
00aa65f8	add w29,w21,w8
00aa65fc	and w8,w30,w8
00aa6600	eor w8,w8,w9
00aa6604	mov w10,#0x14ed
00aa6608	add w8,w27,w8
00aa660c	movk w10,#0x455a, LSL #16
00aa6610	add w8,w8,w10
00aa6614	ror w8,w8,#0xc
00aa6618	add w8,w8,w28
00aa661c	eor w27,w8,w28
00aa6620	add w30,w16,w9
00aa6624	and w9,w27,w9
00aa6628	eor w9,w9,w28
00aa662c	mov w10,#0xe905
00aa6630	add w9,w29,w9
00aa6634	movk w10,#0xa9e3, LSL #16
00aa6638	add w9,w9,w10
00aa663c	ror w9,w9,#0x1b
00aa6640	add w9,w9,w8
00aa6644	eor w29,w9,w8
00aa6648	add w27,w23,w28
00aa664c	and w28,w29,w28
00aa6650	eor w28,w28,w8
00aa6654	mov w10,#0xa3f8
00aa6658	add w28,w30,w28
00aa665c	movk w10,#0xfcef, LSL #16
00aa6660	add w28,w28,w10
00aa6664	ror w28,w28,#0x17
00aa6668	add w28,w28,w9
00aa666c	eor w30,w28,w9
00aa6670	add w29,w25,w8
00aa6674	and w8,w30,w8
00aa6678	eor w8,w8,w9
00aa667c	mov w10,#0x2d9
00aa6680	add w8,w27,w8
00aa6684	movk w10,#0x676f, LSL #16
00aa6688	add w8,w8,w10
00aa668c	ror w8,w8,#0x12
00aa6690	add w8,w8,w28
00aa6694	eor w27,w8,w28
00aa6698	and w30,w27,w9
00aa669c	eor w30,w30,w28
00aa66a0	mov w10,#0x4c8a
00aa66a4	add w29,w29,w30
00aa66a8	movk w10,#0x8d2a, LSL #16
00aa66ac	add w29,w29,w10
00aa66b0	ror w29,w29,#0xc
00aa66b4	add w29,w29,w8
00aa66b8	add w9,w20,w9
00aa66bc	eor w27,w27,w29
00aa66c0	mov w10,#0x3942
00aa66c4	add w9,w9,w27
00aa66c8	movk w10,#0xfffa, LSL #16
00aa66cc	add w9,w9,w10
00aa66d0	ror w9,w9,#0x1c
00aa66d4	add w27,w7,w8
00aa66d8	eor w8,w29,w8
00aa66dc	add w9,w9,w29
00aa66e0	add w28,w19,w28
00aa66e4	eor w8,w8,w9
00aa66e8	mov w10,#0xf681
00aa66ec	add w8,w28,w8
00aa66f0	movk w10,#0x8771, LSL #16
00aa66f4	add w8,w8,w10
00aa66f8	ror w8,w8,#0x15
00aa66fc	add w28,w26,w29
00aa6700	eor w29,w9,w29
00aa6704	add w8,w8,w9
00aa6708	eor w29,w29,w8
00aa670c	mov w10,#0x6122
00aa6710	add w27,w27,w29
00aa6714	movk w10,#0x6d9d, LSL #16
00aa6718	add w27,w27,w10
00aa671c	ror w27,w27,#0x10
00aa6720	add w29,w18,w9
00aa6724	eor w9,w8,w9
00aa6728	add w27,w27,w8
00aa672c	eor w9,w9,w27
00aa6730	mov w10,#0x380c
00aa6734	add w9,w28,w9
00aa6738	movk w10,#0xfde5, LSL #16
00aa673c	add w9,w9,w10
00aa6740	ror w9,w9,#0x9
00aa6744	add w28,w17,w8
00aa6748	eor w8,w27,w8
00aa674c	add w9,w9,w27
00aa6750	eor w8,w8,w9
00aa6754	mov w10,#0xea44
00aa6758	add w8,w29,w8
00aa675c	movk w10,#0xa4be, LSL #16
00aa6760	add w8,w8,w10
00aa6764	ror w8,w8,#0x1c
00aa6768	add w29,w23,w27
00aa676c	eor w27,w9,w27
00aa6770	add w8,w8,w9
00aa6774	eor w27,w27,w8
00aa6778	mov w10,#0xcfa9
00aa677c	add w27,w28,w27
00aa6780	movk w10,#0x4bde, LSL #16
00aa6784	add w27,w27,w10
00aa6788	ror w27,w27,#0x15
00aa678c	add w28,w22,w9
00aa6790	eor w9,w8,w9
00aa6794	add w27,w27,w8
00aa6798	eor w9,w9,w27
00aa679c	mov w10,#0x4b60
00aa67a0	add w9,w29,w9
00aa67a4	movk w10,#0xf6bb, LSL #16
00aa67a8	add w9,w9,w10
00aa67ac	ror w9,w9,#0x10
00aa67b0	add w29,w21,w8
00aa67b4	eor w8,w27,w8
00aa67b8	add w9,w9,w27
00aa67bc	eor w8,w8,w9
00aa67c0	mov w10,#0xbc70
00aa67c4	add w8,w28,w8
00aa67c8	movk w10,#0xbebf, LSL #16
00aa67cc	add w8,w8,w10
00aa67d0	ror w8,w8,#0x9
00aa67d4	add w28,w6,w27
00aa67d8	eor w27,w9,w27
00aa67dc	add w8,w8,w9
00aa67e0	eor w27,w27,w8
00aa67e4	mov w10,#0x7ec6
00aa67e8	add w27,w29,w27
00aa67ec	movk w10,#0x289b, LSL #16
00aa67f0	add w27,w27,w10
00aa67f4	ror w27,w27,#0x1c
00aa67f8	add w29,w5,w9
00aa67fc	eor w9,w8,w9
00aa6800	add w27,w27,w8
00aa6804	eor w9,w9,w27
00aa6808	mov w10,#0x27fa
00aa680c	add w9,w28,w9
00aa6810	movk w10,#0xeaa1, LSL #16
00aa6814	add w9,w9,w10
00aa6818	ror w9,w9,#0x15
00aa681c	add w28,w4,w8
00aa6820	eor w8,w27,w8
00aa6824	add w9,w9,w27
00aa6828	eor w8,w8,w9
00aa682c	mov w10,#0x3085
00aa6830	add w8,w29,w8
00aa6834	movk w10,#0xd4ef, LSL #16
00aa6838	add w8,w8,w10
00aa683c	ror w8,w8,#0x10
00aa6840	add w29,w3,w27
00aa6844	eor w27,w9,w27
00aa6848	add w8,w8,w9
00aa684c	eor w27,w27,w8
00aa6850	mov w10,#0x1d05
00aa6854	add w27,w28,w27
00aa6858	movk w10,#0x488, LSL #16
00aa685c	add w27,w27,w10
00aa6860	ror w27,w27,#0x9
00aa6864	add w28,w25,w9
00aa6868	eor w9,w8,w9
00aa686c	add w27,w27,w8
00aa6870	eor w9,w9,w27
00aa6874	mov w10,#0xd039
00aa6878	add w9,w29,w9
00aa687c	movk w10,#0xd9d4, LSL #16
00aa6880	add w9,w9,w10
00aa6884	ror w9,w9,#0x1c
00aa6888	add w29,w24,w8
00aa688c	eor w8,w27,w8
00aa6890	add w9,w9,w27
00aa6894	eor w8,w8,w9
00aa6898	mov w10,#0x99e5
00aa689c	add w8,w28,w8
00aa68a0	movk w10,#0xe6db, LSL #16
00aa68a4	add w8,w8,w10
00aa68a8	ror w8,w8,#0x15
00aa68ac	eor w28,w9,w27
00aa68b0	add w8,w8,w9
00aa68b4	eor w28,w28,w8
00aa68b8	mov w10,#0x7cf8
00aa68bc	add w28,w29,w28
00aa68c0	movk w10,#0x1fa2, LSL #16
00aa68c4	add w28,w28,w10
00aa68c8	ror w28,w28,#0x10
00aa68cc	add w6,w6,w9
00aa68d0	eor w9,w8,w9
00aa68d4	add w28,w28,w8
00aa68d8	add w27,w16,w27
00aa68dc	eor w9,w9,w28
00aa68e0	mov w10,#0x5665
00aa68e4	add w9,w27,w9
00aa68e8	movk w10,#0xc4ac, LSL #16
00aa68ec	add w9,w9,w10
00aa68f0	ror w9,w9,#0x9
00aa68f4	add w9,w9,w28
00aa68f8	add w23,w23,w8
00aa68fc	orn w8,w9,w8
00aa6900	eor w8,w8,w28
00aa6904	mov w10,#0x2244
00aa6908	add w8,w6,w8
00aa690c	movk w10,#0xf429, LSL #16
00aa6910	add w8,w8,w10
00aa6914	ror w8,w8,#0x1a
00aa6918	add w8,w8,w9
00aa691c	add w6,w26,w28
00aa6920	orn w26,w8,w28
00aa6924	eor w26,w26,w9
00aa6928	mov w10,#0xff97
00aa692c	add w23,w23,w26
00aa6930	movk w10,#0x432a, LSL #16
00aa6934	add w23,w23,w10
00aa6938	ror w23,w23,#0x16
00aa693c	add w23,w23,w8
00aa6940	add w20,w20,w9
00aa6944	orn w9,w23,w9
00aa6948	eor w9,w9,w8
00aa694c	mov w10,#0x23a7
00aa6950	add w9,w6,w9
00aa6954	movk w10,#0xab94, LSL #16
00aa6958	add w9,w9,w10
00aa695c	ror w9,w9,#0x11
00aa6960	add w9,w9,w23
00aa6964	add w6,w25,w8
00aa6968	orn w8,w9,w8
00aa696c	eor w8,w8,w23
00aa6970	mov w10,#0xa039
00aa6974	add w8,w20,w8
00aa6978	movk w10,#0xfc93, LSL #16
00aa697c	add w8,w8,w10
00aa6980	ror w8,w8,#0xb
00aa6984	add w8,w8,w9
00aa6988	orn w20,w8,w23
00aa698c	eor w20,w20,w9
00aa6990	mov w10,#0x59c3
00aa6994	add w6,w6,w20
00aa6998	movk w10,#0x655b, LSL #16
00aa699c	add w6,w6,w10
00aa69a0	ror w6,w6,#0x1a
00aa69a4	add w6,w6,w8
00aa69a8	add w20,w22,w9
00aa69ac	orn w9,w6,w9
00aa69b0	add w5,w5,w23
00aa69b4	eor w9,w9,w8
00aa69b8	mov w10,#0xcc92
00aa69bc	add w9,w5,w9
00aa69c0	movk w10,#0x8f0c, LSL #16
00aa69c4	add w9,w9,w10
00aa69c8	ror w9,w9,#0x16
00aa69cc	add w9,w9,w6
00aa69d0	add w18,w18,w8
00aa69d4	orn w8,w9,w8
00aa69d8	eor w8,w8,w6
00aa69dc	mov w10,#0xf47d
00aa69e0	add w8,w20,w8
00aa69e4	movk w10,#0xffef, LSL #16
00aa69e8	add w8,w8,w10
00aa69ec	ror w8,w8,#0x11
00aa69f0	add w8,w8,w9
00aa69f4	add w5,w19,w6
00aa69f8	orn w6,w8,w6
00aa69fc	eor w6,w6,w9
00aa6a00	mov w10,#0x5dd1
00aa6a04	add w18,w18,w6
00aa6a08	movk w10,#0x8584, LSL #16
00aa6a0c	add w18,w18,w10
00aa6a10	ror w18,w18,#0xb
00aa6a14	add w18,w18,w8
00aa6a18	add w6,w24,w9
00aa6a1c	orn w9,w18,w9
00aa6a20	eor w9,w9,w8
00aa6a24	mov w10,#0x7e4f
00aa6a28	add w9,w5,w9
00aa6a2c	movk w10,#0x6fa8, LSL #16
00aa6a30	add w9,w9,w10
00aa6a34	ror w9,w9,#0x1a
00aa6a38	add w9,w9,w18
00aa6a3c	add w4,w4,w8
00aa6a40	orn w8,w9,w8
00aa6a44	eor w8,w8,w18
00aa6a48	mov w10,#0xe6e0
00aa6a4c	add w8,w6,w8
00aa6a50	movk w10,#0xfe2c, LSL #16
00aa6a54	add w8,w8,w10
00aa6a58	ror w8,w8,#0x16
00aa6a5c	add w8,w8,w9
00aa6a60	add w5,w21,w18
00aa6a64	orn w18,w8,w18
00aa6a68	eor w18,w18,w9
00aa6a6c	mov w10,#0x4314
00aa6a70	add w18,w4,w18
00aa6a74	movk w10,#0xa301, LSL #16
00aa6a78	add w18,w18,w10
00aa6a7c	ror w18,w18,#0x11
00aa6a80	add w18,w18,w8
00aa6a84	add w17,w17,w9
00aa6a88	orn w9,w18,w9
00aa6a8c	eor w9,w9,w8
00aa6a90	add w9,w5,w9
00aa6a94	add w9,w9,w11
00aa6a98	ror w9,w9,#0xb
00aa6a9c	add w9,w9,w18
00aa6aa0	add w4,w7,w8
00aa6aa4	orn w8,w9,w8
00aa6aa8	eor w8,w8,w18
00aa6aac	add w8,w17,w8
00aa6ab0	add w8,w8,w12
00aa6ab4	ror w8,w8,#0x1a
00aa6ab8	add w8,w8,w9
00aa6abc	add w16,w16,w18
00aa6ac0	orn w18,w8,w18
00aa6ac4	eor w18,w18,w9
00aa6ac8	add w18,w4,w18
00aa6acc	add w18,w18,w13
00aa6ad0	ror w18,w18,#0x16
00aa6ad4	add w18,w18,w8
00aa6ad8	add w3,w3,w9
00aa6adc	orn w9,w18,w9
00aa6ae0	eor w9,w9,w8
00aa6ae4	ldp w17,w5,[x0]
00aa6ae8	add w9,w16,w9
00aa6aec	add w9,w9,w14
00aa6af0	ror w9,w9,#0x11
00aa6af4	add w9,w9,w18
00aa6af8	add w30,w8,w17
00aa6afc	orn w8,w9,w8
00aa6b00	ldp w16,w4,[x0, #0x8]
00aa6b04	eor w8,w8,w18
00aa6b08	add w8,w3,w8
00aa6b0c	add w8,w8,w15
00aa6b10	add w17,w9,w5
00aa6b14	ror w8,w8,#0xb
00aa6b18	add w27,w9,w16
00aa6b1c	add w29,w18,w4
00aa6b20	add w28,w17,w8
00aa6b24	subs x2,x2,#0x1
00aa6b28	add x1,x1,#0x40
00aa6b2c	stp w30,w28,[x0]
00aa6b30	stp w27,w29,[x0, #0x8]
00aa6b34	b.ne 0x00aa619c
00aa6b38	ldp x29,x30,[sp, #0x50]
00aa6b3c	ldp x20,x19,[sp, #0x40]
00aa6b40	ldp x22,x21,[sp, #0x30]
00aa6b44	ldp x24,x23,[sp, #0x20]
00aa6b48	ldp x26,x25,[sp, #0x10]
00aa6b4c	ldp x28,x27,[sp], #0x60
00aa6b50	ret
