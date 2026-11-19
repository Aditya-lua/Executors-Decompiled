; ossl_err_load_ESS_strings @ 00a991c8
00a991c8	stp x29,x30,[sp, #-0x10]!
00a991cc	mov w0,#0x6b
00a991d0	movk w0,#0x1b00, LSL #16
00a991d4	mov x29,sp
00a991d8	bl 0x00c35520
00a991dc	cbnz x0,0x00a991ec
00a991e0	adrp x0,0xc6c000
00a991e4	add x0,x0,#0xb28
00a991e8	bl 0x00c35510
00a991ec	mov w0,#0x1
00a991f0	ldp x29,x30,[sp], #0x10
00a991f4	ret
