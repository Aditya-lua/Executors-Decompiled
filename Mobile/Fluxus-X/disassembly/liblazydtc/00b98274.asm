; mbedtls_psa_aead_encrypt_setup @ 00b98274
00b98274	str x19,[sp, #-0x20]!
00b98278	stp x29,x30,[sp, #0x10]
00b9827c	add x29,sp,#0x10
00b98280	mov w3,w4
00b98284	mov x19,x0
00b98288	bl 0x00b97e00
00b9828c	cbnz w0,0x00b9829c
00b98290	ldrb w8,[x19, #0x6]
00b98294	orr w8,w8,#0x1
00b98298	strb w8,[x19, #0x6]
00b9829c	ldp x29,x30,[sp, #0x10]
00b982a0	ldr x19,[sp], #0x20
00b982a4	ret
