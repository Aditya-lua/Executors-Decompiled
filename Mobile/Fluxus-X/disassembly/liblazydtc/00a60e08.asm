; OSSL_ENCODER_get0_properties @ 00a60e08
00a60e08	cbz x0,0x00a60e18
00a60e0c	ldr x8,[x0, #0x18]
00a60e10	ldr x0,[x8, #0x8]
00a60e14	ret
00a60e18	stp x29,x30,[sp, #-0x10]!
00a60e1c	mov x29,sp
00a60e20	bl 0x00c342a0
00a60e24	adrp x0,0x2d3000
00a60e28	adrp x2,0x2a2000
00a60e2c	add x0,x0,#0xb3c
00a60e30	add x2,x2,#0x3ce
00a60e34	mov w1,#0x209
00a60e38	bl 0x00c342b0
00a60e3c	mov w1,#0x102
00a60e40	mov w0,#0x3b
00a60e44	movk w1,#0xc, LSL #16
00a60e48	mov x2,xzr
00a60e4c	bl 0x00c342c0
00a60e50	mov x0,xzr
00a60e54	ldp x29,x30,[sp], #0x10
00a60e58	ret
