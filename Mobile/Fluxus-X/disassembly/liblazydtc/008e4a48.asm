; FUN_008e4a48 @ 008e4a48
008e4a48	str x30,[sp, #-0x10]!
008e4a4c	ldr w8,[x3, #0x10]
008e4a50	cbnz w8,0x008e4a78
008e4a54	ldr w8,[x3]
008e4a58	ldr w9,[x1, #0x8]
008e4a5c	ldr w10,[x2, #0x8]
008e4a60	ubfiz w8,w8,#0xa,#0xc
008e4a64	orr w9,w9,w4
008e4a68	orr w8,w9,w8
008e4a6c	orr w1,w8,w10, LSL #0x5
008e4a70	ldr x30,[sp], #0x10
008e4a74	b 0x008e4874
008e4a78	adrp x1,0x2bc000
008e4a7c	adrp x2,0x29d000
008e4a80	adrp x4,0x2d4000
008e4a84	add x1,x1,#0xd80
008e4a88	add x2,x2,#0x636
008e4a8c	add x4,x4,#0xef9
008e4a90	mov w0,#0xffffffff
008e4a94	mov w3,#0x248
008e4a98	bl 0x00c30b30
008e4a9c	adrp x1,0x2ce000
008e4aa0	adrp x2,0x2ce000
008e4aa4	add x1,x1,#0xe75
008e4aa8	add x2,x2,#0xe7e
008e4aac	mov w0,#0xffffffff
008e4ab0	bl 0x00c30b30
008e4ab4	bl 0x00c30b40
