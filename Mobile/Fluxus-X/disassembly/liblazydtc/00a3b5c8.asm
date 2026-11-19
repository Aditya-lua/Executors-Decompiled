; ossl_ec_GFp_simple_blind_coordinates @ 00a3b5c8
00a3b5c8	stp x24,x23,[sp, #-0x40]!
00a3b5cc	stp x22,x21,[sp, #0x10]
00a3b5d0	mov x22,x0
00a3b5d4	mov x0,x2
00a3b5d8	stp x20,x19,[sp, #0x20]
00a3b5dc	stp x29,x30,[sp, #0x30]
00a3b5e0	add x29,sp,#0x30
00a3b5e4	mov x19,x2
00a3b5e8	mov x20,x1
00a3b5ec	bl 0x00c38a90
00a3b5f0	mov x0,x19
00a3b5f4	bl 0x00c38a40
00a3b5f8	mov x24,x0
00a3b5fc	mov x0,x19
00a3b600	bl 0x00c38a40
00a3b604	cbz x0,0x00a3b71c
00a3b608	mov x23,x0
00a3b60c	bl 0x00c35250
00a3b610	ldr x1,[x22, #0x40]
00a3b614	mov x0,x24
00a3b618	mov w2,wzr
00a3b61c	mov x3,x19
00a3b620	bl 0x00c39160
00a3b624	mov w21,w0
00a3b628	bl 0x00c35240
00a3b62c	cbz w21,0x00a3b714
00a3b630	mov x0,x24
00a3b634	bl 0x00c369b0
00a3b638	cbnz w0,0x00a3b60c
00a3b63c	ldr x8,[x22]
00a3b640	ldr x9,[x8, #0x118]
00a3b644	cbz x9,0x00a3b664
00a3b648	mov x0,x22
00a3b64c	mov x1,x24
00a3b650	mov x2,x24
00a3b654	mov x3,x19
00a3b658	blr x9
00a3b65c	cbz w0,0x00a3b750
00a3b660	ldr x8,[x22]
00a3b664	ldr x1,[x20, #0x20]
00a3b668	ldr x8,[x8, #0xf8]
00a3b66c	mov x0,x22
00a3b670	mov x3,x24
00a3b674	mov x2,x1
00a3b678	mov x4,x19
00a3b67c	blr x8
00a3b680	cbz w0,0x00a3b750
00a3b684	ldr x8,[x22]
00a3b688	mov x0,x22
00a3b68c	mov x1,x23
00a3b690	mov x2,x24
00a3b694	ldr x8,[x8, #0x100]
00a3b698	mov x3,x19
00a3b69c	blr x8
00a3b6a0	cbz w0,0x00a3b750
00a3b6a4	ldr x8,[x22]
00a3b6a8	ldr x1,[x20, #0x10]
00a3b6ac	mov x0,x22
00a3b6b0	mov x3,x23
00a3b6b4	ldr x8,[x8, #0xf8]
00a3b6b8	mov x2,x1
00a3b6bc	mov x4,x19
00a3b6c0	blr x8
00a3b6c4	cbz w0,0x00a3b750
00a3b6c8	ldr x8,[x22]
00a3b6cc	mov x0,x22
00a3b6d0	mov x1,x23
00a3b6d4	mov x2,x23
00a3b6d8	ldr x8,[x8, #0xf8]
00a3b6dc	mov x3,x24
00a3b6e0	mov x4,x19
00a3b6e4	blr x8
00a3b6e8	cbz w0,0x00a3b750
00a3b6ec	ldr x8,[x22]
00a3b6f0	ldr x1,[x20, #0x18]
00a3b6f4	mov x0,x22
00a3b6f8	mov x3,x23
00a3b6fc	ldr x8,[x8, #0xf8]
00a3b700	mov x2,x1
00a3b704	mov x4,x19
00a3b708	blr x8
00a3b70c	cbz w0,0x00a3b750
00a3b710	str wzr,[x20, #0x28]
00a3b714	mov w21,#0x1
00a3b718	b 0x00a3b750
00a3b71c	bl 0x00c342a0
00a3b720	adrp x0,0x2c7000
00a3b724	adrp x2,0x2af000
00a3b728	add x0,x0,#0x8a7
00a3b72c	add x2,x2,#0xe7f
00a3b730	mov w1,#0x5a1
00a3b734	bl 0x00c342b0
00a3b738	mov w1,#0x100
00a3b73c	mov w0,#0x10
00a3b740	movk w1,#0xc, LSL #16
00a3b744	mov x2,xzr
00a3b748	bl 0x00c342c0
00a3b74c	mov w21,wzr
00a3b750	mov x0,x19
00a3b754	bl 0x00c38a20
00a3b758	mov w0,w21
00a3b75c	ldp x29,x30,[sp, #0x30]
00a3b760	ldp x20,x19,[sp, #0x20]
00a3b764	ldp x22,x21,[sp, #0x10]
00a3b768	ldp x24,x23,[sp], #0x40
00a3b76c	ret
