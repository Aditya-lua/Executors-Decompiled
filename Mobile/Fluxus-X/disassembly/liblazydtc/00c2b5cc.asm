; __emutls_get_address @ 00c2b5cc
00c2b5cc	paciasp
00c2b5d0	str x30,[sp, #-0x40]!
00c2b5d4	stp x24,x23,[sp, #0x10]
00c2b5d8	stp x22,x21,[sp, #0x20]
00c2b5dc	stp x20,x19,[sp, #0x30]
00c2b5e0	add x8,x0,#0x10
00c2b5e4	mov x19,x0
00c2b5e8	ldar x22,[x8]
00c2b5ec	cbz x22,0x00c2b650
00c2b5f0	adrp x23,0xd28000
00c2b5f4	ldr w0,[x23, #0xa4]
00c2b5f8	bl 0x00c3ece0
00c2b5fc	cbz x0,0x00c2b6ac
00c2b600	ldr x21,[x0, #0x8]
00c2b604	mov x20,x0
00c2b608	cmp x22,x21
00c2b60c	b.ls 0x00c2b6f4
00c2b610	add x8,x22,#0x11
00c2b614	mov x0,x20
00c2b618	and x8,x8,#-0x10
00c2b61c	sub x24,x8,#0x2
00c2b620	lsl x8,x24,#0x3
00c2b624	add x1,x8,#0x10
00c2b628	bl 0x00c30950
00c2b62c	cbz x0,0x00c2b7b4
00c2b630	sub x8,x24,x21
00c2b634	add x9,x0,x21, LSL #0x3
00c2b638	mov x20,x0
00c2b63c	lsl x2,x8,#0x3
00c2b640	mov w1,wzr
00c2b644	add x0,x9,#0x10
00c2b648	bl 0x00c301c0
00c2b64c	b 0x00c2b6e4
00c2b650	adrp x20,0xd28000
00c2b654	add x20,x20,#0xa8
00c2b658	nop
00c2b65c	adr x1,0xc2b7f4
00c2b660	mov x0,x20
00c2b664	bl 0x00c3ed10
00c2b668	add x0,x20,#0x10
00c2b66c	bl 0x00c31ca0
00c2b670	ldr x22,[x19, #0x10]
00c2b674	cbnz x22,0x00c2b690
00c2b678	adrp x8,0xd28000
00c2b67c	ldr x9,[x8, #0xb0]
00c2b680	add x22,x9,#0x1
00c2b684	add x9,x19,#0x10
00c2b688	str x22,[x8, #0xb0]
00c2b68c	stlr x22,[x9]
00c2b690	adrp x0,0xd28000
00c2b694	add x0,x0,#0xb8
00c2b698	bl 0x00c31cb0
00c2b69c	adrp x23,0xd28000
00c2b6a0	ldr w0,[x23, #0xa4]
00c2b6a4	bl 0x00c3ece0
00c2b6a8	cbnz x0,0x00c2b600
00c2b6ac	add x8,x22,#0x11
00c2b6b0	and x8,x8,#-0x10
00c2b6b4	sub x24,x8,#0x2
00c2b6b8	lsl x21,x24,#0x3
00c2b6bc	add x0,x21,#0x10
00c2b6c0	bl 0x00c308d0
00c2b6c4	cbz x0,0x00c2b7a8
00c2b6c8	mov x20,x0
00c2b6cc	add x0,x0,#0x10
00c2b6d0	mov w1,wzr
00c2b6d4	mov x2,x21
00c2b6d8	bl 0x00c301c0
00c2b6dc	mov w8,#0x1
00c2b6e0	str x8,[x20]
00c2b6e4	ldr w0,[x23, #0xa4]
00c2b6e8	mov x1,x20
00c2b6ec	str x24,[x20, #0x8]
00c2b6f0	bl 0x00c30190
00c2b6f4	sub x21,x22,#0x1
00c2b6f8	add x22,x20,#0x10
00c2b6fc	ldr x0,[x22, x21, LSL #0x3]
00c2b700	cbz x0,0x00c2b71c
00c2b704	ldp x20,x19,[sp, #0x30]
00c2b708	ldp x22,x21,[sp, #0x20]
00c2b70c	ldp x24,x23,[sp, #0x10]
00c2b710	ldr x30,[sp], #0x40
00c2b714	autiasp
00c2b718	ret
00c2b71c	ldr x8,[x19, #0x8]
00c2b720	mov w9,#0x8
00c2b724	cmp x8,#0x8
00c2b728	csel x23,x8,x9,hi
00c2b72c	sub x8,x23,#0x1
00c2b730	tst x23,x8
00c2b734	b.ne 0x00c2b7ac
00c2b738	ldr x20,[x19]
00c2b73c	add x24,x23,#0x7
00c2b740	add x0,x24,x20
00c2b744	bl 0x00c308d0
00c2b748	cbz x0,0x00c2b7b0
00c2b74c	add x8,x0,x24
00c2b750	neg x9,x23
00c2b754	and x8,x8,x9
00c2b758	stur x0,[x8, #-0x8]
00c2b75c	ldr x1,[x19, #0x18]
00c2b760	cbz x1,0x00c2b778
00c2b764	mov x0,x8
00c2b768	mov x2,x20
00c2b76c	mov x19,x8
00c2b770	bl 0x00c2ffd0
00c2b774	b 0x00c2b788
00c2b778	mov x0,x8
00c2b77c	mov x2,x20
00c2b780	mov x19,x8
00c2b784	bl 0x00c301c0
00c2b788	mov x0,x19
00c2b78c	str x19,[x22, x21, LSL #0x3]
00c2b790	ldp x20,x19,[sp, #0x30]
00c2b794	ldp x22,x21,[sp, #0x20]
00c2b798	ldp x24,x23,[sp, #0x10]
00c2b79c	ldr x30,[sp], #0x40
00c2b7a0	autiasp
00c2b7a4	ret
00c2b7a8	bl 0x00c30b40
00c2b7ac	bl 0x00c30b40
00c2b7b0	bl 0x00c30b40
00c2b7b4	bl 0x00c30b40
