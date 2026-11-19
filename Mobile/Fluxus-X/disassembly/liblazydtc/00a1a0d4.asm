; DH_check_pub_key_ex @ 00a1a0d4
00a1a0d4	sub sp,sp,#0x20
00a1a0d8	stp x29,x30,[sp, #0x10]
00a1a0dc	add x29,sp,#0x10
00a1a0e0	sub x2,x29,#0x4
00a1a0e4	stur wzr,[x29, #-0x4]
00a1a0e8	bl 0x00a1a1b0
00a1a0ec	cbz w0,0x00a1a138
00a1a0f0	ldur w8,[x29, #-0x4]
00a1a0f4	tbnz w8,#0x0,0x00a1a144
00a1a0f8	tbnz w8,#0x1,0x00a1a178
00a1a0fc	tbz w8,#0x2,0x00a1a130
00a1a100	bl 0x00c342a0
00a1a104	adrp x0,0x2d9000
00a1a108	adrp x2,0x2b9000
00a1a10c	add x0,x0,#0xa63
00a1a110	add x2,x2,#0xbbc
00a1a114	mov w1,#0xf2
00a1a118	bl 0x00c342b0
00a1a11c	mov w0,#0x5
00a1a120	mov w1,#0x7a
00a1a124	mov x2,xzr
00a1a128	bl 0x00c342c0
00a1a12c	ldur w8,[x29, #-0x4]
00a1a130	cmp w8,#0x0
00a1a134	cset w0,eq
00a1a138	ldp x29,x30,[sp, #0x10]
00a1a13c	add sp,sp,#0x20
00a1a140	ret
00a1a144	bl 0x00c342a0
00a1a148	adrp x0,0x2d9000
00a1a14c	adrp x2,0x2b9000
00a1a150	add x0,x0,#0xa63
00a1a154	add x2,x2,#0xbbc
00a1a158	mov w1,#0xee
00a1a15c	bl 0x00c342b0
00a1a160	mov w0,#0x5
00a1a164	orr w1,wzr,#0x7c
00a1a168	mov x2,xzr
00a1a16c	bl 0x00c342c0
00a1a170	ldur w8,[x29, #-0x4]
00a1a174	tbz w8,#0x1,0x00a1a0fc
00a1a178	bl 0x00c342a0
00a1a17c	adrp x0,0x2d9000
00a1a180	adrp x2,0x2b9000
00a1a184	add x0,x0,#0xa63
00a1a188	add x2,x2,#0xbbc
00a1a18c	orr w1,wzr,#0xf0
00a1a190	bl 0x00c342b0
00a1a194	mov w0,#0x5
00a1a198	mov w1,#0x7b
00a1a19c	mov x2,xzr
00a1a1a0	bl 0x00c342c0
00a1a1a4	ldur w8,[x29, #-0x4]
00a1a1a8	tbnz w8,#0x2,0x00a1a100
00a1a1ac	b 0x00a1a130
