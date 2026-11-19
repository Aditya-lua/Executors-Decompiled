; FUN_00871bec @ 00871bec
00871bec	stp x29,x30,[sp, #-0x50]!
00871bf0	str x25,[sp, #0x10]
00871bf4	stp x24,x23,[sp, #0x20]
00871bf8	stp x22,x21,[sp, #0x30]
00871bfc	stp x20,x19,[sp, #0x40]
00871c00	mov x29,sp
00871c04	ldp x8,x9,[x0, #0x8]
00871c08	mov x19,x0
00871c0c	mov x23,x1
00871c10	cmp x8,x9
00871c14	b.cs 0x00871c28
00871c18	ldp q1,q0,[x23]
00871c1c	add x24,x8,#0x20
00871c20	stp q1,q0,[x8]
00871c24	b 0x00871cb4
00871c28	ldr x20,[x19]
00871c2c	sub x22,x8,x20
00871c30	asr x25,x22,#0x5
00871c34	add x8,x25,#0x1
00871c38	lsr x10,x8,#0x3b
00871c3c	cbnz x10,0x00871cd0
00871c40	sub x21,x9,x20
00871c44	orr x10,xzr,#0x7fffffffffffffe0
00871c48	asr x9,x21,#0x4
00871c4c	cmp x9,x8
00871c50	csel x8,x9,x8,hi
00871c54	cmp x21,x10
00871c58	mov x9,#0x7ffffffffffffff
00871c5c	csel x8,x8,x9,cc
00871c60	lsr x9,x8,#0x3b
00871c64	cbnz x9,0x00871cd4
00871c68	lsl x24,x8,#0x5
00871c6c	mov x0,x24
00871c70	bl 0x00c2fed0
00871c74	add x8,x0,x22
00871c78	ldp q0,q1,[x23]
00871c7c	sub x23,x8,x25, LSL #0x5
00871c80	add x25,x0,x24
00871c84	mov x1,x20
00871c88	mov x2,x22
00871c8c	add x24,x8,#0x20
00871c90	mov x0,x23
00871c94	stp q0,q1,[x8]
00871c98	bl 0x00c2ffd0
00871c9c	stp x23,x24,[x19]
00871ca0	str x25,[x19, #0x10]
00871ca4	cbz x20,0x00871cb4
00871ca8	mov x0,x20
00871cac	mov x1,x21
00871cb0	bl 0x00c2fe80
00871cb4	str x24,[x19, #0x8]
00871cb8	ldp x20,x19,[sp, #0x40]
00871cbc	ldr x25,[sp, #0x10]
00871cc0	ldp x22,x21,[sp, #0x30]
00871cc4	ldp x24,x23,[sp, #0x20]
00871cc8	ldp x29,x30,[sp], #0x50
00871ccc	ret
00871cd0	bl 0x00871cd8
00871cd4	bl 0x007fe1b8
