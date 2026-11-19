; mbedtls_mpi_swap @ 00b7d8d0
00b7d8d0	sub sp,sp,#0x30
00b7d8d4	stp x29,x30,[sp, #0x20]
00b7d8d8	add x29,sp,#0x20
00b7d8dc	mrs x8,tpidr_el0
00b7d8e0	ldr x9,[x8, #0x28]
00b7d8e4	stur x9,[x29, #-0x8]
00b7d8e8	ldr q0,[x0]
00b7d8ec	str q0,[sp]
00b7d8f0	ldr q0,[x1]
00b7d8f4	str q0,[x0]
00b7d8f8	ldr q0,[sp]
00b7d8fc	str q0,[x1]
00b7d900	ldr x8,[x8, #0x28]
00b7d904	ldur x9,[x29, #-0x8]
00b7d908	cmp x8,x9
00b7d90c	b.ne 0x00b7d91c
00b7d910	ldp x29,x30,[sp, #0x20]
00b7d914	add sp,sp,#0x30
00b7d918	ret
00b7d91c	bl 0x00c2fec0
