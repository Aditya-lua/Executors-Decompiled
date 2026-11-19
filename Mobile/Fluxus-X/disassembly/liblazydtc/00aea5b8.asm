; OSSL_STORE_INFO_get1_NAME @ 00aea5b8
00aea5b8	stp x29,x30,[sp, #-0x10]!
00aea5bc	ldr w8,[x0]
00aea5c0	mov x29,sp
00aea5c4	cmp w8,#0x1
00aea5c8	b.ne 0x00aea5ec
00aea5cc	ldr x0,[x0, #0x8]
00aea5d0	adrp x1,0x2c2000
00aea5d4	add x1,x1,#0x3bd
00aea5d8	mov w2,#0x28a
00aea5dc	bl 0x00c34600
00aea5e0	cbz x0,0x00aea614
00aea5e4	ldp x29,x30,[sp], #0x10
00aea5e8	ret
00aea5ec	bl 0x00c342a0
00aea5f0	adrp x0,0x2c2000
00aea5f4	adrp x2,0x2cc000
00aea5f8	add x0,x0,#0x3bd
00aea5fc	add x2,x2,#0xd1
00aea600	mov w1,#0x290
00aea604	bl 0x00c342b0
00aea608	mov w0,#0x2c
00aea60c	mov w1,#0x67
00aea610	b 0x00aea63c
00aea614	bl 0x00c342a0
00aea618	adrp x0,0x2c2000
00aea61c	adrp x2,0x2cc000
00aea620	add x0,x0,#0x3bd
00aea624	add x2,x2,#0xd1
00aea628	mov w1,#0x28d
00aea62c	bl 0x00c342b0
00aea630	mov w1,#0x100
00aea634	mov w0,#0x2c
00aea638	movk w1,#0xc, LSL #16
00aea63c	mov x2,xzr
00aea640	bl 0x00c342c0
00aea644	mov x0,xzr
00aea648	ldp x29,x30,[sp], #0x10
00aea64c	ret
