; ossl_ffc_params_fromdata @ 00a7c578
00a7c578	sub sp,sp,#0x60
00a7c57c	stp x23,xzr,[sp, #0x20]
00a7c580	stp x22,x21,[sp, #0x30]
00a7c584	stp x20,x19,[sp, #0x40]
00a7c588	stp x29,x30,[sp, #0x50]
00a7c58c	add x29,sp,#0x50
00a7c590	stp xzr,xzr,[sp, #0x10]
00a7c594	str xzr,[sp, #0x8]
00a7c598	cbz x0,0x00a7c85c
00a7c59c	mov x20,x1
00a7c5a0	adrp x1,0x2a2000
00a7c5a4	mov x19,x0
00a7c5a8	add x1,x1,#0x238
00a7c5ac	mov x0,x20
00a7c5b0	bl 0x00c36530
00a7c5b4	cbz x0,0x00a7c5e4
00a7c5b8	ldr w8,[x0, #0x8]
00a7c5bc	cmp w8,#0x4
00a7c5c0	b.ne 0x00a7c838
00a7c5c4	ldr x0,[x0, #0x10]
00a7c5c8	cbz x0,0x00a7c838
00a7c5cc	bl 0x00c3dca0
00a7c5d0	cbz x0,0x00a7c838
00a7c5d4	mov x1,x0
00a7c5d8	mov x0,x19
00a7c5dc	bl 0x00c39f30
00a7c5e0	cbz w0,0x00a7c838
00a7c5e4	adrp x1,0x2a3000
00a7c5e8	add x1,x1,#0x8e7
00a7c5ec	mov x0,x20
00a7c5f0	bl 0x00c36530
00a7c5f4	adrp x1,0x2d9000
00a7c5f8	mov x22,x0
00a7c5fc	add x1,x1,#0x2e5
00a7c600	mov x0,x20
00a7c604	bl 0x00c36530
00a7c608	adrp x1,0x2cf000
00a7c60c	mov x21,x0
00a7c610	add x1,x1,#0x3b1
00a7c614	mov x0,x20
00a7c618	bl 0x00c36530
00a7c61c	mov x23,x0
00a7c620	cbz x22,0x00a7c634
00a7c624	add x1,sp,#0x28
00a7c628	mov x0,x22
00a7c62c	bl 0x00c39d50
00a7c630	cbz w0,0x00a7c838
00a7c634	cbz x23,0x00a7c648
00a7c638	add x1,sp,#0x18
00a7c63c	mov x0,x23
00a7c640	bl 0x00c39d50
00a7c644	cbz w0,0x00a7c838
00a7c648	cbz x21,0x00a7c65c
00a7c64c	add x1,sp,#0x10
00a7c650	mov x0,x21
00a7c654	bl 0x00c39d50
00a7c658	cbz w0,0x00a7c838
00a7c65c	adrp x1,0x2a7000
00a7c660	add x1,x1,#0xf40
00a7c664	mov x0,x20
00a7c668	bl 0x00c36530
00a7c66c	cbz x0,0x00a7c684
00a7c670	add x1,sp,#0x4
00a7c674	bl 0x00c36510
00a7c678	cbz w0,0x00a7c838
00a7c67c	ldr w8,[sp, #0x4]
00a7c680	str w8,[x19, #0x38]
00a7c684	adrp x1,0x2d9000
00a7c688	add x1,x1,#0xd90
00a7c68c	mov x0,x20
00a7c690	bl 0x00c36530
00a7c694	cbz x0,0x00a7c6ac
00a7c698	add x1,sp,#0x4
00a7c69c	bl 0x00c36510
00a7c6a0	cbz w0,0x00a7c838
00a7c6a4	ldr w8,[sp, #0x4]
00a7c6a8	str w8,[x19, #0x30]
00a7c6ac	adrp x1,0x2d9000
00a7c6b0	add x1,x1,#0xa61
00a7c6b4	mov x0,x20
00a7c6b8	bl 0x00c36530
00a7c6bc	cbz x0,0x00a7c6cc
00a7c6c0	add x1,sp,#0x8
00a7c6c4	bl 0x00c39d50
00a7c6c8	cbz w0,0x00a7c838
00a7c6cc	adrp x1,0x2a4000
00a7c6d0	add x1,x1,#0x10a
00a7c6d4	mov x0,x20
00a7c6d8	bl 0x00c36530
00a7c6dc	cbz x0,0x00a7c6f4
00a7c6e0	add x1,sp,#0x4
00a7c6e4	bl 0x00c36510
00a7c6e8	cbz w0,0x00a7c838
00a7c6ec	ldr w8,[sp, #0x4]
00a7c6f0	str w8,[x19, #0x3c]
00a7c6f4	adrp x1,0x2bb000
00a7c6f8	add x1,x1,#0x864
00a7c6fc	mov x0,x20
00a7c700	bl 0x00c36530
00a7c704	cbz x0,0x00a7c724
00a7c708	ldr w8,[x0, #0x8]
00a7c70c	cmp w8,#0x5
00a7c710	b.ne 0x00a7c838
00a7c714	ldp x1,x2,[x0, #0x10]
00a7c718	mov x0,x19
00a7c71c	bl 0x00c3dcc0
00a7c720	cbz w0,0x00a7c838
00a7c724	adrp x1,0x2a0000
00a7c728	add x1,x1,#0x3c6
00a7c72c	mov x0,x20
00a7c730	bl 0x00c36530
00a7c734	cbz x0,0x00a7c754
00a7c738	add x1,sp,#0x4
00a7c73c	bl 0x00c36510
00a7c740	cbz w0,0x00a7c838
00a7c744	ldr w2,[sp, #0x4]
00a7c748	mov w1,#0x1
00a7c74c	mov x0,x19
00a7c750	bl 0x00c3dcb0
00a7c754	adrp x1,0x2c1000
00a7c758	add x1,x1,#0xd34
00a7c75c	mov x0,x20
00a7c760	bl 0x00c36530
00a7c764	cbz x0,0x00a7c784
00a7c768	add x1,sp,#0x4
00a7c76c	bl 0x00c36510
00a7c770	cbz w0,0x00a7c838
00a7c774	ldr w2,[sp, #0x4]
00a7c778	mov w1,#0x2
00a7c77c	mov x0,x19
00a7c780	bl 0x00c3dcb0
00a7c784	adrp x1,0x2c5000
00a7c788	add x1,x1,#0xb86
00a7c78c	mov x0,x20
00a7c790	bl 0x00c36530
00a7c794	cbz x0,0x00a7c7b4
00a7c798	add x1,sp,#0x4
00a7c79c	bl 0x00c36510
00a7c7a0	cbz w0,0x00a7c838
00a7c7a4	ldr w2,[sp, #0x4]
00a7c7a8	mov w1,#0x4
00a7c7ac	mov x0,x19
00a7c7b0	bl 0x00c3dcb0
00a7c7b4	adrp x1,0x29d000
00a7c7b8	add x1,x1,#0xe2e
00a7c7bc	mov x0,x20
00a7c7c0	bl 0x00c36530
00a7c7c4	cbz x0,0x00a7c814
00a7c7c8	ldr w8,[x0, #0x8]
00a7c7cc	mov x21,x0
00a7c7d0	cmp w8,#0x4
00a7c7d4	b.ne 0x00a7c838
00a7c7d8	adrp x1,0x2d3000
00a7c7dc	add x1,x1,#0x7c2
00a7c7e0	mov x0,x20
00a7c7e4	bl 0x00c36530
00a7c7e8	cbz x0,0x00a7c800
00a7c7ec	ldr w8,[x0, #0x8]
00a7c7f0	cmp w8,#0x4
00a7c7f4	b.ne 0x00a7c838
00a7c7f8	ldr x2,[x0, #0x10]
00a7c7fc	b 0x00a7c804
00a7c800	mov x2,xzr
00a7c804	ldr x1,[x21, #0x10]
00a7c808	mov x0,x19
00a7c80c	bl 0x00c3dc90
00a7c810	cbz w0,0x00a7c838
00a7c814	ldr x1,[sp, #0x28]
00a7c818	ldp x3,x2,[sp, #0x10]
00a7c81c	mov x0,x19
00a7c820	bl 0x00c3a060
00a7c824	ldr x1,[sp, #0x8]
00a7c828	mov x0,x19
00a7c82c	bl 0x00c39ce0
00a7c830	mov w0,#0x1
00a7c834	b 0x00a7c85c
00a7c838	ldr x0,[sp, #0x8]
00a7c83c	bl 0x00c36290
00a7c840	ldr x0,[sp, #0x28]
00a7c844	bl 0x00c36290
00a7c848	ldr x0,[sp, #0x18]
00a7c84c	bl 0x00c36290
00a7c850	ldr x0,[sp, #0x10]
00a7c854	bl 0x00c36290
00a7c858	mov w0,wzr
00a7c85c	ldp x29,x30,[sp, #0x50]
00a7c860	ldp x20,x19,[sp, #0x40]
00a7c864	ldp x22,x21,[sp, #0x30]
00a7c868	ldr x23,[sp, #0x20]
00a7c86c	add sp,sp,#0x60
00a7c870	ret
