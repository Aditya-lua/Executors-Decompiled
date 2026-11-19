; mbedtls_mpi_core_cond_swap @ 00b83774
00b83774	cmp x0,x1
00b83778	b.eq 0x00b837c4
00b8377c	cbz x2,0x00b837c4
00b83780	ldr x8,[x0]
00b83784	ldr x9,[x1]
00b83788	mov x10,x3
00b8378c	subs x2,x2,#0x1
00b83790	and x9,x9,x10
00b83794	mvn x10,x10
00b83798	and x10,x10,x8
00b8379c	orr x10,x9,x10
00b837a0	str x10,[x0], #0x8
00b837a4	ldr x9,[x1]
00b837a8	mov x10,x3
00b837ac	and x8,x8,x10
00b837b0	mvn x10,x10
00b837b4	and x10,x10,x9
00b837b8	orr x10,x8,x10
00b837bc	str x10,[x1], #0x8
00b837c0	b.ne 0x00b83780
00b837c4	ret
