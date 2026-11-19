; NCONF_get_section @ 00a0d0ac
00a0d0ac	stp x29,x30,[sp, #-0x10]!
00a0d0b0	mov x29,sp
00a0d0b4	cbz x0,0x00a0d0c4
00a0d0b8	cbz x1,0x00a0d0ec
00a0d0bc	ldp x29,x30,[sp], #0x10
00a0d0c0	b 0x00c393e0
00a0d0c4	bl 0x00c342a0
00a0d0c8	adrp x0,0x2af000
00a0d0cc	adrp x2,0x2d3000
00a0d0d0	add x0,x0,#0xd73
00a0d0d4	add x2,x2,#0x931
00a0d0d8	mov w1,#0x120
00a0d0dc	bl 0x00c342b0
00a0d0e0	orr w0,wzr,#0xe
00a0d0e4	mov w1,#0x69
00a0d0e8	b 0x00a0d110
00a0d0ec	bl 0x00c342a0
00a0d0f0	adrp x0,0x2af000
00a0d0f4	adrp x2,0x2d3000
00a0d0f8	add x0,x0,#0xd73
00a0d0fc	add x2,x2,#0x931
00a0d100	mov w1,#0x125
00a0d104	bl 0x00c342b0
00a0d108	orr w0,wzr,#0xe
00a0d10c	mov w1,#0x6b
00a0d110	mov x2,xzr
00a0d114	bl 0x00c342c0
00a0d118	mov x0,xzr
00a0d11c	ldp x29,x30,[sp], #0x10
00a0d120	ret
