; OSSL_HTTP_REQ_CTX_get0_mem_bio @ 00b17248
00b17248	cbz x0,0x00b17254
00b1724c	ldr x0,[x0, #0x58]
00b17250	ret
00b17254	stp x29,x30,[sp, #-0x10]!
00b17258	mov x29,sp
00b1725c	bl 0x00c342a0
00b17260	adrp x0,0x2d6000
00b17264	adrp x2,0x2bc000
00b17268	add x0,x0,#0x829
00b1726c	add x2,x2,#0x731
00b17270	mov w1,#0x8c
00b17274	bl 0x00c342b0
00b17278	mov w1,#0x102
00b1727c	mov w0,#0x3d
00b17280	movk w1,#0xc, LSL #16
00b17284	mov x2,xzr
00b17288	bl 0x00c342c0
00b1728c	mov x0,xzr
00b17290	ldp x29,x30,[sp], #0x10
00b17294	ret
