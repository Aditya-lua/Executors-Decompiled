; ossl_ed25519_verify @ 00a40090
00a40090	stp x28,x27,[sp, #-0x60]!
00a40094	stp x26,x25,[sp, #0x10]
00a40098	stp x24,x23,[sp, #0x20]
00a4009c	stp x22,x21,[sp, #0x30]
00a400a0	stp x20,x19,[sp, #0x40]
00a400a4	stp x29,x30,[sp, #0x50]
00a400a8	add x29,sp,#0x50
00a400ac	sub sp,sp,#0xb30
00a400b0	ldrb w8,[x2, #0x3f]
00a400b4	mov w25,wzr
00a400b8	cmp w8,#0x10
00a400bc	b.hi 0x00a422d4
00a400c0	mov x24,x5
00a400c4	mov x26,x4
00a400c8	mov x23,x3
00a400cc	mov x19,x2
00a400d0	mov x20,x1
00a400d4	mov x21,x0
00a400d8	add x22,x2,#0x20
00a400dc	b.ne 0x00a40108
00a400e0	adrp x1,0x758000
00a400e4	add x0,x19,#0x30
00a400e8	add x1,x1,#0xbf8
00a400ec	orr w2,wzr,#0xf
00a400f0	bl 0x00c300b0
00a400f4	mov w25,wzr
00a400f8	cbnz w0,0x00a422d4
00a400fc	ldrb w8,[x19, #0x2f]
00a40100	cmp w8,#0x14
00a40104	b.cs 0x00a422f8
00a40108	stp x21,x20,[sp, #0x10]
00a4010c	ldrb w9,[x23]
00a40110	ldrb w17,[x23, #0x1]
00a40114	ldrb w12,[x23, #0x7]
00a40118	ldrb w0,[x23, #0x8]
00a4011c	ldrb w15,[x23, #0xd]
00a40120	ldrb w6,[x23, #0xe]
00a40124	ldrb w11,[x23, #0x4]
00a40128	ldrb w18,[x23, #0x5]
00a4012c	ldrb w13,[x23, #0xa]
00a40130	ldrb w1,[x23, #0xb]
00a40134	ldrb w4,[x23, #0x9]
00a40138	ldrb w5,[x23, #0xc]
00a4013c	ldrb w14,[x23, #0x10]
00a40140	ldrb w7,[x23, #0x11]
00a40144	bfm x9,x17,#0x38,#0x7
00a40148	ldrb w17,[x23, #0x17]
00a4014c	bfm x12,x0,#0x38,#0x7
00a40150	ldrb w20,[x23, #0x18]
00a40154	bfm x15,x6,#0x38,#0x7
00a40158	ldrb w6,[x23, #0x1e]
00a4015c	ldrb w0,[x23, #0x1d]
00a40160	str x19,[sp, #0x20]
00a40164	ldrb w16,[x23, #0x14]
00a40168	ldrb w19,[x23, #0x15]
00a4016c	bfm x11,x18,#0x38,#0x7
00a40170	bfm x13,x1,#0x38,#0x7
00a40174	ldrb w18,[x23, #0x1a]
00a40178	ldrb w1,[x23, #0x1b]
00a4017c	ldrb w2,[x23, #0x2]
00a40180	ldrb w3,[x23, #0x6]
00a40184	bfm x14,x7,#0x38,#0x7
00a40188	bfm x17,x20,#0x38,#0x7
00a4018c	ldrb w7,[x23, #0xf]
00a40190	bfm w0,w6,#0x18,#0x7
00a40194	ldrb w6,[x23, #0x16]
00a40198	ldrb w20,[x23, #0x19]
00a4019c	bfm x12,x4,#0x30,#0x7
00a401a0	ldrb w4,[x23, #0x1c]
00a401a4	bfm x13,x5,#0x30,#0x7
00a401a8	ldrb w5,[x23, #0x1f]
00a401ac	ldrb w10,[x23, #0x3]
00a401b0	bfm x16,x19,#0x38,#0x7
00a401b4	ldrb w19,[x23, #0x12]
00a401b8	bfm x18,x1,#0x38,#0x7
00a401bc	ldrb w1,[x23, #0x13]
00a401c0	bfm x9,x2,#0x30,#0x7
00a401c4	bfm x11,x3,#0x30,#0x7
00a401c8	bfm x15,x7,#0x30,#0x7
00a401cc	bfm x16,x6,#0x30,#0x7
00a401d0	bfm x17,x20,#0x30,#0x7
00a401d4	bfm x18,x4,#0x30,#0x7
00a401d8	bfm w0,w5,#0x10,#0xf
00a401dc	mov w3,#0x1000000
00a401e0	bfm x14,x19,#0x30,#0x7
00a401e4	bfm x9,x10,#0x28,#0x7
00a401e8	lsl x10,x11,#0x6
00a401ec	lsl x11,x12,#0x5
00a401f0	lsl x12,x13,#0x3
00a401f4	lsl x13,x15,#0x2
00a401f8	lsl x15,x16,#0x7
00a401fc	lsl x16,x17,#0x5
00a40200	lsl x17,x18,#0x4
00a40204	lsl w18,w0,#0x2
00a40208	bfm x14,x1,#0x28,#0x7
00a4020c	and x18,x18,#0x1fffffc
00a40210	add x0,x10,x3
00a40214	add x19,x12,x3
00a40218	add x4,x14,x3
00a4021c	add x5,x16,x3
00a40220	add x3,x18,x3
00a40224	add x11,x11,x0, LSR #0x19
00a40228	and w0,w0,#0xfe000000
00a4022c	mov w2,#0x13
00a40230	mov w6,#0x2000000
00a40234	sub w10,w10,w0
00a40238	lsr x0,x3,#0x19
00a4023c	madd x9,x0,x2,x9
00a40240	add x0,x11,x6
00a40244	add x13,x13,x19, LSR #0x19
00a40248	lsr x2,x0,#0x1a
00a4024c	add w12,w2,w12
00a40250	add x2,x13,x6
00a40254	and w0,w0,#0xfc000000
00a40258	add x15,x15,x4, LSR #0x19
00a4025c	sub w11,w11,w0
00a40260	lsr x0,x2,#0x1a
00a40264	add w14,w0,w14
00a40268	add x0,x15,x6
00a4026c	and w2,w2,#0xfc000000
00a40270	add x17,x17,x5, LSR #0x19
00a40274	sub w13,w13,w2
00a40278	lsr x2,x0,#0x1a
00a4027c	add w16,w2,w16
00a40280	add x2,x17,x6
00a40284	and w0,w0,#0xfc000000
00a40288	add x8,sp,#0x180
00a4028c	sub w15,w15,w0
00a40290	lsr x0,x2,#0x1a
00a40294	add w18,w18,w0
00a40298	add x1,x8,#0x28
00a4029c	add x8,x8,#0x50
00a402a0	and w0,w4,#0xfe000000
00a402a4	and w2,w2,#0xfc000000
00a402a8	add x4,x9,x6
00a402ac	str x8,[sp, #0x8]
00a402b0	and w8,w19,#0xfe000000
00a402b4	and w5,w5,#0xfe000000
00a402b8	and w3,w3,#0x2000000
00a402bc	sub w17,w17,w2
00a402c0	lsr x2,x4,#0x1a
00a402c4	and w4,w4,#0xfc000000
00a402c8	add x21,sp,#0x100
00a402cc	mov w7,#0x1
00a402d0	sub w8,w12,w8
00a402d4	sub w12,w14,w0
00a402d8	sub w14,w16,w5
00a402dc	sub w16,w18,w3
00a402e0	add w10,w10,w2
00a402e4	sub w9,w9,w4
00a402e8	add x0,sp,#0x380
00a402ec	str w9,[sp, #0x1a8]
00a402f0	str w10,[sp, #0x1ac]
00a402f4	str w11,[sp, #0x1b0]
00a402f8	str w8,[sp, #0x1b4]
00a402fc	str w13,[sp, #0x1b8]
00a40300	str w12,[sp, #0x1bc]
00a40304	str w15,[sp, #0x1c0]
00a40308	str w14,[sp, #0x1c4]
00a4030c	str w17,[sp, #0x1c8]
00a40310	str w16,[sp, #0x1cc]
00a40314	stur xzr,[x21, #0xec]
00a40318	stur xzr,[x21, #0xe4]
00a4031c	stur xzr,[x21, #0xdc]
00a40320	stur xzr,[x21, #0xd4]
00a40324	str wzr,[sp, #0x1f4]
00a40328	str w7,[sp, #0x1d0]
00a4032c	str x1,[sp, #0x28]
00a40330	bl 0x00a46500
00a40334	adrp x2,0x760000
00a40338	add x2,x2,#0x428
00a4033c	add x0,sp,#0x2e0
00a40340	add x1,sp,#0x380
00a40344	bl 0x00a44e38
00a40348	ldp q0,q1,[sp, #0x1d0]
00a4034c	ldr w8,[sp, #0x380]
00a40350	ldr q2,[sp, #0x2e0]
00a40354	ldr w12,[sp, #0x300]
00a40358	fmov w9,s0
00a4035c	sub w20,w8,w9
00a40360	ldr w8,[sp, #0x384]
00a40364	mov w9,v0.S[0x1]
00a40368	fmov w11,s1
00a4036c	mov w10,v1.S[0x2]
00a40370	sub w21,w8,w9
00a40374	ldr w8,[sp, #0x388]
00a40378	mov w9,v0.S[0x2]
00a4037c	add x0,sp,#0x240
00a40380	add x1,sp,#0x2e0
00a40384	sub w25,w8,w9
00a40388	ldr w8,[sp, #0x38c]
00a4038c	mov w9,v0.S[0x3]
00a40390	add v0.4S,v2.4S,v0.4S
00a40394	str q0,[sp, #0x2e0]
00a40398	sub w27,w8,w9
00a4039c	ldr w8,[sp, #0x390]
00a403a0	mov w9,v1.S[0x1]
00a403a4	ldr q0,[sp, #0x2f0]
00a403a8	str w20,[sp, #0x380]
00a403ac	sub w28,w8,w11
00a403b0	ldr w8,[sp, #0x394]
00a403b4	ldr w11,[sp, #0x1f0]
00a403b8	add v0.4S,v0.4S,v1.4S
00a403bc	str w21,[sp, #0x384]
00a403c0	sub w8,w8,w9
00a403c4	str w8,[sp, #0x90]
00a403c8	str w8,[sp, #0x394]
00a403cc	ldr w8,[sp, #0x398]
00a403d0	mov w9,v1.S[0x3]
00a403d4	str w25,[sp, #0x388]
00a403d8	str w27,[sp, #0x38c]
00a403dc	sub w8,w8,w10
00a403e0	str w8,[sp, #0x88]
00a403e4	str w8,[sp, #0x398]
00a403e8	ldr w8,[sp, #0x39c]
00a403ec	ldr w10,[sp, #0x1f4]
00a403f0	str w28,[sp, #0x390]
00a403f4	str q0,[sp, #0x2f0]
00a403f8	sub w8,w8,w9
00a403fc	str w8,[sp, #0x84]
00a40400	str w8,[sp, #0x39c]
00a40404	ldr w8,[sp, #0x3a0]
00a40408	add w9,w12,w11
00a4040c	str w9,[sp, #0x300]
00a40410	ldr w9,[sp, #0x304]
00a40414	sub w8,w8,w11
00a40418	str w8,[sp, #0x80]
00a4041c	str w8,[sp, #0x3a0]
00a40420	ldr w8,[sp, #0x3a4]
00a40424	add w9,w9,w10
00a40428	str w9,[sp, #0x304]
00a4042c	sub w8,w8,w10
00a40430	str w8,[sp, #0x7c]
00a40434	str w8,[sp, #0x3a4]
00a40438	bl 0x00a46500
00a4043c	add x0,sp,#0x240
00a40440	add x1,sp,#0x240
00a40444	add x2,sp,#0x2e0
00a40448	bl 0x00a44e38
00a4044c	add x0,sp,#0x180
00a40450	add x1,sp,#0x240
00a40454	bl 0x00a46500
00a40458	add x0,sp,#0x180
00a4045c	add x1,sp,#0x180
00a40460	add x2,sp,#0x2e0
00a40464	bl 0x00a44e38
00a40468	add x0,sp,#0x180
00a4046c	add x1,sp,#0x180
00a40470	add x2,sp,#0x380
00a40474	bl 0x00a44e38
00a40478	add x0,sp,#0x420
00a4047c	add x1,sp,#0x180
00a40480	bl 0x00a46500
00a40484	add x0,sp,#0xa20
00a40488	add x1,sp,#0x420
00a4048c	bl 0x00a46500
00a40490	add x0,sp,#0xa20
00a40494	add x1,sp,#0xa20
00a40498	bl 0x00a46500
00a4049c	add x0,sp,#0xa20
00a404a0	add x1,sp,#0x180
00a404a4	add x2,sp,#0xa20
00a404a8	bl 0x00a44e38
00a404ac	add x0,sp,#0x420
00a404b0	add x1,sp,#0x420
00a404b4	add x2,sp,#0xa20
00a404b8	bl 0x00a44e38
00a404bc	add x0,sp,#0x420
00a404c0	add x1,sp,#0x420
00a404c4	bl 0x00a46500
00a404c8	add x0,sp,#0x420
00a404cc	add x1,sp,#0xa20
00a404d0	add x2,sp,#0x420
00a404d4	bl 0x00a44e38
00a404d8	add x0,sp,#0xa20
00a404dc	add x1,sp,#0x420
00a404e0	bl 0x00a46500
00a404e4	add x0,sp,#0xa20
00a404e8	add x1,sp,#0xa20
00a404ec	bl 0x00a46500
00a404f0	add x0,sp,#0xa20
00a404f4	add x1,sp,#0xa20
00a404f8	bl 0x00a46500
00a404fc	add x0,sp,#0xa20
00a40500	add x1,sp,#0xa20
00a40504	bl 0x00a46500
00a40508	add x0,sp,#0xa20
00a4050c	add x1,sp,#0xa20
00a40510	bl 0x00a46500
00a40514	add x0,sp,#0x420
00a40518	add x1,sp,#0xa20
00a4051c	add x2,sp,#0x420
00a40520	bl 0x00a44e38
00a40524	add x0,sp,#0xa20
00a40528	add x1,sp,#0x420
00a4052c	bl 0x00a46500
00a40530	add x0,sp,#0xa20
00a40534	add x1,sp,#0xa20
00a40538	bl 0x00a46500
00a4053c	add x0,sp,#0xa20
00a40540	add x1,sp,#0xa20
00a40544	bl 0x00a46500
00a40548	add x0,sp,#0xa20
00a4054c	add x1,sp,#0xa20
00a40550	bl 0x00a46500
00a40554	add x0,sp,#0xa20
00a40558	add x1,sp,#0xa20
00a4055c	bl 0x00a46500
00a40560	add x0,sp,#0xa20
00a40564	add x1,sp,#0xa20
00a40568	bl 0x00a46500
00a4056c	add x0,sp,#0xa20
00a40570	add x1,sp,#0xa20
00a40574	bl 0x00a46500
00a40578	add x0,sp,#0xa20
00a4057c	add x1,sp,#0xa20
00a40580	bl 0x00a46500
00a40584	add x0,sp,#0xa20
00a40588	add x1,sp,#0xa20
00a4058c	bl 0x00a46500
00a40590	add x0,sp,#0xa20
00a40594	add x1,sp,#0xa20
00a40598	bl 0x00a46500
00a4059c	add x0,sp,#0xa20
00a405a0	add x1,sp,#0xa20
00a405a4	add x2,sp,#0x420
00a405a8	bl 0x00a44e38
00a405ac	add x0,sp,#0x920
00a405b0	add x1,sp,#0xa20
00a405b4	bl 0x00a46500
00a405b8	add x0,sp,#0x920
00a405bc	add x1,sp,#0x920
00a405c0	bl 0x00a46500
00a405c4	add x0,sp,#0x920
00a405c8	add x1,sp,#0x920
00a405cc	bl 0x00a46500
00a405d0	add x0,sp,#0x920
00a405d4	add x1,sp,#0x920
00a405d8	bl 0x00a46500
00a405dc	add x0,sp,#0x920
00a405e0	add x1,sp,#0x920
00a405e4	bl 0x00a46500
00a405e8	add x0,sp,#0x920
00a405ec	add x1,sp,#0x920
00a405f0	bl 0x00a46500
00a405f4	add x0,sp,#0x920
00a405f8	add x1,sp,#0x920
00a405fc	bl 0x00a46500
00a40600	add x0,sp,#0x920
00a40604	add x1,sp,#0x920
00a40608	bl 0x00a46500
00a4060c	add x0,sp,#0x920
00a40610	add x1,sp,#0x920
00a40614	bl 0x00a46500
00a40618	add x0,sp,#0x920
00a4061c	add x1,sp,#0x920
00a40620	bl 0x00a46500
00a40624	add x0,sp,#0x920
00a40628	add x1,sp,#0x920
00a4062c	bl 0x00a46500
00a40630	add x0,sp,#0x920
00a40634	add x1,sp,#0x920
00a40638	bl 0x00a46500
00a4063c	add x0,sp,#0x920
00a40640	add x1,sp,#0x920
00a40644	bl 0x00a46500
00a40648	add x0,sp,#0x920
00a4064c	add x1,sp,#0x920
00a40650	bl 0x00a46500
00a40654	add x0,sp,#0x920
00a40658	add x1,sp,#0x920
00a4065c	bl 0x00a46500
00a40660	add x0,sp,#0x920
00a40664	add x1,sp,#0x920
00a40668	bl 0x00a46500
00a4066c	add x0,sp,#0x920
00a40670	add x1,sp,#0x920
00a40674	bl 0x00a46500
00a40678	add x0,sp,#0x920
00a4067c	add x1,sp,#0x920
00a40680	bl 0x00a46500
00a40684	add x0,sp,#0x920
00a40688	add x1,sp,#0x920
00a4068c	bl 0x00a46500
00a40690	add x0,sp,#0x920
00a40694	add x1,sp,#0x920
00a40698	bl 0x00a46500
00a4069c	add x0,sp,#0xa20
00a406a0	add x1,sp,#0x920
00a406a4	add x2,sp,#0xa20
00a406a8	bl 0x00a44e38
00a406ac	add x0,sp,#0xa20
00a406b0	add x1,sp,#0xa20
00a406b4	bl 0x00a46500
00a406b8	add x0,sp,#0xa20
00a406bc	add x1,sp,#0xa20
00a406c0	bl 0x00a46500
00a406c4	add x0,sp,#0xa20
00a406c8	add x1,sp,#0xa20
00a406cc	bl 0x00a46500
00a406d0	add x0,sp,#0xa20
00a406d4	add x1,sp,#0xa20
00a406d8	bl 0x00a46500
00a406dc	add x0,sp,#0xa20
00a406e0	add x1,sp,#0xa20
00a406e4	bl 0x00a46500
00a406e8	add x0,sp,#0xa20
00a406ec	add x1,sp,#0xa20
00a406f0	bl 0x00a46500
00a406f4	add x0,sp,#0xa20
00a406f8	add x1,sp,#0xa20
00a406fc	bl 0x00a46500
00a40700	add x0,sp,#0xa20
00a40704	add x1,sp,#0xa20
00a40708	bl 0x00a46500
00a4070c	add x0,sp,#0xa20
00a40710	add x1,sp,#0xa20
00a40714	bl 0x00a46500
00a40718	add x0,sp,#0xa20
00a4071c	add x1,sp,#0xa20
00a40720	bl 0x00a46500
00a40724	add x0,sp,#0x420
00a40728	add x1,sp,#0xa20
00a4072c	add x2,sp,#0x420
00a40730	bl 0x00a44e38
00a40734	add x0,sp,#0xa20
00a40738	add x1,sp,#0x420
00a4073c	bl 0x00a46500
00a40740	mov w19,#0x31
00a40744	add x0,sp,#0xa20
00a40748	add x1,sp,#0xa20
00a4074c	bl 0x00a46500
00a40750	subs w19,w19,#0x1
00a40754	b.ne 0x00a40744
00a40758	add x0,sp,#0xa20
00a4075c	add x1,sp,#0xa20
00a40760	add x2,sp,#0x420
00a40764	bl 0x00a44e38
00a40768	add x0,sp,#0x920
00a4076c	add x1,sp,#0xa20
00a40770	bl 0x00a46500
00a40774	mov w19,#0x63
00a40778	add x0,sp,#0x920
00a4077c	add x1,sp,#0x920
00a40780	bl 0x00a46500
00a40784	subs w19,w19,#0x1
00a40788	b.ne 0x00a40778
00a4078c	add x0,sp,#0xa20
00a40790	add x1,sp,#0x920
00a40794	add x2,sp,#0xa20
00a40798	str w28,[sp, #0x98]
00a4079c	str w27,[sp, #0xa0]
00a407a0	str w25,[sp, #0xa8]
00a407a4	str w21,[sp, #0xb0]
00a407a8	str w20,[sp, #0xb8]
00a407ac	stp x26,x24,[sp, #0x30]
00a407b0	stp x23,x22,[sp, #0x40]
00a407b4	bl 0x00a44e38
00a407b8	add x0,sp,#0xa20
00a407bc	add x1,sp,#0xa20
00a407c0	bl 0x00a46500
00a407c4	mov w19,#0x31
00a407c8	add x0,sp,#0xa20
00a407cc	add x1,sp,#0xa20
00a407d0	bl 0x00a46500
00a407d4	subs w19,w19,#0x1
00a407d8	b.ne 0x00a407c8
00a407dc	add x0,sp,#0x420
00a407e0	add x1,sp,#0xa20
00a407e4	add x2,sp,#0x420
00a407e8	bl 0x00a44e38
00a407ec	add x0,sp,#0x420
00a407f0	add x1,sp,#0x420
00a407f4	bl 0x00a46500
00a407f8	add x0,sp,#0x420
00a407fc	add x1,sp,#0x420
00a40800	bl 0x00a46500
00a40804	add x0,sp,#0x180
00a40808	add x1,sp,#0x420
00a4080c	add x2,sp,#0x180
00a40810	bl 0x00a44e38
00a40814	add x0,sp,#0x180
00a40818	add x1,sp,#0x180
00a4081c	add x2,sp,#0x240
00a40820	bl 0x00a44e38
00a40824	add x0,sp,#0x180
00a40828	add x1,sp,#0x180
00a4082c	add x2,sp,#0x380
00a40830	bl 0x00a44e38
00a40834	add x0,sp,#0x100
00a40838	add x1,sp,#0x180
00a4083c	bl 0x00a46500
00a40840	add x0,sp,#0x100
00a40844	add x1,sp,#0x100
00a40848	add x2,sp,#0x2e0
00a4084c	bl 0x00a44e38
00a40850	ldr w8,[sp, #0x100]
00a40854	ldr w9,[sp, #0x104]
00a40858	ldr w27,[sp, #0xb8]
00a4085c	ldr w28,[sp, #0xb0]
00a40860	ldr w10,[sp, #0x108]
00a40864	ldr w25,[sp, #0xa8]
00a40868	ldr w11,[sp, #0x10c]
00a4086c	ldr w22,[sp, #0xa0]
00a40870	ldr w12,[sp, #0x110]
00a40874	stp w9,w8,[sp, #0x74]
00a40878	sub w8,w8,w27
00a4087c	ldr w23,[sp, #0x98]
00a40880	ldr w13,[sp, #0x114]
00a40884	str w8,[sp, #0xc0]
00a40888	sub w8,w9,w28
00a4088c	ldr w19,[sp, #0x90]
00a40890	ldr w14,[sp, #0x118]
00a40894	str w8,[sp, #0xc4]
00a40898	sub w8,w10,w25
00a4089c	ldp w21,w20,[sp, #0x84]
00a408a0	ldr w15,[sp, #0x11c]
00a408a4	str w8,[sp, #0xc8]
00a408a8	sub w8,w11,w22
00a408ac	ldr w16,[sp, #0x120]
00a408b0	str w8,[sp, #0xcc]
00a408b4	sub w8,w12,w23
00a408b8	ldp w24,w26,[sp, #0x7c]
00a408bc	ldr w17,[sp, #0x124]
00a408c0	str w8,[sp, #0xd0]
00a408c4	sub w8,w13,w19
00a408c8	str w8,[sp, #0xd4]
00a408cc	sub w8,w14,w20
00a408d0	str w8,[sp, #0xd8]
00a408d4	sub w8,w15,w21
00a408d8	str w8,[sp, #0xdc]
00a408dc	sub w8,w16,w26
00a408e0	str w8,[sp, #0xe0]
00a408e4	sub w8,w17,w24
00a408e8	add x0,sp,#0x220
00a408ec	add x1,sp,#0xc0
00a408f0	stp w11,w10,[sp, #0x6c]
00a408f4	stp w13,w12,[sp, #0x64]
00a408f8	stp w15,w14,[sp, #0x5c]
00a408fc	stp w17,w16,[sp, #0x54]
00a40900	str w8,[sp, #0xe4]
00a40904	bl 0x00a45158
00a40908	adrp x1,0x760000
00a4090c	add x1,x1,#0x478
00a40910	add x0,sp,#0x220
00a40914	mov w2,#0x20
00a40918	bl 0x00c362f0
00a4091c	cbz w0,0x00a409a8
00a40920	ldp w9,w8,[sp, #0x74]
00a40924	ldp w11,w10,[sp, #0x6c]
00a40928	ldp w13,w12,[sp, #0x64]
00a4092c	ldp w15,w14,[sp, #0x5c]
00a40930	ldp w17,w16,[sp, #0x54]
00a40934	add w8,w8,w27
00a40938	add w9,w9,w28
00a4093c	add w10,w10,w25
00a40940	add w11,w11,w22
00a40944	add w12,w12,w23
00a40948	add w13,w13,w19
00a4094c	add w14,w14,w20
00a40950	add w15,w15,w21
00a40954	add w16,w16,w26
00a40958	add w17,w17,w24
00a4095c	add x0,sp,#0x220
00a40960	add x1,sp,#0xc0
00a40964	stp w8,w9,[sp, #0xc0]
00a40968	stp w10,w11,[sp, #0xc8]
00a4096c	stp w12,w13,[sp, #0xd0]
00a40970	stp w14,w15,[sp, #0xd8]
00a40974	stp w16,w17,[sp, #0xe0]
00a40978	bl 0x00a45158
00a4097c	adrp x1,0x760000
00a40980	add x1,x1,#0x478
00a40984	add x0,sp,#0x220
00a40988	mov w2,#0x20
00a4098c	bl 0x00c362f0
00a40990	cbnz w0,0x00a422b8
00a40994	adrp x2,0x760000
00a40998	add x2,x2,#0x450
00a4099c	add x0,sp,#0x180
00a409a0	add x1,sp,#0x180
00a409a4	bl 0x00a44e38
00a409a8	add x0,sp,#0x220
00a409ac	add x1,sp,#0x180
00a409b0	add x19,sp,#0x180
00a409b4	bl 0x00a45158
00a409b8	ldr x23,[sp, #0x40]
00a409bc	ldrb w8,[sp, #0x220]
00a409c0	ldrb w9,[x23, #0x1f]
00a409c4	and w8,w8,#0x1
00a409c8	cmp w8,w9, LSR #0x7
00a409cc	b.eq 0x00a40a00
00a409d0	ldr q0,[sp, #0x180]
00a409d4	ldr w8,[sp, #0x1a0]
00a409d8	neg v0.4S,v0.4S
00a409dc	neg w8,w8
00a409e0	str q0,[sp, #0x180]
00a409e4	ldr q0,[sp, #0x190]
00a409e8	str w8,[sp, #0x1a0]
00a409ec	ldr w8,[sp, #0x1a4]
00a409f0	neg v0.4S,v0.4S
00a409f4	str q0,[sp, #0x190]
00a409f8	neg w8,w8
00a409fc	str w8,[sp, #0x1a4]
00a40a00	ldr x24,[sp, #0x28]
00a40a04	add x26,x19,#0x78
00a40a08	add x1,sp,#0x180
00a40a0c	mov x0,x26
00a40a10	mov x2,x24
00a40a14	bl 0x00a44e38
00a40a18	ldr w8,[sp, #0x180]
00a40a1c	add x20,sp,#0x100
00a40a20	ldp x0,x2,[sp, #0x30]
00a40a24	adrp x1,0x2b7000
00a40a28	neg w8,w8
00a40a2c	str w8,[sp, #0x180]
00a40a30	ldr w8,[sp, #0x184]
00a40a34	add x1,x1,#0x998
00a40a38	neg w8,w8
00a40a3c	str w8,[sp, #0x184]
00a40a40	ldr w8,[sp, #0x188]
00a40a44	neg w8,w8
00a40a48	str w8,[sp, #0x188]
00a40a4c	ldr w8,[sp, #0x18c]
00a40a50	neg w8,w8
00a40a54	str w8,[sp, #0x18c]
00a40a58	ldr w8,[sp, #0x190]
00a40a5c	neg w8,w8
00a40a60	str w8,[sp, #0x190]
00a40a64	ldr w8,[sp, #0x194]
00a40a68	neg w8,w8
00a40a6c	str w8,[sp, #0x194]
00a40a70	ldr w8,[sp, #0x198]
00a40a74	neg w8,w8
00a40a78	str w8,[sp, #0x198]
00a40a7c	ldr w8,[sp, #0x19c]
00a40a80	neg w8,w8
00a40a84	str w8,[sp, #0x19c]
00a40a88	ldr w8,[sp, #0x1a0]
00a40a8c	neg w8,w8
00a40a90	str w8,[sp, #0x1a0]
00a40a94	ldr w8,[sp, #0x1a4]
00a40a98	neg w8,w8
00a40a9c	str w8,[sp, #0x1a4]
00a40aa0	ldur q0,[x20, #0xf8]
00a40aa4	add x8,sp,#0x180
00a40aa8	neg v0.4S,v0.4S
00a40aac	stur q0,[x20, #0xf8]
00a40ab0	ldur q0,[x8, #0x88]
00a40ab4	neg v0.4S,v0.4S
00a40ab8	stur q0,[x8, #0x88]
00a40abc	ldr w8,[sp, #0x218]
00a40ac0	neg w8,w8
00a40ac4	str w8,[sp, #0x218]
00a40ac8	ldr w8,[sp, #0x21c]
00a40acc	neg w8,w8
00a40ad0	str w8,[sp, #0x21c]
00a40ad4	bl 0x00c357f0
00a40ad8	ldr x22,[sp, #0x48]
00a40adc	cbz x0,0x00a422b8
00a40ae0	mov x21,x0
00a40ae4	bl 0x00c31fa0
00a40ae8	mov x27,x0
00a40aec	cbz x0,0x00a422c0
00a40af0	mov x0,x27
00a40af4	mov x1,x21
00a40af8	mov x2,xzr
00a40afc	bl 0x00c31f70
00a40b00	cbz w0,0x00a422c0
00a40b04	ldr x1,[sp, #0x20]
00a40b08	mov w2,#0x20
00a40b0c	mov x0,x27
00a40b10	bl 0x00c31f80
00a40b14	cbz w0,0x00a422c0
00a40b18	mov w2,#0x20
00a40b1c	mov x0,x27
00a40b20	mov x1,x23
00a40b24	bl 0x00c31f80
00a40b28	cbz w0,0x00a422c0
00a40b2c	ldp x1,x2,[sp, #0x10]
00a40b30	mov x0,x27
00a40b34	bl 0x00c31f80
00a40b38	cbz w0,0x00a422c0
00a40b3c	add x1,sp,#0xc0
00a40b40	add x2,sp,#0x17c
00a40b44	mov x0,x27
00a40b48	add x19,sp,#0xc0
00a40b4c	bl 0x00c31f60
00a40b50	cbz w0,0x00a422c0
00a40b54	add x0,sp,#0xc0
00a40b58	bl 0x00a3f5ac
00a40b5c	mov x8,xzr
00a40b60	add x9,sp,#0xa20
00a40b64	ubfx x10,x8,#0x3,#0x1d
00a40b68	ldrb w10,[x19, x10]
00a40b6c	and w11,w8,#0x6
00a40b70	orr w13,w11,#0x1
00a40b74	add x12,x9,x8
00a40b78	add x8,x8,#0x2
00a40b7c	lsr w11,w10,w11
00a40b80	lsr w10,w10,w13
00a40b84	cmp x8,#0x100
00a40b88	and w11,w11,#0x1
00a40b8c	and w10,w10,#0x1
00a40b90	strb w11,[x12]
00a40b94	strb w10,[x12, #0x1]
00a40b98	b.ne 0x00a40b64
00a40b9c	add x9,sp,#0xa20
00a40ba0	mov x8,xzr
00a40ba4	orr x10,x9,#0x1
00a40ba8	mov w11,#0x1
00a40bac	ldrb w12,[x9, x8]
00a40bb0	cbz w12,0x00a40c40
00a40bb4	mov x12,x8
00a40bb8	mov w13,#0x1
00a40bbc	add x14,x13,x8
00a40bc0	cmp x14,#0xff
00a40bc4	b.hi 0x00a40c40
00a40bc8	ldrsb w16,[x9, x14]
00a40bcc	cbz w16,0x00a40c30
00a40bd0	ldrsb w15,[x9, x8]
00a40bd4	and x17,x13,#0xffffffff
00a40bd8	lsl w17,w16,w17
00a40bdc	add w16,w17,w15
00a40be0	cmp w16,#0xf
00a40be4	b.gt 0x00a40bf4
00a40be8	strb w16,[x9, x8]
00a40bec	strb wzr,[x9, x14]
00a40bf0	b 0x00a40c30
00a40bf4	sub w14,w15,w17
00a40bf8	cmn w14,#0xf
00a40bfc	b.lt 0x00a40c40
00a40c00	strb w14,[x9, x8]
00a40c04	mov x14,x12
00a40c08	ldrb w15,[x10, x14]
00a40c0c	cbz w15,0x00a40c2c
00a40c10	add x15,x14,#0x2
00a40c14	add x16,x14,#0x1
00a40c18	cmp x15,#0x100
00a40c1c	strb wzr,[x10, x14]
00a40c20	mov x14,x16
00a40c24	b.cc 0x00a40c08
00a40c28	b 0x00a40c30
00a40c2c	strb w11,[x10, x14]
00a40c30	add x13,x13,#0x1
00a40c34	cmp x13,#0x7
00a40c38	add x12,x12,#0x1
00a40c3c	b.cc 0x00a40bbc
00a40c40	add x8,x8,#0x1
00a40c44	cmp x8,#0x100
00a40c48	b.ne 0x00a40bac
00a40c4c	mov x8,xzr
00a40c50	add x9,sp,#0x920
00a40c54	ubfx x10,x8,#0x3,#0x1d
00a40c58	ldrb w10,[x22, x10]
00a40c5c	and w11,w8,#0x6
00a40c60	orr w13,w11,#0x1
00a40c64	add x12,x9,x8
00a40c68	add x8,x8,#0x2
00a40c6c	lsr w11,w10,w11
00a40c70	lsr w10,w10,w13
00a40c74	cmp x8,#0x100
00a40c78	and w11,w11,#0x1
00a40c7c	and w10,w10,#0x1
00a40c80	strb w11,[x12]
00a40c84	strb w10,[x12, #0x1]
00a40c88	b.ne 0x00a40c54
00a40c8c	add x9,sp,#0x920
00a40c90	mov x8,xzr
00a40c94	orr x10,x9,#0x1
00a40c98	mov w11,#0x1
00a40c9c	ldrb w12,[x9, x8]
00a40ca0	cbz w12,0x00a40d30
00a40ca4	mov x12,x8
00a40ca8	mov w13,#0x1
00a40cac	add x14,x13,x8
00a40cb0	cmp x14,#0xff
00a40cb4	b.hi 0x00a40d30
00a40cb8	ldrsb w16,[x9, x14]
00a40cbc	cbz w16,0x00a40d20
00a40cc0	ldrsb w15,[x9, x8]
00a40cc4	and x17,x13,#0xffffffff
00a40cc8	lsl w17,w16,w17
00a40ccc	add w16,w17,w15
00a40cd0	cmp w16,#0xf
00a40cd4	b.gt 0x00a40ce4
00a40cd8	strb w16,[x9, x8]
00a40cdc	strb wzr,[x9, x14]
00a40ce0	b 0x00a40d20
00a40ce4	sub w14,w15,w17
00a40ce8	cmn w14,#0xf
00a40cec	b.lt 0x00a40d30
00a40cf0	strb w14,[x9, x8]
00a40cf4	mov x14,x12
00a40cf8	ldrb w15,[x10, x14]
00a40cfc	cbz w15,0x00a40d1c
00a40d00	add x15,x14,#0x2
00a40d04	add x16,x14,#0x1
00a40d08	cmp x15,#0x100
00a40d0c	strb wzr,[x10, x14]
00a40d10	mov x14,x16
00a40d14	b.cc 0x00a40cf8
00a40d18	b 0x00a40d20
00a40d1c	strb w11,[x10, x14]
00a40d20	add x13,x13,#0x1
00a40d24	cmp x13,#0x7
00a40d28	add x12,x12,#0x1
00a40d2c	b.cc 0x00a40cac
00a40d30	add x8,x8,#0x1
00a40d34	cmp x8,#0x100
00a40d38	b.ne 0x00a40c9c
00a40d3c	ldr w8,[sp, #0x1a8]
00a40d40	ldr w9,[sp, #0x180]
00a40d44	ldr w10,[sp, #0x1ac]
00a40d48	ldr w11,[sp, #0x184]
00a40d4c	ldr w12,[sp, #0x1b0]
00a40d50	ldr w13,[sp, #0x188]
00a40d54	ldr w14,[sp, #0x1b4]
00a40d58	ldr w15,[sp, #0x18c]
00a40d5c	ldr w16,[sp, #0x1b8]
00a40d60	ldr w17,[sp, #0x190]
00a40d64	ldr w18,[sp, #0x1bc]
00a40d68	ldr w0,[sp, #0x194]
00a40d6c	ldr w1,[sp, #0x1c0]
00a40d70	ldr w2,[sp, #0x198]
00a40d74	ldr w3,[sp, #0x1c4]
00a40d78	ldr w4,[sp, #0x19c]
00a40d7c	ldr w5,[sp, #0x1c8]
00a40d80	ldr w6,[sp, #0x1a0]
00a40d84	ldr w7,[sp, #0x1cc]
00a40d88	ldr w19,[sp, #0x1a4]
00a40d8c	ldr x23,[sp, #0x8]
00a40d90	add w22,w9,w8
00a40d94	sub w8,w8,w9
00a40d98	add w9,w11,w10
00a40d9c	sub w10,w10,w11
00a40da0	add w11,w13,w12
00a40da4	sub w12,w12,w13
00a40da8	add w13,w15,w14
00a40dac	sub w14,w14,w15
00a40db0	add w15,w17,w16
00a40db4	sub w16,w16,w17
00a40db8	add w17,w0,w18
00a40dbc	sub w18,w18,w0
00a40dc0	add w0,w2,w1
00a40dc4	sub w1,w1,w2
00a40dc8	add w2,w4,w3
00a40dcc	sub w3,w3,w4
00a40dd0	add w4,w6,w5
00a40dd4	sub w5,w5,w6
00a40dd8	add w6,w19,w7
00a40ddc	sub w7,w7,w19
00a40de0	ldr x19,[x23, #0x20]
00a40de4	ldp q0,q1,[x23]
00a40de8	str w2,[sp, #0x43c]
00a40dec	str w8,[sp, #0x448]
00a40df0	add x8,sp,#0x420
00a40df4	adrp x2,0x760000
00a40df8	str w0,[sp, #0x438]
00a40dfc	str w1,[sp, #0x460]
00a40e00	add x0,x8,#0x78
00a40e04	add x2,x2,#0x858
00a40e08	mov x1,x26
00a40e0c	str w22,[sp, #0x420]
00a40e10	str w9,[sp, #0x424]
00a40e14	str w11,[sp, #0x428]
00a40e18	str w13,[sp, #0x42c]
00a40e1c	str w15,[sp, #0x430]
00a40e20	str w17,[sp, #0x434]
00a40e24	str w4,[sp, #0x440]
00a40e28	str w6,[sp, #0x444]
00a40e2c	str w10,[sp, #0x44c]
00a40e30	str w12,[sp, #0x450]
00a40e34	str w14,[sp, #0x454]
00a40e38	str w16,[sp, #0x458]
00a40e3c	str w18,[sp, #0x45c]
00a40e40	str w3,[sp, #0x464]
00a40e44	str w5,[sp, #0x468]
00a40e48	str w7,[sp, #0x46c]
00a40e4c	str q1,[sp, #0x480]
00a40e50	str x19,[sp, #0x490]
00a40e54	str q0,[sp, #0x470]
00a40e58	bl 0x00a44e38
00a40e5c	ldp q1,q0,[sp, #0x180]
00a40e60	ldr x8,[sp, #0x1a0]
00a40e64	ldr x9,[x24, #0x20]
00a40e68	add x0,sp,#0x380
00a40e6c	stp q1,q0,[sp, #0x2e0]
00a40e70	ldp q0,q2,[x24]
00a40e74	str x8,[sp, #0x300]
00a40e78	add x8,sp,#0x2e0
00a40e7c	add x1,sp,#0x2e0
00a40e80	stur q2,[x8, #0x38]
00a40e84	stur q0,[x8, #0x28]
00a40e88	ldp q0,q1,[x23]
00a40e8c	ldr x8,[x23, #0x20]
00a40e90	str x9,[sp, #0x328]
00a40e94	add x19,sp,#0x380
00a40e98	stp q0,q1,[sp, #0x330]
00a40e9c	str x8,[sp, #0x350]
00a40ea0	add x25,sp,#0x2e0
00a40ea4	bl 0x00a46060
00a40ea8	add x22,x19,#0x78
00a40eac	add x0,sp,#0x240
00a40eb0	add x1,sp,#0x380
00a40eb4	mov x2,x22
00a40eb8	add x26,sp,#0x240
00a40ebc	bl 0x00a44e38
00a40ec0	add x23,x19,#0x28
00a40ec4	add x24,x19,#0x50
00a40ec8	add x0,x26,#0x28
00a40ecc	mov x1,x23
00a40ed0	mov x2,x24
00a40ed4	bl 0x00a44e38
00a40ed8	add x0,x26,#0x50
00a40edc	mov x1,x24
00a40ee0	mov x2,x22
00a40ee4	bl 0x00a44e38
00a40ee8	add x0,x26,#0x78
00a40eec	add x1,sp,#0x380
00a40ef0	mov x2,x23
00a40ef4	bl 0x00a44e38
00a40ef8	add x0,sp,#0x380
00a40efc	add x1,sp,#0x240
00a40f00	add x2,sp,#0x420
00a40f04	bl 0x00a46738
00a40f08	add x0,sp,#0x2e0
00a40f0c	add x1,sp,#0x380
00a40f10	mov x2,x22
00a40f14	bl 0x00a44e38
00a40f18	add x0,x25,#0x28
00a40f1c	mov x1,x23
00a40f20	mov x2,x24
00a40f24	str x0,[sp, #0xa8]
00a40f28	bl 0x00a44e38
00a40f2c	add x0,x25,#0x50
00a40f30	mov x1,x24
00a40f34	mov x2,x22
00a40f38	str x0,[sp, #0xb0]
00a40f3c	bl 0x00a44e38
00a40f40	add x0,x25,#0x78
00a40f44	add x1,sp,#0x380
00a40f48	mov x2,x23
00a40f4c	mov x28,x0
00a40f50	bl 0x00a44e38
00a40f54	ldr w8,[sp, #0x308]
00a40f58	ldr w9,[sp, #0x2e0]
00a40f5c	ldr w10,[sp, #0x30c]
00a40f60	ldr w11,[sp, #0x2e4]
00a40f64	ldr w12,[sp, #0x310]
00a40f68	ldr w13,[sp, #0x2e8]
00a40f6c	ldr w14,[sp, #0x314]
00a40f70	ldr w15,[sp, #0x2ec]
00a40f74	ldr w16,[sp, #0x318]
00a40f78	ldr w17,[sp, #0x2f0]
00a40f7c	ldr w18,[sp, #0x31c]
00a40f80	ldr w0,[sp, #0x2f4]
00a40f84	ldr w1,[sp, #0x320]
00a40f88	ldr w2,[sp, #0x2f8]
00a40f8c	ldr w3,[sp, #0x324]
00a40f90	ldr w4,[sp, #0x2fc]
00a40f94	ldr w5,[sp, #0x328]
00a40f98	ldr w6,[sp, #0x300]
00a40f9c	ldr w7,[sp, #0x32c]
00a40fa0	ldr w19,[sp, #0x304]
00a40fa4	add w25,w9,w8
00a40fa8	sub w8,w8,w9
00a40fac	ldr x26,[sp, #0x350]
00a40fb0	ldp q1,q0,[sp, #0x330]
00a40fb4	add w9,w11,w10
00a40fb8	sub w10,w10,w11
00a40fbc	add w11,w13,w12
00a40fc0	sub w12,w12,w13
00a40fc4	add w13,w15,w14
00a40fc8	sub w14,w14,w15
00a40fcc	add w15,w17,w16
00a40fd0	sub w16,w16,w17
00a40fd4	add w17,w0,w18
00a40fd8	sub w18,w18,w0
00a40fdc	add w0,w2,w1
00a40fe0	str w8,[sp, #0x4e8]
00a40fe4	add x8,sp,#0x420
00a40fe8	str w25,[sp, #0x4c0]
00a40fec	str w0,[sp, #0x4d8]
00a40ff0	add x25,x8,#0xa0
00a40ff4	add x0,x8,#0x118
00a40ff8	adrp x8,0x760000
00a40ffc	sub w1,w1,w2
00a41000	add w2,w4,w3
00a41004	add x8,x8,#0x858
00a41008	sub w3,w3,w4
00a4100c	add w4,w6,w5
00a41010	sub w5,w5,w6
00a41014	add w6,w19,w7
00a41018	sub w7,w7,w19
00a4101c	str w2,[sp, #0x4dc]
00a41020	str w1,[sp, #0x500]
00a41024	mov x1,x28
00a41028	mov x2,x8
00a4102c	str w9,[sp, #0x4c4]
00a41030	str w11,[sp, #0x4c8]
00a41034	str w13,[sp, #0x4cc]
00a41038	str w15,[sp, #0x4d0]
00a4103c	str w17,[sp, #0x4d4]
00a41040	str w4,[sp, #0x4e0]
00a41044	str w6,[sp, #0x4e4]
00a41048	str w10,[sp, #0x4ec]
00a4104c	str w12,[sp, #0x4f0]
00a41050	str w14,[sp, #0x4f4]
00a41054	str w16,[sp, #0x4f8]
00a41058	str w18,[sp, #0x4fc]
00a4105c	str w3,[sp, #0x504]
00a41060	str w5,[sp, #0x508]
00a41064	str w7,[sp, #0x50c]
00a41068	str q0,[sp, #0x520]
00a4106c	str x26,[sp, #0x530]
00a41070	str q1,[sp, #0x510]
00a41074	mov x19,x28
00a41078	str x28,[sp, #0xb8]
00a4107c	bl 0x00a44e38
00a41080	add x0,sp,#0x380
00a41084	add x1,sp,#0x240
00a41088	mov x2,x25
00a4108c	bl 0x00a46738
00a41090	add x0,sp,#0x2e0
00a41094	add x1,sp,#0x380
00a41098	mov x2,x22
00a4109c	bl 0x00a44e38
00a410a0	ldr x28,[sp, #0xa8]
00a410a4	mov x1,x23
00a410a8	mov x2,x24
00a410ac	mov x0,x28
00a410b0	bl 0x00a44e38
00a410b4	ldr x0,[sp, #0xb0]
00a410b8	mov x1,x24
00a410bc	mov x2,x22
00a410c0	bl 0x00a44e38
00a410c4	add x1,sp,#0x380
00a410c8	mov x0,x19
00a410cc	mov x2,x23
00a410d0	bl 0x00a44e38
00a410d4	ldr w8,[sp, #0x308]
00a410d8	ldr w9,[sp, #0x2e0]
00a410dc	ldr w10,[sp, #0x30c]
00a410e0	ldr w11,[sp, #0x2e4]
00a410e4	ldr w12,[sp, #0x310]
00a410e8	ldr w13,[sp, #0x2e8]
00a410ec	ldr w14,[sp, #0x314]
00a410f0	ldr w15,[sp, #0x2ec]
00a410f4	ldr w16,[sp, #0x318]
00a410f8	ldr w17,[sp, #0x2f0]
00a410fc	ldr w18,[sp, #0x31c]
00a41100	ldr w0,[sp, #0x2f4]
00a41104	ldr w1,[sp, #0x320]
00a41108	ldr w2,[sp, #0x2f8]
00a4110c	ldr w3,[sp, #0x324]
00a41110	ldr w4,[sp, #0x2fc]
00a41114	ldr w5,[sp, #0x328]
00a41118	ldr w6,[sp, #0x300]
00a4111c	ldr w7,[sp, #0x32c]
00a41120	ldr w19,[sp, #0x304]
00a41124	add w25,w9,w8
00a41128	sub w8,w8,w9
00a4112c	add w9,w11,w10
00a41130	sub w10,w10,w11
00a41134	add w11,w13,w12
00a41138	sub w12,w12,w13
00a4113c	add w13,w15,w14
00a41140	sub w14,w14,w15
00a41144	add w15,w17,w16
00a41148	sub w16,w16,w17
00a4114c	add w17,w0,w18
00a41150	sub w18,w18,w0
00a41154	add w0,w2,w1
00a41158	sub w1,w1,w2
00a4115c	add w2,w4,w3
00a41160	sub w3,w3,w4
00a41164	add w4,w6,w5
00a41168	sub w5,w5,w6
00a4116c	add w6,w19,w7
00a41170	sub w7,w7,w19
00a41174	ldr x19,[sp, #0xb8]
00a41178	ldr x26,[sp, #0x350]
00a4117c	ldp q1,q0,[sp, #0x330]
00a41180	str w2,[sp, #0x57c]
00a41184	str w8,[sp, #0x588]
00a41188	add x8,sp,#0x420
00a4118c	adrp x2,0x760000
00a41190	str w0,[sp, #0x578]
00a41194	str w1,[sp, #0x5a0]
00a41198	add x0,x8,#0x1b8
00a4119c	mov x1,x19
00a411a0	add x2,x2,#0x858
00a411a4	str w25,[sp, #0x560]
00a411a8	str w9,[sp, #0x564]
00a411ac	str w11,[sp, #0x568]
00a411b0	str w13,[sp, #0x56c]
00a411b4	str w15,[sp, #0x570]
00a411b8	str w17,[sp, #0x574]
00a411bc	str w4,[sp, #0x580]
00a411c0	str w6,[sp, #0x584]
00a411c4	str w10,[sp, #0x58c]
00a411c8	str w12,[sp, #0x590]
00a411cc	str w14,[sp, #0x594]
00a411d0	str w16,[sp, #0x598]
00a411d4	str w18,[sp, #0x59c]
00a411d8	str w3,[sp, #0x5a4]
00a411dc	str w5,[sp, #0x5a8]
00a411e0	str w7,[sp, #0x5ac]
00a411e4	str q0,[sp, #0x5c0]
00a411e8	add x25,x8,#0x140
00a411ec	str x26,[sp, #0x5d0]
00a411f0	str q1,[sp, #0x5b0]
00a411f4	bl 0x00a44e38
00a411f8	add x0,sp,#0x380
00a411fc	add x1,sp,#0x240
00a41200	mov x2,x25
00a41204	bl 0x00a46738
00a41208	add x0,sp,#0x2e0
00a4120c	add x1,sp,#0x380
00a41210	mov x2,x22
00a41214	bl 0x00a44e38
00a41218	mov x0,x28
00a4121c	mov x1,x23
00a41220	mov x2,x24
00a41224	bl 0x00a44e38
00a41228	ldr x0,[sp, #0xb0]
00a4122c	mov x1,x24
00a41230	mov x2,x22
00a41234	bl 0x00a44e38
00a41238	add x1,sp,#0x380
00a4123c	mov x0,x19
00a41240	mov x2,x23
00a41244	mov x28,x19
00a41248	bl 0x00a44e38
00a4124c	ldr w8,[sp, #0x308]
00a41250	ldr w9,[sp, #0x2e0]
00a41254	ldr w10,[sp, #0x30c]
00a41258	ldr w11,[sp, #0x2e4]
00a4125c	ldr w12,[sp, #0x310]
00a41260	ldr w13,[sp, #0x2e8]
00a41264	ldr w14,[sp, #0x314]
00a41268	ldr w15,[sp, #0x2ec]
00a4126c	ldr w16,[sp, #0x318]
00a41270	ldr w17,[sp, #0x2f0]
00a41274	ldr w18,[sp, #0x31c]
00a41278	ldr w0,[sp, #0x2f4]
00a4127c	ldr w1,[sp, #0x320]
00a41280	ldr w2,[sp, #0x2f8]
00a41284	ldr w3,[sp, #0x324]
00a41288	ldr w4,[sp, #0x2fc]
00a4128c	ldr w5,[sp, #0x328]
00a41290	ldr w6,[sp, #0x300]
00a41294	ldr w7,[sp, #0x32c]
00a41298	ldr w19,[sp, #0x304]
00a4129c	ldr x26,[sp, #0x350]
00a412a0	ldp q1,q0,[sp, #0x330]
00a412a4	add w25,w9,w8
00a412a8	sub w8,w8,w9
00a412ac	add w9,w11,w10
00a412b0	sub w10,w10,w11
00a412b4	add w11,w13,w12
00a412b8	sub w12,w12,w13
00a412bc	add w13,w15,w14
00a412c0	sub w14,w14,w15
00a412c4	add w15,w17,w16
00a412c8	sub w16,w16,w17
00a412cc	add w17,w0,w18
00a412d0	sub w18,w18,w0
00a412d4	add w0,w2,w1
00a412d8	sub w1,w1,w2
00a412dc	add w2,w4,w3
00a412e0	str w2,[sp, #0x61c]
00a412e4	str w8,[sp, #0x628]
00a412e8	add x8,sp,#0x420
00a412ec	adrp x2,0x760000
00a412f0	sub w3,w3,w4
00a412f4	add w4,w6,w5
00a412f8	sub w5,w5,w6
00a412fc	add w6,w19,w7
00a41300	sub w7,w7,w19
00a41304	str w0,[sp, #0x618]
00a41308	str w1,[sp, #0x640]
00a4130c	add x0,x8,#0x258
00a41310	mov x1,x28
00a41314	add x2,x2,#0x858
00a41318	str w25,[sp, #0x600]
00a4131c	str w9,[sp, #0x604]
00a41320	str w11,[sp, #0x608]
00a41324	str w13,[sp, #0x60c]
00a41328	str w15,[sp, #0x610]
00a4132c	str w17,[sp, #0x614]
00a41330	str w4,[sp, #0x620]
00a41334	str w6,[sp, #0x624]
00a41338	str w10,[sp, #0x62c]
00a4133c	str w12,[sp, #0x630]
00a41340	str w14,[sp, #0x634]
00a41344	str w16,[sp, #0x638]
00a41348	str w18,[sp, #0x63c]
00a4134c	str w3,[sp, #0x644]
00a41350	str w5,[sp, #0x648]
00a41354	str w7,[sp, #0x64c]
00a41358	str q0,[sp, #0x660]
00a4135c	add x25,x8,#0x1e0
00a41360	str x26,[sp, #0x670]
00a41364	str q1,[sp, #0x650]
00a41368	mov x19,x28
00a4136c	bl 0x00a44e38
00a41370	add x0,sp,#0x380
00a41374	add x1,sp,#0x240
00a41378	mov x2,x25
00a4137c	bl 0x00a46738
00a41380	add x0,sp,#0x2e0
00a41384	add x1,sp,#0x380
00a41388	mov x2,x22
00a4138c	bl 0x00a44e38
00a41390	ldr x28,[sp, #0xa8]
00a41394	mov x1,x23
00a41398	mov x2,x24
00a4139c	mov x0,x28
00a413a0	bl 0x00a44e38
00a413a4	ldr x0,[sp, #0xb0]
00a413a8	mov x1,x24
00a413ac	mov x2,x22
00a413b0	bl 0x00a44e38
00a413b4	add x1,sp,#0x380
00a413b8	mov x0,x19
00a413bc	mov x2,x23
00a413c0	bl 0x00a44e38
00a413c4	ldr w8,[sp, #0x308]
00a413c8	ldr w9,[sp, #0x2e0]
00a413cc	ldr w10,[sp, #0x30c]
00a413d0	ldr w11,[sp, #0x2e4]
00a413d4	ldr w12,[sp, #0x310]
00a413d8	ldr w13,[sp, #0x2e8]
00a413dc	ldr w14,[sp, #0x314]
00a413e0	ldr w15,[sp, #0x2ec]
00a413e4	ldr w16,[sp, #0x318]
00a413e8	ldr w17,[sp, #0x2f0]
00a413ec	ldr w18,[sp, #0x31c]
00a413f0	ldr w0,[sp, #0x2f4]
00a413f4	ldr w1,[sp, #0x320]
00a413f8	ldr w2,[sp, #0x2f8]
00a413fc	ldr w3,[sp, #0x324]
00a41400	ldr w4,[sp, #0x2fc]
00a41404	ldr w5,[sp, #0x328]
00a41408	ldr w6,[sp, #0x300]
00a4140c	ldr w7,[sp, #0x32c]
00a41410	ldr w19,[sp, #0x304]
00a41414	add w25,w9,w8
00a41418	sub w8,w8,w9
00a4141c	add w9,w11,w10
00a41420	sub w10,w10,w11
00a41424	add w11,w13,w12
00a41428	sub w12,w12,w13
00a4142c	add w13,w15,w14
00a41430	sub w14,w14,w15
00a41434	add w15,w17,w16
00a41438	sub w16,w16,w17
00a4143c	add w17,w0,w18
00a41440	sub w18,w18,w0
00a41444	add w0,w2,w1
00a41448	sub w1,w1,w2
00a4144c	add w2,w4,w3
00a41450	sub w3,w3,w4
00a41454	add w4,w6,w5
00a41458	sub w5,w5,w6
00a4145c	add w6,w19,w7
00a41460	sub w7,w7,w19
00a41464	ldr x19,[sp, #0xb8]
00a41468	ldr x26,[sp, #0x350]
00a4146c	ldp q1,q0,[sp, #0x330]
00a41470	str w2,[sp, #0x6bc]
00a41474	str w8,[sp, #0x6c8]
00a41478	add x8,sp,#0x420
00a4147c	adrp x2,0x760000
00a41480	str w0,[sp, #0x6b8]
00a41484	str w1,[sp, #0x6e0]
00a41488	add x0,x8,#0x2f8
00a4148c	mov x1,x19
00a41490	add x2,x2,#0x858
00a41494	str w25,[sp, #0x6a0]
00a41498	str w9,[sp, #0x6a4]
00a4149c	str w11,[sp, #0x6a8]
00a414a0	str w13,[sp, #0x6ac]
00a414a4	str w15,[sp, #0x6b0]
00a414a8	str w17,[sp, #0x6b4]
00a414ac	str w4,[sp, #0x6c0]
00a414b0	str w6,[sp, #0x6c4]
00a414b4	str w10,[sp, #0x6cc]
00a414b8	str w12,[sp, #0x6d0]
00a414bc	str w14,[sp, #0x6d4]
00a414c0	str w16,[sp, #0x6d8]
00a414c4	str w18,[sp, #0x6dc]
00a414c8	str w3,[sp, #0x6e4]
00a414cc	str w5,[sp, #0x6e8]
00a414d0	str w7,[sp, #0x6ec]
00a414d4	str q0,[sp, #0x700]
00a414d8	add x25,x8,#0x280
00a414dc	str x26,[sp, #0x710]
00a414e0	str q1,[sp, #0x6f0]
00a414e4	bl 0x00a44e38
00a414e8	add x0,sp,#0x380
00a414ec	add x1,sp,#0x240
00a414f0	mov x2,x25
00a414f4	bl 0x00a46738
00a414f8	add x0,sp,#0x2e0
00a414fc	add x1,sp,#0x380
00a41500	mov x2,x22
00a41504	bl 0x00a44e38
00a41508	mov x0,x28
00a4150c	mov x1,x23
00a41510	mov x2,x24
00a41514	bl 0x00a44e38
00a41518	ldr x0,[sp, #0xb0]
00a4151c	mov x1,x24
00a41520	mov x2,x22
00a41524	bl 0x00a44e38
00a41528	add x1,sp,#0x380
00a4152c	mov x0,x19
00a41530	mov x2,x23
00a41534	bl 0x00a44e38
00a41538	ldr w8,[sp, #0x308]
00a4153c	ldr w9,[sp, #0x2e0]
00a41540	ldr w10,[sp, #0x30c]
00a41544	ldr w11,[sp, #0x2e4]
00a41548	ldr w12,[sp, #0x310]
00a4154c	ldr w13,[sp, #0x2e8]
00a41550	ldr w14,[sp, #0x314]
00a41554	ldr w15,[sp, #0x2ec]
00a41558	ldr w16,[sp, #0x318]
00a4155c	ldr w17,[sp, #0x2f0]
00a41560	ldr w18,[sp, #0x31c]
00a41564	ldr w0,[sp, #0x2f4]
00a41568	ldr w1,[sp, #0x320]
00a4156c	ldr w2,[sp, #0x2f8]
00a41570	ldr w3,[sp, #0x324]
00a41574	ldr w4,[sp, #0x2fc]
00a41578	ldr w5,[sp, #0x328]
00a4157c	ldr w6,[sp, #0x300]
00a41580	ldr w7,[sp, #0x32c]
00a41584	ldr w19,[sp, #0x304]
00a41588	add w25,w9,w8
00a4158c	sub w8,w8,w9
00a41590	add w9,w11,w10
00a41594	sub w10,w10,w11
00a41598	add w11,w13,w12
00a4159c	sub w12,w12,w13
00a415a0	add w13,w15,w14
00a415a4	sub w14,w14,w15
00a415a8	add w15,w17,w16
00a415ac	sub w16,w16,w17
00a415b0	add w17,w0,w18
00a415b4	sub w18,w18,w0
00a415b8	add w0,w2,w1
00a415bc	sub w1,w1,w2
00a415c0	add w2,w4,w3
00a415c4	sub w3,w3,w4
00a415c8	add w4,w6,w5
00a415cc	sub w5,w5,w6
00a415d0	add w6,w19,w7
00a415d4	sub w7,w7,w19
00a415d8	ldr x19,[sp, #0xb8]
00a415dc	ldr x26,[sp, #0x350]
00a415e0	ldp q1,q0,[sp, #0x330]
00a415e4	str w2,[sp, #0x75c]
00a415e8	str w8,[sp, #0x768]
00a415ec	add x8,sp,#0x420
00a415f0	adrp x2,0x760000
00a415f4	str w0,[sp, #0x758]
00a415f8	str w1,[sp, #0x780]
00a415fc	add x0,x8,#0x398
00a41600	mov x1,x19
00a41604	add x2,x2,#0x858
00a41608	str w25,[sp, #0x740]
00a4160c	str w9,[sp, #0x744]
00a41610	str w11,[sp, #0x748]
00a41614	str w13,[sp, #0x74c]
00a41618	str w15,[sp, #0x750]
00a4161c	str w17,[sp, #0x754]
00a41620	str w4,[sp, #0x760]
00a41624	str w6,[sp, #0x764]
00a41628	str w10,[sp, #0x76c]
00a4162c	str w12,[sp, #0x770]
00a41630	str w14,[sp, #0x774]
00a41634	str w16,[sp, #0x778]
00a41638	str w18,[sp, #0x77c]
00a4163c	str w3,[sp, #0x784]
00a41640	str w5,[sp, #0x788]
00a41644	str w7,[sp, #0x78c]
00a41648	str q0,[sp, #0x7a0]
00a4164c	add x25,x8,#0x320
00a41650	str x26,[sp, #0x7b0]
00a41654	str q1,[sp, #0x790]
00a41658	bl 0x00a44e38
00a4165c	add x0,sp,#0x380
00a41660	add x1,sp,#0x240
00a41664	mov x2,x25
00a41668	bl 0x00a46738
00a4166c	add x0,sp,#0x2e0
00a41670	add x1,sp,#0x380
00a41674	mov x2,x22
00a41678	bl 0x00a44e38
00a4167c	mov x0,x28
00a41680	mov x1,x23
00a41684	mov x2,x24
00a41688	bl 0x00a44e38
00a4168c	ldr x28,[sp, #0xb0]
00a41690	mov x1,x24
00a41694	mov x2,x22
00a41698	mov x0,x28
00a4169c	bl 0x00a44e38
00a416a0	add x1,sp,#0x380
00a416a4	mov x0,x19
00a416a8	mov x2,x23
00a416ac	bl 0x00a44e38
00a416b0	ldr w8,[sp, #0x308]
00a416b4	ldr w9,[sp, #0x2e0]
00a416b8	ldr w10,[sp, #0x30c]
00a416bc	ldr w11,[sp, #0x2e4]
00a416c0	ldr w12,[sp, #0x310]
00a416c4	ldr w13,[sp, #0x2e8]
00a416c8	ldr w14,[sp, #0x314]
00a416cc	ldr w15,[sp, #0x2ec]
00a416d0	ldr w16,[sp, #0x318]
00a416d4	ldr w17,[sp, #0x2f0]
00a416d8	ldr w18,[sp, #0x31c]
00a416dc	ldr w0,[sp, #0x2f4]
00a416e0	ldr w1,[sp, #0x320]
00a416e4	ldr w2,[sp, #0x2f8]
00a416e8	ldr w3,[sp, #0x324]
00a416ec	ldr w4,[sp, #0x2fc]
00a416f0	ldr w5,[sp, #0x328]
00a416f4	ldr w6,[sp, #0x300]
00a416f8	ldr w7,[sp, #0x32c]
00a416fc	ldr w19,[sp, #0x304]
00a41700	ldr x26,[sp, #0x350]
00a41704	add w25,w9,w8
00a41708	sub w8,w8,w9
00a4170c	add w9,w11,w10
00a41710	sub w10,w10,w11
00a41714	add w11,w13,w12
00a41718	sub w12,w12,w13
00a4171c	add w13,w15,w14
00a41720	sub w14,w14,w15
00a41724	add w15,w17,w16
00a41728	sub w16,w16,w17
00a4172c	add w17,w0,w18
00a41730	sub w18,w18,w0
00a41734	add w0,w2,w1
00a41738	sub w1,w1,w2
00a4173c	add w2,w4,w3
00a41740	sub w3,w3,w4
00a41744	add w4,w6,w5
00a41748	sub w5,w5,w6
00a4174c	add w6,w19,w7
00a41750	sub w7,w7,w19
00a41754	ldr x19,[sp, #0xb8]
00a41758	ldp q1,q0,[sp, #0x330]
00a4175c	str x26,[sp, #0x850]
00a41760	adrp x26,0x760000
00a41764	str w8,[sp, #0x808]
00a41768	add x8,sp,#0x420
00a4176c	add x26,x26,#0x858
00a41770	str w0,[sp, #0x7f8]
00a41774	str w2,[sp, #0x7fc]
00a41778	str w1,[sp, #0x820]
00a4177c	add x0,x8,#0x438
00a41780	mov x1,x19
00a41784	mov x2,x26
00a41788	str w25,[sp, #0x7e0]
00a4178c	str w9,[sp, #0x7e4]
00a41790	str w11,[sp, #0x7e8]
00a41794	str w13,[sp, #0x7ec]
00a41798	str w15,[sp, #0x7f0]
00a4179c	str w17,[sp, #0x7f4]
00a417a0	str w4,[sp, #0x800]
00a417a4	str w6,[sp, #0x804]
00a417a8	str w10,[sp, #0x80c]
00a417ac	str w12,[sp, #0x810]
00a417b0	str w14,[sp, #0x814]
00a417b4	str w16,[sp, #0x818]
00a417b8	str w18,[sp, #0x81c]
00a417bc	str w3,[sp, #0x824]
00a417c0	str w5,[sp, #0x828]
00a417c4	str w7,[sp, #0x82c]
00a417c8	str q0,[sp, #0x840]
00a417cc	add x25,x8,#0x3c0
00a417d0	str q1,[sp, #0x830]
00a417d4	bl 0x00a44e38
00a417d8	add x0,sp,#0x380
00a417dc	add x1,sp,#0x240
00a417e0	mov x2,x25
00a417e4	bl 0x00a46738
00a417e8	add x0,sp,#0x2e0
00a417ec	add x1,sp,#0x380
00a417f0	mov x2,x22
00a417f4	bl 0x00a44e38
00a417f8	ldr x0,[sp, #0xa8]
00a417fc	mov x1,x23
00a41800	mov x2,x24
00a41804	bl 0x00a44e38
00a41808	mov x0,x28
00a4180c	mov x1,x24
00a41810	mov x2,x22
00a41814	bl 0x00a44e38
00a41818	add x1,sp,#0x380
00a4181c	mov x0,x19
00a41820	mov x2,x23
00a41824	mov x28,x19
00a41828	bl 0x00a44e38
00a4182c	ldr w8,[sp, #0x308]
00a41830	ldr w9,[sp, #0x2e0]
00a41834	ldr w10,[sp, #0x30c]
00a41838	ldr w11,[sp, #0x2e4]
00a4183c	ldr w12,[sp, #0x310]
00a41840	ldr w13,[sp, #0x2e8]
00a41844	ldr w14,[sp, #0x314]
00a41848	ldr w15,[sp, #0x2ec]
00a4184c	ldr w16,[sp, #0x318]
00a41850	ldr w17,[sp, #0x2f0]
00a41854	ldr w18,[sp, #0x31c]
00a41858	ldr w0,[sp, #0x2f4]
00a4185c	ldr w1,[sp, #0x320]
00a41860	ldr w2,[sp, #0x2f8]
00a41864	ldr w3,[sp, #0x324]
00a41868	ldr w4,[sp, #0x2fc]
00a4186c	ldr w5,[sp, #0x328]
00a41870	ldr w6,[sp, #0x300]
00a41874	ldr w7,[sp, #0x32c]
00a41878	ldr w19,[sp, #0x304]
00a4187c	add w25,w9,w8
00a41880	sub w8,w8,w9
00a41884	add w9,w11,w10
00a41888	sub w10,w10,w11
00a4188c	add w11,w13,w12
00a41890	sub w12,w12,w13
00a41894	add w13,w15,w14
00a41898	sub w14,w14,w15
00a4189c	add w15,w17,w16
00a418a0	sub w16,w16,w17
00a418a4	add w17,w0,w18
00a418a8	sub w18,w18,w0
00a418ac	add w0,w2,w1
00a418b0	sub w1,w1,w2
00a418b4	add w2,w4,w3
00a418b8	sub w3,w3,w4
00a418bc	add w4,w6,w5
00a418c0	sub w5,w5,w6
00a418c4	add w6,w19,w7
00a418c8	sub w7,w7,w19
00a418cc	ldr x19,[sp, #0x350]
00a418d0	ldp q1,q0,[sp, #0x330]
00a418d4	str w8,[sp, #0x8a8]
00a418d8	add x8,sp,#0x420
00a418dc	str w0,[sp, #0x898]
00a418e0	str w2,[sp, #0x89c]
00a418e4	str w1,[sp, #0x8c0]
00a418e8	add x0,x8,#0x4d8
00a418ec	mov x1,x28
00a418f0	mov x2,x26
00a418f4	str w25,[sp, #0x880]
00a418f8	str w9,[sp, #0x884]
00a418fc	str w11,[sp, #0x888]
00a41900	str w13,[sp, #0x88c]
00a41904	str w15,[sp, #0x890]
00a41908	str w17,[sp, #0x894]
00a4190c	str w4,[sp, #0x8a0]
00a41910	str w6,[sp, #0x8a4]
00a41914	str w10,[sp, #0x8ac]
00a41918	str w12,[sp, #0x8b0]
00a4191c	str w14,[sp, #0x8b4]
00a41920	str w16,[sp, #0x8b8]
00a41924	str w18,[sp, #0x8bc]
00a41928	str w3,[sp, #0x8c4]
00a4192c	str w5,[sp, #0x8c8]
00a41930	str w7,[sp, #0x8cc]
00a41934	str q0,[sp, #0x8e0]
00a41938	str x19,[sp, #0x8f0]
00a4193c	str q1,[sp, #0x8d0]
00a41940	bl 0x00a44e38
00a41944	add x10,sp,#0x100
00a41948	movi v0.2D,#0x0
00a4194c	orr x9,xzr,#0x100000000
00a41950	add x12,sp,#0x3d
00a41954	add x26,x10,#0x28
00a41958	add x10,x10,#0x50
00a4195c	str xzr,[sp, #0x120]
00a41960	mov w11,#0x1
00a41964	orr w8,wzr,#0xff
00a41968	stp q0,q0,[sp, #0x100]
00a4196c	stur x9,[x20, #0x4c]
00a41970	add x9,sp,#0xa20
00a41974	stur q0,[x12, #0xff]
00a41978	add x12,sp,#0x2d
00a4197c	str x10,[sp, #0xa0]
00a41980	add x10,sp,#0x920
00a41984	stur q0,[x12, #0xff]
00a41988	str w11,[sp, #0x128]
00a4198c	stur q0,[x20, #0x64]
00a41990	stur q0,[x20, #0x54]
00a41994	str wzr,[sp, #0x174]
00a41998	stp x27,x21,[sp, #0x88]
00a4199c	ldrb w11,[x9, x8]
00a419a0	cbnz w11,0x00a419b8
00a419a4	ldrb w11,[x10, x8]
00a419a8	cbnz w11,0x00a419b8
00a419ac	sub x8,x8,#0x1
00a419b0	cmn x8,#0x1
00a419b4	b.ne 0x00a4199c
00a419b8	ldp x25,x27,[sp, #0xa8]
00a419bc	ldr x20,[sp, #0xb8]
00a419c0	ldr x21,[sp, #0xa0]
00a419c4	tbnz w8,#0x1f,0x00a42244
00a419c8	sxtw x28,w8
00a419cc	str x26,[sp, #0x98]
00a419d0	add x0,sp,#0x380
00a419d4	add x1,sp,#0x100
00a419d8	bl 0x00a46060
00a419dc	add x8,sp,#0xa20
00a419e0	ldrsb w19,[x8, x28]
00a419e4	cmp w19,#0x1
00a419e8	b.lt 0x00a41a4c
00a419ec	add x0,sp,#0x2e0
00a419f0	add x1,sp,#0x380
00a419f4	mov x2,x22
00a419f8	bl 0x00a44e38
00a419fc	mov x0,x25
00a41a00	mov x1,x23
00a41a04	mov x2,x24
00a41a08	bl 0x00a44e38
00a41a0c	mov x0,x27
00a41a10	mov x1,x24
00a41a14	mov x2,x22
00a41a18	bl 0x00a44e38
00a41a1c	add x1,sp,#0x380
00a41a20	mov x0,x20
00a41a24	mov x2,x23
00a41a28	bl 0x00a44e38
00a41a2c	ubfx w8,w19,#0x1,#0x7
00a41a30	mov w9,#0xa0
00a41a34	add x10,sp,#0x420
00a41a38	umaddl x2,w8,w9,x10
00a41a3c	add x0,sp,#0x380
00a41a40	add x1,sp,#0x2e0
00a41a44	bl 0x00a46738
00a41a48	b 0x00a41df8
00a41a4c	tbz w19,#0x1f,0x00a41df8
00a41a50	add x0,sp,#0x2e0
00a41a54	add x1,sp,#0x380
00a41a58	mov x2,x22
00a41a5c	bl 0x00a44e38
00a41a60	mov x0,x25
00a41a64	mov x1,x23
00a41a68	mov x2,x24
00a41a6c	bl 0x00a44e38
00a41a70	mov x0,x27
00a41a74	mov x1,x24
00a41a78	mov x2,x22
00a41a7c	bl 0x00a44e38
00a41a80	add x1,sp,#0x380
00a41a84	mov x0,x20
00a41a88	mov x2,x23
00a41a8c	bl 0x00a44e38
00a41a90	ldr w9,[sp, #0x308]
00a41a94	ldr w10,[sp, #0x2e0]
00a41a98	ldr w11,[sp, #0x30c]
00a41a9c	ldr w12,[sp, #0x2e4]
00a41aa0	and w8,w19,#0x80
00a41aa4	ldr w13,[sp, #0x310]
00a41aa8	ldr w14,[sp, #0x2e8]
00a41aac	ldr w15,[sp, #0x314]
00a41ab0	ldr w16,[sp, #0x2ec]
00a41ab4	ldr w17,[sp, #0x318]
00a41ab8	ldr w18,[sp, #0x2f0]
00a41abc	ldr w0,[sp, #0x31c]
00a41ac0	ldr w1,[sp, #0x2f4]
00a41ac4	ldr w2,[sp, #0x320]
00a41ac8	ldr w3,[sp, #0x2f8]
00a41acc	ldr w4,[sp, #0x324]
00a41ad0	ldr w5,[sp, #0x2fc]
00a41ad4	ldr w6,[sp, #0x328]
00a41ad8	ldr w7,[sp, #0x300]
00a41adc	ldr w26,[sp, #0x32c]
00a41ae0	ldr w30,[sp, #0x304]
00a41ae4	add w8,w19,w8, LSR #0x7
00a41ae8	sxtb w8,w8
00a41aec	neg w8,w8, LSR #0x1
00a41af0	add w19,w10,w9
00a41af4	sub w9,w9,w10
00a41af8	add w10,w12,w11
00a41afc	sxtb x8,w8
00a41b00	sub w11,w11,w12
00a41b04	add w12,w14,w13
00a41b08	sub w13,w13,w14
00a41b0c	add w14,w16,w15
00a41b10	sub w15,w15,w16
00a41b14	add w16,w18,w17
00a41b18	sub w17,w17,w18
00a41b1c	add w18,w1,w0
00a41b20	sub w0,w0,w1
00a41b24	add w1,w3,w2
00a41b28	sub w2,w2,w3
00a41b2c	add w3,w5,w4
00a41b30	sub w4,w4,w5
00a41b34	add w5,w7,w6
00a41b38	sub w6,w6,w7
00a41b3c	add w7,w30,w26
00a41b40	sub w26,w26,w30
00a41b44	str w10,[sp, #0x384]
00a41b48	str w9,[sp, #0x3a8]
00a41b4c	mov w9,#0xa0
00a41b50	add x10,sp,#0x420
00a41b54	str w26,[sp, #0x3cc]
00a41b58	nop
00a41b5c	madd x26,x8,x9,x10
00a41b60	str w1,[sp, #0x398]
00a41b64	str w0,[sp, #0x3bc]
00a41b68	str w2,[sp, #0x3c0]
00a41b6c	add x2,x26,#0x28
00a41b70	add x1,sp,#0x380
00a41b74	mov x0,x24
00a41b78	str w19,[sp, #0x380]
00a41b7c	str w12,[sp, #0x388]
00a41b80	str w14,[sp, #0x38c]
00a41b84	str w16,[sp, #0x390]
00a41b88	str w18,[sp, #0x394]
00a41b8c	str w3,[sp, #0x39c]
00a41b90	str w5,[sp, #0x3a0]
00a41b94	str w7,[sp, #0x3a4]
00a41b98	str w11,[sp, #0x3ac]
00a41b9c	str w13,[sp, #0x3b0]
00a41ba0	str w15,[sp, #0x3b4]
00a41ba4	str w17,[sp, #0x3b8]
00a41ba8	str w4,[sp, #0x3c4]
00a41bac	str w6,[sp, #0x3c8]
00a41bb0	bl 0x00a44e38
00a41bb4	mov x0,x23
00a41bb8	mov x1,x23
00a41bbc	mov x2,x26
00a41bc0	bl 0x00a44e38
00a41bc4	add x1,x26,#0x78
00a41bc8	mov x0,x22
00a41bcc	mov x2,x20
00a41bd0	bl 0x00a44e38
00a41bd4	add x2,x26,#0x50
00a41bd8	add x0,sp,#0x380
00a41bdc	mov x1,x27
00a41be0	bl 0x00a44e38
00a41be4	ldr w18,[sp, #0x3d0]
00a41be8	ldr w0,[sp, #0x3a8]
00a41bec	ldr w14,[sp, #0x380]
00a41bf0	ldr w2,[sp, #0x3ac]
00a41bf4	ldr w15,[sp, #0x384]
00a41bf8	sub w1,w18,w0
00a41bfc	str w1,[sp, #0x380]
00a41c00	ldr w1,[sp, #0x3d4]
00a41c04	ldr w4,[sp, #0x3b0]
00a41c08	ldr w16,[sp, #0x388]
00a41c0c	ldr w6,[sp, #0x3b4]
00a41c10	sub w3,w1,w2
00a41c14	str w3,[sp, #0x384]
00a41c18	ldr w3,[sp, #0x3d8]
00a41c1c	ldr w17,[sp, #0x38c]
00a41c20	ldr w19,[sp, #0x3b8]
00a41c24	ldr w13,[sp, #0x390]
00a41c28	sub w5,w3,w4
00a41c2c	str w5,[sp, #0x388]
00a41c30	ldr w5,[sp, #0x3dc]
00a41c34	ldr w30,[sp, #0x3bc]
00a41c38	ldr w12,[sp, #0x394]
00a41c3c	ldr w27,[sp, #0x3c0]
00a41c40	sub w7,w5,w6
00a41c44	str w7,[sp, #0x38c]
00a41c48	ldr w7,[sp, #0x3e0]
00a41c4c	add w18,w0,w18
00a41c50	str w18,[sp, #0x3a8]
00a41c54	ldr w18,[sp, #0x3f8]
00a41c58	sub w26,w7,w19
00a41c5c	str w26,[sp, #0x390]
00a41c60	ldr w26,[sp, #0x3e4]
00a41c64	add w0,w2,w1
00a41c68	lsl w14,w14,#0x1
00a41c6c	ldr w9,[sp, #0x398]
00a41c70	sub w25,w26,w30
00a41c74	str w25,[sp, #0x394]
00a41c78	ldr w25,[sp, #0x3e8]
00a41c7c	ldr w20,[sp, #0x3c4]
00a41c80	str w0,[sp, #0x3ac]
00a41c84	sub w0,w14,w18
00a41c88	sub w21,w25,w27
00a41c8c	str w21,[sp, #0x398]
00a41c90	ldr w21,[sp, #0x3ec]
00a41c94	str w0,[sp, #0x3d0]
00a41c98	ldr w0,[sp, #0x3fc]
00a41c9c	add w1,w4,w3
00a41ca0	sub w2,w21,w20
00a41ca4	lsl w15,w15,#0x1
00a41ca8	ldr w11,[sp, #0x39c]
00a41cac	str w2,[sp, #0x39c]
00a41cb0	ldr w2,[sp, #0x3f0]
00a41cb4	ldr w3,[sp, #0x3c8]
00a41cb8	str w1,[sp, #0x3b0]
00a41cbc	sub w1,w15,w0
00a41cc0	str w1,[sp, #0x3d4]
00a41cc4	ldr w1,[sp, #0x400]
00a41cc8	add w4,w6,w5
00a41ccc	add w5,w19,w7
00a41cd0	sub w7,w2,w3
00a41cd4	add w2,w3,w2
00a41cd8	lsl w16,w16,#0x1
00a41cdc	ldr w10,[sp, #0x3a0]
00a41ce0	str w7,[sp, #0x3a0]
00a41ce4	ldr w7,[sp, #0x3f4]
00a41ce8	ldr w19,[sp, #0x3cc]
00a41cec	str w2,[sp, #0x3c8]
00a41cf0	sub w2,w16,w1
00a41cf4	str w2,[sp, #0x3d8]
00a41cf8	ldr w2,[sp, #0x404]
00a41cfc	sub w3,w7,w19
00a41d00	lsl w17,w17,#0x1
00a41d04	ldr w8,[sp, #0x3a4]
00a41d08	str w3,[sp, #0x3a4]
00a41d0c	sub w3,w17,w2
00a41d10	str w3,[sp, #0x3dc]
00a41d14	ldr w3,[sp, #0x408]
00a41d18	lsl w13,w13,#0x1
00a41d1c	str w4,[sp, #0x3b4]
00a41d20	lsl w12,w12,#0x1
00a41d24	sub w4,w13,w3
00a41d28	str w4,[sp, #0x3e0]
00a41d2c	ldr w4,[sp, #0x40c]
00a41d30	add w14,w18,w14
00a41d34	lsl w9,w9,#0x1
00a41d38	add w15,w0,w15
00a41d3c	sub w18,w12,w4
00a41d40	str w18,[sp, #0x3e4]
00a41d44	ldr w18,[sp, #0x410]
00a41d48	lsl w11,w11,#0x1
00a41d4c	add w16,w1,w16
00a41d50	lsl w10,w10,#0x1
00a41d54	sub w0,w9,w18
00a41d58	str w0,[sp, #0x3e8]
00a41d5c	ldr w0,[sp, #0x414]
00a41d60	add w9,w18,w9
00a41d64	add w25,w27,w25
00a41d68	add w20,w20,w21
00a41d6c	sub w1,w11,w0
00a41d70	str w1,[sp, #0x3ec]
00a41d74	ldr w1,[sp, #0x418]
00a41d78	add w6,w30,w26
00a41d7c	ldp x26,x21,[sp, #0x98]
00a41d80	str w25,[sp, #0x3c0]
00a41d84	sub w18,w10,w1
00a41d88	str w18,[sp, #0x3f0]
00a41d8c	ldr w18,[sp, #0x41c]
00a41d90	ldp x25,x27,[sp, #0xa8]
00a41d94	str w20,[sp, #0x3c4]
00a41d98	ldr x20,[sp, #0xb8]
00a41d9c	lsl w8,w8,#0x1
00a41da0	add w7,w19,w7
00a41da4	add w17,w2,w17
00a41da8	add w13,w3,w13
00a41dac	add w12,w4,w12
00a41db0	add w11,w0,w11
00a41db4	add w10,w1,w10
00a41db8	sub w0,w8,w18
00a41dbc	add w8,w18,w8
00a41dc0	str w5,[sp, #0x3b8]
00a41dc4	str w6,[sp, #0x3bc]
00a41dc8	str w7,[sp, #0x3cc]
00a41dcc	str w0,[sp, #0x3f4]
00a41dd0	str w14,[sp, #0x3f8]
00a41dd4	str w15,[sp, #0x3fc]
00a41dd8	str w16,[sp, #0x400]
00a41ddc	str w17,[sp, #0x404]
00a41de0	str w13,[sp, #0x408]
00a41de4	str w12,[sp, #0x40c]
00a41de8	str w9,[sp, #0x410]
00a41dec	str w11,[sp, #0x414]
00a41df0	str w10,[sp, #0x418]
00a41df4	str w8,[sp, #0x41c]
00a41df8	add x8,sp,#0x920
00a41dfc	ldrsb w19,[x8, x28]
00a41e00	cmp w19,#0x1
00a41e04	b.lt 0x00a41e6c
00a41e08	add x0,sp,#0x2e0
00a41e0c	add x1,sp,#0x380
00a41e10	mov x2,x22
00a41e14	bl 0x00a44e38
00a41e18	mov x0,x25
00a41e1c	mov x1,x23
00a41e20	mov x2,x24
00a41e24	bl 0x00a44e38
00a41e28	mov x0,x27
00a41e2c	mov x1,x24
00a41e30	mov x2,x22
00a41e34	bl 0x00a44e38
00a41e38	add x1,sp,#0x380
00a41e3c	mov x0,x20
00a41e40	mov x2,x23
00a41e44	bl 0x00a44e38
00a41e48	adrp x9,0x760000
00a41e4c	ubfx w8,w19,#0x1,#0x7
00a41e50	add x9,x9,#0x498
00a41e54	orr w10,wzr,#0x78
00a41e58	umaddl x2,w8,w10,x9
00a41e5c	add x0,sp,#0x380
00a41e60	add x1,sp,#0x2e0
00a41e64	bl 0x00a45d34
00a41e68	b 0x00a42208
00a41e6c	tbz w19,#0x1f,0x00a42208
00a41e70	add x0,sp,#0x2e0
00a41e74	add x1,sp,#0x380
00a41e78	mov x2,x22
00a41e7c	bl 0x00a44e38
00a41e80	mov x0,x25
00a41e84	mov x1,x23
00a41e88	mov x2,x24
00a41e8c	bl 0x00a44e38
00a41e90	mov x0,x27
00a41e94	mov x1,x24
00a41e98	mov x2,x22
00a41e9c	bl 0x00a44e38
00a41ea0	add x1,sp,#0x380
00a41ea4	mov x0,x20
00a41ea8	mov x2,x23
00a41eac	bl 0x00a44e38
00a41eb0	ldr w9,[sp, #0x308]
00a41eb4	ldr w10,[sp, #0x2e0]
00a41eb8	ldr w11,[sp, #0x30c]
00a41ebc	ldr w12,[sp, #0x2e4]
00a41ec0	ldr w13,[sp, #0x310]
00a41ec4	ldr w14,[sp, #0x2e8]
00a41ec8	ldr w15,[sp, #0x314]
00a41ecc	ldr w16,[sp, #0x2ec]
00a41ed0	ldr w17,[sp, #0x318]
00a41ed4	ldr w18,[sp, #0x2f0]
00a41ed8	ldr w0,[sp, #0x31c]
00a41edc	ldr w1,[sp, #0x2f4]
00a41ee0	ldr w2,[sp, #0x320]
00a41ee4	ldr w3,[sp, #0x2f8]
00a41ee8	ldr w4,[sp, #0x324]
00a41eec	ldr w5,[sp, #0x2fc]
00a41ef0	ldr w6,[sp, #0x328]
00a41ef4	ldr w7,[sp, #0x300]
00a41ef8	ldr w20,[sp, #0x32c]
00a41efc	ldr w21,[sp, #0x304]
00a41f00	and w8,w19,#0x80
00a41f04	add w8,w19,w8, LSR #0x7
00a41f08	sxtb w8,w8
00a41f0c	add w19,w10,w9
00a41f10	sub w9,w9,w10
00a41f14	neg w8,w8, LSR #0x1
00a41f18	add w10,w12,w11
00a41f1c	sub w11,w11,w12
00a41f20	add w12,w14,w13
00a41f24	sub w13,w13,w14
00a41f28	add w14,w16,w15
00a41f2c	sub w15,w15,w16
00a41f30	add w16,w18,w17
00a41f34	sub w17,w17,w18
00a41f38	add w18,w1,w0
00a41f3c	sub w0,w0,w1
00a41f40	add w1,w3,w2
00a41f44	sub w2,w2,w3
00a41f48	add w3,w5,w4
00a41f4c	sub w4,w4,w5
00a41f50	add w5,w7,w6
00a41f54	sub w6,w6,w7
00a41f58	add w7,w21,w20
00a41f5c	sub w20,w20,w21
00a41f60	str w9,[sp, #0x3a8]
00a41f64	adrp x9,0x760000
00a41f68	sxtb x8,w8
00a41f6c	ldr x21,[sp, #0xa0]
00a41f70	str w10,[sp, #0x384]
00a41f74	str w20,[sp, #0x3cc]
00a41f78	ldr x20,[sp, #0xb8]
00a41f7c	add x9,x9,#0x498
00a41f80	orr w10,wzr,#0x78
00a41f84	madd x26,x8,x10,x9
00a41f88	str w1,[sp, #0x398]
00a41f8c	str w0,[sp, #0x3bc]
00a41f90	str w2,[sp, #0x3c0]
00a41f94	add x2,x26,#0x28
00a41f98	add x1,sp,#0x380
00a41f9c	mov x0,x24
00a41fa0	str w19,[sp, #0x380]
00a41fa4	str w12,[sp, #0x388]
00a41fa8	str w14,[sp, #0x38c]
00a41fac	str w16,[sp, #0x390]
00a41fb0	str w18,[sp, #0x394]
00a41fb4	str w3,[sp, #0x39c]
00a41fb8	str w5,[sp, #0x3a0]
00a41fbc	str w7,[sp, #0x3a4]
00a41fc0	str w11,[sp, #0x3ac]
00a41fc4	str w13,[sp, #0x3b0]
00a41fc8	str w15,[sp, #0x3b4]
00a41fcc	str w17,[sp, #0x3b8]
00a41fd0	str w4,[sp, #0x3c4]
00a41fd4	str w6,[sp, #0x3c8]
00a41fd8	bl 0x00a44e38
00a41fdc	mov x0,x23
00a41fe0	mov x1,x23
00a41fe4	mov x2,x26
00a41fe8	bl 0x00a44e38
00a41fec	add x1,x26,#0x50
00a41ff0	ldr x26,[sp, #0x98]
00a41ff4	mov x0,x22
00a41ff8	mov x2,x20
00a41ffc	bl 0x00a44e38
00a42000	ldr w8,[sp, #0x3d0]
00a42004	ldr w9,[sp, #0x3a8]
00a42008	ldr w11,[sp, #0x3ac]
00a4200c	ldr w13,[sp, #0x3b0]
00a42010	ldr w15,[sp, #0x3b4]
00a42014	sub w10,w8,w9
00a42018	str w10,[sp, #0x380]
00a4201c	ldr w10,[sp, #0x3d4]
00a42020	ldr w17,[sp, #0x3b8]
00a42024	ldr w0,[sp, #0x3bc]
00a42028	ldr w2,[sp, #0x3c0]
00a4202c	sub w12,w10,w11
00a42030	str w12,[sp, #0x384]
00a42034	ldr w12,[sp, #0x3d8]
00a42038	add w8,w9,w8
00a4203c	ldr w3,[sp, #0x3c4]
00a42040	add w10,w11,w10
00a42044	sub w14,w12,w13
00a42048	str w14,[sp, #0x388]
00a4204c	ldr w14,[sp, #0x3dc]
00a42050	add w11,w13,w12
00a42054	str w8,[sp, #0x3a8]
00a42058	ldr w8,[sp, #0x3f8]
00a4205c	sub w16,w14,w15
00a42060	str w16,[sp, #0x38c]
00a42064	ldr w16,[sp, #0x3e0]
00a42068	add w12,w15,w14
00a4206c	str w10,[sp, #0x3ac]
00a42070	ldr w14,[sp, #0x3c8]
00a42074	sub w18,w16,w17
00a42078	str w18,[sp, #0x390]
00a4207c	ldr w18,[sp, #0x3e4]
00a42080	add w15,w17,w16
00a42084	str w11,[sp, #0x3b0]
00a42088	str w12,[sp, #0x3b4]
00a4208c	sub w1,w18,w0
00a42090	str w1,[sp, #0x394]
00a42094	ldr w1,[sp, #0x3e8]
00a42098	add w16,w0,w18
00a4209c	ldr w0,[sp, #0x3cc]
00a420a0	ldr w12,[sp, #0x338]
00a420a4	sub w9,w1,w2
00a420a8	str w9,[sp, #0x398]
00a420ac	ldr w9,[sp, #0x3ec]
00a420b0	add w17,w2,w1
00a420b4	ldr w1,[sp, #0x330]
00a420b8	lsl w12,w12,#0x1
00a420bc	sub w13,w9,w3
00a420c0	add w9,w3,w9
00a420c4	lsl w10,w1,#0x1
00a420c8	str w13,[sp, #0x39c]
00a420cc	ldr w13,[sp, #0x3f0]
00a420d0	str w9,[sp, #0x3c4]
00a420d4	ldr w9,[sp, #0x334]
00a420d8	sub w11,w10,w8
00a420dc	str w11,[sp, #0x3d0]
00a420e0	ldr w11,[sp, #0x3fc]
00a420e4	sub w18,w13,w14
00a420e8	add w13,w14,w13
00a420ec	lsl w9,w9,#0x1
00a420f0	str w18,[sp, #0x3a0]
00a420f4	ldr w18,[sp, #0x3f4]
00a420f8	str w13,[sp, #0x3c8]
00a420fc	sub w13,w9,w11
00a42100	str w13,[sp, #0x3d4]
00a42104	ldr w13,[sp, #0x400]
00a42108	sub w14,w18,w0
00a4210c	str w14,[sp, #0x3a4]
00a42110	str w16,[sp, #0x3bc]
00a42114	ldr w14,[sp, #0x33c]
00a42118	sub w16,w12,w13
00a4211c	str w16,[sp, #0x3d8]
00a42120	ldr w16,[sp, #0x404]
00a42124	lsl w14,w14,#0x1
00a42128	add w18,w0,w18
00a4212c	str w15,[sp, #0x3b8]
00a42130	ldr w15,[sp, #0x340]
00a42134	sub w0,w14,w16
00a42138	str w0,[sp, #0x3dc]
00a4213c	ldr w0,[sp, #0x408]
00a42140	lsl w15,w15,#0x1
00a42144	str w17,[sp, #0x3c0]
00a42148	ldr w17,[sp, #0x344]
00a4214c	add w8,w8,w10
00a42150	sub w10,w15,w0
00a42154	str w10,[sp, #0x3e0]
00a42158	ldr w10,[sp, #0x40c]
00a4215c	lsl w17,w17,#0x1
00a42160	str w18,[sp, #0x3cc]
00a42164	ldr w18,[sp, #0x348]
00a42168	add w9,w11,w9
00a4216c	add w11,w13,w12
00a42170	sub w12,w17,w10
00a42174	str w12,[sp, #0x3e4]
00a42178	ldr w12,[sp, #0x410]
00a4217c	lsl w18,w18,#0x1
00a42180	ldr w1,[sp, #0x34c]
00a42184	add w14,w16,w14
00a42188	sub w16,w18,w12
00a4218c	str w16,[sp, #0x3e8]
00a42190	ldr w16,[sp, #0x414]
00a42194	lsl w1,w1,#0x1
00a42198	ldr w13,[sp, #0x350]
00a4219c	add w10,w10,w17
00a421a0	sub w17,w1,w16
00a421a4	str w17,[sp, #0x3ec]
00a421a8	ldr w17,[sp, #0x418]
00a421ac	lsl w13,w13,#0x1
00a421b0	add w15,w0,w15
00a421b4	ldr w0,[sp, #0x354]
00a421b8	add w12,w12,w18
00a421bc	sub w18,w13,w17
00a421c0	str w18,[sp, #0x3f0]
00a421c4	ldr w18,[sp, #0x41c]
00a421c8	lsl w0,w0,#0x1
00a421cc	add w16,w16,w1
00a421d0	add w13,w17,w13
00a421d4	sub w17,w0,w18
00a421d8	add w18,w18,w0
00a421dc	str w17,[sp, #0x3f4]
00a421e0	str w8,[sp, #0x3f8]
00a421e4	str w9,[sp, #0x3fc]
00a421e8	str w11,[sp, #0x400]
00a421ec	str w14,[sp, #0x404]
00a421f0	str w15,[sp, #0x408]
00a421f4	str w10,[sp, #0x40c]
00a421f8	str w12,[sp, #0x410]
00a421fc	str w16,[sp, #0x414]
00a42200	str w13,[sp, #0x418]
00a42204	str w18,[sp, #0x41c]
00a42208	add x0,sp,#0x100
00a4220c	add x1,sp,#0x380
00a42210	mov x2,x22
00a42214	bl 0x00a44e38
00a42218	mov x0,x26
00a4221c	mov x1,x23
00a42220	mov x2,x24
00a42224	bl 0x00a44e38
00a42228	mov x0,x21
00a4222c	mov x1,x24
00a42230	mov x2,x22
00a42234	bl 0x00a44e38
00a42238	cmp x28,#0x0
00a4223c	sub x28,x28,#0x1
00a42240	b.gt 0x00a419d0
00a42244	add x0,sp,#0x420
00a42248	mov x1,x21
00a4224c	bl 0x00a44a70
00a42250	add x0,sp,#0xa20
00a42254	add x1,sp,#0x100
00a42258	add x2,sp,#0x420
00a4225c	bl 0x00a44e38
00a42260	add x0,sp,#0x920
00a42264	add x2,sp,#0x420
00a42268	mov x1,x26
00a4226c	bl 0x00a44e38
00a42270	add x0,sp,#0x380
00a42274	add x1,sp,#0x920
00a42278	bl 0x00a45158
00a4227c	add x0,sp,#0x220
00a42280	add x1,sp,#0xa20
00a42284	bl 0x00a45158
00a42288	ldrb w8,[sp, #0x220]
00a4228c	ldrb w9,[sp, #0x39f]
00a42290	ldr x1,[sp, #0x20]
00a42294	add x0,sp,#0x380
00a42298	mov w2,#0x20
00a4229c	eor w8,w9,w8, LSL #0x7
00a422a0	strb w8,[sp, #0x39f]
00a422a4	bl 0x00c362f0
00a422a8	ldp x27,x21,[sp, #0x88]
00a422ac	cmp w0,#0x0
00a422b0	cset w25,eq
00a422b4	b 0x00a422c4
00a422b8	mov w25,wzr
00a422bc	b 0x00a422d4
00a422c0	mov w25,wzr
00a422c4	mov x0,x21
00a422c8	bl 0x00c35800
00a422cc	mov x0,x27
00a422d0	bl 0x00c31f90
00a422d4	mov w0,w25
00a422d8	add sp,sp,#0xb30
00a422dc	ldp x29,x30,[sp, #0x50]
00a422e0	ldp x20,x19,[sp, #0x40]
00a422e4	ldp x22,x21,[sp, #0x30]
00a422e8	ldp x24,x23,[sp, #0x20]
00a422ec	ldp x26,x25,[sp, #0x10]
00a422f0	ldp x28,x27,[sp], #0x60
00a422f4	ret
00a422f8	mov w25,wzr
00a422fc	b.ne 0x00a422d4
00a42300	ldrb w8,[x19, #0x2e]
00a42304	cmp w8,#0xde
00a42308	b.cc 0x00a40108
00a4230c	mov w25,wzr
00a42310	b.ne 0x00a422d4
00a42314	ldrb w8,[x19, #0x2d]
00a42318	cmp w8,#0xf9
00a4231c	b.cc 0x00a40108
00a42320	mov w25,wzr
00a42324	b.ne 0x00a422d4
00a42328	ldrb w8,[x19, #0x2c]
00a4232c	cmp w8,#0xde
00a42330	b.cc 0x00a40108
00a42334	mov w25,wzr
00a42338	b.ne 0x00a422d4
00a4233c	ldrb w8,[x19, #0x2b]
00a42340	cmp w8,#0xa2
00a42344	b.cc 0x00a40108
00a42348	mov w25,wzr
00a4234c	b.ne 0x00a422d4
00a42350	ldrb w8,[x19, #0x2a]
00a42354	cmp w8,#0xf7
00a42358	b.cc 0x00a40108
00a4235c	mov w25,wzr
00a42360	b.ne 0x00a422d4
00a42364	ldrb w8,[x19, #0x29]
00a42368	cmp w8,#0x9c
00a4236c	b.cc 0x00a40108
00a42370	mov w25,wzr
00a42374	b.ne 0x00a422d4
00a42378	ldrb w8,[x19, #0x28]
00a4237c	cmp w8,#0xd6
00a42380	b.cc 0x00a40108
00a42384	mov w25,wzr
00a42388	b.ne 0x00a422d4
00a4238c	ldrb w8,[x19, #0x27]
00a42390	cmp w8,#0x58
00a42394	b.cc 0x00a40108
00a42398	mov w25,wzr
00a4239c	b.ne 0x00a422d4
00a423a0	ldrb w8,[x19, #0x26]
00a423a4	cmp w8,#0x12
00a423a8	b.cc 0x00a40108
00a423ac	mov w25,wzr
00a423b0	b.ne 0x00a422d4
00a423b4	ldrb w8,[x19, #0x25]
00a423b8	cmp w8,#0x63
00a423bc	b.cc 0x00a40108
00a423c0	mov w25,wzr
00a423c4	b.ne 0x00a422d4
00a423c8	ldrb w8,[x19, #0x24]
00a423cc	cmp w8,#0x1a
00a423d0	b.cc 0x00a40108
00a423d4	mov w25,wzr
00a423d8	b.ne 0x00a422d4
00a423dc	ldrb w8,[x19, #0x23]
00a423e0	cmp w8,#0x5c
00a423e4	b.cc 0x00a40108
00a423e8	mov w25,wzr
00a423ec	b.ne 0x00a422d4
00a423f0	ldrb w8,[x19, #0x22]
00a423f4	cmp w8,#0xf5
00a423f8	b.cc 0x00a40108
00a423fc	mov w25,wzr
00a42400	b.ne 0x00a422d4
00a42404	ldrb w8,[x19, #0x21]
00a42408	cmp w8,#0xd3
00a4240c	b.cc 0x00a40108
00a42410	mov w25,wzr
00a42414	b.ne 0x00a422d4
00a42418	ldrb w8,[x22]
00a4241c	mov w25,wzr
00a42420	cmp w8,#0xed
00a42424	b.cc 0x00a40108
00a42428	b 0x00a422d4
