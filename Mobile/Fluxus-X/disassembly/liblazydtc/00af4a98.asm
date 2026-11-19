; X509V3_set_ctx @ 00af4a98
00af4a98	cbz x0,0x00af4ab4
00af4a9c	str w5,[x0]
00af4aa0	stp x1,x2,[x0, #0x8]
00af4aa4	stp x3,x4,[x0, #0x18]
00af4aa8	stp xzr,xzr,[x0, #0x30]
00af4aac	str xzr,[x0, #0x28]
00af4ab0	ret
00af4ab4	stp x29,x30,[sp, #-0x10]!
00af4ab8	mov x29,sp
00af4abc	bl 0x00c342a0
00af4ac0	adrp x0,0x2aa000
00af4ac4	adrp x2,0x2c8000
00af4ac8	add x0,x0,#0x9f7
00af4acc	add x2,x2,#0x359
00af4ad0	mov w1,#0x1c2
00af4ad4	bl 0x00c342b0
00af4ad8	mov w1,#0x102
00af4adc	mov w0,#0x22
00af4ae0	movk w1,#0xc, LSL #16
00af4ae4	mov x2,xzr
00af4ae8	ldp x29,x30,[sp], #0x10
00af4aec	b 0x00c342c0
