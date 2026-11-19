; FUN_0085c3e4 @ 0085c3e4
0085c3e4	sub sp,sp,#0xd0
0085c3e8	stp x29,x30,[sp, #0x80]
0085c3ec	stp x26,x25,[sp, #0x90]
0085c3f0	stp x24,x23,[sp, #0xa0]
0085c3f4	stp x22,x21,[sp, #0xb0]
0085c3f8	stp x20,x19,[sp, #0xc0]
0085c3fc	add x29,sp,#0x80
0085c400	mrs x24,tpidr_el0
0085c404	mov x21,x0
0085c408	mov x19,x0
0085c40c	ldr x8,[x24, #0x28]
0085c410	stur x8,[x29, #-0x8]
0085c414	ldr x8,[x0, #0x488]
0085c418	ldr x9,[x0, #0x480]
0085c41c	ldur x20,[x0, #0x9c]
0085c420	ldr x23,[x21, #0x94]!
0085c424	stp xzr,xzr,[sp, #0x28]
0085c428	sub x8,x8,x9
0085c42c	add x9,x0,#0x480
0085c430	str xzr,[sp, #0x20]
0085c434	asr x8,x8,#0x3
0085c438	stp x9,x8,[sp, #0x10]
0085c43c	add x1,sp,#0x10
0085c440	bl 0x00862f80
0085c444	ldur w8,[x19, #0x90]
0085c448	stp x0,x1,[sp, #0x28]
0085c44c	cmp w8,#0x119
0085c450	b.eq 0x0085c4fc
0085c454	cmp w8,#0x12b
0085c458	b.eq 0x0085c4b4
0085c45c	cmp w8,#0x12e
0085c460	b.ne 0x0085c558
0085c464	ldr x8,[sp, #0x20]
0085c468	cbz x1,0x0085c5d4
0085c46c	ldr x9,[x0]
0085c470	cbz x8,0x0085c660
0085c474	ldp x8,x10,[sp, #0x10]
0085c478	ldr x8,[x8]
0085c47c	ldr x8,[x8, x10, LSL #0x3]
0085c480	ldp w11,w10,[x9, #0xc]
0085c484	ldr x23,[x8]
0085c488	lsr x8,x23,#0x20
0085c48c	cmp w10,w8
0085c490	cset w12,cc
0085c494	cmp w11,w23
0085c498	cset w13,cc
0085c49c	csel w12,w12,w13,eq
0085c4a0	tbz w12,#0x0,0x0085c66c
0085c4a4	ldur x20,[x9, #0x14]
0085c4a8	mov w23,w11
0085c4ac	mov w8,w10
0085c4b0	b 0x0085c780
0085c4b4	ldr x9,[sp, #0x20]
0085c4b8	cbz x1,0x0085c5bc
0085c4bc	ldr x8,[x0]
0085c4c0	cbz x9,0x0085c658
0085c4c4	ldp x9,x10,[sp, #0x10]
0085c4c8	ldr x9,[x9]
0085c4cc	ldr x9,[x9, x10, LSL #0x3]
0085c4d0	ldp w8,w10,[x8, #0xc]
0085c4d4	ldp w9,w11,[x9]
0085c4d8	cmp w10,w11
0085c4dc	cset w12,cc
0085c4e0	cmp w8,w9
0085c4e4	cset w13,cc
0085c4e8	csel w12,w12,w13,eq
0085c4ec	cmp w12,#0x0
0085c4f0	csel w20,w8,w9,ne
0085c4f4	csel w23,w10,w11,ne
0085c4f8	b 0x0085c6dc
0085c4fc	adrp x8,0xd1e000
0085c500	ldr x22,[x19, #0xa8]
0085c504	ldrb w8,[x8, #0xc40]
0085c508	cmp w8,#0x1
0085c50c	b.ne 0x0085c524
0085c510	adrp x1,0x2c4000
0085c514	add x1,x1,#0xb25
0085c518	mov x0,x22
0085c51c	bl 0x00c301f0
0085c520	cbz w0,0x0085c674
0085c524	adrp x0,0x2d2000
0085c528	add x0,x0,#0xbdf
0085c52c	mov x1,x22
0085c530	bl 0x00c301f0
0085c534	cbz w0,0x0085c5f4
0085c538	ldrb w8,[x19]
0085c53c	cmp w8,#0x1
0085c540	b.ne 0x0085c558
0085c544	adrp x0,0x2ab000
0085c548	add x0,x0,#0x335
0085c54c	mov x1,x22
0085c550	bl 0x00c301f0
0085c554	cbz w0,0x0085c928
0085c558	stp xzr,xzr,[sp, #0x38]
0085c55c	stp xzr,xzr,[sp]
0085c560	sub x8,x29,#0x30
0085c564	add x0,x19,#0x90
0085c568	sub x20,x29,#0x30
0085c56c	bl 0x008521fc
0085c570	ldurb w8,[x29, #-0x30]
0085c574	ldur x9,[x29, #-0x20]
0085c578	tst w8,#0x1
0085c57c	csinc x5,x9,x20,ne
0085c580	adrp x4,0x2ba000
0085c584	add x4,x4,#0xd80
0085c588	add x2,sp,#0x38
0085c58c	mov x3,sp
0085c590	mov x0,x19
0085c594	mov x1,x21
0085c598	bl 0x0085e984
0085c59c	ldurb w8,[x29, #-0x30]
0085c5a0	mov x20,x0
0085c5a4	tbz w8,#0x0,0x0085ca1c
0085c5a8	ldur x8,[x29, #-0x30]
0085c5ac	ldur x0,[x29, #-0x20]
0085c5b0	and x1,x8,#-0x2
0085c5b4	bl 0x00c2fe80
0085c5b8	b 0x0085ca1c
0085c5bc	cbz x9,0x0085c6d8
0085c5c0	ldp x8,x9,[sp, #0x10]
0085c5c4	ldr x8,[x8]
0085c5c8	ldr x8,[x8, x9, LSL #0x3]
0085c5cc	ldp w20,w23,[x8]
0085c5d0	b 0x0085c6dc
0085c5d4	cbz x8,0x0085c77c
0085c5d8	ldp x8,x9,[sp, #0x10]
0085c5dc	ldr x8,[x8]
0085c5e0	ldr x8,[x8, x9, LSL #0x3]
0085c5e4	ldr x20,[x8]
0085c5e8	lsr x8,x20,#0x20
0085c5ec	mov w23,w20
0085c5f0	b 0x0085c780
0085c5f4	ldur x21,[x19, #0x94]
0085c5f8	mov x0,x19
0085c5fc	bl 0x00858f2c
0085c600	ldr x9,[sp, #0x30]
0085c604	ldr x8,[sp, #0x20]
0085c608	cbz x9,0x0085c908
0085c60c	ldr x9,[sp, #0x28]
0085c610	ldr x9,[x9]
0085c614	cbz x8,0x0085c97c
0085c618	ldp x8,x10,[sp, #0x10]
0085c61c	ldr x8,[x8]
0085c620	ldr x8,[x8, x10, LSL #0x3]
0085c624	ldp w11,w10,[x9, #0xc]
0085c628	ldr x23,[x8]
0085c62c	lsr x8,x23,#0x20
0085c630	cmp w10,w8
0085c634	cset w12,cc
0085c638	cmp w11,w23
0085c63c	cset w13,cc
0085c640	csel w12,w12,w13,eq
0085c644	tbz w12,#0x0,0x0085c9a8
0085c648	ldur x20,[x9, #0x14]
0085c64c	mov w23,w11
0085c650	mov w8,w10
0085c654	b 0x0085c9c0
0085c658	ldp w20,w23,[x8, #0xc]
0085c65c	b 0x0085c6dc
0085c660	ldp w23,w8,[x9, #0xc]
0085c664	ldur x20,[x9, #0x14]
0085c668	b 0x0085c780
0085c66c	mov x20,x23
0085c670	b 0x0085c780
0085c674	ldur x21,[x19, #0x94]
0085c678	mov x0,x19
0085c67c	bl 0x00858f2c
0085c680	ldr x9,[sp, #0x30]
0085c684	ldr x8,[sp, #0x20]
0085c688	cbz x9,0x0085c988
0085c68c	ldr x9,[sp, #0x28]
0085c690	ldr x9,[x9]
0085c694	cbz x8,0x0085c9b0
0085c698	ldp x8,x10,[sp, #0x10]
0085c69c	ldr x8,[x8]
0085c6a0	ldr x8,[x8, x10, LSL #0x3]
0085c6a4	ldp w11,w10,[x9, #0xc]
0085c6a8	ldr x23,[x8]
0085c6ac	lsr x8,x23,#0x20
0085c6b0	cmp w10,w8
0085c6b4	cset w12,cc
0085c6b8	cmp w11,w23
0085c6bc	cset w13,cc
0085c6c0	csel w12,w12,w13,eq
0085c6c4	tbz w12,#0x0,0x0085c9e8
0085c6c8	ldur x20,[x9, #0x14]
0085c6cc	mov w23,w11
0085c6d0	mov w8,w10
0085c6d4	b 0x0085c9f4
0085c6d8	ldp w20,w23,[x21]
0085c6dc	ldp q0,q1,[x19, #0x90]
0085c6e0	stp q0,q1,[x29, #-0x30]
0085c6e4	mov x0,x19
0085c6e8	bl 0x00858f2c
0085c6ec	sturb wzr,[x29, #-0x34]
0085c6f0	str xzr,[sp]
0085c6f4	sub x1,x29,#0x34
0085c6f8	mov x2,sp
0085c6fc	mov x0,x19
0085c700	bl 0x00861b90
0085c704	adrp x9,0xd1b000
0085c708	ldr w8,[x0, #0x8]
0085c70c	mov x21,x0
0085c710	ldr w9,[x9, #0x10]
0085c714	cmp w8,w9
0085c718	b.ne 0x0085c72c
0085c71c	ldr x9,[x21, #0x20]
0085c720	ldrb w9,[x9, #0x30]
0085c724	cmp w9,#0x1
0085c728	b.ne 0x0085c7dc
0085c72c	adrp x9,0xd1b000
0085c730	ldr w9,[x9, #0x20]
0085c734	cmp w8,w9
0085c738	b.eq 0x0085c7dc
0085c73c	adrp x9,0xd1b000
0085c740	ldr w9,[x9, #0x60]
0085c744	cmp w8,w9
0085c748	b.eq 0x0085c7dc
0085c74c	adrp x9,0xd1b000
0085c750	ldr w9,[x9, #0x50]
0085c754	cmp w8,w9
0085c758	b.eq 0x0085c7dc
0085c75c	adrp x8,0xd1e000
0085c760	ldrb w8,[x8, #0xc40]
0085c764	cmp w8,#0x1
0085c768	b.ne 0x0085c7a8
0085c76c	mov x0,x19
0085c770	mov x1,x21
0085c774	bl 0x00864840
0085c778	b 0x0085c7d8
0085c77c	lsr x8,x23,#0x20
0085c780	mov w9,w23
0085c784	ldur x3,[x19, #0x94]
0085c788	orr x1,x9,x8, LSL #0x20
0085c78c	add x4,sp,#0x28
0085c790	add x6,sp,#0x10
0085c794	mov x0,x19
0085c798	mov x2,x20
0085c79c	mov w5,wzr
0085c7a0	bl 0x0085b410
0085c7a4	b 0x0085ca18
0085c7a8	ldr x0,[x19, #0xe8]
0085c7ac	mov w1,#0x8
0085c7b0	bl 0x0084e938
0085c7b4	mov w8,#0x1
0085c7b8	str x21,[x0]
0085c7bc	stp x0,x8,[sp, #0x38]
0085c7c0	adrp x3,0x2a9000
0085c7c4	add x3,x3,#0x221
0085c7c8	add x1,x21,#0xc
0085c7cc	add x2,sp,#0x38
0085c7d0	mov x0,x19
0085c7d4	bl 0x008659e8
0085c7d8	mov x21,x0
0085c7dc	ldr x8,[x19, #0x1e8]
0085c7e0	ldurb w1,[x29, #-0x34]
0085c7e4	ldr w9,[x8, #0x4a0]
0085c7e8	add w9,w9,#0x1
0085c7ec	str w9,[x8, #0x4a0]
0085c7f0	sub x2,x29,#0x30
0085c7f4	mov x3,sp
0085c7f8	add x5,sp,#0x28
0085c7fc	mov x0,x19
0085c800	mov x4,xzr
0085c804	mov w6,wzr
0085c808	mov x7,xzr
0085c80c	bl 0x00863248
0085c810	ldr x8,[x19, #0x1e8]
0085c814	mov w10,w20
0085c818	mov x22,x0
0085c81c	orr x10,x10,x23, LSL #0x20
0085c820	ldr w9,[x8, #0x4a0]
0085c824	sub w9,w9,#0x1
0085c828	str w9,[x8, #0x4a0]
0085c82c	ldur x8,[x0, #0x14]
0085c830	ldr x0,[x19, #0xe8]
0085c834	stp x10,x8,[sp, #0x38]
0085c838	mov w1,#0x30
0085c83c	bl 0x0084e938
0085c840	add x1,sp,#0x38
0085c844	mov x2,x21
0085c848	mov x3,x22
0085c84c	mov x20,x0
0085c850	bl 0x00850304
0085c854	ldrb w8,[x19, #0x68]
0085c858	cmp w8,#0x1
0085c85c	b.ne 0x0085ca1c
0085c860	ldr x21,[sp, #0x20]
0085c864	ldr x22,[x19, #0xe8]
0085c868	cbz x21,0x0085c8cc
0085c86c	ldp x8,x26,[sp, #0x10]
0085c870	lsl x1,x21,#0x3
0085c874	ldr x25,[x8]
0085c878	mov x0,x22
0085c87c	bl 0x0084e938
0085c880	mov x23,x0
0085c884	cmp x21,#0x8
0085c888	b.cc 0x0085c8a0
0085c88c	lsl x8,x26,#0x3
0085c890	add x10,x8,x25
0085c894	sub x8,x23,x10
0085c898	cmp x8,#0x20
0085c89c	b.cs 0x0085c948
0085c8a0	mov x8,xzr
0085c8a4	lsl x10,x8,#0x3
0085c8a8	sub x8,x21,x8
0085c8ac	add x9,x10,x26, LSL #0x3
0085c8b0	add x10,x23,x10
0085c8b4	add x9,x25,x9
0085c8b8	ldr x11,[x9], #0x8
0085c8bc	subs x8,x8,#0x1
0085c8c0	str x11,[x10], #0x8
0085c8c4	b.ne 0x0085c8b8
0085c8c8	b 0x0085c8d0
0085c8cc	mov x23,xzr
0085c8d0	mov x0,x22
0085c8d4	mov w1,#0x20
0085c8d8	bl 0x0084e938
0085c8dc	mov x22,x0
0085c8e0	ldur x3,[x29, #-0x2c]
0085c8e4	mov x1,x23
0085c8e8	mov x2,x21
0085c8ec	bl 0x00851ffc
0085c8f0	str x20,[sp, #0x38]
0085c8f4	add x0,x19,#0x4b0
0085c8f8	add x1,sp,#0x38
0085c8fc	bl 0x00860fa0
0085c900	str x22,[x0]
0085c904	b 0x0085ca1c
0085c908	cbz x8,0x0085c9bc
0085c90c	ldp x8,x9,[sp, #0x10]
0085c910	ldr x8,[x8]
0085c914	ldr x8,[x8, x9, LSL #0x3]
0085c918	ldr x20,[x8]
0085c91c	lsr x8,x20,#0x20
0085c920	mov w23,w20
0085c924	b 0x0085c9c0
0085c928	mov x0,x19
0085c92c	mov w1,#0x1
0085c930	bl 0x0085cb14
0085c934	add x1,x0,#0xc
0085c938	add x2,sp,#0x28
0085c93c	mov x0,x19
0085c940	bl 0x0085f204
0085c944	b 0x0085ca18
0085c948	and x8,x21,#-0x4
0085c94c	add x9,x23,#0x10
0085c950	add x10,x10,#0x10
0085c954	mov x11,x8
0085c958	ldp q0,q1,[x10, #-0x10]
0085c95c	subs x11,x11,#0x4
0085c960	add x10,x10,#0x20
0085c964	stp q0,q1,[x9, #-0x10]
0085c968	add x9,x9,#0x20
0085c96c	b.ne 0x0085c958
0085c970	cmp x21,x8
0085c974	b.eq 0x0085c8d0
0085c978	b 0x0085c8a4
0085c97c	ldp w23,w8,[x9, #0xc]
0085c980	ldur x20,[x9, #0x14]
0085c984	b 0x0085c9c0
0085c988	cbz x8,0x0085c9f0
0085c98c	ldp x8,x9,[sp, #0x10]
0085c990	ldr x8,[x8]
0085c994	ldr x8,[x8, x9, LSL #0x3]
0085c998	ldr x20,[x8]
0085c99c	lsr x8,x20,#0x20
0085c9a0	mov w23,w20
0085c9a4	b 0x0085c9f4
0085c9a8	mov x20,x23
0085c9ac	b 0x0085c9c0
0085c9b0	ldp w23,w8,[x9, #0xc]
0085c9b4	ldur x20,[x9, #0x14]
0085c9b8	b 0x0085c9f4
0085c9bc	lsr x8,x23,#0x20
0085c9c0	mov w9,w23
0085c9c4	orr x1,x9,x8, LSL #0x20
0085c9c8	add x4,sp,#0x28
0085c9cc	add x6,sp,#0x10
0085c9d0	mov x0,x19
0085c9d4	mov x2,x20
0085c9d8	mov x3,x21
0085c9dc	mov w5,#0x1
0085c9e0	bl 0x0085b410
0085c9e4	b 0x0085ca18
0085c9e8	mov x20,x23
0085c9ec	b 0x0085c9f4
0085c9f0	lsr x8,x23,#0x20
0085c9f4	mov w9,w23
0085c9f8	orr x8,x9,x8, LSL #0x20
0085c9fc	stp x8,x20,[x29, #-0x30]
0085ca00	sub x1,x29,#0x30
0085ca04	add x3,sp,#0x28
0085ca08	add x4,sp,#0x10
0085ca0c	mov x0,x19
0085ca10	mov x2,x21
0085ca14	bl 0x0085eb28
0085ca18	mov x20,x0
0085ca1c	ldp x22,x9,[sp, #0x10]
0085ca20	ldp x10,x8,[x22]
0085ca24	add x19,x10,x9, LSL #0x3
0085ca28	cmp x19,x8
0085ca2c	b.eq 0x0085ca54
0085ca30	sub x9,x8,x19
0085ca34	add x1,x19,x9
0085ca38	subs x21,x8,x1
0085ca3c	b.eq 0x0085ca4c
0085ca40	mov x0,x19
0085ca44	mov x2,x21
0085ca48	bl 0x00c2ff60
0085ca4c	add x8,x19,x21
0085ca50	str x8,[x22, #0x8]
0085ca54	ldr x8,[x24, #0x28]
0085ca58	ldur x9,[x29, #-0x8]
0085ca5c	cmp x8,x9
0085ca60	b.ne 0x0085cb10
0085ca64	mov x0,x20
0085ca68	ldp x20,x19,[sp, #0xc0]
0085ca6c	ldp x22,x21,[sp, #0xb0]
0085ca70	ldp x24,x23,[sp, #0xa0]
0085ca74	ldp x26,x25,[sp, #0x90]
0085ca78	ldp x29,x30,[sp, #0x80]
0085ca7c	add sp,sp,#0xd0
0085ca80	ret
0085cb10	bl 0x00c2fec0
