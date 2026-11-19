; ossl_err_load_DH_strings @ 00a990d8
00a990d8	stp x29,x30,[sp, #-0x10]!
00a990dc	mov w0,#0x7f
00a990e0	movk w0,#0x280, LSL #16
00a990e4	mov x29,sp
00a990e8	bl 0x00c35520
00a990ec	cbnz x0,0x00a990fc
00a990f0	adrp x0,0xc6c000
00a990f4	add x0,x0,#0x8
00a990f8	bl 0x00c35510
00a990fc	mov w0,#0x1
00a99100	ldp x29,x30,[sp], #0x10
00a99104	ret
