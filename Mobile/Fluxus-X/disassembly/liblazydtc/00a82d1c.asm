; ossl_namemap_new @ 00a82d1c
00a82d1c	str x19,[sp, #-0x20]!
00a82d20	adrp x1,0x2bd000
00a82d24	add x1,x1,#0xc0d
00a82d28	mov w0,#0x20
00a82d2c	mov w2,#0x202
00a82d30	stp x29,x30,[sp, #0x10]
00a82d34	add x29,sp,#0x10
00a82d38	bl 0x00c34250
00a82d3c	cbz x0,0x00a82db8
00a82d40	mov x19,x0
00a82d44	bl 0x00c34d50
00a82d48	str x0,[x19, #0x8]
00a82d4c	cbz x0,0x00a82d74
00a82d50	adrp x0,0xa82000
00a82d54	adrp x1,0xa82000
00a82d58	add x0,x0,#0xdc4
00a82d5c	add x1,x1,#0xdcc
00a82d60	bl 0x00c34dd0
00a82d64	mov x8,x0
00a82d68	str x0,[x19, #0x10]
00a82d6c	mov x0,x19
00a82d70	cbnz x8,0x00a82db8
00a82d74	ldrb w8,[x19]
00a82d78	mov x0,xzr
00a82d7c	tbnz w8,#0x0,0x00a82db8
00a82d80	ldr x0,[x19, #0x10]
00a82d84	adrp x1,0xa82000
00a82d88	add x1,x1,#0xe3c
00a82d8c	bl 0x00c395e0
00a82d90	ldr x0,[x19, #0x10]
00a82d94	bl 0x00c34db0
00a82d98	ldr x0,[x19, #0x8]
00a82d9c	bl 0x00c34d40
00a82da0	adrp x1,0x2bd000
00a82da4	add x1,x1,#0xc0d
00a82da8	mov w2,#0x215
00a82dac	mov x0,x19
00a82db0	bl 0x00c32310
00a82db4	mov x0,xzr
00a82db8	ldp x29,x30,[sp, #0x10]
00a82dbc	ldr x19,[sp], #0x20
00a82dc0	ret
