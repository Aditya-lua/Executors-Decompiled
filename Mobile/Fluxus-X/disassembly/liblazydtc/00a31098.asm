; EC_GROUP_get_curve_GFp @ 00a31098
00a31098	ldr x8,[x0]
00a3109c	ldr x5,[x8, #0x30]
00a310a0	cbz x5,0x00a310a8
00a310a4	br x5
00a310a8	stp x29,x30,[sp, #-0x10]!
00a310ac	mov x29,sp
00a310b0	bl 0x00c342a0
00a310b4	adrp x0,0x29e000
00a310b8	adrp x2,0x2c9000
00a310bc	add x0,x0,#0xa7
00a310c0	add x2,x2,#0x749
00a310c4	mov w1,#0x239
00a310c8	bl 0x00c342b0
00a310cc	mov w1,#0x101
00a310d0	mov w0,#0x10
00a310d4	movk w1,#0xc, LSL #16
00a310d8	mov x2,xzr
00a310dc	bl 0x00c342c0
00a310e0	mov w0,wzr
00a310e4	ldp x29,x30,[sp], #0x10
00a310e8	ret
