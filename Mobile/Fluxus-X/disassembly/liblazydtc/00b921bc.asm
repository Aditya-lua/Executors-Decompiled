; mbedtls_ecp_tls_read_point @ 00b921bc
00b921bc	mov x9,x3
00b921c0	cmp x3,#0x2
00b921c4	b.cc 0x00b921e8
00b921c8	ldr x10,[x2]
00b921cc	add x8,x10,#0x1
00b921d0	str x8,[x2]
00b921d4	ldrb w3,[x10]
00b921d8	cbz x3,0x00b921e8
00b921dc	sub x9,x9,#0x1
00b921e0	cmp x9,x3
00b921e4	b.cs 0x00b921f0
00b921e8	mov w0,#0xffffb080
00b921ec	ret
00b921f0	add x9,x8,x3
00b921f4	str x9,[x2]
00b921f8	mov x2,x8
00b921fc	b 0x00c42770
