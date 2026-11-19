; ossl_err_load_OBJ_strings @ 00aaf1fc
00aaf1fc	stp x29,x30,[sp, #-0x10]!
00aaf200	mov w0,#0x66
00aaf204	movk w0,#0x400, LSL #16
00aaf208	mov x29,sp
00aaf20c	bl 0x00c35520
00aaf210	cbnz x0,0x00aaf220
00aaf214	adrp x0,0xc79000
00aaf218	add x0,x0,#0xd58
00aaf21c	bl 0x00c35510
00aaf220	mov w0,#0x1
00aaf224	ldp x29,x30,[sp], #0x10
00aaf228	ret
