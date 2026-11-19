; mbedtls_mpi_read_binary @ 00b7eb44
00b7eb44	str x21,[sp, #-0x30]!
00b7eb48	stp x20,x19,[sp, #0x10]
00b7eb4c	stp x29,x30,[sp, #0x20]
00b7eb50	add x29,sp,#0x20
00b7eb54	lsr x8,x2,#0x3
00b7eb58	tst x2,#0x7
00b7eb5c	mov x20,x1
00b7eb60	cinc x1,x8,ne
00b7eb64	mov x19,x2
00b7eb68	mov x21,x0
00b7eb6c	bl 0x00b7ea70
00b7eb70	cbz w0,0x00b7eb84
00b7eb74	ldp x29,x30,[sp, #0x20]
00b7eb78	ldp x20,x19,[sp, #0x10]
00b7eb7c	ldr x21,[sp], #0x30
00b7eb80	ret
00b7eb84	ldr x0,[x21]
00b7eb88	ldrh w1,[x21, #0xa]
00b7eb8c	mov x2,x20
00b7eb90	mov x3,x19
00b7eb94	ldp x29,x30,[sp, #0x20]
00b7eb98	ldp x20,x19,[sp, #0x10]
00b7eb9c	ldr x21,[sp], #0x30
00b7eba0	b 0x00c41ec0
