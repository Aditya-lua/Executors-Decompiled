; mbedtls_mpi_sub_int @ 00b7f448
00b7f448	sub sp,sp,#0x40
00b7f44c	str x19,[sp, #0x20]
00b7f450	stp x29,x30,[sp, #0x30]
00b7f454	add x29,sp,#0x30
00b7f458	mrs x19,tpidr_el0
00b7f45c	ldr x8,[x19, #0x28]
00b7f460	cmp x2,#0x0
00b7f464	asr x9,x2,#0x3f
00b7f468	cneg x10,x2,mi
00b7f46c	str x8,[sp, #0x18]
00b7f470	mov w8,#0x1
00b7f474	str x10,[sp, #0x10]
00b7f478	add x10,sp,#0x10
00b7f47c	orr w9,w9,#0x1
00b7f480	mov x2,sp
00b7f484	mov w3,#0xffffffff
00b7f488	strh w9,[sp, #0x8]
00b7f48c	strh w8,[sp, #0xa]
00b7f490	str x10,[sp]
00b7f494	bl 0x00b7f304
00b7f498	ldr x8,[x19, #0x28]
00b7f49c	ldr x9,[sp, #0x18]
00b7f4a0	cmp x8,x9
00b7f4a4	b.ne 0x00b7f4b8
00b7f4a8	ldp x29,x30,[sp, #0x30]
00b7f4ac	ldr x19,[sp, #0x20]
00b7f4b0	add sp,sp,#0x40
00b7f4b4	ret
00b7f4b8	bl 0x00c2fec0
