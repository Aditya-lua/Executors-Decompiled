; FUN_00899d1c @ 00899d1c
00899d1c	stp x29,x30,[sp, #-0x50]!
00899d20	stp x26,x25,[sp, #0x10]
00899d24	stp x24,x23,[sp, #0x20]
00899d28	stp x22,x21,[sp, #0x30]
00899d2c	stp x20,x19,[sp, #0x40]
00899d30	mov x29,sp
00899d34	ldp x25,x8,[x0, #0x8]
00899d38	mov x19,x0
00899d3c	mov x23,x1
00899d40	cmp x25,x8
00899d44	b.cs 0x00899d54
00899d48	ldr x8,[x23]
00899d4c	str x8,[x25], #0x8
00899d50	b 0x00899ddc
00899d54	ldr x20,[x19]
00899d58	sub x22,x25,x20
00899d5c	asr x26,x22,#0x3
00899d60	add x9,x26,#0x1
00899d64	lsr x10,x9,#0x3d
00899d68	cbnz x10,0x00899df8
00899d6c	sub x21,x8,x20
00899d70	orr x10,xzr,#0x7ffffffffffffff8
00899d74	asr x8,x21,#0x2
00899d78	cmp x8,x9
00899d7c	csel x8,x8,x9,hi
00899d80	cmp x21,x10
00899d84	mov x9,#0x1fffffffffffffff
00899d88	csel x8,x8,x9,cc
00899d8c	lsr x9,x8,#0x3d
00899d90	cbnz x9,0x00899dfc
00899d94	lsl x24,x8,#0x3
00899d98	mov x0,x24
00899d9c	bl 0x00c2fed0
00899da0	add x25,x0,x22
00899da4	ldr x8,[x23]
00899da8	add x24,x0,x24
00899dac	sub x23,x25,x26, LSL #0x3
00899db0	mov x1,x20
00899db4	mov x2,x22
00899db8	str x8,[x25], #0x8
00899dbc	mov x0,x23
00899dc0	bl 0x00c2ffd0
00899dc4	stp x23,x25,[x19]
00899dc8	str x24,[x19, #0x10]
00899dcc	cbz x20,0x00899ddc
00899dd0	mov x0,x20
00899dd4	mov x1,x21
00899dd8	bl 0x00c2fe80
00899ddc	str x25,[x19, #0x8]
00899de0	ldp x20,x19,[sp, #0x40]
00899de4	ldp x22,x21,[sp, #0x30]
00899de8	ldp x24,x23,[sp, #0x20]
00899dec	ldp x26,x25,[sp, #0x10]
00899df0	ldp x29,x30,[sp], #0x50
00899df4	ret
00899df8	bl 0x0089a058
00899dfc	bl 0x007fe1b8
