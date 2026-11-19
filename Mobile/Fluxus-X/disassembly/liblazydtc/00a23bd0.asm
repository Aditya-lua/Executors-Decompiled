; FUN_00a23bd0 @ 00a23bd0
00a23bd0	stp x29,x30,[sp, #-0x10]!
00a23bd4	mov x29,sp
00a23bd8	bl 0x00c342a0
00a23bdc	adrp x0,0x2cb000
00a23be0	adrp x2,0x2ab000
00a23be4	add x0,x0,#0x7a0
00a23be8	add x2,x2,#0xf00
00a23bec	mov w1,#0x1ad
00a23bf0	bl 0x00c342b0
00a23bf4	mov w0,#0x10
00a23bf8	mov w1,#0x7d
00a23bfc	mov x2,xzr
00a23c00	bl 0x00c342c0
00a23c04	mov w0,wzr
00a23c08	ldp x29,x30,[sp], #0x10
00a23c0c	ret
