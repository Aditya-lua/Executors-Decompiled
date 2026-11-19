; FUN_00850b3c @ 00850b3c
00850b3c	adrp x8,0xd1b000
00850b40	adrp x9,0xc4a000
00850b44	add x9,x9,#0x508
00850b48	ldr w8,[x8, #0x240]
00850b4c	str x9,[x0]
00850b50	ldr x9,[sp, #0x8]
00850b54	str w8,[x0, #0x8]
00850b58	adrp x8,0xc49000
00850b5c	add x8,x8,#0xc00
00850b60	ldr q0,[x1]
00850b64	str x8,[x0]
00850b68	strb w7,[x0, #0x1c]
00850b6c	stur q0,[x0, #0xc]
00850b70	stp x2,x3,[x0, #0x20]
00850b74	ldr q0,[x5]
00850b78	ldr w8,[x5, #0x10]
00850b7c	stp x9,x4,[x0, #0x48]
00850b80	str q0,[x0, #0x30]
00850b84	str w8,[x0, #0x40]
00850b88	ldr x8,[sp]
00850b8c	ldr q0,[x6]
00850b90	stur q0,[x0, #0x58]
00850b94	ldr q0,[x8]
00850b98	stur q0,[x0, #0x68]
00850b9c	ret
