; ossl_method_store_cache_flush_all @ 00ac4b10
00ac4b10	str x19,[sp, #-0x20]!
00ac4b14	stp x29,x30,[sp, #0x10]
00ac4b18	add x29,sp,#0x10
00ac4b1c	cbz x0,0x00ac4b50
00ac4b20	mov x19,x0
00ac4b24	ldr x0,[x0, #0x10]
00ac4b28	bl 0x00c356a0
00ac4b2c	cbz w0,0x00ac4b50
00ac4b30	ldr x0,[x19, #0x8]
00ac4b34	adrp x1,0xac4000
00ac4b38	add x1,x1,#0xb5c
00ac4b3c	bl 0x00c3ec40
00ac4b40	ldr x0,[x19, #0x10]
00ac4b44	str xzr,[x19, #0x20]
00ac4b48	bl 0x00c35690
00ac4b4c	mov w0,#0x1
00ac4b50	ldp x29,x30,[sp, #0x10]
00ac4b54	ldr x19,[sp], #0x20
00ac4b58	ret
