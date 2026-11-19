; mbedtls_psa_aead_decrypt_setup @ 00b982a8
00b982a8	str x19,[sp, #-0x20]!
00b982ac	stp x29,x30,[sp, #0x10]
00b982b0	add x29,sp,#0x10
00b982b4	mov w3,w4
00b982b8	mov x19,x0
00b982bc	bl 0x00b97e00
00b982c0	cbnz w0,0x00b982d0
00b982c4	ldrb w8,[x19, #0x6]
00b982c8	and w8,w8,#0xfe
00b982cc	strb w8,[x19, #0x6]
00b982d0	ldp x29,x30,[sp, #0x10]
00b982d4	ldr x19,[sp], #0x20
00b982d8	ret
