; FUN_00bb91ac @ 00bb91ac
00bb91ac	str x21,[sp, #-0x20]!
00bb91b0	stp x20,x19,[sp, #0x10]
00bb91b4	sub w8,w4,w3
00bb91b8	mov w9,#0x1
00bb91bc	lsl w8,w9,w8
00bb91c0	cmp w8,#0x3
00bb91c4	b.gt 0x00bb9238
00bb91c8	cmp w8,#0x1
00bb91cc	b.eq 0x00bb9368
00bb91d0	cmp w8,#0x2
00bb91d4	b.ne 0x00bb92b4
00bb91d8	cmp x1,x2
00bb91dc	b.eq 0x00bb9428
00bb91e0	lsl w8,w6,#0x18
00bb91e4	sub x10,x2,x1
00bb91e8	and w9,w5,#0xffff
00bb91ec	cmp x10,#0x3
00bb91f0	add w8,w8,w3, LSL #0x10
00bb91f4	b.ls 0x00bb920c
00bb91f8	cmp x0,x2
00bb91fc	b.cs 0x00bb9434
00bb9200	add x11,x0,x10, LSL #0x3
00bb9204	cmp x1,x11
00bb9208	b.cs 0x00bb9434
00bb920c	mov x12,x0
00bb9210	mov x13,x1
00bb9214	ldrb w10,[x13], #0x1
00bb9218	cmp w6,#0x1
00bb921c	orr w11,w9,w10, LSL #0x8
00bb9220	csel w10,w10,w11,eq
00bb9224	cmp x13,x2
00bb9228	orr w10,w10,w8
00bb922c	stp w10,w10,[x12], #0x8
00bb9230	b.ne 0x00bb9214
00bb9234	b 0x00bb9428
00bb9238	cmp w8,#0x4
00bb923c	b.eq 0x00bb93c8
00bb9240	cmp w8,#0x8
00bb9244	b.ne 0x00bb92b4
00bb9248	cmp x1,x2
00bb924c	b.eq 0x00bb9428
00bb9250	lsl w8,w6,#0x18
00bb9254	sub x10,x2,x1
00bb9258	and w9,w5,#0xffff
00bb925c	cmp x10,#0x3
00bb9260	add w8,w8,w3, LSL #0x10
00bb9264	b.ls 0x00bb927c
00bb9268	cmp x0,x2
00bb926c	b.cs 0x00bb944c
00bb9270	add x11,x0,x10, LSL #0x5
00bb9274	cmp x1,x11
00bb9278	b.cs 0x00bb944c
00bb927c	mov x12,x0
00bb9280	mov x13,x1
00bb9284	ldrb w10,[x13], #0x1
00bb9288	cmp w6,#0x1
00bb928c	orr w11,w9,w10, LSL #0x8
00bb9290	csel w10,w10,w11,eq
00bb9294	cmp x13,x2
00bb9298	orr w10,w10,w8
00bb929c	orr x10,x10,x10, LSL #0x20
00bb92a0	stp x10,x10,[x12]
00bb92a4	stp x10,x10,[x12, #0x10]
00bb92a8	add x12,x12,#0x20
00bb92ac	b.ne 0x00bb9284
00bb92b0	b 0x00bb9428
00bb92b4	cmp x1,x2
00bb92b8	b.eq 0x00bb9428
00bb92bc	ubfiz x9,x8,#0x2,#0x20
00bb92c0	lsl w12,w6,#0x18
00bb92c4	and w14,w5,#0xffff
00bb92c8	mov x15,x0
00bb92cc	sub x9,x9,#0x20
00bb92d0	add w12,w12,w3, LSL #0x10
00bb92d4	lsr x10,x9,#0x5
00bb92d8	add x10,x10,#0x1
00bb92dc	and x11,x10,#0xffffffffffffffc
00bb92e0	lsl x13,x11,#0x5
00bb92e4	b 0x00bb92f8
00bb92e8	add x1,x1,#0x1
00bb92ec	mov x0,x15
00bb92f0	cmp x1,x2
00bb92f4	b.eq 0x00bb9428
00bb92f8	ldrb w16,[x1]
00bb92fc	cmp w6,#0x1
00bb9300	orr w17,w14,w16, LSL #0x8
00bb9304	csel w16,w16,w17,eq
00bb9308	cmp x9,#0x60
00bb930c	orr w16,w16,w12
00bb9310	orr x16,x16,x16, LSL #0x20
00bb9314	b.cc 0x00bb934c
00bb9318	dup v0.2D,x16
00bb931c	add x15,x0,x13
00bb9320	add x17,x0,#0x40
00bb9324	mov x3,x11
00bb9328	stp q0,q0,[x17, #-0x40]
00bb932c	subs x3,x3,#0x4
00bb9330	stp q0,q0,[x17, #-0x20]
00bb9334	stp q0,q0,[x17]
00bb9338	stp q0,q0,[x17, #0x20]
00bb933c	add x17,x17,#0x80
00bb9340	b.ne 0x00bb9328
00bb9344	cmp x10,x11
00bb9348	b.eq 0x00bb92e8
00bb934c	add x17,x0,x8, LSL #0x2
00bb9350	stp x16,x16,[x15]
00bb9354	stp x16,x16,[x15, #0x10]
00bb9358	add x15,x15,#0x20
00bb935c	cmp x15,x17
00bb9360	b.ne 0x00bb9350
00bb9364	b 0x00bb92e8
00bb9368	cmp x1,x2
00bb936c	b.eq 0x00bb9428
00bb9370	lsl w8,w6,#0x18
00bb9374	sub x10,x2,x1
00bb9378	and w9,w5,#0xffff
00bb937c	cmp x10,#0x3
00bb9380	add w8,w8,w3, LSL #0x10
00bb9384	b.ls 0x00bb939c
00bb9388	cmp x0,x2
00bb938c	b.cs 0x00bb9464
00bb9390	add x11,x0,x10, LSL #0x2
00bb9394	cmp x1,x11
00bb9398	b.cs 0x00bb9464
00bb939c	mov x12,x0
00bb93a0	mov x13,x1
00bb93a4	ldrb w10,[x13], #0x1
00bb93a8	cmp w6,#0x1
00bb93ac	orr w11,w9,w10, LSL #0x8
00bb93b0	csel w10,w10,w11,eq
00bb93b4	cmp x13,x2
00bb93b8	orr w10,w10,w8
00bb93bc	str w10,[x12], #0x4
00bb93c0	b.ne 0x00bb93a4
00bb93c4	b 0x00bb9428
00bb93c8	cmp x1,x2
00bb93cc	b.eq 0x00bb9428
00bb93d0	lsl w8,w6,#0x18
00bb93d4	sub x10,x2,x1
00bb93d8	and w9,w5,#0xffff
00bb93dc	cmp x10,#0x7
00bb93e0	add w8,w8,w3, LSL #0x10
00bb93e4	b.ls 0x00bb93fc
00bb93e8	cmp x0,x2
00bb93ec	b.cs 0x00bb947c
00bb93f0	add x11,x0,x10, LSL #0x4
00bb93f4	cmp x1,x11
00bb93f8	b.cs 0x00bb947c
00bb93fc	mov x12,x0
00bb9400	mov x13,x1
00bb9404	ldrb w10,[x13], #0x1
00bb9408	cmp w6,#0x1
00bb940c	orr w11,w9,w10, LSL #0x8
00bb9410	csel w10,w10,w11,eq
00bb9414	cmp x13,x2
00bb9418	orr w10,w10,w8
00bb941c	orr x10,x10,x10, LSL #0x20
00bb9420	stp x10,x10,[x12], #0x10
00bb9424	b.ne 0x00bb9404
00bb9428	ldp x20,x19,[sp, #0x10]
00bb942c	ldr x21,[sp], #0x20
00bb9430	ret
00bb9434	dup v0.4S,w9
00bb9438	dup v1.4S,w8
00bb943c	cmp x10,#0x10
00bb9440	b.cs 0x00bb95ec
00bb9444	mov x11,xzr
00bb9448	b 0x00bb96e0
00bb944c	dup v0.4S,w9
00bb9450	dup v1.4S,w8
00bb9454	cmp x10,#0x10
00bb9458	b.cs 0x00bb974c
00bb945c	mov x11,xzr
00bb9460	b 0x00bb9b00
00bb9464	dup v0.4S,w9
00bb9468	dup v1.4S,w8
00bb946c	cmp x10,#0x10
00bb9470	b.cs 0x00bb9c1c
00bb9474	mov x11,xzr
00bb9478	b 0x00bb9cd4
00bb947c	dup v0.4S,w9
00bb9480	dup v1.4S,w8
00bb9484	cmp x10,#0x10
00bb9488	b.cs 0x00bb9d34
00bb948c	mov x11,xzr
00bb9490	mov w12,#0x1
00bb9494	fmov s3,w6
00bb9498	and x14,x10,#-0x8
00bb949c	fmov s2,w12
00bb94a0	adrp x13,0x29c000
00bb94a4	adrp x16,0x29d000
00bb94a8	add x12,x0,x14, LSL #0x4
00bb94ac	add x15,x0,x11, LSL #0x4
00bb94b0	ldr q4,[x16, #0xa0]
00bb94b4	add x16,x1,x11
00bb94b8	sub x11,x11,x14
00bb94bc	cmeq v2.4S,v3.4S,v2.4S
00bb94c0	ldr q3,[x13, #0x890]
00bb94c4	add x13,x1,x14
00bb94c8	dup v2.4S,v2.S[0x0]
00bb94cc	ldr d5,[x16], #0x8
00bb94d0	adds x11,x11,#0x8
00bb94d4	tbl v6.16B,{v5.16B},v3.16B
00bb94d8	tbl v5.16B,{v5.16B},v4.16B
00bb94dc	shl v7.4S,v6.4S,0x8
00bb94e0	shl v16.4S,v5.4S,0x8
00bb94e4	orr v7.16B,v7.16B,v0.16B
00bb94e8	bif v6.16B,v7.16B,v2.16B
00bb94ec	orr v7.16B,v16.16B,v0.16B
00bb94f0	bif v5.16B,v7.16B,v2.16B
00bb94f4	orr v16.16B,v6.16B,v1.16B
00bb94f8	uxtl v17.2D,v16.2S
00bb94fc	orr v6.16B,v5.16B,v1.16B
00bb9500	uxtl2 v5.2D,v16.4S
00bb9504	uxtl v7.2D,v16.2S
00bb9508	fmov x0,d17
00bb950c	mov x17,v17.D[0x1]
00bb9510	fmov x5,d5
00bb9514	mov x3,v5.D[0x1]
00bb9518	fmov x4,d7
00bb951c	uxtl v17.2D,v6.2S
00bb9520	uxtl v16.2D,v6.2S
00bb9524	mov x1,v7.D[0x1]
00bb9528	uxtl2 v6.2D,v6.4S
00bb952c	orr x0,x0,x0, LSL #0x20
00bb9530	orr x17,x17,x17, LSL #0x20
00bb9534	orr x4,x4,x4, LSL #0x20
00bb9538	fmov d19,x0
00bb953c	orr x0,x5,x5, LSL #0x20
00bb9540	orr x3,x3,x3, LSL #0x20
00bb9544	orr x1,x1,x1, LSL #0x20
00bb9548	fmov d21,x0
00bb954c	mov x0,x15
00bb9550	mov v19.D[0x1],x17
00bb9554	mov x17,v17.D[0x1]
00bb9558	fmov d18,x4
00bb955c	orr x4,x5,x5, LSL #0x20
00bb9560	fmov x5,d17
00bb9564	mov v21.D[0x1],x3
00bb9568	fmov d20,x4
00bb956c	mov x4,v16.D[0x1]
00bb9570	orr x5,x5,x5, LSL #0x20
00bb9574	orr x17,x17,x17, LSL #0x20
00bb9578	mov v18.D[0x1],x1
00bb957c	mov x1,v6.D[0x1]
00bb9580	mov v20.D[0x1],x3
00bb9584	fmov x3,d16
00bb9588	fmov d17,x5
00bb958c	orr x4,x4,x4, LSL #0x20
00bb9590	st2 {v18.2D,v19.2D},[x0], #0x20
00bb9594	mov v17.D[0x1],x17
00bb9598	fmov x17,d6
00bb959c	orr x3,x3,x3, LSL #0x20
00bb95a0	fmov d16,x3
00bb95a4	orr x3,x17,x17, LSL #0x20
00bb95a8	st2 {v20.2D,v21.2D},[x0]
00bb95ac	orr x0,x1,x1, LSL #0x20
00bb95b0	orr x17,x17,x17, LSL #0x20
00bb95b4	fmov d6,x3
00bb95b8	mov v16.D[0x1],x4
00bb95bc	mov v6.D[0x1],x0
00bb95c0	fmov d5,x17
00bb95c4	add x17,x15,#0x40
00bb95c8	st2 {v16.2D,v17.2D},[x17]
00bb95cc	add x17,x15,#0x60
00bb95d0	add x15,x15,#0x80
00bb95d4	mov v5.D[0x1],x0
00bb95d8	st2 {v5.2D,v6.2D},[x17]
00bb95dc	b.ne 0x00bb94cc
00bb95e0	cmp x10,x14
00bb95e4	b.ne 0x00bb9404
00bb95e8	b 0x00bb9428
00bb95ec	mov w11,#0x1
00bb95f0	fmov s2,w6
00bb95f4	adrp x12,0x29c000
00bb95f8	fmov s3,w11
00bb95fc	adrp x13,0x29c000
00bb9600	adrp x14,0x29c000
00bb9604	and x11,x10,#-0x10
00bb9608	ldr q5,[x13, #0xcc0]
00bb960c	ldr q6,[x14, #0x20]
00bb9610	mov x13,x0
00bb9614	mov x14,x1
00bb9618	cmeq v3.4S,v2.4S,v3.4S
00bb961c	ldr q2,[x12, #0x890]
00bb9620	adrp x12,0x29d000
00bb9624	ldr q4,[x12, #0xa0]
00bb9628	mov x12,x11
00bb962c	dup v3.4S,v3.S[0x0]
00bb9630	ldr q7,[x14], #0x10
00bb9634	subs x12,x12,#0x10
00bb9638	tbl v16.16B,{v7.16B},v5.16B
00bb963c	tbl v17.16B,{v7.16B},v4.16B
00bb9640	tbl v18.16B,{v7.16B},v2.16B
00bb9644	tbl v7.16B,{v7.16B},v6.16B
00bb9648	shl v19.4S,v16.4S,0x8
00bb964c	shl v20.4S,v17.4S,0x8
00bb9650	shl v21.4S,v18.4S,0x8
00bb9654	shl v22.4S,v7.4S,0x8
00bb9658	orr v19.16B,v19.16B,v0.16B
00bb965c	orr v20.16B,v20.16B,v0.16B
00bb9660	bif v16.16B,v19.16B,v3.16B
00bb9664	orr v19.16B,v21.16B,v0.16B
00bb9668	bif v17.16B,v20.16B,v3.16B
00bb966c	orr v20.16B,v22.16B,v0.16B
00bb9670	bif v18.16B,v19.16B,v3.16B
00bb9674	bif v7.16B,v20.16B,v3.16B
00bb9678	zip2 v19.4S,v16.4S,v16.4S
00bb967c	zip1 v16.4S,v16.4S,v16.4S
00bb9680	zip2 v20.4S,v17.4S,v17.4S
00bb9684	zip1 v17.4S,v17.4S,v17.4S
00bb9688	zip2 v21.4S,v18.4S,v18.4S
00bb968c	zip1 v18.4S,v18.4S,v18.4S
00bb9690	zip1 v22.4S,v7.4S,v7.4S
00bb9694	zip2 v7.4S,v7.4S,v7.4S
00bb9698	orr v19.16B,v19.16B,v1.16B
00bb969c	orr v16.16B,v16.16B,v1.16B
00bb96a0	orr v20.16B,v20.16B,v1.16B
00bb96a4	orr v17.16B,v17.16B,v1.16B
00bb96a8	stp q16,q19,[x13, #0x40]
00bb96ac	orr v19.16B,v21.16B,v1.16B
00bb96b0	orr v16.16B,v18.16B,v1.16B
00bb96b4	orr v18.16B,v22.16B,v1.16B
00bb96b8	orr v7.16B,v7.16B,v1.16B
00bb96bc	stp q17,q20,[x13, #0x20]
00bb96c0	stp q16,q19,[x13]
00bb96c4	stp q18,q7,[x13, #0x60]
00bb96c8	add x13,x13,#0x80
00bb96cc	b.ne 0x00bb9630
00bb96d0	cmp x10,x11
00bb96d4	b.eq 0x00bb9428
00bb96d8	tst x10,#0xc
00bb96dc	b.eq 0x00bb9fac
00bb96e0	mov w12,#0x1
00bb96e4	fmov s3,w6
00bb96e8	and x14,x10,#-0x4
00bb96ec	fmov s2,w12
00bb96f0	add x12,x0,x14, LSL #0x3
00bb96f4	add x15,x0,x11, LSL #0x3
00bb96f8	add x13,x1,x14
00bb96fc	add x16,x1,x11
00bb9700	sub x11,x11,x14
00bb9704	cmeq v2.4S,v3.4S,v2.4S
00bb9708	dup v2.4S,v2.S[0x0]
00bb970c	ldr s3,[x16], #0x4
00bb9710	adds x11,x11,#0x4
00bb9714	uxtl v3.8H,v3.8B
00bb9718	ushll v4.4S,v3.4H,0x8
00bb971c	uxtl v3.4S,v3.4H
00bb9720	orr v4.16B,v4.16B,v0.16B
00bb9724	bif v3.16B,v4.16B,v2.16B
00bb9728	zip2 v4.4S,v3.4S,v3.4S
00bb972c	zip1 v3.4S,v3.4S,v3.4S
00bb9730	orr v4.16B,v4.16B,v1.16B
00bb9734	orr v3.16B,v3.16B,v1.16B
00bb9738	stp q3,q4,[x15], #0x20
00bb973c	b.ne 0x00bb970c
00bb9740	cmp x10,x14
00bb9744	b.ne 0x00bb9214
00bb9748	b 0x00bb9428
00bb974c	mov w11,#0x1
00bb9750	fmov s2,w6
00bb9754	adrp x12,0x29c000
00bb9758	fmov s3,w11
00bb975c	adrp x13,0x29c000
00bb9760	adrp x14,0x29c000
00bb9764	and x11,x10,#-0x10
00bb9768	ldr q5,[x13, #0xcc0]
00bb976c	ldr q6,[x14, #0x20]
00bb9770	mov x13,x0
00bb9774	mov x14,x1
00bb9778	cmeq v3.4S,v2.4S,v3.4S
00bb977c	ldr q2,[x12, #0x890]
00bb9780	adrp x12,0x29d000
00bb9784	ldr q4,[x12, #0xa0]
00bb9788	mov x12,x11
00bb978c	dup v3.4S,v3.S[0x0]
00bb9790	ldr q16,[x14], #0x10
00bb9794	mov v19.16B,v3.16B
00bb9798	subs x12,x12,#0x10
00bb979c	tbl v7.16B,{v16.16B},v2.16B
00bb97a0	tbl v18.16B,{v16.16B},v6.16B
00bb97a4	shl v17.4S,v7.4S,0x8
00bb97a8	shl v24.4S,v18.4S,0x8
00bb97ac	orr v17.16B,v17.16B,v0.16B
00bb97b0	bsl v19.16B,v7.16B,v17.16B
00bb97b4	tbl v7.16B,{v16.16B},v4.16B
00bb97b8	tbl v17.16B,{v16.16B},v5.16B
00bb97bc	orr v16.16B,v19.16B,v1.16B
00bb97c0	shl v19.4S,v7.4S,0x8
00bb97c4	shl v21.4S,v17.4S,0x8
00bb97c8	uxtl v20.2D,v16.2S
00bb97cc	orr v22.16B,v19.16B,v0.16B
00bb97d0	uxtl v19.2D,v16.2S
00bb97d4	orr v23.16B,v21.16B,v0.16B
00bb97d8	orr v21.16B,v24.16B,v0.16B
00bb97dc	fmov x16,d20
00bb97e0	mov x15,v20.D[0x1]
00bb97e4	bif v7.16B,v22.16B,v3.16B
00bb97e8	uxtl v22.2D,v16.2S
00bb97ec	fmov x3,d19
00bb97f0	bif v17.16B,v23.16B,v3.16B
00bb97f4	bif v18.16B,v21.16B,v3.16B
00bb97f8	mov x17,v19.D[0x1]
00bb97fc	uxtl v20.2D,v16.2S
00bb9800	orr x16,x16,x16, LSL #0x20
00bb9804	uxtl2 v16.2D,v16.4S
00bb9808	mov x4,v22.D[0x1]
00bb980c	fmov x5,d22
00bb9810	orr x15,x15,x15, LSL #0x20
00bb9814	fmov d22,x16
00bb9818	orr x3,x3,x3, LSL #0x20
00bb981c	orr v19.16B,v7.16B,v1.16B
00bb9820	orr x17,x17,x17, LSL #0x20
00bb9824	mov x16,v20.D[0x1]
00bb9828	orr v7.16B,v18.16B,v1.16B
00bb982c	orr x5,x5,x5, LSL #0x20
00bb9830	mov v22.D[0x1],x15
00bb9834	mov x15,v16.D[0x1]
00bb9838	orr x4,x4,x4, LSL #0x20
00bb983c	fmov d21,x3
00bb9840	fmov x3,d20
00bb9844	uxtl v20.2D,v19.2S
00bb9848	orr x16,x16,x16, LSL #0x20
00bb984c	uxtl v18.2D,v19.2S
00bb9850	mov v21.D[0x1],x17
00bb9854	fmov x17,d16
00bb9858	orr x3,x3,x3, LSL #0x20
00bb985c	fmov d23,x5
00bb9860	orr x15,x15,x15, LSL #0x20
00bb9864	orr v16.16B,v17.16B,v1.16B
00bb9868	uxtl v17.2D,v19.2S
00bb986c	orr x5,x17,x17, LSL #0x20
00bb9870	mov v23.D[0x1],x4
00bb9874	orr x4,x17,x17, LSL #0x20
00bb9878	fmov d26,x5
00bb987c	fmov d24,x3
00bb9880	orr x3,x17,x17, LSL #0x20
00bb9884	orr x17,x17,x17, LSL #0x20
00bb9888	mov v26.D[0x1],x15
00bb988c	mov v24.D[0x1],x16
00bb9890	mov x16,x13
00bb9894	fmov d25,x3
00bb9898	mov x3,v17.D[0x1]
00bb989c	mov v25.D[0x1],x15
00bb98a0	st4 {v21.2D,v22.2D,v23.2D,v24.2D},[x16], #0x40
00bb98a4	fmov d27,x4
00bb98a8	fmov x4,d20
00bb98ac	uxtl v21.2D,v19.2S
00bb98b0	orr x3,x3,x3, LSL #0x20
00bb98b4	uxtl2 v19.2D,v19.4S
00bb98b8	uxtl v22.2D,v16.2S
00bb98bc	mov v27.D[0x1],x15
00bb98c0	orr x4,x4,x4, LSL #0x20
00bb98c4	fmov x7,d21
00bb98c8	fmov d28,x17
00bb98cc	mov x17,v20.D[0x1]
00bb98d0	mov x5,v21.D[0x1]
00bb98d4	uxtl v20.2D,v16.2S
00bb98d8	uxtl v21.2D,v7.2S
00bb98dc	mov v28.D[0x1],x15
00bb98e0	fmov x15,d17
00bb98e4	uxtl v17.2D,v16.2S
00bb98e8	fmov x19,d21
00bb98ec	orr x15,x15,x15, LSL #0x20
00bb98f0	fmov x21,d17
00bb98f4	st4 {v25.2D,v26.2D,v27.2D,v28.2D},[x16]
00bb98f8	orr x16,x17,x17, LSL #0x20
00bb98fc	orr x17,x7,x7, LSL #0x20
00bb9900	fmov d24,x15
00bb9904	mov x15,v18.D[0x1]
00bb9908	fmov x7,d19
00bb990c	mov v24.D[0x1],x3
00bb9910	fmov x3,d18
00bb9914	uxtl2 v18.2D,v7.4S
00bb9918	fmov d23,x4
00bb991c	orr x4,x5,x5, LSL #0x20
00bb9920	orr x15,x15,x15, LSL #0x20
00bb9924	orr x20,x7,x7, LSL #0x20
00bb9928	mov x5,v21.D[0x1]
00bb992c	mov v23.D[0x1],x16
00bb9930	orr x16,x3,x3, LSL #0x20
00bb9934	fmov x3,d20
00bb9938	fmov d25,x17
00bb993c	mov x17,v20.D[0x1]
00bb9940	orr x5,x5,x5, LSL #0x20
00bb9944	orr x3,x3,x3, LSL #0x20
00bb9948	mov v25.D[0x1],x4
00bb994c	mov x4,v19.D[0x1]
00bb9950	fmov d26,x16
00bb9954	mov x16,v18.D[0x1]
00bb9958	orr x17,x17,x17, LSL #0x20
00bb995c	mov v26.D[0x1],x15
00bb9960	fmov x15,d18
00bb9964	fmov d18,x3
00bb9968	orr x3,x4,x4, LSL #0x20
00bb996c	add x4,x13,#0x80
00bb9970	orr x16,x16,x16, LSL #0x20
00bb9974	mov v18.D[0x1],x17
00bb9978	orr x17,x21,x21, LSL #0x20
00bb997c	mov x21,v22.D[0x1]
00bb9980	st4 {v23.2D,v24.2D,v25.2D,v26.2D},[x4]
00bb9984	fmov d24,x20
00bb9988	orr x4,x7,x7, LSL #0x20
00bb998c	mov x20,v17.D[0x1]
00bb9990	uxtl v17.2D,v16.2S
00bb9994	fmov d19,x17
00bb9998	uxtl2 v16.2D,v16.4S
00bb999c	mov v24.D[0x1],x3
00bb99a0	fmov d23,x4
00bb99a4	orr x4,x7,x7, LSL #0x20
00bb99a8	orr x7,x7,x7, LSL #0x20
00bb99ac	orr x17,x20,x20, LSL #0x20
00bb99b0	mov x20,v17.D[0x1]
00bb99b4	mov v23.D[0x1],x3
00bb99b8	mov v19.D[0x1],x17
00bb99bc	orr x17,x21,x21, LSL #0x20
00bb99c0	fmov d25,x4
00bb99c4	fmov x4,d22
00bb99c8	uxtl v22.2D,v7.2S
00bb99cc	mov v25.D[0x1],x3
00bb99d0	orr x4,x4,x4, LSL #0x20
00bb99d4	mov x21,v22.D[0x1]
00bb99d8	fmov d26,x7
00bb99dc	fmov x7,d17
00bb99e0	uxtl v17.2D,v7.2S
00bb99e4	fmov d20,x4
00bb99e8	uxtl v7.2D,v7.2S
00bb99ec	mov v26.D[0x1],x3
00bb99f0	orr x4,x7,x7, LSL #0x20
00bb99f4	orr x7,x19,x19, LSL #0x20
00bb99f8	mov v20.D[0x1],x17
00bb99fc	orr x17,x20,x20, LSL #0x20
00bb9a00	mov x19,v16.D[0x1]
00bb9a04	fmov d21,x4
00bb9a08	add x4,x13,#0xc0
00bb9a0c	add x20,x13,#0x100
00bb9a10	orr x3,x15,x15, LSL #0x20
00bb9a14	st4 {v23.2D,v24.2D,v25.2D,v26.2D},[x4]
00bb9a18	fmov x4,d16
00bb9a1c	fmov d23,x7
00bb9a20	mov v21.D[0x1],x17
00bb9a24	orr x19,x19,x19, LSL #0x20
00bb9a28	mov x17,v7.D[0x1]
00bb9a2c	fmov d27,x3
00bb9a30	orr x3,x15,x15, LSL #0x20
00bb9a34	orr x7,x4,x4, LSL #0x20
00bb9a38	mov v23.D[0x1],x5
00bb9a3c	fmov x5,d7
00bb9a40	st4 {v18.2D,v19.2D,v20.2D,v21.2D},[x20]
00bb9a44	fmov d18,x7
00bb9a48	orr x7,x4,x4, LSL #0x20
00bb9a4c	orr x5,x5,x5, LSL #0x20
00bb9a50	fmov x20,d17
00bb9a54	orr x17,x17,x17, LSL #0x20
00bb9a58	mov v27.D[0x1],x16
00bb9a5c	mov v18.D[0x1],x19
00bb9a60	fmov d24,x5
00bb9a64	mov x5,v17.D[0x1]
00bb9a68	fmov d19,x7
00bb9a6c	orr x7,x4,x4, LSL #0x20
00bb9a70	orr x4,x4,x4, LSL #0x20
00bb9a74	fmov d28,x3
00bb9a78	orr x3,x21,x21, LSL #0x20
00bb9a7c	mov v24.D[0x1],x17
00bb9a80	orr x17,x20,x20, LSL #0x20
00bb9a84	mov v19.D[0x1],x19
00bb9a88	fmov d20,x7
00bb9a8c	fmov d25,x17
00bb9a90	fmov x7,d22
00bb9a94	mov v28.D[0x1],x16
00bb9a98	mov v20.D[0x1],x19
00bb9a9c	orr x17,x7,x7, LSL #0x20
00bb9aa0	fmov d21,x4
00bb9aa4	orr x4,x5,x5, LSL #0x20
00bb9aa8	mov v25.D[0x1],x4
00bb9aac	orr x4,x15,x15, LSL #0x20
00bb9ab0	orr x15,x15,x15, LSL #0x20
00bb9ab4	fmov d26,x17
00bb9ab8	mov v21.D[0x1],x19
00bb9abc	add x17,x13,#0x140
00bb9ac0	fmov d29,x4
00bb9ac4	mov v26.D[0x1],x3
00bb9ac8	mov v29.D[0x1],x16
00bb9acc	st4 {v18.2D,v19.2D,v20.2D,v21.2D},[x17]
00bb9ad0	fmov d30,x15
00bb9ad4	add x15,x13,#0x180
00bb9ad8	mov v30.D[0x1],x16
00bb9adc	st4 {v23.2D,v24.2D,v25.2D,v26.2D},[x15]
00bb9ae0	add x15,x13,#0x1c0
00bb9ae4	add x13,x13,#0x200
00bb9ae8	st4 {v27.2D,v28.2D,v29.2D,v30.2D},[x15]
00bb9aec	b.ne 0x00bb9790
00bb9af0	cmp x10,x11
00bb9af4	b.eq 0x00bb9428
00bb9af8	tst x10,#0xc
00bb9afc	b.eq 0x00bb9fb8
00bb9b00	mov w12,#0x1
00bb9b04	fmov s3,w6
00bb9b08	and x14,x10,#-0x4
00bb9b0c	fmov s2,w12
00bb9b10	add x12,x0,x14, LSL #0x5
00bb9b14	add x16,x0,x11, LSL #0x5
00bb9b18	add x13,x1,x14
00bb9b1c	add x15,x1,x11
00bb9b20	sub x11,x11,x14
00bb9b24	cmeq v2.4S,v3.4S,v2.4S
00bb9b28	dup v2.4S,v2.S[0x0]
00bb9b2c	ldr s3,[x15], #0x4
00bb9b30	adds x11,x11,#0x4
00bb9b34	uxtl v3.8H,v3.8B
00bb9b38	ushll v4.4S,v3.4H,0x8
00bb9b3c	uxtl v3.4S,v3.4H
00bb9b40	orr v4.16B,v4.16B,v0.16B
00bb9b44	bif v3.16B,v4.16B,v2.16B
00bb9b48	orr v3.16B,v3.16B,v1.16B
00bb9b4c	uxtl v4.2D,v3.2S
00bb9b50	uxtl v5.2D,v3.2S
00bb9b54	uxtl2 v6.2D,v3.4S
00bb9b58	uxtl v7.2D,v3.2S
00bb9b5c	uxtl v3.2D,v3.2S
00bb9b60	fmov x0,d4
00bb9b64	mov x17,v4.D[0x1]
00bb9b68	fmov x5,d5
00bb9b6c	mov x1,v5.D[0x1]
00bb9b70	fmov x4,d6
00bb9b74	mov x3,v6.D[0x1]
00bb9b78	mov x7,v7.D[0x1]
00bb9b7c	orr x0,x0,x0, LSL #0x20
00bb9b80	orr x5,x5,x5, LSL #0x20
00bb9b84	orr x17,x17,x17, LSL #0x20
00bb9b88	fmov d19,x0
00bb9b8c	orr x0,x4,x4, LSL #0x20
00bb9b90	orr x1,x1,x1, LSL #0x20
00bb9b94	mov v19.D[0x1],x17
00bb9b98	fmov x17,d7
00bb9b9c	fmov d7,x0
00bb9ba0	fmov d18,x5
00bb9ba4	fmov x0,d3
00bb9ba8	mov x5,v3.D[0x1]
00bb9bac	orr x17,x17,x17, LSL #0x20
00bb9bb0	mov v18.D[0x1],x1
00bb9bb4	orr x1,x3,x3, LSL #0x20
00bb9bb8	orr x3,x7,x7, LSL #0x20
00bb9bbc	fmov d17,x17
00bb9bc0	orr x17,x4,x4, LSL #0x20
00bb9bc4	orr x0,x0,x0, LSL #0x20
00bb9bc8	mov v7.D[0x1],x1
00bb9bcc	fmov d6,x17
00bb9bd0	orr x17,x4,x4, LSL #0x20
00bb9bd4	mov v17.D[0x1],x3
00bb9bd8	orr x3,x5,x5, LSL #0x20
00bb9bdc	fmov d16,x0
00bb9be0	orr x0,x4,x4, LSL #0x20
00bb9be4	mov v6.D[0x1],x1
00bb9be8	fmov d5,x17
00bb9bec	add x17,x16,#0x80
00bb9bf0	mov v16.D[0x1],x3
00bb9bf4	mov v5.D[0x1],x1
00bb9bf8	fmov d4,x0
00bb9bfc	st4 {v16.2D,v17.2D,v18.2D,v19.2D},[x16], #0x40
00bb9c00	mov v4.D[0x1],x1
00bb9c04	st4 {v4.2D,v5.2D,v6.2D,v7.2D},[x16]
00bb9c08	mov x16,x17
00bb9c0c	b.ne 0x00bb9b2c
00bb9c10	cmp x10,x14
00bb9c14	b.ne 0x00bb9284
00bb9c18	b 0x00bb9428
00bb9c1c	mov w11,#0x1
00bb9c20	fmov s2,w6
00bb9c24	adrp x12,0x29c000
00bb9c28	fmov s3,w11
00bb9c2c	adrp x13,0x29d000
00bb9c30	adrp x14,0x29c000
00bb9c34	and x11,x10,#-0x10
00bb9c38	ldr q5,[x13, #0xa0]
00bb9c3c	ldr q6,[x14, #0x890]
00bb9c40	mov x13,x0
00bb9c44	mov x14,x1
00bb9c48	cmeq v3.4S,v2.4S,v3.4S
00bb9c4c	ldr q2,[x12, #0x20]
00bb9c50	adrp x12,0x29c000
00bb9c54	ldr q4,[x12, #0xcc0]
00bb9c58	mov x12,x11
00bb9c5c	dup v3.4S,v3.S[0x0]
00bb9c60	ldr q7,[x14], #0x10
00bb9c64	subs x12,x12,#0x10
00bb9c68	tbl v16.16B,{v7.16B},v2.16B
00bb9c6c	tbl v17.16B,{v7.16B},v4.16B
00bb9c70	tbl v18.16B,{v7.16B},v5.16B
00bb9c74	tbl v7.16B,{v7.16B},v6.16B
00bb9c78	shl v19.4S,v16.4S,0x8
00bb9c7c	shl v20.4S,v17.4S,0x8
00bb9c80	shl v21.4S,v18.4S,0x8
00bb9c84	shl v22.4S,v7.4S,0x8
00bb9c88	orr v19.16B,v19.16B,v0.16B
00bb9c8c	orr v20.16B,v20.16B,v0.16B
00bb9c90	orr v21.16B,v21.16B,v0.16B
00bb9c94	bif v16.16B,v19.16B,v3.16B
00bb9c98	orr v19.16B,v22.16B,v0.16B
00bb9c9c	bif v17.16B,v20.16B,v3.16B
00bb9ca0	bif v18.16B,v21.16B,v3.16B
00bb9ca4	bif v7.16B,v19.16B,v3.16B
00bb9ca8	orr v16.16B,v16.16B,v1.16B
00bb9cac	orr v17.16B,v17.16B,v1.16B
00bb9cb0	orr v18.16B,v18.16B,v1.16B
00bb9cb4	orr v7.16B,v7.16B,v1.16B
00bb9cb8	stp q17,q16,[x13, #0x20]
00bb9cbc	stp q7,q18,[x13], #0x40
00bb9cc0	b.ne 0x00bb9c60
00bb9cc4	cmp x10,x11
00bb9cc8	b.eq 0x00bb9428
00bb9ccc	tst x10,#0xc
00bb9cd0	b.eq 0x00bb9fc4
00bb9cd4	mov w12,#0x1
00bb9cd8	fmov s3,w6
00bb9cdc	and x14,x10,#-0x4
00bb9ce0	fmov s2,w12
00bb9ce4	add x12,x0,x14, LSL #0x2
00bb9ce8	add x15,x0,x11, LSL #0x2
00bb9cec	add x13,x1,x14
00bb9cf0	add x16,x1,x11
00bb9cf4	sub x11,x11,x14
00bb9cf8	cmeq v2.4S,v3.4S,v2.4S
00bb9cfc	dup v2.4S,v2.S[0x0]
00bb9d00	ldr s3,[x16], #0x4
00bb9d04	adds x11,x11,#0x4
00bb9d08	uxtl v3.8H,v3.8B
00bb9d0c	ushll v4.4S,v3.4H,0x8
00bb9d10	uxtl v3.4S,v3.4H
00bb9d14	orr v4.16B,v4.16B,v0.16B
00bb9d18	bif v3.16B,v4.16B,v2.16B
00bb9d1c	orr v3.16B,v3.16B,v1.16B
00bb9d20	str q3,[x15], #0x10
00bb9d24	b.ne 0x00bb9d00
00bb9d28	cmp x10,x14
00bb9d2c	b.ne 0x00bb93a4
00bb9d30	b 0x00bb9428
00bb9d34	mov w11,#0x1
00bb9d38	fmov s2,w6
00bb9d3c	adrp x12,0x29c000
00bb9d40	fmov s3,w11
00bb9d44	adrp x13,0x29c000
00bb9d48	adrp x14,0x29c000
00bb9d4c	and x11,x10,#-0x10
00bb9d50	ldr q5,[x13, #0xcc0]
00bb9d54	ldr q6,[x14, #0x20]
00bb9d58	mov x13,x0
00bb9d5c	mov x14,x1
00bb9d60	cmeq v3.4S,v2.4S,v3.4S
00bb9d64	ldr q2,[x12, #0x890]
00bb9d68	adrp x12,0x29d000
00bb9d6c	ldr q4,[x12, #0xa0]
00bb9d70	mov x12,x11
00bb9d74	dup v3.4S,v3.S[0x0]
00bb9d78	ldr q7,[x14], #0x10
00bb9d7c	mov x15,x13
00bb9d80	subs x12,x12,#0x10
00bb9d84	tbl v16.16B,{v7.16B},v2.16B
00bb9d88	tbl v17.16B,{v7.16B},v4.16B
00bb9d8c	tbl v19.16B,{v7.16B},v5.16B
00bb9d90	tbl v7.16B,{v7.16B},v6.16B
00bb9d94	shl v18.4S,v16.4S,0x8
00bb9d98	shl v20.4S,v17.4S,0x8
00bb9d9c	shl v21.4S,v19.4S,0x8
00bb9da0	shl v22.4S,v7.4S,0x8
00bb9da4	orr v18.16B,v18.16B,v0.16B
00bb9da8	orr v20.16B,v20.16B,v0.16B
00bb9dac	orr v21.16B,v21.16B,v0.16B
00bb9db0	bif v16.16B,v18.16B,v3.16B
00bb9db4	bif v17.16B,v20.16B,v3.16B
00bb9db8	bif v19.16B,v21.16B,v3.16B
00bb9dbc	orr v20.16B,v22.16B,v0.16B
00bb9dc0	orr v18.16B,v16.16B,v1.16B
00bb9dc4	orr v16.16B,v17.16B,v1.16B
00bb9dc8	bif v7.16B,v20.16B,v3.16B
00bb9dcc	orr v19.16B,v19.16B,v1.16B
00bb9dd0	uxtl v17.2D,v18.2S
00bb9dd4	uxtl2 v21.2D,v18.4S
00bb9dd8	uxtl v18.2D,v18.2S
00bb9ddc	uxtl v22.2D,v16.2S
00bb9de0	uxtl v20.2D,v16.2S
00bb9de4	uxtl2 v16.2D,v16.4S
00bb9de8	orr v7.16B,v7.16B,v1.16B
00bb9dec	fmov x4,d17
00bb9df0	mov x16,v17.D[0x1]
00bb9df4	fmov x19,d18
00bb9df8	mov x5,v18.D[0x1]
00bb9dfc	fmov x3,d21
00bb9e00	mov x17,v21.D[0x1]
00bb9e04	uxtl v17.2D,v19.2S
00bb9e08	uxtl v21.2D,v19.2S
00bb9e0c	orr x4,x4,x4, LSL #0x20
00bb9e10	orr x19,x19,x19, LSL #0x20
00bb9e14	orr x16,x16,x16, LSL #0x20
00bb9e18	orr x7,x3,x3, LSL #0x20
00bb9e1c	orr x3,x3,x3, LSL #0x20
00bb9e20	fmov d26,x4
00bb9e24	fmov x4,d16
00bb9e28	orr x5,x5,x5, LSL #0x20
00bb9e2c	fmov d24,x7
00bb9e30	orr x17,x17,x17, LSL #0x20
00bb9e34	mov x7,v16.D[0x1]
00bb9e38	uxtl2 v16.2D,v19.4S
00bb9e3c	mov v26.D[0x1],x16
00bb9e40	mov x16,v22.D[0x1]
00bb9e44	fmov d25,x19
00bb9e48	fmov x19,d22
00bb9e4c	mov v24.D[0x1],x17
00bb9e50	fmov d23,x3
00bb9e54	orr x7,x7,x7, LSL #0x20
00bb9e58	mov x3,v16.D[0x1]
00bb9e5c	orr x19,x19,x19, LSL #0x20
00bb9e60	mov v25.D[0x1],x5
00bb9e64	orr x5,x4,x4, LSL #0x20
00bb9e68	orr x16,x16,x16, LSL #0x20
00bb9e6c	mov v23.D[0x1],x17
00bb9e70	orr x4,x4,x4, LSL #0x20
00bb9e74	fmov d28,x19
00bb9e78	fmov x19,d20
00bb9e7c	fmov d19,x5
00bb9e80	mov x5,v20.D[0x1]
00bb9e84	fmov x17,d16
00bb9e88	orr x3,x3,x3, LSL #0x20
00bb9e8c	st2 {v25.2D,v26.2D},[x15], #0x20
00bb9e90	uxtl v16.2D,v7.2S
00bb9e94	orr x19,x19,x19, LSL #0x20
00bb9e98	mov v28.D[0x1],x16
00bb9e9c	mov x16,v21.D[0x1]
00bb9ea0	mov v19.D[0x1],x7
00bb9ea4	fmov d27,x19
00bb9ea8	orr x5,x5,x5, LSL #0x20
00bb9eac	fmov x19,d21
00bb9eb0	st2 {v23.2D,v24.2D},[x15]
00bb9eb4	fmov d18,x4
00bb9eb8	add x4,x13,#0x40
00bb9ebc	orr x16,x16,x16, LSL #0x20
00bb9ec0	mov v27.D[0x1],x5
00bb9ec4	orr x15,x19,x19, LSL #0x20
00bb9ec8	orr x5,x17,x17, LSL #0x20
00bb9ecc	mov v18.D[0x1],x7
00bb9ed0	orr x17,x17,x17, LSL #0x20
00bb9ed4	fmov d22,x15
00bb9ed8	mov x15,v17.D[0x1]
00bb9edc	fmov d20,x5
00bb9ee0	st2 {v27.2D,v28.2D},[x4]
00bb9ee4	fmov x4,d17
00bb9ee8	uxtl v17.2D,v7.2S
00bb9eec	mov v22.D[0x1],x16
00bb9ef0	mov v20.D[0x1],x3
00bb9ef4	add x16,x13,#0x60
00bb9ef8	orr x15,x15,x15, LSL #0x20
00bb9efc	fmov d21,x17
00bb9f00	uxtl2 v7.2D,v7.4S
00bb9f04	orr x4,x4,x4, LSL #0x20
00bb9f08	mov x17,v17.D[0x1]
00bb9f0c	st2 {v18.2D,v19.2D},[x16]
00bb9f10	fmov x16,d16
00bb9f14	fmov d23,x4
00bb9f18	mov v21.D[0x1],x3
00bb9f1c	add x3,x13,#0x80
00bb9f20	mov x4,v16.D[0x1]
00bb9f24	orr x16,x16,x16, LSL #0x20
00bb9f28	orr x17,x17,x17, LSL #0x20
00bb9f2c	mov v23.D[0x1],x15
00bb9f30	mov x15,v7.D[0x1]
00bb9f34	orr x4,x4,x4, LSL #0x20
00bb9f38	st2 {v22.2D,v23.2D},[x3]
00bb9f3c	fmov x3,d17
00bb9f40	fmov d16,x16
00bb9f44	orr x15,x15,x15, LSL #0x20
00bb9f48	orr x16,x3,x3, LSL #0x20
00bb9f4c	fmov x3,d7
00bb9f50	mov v16.D[0x1],x4
00bb9f54	fmov d17,x16
00bb9f58	add x16,x13,#0xa0
00bb9f5c	orr x4,x3,x3, LSL #0x20
00bb9f60	st2 {v20.2D,v21.2D},[x16]
00bb9f64	orr x16,x3,x3, LSL #0x20
00bb9f68	fmov d18,x4
00bb9f6c	mov v17.D[0x1],x17
00bb9f70	mov v18.D[0x1],x15
00bb9f74	fmov d19,x16
00bb9f78	add x16,x13,#0xc0
00bb9f7c	st2 {v16.2D,v17.2D},[x16]
00bb9f80	mov v19.D[0x1],x15
00bb9f84	add x15,x13,#0xe0
00bb9f88	add x13,x13,#0x100
00bb9f8c	st2 {v18.2D,v19.2D},[x15]
00bb9f90	b.ne 0x00bb9d78
00bb9f94	cmp x10,x11
00bb9f98	b.eq 0x00bb9428
00bb9f9c	tbnz w10,#0x3,0x00bb9490
00bb9fa0	add x12,x0,x11, LSL #0x4
00bb9fa4	add x13,x1,x11
00bb9fa8	b 0x00bb9404
00bb9fac	add x12,x0,x11, LSL #0x3
00bb9fb0	add x13,x1,x11
00bb9fb4	b 0x00bb9214
00bb9fb8	add x12,x0,x11, LSL #0x5
00bb9fbc	add x13,x1,x11
00bb9fc0	b 0x00bb9284
00bb9fc4	add x12,x0,x11, LSL #0x2
00bb9fc8	add x13,x1,x11
00bb9fcc	b 0x00bb93a4
