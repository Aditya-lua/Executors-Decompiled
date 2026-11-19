; ossl_method_store_free @ 00ac40c8
00ac40c8	cbz x0,0x00ac4128
00ac40cc	str x19,[sp, #-0x20]!
00ac40d0	stp x29,x30,[sp, #0x10]
00ac40d4	mov x19,x0
00ac40d8	ldr x0,[x0, #0x8]
00ac40dc	add x29,sp,#0x10
00ac40e0	cbz x0,0x00ac40f8
00ac40e4	adrp x1,0xac4000
00ac40e8	add x1,x1,#0x12c
00ac40ec	mov x2,x19
00ac40f0	bl 0x00c3ec50
00ac40f4	ldr x0,[x19, #0x8]
00ac40f8	bl 0x00c3ec60
00ac40fc	ldr x0,[x19, #0x10]
00ac4100	bl 0x00c34d40
00ac4104	ldr x0,[x19, #0x18]
00ac4108	bl 0x00c34d40
00ac410c	ldp x29,x30,[sp, #0x10]
00ac4110	adrp x1,0x2ca000
00ac4114	add x1,x1,#0x2a4
00ac4118	mov w2,#0x111
00ac411c	mov x0,x19
00ac4120	ldr x19,[sp], #0x20
00ac4124	b 0x00c32310
00ac4128	ret
