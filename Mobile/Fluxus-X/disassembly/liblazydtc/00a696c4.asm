; EVP_CIPHER_do_all_sorted @ 00a696c4
00a696c4	sub sp,sp,#0x30
00a696c8	stp x20,x19,[sp, #0x10]
00a696cc	mov x19,x1
00a696d0	mov x20,x0
00a696d4	mov w0,#0x4
00a696d8	mov x1,xzr
00a696dc	stp x29,x30,[sp, #0x20]
00a696e0	add x29,sp,#0x20
00a696e4	bl 0x00c35500
00a696e8	adrp x1,0xa69000
00a696ec	add x1,x1,#0x690
00a696f0	mov w0,#0x2
00a696f4	mov x2,sp
00a696f8	stp x19,x20,[sp]
00a696fc	bl 0x00c3d840
00a69700	ldp x29,x30,[sp, #0x20]
00a69704	ldp x20,x19,[sp, #0x10]
00a69708	add sp,sp,#0x30
00a6970c	ret
