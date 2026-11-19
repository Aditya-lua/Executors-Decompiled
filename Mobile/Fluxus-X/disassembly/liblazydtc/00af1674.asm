; FUN_00af1674 @ 00af1674
00af1674	stp x20,x19,[sp, #-0x20]!
00af1678	adrp x1,0x2ae000
00af167c	mov x20,x0
00af1680	add x1,x1,#0x704
00af1684	orr w0,wzr,#0x18
00af1688	mov w2,#0x6e
00af168c	stp x29,x30,[sp, #0x10]
00af1690	add x29,sp,#0x10
00af1694	bl 0x00c32320
00af1698	cbz x0,0x00af16c8
00af169c	mov x19,x0
00af16a0	bl 0x00c37020
00af16a4	str x0,[x19]
00af16a8	cbz x0,0x00af16fc
00af16ac	str xzr,[x19, #0x8]
00af16b0	bl 0x00c34d50
00af16b4	str x0,[x19, #0x10]
00af16b8	cbz x0,0x00af1718
00af16bc	mov w0,#0x1
00af16c0	str x19,[x20, #0x10]
00af16c4	b 0x00af1768
00af16c8	bl 0x00c342a0
00af16cc	adrp x0,0x2ae000
00af16d0	adrp x2,0x2d6000
00af16d4	add x0,x0,#0x704
00af16d8	add x2,x2,#0x601
00af16dc	mov w1,#0x71
00af16e0	bl 0x00c342b0
00af16e4	mov w1,#0x100
00af16e8	mov w0,#0xb
00af16ec	movk w1,#0xc, LSL #16
00af16f0	mov x2,xzr
00af16f4	bl 0x00c342c0
00af16f8	b 0x00af1764
00af16fc	bl 0x00c342a0
00af1700	adrp x0,0x2ae000
00af1704	adrp x2,0x2d6000
00af1708	add x0,x0,#0x704
00af170c	add x2,x2,#0x601
00af1710	mov w1,#0x76
00af1714	b 0x00af1738
00af1718	ldr x0,[x19]
00af171c	bl 0x00c35660
00af1720	bl 0x00c342a0
00af1724	adrp x0,0x2ae000
00af1728	adrp x2,0x2d6000
00af172c	add x0,x0,#0x704
00af1730	add x2,x2,#0x601
00af1734	mov w1,#0x7d
00af1738	bl 0x00c342b0
00af173c	mov w1,#0x100
00af1740	mov w0,#0xb
00af1744	movk w1,#0xc, LSL #16
00af1748	mov x2,xzr
00af174c	bl 0x00c342c0
00af1750	adrp x1,0x2ae000
00af1754	add x1,x1,#0x704
00af1758	mov w2,#0x84
00af175c	mov x0,x19
00af1760	bl 0x00c32310
00af1764	mov w0,wzr
00af1768	ldp x29,x30,[sp, #0x10]
00af176c	ldp x20,x19,[sp], #0x20
00af1770	ret
