; FUN_008e3b68 @ 008e3b68
008e3b68	stp x30,x21,[sp, #-0x20]!
008e3b6c	stp x20,x19,[sp, #0x10]
008e3b70	ldr x21,[x0, #0x18]
008e3b74	mov x19,x1
008e3b78	cbnz x21,0x008e3b98
008e3b7c	mov x20,x0
008e3b80	mov w0,#0x20
008e3b84	bl 0x00c2fed0
008e3b88	mov w1,#0x8
008e3b8c	mov x21,x0
008e3b90	bl 0x008e5188
008e3b94	str x21,[x20, #0x18]
008e3b98	ldr x8,[x21]
008e3b9c	mov x1,x19
008e3ba0	ldp x20,x19,[sp, #0x10]
008e3ba4	mov x0,x21
008e3ba8	ldr x2,[x8, #0x40]
008e3bac	ldp x30,x21,[sp], #0x20
008e3bb0	br x2
