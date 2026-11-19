; FUN_00870bec @ 00870bec
00870bec	stp x29,x30,[sp, #-0x50]!
00870bf0	stp x26,x25,[sp, #0x10]
00870bf4	stp x24,x23,[sp, #0x20]
00870bf8	stp x22,x21,[sp, #0x30]
00870bfc	stp x20,x19,[sp, #0x40]
00870c00	mov x29,sp
00870c04	ldp x25,x8,[x0, #0x8]
00870c08	mov x19,x0
00870c0c	mov x23,x1
00870c10	cmp x25,x8
00870c14	b.cs 0x00870c24
00870c18	ldr x8,[x23]
00870c1c	str x8,[x25], #0x8
00870c20	b 0x00870cac
00870c24	ldr x20,[x19]
00870c28	sub x22,x25,x20
00870c2c	asr x26,x22,#0x3
00870c30	add x9,x26,#0x1
00870c34	lsr x10,x9,#0x3d
00870c38	cbnz x10,0x00870cc8
00870c3c	sub x21,x8,x20
00870c40	orr x10,xzr,#0x7ffffffffffffff8
00870c44	asr x8,x21,#0x2
00870c48	cmp x8,x9
00870c4c	csel x8,x8,x9,hi
00870c50	cmp x21,x10
00870c54	mov x9,#0x1fffffffffffffff
00870c58	csel x8,x8,x9,cc
00870c5c	lsr x9,x8,#0x3d
00870c60	cbnz x9,0x00870ccc
00870c64	lsl x24,x8,#0x3
00870c68	mov x0,x24
00870c6c	bl 0x00c2fed0
00870c70	add x25,x0,x22
00870c74	ldr x8,[x23]
00870c78	add x24,x0,x24
00870c7c	sub x23,x25,x26, LSL #0x3
00870c80	mov x1,x20
00870c84	mov x2,x22
00870c88	str x8,[x25], #0x8
00870c8c	mov x0,x23
00870c90	bl 0x00c2ffd0
00870c94	stp x23,x25,[x19]
00870c98	str x24,[x19, #0x10]
00870c9c	cbz x20,0x00870cac
00870ca0	mov x0,x20
00870ca4	mov x1,x21
00870ca8	bl 0x00c2fe80
00870cac	str x25,[x19, #0x8]
00870cb0	ldp x20,x19,[sp, #0x40]
00870cb4	ldp x22,x21,[sp, #0x30]
00870cb8	ldp x24,x23,[sp, #0x20]
00870cbc	ldp x26,x25,[sp, #0x10]
00870cc0	ldp x29,x30,[sp], #0x50
00870cc4	ret
00870cc8	bl 0x00870cd0
00870ccc	bl 0x007fe1b8
