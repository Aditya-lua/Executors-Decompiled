; mbedtls_mpi_core_check_zero_ct @ 00b85204
00b85204	mov x8,x0
00b85208	mov x0,xzr
00b8520c	cbz x1,0x00b85220
00b85210	ldr x9,[x8], #0x8
00b85214	subs x1,x1,#0x1
00b85218	orr x0,x9,x0
00b8521c	b.ne 0x00b85210
00b85220	neg x8,x0
00b85224	orr x0,x8,x0
00b85228	asr x0,x0,#0x3f
00b8522c	ret
