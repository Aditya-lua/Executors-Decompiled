; ix::UrlParser::parse @ 0098b524
0098b524	stp x28,x27,[sp, #-0x60]!
0098b528	stp x26,x25,[sp, #0x10]
0098b52c	stp x24,x23,[sp, #0x20]
0098b530	stp x22,x21,[sp, #0x30]
0098b534	stp x20,x19,[sp, #0x40]
0098b538	stp x29,x30,[sp, #0x50]
0098b53c	add x29,sp,#0x50
0098b540	sub sp,sp,#0x210
0098b544	stp x5,x6,[sp, #0x28]
0098b548	mrs x20,tpidr_el0
0098b54c	ldr x8,[x20, #0x28]
0098b550	add x10,sp,#0x138
0098b554	add x25,x10,#0x8
0098b558	mov x26,x2
0098b55c	mov x28,x1
0098b560	mov x21,x0
0098b564	mov w9,#0x1
0098b568	orr w2,wzr,#0xc0
0098b56c	mov x0,x25
0098b570	mov w1,wzr
0098b574	mov x24,x4
0098b578	mov x23,x3
0098b57c	add x19,sp,#0x58
0098b580	str x8,[sp, #0x50]
0098b584	str w9,[sp, #0x138]
0098b588	bl 0x00c301c0
0098b58c	ldrb w8,[x21]
0098b590	ldr x9,[x21, #0x10]
0098b594	mov w1,#0x3a
0098b598	tst w8,#0x1
0098b59c	csinc x27,x9,x21,ne
0098b5a0	mov x0,x27
0098b5a4	bl 0x00c30890
0098b5a8	cbz x0,0x0098b5e8
0098b5ac	str x28,[sp, #0x40]
0098b5b0	sub x28,x0,x27
0098b5b4	cmn x28,#0x10
0098b5b8	stp xzr,xzr,[sp, #0x120]
0098b5bc	str xzr,[sp, #0x130]
0098b5c0	b.cs 0x0098c4cc
0098b5c4	cmp x28,#0x17
0098b5c8	str x0,[sp, #0x8]
0098b5cc	b.cs 0x0098b5f8
0098b5d0	add x9,sp,#0x120
0098b5d4	lsl w8,w28,#0x1
0098b5d8	orr x21,x9,#0x1
0098b5dc	strb w8,[sp, #0x120]
0098b5e0	cbnz x28,0x0098b618
0098b5e4	b 0x0098b628
0098b5e8	mov w8,#0x2
0098b5ec	add x0,x19,#0x8
0098b5f0	str w8,[sp, #0x58]
0098b5f4	b 0x0098b790
0098b5f8	add x8,x28,#0x10
0098b5fc	and x22,x8,#-0x10
0098b600	mov x0,x22
0098b604	bl 0x00c2fed0
0098b608	orr x8,x22,#0x1
0098b60c	mov x21,x0
0098b610	stp x28,x0,[sp, #0x128]
0098b614	str x8,[sp, #0x120]
0098b618	mov x0,x21
0098b61c	mov x1,x27
0098b620	mov x2,x28
0098b624	bl 0x00c2ffd0
0098b628	ldrb w8,[sp, #0x140]
0098b62c	strb wzr,[x21, x28]
0098b630	str x24,[sp, #0x38]
0098b634	str x26,[sp, #0x48]
0098b638	stp x23,x20,[sp, #0x18]
0098b63c	tbnz w8,#0x0,0x0098b648
0098b640	strh wzr,[sp, #0x140]
0098b644	b 0x0098b668
0098b648	ldr x8,[sp, #0x150]
0098b64c	strb wzr,[x8]
0098b650	ldrb w8,[sp, #0x140]
0098b654	str xzr,[sp, #0x148]
0098b658	tbz w8,#0x0,0x0098b668
0098b65c	ldr x0,[sp, #0x150]
0098b660	bl 0x00c301d0
0098b664	str xzr,[sp, #0x140]
0098b668	ldr x8,[sp, #0x130]
0098b66c	ldur q0,[x19, #0xc8]
0098b670	str x25,[sp, #0x10]
0098b674	str x8,[x25, #0x10]
0098b678	str q0,[x25]
0098b67c	ldrb w24,[sp, #0x140]
0098b680	ldp x28,x20,[sp, #0x148]
0098b684	lsr w27,w24,#0x1
0098b688	tst w24,#0x1
0098b68c	csel x23,x27,x28,eq
0098b690	csinc x26,x20,x25,ne
0098b694	cbz x23,0x0098b6d4
0098b698	mov w19,#0x1
0098b69c	mov x25,#0x680000000000
0098b6a0	mov x22,x26
0098b6a4	ldrb w21,[x22]
0098b6a8	mov w0,w21
0098b6ac	bl 0x00c33770
0098b6b0	cbnz w0,0x0098b6c8
0098b6b4	cmp w21,#0x2e
0098b6b8	b.hi 0x0098b9dc
0098b6bc	lsl x8,x19,x21
0098b6c0	tst x8,x25
0098b6c4	b.eq 0x0098b9dc
0098b6c8	subs x23,x23,#0x1
0098b6cc	add x22,x22,#0x1
0098b6d0	b.ne 0x0098b6a4
0098b6d4	ldr x9,[sp, #0x10]
0098b6d8	add x8,x20,x28
0098b6dc	tst w24,#0x1
0098b6e0	add x9,x9,x27
0098b6e4	csinc x19,x8,x9,ne
0098b6e8	cmp x26,x19
0098b6ec	b.eq 0x0098b704
0098b6f0	ldrb w0,[x26]
0098b6f4	bl 0x00c30f10
0098b6f8	strb w0,[x26], #0x1
0098b6fc	cmp x19,x26
0098b700	b.ne 0x0098b6f0
0098b704	ldr x9,[sp, #0x8]
0098b708	ldp x23,x20,[sp, #0x18]
0098b70c	ldp x24,x28,[sp, #0x38]
0098b710	ldrb w8,[x9, #0x1]
0098b714	cmp w8,#0x2f
0098b718	b.ne 0x0098b760
0098b71c	ldrb w8,[x9, #0x2]
0098b720	ldr x26,[sp, #0x48]
0098b724	cmp w8,#0x2f
0098b728	b.ne 0x0098b780
0098b72c	add x24,x9,#0x3
0098b730	mov x8,x24
0098b734	add x25,sp,#0x58
0098b738	ldrb w9,[x8]
0098b73c	cbz w9,0x0098be0c
0098b740	cmp w9,#0x2f
0098b744	b.eq 0x0098be0c
0098b748	cmp w9,#0x40
0098b74c	b.eq 0x0098bc3c
0098b750	add x8,x8,#0x1
0098b754	ldrb w9,[x8]
0098b758	cbnz w9,0x0098b740
0098b75c	b 0x0098be0c
0098b760	mov w8,#0x4
0098b764	add x9,sp,#0x58
0098b768	add x0,x9,#0x8
0098b76c	orr w2,wzr,#0xc0
0098b770	mov w1,wzr
0098b774	str w8,[sp, #0x58]
0098b778	bl 0x00c301c0
0098b77c	b 0x0098ba00
0098b780	mov w8,#0x4
0098b784	add x9,sp,#0x58
0098b788	str w8,[sp, #0x58]
0098b78c	add x0,x9,#0x8
0098b790	orr w2,wzr,#0xc0
0098b794	mov w1,wzr
0098b798	bl 0x00c301c0
0098b79c	ldrb w8,[sp, #0x1e8]
0098b7a0	tbz w8,#0x0,0x0098b7ac
0098b7a4	ldr x0,[sp, #0x1f8]
0098b7a8	bl 0x00c301d0
0098b7ac	ldrb w8,[sp, #0x1d0]
0098b7b0	tbnz w8,#0x0,0x0098b874
0098b7b4	ldrb w8,[sp, #0x1b8]
0098b7b8	tbnz w8,#0x0,0x0098b884
0098b7bc	ldrb w8,[sp, #0x1a0]
0098b7c0	tbnz w8,#0x0,0x0098b894
0098b7c4	ldrb w8,[sp, #0x188]
0098b7c8	tbnz w8,#0x0,0x0098b8a4
0098b7cc	ldrb w8,[sp, #0x170]
0098b7d0	tbnz w8,#0x0,0x0098b8b4
0098b7d4	ldrb w8,[sp, #0x158]
0098b7d8	tbnz w8,#0x0,0x0098b8c4
0098b7dc	ldrb w8,[sp, #0x140]
0098b7e0	tbz w8,#0x0,0x0098b7ec
0098b7e4	ldr x0,[sp, #0x150]
0098b7e8	bl 0x00c301d0
0098b7ec	ldr w8,[sp, #0x58]
0098b7f0	mov w25,wzr
0098b7f4	cbz w8,0x0098b8d8
0098b7f8	ldrb w8,[sp, #0x108]
0098b7fc	tbnz w8,#0x0,0x0098bbc8
0098b800	ldrb w8,[sp, #0xf0]
0098b804	tbnz w8,#0x0,0x0098bbd8
0098b808	ldrb w8,[sp, #0xd8]
0098b80c	tbnz w8,#0x0,0x0098bbe8
0098b810	ldrb w8,[sp, #0xc0]
0098b814	tbnz w8,#0x0,0x0098bbf8
0098b818	ldrb w8,[sp, #0xa8]
0098b81c	tbnz w8,#0x0,0x0098bc08
0098b820	ldrb w8,[sp, #0x90]
0098b824	tbnz w8,#0x0,0x0098bc18
0098b828	ldrb w8,[sp, #0x78]
0098b82c	tbnz w8,#0x0,0x0098bc28
0098b830	ldrb w8,[sp, #0x60]
0098b834	tbz w8,#0x0,0x0098b840
0098b838	ldr x0,[sp, #0x70]
0098b83c	bl 0x00c301d0
0098b840	ldr x8,[x20, #0x28]
0098b844	ldr x9,[sp, #0x50]
0098b848	cmp x8,x9
0098b84c	b.ne 0x0098c4c8
0098b850	mov w0,w25
0098b854	add sp,sp,#0x210
0098b858	ldp x29,x30,[sp, #0x50]
0098b85c	ldp x20,x19,[sp, #0x40]
0098b860	ldp x22,x21,[sp, #0x30]
0098b864	ldp x24,x23,[sp, #0x20]
0098b868	ldp x26,x25,[sp, #0x10]
0098b86c	ldp x28,x27,[sp], #0x60
0098b870	ret
0098b874	ldr x0,[sp, #0x1e0]
0098b878	bl 0x00c301d0
0098b87c	ldrb w8,[sp, #0x1b8]
0098b880	tbz w8,#0x0,0x0098b7bc
0098b884	ldr x0,[sp, #0x1c8]
0098b888	bl 0x00c301d0
0098b88c	ldrb w8,[sp, #0x1a0]
0098b890	tbz w8,#0x0,0x0098b7c4
0098b894	ldr x0,[sp, #0x1b0]
0098b898	bl 0x00c301d0
0098b89c	ldrb w8,[sp, #0x188]
0098b8a0	tbz w8,#0x0,0x0098b7cc
0098b8a4	ldr x0,[sp, #0x198]
0098b8a8	bl 0x00c301d0
0098b8ac	ldrb w8,[sp, #0x170]
0098b8b0	tbz w8,#0x0,0x0098b7d4
0098b8b4	ldr x0,[sp, #0x180]
0098b8b8	bl 0x00c301d0
0098b8bc	ldrb w8,[sp, #0x158]
0098b8c0	tbz w8,#0x0,0x0098b7dc
0098b8c4	ldr x0,[sp, #0x168]
0098b8c8	bl 0x00c301d0
0098b8cc	ldrb w8,[sp, #0x140]
0098b8d0	tbnz w8,#0x0,0x0098b7e4
0098b8d4	b 0x0098b7ec
0098b8d8	add x19,sp,#0x58
0098b8dc	add x8,x19,#0x8
0098b8e0	cmp x8,x28
0098b8e4	b.eq 0x0098b908
0098b8e8	ldrb w9,[sp, #0x60]
0098b8ec	ldp x11,x10,[sp, #0x68]
0098b8f0	tst w9,#0x1
0098b8f4	lsr w12,w9,#0x1
0098b8f8	csinc x1,x10,x8,ne
0098b8fc	csel x2,x12,x11,eq
0098b900	mov x0,x28
0098b904	bl 0x00c31090
0098b908	add x8,x19,#0x20
0098b90c	cmp x8,x26
0098b910	b.eq 0x0098b934
0098b914	ldrb w9,[sp, #0x78]
0098b918	ldp x11,x10,[sp, #0x80]
0098b91c	tst w9,#0x1
0098b920	lsr w12,w9,#0x1
0098b924	csinc x1,x10,x8,ne
0098b928	csel x2,x12,x11,eq
0098b92c	mov x0,x26
0098b930	bl 0x00c31090
0098b934	add x19,sp,#0x58
0098b938	add x8,x19,#0x50
0098b93c	cmp x8,x23
0098b940	b.eq 0x0098b964
0098b944	ldrb w9,[sp, #0xa8]
0098b948	ldp x11,x10,[sp, #0xb0]
0098b94c	tst w9,#0x1
0098b950	lsr w12,w9,#0x1
0098b954	csinc x1,x10,x8,ne
0098b958	csel x2,x12,x11,eq
0098b95c	mov x0,x23
0098b960	bl 0x00c31090
0098b964	add x8,x19,#0x68
0098b968	cmp x8,x24
0098b96c	b.eq 0x0098b990
0098b970	ldrb w9,[sp, #0xc0]
0098b974	ldp x11,x10,[sp, #0xc8]
0098b978	tst w9,#0x1
0098b97c	lsr w12,w9,#0x1
0098b980	csinc x1,x10,x8,ne
0098b984	csel x2,x12,x11,eq
0098b988	mov x0,x24
0098b98c	bl 0x00c31090
0098b990	ldrb w8,[x28]
0098b994	ldr x9,[x28, #0x8]
0098b998	lsr w10,w8,#0x1
0098b99c	tst w8,#0x1
0098b9a0	csel x9,x10,x9,eq
0098b9a4	sub x9,x9,#0x2
0098b9a8	cmp x9,#0x3
0098b9ac	b.hi 0x0098bb34
0098b9b0	adrp x10,0x74a000
0098b9b4	add x10,x10,#0x94
0098b9b8	ldrsw x9,[x10, x9, LSL #0x2]
0098b9bc	add x9,x9,x10
0098b9c0	br x9
0098b9c4	ldr x9,[x28, #0x10]
0098b9c8	tst w8,#0x1
0098b9cc	csinc x8,x9,x28,ne
0098b9d0	ldrh w8,[x8]
0098b9d4	mov w9,#0x7377
0098b9d8	b 0x0098ba28
0098b9dc	add x9,sp,#0x58
0098b9e0	orr w8,wzr,#0x3
0098b9e4	add x0,x9,#0x8
0098b9e8	orr w2,wzr,#0xc0
0098b9ec	mov w1,wzr
0098b9f0	str w8,[sp, #0x58]
0098b9f4	bl 0x00c301c0
0098b9f8	ldp x23,x20,[sp, #0x18]
0098b9fc	ldp x24,x28,[sp, #0x38]
0098ba00	ldr x26,[sp, #0x48]
0098ba04	ldrb w8,[sp, #0x1e8]
0098ba08	tbnz w8,#0x0,0x0098b7a4
0098ba0c	b 0x0098b7ac
0098ba10	ldr x9,[x28, #0x10]
0098ba14	tst w8,#0x1
0098ba18	csinc x8,x9,x28,ne
0098ba1c	ldr w8,[x8]
0098ba20	mov w9,#0x7468
0098ba24	movk w9,#0x7074, LSL #16
0098ba28	cmp w8,w9
0098ba2c	mov w8,#0x50
0098ba30	b 0x0098ba74
0098ba34	ldr x9,[x28, #0x10]
0098ba38	tst w8,#0x1
0098ba3c	adrp x1,0x2d9000
0098ba40	add x1,x1,#0x95
0098ba44	csinc x0,x9,x28,ne
0098ba48	mov w2,#0x5
0098ba4c	b 0x0098ba68
0098ba50	ldr x9,[x28, #0x10]
0098ba54	tst w8,#0x1
0098ba58	adrp x1,0x2b5000
0098ba5c	add x1,x1,#0x69e
0098ba60	csinc x0,x9,x28,ne
0098ba64	orr w2,wzr,#0x3
0098ba68	bl 0x00c300b0
0098ba6c	cmp w0,#0x0
0098ba70	mov w8,#0x1bb
0098ba74	csinv w21,w8,wzr,eq
0098ba78	ldr w9,[sp, #0x58]
0098ba7c	mov w8,w21
0098ba80	cbnz w9,0x0098bab8
0098ba84	ldrb w8,[sp, #0x90]
0098ba88	ldr x9,[sp, #0xa0]
0098ba8c	add x10,sp,#0x58
0098ba90	add x10,x10,#0x39
0098ba94	tst w8,#0x1
0098ba98	csel x0,x10,x9,eq
0098ba9c	bl 0x00c308a0
0098baa0	sub w9,w0,#0x1
0098baa4	orr w10,wzr,#0xffff
0098baa8	mov w8,w0
0098baac	cmp w9,w10
0098bab0	b.cc 0x0098bab8
0098bab4	mov w8,w21
0098bab8	ldr x9,[sp, #0x28]
0098babc	cmp w8,w21
0098bac0	str w8,[x9]
0098bac4	ldr x9,[sp, #0x30]
0098bac8	cset w8,eq
0098bacc	strb w8,[x9]
0098bad0	ldrb w8,[x23]
0098bad4	ldr x9,[x23, #0x8]
0098bad8	lsr w10,w8,#0x1
0098badc	tst w8,#0x1
0098bae0	csel x8,x10,x9,eq
0098bae4	cbz x8,0x0098bb1c
0098bae8	ldr x8,[x23, #0x10]
0098baec	csinc x8,x8,x23,ne
0098baf0	ldrb w8,[x8]
0098baf4	cmp w8,#0x2f
0098baf8	b.eq 0x0098bb70
0098bafc	add x8,sp,#0x138
0098bb00	mov w0,#0x2f
0098bb04	mov x1,x23
0098bb08	bl 0x00c33760
0098bb0c	ldrb w8,[x23]
0098bb10	tbnz w8,#0x0,0x0098bb3c
0098bb14	strh wzr,[x23]
0098bb18	b 0x0098bb5c
0098bb1c	adrp x1,0x2a9000
0098bb20	add x1,x1,#0x1de
0098bb24	mov w2,#0x1
0098bb28	mov x0,x23
0098bb2c	bl 0x00c31090
0098bb30	b 0x0098bb70
0098bb34	mov w21,#0xffffffff
0098bb38	b 0x0098ba78
0098bb3c	ldr x8,[x23, #0x10]
0098bb40	strb wzr,[x8]
0098bb44	ldrb w8,[x23]
0098bb48	str xzr,[x23, #0x8]
0098bb4c	tbz w8,#0x0,0x0098bb5c
0098bb50	ldr x0,[x23, #0x10]
0098bb54	bl 0x00c301d0
0098bb58	str xzr,[x23]
0098bb5c	ldr x8,[sp, #0x148]
0098bb60	str x8,[x23, #0x10]
0098bb64	add x8,sp,#0x39
0098bb68	ldur q0,[x8, #0xff]
0098bb6c	str q0,[x23]
0098bb70	ldrb w8,[x24]
0098bb74	ldr x9,[x24, #0x8]
0098bb78	lsr w10,w8,#0x1
0098bb7c	tst w8,#0x1
0098bb80	csel x8,x10,x9,eq
0098bb84	cbz x8,0x0098bbbc
0098bb88	adrp x1,0x2a3000
0098bb8c	add x1,x1,#0x5cf
0098bb90	mov w2,#0x1
0098bb94	mov x0,x23
0098bb98	bl 0x00c308c0
0098bb9c	ldrb w8,[x24]
0098bba0	ldp x10,x9,[x24, #0x8]
0098bba4	tst w8,#0x1
0098bba8	lsr w11,w8,#0x1
0098bbac	csinc x1,x9,x24,ne
0098bbb0	csel x2,x11,x10,eq
0098bbb4	mov x0,x23
0098bbb8	bl 0x00c308c0
0098bbbc	mov w25,#0x1
0098bbc0	ldrb w8,[sp, #0x108]
0098bbc4	tbz w8,#0x0,0x0098b800
0098bbc8	ldr x0,[sp, #0x118]
0098bbcc	bl 0x00c301d0
0098bbd0	ldrb w8,[sp, #0xf0]
0098bbd4	tbz w8,#0x0,0x0098b808
0098bbd8	ldr x0,[sp, #0x100]
0098bbdc	bl 0x00c301d0
0098bbe0	ldrb w8,[sp, #0xd8]
0098bbe4	tbz w8,#0x0,0x0098b810
0098bbe8	ldr x0,[sp, #0xe8]
0098bbec	bl 0x00c301d0
0098bbf0	ldrb w8,[sp, #0xc0]
0098bbf4	tbz w8,#0x0,0x0098b818
0098bbf8	ldr x0,[sp, #0xd0]
0098bbfc	bl 0x00c301d0
0098bc00	ldrb w8,[sp, #0xa8]
0098bc04	tbz w8,#0x0,0x0098b820
0098bc08	ldr x0,[sp, #0xb8]
0098bc0c	bl 0x00c301d0
0098bc10	ldrb w8,[sp, #0x90]
0098bc14	tbz w8,#0x0,0x0098b828
0098bc18	ldr x0,[sp, #0xa0]
0098bc1c	bl 0x00c301d0
0098bc20	ldrb w8,[sp, #0x78]
0098bc24	tbz w8,#0x0,0x0098b830
0098bc28	ldr x0,[sp, #0x88]
0098bc2c	bl 0x00c301d0
0098bc30	ldrb w8,[sp, #0x60]
0098bc34	tbnz w8,#0x0,0x0098b838
0098bc38	b 0x0098b840
0098bc3c	mov x28,x24
0098bc40	ldrb w8,[x28]
0098bc44	cbz w8,0x0098bc64
0098bc48	cmp w8,#0x3a
0098bc4c	b.eq 0x0098bc64
0098bc50	cmp w8,#0x40
0098bc54	b.eq 0x0098bc64
0098bc58	add x28,x28,#0x1
0098bc5c	ldrb w8,[x28]
0098bc60	cbnz w8,0x0098bc48
0098bc64	sub x27,x28,x24
0098bc68	cmn x27,#0x10
0098bc6c	stp xzr,xzr,[sp, #0x120]
0098bc70	str xzr,[sp, #0x130]
0098bc74	b.cs 0x0098c4e4
0098bc78	cmp x27,#0x17
0098bc7c	b.cs 0x0098bc98
0098bc80	add x9,sp,#0x120
0098bc84	lsl w8,w27,#0x1
0098bc88	orr x21,x9,#0x1
0098bc8c	strb w8,[sp, #0x120]
0098bc90	cbnz x27,0x0098bcb8
0098bc94	b 0x0098bcc8
0098bc98	add x8,x27,#0x10
0098bc9c	and x22,x8,#-0x10
0098bca0	mov x0,x22
0098bca4	bl 0x00c2fed0
0098bca8	orr x8,x22,#0x1
0098bcac	mov x21,x0
0098bcb0	stp x27,x0,[sp, #0x128]
0098bcb4	str x8,[sp, #0x120]
0098bcb8	mov x0,x21
0098bcbc	mov x1,x24
0098bcc0	mov x2,x27
0098bcc4	bl 0x00c2ffd0
0098bcc8	ldrb w8,[sp, #0x1d0]
0098bccc	add x9,sp,#0x138
0098bcd0	add x19,x9,#0x98
0098bcd4	strb wzr,[x21, x27]
0098bcd8	tbnz w8,#0x0,0x0098bce4
0098bcdc	strh wzr,[sp, #0x1d0]
0098bce0	b 0x0098bd04
0098bce4	ldr x8,[sp, #0x1e0]
0098bce8	strb wzr,[x8]
0098bcec	ldrb w8,[sp, #0x1d0]
0098bcf0	str xzr,[sp, #0x1d8]
0098bcf4	tbz w8,#0x0,0x0098bd04
0098bcf8	ldr x0,[sp, #0x1e0]
0098bcfc	bl 0x00c301d0
0098bd00	str xzr,[sp, #0x1d0]
0098bd04	ldr x8,[sp, #0x130]
0098bd08	ldur q0,[x25, #0xc8]
0098bd0c	str x8,[x19, #0x10]
0098bd10	str q0,[x19]
0098bd14	ldrb w8,[x28]
0098bd18	cmp w8,#0x3a
0098bd1c	b.ne 0x0098bdfc
0098bd20	add x26,x28,#0x1
0098bd24	mov x28,x26
0098bd28	b 0x0098bd30
0098bd2c	add x28,x28,#0x1
0098bd30	ldrb w8,[x28]
0098bd34	orr w8,w8,#0x40
0098bd38	cmp w8,#0x40
0098bd3c	b.ne 0x0098bd2c
0098bd40	sub x27,x28,x26
0098bd44	cmn x27,#0x10
0098bd48	stp xzr,xzr,[sp, #0x120]
0098bd4c	str xzr,[sp, #0x130]
0098bd50	b.cs 0x0098c4f4
0098bd54	cmp x27,#0x17
0098bd58	b.cs 0x0098bd74
0098bd5c	add x9,sp,#0x120
0098bd60	lsl w8,w27,#0x1
0098bd64	orr x21,x9,#0x1
0098bd68	strb w8,[sp, #0x120]
0098bd6c	cbnz x27,0x0098bd94
0098bd70	b 0x0098bda4
0098bd74	add x8,x27,#0x10
0098bd78	and x22,x8,#-0x10
0098bd7c	mov x0,x22
0098bd80	bl 0x00c2fed0
0098bd84	orr x8,x22,#0x1
0098bd88	mov x21,x0
0098bd8c	stp x27,x0,[sp, #0x128]
0098bd90	str x8,[sp, #0x120]
0098bd94	mov x0,x21
0098bd98	mov x1,x26
0098bd9c	mov x2,x27
0098bda0	bl 0x00c2ffd0
0098bda4	ldrb w8,[sp, #0x1e8]
0098bda8	add x9,sp,#0x138
0098bdac	add x19,x9,#0xb0
0098bdb0	strb wzr,[x21, x27]
0098bdb4	tbnz w8,#0x0,0x0098bdc4
0098bdb8	ldr x26,[sp, #0x48]
0098bdbc	strh wzr,[sp, #0x1e8]
0098bdc0	b 0x0098bde8
0098bdc4	ldr x8,[sp, #0x1f8]
0098bdc8	ldr x26,[sp, #0x48]
0098bdcc	strb wzr,[x8]
0098bdd0	ldrb w8,[sp, #0x1e8]
0098bdd4	str xzr,[sp, #0x1f0]
0098bdd8	tbz w8,#0x0,0x0098bde8
0098bddc	ldr x0,[sp, #0x1f8]
0098bde0	bl 0x00c301d0
0098bde4	str xzr,[sp, #0x1e8]
0098bde8	ldr x8,[sp, #0x130]
0098bdec	ldur q0,[x25, #0xc8]
0098bdf0	str x8,[x19, #0x10]
0098bdf4	str q0,[x19]
0098bdf8	ldrb w8,[x28]
0098bdfc	cmp w8,#0x40
0098be00	b.ne 0x0098c16c
0098be04	add x24,x28,#0x1
0098be08	ldr x28,[sp, #0x40]
0098be0c	ldrb w8,[x24]
0098be10	mov x26,x24
0098be14	cbz w8,0x0098be5c
0098be18	add x26,x24,#0x1
0098be1c	mov w9,w8
0098be20	cmp w8,#0x5b
0098be24	b.ne 0x0098be34
0098be28	and w10,w9,#0xff
0098be2c	cmp w10,#0x5d
0098be30	b.eq 0x0098be5c
0098be34	cmp w8,#0x5b
0098be38	b.eq 0x0098be50
0098be3c	and w9,w9,#0xff
0098be40	cmp w9,#0x2f
0098be44	b.eq 0x0098be58
0098be48	cmp w9,#0x3a
0098be4c	b.eq 0x0098be58
0098be50	ldrb w9,[x26], #0x1
0098be54	cbnz w9,0x0098be20
0098be58	sub x26,x26,#0x1
0098be5c	sub x27,x26,x24
0098be60	cmn x27,#0x10
0098be64	stp xzr,xzr,[sp, #0x120]
0098be68	str xzr,[sp, #0x130]
0098be6c	b.cs 0x0098c4d4
0098be70	cmp x27,#0x17
0098be74	b.cs 0x0098be90
0098be78	add x9,sp,#0x120
0098be7c	lsl w8,w27,#0x1
0098be80	orr x21,x9,#0x1
0098be84	strb w8,[sp, #0x120]
0098be88	cbnz x27,0x0098beb0
0098be8c	b 0x0098bec0
0098be90	add x8,x27,#0x10
0098be94	and x22,x8,#-0x10
0098be98	mov x0,x22
0098be9c	bl 0x00c2fed0
0098bea0	orr x8,x22,#0x1
0098bea4	mov x21,x0
0098bea8	stp x27,x0,[sp, #0x128]
0098beac	str x8,[sp, #0x120]
0098beb0	mov x0,x21
0098beb4	mov x1,x24
0098beb8	mov x2,x27
0098bebc	bl 0x00c2ffd0
0098bec0	ldrb w8,[sp, #0x158]
0098bec4	add x9,sp,#0x138
0098bec8	add x22,x9,#0x20
0098becc	strb wzr,[x21, x27]
0098bed0	tbnz w8,#0x0,0x0098bee0
0098bed4	ldr x24,[sp, #0x38]
0098bed8	strh wzr,[sp, #0x158]
0098bedc	b 0x0098bf04
0098bee0	ldr x8,[sp, #0x168]
0098bee4	ldr x24,[sp, #0x38]
0098bee8	strb wzr,[x8]
0098beec	ldrb w8,[sp, #0x158]
0098bef0	str xzr,[sp, #0x160]
0098bef4	tbz w8,#0x0,0x0098bf04
0098bef8	ldr x0,[sp, #0x168]
0098befc	bl 0x00c301d0
0098bf00	str xzr,[sp, #0x158]
0098bf04	ldr x8,[sp, #0x130]
0098bf08	ldur q0,[x25, #0xc8]
0098bf0c	str x8,[x22, #0x10]
0098bf10	str q0,[x22]
0098bf14	ldrb w8,[x26]
0098bf18	cmp w8,#0x3a
0098bf1c	b.ne 0x0098c008
0098bf20	add x28,x26,#0x1
0098bf24	mov x26,x28
0098bf28	ldrb w8,[x26]
0098bf2c	cbz w8,0x0098bf44
0098bf30	cmp w8,#0x2f
0098bf34	b.eq 0x0098bf44
0098bf38	add x26,x26,#0x1
0098bf3c	ldrb w8,[x26]
0098bf40	cbnz w8,0x0098bf30
0098bf44	sub x27,x26,x28
0098bf48	cmn x27,#0x10
0098bf4c	stp xzr,xzr,[sp, #0x120]
0098bf50	str xzr,[sp, #0x130]
0098bf54	b.cs 0x0098c4dc
0098bf58	cmp x27,#0x17
0098bf5c	b.cs 0x0098bf78
0098bf60	add x9,sp,#0x120
0098bf64	lsl w8,w27,#0x1
0098bf68	orr x21,x9,#0x1
0098bf6c	strb w8,[sp, #0x120]
0098bf70	cbnz x27,0x0098bfa0
0098bf74	b 0x0098bfb0
0098bf78	add x8,x27,#0x10
0098bf7c	mov x19,x22
0098bf80	and x22,x8,#-0x10
0098bf84	mov x0,x22
0098bf88	bl 0x00c2fed0
0098bf8c	orr x8,x22,#0x1
0098bf90	mov x21,x0
0098bf94	stp x27,x0,[sp, #0x128]
0098bf98	str x8,[sp, #0x120]
0098bf9c	mov x22,x19
0098bfa0	mov x0,x21
0098bfa4	mov x1,x28
0098bfa8	mov x2,x27
0098bfac	bl 0x00c2ffd0
0098bfb0	ldrb w8,[sp, #0x170]
0098bfb4	add x9,sp,#0x138
0098bfb8	add x19,x9,#0x38
0098bfbc	strb wzr,[x21, x27]
0098bfc0	tbnz w8,#0x0,0x0098bfd0
0098bfc4	ldr x28,[sp, #0x40]
0098bfc8	strh wzr,[sp, #0x170]
0098bfcc	b 0x0098bff4
0098bfd0	ldr x8,[sp, #0x180]
0098bfd4	ldr x28,[sp, #0x40]
0098bfd8	strb wzr,[x8]
0098bfdc	ldrb w8,[sp, #0x170]
0098bfe0	str xzr,[sp, #0x178]
0098bfe4	tbz w8,#0x0,0x0098bff4
0098bfe8	ldr x0,[sp, #0x180]
0098bfec	bl 0x00c301d0
0098bff0	str xzr,[sp, #0x170]
0098bff4	ldr x8,[sp, #0x130]
0098bff8	ldur q0,[x25, #0xc8]
0098bffc	str x8,[x19, #0x10]
0098c000	str q0,[x19]
0098c004	ldrb w8,[x26]
0098c008	cmp w8,#0x2f
0098c00c	b.eq 0x0098c0f8
0098c010	cbnz w8,0x0098c164
0098c014	ldr x9,[sp, #0x10]
0098c018	str wzr,[sp, #0x138]
0098c01c	add x11,sp,#0x138
0098c020	str wzr,[sp, #0x58]
0098c024	ldr q0,[x9]
0098c028	ldr x8,[x9, #0x10]
0098c02c	stp xzr,xzr,[x9, #0x8]
0098c030	str xzr,[x9]
0098c034	ldr x9,[x22, #0x10]
0098c038	ldr q1,[x22]
0098c03c	stp xzr,xzr,[x22]
0098c040	str xzr,[x22, #0x10]
0098c044	stur q0,[sp, #0x60]
0098c048	ldur q0,[x11, #0x38]
0098c04c	str x9,[sp, #0x88]
0098c050	add x9,sp,#0x89
0098c054	str x8,[sp, #0x70]
0098c058	stur q0,[sp, #0x90]
0098c05c	ldur q0,[x9, #0xff]
0098c060	ldr x8,[sp, #0x180]
0098c064	stp xzr,xzr,[sp, #0x180]
0098c068	stp xzr,xzr,[sp, #0x170]
0098c06c	ldr x9,[sp, #0x198]
0098c070	stp xzr,xzr,[sp, #0x190]
0098c074	stur q0,[sp, #0xa8]
0098c078	ldur q0,[x11, #0x68]
0098c07c	stp xzr,xzr,[sp, #0x1a0]
0098c080	str x9,[sp, #0xb8]
0098c084	add x9,sp,#0xb9
0098c088	stur q0,[sp, #0xc0]
0098c08c	ldur q0,[x9, #0xff]
0098c090	ldr x10,[sp, #0x1b0]
0098c094	str x8,[sp, #0xa0]
0098c098	ldr x8,[sp, #0x1c8]
0098c09c	stp xzr,xzr,[sp, #0x1b0]
0098c0a0	stp xzr,xzr,[sp, #0x1c0]
0098c0a4	stur q0,[sp, #0xd8]
0098c0a8	ldur q0,[x11, #0x98]
0098c0ac	stp xzr,xzr,[sp, #0x1d0]
0098c0b0	str x8,[sp, #0xe8]
0098c0b4	add x8,sp,#0xe9
0098c0b8	stur q1,[sp, #0x78]
0098c0bc	ldr x9,[sp, #0x1e0]
0098c0c0	str x10,[sp, #0xd0]
0098c0c4	ldr x10,[sp, #0x1f8]
0098c0c8	stur q0,[x25, #0x98]
0098c0cc	ldur q0,[x8, #0xff]
0098c0d0	ldr x26,[sp, #0x48]
0098c0d4	add x8,sp,#0x9
0098c0d8	stp xzr,xzr,[sp, #0x1e0]
0098c0dc	stp xzr,xzr,[sp, #0x1f0]
0098c0e0	str x9,[sp, #0x100]
0098c0e4	str x10,[sp, #0x118]
0098c0e8	stur q0,[x8, #0xff]
0098c0ec	ldrb w8,[sp, #0x1e8]
0098c0f0	tbnz w8,#0x0,0x0098b7a4
0098c0f4	b 0x0098b7ac
0098c0f8	add x26,x26,#0x1
0098c0fc	orr x9,xzr,#-0x7fffffffffffffff
0098c100	mov w8,#0x1
0098c104	movk x9,#0x8, LSL #32
0098c108	mov x28,x26
0098c10c	b 0x0098c114
0098c110	add x28,x28,#0x1
0098c114	ldrb w10,[x28]
0098c118	cmp w10,#0x3f
0098c11c	b.hi 0x0098c110
0098c120	lsl x10,x8,x10
0098c124	tst x10,x9
0098c128	b.eq 0x0098c110
0098c12c	sub x27,x28,x26
0098c130	cmn x27,#0x10
0098c134	stp xzr,xzr,[sp, #0x120]
0098c138	str xzr,[sp, #0x130]
0098c13c	b.cs 0x0098c4ec
0098c140	cmp x27,#0x17
0098c144	str x22,[sp, #0x38]
0098c148	b.cs 0x0098c198
0098c14c	add x9,sp,#0x120
0098c150	lsl w8,w27,#0x1
0098c154	orr x21,x9,#0x1
0098c158	strb w8,[sp, #0x120]
0098c15c	cbnz x27,0x0098c1b8
0098c160	b 0x0098c1c8
0098c164	orr w8,wzr,#0x7
0098c168	b 0x0098b764
0098c16c	add x9,sp,#0x58
0098c170	mov w8,#0x5
0098c174	add x0,x9,#0x8
0098c178	orr w2,wzr,#0xc0
0098c17c	mov w1,wzr
0098c180	str w8,[sp, #0x58]
0098c184	bl 0x00c301c0
0098c188	ldp x24,x28,[sp, #0x38]
0098c18c	ldrb w8,[sp, #0x1e8]
0098c190	tbnz w8,#0x0,0x0098b7a4
0098c194	b 0x0098b7ac
0098c198	add x8,x27,#0x10
0098c19c	and x22,x8,#-0x10
0098c1a0	mov x0,x22
0098c1a4	bl 0x00c2fed0
0098c1a8	orr x8,x22,#0x1
0098c1ac	mov x21,x0
0098c1b0	stp x27,x0,[sp, #0x128]
0098c1b4	str x8,[sp, #0x120]
0098c1b8	mov x0,x21
0098c1bc	mov x1,x26
0098c1c0	mov x2,x27
0098c1c4	bl 0x00c2ffd0
0098c1c8	ldrb w8,[sp, #0x188]
0098c1cc	add x9,sp,#0x138
0098c1d0	add x22,x9,#0x50
0098c1d4	strb wzr,[x21, x27]
0098c1d8	tbnz w8,#0x0,0x0098c1e8
0098c1dc	ldr x26,[sp, #0x48]
0098c1e0	strh wzr,[sp, #0x188]
0098c1e4	b 0x0098c20c
0098c1e8	ldr x8,[sp, #0x198]
0098c1ec	ldr x26,[sp, #0x48]
0098c1f0	strb wzr,[x8]
0098c1f4	ldrb w8,[sp, #0x188]
0098c1f8	str xzr,[sp, #0x190]
0098c1fc	tbz w8,#0x0,0x0098c20c
0098c200	ldr x0,[sp, #0x198]
0098c204	bl 0x00c301d0
0098c208	str xzr,[sp, #0x188]
0098c20c	ldr x8,[sp, #0x130]
0098c210	ldur q0,[x25, #0xc8]
0098c214	str x8,[x22, #0x10]
0098c218	str q0,[x22]
0098c21c	ldrb w8,[x28]
0098c220	cmp w8,#0x3f
0098c224	b.ne 0x0098c308
0098c228	add x26,x28,#0x1
0098c22c	mov x28,x26
0098c230	ldrb w8,[x28]
0098c234	cbz w8,0x0098c24c
0098c238	cmp w8,#0x23
0098c23c	b.eq 0x0098c24c
0098c240	add x28,x28,#0x1
0098c244	ldrb w8,[x28]
0098c248	cbnz w8,0x0098c238
0098c24c	sub x27,x28,x26
0098c250	cmn x27,#0x10
0098c254	stp xzr,xzr,[sp, #0x120]
0098c258	str xzr,[sp, #0x130]
0098c25c	b.cs 0x0098c4fc
0098c260	cmp x27,#0x17
0098c264	b.cs 0x0098c280
0098c268	add x9,sp,#0x120
0098c26c	lsl w8,w27,#0x1
0098c270	orr x21,x9,#0x1
0098c274	strb w8,[sp, #0x120]
0098c278	cbnz x27,0x0098c2a0
0098c27c	b 0x0098c2b0
0098c280	add x8,x27,#0x10
0098c284	and x19,x8,#-0x10
0098c288	mov x0,x19
0098c28c	bl 0x00c2fed0
0098c290	orr x8,x19,#0x1
0098c294	mov x21,x0
0098c298	stp x27,x0,[sp, #0x128]
0098c29c	str x8,[sp, #0x120]
0098c2a0	mov x0,x21
0098c2a4	mov x1,x26
0098c2a8	mov x2,x27
0098c2ac	bl 0x00c2ffd0
0098c2b0	ldrb w8,[sp, #0x1a0]
0098c2b4	add x9,sp,#0x138
0098c2b8	add x19,x9,#0x68
0098c2bc	strb wzr,[x21, x27]
0098c2c0	tbnz w8,#0x0,0x0098c2d0
0098c2c4	ldr x26,[sp, #0x48]
0098c2c8	strh wzr,[sp, #0x1a0]
0098c2cc	b 0x0098c2f4
0098c2d0	ldr x8,[sp, #0x1b0]
0098c2d4	ldr x26,[sp, #0x48]
0098c2d8	strb wzr,[x8]
0098c2dc	ldrb w8,[sp, #0x1a0]
0098c2e0	str xzr,[sp, #0x1a8]
0098c2e4	tbz w8,#0x0,0x0098c2f4
0098c2e8	ldr x0,[sp, #0x1b0]
0098c2ec	bl 0x00c301d0
0098c2f0	str xzr,[sp, #0x1a0]
0098c2f4	ldr x8,[sp, #0x130]
0098c2f8	ldur q0,[x25, #0xc8]
0098c2fc	str x8,[x19, #0x10]
0098c300	str q0,[x19]
0098c304	ldrb w8,[x28]
0098c308	cmp w8,#0x23
0098c30c	b.ne 0x0098c354
0098c310	add x19,x28,#0x1
0098c314	ldrb w8,[x28, #0x1]!
0098c318	cbnz w8,0x0098c314
0098c31c	sub x27,x28,x19
0098c320	cmn x27,#0x10
0098c324	stp xzr,xzr,[sp, #0x120]
0098c328	str xzr,[sp, #0x130]
0098c32c	b.cs 0x0098c504
0098c330	ldr x28,[sp, #0x40]
0098c334	cmp x27,#0x17
0098c338	b.cs 0x0098c364
0098c33c	add x9,sp,#0x120
0098c340	lsl w8,w27,#0x1
0098c344	orr x21,x9,#0x1
0098c348	strb w8,[sp, #0x120]
0098c34c	cbnz x27,0x0098c388
0098c350	b 0x0098c398
0098c354	ldr x28,[sp, #0x40]
0098c358	add x8,sp,#0x138
0098c35c	add x21,x8,#0x80
0098c360	b 0x0098c3e4
0098c364	add x8,x27,#0x10
0098c368	and x26,x8,#-0x10
0098c36c	mov x0,x26
0098c370	bl 0x00c2fed0
0098c374	orr x8,x26,#0x1
0098c378	ldr x26,[sp, #0x48]
0098c37c	mov x21,x0
0098c380	stp x27,x0,[sp, #0x128]
0098c384	str x8,[sp, #0x120]
0098c388	mov x0,x21
0098c38c	mov x1,x19
0098c390	mov x2,x27
0098c394	bl 0x00c2ffd0
0098c398	ldrb w8,[sp, #0x1b8]
0098c39c	add x9,sp,#0x138
0098c3a0	strb wzr,[x21, x27]
0098c3a4	add x21,x9,#0x80
0098c3a8	tbnz w8,#0x0,0x0098c3b4
0098c3ac	strh wzr,[sp, #0x1b8]
0098c3b0	b 0x0098c3d4
0098c3b4	ldr x8,[sp, #0x1c8]
0098c3b8	strb wzr,[x8]
0098c3bc	ldrb w8,[sp, #0x1b8]
0098c3c0	str xzr,[sp, #0x1c0]
0098c3c4	tbz w8,#0x0,0x0098c3d4
0098c3c8	ldr x0,[sp, #0x1c8]
0098c3cc	bl 0x00c301d0
0098c3d0	str xzr,[sp, #0x1b8]
0098c3d4	ldr x8,[sp, #0x130]
0098c3d8	ldur q0,[x25, #0xc8]
0098c3dc	str x8,[x21, #0x10]
0098c3e0	str q0,[x21]
0098c3e4	ldr x9,[sp, #0x10]
0098c3e8	str wzr,[sp, #0x138]
0098c3ec	ldr x10,[sp, #0x38]
0098c3f0	add x11,sp,#0x138
0098c3f4	ldr q0,[x9]
0098c3f8	ldr x8,[x9, #0x10]
0098c3fc	stp xzr,xzr,[x9, #0x8]
0098c400	str xzr,[x9]
0098c404	stur q0,[sp, #0x60]
0098c408	ldr q0,[x10]
0098c40c	ldr x9,[x10, #0x10]
0098c410	stp xzr,xzr,[x10]
0098c414	str xzr,[x10, #0x10]
0098c418	stur q0,[sp, #0x78]
0098c41c	ldur q0,[x11, #0x38]
0098c420	ldr x10,[sp, #0x180]
0098c424	stp xzr,xzr,[sp, #0x170]
0098c428	str xzr,[sp, #0x180]
0098c42c	stur q0,[sp, #0x90]
0098c430	ldr q0,[x22]
0098c434	str x8,[sp, #0x70]
0098c438	ldr x8,[x22, #0x10]
0098c43c	stp xzr,xzr,[x22]
0098c440	str xzr,[x22, #0x10]
0098c444	stur q0,[sp, #0xa8]
0098c448	ldur q0,[x11, #0x68]
0098c44c	str x9,[sp, #0x88]
0098c450	ldr x9,[sp, #0x1b0]
0098c454	stp xzr,xzr,[sp, #0x1a0]
0098c458	str xzr,[sp, #0x1b0]
0098c45c	stur q0,[sp, #0xc0]
0098c460	ldr q0,[x21]
0098c464	str x10,[sp, #0xa0]
0098c468	ldr x10,[x21, #0x10]
0098c46c	stp xzr,xzr,[x21]
0098c470	str xzr,[x21, #0x10]
0098c474	stur q0,[sp, #0xd8]
0098c478	ldur q0,[x11, #0x98]
0098c47c	str x8,[sp, #0xb8]
0098c480	ldr x8,[sp, #0x1e0]
0098c484	str x9,[sp, #0xd0]
0098c488	stp xzr,xzr,[sp, #0x1d0]
0098c48c	add x9,sp,#0xe9
0098c490	str wzr,[sp, #0x58]
0098c494	str x10,[sp, #0xe8]
0098c498	stur q0,[x25, #0x98]
0098c49c	ldur q0,[x9, #0xff]
0098c4a0	ldr x9,[sp, #0x1f8]
0098c4a4	str x8,[sp, #0x100]
0098c4a8	add x8,sp,#0x9
0098c4ac	stp xzr,xzr,[sp, #0x1e0]
0098c4b0	stp xzr,xzr,[sp, #0x1f0]
0098c4b4	stur q0,[x8, #0xff]
0098c4b8	str x9,[sp, #0x118]
0098c4bc	ldrb w8,[sp, #0x1e8]
0098c4c0	tbnz w8,#0x0,0x0098b7a4
0098c4c4	b 0x0098b7ac
0098c4c8	bl 0x00c2fec0
0098c4cc	add x0,sp,#0x120
0098c4d0	bl 0x00c30ce0
0098c4d4	add x0,sp,#0x120
0098c4d8	bl 0x00c30ce0
0098c4dc	add x0,sp,#0x120
0098c4e0	bl 0x00c30ce0
0098c4e4	add x0,sp,#0x120
0098c4e8	bl 0x00c30ce0
0098c4ec	add x0,sp,#0x120
0098c4f0	bl 0x00c30ce0
0098c4f4	add x0,sp,#0x120
0098c4f8	bl 0x00c30ce0
0098c4fc	add x0,sp,#0x120
0098c500	bl 0x00c30ce0
0098c504	add x0,sp,#0x120
0098c508	bl 0x00c30ce0
