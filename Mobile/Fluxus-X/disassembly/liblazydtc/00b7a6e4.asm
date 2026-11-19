; mbedtls_nist_kw_free @ 00b7a6e4
00b7a6e4	str x19,[sp, #-0x20]!
00b7a6e8	stp x29,x30,[sp, #0x10]
00b7a6ec	add x29,sp,#0x10
00b7a6f0	mov x19,x0
00b7a6f4	cbz x0,0x00b7a714
00b7a6f8	mov x0,x19
00b7a6fc	bl 0x00c30290
00b7a700	ldp x29,x30,[sp, #0x10]
00b7a704	orr w1,wzr,#0x60
00b7a708	mov x0,x19
00b7a70c	ldr x19,[sp], #0x20
00b7a710	b 0x00c42220
00b7a714	ldp x29,x30,[sp, #0x10]
00b7a718	ldr x19,[sp], #0x20
00b7a71c	ret
