; PKCS8_set0_pbe_ex @ 00abc5cc
00abc5cc	stp x24,x23,[sp, #-0x40]!
00abc5d0	stp x22,x21,[sp, #0x10]
00abc5d4	stp x20,x19,[sp, #0x20]
00abc5d8	stp x29,x30,[sp, #0x30]
00abc5dc	add x29,sp,#0x30
00abc5e0	mov x19,x5
00abc5e4	mov x21,x4
00abc5e8	mov x20,x3
00abc5ec	mov x22,x2
00abc5f0	mov w23,w1
00abc5f4	mov x24,x0
00abc5f8	bl 0x00c37e80
00abc5fc	mov x1,x0
00abc600	mov w5,#0x1
00abc604	mov x0,x20
00abc608	mov x2,x24
00abc60c	mov w3,w23
00abc610	mov x4,x22
00abc614	mov x6,x21
00abc618	mov x7,x19
00abc61c	bl 0x00c3f490
00abc620	cbz x0,0x00abc648
00abc624	adrp x1,0x2ba000
00abc628	mov x19,x0
00abc62c	add x1,x1,#0x672
00abc630	mov w0,#0x10
00abc634	mov w2,#0x54
00abc638	bl 0x00c34250
00abc63c	cbz x0,0x00abc678
00abc640	stp x20,x19,[x0]
00abc644	b 0x00abc6b4
00abc648	bl 0x00c342a0
00abc64c	adrp x0,0x2ba000
00abc650	adrp x2,0x2b0000
00abc654	add x0,x0,#0x672
00abc658	add x2,x2,#0x772
00abc65c	mov w1,#0x50
00abc660	bl 0x00c342b0
00abc664	mov w0,#0x23
00abc668	mov w1,#0x67
00abc66c	mov x2,xzr
00abc670	bl 0x00c342c0
00abc674	b 0x00abc6b0
00abc678	bl 0x00c342a0
00abc67c	adrp x0,0x2ba000
00abc680	adrp x2,0x2b0000
00abc684	add x0,x0,#0x672
00abc688	add x2,x2,#0x772
00abc68c	mov w1,#0x57
00abc690	bl 0x00c342b0
00abc694	mov w1,#0x100
00abc698	mov w0,#0x23
00abc69c	movk w1,#0xc, LSL #16
00abc6a0	mov x2,xzr
00abc6a4	bl 0x00c342c0
00abc6a8	mov x0,x19
00abc6ac	bl 0x00c35530
00abc6b0	mov x0,xzr
00abc6b4	ldp x29,x30,[sp, #0x30]
00abc6b8	ldp x20,x19,[sp, #0x20]
00abc6bc	ldp x22,x21,[sp, #0x10]
00abc6c0	ldp x24,x23,[sp], #0x40
00abc6c4	ret
