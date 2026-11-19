; mbedtls_ecp_group_init @ 00b919ac
00b919ac	str x19,[sp, #-0x20]!
00b919b0	stp x29,x30,[sp, #0x10]
00b919b4	add x29,sp,#0x10
00b919b8	mov x19,x0
00b919bc	str wzr,[x0], #0x8
00b919c0	bl 0x00c41c00
00b919c4	add x0,x19,#0x18
00b919c8	bl 0x00c41c00
00b919cc	add x0,x19,#0x28
00b919d0	bl 0x00c41c00
00b919d4	add x0,x19,#0x38
00b919d8	bl 0x00c41c00
00b919dc	add x0,x19,#0x48
00b919e0	bl 0x00c41c00
00b919e4	add x0,x19,#0x58
00b919e8	bl 0x00c41c00
00b919ec	add x0,x19,#0x68
00b919f0	bl 0x00c41c00
00b919f4	stp xzr,xzr,[x19, #0x78]
00b919f8	str wzr,[x19, #0x88]
00b919fc	stp xzr,xzr,[x19, #0xb0]
00b91a00	stp xzr,xzr,[x19, #0xa0]
00b91a04	stp xzr,xzr,[x19, #0x90]
00b91a08	ldp x29,x30,[sp, #0x10]
00b91a0c	ldr x19,[sp], #0x20
00b91a10	ret
