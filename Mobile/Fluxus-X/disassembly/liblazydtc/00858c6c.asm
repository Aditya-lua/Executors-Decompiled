; FUN_00858c6c @ 00858c6c
00858c6c	stp x29,x30,[sp, #-0x50]!
00858c70	stp x26,x25,[sp, #0x10]
00858c74	stp x24,x23,[sp, #0x20]
00858c78	stp x22,x21,[sp, #0x30]
00858c7c	stp x20,x19,[sp, #0x40]
00858c80	mov x29,sp
00858c84	ldp x25,x8,[x0, #0x8]
00858c88	mov x19,x0
00858c8c	mov x23,x1
00858c90	cmp x25,x8
00858c94	b.cs 0x00858ca4
00858c98	ldr x8,[x23]
00858c9c	str x8,[x25], #0x8
00858ca0	b 0x00858d2c
00858ca4	ldr x20,[x19]
00858ca8	sub x22,x25,x20
00858cac	asr x26,x22,#0x3
00858cb0	add x9,x26,#0x1
00858cb4	lsr x10,x9,#0x3d
00858cb8	cbnz x10,0x00858d48
00858cbc	sub x21,x8,x20
00858cc0	orr x10,xzr,#0x7ffffffffffffff8
00858cc4	asr x8,x21,#0x2
00858cc8	cmp x8,x9
00858ccc	csel x8,x8,x9,hi
00858cd0	cmp x21,x10
00858cd4	mov x9,#0x1fffffffffffffff
00858cd8	csel x8,x8,x9,cc
00858cdc	lsr x9,x8,#0x3d
00858ce0	cbnz x9,0x00858d4c
00858ce4	lsl x24,x8,#0x3
00858ce8	mov x0,x24
00858cec	bl 0x00c2fed0
00858cf0	add x25,x0,x22
00858cf4	ldr x8,[x23]
00858cf8	add x24,x0,x24
00858cfc	sub x23,x25,x26, LSL #0x3
00858d00	mov x1,x20
00858d04	mov x2,x22
00858d08	str x8,[x25], #0x8
00858d0c	mov x0,x23
00858d10	bl 0x00c2ffd0
00858d14	stp x23,x25,[x19]
00858d18	str x24,[x19, #0x10]
00858d1c	cbz x20,0x00858d2c
00858d20	mov x0,x20
00858d24	mov x1,x21
00858d28	bl 0x00c2fe80
00858d2c	str x25,[x19, #0x8]
00858d30	ldp x20,x19,[sp, #0x40]
00858d34	ldp x22,x21,[sp, #0x30]
00858d38	ldp x24,x23,[sp, #0x20]
00858d3c	ldp x26,x25,[sp, #0x10]
00858d40	ldp x29,x30,[sp], #0x50
00858d44	ret
00858d48	bl 0x0086f7a0
00858d4c	bl 0x007fe1b8
