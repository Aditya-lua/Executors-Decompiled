; BN_mod_exp @ 00a1b5ac
00a1b5ac	str x23,[sp, #-0x40]!
00a1b5b0	stp x22,x21,[sp, #0x10]
00a1b5b4	mov x22,x0
00a1b5b8	mov x0,x3
00a1b5bc	stp x20,x19,[sp, #0x20]
00a1b5c0	stp x29,x30,[sp, #0x30]
00a1b5c4	add x29,sp,#0x30
00a1b5c8	mov x19,x4
00a1b5cc	mov x20,x3
00a1b5d0	mov x21,x2
00a1b5d4	mov x23,x1
00a1b5d8	bl 0x00c38d10
00a1b5dc	cbz w0,0x00a1b650
00a1b5e0	ldr w8,[x23, #0x8]
00a1b5e4	cmp w8,#0x1
00a1b5e8	b.ne 0x00a1b624
00a1b5ec	ldr w8,[x23, #0x10]
00a1b5f0	cbnz w8,0x00a1b624
00a1b5f4	mov w1,#0x4
00a1b5f8	mov x0,x21
00a1b5fc	bl 0x00c38ce0
00a1b600	cbnz w0,0x00a1b624
00a1b604	mov w1,#0x4
00a1b608	mov x0,x23
00a1b60c	bl 0x00c38ce0
00a1b610	cbnz w0,0x00a1b624
00a1b614	mov w1,#0x4
00a1b618	mov x0,x20
00a1b61c	bl 0x00c38ce0
00a1b620	cbz w0,0x00a1b678
00a1b624	mov x0,x22
00a1b628	mov x2,x21
00a1b62c	mov x3,x20
00a1b630	mov x4,x19
00a1b634	ldp x29,x30,[sp, #0x30]
00a1b638	ldp x20,x19,[sp, #0x20]
00a1b63c	ldp x22,x21,[sp, #0x10]
00a1b640	mov x1,x23
00a1b644	mov x5,xzr
00a1b648	ldr x23,[sp], #0x40
00a1b64c	b 0x00a1baec
00a1b650	mov x0,x22
00a1b654	mov x2,x21
00a1b658	mov x3,x20
00a1b65c	mov x4,x19
00a1b660	ldp x29,x30,[sp, #0x30]
00a1b664	ldp x20,x19,[sp, #0x20]
00a1b668	ldp x22,x21,[sp, #0x10]
00a1b66c	mov x1,x23
00a1b670	ldr x23,[sp], #0x40
00a1b674	b 0x00a1c030
00a1b678	ldr x8,[x23]
00a1b67c	mov x0,x22
00a1b680	mov x2,x21
00a1b684	mov x3,x20
00a1b688	ldr x1,[x8]
00a1b68c	mov x4,x19
00a1b690	ldp x29,x30,[sp, #0x30]
00a1b694	ldp x20,x19,[sp, #0x20]
00a1b698	ldp x22,x21,[sp, #0x10]
00a1b69c	mov x5,xzr
00a1b6a0	ldr x23,[sp], #0x40
00a1b6a4	b 0x00a1b6a8
