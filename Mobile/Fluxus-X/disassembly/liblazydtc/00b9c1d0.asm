; mbedtls_hmac_drbg_init @ 00b9c1d0
00b9c1d0	str x19,[sp, #-0x20]!
00b9c1d4	stp x29,x30,[sp, #0x10]
00b9c1d8	add x29,sp,#0x10
00b9c1dc	mov w2,#0x80
00b9c1e0	mov w1,wzr
00b9c1e4	mov x19,x0
00b9c1e8	bl 0x00c301c0
00b9c1ec	mov w8,#0x2710
00b9c1f0	str w8,[x19, #0x6c]
00b9c1f4	ldp x29,x30,[sp, #0x10]
00b9c1f8	ldr x19,[sp], #0x20
00b9c1fc	ret
