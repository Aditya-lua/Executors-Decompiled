; mbedtls_mpi_shift_r @ 00b7ecb4
00b7ecb4	ldrh w8,[x0, #0xa]
00b7ecb8	mov x2,x1
00b7ecbc	cbz x8,0x00b7ecd8
00b7ecc0	stp x29,x30,[sp, #-0x10]!
00b7ecc4	mov x29,sp
00b7ecc8	ldr x0,[x0]
00b7eccc	mov x1,x8
00b7ecd0	bl 0x00c41ef0
00b7ecd4	ldp x29,x30,[sp], #0x10
00b7ecd8	mov w0,wzr
00b7ecdc	ret
