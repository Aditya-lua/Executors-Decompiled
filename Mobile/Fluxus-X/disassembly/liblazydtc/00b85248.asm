; mbedtls_mpi_core_from_mont_rep @ 00b85248
00b85248	sub sp,sp,#0x30
00b8524c	str x19,[sp, #0x10]
00b85250	stp x29,x30,[sp, #0x20]
00b85254	add x29,sp,#0x20
00b85258	mrs x19,tpidr_el0
00b8525c	ldr x8,[x19, #0x28]
00b85260	mov x7,x5
00b85264	mov x6,x4
00b85268	mov x5,x3
00b8526c	mov x4,x2
00b85270	mov w9,#0x1
00b85274	mov x2,sp
00b85278	mov w3,#0x1
00b8527c	str x8,[sp, #0x8]
00b85280	str x9,[sp]
00b85284	bl 0x00c41e80
00b85288	ldr x8,[x19, #0x28]
00b8528c	ldr x9,[sp, #0x8]
00b85290	cmp x8,x9
00b85294	b.ne 0x00b852a8
00b85298	ldp x29,x30,[sp, #0x20]
00b8529c	ldr x19,[sp, #0x10]
00b852a0	add sp,sp,#0x30
00b852a4	ret
00b852a8	bl 0x00c2fec0
