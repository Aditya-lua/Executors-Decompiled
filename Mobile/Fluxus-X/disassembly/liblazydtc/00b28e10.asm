; FUN_00b28e10 @ 00b28e10
00b28e10	stp x20,x19,[sp, #-0x20]!
00b28e14	mov x8,x1
00b28e18	add x20,x0,#0x2c0
00b28e1c	stp x29,x30,[sp, #0x10]
00b28e20	mov x19,x0
00b28e24	str x20,[x0, #0x2b8]
00b28e28	lsl w1,w2,#0x3
00b28e2c	mov x0,x8
00b28e30	mov x2,x20
00b28e34	add x29,sp,#0x10
00b28e38	bl 0x00c373a0
00b28e3c	adrp x2,0xcb5000
00b28e40	ldr x2,[x2, #0x318]
00b28e44	add x0,x19,#0xf8
00b28e48	mov x1,x20
00b28e4c	bl 0x00c3e390
00b28e50	ldrb w8,[x19, #0x54]
00b28e54	str xzr,[x19, #0x2b0]
00b28e58	mov w0,#0x1
00b28e5c	orr w8,w8,#0x4
00b28e60	strb w8,[x19, #0x54]
00b28e64	ldp x29,x30,[sp, #0x10]
00b28e68	ldp x20,x19,[sp], #0x20
00b28e6c	ret
