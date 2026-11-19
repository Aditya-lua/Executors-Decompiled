; FUN_00825c7c @ 00825c7c
00825c7c	stp x29,x30,[sp, #-0x40]!
00825c80	str x23,[sp, #0x10]
00825c84	stp x22,x21,[sp, #0x20]
00825c88	stp x20,x19,[sp, #0x30]
00825c8c	mov x29,sp
00825c90	mov x22,x0
00825c94	mov x20,x3
00825c98	mov x19,x0
00825c9c	ldr x8,[x22, #0x8]!
00825ca0	cbz x8,0x00825cf4
00825ca4	mov x21,x1
00825ca8	b 0x00825cb8
00825cac	ldr x8,[x23]
00825cb0	mov x22,x23
00825cb4	cbz x8,0x00825cf8
00825cb8	add x0,x19,#0x10
00825cbc	add x2,x8,#0x20
00825cc0	mov x1,x21
00825cc4	mov x23,x8
00825cc8	bl 0x00c30490
00825ccc	tbnz w0,#0x0,0x00825cac
00825cd0	add x0,x19,#0x10
00825cd4	add x1,x23,#0x20
00825cd8	mov x2,x21
00825cdc	bl 0x00c30490
00825ce0	tbz w0,#0x0,0x00825d78
00825ce4	mov x22,x23
00825ce8	ldr x8,[x22, #0x8]!
00825cec	cbnz x8,0x00825cb8
00825cf0	b 0x00825cf8
00825cf4	mov x23,x22
00825cf8	mov w0,#0x50
00825cfc	bl 0x00c2fed0
00825d00	ldr x8,[x20]
00825d04	mov x21,x0
00825d08	ldr q0,[x8]
00825d0c	ldr x9,[x8, #0x10]
00825d10	str q0,[x0, #0x20]
00825d14	str x9,[x0, #0x30]
00825d18	stp xzr,xzr,[x8]
00825d1c	str xzr,[x8, #0x10]
00825d20	ldr x8,[x19]
00825d24	stp xzr,xzr,[x0, #0x40]
00825d28	str xzr,[x0, #0x38]
00825d2c	stp xzr,xzr,[x0]
00825d30	str x0,[x22]
00825d34	ldr x8,[x8]
00825d38	str x23,[x0, #0x10]
00825d3c	cbz x8,0x00825d44
00825d40	str x8,[x19]
00825d44	ldr x0,[x19, #0x8]
00825d48	mov x1,x21
00825d4c	bl 0x00825dfc
00825d50	ldr x8,[x19, #0x10]
00825d54	mov w1,#0x1
00825d58	add x8,x8,#0x1
00825d5c	str x8,[x19, #0x10]
00825d60	mov x0,x21
00825d64	ldp x20,x19,[sp, #0x30]
00825d68	ldr x23,[sp, #0x10]
00825d6c	ldp x22,x21,[sp, #0x20]
00825d70	ldp x29,x30,[sp], #0x40
00825d74	ret
00825d78	ldr x21,[x22]
00825d7c	cbz x21,0x00825cf8
00825d80	mov x1,xzr
00825d84	b 0x00825d60
