; cpr::Session::Options @ 008eff44
008eff44	stp x20,x19,[sp, #-0x20]!
008eff48	stp x29,x30,[sp, #0x10]
008eff4c	add x29,sp,#0x10
008eff50	ldr x9,[x0, #0x18]
008eff54	mov x19,x0
008eff58	mov w1,#0x2c
008eff5c	mov x2,xzr
008eff60	ldr x0,[x9]
008eff64	mov x20,x8
008eff68	bl 0x00c317c0
008eff6c	ldr x8,[x19, #0x18]
008eff70	adrp x2,0x2ab000
008eff74	add x2,x2,#0x4be
008eff78	mov w1,#0x2734
008eff7c	ldr x0,[x8]
008eff80	bl 0x00c317c0
008eff84	mov x0,x19
008eff88	bl 0x00c31270
008eff8c	ldr x8,[x19, #0x2a0]
008eff90	cbz x8,0x008effa8
008eff94	ldp x29,x30,[sp, #0x10]
008eff98	mov x8,x20
008eff9c	mov x0,x19
008effa0	ldp x20,x19,[sp], #0x20
008effa4	b 0x00c313b0
008effa8	mov x0,x19
008effac	bl 0x00c31250
008effb0	ldp x29,x30,[sp, #0x10]
008effb4	mov w1,w0
008effb8	mov x8,x20
008effbc	mov x0,x19
008effc0	ldp x20,x19,[sp], #0x20
008effc4	b 0x00c31380
