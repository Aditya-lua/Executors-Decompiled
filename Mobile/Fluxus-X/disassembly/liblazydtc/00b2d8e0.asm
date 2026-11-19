; FUN_00b2d8e0 @ 00b2d8e0
00b2d8e0	stp x29,x30,[sp, #-0x10]!
00b2d8e4	mov x29,sp
00b2d8e8	bl 0x00c41000
00b2d8ec	cbz w0,0x00b2d908
00b2d8f0	adrp x1,0x2d2000
00b2d8f4	add x1,x1,#0x6f1
00b2d8f8	mov w0,#0x80
00b2d8fc	mov w2,#0x23
00b2d900	ldp x29,x30,[sp], #0x10
00b2d904	b 0x00c34250
00b2d908	mov x0,xzr
00b2d90c	ldp x29,x30,[sp], #0x10
00b2d910	ret
