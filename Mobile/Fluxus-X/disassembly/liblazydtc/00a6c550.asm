; evp_pkey_export_to_provider @ 00a6c550
00a6c550	str x25,[sp, #-0x50]!
00a6c554	stp x24,x23,[sp, #0x10]
00a6c558	stp x22,x21,[sp, #0x20]
00a6c55c	stp x20,x19,[sp, #0x30]
00a6c560	stp x29,x30,[sp, #0x40]
00a6c564	add x29,sp,#0x40
00a6c568	cbz x0,0x00a6c5d4
00a6c56c	ldr x8,[x0, #0x20]
00a6c570	mov x24,x3
00a6c574	mov x19,x2
00a6c578	mov x25,x1
00a6c57c	mov x22,x0
00a6c580	cbz x8,0x00a6c5cc
00a6c584	ldr x8,[x22, #0x8]
00a6c588	ldr x9,[x8, #0x118]
00a6c58c	cbz x9,0x00a6c5d4
00a6c590	ldr x8,[x8, #0x120]
00a6c594	cbz x8,0x00a6c5d4
00a6c598	cbz x19,0x00a6c5dc
00a6c59c	ldr x21,[x19]
00a6c5a0	str xzr,[x19]
00a6c5a4	cbz x21,0x00a6c5dc
00a6c5a8	mov x20,xzr
00a6c5ac	ldr x8,[x22, #0x20]
00a6c5b0	cbnz x8,0x00a6c60c
00a6c5b4	mov w2,#0x87
00a6c5b8	mov x0,x22
00a6c5bc	mov x1,x21
00a6c5c0	bl 0x00c3d310
00a6c5c4	mov x23,x0
00a6c5c8	b 0x00a6c7c0
00a6c5cc	ldr x8,[x22, #0x68]
00a6c5d0	cbnz x8,0x00a6c598
00a6c5d4	mov x23,xzr
00a6c5d8	b 0x00a6c7e0
00a6c5dc	mov x0,x25
00a6c5e0	mov x1,x22
00a6c5e4	mov x2,x24
00a6c5e8	bl 0x00c34640
00a6c5ec	cbz x0,0x00a6c660
00a6c5f0	ldr x20,[x0, #0x20]
00a6c5f4	str xzr,[x0, #0x20]
00a6c5f8	bl 0x00c34620
00a6c5fc	mov x21,x20
00a6c600	cbz x20,0x00a6c7bc
00a6c604	ldr x8,[x22, #0x20]
00a6c608	cbz x8,0x00a6c5b4
00a6c60c	ldr x8,[x22, #0x8]
00a6c610	mov x0,x22
00a6c614	ldr x8,[x8, #0x118]
00a6c618	blr x8
00a6c61c	ldr x8,[x22, #0x80]
00a6c620	cmp x0,x8
00a6c624	b.ne 0x00a6c678
00a6c628	ldr x0,[x22, #0x38]
00a6c62c	bl 0x00c35680
00a6c630	cbz w0,0x00a6c7bc
00a6c634	mov w2,#0x87
00a6c638	mov x0,x22
00a6c63c	mov x1,x21
00a6c640	bl 0x00c3d320
00a6c644	cbz x0,0x00a6c670
00a6c648	ldr x8,[x0]
00a6c64c	cbz x8,0x00a6c670
00a6c650	ldr x23,[x0, #0x8]
00a6c654	ldr x0,[x22, #0x38]
00a6c658	bl 0x00c35690
00a6c65c	b 0x00a6c7c0
00a6c660	mov x21,xzr
00a6c664	mov x23,xzr
00a6c668	mov x20,xzr
00a6c66c	b 0x00a6c7c0
00a6c670	ldr x0,[x22, #0x38]
00a6c674	bl 0x00c35690
00a6c678	ldr w0,[x22]
00a6c67c	bl 0x00c324f0
00a6c680	mov x1,x0
00a6c684	mov x0,x21
00a6c688	bl 0x00c3b6d0
00a6c68c	cbz w0,0x00a6c7bc
00a6c690	mov x0,x21
00a6c694	bl 0x00c3d210
00a6c698	mov x23,x0
00a6c69c	cbz x0,0x00a6c7c0
00a6c6a0	ldr x8,[x22, #0x8]
00a6c6a4	ldr x2,[x21, #0xb8]
00a6c6a8	mov x0,x22
00a6c6ac	mov x1,x23
00a6c6b0	ldr x8,[x8, #0x120]
00a6c6b4	mov x3,x25
00a6c6b8	mov x4,x24
00a6c6bc	blr x8
00a6c6c0	cbz w0,0x00a6c7b0
00a6c6c4	mov x0,x21
00a6c6c8	bl 0x00c3b6f0
00a6c6cc	cbz w0,0x00a6c7b0
00a6c6d0	ldr x0,[x22, #0x38]
00a6c6d4	bl 0x00c356a0
00a6c6d8	cbz w0,0x00a6c7c0
00a6c6dc	ldr x8,[x22, #0x8]
00a6c6e0	mov x0,x22
00a6c6e4	ldr x8,[x8, #0x118]
00a6c6e8	blr x8
00a6c6ec	ldr x8,[x22, #0x80]
00a6c6f0	cmp x0,x8
00a6c6f4	b.eq 0x00a6c708
00a6c6f8	mov x0,x22
00a6c6fc	mov w1,wzr
00a6c700	bl 0x00c3d2e0
00a6c704	cbz w0,0x00a6c788
00a6c708	mov x0,x21
00a6c70c	bl 0x00c36350
00a6c710	mov w2,#0x87
00a6c714	mov x0,x22
00a6c718	mov x1,x21
00a6c71c	bl 0x00c3d320
00a6c720	cbz x0,0x00a6c74c
00a6c724	ldr x8,[x0]
00a6c728	cbz x8,0x00a6c74c
00a6c72c	ldr x24,[x0, #0x8]
00a6c730	ldr x0,[x22, #0x38]
00a6c734	bl 0x00c35690
00a6c738	mov x0,x21
00a6c73c	mov x1,x23
00a6c740	bl 0x00c3b730
00a6c744	mov x23,x24
00a6c748	b 0x00a6c7c0
00a6c74c	mov w3,#0x87
00a6c750	mov x0,x22
00a6c754	mov x1,x21
00a6c758	mov x2,x23
00a6c75c	bl 0x00c3d2d0
00a6c760	cbz w0,0x00a6c7a8
00a6c764	ldr x8,[x22, #0x8]
00a6c768	mov x0,x22
00a6c76c	ldr x8,[x8, #0x118]
00a6c770	blr x8
00a6c774	ldr x8,[x22, #0x38]
00a6c778	str x0,[x22, #0x80]
00a6c77c	mov x0,x8
00a6c780	bl 0x00c35690
00a6c784	b 0x00a6c7c0
00a6c788	ldr x0,[x22, #0x38]
00a6c78c	bl 0x00c35690
00a6c790	mov x0,x21
00a6c794	mov x1,x23
00a6c798	bl 0x00c3b730
00a6c79c	mov x0,x21
00a6c7a0	bl 0x00c36350
00a6c7a4	b 0x00a6c7bc
00a6c7a8	ldr x0,[x22, #0x38]
00a6c7ac	bl 0x00c35690
00a6c7b0	mov x0,x21
00a6c7b4	mov x1,x23
00a6c7b8	bl 0x00c3b730
00a6c7bc	mov x23,xzr
00a6c7c0	cmp x23,#0x0
00a6c7c4	csel x8,xzr,x21,eq
00a6c7c8	cbz x19,0x00a6c7d8
00a6c7cc	cbz x8,0x00a6c7d8
00a6c7d0	mov x20,xzr
00a6c7d4	str x8,[x19]
00a6c7d8	mov x0,x20
00a6c7dc	bl 0x00c36350
00a6c7e0	mov x0,x23
00a6c7e4	ldp x29,x30,[sp, #0x40]
00a6c7e8	ldp x20,x19,[sp, #0x30]
00a6c7ec	ldp x22,x21,[sp, #0x20]
00a6c7f0	ldp x24,x23,[sp, #0x10]
00a6c7f4	ldr x25,[sp], #0x50
00a6c7f8	ret
