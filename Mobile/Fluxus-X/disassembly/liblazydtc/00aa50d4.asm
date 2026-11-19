; OSSL_SELF_TEST_new @ 00aa50d4
00aa50d4	str x21,[sp, #-0x30]!
00aa50d8	mov x21,x1
00aa50dc	adrp x1,0x2c3000
00aa50e0	stp x20,x19,[sp, #0x10]
00aa50e4	mov x19,x0
00aa50e8	add x1,x1,#0xd12
00aa50ec	mov w0,#0xc8
00aa50f0	mov w2,#0x67
00aa50f4	stp x29,x30,[sp, #0x20]
00aa50f8	add x29,sp,#0x20
00aa50fc	bl 0x00c34250
00aa5100	mov x20,x0
00aa5104	cbz x0,0x00aa5128
00aa5108	adrp x8,0x2ab000
00aa510c	add x8,x8,#0x32c
00aa5110	dup v0.2D,x8
00aa5114	mov x0,x20
00aa5118	str x21,[x20, #0xc0]
00aa511c	stp x8,x19,[x20, #0x10]
00aa5120	str q0,[x20]
00aa5124	bl 0x00aa513c
00aa5128	mov x0,x20
00aa512c	ldp x29,x30,[sp, #0x20]
00aa5130	ldp x20,x19,[sp, #0x10]
00aa5134	ldr x21,[sp], #0x30
00aa5138	ret
