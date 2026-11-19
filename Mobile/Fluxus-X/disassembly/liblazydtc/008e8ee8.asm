; FUN_008e8ee8 @ 008e8ee8
008e8ee8	stp x20,x19,[sp, #-0x20]!
008e8eec	stp x29,x30,[sp, #0x10]
008e8ef0	add x29,sp,#0x10
008e8ef4	ldr x8,[x0]
008e8ef8	adrp x9,0xcb4000
008e8efc	ldur x8,[x8, #-0x18]
008e8f00	ldr x9,[x9, #0xc90]
008e8f04	add x20,x0,x8
008e8f08	add x10,x9,#0x18
008e8f0c	add x11,x9,#0x68
008e8f10	mov x19,x20
008e8f14	str x10,[x20]
008e8f18	str x11,[x19, #0x80]!
008e8f1c	adrp x10,0xcb4000
008e8f20	add x8,x9,#0x40
008e8f24	ldrb w9,[x20, #0x58]
008e8f28	ldr x10,[x10, #0xa00]
008e8f2c	add x10,x10,#0x10
008e8f30	stp x8,x10,[x20, #0x10]
008e8f34	tbz w9,#0x0,0x008e8f40
008e8f38	ldr x0,[x20, #0x68]
008e8f3c	bl 0x00c301d0
008e8f40	adrp x8,0xcb4000
008e8f44	ldr x8,[x8, #0xa08]
008e8f48	add x0,x20,#0x20
008e8f4c	add x8,x8,#0x10
008e8f50	str x8,[x20, #0x18]
008e8f54	bl 0x00c30090
008e8f58	ldp x29,x30,[sp, #0x10]
008e8f5c	mov x0,x19
008e8f60	ldp x20,x19,[sp], #0x20
008e8f64	b 0x00c30ee0
