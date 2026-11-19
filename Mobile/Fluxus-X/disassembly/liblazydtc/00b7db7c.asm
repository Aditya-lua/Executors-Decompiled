; mbedtls_mpi_size @ 00b7db7c
00b7db7c	stp x29,x30,[sp, #-0x10]!
00b7db80	mov x29,sp
00b7db84	ldr x8,[x0]
00b7db88	ldrh w1,[x0, #0xa]
00b7db8c	mov x0,x8
00b7db90	bl 0x00c41dc0
00b7db94	add x8,x0,#0x7
00b7db98	lsr x0,x8,#0x3
00b7db9c	ldp x29,x30,[sp], #0x10
00b7dba0	ret
