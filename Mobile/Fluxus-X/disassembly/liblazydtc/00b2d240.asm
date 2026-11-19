; ossl_cipher_hw_tdes_copyctx @ 00b2d240
00b2d240	str x19,[sp, #-0x20]!
00b2d244	mov w2,#0x248
00b2d248	stp x29,x30,[sp, #0x10]
00b2d24c	add x29,sp,#0x10
00b2d250	mov x19,x0
00b2d254	bl 0x00c2ffd0
00b2d258	add x8,x19,#0xc0
00b2d25c	str x8,[x19, #0xb0]
00b2d260	ldp x29,x30,[sp, #0x10]
00b2d264	ldr x19,[sp], #0x20
00b2d268	ret
