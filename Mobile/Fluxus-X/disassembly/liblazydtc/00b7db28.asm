; mbedtls_mpi_lsb @ 00b7db28
00b7db28	ldrh w8,[x0, #0xa]
00b7db2c	cbz x8,0x00b7db54
00b7db30	ldr x10,[x0]
00b7db34	mov x9,xzr
00b7db38	mov x11,xzr
00b7db3c	ldr x12,[x10, x11, LSL #0x3]
00b7db40	cbnz x12,0x00b7db5c
00b7db44	add x11,x11,#0x1
00b7db48	cmp x11,x8
00b7db4c	add x9,x9,#0x40
00b7db50	b.cc 0x00b7db3c
00b7db54	mov x0,xzr
00b7db58	ret
00b7db5c	rbit x8,x12
00b7db60	clz x8,x8
00b7db64	add x0,x8,x9
00b7db68	ret
