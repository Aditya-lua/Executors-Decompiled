; ossl_rsa_pss_params_30_fromdata @ 00acf60c
00acf60c	sub sp,sp,#0x70
00acf610	stp x28,x27,[sp, #0x10]
00acf614	stp x26,x25,[sp, #0x20]
00acf618	stp x24,x23,[sp, #0x30]
00acf61c	stp x22,x21,[sp, #0x40]
00acf620	stp x20,x19,[sp, #0x50]
00acf624	stp x29,x30,[sp, #0x60]
00acf628	add x29,sp,#0x60
00acf62c	cbz x0,0x00acf780
00acf630	mov x28,x1
00acf634	adrp x1,0x2d3000
00acf638	mov x19,x0
00acf63c	add x1,x1,#0x7c2
00acf640	mov x0,x2
00acf644	mov x20,x3
00acf648	mov x21,x2
00acf64c	bl 0x00c36530
00acf650	adrp x1,0x29d000
00acf654	mov x25,x0
00acf658	add x1,x1,#0xe2e
00acf65c	mov x0,x21
00acf660	bl 0x00c36530
00acf664	adrp x1,0x2ae000
00acf668	mov x26,x0
00acf66c	add x1,x1,#0x5ea
00acf670	mov x0,x21
00acf674	bl 0x00c36530
00acf678	adrp x1,0x29e000
00acf67c	mov x22,x0
00acf680	add x1,x1,#0x202
00acf684	mov x0,x21
00acf688	bl 0x00c36530
00acf68c	adrp x1,0x2a2000
00acf690	mov x24,x0
00acf694	add x1,x1,#0x40c
00acf698	mov x0,x21
00acf69c	bl 0x00c36530
00acf6a0	mov x21,x0
00acf6a4	cbz x25,0x00acf6f0
00acf6a8	ldr w8,[x25, #0x8]
00acf6ac	mov x23,xzr
00acf6b0	cmp w8,#0x4
00acf6b4	b.ne 0x00acf6bc
00acf6b8	ldr x23,[x25, #0x10]
00acf6bc	ldr w8,[x28]
00acf6c0	cbz w8,0x00acf6fc
00acf6c4	cbz x22,0x00acf760
00acf6c8	mov x0,xzr
00acf6cc	bl 0x00c3fd10
00acf6d0	str xzr,[sp, #0x8]
00acf6d4	ldr w8,[x22, #0x8]
00acf6d8	mov w25,w0
00acf6dc	cmp w8,#0x4
00acf6e0	b.ne 0x00acf730
00acf6e4	ldr x27,[x22, #0x10]
00acf6e8	str x27,[sp, #0x8]
00acf6ec	b 0x00acf744
00acf6f0	mov x23,xzr
00acf6f4	ldr w8,[x28]
00acf6f8	cbnz w8,0x00acf6c4
00acf6fc	cbnz x26,0x00acf714
00acf700	cbnz x22,0x00acf714
00acf704	cbnz x24,0x00acf714
00acf708	mov x27,xzr
00acf70c	mov x25,xzr
00acf710	cbz x21,0x00acf860
00acf714	mov x0,x19
00acf718	bl 0x00c3fbb0
00acf71c	cbz w0,0x00acf780
00acf720	mov w8,#0x1
00acf724	str w8,[x28]
00acf728	cbnz x22,0x00acf6c8
00acf72c	b 0x00acf760
00acf730	add x1,sp,#0x8
00acf734	mov x0,x22
00acf738	bl 0x00c3acf0
00acf73c	cbz w0,0x00acf780
00acf740	ldr x27,[x22, #0x10]
00acf744	mov w0,w25
00acf748	bl 0x00c3fce0
00acf74c	mov x1,x0
00acf750	mov x0,x27
00acf754	bl 0x00c35ee0
00acf758	mov w28,wzr
00acf75c	cbnz w0,0x00acf884
00acf760	cbz x26,0x00acf788
00acf764	str xzr,[sp, #0x8]
00acf768	ldr w8,[x26, #0x8]
00acf76c	cmp w8,#0x4
00acf770	b.ne 0x00acf79c
00acf774	ldr x1,[x26, #0x10]
00acf778	str x1,[sp, #0x8]
00acf77c	b 0x00acf7b0
00acf780	mov w28,wzr
00acf784	b 0x00acf884
00acf788	mov x25,xzr
00acf78c	cbnz x24,0x00acf7e0
00acf790	mov x27,xzr
00acf794	cbnz x21,0x00acf840
00acf798	b 0x00acf860
00acf79c	add x1,sp,#0x8
00acf7a0	mov x0,x22
00acf7a4	bl 0x00c3acf0
00acf7a8	cbz w0,0x00acf868
00acf7ac	ldr x1,[sp, #0x8]
00acf7b0	mov x0,x20
00acf7b4	mov x2,x23
00acf7b8	bl 0x00c357f0
00acf7bc	mov x25,x0
00acf7c0	cbz x0,0x00acf86c
00acf7c4	mov x0,x25
00acf7c8	bl 0x00c3fcf0
00acf7cc	mov w1,w0
00acf7d0	mov x0,x19
00acf7d4	bl 0x00c3fbc0
00acf7d8	cbz w0,0x00acf86c
00acf7dc	cbz x24,0x00acf790
00acf7e0	str xzr,[sp, #0x8]
00acf7e4	ldr w8,[x24, #0x8]
00acf7e8	cmp w8,#0x4
00acf7ec	b.ne 0x00acf7fc
00acf7f0	ldr x1,[x24, #0x10]
00acf7f4	str x1,[sp, #0x8]
00acf7f8	b 0x00acf810
00acf7fc	add x1,sp,#0x8
00acf800	mov x0,x22
00acf804	bl 0x00c3acf0
00acf808	cbz w0,0x00acf86c
00acf80c	ldr x1,[sp, #0x8]
00acf810	mov x0,x20
00acf814	mov x2,x23
00acf818	bl 0x00c357f0
00acf81c	mov x27,x0
00acf820	cbz x0,0x00acf870
00acf824	mov x0,x27
00acf828	bl 0x00c3fcf0
00acf82c	mov w1,w0
00acf830	mov x0,x19
00acf834	bl 0x00c3fbd0
00acf838	cbz w0,0x00acf870
00acf83c	cbz x21,0x00acf860
00acf840	add x1,sp,#0x8
00acf844	mov x0,x21
00acf848	bl 0x00c36510
00acf84c	cbz w0,0x00acf870
00acf850	ldr w1,[sp, #0x8]
00acf854	mov x0,x19
00acf858	bl 0x00c3fbe0
00acf85c	cbz w0,0x00acf870
00acf860	mov w28,#0x1
00acf864	b 0x00acf874
00acf868	mov x25,xzr
00acf86c	mov x27,xzr
00acf870	mov w28,wzr
00acf874	mov x0,x25
00acf878	bl 0x00c35800
00acf87c	mov x0,x27
00acf880	bl 0x00c35800
00acf884	mov w0,w28
00acf888	ldp x29,x30,[sp, #0x60]
00acf88c	ldp x20,x19,[sp, #0x50]
00acf890	ldp x22,x21,[sp, #0x40]
00acf894	ldp x24,x23,[sp, #0x30]
00acf898	ldp x26,x25,[sp, #0x20]
00acf89c	ldp x28,x27,[sp, #0x10]
00acf8a0	add sp,sp,#0x70
00acf8a4	ret
