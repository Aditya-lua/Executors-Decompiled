; OSSL_PROVIDER_unload @ 00aa18b8
00aa18b8	str x19,[sp, #-0x20]!
00aa18bc	mov w1,#0x1
00aa18c0	stp x29,x30,[sp, #0x10]
00aa18c4	add x29,sp,#0x10
00aa18c8	mov x19,x0
00aa18cc	bl 0x00c3ea80
00aa18d0	cbz w0,0x00aa18e0
00aa18d4	mov x0,x19
00aa18d8	bl 0x00c3b690
00aa18dc	mov w0,#0x1
00aa18e0	ldp x29,x30,[sp, #0x10]
00aa18e4	ldr x19,[sp], #0x20
00aa18e8	ret
