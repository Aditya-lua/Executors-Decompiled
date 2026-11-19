; FUN_00bc5e50 @ 00bc5e50
00bc5e50	paciasp
00bc5e54	stp x29,x30,[sp, #-0x30]!
00bc5e58	str x21,[sp, #0x10]
00bc5e5c	stp x20,x19,[sp, #0x20]
00bc5e60	mov x29,sp
00bc5e64	ldr x9,[x0]
00bc5e68	ldrb w8,[x0]
00bc5e6c	mov x7,x1
00bc5e70	mov x20,x2
00bc5e74	mov x19,x0
00bc5e78	and x10,x9,#-0x2
00bc5e7c	tst w8,#0x1
00bc5e80	mov w8,#0x4
00bc5e84	sub x10,x10,#0x1
00bc5e88	csel x1,x8,x10,eq
00bc5e8c	and w8,w9,#0xff
00bc5e90	subs x2,x2,x1
00bc5e94	b.ls 0x00bc5ec0
00bc5e98	ldr x10,[x19, #0x8]
00bc5e9c	ubfx x9,x9,#0x1,#0x7
00bc5ea0	tst w8,#0x1
00bc5ea4	mov x0,x19
00bc5ea8	mov x4,xzr
00bc5eac	mov x6,x20
00bc5eb0	csel x3,x9,x10,eq
00bc5eb4	mov x5,x3
00bc5eb8	bl 0x00c43d40
00bc5ebc	b 0x00bc5f00
00bc5ec0	ldr x9,[x19, #0x10]
00bc5ec4	add x10,x19,#0x4
00bc5ec8	tst w8,#0x1
00bc5ecc	csel x21,x10,x9,eq
00bc5ed0	cbz x20,0x00bc5ee8
00bc5ed4	lsl x2,x20,#0x2
00bc5ed8	mov x0,x21
00bc5edc	mov x1,x7
00bc5ee0	bl 0x00c2ff60
00bc5ee4	ldrb w8,[x19]
00bc5ee8	tbnz w8,#0x0,0x00bc5ef8
00bc5eec	lsl w8,w20,#0x1
00bc5ef0	strb w8,[x19]
00bc5ef4	b 0x00bc5efc
00bc5ef8	str x20,[x19, #0x8]
00bc5efc	str wzr,[x21, x20, LSL #0x2]
00bc5f00	mov x0,x19
00bc5f04	ldp x20,x19,[sp, #0x20]
00bc5f08	ldr x21,[sp, #0x10]
00bc5f0c	ldp x29,x30,[sp], #0x30
00bc5f10	autiasp
00bc5f14	ret
