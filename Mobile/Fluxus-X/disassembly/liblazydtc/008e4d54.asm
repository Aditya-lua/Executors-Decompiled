; FUN_008e4d54 @ 008e4d54
008e4d54	str x30,[sp, #-0x20]!
008e4d58	stp x20,x19,[sp, #0x10]
008e4d5c	mov x20,x0
008e4d60	mov w0,#0x18
008e4d64	mov x19,x1
008e4d68	bl 0x00c2fed0
008e4d6c	str x19,[x0, #0x10]
008e4d70	ldr x8,[x20]
008e4d74	str x0,[x8, #0x8]
008e4d78	stp x8,x20,[x0]
008e4d7c	str x0,[x20]
008e4d80	ldp x20,x19,[sp, #0x10]
008e4d84	ldr x30,[sp], #0x20
008e4d88	ret
