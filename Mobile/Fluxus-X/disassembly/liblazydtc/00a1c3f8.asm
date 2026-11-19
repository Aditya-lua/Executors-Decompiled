; BN_mod_exp_mont_consttime @ 00a1c3f8
00a1c3f8	stp x28,x27,[sp, #-0x60]!
00a1c3fc	stp x26,x25,[sp, #0x10]
00a1c400	stp x24,x23,[sp, #0x20]
00a1c404	stp x22,x21,[sp, #0x30]
00a1c408	stp x20,x19,[sp, #0x40]
00a1c40c	stp x29,x30,[sp, #0x50]
00a1c410	add x29,sp,#0x50
00a1c414	sub sp,sp,#0x80
00a1c418	mov x22,x0
00a1c41c	mov x0,x3
00a1c420	mov x20,x5
00a1c424	mov x19,x4
00a1c428	mov x25,x3
00a1c42c	mov x23,x2
00a1c430	mov x28,x1
00a1c434	bl 0x00c38d10
00a1c438	cbz w0,0x00a1c46c
00a1c43c	ldr w24,[x25, #0x8]
00a1c440	cmp w24,#0x100, LSL #12
00a1c444	b.lt 0x00a1c4a0
00a1c448	mov x0,x22
00a1c44c	mov x1,x28
00a1c450	mov x2,x23
00a1c454	mov x3,x25
00a1c458	mov x4,x19
00a1c45c	mov x5,x20
00a1c460	bl 0x00a1baec
00a1c464	mov w22,w0
00a1c468	b 0x00a1cb6c
00a1c46c	bl 0x00c342a0
00a1c470	adrp x0,0x2c9000
00a1c474	adrp x2,0x2b7000
00a1c478	add x0,x0,#0x65b
00a1c47c	add x2,x2,#0x97e
00a1c480	mov w1,#0x277
00a1c484	bl 0x00c342b0
00a1c488	orr w0,wzr,#0x3
00a1c48c	mov w1,#0x66
00a1c490	mov x2,xzr
00a1c494	bl 0x00c342c0
00a1c498	mov w22,wzr
00a1c49c	b 0x00a1cb6c
00a1c4a0	ldr w27,[x23, #0x8]
00a1c4a4	cbz w27,0x00a1c50c
00a1c4a8	mov x0,x19
00a1c4ac	bl 0x00c38a90
00a1c4b0	mov x21,x20
00a1c4b4	cbz x20,0x00a1c52c
00a1c4b8	ldr w8,[x28, #0x10]
00a1c4bc	cbnz w8,0x00a1c4d0
00a1c4c0	mov x0,x28
00a1c4c4	mov x1,x25
00a1c4c8	bl 0x00c369c0
00a1c4cc	tbnz w0,#0x1f,0x00a1c4fc
00a1c4d0	mov x0,x19
00a1c4d4	bl 0x00c38a40
00a1c4d8	mov x26,x0
00a1c4dc	cbz x0,0x00a1c560
00a1c4e0	mov x0,x26
00a1c4e4	mov x1,x28
00a1c4e8	mov x2,x25
00a1c4ec	mov x3,x19
00a1c4f0	bl 0x00c38f30
00a1c4f4	mov x28,x26
00a1c4f8	cbz w0,0x00a1c598
00a1c4fc	cmp w27,#0xe
00a1c500	b.le 0x00a1c588
00a1c504	orr w12,wzr,#0x6
00a1c508	b 0x00a1c5c8
00a1c50c	mov w1,#0x1
00a1c510	mov x0,x25
00a1c514	bl 0x00c38c60
00a1c518	cbz w0,0x00a1c574
00a1c51c	mov x0,x22
00a1c520	bl 0x00c38e00
00a1c524	mov w22,#0x1
00a1c528	b 0x00a1cb6c
00a1c52c	bl 0x00c38f80
00a1c530	mov x21,x0
00a1c534	cbz x0,0x00a1c54c
00a1c538	mov x0,x21
00a1c53c	mov x1,x25
00a1c540	mov x2,x19
00a1c544	bl 0x00c38f90
00a1c548	cbnz w0,0x00a1c4b8
00a1c54c	mov x26,xzr
00a1c550	mov x25,xzr
00a1c554	mov x23,xzr
00a1c558	mov w22,wzr
00a1c55c	b 0x00a1cb38
00a1c560	mov w22,wzr
00a1c564	mov x23,xzr
00a1c568	mov x25,xzr
00a1c56c	cbnz x20,0x00a1cb40
00a1c570	b 0x00a1cb38
00a1c574	mov w1,#0x1
00a1c578	mov x0,x22
00a1c57c	bl 0x00c37720
00a1c580	mov w22,w0
00a1c584	b 0x00a1cb6c
00a1c588	cmp w27,#0x4
00a1c58c	b.le 0x00a1c5b0
00a1c590	mov w12,#0x5
00a1c594	b 0x00a1c5c8
00a1c598	mov w22,wzr
00a1c59c	mov x23,xzr
00a1c5a0	mov x25,xzr
00a1c5a4	mov x26,xzr
00a1c5a8	cbnz x20,0x00a1cb40
00a1c5ac	b 0x00a1cb38
00a1c5b0	cmp w27,#0x1
00a1c5b4	b.le 0x00a1c5c0
00a1c5b8	mov w12,#0x4
00a1c5bc	b 0x00a1c5c8
00a1c5c0	orr w8,wzr,#0x3
00a1c5c4	csinc w12,w8,wzr,eq
00a1c5c8	mov w8,#0x1
00a1c5cc	lsl w10,w24,#0x1
00a1c5d0	lsl w8,w8,w12
00a1c5d4	cmp w10,w8
00a1c5d8	lsl w9,w24,w12
00a1c5dc	stur w8,[x29, #-0x9c]
00a1c5e0	csel w8,w10,w8,gt
00a1c5e4	add w8,w8,w9
00a1c5e8	orr x11,xzr,#0x4000000000
00a1c5ec	sbfiz x26,x8,#0x23,#0x1d
00a1c5f0	sbfiz x9,x8,#0x3,#0x20
00a1c5f4	add x8,x26,x11
00a1c5f8	cmp w9,#0xbff
00a1c5fc	asr x0,x8,#0x20
00a1c600	stur w12,[x29, #-0x84]
00a1c604	stur x9,[x29, #-0x98]
00a1c608	b.gt 0x00a1c624
00a1c60c	add x9,x0,#0xf
00a1c610	mov x8,sp
00a1c614	and x9,x9,#-0x10
00a1c618	sub x0,x8,x9
00a1c61c	mov sp,x0
00a1c620	b 0x00a1c638
00a1c624	adrp x1,0x2c9000
00a1c628	add x1,x1,#0x65b
00a1c62c	mov w2,#0x2e9
00a1c630	bl 0x00c32320
00a1c634	cbz x0,0x00a1cb90
00a1c638	and x9,x0,#0x3f
00a1c63c	mov w8,#0x40
00a1c640	sub x8,x8,x9
00a1c644	add x8,x0,x8
00a1c648	stur x21,[x29, #-0xa8]
00a1c64c	mov x21,x0
00a1c650	asr x2,x26,#0x20
00a1c654	mov x0,x8
00a1c658	mov w1,wzr
00a1c65c	stur w27,[x29, #-0xac]
00a1c660	sxtw x27,w24
00a1c664	stur x9,[x29, #-0xc0]
00a1c668	mov x26,x8
00a1c66c	bl 0x00c301c0
00a1c670	ldur w9,[x29, #-0x9c]
00a1c674	lsl x8,x27,#0x3
00a1c678	stp wzr,w24,[x29, #-0x60]
00a1c67c	stp wzr,w24,[x29, #-0x78]
00a1c680	mov w10,w9
00a1c684	adrp x9,0x29b000
00a1c688	ldr d0,[x9, #0x350]
00a1c68c	stur x10,[x29, #-0x90]
00a1c690	nop
00a1c694	madd x10,x8,x10,x26
00a1c698	add x8,x10,x8
00a1c69c	stur x10,[x29, #-0x68]
00a1c6a0	stur x8,[x29, #-0x80]
00a1c6a4	stur d0,[x29, #-0x70]
00a1c6a8	stur d0,[x29, #-0x58]
00a1c6ac	ldr x8,[x25]
00a1c6b0	ldur x25,[x29, #-0x98]
00a1c6b4	sub w9,w24,#0x1
00a1c6b8	stur x21,[x29, #-0xc8]
00a1c6bc	ldr x11,[x8, w9, SXTW #0x3]
00a1c6c0	cmp w25,#0xc00
00a1c6c4	csel x12,xzr,x21,lt
00a1c6c8	stur x12,[x29, #-0xb8]
00a1c6cc	tbnz x11,#0x3f,0x00a1c6f8
00a1c6d0	bl 0x00c38de0
00a1c6d4	ldur x21,[x29, #-0xa8]
00a1c6d8	mov x1,x0
00a1c6dc	sub x0,x29,#0x68
00a1c6e0	mov x3,x19
00a1c6e4	mov x2,x21
00a1c6e8	bl 0x00c39020
00a1c6ec	ldur w27,[x29, #-0xac]
00a1c6f0	cbnz w0,0x00a1c7b4
00a1c6f4	b 0x00a1cb2c
00a1c6f8	ldr x11,[x8]
00a1c6fc	mov x17,x27
00a1c700	ldur x21,[x29, #-0xa8]
00a1c704	ldur w27,[x29, #-0xac]
00a1c708	neg x11,x11
00a1c70c	cmp w24,#0x2
00a1c710	str x11,[x10]
00a1c714	b.lt 0x00a1c7b0
00a1c718	sub x11,x24,#0x1
00a1c71c	cmp x11,#0x4
00a1c720	b.cc 0x00a1c76c
00a1c724	ldur x10,[x29, #-0x90]
00a1c728	ldp x15,x16,[x29, #-0xc8]
00a1c72c	mul x12,x17,x10
00a1c730	lsl x13,x12,#0x3
00a1c734	add x12,x13,#0x48
00a1c738	lsl x10,x24,#0x3
00a1c73c	sub x12,x12,x16
00a1c740	add x12,x15,x12
00a1c744	add x14,x8,x10
00a1c748	cmp x12,x14
00a1c74c	b.cs 0x00a1cba8
00a1c750	add x10,x13,x10
00a1c754	add x10,x10,#0x40
00a1c758	sub x10,x10,x16
00a1c75c	add x10,x15,x10
00a1c760	add x12,x8,#0x8
00a1c764	cmp x10,x12
00a1c768	b.ls 0x00a1cba8
00a1c76c	mov w9,#0x1
00a1c770	ldur x10,[x29, #-0x90]
00a1c774	lsl x11,x9,#0x3
00a1c778	add x8,x8,x11
00a1c77c	sub x9,x24,x9
00a1c780	mul x10,x17,x10
00a1c784	add x10,x11,x10, LSL #0x3
00a1c788	ldur x11,[x29, #-0xc0]
00a1c78c	add x10,x10,#0x40
00a1c790	sub x10,x10,x11
00a1c794	ldur x11,[x29, #-0xc8]
00a1c798	add x10,x11,x10
00a1c79c	ldr x11,[x8], #0x8
00a1c7a0	subs x9,x9,#0x1
00a1c7a4	mvn x11,x11
00a1c7a8	str x11,[x10], #0x8
00a1c7ac	b.ne 0x00a1c79c
00a1c7b0	stur w24,[x29, #-0x60]
00a1c7b4	sub x0,x29,#0x80
00a1c7b8	mov x1,x28
00a1c7bc	mov x2,x21
00a1c7c0	mov x3,x19
00a1c7c4	bl 0x00c39020
00a1c7c8	cbz w0,0x00a1cb2c
00a1c7cc	ldur w8,[x29, #-0x60]
00a1c7d0	cmp w8,w24
00a1c7d4	csel w10,w8,w24,lt
00a1c7d8	cmp w10,#0x1
00a1c7dc	b.lt 0x00a1c810
00a1c7e0	ldur x11,[x29, #-0x90]
00a1c7e4	ldur x9,[x29, #-0x68]
00a1c7e8	mov x8,xzr
00a1c7ec	sxtw x10,w10
00a1c7f0	lsl x11,x11,#0x3
00a1c7f4	mov x12,x26
00a1c7f8	ldr x13,[x9, x8, LSL #0x3]
00a1c7fc	add x8,x8,#0x1
00a1c800	cmp x8,x10
00a1c804	str x13,[x12]
00a1c808	add x12,x12,x11
00a1c80c	b.lt 0x00a1c7f8
00a1c810	ldur w8,[x29, #-0x78]
00a1c814	stur x26,[x29, #-0xa8]
00a1c818	ldur w14,[x29, #-0x84]
00a1c81c	ldur x26,[x29, #-0xc0]
00a1c820	cmp w8,w24
00a1c824	csel w10,w8,w24,lt
00a1c828	cmp w10,#0x1
00a1c82c	b.lt 0x00a1c86c
00a1c830	ldur x12,[x29, #-0xc8]
00a1c834	mov w11,#0x48
00a1c838	sub x11,x11,x26
00a1c83c	ldur x9,[x29, #-0x80]
00a1c840	add x11,x12,x11
00a1c844	ldur x12,[x29, #-0x90]
00a1c848	mov x8,xzr
00a1c84c	sxtw x10,w10
00a1c850	lsl x12,x12,#0x3
00a1c854	ldr x13,[x9, x8, LSL #0x3]
00a1c858	add x8,x8,#0x1
00a1c85c	cmp x8,x10
00a1c860	str x13,[x11]
00a1c864	add x11,x11,x12
00a1c868	b.lt 0x00a1c854
00a1c86c	cmp w14,#0x2
00a1c870	b.cc 0x00a1c974
00a1c874	sub x0,x29,#0x68
00a1c878	sub x1,x29,#0x80
00a1c87c	sub x2,x29,#0x80
00a1c880	mov x3,x21
00a1c884	mov x4,x19
00a1c888	bl 0x00c39000
00a1c88c	cbz w0,0x00a1cb24
00a1c890	ldur w8,[x29, #-0x60]
00a1c894	cmp w8,w24
00a1c898	csel w10,w8,w24,lt
00a1c89c	cmp w10,#0x1
00a1c8a0	b.lt 0x00a1c8e0
00a1c8a4	ldur x12,[x29, #-0xc8]
00a1c8a8	mov w11,#0x50
00a1c8ac	sub x11,x11,x26
00a1c8b0	ldur x9,[x29, #-0x68]
00a1c8b4	add x11,x12,x11
00a1c8b8	ldur x12,[x29, #-0x90]
00a1c8bc	mov x8,xzr
00a1c8c0	sxtw x10,w10
00a1c8c4	lsl x12,x12,#0x3
00a1c8c8	ldr x13,[x9, x8, LSL #0x3]
00a1c8cc	add x8,x8,#0x1
00a1c8d0	cmp x8,x10
00a1c8d4	str x13,[x11]
00a1c8d8	add x11,x11,x12
00a1c8dc	b.lt 0x00a1c8c8
00a1c8e0	ldur w8,[x29, #-0x9c]
00a1c8e4	cmp w8,#0x4
00a1c8e8	b.lt 0x00a1c974
00a1c8ec	ldur x9,[x29, #-0x90]
00a1c8f0	mov w8,#0x58
00a1c8f4	sub x8,x8,x26
00a1c8f8	orr w26,wzr,#0x3
00a1c8fc	lsl x25,x9,#0x3
00a1c900	ldur x9,[x29, #-0xc8]
00a1c904	add x28,x9,x8
00a1c908	sub x0,x29,#0x68
00a1c90c	sub x1,x29,#0x80
00a1c910	sub x2,x29,#0x68
00a1c914	mov x3,x21
00a1c918	mov x4,x19
00a1c91c	bl 0x00c39000
00a1c920	cbz w0,0x00a1cb24
00a1c924	ldur w8,[x29, #-0x60]
00a1c928	cmp w8,w24
00a1c92c	csel w10,w8,w24,lt
00a1c930	cmp w10,#0x1
00a1c934	b.lt 0x00a1c960
00a1c938	ldur x9,[x29, #-0x68]
00a1c93c	mov x8,xzr
00a1c940	sxtw x10,w10
00a1c944	mov x11,x28
00a1c948	ldr x12,[x9, x8, LSL #0x3]
00a1c94c	add x8,x8,#0x1
00a1c950	cmp x8,x10
00a1c954	str x12,[x11]
00a1c958	add x11,x11,x25
00a1c95c	b.lt 0x00a1c948
00a1c960	ldur x8,[x29, #-0x90]
00a1c964	add x26,x26,#0x1
00a1c968	add x28,x28,#0x8
00a1c96c	cmp x26,x8
00a1c970	b.cc 0x00a1c908
00a1c974	ldur w4,[x29, #-0x84]
00a1c978	lsl w9,w27,#0x6
00a1c97c	sub w11,w9,#0x1
00a1c980	ldur x26,[x29, #-0xa8]
00a1c984	sdiv w12,w11,w4
00a1c988	msub w11,w12,w4,w11
00a1c98c	add w11,w11,#0x1
00a1c990	mov w10,#0x1
00a1c994	sub w25,w9,w11
00a1c998	lsl w10,w10,w11
00a1c99c	add w9,w25,#0x3f
00a1c9a0	cmp w25,#0x0
00a1c9a4	mov x8,xzr
00a1c9a8	csel w11,w9,w25,lt
00a1c9ac	cmn w25,#0x3f
00a1c9b0	sub w9,w10,#0x1
00a1c9b4	b.lt 0x00a1ca0c
00a1c9b8	ldr w10,[x23, #0x8]
00a1c9bc	asr w13,w11,#0x6
00a1c9c0	mov x8,xzr
00a1c9c4	cmp w13,w10
00a1c9c8	b.ge 0x00a1ca0c
00a1c9cc	ldr x12,[x23]
00a1c9d0	and w11,w11,#0xffffffc0
00a1c9d4	sub w11,w25,w11
00a1c9d8	ldr x8,[x12, w13, SXTW #0x3]
00a1c9dc	cbz w11,0x00a1ca0c
00a1c9e0	sxtw x13,w13
00a1c9e4	mov w14,w11
00a1c9e8	add x13,x13,#0x1
00a1c9ec	cmp w13,w10
00a1c9f0	lsr x8,x8,x14
00a1c9f4	b.ge 0x00a1ca0c
00a1c9f8	ldr x10,[x12, x13, LSL #0x3]
00a1c9fc	mov w12,#0x40
00a1ca00	sub w11,w12,w11
00a1ca04	lsl x10,x10,x11
00a1ca08	orr x8,x10,x8
00a1ca0c	and w3,w9,w8
00a1ca10	sub x0,x29,#0x68
00a1ca14	mov w1,w24
00a1ca18	mov x2,x26
00a1ca1c	bl 0x00a1cc0c
00a1ca20	cbz w0,0x00a1cb10
00a1ca24	ldur w8,[x29, #-0x9c]
00a1ca28	mov w28,#0x40
00a1ca2c	sub w27,w8,#0x1
00a1ca30	cmp w25,#0x1
00a1ca34	b.lt 0x00a1cbec
00a1ca38	mov w26,wzr
00a1ca3c	sub x0,x29,#0x68
00a1ca40	sub x1,x29,#0x68
00a1ca44	sub x2,x29,#0x68
00a1ca48	mov x3,x21
00a1ca4c	mov x4,x19
00a1ca50	bl 0x00c39000
00a1ca54	cbz w0,0x00a1cb24
00a1ca58	ldur w8,[x29, #-0x84]
00a1ca5c	add w26,w26,#0x1
00a1ca60	cmp w26,w8
00a1ca64	b.cc 0x00a1ca3c
00a1ca68	ldur w4,[x29, #-0x84]
00a1ca6c	ldur x26,[x29, #-0xa8]
00a1ca70	sub w25,w25,w4
00a1ca74	add w8,w25,#0x3f
00a1ca78	cmp w25,#0x0
00a1ca7c	csel w10,w8,w25,lt
00a1ca80	cmn w25,#0x3f
00a1ca84	mov x8,xzr
00a1ca88	b.lt 0x00a1cadc
00a1ca8c	ldr w9,[x23, #0x8]
00a1ca90	asr w12,w10,#0x6
00a1ca94	mov x8,xzr
00a1ca98	cmp w12,w9
00a1ca9c	b.ge 0x00a1cadc
00a1caa0	ldr x11,[x23]
00a1caa4	and w10,w10,#0xffffffc0
00a1caa8	sub w10,w25,w10
00a1caac	ldr x8,[x11, w12, SXTW #0x3]
00a1cab0	cbz w10,0x00a1cadc
00a1cab4	sxtw x12,w12
00a1cab8	mov w13,w10
00a1cabc	add x12,x12,#0x1
00a1cac0	cmp w12,w9
00a1cac4	lsr x8,x8,x13
00a1cac8	b.ge 0x00a1cadc
00a1cacc	ldr x9,[x11, x12, LSL #0x3]
00a1cad0	sub w10,w28,w10
00a1cad4	lsl x9,x9,x10
00a1cad8	orr x8,x9,x8
00a1cadc	and w3,w27,w8
00a1cae0	sub x0,x29,#0x80
00a1cae4	mov w1,w24
00a1cae8	mov x2,x26
00a1caec	bl 0x00a1cc0c
00a1caf0	cbz w0,0x00a1cb10
00a1caf4	sub x0,x29,#0x68
00a1caf8	sub x1,x29,#0x68
00a1cafc	sub x2,x29,#0x80
00a1cb00	mov x3,x21
00a1cb04	mov x4,x19
00a1cb08	bl 0x00c39000
00a1cb0c	cbnz w0,0x00a1ca30
00a1cb10	mov w22,wzr
00a1cb14	ldur x25,[x29, #-0x98]
00a1cb18	ldur x23,[x29, #-0xb8]
00a1cb1c	cbnz x20,0x00a1cb40
00a1cb20	b 0x00a1cb38
00a1cb24	ldur x25,[x29, #-0x98]
00a1cb28	ldur x26,[x29, #-0xa8]
00a1cb2c	mov w22,wzr
00a1cb30	ldur x23,[x29, #-0xb8]
00a1cb34	cbnz x20,0x00a1cb40
00a1cb38	mov x0,x21
00a1cb3c	bl 0x00c38f70
00a1cb40	cbz x26,0x00a1cb64
00a1cb44	sxtw x1,w25
00a1cb48	mov x0,x26
00a1cb4c	bl 0x00c34750
00a1cb50	adrp x1,0x2c9000
00a1cb54	add x1,x1,#0x65b
00a1cb58	mov w2,#0x485
00a1cb5c	mov x0,x23
00a1cb60	bl 0x00c32310
00a1cb64	mov x0,x19
00a1cb68	bl 0x00c38a20
00a1cb6c	mov w0,w22
00a1cb70	sub sp,x29,#0x50
00a1cb74	ldp x29,x30,[sp, #0x50]
00a1cb78	ldp x20,x19,[sp, #0x40]
00a1cb7c	ldp x22,x21,[sp, #0x30]
00a1cb80	ldp x24,x23,[sp, #0x20]
00a1cb84	ldp x26,x25,[sp, #0x10]
00a1cb88	ldp x28,x27,[sp], #0x60
00a1cb8c	ret
00a1cb90	ldur x25,[x29, #-0x98]
00a1cb94	mov w22,wzr
00a1cb98	mov x23,xzr
00a1cb9c	mov x26,xzr
00a1cba0	cbnz x20,0x00a1cb40
00a1cba4	b 0x00a1cb38
00a1cba8	and w10,w9,#0x3
00a1cbac	add x9,x13,#0x58
00a1cbb0	sub x11,x11,x10
00a1cbb4	sub x13,x9,x16
00a1cbb8	add x12,x8,#0x18
00a1cbbc	add x9,x11,#0x1
00a1cbc0	add x13,x15,x13
00a1cbc4	ldp q0,q1,[x12, #-0x10]
00a1cbc8	subs x11,x11,#0x4
00a1cbcc	add x12,x12,#0x20
00a1cbd0	mvn v0.16B,v0.16B
00a1cbd4	mvn v1.16B,v1.16B
00a1cbd8	stp q0,q1,[x13, #-0x10]
00a1cbdc	add x13,x13,#0x20
00a1cbe0	b.ne 0x00a1cbc4
00a1cbe4	cbnz w10,0x00a1c770
00a1cbe8	b 0x00a1c7b0
00a1cbec	sub x1,x29,#0x68
00a1cbf0	mov x0,x22
00a1cbf4	mov x2,x21
00a1cbf8	mov x3,x19
00a1cbfc	bl 0x00c38fb0
00a1cc00	cmp w0,#0x0
00a1cc04	cset w22,ne
00a1cc08	b 0x00a1cb14
