; ossl_sha3_reset @ 00ae0acc
00ae0acc	str x19,[sp, #-0x20]!
00ae0ad0	mov w2,#0xc8
00ae0ad4	mov w1,wzr
00ae0ad8	stp x29,x30,[sp, #0x10]
00ae0adc	add x29,sp,#0x10
00ae0ae0	mov x19,x0
00ae0ae4	bl 0x00c301c0
00ae0ae8	str xzr,[x19, #0xd8]
00ae0aec	ldp x29,x30,[sp, #0x10]
00ae0af0	ldr x19,[sp], #0x20
00ae0af4	ret
