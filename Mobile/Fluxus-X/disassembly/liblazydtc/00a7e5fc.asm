; FUN_00a7e5fc @ 00a7e5fc
00a7e5fc	str x27,[sp, #-0x60]!
00a7e600	stp x26,x25,[sp, #0x10]
00a7e604	mov x25,x1
00a7e608	mov x26,x0
00a7e60c	mov w1,#0x2
00a7e610	mov x0,x3
00a7e614	stp x24,x23,[sp, #0x20]
00a7e618	stp x22,x21,[sp, #0x30]
00a7e61c	stp x20,x19,[sp, #0x40]
00a7e620	stp x29,x30,[sp, #0x50]
00a7e624	add x29,sp,#0x50
00a7e628	mov x19,x7
00a7e62c	mov x20,x6
00a7e630	mov x21,x5
00a7e634	mov x22,x4
00a7e638	mov x23,x3
00a7e63c	mov x24,x2
00a7e640	bl 0x00c37720
00a7e644	cbz w0,0x00a7e6dc
00a7e648	mov x0,x24
00a7e64c	mov x1,x23
00a7e650	mov x2,x21
00a7e654	mov x3,x22
00a7e658	mov x4,x26
00a7e65c	mov x5,x25
00a7e660	bl 0x00c38ae0
00a7e664	cbz w0,0x00a7e6dc
00a7e668	mov w27,#0x2
00a7e66c	bl 0x00c38de0
00a7e670	mov x1,x0
00a7e674	mov x0,x24
00a7e678	bl 0x00c38cc0
00a7e67c	cmp w0,#0x0
00a7e680	b.gt 0x00a7e6cc
00a7e684	mov w1,#0x1
00a7e688	mov x0,x23
00a7e68c	bl 0x00c376e0
00a7e690	cbz w0,0x00a7e6dc
00a7e694	mov x0,x23
00a7e698	mov x1,x20
00a7e69c	bl 0x00c38cc0
00a7e6a0	tbz w0,#0x1f,0x00a7e6d8
00a7e6a4	mov x0,x24
00a7e6a8	mov x1,x23
00a7e6ac	mov x2,x21
00a7e6b0	mov x3,x22
00a7e6b4	mov x4,x26
00a7e6b8	mov x5,x25
00a7e6bc	add w27,w27,#0x1
00a7e6c0	bl 0x00c38ae0
00a7e6c4	cbnz w0,0x00a7e66c
00a7e6c8	b 0x00a7e6dc
00a7e6cc	mov w0,#0x1
00a7e6d0	str w27,[x19]
00a7e6d4	b 0x00a7e6dc
00a7e6d8	mov w0,wzr
00a7e6dc	ldp x29,x30,[sp, #0x50]
00a7e6e0	ldp x20,x19,[sp, #0x40]
00a7e6e4	ldp x22,x21,[sp, #0x30]
00a7e6e8	ldp x24,x23,[sp, #0x20]
00a7e6ec	ldp x26,x25,[sp, #0x10]
00a7e6f0	ldr x27,[sp], #0x60
00a7e6f4	ret
