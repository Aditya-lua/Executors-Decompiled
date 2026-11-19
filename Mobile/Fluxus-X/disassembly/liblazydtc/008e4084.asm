; FUN_008e4084 @ 008e4084
008e4084	str x30,[sp, #-0x20]!
008e4088	stp x20,x19,[sp, #0x10]
008e408c	mov x20,x0
008e4090	ldr x0,[x0, #0x8]
008e4094	mov x19,x1
008e4098	ldr x8,[x0]
008e409c	ldr x8,[x8, #0x20]
008e40a0	blr x8
008e40a4	mov w1,w0
008e40a8	mov x0,x19
008e40ac	bl 0x008e477c
008e40b0	mov x0,x19
008e40b4	bl 0x008e40e4
008e40b8	tbz w0,#0x0,0x008e40d8
008e40bc	mov x0,x20
008e40c0	bl 0x008e47b0
008e40c4	mov x1,x0
008e40c8	mov x0,x19
008e40cc	ldp x20,x19,[sp, #0x10]
008e40d0	ldr x30,[sp], #0x20
008e40d4	b 0x008e4100
008e40d8	ldp x20,x19,[sp, #0x10]
008e40dc	ldr x30,[sp], #0x20
008e40e0	ret
