; mbedtls_asn1_free_named_data_list_shallow @ 00b7d13c
00b7d13c	str x19,[sp, #-0x20]!
00b7d140	stp x29,x30,[sp, #0x10]
00b7d144	add x29,sp,#0x10
00b7d148	cbz x0,0x00b7d15c
00b7d14c	ldr x19,[x0, #0x30]
00b7d150	bl 0x00c30960
00b7d154	mov x0,x19
00b7d158	cbnz x19,0x00b7d14c
00b7d15c	ldp x29,x30,[sp, #0x10]
00b7d160	ldr x19,[sp], #0x20
00b7d164	ret
