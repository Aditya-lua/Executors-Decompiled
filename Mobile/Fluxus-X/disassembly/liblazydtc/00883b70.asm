; FUN_00883b70 @ 00883b70
00883b70	stp x29,x30,[sp, #-0x50]!
00883b74	stp x26,x25,[sp, #0x10]
00883b78	stp x24,x23,[sp, #0x20]
00883b7c	stp x22,x21,[sp, #0x30]
00883b80	stp x20,x19,[sp, #0x40]
00883b84	mov x29,sp
00883b88	ldp x25,x8,[x0, #0x8]
00883b8c	mov x19,x0
00883b90	mov x23,x1
00883b94	cmp x25,x8
00883b98	b.cs 0x00883ba8
00883b9c	ldr x8,[x23]
00883ba0	str x8,[x25], #0x8
00883ba4	b 0x00883c30
00883ba8	ldr x20,[x19]
00883bac	sub x22,x25,x20
00883bb0	asr x26,x22,#0x3
00883bb4	add x9,x26,#0x1
00883bb8	lsr x10,x9,#0x3d
00883bbc	cbnz x10,0x00883c4c
00883bc0	sub x21,x8,x20
00883bc4	orr x10,xzr,#0x7ffffffffffffff8
00883bc8	asr x8,x21,#0x2
00883bcc	cmp x8,x9
00883bd0	csel x8,x8,x9,hi
00883bd4	cmp x21,x10
00883bd8	mov x9,#0x1fffffffffffffff
00883bdc	csel x8,x8,x9,cc
00883be0	lsr x9,x8,#0x3d
00883be4	cbnz x9,0x00883c50
00883be8	lsl x24,x8,#0x3
00883bec	mov x0,x24
00883bf0	bl 0x00c2fed0
00883bf4	add x25,x0,x22
00883bf8	ldr x8,[x23]
00883bfc	add x24,x0,x24
00883c00	sub x23,x25,x26, LSL #0x3
00883c04	mov x1,x20
00883c08	mov x2,x22
00883c0c	str x8,[x25], #0x8
00883c10	mov x0,x23
00883c14	bl 0x00c2ffd0
00883c18	stp x23,x25,[x19]
00883c1c	str x24,[x19, #0x10]
00883c20	cbz x20,0x00883c30
00883c24	mov x0,x20
00883c28	mov x1,x21
00883c2c	bl 0x00c2fe80
00883c30	str x25,[x19, #0x8]
00883c34	ldp x20,x19,[sp, #0x40]
00883c38	ldp x22,x21,[sp, #0x30]
00883c3c	ldp x24,x23,[sp, #0x20]
00883c40	ldp x26,x25,[sp, #0x10]
00883c44	ldp x29,x30,[sp], #0x50
00883c48	ret
00883c4c	bl 0x00883b5c
00883c50	bl 0x007fe1b8
