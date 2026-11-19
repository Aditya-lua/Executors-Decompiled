; mbedtls_mpi_core_write_be @ 00b839d8
00b839d8	str x21,[sp, #-0x30]!
00b839dc	stp x20,x19,[sp, #0x10]
00b839e0	stp x29,x30,[sp, #0x20]
00b839e4	add x29,sp,#0x20
00b839e8	lsl x20,x1,#0x3
00b839ec	cmp x20,x3
00b839f0	mov x19,x0
00b839f4	b.cs 0x00b83a24
00b839f8	add x8,x2,x3
00b839fc	sub x21,x8,x20
00b83a00	sub x8,x3,x20
00b83a04	mov x0,x2
00b83a08	mov w1,wzr
00b83a0c	mov x2,x8
00b83a10	bl 0x00c301c0
00b83a14	mov x3,x20
00b83a18	mov x2,x21
00b83a1c	cbnz x3,0x00b83a60
00b83a20	b 0x00b83a94
00b83a24	b.ls 0x00b83a5c
00b83a28	lsl x8,x3,#0x3
00b83a2c	orr w9,wzr,#0xff
00b83a30	mov x10,x3
00b83a34	and x11,x10,#-0x8
00b83a38	ldr x11,[x19, x11#0x0]
00b83a3c	and x12,x8,#0x38
00b83a40	lsl x12,x9,x12
00b83a44	tst x11,x12
00b83a48	b.ne 0x00b83aa8
00b83a4c	add x10,x10,#0x1
00b83a50	cmp x10,x20
00b83a54	add x8,x8,#0x8
00b83a58	b.cc 0x00b83a34
00b83a5c	cbz x3,0x00b83a94
00b83a60	add x10,x2,x3
00b83a64	mov x8,xzr
00b83a68	mov x9,xzr
00b83a6c	sub x10,x10,#0x1
00b83a70	and x11,x9,#-0x8
00b83a74	ldr x11,[x19, x11#0x0]
00b83a78	and x12,x8,#0x38
00b83a7c	add x9,x9,#0x1
00b83a80	cmp x3,x9
00b83a84	lsr x11,x11,x12
00b83a88	strb w11,[x10], #-0x1
00b83a8c	add x8,x8,#0x8
00b83a90	b.ne 0x00b83a70
00b83a94	mov w0,wzr
00b83a98	ldp x29,x30,[sp, #0x20]
00b83a9c	ldp x20,x19,[sp, #0x10]
00b83aa0	ldr x21,[sp], #0x30
00b83aa4	ret
00b83aa8	orr w0,wzr,#0xfffffff8
00b83aac	b 0x00b83a98
