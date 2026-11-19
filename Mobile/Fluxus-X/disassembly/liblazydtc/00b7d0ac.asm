; mbedtls_asn1_free_named_data @ 00b7d0ac
00b7d0ac	str x19,[sp, #-0x20]!
00b7d0b0	stp x29,x30,[sp, #0x10]
00b7d0b4	add x29,sp,#0x10
00b7d0b8	mov x19,x0
00b7d0bc	cbz x0,0x00b7d0e4
00b7d0c0	ldr x0,[x19, #0x10]
00b7d0c4	bl 0x00c30960
00b7d0c8	ldr x0,[x19, #0x28]
00b7d0cc	bl 0x00c30960
00b7d0d0	ldp x29,x30,[sp, #0x10]
00b7d0d4	mov w1,#0x40
00b7d0d8	mov x0,x19
00b7d0dc	ldr x19,[sp], #0x20
00b7d0e0	b 0x00c42220
00b7d0e4	ldp x29,x30,[sp, #0x10]
00b7d0e8	ldr x19,[sp], #0x20
00b7d0ec	ret
