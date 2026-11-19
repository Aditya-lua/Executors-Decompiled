; FUN_00874d58 @ 00874d58
00874d58	stp x29,x30,[sp, #-0x50]!
00874d5c	str x25,[sp, #0x10]
00874d60	stp x24,x23,[sp, #0x20]
00874d64	stp x22,x21,[sp, #0x30]
00874d68	stp x20,x19,[sp, #0x40]
00874d6c	mov x29,sp
00874d70	ldp x9,x8,[x0, #0x8]
00874d74	mov x19,x0
00874d78	mov x23,x1
00874d7c	cmp x9,x8
00874d80	b.cs 0x00874d94
00874d84	ldr q0,[x23]
00874d88	add x24,x9,#0x10
00874d8c	str q0,[x9]
00874d90	b 0x00874e20
00874d94	ldr x20,[x19]
00874d98	sub x22,x9,x20
00874d9c	asr x25,x22,#0x4
00874da0	add x9,x25,#0x1
00874da4	lsr x10,x9,#0x3c
00874da8	cbnz x10,0x00874e3c
00874dac	sub x21,x8,x20
00874db0	orr x10,xzr,#0x7ffffffffffffff0
00874db4	asr x8,x21,#0x3
00874db8	cmp x8,x9
00874dbc	csel x8,x8,x9,hi
00874dc0	cmp x21,x10
00874dc4	mov x9,#0xfffffffffffffff
00874dc8	csel x8,x8,x9,cc
00874dcc	lsr x9,x8,#0x3c
00874dd0	cbnz x9,0x00874e40
00874dd4	lsl x24,x8,#0x4
00874dd8	mov x0,x24
00874ddc	bl 0x00c2fed0
00874de0	add x8,x0,x22
00874de4	ldr q0,[x23]
00874de8	mov x1,x20
00874dec	sub x23,x8,x25, LSL #0x4
00874df0	add x25,x0,x24
00874df4	mov x2,x22
00874df8	str q0,[x8]
00874dfc	add x24,x8,#0x10
00874e00	mov x0,x23
00874e04	bl 0x00c2ffd0
00874e08	stp x23,x24,[x19]
00874e0c	str x25,[x19, #0x10]
00874e10	cbz x20,0x00874e20
00874e14	mov x0,x20
00874e18	mov x1,x21
00874e1c	bl 0x00c2fe80
00874e20	str x24,[x19, #0x8]
00874e24	ldp x20,x19,[sp, #0x40]
00874e28	ldr x25,[sp, #0x10]
00874e2c	ldp x22,x21,[sp, #0x30]
00874e30	ldp x24,x23,[sp, #0x20]
00874e34	ldp x29,x30,[sp], #0x50
00874e38	ret
00874e3c	bl 0x00879df8
00874e40	bl 0x007fe1b8
