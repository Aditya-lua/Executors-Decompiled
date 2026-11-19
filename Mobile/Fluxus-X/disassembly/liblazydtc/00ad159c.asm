; RSA_free @ 00ad159c
00ad159c	str x19,[sp, #-0x20]!
00ad15a0	stp x29,x30,[sp, #0x10]
00ad15a4	add x29,sp,#0x10
00ad15a8	cbz x0,0x00ad15d8
00ad15ac	mov x19,x0
00ad15b0	add x9,x0,#0xa0
00ad15b4	ldxr w8,[x9]
00ad15b8	subs w10,w8,#0x1
00ad15bc	stxr w11,w10,[x9]
00ad15c0	cbnz w11,0x00ad15b4
00ad15c4	b.ne 0x00ad15d0
00ad15c8	dmb ISHLD
00ad15cc	b 0x00ad15e4
00ad15d0	cmp w8,#0x1
00ad15d4	b.le 0x00ad15e4
00ad15d8	ldp x29,x30,[sp, #0x10]
00ad15dc	ldr x19,[sp], #0x20
00ad15e0	ret
00ad15e4	ldr x8,[x19, #0x18]
00ad15e8	cbz x8,0x00ad15fc
00ad15ec	ldr x8,[x8, #0x40]
00ad15f0	cbz x8,0x00ad15fc
00ad15f4	mov x0,x19
00ad15f8	blr x8
00ad15fc	ldr x0,[x19, #0x20]
00ad1600	bl 0x00c32360
00ad1604	add x2,x19,#0x90
00ad1608	mov w0,#0x9
00ad160c	mov x1,x19
00ad1610	bl 0x00c356c0
00ad1614	ldr x0,[x19, #0xd0]
00ad1618	bl 0x00c34d40
00ad161c	ldr x0,[x19, #0x28]
00ad1620	bl 0x00c36290
00ad1624	ldr x0,[x19, #0x30]
00ad1628	bl 0x00c36290
00ad162c	ldr x0,[x19, #0x38]
00ad1630	bl 0x00c322e0
00ad1634	ldr x0,[x19, #0x40]
00ad1638	bl 0x00c322e0
00ad163c	ldr x0,[x19, #0x48]
00ad1640	bl 0x00c322e0
00ad1644	ldr x0,[x19, #0x50]
00ad1648	bl 0x00c322e0
00ad164c	ldr x0,[x19, #0x58]
00ad1650	bl 0x00c322e0
00ad1654	ldr x0,[x19, #0x60]
00ad1658	bl 0x00c322e0
00ad165c	ldr x0,[x19, #0x80]
00ad1660	bl 0x00c3fa40
00ad1664	adrp x1,0xcb5000
00ad1668	ldr x0,[x19, #0x88]
00ad166c	ldr x1,[x1, #0x7a0]
00ad1670	bl 0x00c32600
00ad1674	ldr x0,[x19, #0xc0]
00ad1678	bl 0x00c38970
00ad167c	ldr x0,[x19, #0xc8]
00ad1680	bl 0x00c38970
00ad1684	ldp x29,x30,[sp, #0x10]
00ad1688	adrp x1,0x2b0000
00ad168c	add x1,x1,#0x862
00ad1690	mov w2,#0xb1
00ad1694	mov x0,x19
00ad1698	ldr x19,[sp], #0x20
00ad169c	b 0x00c32310
