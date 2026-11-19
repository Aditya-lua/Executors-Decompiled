; mbedtls_asn1_sequence_free @ 00b7cc50
00b7cc50	str x19,[sp, #-0x20]!
00b7cc54	stp x29,x30,[sp, #0x10]
00b7cc58	add x29,sp,#0x10
00b7cc5c	cbz x0,0x00b7cc70
00b7cc60	ldr x19,[x0, #0x18]
00b7cc64	bl 0x00c30960
00b7cc68	mov x0,x19
00b7cc6c	cbnz x19,0x00b7cc60
00b7cc70	ldp x29,x30,[sp, #0x10]
00b7cc74	ldr x19,[sp], #0x20
00b7cc78	ret
