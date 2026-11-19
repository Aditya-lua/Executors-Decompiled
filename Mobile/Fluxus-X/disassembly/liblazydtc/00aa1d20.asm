; ossl_provider_deinit_child @ 00aa1d20
00aa1d20	stp x29,x30,[sp, #-0x10]!
00aa1d24	adrp x2,0xc6d000
00aa1d28	add x2,x2,#0x498
00aa1d2c	mov w1,#0x12
00aa1d30	mov x29,sp
00aa1d34	bl 0x00c3b520
00aa1d38	cbz x0,0x00aa1d4c
00aa1d3c	ldr x1,[x0, #0x28]
00aa1d40	ldr x0,[x0]
00aa1d44	ldp x29,x30,[sp], #0x10
00aa1d48	br x1
00aa1d4c	ldp x29,x30,[sp], #0x10
00aa1d50	ret
