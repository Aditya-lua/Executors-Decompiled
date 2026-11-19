; FUN_00bf9d94 @ 00bf9d94
00bf9d94	paciasp
00bf9d98	sub sp,sp,#0x50
00bf9d9c	stp x29,x30,[sp, #0x20]
00bf9da0	stp x22,x21,[sp, #0x30]
00bf9da4	stp x20,x19,[sp, #0x40]
00bf9da8	add x29,sp,#0x20
00bf9dac	adrp x20,0xcb5000
00bf9db0	mov x19,x1
00bf9db4	mov x21,x0
00bf9db8	ldr x20,[x20, #0xba0]
00bf9dbc	str x20,[sp, #0x8]
00bf9dc0	ldar x8,[x20]
00bf9dc4	cmn x8,#0x1
00bf9dc8	b.eq 0x00bf9df4
00bf9dcc	add x8,sp,#0x8
00bf9dd0	sub x9,x29,#0x8
00bf9dd4	adrp x0,0xcb5000
00bf9dd8	stur x8,[x29, #-0x8]
00bf9ddc	nop
00bf9de0	adr x2,0xc0bab0
00bf9de4	str x9,[sp, #0x10]
00bf9de8	add x1,sp,#0x10
00bf9dec	ldr x0,[x0, #0xba0]
00bf9df0	bl 0x00c305d0
00bf9df4	ldp x8,x10,[x19, #0x10]
00bf9df8	ldrsw x9,[x20, #0x8]
00bf9dfc	sub x22,x9,#0x1
00bf9e00	sub x9,x10,x8
00bf9e04	cmp x22,x9, ASR #0x3
00bf9e08	b.cs 0x00bf9ea8
00bf9e0c	ldr x19,[x8, x22, LSL #0x3]
00bf9e10	cbz x19,0x00bf9ea8
00bf9e14	add x1,x19,#0x8
00bf9e18	mov w0,#0x1
00bf9e1c	bl 0x00c2bce0
00bf9e20	mov x20,x21
00bf9e24	ldp x8,x9,[x20, #0x10]!
00bf9e28	sub x9,x9,x8
00bf9e2c	asr x10,x9,#0x3
00bf9e30	cmp x10,x22
00bf9e34	b.hi 0x00bf9e60
00bf9e38	add x9,x22,#0x1
00bf9e3c	subs x1,x9,x10
00bf9e40	b.ls 0x00bf9e54
00bf9e44	mov x0,x20
00bf9e48	bl 0x00c0b6e4
00bf9e4c	ldr x8,[x20]
00bf9e50	b 0x00bf9e60
00bf9e54	b.cs 0x00bf9e60
00bf9e58	add x9,x8,x9, LSL #0x3
00bf9e5c	str x9,[x21, #0x18]
00bf9e60	ldr x21,[x8, x22, LSL #0x3]
00bf9e64	cbz x21,0x00bf9e88
00bf9e68	add x1,x21,#0x8
00bf9e6c	mov x0,#-0x1
00bf9e70	bl 0x00c2bd10
00bf9e74	cbnz x0,0x00bf9e88
00bf9e78	ldr x8,[x21]
00bf9e7c	mov x0,x21
00bf9e80	ldr x8,[x8, #0x10]
00bf9e84	blr x8
00bf9e88	ldr x8,[x20]
00bf9e8c	str x19,[x8, x22, LSL #0x3]
00bf9e90	ldp x20,x19,[sp, #0x40]
00bf9e94	ldp x22,x21,[sp, #0x30]
00bf9e98	ldp x29,x30,[sp, #0x20]
00bf9e9c	add sp,sp,#0x50
00bf9ea0	autiasp
00bf9ea4	ret
00bf9ea8	bl 0x00bd8968
