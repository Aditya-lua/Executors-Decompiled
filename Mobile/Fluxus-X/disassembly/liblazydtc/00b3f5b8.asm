; FUN_00b3f5b8 @ 00b3f5b8
00b3f5b8	sub sp,sp,#0x50
00b3f5bc	stp x24,x23,[sp, #0x10]
00b3f5c0	stp x22,x21,[sp, #0x20]
00b3f5c4	stp x20,x19,[sp, #0x30]
00b3f5c8	stp x29,x30,[sp, #0x40]
00b3f5cc	add x29,sp,#0x40
00b3f5d0	mov x23,x4
00b3f5d4	mov w21,w3
00b3f5d8	mov x20,x2
00b3f5dc	mov w22,w1
00b3f5e0	mov x24,x0
00b3f5e4	str xzr,[sp, #0x8]
00b3f5e8	bl 0x00c37e90
00b3f5ec	mov x19,x0
00b3f5f0	cbz x0,0x00b3f638
00b3f5f4	add x1,sp,#0x8
00b3f5f8	mov x0,x24
00b3f5fc	blr x23
00b3f600	cmp w0,#0x1
00b3f604	b.lt 0x00b3f638
00b3f608	mov w23,w0
00b3f60c	mov w0,w22
00b3f610	bl 0x00c37740
00b3f614	ldr x5,[sp, #0x8]
00b3f618	mov x1,x0
00b3f61c	mov x0,x19
00b3f620	mov w2,wzr
00b3f624	mov w3,w21
00b3f628	mov x4,x20
00b3f62c	mov w6,w23
00b3f630	bl 0x00c37ed0
00b3f634	cbnz w0,0x00b3f688
00b3f638	bl 0x00c342a0
00b3f63c	adrp x20,0x2c2000
00b3f640	add x20,x20,#0x9ea
00b3f644	adrp x2,0x2c2000
00b3f648	add x2,x2,#0xa23
00b3f64c	mov w1,#0x5e
00b3f650	mov x0,x20
00b3f654	bl 0x00c342b0
00b3f658	mov w1,#0x100
00b3f65c	mov w0,#0x39
00b3f660	movk w1,#0xc, LSL #16
00b3f664	mov x2,xzr
00b3f668	bl 0x00c342c0
00b3f66c	mov x0,x19
00b3f670	bl 0x00c37d00
00b3f674	ldr x0,[sp, #0x8]
00b3f678	orr w2,wzr,#0x60
00b3f67c	mov x1,x20
00b3f680	bl 0x00c32310
00b3f684	mov x19,xzr
00b3f688	mov x0,x19
00b3f68c	ldp x29,x30,[sp, #0x40]
00b3f690	ldp x20,x19,[sp, #0x30]
00b3f694	ldp x22,x21,[sp, #0x20]
00b3f698	ldp x24,x23,[sp, #0x10]
00b3f69c	add sp,sp,#0x50
00b3f6a0	ret
