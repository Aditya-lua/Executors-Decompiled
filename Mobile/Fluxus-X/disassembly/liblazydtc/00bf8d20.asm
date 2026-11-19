; FUN_00bf8d20 @ 00bf8d20
00bf8d20	paciasp
00bf8d24	sub sp,sp,#0x50
00bf8d28	stp x29,x30,[sp, #0x20]
00bf8d2c	stp x22,x21,[sp, #0x30]
00bf8d30	stp x20,x19,[sp, #0x40]
00bf8d34	add x29,sp,#0x20
00bf8d38	adrp x20,0xcb5000
00bf8d3c	mov x19,x1
00bf8d40	mov x21,x0
00bf8d44	ldr x20,[x20, #0xca0]
00bf8d48	str x20,[sp, #0x8]
00bf8d4c	ldar x8,[x20]
00bf8d50	cmn x8,#0x1
00bf8d54	b.eq 0x00bf8d80
00bf8d58	add x8,sp,#0x8
00bf8d5c	sub x9,x29,#0x8
00bf8d60	adrp x0,0xcb5000
00bf8d64	stur x8,[x29, #-0x8]
00bf8d68	nop
00bf8d6c	adr x2,0xc0bab0
00bf8d70	str x9,[sp, #0x10]
00bf8d74	add x1,sp,#0x10
00bf8d78	ldr x0,[x0, #0xca0]
00bf8d7c	bl 0x00c305d0
00bf8d80	ldp x8,x10,[x19, #0x10]
00bf8d84	ldrsw x9,[x20, #0x8]
00bf8d88	sub x22,x9,#0x1
00bf8d8c	sub x9,x10,x8
00bf8d90	cmp x22,x9, ASR #0x3
00bf8d94	b.cs 0x00bf8e34
00bf8d98	ldr x19,[x8, x22, LSL #0x3]
00bf8d9c	cbz x19,0x00bf8e34
00bf8da0	add x1,x19,#0x8
00bf8da4	mov w0,#0x1
00bf8da8	bl 0x00c2bce0
00bf8dac	mov x20,x21
00bf8db0	ldp x8,x9,[x20, #0x10]!
00bf8db4	sub x9,x9,x8
00bf8db8	asr x10,x9,#0x3
00bf8dbc	cmp x10,x22
00bf8dc0	b.hi 0x00bf8dec
00bf8dc4	add x9,x22,#0x1
00bf8dc8	subs x1,x9,x10
00bf8dcc	b.ls 0x00bf8de0
00bf8dd0	mov x0,x20
00bf8dd4	bl 0x00c0b6e4
00bf8dd8	ldr x8,[x20]
00bf8ddc	b 0x00bf8dec
00bf8de0	b.cs 0x00bf8dec
00bf8de4	add x9,x8,x9, LSL #0x3
00bf8de8	str x9,[x21, #0x18]
00bf8dec	ldr x21,[x8, x22, LSL #0x3]
00bf8df0	cbz x21,0x00bf8e14
00bf8df4	add x1,x21,#0x8
00bf8df8	mov x0,#-0x1
00bf8dfc	bl 0x00c2bd10
00bf8e00	cbnz x0,0x00bf8e14
00bf8e04	ldr x8,[x21]
00bf8e08	mov x0,x21
00bf8e0c	ldr x8,[x8, #0x10]
00bf8e10	blr x8
00bf8e14	ldr x8,[x20]
00bf8e18	str x19,[x8, x22, LSL #0x3]
00bf8e1c	ldp x20,x19,[sp, #0x40]
00bf8e20	ldp x22,x21,[sp, #0x30]
00bf8e24	ldp x29,x30,[sp, #0x20]
00bf8e28	add sp,sp,#0x50
00bf8e2c	autiasp
00bf8e30	ret
00bf8e34	bl 0x00bd8968
