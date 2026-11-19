; std::__ndk1::__num_put<wchar_t>::__widen_and_group_float @ 00be8224
00be8224	paciasp
00be8228	sub sp,sp,#0xb0
00be822c	stp x29,x30,[sp, #0x50]
00be8230	stp x28,x27,[sp, #0x60]
00be8234	stp x26,x25,[sp, #0x70]
00be8238	stp x24,x23,[sp, #0x80]
00be823c	stp x22,x21,[sp, #0x90]
00be8240	stp x20,x19,[sp, #0xa0]
00be8244	add x29,sp,#0x50
00be8248	adrp x23,0xcb5000
00be824c	mov x19,x6
00be8250	mov x20,x5
00be8254	ldr x23,[x23, #0xb98]
00be8258	ldr x22,[x6]
00be825c	mov x24,x4
00be8260	mov x26,x3
00be8264	mov x21,x2
00be8268	mov x27,x1
00be826c	stur x23,[x29, #-0x10]
00be8270	ldar x8,[x23]
00be8274	str x0,[sp, #0x20]
00be8278	cmn x8,#0x1
00be827c	b.eq 0x00be82a8
00be8280	sub x8,x29,#0x10
00be8284	add x9,sp,#0x28
00be8288	adrp x0,0xcb5000
00be828c	str x8,[sp, #0x28]
00be8290	nop
00be8294	adr x2,0xc0bab0
00be8298	stur x9,[x29, #-0x8]
00be829c	sub x1,x29,#0x8
00be82a0	ldr x0,[x0, #0xb98]
00be82a4	bl 0x00c305d0
00be82a8	ldp x8,x10,[x22, #0x10]
00be82ac	ldrsw x9,[x23, #0x8]
00be82b0	sub x9,x9,#0x1
00be82b4	sub x10,x10,x8
00be82b8	cmp x9,x10, ASR #0x3
00be82bc	b.cs 0x00be88d0
00be82c0	ldr x25,[x8, x9, LSL #0x3]
00be82c4	cbz x25,0x00be88d0
00be82c8	adrp x22,0xcb5000
00be82cc	ldr x22,[x22, #0xc10]
00be82d0	ldr x19,[x19]
00be82d4	stur x22,[x29, #-0x10]
00be82d8	ldar x8,[x22]
00be82dc	ldr x23,[sp, #0x20]
00be82e0	cmn x8,#0x1
00be82e4	b.eq 0x00be8310
00be82e8	sub x8,x29,#0x10
00be82ec	add x9,sp,#0x28
00be82f0	adrp x0,0xcb5000
00be82f4	str x8,[sp, #0x28]
00be82f8	nop
00be82fc	adr x2,0xc0bab0
00be8300	stur x9,[x29, #-0x8]
00be8304	sub x1,x29,#0x8
00be8308	ldr x0,[x0, #0xc10]
00be830c	bl 0x00c305d0
00be8310	ldp x8,x10,[x19, #0x10]
00be8314	ldrsw x9,[x22, #0x8]
00be8318	sub x9,x9,#0x1
00be831c	sub x10,x10,x8
00be8320	cmp x9,x10, ASR #0x3
00be8324	b.cs 0x00be88d0
00be8328	ldr x19,[x8, x9, LSL #0x3]
00be832c	cbz x19,0x00be88d0
00be8330	ldr x8,[x19]
00be8334	mov x0,x19
00be8338	ldr x9,[x8, #0x28]
00be833c	add x8,sp,#0x28
00be8340	blr x9
00be8344	str x26,[x20]
00be8348	ldrb w1,[x23]
00be834c	str x26,[sp, #0x18]
00be8350	cmp w1,#0x2d
00be8354	b.eq 0x00be8364
00be8358	cmp w1,#0x2b
00be835c	mov x28,x23
00be8360	b.ne 0x00be8384
00be8364	ldr x8,[x25]
00be8368	ldr x8,[x8, #0x58]
00be836c	mov x0,x25
00be8370	blr x8
00be8374	ldr x8,[x20]
00be8378	add x28,x23,#0x1
00be837c	str w0,[x8], #0x4
00be8380	str x8,[x20]
00be8384	sub x22,x21,x28
00be8388	stp x27,x19,[sp, #0x8]
00be838c	cmp x22,#0x2
00be8390	b.lt 0x00be8480
00be8394	ldrb w8,[x28]
00be8398	cmp w8,#0x30
00be839c	b.ne 0x00be8480
00be83a0	ldrb w8,[x28, #0x1]
00be83a4	orr w8,w8,#0x20
00be83a8	cmp w8,#0x78
00be83ac	b.ne 0x00be8480
00be83b0	ldr x8,[x25]
00be83b4	ldr x8,[x8, #0x58]
00be83b8	mov x0,x25
00be83bc	mov w1,#0x30
00be83c0	blr x8
00be83c4	ldr x8,[x20]
00be83c8	str w0,[x8], #0x4
00be83cc	str x8,[x20]
00be83d0	ldr x8,[x25]
00be83d4	ldrb w1,[x28, #0x1]
00be83d8	ldr x8,[x8, #0x58]
00be83dc	mov x0,x25
00be83e0	blr x8
00be83e4	ldr x8,[x20]
00be83e8	add x26,x28,#0x2
00be83ec	cmp x26,x21
00be83f0	str w0,[x8], #0x4
00be83f4	str x8,[x20]
00be83f8	b.cs 0x00be88b4
00be83fc	mov x23,x24
00be8400	adrp x19,0xd27000
00be8404	add x19,x19,#0xf8
00be8408	add x22,x28,x22
00be840c	adrp x28,0xd27000
00be8410	mov x27,x26
00be8414	b 0x00be8424
00be8418	add x27,x27,#0x1
00be841c	cmp x27,x21
00be8420	b.eq 0x00be88c4
00be8424	ldrb w24,[x27]
00be8428	ldarb w8,[x19]
00be842c	tbz w8,#0x0,0x00be8450
00be8430	sub w8,w24,#0x3a
00be8434	cmn w8,#0xb
00be8438	b.hi 0x00be8418
00be843c	orr w8,w24,#0x20
00be8440	sub w8,w8,#0x67
00be8444	cmn w8,#0x6
00be8448	b.cs 0x00be8418
00be844c	b 0x00be88bc
00be8450	mov x0,x19
00be8454	bl 0x00c2fe90
00be8458	adrp x1,0x2c6000
00be845c	add x1,x1,#0xbfc
00be8460	cbz w0,0x00be8430
00be8464	mov w0,#0x1fbf
00be8468	mov x2,xzr
00be846c	bl 0x00c43890
00be8470	str x0,[x28, #0xf0]
00be8474	mov x0,x19
00be8478	bl 0x00c2fea0
00be847c	b 0x00be8430
00be8480	cmp x28,x21
00be8484	b.cs 0x00be84f4
00be8488	adrp x19,0xd27000
00be848c	add x19,x19,#0xf8
00be8490	add x22,x28,x22
00be8494	adrp x23,0xd27000
00be8498	mov x27,x28
00be849c	ldrb w26,[x27]
00be84a0	ldarb w8,[x19]
00be84a4	tbz w8,#0x0,0x00be84c4
00be84a8	sub w8,w26,#0x3a
00be84ac	cmn w8,#0xa
00be84b0	b.cc 0x00be8504
00be84b4	add x27,x27,#0x1
00be84b8	cmp x27,x21
00be84bc	b.ne 0x00be849c
00be84c0	b 0x00be8500
00be84c4	mov x0,x19
00be84c8	bl 0x00c2fe90
00be84cc	adrp x1,0x2c6000
00be84d0	add x1,x1,#0xbfc
00be84d4	cbz w0,0x00be84a8
00be84d8	mov w0,#0x1fbf
00be84dc	mov x2,xzr
00be84e0	bl 0x00c43890
00be84e4	str x0,[x23, #0xf0]
00be84e8	mov x0,x19
00be84ec	bl 0x00c2fea0
00be84f0	b 0x00be84a8
00be84f4	mov x27,x28
00be84f8	mov x26,x28
00be84fc	b 0x00be8510
00be8500	mov x27,x22
00be8504	mov x26,x28
00be8508	ldr x23,[sp, #0x20]
00be850c	ldr x19,[sp, #0x10]
00be8510	ldrb w8,[sp, #0x28]
00be8514	ldr x9,[sp, #0x30]
00be8518	lsr x10,x8,#0x1
00be851c	tst w8,#0x1
00be8520	csel x8,x10,x9,eq
00be8524	cbz x8,0x00be8638
00be8528	cmp x26,x27
00be852c	b.eq 0x00be855c
00be8530	sub x8,x27,#0x1
00be8534	cmp x26,x8
00be8538	b.cs 0x00be855c
00be853c	add x9,x26,#0x1
00be8540	ldrb w10,[x8]
00be8544	ldurb w11,[x9, #-0x1]
00be8548	sturb w10,[x9, #-0x1]
00be854c	strb w11,[x8], #-0x1
00be8550	cmp x9,x8
00be8554	add x9,x9,#0x1
00be8558	b.cc 0x00be8540
00be855c	ldr x8,[x19]
00be8560	ldr x8,[x8, #0x20]
00be8564	mov x0,x19
00be8568	blr x8
00be856c	cmp x26,x27
00be8570	b.cs 0x00be8668
00be8574	add x8,sp,#0x28
00be8578	mov w19,w0
00be857c	str x24,[sp]
00be8580	mov w28,wzr
00be8584	mov w22,wzr
00be8588	orr x24,x8,#0x1
00be858c	mov x23,x26
00be8590	ldrb w8,[sp, #0x28]
00be8594	ldr x9,[sp, #0x38]
00be8598	tst w8,#0x1
00be859c	mov w8,w28
00be85a0	csel x10,x24,x9,eq
00be85a4	ldrb w10,[x10, x8]
00be85a8	cbz w10,0x00be85f4
00be85ac	ldrb w10,[sp, #0x28]
00be85b0	tst w10,#0x1
00be85b4	csel x9,x24,x9,eq
00be85b8	ldrb w9,[x9, x8]
00be85bc	cmp w22,w9
00be85c0	b.ne 0x00be85f4
00be85c4	ldr x9,[x20]
00be85c8	mov w22,wzr
00be85cc	str w19,[x9], #0x4
00be85d0	ldrb w10,[sp, #0x28]
00be85d4	ldr x11,[sp, #0x30]
00be85d8	str x9,[x20]
00be85dc	lsr x12,x10,#0x1
00be85e0	tst w10,#0x1
00be85e4	csel x10,x12,x11,eq
00be85e8	sub x10,x10,#0x1
00be85ec	cmp x10,x8
00be85f0	cinc w28,w28,hi
00be85f4	ldr x8,[x25]
00be85f8	ldrb w1,[x23]
00be85fc	ldr x8,[x8, #0x58]
00be8600	mov x0,x25
00be8604	blr x8
00be8608	ldr x8,[x20]
00be860c	add x23,x23,#0x1
00be8610	add w22,w22,#0x1
00be8614	cmp x23,x27
00be8618	mov x9,x8
00be861c	str w0,[x9], #0x4
00be8620	str x9,[x20]
00be8624	b.ne 0x00be8590
00be8628	ldp x16,x23,[sp, #0x18]
00be862c	add x3,x8,#0x4
00be8630	ldr x24,[sp]
00be8634	b 0x00be8670
00be8638	ldr x8,[x25]
00be863c	ldr x3,[x20]
00be8640	ldr x8,[x8, #0x60]
00be8644	mov x0,x25
00be8648	mov x1,x26
00be864c	mov x2,x27
00be8650	blr x8
00be8654	ldr x8,[x20]
00be8658	sub x9,x27,x26
00be865c	add x3,x8,x9, LSL #0x2
00be8660	str x3,[x20]
00be8664	b 0x00be87cc
00be8668	ldr x3,[x20]
00be866c	ldr x16,[sp, #0x18]
00be8670	sub x8,x26,x23
00be8674	ldr x19,[sp, #0x10]
00be8678	add x9,x16,x8, LSL #0x2
00be867c	cmp x9,x3
00be8680	b.eq 0x00be87cc
00be8684	sub x8,x3,#0x4
00be8688	cmp x9,x8
00be868c	b.cs 0x00be87cc
00be8690	lsl x10,x26,#0x2
00be8694	lsl x11,x23,#0x2
00be8698	sub x14,x3,#0x8
00be869c	add x12,x10,x16
00be86a0	sub x12,x12,x11
00be86a4	add x13,x12,#0x4
00be86a8	cmp x13,x14
00be86ac	csel x12,x13,x14,hi
00be86b0	add x12,x12,x11
00be86b4	sub x12,x12,x16
00be86b8	sub x12,x12,#0x4
00be86bc	cmp x12,x10
00be86c0	cset w15,ne
00be86c4	cmp x12,x10
00be86c8	bfm x15,x26,#0x3e,#0x3d
00be86cc	sub x15,x12,x15
00be86d0	lsr x15,x15,#0x3
00be86d4	cinc x12,x15,ne
00be86d8	cmp x12,#0x1f
00be86dc	b.cc 0x00be87ac
00be86e0	cmp x13,x14
00be86e4	csel x13,x13,x14,hi
00be86e8	add x13,x13,x11
00be86ec	sub x13,x13,x16
00be86f0	sub x13,x13,#0x4
00be86f4	cmp x13,x10
00be86f8	cset w14,ne
00be86fc	cmp x13,x10
00be8700	bfm x14,x26,#0x3e,#0x3d
00be8704	sub x14,x13,x14
00be8708	lsr x14,x14,#0x3
00be870c	cinc x13,x14,ne
00be8710	cmp x9,x3
00be8714	b.cs 0x00be873c
00be8718	lsl x13,x13,#0x2
00be871c	add x14,x10,x13
00be8720	sub x13,x3,x13
00be8724	sub x14,x14,x11
00be8728	sub x13,x13,#0x4
00be872c	add x14,x14,x16
00be8730	add x14,x14,#0x4
00be8734	cmp x13,x14
00be8738	b.cc 0x00be87ac
00be873c	add x12,x12,#0x1
00be8740	sub x10,x10,x11
00be8744	sub x11,x3,#0x10
00be8748	and x13,x12,#0x7ffffffffffffff8
00be874c	add x10,x10,x16
00be8750	lsl x14,x13,#0x2
00be8754	add x10,x10,#0x10
00be8758	sub x8,x8,x14
00be875c	add x9,x9,x14
00be8760	mov x14,x13
00be8764	ldp q1,q0,[x11, #-0x10]
00be8768	sub x14,x14,#0x8
00be876c	ldp q2,q3,[x10, #-0x10]
00be8770	rev64 v0.4S,v0.4S
00be8774	rev64 v1.4S,v1.4S
00be8778	rev64 v2.4S,v2.4S
00be877c	rev64 v3.4S,v3.4S
00be8780	ext v0.16B,v0.16B,v0.16B,0x8
00be8784	ext v1.16B,v1.16B,v1.16B,0x8
00be8788	ext v2.16B,v2.16B,v2.16B,0x8
00be878c	ext v3.16B,v3.16B,v3.16B,0x8
00be8790	stp q0,q1,[x10, #-0x10]
00be8794	add x10,x10,#0x20
00be8798	stp q3,q2,[x11, #-0x10]
00be879c	sub x11,x11,#0x20
00be87a0	cbnz x14,0x00be8764
00be87a4	cmp x12,x13
00be87a8	b.eq 0x00be87cc
00be87ac	add x9,x9,#0x4
00be87b0	ldr w10,[x8]
00be87b4	ldur w11,[x9, #-0x4]
00be87b8	stur w10,[x9, #-0x4]
00be87bc	str w11,[x8], #-0x4
00be87c0	cmp x9,x8
00be87c4	add x9,x9,#0x4
00be87c8	b.cc 0x00be87b0
00be87cc	cmp x27,x21
00be87d0	b.cs 0x00be8834
00be87d4	ldrb w1,[x27]
00be87d8	cmp w1,#0x2e
00be87dc	b.eq 0x00be8814
00be87e0	ldr x8,[x25]
00be87e4	ldr x8,[x8, #0x58]
00be87e8	mov x0,x25
00be87ec	blr x8
00be87f0	ldr x8,[x20]
00be87f4	add x27,x27,#0x1
00be87f8	cmp x27,x21
00be87fc	mov x9,x8
00be8800	str w0,[x9], #0x4
00be8804	str x9,[x20]
00be8808	b.ne 0x00be87d4
00be880c	add x3,x8,#0x4
00be8810	b 0x00be8834
00be8814	ldr x8,[x19]
00be8818	ldr x8,[x8, #0x18]
00be881c	mov x0,x19
00be8820	blr x8
00be8824	ldr x3,[x20]
00be8828	add x27,x27,#0x1
00be882c	str w0,[x3], #0x4
00be8830	str x3,[x20]
00be8834	ldr x8,[x25]
00be8838	ldr x8,[x8, #0x60]
00be883c	mov x0,x25
00be8840	mov x1,x27
00be8844	mov x2,x21
00be8848	blr x8
00be884c	ldr x8,[x20]
00be8850	sub x9,x21,x27
00be8854	ldr x11,[sp, #0x8]
00be8858	add x8,x8,x9, LSL #0x2
00be885c	ldr x9,[sp, #0x18]
00be8860	sub x10,x11,x23
00be8864	cmp x11,x21
00be8868	add x9,x9,x10, LSL #0x2
00be886c	ldrb w10,[sp, #0x28]
00be8870	str x8,[x20]
00be8874	csel x8,x8,x9,eq
00be8878	str x8,[x24]
00be887c	tbz w10,#0x0,0x00be8890
00be8880	ldr x8,[sp, #0x28]
00be8884	ldr x0,[sp, #0x38]
00be8888	and x1,x8,#-0x2
00be888c	bl 0x00c2fe80
00be8890	ldp x20,x19,[sp, #0xa0]
00be8894	ldp x22,x21,[sp, #0x90]
00be8898	ldp x24,x23,[sp, #0x80]
00be889c	ldp x26,x25,[sp, #0x70]
00be88a0	ldp x28,x27,[sp, #0x60]
00be88a4	ldp x29,x30,[sp, #0x50]
00be88a8	add sp,sp,#0xb0
00be88ac	autiasp
00be88b0	ret
00be88b4	mov x27,x26
00be88b8	b 0x00be8510
00be88bc	mov x24,x23
00be88c0	b 0x00be8508
00be88c4	mov x27,x22
00be88c8	mov x24,x23
00be88cc	b 0x00be8508
00be88d0	bl 0x00bd8968
