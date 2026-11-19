; X509_TRUST_cleanup @ 00b0d128
00b0d128	str x19,[sp, #-0x20]!
00b0d12c	adrp x19,0xd22000
00b0d130	ldr x0,[x19, #0x7e8]
00b0d134	adrp x1,0xb0d000
00b0d138	add x1,x1,#0x158
00b0d13c	stp x29,x30,[sp, #0x10]
00b0d140	add x29,sp,#0x10
00b0d144	bl 0x00c32600
00b0d148	ldp x29,x30,[sp, #0x10]
00b0d14c	str xzr,[x19, #0x7e8]
00b0d150	ldr x19,[sp], #0x20
00b0d154	ret
