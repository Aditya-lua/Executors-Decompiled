; mbedtls_mpi_lset @ 00b7d920
00b7d920	str x23,[sp, #-0x40]!
00b7d924	stp x22,x21,[sp, #0x10]
00b7d928	stp x20,x19,[sp, #0x20]
00b7d92c	stp x29,x30,[sp, #0x30]
00b7d930	add x29,sp,#0x30
00b7d934	ldrh w23,[x0, #0xa]
00b7d938	mov x19,x0
00b7d93c	mov x20,x1
00b7d940	cbz x23,0x00b7d950
00b7d944	ldr x21,[x19]
00b7d948	lsl x2,x23,#0x3
00b7d94c	b 0x00b7d99c
00b7d950	mov w0,#0x1
00b7d954	mov w1,#0x8
00b7d958	bl 0x00c30a30
00b7d95c	mov x21,x0
00b7d960	cbz x0,0x00b7d9dc
00b7d964	ldr x22,[x19]
00b7d968	cbz x22,0x00b7d98c
00b7d96c	lsl x23,x23,#0x3
00b7d970	mov x0,x21
00b7d974	mov x1,x22
00b7d978	mov x2,x23
00b7d97c	bl 0x00c2ffd0
00b7d980	mov x0,x22
00b7d984	mov x1,x23
00b7d988	bl 0x00c42230
00b7d98c	mov w8,#0x1
00b7d990	mov w2,#0x8
00b7d994	str x21,[x19]
00b7d998	strh w8,[x19, #0xa]
00b7d99c	mov x0,x21
00b7d9a0	mov w1,wzr
00b7d9a4	bl 0x00c301c0
00b7d9a8	ldr x8,[x19]
00b7d9ac	cmp x20,#0x0
00b7d9b0	asr x9,x20,#0x3f
00b7d9b4	mov w0,wzr
00b7d9b8	cneg x10,x20,mi
00b7d9bc	orr w9,w9,#0x1
00b7d9c0	str x10,[x8]
00b7d9c4	strh w9,[x19, #0x8]
00b7d9c8	ldp x29,x30,[sp, #0x30]
00b7d9cc	ldp x20,x19,[sp, #0x20]
00b7d9d0	ldp x22,x21,[sp, #0x10]
00b7d9d4	ldr x23,[sp], #0x40
00b7d9d8	ret
00b7d9dc	orr w0,wzr,#0xfffffff0
00b7d9e0	b 0x00b7d9c8
