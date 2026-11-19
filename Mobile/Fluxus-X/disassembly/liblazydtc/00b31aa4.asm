; FUN_00b31aa4 @ 00b31aa4
00b31aa4	stp x29,x30,[sp, #-0x10]!
00b31aa8	mov x29,sp
00b31aac	bl 0x00c41000
00b31ab0	cbz w0,0x00b31acc
00b31ab4	adrp x1,0x2be000
00b31ab8	add x1,x1,#0x900
00b31abc	mov w0,#0x1
00b31ac0	mov w2,#0x34
00b31ac4	ldp x29,x30,[sp], #0x10
00b31ac8	b 0x00c34250
00b31acc	mov x0,xzr
00b31ad0	ldp x29,x30,[sp], #0x10
00b31ad4	ret
