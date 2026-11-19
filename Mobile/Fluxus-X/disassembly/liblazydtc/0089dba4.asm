; FUN_0089dba4 @ 0089dba4
0089dba4	stp x29,x30,[sp, #-0x50]!
0089dba8	str x25,[sp, #0x10]
0089dbac	stp x24,x23,[sp, #0x20]
0089dbb0	stp x22,x21,[sp, #0x30]
0089dbb4	stp x20,x19,[sp, #0x40]
0089dbb8	mov x29,sp
0089dbbc	ldp x8,x9,[x0, #0x8]
0089dbc0	mov x19,x0
0089dbc4	mov x21,x1
0089dbc8	cmp x8,x9
0089dbcc	b.cs 0x0089dbe8
0089dbd0	ldp q1,q0,[x21]
0089dbd4	ldr x9,[x21, #0x20]
0089dbd8	add x21,x8,#0x28
0089dbdc	str x9,[x8, #0x20]
0089dbe0	stp q1,q0,[x8]
0089dbe4	b 0x0089dc98
0089dbe8	ldr x20,[x19]
0089dbec	orr x11,xzr,#-0x3333333333333334
0089dbf0	mov x10,#0x1
0089dbf4	movk x11,#0xcccd
0089dbf8	sub x23,x8,x20
0089dbfc	asr x8,x23,#0x3
0089dc00	madd x10,x8,x11,x10
0089dc04	orr x8,xzr,#0x6666666666666666
0089dc08	movk x8,#0x666, LSL #48
0089dc0c	cmp x10,x8
0089dc10	b.hi 0x0089dcb4
0089dc14	sub x22,x9,x20
0089dc18	orr x12,xzr,#0x3333333333333333
0089dc1c	asr x9,x22,#0x3
0089dc20	movk x12,#0x333, LSL #48
0089dc24	mul x9,x9,x11
0089dc28	lsl x11,x9,#0x1
0089dc2c	cmp x11,x10
0089dc30	csel x10,x11,x10,hi
0089dc34	cmp x9,x12
0089dc38	csel x9,x10,x8,cc
0089dc3c	cmp x9,x8
0089dc40	b.hi 0x0089dcb8
0089dc44	add x8,x9,x9, LSL #0x2
0089dc48	lsl x24,x8,#0x3
0089dc4c	mov x0,x24
0089dc50	bl 0x00c2fed0
0089dc54	ldp q0,q1,[x21]
0089dc58	add x8,x0,x23
0089dc5c	ldr x9,[x21, #0x20]
0089dc60	mov x1,x20
0089dc64	mov x2,x23
0089dc68	mov x25,x0
0089dc6c	add x24,x0,x24
0089dc70	add x21,x8,#0x28
0089dc74	stp q0,q1,[x8]
0089dc78	str x9,[x8, #0x20]
0089dc7c	bl 0x00c2ffd0
0089dc80	stp x25,x21,[x19]
0089dc84	str x24,[x19, #0x10]
0089dc88	cbz x20,0x0089dc98
0089dc8c	mov x0,x20
0089dc90	mov x1,x22
0089dc94	bl 0x00c2fe80
0089dc98	str x21,[x19, #0x8]
0089dc9c	ldp x20,x19,[sp, #0x40]
0089dca0	ldr x25,[sp, #0x10]
0089dca4	ldp x22,x21,[sp, #0x30]
0089dca8	ldp x24,x23,[sp, #0x20]
0089dcac	ldp x29,x30,[sp], #0x50
0089dcb0	ret
0089dcb4	bl 0x0089f5b8
0089dcb8	bl 0x007fe1b8
