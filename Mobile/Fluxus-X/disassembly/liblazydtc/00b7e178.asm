; mbedtls_mpi_add_int @ 00b7e178
00b7e178	sub sp,sp,#0x40
00b7e17c	str x19,[sp, #0x20]
00b7e180	stp x29,x30,[sp, #0x30]
00b7e184	add x29,sp,#0x30
00b7e188	mrs x19,tpidr_el0
00b7e18c	ldr x8,[x19, #0x28]
00b7e190	cmp x2,#0x0
00b7e194	asr x9,x2,#0x3f
00b7e198	cneg x10,x2,mi
00b7e19c	str x8,[sp, #0x18]
00b7e1a0	mov w8,#0x1
00b7e1a4	str x10,[sp, #0x10]
00b7e1a8	add x10,sp,#0x10
00b7e1ac	orr w9,w9,#0x1
00b7e1b0	mov x2,sp
00b7e1b4	mov w3,#0x1
00b7e1b8	strh w9,[sp, #0x8]
00b7e1bc	strh w8,[sp, #0xa]
00b7e1c0	str x10,[sp]
00b7e1c4	bl 0x00b7f304
00b7e1c8	ldr x8,[x19, #0x28]
00b7e1cc	ldr x9,[sp, #0x18]
00b7e1d0	cmp x8,x9
00b7e1d4	b.ne 0x00b7e1e8
00b7e1d8	ldp x29,x30,[sp, #0x30]
00b7e1dc	ldr x19,[sp, #0x20]
00b7e1e0	add sp,sp,#0x40
00b7e1e4	ret
00b7e1e8	bl 0x00c2fec0
