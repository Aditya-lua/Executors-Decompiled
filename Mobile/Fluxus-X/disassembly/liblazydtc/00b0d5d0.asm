; X509_EXTENSION_create_by_NID @ 00b0d5d0
00b0d5d0	stp x22,x21,[sp, #-0x30]!
00b0d5d4	mov x22,x0
00b0d5d8	mov w0,w1
00b0d5dc	stp x20,x19,[sp, #0x10]
00b0d5e0	stp x29,x30,[sp, #0x20]
00b0d5e4	add x29,sp,#0x20
00b0d5e8	mov x20,x3
00b0d5ec	mov w21,w2
00b0d5f0	bl 0x00c37740
00b0d5f4	cbz x0,0x00b0d620
00b0d5f8	mov x19,x0
00b0d5fc	mov x0,x22
00b0d600	mov x1,x19
00b0d604	mov w2,w21
00b0d608	mov x3,x20
00b0d60c	bl 0x00b0d660
00b0d610	cbnz x0,0x00b0d650
00b0d614	mov x0,x19
00b0d618	bl 0x00c37660
00b0d61c	b 0x00b0d64c
00b0d620	bl 0x00c342a0
00b0d624	adrp x0,0x2a2000
00b0d628	adrp x2,0x2aa000
00b0d62c	add x0,x0,#0xeaa
00b0d630	add x2,x2,#0xc24
00b0d634	mov w1,#0x94
00b0d638	bl 0x00c342b0
00b0d63c	mov w0,#0xb
00b0d640	mov w1,#0x6d
00b0d644	mov x2,xzr
00b0d648	bl 0x00c342c0
00b0d64c	mov x0,xzr
00b0d650	ldp x29,x30,[sp, #0x20]
00b0d654	ldp x20,x19,[sp, #0x10]
00b0d658	ldp x22,x21,[sp], #0x30
00b0d65c	ret
