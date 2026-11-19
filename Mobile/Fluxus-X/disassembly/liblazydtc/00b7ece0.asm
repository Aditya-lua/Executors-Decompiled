; mbedtls_mpi_cmp_abs @ 00b7ece0
00b7ece0	ldrh w8,[x0, #0xa]
00b7ece4	sub x8,x8,#0x1
00b7ece8	cmn x8,#0x1
00b7ecec	b.eq 0x00b7ed08
00b7ecf0	ldr x9,[x0]
00b7ecf4	ldr x9,[x9, x8, LSL #0x3]
00b7ecf8	sub x8,x8,#0x1
00b7ecfc	cbz x9,0x00b7ece8
00b7ed00	add x8,x8,#0x2
00b7ed04	b 0x00b7ed0c
00b7ed08	mov x8,xzr
00b7ed0c	ldrh w9,[x1, #0xa]
00b7ed10	sub x9,x9,#0x1
00b7ed14	cmn x9,#0x1
00b7ed18	b.eq 0x00b7ed7c
00b7ed1c	ldr x10,[x1]
00b7ed20	ldr x10,[x10, x9, LSL #0x3]
00b7ed24	sub x9,x9,#0x1
00b7ed28	cbz x10,0x00b7ed14
00b7ed2c	add x9,x9,#0x2
00b7ed30	cmp x8,x9
00b7ed34	b.hi 0x00b7ed88
00b7ed38	cmp x9,x8
00b7ed3c	b.hi 0x00b7ed74
00b7ed40	sub x8,x8,#0x1
00b7ed44	cmn x8,#0x1
00b7ed48	b.eq 0x00b7ed90
00b7ed4c	ldr x9,[x0]
00b7ed50	ldr x10,[x1]
00b7ed54	lsl x11,x8,#0x3
00b7ed58	ldr x9,[x9, x11#0x0]
00b7ed5c	ldr x10,[x10, x11#0x0]
00b7ed60	cmp x9,x10
00b7ed64	b.hi 0x00b7ed98
00b7ed68	cmp x9,x10
00b7ed6c	sub x8,x8,#0x1
00b7ed70	b.cs 0x00b7ed44
00b7ed74	mov w0,#0xffffffff
00b7ed78	ret
00b7ed7c	mov x9,xzr
00b7ed80	cmp x8,x9
00b7ed84	b.ls 0x00b7ed38
00b7ed88	mov w0,#0x1
00b7ed8c	ret
00b7ed90	mov w0,wzr
00b7ed94	ret
00b7ed98	mov w0,#0x1
00b7ed9c	ret
