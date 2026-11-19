; mbedtls_psa_mac_sign_finish @ 00b9e1a0
00b9e1a0	stp x20,x19,[sp, #-0x20]!
00b9e1a4	stp x29,x30,[sp, #0x10]
00b9e1a8	add x29,sp,#0x10
00b9e1ac	ldr w8,[x0]
00b9e1b0	mov x19,x3
00b9e1b4	mov x20,x2
00b9e1b8	cbz w8,0x00b9e1d0
00b9e1bc	mov x2,x20
00b9e1c0	bl 0x00b9e1e0
00b9e1c4	cbnz w0,0x00b9e1d4
00b9e1c8	str x20,[x19]
00b9e1cc	b 0x00b9e1d4
00b9e1d0	mov w0,#0xffffff77
00b9e1d4	ldp x29,x30,[sp, #0x10]
00b9e1d8	ldp x20,x19,[sp], #0x20
00b9e1dc	ret
