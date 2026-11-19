; mbedtls_asn1_free_named_data_list @ 00b7d0f0
00b7d0f0	stp x20,x19,[sp, #-0x20]!
00b7d0f4	stp x29,x30,[sp, #0x10]
00b7d0f8	add x29,sp,#0x10
00b7d0fc	ldr x20,[x0]
00b7d100	mov x19,x0
00b7d104	cbz x20,0x00b7d130
00b7d108	ldr x8,[x20, #0x30]
00b7d10c	str x8,[x19]
00b7d110	ldr x0,[x20, #0x10]
00b7d114	bl 0x00c30960
00b7d118	ldr x0,[x20, #0x28]
00b7d11c	bl 0x00c30960
00b7d120	mov x0,x20
00b7d124	bl 0x00c30960
00b7d128	ldr x20,[x19]
00b7d12c	cbnz x20,0x00b7d108
00b7d130	ldp x29,x30,[sp, #0x10]
00b7d134	ldp x20,x19,[sp], #0x20
00b7d138	ret
