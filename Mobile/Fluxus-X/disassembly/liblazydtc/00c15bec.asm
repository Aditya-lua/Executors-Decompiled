; FUN_00c15bec @ 00c15bec
00c15bec	paciasp
00c15bf0	stp x29,x30,[sp, #-0x30]!
00c15bf4	str x21,[sp, #0x10]
00c15bf8	stp x20,x19,[sp, #0x20]
00c15bfc	mov x29,sp
00c15c00	ldr x21,[x0, #0x1330]
00c15c04	mov x19,x1
00c15c08	ldr x8,[x21, #0x8]
00c15c0c	sub x9,x8,#0xfd0
00c15c10	cmn x9,#0xff1
00c15c14	b.hi 0x00c15c38
00c15c18	mov x20,x0
00c15c1c	mov w0,#0x1000
00c15c20	bl 0x00c308d0
00c15c24	cbz x0,0x00c15c88
00c15c28	mov x8,xzr
00c15c2c	stp x21,xzr,[x0]
00c15c30	mov x21,x0
00c15c34	str x0,[x20, #0x1330]
00c15c38	add x9,x8,#0x20
00c15c3c	add x0,x21,x8
00c15c40	adrp x8,0xcb1000
00c15c44	add x8,x8,#0x4c0
00c15c48	str x9,[x21, #0x8]
00c15c4c	mov w9,#0x8
00c15c50	str x8,[x0, #0x10]!
00c15c54	ldurh w8,[x0, #0x9]
00c15c58	strb w9,[x0, #0x8]
00c15c5c	mov w9,#0x540
00c15c60	and w8,w8,#0xf000
00c15c64	ldr q0,[x19]
00c15c68	orr w8,w8,w9
00c15c6c	sturh w8,[x0, #0x9]
00c15c70	str q0,[x0, #0x10]
00c15c74	ldp x20,x19,[sp, #0x20]
00c15c78	ldr x21,[sp, #0x10]
00c15c7c	ldp x29,x30,[sp], #0x30
00c15c80	autiasp
00c15c84	ret
00c15c88	bl 0x00c2fff0
