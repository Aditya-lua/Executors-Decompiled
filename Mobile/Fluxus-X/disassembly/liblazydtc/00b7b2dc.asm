; mbedtls_zeroize_and_free @ 00b7b2dc
00b7b2dc	str x19,[sp, #-0x20]!
00b7b2e0	stp x29,x30,[sp, #0x10]
00b7b2e4	add x29,sp,#0x10
00b7b2e8	mov x2,x1
00b7b2ec	mov x19,x0
00b7b2f0	cbz x0,0x00b7b30c
00b7b2f4	cbz x2,0x00b7b30c
00b7b2f8	adrp x8,0xca8000
00b7b2fc	ldr x8,[x8, #0x4e8]
00b7b300	mov x0,x19
00b7b304	mov w1,wzr
00b7b308	blr x8
00b7b30c	ldp x29,x30,[sp, #0x10]
00b7b310	mov x0,x19
00b7b314	ldr x19,[sp], #0x20
00b7b318	b 0x00c30960
