; FUN_00bb165c @ 00bb165c
00bb165c	sub sp,sp,#0x90
00bb1660	stp x29,x30,[sp, #0x50]
00bb1664	stp x24,x23,[sp, #0x60]
00bb1668	stp x22,x21,[sp, #0x70]
00bb166c	stp x20,x19,[sp, #0x80]
00bb1670	add x29,sp,#0x50
00bb1674	mrs x20,tpidr_el0
00bb1678	adrp x9,0xcb5000
00bb167c	ldr x8,[x20, #0x28]
00bb1680	ldr x9,[x9, #0xac8]
00bb1684	stur x8,[x29, #-0x8]
00bb1688	cbz x9,0x00bb1708
00bb168c	mov w21,#0x76e0
00bb1690	mov x19,x0
00bb1694	movk w21,#0x1, LSL #16
00bb1698	ldr x0,[x0, x21#0x0]
00bb169c	cbz x0,0x00bb1708
00bb16a0	movi v0.2D,#0x0
00bb16a4	ldr x8,[x19, #0x75f0]
00bb16a8	mov w9,#0x2968
00bb16ac	stp w9,w3,[sp, #0x8]
00bb16b0	stp q0,q0,[sp, #0x20]
00bb16b4	stur q0,[sp, #0x10]
00bb16b8	cbz x8,0x00bb16f8
00bb16bc	mov x0,x8
00bb16c0	mov w24,#0x75fc
00bb16c4	mov x22,x2
00bb16c8	mov x23,x1
00bb16cc	bl 0x00c435d0
00bb16d0	ldr x8,[x19, #0x75f0]
00bb16d4	str w0,[sp, #0x10]
00bb16d8	mov x0,x8
00bb16dc	bl 0x00c43580
00bb16e0	ldr w8,[x19, x24#0x0]
00bb16e4	str x0,[sp, #0x18]
00bb16e8	mov x1,x23
00bb16ec	ldr x0,[x19, x21#0x0]
00bb16f0	mov x2,x22
00bb16f4	str w8,[sp, #0x14]
00bb16f8	stp x1,x2,[sp, #0x20]
00bb16fc	add x1,sp,#0x8
00bb1700	str x19,[sp, #0x40]
00bb1704	bl 0x00c43680
00bb1708	ldr x8,[x20, #0x28]
00bb170c	ldur x9,[x29, #-0x8]
00bb1710	cmp x8,x9
00bb1714	b.ne 0x00bb1730
00bb1718	ldp x20,x19,[sp, #0x80]
00bb171c	ldp x22,x21,[sp, #0x70]
00bb1720	ldp x24,x23,[sp, #0x60]
00bb1724	ldp x29,x30,[sp, #0x50]
00bb1728	add sp,sp,#0x90
00bb172c	ret
00bb1730	bl 0x00c2fec0
