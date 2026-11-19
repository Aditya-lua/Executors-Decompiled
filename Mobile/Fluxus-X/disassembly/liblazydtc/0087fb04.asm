; FUN_0087fb04 @ 0087fb04
0087fb04	stp x29,x30,[sp, #-0x40]!
0087fb08	str x23,[sp, #0x10]
0087fb0c	stp x22,x21,[sp, #0x20]
0087fb10	stp x20,x19,[sp, #0x30]
0087fb14	mov x29,sp
0087fb18	mov x21,x1
0087fb1c	mov x19,x0
0087fb20	mov x0,x1
0087fb24	mov w1,#0x25
0087fb28	mov x20,x2
0087fb2c	bl 0x00c300a0
0087fb30	cbz x0,0x0087fb6c
0087fb34	cbnz x20,0x0087fb44
0087fb38	b 0x0087fc14
0087fb3c	subs x20,x20,#0x1
0087fb40	b.eq 0x0087fc14
0087fb44	ldrb w22,[x21], #0x1
0087fb48	mov x0,x19
0087fb4c	mov w1,w22
0087fb50	bl 0x00c30150
0087fb54	cmp w22,#0x25
0087fb58	b.ne 0x0087fb3c
0087fb5c	mov x0,x19
0087fb60	mov w1,#0x25
0087fb64	bl 0x00c30150
0087fb68	b 0x0087fb3c
0087fb6c	ldp x8,x10,[x19]
0087fb70	ldrb w9,[x19]
0087fb74	tst w9,#0x1
0087fb78	mov w9,#0x16
0087fb7c	and x11,x8,#-0x2
0087fb80	ubfx x12,x8,#0x1,#0x7
0087fb84	sub x11,x11,#0x1
0087fb88	csel x1,x9,x11,eq
0087fb8c	tst x8,#0x1
0087fb90	csel x22,x12,x10,eq
0087fb94	sub x9,x1,x22
0087fb98	cmp x9,x20
0087fb9c	b.cs 0x0087fbd4
0087fba0	sub x8,x20,x1
0087fba4	mov x0,x19
0087fba8	mov x3,x22
0087fbac	add x2,x8,x22
0087fbb0	mov x4,x22
0087fbb4	mov x5,xzr
0087fbb8	mov x6,x20
0087fbbc	mov x7,x21
0087fbc0	ldp x20,x19,[sp, #0x30]
0087fbc4	ldr x23,[sp, #0x10]
0087fbc8	ldp x22,x21,[sp, #0x20]
0087fbcc	ldp x29,x30,[sp], #0x40
0087fbd0	b 0x00c30200
0087fbd4	cbz x20,0x0087fc14
0087fbd8	ldr x9,[x19, #0x10]
0087fbdc	tst x8,#0x1
0087fbe0	mov x1,x21
0087fbe4	mov x2,x20
0087fbe8	csinc x23,x9,x19,ne
0087fbec	add x0,x23,x22
0087fbf0	bl 0x00c2ff60
0087fbf4	ldrb w9,[x19]
0087fbf8	add x8,x22,x20
0087fbfc	tbnz w9,#0x0,0x0087fc0c
0087fc00	lsl w9,w8,#0x1
0087fc04	strb w9,[x19]
0087fc08	b 0x0087fc10
0087fc0c	str x8,[x19, #0x8]
0087fc10	strb wzr,[x23, x8]
0087fc14	ldp x20,x19,[sp, #0x30]
0087fc18	ldr x23,[sp, #0x10]
0087fc1c	ldp x22,x21,[sp, #0x20]
0087fc20	ldp x29,x30,[sp], #0x40
0087fc24	ret
