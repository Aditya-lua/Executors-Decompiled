; FUN_00871cec @ 00871cec
00871cec	stp x29,x30,[sp, #-0x50]!
00871cf0	stp x26,x25,[sp, #0x10]
00871cf4	stp x24,x23,[sp, #0x20]
00871cf8	stp x22,x21,[sp, #0x30]
00871cfc	stp x20,x19,[sp, #0x40]
00871d00	mov x29,sp
00871d04	ldp x25,x8,[x0, #0x8]
00871d08	mov x19,x0
00871d0c	mov x23,x1
00871d10	cmp x25,x8
00871d14	b.cs 0x00871d24
00871d18	ldr x8,[x23]
00871d1c	str x8,[x25], #0x8
00871d20	b 0x00871dac
00871d24	ldr x20,[x19]
00871d28	sub x22,x25,x20
00871d2c	asr x26,x22,#0x3
00871d30	add x9,x26,#0x1
00871d34	lsr x10,x9,#0x3d
00871d38	cbnz x10,0x00871dc8
00871d3c	sub x21,x8,x20
00871d40	orr x10,xzr,#0x7ffffffffffffff8
00871d44	asr x8,x21,#0x2
00871d48	cmp x8,x9
00871d4c	csel x8,x8,x9,hi
00871d50	cmp x21,x10
00871d54	mov x9,#0x1fffffffffffffff
00871d58	csel x8,x8,x9,cc
00871d5c	lsr x9,x8,#0x3d
00871d60	cbnz x9,0x00871dcc
00871d64	lsl x24,x8,#0x3
00871d68	mov x0,x24
00871d6c	bl 0x00c2fed0
00871d70	add x25,x0,x22
00871d74	ldr x8,[x23]
00871d78	add x24,x0,x24
00871d7c	sub x23,x25,x26, LSL #0x3
00871d80	mov x1,x20
00871d84	mov x2,x22
00871d88	str x8,[x25], #0x8
00871d8c	mov x0,x23
00871d90	bl 0x00c2ffd0
00871d94	stp x23,x25,[x19]
00871d98	str x24,[x19, #0x10]
00871d9c	cbz x20,0x00871dac
00871da0	mov x0,x20
00871da4	mov x1,x21
00871da8	bl 0x00c2fe80
00871dac	str x25,[x19, #0x8]
00871db0	ldp x20,x19,[sp, #0x40]
00871db4	ldp x22,x21,[sp, #0x30]
00871db8	ldp x24,x23,[sp, #0x20]
00871dbc	ldp x26,x25,[sp, #0x10]
00871dc0	ldp x29,x30,[sp], #0x50
00871dc4	ret
00871dc8	bl 0x00871dd0
00871dcc	bl 0x007fe1b8
