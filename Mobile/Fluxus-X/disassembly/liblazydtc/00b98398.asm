; mbedtls_psa_aead_set_lengths @ 00b98398
00b98398	ldr w8,[x0]
00b9839c	mov w9,#0x100
00b983a0	movk w9,#0x550, LSL #16
00b983a4	cmp w8,w9
00b983a8	b.ne 0x00b983c8
00b983ac	stp x29,x30,[sp, #-0x10]!
00b983b0	mov x29,sp
00b983b4	ldrb w3,[x0, #0x7]
00b983b8	add x0,x0,#0x8
00b983bc	bl 0x00c42020
00b983c0	ldp x29,x30,[sp], #0x10
00b983c4	b 0x00c42bf0
00b983c8	mov w0,wzr
00b983cc	ret
