; ossl_ec_GF2m_simple_point_copy @ 00a2a0c0
00a2a0c0	stp x20,x19,[sp, #-0x20]!
00a2a0c4	stp x29,x30,[sp, #0x10]
00a2a0c8	mov x20,x1
00a2a0cc	mov x19,x0
00a2a0d0	ldr x0,[x0, #0x10]
00a2a0d4	ldr x1,[x1, #0x10]
00a2a0d8	add x29,sp,#0x10
00a2a0dc	bl 0x00c36990
00a2a0e0	cbz x0,0x00a2a118
00a2a0e4	ldr x0,[x19, #0x18]
00a2a0e8	ldr x1,[x20, #0x18]
00a2a0ec	bl 0x00c36990
00a2a0f0	cbz x0,0x00a2a118
00a2a0f4	ldr x0,[x19, #0x20]
00a2a0f8	ldr x1,[x20, #0x20]
00a2a0fc	bl 0x00c36990
00a2a100	cbz x0,0x00a2a118
00a2a104	ldr w8,[x20, #0x28]
00a2a108	mov w0,#0x1
00a2a10c	str w8,[x19, #0x28]
00a2a110	ldr w8,[x20, #0x8]
00a2a114	str w8,[x19, #0x8]
00a2a118	ldp x29,x30,[sp, #0x10]
00a2a11c	ldp x20,x19,[sp], #0x20
00a2a120	ret
