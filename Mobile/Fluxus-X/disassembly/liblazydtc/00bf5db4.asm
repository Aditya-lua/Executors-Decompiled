; FUN_00bf5db4 @ 00bf5db4
00bf5db4	paciasp
00bf5db8	sub sp,sp,#0x50
00bf5dbc	stp x29,x30,[sp, #0x20]
00bf5dc0	stp x22,x21,[sp, #0x30]
00bf5dc4	stp x20,x19,[sp, #0x40]
00bf5dc8	add x29,sp,#0x20
00bf5dcc	adrp x20,0xcb5000
00bf5dd0	mov x19,x1
00bf5dd4	mov x21,x0
00bf5dd8	ldr x20,[x20, #0xb98]
00bf5ddc	str x20,[sp, #0x8]
00bf5de0	ldar x8,[x20]
00bf5de4	cmn x8,#0x1
00bf5de8	b.eq 0x00bf5e14
00bf5dec	add x8,sp,#0x8
00bf5df0	sub x9,x29,#0x8
00bf5df4	adrp x0,0xcb5000
00bf5df8	stur x8,[x29, #-0x8]
00bf5dfc	nop
00bf5e00	adr x2,0xc0bab0
00bf5e04	str x9,[sp, #0x10]
00bf5e08	add x1,sp,#0x10
00bf5e0c	ldr x0,[x0, #0xb98]
00bf5e10	bl 0x00c305d0
00bf5e14	ldrsw x8,[x20, #0x8]
00bf5e18	add x1,x19,#0x8
00bf5e1c	mov w0,#0x1
00bf5e20	sub x22,x8,#0x1
00bf5e24	bl 0x00c2bce0
00bf5e28	mov x20,x21
00bf5e2c	ldp x8,x9,[x20, #0x10]!
00bf5e30	sub x9,x9,x8
00bf5e34	asr x10,x9,#0x3
00bf5e38	cmp x10,x22
00bf5e3c	b.hi 0x00bf5e68
00bf5e40	add x9,x22,#0x1
00bf5e44	subs x1,x9,x10
00bf5e48	b.ls 0x00bf5e5c
00bf5e4c	mov x0,x20
00bf5e50	bl 0x00c0b6e4
00bf5e54	ldr x8,[x20]
00bf5e58	b 0x00bf5e68
00bf5e5c	b.cs 0x00bf5e68
00bf5e60	add x9,x8,x9, LSL #0x3
00bf5e64	str x9,[x21, #0x18]
00bf5e68	ldr x21,[x8, x22, LSL #0x3]
00bf5e6c	cbz x21,0x00bf5e90
00bf5e70	add x1,x21,#0x8
00bf5e74	mov x0,#-0x1
00bf5e78	bl 0x00c2bd10
00bf5e7c	cbnz x0,0x00bf5e90
00bf5e80	ldr x8,[x21]
00bf5e84	mov x0,x21
00bf5e88	ldr x8,[x8, #0x10]
00bf5e8c	blr x8
00bf5e90	ldr x8,[x20]
00bf5e94	str x19,[x8, x22, LSL #0x3]
00bf5e98	ldp x20,x19,[sp, #0x40]
00bf5e9c	ldp x22,x21,[sp, #0x30]
00bf5ea0	ldp x29,x30,[sp, #0x20]
00bf5ea4	add sp,sp,#0x50
00bf5ea8	autiasp
00bf5eac	ret
