; mbedtls_mpi_core_uint_le_mpi @ 00b83668
00b83668	ldr x9,[x1]
00b8366c	mov x8,xzr
00b83670	cmp x2,#0x2
00b83674	eor x10,x0,x9
00b83678	sub x9,x9,x0
00b8367c	bic x9,x9,x10
00b83680	and x10,x10,x0
00b83684	orr x10,x9,x10
00b83688	asr x9,x10,#0x3f
00b8368c	mvn x9,x9
00b83690	b.cc 0x00b836b8
00b83694	add x10,x1,#0x8
00b83698	sub x11,x2,#0x1
00b8369c	ldr x12,[x10], #0x8
00b836a0	subs x11,x11,#0x1
00b836a4	neg x13,x12
00b836a8	orr x12,x13,x12
00b836ac	asr x12,x12,#0x3f
00b836b0	orr x8,x12,x8
00b836b4	b.ne 0x00b8369c
00b836b8	orr x0,x8,x9
00b836bc	ret
