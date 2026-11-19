; BN_secure_new @ 00a01998
00a01998	stp x29,x30,[sp, #-0x10]!
00a0199c	adrp x1,0x2b5000
00a019a0	add x1,x1,#0xa6d
00a019a4	orr w0,wzr,#0x18
00a019a8	mov w2,#0xf7
00a019ac	mov x29,sp
00a019b0	bl 0x00c34250
00a019b4	cbz x0,0x00a019c8
00a019b8	mov w8,#0x9
00a019bc	str w8,[x0, #0x14]
00a019c0	ldp x29,x30,[sp], #0x10
00a019c4	ret
00a019c8	bl 0x00c342a0
00a019cc	adrp x0,0x2b5000
00a019d0	adrp x2,0x2d1000
00a019d4	add x0,x0,#0xa6d
00a019d8	add x2,x2,#0x72f
00a019dc	orr w1,wzr,#0xf8
00a019e0	bl 0x00c342b0
00a019e4	mov w1,#0x100
00a019e8	orr w0,wzr,#0x3
00a019ec	movk w1,#0xc, LSL #16
00a019f0	mov x2,xzr
00a019f4	bl 0x00c342c0
00a019f8	mov x0,xzr
00a019fc	ldp x29,x30,[sp], #0x10
00a01a00	ret
