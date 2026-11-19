; DSO_get_filename @ 00a22a88
00a22a88	cbz x0,0x00a22a94
00a22a8c	ldr x0,[x0, #0x38]
00a22a90	ret
00a22a94	stp x29,x30,[sp, #-0x10]!
00a22a98	mov x29,sp
00a22a9c	bl 0x00c342a0
00a22aa0	adrp x0,0x2a7000
00a22aa4	adrp x2,0x2a3000
00a22aa8	add x0,x0,#0xdd6
00a22aac	add x2,x2,#0xee2
00a22ab0	orr w1,wzr,#0xe0
00a22ab4	bl 0x00c342b0
00a22ab8	mov w1,#0x102
00a22abc	mov w0,#0x25
00a22ac0	movk w1,#0xc, LSL #16
00a22ac4	mov x2,xzr
00a22ac8	bl 0x00c342c0
00a22acc	mov x0,xzr
00a22ad0	ldp x29,x30,[sp], #0x10
00a22ad4	ret
