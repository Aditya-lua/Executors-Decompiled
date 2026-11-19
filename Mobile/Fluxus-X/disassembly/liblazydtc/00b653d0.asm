; ossl_cipher_generic_reset_ctx @ 00b653d0
00b653d0	str x19,[sp, #-0x20]!
00b653d4	stp x29,x30,[sp, #0x10]
00b653d8	add x29,sp,#0x10
00b653dc	cbz x0,0x00b65408
00b653e0	ldr w8,[x0, #0x80]
00b653e4	mov x19,x0
00b653e8	cbz w8,0x00b65408
00b653ec	ldr x0,[x19, #0x78]
00b653f0	adrp x1,0x2c4000
00b653f4	add x1,x1,#0x898
00b653f8	mov w2,#0xb6
00b653fc	bl 0x00c32310
00b65400	str wzr,[x19, #0x80]
00b65404	str xzr,[x19, #0x78]
00b65408	ldp x29,x30,[sp, #0x10]
00b6540c	ldr x19,[sp], #0x20
00b65410	ret
