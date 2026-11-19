; FUN_00b47b14 @ 00b47b14
00b47b14	stp x20,x19,[sp, #-0x20]!
00b47b18	stp x29,x30,[sp, #0x10]
00b47b1c	add x29,sp,#0x10
00b47b20	mov x20,x0
00b47b24	bl 0x00c41000
00b47b28	cbz w0,0x00b47b6c
00b47b2c	adrp x1,0x2b6000
00b47b30	add x1,x1,#0x95f
00b47b34	mov w0,#0x58
00b47b38	mov w2,#0x40
00b47b3c	bl 0x00c34250
00b47b40	mov x19,x0
00b47b44	cbz x0,0x00b47b74
00b47b48	mov x0,x20
00b47b4c	bl 0x00c41210
00b47b50	adrp x8,0x29c000
00b47b54	adrp x9,0x29c000
00b47b58	ldr q0,[x8, #0x3a0]
00b47b5c	ldr q1,[x9, #0xfe0]
00b47b60	str x0,[x19]
00b47b64	stp q0,q1,[x19, #0x30]
00b47b68	b 0x00b47ba4
00b47b6c	mov x19,xzr
00b47b70	b 0x00b47ba4
00b47b74	bl 0x00c342a0
00b47b78	adrp x0,0x2b6000
00b47b7c	adrp x2,0x29e000
00b47b80	add x0,x0,#0x95f
00b47b84	add x2,x2,#0xf2f
00b47b88	mov w1,#0x42
00b47b8c	bl 0x00c342b0
00b47b90	mov w1,#0x100
00b47b94	mov w0,#0x39
00b47b98	movk w1,#0xc, LSL #16
00b47b9c	mov x2,xzr
00b47ba0	bl 0x00c342c0
00b47ba4	ldp x29,x30,[sp, #0x10]
00b47ba8	mov x0,x19
00b47bac	ldp x20,x19,[sp], #0x20
00b47bb0	ret
