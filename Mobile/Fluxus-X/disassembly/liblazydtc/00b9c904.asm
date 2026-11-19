; mbedtls_hmac_drbg_free @ 00b9c904
00b9c904	str x19,[sp, #-0x20]!
00b9c908	stp x29,x30,[sp, #0x10]
00b9c90c	add x29,sp,#0x10
00b9c910	mov x19,x0
00b9c914	cbz x0,0x00b9c934
00b9c918	mov x0,x19
00b9c91c	bl 0x00c42830
00b9c920	mov w1,#0x80
00b9c924	mov x0,x19
00b9c928	bl 0x00c42220
00b9c92c	mov w8,#0x2710
00b9c930	str w8,[x19, #0x6c]
00b9c934	ldp x29,x30,[sp, #0x10]
00b9c938	ldr x19,[sp], #0x20
00b9c93c	ret
