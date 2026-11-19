; mbedtls_ecdsa_write_signature @ 00b9bfb8
00b9bfb8	sub sp,sp,#0x20
00b9bfbc	stp x29,x30,[sp, #0x10]
00b9bfc0	add x29,sp,#0x10
00b9bfc4	ldr x8,[x29, #0x10]
00b9bfc8	str x8,[sp]
00b9bfcc	bl 0x00c42570
00b9bfd0	ldp x29,x30,[sp, #0x10]
00b9bfd4	add sp,sp,#0x20
00b9bfd8	ret
