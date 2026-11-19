; FUN_0081ec44 @ 0081ec44
0081ec44	stp x29,x30,[sp, #-0x50]!
0081ec48	stp x26,x25,[sp, #0x10]
0081ec4c	stp x24,x23,[sp, #0x20]
0081ec50	stp x22,x21,[sp, #0x30]
0081ec54	stp x20,x19,[sp, #0x40]
0081ec58	mov x29,sp
0081ec5c	adrp x25,0xcb4000
0081ec60	adrp x24,0xcb4000
0081ec64	mov x19,x0
0081ec68	ldr x25,[x25, #0x9a8]
0081ec6c	ldr x24,[x24, #0x9a0]
0081ec70	str xzr,[x0, #0xe8]
0081ec74	mov w21,w2
0081ec78	mov x22,x1
0081ec7c	mov x20,x0
0081ec80	ldp x8,x9,[x24, #0x8]
0081ec84	add x26,x25,#0x40
0081ec88	str x26,[x19, #0xb8]!
0081ec8c	str x8,[x0]
0081ec90	ldur x8,[x8, #-0x18]
0081ec94	str xzr,[x0, #0x8]
0081ec98	str x9,[x0, x8#0x0]
0081ec9c	ldr x8,[x0]
0081eca0	ldur x8,[x8, #-0x18]
0081eca4	add x23,x0,x8
0081eca8	add x1,x0,#0x10
0081ecac	mov x0,x23
0081ecb0	bl 0x00c30100
0081ecb4	mov w8,#0xffffffff
0081ecb8	add x9,x25,#0x18
0081ecbc	str xzr,[x23, #0x88]
0081ecc0	str w8,[x23, #0x90]
0081ecc4	str x9,[x20]
0081ecc8	str x26,[x20, #0xb8]
0081eccc	add x0,x20,#0x10
0081ecd0	bl 0x00c30110
0081ecd4	ldrb w8,[x22]
0081ecd8	ldr x9,[x22, #0x10]
0081ecdc	tst w8,#0x1
0081ece0	csinc x1,x9,x22,ne
0081ece4	add x0,x20,#0x10
0081ece8	orr w2,w21,#0x8
0081ecec	bl 0x00c30120
0081ecf0	cbnz x0,0x0081ed0c
0081ecf4	ldr x8,[x20]
0081ecf8	ldur x8,[x8, #-0x18]
0081ecfc	add x0,x20,x8
0081ed00	ldr w8,[x0, #0x20]
0081ed04	orr w1,w8,#0x4
0081ed08	bl 0x00c30130
0081ed0c	ldp x20,x19,[sp, #0x40]
0081ed10	ldp x22,x21,[sp, #0x30]
0081ed14	ldp x24,x23,[sp, #0x20]
0081ed18	ldp x26,x25,[sp, #0x10]
0081ed1c	ldp x29,x30,[sp], #0x50
0081ed20	ret
