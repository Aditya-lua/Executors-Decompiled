; X509_REQ_add1_attr_by_NID @ 00b0c3b4
00b0c3b4	str x19,[sp, #-0x20]!
00b0c3b8	stp x29,x30,[sp, #0x10]
00b0c3bc	add x29,sp,#0x10
00b0c3c0	cbz x0,0x00b0c3e0
00b0c3c4	mov x19,x0
00b0c3c8	add x0,x0,#0x30
00b0c3cc	bl 0x00c37f00
00b0c3d0	cbz x0,0x00b0c414
00b0c3d4	mov w0,#0x1
00b0c3d8	str w0,[x19, #0x10]
00b0c3dc	b 0x00b0c414
00b0c3e0	bl 0x00c342a0
00b0c3e4	adrp x0,0x2a4000
00b0c3e8	adrp x2,0x29e000
00b0c3ec	add x0,x0,#0xaf5
00b0c3f0	add x2,x2,#0xc55
00b0c3f4	mov w1,#0x106
00b0c3f8	bl 0x00c342b0
00b0c3fc	mov w1,#0x102
00b0c400	mov w0,#0xb
00b0c404	movk w1,#0xc, LSL #16
00b0c408	mov x2,xzr
00b0c40c	bl 0x00c342c0
00b0c410	mov w0,wzr
00b0c414	ldp x29,x30,[sp, #0x10]
00b0c418	ldr x19,[sp], #0x20
00b0c41c	ret
