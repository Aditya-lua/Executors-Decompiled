; FUN_00b28b58 @ 00b28b58
00b28b58	stp x20,x19,[sp, #-0x20]!
00b28b5c	mov x8,x1
00b28b60	add x20,x0,#0x98
00b28b64	mov x19,x0
00b28b68	lsl w1,w2,#0x3
00b28b6c	mov x0,x8
00b28b70	mov x2,x20
00b28b74	stp x29,x30,[sp, #0x10]
00b28b78	add x29,sp,#0x10
00b28b7c	bl 0x00c373a0
00b28b80	adrp x4,0xcb5000
00b28b84	ldr w1,[x19, #0x10]
00b28b88	ldr w2,[x19, #0x8]
00b28b8c	ldr x4,[x4, #0x318]
00b28b90	add x0,x19,#0x50
00b28b94	mov x3,x20
00b28b98	bl 0x00c3e2b0
00b28b9c	ldrb w8,[x19]
00b28ba0	str xzr,[x19, #0x88]
00b28ba4	mov w0,#0x1
00b28ba8	orr w8,w8,#0x2
00b28bac	strb w8,[x19]
00b28bb0	ldp x29,x30,[sp, #0x10]
00b28bb4	ldp x20,x19,[sp], #0x20
00b28bb8	ret
