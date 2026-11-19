; FUN_008e43b8 @ 008e43b8
008e43b8	stp x30,x21,[sp, #-0x20]!
008e43bc	stp x20,x19,[sp, #0x10]
008e43c0	mov x19,x0
008e43c4	mov w0,#0x20
008e43c8	bl 0x00c2fed0
008e43cc	ldr x8,[x19]
008e43d0	mov x20,x0
008e43d4	mov x0,x19
008e43d8	ldr x8,[x8, #0x28]
008e43dc	blr x8
008e43e0	adrp x8,0xc4e000
008e43e4	add x8,x8,#0x400
008e43e8	mov w1,w0
008e43ec	mov x0,x20
008e43f0	ldr x9,[x8, #0x20]
008e43f4	add x8,x8,#0x10
008e43f8	str x8,[x20]
008e43fc	blr x9
008e4400	adrp x8,0xc4e000
008e4404	add x8,x8,#0x338
008e4408	str x8,[x20]
008e440c	ldr x8,[x19]
008e4410	mov x0,x19
008e4414	ldr x8,[x8, #0x38]
008e4418	blr x8
008e441c	ldr x8,[x19]
008e4420	mov x21,x0
008e4424	mov x0,x19
008e4428	bl 0x008e44a4
008e442c	mov w2,w0
008e4430	mov x0,x20
008e4434	mov x1,x21
008e4438	bl 0x008e444c
008e443c	mov x0,x20
008e4440	ldp x20,x19,[sp, #0x10]
008e4444	ldp x30,x21,[sp], #0x20
008e4448	ret
