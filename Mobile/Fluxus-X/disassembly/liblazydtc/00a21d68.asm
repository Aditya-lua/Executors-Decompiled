; DSA_SIG_new @ 00a21d68
00a21d68	str x19,[sp, #-0x20]!
00a21d6c	adrp x1,0x2a3000
00a21d70	add x1,x1,#0xecc
00a21d74	mov w0,#0x10
00a21d78	mov w2,#0x24
00a21d7c	stp x29,x30,[sp, #0x10]
00a21d80	add x29,sp,#0x10
00a21d84	bl 0x00c34250
00a21d88	mov x19,x0
00a21d8c	cbnz x0,0x00a21dc0
00a21d90	bl 0x00c342a0
00a21d94	adrp x0,0x2a3000
00a21d98	adrp x2,0x2b7000
00a21d9c	add x0,x0,#0xecc
00a21da0	add x2,x2,#0x9c0
00a21da4	mov w1,#0x26
00a21da8	bl 0x00c342b0
00a21dac	mov w1,#0x100
00a21db0	mov w0,#0xa
00a21db4	movk w1,#0xc, LSL #16
00a21db8	mov x2,xzr
00a21dbc	bl 0x00c342c0
00a21dc0	ldp x29,x30,[sp, #0x10]
00a21dc4	mov x0,x19
00a21dc8	ldr x19,[sp], #0x20
00a21dcc	ret
