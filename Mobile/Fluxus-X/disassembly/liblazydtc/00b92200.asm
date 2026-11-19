; mbedtls_ecp_tls_write_point @ 00b92200
00b92200	stp x20,x19,[sp, #-0x20]!
00b92204	stp x29,x30,[sp, #0x10]
00b92208	add x29,sp,#0x10
00b9220c	mov x20,x4
00b92210	mov x19,x3
00b92214	mov x8,x0
00b92218	cmp w2,#0x1
00b9221c	mov w0,#0xffffb080
00b92220	b.hi 0x00b92254
00b92224	cbz x5,0x00b92254
00b92228	add x4,x20,#0x1
00b9222c	sub x5,x5,#0x1
00b92230	mov x0,x8
00b92234	mov x3,x19
00b92238	bl 0x00c42780
00b9223c	cbnz w0,0x00b92254
00b92240	ldr x8,[x19]
00b92244	strb w8,[x20]
00b92248	ldr x8,[x19]
00b9224c	add x8,x8,#0x1
00b92250	str x8,[x19]
00b92254	ldp x29,x30,[sp, #0x10]
00b92258	ldp x20,x19,[sp], #0x20
00b9225c	ret
