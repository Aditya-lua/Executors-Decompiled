; OSSL_ENCODER_get0_provider @ 00a60db8
00a60db8	cbz x0,0x00a60dc4
00a60dbc	ldr x0,[x0]
00a60dc0	ret
00a60dc4	stp x29,x30,[sp, #-0x10]!
00a60dc8	mov x29,sp
00a60dcc	bl 0x00c342a0
00a60dd0	adrp x0,0x2d3000
00a60dd4	adrp x2,0x2ac000
00a60dd8	add x0,x0,#0xb3c
00a60ddc	add x2,x2,#0x133
00a60de0	orr w1,wzr,#0x1ff
00a60de4	bl 0x00c342b0
00a60de8	mov w1,#0x102
00a60dec	mov w0,#0x3b
00a60df0	movk w1,#0xc, LSL #16
00a60df4	mov x2,xzr
00a60df8	bl 0x00c342c0
00a60dfc	mov x0,xzr
00a60e00	ldp x29,x30,[sp], #0x10
00a60e04	ret
