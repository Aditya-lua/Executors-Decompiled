; mbedtls_mpi_core_bitlen @ 00b835ec
00b835ec	sxtw x9,w1
00b835f0	lsl x8,x9,#0x6
00b835f4	add x8,x8,#0x40
00b835f8	subs x10,x9,#0x1
00b835fc	b.lt 0x00b83620
00b83600	add x9,x0,x9, LSL #0x3
00b83604	ldur x11,[x9, #-0x8]
00b83608	sub x8,x8,#0x40
00b8360c	mov x9,x10
00b83610	cbz x11,0x00b835f8
00b83614	clz x9,x11
00b83618	sub x0,x8,x9
00b8361c	ret
00b83620	mov x0,xzr
00b83624	ret
