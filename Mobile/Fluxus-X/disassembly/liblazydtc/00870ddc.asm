; FUN_00870ddc @ 00870ddc
00870ddc	stp x29,x30,[sp, #-0x50]!
00870de0	stp x26,x25,[sp, #0x10]
00870de4	stp x24,x23,[sp, #0x20]
00870de8	stp x22,x21,[sp, #0x30]
00870dec	stp x20,x19,[sp, #0x40]
00870df0	mov x29,sp
00870df4	ldp x25,x8,[x0, #0x8]
00870df8	mov x19,x0
00870dfc	mov x23,x1
00870e00	cmp x25,x8
00870e04	b.cs 0x00870e14
00870e08	ldr x8,[x23]
00870e0c	str x8,[x25], #0x8
00870e10	b 0x00870e9c
00870e14	ldr x20,[x19]
00870e18	sub x22,x25,x20
00870e1c	asr x26,x22,#0x3
00870e20	add x9,x26,#0x1
00870e24	lsr x10,x9,#0x3d
00870e28	cbnz x10,0x00870eb8
00870e2c	sub x21,x8,x20
00870e30	orr x10,xzr,#0x7ffffffffffffff8
00870e34	asr x8,x21,#0x2
00870e38	cmp x8,x9
00870e3c	csel x8,x8,x9,hi
00870e40	cmp x21,x10
00870e44	mov x9,#0x1fffffffffffffff
00870e48	csel x8,x8,x9,cc
00870e4c	lsr x9,x8,#0x3d
00870e50	cbnz x9,0x00870ebc
00870e54	lsl x24,x8,#0x3
00870e58	mov x0,x24
00870e5c	bl 0x00c2fed0
00870e60	add x25,x0,x22
00870e64	ldr x8,[x23]
00870e68	add x24,x0,x24
00870e6c	sub x23,x25,x26, LSL #0x3
00870e70	mov x1,x20
00870e74	mov x2,x22
00870e78	str x8,[x25], #0x8
00870e7c	mov x0,x23
00870e80	bl 0x00c2ffd0
00870e84	stp x23,x25,[x19]
00870e88	str x24,[x19, #0x10]
00870e8c	cbz x20,0x00870e9c
00870e90	mov x0,x20
00870e94	mov x1,x21
00870e98	bl 0x00c2fe80
00870e9c	str x25,[x19, #0x8]
00870ea0	ldp x20,x19,[sp, #0x40]
00870ea4	ldp x22,x21,[sp, #0x30]
00870ea8	ldp x24,x23,[sp, #0x20]
00870eac	ldp x26,x25,[sp, #0x10]
00870eb0	ldp x29,x30,[sp], #0x50
00870eb4	ret
00870eb8	bl 0x00870ec0
00870ebc	bl 0x007fe1b8
