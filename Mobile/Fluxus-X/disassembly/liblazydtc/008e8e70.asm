; FUN_008e8e70 @ 008e8e70
008e8e70	stp x20,x19,[sp, #-0x20]!
008e8e74	stp x29,x30,[sp, #0x10]
008e8e78	add x29,sp,#0x10
008e8e7c	adrp x8,0xcb4000
008e8e80	ldr x8,[x8, #0xc90]
008e8e84	mov x20,x0
008e8e88	mov x19,x0
008e8e8c	add x9,x8,#0x18
008e8e90	add x10,x8,#0x68
008e8e94	str x9,[x20, #-0x10]!
008e8e98	str x10,[x19, #0x70]!
008e8e9c	adrp x10,0xcb4000
008e8ea0	ldrb w9,[x0, #0x48]
008e8ea4	ldr x10,[x10, #0xa00]
008e8ea8	add x8,x8,#0x40
008e8eac	add x10,x10,#0x10
008e8eb0	stp x8,x10,[x0]
008e8eb4	tbz w9,#0x0,0x008e8ec0
008e8eb8	ldr x0,[x20, #0x68]
008e8ebc	bl 0x00c301d0
008e8ec0	adrp x8,0xcb4000
008e8ec4	ldr x8,[x8, #0xa08]
008e8ec8	add x0,x20,#0x20
008e8ecc	add x8,x8,#0x10
008e8ed0	str x8,[x20, #0x18]
008e8ed4	bl 0x00c30090
008e8ed8	ldp x29,x30,[sp, #0x10]
008e8edc	mov x0,x19
008e8ee0	ldp x20,x19,[sp], #0x20
008e8ee4	b 0x00c30ee0
