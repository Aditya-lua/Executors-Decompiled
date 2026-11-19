; mbedtls_chachapoly_free @ 00b6cfa8
00b6cfa8	str x19,[sp, #-0x20]!
00b6cfac	stp x29,x30,[sp, #0x10]
00b6cfb0	add x29,sp,#0x10
00b6cfb4	mov x19,x0
00b6cfb8	cbz x0,0x00b6cfd4
00b6cfbc	mov x0,x19
00b6cfc0	bl 0x00c42070
00b6cfc4	add x0,x19,#0x88
00b6cfc8	bl 0x00c42260
00b6cfcc	stp xzr,xzr,[x19, #0xd8]
00b6cfd0	str xzr,[x19, #0xe8]
00b6cfd4	ldp x29,x30,[sp, #0x10]
00b6cfd8	ldr x19,[sp], #0x20
00b6cfdc	ret
