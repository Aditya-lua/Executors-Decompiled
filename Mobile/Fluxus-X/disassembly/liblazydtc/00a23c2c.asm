; FUN_00a23c2c @ 00a23c2c
00a23c2c	stp x29,x30,[sp, #-0x10]!
00a23c30	mov x29,sp
00a23c34	bl 0x00c342a0
00a23c38	adrp x0,0x2cb000
00a23c3c	adrp x2,0x2b7000
00a23c40	add x0,x0,#0x7a0
00a23c44	add x2,x2,#0x9cc
00a23c48	mov w1,#0x1ca
00a23c4c	bl 0x00c342b0
00a23c50	mov w0,#0x10
00a23c54	orr w1,wzr,#0x7c
00a23c58	mov x2,xzr
00a23c5c	bl 0x00c342c0
00a23c60	mov w0,wzr
00a23c64	ldp x29,x30,[sp], #0x10
00a23c68	ret
