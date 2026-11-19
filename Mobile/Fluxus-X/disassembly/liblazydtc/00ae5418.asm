; ossl_sm4_encrypt @ 00ae5418
00ae5418	ldp w10,w11,[x0, #0x8]
00ae541c	ldp w12,w9,[x0]
00ae5420	ldp w13,w14,[x2]
00ae5424	adrp x8,0x775000
00ae5428	eor w15,w11,w10
00ae542c	rev w16,w15
00ae5430	eor w15,w15,w9
00ae5434	rev w15,w15
00ae5438	eor w13,w15,w13
00ae543c	add x8,x8,#0xfd0
00ae5440	lsr w15,w13,#0x18
00ae5444	eor w14,w16,w14
00ae5448	ubfx w16,w13,#0x10,#0x8
00ae544c	ldrb w15,[x8, w15, UXTW ]
00ae5450	ldrb w16,[x8, w16, UXTW ]
00ae5454	ubfx w17,w13,#0x8,#0x8
00ae5458	and w13,w13,#0xff
00ae545c	ldrb w17,[x8, w17, UXTW ]
00ae5460	ldrb w13,[x8, w13, UXTW ]
00ae5464	lsl w18,w15,#0x18
00ae5468	bfm w18,w16,#0x10,#0x7
00ae546c	mov w16,w18
00ae5470	bfm w16,w17,#0x18,#0x7
00ae5474	rev w12,w12
00ae5478	orr w17,w16,w13
00ae547c	lsr w15,w15,#0x6
00ae5480	extr w13,w13,w16,#0x8
00ae5484	eor w12,w17,w12
00ae5488	bfm w15,w17,#0x1e,#0x1d
00ae548c	eor w12,w12,w13
00ae5490	extr w18,w17,w18,#0x16
00ae5494	eor w12,w12,w15
00ae5498	extr w16,w17,w16,#0xe
00ae549c	eor w12,w12,w18
00ae54a0	eor w12,w12,w16
00ae54a4	eor w13,w14,w12
00ae54a8	lsr w14,w13,#0x18
00ae54ac	ubfx w15,w13,#0x10,#0x8
00ae54b0	ldrb w14,[x8, w14, UXTW ]
00ae54b4	ldrb w15,[x8, w15, UXTW ]
00ae54b8	ubfx w16,w13,#0x8,#0x8
00ae54bc	and w13,w13,#0xff
00ae54c0	ldrb w16,[x8, w16, UXTW ]
00ae54c4	ldrb w13,[x8, w13, UXTW ]
00ae54c8	lsl w18,w14,#0x18
00ae54cc	bfm w18,w15,#0x10,#0x7
00ae54d0	mov w15,w18
00ae54d4	bfm w15,w16,#0x18,#0x7
00ae54d8	rev w9,w9
00ae54dc	lsr w14,w14,#0x6
00ae54e0	orr w16,w15,w13
00ae54e4	extr w13,w13,w15,#0x8
00ae54e8	bfm w14,w16,#0x1e,#0x1d
00ae54ec	extr w18,w16,w18,#0x16
00ae54f0	extr w15,w16,w15,#0xe
00ae54f4	eor w16,w16,w9
00ae54f8	ldp w17,w0,[x2, #0x8]
00ae54fc	eor w13,w16,w13
00ae5500	eor w13,w13,w14
00ae5504	eor w13,w13,w18
00ae5508	rev w11,w11
00ae550c	eor w13,w13,w15
00ae5510	eor w17,w17,w11
00ae5514	eor w14,w13,w12
00ae5518	eor w15,w17,w14
00ae551c	lsr w16,w15,#0x18
00ae5520	ubfx w17,w15,#0x10,#0x8
00ae5524	ldrb w16,[x8, w16, UXTW ]
00ae5528	ldrb w17,[x8, w17, UXTW ]
00ae552c	ubfx w18,w15,#0x8,#0x8
00ae5530	and w15,w15,#0xff
00ae5534	ldrb w18,[x8, w18, UXTW ]
00ae5538	eor w14,w14,w0
00ae553c	ldrb w15,[x8, w15, UXTW ]
00ae5540	lsl w0,w16,#0x18
00ae5544	bfm w0,w17,#0x10,#0x7
00ae5548	mov w17,w0
00ae554c	bfm w17,w18,#0x18,#0x7
00ae5550	rev w10,w10
00ae5554	orr w18,w17,w15
00ae5558	lsr w16,w16,#0x6
00ae555c	extr w15,w15,w17,#0x8
00ae5560	eor w10,w18,w10
00ae5564	bfm w16,w18,#0x1e,#0x1d
00ae5568	eor w10,w10,w15
00ae556c	extr w0,w18,w0,#0x16
00ae5570	eor w10,w10,w16
00ae5574	extr w17,w18,w17,#0xe
00ae5578	eor w10,w10,w0
00ae557c	eor w10,w10,w17
00ae5580	eor w14,w14,w10
00ae5584	lsr w15,w14,#0x18
00ae5588	ubfx w16,w14,#0x10,#0x8
00ae558c	ldrb w15,[x8, w15, UXTW ]
00ae5590	ldrb w16,[x8, w16, UXTW ]
00ae5594	ubfx w17,w14,#0x8,#0x8
00ae5598	and w14,w14,#0xff
00ae559c	ldrb w17,[x8, w17, UXTW ]
00ae55a0	ldrb w14,[x8, w14, UXTW ]
00ae55a4	lsl w18,w15,#0x18
00ae55a8	bfm w18,w16,#0x10,#0x7
00ae55ac	mov w16,w18
00ae55b0	bfm w16,w17,#0x18,#0x7
00ae55b4	orr w17,w16,w14
00ae55b8	lsr w15,w15,#0x6
00ae55bc	extr w14,w14,w16,#0x8
00ae55c0	eor w11,w17,w11
00ae55c4	bfm w15,w17,#0x1e,#0x1d
00ae55c8	eor w11,w11,w14
00ae55cc	extr w18,w17,w18,#0x16
00ae55d0	eor w11,w11,w15
00ae55d4	extr w16,w17,w16,#0xe
00ae55d8	ldp w17,w0,[x2, #0x10]
00ae55dc	eor w11,w11,w18
00ae55e0	eor w11,w11,w16
00ae55e4	eor w14,w11,w10
00ae55e8	eor w15,w14,w13
00ae55ec	adrp x9,0x776000
00ae55f0	eor w15,w15,w17
00ae55f4	add x9,x9,#0xd0
00ae55f8	lsr w16,w15,#0x18
00ae55fc	ldr w16,[x9, w16, UXTW #0x2]
00ae5600	eor w14,w14,w0
00ae5604	ubfx w0,w15,#0x10,#0x8
00ae5608	ldr w0,[x9, w0, UXTW #0x2]
00ae560c	eor w12,w16,w12
00ae5610	ubfx w16,w15,#0x8,#0x8
00ae5614	and w15,w15,#0xff
00ae5618	ldr w16,[x9, w16, UXTW #0x2]
00ae561c	ldr w15,[x9, w15, UXTW #0x2]
00ae5620	eor w12,w12,w0, ROR #0x8
00ae5624	ldp w17,w18,[x2, #0x18]
00ae5628	eor w12,w12,w16, ROR #0x10
00ae562c	eor w12,w12,w15, ROR #0x18
00ae5630	eor w14,w14,w12
00ae5634	lsr w15,w14,#0x18
00ae5638	ubfx w16,w14,#0x10,#0x8
00ae563c	ldr w15,[x9, w15, UXTW #0x2]
00ae5640	ubfx w0,w14,#0x8,#0x8
00ae5644	ldr w16,[x9, w16, UXTW #0x2]
00ae5648	and w14,w14,#0xff
00ae564c	ldr w0,[x9, w0, UXTW #0x2]
00ae5650	ldr w14,[x9, w14, UXTW #0x2]
00ae5654	eor w13,w15,w13
00ae5658	eor w13,w13,w16, ROR #0x8
00ae565c	eor w13,w13,w0, ROR #0x10
00ae5660	eor w13,w13,w14, ROR #0x18
00ae5664	eor w17,w17,w11
00ae5668	eor w14,w13,w12
00ae566c	eor w15,w17,w14
00ae5670	lsr w16,w15,#0x18
00ae5674	ubfx w17,w15,#0x10,#0x8
00ae5678	ldr w16,[x9, w16, UXTW #0x2]
00ae567c	eor w14,w18,w14
00ae5680	ubfx w18,w15,#0x8,#0x8
00ae5684	ldr w17,[x9, w17, UXTW #0x2]
00ae5688	and w15,w15,#0xff
00ae568c	ldr w18,[x9, w18, UXTW #0x2]
00ae5690	ldr w15,[x9, w15, UXTW #0x2]
00ae5694	eor w10,w16,w10
00ae5698	eor w10,w10,w17, ROR #0x8
00ae569c	eor w10,w10,w18, ROR #0x10
00ae56a0	eor w10,w10,w15, ROR #0x18
00ae56a4	eor w14,w14,w10
00ae56a8	lsr w15,w14,#0x18
00ae56ac	ubfx w17,w14,#0x10,#0x8
00ae56b0	ldr w15,[x9, w15, UXTW #0x2]
00ae56b4	ubfx w18,w14,#0x8,#0x8
00ae56b8	ldr w17,[x9, w17, UXTW #0x2]
00ae56bc	and w14,w14,#0xff
00ae56c0	ldr w18,[x9, w18, UXTW #0x2]
00ae56c4	ldr w14,[x9, w14, UXTW #0x2]
00ae56c8	eor w11,w15,w11
00ae56cc	eor w11,w11,w17, ROR #0x8
00ae56d0	ldp w16,w0,[x2, #0x20]
00ae56d4	eor w11,w11,w18, ROR #0x10
00ae56d8	eor w11,w11,w14, ROR #0x18
00ae56dc	eor w14,w11,w10
00ae56e0	eor w15,w14,w13
00ae56e4	eor w15,w15,w16
00ae56e8	lsr w16,w15,#0x18
00ae56ec	ldr w16,[x9, w16, UXTW #0x2]
00ae56f0	eor w14,w14,w0
00ae56f4	ubfx w0,w15,#0x10,#0x8
00ae56f8	ldr w0,[x9, w0, UXTW #0x2]
00ae56fc	eor w12,w16,w12
00ae5700	ubfx w16,w15,#0x8,#0x8
00ae5704	and w15,w15,#0xff
00ae5708	ldr w16,[x9, w16, UXTW #0x2]
00ae570c	ldr w15,[x9, w15, UXTW #0x2]
00ae5710	eor w12,w12,w0, ROR #0x8
00ae5714	ldp w17,w18,[x2, #0x28]
00ae5718	eor w12,w12,w16, ROR #0x10
00ae571c	eor w12,w12,w15, ROR #0x18
00ae5720	eor w14,w14,w12
00ae5724	lsr w15,w14,#0x18
00ae5728	ubfx w16,w14,#0x10,#0x8
00ae572c	ldr w15,[x9, w15, UXTW #0x2]
00ae5730	ubfx w0,w14,#0x8,#0x8
00ae5734	ldr w16,[x9, w16, UXTW #0x2]
00ae5738	and w14,w14,#0xff
00ae573c	ldr w0,[x9, w0, UXTW #0x2]
00ae5740	ldr w14,[x9, w14, UXTW #0x2]
00ae5744	eor w13,w15,w13
00ae5748	eor w13,w13,w16, ROR #0x8
00ae574c	eor w13,w13,w0, ROR #0x10
00ae5750	eor w13,w13,w14, ROR #0x18
00ae5754	eor w17,w17,w11
00ae5758	eor w14,w13,w12
00ae575c	eor w15,w17,w14
00ae5760	lsr w16,w15,#0x18
00ae5764	ubfx w17,w15,#0x10,#0x8
00ae5768	ldr w16,[x9, w16, UXTW #0x2]
00ae576c	eor w14,w18,w14
00ae5770	ubfx w18,w15,#0x8,#0x8
00ae5774	ldr w17,[x9, w17, UXTW #0x2]
00ae5778	and w15,w15,#0xff
00ae577c	ldr w18,[x9, w18, UXTW #0x2]
00ae5780	ldr w15,[x9, w15, UXTW #0x2]
00ae5784	eor w10,w16,w10
00ae5788	eor w10,w10,w17, ROR #0x8
00ae578c	eor w10,w10,w18, ROR #0x10
00ae5790	eor w10,w10,w15, ROR #0x18
00ae5794	eor w14,w14,w10
00ae5798	lsr w15,w14,#0x18
00ae579c	ubfx w17,w14,#0x10,#0x8
00ae57a0	ldr w15,[x9, w15, UXTW #0x2]
00ae57a4	ubfx w18,w14,#0x8,#0x8
00ae57a8	ldr w17,[x9, w17, UXTW #0x2]
00ae57ac	and w14,w14,#0xff
00ae57b0	ldr w18,[x9, w18, UXTW #0x2]
00ae57b4	ldr w14,[x9, w14, UXTW #0x2]
00ae57b8	eor w11,w15,w11
00ae57bc	eor w11,w11,w17, ROR #0x8
00ae57c0	ldp w16,w0,[x2, #0x30]
00ae57c4	eor w11,w11,w18, ROR #0x10
00ae57c8	eor w11,w11,w14, ROR #0x18
00ae57cc	eor w14,w11,w10
00ae57d0	eor w15,w14,w13
00ae57d4	eor w15,w15,w16
00ae57d8	lsr w16,w15,#0x18
00ae57dc	ldr w16,[x9, w16, UXTW #0x2]
00ae57e0	eor w14,w14,w0
00ae57e4	ubfx w0,w15,#0x10,#0x8
00ae57e8	ldr w0,[x9, w0, UXTW #0x2]
00ae57ec	eor w12,w16,w12
00ae57f0	ubfx w16,w15,#0x8,#0x8
00ae57f4	and w15,w15,#0xff
00ae57f8	ldr w16,[x9, w16, UXTW #0x2]
00ae57fc	ldr w15,[x9, w15, UXTW #0x2]
00ae5800	eor w12,w12,w0, ROR #0x8
00ae5804	ldp w17,w18,[x2, #0x38]
00ae5808	eor w12,w12,w16, ROR #0x10
00ae580c	eor w12,w12,w15, ROR #0x18
00ae5810	eor w14,w14,w12
00ae5814	lsr w15,w14,#0x18
00ae5818	ubfx w16,w14,#0x10,#0x8
00ae581c	ldr w15,[x9, w15, UXTW #0x2]
00ae5820	ubfx w0,w14,#0x8,#0x8
00ae5824	ldr w16,[x9, w16, UXTW #0x2]
00ae5828	and w14,w14,#0xff
00ae582c	ldr w0,[x9, w0, UXTW #0x2]
00ae5830	ldr w14,[x9, w14, UXTW #0x2]
00ae5834	eor w13,w15,w13
00ae5838	eor w13,w13,w16, ROR #0x8
00ae583c	eor w13,w13,w0, ROR #0x10
00ae5840	eor w13,w13,w14, ROR #0x18
00ae5844	eor w17,w17,w11
00ae5848	eor w14,w13,w12
00ae584c	eor w15,w17,w14
00ae5850	lsr w16,w15,#0x18
00ae5854	ubfx w17,w15,#0x10,#0x8
00ae5858	ldr w16,[x9, w16, UXTW #0x2]
00ae585c	eor w14,w18,w14
00ae5860	ubfx w18,w15,#0x8,#0x8
00ae5864	ldr w17,[x9, w17, UXTW #0x2]
00ae5868	and w15,w15,#0xff
00ae586c	ldr w18,[x9, w18, UXTW #0x2]
00ae5870	ldr w15,[x9, w15, UXTW #0x2]
00ae5874	eor w10,w16,w10
00ae5878	eor w10,w10,w17, ROR #0x8
00ae587c	eor w10,w10,w18, ROR #0x10
00ae5880	eor w10,w10,w15, ROR #0x18
00ae5884	eor w14,w14,w10
00ae5888	lsr w15,w14,#0x18
00ae588c	ubfx w17,w14,#0x10,#0x8
00ae5890	ldr w15,[x9, w15, UXTW #0x2]
00ae5894	ubfx w18,w14,#0x8,#0x8
00ae5898	ldr w17,[x9, w17, UXTW #0x2]
00ae589c	and w14,w14,#0xff
00ae58a0	ldr w18,[x9, w18, UXTW #0x2]
00ae58a4	ldr w14,[x9, w14, UXTW #0x2]
00ae58a8	eor w11,w15,w11
00ae58ac	eor w11,w11,w17, ROR #0x8
00ae58b0	ldp w16,w0,[x2, #0x40]
00ae58b4	eor w11,w11,w18, ROR #0x10
00ae58b8	eor w11,w11,w14, ROR #0x18
00ae58bc	eor w14,w11,w10
00ae58c0	eor w15,w14,w13
00ae58c4	eor w15,w15,w16
00ae58c8	lsr w16,w15,#0x18
00ae58cc	ldr w16,[x9, w16, UXTW #0x2]
00ae58d0	eor w14,w14,w0
00ae58d4	ubfx w0,w15,#0x10,#0x8
00ae58d8	ldr w0,[x9, w0, UXTW #0x2]
00ae58dc	eor w12,w16,w12
00ae58e0	ubfx w16,w15,#0x8,#0x8
00ae58e4	and w15,w15,#0xff
00ae58e8	ldr w16,[x9, w16, UXTW #0x2]
00ae58ec	ldr w15,[x9, w15, UXTW #0x2]
00ae58f0	eor w12,w12,w0, ROR #0x8
00ae58f4	ldp w17,w18,[x2, #0x48]
00ae58f8	eor w12,w12,w16, ROR #0x10
00ae58fc	eor w12,w12,w15, ROR #0x18
00ae5900	eor w14,w14,w12
00ae5904	lsr w15,w14,#0x18
00ae5908	ubfx w16,w14,#0x10,#0x8
00ae590c	ldr w15,[x9, w15, UXTW #0x2]
00ae5910	ubfx w0,w14,#0x8,#0x8
00ae5914	ldr w16,[x9, w16, UXTW #0x2]
00ae5918	and w14,w14,#0xff
00ae591c	ldr w0,[x9, w0, UXTW #0x2]
00ae5920	ldr w14,[x9, w14, UXTW #0x2]
00ae5924	eor w13,w15,w13
00ae5928	eor w13,w13,w16, ROR #0x8
00ae592c	eor w13,w13,w0, ROR #0x10
00ae5930	eor w13,w13,w14, ROR #0x18
00ae5934	eor w17,w17,w11
00ae5938	eor w14,w13,w12
00ae593c	eor w15,w17,w14
00ae5940	lsr w16,w15,#0x18
00ae5944	ubfx w17,w15,#0x10,#0x8
00ae5948	ldr w16,[x9, w16, UXTW #0x2]
00ae594c	eor w14,w18,w14
00ae5950	ubfx w18,w15,#0x8,#0x8
00ae5954	ldr w17,[x9, w17, UXTW #0x2]
00ae5958	and w15,w15,#0xff
00ae595c	ldr w18,[x9, w18, UXTW #0x2]
00ae5960	ldr w15,[x9, w15, UXTW #0x2]
00ae5964	eor w10,w16,w10
00ae5968	eor w10,w10,w17, ROR #0x8
00ae596c	eor w10,w10,w18, ROR #0x10
00ae5970	eor w10,w10,w15, ROR #0x18
00ae5974	eor w14,w14,w10
00ae5978	lsr w15,w14,#0x18
00ae597c	ubfx w17,w14,#0x10,#0x8
00ae5980	ldr w15,[x9, w15, UXTW #0x2]
00ae5984	ubfx w18,w14,#0x8,#0x8
00ae5988	ldr w17,[x9, w17, UXTW #0x2]
00ae598c	and w14,w14,#0xff
00ae5990	ldr w18,[x9, w18, UXTW #0x2]
00ae5994	ldr w14,[x9, w14, UXTW #0x2]
00ae5998	eor w11,w15,w11
00ae599c	eor w11,w11,w17, ROR #0x8
00ae59a0	ldp w16,w0,[x2, #0x50]
00ae59a4	eor w11,w11,w18, ROR #0x10
00ae59a8	eor w11,w11,w14, ROR #0x18
00ae59ac	eor w14,w11,w10
00ae59b0	eor w15,w14,w13
00ae59b4	eor w15,w15,w16
00ae59b8	lsr w16,w15,#0x18
00ae59bc	ldr w16,[x9, w16, UXTW #0x2]
00ae59c0	eor w14,w14,w0
00ae59c4	ubfx w0,w15,#0x10,#0x8
00ae59c8	ldr w0,[x9, w0, UXTW #0x2]
00ae59cc	eor w12,w16,w12
00ae59d0	ubfx w16,w15,#0x8,#0x8
00ae59d4	and w15,w15,#0xff
00ae59d8	ldr w16,[x9, w16, UXTW #0x2]
00ae59dc	ldr w15,[x9, w15, UXTW #0x2]
00ae59e0	eor w12,w12,w0, ROR #0x8
00ae59e4	ldp w17,w18,[x2, #0x58]
00ae59e8	eor w12,w12,w16, ROR #0x10
00ae59ec	eor w15,w12,w15, ROR #0x18
00ae59f0	eor w12,w14,w15
00ae59f4	lsr w14,w12,#0x18
00ae59f8	ubfx w16,w12,#0x10,#0x8
00ae59fc	ldr w14,[x9, w14, UXTW #0x2]
00ae5a00	ubfx w0,w12,#0x8,#0x8
00ae5a04	ldr w16,[x9, w16, UXTW #0x2]
00ae5a08	and w12,w12,#0xff
00ae5a0c	ldr w0,[x9, w0, UXTW #0x2]
00ae5a10	ldr w12,[x9, w12, UXTW #0x2]
00ae5a14	eor w13,w14,w13
00ae5a18	eor w13,w13,w16, ROR #0x8
00ae5a1c	eor w13,w13,w0, ROR #0x10
00ae5a20	eor w14,w13,w12, ROR #0x18
00ae5a24	eor w17,w17,w11
00ae5a28	eor w12,w14,w15
00ae5a2c	eor w13,w17,w12
00ae5a30	lsr w16,w13,#0x18
00ae5a34	ubfx w17,w13,#0x10,#0x8
00ae5a38	ldr w16,[x9, w16, UXTW #0x2]
00ae5a3c	eor w12,w18,w12
00ae5a40	ubfx w18,w13,#0x8,#0x8
00ae5a44	ldr w17,[x9, w17, UXTW #0x2]
00ae5a48	and w13,w13,#0xff
00ae5a4c	ldr w18,[x9, w18, UXTW #0x2]
00ae5a50	ldr w13,[x9, w13, UXTW #0x2]
00ae5a54	eor w10,w16,w10
00ae5a58	eor w10,w10,w17, ROR #0x8
00ae5a5c	eor w10,w10,w18, ROR #0x10
00ae5a60	eor w17,w10,w13, ROR #0x18
00ae5a64	eor w10,w12,w17
00ae5a68	lsr w12,w10,#0x18
00ae5a6c	ubfx w13,w10,#0x10,#0x8
00ae5a70	ldr w12,[x9, w12, UXTW #0x2]
00ae5a74	ubfx w18,w10,#0x8,#0x8
00ae5a78	ldr w13,[x9, w13, UXTW #0x2]
00ae5a7c	and w10,w10,#0xff
00ae5a80	ldr w18,[x9, w18, UXTW #0x2]
00ae5a84	ldr w10,[x9, w10, UXTW #0x2]
00ae5a88	eor w11,w12,w11
00ae5a8c	eor w11,w11,w13, ROR #0x8
00ae5a90	ldp w16,w0,[x2, #0x60]
00ae5a94	eor w11,w11,w18, ROR #0x10
00ae5a98	eor w12,w11,w10, ROR #0x18
00ae5a9c	eor w10,w12,w17
00ae5aa0	eor w11,w10,w14
00ae5aa4	eor w11,w11,w16
00ae5aa8	lsr w13,w11,#0x18
00ae5aac	ldr w13,[x9, w13, UXTW #0x2]
00ae5ab0	eor w10,w10,w0
00ae5ab4	ubfx w0,w11,#0x10,#0x8
00ae5ab8	ldr w0,[x9, w0, UXTW #0x2]
00ae5abc	eor w13,w13,w15
00ae5ac0	ubfx w15,w11,#0x8,#0x8
00ae5ac4	and w11,w11,#0xff
00ae5ac8	ldr w15,[x9, w15, UXTW #0x2]
00ae5acc	ldr w11,[x9, w11, UXTW #0x2]
00ae5ad0	eor w13,w13,w0, ROR #0x8
00ae5ad4	ldp w16,w18,[x2, #0x68]
00ae5ad8	eor w13,w13,w15, ROR #0x10
00ae5adc	eor w13,w13,w11, ROR #0x18
00ae5ae0	eor w10,w10,w13
00ae5ae4	lsr w11,w10,#0x18
00ae5ae8	ubfx w15,w10,#0x10,#0x8
00ae5aec	ldr w11,[x9, w11, UXTW #0x2]
00ae5af0	ubfx w0,w10,#0x8,#0x8
00ae5af4	ldr w15,[x9, w15, UXTW #0x2]
00ae5af8	and w10,w10,#0xff
00ae5afc	ldr w0,[x9, w0, UXTW #0x2]
00ae5b00	ldr w10,[x9, w10, UXTW #0x2]
00ae5b04	eor w11,w11,w14
00ae5b08	eor w11,w11,w15, ROR #0x8
00ae5b0c	eor w11,w11,w0, ROR #0x10
00ae5b10	eor w10,w11,w10, ROR #0x18
00ae5b14	eor w16,w16,w12
00ae5b18	eor w11,w10,w13
00ae5b1c	eor w14,w16,w11
00ae5b20	eor w15,w18,w11
00ae5b24	lsr w11,w14,#0x18
00ae5b28	ubfx w16,w14,#0x10,#0x8
00ae5b2c	ldr w11,[x9, w11, UXTW #0x2]
00ae5b30	ubfx w18,w14,#0x8,#0x8
00ae5b34	ldr w16,[x9, w16, UXTW #0x2]
00ae5b38	and w14,w14,#0xff
00ae5b3c	ldr w18,[x9, w18, UXTW #0x2]
00ae5b40	ldr w0,[x9, w14, UXTW #0x2]
00ae5b44	eor w11,w11,w17
00ae5b48	eor w11,w11,w16, ROR #0x8
00ae5b4c	eor w11,w11,w18, ROR #0x10
00ae5b50	eor w11,w11,w0, ROR #0x18
00ae5b54	eor w15,w15,w11
00ae5b58	lsr w16,w15,#0x18
00ae5b5c	ubfx w18,w15,#0x10,#0x8
00ae5b60	ldr w16,[x9, w16, UXTW #0x2]
00ae5b64	ubfx w0,w15,#0x8,#0x8
00ae5b68	ldr w18,[x9, w18, UXTW #0x2]
00ae5b6c	and w15,w15,#0xff
00ae5b70	ldr w0,[x9, w0, UXTW #0x2]
00ae5b74	ldr w9,[x9, w15, UXTW #0x2]
00ae5b78	eor w12,w16,w12
00ae5b7c	eor w12,w12,w18, ROR #0x8
00ae5b80	ldp w14,w17,[x2, #0x70]
00ae5b84	eor w12,w12,w0, ROR #0x10
00ae5b88	eor w9,w12,w9, ROR #0x18
00ae5b8c	eor w12,w9,w11
00ae5b90	eor w18,w12,w10
00ae5b94	eor w17,w12,w17
00ae5b98	eor w12,w18,w14
00ae5b9c	lsr w14,w12,#0x18
00ae5ba0	ubfx w18,w12,#0x10,#0x8
00ae5ba4	ldrb w14,[x8, w14, UXTW ]
00ae5ba8	ldrb w18,[x8, w18, UXTW ]
00ae5bac	ubfx w0,w12,#0x8,#0x8
00ae5bb0	and w12,w12,#0xff
00ae5bb4	ldrb w0,[x8, w0, UXTW ]
00ae5bb8	ldp w3,w15,[x2, #0x78]
00ae5bbc	ldrb w12,[x8, w12, UXTW ]
00ae5bc0	lsl w2,w14,#0x18
00ae5bc4	bfm w2,w18,#0x10,#0x7
00ae5bc8	mov w18,w2
00ae5bcc	bfm w18,w0,#0x18,#0x7
00ae5bd0	orr w0,w18,w12
00ae5bd4	lsr w14,w14,#0x6
00ae5bd8	extr w12,w12,w18,#0x8
00ae5bdc	eor w13,w0,w13
00ae5be0	bfm w14,w0,#0x1e,#0x1d
00ae5be4	eor w12,w13,w12
00ae5be8	extr w2,w0,w2,#0x16
00ae5bec	eor w12,w12,w14
00ae5bf0	extr w18,w0,w18,#0xe
00ae5bf4	eor w12,w12,w2
00ae5bf8	eor w12,w12,w18
00ae5bfc	eor w13,w17,w12
00ae5c00	lsr w14,w12,#0x18
00ae5c04	lsr w17,w12,#0x10
00ae5c08	lsr w18,w12,#0x8
00ae5c0c	lsr w0,w13,#0x18
00ae5c10	strb w14,[x1, #0xc]
00ae5c14	strb w17,[x1, #0xd]
00ae5c18	strb w18,[x1, #0xe]
00ae5c1c	ubfx w2,w13,#0x10,#0x8
00ae5c20	ldrb w17,[x8, w0, UXTW ]
00ae5c24	ldrb w18,[x8, w2, UXTW ]
00ae5c28	ubfx w14,w13,#0x8,#0x8
00ae5c2c	and w13,w13,#0xff
00ae5c30	ldrb w14,[x8, w14, UXTW ]
00ae5c34	ldrb w13,[x8, w13, UXTW ]
00ae5c38	lsl w0,w17,#0x18
00ae5c3c	bfm w0,w18,#0x10,#0x7
00ae5c40	mov w18,w0
00ae5c44	bfm w18,w14,#0x18,#0x7
00ae5c48	orr w14,w18,w13
00ae5c4c	lsr w17,w17,#0x6
00ae5c50	extr w13,w13,w18,#0x8
00ae5c54	eor w10,w14,w10
00ae5c58	bfm w17,w14,#0x1e,#0x1d
00ae5c5c	eor w10,w10,w13
00ae5c60	extr w0,w14,w0,#0x16
00ae5c64	eor w10,w10,w17
00ae5c68	extr w18,w14,w18,#0xe
00ae5c6c	eor w10,w10,w0
00ae5c70	eor w10,w10,w18
00ae5c74	eor w16,w3,w9
00ae5c78	eor w13,w10,w12
00ae5c7c	lsr w14,w10,#0x18
00ae5c80	lsr w17,w10,#0x10
00ae5c84	lsr w18,w10,#0x8
00ae5c88	strb w10,[x1, #0xb]
00ae5c8c	eor w10,w16,w13
00ae5c90	strb w14,[x1, #0x8]
00ae5c94	strb w17,[x1, #0x9]
00ae5c98	strb w18,[x1, #0xa]
00ae5c9c	lsr w14,w10,#0x18
00ae5ca0	eor w13,w13,w15
00ae5ca4	ubfx w15,w10,#0x10,#0x8
00ae5ca8	ldrb w14,[x8, w14, UXTW ]
00ae5cac	ldrb w15,[x8, w15, UXTW ]
00ae5cb0	ubfx w16,w10,#0x8,#0x8
00ae5cb4	and w10,w10,#0xff
00ae5cb8	ldrb w16,[x8, w16, UXTW ]
00ae5cbc	ldrb w10,[x8, w10, UXTW ]
00ae5cc0	lsl w17,w14,#0x18
00ae5cc4	bfm w17,w15,#0x10,#0x7
00ae5cc8	mov w15,w17
00ae5ccc	bfm w15,w16,#0x18,#0x7
00ae5cd0	orr w16,w15,w10
00ae5cd4	lsr w14,w14,#0x6
00ae5cd8	extr w10,w10,w15,#0x8
00ae5cdc	eor w11,w16,w11
00ae5ce0	bfm w14,w16,#0x1e,#0x1d
00ae5ce4	eor w10,w11,w10
00ae5ce8	extr w17,w16,w17,#0x16
00ae5cec	eor w10,w10,w14
00ae5cf0	extr w15,w16,w15,#0xe
00ae5cf4	eor w10,w10,w17
00ae5cf8	eor w10,w10,w15
00ae5cfc	eor w11,w13,w10
00ae5d00	lsr w13,w10,#0x18
00ae5d04	lsr w14,w10,#0x10
00ae5d08	lsr w15,w10,#0x8
00ae5d0c	strb w10,[x1, #0x7]
00ae5d10	lsr w10,w11,#0x18
00ae5d14	strb w13,[x1, #0x4]
00ae5d18	strb w14,[x1, #0x5]
00ae5d1c	strb w15,[x1, #0x6]
00ae5d20	ubfx w16,w11,#0x10,#0x8
00ae5d24	ldrb w10,[x8, w10, UXTW ]
00ae5d28	ldrb w13,[x8, w16, UXTW ]
00ae5d2c	ubfx w17,w11,#0x8,#0x8
00ae5d30	and w11,w11,#0xff
00ae5d34	ldrb w14,[x8, w17, UXTW ]
00ae5d38	ldrb w8,[x8, w11, UXTW ]
00ae5d3c	lsl w11,w10,#0x18
00ae5d40	bfm w11,w13,#0x10,#0x7
00ae5d44	mov w13,w11
00ae5d48	bfm w13,w14,#0x18,#0x7
00ae5d4c	orr w14,w13,w8
00ae5d50	lsr w10,w10,#0x6
00ae5d54	extr w8,w8,w13,#0x8
00ae5d58	eor w9,w14,w9
00ae5d5c	bfm w10,w14,#0x1e,#0x1d
00ae5d60	eor w8,w9,w8
00ae5d64	extr w11,w14,w11,#0x16
00ae5d68	eor w8,w8,w10
00ae5d6c	extr w13,w14,w13,#0xe
00ae5d70	eor w8,w8,w11
00ae5d74	eor w8,w8,w13
00ae5d78	lsr w9,w8,#0x18
00ae5d7c	lsr w10,w8,#0x10
00ae5d80	lsr w11,w8,#0x8
00ae5d84	strb w8,[x1, #0x3]
00ae5d88	strb w9,[x1]
00ae5d8c	strb w10,[x1, #0x1]
00ae5d90	strb w11,[x1, #0x2]
00ae5d94	strb w12,[x1, #0xf]
00ae5d98	ret
