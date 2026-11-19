; FUN_008e3b40 @ 008e3b40
008e3b40	str x30,[sp, #-0x20]!
008e3b44	stp x20,x19,[sp, #0x10]
008e3b48	mov x19,x1
008e3b4c	mov x20,x0
008e3b50	bl 0x008e3f88
008e3b54	str wzr,[x20, #0x30]
008e3b58	str x19,[x20, #0x28]
008e3b5c	ldp x20,x19,[sp, #0x10]
008e3b60	ldr x30,[sp], #0x20
008e3b64	ret
