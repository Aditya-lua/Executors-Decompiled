; X509_REQ_add1_attr @ 00b0c4a4
00b0c4a4	str x19,[sp, #-0x20]!
00b0c4a8	stp x29,x30,[sp, #0x10]
00b0c4ac	add x29,sp,#0x10
00b0c4b0	cbz x0,0x00b0c4d0
00b0c4b4	mov x19,x0
00b0c4b8	add x0,x0,#0x30
00b0c4bc	bl 0x00c37ef0
00b0c4c0	cbz x0,0x00b0c504
00b0c4c4	mov w0,#0x1
00b0c4c8	str w0,[x19, #0x10]
00b0c4cc	b 0x00b0c504
00b0c4d0	bl 0x00c342a0
00b0c4d4	adrp x0,0x2a4000
00b0c4d8	adrp x2,0x2a4000
00b0c4dc	add x0,x0,#0xaf5
00b0c4e0	add x2,x2,#0xb0c
00b0c4e4	mov w1,#0xe9
00b0c4e8	bl 0x00c342b0
00b0c4ec	mov w1,#0x102
00b0c4f0	mov w0,#0xb
00b0c4f4	movk w1,#0xc, LSL #16
00b0c4f8	mov x2,xzr
00b0c4fc	bl 0x00c342c0
00b0c500	mov w0,wzr
00b0c504	ldp x29,x30,[sp, #0x10]
00b0c508	ldr x19,[sp], #0x20
00b0c50c	ret
