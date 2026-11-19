; FUN_0085b410 @ 0085b410
0085b410	sub sp,sp,#0x160
0085b414	stp x29,x30,[sp, #0x100]
0085b418	stp x28,x27,[sp, #0x110]
0085b41c	stp x26,x25,[sp, #0x120]
0085b420	stp x24,x23,[sp, #0x130]
0085b424	stp x22,x21,[sp, #0x140]
0085b428	stp x20,x19,[sp, #0x150]
0085b42c	add x29,sp,#0x100
0085b430	mrs x28,tpidr_el0
0085b434	mov x24,x6
0085b438	mov w20,w5
0085b43c	ldr x8,[x28, #0x28]
0085b440	mov x25,x4
0085b444	mov x21,x1
0085b448	mov x22,x3
0085b44c	mov x19,x0
0085b450	stur x8,[x29, #-0x10]
0085b454	stp x1,x2,[x29, #-0x40]
0085b458	tbnz w5,#0x0,0x0085b464
0085b45c	mov x0,x19
0085b460	bl 0x00858f2c
0085b464	adrp x8,0xd1e000
0085b468	ldrb w8,[x8, #0xc80]
0085b46c	cmp w8,#0x1
0085b470	b.ne 0x0085b4a0
0085b474	mov x0,x19
0085b478	bl 0x00863160
0085b47c	tbz w0,#0x0,0x0085b4a0
0085b480	ldr x0,[x19, #0xa8]
0085b484	cbz x0,0x0085b498
0085b488	adrp x1,0x2a5000
0085b48c	add x1,x1,#0x1a9
0085b490	bl 0x00c301f0
0085b494	cbz w0,0x0085b8b4
0085b498	mov w21,wzr
0085b49c	b 0x0085b8c0
0085b4a0	mov x0,x19
0085b4a4	ldr w8,[x0, #0x90]!
0085b4a8	cmp w8,#0x12b
0085b4ac	b.ne 0x0085b4f8
0085b4b0	ldp q0,q1,[x0]
0085b4b4	mov x0,x19
0085b4b8	stp q0,q1,[x29, #-0x60]
0085b4bc	bl 0x00858f2c
0085b4c0	ldur x23,[x29, #-0x5c]
0085b4c4	cmp w23,w21
0085b4c8	b.ne 0x0085b4d4
0085b4cc	lsr x8,x21,#0x20
0085b4d0	stur w8,[x29, #-0x58]
0085b4d4	ldr w8,[x19, #0x90]
0085b4d8	cmp w8,#0x119
0085b4dc	b.ne 0x0085b560
0085b4e0	ldur q0,[x19, #0x94]
0085b4e4	ldr x26,[x19, #0xa8]
0085b4e8	mov x0,x19
0085b4ec	stur q0,[x29, #-0x70]
0085b4f0	bl 0x00858f2c
0085b4f4	b 0x0085b57c
0085b4f8	ldr x8,[x25, #0x8]
0085b4fc	cbz x8,0x0085b680
0085b500	sub x8,x29,#0x60
0085b504	stp xzr,xzr,[x29, #-0x78]
0085b508	sub x20,x29,#0x60
0085b50c	stp xzr,xzr,[sp, #0x60]
0085b510	bl 0x008521fc
0085b514	ldurb w8,[x29, #-0x60]
0085b518	ldur x9,[x29, #-0x50]
0085b51c	tst w8,#0x1
0085b520	csinc x5,x9,x20,ne
0085b524	adrp x4,0x2c0000
0085b528	add x4,x4,#0xdf3
0085b52c	add x1,x19,#0x94
0085b530	sub x2,x29,#0x78
0085b534	add x3,sp,#0x60
0085b538	mov x0,x19
0085b53c	bl 0x0085e984
0085b540	ldurb w8,[x29, #-0x60]
0085b544	mov x21,x0
0085b548	tbz w8,#0x0,0x0085bc88
0085b54c	ldur x8,[x29, #-0x60]
0085b550	ldur x0,[x29, #-0x50]
0085b554	and x1,x8,#-0x2
0085b558	bl 0x00c2fe80
0085b55c	b 0x0085bc88
0085b560	adrp x1,0x2c2000
0085b564	add x1,x1,#0xd59
0085b568	mov x0,x19
0085b56c	bl 0x0086e040
0085b570	ldur x8,[x19, #0x94]
0085b574	ldr x26,[x19, #0x138]
0085b578	stp x8,x8,[x29, #-0x70]
0085b57c	ldr x8,[x19, #0x1e8]
0085b580	ands w20,w20,#0x1
0085b584	sub x2,x29,#0x60
0085b588	sub x3,x29,#0x78
0085b58c	sub x4,x29,#0x78
0085b590	mov x0,x19
0085b594	ldr w9,[x8, #0x4a0]
0085b598	mov w1,wzr
0085b59c	mov x5,x25
0085b5a0	mov w6,w20
0085b5a4	mov x7,xzr
0085b5a8	stur x26,[x29, #-0x78]
0085b5ac	add w9,w9,#0x1
0085b5b0	csinv x25,x22,xzr,ne
0085b5b4	str w9,[x8, #0x4a0]
0085b5b8	bl 0x00863248
0085b5bc	ldr x8,[x19, #0x1e8]
0085b5c0	mov x26,x0
0085b5c4	mov x27,x1
0085b5c8	mov w1,#0x40
0085b5cc	ldr w9,[x8, #0x4a0]
0085b5d0	sub w9,w9,#0x1
0085b5d4	str w9,[x8, #0x4a0]
0085b5d8	ldur x8,[x0, #0x14]
0085b5dc	ldr x0,[x19, #0xe8]
0085b5e0	stp x21,x8,[sp, #0x60]
0085b5e4	bl 0x0084e938
0085b5e8	add x1,sp,#0x60
0085b5ec	mov x2,x27
0085b5f0	mov x3,x26
0085b5f4	mov w4,w20
0085b5f8	mov x5,x25
0085b5fc	mov x21,x0
0085b600	bl 0x008503a4
0085b604	ldrb w8,[x19, #0x68]
0085b608	cmp w8,#0x1
0085b60c	b.ne 0x0085bc88
0085b610	ldr x20,[x19, #0xe8]
0085b614	cbz x24,0x0085b6f4
0085b618	ldr x25,[x24, #0x10]
0085b61c	cbz x25,0x0085babc
0085b620	ldp x8,x27,[x24]
0085b624	lsl x1,x25,#0x3
0085b628	mov x0,x20
0085b62c	ldr x26,[x8]
0085b630	bl 0x0084e938
0085b634	cmp x25,#0x8
0085b638	mov x24,x0
0085b63c	b.cc 0x0085b654
0085b640	lsl x8,x27,#0x3
0085b644	add x10,x8,x26
0085b648	sub x8,x24,x10
0085b64c	cmp x8,#0x20
0085b650	b.cs 0x0085bd2c
0085b654	mov x8,xzr
0085b658	lsl x10,x8,#0x3
0085b65c	sub x8,x25,x8
0085b660	add x9,x10,x27, LSL #0x3
0085b664	add x10,x24,x10
0085b668	add x9,x26,x9
0085b66c	ldr x11,[x9], #0x8
0085b670	subs x8,x8,#0x1
0085b674	str x11,[x10], #0x8
0085b678	b.ne 0x0085b66c
0085b67c	b 0x0085bac0
0085b680	ldr x8,[x19, #0x1e8]
0085b684	stp xzr,xzr,[sp, #0x78]
0085b688	str x28,[sp, #0x18]
0085b68c	ldr w9,[x8, #0xf4]
0085b690	add w9,w9,#0x1
0085b694	str w9,[x8, #0xf4]
0085b698	ldr x8,[x19, #0x308]
0085b69c	ldr x9,[x19, #0x300]
0085b6a0	ldrb w10,[x19, #0x68]
0085b6a4	sub x8,x8,x9
0085b6a8	orr x9,xzr,#-0x5555555555555556
0085b6ac	cmp w10,#0x1
0085b6b0	asr x8,x8,#0x4
0085b6b4	movk x9,#0xaaab
0085b6b8	mul x8,x8,x9
0085b6bc	add x9,x19,#0x300
0085b6c0	stur x9,[x29, #-0x78]
0085b6c4	stp x8,xzr,[x29, #-0x70]
0085b6c8	b.ne 0x0085b714
0085b6cc	sub x8,x29,#0x60
0085b6d0	sub x1,x29,#0x78
0085b6d4	add x3,sp,#0x78
0085b6d8	and w6,w20,#0x1
0085b6dc	mov x0,x19
0085b6e0	mov w2,wzr
0085b6e4	mov x4,xzr
0085b6e8	mov x5,xzr
0085b6ec	bl 0x008614c0
0085b6f0	b 0x0085b738
0085b6f4	mov x0,x20
0085b6f8	mov w1,#0x28
0085b6fc	bl 0x0084e938
0085b700	mov x1,x22
0085b704	mov x2,x23
0085b708	mov x20,x0
0085b70c	bl 0x00852014
0085b710	b 0x0085bae4
0085b714	sub x8,x29,#0x60
0085b718	sub x1,x29,#0x78
0085b71c	and w6,w20,#0x1
0085b720	mov x0,x19
0085b724	mov w2,wzr
0085b728	mov x3,xzr
0085b72c	mov x4,xzr
0085b730	mov x5,xzr
0085b734	bl 0x008614c0
0085b738	ldr x8,[x19, #0x1e8]
0085b73c	add x12,x19,#0x450
0085b740	str w20,[sp, #0x10]
0085b744	sturb wzr,[x29, #-0x30]
0085b748	ldr w9,[x8, #0xf4]
0085b74c	str x12,[sp, #0x60]
0085b750	sturb wzr,[x29, #-0x20]
0085b754	sub w9,w9,#0x1
0085b758	str w9,[x8, #0xf4]
0085b75c	ldr x8,[x19, #0x2a8]
0085b760	ldr x9,[x19, #0x2a0]
0085b764	ldr x10,[x19, #0x458]
0085b768	ldr x11,[x19, #0x450]
0085b76c	sub x8,x8,x9
0085b770	add x9,x19,#0x2a0
0085b774	asr x8,x8,#0x3
0085b778	sub x10,x10,x11
0085b77c	stur x9,[x29, #-0x60]
0085b780	ldr w9,[x19, #0x90]
0085b784	ldr x11,[x19, #0x318]
0085b788	asr x10,x10,#0x3
0085b78c	stp x8,xzr,[x29, #-0x58]
0085b790	ldr x8,[x19, #0x320]
0085b794	cmp w9,#0x3d
0085b798	stp x10,xzr,[sp, #0x68]
0085b79c	stp x11,x8,[sp]
0085b7a0	sub x8,x8,x11
0085b7a4	str x8,[sp, #0x20]
0085b7a8	b.ne 0x0085b7e0
0085b7ac	ldur q0,[x19, #0x94]
0085b7b0	mov w8,#0x1
0085b7b4	sturb w8,[x29, #-0x20]
0085b7b8	stur q0,[x29, #-0x30]
0085b7bc	mov x0,x19
0085b7c0	bl 0x00858f2c
0085b7c4	ldrb w8,[x19, #0x68]
0085b7c8	cmp w8,#0x0
0085b7cc	add x8,sp,#0x60
0085b7d0	csel x2,x8,xzr,ne
0085b7d4	sub x1,x29,#0x60
0085b7d8	mov x0,x19
0085b7dc	bl 0x00861848
0085b7e0	ldur x8,[x29, #-0x68]
0085b7e4	add x23,x19,#0x318
0085b7e8	str x8,[sp, #0x28]
0085b7ec	cbz x8,0x0085b898
0085b7f0	ldp x24,x8,[x29, #-0x78]
0085b7f4	ldr x27,[sp, #0x28]
0085b7f8	add x8,x8,x8, LSL #0x1
0085b7fc	lsl x25,x8,#0x4
0085b800	ldr x26,[x24]
0085b804	add x0,x19,#0x180
0085b808	add x1,x26,x25
0085b80c	bl 0x0086e18c
0085b810	ldp x20,x28,[x19, #0x158]
0085b814	mov x22,x0
0085b818	ldr x0,[x19, #0xe8]
0085b81c	mov w1,#0x40
0085b820	bl 0x0084e938
0085b824	add x8,x26,x25
0085b828	sub x9,x28,x20
0085b82c	ldr x11,[x22]
0085b830	ldr x10,[x8]
0085b834	ldur w12,[x28, #-0x4]
0085b838	asr x9,x9,#0x3
0085b83c	ldr x13,[x8, #0x18]
0085b840	ldrb w14,[x8, #0x28]
0085b844	str x10,[x0]
0085b848	sub x9,x9,#0x1
0085b84c	ldur q0,[x8, #0x8]
0085b850	stp x11,x9,[x0, #0x18]
0085b854	str x12,[x0, #0x28]
0085b858	strb w14,[x0, #0x30]
0085b85c	strb wzr,[x0, #0x31]
0085b860	stur q0,[x0, #0x8]
0085b864	str x13,[x0, #0x38]
0085b868	str x0,[x22]
0085b86c	add x0,x19,#0x1b8
0085b870	mov x1,x22
0085b874	bl 0x0086e2d0
0085b878	ldr x8,[x22]
0085b87c	str x8,[sp, #0x50]
0085b880	add x1,sp,#0x50
0085b884	mov x0,x23
0085b888	bl 0x0086e2d0
0085b88c	subs x27,x27,#0x1
0085b890	add x25,x25,#0x30
0085b894	b.ne 0x0085b800
0085b898	ldur x22,[x29, #-0x50]
0085b89c	cbz x22,0x0085b908
0085b8a0	ldur x8,[x29, #-0x60]
0085b8a4	ldr x8,[x8, #0x8]
0085b8a8	ldur x8,[x8, #-0x8]
0085b8ac	add x8,x8,#0xc
0085b8b0	b 0x0085b90c
0085b8b4	mov x0,x19
0085b8b8	bl 0x00858f2c
0085b8bc	mov w21,#0x1
0085b8c0	mov x0,x19
0085b8c4	bl 0x00858f2c
0085b8c8	ldr x8,[x25, #0x8]
0085b8cc	cbz x8,0x0085b8e4
0085b8d0	adrp x2,0x2c4000
0085b8d4	add x2,x2,#0xb44
0085b8d8	sub x1,x29,#0x40
0085b8dc	mov x0,x19
0085b8e0	bl 0x00860ecc
0085b8e4	tst w20,#0x1
0085b8e8	mov w8,#0x1
0085b8ec	sub x1,x29,#0x40
0085b8f0	cinc w2,w8,ne
0085b8f4	mov x0,x19
0085b8f8	mov w3,w21
0085b8fc	bl 0x0085da04
0085b900	mov x21,x0
0085b904	b 0x0085bc88
0085b908	add x8,x19,#0xb0
0085b90c	ldr x28,[sp, #0x18]
0085b910	ldr w20,[sp, #0x10]
0085b914	ldr x12,[sp, #0x28]
0085b918	ldr x8,[x8, #0x8]
0085b91c	ldr x24,[x19, #0xe8]
0085b920	stp x21,x8,[sp, #0x50]
0085b924	cbz x12,0x0085b990
0085b928	ldr x21,[x23]
0085b92c	lsl x1,x12,#0x3
0085b930	mov x0,x24
0085b934	mov x23,x12
0085b938	bl 0x0084e938
0085b93c	ldp x14,x13,[sp]
0085b940	cmp x23,#0x8
0085b944	mov x12,x23
0085b948	b.cc 0x0085b960
0085b94c	add x8,x14,x0
0085b950	add x9,x21,x13
0085b954	sub x8,x8,x9
0085b958	cmp x8,#0x20
0085b95c	b.cs 0x0085bcbc
0085b960	mov x8,xzr
0085b964	lsl x10,x8,#0x3
0085b968	sub x8,x12,x8
0085b96c	add x9,x13,x10
0085b970	add x10,x0,x10
0085b974	sub x9,x9,x14
0085b978	add x9,x21,x9
0085b97c	ldr x11,[x9], #0x8
0085b980	subs x8,x8,#0x1
0085b984	str x11,[x10], #0x8
0085b988	b.ne 0x0085b97c
0085b98c	b 0x0085b994
0085b990	mov x0,xzr
0085b994	stp x0,x12,[sp, #0x40]
0085b998	cbz x22,0x0085b9f8
0085b99c	ldp x8,x23,[x29, #-0x60]
0085b9a0	lsl x1,x22,#0x3
0085b9a4	ldr x0,[x19, #0xe8]
0085b9a8	ldr x21,[x8]
0085b9ac	bl 0x0084e938
0085b9b0	cmp x22,#0x8
0085b9b4	b.cc 0x0085b9cc
0085b9b8	lsl x8,x23,#0x3
0085b9bc	add x10,x8,x21
0085b9c0	sub x8,x0,x10
0085b9c4	cmp x8,#0x20
0085b9c8	b.cs 0x0085bcf8
0085b9cc	mov x8,xzr
0085b9d0	lsl x10,x8,#0x3
0085b9d4	sub x8,x22,x8
0085b9d8	add x9,x10,x23, LSL #0x3
0085b9dc	add x10,x0,x10
0085b9e0	add x9,x21,x9
0085b9e4	ldr x11,[x9], #0x8
0085b9e8	subs x8,x8,#0x1
0085b9ec	str x11,[x10], #0x8
0085b9f0	b.ne 0x0085b9e4
0085b9f4	b 0x0085b9fc
0085b9f8	mov x0,xzr
0085b9fc	stp x0,x22,[sp, #0x30]
0085ba00	mov x0,x24
0085ba04	mov w1,#0x70
0085ba08	bl 0x0084e938
0085ba0c	add x1,sp,#0x50
0085ba10	add x2,sp,#0x40
0085ba14	add x3,sp,#0x30
0085ba18	sub x4,x29,#0x30
0085ba1c	and w5,w20,#0x1
0085ba20	mov x21,x0
0085ba24	bl 0x0084fe44
0085ba28	ldrb w8,[x19, #0x68]
0085ba2c	cmp w8,#0x1
0085ba30	b.ne 0x0085bb3c
0085ba34	ldr x23,[x19, #0xe8]
0085ba38	sub x1,x29,#0x78
0085ba3c	mov x0,x19
0085ba40	bl 0x0086191c
0085ba44	ldr x24,[sp, #0x70]
0085ba48	mov x26,x0
0085ba4c	str x1,[sp, #0x10]
0085ba50	cbz x24,0x0085bafc
0085ba54	ldp x8,x25,[sp, #0x60]
0085ba58	lsl x1,x24,#0x3
0085ba5c	str x23,[sp, #0x8]
0085ba60	ldr x0,[x19, #0xe8]
0085ba64	ldr x23,[x8]
0085ba68	bl 0x0084e938
0085ba6c	mov x27,x0
0085ba70	cmp x24,#0x8
0085ba74	b.cc 0x0085ba8c
0085ba78	lsl x8,x25,#0x3
0085ba7c	add x10,x8,x23
0085ba80	sub x8,x27,x10
0085ba84	cmp x8,#0x20
0085ba88	b.cs 0x0085bd60
0085ba8c	mov x8,xzr
0085ba90	lsl x10,x8,#0x3
0085ba94	sub x8,x24,x8
0085ba98	add x9,x10,x25, LSL #0x3
0085ba9c	add x10,x27,x10
0085baa0	add x9,x23,x9
0085baa4	ldr x11,[x9], #0x8
0085baa8	subs x8,x8,#0x1
0085baac	str x11,[x10], #0x8
0085bab0	b.ne 0x0085baa4
0085bab4	ldr x23,[sp, #0x8]
0085bab8	b 0x0085bb00
0085babc	mov x24,xzr
0085bac0	mov x0,x20
0085bac4	mov w1,#0x28
0085bac8	bl 0x0084e938
0085bacc	mov x1,x24
0085bad0	mov x2,x25
0085bad4	mov x3,x22
0085bad8	mov x4,x23
0085badc	mov x20,x0
0085bae0	bl 0x0085202c
0085bae4	add x0,x19,#0x4b0
0085bae8	sub x1,x29,#0x30
0085baec	stur x21,[x29, #-0x30]
0085baf0	bl 0x00860fa0
0085baf4	str x20,[x0]
0085baf8	b 0x0085bc88
0085bafc	mov x27,xzr
0085bb00	mov x0,x23
0085bb04	mov w1,#0x38
0085bb08	bl 0x0084e938
0085bb0c	ldp x3,x4,[sp, #0x78]
0085bb10	mov x25,x0
0085bb14	ldr x2,[sp, #0x10]
0085bb18	mov x1,x26
0085bb1c	mov x5,x27
0085bb20	mov x6,x24
0085bb24	bl 0x00851f34
0085bb28	str x21,[sp, #0x50]
0085bb2c	add x0,x19,#0x4b0
0085bb30	add x1,sp,#0x50
0085bb34	bl 0x00860fa0
0085bb38	str x25,[x0]
0085bb3c	ldr x10,[sp, #0x28]
0085bb40	tbz w20,#0x0,0x0085bb9c
0085bb44	cbz x22,0x0085bb84
0085bb48	ldur x8,[x29, #-0x60]
0085bb4c	adrp x9,0xd1b000
0085bb50	ldr w9,[x9, #0x40]
0085bb54	ldr x8,[x8, #0x8]
0085bb58	ldur x8,[x8, #-0x8]
0085bb5c	ldr w8,[x8, #0x8]
0085bb60	cmp w8,w9
0085bb64	b.eq 0x0085bb9c
0085bb68	adrp x9,0xd1b000
0085bb6c	ldr w9,[x9, #0x30]
0085bb70	cmp w8,w9
0085bb74	b.eq 0x0085bb9c
0085bb78	cmp x22,x10
0085bb7c	b.ne 0x0085bb88
0085bb80	b 0x0085bb9c
0085bb84	cbz x10,0x0085bb9c
0085bb88	adrp x2,0x2b8000
0085bb8c	add x2,x2,#0xe57
0085bb90	add x1,x21,#0xc
0085bb94	mov x0,x19
0085bb98	bl 0x00860ecc
0085bb9c	ldp x23,x9,[sp, #0x60]
0085bba0	ldp x10,x8,[x23]
0085bba4	add x20,x10,x9, LSL #0x3
0085bba8	cmp x20,x8
0085bbac	b.eq 0x0085bbd4
0085bbb0	sub x9,x8,x20
0085bbb4	add x1,x20,x9
0085bbb8	subs x22,x8,x1
0085bbbc	b.eq 0x0085bbcc
0085bbc0	mov x0,x20
0085bbc4	mov x2,x22
0085bbc8	bl 0x00c2ff60
0085bbcc	add x8,x20,x22
0085bbd0	str x8,[x23, #0x8]
0085bbd4	ldp x23,x9,[x29, #-0x60]
0085bbd8	ldp x10,x8,[x23]
0085bbdc	add x20,x10,x9, LSL #0x3
0085bbe0	cmp x20,x8
0085bbe4	b.eq 0x0085bc0c
0085bbe8	sub x9,x8,x20
0085bbec	add x1,x20,x9
0085bbf0	subs x22,x8,x1
0085bbf4	b.eq 0x0085bc04
0085bbf8	mov x0,x20
0085bbfc	mov x2,x22
0085bc00	bl 0x00c2ff60
0085bc04	add x8,x20,x22
0085bc08	str x8,[x23, #0x8]
0085bc0c	ldr x9,[x19, #0x318]
0085bc10	ldr x10,[sp, #0x20]
0085bc14	ldr x8,[x19, #0x320]
0085bc18	add x20,x10,x9
0085bc1c	cmp x20,x8
0085bc20	b.eq 0x0085bc48
0085bc24	sub x9,x8,x20
0085bc28	add x1,x20,x9
0085bc2c	subs x22,x8,x1
0085bc30	b.eq 0x0085bc40
0085bc34	mov x0,x20
0085bc38	mov x2,x22
0085bc3c	bl 0x00c2ff60
0085bc40	add x8,x20,x22
0085bc44	str x8,[x19, #0x320]
0085bc48	ldp x20,x9,[x29, #-0x78]
0085bc4c	mov w10,#0x30
0085bc50	ldp x11,x8,[x20]
0085bc54	nop
0085bc58	madd x19,x9,x10,x11
0085bc5c	cmp x19,x8
0085bc60	b.eq 0x0085bc88
0085bc64	sub x9,x8,x19
0085bc68	add x1,x19,x9
0085bc6c	subs x22,x8,x1
0085bc70	b.eq 0x0085bc80
0085bc74	sub x2,x22,#0x7
0085bc78	mov x0,x19
0085bc7c	bl 0x00c2ff60
0085bc80	add x8,x19,x22
0085bc84	str x8,[x20, #0x8]
0085bc88	ldr x8,[x28, #0x28]
0085bc8c	ldur x9,[x29, #-0x10]
0085bc90	cmp x8,x9
0085bc94	b.ne 0x0085bef0
0085bc98	mov x0,x21
0085bc9c	ldp x20,x19,[sp, #0x150]
0085bca0	ldp x22,x21,[sp, #0x140]
0085bca4	ldp x24,x23,[sp, #0x130]
0085bca8	ldp x26,x25,[sp, #0x120]
0085bcac	ldp x28,x27,[sp, #0x110]
0085bcb0	ldp x29,x30,[sp, #0x100]
0085bcb4	add sp,sp,#0x160
0085bcb8	ret
0085bcbc	ldr x9,[sp, #0x20]
0085bcc0	and x8,x12,#-0x4
0085bcc4	mov x11,x8
0085bcc8	add x10,x9,x21
0085bccc	add x9,x0,#0x10
0085bcd0	add x10,x10,#0x10
0085bcd4	ldp q0,q1,[x10, #-0x10]
0085bcd8	subs x11,x11,#0x4
0085bcdc	add x10,x10,#0x20
0085bce0	stp q0,q1,[x9, #-0x10]
0085bce4	add x9,x9,#0x20
0085bce8	b.ne 0x0085bcd4
0085bcec	cmp x12,x8
0085bcf0	b.eq 0x0085b994
0085bcf4	b 0x0085b964
0085bcf8	and x8,x22,#-0x4
0085bcfc	add x9,x0,#0x10
0085bd00	add x10,x10,#0x10
0085bd04	mov x11,x8
0085bd08	ldp q0,q1,[x10, #-0x10]
0085bd0c	subs x11,x11,#0x4
0085bd10	add x10,x10,#0x20
0085bd14	stp q0,q1,[x9, #-0x10]
0085bd18	add x9,x9,#0x20
0085bd1c	b.ne 0x0085bd08
0085bd20	cmp x22,x8
0085bd24	b.eq 0x0085b9fc
0085bd28	b 0x0085b9d0
0085bd2c	and x8,x25,#-0x4
0085bd30	add x9,x24,#0x10
0085bd34	add x10,x10,#0x10
0085bd38	mov x11,x8
0085bd3c	ldp q0,q1,[x10, #-0x10]
0085bd40	subs x11,x11,#0x4
0085bd44	add x10,x10,#0x20
0085bd48	stp q0,q1,[x9, #-0x10]
0085bd4c	add x9,x9,#0x20
0085bd50	b.ne 0x0085bd3c
0085bd54	cmp x25,x8
0085bd58	b.eq 0x0085bac0
0085bd5c	b 0x0085b658
0085bd60	and x8,x24,#-0x4
0085bd64	add x9,x27,#0x10
0085bd68	add x10,x10,#0x10
0085bd6c	mov x11,x8
0085bd70	ldp q0,q1,[x10, #-0x10]
0085bd74	subs x11,x11,#0x4
0085bd78	add x10,x10,#0x20
0085bd7c	stp q0,q1,[x9, #-0x10]
0085bd80	add x9,x9,#0x20
0085bd84	b.ne 0x0085bd70
0085bd88	cmp x24,x8
0085bd8c	b.eq 0x0085bab4
0085bd90	b 0x0085ba90
0085bef0	bl 0x00c2fec0
