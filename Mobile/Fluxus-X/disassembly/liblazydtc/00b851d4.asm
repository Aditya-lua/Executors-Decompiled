; mbedtls_mpi_core_sub_int @ 00b851d4
00b851d4	cbz x3,0x00b851fc
00b851d8	ldr x8,[x1], #0x8
00b851dc	sub x9,x8,x2
00b851e0	cmp x9,x8
00b851e4	cset w2,hi
00b851e8	subs x3,x3,#0x1
00b851ec	str x9,[x0], #0x8
00b851f0	b.ne 0x00b851d8
00b851f4	cmp x9,x8
00b851f8	cset w2,hi
00b851fc	mov x0,x2
00b85200	ret
