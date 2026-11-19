; mbedtls_mpi_core_cond_assign @ 00b8373c
00b8373c	cmp x0,x1
00b83740	b.eq 0x00b83770
00b83744	cbz x2,0x00b83770
00b83748	ldr x8,[x1], #0x8
00b8374c	ldr x9,[x0]
00b83750	mov x10,x3
00b83754	subs x2,x2,#0x1
00b83758	and x8,x8,x10
00b8375c	mvn x10,x10
00b83760	and x10,x10,x9
00b83764	orr x10,x8,x10
00b83768	str x10,[x0], #0x8
00b8376c	b.ne 0x00b83748
00b83770	ret
