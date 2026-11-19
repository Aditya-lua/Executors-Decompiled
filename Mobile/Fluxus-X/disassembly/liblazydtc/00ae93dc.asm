; ossl_err_load_OSSL_STORE_strings @ 00ae93dc
00ae93dc	stp x29,x30,[sp, #-0x10]!
00ae93e0	mov w0,#0x6b
00ae93e4	movk w0,#0x1600, LSL #16
00ae93e8	mov x29,sp
00ae93ec	bl 0x00c35520
00ae93f0	cbnz x0,0x00ae9400
00ae93f4	adrp x0,0xc7d000
00ae93f8	add x0,x0,#0xcf0
00ae93fc	bl 0x00c35510
00ae9400	mov w0,#0x1
00ae9404	ldp x29,x30,[sp], #0x10
00ae9408	ret
