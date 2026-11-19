; FUN_008e3f08 @ 008e3f08
008e3f08	str x30,[sp, #-0x10]!
008e3f0c	ldr w8,[x3, #0x44]
008e3f10	cbnz w8,0x008e3f48
008e3f14	ldr x8,[x3, #0x30]
008e3f18	ldr w9,[x3, #0x8]
008e3f1c	ldr w11,[x2, #0x8]
008e3f20	lsr w10,w1,#0x1e
008e3f24	asr x8,x8,x10
008e3f28	orr w9,w1,w9, LSL #0x5
008e3f2c	ubfiz w8,w8,#0xa,#0xc
008e3f30	orr w9,w9,w11
008e3f34	orr w8,w9,w8
008e3f38	mov w9,#0x39000000
008e3f3c	orr w1,w8,w9
008e3f40	ldr x30,[sp], #0x10
008e3f44	b 0x008e4874
008e3f48	adrp x1,0x2bc000
008e3f4c	adrp x2,0x29d000
008e3f50	adrp x4,0x2a9000
008e3f54	add x1,x1,#0xd80
008e3f58	add x2,x2,#0x636
008e3f5c	add x4,x4,#0x473
008e3f60	mov w0,#0xffffffff
008e3f64	mov w3,#0x224
008e3f68	bl 0x00c30b30
008e3f6c	adrp x1,0x2ce000
008e3f70	adrp x2,0x2ce000
008e3f74	add x1,x1,#0xe75
008e3f78	add x2,x2,#0xe7e
008e3f7c	mov w0,#0xffffffff
008e3f80	bl 0x00c30b30
008e3f84	bl 0x00c30b40
