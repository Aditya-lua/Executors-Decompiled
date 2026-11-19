; mbedtls_mpi_write_file @ 00b7e8d0
00b7e8d0	stp x28,x25,[sp, #-0x50]!
00b7e8d4	stp x24,x23,[sp, #0x10]
00b7e8d8	stp x22,x21,[sp, #0x20]
00b7e8dc	stp x20,x19,[sp, #0x30]
00b7e8e0	stp x29,x30,[sp, #0x40]
00b7e8e4	add x29,sp,#0x40
00b7e8e8	sub sp,sp,#0x9d0
00b7e8ec	mrs x24,tpidr_el0
00b7e8f0	ldr x8,[x24, #0x28]
00b7e8f4	sub w9,w2,#0x2
00b7e8f8	mov x20,x3
00b7e8fc	mov w19,w2
00b7e900	mov x22,x1
00b7e904	mov x21,x0
00b7e908	cmp w9,#0xe
00b7e90c	stur x8,[x29, #-0x48]
00b7e910	b.ls 0x00b7e91c
00b7e914	orr w19,wzr,#0xfffffffc
00b7e918	b 0x00b7e9dc
00b7e91c	add x0,sp,#0x14
00b7e920	mov w2,#0x9b4
00b7e924	mov w1,wzr
00b7e928	add x25,sp,#0x14
00b7e92c	bl 0x00c301c0
00b7e930	add x2,sp,#0x14
00b7e934	mov w3,#0x9b2
00b7e938	add x4,sp,#0x8
00b7e93c	mov x0,x22
00b7e940	mov w1,w19
00b7e944	bl 0x00c41da0
00b7e948	mov w19,w0
00b7e94c	cbnz w0,0x00b7e9dc
00b7e950	adrp x8,0x2ab000
00b7e954	add x8,x8,#0x32c
00b7e958	cmp x21,#0x0
00b7e95c	csel x21,x8,x21,eq
00b7e960	mov x0,x21
00b7e964	bl 0x00c2ff50
00b7e968	mov x22,x0
00b7e96c	add x0,sp,#0x14
00b7e970	bl 0x00c2ff50
00b7e974	mov x23,x0
00b7e978	mov w8,#0xa0d
00b7e97c	strh w8,[x25, x0#0x0]
00b7e980	cbz x20,0x00b7e9c8
00b7e984	mov w1,#0x1
00b7e988	mov x0,x21
00b7e98c	mov x2,x22
00b7e990	mov x3,x20
00b7e994	bl 0x00c308f0
00b7e998	cmp x0,x22
00b7e99c	b.ne 0x00b7e9c0
00b7e9a0	add x21,x23,#0x2
00b7e9a4	add x0,sp,#0x14
00b7e9a8	mov w1,#0x1
00b7e9ac	mov x2,x21
00b7e9b0	mov x3,x20
00b7e9b4	bl 0x00c308f0
00b7e9b8	cmp x0,x21
00b7e9bc	b.eq 0x00b7e9dc
00b7e9c0	orr w19,wzr,#0xfffffffe
00b7e9c4	b 0x00b7e9dc
00b7e9c8	adrp x0,0x2a3000
00b7e9cc	add x0,x0,#0x68e
00b7e9d0	add x2,sp,#0x14
00b7e9d4	mov x1,x21
00b7e9d8	bl 0x00c41af0
00b7e9dc	ldr x8,[x24, #0x28]
00b7e9e0	ldur x9,[x29, #-0x48]
00b7e9e4	cmp x8,x9
00b7e9e8	b.ne 0x00b7ea0c
00b7e9ec	mov w0,w19
00b7e9f0	add sp,sp,#0x9d0
00b7e9f4	ldp x29,x30,[sp, #0x40]
00b7e9f8	ldp x20,x19,[sp, #0x30]
00b7e9fc	ldp x22,x21,[sp, #0x20]
00b7ea00	ldp x24,x23,[sp, #0x10]
00b7ea04	ldp x28,x25,[sp], #0x50
00b7ea08	ret
00b7ea0c	bl 0x00c2fec0
