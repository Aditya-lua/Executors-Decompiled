; mbedtls_ccm_free @ 00b6b0d4
00b6b0d4	str x19,[sp, #-0x20]!
00b6b0d8	stp x29,x30,[sp, #0x10]
00b6b0dc	add x29,sp,#0x10
00b6b0e0	mov x19,x0
00b6b0e4	cbz x0,0x00b6b104
00b6b0e8	add x0,x19,#0x48
00b6b0ec	bl 0x00c30290
00b6b0f0	ldp x29,x30,[sp, #0x10]
00b6b0f4	mov w1,#0xb0
00b6b0f8	mov x0,x19
00b6b0fc	ldr x19,[sp], #0x20
00b6b100	b 0x00c42220
00b6b104	ldp x29,x30,[sp, #0x10]
00b6b108	ldr x19,[sp], #0x20
00b6b10c	ret
