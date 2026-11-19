; RSA_padding_check_PKCS1_OAEP_mgf1 @ 00ad5424
00ad5424	sub sp,sp,#0x130
00ad5428	stp x29,x30,[sp, #0x120]
00ad542c	add x29,sp,#0x120
00ad5430	stp x22,x21,[sp, #0x100]
00ad5434	ldr x21,[x29, #0x10]
00ad5438	stp x28,x27,[sp, #0xd0]
00ad543c	stp x26,x25,[sp, #0xe0]
00ad5440	stp x24,x23,[sp, #0xf0]
00ad5444	stp x20,x19,[sp, #0x110]
00ad5448	mov x28,x7
00ad544c	mov w24,w6
00ad5450	mov x27,x5
00ad5454	mov w23,w4
00ad5458	mov w19,w3
00ad545c	mov x20,x2
00ad5460	mov w26,w1
00ad5464	mov x22,x0
00ad5468	cbnz x7,0x00ad5474
00ad546c	bl 0x00c324d0
00ad5470	mov x28,x0
00ad5474	cmp x21,#0x0
00ad5478	mov x0,x28
00ad547c	csel x21,x28,x21,eq
00ad5480	bl 0x00c34c20
00ad5484	mov w25,w0
00ad5488	cmp w26,#0x1
00ad548c	mov w0,#0xffffffff
00ad5490	b.lt 0x00ad5774
00ad5494	cmp w19,#0x1
00ad5498	b.lt 0x00ad5774
00ad549c	cmp w23,w19
00ad54a0	b.lt 0x00ad54b4
00ad54a4	lsl w8,w25,#0x1
00ad54a8	add w8,w8,#0x2
00ad54ac	cmp w8,w23
00ad54b0	b.le 0x00ad54e8
00ad54b4	bl 0x00c342a0
00ad54b8	adrp x0,0x2c0000
00ad54bc	adrp x2,0x2cc000
00ad54c0	add x0,x0,#0x4f9
00ad54c4	add x2,x2,#0x55
00ad54c8	mov w1,#0xc8
00ad54cc	bl 0x00c342b0
00ad54d0	mov w0,#0x4
00ad54d4	mov w1,#0x79
00ad54d8	mov x2,xzr
00ad54dc	bl 0x00c342c0
00ad54e0	mov w0,#0xffffffff
00ad54e4	b 0x00ad5774
00ad54e8	sub w8,w23,w25
00ad54ec	str w8,[sp, #0x24]
00ad54f0	sub w8,w8,#0x1
00ad54f4	adrp x1,0x2c0000
00ad54f8	sxtw x0,w8
00ad54fc	add x1,x1,#0x4f9
00ad5500	mov w2,#0xcd
00ad5504	str x0,[sp, #0x38]
00ad5508	bl 0x00c32320
00ad550c	str x0,[sp, #0x30]
00ad5510	cbz x0,0x00ad5588
00ad5514	adrp x1,0x2c0000
00ad5518	sxtw x0,w23
00ad551c	add x1,x1,#0x4f9
00ad5520	mov w2,#0xd3
00ad5524	str x0,[sp, #0x28]
00ad5528	bl 0x00c32320
00ad552c	cbz x0,0x00ad55c8
00ad5530	subs w11,w23,#0x1
00ad5534	stp x11,x27,[sp]
00ad5538	b.lt 0x00ad5608
00ad553c	ldr x9,[sp, #0x28]
00ad5540	add x8,x20,w19, SXTW 
00ad5544	mov w12,w23
00ad5548	sub x10,x9,#0x1
00ad554c	sub x9,x10,x11
00ad5550	add x10,x0,x10
00ad5554	mov w11,#0x1
00ad5558	sub w13,w19,#0x1
00ad555c	bic w13,w13,w19
00ad5560	bic w14,w11,w13, ASR #0x1f
00ad5564	sub x8,x8,x14
00ad5568	ldrb w15,[x8]
00ad556c	sub w19,w19,w14
00ad5570	subs w12,w12,#0x1
00ad5574	bic w13,w15,w13, ASR #0x1f
00ad5578	strb w13,[x10], #-0x1
00ad557c	b.ne 0x00ad5558
00ad5580	add x19,x0,x9
00ad5584	b 0x00ad5610
00ad5588	bl 0x00c342a0
00ad558c	adrp x0,0x2c0000
00ad5590	adrp x2,0x2cc000
00ad5594	add x0,x0,#0x4f9
00ad5598	add x2,x2,#0x55
00ad559c	mov w1,#0xcf
00ad55a0	bl 0x00c342b0
00ad55a4	mov w1,#0x100
00ad55a8	mov w0,#0x4
00ad55ac	movk w1,#0xc, LSL #16
00ad55b0	mov x2,xzr
00ad55b4	bl 0x00c342c0
00ad55b8	mov w20,wzr
00ad55bc	mov x22,xzr
00ad55c0	sxtw x28,w23
00ad55c4	b 0x00ad571c
00ad55c8	bl 0x00c342a0
00ad55cc	adrp x0,0x2c0000
00ad55d0	adrp x2,0x2cc000
00ad55d4	add x0,x0,#0x4f9
00ad55d8	add x2,x2,#0x55
00ad55dc	mov w1,#0xd5
00ad55e0	bl 0x00c342b0
00ad55e4	mov w1,#0x100
00ad55e8	mov w0,#0x4
00ad55ec	movk w1,#0xc, LSL #16
00ad55f0	mov x2,xzr
00ad55f4	bl 0x00c342c0
00ad55f8	ldr x28,[sp, #0x28]
00ad55fc	mov w20,wzr
00ad5600	mov x22,xzr
00ad5604	b 0x00ad571c
00ad5608	ldr x8,[sp, #0x28]
00ad560c	add x19,x0,x8
00ad5610	str x19,[sp, #0x18]
00ad5614	ldr x3,[sp, #0x38]
00ad5618	ldrb w8,[x19], #0x1
00ad561c	sxtw x20,w25
00ad5620	add x0,sp,#0x84
00ad5624	mov x1,x20
00ad5628	sub w8,w8,#0x1
00ad562c	add x27,x19,x20
00ad5630	asr w8,w8,#0x1f
00ad5634	mov x2,x27
00ad5638	mov x4,x21
00ad563c	str w8,[sp, #0x14]
00ad5640	bl 0x00ad5268
00ad5644	cbnz w0,0x00ad5710
00ad5648	ldp x0,x1,[sp, #0x30]
00ad564c	cmp w25,#0x1
00ad5650	b.lt 0x00ad56fc
00ad5654	mov x9,xzr
00ad5658	cmp w25,#0x20
00ad565c	mov w8,w25
00ad5660	b.cc 0x00ad56cc
00ad5664	ldr x9,[sp, #0x18]
00ad5668	add x11,sp,#0x84
00ad566c	add x9,x9,x8
00ad5670	add x9,x9,#0x1
00ad5674	cmp x11,x9
00ad5678	b.cs 0x00ad568c
00ad567c	add x9,x11,x8
00ad5680	cmp x19,x9
00ad5684	mov x9,xzr
00ad5688	b.cc 0x00ad56cc
00ad568c	ldr x10,[sp, #0x18]
00ad5690	and x9,x8,#0xffffffe0
00ad5694	add x11,x11,#0x10
00ad5698	mov x12,x9
00ad569c	add x10,x10,#0x11
00ad56a0	ldp q0,q1,[x10, #-0x10]
00ad56a4	ldp q2,q3,[x11, #-0x10]
00ad56a8	add x10,x10,#0x20
00ad56ac	subs x12,x12,#0x20
00ad56b0	eor v0.16B,v2.16B,v0.16B
00ad56b4	eor v1.16B,v3.16B,v1.16B
00ad56b8	stp q0,q1,[x11, #-0x10]
00ad56bc	add x11,x11,#0x20
00ad56c0	b.ne 0x00ad56a0
00ad56c4	cmp x9,x8
00ad56c8	b.eq 0x00ad56fc
00ad56cc	ldr x11,[sp, #0x18]
00ad56d0	add x10,sp,#0x84
00ad56d4	add x10,x10,x9
00ad56d8	sub x8,x8,x9
00ad56dc	add x11,x11,x9
00ad56e0	add x11,x11,#0x1
00ad56e4	ldrb w9,[x11], #0x1
00ad56e8	ldrb w12,[x10]
00ad56ec	subs x8,x8,#0x1
00ad56f0	eor w9,w12,w9
00ad56f4	strb w9,[x10], #0x1
00ad56f8	b.ne 0x00ad56e4
00ad56fc	add x2,sp,#0x84
00ad5700	mov x3,x20
00ad5704	mov x4,x21
00ad5708	bl 0x00ad5268
00ad570c	cbz w0,0x00ad5794
00ad5710	ldr x28,[sp, #0x28]
00ad5714	ldr x22,[sp, #0x18]
00ad5718	ldr w20,[sp, #0x14]
00ad571c	mov w21,#0xffffffff
00ad5720	add x0,sp,#0x84
00ad5724	mov w1,#0x40
00ad5728	bl 0x00c34750
00ad572c	ldp x0,x1,[sp, #0x30]
00ad5730	adrp x19,0x2c0000
00ad5734	add x19,x19,#0x4f9
00ad5738	mov w3,#0x13f
00ad573c	mov x2,x19
00ad5740	bl 0x00c345e0
00ad5744	mov w3,#0x140
00ad5748	mov x0,x22
00ad574c	mov x1,x28
00ad5750	mov x2,x19
00ad5754	bl 0x00c345e0
00ad5758	stur w20,[x29, #-0x5c]
00ad575c	mvn w8,w20
00ad5760	ldur w9,[x29, #-0x5c]
00ad5764	stur w8,[x29, #-0x5c]
00ad5768	ldur w8,[x29, #-0x5c]
00ad576c	and w9,w9,w21
00ad5770	orr w0,w8,w9
00ad5774	ldp x29,x30,[sp, #0x120]
00ad5778	ldp x20,x19,[sp, #0x110]
00ad577c	ldp x22,x21,[sp, #0x100]
00ad5780	ldp x24,x23,[sp, #0xf0]
00ad5784	ldp x26,x25,[sp, #0xe0]
00ad5788	ldp x28,x27,[sp, #0xd0]
00ad578c	add sp,sp,#0x130
00ad5790	ret
00ad5794	ldr w8,[sp, #0x24]
00ad5798	ldp x14,x13,[sp, #0x30]
00ad579c	subs w19,w8,#0x2
00ad57a0	b.lt 0x00ad5854
00ad57a4	cmp x13,#0x1
00ad57a8	csinc x9,x13,xzr,gt
00ad57ac	cmp x9,#0x20
00ad57b0	mov x8,xzr
00ad57b4	b.cc 0x00ad582c
00ad57b8	ldr x11,[sp, #0x18]
00ad57bc	cmp x13,#0x1
00ad57c0	csinc x8,x13,xzr,gt
00ad57c4	add x10,x8,x20
00ad57c8	add x10,x11,x10
00ad57cc	add x10,x10,#0x1
00ad57d0	cmp x14,x10
00ad57d4	b.cs 0x00ad57e8
00ad57d8	add x8,x14,x8
00ad57dc	cmp x27,x8
00ad57e0	mov x8,xzr
00ad57e4	b.cc 0x00ad582c
00ad57e8	ldr x10,[sp, #0x18]
00ad57ec	and x8,x9,#0x7fffffffffffffe0
00ad57f0	add x11,x14,#0x10
00ad57f4	mov x12,x8
00ad57f8	add x10,x10,x20
00ad57fc	add x10,x10,#0x11
00ad5800	ldp q0,q1,[x10, #-0x10]
00ad5804	ldp q2,q3,[x11, #-0x10]
00ad5808	add x10,x10,#0x20
00ad580c	subs x12,x12,#0x20
00ad5810	eor v0.16B,v2.16B,v0.16B
00ad5814	eor v1.16B,v3.16B,v1.16B
00ad5818	stp q0,q1,[x11, #-0x10]
00ad581c	add x11,x11,#0x20
00ad5820	b.ne 0x00ad5800
00ad5824	cmp x9,x8
00ad5828	b.eq 0x00ad5854
00ad582c	ldr x9,[sp, #0x18]
00ad5830	add x9,x9,x20
00ad5834	add x10,x9,x8
00ad5838	ldrb w11,[x14, x8]
00ad583c	ldrb w10,[x10, #0x1]
00ad5840	eor w10,w11,w10
00ad5844	strb w10,[x14, x8]
00ad5848	add x8,x8,#0x1
00ad584c	cmp x8,x13
00ad5850	b.lt 0x00ad5834
00ad5854	ldr x0,[sp, #0x8]
00ad5858	sxtw x1,w24
00ad585c	add x2,sp,#0x44
00ad5860	mov x3,xzr
00ad5864	mov x4,x28
00ad5868	mov x5,xzr
00ad586c	bl 0x00c370c0
00ad5870	cbz w0,0x00ad5710
00ad5874	ldr x21,[sp, #0x30]
00ad5878	add x1,sp,#0x44
00ad587c	mov x2,x20
00ad5880	mov x0,x21
00ad5884	bl 0x00c362f0
00ad5888	ldr x24,[sp, #0x38]
00ad588c	ldr w9,[sp, #0x14]
00ad5890	sub w8,w0,#0x1
00ad5894	bic w8,w8,w0
00ad5898	cmp w24,w25
00ad589c	and w9,w9,w8, ASR #0x1f
00ad58a0	b.le 0x00ad5918
00ad58a4	ldr x12,[sp]
00ad58a8	ldr x28,[sp, #0x28]
00ad58ac	mov w10,wzr
00ad58b0	mov w8,wzr
00ad58b4	add x11,x21,x20
00ad58b8	sub w12,w12,w25, LSL #0x1
00ad58bc	mov w13,w25
00ad58c0	mov x27,x21
00ad58c4	ldrb w14,[x11], #0x1
00ad58c8	subs w12,w12,#0x1
00ad58cc	eor w15,w14,#0x1
00ad58d0	sub w15,w15,#0x1
00ad58d4	asr w15,w15,#0x1f
00ad58d8	bic w16,w15,w10
00ad58dc	orr w10,w15,w10
00ad58e0	stur w16,[x29, #-0x5c]
00ad58e4	mvn w15,w16
00ad58e8	ldur w16,[x29, #-0x5c]
00ad58ec	stur w15,[x29, #-0x5c]
00ad58f0	ldur w15,[x29, #-0x5c]
00ad58f4	sub w14,w14,#0x1
00ad58f8	orr w14,w10,w14, ASR #0x1f
00ad58fc	and w9,w14,w9
00ad5900	and w14,w16,w13
00ad5904	and w8,w15,w8
00ad5908	orr w8,w8,w14
00ad590c	add w13,w13,#0x1
00ad5910	b.ne 0x00ad58c4
00ad5914	b 0x00ad5928
00ad5918	ldr x28,[sp, #0x28]
00ad591c	mov w8,wzr
00ad5920	mov w10,wzr
00ad5924	mov x27,x21
00ad5928	sub w11,w24,w25
00ad592c	and w9,w10,w9
00ad5930	sub w10,w11,#0x1
00ad5934	sub w15,w10,w26
00ad5938	eor w14,w10,w26
00ad593c	eor w15,w15,w26
00ad5940	orr w14,w15,w14
00ad5944	eor w14,w14,w10
00ad5948	asr w14,w14,#0x1f
00ad594c	stur w14,[x29, #-0x5c]
00ad5950	mvn w14,w14
00ad5954	ldur w15,[x29, #-0x5c]
00ad5958	stur w14,[x29, #-0x5c]
00ad595c	ldur w14,[x29, #-0x5c]
00ad5960	sub w21,w19,w8
00ad5964	sub w13,w26,w21
00ad5968	eor w12,w21,w26
00ad596c	eor w13,w13,w21
00ad5970	orr w12,w13,w12
00ad5974	and w13,w15,w10
00ad5978	and w14,w14,w26
00ad597c	eor w12,w12,w26
00ad5980	cmp w11,#0x3
00ad5984	orr w11,w14,w13
00ad5988	b.lt 0x00ad5a18
00ad598c	add w14,w25,#0x1
00ad5990	sub w17,w23,#0x2
00ad5994	sub w13,w10,w21
00ad5998	mov w15,#0x1
00ad599c	add x16,x27,w14, SXTW 
00ad59a0	sub w17,w17,w25, LSL #0x1
00ad59a4	orr w18,wzr,#0xff
00ad59a8	sub w0,w24,w15
00ad59ac	cmp w14,w0
00ad59b0	b.ge 0x00ad5a0c
00ad59b4	and w1,w15,w13
00ad59b8	eor w2,w1,#0x80000000
00ad59bc	sub w1,w1,#0x1
00ad59c0	and w1,w1,w2
00ad59c4	asr w2,w1,#0x1f
00ad59c8	sxtw x0,w15
00ad59cc	bic w1,w18,w1, ASR #0x1f
00ad59d0	orr w2,w2,#0xffffff00
00ad59d4	sub w3,w17,w15
00ad59d8	mov x4,x16
00ad59dc	ldrb w5,[x4, x0]
00ad59e0	ldrb w6,[x4]
00ad59e4	stur w1,[x29, #-0x5c]
00ad59e8	ldur w7,[x29, #-0x5c]
00ad59ec	stur w2,[x29, #-0x5c]
00ad59f0	ldur w19,[x29, #-0x5c]
00ad59f4	subs w3,w3,#0x1
00ad59f8	and w5,w7,w5
00ad59fc	and w6,w19,w6
00ad5a00	orr w5,w6,w5
00ad5a04	strb w5,[x4], #0x1
00ad5a08	b.ne 0x00ad59dc
00ad5a0c	lsl w15,w15,#0x1
00ad5a10	cmp w15,w10
00ad5a14	b.lt 0x00ad59a8
00ad5a18	cmp w11,#0x1
00ad5a1c	bic w20,w9,w12, ASR #0x1f
00ad5a20	b.lt 0x00ad5a7c
00ad5a24	and w9,w20,#0xff
00ad5a28	mov w10,w11
00ad5a2c	sub w8,w8,w23
00ad5a30	add w11,w25,#0x1
00ad5a34	add w12,w8,w11
00ad5a38	add w12,w12,#0x1
00ad5a3c	orr w12,w12,w21
00ad5a40	and w12,w9,w12, ASR #0x1f
00ad5a44	ldrb w13,[x27, w11, SXTW ]
00ad5a48	ldrb w14,[x22]
00ad5a4c	stur w12,[x29, #-0x5c]
00ad5a50	mvn w12,w12
00ad5a54	ldur w15,[x29, #-0x5c]
00ad5a58	stur w12,[x29, #-0x5c]
00ad5a5c	ldur w12,[x29, #-0x5c]
00ad5a60	subs x10,x10,#0x1
00ad5a64	and w13,w15,w13
00ad5a68	add w11,w11,#0x1
00ad5a6c	and w12,w12,w14
00ad5a70	orr w12,w12,w13
00ad5a74	strb w12,[x22], #0x1
00ad5a78	b.ne 0x00ad5a34
00ad5a7c	bl 0x00c342a0
00ad5a80	adrp x0,0x2c0000
00ad5a84	adrp x2,0x2cc000
00ad5a88	add x0,x0,#0x4f9
00ad5a8c	add x2,x2,#0x55
00ad5a90	mov w1,#0x13a
00ad5a94	bl 0x00c342b0
00ad5a98	mov w0,#0x4
00ad5a9c	mov w1,#0x79
00ad5aa0	mov x2,xzr
00ad5aa4	bl 0x00c342c0
00ad5aa8	and w0,w20,#0x1
00ad5aac	bl 0x00c3be60
00ad5ab0	ldr x22,[sp, #0x18]
00ad5ab4	b 0x00ad5720
