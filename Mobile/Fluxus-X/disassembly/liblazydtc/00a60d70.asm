; ossl_encoder_store_remove_all_provided @ 00a60d70
00a60d70	str x19,[sp, #-0x20]!
00a60d74	stp x29,x30,[sp, #0x10]
00a60d78	add x29,sp,#0x10
00a60d7c	mov x19,x0
00a60d80	bl 0x00c3b2f0
00a60d84	adrp x2,0xc5d000
00a60d88	add x2,x2,#0x818
00a60d8c	mov w1,#0xa
00a60d90	bl 0x00c3b520
00a60d94	cbz x0,0x00a60da8
00a60d98	ldp x29,x30,[sp, #0x10]
00a60d9c	mov x1,x19
00a60da0	ldr x19,[sp], #0x20
00a60da4	b 0x00c3b5e0
00a60da8	ldp x29,x30,[sp, #0x10]
00a60dac	mov w0,#0x1
00a60db0	ldr x19,[sp], #0x20
00a60db4	ret
