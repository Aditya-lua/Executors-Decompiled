; ossl_err_load_RAND_strings @ 00ac79f8
00ac79f8	stp x29,x30,[sp, #-0x10]!
00ac79fc	mov w0,#0x66
00ac7a00	movk w0,#0x1200, LSL #16
00ac7a04	mov x29,sp
00ac7a08	bl 0x00c35520
00ac7a0c	cbnz x0,0x00ac7a1c
00ac7a10	adrp x0,0xc7c000
00ac7a14	add x0,x0,#0x778
00ac7a18	bl 0x00c35510
00ac7a1c	mov w0,#0x1
00ac7a20	ldp x29,x30,[sp], #0x10
00ac7a24	ret
