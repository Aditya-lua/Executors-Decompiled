; FUN_00b1c55c @ 00b1c55c
00b1c55c	sub sp,sp,#0x80
00b1c560	stp x28,x27,[sp, #0x20]
00b1c564	stp x26,x25,[sp, #0x30]
00b1c568	stp x24,x23,[sp, #0x40]
00b1c56c	stp x22,x21,[sp, #0x50]
00b1c570	stp x20,x19,[sp, #0x60]
00b1c574	stp x29,x30,[sp, #0x70]
00b1c578	mov x20,x0
00b1c57c	ldr x0,[x0, #0x18]
00b1c580	adrp x1,0x2c6000
00b1c584	add x1,x1,#0x46b
00b1c588	mov w2,#0x138
00b1c58c	add x29,sp,#0x70
00b1c590	bl 0x00c32310
00b1c594	ldr x0,[x20]
00b1c598	str xzr,[x20, #0x18]
00b1c59c	bl 0x00c325e0
00b1c5a0	cbz w0,0x00b1c81c
00b1c5a4	bl 0x00c34780
00b1c5a8	mov x24,x0
00b1c5ac	cbz x0,0x00b1c828
00b1c5b0	ldr x0,[x20]
00b1c5b4	bl 0x00c325e0
00b1c5b8	cmp w0,#0x1
00b1c5bc	b.lt 0x00b1c7b0
00b1c5c0	adrp x19,0xc82000
00b1c5c4	mov w22,wzr
00b1c5c8	mov x23,xzr
00b1c5cc	mov w28,#0xffffffff
00b1c5d0	add x19,x19,#0x478
00b1c5d4	str x24,[sp]
00b1c5d8	ldr x0,[x20]
00b1c5dc	mov w1,w22
00b1c5e0	bl 0x00c32610
00b1c5e4	ldr w8,[x0, #0x10]
00b1c5e8	mov x25,x0
00b1c5ec	cmp w8,w28
00b1c5f0	b.eq 0x00b1c614
00b1c5f4	bl 0x00c34780
00b1c5f8	cbz x0,0x00b1c858
00b1c5fc	mov x23,x0
00b1c600	mov x0,x24
00b1c604	mov x1,x23
00b1c608	bl 0x00c347a0
00b1c60c	cbz w0,0x00b1c9bc
00b1c610	ldr w28,[x25, #0x10]
00b1c614	mov x0,x19
00b1c618	bl 0x00c372e0
00b1c61c	mov x21,x0
00b1c620	cbz x0,0x00b1c8f0
00b1c624	ldr x0,[x25]
00b1c628	bl 0x00c37730
00b1c62c	str x0,[x21]
00b1c630	cbz x0,0x00b1c90c
00b1c634	ldr x27,[x25, #0x8]
00b1c638	ldr x25,[x21, #0x8]
00b1c63c	ldr w0,[x27, #0x4]
00b1c640	bl 0x00c37fa0
00b1c644	mov w8,#0x2956
00b1c648	tst x0,x8
00b1c64c	b.eq 0x00b1c748
00b1c650	add x26,x25,#0x8
00b1c654	orr w8,wzr,#0xc
00b1c658	mov x0,x26
00b1c65c	mov x1,x27
00b1c660	str w8,[x25, #0x4]
00b1c664	bl 0x00c32160
00b1c668	cmn w0,#0x1
00b1c66c	str w0,[x25]
00b1c670	b.eq 0x00b1c958
00b1c674	str w28,[sp, #0xc]
00b1c678	ldr x28,[x26]
00b1c67c	mov w27,w0
00b1c680	cmp w0,#0x1
00b1c684	b.lt 0x00b1c75c
00b1c688	ldrb w0,[x28]
00b1c68c	mov w1,#0x8
00b1c690	bl 0x00c377c0
00b1c694	cbz w0,0x00b1c6a4
00b1c698	subs w27,w27,#0x1
00b1c69c	add x28,x28,#0x1
00b1c6a0	b.gt 0x00b1c688
00b1c6a4	cmp w27,#0x0
00b1c6a8	b.le 0x00b1c764
00b1c6ac	add x8,x28,w27, SXTW 
00b1c6b0	sub x19,x8,#0x1
00b1c6b4	ldrb w0,[x19]
00b1c6b8	mov w1,#0x8
00b1c6bc	bl 0x00c377c0
00b1c6c0	cbz w0,0x00b1c6d0
00b1c6c4	subs w27,w27,#0x1
00b1c6c8	sub x19,x19,#0x1
00b1c6cc	b.gt 0x00b1c6b4
00b1c6d0	ldr x24,[x26]
00b1c6d4	cmp w27,#0x1
00b1c6d8	b.lt 0x00b1c770
00b1c6dc	mov w19,wzr
00b1c6e0	ldrb w0,[x28]
00b1c6e4	tbnz w0,#0x7,0x00b1c714
00b1c6e8	mov w1,#0x8
00b1c6ec	bl 0x00c377c0
00b1c6f0	cbz w0,0x00b1c71c
00b1c6f4	mov w8,#0x20
00b1c6f8	strb w8,[x24]
00b1c6fc	ldrb w0,[x28, #0x1]!
00b1c700	mov w1,#0x8
00b1c704	add w19,w19,#0x1
00b1c708	bl 0x00c377c0
00b1c70c	cbnz w0,0x00b1c6fc
00b1c710	b 0x00b1c72c
00b1c714	add x28,x28,#0x1
00b1c718	b 0x00b1c724
00b1c71c	ldrb w0,[x28], #0x1
00b1c720	bl 0x00c3de30
00b1c724	add w19,w19,#0x1
00b1c728	strb w0,[x24]
00b1c72c	cmp w19,w27
00b1c730	add x24,x24,#0x1
00b1c734	b.lt 0x00b1c6e0
00b1c738	ldr x8,[x26]
00b1c73c	mov x28,x24
00b1c740	mov x24,x8
00b1c744	b 0x00b1c774
00b1c748	mov x0,x25
00b1c74c	mov x1,x27
00b1c750	bl 0x00c37940
00b1c754	cbnz w0,0x00b1c78c
00b1c758	b 0x00b1c958
00b1c75c	mov x24,x28
00b1c760	b 0x00b1c77c
00b1c764	ldr x28,[x26]
00b1c768	mov x24,x28
00b1c76c	b 0x00b1c77c
00b1c770	mov x28,x24
00b1c774	adrp x19,0xc82000
00b1c778	add x19,x19,#0x478
00b1c77c	sub w8,w28,w24
00b1c780	ldr x24,[sp]
00b1c784	ldr w28,[sp, #0xc]
00b1c788	str w8,[x25]
00b1c78c	mov x0,x23
00b1c790	mov x1,x21
00b1c794	bl 0x00c347a0
00b1c798	cbz w0,0x00b1c928
00b1c79c	ldr x0,[x20]
00b1c7a0	add w22,w22,#0x1
00b1c7a4	bl 0x00c325e0
00b1c7a8	cmp w22,w0
00b1c7ac	b.lt 0x00b1c5d8
00b1c7b0	mov x0,x24
00b1c7b4	bl 0x00c325e0
00b1c7b8	cmp w0,#0x0
00b1c7bc	b.le 0x00b1c860
00b1c7c0	adrp x22,0xc82000
00b1c7c4	mov w21,wzr
00b1c7c8	mov w19,wzr
00b1c7cc	add x22,x22,#0x5e0
00b1c7d0	mov x0,x24
00b1c7d4	mov w1,w21
00b1c7d8	bl 0x00c32610
00b1c7dc	str x0,[sp, #0x18]
00b1c7e0	add x0,sp,#0x18
00b1c7e4	mov w3,#0xffffffff
00b1c7e8	mov w4,#0xffffffff
00b1c7ec	mov x1,xzr
00b1c7f0	mov x2,x22
00b1c7f4	bl 0x00c38060
00b1c7f8	tbnz w0,#0x1f,0x00b1c858
00b1c7fc	add w19,w0,w19
00b1c800	mov x0,x24
00b1c804	add w21,w21,#0x1
00b1c808	bl 0x00c325e0
00b1c80c	cmp w21,w0
00b1c810	b.lt 0x00b1c7d0
00b1c814	tbz w19,#0x1f,0x00b1c864
00b1c818	b 0x00b1c858
00b1c81c	str wzr,[x20, #0x20]
00b1c820	mov w20,#0x1
00b1c824	b 0x00b1c97c
00b1c828	bl 0x00c342a0
00b1c82c	adrp x0,0x2c6000
00b1c830	adrp x2,0x2dc000
00b1c834	add x0,x0,#0x46b
00b1c838	add x2,x2,#0xcbd
00b1c83c	mov w1,#0x141
00b1c840	bl 0x00c342b0
00b1c844	mov w1,#0x100
00b1c848	mov w0,#0xb
00b1c84c	movk w1,#0xc, LSL #16
00b1c850	mov x2,xzr
00b1c854	bl 0x00c342c0
00b1c858	mov x21,xzr
00b1c85c	b 0x00b1c958
00b1c860	mov w19,wzr
00b1c864	adrp x1,0x2c6000
00b1c868	sxtw x0,w19
00b1c86c	add x1,x1,#0x46b
00b1c870	mov w2,#0x16a
00b1c874	str w19,[x20, #0x20]
00b1c878	bl 0x00c32320
00b1c87c	str x0,[sp, #0x10]
00b1c880	cbz x0,0x00b1c9a0
00b1c884	str x0,[x20, #0x18]
00b1c888	mov x0,x24
00b1c88c	bl 0x00c325e0
00b1c890	cmp w0,#0x1
00b1c894	b.lt 0x00b1c8e4
00b1c898	adrp x21,0xc82000
00b1c89c	mov w20,wzr
00b1c8a0	add x21,x21,#0x5e0
00b1c8a4	mov x0,x24
00b1c8a8	mov w1,w20
00b1c8ac	bl 0x00c32610
00b1c8b0	str x0,[sp, #0x18]
00b1c8b4	add x0,sp,#0x18
00b1c8b8	add x1,sp,#0x10
00b1c8bc	mov w3,#0xffffffff
00b1c8c0	mov w4,#0xffffffff
00b1c8c4	mov x2,x21
00b1c8c8	bl 0x00c38060
00b1c8cc	tbnz w0,#0x1f,0x00b1c8e4
00b1c8d0	mov x0,x24
00b1c8d4	add w20,w20,#0x1
00b1c8d8	bl 0x00c325e0
00b1c8dc	cmp w20,w0
00b1c8e0	b.lt 0x00b1c8a4
00b1c8e4	mov x21,xzr
00b1c8e8	mov w20,#0x1
00b1c8ec	b 0x00b1c95c
00b1c8f0	bl 0x00c342a0
00b1c8f4	adrp x0,0x2c6000
00b1c8f8	adrp x2,0x2dc000
00b1c8fc	add x0,x0,#0x46b
00b1c900	add x2,x2,#0xcbd
00b1c904	mov w1,#0x153
00b1c908	b 0x00b1c940
00b1c90c	bl 0x00c342a0
00b1c910	adrp x0,0x2c6000
00b1c914	adrp x2,0x2dc000
00b1c918	add x0,x0,#0x46b
00b1c91c	add x2,x2,#0xcbd
00b1c920	mov w1,#0x158
00b1c924	b 0x00b1c940
00b1c928	bl 0x00c342a0
00b1c92c	adrp x0,0x2c6000
00b1c930	adrp x2,0x2dc000
00b1c934	add x0,x0,#0x46b
00b1c938	add x2,x2,#0xcbd
00b1c93c	mov w1,#0x15e
00b1c940	bl 0x00c342b0
00b1c944	mov w1,#0x100
00b1c948	mov w0,#0xb
00b1c94c	movk w1,#0xc, LSL #16
00b1c950	mov x2,xzr
00b1c954	bl 0x00c342c0
00b1c958	mov w20,wzr
00b1c95c	adrp x1,0xc82000
00b1c960	add x1,x1,#0x478
00b1c964	mov x0,x21
00b1c968	bl 0x00c36160
00b1c96c	adrp x1,0xb1c000
00b1c970	add x1,x1,#0x9e4
00b1c974	mov x0,x24
00b1c978	bl 0x00c32600
00b1c97c	mov w0,w20
00b1c980	ldp x29,x30,[sp, #0x70]
00b1c984	ldp x20,x19,[sp, #0x60]
00b1c988	ldp x22,x21,[sp, #0x50]
00b1c98c	ldp x24,x23,[sp, #0x40]
00b1c990	ldp x26,x25,[sp, #0x30]
00b1c994	ldp x28,x27,[sp, #0x20]
00b1c998	add sp,sp,#0x80
00b1c99c	ret
00b1c9a0	bl 0x00c342a0
00b1c9a4	adrp x0,0x2c6000
00b1c9a8	adrp x2,0x2dc000
00b1c9ac	add x0,x0,#0x46b
00b1c9b0	add x2,x2,#0xcbd
00b1c9b4	mov w1,#0x16c
00b1c9b8	b 0x00b1c840
00b1c9bc	mov x0,x23
00b1c9c0	bl 0x00c34770
00b1c9c4	bl 0x00c342a0
00b1c9c8	adrp x0,0x2c6000
00b1c9cc	adrp x2,0x2dc000
00b1c9d0	add x0,x0,#0x46b
00b1c9d4	add x2,x2,#0xcbd
00b1c9d8	mov w1,#0x14c
00b1c9dc	b 0x00b1c840
