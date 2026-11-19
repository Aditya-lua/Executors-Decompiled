; cpr::Session::PrepareGet @ 008efe08
008efe08	stp x20,x19,[sp, #-0x20]!
008efe0c	stp x29,x30,[sp, #0x10]
008efe10	add x29,sp,#0x10
008efe14	ldr x8,[x0, #0x18]
008efe18	mov x19,x0
008efe1c	ldrb w20,[x0, #0x10]
008efe20	mov w1,#0x2c
008efe24	ldr x0,[x8]
008efe28	mov x2,xzr
008efe2c	bl 0x00c317c0
008efe30	ldr x8,[x19, #0x18]
008efe34	ldr x0,[x8]
008efe38	cbz w20,0x008efe4c
008efe3c	adrp x2,0x2d7000
008efe40	add x2,x2,#0x152
008efe44	mov w1,#0x2734
008efe48	b 0x008efe68
008efe4c	mov w1,#0x2734
008efe50	mov x2,xzr
008efe54	bl 0x00c317c0
008efe58	ldr x8,[x19, #0x18]
008efe5c	mov w1,#0x50
008efe60	mov w2,#0x1
008efe64	ldr x0,[x8]
008efe68	bl 0x00c317c0
008efe6c	ldp x29,x30,[sp, #0x10]
008efe70	mov x0,x19
008efe74	ldp x20,x19,[sp], #0x20
008efe78	b 0x00c31270
