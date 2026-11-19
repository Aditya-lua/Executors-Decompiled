; ossl_err_load_PROP_strings @ 00ac58d8
00ac58d8	stp x29,x30,[sp, #-0x10]!
00ac58dc	mov w0,#0x64
00ac58e0	movk w0,#0x1b80, LSL #16
00ac58e4	mov x29,sp
00ac58e8	bl 0x00c35520
00ac58ec	cbnz x0,0x00ac58fc
00ac58f0	adrp x0,0xc7c000
00ac58f4	add x0,x0,#0x6a0
00ac58f8	bl 0x00c35510
00ac58fc	mov w0,#0x1
00ac5900	ldp x29,x30,[sp], #0x10
00ac5904	ret
