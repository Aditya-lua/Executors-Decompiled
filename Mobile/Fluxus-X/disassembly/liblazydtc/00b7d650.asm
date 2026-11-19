; mbedtls_mpi_free @ 00b7d650
00b7d650	str x19,[sp, #-0x20]!
00b7d654	stp x29,x30,[sp, #0x10]
00b7d658	add x29,sp,#0x10
00b7d65c	mov x19,x0
00b7d660	cbz x0,0x00b7d684
00b7d664	ldr x0,[x19]
00b7d668	cbz x0,0x00b7d678
00b7d66c	ldrh w8,[x19, #0xa]
00b7d670	lsl x1,x8,#0x3
00b7d674	bl 0x00c42230
00b7d678	mov w8,#0x1
00b7d67c	str w8,[x19, #0x8]
00b7d680	str xzr,[x19]
00b7d684	ldp x29,x30,[sp, #0x10]
00b7d688	ldr x19,[sp], #0x20
00b7d68c	ret
