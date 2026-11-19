; X509_OBJECT_retrieve_match @ 00b0b5d8
00b0b5d8	str x23,[sp, #-0x40]!
00b0b5dc	stp x22,x21,[sp, #0x10]
00b0b5e0	stp x20,x19,[sp, #0x20]
00b0b5e4	stp x29,x30,[sp, #0x30]
00b0b5e8	add x29,sp,#0x30
00b0b5ec	mov x20,x1
00b0b5f0	mov x19,x0
00b0b5f4	bl 0x00c34760
00b0b5f8	tbnz w0,#0x1f,0x00b0b6c0
00b0b5fc	ldr w8,[x20]
00b0b600	mov w21,w0
00b0b604	sub w8,w8,#0x1
00b0b608	cmp w8,#0x2
00b0b60c	b.cs 0x00b0b6c8
00b0b610	mov x0,x19
00b0b614	bl 0x00c325e0
00b0b618	cmp w21,w0
00b0b61c	mov x22,xzr
00b0b620	b.ge 0x00b0b6d8
00b0b624	mov w23,w0
00b0b628	mov x0,x19
00b0b62c	mov w1,w21
00b0b630	bl 0x00c32610
00b0b634	ldr w8,[x0]
00b0b638	ldr w9,[x20]
00b0b63c	cmp w8,w9
00b0b640	b.ne 0x00b0b6c0
00b0b644	mov x22,x0
00b0b648	cmp w8,#0x2
00b0b64c	b.eq 0x00b0b66c
00b0b650	cmp w8,#0x1
00b0b654	b.ne 0x00b0b680
00b0b658	ldr x0,[x22, #0x8]
00b0b65c	ldr x1,[x20, #0x8]
00b0b660	bl 0x00c40bd0
00b0b664	cbz w0,0x00b0b67c
00b0b668	b 0x00b0b6c0
00b0b66c	ldr x0,[x22, #0x8]
00b0b670	ldr x1,[x20, #0x8]
00b0b674	bl 0x00c40b90
00b0b678	cbnz w0,0x00b0b6c0
00b0b67c	ldr w8,[x20]
00b0b680	cmp w8,#0x2
00b0b684	b.eq 0x00b0b6a4
00b0b688	cmp w8,#0x1
00b0b68c	b.ne 0x00b0b6d8
00b0b690	ldr x0,[x22, #0x8]
00b0b694	ldr x1,[x20, #0x8]
00b0b698	bl 0x00c35080
00b0b69c	cbnz w0,0x00b0b6b4
00b0b6a0	b 0x00b0b6d8
00b0b6a4	ldr x0,[x22, #0x8]
00b0b6a8	ldr x1,[x20, #0x8]
00b0b6ac	bl 0x00c40ba0
00b0b6b0	cbz w0,0x00b0b6d8
00b0b6b4	add w21,w21,#0x1
00b0b6b8	cmp w21,w23
00b0b6bc	b.lt 0x00b0b628
00b0b6c0	mov x22,xzr
00b0b6c4	b 0x00b0b6d8
00b0b6c8	mov x0,x19
00b0b6cc	mov w1,w21
00b0b6d0	bl 0x00c32610
00b0b6d4	mov x22,x0
00b0b6d8	mov x0,x22
00b0b6dc	ldp x29,x30,[sp, #0x30]
00b0b6e0	ldp x20,x19,[sp, #0x20]
00b0b6e4	ldp x22,x21,[sp, #0x10]
00b0b6e8	ldr x23,[sp], #0x40
00b0b6ec	ret
