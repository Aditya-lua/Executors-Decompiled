; FUN_00a45304 @ 00a45304
00a45304	stp d15,d14,[sp, #-0x40]!
00a45308	adrp x9,0x758000
00a4530c	sxtb w8,w2
00a45310	add x9,x9,#0xc28
00a45314	orr w10,wzr,#0x3c0
00a45318	and w11,w2,w8, ASR #0x7
00a4531c	smaddl x8,w1,w10,x9
00a45320	stp d13,d12,[sp, #0x10]
00a45324	stp d11,d10,[sp, #0x20]
00a45328	stp d9,d8,[sp, #0x30]
00a4532c	stp xzr,xzr,[x0, #0x48]
00a45330	stp xzr,xzr,[x0, #0x58]
00a45334	stp xzr,xzr,[x0, #0x68]
00a45338	add x1,x8,#0x104
00a4533c	ldr q24,[x1]
00a45340	add x1,x8,#0x194
00a45344	sub w9,w2,w11, LSL #0x1
00a45348	ldr q12,[x1]
00a4534c	add x1,x8,#0x228
00a45350	ldur q1,[x0, #0x58]
00a45354	ldur q21,[x8, #0x58]
00a45358	ldr q30,[x1]
00a4535c	eor w1,w9,#0x1
00a45360	ldur q0,[x0, #0x48]
00a45364	ldur q2,[x0, #0x68]
00a45368	ldur q19,[x8, #0x2c]
00a4536c	ldur q20,[x8, #0x48]
00a45370	ldur q22,[x8, #0x68]
00a45374	and w1,w1,#0xff
00a45378	ldur q17,[x8, #0x4]
00a4537c	ldur q18,[x8, #0x14]
00a45380	add x5,x8,#0x148
00a45384	sub w1,w1,#0x1
00a45388	ldr q26,[x5]
00a4538c	add x5,x8,#0x1e4
00a45390	asr w1,w1,#0x1f
00a45394	ldr q8,[x5]
00a45398	add x5,x8,#0x238
00a4539c	eor v14.16B,v21.16B,v1.16B
00a453a0	dup v15.4S,w1
00a453a4	ldr q31,[x5]
00a453a8	add x5,x8,#0x284
00a453ac	eor v13.16B,v20.16B,v0.16B
00a453b0	eor v22.16B,v22.16B,v2.16B
00a453b4	and v20.16B,v19.16B,v15.16B
00a453b8	and v19.16B,v14.16B,v15.16B
00a453bc	ldur q5,[x8, #0x7c]
00a453c0	and v17.16B,v17.16B,v15.16B
00a453c4	and v21.16B,v18.16B,v15.16B
00a453c8	and v18.16B,v13.16B,v15.16B
00a453cc	and v13.16B,v22.16B,v15.16B
00a453d0	eor v15.16B,v19.16B,v1.16B
00a453d4	ldr q19,[x5]
00a453d8	eor w5,w9,#0x2
00a453dc	and w5,w5,#0xff
00a453e0	ldur q4,[x8, #0x8c]
00a453e4	add x3,x8,#0x11c
00a453e8	add x4,x8,#0x138
00a453ec	sub w5,w5,#0x1
00a453f0	ldur q3,[x8, #0xa4]
00a453f4	ldr q25,[x3]
00a453f8	add x3,x8,#0x16c
00a453fc	ldr q23,[x4]
00a45400	add x4,x8,#0x17c
00a45404	asr w5,w5,#0x1f
00a45408	ldp q6,q7,[x8, #0xc0]
00a4540c	add x6,x8,#0x158
00a45410	ldr q11,[x3]
00a45414	add x3,x8,#0x1f4
00a45418	ldr q9,[x4]
00a4541c	add x4,x8,#0x20c
00a45420	eor v14.16B,v18.16B,v0.16B
00a45424	dup v0.4S,w5
00a45428	eor v1.16B,v5.16B,v17.16B
00a4542c	ldp w11,w16,[x8, #0x24]
00a45430	ldr q28,[x6]
00a45434	ldr q29,[x3]
00a45438	add x3,x8,#0x248
00a4543c	ldr q27,[x4]
00a45440	add x4,x8,#0x25c
00a45444	add x6,x8,#0x26c
00a45448	and v1.16B,v1.16B,v0.16B
00a4544c	ldr w10,[x8]
00a45450	ldp w12,w13,[x8, #0x3c]
00a45454	ldr w14,[x8, #0x44]
00a45458	ldr w15,[x8, #0x78]
00a4545c	ldp w17,w18,[x8, #0x9c]
00a45460	ldr q16,[x8, #0xe0]
00a45464	ldr q10,[x3]
00a45468	ldr q22,[x4]
00a4546c	add x3,x8,#0x2d4
00a45470	ldr q18,[x6]
00a45474	stur q17,[x0, #0x4]
00a45478	eor v5.16B,v1.16B,v17.16B
00a4547c	eor v1.16B,v4.16B,v21.16B
00a45480	add x4,x8,#0x2e4
00a45484	eor v13.16B,v13.16B,v2.16B
00a45488	ldr q17,[x3]
00a4548c	stur q21,[x0, #0x14]
00a45490	and v1.16B,v1.16B,v0.16B
00a45494	eor v2.16B,v3.16B,v20.16B
00a45498	add x3,x8,#0x2fc
00a4549c	eor v21.16B,v1.16B,v21.16B
00a454a0	ldr q1,[x4]
00a454a4	add x4,x8,#0x318
00a454a8	stur q20,[x0, #0x2c]
00a454ac	and v2.16B,v2.16B,v0.16B
00a454b0	eor v3.16B,v6.16B,v14.16B
00a454b4	eor v20.16B,v2.16B,v20.16B
00a454b8	ldr q2,[x3]
00a454bc	add x3,x8,#0x328
00a454c0	eor v4.16B,v7.16B,v15.16B
00a454c4	and v7.16B,v3.16B,v0.16B
00a454c8	ldr q3,[x4]
00a454cc	stur q14,[x0, #0x48]
00a454d0	eor w16,w16,#0x1
00a454d4	eor v6.16B,v16.16B,v13.16B
00a454d8	and v16.16B,v4.16B,v0.16B
00a454dc	ldr q4,[x3]
00a454e0	ldp w3,w4,[x8, #0xb4]
00a454e4	and w6,w11,w1
00a454e8	and w11,w16,w1
00a454ec	and w16,w12,w1
00a454f0	ldr w12,[x8, #0xbc]
00a454f4	eor w10,w10,#0x1
00a454f8	and w10,w10,w1
00a454fc	and w13,w13,w1
00a45500	and w14,w14,w1
00a45504	eor w10,w10,#0x1
00a45508	eor w1,w11,#0x1
00a4550c	eor w11,w17,w6
00a45510	stur q15,[x0, #0x58]
00a45514	eor w17,w3,w16
00a45518	eor w3,w4,w13
00a4551c	eor w12,w12,w14
00a45520	eor w15,w15,w10
00a45524	and w4,w11,w5
00a45528	eor w11,w18,w1
00a4552c	and v0.16B,v6.16B,v0.16B
00a45530	eor v6.16B,v7.16B,v14.16B
00a45534	eor v7.16B,v16.16B,v15.16B
00a45538	ldur q16,[x8, #0xf4]
00a4553c	and w17,w17,w5
00a45540	and w18,w3,w5
00a45544	and w3,w12,w5
00a45548	and w15,w15,w5
00a4554c	and w5,w11,w5
00a45550	eor w11,w9,#0x3
00a45554	and w11,w11,#0xff
00a45558	stur q13,[x0, #0x68]
00a4555c	stur q5,[x0, #0x4]
00a45560	stur q21,[x0, #0x14]
00a45564	stur q20,[x0, #0x2c]
00a45568	stp w16,w13,[x0, #0x3c]
00a4556c	str w14,[x0, #0x44]
00a45570	str w10,[x0]
00a45574	str w6,[x0, #0x24]
00a45578	sub w11,w11,#0x1
00a4557c	eor w14,w3,w14
00a45580	eor w3,w4,w6
00a45584	ldr w4,[x8, #0xf0]
00a45588	asr w11,w11,#0x1f
00a4558c	eor v0.16B,v0.16B,v13.16B
00a45590	dup v13.4S,w11
00a45594	eor v16.16B,v16.16B,v5.16B
00a45598	and v16.16B,v16.16B,v13.16B
00a4559c	eor w10,w15,w10
00a455a0	eor v5.16B,v16.16B,v5.16B
00a455a4	eor v16.16B,v24.16B,v21.16B
00a455a8	eor w4,w4,w10
00a455ac	and v16.16B,v16.16B,v13.16B
00a455b0	str w1,[x0, #0x28]
00a455b4	and w4,w4,w11
00a455b8	eor v16.16B,v16.16B,v21.16B
00a455bc	eor v21.16B,v25.16B,v20.16B
00a455c0	eor w12,w17,w16
00a455c4	add x16,x0,#0x4
00a455c8	eor w13,w18,w13
00a455cc	eor w1,w5,w1
00a455d0	ldr w5,[x8, #0x114]
00a455d4	str w10,[x0]
00a455d8	eor w10,w4,w10
00a455dc	and v21.16B,v21.16B,v13.16B
00a455e0	add x17,x0,#0x8
00a455e4	ldr w4,[x8, #0x118]
00a455e8	stp w3,w1,[x0, #0x24]
00a455ec	stp w12,w13,[x0, #0x3c]
00a455f0	str w14,[x0, #0x44]
00a455f4	stur q6,[x0, #0x48]
00a455f8	stur q7,[x0, #0x58]
00a455fc	stur q0,[x0, #0x68]
00a45600	str w10,[x0]
00a45604	st1 {v5.S}[0],[x16]
00a45608	eor v20.16B,v21.16B,v20.16B
00a4560c	add x18,x0,#0xc
00a45610	add x15,x0,#0x10
00a45614	ldr w16,[x8, #0x12c]
00a45618	st1 {v5.S}[1],[x17]
00a4561c	eor v21.16B,v23.16B,v6.16B
00a45620	eor v23.16B,v26.16B,v7.16B
00a45624	eor v24.16B,v28.16B,v0.16B
00a45628	ldr w17,[x8, #0x130]
00a4562c	and v21.16B,v21.16B,v13.16B
00a45630	and v23.16B,v23.16B,v13.16B
00a45634	and v24.16B,v24.16B,v13.16B
00a45638	ldp q26,q28,[x8, #0x1b0]
00a4563c	ldr q13,[x8, #0x1d0]
00a45640	st1 {v5.S}[2],[x18]
00a45644	st1 {v5.S}[3],[x15]
00a45648	eor w15,w9,#0x4
00a4564c	and w15,w15,#0xff
00a45650	sub w15,w15,#0x1
00a45654	asr w15,w15,#0x1f
00a45658	eor v25.16B,v21.16B,v6.16B
00a4565c	eor v0.16B,v24.16B,v0.16B
00a45660	dup v24.4S,w15
00a45664	eor v6.16B,v11.16B,v5.16B
00a45668	and v6.16B,v6.16B,v24.16B
00a4566c	eor v11.16B,v6.16B,v5.16B
00a45670	eor v6.16B,v9.16B,v16.16B
00a45674	add x18,x8,#0x338
00a45678	and v6.16B,v6.16B,v24.16B
00a4567c	ldr q5,[x18]
00a45680	add x18,x8,#0x34c
00a45684	stur q16,[x0, #0x14]
00a45688	eor v21.16B,v6.16B,v16.16B
00a4568c	eor v6.16B,v12.16B,v20.16B
00a45690	eor v23.16B,v23.16B,v7.16B
00a45694	ldr q7,[x18]
00a45698	add x18,x8,#0x35c
00a4569c	stur q20,[x0, #0x2c]
00a456a0	and v6.16B,v6.16B,v24.16B
00a456a4	eor v20.16B,v6.16B,v20.16B
00a456a8	ldr q6,[x18]
00a456ac	add x18,x8,#0x374
00a456b0	eor v16.16B,v26.16B,v25.16B
00a456b4	and v9.16B,v16.16B,v24.16B
00a456b8	ldr q16,[x18]
00a456bc	ldr w18,[x8, #0x134]
00a456c0	eor w17,w17,w13
00a456c4	eor w5,w5,w3
00a456c8	eor w16,w16,w12
00a456cc	eor w18,w18,w14
00a456d0	eor w4,w4,w1
00a456d4	and w17,w17,w11
00a456d8	and w18,w18,w11
00a456dc	and w5,w5,w11
00a456e0	and w16,w16,w11
00a456e4	and w11,w4,w11
00a456e8	ldr w4,[x8, #0x18c]
00a456ec	eor w13,w17,w13
00a456f0	ldr w17,[x8, #0x1a4]
00a456f4	eor w14,w18,w14
00a456f8	ldr w18,[x8, #0x1a8]
00a456fc	eor w3,w5,w3
00a45700	ldr w5,[x8, #0x168]
00a45704	eor w12,w16,w12
00a45708	ldr w16,[x8, #0x190]
00a4570c	eor w11,w11,w1
00a45710	ldr w1,[x8, #0x1ac]
00a45714	eor w4,w4,w3
00a45718	eor w17,w17,w12
00a4571c	eor w18,w18,w13
00a45720	eor w1,w1,w14
00a45724	eor w5,w5,w10
00a45728	and w4,w4,w15
00a4572c	eor w16,w16,w11
00a45730	and w17,w17,w15
00a45734	and w18,w18,w15
00a45738	and w1,w1,w15
00a4573c	and w5,w5,w15
00a45740	and w15,w16,w15
00a45744	add x16,x0,#0x48
00a45748	eor w17,w17,w12
00a4574c	stp w12,w13,[x0, #0x3c]
00a45750	add x12,x0,#0x50
00a45754	eor w13,w18,w13
00a45758	add x18,x0,#0x4c
00a4575c	eor w4,w4,w3
00a45760	stp w3,w11,[x0, #0x24]
00a45764	add x3,x0,#0x54
00a45768	str w14,[x0, #0x44]
00a4576c	st1 {v25.S}[0],[x16]
00a45770	st1 {v25.S}[1],[x18]
00a45774	st1 {v25.S}[2],[x12]
00a45778	st1 {v25.S}[3],[x3]
00a4577c	eor v25.16B,v9.16B,v25.16B
00a45780	stur q23,[x0, #0x58]
00a45784	eor w14,w1,w14
00a45788	stur q0,[x0, #0x68]
00a4578c	stur q11,[x0, #0x4]
00a45790	eor w10,w5,w10
00a45794	eor w11,w15,w11
00a45798	ldr w15,[x8, #0x1e0]
00a4579c	stp w17,w13,[x0, #0x3c]
00a457a0	str w14,[x0, #0x44]
00a457a4	str w10,[x0]
00a457a8	stur q21,[x0, #0x14]
00a457ac	stp w4,w11,[x0, #0x24]
00a457b0	stur q20,[x0, #0x2c]
00a457b4	st1 {v25.S}[0],[x16]
00a457b8	mov w1,#0x5
00a457bc	ldr w16,[x8, #0x204]
00a457c0	eor w1,w9,w1
00a457c4	and w1,w1,#0xff
00a457c8	sub w1,w1,#0x1
00a457cc	st1 {v25.S}[1],[x18]
00a457d0	asr w1,w1,#0x1f
00a457d4	ldr w18,[x8, #0x21c]
00a457d8	st1 {v25.S}[2],[x12]
00a457dc	eor w16,w16,w4
00a457e0	ldr w12,[x8, #0x220]
00a457e4	st1 {v25.S}[3],[x3]
00a457e8	and w16,w16,w1
00a457ec	ldr w3,[x8, #0x224]
00a457f0	eor w16,w16,w4
00a457f4	ldr w4,[x8, #0x208]
00a457f8	eor v26.16B,v28.16B,v23.16B
00a457fc	eor v28.16B,v13.16B,v0.16B
00a45800	and v26.16B,v26.16B,v24.16B
00a45804	and v24.16B,v28.16B,v24.16B
00a45808	eor v23.16B,v26.16B,v23.16B
00a4580c	eor v0.16B,v24.16B,v0.16B
00a45810	dup v24.4S,w1
00a45814	eor v26.16B,v8.16B,v11.16B
00a45818	eor w15,w15,w10
00a4581c	eor v28.16B,v29.16B,v21.16B
00a45820	and v26.16B,v26.16B,v24.16B
00a45824	eor w18,w18,w17
00a45828	eor w12,w12,w13
00a4582c	eor w3,w3,w14
00a45830	eor w4,w4,w11
00a45834	and w15,w15,w1
00a45838	and v28.16B,v28.16B,v24.16B
00a4583c	eor v26.16B,v26.16B,v11.16B
00a45840	add x5,x0,#0x14
00a45844	and w18,w18,w1
00a45848	and w12,w12,w1
00a4584c	and w3,w3,w1
00a45850	and w1,w4,w1
00a45854	eor w10,w15,w10
00a45858	eor v28.16B,v28.16B,v21.16B
00a4585c	add x4,x0,#0x18
00a45860	eor w14,w3,w14
00a45864	ldr w3,[x8, #0x258]
00a45868	ldr w15,[x8, #0x27c]
00a4586c	eor w11,w1,w11
00a45870	ldr w1,[x8, #0x280]
00a45874	stur q23,[x0, #0x58]
00a45878	stur q0,[x0, #0x68]
00a4587c	str w10,[x0]
00a45880	stur q26,[x0, #0x4]
00a45884	st1 {v28.S}[0],[x5]
00a45888	eor v27.16B,v27.16B,v20.16B
00a4588c	eor w17,w18,w17
00a45890	add x18,x0,#0x1c
00a45894	ldr w5,[x8, #0x294]
00a45898	st1 {v28.S}[1],[x4]
00a4589c	and v27.16B,v27.16B,v24.16B
00a458a0	eor w12,w12,w13
00a458a4	add x13,x0,#0x20
00a458a8	ldr w4,[x8, #0x298]
00a458ac	st1 {v28.S}[2],[x18]
00a458b0	eor v20.16B,v27.16B,v20.16B
00a458b4	eor v27.16B,v30.16B,v25.16B
00a458b8	eor v29.16B,v31.16B,v23.16B
00a458bc	ldr w18,[x8, #0x29c]
00a458c0	st1 {v28.S}[3],[x13]
00a458c4	eor w13,w9,#0x6
00a458c8	and v27.16B,v27.16B,v24.16B
00a458cc	and v29.16B,v29.16B,v24.16B
00a458d0	stp w17,w12,[x0, #0x3c]
00a458d4	str w14,[x0, #0x44]
00a458d8	and w13,w13,#0xff
00a458dc	eor v25.16B,v27.16B,v25.16B
00a458e0	eor v23.16B,v29.16B,v23.16B
00a458e4	ldp q27,q29,[x8, #0x2a0]
00a458e8	sub w13,w13,#0x1
00a458ec	asr w13,w13,#0x1f
00a458f0	eor w15,w15,w16
00a458f4	eor v30.16B,v10.16B,v0.16B
00a458f8	dup v21.4S,w13
00a458fc	eor w5,w5,w17
00a45900	eor w4,w4,w12
00a45904	eor w18,w18,w14
00a45908	eor w3,w3,w10
00a4590c	and w15,w15,w13
00a45910	eor w1,w1,w11
00a45914	and v24.16B,v30.16B,v24.16B
00a45918	str w16,[x0, #0x24]
00a4591c	eor v19.16B,v19.16B,v20.16B
00a45920	and w5,w5,w13
00a45924	and w4,w4,w13
00a45928	and w18,w18,w13
00a4592c	and w3,w3,w13
00a45930	and w13,w1,w13
00a45934	eor w15,w15,w16
00a45938	ldr w16,[x8, #0x2d0]
00a4593c	str w11,[x0, #0x28]
00a45940	eor v0.16B,v24.16B,v0.16B
00a45944	eor v22.16B,v22.16B,v26.16B
00a45948	eor v18.16B,v18.16B,v28.16B
00a4594c	and v19.16B,v19.16B,v21.16B
00a45950	eor v24.16B,v27.16B,v25.16B
00a45954	eor v27.16B,v29.16B,v23.16B
00a45958	eor w1,w5,w17
00a4595c	add x17,x0,#0x60
00a45960	eor w12,w4,w12
00a45964	add x4,x0,#0x58
00a45968	eor w14,w18,w14
00a4596c	add x18,x0,#0x5c
00a45970	eor w10,w3,w10
00a45974	add x3,x0,#0x64
00a45978	eor w11,w13,w11
00a4597c	ldr w13,[x8, #0x2f4]
00a45980	stur q20,[x0, #0x2c]
00a45984	and v22.16B,v22.16B,v21.16B
00a45988	and v18.16B,v18.16B,v21.16B
00a4598c	eor v19.16B,v19.16B,v20.16B
00a45990	and v20.16B,v24.16B,v21.16B
00a45994	and v24.16B,v27.16B,v21.16B
00a45998	stur q25,[x0, #0x48]
00a4599c	st1 {v23.S}[0],[x4]
00a459a0	st1 {v23.S}[1],[x18]
00a459a4	st1 {v23.S}[2],[x17]
00a459a8	st1 {v23.S}[3],[x3]
00a459ac	eor v22.16B,v22.16B,v26.16B
00a459b0	eor v18.16B,v18.16B,v28.16B
00a459b4	eor v20.16B,v20.16B,v25.16B
00a459b8	eor v23.16B,v24.16B,v23.16B
00a459bc	stur q0,[x0, #0x68]
00a459c0	stp w1,w12,[x0, #0x3c]
00a459c4	str w14,[x0, #0x44]
00a459c8	str w10,[x0]
00a459cc	stur q22,[x0, #0x4]
00a459d0	stur q18,[x0, #0x14]
00a459d4	stp w15,w11,[x0, #0x24]
00a459d8	stur q19,[x0, #0x2c]
00a459dc	stur q20,[x0, #0x48]
00a459e0	st1 {v23.S}[0],[x4]
00a459e4	ldr w4,[x8, #0x2f8]
00a459e8	st1 {v23.S}[1],[x18]
00a459ec	ldr w18,[x8, #0x30c]
00a459f0	st1 {v23.S}[2],[x17]
00a459f4	ldr w17,[x8, #0x310]
00a459f8	st1 {v23.S}[3],[x3]
00a459fc	eor w3,w9,#0x7
00a45a00	and w3,w3,#0xff
00a45a04	sub w3,w3,#0x1
00a45a08	asr w3,w3,#0x1f
00a45a0c	eor w13,w13,w15
00a45a10	and w13,w13,w3
00a45a14	eor w13,w13,w15
00a45a18	ldr w15,[x8, #0x314]
00a45a1c	ldr q25,[x8, #0x2c0]
00a45a20	eor w18,w18,w1
00a45a24	eor w17,w17,w12
00a45a28	eor w15,w15,w14
00a45a2c	eor w16,w16,w10
00a45a30	eor w4,w4,w11
00a45a34	dup v24.4S,w3
00a45a38	and w18,w18,w3
00a45a3c	and w17,w17,w3
00a45a40	and w15,w15,w3
00a45a44	and w16,w16,w3
00a45a48	and w3,w4,w3
00a45a4c	eor v25.16B,v25.16B,v0.16B
00a45a50	eor w18,w18,w1
00a45a54	ldr w1,[x8, #0x348]
00a45a58	eor w12,w17,w12
00a45a5c	ldr w17,[x8, #0x36c]
00a45a60	eor w14,w15,w14
00a45a64	ldr w15,[x8, #0x370]
00a45a68	eor w16,w16,w10
00a45a6c	ldr w10,[x8, #0x384]
00a45a70	eor w11,w3,w11
00a45a74	ldr w3,[x8, #0x388]
00a45a78	ldp q26,q27,[x8, #0x390]
00a45a7c	ldr q28,[x8, #0x3b0]
00a45a80	ldr w8,[x8, #0x38c]
00a45a84	eor w9,w9,#0x8
00a45a88	and v21.16B,v25.16B,v21.16B
00a45a8c	and w9,w9,#0xff
00a45a90	eor v0.16B,v21.16B,v0.16B
00a45a94	eor v17.16B,v17.16B,v22.16B
00a45a98	eor v1.16B,v1.16B,v18.16B
00a45a9c	eor v2.16B,v2.16B,v19.16B
00a45aa0	sub w9,w9,#0x1
00a45aa4	and v17.16B,v17.16B,v24.16B
00a45aa8	and v1.16B,v1.16B,v24.16B
00a45aac	and v2.16B,v2.16B,v24.16B
00a45ab0	eor v5.16B,v5.16B,v0.16B
00a45ab4	asr w9,w9,#0x1f
00a45ab8	eor v17.16B,v17.16B,v22.16B
00a45abc	eor v1.16B,v1.16B,v18.16B
00a45ac0	eor v2.16B,v2.16B,v19.16B
00a45ac4	and v5.16B,v5.16B,v24.16B
00a45ac8	dup v29.4S,w9
00a45acc	eor w17,w17,w13
00a45ad0	eor w10,w10,w18
00a45ad4	eor w3,w3,w12
00a45ad8	eor w8,w8,w14
00a45adc	eor w1,w1,w16
00a45ae0	eor w15,w15,w11
00a45ae4	eor v3.16B,v3.16B,v20.16B
00a45ae8	eor v4.16B,v4.16B,v23.16B
00a45aec	stur q0,[x0, #0x68]
00a45af0	eor v5.16B,v5.16B,v0.16B
00a45af4	eor v0.16B,v7.16B,v17.16B
00a45af8	eor v6.16B,v6.16B,v1.16B
00a45afc	eor v7.16B,v16.16B,v2.16B
00a45b00	and w17,w17,w9
00a45b04	and w10,w10,w9
00a45b08	and w3,w3,w9
00a45b0c	and w4,w8,w9
00a45b10	and w1,w1,w9
00a45b14	and w15,w15,w9
00a45b18	and v3.16B,v3.16B,v24.16B
00a45b1c	and v4.16B,v4.16B,v24.16B
00a45b20	and v0.16B,v0.16B,v29.16B
00a45b24	and v6.16B,v6.16B,v29.16B
00a45b28	and v7.16B,v7.16B,v29.16B
00a45b2c	eor w8,w10,w18
00a45b30	str w18,[x0, #0x3c]
00a45b34	eor v3.16B,v3.16B,v20.16B
00a45b38	eor v4.16B,v4.16B,v23.16B
00a45b3c	eor v0.16B,v0.16B,v17.16B
00a45b40	stp w12,w14,[x0, #0x40]
00a45b44	eor w10,w3,w12
00a45b48	add x12,x0,#0x2c
00a45b4c	eor w9,w4,w14
00a45b50	add x14,x0,#0x70
00a45b54	str w16,[x0]
00a45b58	eor w16,w1,w16
00a45b5c	add x18,x0,#0x68
00a45b60	eor w17,w17,w13
00a45b64	stp w13,w11,[x0, #0x24]
00a45b68	add x13,x0,#0x6c
00a45b6c	eor w11,w15,w11
00a45b70	add x15,x0,#0x74
00a45b74	stur q1,[x0, #0x14]
00a45b78	stur q2,[x0, #0x2c]
00a45b7c	eor v1.16B,v6.16B,v1.16B
00a45b80	eor v2.16B,v7.16B,v2.16B
00a45b84	stur q17,[x0, #0x4]
00a45b88	stur q3,[x0, #0x48]
00a45b8c	stur q4,[x0, #0x58]
00a45b90	st1 {v5.S}[0],[x18]
00a45b94	st1 {v5.S}[1],[x13]
00a45b98	st1 {v5.S}[2],[x14]
00a45b9c	st1 {v5.S}[3],[x15]
00a45ba0	str w16,[x0]
00a45ba4	stur q0,[x0, #0x4]
00a45ba8	stur q1,[x0, #0x14]
00a45bac	stp w17,w11,[x0, #0x24]
00a45bb0	st1 {v2.S}[0],[x12]
00a45bb4	add x12,x0,#0x30
00a45bb8	st1 {v2.S}[1],[x12]
00a45bbc	add x12,x0,#0x34
00a45bc0	eor v6.16B,v26.16B,v3.16B
00a45bc4	eor v7.16B,v27.16B,v4.16B
00a45bc8	eor v16.16B,v28.16B,v5.16B
00a45bcc	st1 {v2.S}[2],[x12]
00a45bd0	add x12,x0,#0x38
00a45bd4	and v6.16B,v6.16B,v29.16B
00a45bd8	and v7.16B,v7.16B,v29.16B
00a45bdc	and v16.16B,v16.16B,v29.16B
00a45be0	st1 {v2.S}[3],[x12]
00a45be4	eor v3.16B,v6.16B,v3.16B
00a45be8	eor v4.16B,v7.16B,v4.16B
00a45bec	eor v5.16B,v16.16B,v5.16B
00a45bf0	and w12,w2,#0x80
00a45bf4	stp w8,w10,[x0, #0x3c]
00a45bf8	str w9,[x0, #0x44]
00a45bfc	stur q3,[x0, #0x48]
00a45c00	stur q4,[x0, #0x58]
00a45c04	st1 {v5.S}[0],[x18]
00a45c08	st1 {v5.S}[1],[x13]
00a45c0c	neg w12,w12, LSR #0x7
00a45c10	eor w13,w11,w16
00a45c14	and w13,w13,w12
00a45c18	st1 {v5.S}[2],[x14]
00a45c1c	st1 {v5.S}[3],[x15]
00a45c20	eor w11,w13,w11
00a45c24	str w11,[x0, #0x28]
00a45c28	mov w11,v3.S[0x1]
00a45c2c	ldr d6,[x0, #0x20]
00a45c30	eor w11,w11,w17
00a45c34	eor w14,w13,w16
00a45c38	mov w13,v3.S[0x2]
00a45c3c	and w11,w11,w12
00a45c40	eor w11,w11,w17
00a45c44	neg w13,w13
00a45c48	neg v17.4S,v4.4S
00a45c4c	ldur d19,[x0, #0x2c]
00a45c50	str w14,[x0]
00a45c54	str w11,[x0, #0x24]
00a45c58	ldp w11,w14,[x0, #0x14]
00a45c5c	mov v6.S[0x2],w13
00a45c60	ldr w13,[x0, #0x1c]
00a45c64	dup v7.4S,w12
00a45c68	eor v17.16B,v4.16B,v17.16B
00a45c6c	and v17.16B,v17.16B,v7.16B
00a45c70	eor v4.16B,v17.16B,v4.16B
00a45c74	ldur q17,[x0, #0x4]
00a45c78	stur q4,[x0, #0x58]
00a45c7c	ext v4.16B,v2.16B,v19.16B,0x8
00a45c80	eor w11,w11,w8
00a45c84	eor w14,w14,w10
00a45c88	eor w13,w13,w9
00a45c8c	fmov s16,w8
00a45c90	ext v4.16B,v4.16B,v4.16B,0x8
00a45c94	and w11,w11,w12
00a45c98	and w14,w14,w12
00a45c9c	and w12,w13,w12
00a45ca0	mov w13,v3.S[0x3]
00a45ca4	mov v16.S[0x1],w10
00a45ca8	eor v4.16B,v4.16B,v0.16B
00a45cac	neg w13,w13
00a45cb0	mov v16.S[0x2],w9
00a45cb4	eor v17.16B,v17.16B,v2.16B
00a45cb8	and v4.16B,v4.16B,v7.16B
00a45cbc	mov v6.S[0x3],w13
00a45cc0	neg v18.4S,v5.4S
00a45cc4	and v17.16B,v17.16B,v7.16B
00a45cc8	eor v0.16B,v4.16B,v0.16B
00a45ccc	mov v16.S[0x3],v3.S[0x0]
00a45cd0	eor v18.16B,v5.16B,v18.16B
00a45cd4	eor v2.16B,v17.16B,v2.16B
00a45cd8	eor v6.16B,v6.16B,v3.16B
00a45cdc	stur q0,[x0, #0x4]
00a45ce0	eor v0.16B,v16.16B,v1.16B
00a45ce4	eor w11,w11,w8
00a45ce8	eor w8,w14,w10
00a45cec	and v18.16B,v18.16B,v7.16B
00a45cf0	stur q2,[x0, #0x2c]
00a45cf4	and v2.16B,v6.16B,v7.16B
00a45cf8	and v0.16B,v0.16B,v7.16B
00a45cfc	stp w11,w8,[x0, #0x3c]
00a45d00	eor w8,w12,w9
00a45d04	eor v5.16B,v18.16B,v5.16B
00a45d08	eor v2.16B,v2.16B,v3.16B
00a45d0c	eor v0.16B,v0.16B,v1.16B
00a45d10	str w8,[x0, #0x44]
00a45d14	stur q2,[x0, #0x48]
00a45d18	stur q0,[x0, #0x14]
00a45d1c	stur q5,[x0, #0x68]
00a45d20	ldp d9,d8,[sp, #0x30]
00a45d24	ldp d11,d10,[sp, #0x20]
00a45d28	ldp d13,d12,[sp, #0x10]
00a45d2c	ldp d15,d14,[sp], #0x40
00a45d30	ret
