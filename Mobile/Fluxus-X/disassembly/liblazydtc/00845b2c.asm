; FUN_00845b2c @ 00845b2c
00845b2c	stp x29,x30,[sp, #-0x20]!
00845b30	stp x20,x19,[sp, #0x10]
00845b34	mov x29,sp
00845b38	ldp x8,x9,[x1, #0x10]
00845b3c	mov x19,x1
00845b40	cmp x8,x9
00845b44	b.eq 0x00845b88
00845b48	mov x20,x0
00845b4c	ldr x0,[x0, #0x18]
00845b50	ldrb w1,[x8]
00845b54	ldr x9,[x0]
00845b58	ldr x9,[x9, #0x28]
00845b5c	blr x9
00845b60	ldrb w8,[x20, #0x28]
00845b64	cmp w8,w0, UXTB 
00845b68	b.ne 0x00845b88
00845b6c	ldr x8,[x19, #0x10]
00845b70	mov w9,#0xfffffc1d
00845b74	str w9,[x19]
00845b78	add x9,x8,#0x1
00845b7c	ldr x8,[x20, #0x8]
00845b80	str x9,[x19, #0x10]
00845b84	b 0x00845b94
00845b88	mov x8,xzr
00845b8c	mov w9,#0xfffffc1f
00845b90	str w9,[x19]
00845b94	str x8,[x19, #0x50]
00845b98	ldp x20,x19,[sp, #0x10]
00845b9c	ldp x29,x30,[sp], #0x20
00845ba0	ret
