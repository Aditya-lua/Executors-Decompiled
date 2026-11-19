; mbedtls_ctr_drbg_init @ 00b73748
00b73748	str x19,[sp, #-0x20]!
00b7374c	stp x29,x30,[sp, #0x10]
00b73750	add x29,sp,#0x10
00b73754	mov w2,#0x158
00b73758	mov w1,wzr
00b7375c	mov x19,x0
00b73760	bl 0x00c301c0
00b73764	add x0,x19,#0x28
00b73768	bl 0x00c41920
00b7376c	mov w8,#0xffffffff
00b73770	mov w9,#0x2710
00b73774	str w8,[x19, #0x10]
00b73778	str w9,[x19, #0x20]
00b7377c	ldp x29,x30,[sp, #0x10]
00b73780	ldr x19,[sp], #0x20
00b73784	ret
