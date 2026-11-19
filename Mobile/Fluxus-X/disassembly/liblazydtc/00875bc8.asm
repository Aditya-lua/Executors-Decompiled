; FUN_00875bc8 @ 00875bc8
00875bc8	stp x29,x30,[sp, #-0x50]!
00875bcc	stp x26,x25,[sp, #0x10]
00875bd0	stp x24,x23,[sp, #0x20]
00875bd4	stp x22,x21,[sp, #0x30]
00875bd8	stp x20,x19,[sp, #0x40]
00875bdc	mov x29,sp
00875be0	ldp x25,x8,[x0, #0x8]
00875be4	mov x19,x0
00875be8	mov x23,x1
00875bec	cmp x25,x8
00875bf0	b.cs 0x00875c00
00875bf4	ldr w8,[x23]
00875bf8	str w8,[x25], #0x4
00875bfc	b 0x00875c88
00875c00	ldr x20,[x19]
00875c04	sub x22,x25,x20
00875c08	asr x26,x22,#0x2
00875c0c	add x9,x26,#0x1
00875c10	lsr x10,x9,#0x3e
00875c14	cbnz x10,0x00875ca4
00875c18	sub x21,x8,x20
00875c1c	orr x10,xzr,#0x7ffffffffffffffc
00875c20	asr x8,x21,#0x1
00875c24	cmp x8,x9
00875c28	csel x8,x8,x9,hi
00875c2c	cmp x21,x10
00875c30	mov x9,#0x3fffffffffffffff
00875c34	csel x8,x8,x9,cc
00875c38	lsr x9,x8,#0x3e
00875c3c	cbnz x9,0x00875ca8
00875c40	lsl x24,x8,#0x2
00875c44	mov x0,x24
00875c48	bl 0x00c2fed0
00875c4c	add x25,x0,x22
00875c50	ldr w8,[x23]
00875c54	add x24,x0,x24
00875c58	sub x23,x25,x26, LSL #0x2
00875c5c	mov x1,x20
00875c60	mov x2,x22
00875c64	str w8,[x25], #0x4
00875c68	mov x0,x23
00875c6c	bl 0x00c2ffd0
00875c70	stp x23,x25,[x19]
00875c74	str x24,[x19, #0x10]
00875c78	cbz x20,0x00875c88
00875c7c	mov x0,x20
00875c80	mov x1,x21
00875c84	bl 0x00c2fe80
00875c88	str x25,[x19, #0x8]
00875c8c	ldp x20,x19,[sp, #0x40]
00875c90	ldp x22,x21,[sp, #0x30]
00875c94	ldp x24,x23,[sp, #0x20]
00875c98	ldp x26,x25,[sp, #0x10]
00875c9c	ldp x29,x30,[sp], #0x50
00875ca0	ret
00875ca4	bl 0x00879790
00875ca8	bl 0x007fe1b8
